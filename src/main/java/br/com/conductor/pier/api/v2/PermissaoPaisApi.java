package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.PaisResponse;
import br.com.conductor.pier.api.v2.model.PagePaisResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PermissaoPaisApi {
  private ApiClient apiClient;

  public PermissaoPaisApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PermissaoPaisApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Apresenta dados de um determinado pa\u00EDs
   * Este m\u00E9todo permite consultar dados de um determinado pa\u00EDs a partir de seu codigo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do pa\u00EDs (id).
   * @return PaisResponse
   */
  public PaisResponse consultarPaisUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarPaisUsingGET");
     }
     
    // create path and map variables
    String path = "/api/paises/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<PaisResponse> returnType = new GenericType<PaisResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os continentes
   * Este recurso permite listar os continentes utilizados no recurso de permiss\u00E3o de uso do cart\u00E3o no exterior
   * @return List<Object>
   */
  public List<Object> listarContinentesUsingGET() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/continentes".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Object>> returnType = new GenericType<List<Object>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os pa\u00EDses
   * Este recurso permite listar os pa\u00EDses.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param codigo C\u00F3digo do pa\u00EDs
   * @param sigla Sigla do pa\u00EDs
   * @param descricao Nome do pa\u00EDs
   * @param continente Continente no qual o pa\u00EDs faz parte
   * @param flagAtivo Atributo que representa se o pa\u00EDs est\u00E1 ativo
   * @return PagePaisResponse
   */
  public PagePaisResponse listarPaisesUsingGET(List<String> sort, Integer page, Integer limit, String codigo, String sigla, String descricao, String continente, Boolean flagAtivo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/paises".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigo", codigo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sigla", sigla));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "continente", continente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    

    

    

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

    
    GenericType<PagePaisResponse> returnType = new GenericType<PagePaisResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
