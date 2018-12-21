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
public class FAQApi {
  private ApiClient apiClient;

  public FAQApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FAQApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a new FAQ
   * Create a new FAQ
   * @param pergunta Content of the question
   * @param resposta Response Content
   * @param relevancia Relevance level of the question
   * @param plataforma Platform which the FAQ fits
   * @param categoria Category of the subject which the FAQ refers to
   * @param status Status describing the current situation of the FAQ
   * @return FaqResponse
   */
  public FaqResponse adicionar(String pergunta, String resposta, Integer relevancia, String plataforma, String categoria, String status) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'pergunta' is set
     if (pergunta == null) {
        throw new ApiException(400, "Missing the required parameter 'pergunta' when calling adicionar");
     }
     
     // verify the required parameter 'resposta' is set
     if (resposta == null) {
        throw new ApiException(400, "Missing the required parameter 'resposta' when calling adicionar");
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
   * Update FAQ
   * Update FAQ
   * @param id Id
   * @param pergunta Content of the question
   * @param resposta Response Content
   * @param relevancia Relevance level of the question
   * @param plataforma Platform which the FAQ fits
   * @param categoria Category of the subject which the FAQ refers to
   * @param status Status describing the current situation of the FAQ
   * @return FaqResponse
   */
  public FaqResponse alterar(Long id, String pergunta, String resposta, Integer relevancia, String plataforma, String categoria, String status) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterar");
     }
     
     // verify the required parameter 'pergunta' is set
     if (pergunta == null) {
        throw new ApiException(400, "Missing the required parameter 'pergunta' when calling alterar");
     }
     
     // verify the required parameter 'resposta' is set
     if (resposta == null) {
        throw new ApiException(400, "Missing the required parameter 'resposta' when calling alterar");
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
   * Retrieve FAQ using the id
   * Retrieve the details of a determined FAQ
   * @param id Id
   * @return FaqResponse
   */
  public FaqResponse consultar(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
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
   * List FAQs
   * List all the FAQs
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idFaq Identification Code of the FAQ (id)
   * @param pergunta Content of the question
   * @param resposta Content of the response
   * @param relevancia Level of relevance of the question
   * @param plataforma Plataform which the FAQ fits
   * @param categoria Category of subject which the FAQ refers to
   * @param status Status describing the current situation of the FAQ
   * @return PageFaqResponse
   */
  public PageFaqResponse listar(List<String> sort, Integer page, Integer limit, Long idFaq, String pergunta, String resposta, Integer relevancia, String plataforma, String categoria, String status) throws ApiException {
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
