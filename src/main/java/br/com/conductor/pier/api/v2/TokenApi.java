package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.Token;
import br.com.conductor.pier.api.v2.model.BodyAccessToken;
import br.com.conductor.pier.api.v2.model.PageBases;
import java.util.Date;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class TokenApi {
  private ApiClient apiClient;

  public TokenApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TokenApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Alterar token
   * Este recurso permite que seja modificado um token j\u00C3\u00A1 cadastrado
   * @param id C\u00C3\u00B3digo identificador do token
   * @param token Token
   * @param base C\u00C3\u00B3digo identificador da base
   * @param owner Owner do token
   * @param status Status do token
   * @param criadoPor Descri\u00C3\u00A7\u00C3\u00A3o de quem criou o token
   * @param alteradoPor Descri\u00C3\u00A7\u00C3\u00A3o de quem alterou o token
   * @return Token
   */
  public Token alterarUsingPUT5(Long id, String token, Long base, String owner, String status, String criadoPor, String alteradoPor) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT5");
     }
     
    // create path and map variables
    String path = "/api/tokens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "token", token));
    
    queryParams.addAll(apiClient.parameterToPairs("", "base", base));
    
    queryParams.addAll(apiClient.parameterToPairs("", "owner", owner));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "criadoPor", criadoPor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "alteradoPor", alteradoPor));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Token> returnType = new GenericType<Token>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * /api/tokens/callback
   * 
   * @param bodyAccessToken bodyAccessToken
   * @return BodyAccessToken
   */
  public BodyAccessToken callbackUsingPOST(BodyAccessToken bodyAccessToken) throws ApiException {
    Object postBody = bodyAccessToken;
    
     // verify the required parameter 'bodyAccessToken' is set
     if (bodyAccessToken == null) {
        throw new ApiException(400, "Missing the required parameter 'bodyAccessToken' when calling callbackUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/tokens/callback".replaceAll("\\{format\\}","json");

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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar token
   * Este recurso permite que seja consultado um token do emissor atrav\u00C3\u00A9s de um id especifico
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do token (id).
   * @return Token
   */
  public Token consultarUsingGET14(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET14");
     }
     
    // create path and map variables
    String path = "/api/tokens/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<Token> returnType = new GenericType<Token>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar tokens
   * Este recurso permite que sejam listados os tokens existentes
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param id C\u00C3\u00B3digo identificador do token
   * @param token Token
   * @param base C\u00C3\u00B3digo identificador da base
   * @param owner Owner do token
   * @param status Status do token
   * @param criadoPor Descri\u00C3\u00A7\u00C3\u00A3o de quem criou o token
   * @param dataCriacao Data de cria\u00C3\u00A7\u00C3\u00A3o do token
   * @param alteradoPor Descri\u00C3\u00A7\u00C3\u00A3o de quem alterou o token
   * @param dataModificacao Data de modifica\u00C3\u00A7\u00C3\u00A3o do token
   * @return PageBases
   */
  public PageBases listarUsingGET14(Integer page, Integer limit, Long id, String token, Long base, String owner, String status, String criadoPor, Date dataCriacao, String alteradoPor, Date dataModificacao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tokens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "token", token));
    
    queryParams.addAll(apiClient.parameterToPairs("", "base", base));
    
    queryParams.addAll(apiClient.parameterToPairs("", "owner", owner));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "criadoPor", criadoPor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCriacao", dataCriacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "alteradoPor", alteradoPor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataModificacao", dataModificacao));
    

    

    

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
   * Salvar token
   * Este recurso permite que seja adicionado um novo token
   * @param token Token
   * @param base C\u00C3\u00B3digo identificador da base
   * @param owner Owner do token
   * @param status Status do token
   * @param criadoPor Descri\u00C3\u00A7\u00C3\u00A3o de quem criou o token
   * @param alteradoPor Descri\u00C3\u00A7\u00C3\u00A3o de quem alterou o token
   * @return Token
   */
  public Token salvarUsingPOST5(String token, Long base, String owner, String status, String criadoPor, String alteradoPor) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tokens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "token", token));
    
    queryParams.addAll(apiClient.parameterToPairs("", "base", base));
    
    queryParams.addAll(apiClient.parameterToPairs("", "owner", owner));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "criadoPor", criadoPor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "alteradoPor", alteradoPor));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Token> returnType = new GenericType<Token>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * /api/tokens/validar
   * 
   * @param bodyAccessToken bodyAccessToken
   * @return Object
   */
  public Object validarUsingPOST(BodyAccessToken bodyAccessToken) throws ApiException {
    Object postBody = bodyAccessToken;
    
     // verify the required parameter 'bodyAccessToken' is set
     if (bodyAccessToken == null) {
        throw new ApiException(400, "Missing the required parameter 'bodyAccessToken' when calling validarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/tokens/validar".replaceAll("\\{format\\}","json");

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

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

