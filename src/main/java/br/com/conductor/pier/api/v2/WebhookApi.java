package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.WebhookResponse;
import br.com.conductor.pier.api.v2.model.WebhookUpdate;
import br.com.conductor.pier.api.v2.model.WebhookHeaderResponse;
import br.com.conductor.pier.api.v2.model.PageWebHookResponse;
import br.com.conductor.pier.api.v2.model.PageWebhookHeaderResponse;
import br.com.conductor.pier.api.v2.model.WebhookPersist;
import br.com.conductor.pier.api.v2.model.WebhookHeaderPersist;

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
   * Este m\u00E9todo permite que seja modificado um webhooks j\u00E1 cadastrado
   * @param id id
   * @param webhookUpdate webhookUpdate
   * @return WebhookResponse
   */
  public WebhookResponse alterar(Long id, WebhookUpdate webhookUpdate) throws ApiException {
    Object postBody = webhookUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterar");
     }
     
     // verify the required parameter 'webhookUpdate' is set
     if (webhookUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'webhookUpdate' when calling alterar");
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

    
    GenericType<WebhookResponse> returnType = new GenericType<WebhookResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar Webhook
   * Este m\u00E9todo permite que sejam consultado um webhook do emissor atrav\u00E9s de um id especifico
   * @param id id
   * @return WebhookResponse
   */
  public WebhookResponse consultar(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
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

    
    GenericType<WebhookResponse> returnType = new GenericType<WebhookResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar Header do Webhook
   * Este m\u00E9todo permite que sejam consultado um header de um webhook do emissor atrav\u00E9s de um id especifico
   * @param id id
   * @param idHeader idHeader
   * @return WebhookHeaderResponse
   */
  public WebhookHeaderResponse consultar_0(Long id, Long idHeader) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_0");
     }
     
     // verify the required parameter 'idHeader' is set
     if (idHeader == null) {
        throw new ApiException(400, "Missing the required parameter 'idHeader' when calling consultar_0");
     }
     
    // create path and map variables
    String path = "/api/webhooks/{id}/headers/{idHeader}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idHeader" + "\\}", apiClient.escapeString(idHeader.toString()));

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

    
    GenericType<WebhookHeaderResponse> returnType = new GenericType<WebhookHeaderResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Inativa um webhook
   * Esse m\u00E9todo permite inativar um webhook
   * @param id id
   * @return Object
   */
  public Object desativar(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativar");
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

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Inativa um header do webhook
   * Esse m\u00E9todo permite inativar um header webhook
   * @param id id
   * @param idHeader id
   * @return WebhookHeaderResponse
   */
  public WebhookHeaderResponse desativar_0(Long id, Long idHeader) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativar_0");
     }
     
     // verify the required parameter 'idHeader' is set
     if (idHeader == null) {
        throw new ApiException(400, "Missing the required parameter 'idHeader' when calling desativar_0");
     }
     
    // create path and map variables
    String path = "/api/webhooks/{id}/headers/{idHeader}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idHeader" + "\\}", apiClient.escapeString(idHeader.toString()));

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

    
    GenericType<WebhookHeaderResponse> returnType = new GenericType<WebhookHeaderResponse>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Webhooks
   * Este m\u00E9todo permite que sejam listados os webhooks existentes
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id Id do WebHook
   * @param tipoEvento TipoEvento a ser chamado pelo WebHook
   * @param metodo M\u00E9todo que a ser chamado pelo WebHook
   * @param url URL que a ser consumida pelo WebHook
   * @return PageWebHookResponse
   */
  public PageWebHookResponse listar(List<String> sort, Integer page, Integer limit, Long id, String tipoEvento, String metodo, String url) throws ApiException {
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
   * Lista os Headers do Webhooks
   * Este m\u00E9todo permite que sejam listados os headers webhooks existentes
   * @param id id
   * @return PageWebhookHeaderResponse
   */
  public PageWebhookHeaderResponse listar_0(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listar_0");
     }
     
    // create path and map variables
    String path = "/api/webhooks/{id}/headers".replaceAll("\\{format\\}","json")
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

    
    GenericType<PageWebhookHeaderResponse> returnType = new GenericType<PageWebhookHeaderResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Salvar Webhook
   * Este m\u00E9todo permite que seja adicionado um novo webhook
   * @param webHookPersist webHookPersist
   * @return WebhookResponse
   */
  public WebhookResponse salvar(WebhookPersist webHookPersist) throws ApiException {
    Object postBody = webHookPersist;
    
     // verify the required parameter 'webHookPersist' is set
     if (webHookPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'webHookPersist' when calling salvar");
     }
     
    // create path and map variables
    String path = "/api/webhooks".replaceAll("\\{format\\}","json");

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

    
    GenericType<WebhookResponse> returnType = new GenericType<WebhookResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Salvar um Header Webhook
   * Este m\u00E9todo permite que seja adicionado um novo header no webhook
   * @param id id
   * @param webhookHeaderPersist webhookHeaderPersist
   * @return WebhookHeaderResponse
   */
  public WebhookHeaderResponse salvar_0(Long id, WebhookHeaderPersist webhookHeaderPersist) throws ApiException {
    Object postBody = webhookHeaderPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvar_0");
     }
     
     // verify the required parameter 'webhookHeaderPersist' is set
     if (webhookHeaderPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'webhookHeaderPersist' when calling salvar_0");
     }
     
    // create path and map variables
    String path = "/api/webhooks/{id}/headers".replaceAll("\\{format\\}","json")
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

    
    GenericType<WebhookHeaderResponse> returnType = new GenericType<WebhookHeaderResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
