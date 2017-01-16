package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.SMS;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class NotificacoesApi {
  private ApiClient apiClient;

  public NotificacoesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotificacoesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Atualizar SMS
   * Esse recurso permite atualizar o status do SMS do emissor
   * @param seuNum Seu n\u00C3\u00BAmero
   * @param status Status
   * @param data Data
   * @param textoStatus TextoStatus
   * @param operadora Operadora
   * @return SMS
   */
  public SMS atualizarSMSUsingPUT(String seuNum, String status, String data, String textoStatus, String operadora) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'seuNum' is set
     if (seuNum == null) {
        throw new ApiException(400, "Missing the required parameter 'seuNum' when calling atualizarSMSUsingPUT");
     }
     
     // verify the required parameter 'status' is set
     if (status == null) {
        throw new ApiException(400, "Missing the required parameter 'status' when calling atualizarSMSUsingPUT");
     }
     
     // verify the required parameter 'data' is set
     if (data == null) {
        throw new ApiException(400, "Missing the required parameter 'data' when calling atualizarSMSUsingPUT");
     }
     
     // verify the required parameter 'textoStatus' is set
     if (textoStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'textoStatus' when calling atualizarSMSUsingPUT");
     }
     
     // verify the required parameter 'operadora' is set
     if (operadora == null) {
        throw new ApiException(400, "Missing the required parameter 'operadora' when calling atualizarSMSUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/notificacoes/sms/atualizar-status".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "SeuNum", seuNum));
    
    queryParams.addAll(apiClient.parameterToPairs("", "Status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "Data", data));
    
    queryParams.addAll(apiClient.parameterToPairs("", "TextoStatus", textoStatus));
    
    queryParams.addAll(apiClient.parameterToPairs("", "Operadora", operadora));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<SMS> returnType = new GenericType<SMS>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Responder SMS
   * Esse recurso permite atualizar a resposta do SMS, fornecida pedo usu\u00C3\u00A1rio
   * @param seunum Seu n\u00C3\u00BAmero
   * @param data Data
   * @param textoSmsMo TextoStatus
   * @return SMS
   */
  public SMS responderSMSUsingPUT(String seunum, String data, String textoSmsMo) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'seunum' is set
     if (seunum == null) {
        throw new ApiException(400, "Missing the required parameter 'seunum' when calling responderSMSUsingPUT");
     }
     
     // verify the required parameter 'data' is set
     if (data == null) {
        throw new ApiException(400, "Missing the required parameter 'data' when calling responderSMSUsingPUT");
     }
     
     // verify the required parameter 'textoSmsMo' is set
     if (textoSmsMo == null) {
        throw new ApiException(400, "Missing the required parameter 'textoSmsMo' when calling responderSMSUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/notificacoes/sms/responder".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "Seunum", seunum));
    
    queryParams.addAll(apiClient.parameterToPairs("", "Data", data));
    
    queryParams.addAll(apiClient.parameterToPairs("", "TextoSmsMo", textoSmsMo));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<SMS> returnType = new GenericType<SMS>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

