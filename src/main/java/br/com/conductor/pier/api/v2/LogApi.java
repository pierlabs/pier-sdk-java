package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.LogRequisicaoMobilePartialUpdate;
import br.com.conductor.pier.api.v2.model.LogRequisicaoMobileResponse;
import br.com.conductor.pier.api.v2.model.LogAcessoUsuarioResponse;
import br.com.conductor.pier.api.v2.model.LogAcessoUsuarioPersist;
import br.com.conductor.pier.api.v2.model.LogRequisicaoMobilePersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LogApi {
  private ApiClient apiClient;

  public LogApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Atualizar parcialmente o log de requisi\u00E7\u00E3o mobile
   * Atualiza parcialmente as informa\u00E7\u00F5es adicionais da requisi\u00E7\u00E3o de um dispositivo m\u00F3vel
   * @param id Identifica\u00E7\u00E3o do registro
   * @param logRequisicao logRequisicao
   * @return LogRequisicaoMobileResponse
   */
  public LogRequisicaoMobileResponse atualizarParcialmenteLogRequisicaoMobile(Long id, LogRequisicaoMobilePartialUpdate logRequisicao) throws ApiException {
    Object postBody = logRequisicao;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarParcialmenteLogRequisicaoMobile");
     }
     
     // verify the required parameter 'logRequisicao' is set
     if (logRequisicao == null) {
        throw new ApiException(400, "Missing the required parameter 'logRequisicao' when calling atualizarParcialmenteLogRequisicaoMobile");
     }
     
    // create path and map variables
    String path = "/api/logs/requisicoes-mobile/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<LogRequisicaoMobileResponse> returnType = new GenericType<LogRequisicaoMobileResponse>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Salva os registros parametrizados
   * Este recurso permite salvar os registros parametrizados
   * @param logAcessoUsuarioPersist logAcessoUsuarioPersist
   * @return LogAcessoUsuarioResponse
   */
  public LogAcessoUsuarioResponse salvar(LogAcessoUsuarioPersist logAcessoUsuarioPersist) throws ApiException {
    Object postBody = logAcessoUsuarioPersist;
    
     // verify the required parameter 'logAcessoUsuarioPersist' is set
     if (logAcessoUsuarioPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'logAcessoUsuarioPersist' when calling salvar");
     }
     
    // create path and map variables
    String path = "/api/logs/log-acessos-usuario".replaceAll("\\{format\\}","json");

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

    
    GenericType<LogAcessoUsuarioResponse> returnType = new GenericType<LogAcessoUsuarioResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastra o log requisi\u00E7\u00E3o mobile
   * Cadastra registros da requisi\u00E7\u00E3o de um dispositivo m\u00F3vel
   * @param logRequisicaoMobilePersist logRequisicaoMobilePersist
   * @return LogRequisicaoMobileResponse
   */
  public LogRequisicaoMobileResponse salvarLogRequisicaoMobile(LogRequisicaoMobilePersist logRequisicaoMobilePersist) throws ApiException {
    Object postBody = logRequisicaoMobilePersist;
    
     // verify the required parameter 'logRequisicaoMobilePersist' is set
     if (logRequisicaoMobilePersist == null) {
        throw new ApiException(400, "Missing the required parameter 'logRequisicaoMobilePersist' when calling salvarLogRequisicaoMobile");
     }
     
    // create path and map variables
    String path = "/api/logs/requisicoes-mobile".replaceAll("\\{format\\}","json");

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

    
    GenericType<LogRequisicaoMobileResponse> returnType = new GenericType<LogRequisicaoMobileResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
