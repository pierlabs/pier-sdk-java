package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.WebHook;
import br.com.conductor.pier.api.v2.model.PageWebHooks;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class WebhooksApi {
  private ApiClient apiClient;

  public WebhooksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebhooksApi(ApiClient apiClient) {
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
   * @param evento Evento a ser chamado pelo WebHook
   * @param metodo M\u00C3\u00A9todo que a ser chamado pelo WebHook
   * @param url URL que a ser consumida pelo WebHook
   * @return WebHook
   */
  public WebHook alterarUsingPUT3(Long id, String evento, String metodo, String url) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT3");
     }
     
     // verify the required parameter 'evento' is set
     if (evento == null) {
        throw new ApiException(400, "Missing the required parameter 'evento' when calling alterarUsingPUT3");
     }
     
     // verify the required parameter 'metodo' is set
     if (metodo == null) {
        throw new ApiException(400, "Missing the required parameter 'metodo' when calling alterarUsingPUT3");
     }
     
     // verify the required parameter 'url' is set
     if (url == null) {
        throw new ApiException(400, "Missing the required parameter 'url' when calling alterarUsingPUT3");
     }
     
    // create path and map variables
    String path = "/api/webhooks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "evento", evento));
    
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

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<WebHook> returnType = new GenericType<WebHook>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar Webhook
   * Este m\u00C3\u00A9todo permite que sejam consultado um webhook do emissor atrav\u00C3\u00A9s de um id especifico
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Webhook (id).
   * @return WebHook
   */
  public WebHook consultarUsingGET11(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET11");
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

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<WebHook> returnType = new GenericType<WebHook>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Webhooks
   * Este m\u00C3\u00A9todo permite que sejam listados os webhooks existentes
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param id Id do WebHook
   * @param evento Evento a ser chamado pelo WebHook
   * @param metodo M\u00C3\u00A9todo que a ser chamado pelo WebHook
   * @param url URL que a ser consumida pelo WebHook
   * @return PageWebHooks
   */
  public PageWebHooks listarUsingGET12(Integer page, Integer limit, Long id, String evento, String metodo, String url) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/webhooks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "evento", evento));
    
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

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageWebHooks> returnType = new GenericType<PageWebHooks>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Salvar Webhook
   * Este m\u00C3\u00A9todo permite que seja adicionado um novo webhook
   * @param evento Evento a ser chamado pelo WebHook
   * @param metodo M\u00C3\u00A9todo que a ser chamado pelo WebHook
   * @param url URL que a ser consumida pelo WebHook
   * @return WebHook
   */
  public WebHook salvarUsingPOST4(String evento, String metodo, String url) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'evento' is set
     if (evento == null) {
        throw new ApiException(400, "Missing the required parameter 'evento' when calling salvarUsingPOST4");
     }
     
     // verify the required parameter 'metodo' is set
     if (metodo == null) {
        throw new ApiException(400, "Missing the required parameter 'metodo' when calling salvarUsingPOST4");
     }
     
     // verify the required parameter 'url' is set
     if (url == null) {
        throw new ApiException(400, "Missing the required parameter 'url' when calling salvarUsingPOST4");
     }
     
    // create path and map variables
    String path = "/api/webhooks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "evento", evento));
    
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

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<WebHook> returnType = new GenericType<WebHook>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

