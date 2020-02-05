package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.LoteCartaoUpdate;
import br.com.conductor.pier.api.v2.model.LoteCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageLoteCartaoResponse;
import br.com.conductor.pier.api.v2.model.LoteCartaoPersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LoteApi {
  private ApiClient apiClient;

  public LoteApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LoteApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Atualiza um lote de cart\u00E3o Noname
   * Este recurso permite Atualiza um lote de cart\u00E3o Noname
   * @param id id
   * @param loteCartaoUpdate loteCartaoUpdate
   * @return LoteCartaoResponse
   */
  public LoteCartaoResponse atualizarLotesCartoes(Long id, LoteCartaoUpdate loteCartaoUpdate) throws ApiException {
    Object postBody = loteCartaoUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarLotesCartoes");
     }
     
     // verify the required parameter 'loteCartaoUpdate' is set
     if (loteCartaoUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'loteCartaoUpdate' when calling atualizarLotesCartoes");
     }
     
    // create path and map variables
    String path = "/api/lotes/cartoes/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<LoteCartaoResponse> returnType = new GenericType<LoteCartaoResponse>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta um lote de cart\u00E3o Noname cadastrado
   * Este recurso permite Consulta um lote de cart\u00E3o Noname cadastrado
   * @param id id
   * @return LoteCartaoResponse
   */
  public LoteCartaoResponse consultarLotesCartoes(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLotesCartoes");
     }
     
    // create path and map variables
    String path = "/api/lotes/cartoes/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<LoteCartaoResponse> returnType = new GenericType<LoteCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Remove um lote de cart\u00E3o Noname com status criado
   * Este recurso permite remover um lote de cart\u00E3o Noname com status criado
   * @param id id
   * @return Object
   */
  public Object deletarLotesCartoes(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deletarLotesCartoes");
     }
     
    // create path and map variables
    String path = "/api/lotes/cartoes/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os lotes de cart\u00F5es Noname cadastrados
   * Este recurso permite lista os lotes de cart\u00F5es Noname cadastrados
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param qtdSolicitada Quantidade de cart\u00F5es a ser emitido
   * @param idProduto C\u00F3digo identificador do produto
   * @param idSolicitante C\u00F3digo identificador do solicitante
   * @param idOrigemComercial C\u00F3digo identificador da origem comercial
   * @param idPlastico C\u00F3digo identificador do tipo pl\u00E1stico associado ao produto
   * @param idImagem C\u00F3digo identificador do tipo pl\u00E1stico imagem
   * @param idContaDefault C\u00F3digo identificador da conta padr\u00E3o
   * @param flagMultiApp Lote de cart\u00F5es m\u00FAltiplos
   * @param dataAgendamento Data de agendamento do lote
   * @param tipoLote Tipo do lote agendado
   * @param statusLote Status do lote
   * @return PageLoteCartaoResponse
   */
  public PageLoteCartaoResponse listarLotesCartoes(List<String> sort, Integer page, Integer limit, Integer qtdSolicitada, Long idProduto, Long idSolicitante, Long idOrigemComercial, Long idPlastico, Long idImagem, Long idContaDefault, Boolean flagMultiApp, String dataAgendamento, Integer tipoLote, Integer statusLote) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/lotes/cartoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "qtdSolicitada", qtdSolicitada));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idSolicitante", idSolicitante));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPlastico", idPlastico));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idImagem", idImagem));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idContaDefault", idContaDefault));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagMultiApp", flagMultiApp));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAgendamento", dataAgendamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoLote", tipoLote));
    
    queryParams.addAll(apiClient.parameterToPairs("", "statusLote", statusLote));
    

    

    

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

    
    GenericType<PageLoteCartaoResponse> returnType = new GenericType<PageLoteCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastra um lote de cart\u00F5es Noname
   * Este recurso permite cadastra um lote de cart\u00F5es Noname
   * @param loteCartaoPersist loteCartaoPersist
   * @return LoteCartaoResponse
   */
  public LoteCartaoResponse salvarLotesCartoes(LoteCartaoPersist loteCartaoPersist) throws ApiException {
    Object postBody = loteCartaoPersist;
    
     // verify the required parameter 'loteCartaoPersist' is set
     if (loteCartaoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'loteCartaoPersist' when calling salvarLotesCartoes");
     }
     
    // create path and map variables
    String path = "/api/lotes/cartoes".replaceAll("\\{format\\}","json");

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

    
    GenericType<LoteCartaoResponse> returnType = new GenericType<LoteCartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
