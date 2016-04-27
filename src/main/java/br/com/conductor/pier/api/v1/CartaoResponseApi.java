package br.com.conductor.pier.api.v1;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v1.invoker.ApiException;
import br.com.conductor.pier.api.v1.invoker.ApiClient;
import br.com.conductor.pier.api.v1.invoker.Configuration;
import br.com.conductor.pier.api.v1.invoker.Pair;

import br.com.conductor.pier.api.v1.model.CancelarCartaoResponse;
import br.com.conductor.pier.api.v1.model.ConsultarCartaoResponse;
import br.com.conductor.pier.api.v1.model.ConsultarExtratoContaResponse;
import br.com.conductor.pier.api.v1.model.ConsultarSaldoLimitesResponse;
import br.com.conductor.pier.api.v1.model.DesbloquearCartaoResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class CartaoResponseApi {
  private ApiClient apiClient;

  public CartaoResponseApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CartaoResponseApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * /contas/{idConta}/cartoes/{idCartao}/cancelar
   * Cancelar um determinado cart\u00C3\u00A3o
   * @param idEmissor ID do Emissor
   * @param idConta ID da Conta
   * @param idCartao ID do Cart\u00C3\u00A3o que deseja cancelar
   * @param motivo Motivo do cancelamento
   * @param observacao Alguma observa\u00C3\u00A7\u00C3\u00A3o para o cancelamento
   * @return CancelarCartaoResponse
   */
  public CancelarCartaoResponse cancelarCartaoUsingPOST(Integer idEmissor, Integer idConta, Integer idCartao, Integer motivo, String observacao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idEmissor' is set
     if (idEmissor == null) {
        throw new ApiException(400, "Missing the required parameter 'idEmissor' when calling cancelarCartaoUsingPOST");
     }
     
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling cancelarCartaoUsingPOST");
     }
     
     // verify the required parameter 'idCartao' is set
     if (idCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idCartao' when calling cancelarCartaoUsingPOST");
     }
     
     // verify the required parameter 'motivo' is set
     if (motivo == null) {
        throw new ApiException(400, "Missing the required parameter 'motivo' when calling cancelarCartaoUsingPOST");
     }
     
     // verify the required parameter 'observacao' is set
     if (observacao == null) {
        throw new ApiException(400, "Missing the required parameter 'observacao' when calling cancelarCartaoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/v1/contas/{idConta}/cartoes/{idCartao}/cancelar".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idConta" + "\\}", apiClient.escapeString(idConta.toString()))
      .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "motivo", motivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "observacao", observacao));
    

    if (idEmissor != null)
      headerParams.put("idEmissor", apiClient.parameterToString(idEmissor));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "access_token" };

    
    GenericType<CancelarCartaoResponse> returnType = new GenericType<CancelarCartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * /contas/{idConta}/cartoes/{idCartao}
   * Consultar as informa\u00C3\u00A7\u00C3\u00B5es de um determinado cart\u00C3\u00A3o de uma conta
   * @param idEmissor ID do Emissor
   * @param idConta ID da Conta que pertence o cart\u00C3\u00A3o
   * @param idCartao ID do Cart\u00C3\u00A3o que deseja consultar
   * @param numeroCartao N\u00C3\u00BAmero do Cart\u00C3\u00A3o que deseja consultar (opcional)
   * @return ConsultarCartaoResponse
   */
  public ConsultarCartaoResponse consultarCartaoUsingGET(Integer idEmissor, Integer idConta, Integer idCartao, String numeroCartao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idEmissor' is set
     if (idEmissor == null) {
        throw new ApiException(400, "Missing the required parameter 'idEmissor' when calling consultarCartaoUsingGET");
     }
     
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarCartaoUsingGET");
     }
     
     // verify the required parameter 'idCartao' is set
     if (idCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idCartao' when calling consultarCartaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/v1/contas/{idConta}/cartoes/{idCartao}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idConta" + "\\}", apiClient.escapeString(idConta.toString()))
      .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (idEmissor != null)
      headerParams.put("idEmissor", apiClient.parameterToString(idEmissor));
    if (numeroCartao != null)
      headerParams.put("numeroCartao", apiClient.parameterToString(numeroCartao));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "access_token" };

    
    GenericType<ConsultarCartaoResponse> returnType = new GenericType<ConsultarCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * /contas/{idConta}/cartoes
   * Consultar todos os cart\u00C3\u00B5es de uma determinada conta
   * @param idEmissor ID do Emissor
   * @param idConta ID da Conta
   * @return ConsultarCartaoResponse
   */
  public ConsultarCartaoResponse consultarCartoesUsingGET(Integer idEmissor, Integer idConta) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idEmissor' is set
     if (idEmissor == null) {
        throw new ApiException(400, "Missing the required parameter 'idEmissor' when calling consultarCartoesUsingGET");
     }
     
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarCartoesUsingGET");
     }
     
    // create path and map variables
    String path = "/api/v1/contas/{idConta}/cartoes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idConta" + "\\}", apiClient.escapeString(idConta.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (idEmissor != null)
      headerParams.put("idEmissor", apiClient.parameterToString(idEmissor));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "access_token" };

    
    GenericType<ConsultarCartaoResponse> returnType = new GenericType<ConsultarCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * /contas/{idConta}/cartoes/{idCartao}/faturas
   * Consulte os extratos/faturas do cart\u00C3\u00A3o de uma determinada conta
   * @param idEmissor ID do Emissor
   * @param idConta ID da Conta
   * @param idCartao ID do Cart\u00C3\u00A3o que deseja consultar o extrato
   * @param dataVencimento Data limite para o vencimento das transa\u00C3\u00A7\u00C3\u00B5es
   * @return ConsultarExtratoContaResponse
   */
  public ConsultarExtratoContaResponse consultarExtratoFaturasUsingGET(Integer idEmissor, Integer idConta, Integer idCartao, String dataVencimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idEmissor' is set
     if (idEmissor == null) {
        throw new ApiException(400, "Missing the required parameter 'idEmissor' when calling consultarExtratoFaturasUsingGET");
     }
     
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarExtratoFaturasUsingGET");
     }
     
     // verify the required parameter 'idCartao' is set
     if (idCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idCartao' when calling consultarExtratoFaturasUsingGET");
     }
     
     // verify the required parameter 'dataVencimento' is set
     if (dataVencimento == null) {
        throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling consultarExtratoFaturasUsingGET");
     }
     
    // create path and map variables
    String path = "/api/v1/contas/{idConta}/cartoes/{idCartao}/faturas".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idConta" + "\\}", apiClient.escapeString(idConta.toString()))
      .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "dataVencimento", dataVencimento));
    

    if (idEmissor != null)
      headerParams.put("idEmissor", apiClient.parameterToString(idEmissor));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "access_token" };

    
    GenericType<ConsultarExtratoContaResponse> returnType = new GenericType<ConsultarExtratoContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * /contas/{idConta}/cartoes/{idCartao}/limites
   * Consulte os limites de um determinado cart\u00C3\u00A3o
   * @param idEmissor ID do Emissor
   * @param idConta ID da Conta
   * @param idCartao ID do Cart\u00C3\u00A3o que deseja consultar o saldo/limite
   * @return ConsultarSaldoLimitesResponse
   */
  public ConsultarSaldoLimitesResponse consultarSaldosLimitesUsingGET(Integer idEmissor, Integer idConta, Integer idCartao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idEmissor' is set
     if (idEmissor == null) {
        throw new ApiException(400, "Missing the required parameter 'idEmissor' when calling consultarSaldosLimitesUsingGET");
     }
     
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarSaldosLimitesUsingGET");
     }
     
     // verify the required parameter 'idCartao' is set
     if (idCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idCartao' when calling consultarSaldosLimitesUsingGET");
     }
     
    // create path and map variables
    String path = "/api/v1/contas/{idConta}/cartoes/{idCartao}/limites".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idConta" + "\\}", apiClient.escapeString(idConta.toString()))
      .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (idEmissor != null)
      headerParams.put("idEmissor", apiClient.parameterToString(idEmissor));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "access_token" };

    
    GenericType<ConsultarSaldoLimitesResponse> returnType = new GenericType<ConsultarSaldoLimitesResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * /contas/{idConta}/cartoes/{idCartao}/desbloquear
   * Desbloquear cart\u00C3\u00A3o de uma determinada conta
   * @param idEmissor ID do Emissor
   * @param idConta ID da Conta
   * @param idCartao ID do Cart\u00C3\u00A3o que deseja consultar o saldo/limite
   * @param codigoSegurancao C\u00C3\u00B3digo seguran\u00C3\u00A7a do cart\u00C3\u00A3o
   * @return DesbloquearCartaoResponse
   */
  public DesbloquearCartaoResponse desbloquearCartaoUsingPOST(Integer idEmissor, Integer idConta, Integer idCartao, String codigoSegurancao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idEmissor' is set
     if (idEmissor == null) {
        throw new ApiException(400, "Missing the required parameter 'idEmissor' when calling desbloquearCartaoUsingPOST");
     }
     
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling desbloquearCartaoUsingPOST");
     }
     
     // verify the required parameter 'idCartao' is set
     if (idCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idCartao' when calling desbloquearCartaoUsingPOST");
     }
     
     // verify the required parameter 'codigoSegurancao' is set
     if (codigoSegurancao == null) {
        throw new ApiException(400, "Missing the required parameter 'codigoSegurancao' when calling desbloquearCartaoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/v1/contas/{idConta}/cartoes/{idCartao}/desbloquear".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idConta" + "\\}", apiClient.escapeString(idConta.toString()))
      .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (idEmissor != null)
      headerParams.put("idEmissor", apiClient.parameterToString(idEmissor));
    if (codigoSegurancao != null)
      headerParams.put("codigoSegurancao", apiClient.parameterToString(codigoSegurancao));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "access_token" };

    
    GenericType<DesbloquearCartaoResponse> returnType = new GenericType<DesbloquearCartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

