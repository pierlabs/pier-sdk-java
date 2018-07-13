package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.DispositivoResponse;
import br.com.conductor.pier.api.v2.model.PageDispositivoResponse;
import br.com.conductor.pier.api.v2.model.DispositivoPersistValue;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class GlobaltagdispositivoApi {
  private ApiClient apiClient;

  public GlobaltagdispositivoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagdispositivoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{dispositivo_resource_ativar}}}
   * {{{dispositivo_resource_ativar_notes}}}
   * @param id {{{dispositivo_resource_ativar_param_id}}}
   * @return DispositivoResponse
   */
  public DispositivoResponse ativarUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ativarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/dispositivos/{id}/ativar-dispositivo".replaceAll("\\{format\\}","json")
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

    
    GenericType<DispositivoResponse> returnType = new GenericType<DispositivoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{dispositivo_resource_desativar}}}
   * {{{dispositivo_resource_desativar_notes}}}
   * @param id {{{dispositivo_resource_desativar_param_id}}}
   * @return DispositivoResponse
   */
  public DispositivoResponse desativarUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/dispositivos/{id}/desativar-dispositivo".replaceAll("\\{format\\}","json")
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

    
    GenericType<DispositivoResponse> returnType = new GenericType<DispositivoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{dispositivo_resource_listar}}}
   * {{{dispositivo_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param token {{{dispositivo_request_token_value}}}
   * @param idUsuario {{{dispositivo_request_id_usuario_value}}}
   * @param idAplicacaoMobile {{{dispositivo_request_id_aplicacao_mobile_value}}}
   * @param dataCriacao {{{dispositivo_request_data_criacao_value}}}
   * @param dataDesativacao {{{dispositivo_request_data_desativacao_value}}}
   * @return PageDispositivoResponse
   */
  public PageDispositivoResponse listarUsingGET20(List<String> sort, Integer page, Integer limit, String token, Long idUsuario, Long idAplicacaoMobile, String dataCriacao, String dataDesativacao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/dispositivos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "token", token));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idUsuario", idUsuario));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idAplicacaoMobile", idAplicacaoMobile));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCriacao", dataCriacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataDesativacao", dataDesativacao));
    

    

    

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

    
    GenericType<PageDispositivoResponse> returnType = new GenericType<PageDispositivoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{dispositivo_resource_salvar}}}
   * {{{dispositivo_resource_salvar_notes}}}
   * @param persist persist
   * @return DispositivoResponse
   */
  public DispositivoResponse salvarUsingPOST10(DispositivoPersistValue persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST10");
     }
     
    // create path and map variables
    String path = "/api/dispositivos".replaceAll("\\{format\\}","json");

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

    
    GenericType<DispositivoResponse> returnType = new GenericType<DispositivoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

