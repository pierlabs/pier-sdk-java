package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.CartaoPayAtualizarChaveResponse;
import br.com.conductor.pier.api.v2.model.CartaoPayUpdate;
import br.com.conductor.pier.api.v2.model.CartaoPayResponse;
import br.com.conductor.pier.api.v2.model.CartaoPayConfirmarChaveResponse;
import br.com.conductor.pier.api.v2.model.CartaoPayKeyUpdate;
import br.com.conductor.pier.api.v2.model.CartaoPayDetalheResponse;
import br.com.conductor.pier.api.v2.model.PageCartaoPayResponse;
import br.com.conductor.pier.api.v2.model.CartaoPayCadastroResponse;
import br.com.conductor.pier.api.v2.model.CartaoPayPersist;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class ConductorPayApi {
  private ApiClient apiClient;

  public ConductorPayApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConductorPayApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Atualiza a chave de gera\u00C3\u00A7\u00C3\u00A3o de transa\u00C3\u00A7\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite atualizar a chave de gera\u00C3\u00A7\u00C3\u00A3o de transa\u00C3\u00A7\u00C3\u00A3o de um dispositivo a partir do seu identificador (id).
   * @param deviceId Device id criptografado
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o (id).
   * @return CartaoPayAtualizarChaveResponse
   */
  public CartaoPayAtualizarChaveResponse atualizarChaveUsingPOST(String deviceId, Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'deviceId' is set
     if (deviceId == null) {
        throw new ApiException(400, "Missing the required parameter 'deviceId' when calling atualizarChaveUsingPOST");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarChaveUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/cartoes-tokenizados/{id}/atualizar-chave".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (deviceId != null)
      headerParams.put("device_id", apiClient.parameterToString(deviceId));
    

    

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

    
    GenericType<CartaoPayAtualizarChaveResponse> returnType = new GenericType<CartaoPayAtualizarChaveResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Atualiza os dados do cart\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite atualizar os dados do cart\u00C3\u00A3o tokenizados de um dispositivo a partir do seu identificador (id).
   * @param deviceId Device id criptografado
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o (id).
   * @param update update
   * @return CartaoPayResponse
   */
  public CartaoPayResponse atualizarUsingPUT(String deviceId, Long id, CartaoPayUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'deviceId' is set
     if (deviceId == null) {
        throw new ApiException(400, "Missing the required parameter 'deviceId' when calling atualizarUsingPUT");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarUsingPUT");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling atualizarUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/cartoes-tokenizados/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (deviceId != null)
      headerParams.put("device_id", apiClient.parameterToString(deviceId));
    

    

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

    
    GenericType<CartaoPayResponse> returnType = new GenericType<CartaoPayResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Confirma a atualiza\u00C3\u00A7\u00C3\u00A3o da chave de transa\u00C3\u00A7\u00C3\u00A3o
   * Este met\u00C3\u00B3do recebe confirma\u00C3\u00A7\u00C3\u00A3o de atualiza\u00C3\u00A7\u00C3\u00A3o de chave transa\u00C3\u00A7\u00C3\u00A3o.
   * @param deviceId Device id criptografado
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o (id).
   * @param update update
   * @return CartaoPayConfirmarChaveResponse
   */
  public CartaoPayConfirmarChaveResponse confirmaAtualizacaoChaveUsingPOST(String deviceId, Long id, CartaoPayKeyUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'deviceId' is set
     if (deviceId == null) {
        throw new ApiException(400, "Missing the required parameter 'deviceId' when calling confirmaAtualizacaoChaveUsingPOST");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling confirmaAtualizacaoChaveUsingPOST");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling confirmaAtualizacaoChaveUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/cartoes-tokenizados/{id}/confirmar-chave".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (deviceId != null)
      headerParams.put("device_id", apiClient.parameterToString(deviceId));
    

    

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

    
    GenericType<CartaoPayConfirmarChaveResponse> returnType = new GenericType<CartaoPayConfirmarChaveResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado cart\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite consultar as informa\u00C3\u00A7\u00C3\u00B5es de um determinado cart\u00C3\u00A3o a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param deviceId Device id criptografado
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o (id).
   * @return CartaoPayDetalheResponse
   */
  public CartaoPayDetalheResponse consultarUsingGET6(String deviceId, Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'deviceId' is set
     if (deviceId == null) {
        throw new ApiException(400, "Missing the required parameter 'deviceId' when calling consultarUsingGET6");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET6");
     }
     
    // create path and map variables
    String path = "/api/cartoes-tokenizados/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (deviceId != null)
      headerParams.put("device_id", apiClient.parameterToString(deviceId));
    

    

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

    
    GenericType<CartaoPayDetalheResponse> returnType = new GenericType<CartaoPayDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os c\u00C3\u00B3digos de resposta dos recursos de transa\u00C3\u00A7\u00C3\u00A3o e consulta de conta
   * Este m\u00C3\u00A9todo retorna a lista dos c\u00C3\u00B3digos de resposta das transa\u00C3\u00A7\u00C3\u00B5es e consulta de saque realizada no Pay.
   * @return List<Object>
   */
  public List<Object> listarCodigosRespostaUsingGET() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/codigos-resposta".replaceAll("\\{format\\}","json");

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
   * Lista os modos entradas
   * Este recurso permite listar os modos de entrada para transa\u00C3\u00A7\u00C3\u00A3o
   * @return List<Object>
   */
  public List<Object> listarModosEntradaUsingGET() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/modos-entrada".replaceAll("\\{format\\}","json");

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
   * Lista as opera\u00C3\u00A7\u00C3\u00B5es
   * Este recurso permite listar as opera\u00C3\u00A7\u00C3\u00B5es disponiveis de transa\u00C3\u00A7\u00C3\u00A3o
   * @return List<Object>
   */
  public List<Object> listarOperacoesUsingGET() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/operacoes".replaceAll("\\{format\\}","json");

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
   * Lista os tipos de terminais
   * Este m\u00C3\u00A9todo retorna a lista dos tipos de terminais.
   * @return List<Object>
   */
  public List<Object> listarTiposTerminaisUsingGET() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-terminais".replaceAll("\\{format\\}","json");

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
   * Lista os tipos de transa\u00C3\u00A7\u00C3\u00B5es
   * Este m\u00C3\u00A9todo retorna a lista dos tipos de transa\u00C3\u00A7\u00C3\u00B5es realizadas no Pay.
   * @return List<Object>
   */
  public List<Object> listarTiposTransacoesUsingGET() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-transacoes".replaceAll("\\{format\\}","json");

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
   * Lista os cart\u00C3\u00B5es cadastrados
   * Este m\u00C3\u00A9todo permite listar os cart\u00C3\u00B5es cadastrado em um dispositivo.
   * @param deviceId Device id criptografado
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param status Status do cart\u00C3\u00A3o tokenizado
   * @param numeroCartao Numero do cart\u00C3\u00A3o tokenizado
   * @return PageCartaoPayResponse
   */
  public PageCartaoPayResponse listarUsingGET6(String deviceId, List<String> sort, Integer page, Integer limit, String status, String numeroCartao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/cartoes-tokenizados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroCartao", numeroCartao));
    

    if (deviceId != null)
      headerParams.put("device_id", apiClient.parameterToString(deviceId));
    

    

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

    
    GenericType<PageCartaoPayResponse> returnType = new GenericType<PageCartaoPayResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cria\u00C3\u00A7\u00C3\u00A3o de cart\u00C3\u00A3o
   * Este met\u00C3\u00B3do permite a tokeniza\u00C3\u00A7\u00C3\u00A3o de um cart\u00C3\u00A3o a partir dos seus dados impressos.
   * @param deviceId Device id criptografado
   * @param persist persist
   * @return CartaoPayCadastroResponse
   */
  public CartaoPayCadastroResponse salvarUsingPOST5(String deviceId, CartaoPayPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'deviceId' is set
     if (deviceId == null) {
        throw new ApiException(400, "Missing the required parameter 'deviceId' when calling salvarUsingPOST5");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST5");
     }
     
    // create path and map variables
    String path = "/api/cartoes-tokenizados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (deviceId != null)
      headerParams.put("device_id", apiClient.parameterToString(deviceId));
    

    

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

    
    GenericType<CartaoPayCadastroResponse> returnType = new GenericType<CartaoPayCadastroResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

