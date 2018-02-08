package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.WebHookResponse;
import br.com.conductor.pier.api.v2.model.PageWebHookResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class WebhookApi {
  private ApiClient apiClient;

  public WebhookApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebhookApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Alterar Webhook
   * Este m\u00C3\u00A9todo permite que seja modificado um webhooks j\u00C3\u00A1 cadastrado
   * @param id C\u00C3\u00B3digo identificador do Webhook
   * @param tipoEvento TipoEvento a ser chamado pelo WebHook
   * @param url URL que a ser consumida pelo WebHook
   * @param status Status
   * @return WebHookResponse
   */
  public WebHookResponse alterarUsingPUT22(Long id, String tipoEvento, String url, String status) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT22");
     }
     
     // verify the required parameter 'tipoEvento' is set
     if (tipoEvento == null) {
        throw new ApiException(400, "Missing the required parameter 'tipoEvento' when calling alterarUsingPUT22");
     }
     
     // verify the required parameter 'url' is set
     if (url == null) {
        throw new ApiException(400, "Missing the required parameter 'url' when calling alterarUsingPUT22");
     }
     
    // create path and map variables
    String path = "/api/webhooks/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoEvento", tipoEvento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "url", url));
    

    

    

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

    
    GenericType<WebHookResponse> returnType = new GenericType<WebHookResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar Webhook
   * Este m\u00C3\u00A9todo permite que sejam consultado um webhook do emissor atrav\u00C3\u00A9s de um id especifico
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Webhook (id).
   * @return WebHookResponse
   */
  public WebHookResponse consultarUsingGET44(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET44");
     }
     
    // create path and map variables
    String path = "/api/webhooks/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<WebHookResponse> returnType = new GenericType<WebHookResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Webhooks
   * Este m\u00C3\u00A9todo permite que sejam listados os webhooks existentes
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id Id do WebHook
   * @param tipoEvento TipoEvento a ser chamado pelo WebHook
   * @param metodo M\u00C3\u00A9todo que a ser chamado pelo WebHook
   * @param url URL que a ser consumida pelo WebHook
   * @return PageWebHookResponse
   */
  public PageWebHookResponse listarUsingGET53(List<String> sort, Integer page, Integer limit, Long id, String tipoEvento, String metodo, String url) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/webhooks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoEvento", tipoEvento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "metodo", metodo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "url", url));
    

    

    

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

    
    GenericType<PageWebHookResponse> returnType = new GenericType<PageWebHookResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Salvar Webhook
   * Este m\u00C3\u00A9todo permite que seja adicionado um novo webhook
   * @param tipoEvento TipoEvento a ser chamado pelo WebHook
   * @param url URL que a ser consumida pelo WebHook
   * @return WebHookResponse
   */
  public WebHookResponse salvarUsingPOST30(String tipoEvento, String url) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'tipoEvento' is set
     if (tipoEvento == null) {
        throw new ApiException(400, "Missing the required parameter 'tipoEvento' when calling salvarUsingPOST30");
     }
     
     // verify the required parameter 'url' is set
     if (url == null) {
        throw new ApiException(400, "Missing the required parameter 'url' when calling salvarUsingPOST30");
     }
     
    // create path and map variables
    String path = "/api/webhooks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoEvento", tipoEvento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "url", url));
    

    

    

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

    
    GenericType<WebHookResponse> returnType = new GenericType<WebHookResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
