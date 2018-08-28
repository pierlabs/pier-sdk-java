package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.BinChaveUpdate;
import br.com.conductor.pier.api.v2.model.BinChavePersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BinchaveresourceApi {
  private ApiClient apiClient;

  public BinchaveresourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BinchaveresourceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * alterarBinChave
   * 
   * @param id id
   * @param request request
   * @param login login
   * @return Object
   */
  public Object alterarBinChaveUsingPUT(Long id, BinChaveUpdate request, String login) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarBinChaveUsingPUT");
     }
     
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling alterarBinChaveUsingPUT");
     }
     
     // verify the required parameter 'login' is set
     if (login == null) {
        throw new ApiException(400, "Missing the required parameter 'login' when calling alterarBinChaveUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/bins-chaves/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (login != null)
      headerParams.put("login", apiClient.parameterToString(login));
    

    

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
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * consultar
   * 
   * @param id id
   * @return Object
   */
  public Object consultarUsingGET10(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET10");
     }
     
    // create path and map variables
    String path = "/api/bins-chaves/{id}".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * listarBinChave
   * 
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id 
   * @param idTipoChave 
   * @param idBin 
   * @param chave 
   * @param checkValue 
   * @param validade 
   * @param flagDescriptografado 
   * @param label 
   * @return Object
   */
  public Object listarBinChaveUsingGET(List<String> sort, Integer page, Integer limit, Long id, Long idTipoChave, Long idBin, String chave, String checkValue, String validade, Boolean flagDescriptografado, String label) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/bins-chaves".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoChave", idTipoChave));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idBin", idBin));
    
    queryParams.addAll(apiClient.parameterToPairs("", "chave", chave));
    
    queryParams.addAll(apiClient.parameterToPairs("", "checkValue", checkValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "validade", validade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagDescriptografado", flagDescriptografado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "label", label));
    

    

    

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
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * salvar
   * 
   * @param binChavePersist binChavePersist
   * @param login login
   * @return Object
   */
  public Object salvarUsingPOST4(BinChavePersist binChavePersist, String login) throws ApiException {
    Object postBody = binChavePersist;
    
     // verify the required parameter 'binChavePersist' is set
     if (binChavePersist == null) {
        throw new ApiException(400, "Missing the required parameter 'binChavePersist' when calling salvarUsingPOST4");
     }
     
     // verify the required parameter 'login' is set
     if (login == null) {
        throw new ApiException(400, "Missing the required parameter 'login' when calling salvarUsingPOST4");
     }
     
    // create path and map variables
    String path = "/api/bins-chaves".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (login != null)
      headerParams.put("login", apiClient.parameterToString(login));
    

    

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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
