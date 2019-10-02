package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.TipoPlasticoPersist;
import br.com.conductor.pier.api.v2.model.TipoPlasticoResponse;
import br.com.conductor.pier.api.v2.model.PageTipoPlasticoResponse;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoplasticoresourceApi {
  private ApiClient apiClient;

  public TipoplasticoresourceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TipoplasticoresourceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * alterarTipoPlastico
   * 
   * @param id id
   * @param request request
   * @return TipoPlasticoResponse
   */
  public TipoPlasticoResponse alterarTipoPlastico(Long id, TipoPlasticoPersist request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTipoPlastico");
     }
     
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling alterarTipoPlastico");
     }
     
    // create path and map variables
    String path = "/api/tipos-plasticos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoPlasticoResponse> returnType = new GenericType<TipoPlasticoResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * cadastrarTipoPlastico
   * 
   * @param request request
   * @return TipoPlasticoResponse
   */
  public TipoPlasticoResponse cadastrarTipoPlastico(TipoPlasticoPersist request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling cadastrarTipoPlastico");
     }
     
    // create path and map variables
    String path = "/api/tipos-plasticos".replaceAll("\\{format\\}","json");

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

    
    GenericType<TipoPlasticoResponse> returnType = new GenericType<TipoPlasticoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * consultarTipoPlastico
   * 
   * @param id id
   * @return TipoPlasticoResponse
   */
  public TipoPlasticoResponse consultarTipoPlastico(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTipoPlastico");
     }
     
    // create path and map variables
    String path = "/api/tipos-plasticos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoPlasticoResponse> returnType = new GenericType<TipoPlasticoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * listarTiposPlasticos
   * 
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param nome 
   * @param idEntidade 
   * @param fabrica 
   * @param tamanhoLinhas 
   * @param bandeirado 
   * @param valorEmissao 
   * @param nomeArquivo 
   * @return PageTipoPlasticoResponse
   */
  public PageTipoPlasticoResponse listarTiposPlasticos(List<String> sort, Integer page, Integer limit, String nome, Long idEntidade, String fabrica, String tamanhoLinhas, Boolean bandeirado, BigDecimal valorEmissao, String nomeArquivo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-plasticos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEntidade", idEntidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "fabrica", fabrica));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tamanhoLinhas", tamanhoLinhas));
    
    queryParams.addAll(apiClient.parameterToPairs("", "bandeirado", bandeirado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valorEmissao", valorEmissao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeArquivo", nomeArquivo));
    

    

    

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

    
    GenericType<PageTipoPlasticoResponse> returnType = new GenericType<PageTipoPlasticoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
