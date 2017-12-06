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
   * Adiciona uma nova FAQ
   * Adiciona uma nova FAQ
   * @param pergunta Conte\u00C3\u00BAdo da pergunta.
   * @param resposta Conte\u00C3\u00BAdo da resposta.
   * @param relevancia N\u00C3\u00ADvel de relev\u00C3\u00A2ncia da pergunta.
   * @param plataforma Plataforma em que a FAQ se encaixa.
   * @param categoria Categoria de assunto do qual a FAQ se trata.
   * @param status Status descrevendo a situa\u00C3\u00A7\u00C3\u00A3o atual da FAQ.
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
   * Alterar FAQ
   * Alterar FAQ
   * @param id Id
   * @param pergunta Conte\u00C3\u00BAdo da pergunta.
   * @param resposta Conte\u00C3\u00BAdo da resposta.
   * @param relevancia N\u00C3\u00ADvel de relev\u00C3\u00A2ncia da pergunta.
   * @param plataforma Plataforma em que a FAQ se encaixa.
   * @param categoria Categoria de assunto do qual a FAQ se trata.
   * @param status Status descrevendo a situa\u00C3\u00A7\u00C3\u00A3o atual da FAQ.
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
   * Consultar FAQ por id
   * Consulta os detalhes de uma determinada FAQ
   * @param id Id
   * @return FaqResponse
   */
  public FaqResponse consultarUsingGET16(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET16");
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
   * Lista FAQs
   * Lista todas as FAQs
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idFaq C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da FAQ (id).
   * @param pergunta Conte\u00C3\u00BAdo da pergunta.
   * @param resposta Conte\u00C3\u00BAdo da resposta.
   * @param relevancia N\u00C3\u00ADvel de relev\u00C3\u00A2ncia da pergunta.
   * @param plataforma Plataforma em que a FAQ se encaixa.
   * @param categoria Categoria de assunto do qual a FAQ se trata.
   * @param status Status descrevendo a situa\u00C3\u00A7\u00C3\u00A3o atual da FAQ.
   * @return PageFaqResponse
   */
  public PageFaqResponse listarUsingGET20(List<String> sort, Integer page, Integer limit, Long idFaq, String pergunta, String resposta, Integer relevancia, String plataforma, String categoria, String status) throws ApiException {
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

