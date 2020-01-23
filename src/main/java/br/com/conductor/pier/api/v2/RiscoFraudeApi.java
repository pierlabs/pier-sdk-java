package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.DadosPortadorRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class RiscoFraudeApi {
  private ApiClient apiClient;

  public RiscoFraudeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RiscoFraudeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Negar autenticidade de uma transa\u00E7\u00E3o classificada como risco de fraude
   * Nega a realiza\u00E7\u00E3o de uma transa\u00E7\u00E3o classificada como risco de fraude
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do risco de fraude
   * @return Object
   */
  public Object negarRiscoFraude(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling negarRiscoFraude");
     }
     
    // create path and map variables
    String path = "/api/riscos-fraudes/{id}/negar".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Reconhecer autenticidade de uma transa\u00E7\u00E3o classificada como risco de fraude
   * Confirma a autenticidade de uma transa\u00E7\u00E3o classificada como risco de fraude
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do risco de fraude
   * @return Object
   */
  public Object reconhecerRiscoFraude(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling reconhecerRiscoFraude");
     }
     
    // create path and map variables
    String path = "/api/riscos-fraudes/{id}/reconhecer".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Val\u00EDda os dados informados, consultando as informa\u00E7\u00F5es na base do emissor
   * Verif\u00EDca a exist\u00EAncias das informa\u00E7\u00F5es na base do emissor
   * @param request request
   * @return Object
   */
  public Object validarPortadorRiscoFraude(DadosPortadorRequest request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling validarPortadorRiscoFraude");
     }
     
    // create path and map variables
    String path = "/api/riscos-fraudes/validar-dados-portador".replaceAll("\\{format\\}","json");

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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
