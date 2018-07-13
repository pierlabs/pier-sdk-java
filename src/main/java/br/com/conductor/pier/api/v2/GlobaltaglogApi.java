package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.LogAcessoUsuarioPersistencia;
import br.com.conductor.pier.api.v2.model.LogAcessoUsuarioResposta;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class GlobaltaglogApi {
  private ApiClient apiClient;

  public GlobaltaglogApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltaglogApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{log_acesso_usuario_recurso_salvar}}}
   * {{{log_acesso_usuario_recurso_salvar_notas}}}
   * @param logAcessoUsuarioPersist logAcessoUsuarioPersist
   * @return LogAcessoUsuarioResposta
   */
  public LogAcessoUsuarioResposta salvarUsingPOST18(LogAcessoUsuarioPersistencia logAcessoUsuarioPersist) throws ApiException {
    Object postBody = logAcessoUsuarioPersist;
    
     // verify the required parameter 'logAcessoUsuarioPersist' is set
     if (logAcessoUsuarioPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'logAcessoUsuarioPersist' when calling salvarUsingPOST18");
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

    
    GenericType<LogAcessoUsuarioResposta> returnType = new GenericType<LogAcessoUsuarioResposta>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

