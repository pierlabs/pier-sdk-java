package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.UsuarioUpdate;
import br.com.conductor.pier.api.v2.model.UsuarioResponse;
import br.com.conductor.pier.api.v2.model.PageUsuarioResponse;
import br.com.conductor.pier.api.v2.model.UsuarioPersist;



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
   * Alterar senha do usu\u00C3\u00A1rio.
   * Este m\u00C3\u00A9todo realiza a altera\u00C3\u00A7\u00C3\u00A3o da senha do usu\u00C3\u00A1rio.
   * @param login Login do usu\u00C3\u00A1rio.
   * @param senhaNova Senha Nova
   * @return String
   */
  public String alterarSenhaLoginUsingPOST(String login, String senhaNova) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'login' is set
     if (login == null) {
        throw new ApiException(400, "Missing the required parameter 'login' when calling alterarSenhaLoginUsingPOST");
     }
     
     // verify the required parameter 'senhaNova' is set
     if (senhaNova == null) {
        throw new ApiException(400, "Missing the required parameter 'senhaNova' when calling alterarSenhaLoginUsingPOST");
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
   * Alterar senha do usu\u00C3\u00A1rio na base do PIER ou WS.
   * Este m\u00C3\u00A9todo realiza a altera\u00C3\u00A7\u00C3\u00A3o da senha do usu\u00C3\u00A1rio.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Usu\u00C3\u00A1rio (id).
   * @param senhaAtual Senha Atual
   * @param senhaNova Senha Nova
   * @return String
   */
  public String alterarSenhaUsingPUT(Long id, String senhaAtual, String senhaNova) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarSenhaUsingPUT");
     }
     
     // verify the required parameter 'senhaAtual' is set
     if (senhaAtual == null) {
        throw new ApiException(400, "Missing the required parameter 'senhaAtual' when calling alterarSenhaUsingPUT");
     }
     
     // verify the required parameter 'senhaNova' is set
     if (senhaNova == null) {
        throw new ApiException(400, "Missing the required parameter 'senhaNova' when calling alterarSenhaUsingPUT");
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
   * Altera os usu\u00C3\u00A1rios cadastrados na base.
   * Este m\u00C3\u00A9todo realiza a altera\u00C3\u00A7\u00C3\u00A3o dos usu\u00C3\u00A1rios.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Usu\u00C3\u00A1rio (id).
   * @param update update
   * @return UsuarioResponse
   */
  public UsuarioResponse alterarUsingPUT19(Long id, UsuarioUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT19");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling alterarUsingPUT19");
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
   * Ativa os usu\u00C3\u00A1rios cadastrados na base do PIER ou WS.
   * Este m\u00C3\u00A9todo realiza a ativa\u00C3\u00A7\u00C3\u00A3o dos usu\u00C3\u00A1rios.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Usu\u00C3\u00A1rio (id).
   * @return UsuarioResponse
   */
  public UsuarioResponse ativarUsuarioUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ativarUsuarioUsingPOST");
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
   * Apresenta os dados de um determinado Usu\u00C3\u00A1rio na base do PIER ou WS.
   * Este m\u00C3\u00A9todo permite consultar as informa\u00C3\u00A7\u00C3\u00B5es de um determinado Usu\u00C3\u00A1rio a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Usu\u00C3\u00A1rio (id).
   * @return UsuarioResponse
   */
  public UsuarioResponse consultarUsingGET40(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET40");
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
   * Desativa os usu\u00C3\u00A1rios cadastrados na base do PIER ou WS.
   * Este m\u00C3\u00A9todo realiza a desativa\u00C3\u00A7\u00C3\u00A3o dos usu\u00C3\u00A1rios.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Usu\u00C3\u00A1rio (id).
   * @return UsuarioResponse
   */
  public UsuarioResponse desativarUsuarioUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarUsuarioUsingPOST");
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
   * Lista os Usu\u00C3\u00A1rios cadastrados na base do PIER ou WS.
   * Este m\u00C3\u00A9todo permite que sejam listados os usu\u00C3\u00A1rios existentes na base do PIER.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param nome Nome do Usuario
   * @param cpf CPF do Usuario
   * @param email Email do Usuario
   * @param status Status do Usuario
   * @return PageUsuarioResponse
   */
  public PageUsuarioResponse listarUsingGET44(List<String> sort, Integer page, Integer limit, String nome, String cpf, String email, String status) throws ApiException {
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
   * Recuperar senha do usu\u00C3\u00A1rio na base do PIER ou WS.
   * Esse recurso permite recuperar a senha do usu\u00C3\u00A1rio.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Usu\u00C3\u00A1rio (id).
   * @return String
   */
  public String recuperarSenhaUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling recuperarSenhaUsingPOST");
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
   * Cadastra Usu\u00C3\u00A1rio na base.
   * Esse recurso permite cadastrar usu\u00C3\u00A1rios.
   * @param persist persist
   * @return UsuarioResponse
   */
  public UsuarioResponse salvarUsingPOST25(UsuarioPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST25");
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
   * Realiza login com valida\u00C3\u00A7\u00C3\u00A3o de senha dos usu\u00C3\u00A1rios cadastrados na base do PIER ou WS.
   * O recurso permite fazer login do usu\u00C3\u00A1rio atrav\u00C3\u00A9s da senha definida pelo emissor.
   * @param login Login identificador do usu\u00C3\u00A1rio (login).
   * @param senha Senha do usu\u00C3\u00A1rio
   * @return Object
   */
  public Object validarSenhaLoginUsingPOST(String login, String senha) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'login' is set
     if (login == null) {
        throw new ApiException(400, "Missing the required parameter 'login' when calling validarSenhaLoginUsingPOST");
     }
     
     // verify the required parameter 'senha' is set
     if (senha == null) {
        throw new ApiException(400, "Missing the required parameter 'senha' when calling validarSenhaLoginUsingPOST");
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
   * Validar a senha do usu\u00C3\u00A1rio na base do PIER ou WS.
   * Este m\u00C3\u00A9todo permite validar a senha do usu\u00C3\u00A1rio).
   * @param senha Senha do usu\u00C3\u00A1rio
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Usu\u00C3\u00A1rio (id).
   * @return String
   */
  public String validarSenhaUsingGET1(String senha, Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'senha' is set
     if (senha == null) {
        throw new ApiException(400, "Missing the required parameter 'senha' when calling validarSenhaUsingGET1");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling validarSenhaUsingGET1");
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
  
}

