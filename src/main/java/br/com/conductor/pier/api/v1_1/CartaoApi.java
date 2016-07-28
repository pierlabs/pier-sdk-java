package br.com.conductor.pier.api.v1_1;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v1_1.invoker.ApiException;
import br.com.conductor.pier.api.v1_1.invoker.ApiClient;
import br.com.conductor.pier.api.v1_1.invoker.Configuration;
import br.com.conductor.pier.api.v1_1.invoker.Pair;

import br.com.conductor.pier.api.v1_1.model.CancelarCartaoResponse;
import br.com.conductor.pier.api.v1_1.model.ConsultarCartaoResponse;
import br.com.conductor.pier.api.v1_1.model.DesbloquearCartaoResponse;
import br.com.conductor.pier.api.v1_1.model.EmbossadoCartaoResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class CartaoApi {
  private ApiClient apiClient;

  public CartaoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CartaoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Bloqueia um cart\u00C3\u00A3o
   * Bloquear um determinado cart\u00C3\u00A3o
   * @param idConta ID da Conta
   * @param idCartao ID do Cart\u00C3\u00A3o que deseja cancelar
   * @param motivo Motivo do bloqueio
   * @param observacao Alguma observa\u00C3\u00A7\u00C3\u00A3o para o bloqueio
   * @return CancelarCartaoResponse
   */
  public CancelarCartaoResponse bloquearCartaoUsingPOST(Integer idConta, Integer idCartao, Integer motivo, String observacao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling bloquearCartaoUsingPOST");
     }
     
     // verify the required parameter 'idCartao' is set
     if (idCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idCartao' when calling bloquearCartaoUsingPOST");
     }
     
     // verify the required parameter 'motivo' is set
     if (motivo == null) {
        throw new ApiException(400, "Missing the required parameter 'motivo' when calling bloquearCartaoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/contas/{idConta}/cartoes/{idCartao}/bloquear".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idConta" + "\\}", apiClient.escapeString(idConta.toString()))
      .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "motivo", motivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "observacao", observacao));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<CancelarCartaoResponse> returnType = new GenericType<CancelarCartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Retorna um cart\u00C3\u00A3o
   * Consultar as informa\u00C3\u00A7\u00C3\u00B5es de um determinado cart\u00C3\u00A3o de uma conta
   * @param idConta ID da Conta que pertence o cart\u00C3\u00A3o
   * @param idCartao ID do Cart\u00C3\u00A3o que deseja consultar
   * @param numeroCartao N\u00C3\u00BAmero do Cart\u00C3\u00A3o que deseja consultar (opcional)
   * @return ConsultarCartaoResponse
   */
  public ConsultarCartaoResponse consultarCartaoUsingGET(Integer idConta, Integer idCartao, String numeroCartao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarCartaoUsingGET");
     }
     
     // verify the required parameter 'idCartao' is set
     if (idCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idCartao' when calling consultarCartaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{idConta}/cartoes/{idCartao}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idConta" + "\\}", apiClient.escapeString(idConta.toString()))
      .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

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

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<ConsultarCartaoResponse> returnType = new GenericType<ConsultarCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Retorna todos os cart\u00C3\u00B5es
   * Consultar todos os cart\u00C3\u00B5es de uma determinada conta
   * @param idConta ID da Conta
   * @return ConsultarCartaoResponse
   */
  public ConsultarCartaoResponse consultarCartoesUsingGET(Integer idConta) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarCartoesUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{idConta}/cartoes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idConta" + "\\}", apiClient.escapeString(idConta.toString()));

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

    
    GenericType<ConsultarCartaoResponse> returnType = new GenericType<ConsultarCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Desbloqueia um cart\u00C3\u00A3o
   * Desbloquear cart\u00C3\u00A3o de uma determinada conta
   * @param idConta ID da Conta
   * @param idCartao ID do Cart\u00C3\u00A3o que deseja consultar o saldo/limite
   * @param codigoSegurancao C\u00C3\u00B3digo seguran\u00C3\u00A7a do cart\u00C3\u00A3o
   * @return DesbloquearCartaoResponse
   */
  public DesbloquearCartaoResponse desbloquearCartaoUsingPOST(Integer idConta, Integer idCartao, String codigoSegurancao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling desbloquearCartaoUsingPOST");
     }
     
     // verify the required parameter 'idCartao' is set
     if (idCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idCartao' when calling desbloquearCartaoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/contas/{idConta}/cartoes/{idCartao}/desbloquear".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idConta" + "\\}", apiClient.escapeString(idConta.toString()))
      .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

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

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<DesbloquearCartaoResponse> returnType = new GenericType<DesbloquearCartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Embossado
   * N\u00C3\u00B3s informe caso tenha embossado algum cart\u00C3\u00A3o.
   * @param idConta ID da Conta
   * @param idCartao ID do Cart\u00C3\u00A3o que deseja cancelar
   * @return EmbossadoCartaoResponse
   */
  public EmbossadoCartaoResponse embossadoCartaoUsingPUT(Integer idConta, Integer idCartao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling embossadoCartaoUsingPUT");
     }
     
     // verify the required parameter 'idCartao' is set
     if (idCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idCartao' when calling embossadoCartaoUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/contas/{idConta}/cartoes/{idCartao}/embossado".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idConta" + "\\}", apiClient.escapeString(idConta.toString()))
      .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

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

    
    GenericType<EmbossadoCartaoResponse> returnType = new GenericType<EmbossadoCartaoResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

