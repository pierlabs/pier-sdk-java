package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.DebitAccountRecurrent;
import br.com.conductor.pier.api.v2.model.ContaDebitoRecorrenteResponse;
import br.com.conductor.pier.api.v2.model.PageContaDebitoRecorrenteResponse;
import br.com.conductor.pier.api.v2.model.PageTipoDebitoRecorrenteResponse;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DebitRecurrentApi {
  private ApiClient apiClient;

  public DebitRecurrentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DebitRecurrentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Join to the recurrent debit
   * This method allows that a determined recurrent debit type be added to a determined account, in order for the same to be charged in the invoice of the client
   * @param contaDebitoRecorrentePersist contaDebitoRecorrentePersist
   * @return ContaDebitoRecorrenteResponse
   */
  public ContaDebitoRecorrenteResponse aderirDebitoRecorrente(DebitAccountRecurrent contaDebitoRecorrentePersist) throws ApiException {
    Object postBody = contaDebitoRecorrentePersist;
    
     // verify the required parameter 'contaDebitoRecorrentePersist' is set
     if (contaDebitoRecorrentePersist == null) {
        throw new ApiException(400, "Missing the required parameter 'contaDebitoRecorrentePersist' when calling aderirDebitoRecorrente");
     }
     
    // create path and map variables
    String path = "/api/debitos-recorrentes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ContaDebitoRecorrenteResponse> returnType = new GenericType<ContaDebitoRecorrenteResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cancel recurrent debit
   * This method allows to calcel a recurrent debitt type of a determined account
   * @param id Indentification Code of the Recurrent Debit (id)
   * @param contaDebitoRecorrentePersist contaDebitoRecorrentePersist
   * @return ContaDebitoRecorrenteResponse
   */
  public ContaDebitoRecorrenteResponse cancelarDebitoRecorrente(Long id, DebitAccountRecurrent contaDebitoRecorrentePersist) throws ApiException {
    Object postBody = contaDebitoRecorrentePersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarDebitoRecorrente");
     }
     
     // verify the required parameter 'contaDebitoRecorrentePersist' is set
     if (contaDebitoRecorrentePersist == null) {
        throw new ApiException(400, "Missing the required parameter 'contaDebitoRecorrentePersist' when calling cancelarDebitoRecorrente");
     }
     
    // create path and map variables
    String path = "/api/debitos-recorrentes/{id}/cancelar".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ContaDebitoRecorrenteResponse> returnType = new GenericType<ContaDebitoRecorrenteResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List the debits recurrent of an account
   * The entity Recurrent Debit lead with the hired registers for a determined client (idAccount) where the collection it&#39;s continuos, consisting in a signature ou payment of monthly debts. it means that, hile the service keep working, the client must continue doing the payments. The determination of how long it will last it&#39;s done in contract. Most part of the time, it exists a minimum period and, in case of the service be cancelled or the payment was not done, the status of the Recurrent Debit will have the ActiveFlag with a false value. Thus, this method lists all the operations of the Recurrent Debits of a determined idAccount, it is active or not
   * @param idConta Identification Code of the Account (id)
   * @param idTipoDebitoRecorrente Identification Code of the type recurrent debit (id)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param dataHoraInicio Date and local time the beginning of the recurrent debit yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   * @param dataHoraFim Date and local time the eding of the recurrent debit yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   * @param ativo Identify if the recurrent debit is active
   * @param dataHoraUltimoPagamento Date and local time the last effected payment yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   * @return PageContaDebitoRecorrenteResponse
   */
  public PageContaDebitoRecorrenteResponse listar(Long idConta, Long idTipoDebitoRecorrente, List<String> sort, Integer page, Integer limit, String dataHoraInicio, String dataHoraFim, Boolean ativo, String dataHoraUltimoPagamento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/debitos-recorrentes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoDebitoRecorrente", idTipoDebitoRecorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraInicio", dataHoraInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraFim", dataHoraFim));
    
    queryParams.addAll(apiClient.parameterToPairs("", "ativo", ativo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraUltimoPagamento", dataHoraUltimoPagamento));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageContaDebitoRecorrenteResponse> returnType = new GenericType<PageContaDebitoRecorrenteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List the types of Recurring Debits
   * For the Issuers that use the entity Recurring Debits need previously to resquest to Conductor a register of which types they can be able to commercialize.  For this, this resource has as an aim to present all the Types of Recurring Debits that are registered for a determined Issuer, independently of its status
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Identification Code of the type of recurrent debit (id)
   * @param descricao Description of the type of recurrent debit
   * @param valor Value of the type of recurrent debit
   * @param flagAtivo Flag that identifies if the type of recurrent debit is active
   * @return PageTipoDebitoRecorrenteResponse
   */
  public PageTipoDebitoRecorrenteResponse listar_0(List<String> sort, Integer page, Integer limit, Long id, String descricao, BigDecimal valor, Boolean flagAtivo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-debitos-recorrentes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valor", valor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageTipoDebitoRecorrenteResponse> returnType = new GenericType<PageTipoDebitoRecorrenteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
