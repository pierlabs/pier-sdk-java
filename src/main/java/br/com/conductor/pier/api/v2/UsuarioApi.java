package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.UsuarioUpdate;
import br.com.conductor.pier.api.v2.model.UsuarioResponse;
import br.com.conductor.pier.api.v2.model.ControleSegurancaDispositivoResponse;
import br.com.conductor.pier.api.v2.model.UsuarioDispositivoUpdate;
import br.com.conductor.pier.api.v2.model.PageUsuarioContasResponse;
import br.com.conductor.pier.api.v2.model.PageControleSegurancaDispositivoResponse;
import br.com.conductor.pier.api.v2.model.PageUsuarioResponse;
import br.com.conductor.pier.api.v2.model.UsuarioDispositivoPersist;
import br.com.conductor.pier.api.v2.model.UsuarioPersist;
import br.com.conductor.pier.api.v2.model.SenhaForte;
import br.com.conductor.pier.api.v2.model.ValidarSenhaLoginRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UsuarioApi {
  private ApiClient apiClient;

  public UsuarioApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsuarioApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Alterar senha do usu\u00E1rio na base do PIER ou WS
   * Este m\u00E9todo realiza a altera\u00E7\u00E3o da senha do usu\u00E1rio
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id)
   * @param senhaAtual Senha Atual
   * @param senhaNova Senha Nova
   * @return String
   */
  public String alterarSenha(Long id, String senhaAtual, String senhaNova) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarSenha");
     }
     
     // verify the required parameter 'senhaAtual' is set
     if (senhaAtual == null) {
        throw new ApiException(400, "Missing the required parameter 'senhaAtual' when calling alterarSenha");
     }
     
     // verify the required parameter 'senhaNova' is set
     if (senhaNova == null) {
        throw new ApiException(400, "Missing the required parameter 'senhaNova' when calling alterarSenha");
     }
     
    // create path and map variables
    String path = "/api/usuarios/{id}/alterar-senha".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (senhaAtual != null)
      headerParams.put("senha_atual", apiClient.parameterToString(senhaAtual));
    if (senhaNova != null)
      headerParams.put("senha_nova", apiClient.parameterToString(senhaNova));
    

    

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

    
    GenericType<String> returnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Alterar senha do usu\u00E1rio
   * Este m\u00E9todo realiza a altera\u00E7\u00E3o da senha do usu\u00E1rio
   * @param login Login do usu\u00E1rio
   * @param senhaNova Senha Nova
   * @return String
   */
  public String alterarSenhaPorLogin(String login, String senhaNova) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'login' is set
     if (login == null) {
        throw new ApiException(400, "Missing the required parameter 'login' when calling alterarSenhaPorLogin");
     }
     
     // verify the required parameter 'senhaNova' is set
     if (senhaNova == null) {
        throw new ApiException(400, "Missing the required parameter 'senhaNova' when calling alterarSenhaPorLogin");
     }
     
    // create path and map variables
    String path = "/api/usuarios/{login}/alterar-senha".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "login" + "\\}", apiClient.escapeString(login.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (senhaNova != null)
      headerParams.put("senhaNova", apiClient.parameterToString(senhaNova));
    

    

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

    
    GenericType<String> returnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Altera os usu\u00E1rios cadastrados na base
   * Este m\u00E9todo realiza a altera\u00E7\u00E3o dos usu\u00E1rios
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id)
   * @param update update
   * @return UsuarioResponse
   */
  public UsuarioResponse alterarUsuario(Long id, UsuarioUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsuario");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling alterarUsuario");
     }
     
    // create path and map variables
    String path = "/api/usuarios/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<UsuarioResponse> returnType = new GenericType<UsuarioResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Ativa os usu\u00E1rios cadastrados na base do PIER ou WS
   * Este m\u00E9todo realiza a ativa\u00E7\u00E3o dos usu\u00E1rios
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id)
   * @return UsuarioResponse
   */
  public UsuarioResponse ativarUsuario(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ativarUsuario");
     }
     
    // create path and map variables
    String path = "/api/usuarios/{id}/ativar-usuario".replaceAll("\\{format\\}","json")
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

    
    GenericType<UsuarioResponse> returnType = new GenericType<UsuarioResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Atualiza dispositivo do usu\u00E1rio
   * Este recurso permite atualizar o dispositivo do usu\u00E1rio
   * @param id Identificador do controle de acesso
   * @param update update
   * @return ControleSegurancaDispositivoResponse
   */
  public ControleSegurancaDispositivoResponse atualizarControleSegurancaDispositivo(Long id, UsuarioDispositivoUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarControleSegurancaDispositivo");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling atualizarControleSegurancaDispositivo");
     }
     
    // create path and map variables
    String path = "/api/controles-seguranca-dispositivos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ControleSegurancaDispositivoResponse> returnType = new GenericType<ControleSegurancaDispositivoResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as contas vinculadas ao usu\u00E1rio
   * Este recurso permite listar as contas vinculadas ao usu\u00E1rio por ID
   * @param id ID do usu\u00E1rio
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageUsuarioContasResponse
   */
  public PageUsuarioContasResponse consultarContasVinculadas(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarContasVinculadas");
     }
     
    // create path and map variables
    String path = "/api/usuarios/{id}/vincular-contas".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageUsuarioContasResponse> returnType = new GenericType<PageUsuarioContasResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta dispositivo do usu\u00E1rio
   * Este m\u00E9todo permite consultar o dispositivo do usu\u00E1rio
   * @param idUsuario idUsuario
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageControleSegurancaDispositivoResponse
   */
  public PageControleSegurancaDispositivoResponse consultarControleSegurancaDispositivo(Long idUsuario, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idUsuario' is set
     if (idUsuario == null) {
        throw new ApiException(400, "Missing the required parameter 'idUsuario' when calling consultarControleSegurancaDispositivo");
     }
     
    // create path and map variables
    String path = "/api/controles-seguranca-dispositivos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idUsuario", idUsuario));
    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageControleSegurancaDispositivoResponse> returnType = new GenericType<PageControleSegurancaDispositivoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Usu\u00E1rio na base do PIER ou WS
   * Este m\u00E9todo permite consultar as informa\u00E7\u00F5es de um determinado Usu\u00E1rio a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id Id do us\u00E1rio para consultar
   * @return UsuarioResponse
   */
  public UsuarioResponse consultarUsuario(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsuario");
     }
     
    // create path and map variables
    String path = "/api/usuarios/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<UsuarioResponse> returnType = new GenericType<UsuarioResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Remove o dispositivo do usu\u00E1rio
   * Este recurso permite remover o dispositivo do usu\u00E1rio
   * @param id Identificador do controle de acesso
   * @return ControleSegurancaDispositivoResponse
   */
  public ControleSegurancaDispositivoResponse deletarControleSeguranca(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deletarControleSeguranca");
     }
     
    // create path and map variables
    String path = "/api/controles-seguranca-dispositivos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ControleSegurancaDispositivoResponse> returnType = new GenericType<ControleSegurancaDispositivoResponse>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Desativa os usu\u00E1rios cadastrados na base do PIER ou WS
   * Este m\u00E9todo realiza a desativa\u00E7\u00E3o dos usu\u00E1rios
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id)
   * @return UsuarioResponse
   */
  public UsuarioResponse desativarUsuario(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarUsuario");
     }
     
    // create path and map variables
    String path = "/api/usuarios/{id}/desativar-usuario".replaceAll("\\{format\\}","json")
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

    
    GenericType<UsuarioResponse> returnType = new GenericType<UsuarioResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Usu\u00E1rios cadastrados na base do PIER ou WS
   * Este m\u00E9todo permite que sejam listados os usu\u00E1rios existentes na base do PIER
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param nome Nome do Usuario
   * @param cpf CPF do Usuario
   * @param email Email do Usuario
   * @param status Status do Usuario
   * @return PageUsuarioResponse
   */
  public PageUsuarioResponse listarUsuarios(List<String> sort, Integer page, Integer limit, String nome, String cpf, String email, String status) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/usuarios".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(apiClient.parameterToPairs("", "email", email));
    
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

    
    GenericType<PageUsuarioResponse> returnType = new GenericType<PageUsuarioResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Recuperar senha do usu\u00E1rio na base do PIER ou WS
   * Esse recurso permite recuperar a senha do usu\u00E1rio
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id)
   * @return String
   */
  public String recuperarSenha(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling recuperarSenha");
     }
     
    // create path and map variables
    String path = "/api/usuarios/{id}/recuperar-senha".replaceAll("\\{format\\}","json")
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

    
    GenericType<String> returnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastra dispositivo do usu\u00E1rio
   * Este recurso permite cadastrar o dispositivo do usu\u00E1rio
   * @param persist persist
   * @return ControleSegurancaDispositivoResponse
   */
  public ControleSegurancaDispositivoResponse salvarControleSegurancaDispositivo(UsuarioDispositivoPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarControleSegurancaDispositivo");
     }
     
    // create path and map variables
    String path = "/api/controles-seguranca-dispositivos".replaceAll("\\{format\\}","json");

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

    
    GenericType<ControleSegurancaDispositivoResponse> returnType = new GenericType<ControleSegurancaDispositivoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastra Usu\u00E1rio na base
   * Esse recurso permite cadastrar usu\u00E1rios
   * @param persist persist
   * @return UsuarioResponse
   */
  public UsuarioResponse salvarUsuario(UsuarioPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsuario");
     }
     
    // create path and map variables
    String path = "/api/usuarios".replaceAll("\\{format\\}","json");

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

    
    GenericType<UsuarioResponse> returnType = new GenericType<UsuarioResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Validar a senha do usu\u00E1rio na base do PIER ou WS
   * Este m\u00E9todo permite validar a senha do usu\u00E1rio)
   * @param senha Senha do usu\u00E1rio
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id)
   * @return String
   */
  public String validarSenha1(String senha, Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'senha' is set
     if (senha == null) {
        throw new ApiException(400, "Missing the required parameter 'senha' when calling validarSenha1");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling validarSenha1");
     }
     
    // create path and map variables
    String path = "/api/usuarios/{id}/validar-senha".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (senha != null)
      headerParams.put("senha", apiClient.parameterToString(senha));
    

    

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

    
    GenericType<String> returnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Validar senha forte do usu\u00E1rio
   * Este recurso permite validar se a senha do us\u00FAario \u00E9 uma senha forte
   * @param senha Senha do usu\u00E1rio
   * @param usuarioSenhaFortePersist Id da plataforma
   * @return String
   */
  public String validarSenhaForte(String senha, SenhaForte usuarioSenhaFortePersist) throws ApiException {
    Object postBody = usuarioSenhaFortePersist;
    
     // verify the required parameter 'senha' is set
     if (senha == null) {
        throw new ApiException(400, "Missing the required parameter 'senha' when calling validarSenhaForte");
     }
     
     // verify the required parameter 'usuarioSenhaFortePersist' is set
     if (usuarioSenhaFortePersist == null) {
        throw new ApiException(400, "Missing the required parameter 'usuarioSenhaFortePersist' when calling validarSenhaForte");
     }
     
    // create path and map variables
    String path = "/api/usuarios/validar-senha-forte".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (senha != null)
      headerParams.put("senha", apiClient.parameterToString(senha));
    

    

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

    
    GenericType<String> returnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza login com valida\u00E7\u00E3o de senha dos usu\u00E1rios cadastrados na base do PIER ou WS
   * O recurso permite fazer login do usu\u00E1rio atrav\u00E9s da senha definida pelo emissor
   * @param login Login identificador do usu\u00E1rio (login)
   * @param senha Senha do usu\u00E1rio
   * @param request request
   * @return Object
   */
  public Object validarSenhaPorLogin(String login, String senha, ValidarSenhaLoginRequest request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'login' is set
     if (login == null) {
        throw new ApiException(400, "Missing the required parameter 'login' when calling validarSenhaPorLogin");
     }
     
     // verify the required parameter 'senha' is set
     if (senha == null) {
        throw new ApiException(400, "Missing the required parameter 'senha' when calling validarSenhaPorLogin");
     }
     
    // create path and map variables
    String path = "/api/usuarios/{login}/validar-senha".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "login" + "\\}", apiClient.escapeString(login.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (senha != null)
      headerParams.put("senha", apiClient.parameterToString(senha));
    

    

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
  
  /**
   * Associa o usu\u00E1rio \u00E1 contas existentes
   * Este m\u00E9todo permite associar um usu\u00E1rio \u00E1 contas existentes
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id)
   * @return String
   */
  public String vincularContas(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling vincularContas");
     }
     
    // create path and map variables
    String path = "/api/usuarios/{id}/vincular-usuarios".replaceAll("\\{format\\}","json")
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

    
    GenericType<String> returnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
