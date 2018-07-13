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

public class GlobaltagpayApi {
  private ApiClient apiClient;

  public GlobaltagpayApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagpayApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{cartao_pay_resource_atualizar_chave}}}
   * {{{cartao_pay_resource_atualizar_chave_notes}}}
   * @param deviceId {{{cartao_pay_resource_atualizar_chave_param_device_id}}}
   * @param id {{{cartao_pay_resource_atualizar_chave_param_id}}}
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
   * {{{cartao_pay_resource_atualizar}}}
   * {{{cartao_pay_resource_atualizar_notes}}}
   * @param deviceId {{{cartao_pay_resource_atualizar_param_device_id}}}
   * @param id {{{cartao_pay_resource_atualizar_param_id}}}
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
   * {{{cartao_pay_resource_confirma_atualizacao_chave}}}
   * {{{cartao_pay_resource_confirma_atualizacao_chave_notes}}}
   * @param deviceId {{{cartao_pay_resource_confirma_atualizacao_chave_param_device_id}}}
   * @param id {{{cartao_pay_resource_confirma_atualizacao_chave_param_id}}}
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
   * {{{cartao_pay_resource_consultar}}}
   * {{{cartao_pay_resource_consultar_notes}}}
   * @param deviceId {{{cartao_pay_resource_consultar_param_device_id}}}
   * @param id {{{cartao_pay_resource_consultar_param_id}}}
   * @return CartaoPayDetalheResponse
   */
  public CartaoPayDetalheResponse consultarUsingGET9(String deviceId, Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'deviceId' is set
     if (deviceId == null) {
        throw new ApiException(400, "Missing the required parameter 'deviceId' when calling consultarUsingGET9");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET9");
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
   * {{{enum_pay_resource_listar_codigos_resposta}}}
   * {{{enum_pay_resource_listar_codigos_resposta_notes}}}
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
   * {{{enum_pay_resource_listar_modos_entrada}}}
   * {{{enum_pay_resource_listar_modos_entrada_notes}}}
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
   * {{{enum_pay_resource_listar_operacoes}}}
   * {{{enum_pay_resource_listar_operacoes_notes}}}
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
   * {{{enum_pay_resource_listar_tipos_terminais}}}
   * {{{enum_pay_resource_listar_tipos_terminais_notes}}}
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
   * {{{enum_pay_resource_listar_tipos_transacoes}}}
   * {{{enum_pay_resource_listar_tipos_transacoes_notes}}}
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
   * {{{cartao_pay_resource_listar}}}
   * {{{cartao_pay_resource_listar_notes}}}
   * @param deviceId {{{cartao_pay_resource_listar_param_device_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param status {{{cartao_pay_request_status_value}}}
   * @param numeroCartao {{{cartao_pay_request_numero_cartao_value}}}
   * @return PageCartaoPayResponse
   */
  public PageCartaoPayResponse listarUsingGET10(String deviceId, List<String> sort, Integer page, Integer limit, String status, String numeroCartao) throws ApiException {
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
   * {{{cartao_pay_resource_salvar}}}
   * {{{cartao_pay_resource_salvar_notes}}}
   * @param deviceId {{{cartao_pay_resource_salvar_param_device_id}}}
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

