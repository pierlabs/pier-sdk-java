package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.WebHookResponse;
import br.com.conductor.pier.api.v2.model.WebHookPersistValue;
import br.com.conductor.pier.api.v2.model.PageWebHookResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class GlobaltagwebhookApi {
  private ApiClient apiClient;

  public GlobaltagwebhookApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagwebhookApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{web_hook_resource_alterar}}}
   * {{{web_hook_resource_alterar_notes}}}
   * @param id {{{web_hook_resource_alterar_param_id}}}
   * @param webhook webhook
   * @param status {{{web_hook_resource_alterar_param_status}}}
   * @return WebHookResponse
   */
  public WebHookResponse alterarUsingPUT24(Long id, WebHookPersistValue webhook, String status) throws ApiException {
    Object postBody = webhook;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT24");
     }
     
     // verify the required parameter 'webhook' is set
     if (webhook == null) {
        throw new ApiException(400, "Missing the required parameter 'webhook' when calling alterarUsingPUT24");
     }
     
    // create path and map variables
    String path = "/api/webhooks/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    

    

    

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
   * {{{web_hook_resource_consultar}}}
   * {{{web_hook_resource_consultar_notes}}}
   * @param id {{{web_hook_resource_consultar_param_id}}}
   * @return WebHookResponse
   */
  public WebHookResponse consultarUsingGET52(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET52");
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
   * {{{web_hook_resource_listar}}}
   * {{{web_hook_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{web_hook_request_id_value}}}
   * @param tipoEvento {{{web_hook_request_tipo_evento_value}}}
   * @param metodo {{{web_hook_request_metodo_value}}}
   * @param url {{{web_hook_request_url_value}}}
   * @return PageWebHookResponse
   */
  public PageWebHookResponse listarUsingGET66(List<String> sort, Integer page, Integer limit, Long id, String tipoEvento, String metodo, String url) throws ApiException {
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
   * {{{web_hook_resource_salvar}}}
   * {{{web_hook_resource_salvar_notes}}}
   * @param webhook webhook
   * @return WebHookResponse
   */
  public WebHookResponse salvarUsingPOST35(WebHookPersistValue webhook) throws ApiException {
    Object postBody = webhook;
    
     // verify the required parameter 'webhook' is set
     if (webhook == null) {
        throw new ApiException(400, "Missing the required parameter 'webhook' when calling salvarUsingPOST35");
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

    
    GenericType<WebHookResponse> returnType = new GenericType<WebHookResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

