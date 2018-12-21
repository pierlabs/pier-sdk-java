package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.InscricaoAPNResponse;
import br.com.conductor.pier.api.v2.model.PageInscricaoAPNResponse;
import br.com.conductor.pier.api.v2.model.APNSubscription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class APNIncriptionsApi {
  private ApiClient apiClient;

  public APNIncriptionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public APNIncriptionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Deactivate a subscription
   * Deactivate a subscription
   * @param id id
   * @return InscricaoAPNResponse
   */
  public InscricaoAPNResponse desativar(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativar");
     }
     
    // create path and map variables
    String path = "/api/inscricoes-apn/{id}/desativar".replaceAll("\\{format\\}","json")
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

    
    GenericType<InscricaoAPNResponse> returnType = new GenericType<InscricaoAPNResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List the subscriptions
   * List the APN subscriptions
   * @param sort Register ordering type
   * @param idCartoes List of card ids on one subscription
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param deviceToken The device token
   * @param dataCriacao The subscription creation date
   * @param dataDesativacao The subscription deactivation date
   * @param ativo Indicates is the subscription is active
   * @param idAplicacaoMobile The mobile application Id
   * @return PageInscricaoAPNResponse
   */
  public PageInscricaoAPNResponse listar(List<String> sort, List<Long> idCartoes, Integer page, Integer limit, String deviceToken, String dataCriacao, String dataDesativacao, Boolean ativo, Long idAplicacaoMobile) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/inscricoes-apn".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("multi", "idCartoes", idCartoes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "deviceToken", deviceToken));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCriacao", dataCriacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataDesativacao", dataDesativacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "ativo", ativo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idAplicacaoMobile", idAplicacaoMobile));
    

    

    

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

    
    GenericType<PageInscricaoAPNResponse> returnType = new GenericType<PageInscricaoAPNResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Save a new subscription
   * Save a new subscription
   * @param inscricaoPersist inscricaoPersist
   * @return List<InscricaoAPNResponse>
   */
  public List<InscricaoAPNResponse> salvar(APNSubscription inscricaoPersist) throws ApiException {
    Object postBody = inscricaoPersist;
    
     // verify the required parameter 'inscricaoPersist' is set
     if (inscricaoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'inscricaoPersist' when calling salvar");
     }
     
    // create path and map variables
    String path = "/api/inscricoes-apn".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<InscricaoAPNResponse>> returnType = new GenericType<List<InscricaoAPNResponse>>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
