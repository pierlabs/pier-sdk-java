package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.DispositivoResponse;
import br.com.conductor.pier.api.v2.model.PageDispositivoResponse;
import br.com.conductor.pier.api.v2.model.DispositivoPersist;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class DispositivoApi {
  private ApiClient apiClient;

  public DispositivoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DispositivoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Ativa Dispositivo
   * Esse recurso permite ativar dispositivo.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Plataforma (id).
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
   * Desativa Dispositivo
   * Esse recurso permite desativar dispositivo.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Plataforma (id).
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
   * Lista os dispositivos cadastrados
   * Este m\u00C3\u00A9todo permite que sejam listados os dispositivos existentes na base do PIER.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param token Token do Dispositivo
   * @param idUsuario Identificador do Usu\u00C3\u00A1rio
   * @param idAplicacaoMobile Identificador da aplica\u00C3\u00A7\u00C3\u00A3o
   * @param dataCriacao Apresenta a data e em que o registro foi criado.
   * @param dataDesativacao Apresenta a data e em que o registro foi desativado.
   * @return PageDispositivoResponse
   */
  public PageDispositivoResponse listarUsingGET14(List<String> sort, Integer page, Integer limit, String token, Long idUsuario, Long idAplicacaoMobile, String dataCriacao, String dataDesativacao) throws ApiException {
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
   * Cadastra Dispositivo
   * Esse recurso permite cadastrar dispositivos.
   * @param persist persist
   * @return DispositivoResponse
   */
  public DispositivoResponse salvarUsingPOST8(DispositivoPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST8");
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

