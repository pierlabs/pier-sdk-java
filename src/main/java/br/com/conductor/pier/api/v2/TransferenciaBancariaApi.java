package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.ContaBancariaPortadorUpdate;
import br.com.conductor.pier.api.v2.model.ContaBancariaPortadorResponse;
import br.com.conductor.pier.api.v2.model.PageContaBancariaPortadorResponse;
import br.com.conductor.pier.api.v2.model.ContaBancariaPortadorPersist;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class TransferenciaBancariaApi {
  private ApiClient apiClient;

  public TransferenciaBancariaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TransferenciaBancariaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Atualiza conta banc\u00C3\u00A1ria portador
   * Esse recurso permite atualizar uma conta banc\u00C3\u00A1ria do portador.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta banc\u00C3\u00A1ria do portador (id).
   * @param update update
   * @return ContaBancariaPortadorResponse
   */
  public ContaBancariaPortadorResponse atualizarUsingPUT1(Long id, ContaBancariaPortadorUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarUsingPUT1");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling atualizarUsingPUT1");
     }
     
    // create path and map variables
    String path = "/api/contas-bancarias-portador/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ContaBancariaPortadorResponse> returnType = new GenericType<ContaBancariaPortadorResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta conta banc\u00C3\u00A1ria portador
   * Esse recurso permite consultar uma conta banc\u00C3\u00A1ria do portador a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta banc\u00C3\u00A1ria (id).
   * @return ContaBancariaPortadorResponse
   */
  public ContaBancariaPortadorResponse consultarUsingGET9(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET9");
     }
     
    // create path and map variables
    String path = "/api/contas-bancarias-portador/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ContaBancariaPortadorResponse> returnType = new GenericType<ContaBancariaPortadorResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista contas banc\u00C3\u00A1rias portador
   * Esse recurso permite listar contas banc\u00C3\u00A1rias do portador.
   * @param idConta C\u00C3\u00B3digo identificador da conta cart\u00C3\u00A3o
   * @param nomeAgencia Descri\u00C3\u00A7\u00C3\u00A3o da ag\u00C3\u00AAncia
   * @param numeroAgencia N\u00C3\u00BAmero da ag\u00C3\u00AAncia
   * @param numeroConta N\u00C3\u00BAmero da conta
   * @param flagContaOrigemDoc Sinaliza se origem \u00C3\u00A9 DOC (1: DOC, 0: TED)
   * @param idPessoaFisica C\u00C3\u00B3digo da pessoa
   * @param favorecido Nome do favorecido
   * @param numeroReceiraFederal Documento do favorecido
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageContaBancariaPortadorResponse
   */
  public PageContaBancariaPortadorResponse listarUsingGET11(Long idConta, String nomeAgencia, String numeroAgencia, String numeroConta, Integer flagContaOrigemDoc, Long idPessoaFisica, String favorecido, String numeroReceiraFederal, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/contas-bancarias-portador".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeAgencia", nomeAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroConta", numeroConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagContaOrigemDoc", flagContaOrigemDoc));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoaFisica", idPessoaFisica));
    
    queryParams.addAll(apiClient.parameterToPairs("", "favorecido", favorecido));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroReceiraFederal", numeroReceiraFederal));
    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

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

    
    GenericType<PageContaBancariaPortadorResponse> returnType = new GenericType<PageContaBancariaPortadorResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastra uma conta banc\u00C3\u00A1ria do portador
   * Esse recurso permite cadastrar contas banc\u00C3\u00A1rias do portador.
   * @param persist persist
   * @return ContaBancariaPortadorResponse
   */
  public ContaBancariaPortadorResponse salvarUsingPOST7(ContaBancariaPortadorPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST7");
     }
     
    // create path and map variables
    String path = "/api/contas-bancarias-portador".replaceAll("\\{format\\}","json");

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

    
    GenericType<ContaBancariaPortadorResponse> returnType = new GenericType<ContaBancariaPortadorResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

