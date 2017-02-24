package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.Base;
import br.com.conductor.pier.api.v2.model.BodyAccessToken;
import br.com.conductor.pier.api.v2.model.PageBases;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class BaseApi {
  private ApiClient apiClient;

  public BaseApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BaseApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Alterar base
   * Este recurso permite que seja modificado uma base j\u00C3\u00A1 cadastrada
   * @param id C\u00C3\u00B3digo identificador da base
   * @param servidor IP do servidor
   * @param usuario Nome do usu\u00C3\u00A1rio
   * @param senha Senha
   * @param nomeBase Nome da base
   * @param senhaCriptografada senha Criptografada
   * @param domain Dom\u00C3\u00ADnio da base
   * @param nomeBaseControleAcesso Nome da base de controle acesso
   * @param servidorControleAcesso Servidor do controle de acesso
   * @param idEmissor C\u00C3\u00B3digo do identificador do emissor
   * @return Base
   */
  public Base alterarUsingPUT(Long id, String servidor, String usuario, String senha, String nomeBase, Boolean senhaCriptografada, String domain, String nomeBaseControleAcesso, String servidorControleAcesso, Long idEmissor) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT");
     }
     
     // verify the required parameter 'servidor' is set
     if (servidor == null) {
        throw new ApiException(400, "Missing the required parameter 'servidor' when calling alterarUsingPUT");
     }
     
     // verify the required parameter 'usuario' is set
     if (usuario == null) {
        throw new ApiException(400, "Missing the required parameter 'usuario' when calling alterarUsingPUT");
     }
     
     // verify the required parameter 'senha' is set
     if (senha == null) {
        throw new ApiException(400, "Missing the required parameter 'senha' when calling alterarUsingPUT");
     }
     
     // verify the required parameter 'nomeBase' is set
     if (nomeBase == null) {
        throw new ApiException(400, "Missing the required parameter 'nomeBase' when calling alterarUsingPUT");
     }
     
     // verify the required parameter 'senhaCriptografada' is set
     if (senhaCriptografada == null) {
        throw new ApiException(400, "Missing the required parameter 'senhaCriptografada' when calling alterarUsingPUT");
     }
     
     // verify the required parameter 'domain' is set
     if (domain == null) {
        throw new ApiException(400, "Missing the required parameter 'domain' when calling alterarUsingPUT");
     }
     
     // verify the required parameter 'nomeBaseControleAcesso' is set
     if (nomeBaseControleAcesso == null) {
        throw new ApiException(400, "Missing the required parameter 'nomeBaseControleAcesso' when calling alterarUsingPUT");
     }
     
     // verify the required parameter 'servidorControleAcesso' is set
     if (servidorControleAcesso == null) {
        throw new ApiException(400, "Missing the required parameter 'servidorControleAcesso' when calling alterarUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/bases".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "servidor", servidor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "usuario", usuario));
    
    queryParams.addAll(apiClient.parameterToPairs("", "senha", senha));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeBase", nomeBase));
    
    queryParams.addAll(apiClient.parameterToPairs("", "senhaCriptografada", senhaCriptografada));
    
    queryParams.addAll(apiClient.parameterToPairs("", "domain", domain));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeBaseControleAcesso", nomeBaseControleAcesso));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEmissor", idEmissor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "servidorControleAcesso", servidorControleAcesso));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Base> returnType = new GenericType<Base>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Limpar mapa de bases
   * 
   * @return BodyAccessToken
   */
  public BodyAccessToken clearUsingGET() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/bases/clear".replaceAll("\\{format\\}","json");

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

    
    GenericType<BodyAccessToken> returnType = new GenericType<BodyAccessToken>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar base
   * Este recurso permite que seja consultada uma base do emissor atrav\u00C3\u00A9s de um id especifico
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da base (id).
   * @return Base
   */
  public Base consultarUsingGET1(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET1");
     }
     
    // create path and map variables
    String path = "/api/bases/{id}".replaceAll("\\{format\\}","json")
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

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Base> returnType = new GenericType<Base>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar bases
   * Este recurso permite que sejam listadas as bases existentes
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param id C\u00C3\u00B3digo identificador da base
   * @param servidor IP do servidor
   * @param usuario Nome do usu\u00C3\u00A1rio
   * @param senha Senha
   * @param nomeBase Nome da base
   * @param senhaCriptografada senha Criptografada
   * @param domain Dom\u00C3\u00ADnio da base
   * @param nomeBaseControleAcesso Nome da base de controle acesso
   * @param idEmissor C\u00C3\u00B3digo do identificador do emissor
   * @param servidorControleAcesso Servidor do controle de acesso
   * @return PageBases
   */
  public PageBases listarUsingGET1(Integer page, Integer limit, Long id, String servidor, String usuario, String senha, String nomeBase, Boolean senhaCriptografada, String domain, String nomeBaseControleAcesso, Long idEmissor, String servidorControleAcesso) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/bases".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "servidor", servidor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "usuario", usuario));
    
    queryParams.addAll(apiClient.parameterToPairs("", "senha", senha));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeBase", nomeBase));
    
    queryParams.addAll(apiClient.parameterToPairs("", "senhaCriptografada", senhaCriptografada));
    
    queryParams.addAll(apiClient.parameterToPairs("", "domain", domain));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeBaseControleAcesso", nomeBaseControleAcesso));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEmissor", idEmissor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "servidorControleAcesso", servidorControleAcesso));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageBases> returnType = new GenericType<PageBases>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Salvar base
   * Este recurso permite que seja adicionado uma nova base
   * @param servidor IP do servidor
   * @param usuario Nome do usu\u00C3\u00A1rio
   * @param senha Senha
   * @param nomeBase Nome da base
   * @param senhaCriptografada senha Criptografada
   * @param domain Dom\u00C3\u00ADnio da base
   * @param nomeBaseControleAcesso Nome da base de controle acesso
   * @param servidorControleAcesso Servidor do controle de acesso
   * @param idEmissor C\u00C3\u00B3digo do identificador do emissor
   * @return Base
   */
  public Base salvarUsingPOST1(String servidor, String usuario, String senha, String nomeBase, Boolean senhaCriptografada, String domain, String nomeBaseControleAcesso, String servidorControleAcesso, Long idEmissor) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'servidor' is set
     if (servidor == null) {
        throw new ApiException(400, "Missing the required parameter 'servidor' when calling salvarUsingPOST1");
     }
     
     // verify the required parameter 'usuario' is set
     if (usuario == null) {
        throw new ApiException(400, "Missing the required parameter 'usuario' when calling salvarUsingPOST1");
     }
     
     // verify the required parameter 'senha' is set
     if (senha == null) {
        throw new ApiException(400, "Missing the required parameter 'senha' when calling salvarUsingPOST1");
     }
     
     // verify the required parameter 'nomeBase' is set
     if (nomeBase == null) {
        throw new ApiException(400, "Missing the required parameter 'nomeBase' when calling salvarUsingPOST1");
     }
     
     // verify the required parameter 'senhaCriptografada' is set
     if (senhaCriptografada == null) {
        throw new ApiException(400, "Missing the required parameter 'senhaCriptografada' when calling salvarUsingPOST1");
     }
     
     // verify the required parameter 'domain' is set
     if (domain == null) {
        throw new ApiException(400, "Missing the required parameter 'domain' when calling salvarUsingPOST1");
     }
     
     // verify the required parameter 'nomeBaseControleAcesso' is set
     if (nomeBaseControleAcesso == null) {
        throw new ApiException(400, "Missing the required parameter 'nomeBaseControleAcesso' when calling salvarUsingPOST1");
     }
     
     // verify the required parameter 'servidorControleAcesso' is set
     if (servidorControleAcesso == null) {
        throw new ApiException(400, "Missing the required parameter 'servidorControleAcesso' when calling salvarUsingPOST1");
     }
     
    // create path and map variables
    String path = "/api/bases".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "servidor", servidor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "usuario", usuario));
    
    queryParams.addAll(apiClient.parameterToPairs("", "senha", senha));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeBase", nomeBase));
    
    queryParams.addAll(apiClient.parameterToPairs("", "senhaCriptografada", senhaCriptografada));
    
    queryParams.addAll(apiClient.parameterToPairs("", "domain", domain));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeBaseControleAcesso", nomeBaseControleAcesso));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEmissor", idEmissor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "servidorControleAcesso", servidorControleAcesso));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Base> returnType = new GenericType<Base>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

