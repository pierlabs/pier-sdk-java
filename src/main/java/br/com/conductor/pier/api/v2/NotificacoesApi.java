package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.SMS;
import br.com.conductor.pier.api.v2.model.PagePush;
import java.util.Date;
import br.com.conductor.pier.api.v2.model.PageSMS;
import br.com.conductor.pier.api.v2.model.NotificacaoSMSResponse;
import br.com.conductor.pier.api.v2.model.PushFCMEGCM;
import br.com.conductor.pier.api.v2.model.PushAPNS;
import br.com.conductor.pier.api.v2.model.NotificacaoSMSBody;



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
   * @param nsu Seu n\u00C3\u00BAmero
   * @param status Status
   * @param data Data
   * @param textoStatus TextoStatus
   * @param operadora Operadora
   * @return SMS
   */
  public SMS atualizarSMSUsingPOST(String nsu, String status, String data, String textoStatus, String operadora) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/notificacoes/sms/atualizar-status".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "nsu", nsu));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data", data));
    
    queryParams.addAll(apiClient.parameterToPairs("", "texto_status", textoStatus));
    
    queryParams.addAll(apiClient.parameterToPairs("", "operadora", operadora));
    

    

    

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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar Push
   * Esse recurso permite listar os Pushes do emissor
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param dataEnvio Apresenta a data e em que o registro foi enviado para o dispositivo.
   * @param tipoEvento Nome do tipoEvento da notifica\u00C3\u00A7\u00C3\u00A3o
   * @param status Status de envio da notifica\u00C3\u00A7\u00C3\u00A3o
   * @param plataforma Plataforma de Push notifications.
   * @param protocolo N\u00C3\u00BAmero do protocolo de envio de notifica\u00C3\u00A7\u00C3\u00B5es
   * @return PagePush
   */
  public PagePush listarPushUsingGET(Integer page, Integer limit, Date dataEnvio, String tipoEvento, String status, String plataforma, String protocolo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/notificacoes/push".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataEnvio", dataEnvio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoEvento", tipoEvento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "plataforma", plataforma));
    
    queryParams.addAll(apiClient.parameterToPairs("", "protocolo", protocolo));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PagePush> returnType = new GenericType<PagePush>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar SMS
   * Esse recurso permite listar os SMS do emissor
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param dataInclusao Apresenta a data e em que o registro foi inclu\u00C3\u00ADdo na base para ser enviado
   * @param tipoEvento Nome do tipoEvento da notifica\u00C3\u00A7\u00C3\u00A3o
   * @param status Status de envio da notifica\u00C3\u00A7\u00C3\u00A3o
   * @param operadora Nome da operadora a qual a notifica\u00C3\u00A7\u00C3\u00A3o foi enviada.
   * @param protocolo N\u00C3\u00BAmero do protocolo de envio de notifica\u00C3\u00A7\u00C3\u00B5es
   * @return PageSMS
   */
  public PageSMS listarSMSUsingGET(Integer page, Integer limit, Date dataInclusao, String tipoEvento, String status, String operadora, String protocolo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/notificacoes/sms".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataInclusao", dataInclusao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoEvento", tipoEvento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "operadora", operadora));
    
    queryParams.addAll(apiClient.parameterToPairs("", "protocolo", protocolo));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageSMS> returnType = new GenericType<PageSMS>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Responder SMS
   * Esse recurso permite atualizar a resposta do SMS, fornecida pedo usu\u00C3\u00A1rio
   * @param nsu Seu n\u00C3\u00BAmero
   * @param data Data
   * @param resposta TextoStatus
   * @return SMS
   */
  public SMS responderSMSUsingPOST(String nsu, String data, String resposta) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/notificacoes/sms/responder".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "nsu", nsu));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data", data));
    
    queryParams.addAll(apiClient.parameterToPairs("", "resposta", resposta));
    

    

    

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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Enviar Push FCM
   * Esse recurso permite enviar Push para um determinado dipositivo movel atrav\u00C3\u00A9s da plataforma FCM (Firebase Cloud Messaging).
   * @param pushPersists pushPersists
   * @return NotificacaoSMSResponse
   */
  public NotificacaoSMSResponse salvarPushFCMUsingPOST(List<PushFCMEGCM> pushPersists) throws ApiException {
    Object postBody = pushPersists;
    
     // verify the required parameter 'pushPersists' is set
     if (pushPersists == null) {
        throw new ApiException(400, "Missing the required parameter 'pushPersists' when calling salvarPushFCMUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/notificacoes/push/fcm".replaceAll("\\{format\\}","json");

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

    
    GenericType<NotificacaoSMSResponse> returnType = new GenericType<NotificacaoSMSResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Enviar Push GCM
   * Esse recurso permite enviar Push para um determinado dipositivo movel atrav\u00C3\u00A9s da plataforma GCM (Google Cloud Messaging).
   * @param pushPersists pushPersists
   * @return NotificacaoSMSResponse
   */
  public NotificacaoSMSResponse salvarPushGCMUsingPOST(List<PushFCMEGCM> pushPersists) throws ApiException {
    Object postBody = pushPersists;
    
     // verify the required parameter 'pushPersists' is set
     if (pushPersists == null) {
        throw new ApiException(400, "Missing the required parameter 'pushPersists' when calling salvarPushGCMUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/notificacoes/push/gcm".replaceAll("\\{format\\}","json");

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

    
    GenericType<NotificacaoSMSResponse> returnType = new GenericType<NotificacaoSMSResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Enviar Push APNS
   * Esse recurso permite enviar Push para um determinado dipositivo movel atrav\u00C3\u00A9s da plataforma APNS (Apple Push Notification Service).
   * @param pushPersists pushPersists
   * @return NotificacaoSMSResponse
   */
  public NotificacaoSMSResponse salvarPushUsingPOST(List<PushAPNS> pushPersists) throws ApiException {
    Object postBody = pushPersists;
    
     // verify the required parameter 'pushPersists' is set
     if (pushPersists == null) {
        throw new ApiException(400, "Missing the required parameter 'pushPersists' when calling salvarPushUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/notificacoes/push/apns".replaceAll("\\{format\\}","json");

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

    
    GenericType<NotificacaoSMSResponse> returnType = new GenericType<NotificacaoSMSResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Enviar SMS
   * Esse recurso permite enviar uma lista de SMS.
   * @param listaSMS listaSMS
   * @return NotificacaoSMSResponse
   */
  public NotificacaoSMSResponse salvarSMSUsingPOST(List<NotificacaoSMSBody> listaSMS) throws ApiException {
    Object postBody = listaSMS;
    
     // verify the required parameter 'listaSMS' is set
     if (listaSMS == null) {
        throw new ApiException(400, "Missing the required parameter 'listaSMS' when calling salvarSMSUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/notificacoes/sms".replaceAll("\\{format\\}","json");

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

    
    GenericType<NotificacaoSMSResponse> returnType = new GenericType<NotificacaoSMSResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

