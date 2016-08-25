package br.com.conductor.pier.api.v1_1;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v1_1.invoker.ApiException;
import br.com.conductor.pier.api.v1_1.invoker.ApiClient;
import br.com.conductor.pier.api.v1_1.invoker.Configuration;
import br.com.conductor.pier.api.v1_1.invoker.Pair;

import br.com.conductor.pier.api.v1_1.model.OrigemComercial;
import br.com.conductor.pier.api.v1_1.model.ListaDeOrigensComerciais;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class OrigemComercialApi {
  private ApiClient apiClient;

  public OrigemComercialApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrigemComercialApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Opera\u00C3\u00A7\u00C3\u00A3o utilizada para consultar uma determinada Origem Comercial 
   * Este m\u00C3\u00A9todo permite que sejam listados os registros de uma determinada Origem Comercial existente na base do emissor. Para isso, \u00C3\u00A9 preciso informar o seu respectivo c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id). 
   * @param idOrigemComercial ID da Origem Comercial
   * @return OrigemComercial
   */
  public OrigemComercial consultarOrigemComercialUsingGET(Long idOrigemComercial) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idOrigemComercial' is set
     if (idOrigemComercial == null) {
        throw new ApiException(400, "Missing the required parameter 'idOrigemComercial' when calling consultarOrigemComercialUsingGET");
     }
     
    // create path and map variables
    String path = "/api/origens-comerciais/{id_origem_comercial}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id_origem_comercial" + "\\}", apiClient.escapeString(idOrigemComercial.toString()));

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

    
    GenericType<OrigemComercial> returnType = new GenericType<OrigemComercial>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Opera\u00C3\u00A7\u00C3\u00A3o utilizada para listar Origens Comerciais 
   * Este m\u00C3\u00A9todo permite que sejam listadas as Origens Comerciais existentes na base do emissor.
   * @param idOrigemComercial ID da Origem Comercial
   * @param nome Nome da Origem Comercial
   * @param status Status da Origem Comercial
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @return ListaDeOrigensComerciais
   */
  public ListaDeOrigensComerciais listarOrigensComerciaisUsingGET(Long idOrigemComercial, String nome, String status, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/origens-comerciais".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_origem_comercial", idOrigemComercial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<ListaDeOrigensComerciais> returnType = new GenericType<ListaDeOrigensComerciais>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

