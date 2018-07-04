package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.AplicacaoMobileResponse;
import br.com.conductor.pier.api.v2.model.AplicacaoMobileUpdateValue;
import br.com.conductor.pier.api.v2.model.PageAplicacaoMobileResponse;
import br.com.conductor.pier.api.v2.model.AplicacaoMobilePersistValue;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class GlobaltagaplicacaomobileApi {
  private ApiClient apiClient;

  public GlobaltagaplicacaomobileApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagaplicacaomobileApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{aplicacao_mobile_resource_atualizar}}}
   * {{{aplicacao_mobile_resource_atualizar_notes}}}
   * @param id {{{aplicacao_mobile_resource_atualizar_param_id}}}
   * @param update update
   * @return AplicacaoMobileResponse
   */
  public AplicacaoMobileResponse atualizarUsingPUT(Long id, AplicacaoMobileUpdateValue update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarUsingPUT");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling atualizarUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/aplicacoes-mobile/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<AplicacaoMobileResponse> returnType = new GenericType<AplicacaoMobileResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{aplicacao_mobile_resource_listar}}}
   * {{{aplicacao_mobile_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{aplicacao_mobile_request_id_value}}}
   * @param idPlataformaMobile {{{aplicacao_mobile_request_id_plataforma_mobile_value}}}
   * @return PageAplicacaoMobileResponse
   */
  public PageAplicacaoMobileResponse listarUsingGET3(List<String> sort, Integer page, Integer limit, String id, Long idPlataformaMobile) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/aplicacoes-mobile".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPlataformaMobile", idPlataformaMobile));
    

    

    

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

    
    GenericType<PageAplicacaoMobileResponse> returnType = new GenericType<PageAplicacaoMobileResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{aplicacao_mobile_resource_salvar}}}
   * {{{aplicacao_mobile_resource_salvar_notes}}}
   * @param persist persist
   * @return AplicacaoMobileResponse
   */
  public AplicacaoMobileResponse salvarUsingPOST(AplicacaoMobilePersistValue persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/aplicacoes-mobile".replaceAll("\\{format\\}","json");

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

    
    GenericType<AplicacaoMobileResponse> returnType = new GenericType<AplicacaoMobileResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

