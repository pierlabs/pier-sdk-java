package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.FaqResponse;
import br.com.conductor.pier.api.v2.model.PageFaqResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class GlobaltagfaqApi {
  private ApiClient apiClient;

  public GlobaltagfaqApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagfaqApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{faq_resource_adicionar}}}
   * {{{faq_resource_adicionar_notes}}}
   * @param pergunta {{{faq_persist_pergunta_value}}}
   * @param resposta {{{faq_persist_resposta_value}}}
   * @param relevancia {{{faq_persist_relevancia_value}}}
   * @param plataforma {{{faq_persist_plataforma_value}}}
   * @param categoria {{{faq_persist_categoria_value}}}
   * @param status {{{faq_persist_status_value}}}
   * @return FaqResponse
   */
  public FaqResponse adicionarUsingPOST(String pergunta, String resposta, Integer relevancia, String plataforma, String categoria, String status) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'pergunta' is set
     if (pergunta == null) {
        throw new ApiException(400, "Missing the required parameter 'pergunta' when calling adicionarUsingPOST");
     }
     
     // verify the required parameter 'resposta' is set
     if (resposta == null) {
        throw new ApiException(400, "Missing the required parameter 'resposta' when calling adicionarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/faqs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "pergunta", pergunta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "resposta", resposta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "relevancia", relevancia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "plataforma", plataforma));
    
    queryParams.addAll(apiClient.parameterToPairs("", "categoria", categoria));
    
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

    
    GenericType<FaqResponse> returnType = new GenericType<FaqResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{faq_resource_alterar}}}
   * {{{faq_resource_alterar_notes}}}
   * @param id {{{faq_resource_alterar_param_id_faq}}}
   * @param pergunta {{{faq_persist_pergunta_value}}}
   * @param resposta {{{faq_persist_resposta_value}}}
   * @param relevancia {{{faq_persist_relevancia_value}}}
   * @param plataforma {{{faq_persist_plataforma_value}}}
   * @param categoria {{{faq_persist_categoria_value}}}
   * @param status {{{faq_persist_status_value}}}
   * @return FaqResponse
   */
  public FaqResponse alterarUsingPUT7(Long id, String pergunta, String resposta, Integer relevancia, String plataforma, String categoria, String status) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT7");
     }
     
     // verify the required parameter 'pergunta' is set
     if (pergunta == null) {
        throw new ApiException(400, "Missing the required parameter 'pergunta' when calling alterarUsingPUT7");
     }
     
     // verify the required parameter 'resposta' is set
     if (resposta == null) {
        throw new ApiException(400, "Missing the required parameter 'resposta' when calling alterarUsingPUT7");
     }
     
    // create path and map variables
    String path = "/api/faqs/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "pergunta", pergunta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "resposta", resposta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "relevancia", relevancia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "plataforma", plataforma));
    
    queryParams.addAll(apiClient.parameterToPairs("", "categoria", categoria));
    
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

    
    GenericType<FaqResponse> returnType = new GenericType<FaqResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{faq_resource_consultar}}}
   * {{{faq_resource_consultar_notes}}}
   * @param id {{{faq_resource_consultar_param_id_faq}}}
   * @return FaqResponse
   */
  public FaqResponse consultarUsingGET21(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET21");
     }
     
    // create path and map variables
    String path = "/api/faqs/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<FaqResponse> returnType = new GenericType<FaqResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{faq_resource_listar}}}
   * {{{faq_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idFaq {{{faq_request_id_faq_value}}}
   * @param pergunta {{{faq_request_pergunta_value}}}
   * @param resposta {{{faq_request_resposta_value}}}
   * @param relevancia {{{faq_request_relevancia_value}}}
   * @param plataforma {{{faq_request_plataforma_value}}}
   * @param categoria {{{faq_request_categoria_value}}}
   * @param status {{{faq_request_status_value}}}
   * @return PageFaqResponse
   */
  public PageFaqResponse listarUsingGET26(List<String> sort, Integer page, Integer limit, Long idFaq, String pergunta, String resposta, Integer relevancia, String plataforma, String categoria, String status) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/faqs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idFaq", idFaq));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pergunta", pergunta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "resposta", resposta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "relevancia", relevancia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "plataforma", plataforma));
    
    queryParams.addAll(apiClient.parameterToPairs("", "categoria", categoria));
    
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

    
    GenericType<PageFaqResponse> returnType = new GenericType<PageFaqResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

