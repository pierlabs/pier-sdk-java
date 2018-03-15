package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.AvisoViagemResponse;
import br.com.conductor.pier.api.v2.model.PageAvisoViagemResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AvisoViagemApi {
  private ApiClient apiClient;

  public AvisoViagemApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AvisoViagemApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Consultar um aviso viagem de acordo com o id passado
   * Este m\u00E9todo permite que seja consultado um aviso viagen existente na base do emissor.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Aviso Viagem (id).
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse consultarUsingGET5(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET5");
     }
     
    // create path and map variables
    String path = "/api/avisos-viagens/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<AvisoViagemResponse> returnType = new GenericType<AvisoViagemResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Desabilitar um aviso viagem de acordo com o id passado
   * Este m\u00E9todo permite que seja desabilitado um aviso viagen existente na base do emissor.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Aviso Viagem (id).
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse desabilitarUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desabilitarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/avisos-viagens/{id}/desabilitar".replaceAll("\\{format\\}","json")
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

    
    GenericType<AvisoViagemResponse> returnType = new GenericType<AvisoViagemResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Habilitar um aviso viagem de acordo com o id passado
   * Este m\u00E9todo permite que seja habilitado um aviso viagen existente na base do emissor.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Aviso Viagem (id).
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse habilitarUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling habilitarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/avisos-viagens/{id}/habilitar".replaceAll("\\{format\\}","json")
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

    
    GenericType<AvisoViagemResponse> returnType = new GenericType<AvisoViagemResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os avisos viagens gerados pelo Emissor
   * Este m\u00E9todo permite que sejam listados os avisos viagens existentes na base do emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param idCartao C\u00F3digo Identificador do cart\u00E3o na base (id)
   * @param codigoPais Codigo identificador do pa\u00EDs na base (id)
   * @param dataInicio Data inicio do aviso viagem
   * @param dataFim Data fim do aviso viagem
   * @param flagAtivo Identifica se o aviso viagem esta ativo ou n\u00E3o
   * @return PageAvisoViagemResponse
   */
  public PageAvisoViagemResponse listarUsingGET7(List<String> sort, Integer page, Integer limit, Long idCartao, String codigoPais, String dataInicio, String dataFim, Integer flagAtivo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/avisos-viagens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigoPais", codigoPais));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataFim", dataFim));
    
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

    
    GenericType<PageAvisoViagemResponse> returnType = new GenericType<PageAvisoViagemResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza o cadastro de um novo Aviso Viagem
   * Este m\u00E9todo permite que seja cadastrado um novo Aviso Viagem na base de dados do Emissor.
   * @param idCartao C\u00F3digo Identificador do cart\u00E3o na base (id)
   * @param codigoPais Codigo identificador do pa\u00EDs na base (id)
   * @param dataInicio Data inicio do aviso viagem
   * @param dataFim Data fim do aviso viagem
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse salvarUsingPOST3(Long idCartao, String codigoPais, String dataInicio, String dataFim) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idCartao' is set
     if (idCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idCartao' when calling salvarUsingPOST3");
     }
     
     // verify the required parameter 'codigoPais' is set
     if (codigoPais == null) {
        throw new ApiException(400, "Missing the required parameter 'codigoPais' when calling salvarUsingPOST3");
     }
     
     // verify the required parameter 'dataInicio' is set
     if (dataInicio == null) {
        throw new ApiException(400, "Missing the required parameter 'dataInicio' when calling salvarUsingPOST3");
     }
     
     // verify the required parameter 'dataFim' is set
     if (dataFim == null) {
        throw new ApiException(400, "Missing the required parameter 'dataFim' when calling salvarUsingPOST3");
     }
     
    // create path and map variables
    String path = "/api/avisos-viagens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigoPais", codigoPais));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataFim", dataFim));
    

    

    

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

    
    GenericType<AvisoViagemResponse> returnType = new GenericType<AvisoViagemResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
