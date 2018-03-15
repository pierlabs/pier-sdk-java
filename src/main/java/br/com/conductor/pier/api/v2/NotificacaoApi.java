package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.ConfiguracaoEmailResponse;
import br.com.conductor.pier.api.v2.model.ConfiguracaoEmailPersist;
import br.com.conductor.pier.api.v2.model.TemplateNotificacaoDetalheResponse;
import br.com.conductor.pier.api.v2.model.NotificacaoSMSResponse;
import br.com.conductor.pier.api.v2.model.CodigoSegurancaResponse;
import br.com.conductor.pier.api.v2.model.CodigoSegurancaSMSPersist;
import br.com.conductor.pier.api.v2.model.PageConfiguracaoEmailResponse;
import br.com.conductor.pier.api.v2.model.PageCodigoSegurancaResponse;
import br.com.conductor.pier.api.v2.model.PagePushResponse;
import br.com.conductor.pier.api.v2.model.PageSMSResponse;
import br.com.conductor.pier.api.v2.model.PageTemplateNotificacaoResponse;
import br.com.conductor.pier.api.v2.model.NotificacaoEmailRequest;
import br.com.conductor.pier.api.v2.model.NotificacaoResponse;
import br.com.conductor.pier.api.v2.model.PushFCMEGCM;
import br.com.conductor.pier.api.v2.model.PushAPNS;
import br.com.conductor.pier.api.v2.model.NotificacaoSMSBody;
import br.com.conductor.pier.api.v2.model.CodigoSegurancaEMAILPersist;
import br.com.conductor.pier.api.v2.model.CodigoSegurancaSMSRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class NotificacaoApi {
  private ApiClient apiClient;

  public NotificacaoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotificacaoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Altera configura\u00E7\u00F5es de E-mail
   * Esse recurso permite salvar altera\u00E7\u00F5es de configura\u00E7\u00F5es de E-mail.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da configura\u00E7\u00E3o de e-mail.
   * @param persist persist
   * @return ConfiguracaoEmailResponse
   */
  public ConfiguracaoEmailResponse alterarConfiguracaoUsingPUT(Long id, ConfiguracaoEmailPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarConfiguracaoUsingPUT");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling alterarConfiguracaoUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/configuracoes-email/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ConfiguracaoEmailResponse> returnType = new GenericType<ConfiguracaoEmailResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Alterar template de notifica\u00E7\u00E3o
   * Esse recurso permite salvar altera\u00E7\u00F5es de templates notifica\u00E7\u00F5es.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do layout de e-mail.
   * @param conteudo Template HTML
   * @param idConfiguracaoEmail C\u00F3digo de identifica\u00E7\u00E3o da configra\u00E7\u00E3o de EMAIL.
   * @param tipoLayout Tipo do layout.
   * @param tipoNotificacao Tipo da notifica\u00E7\u00E3o.
   * @param remetente Remetente
   * @param assunto Assunto da Notificaca\u00E7\u00E3o.
   * @param templatePadrao Template Padr\u00E3o.
   * @return TemplateNotificacaoDetalheResponse
   */
  public TemplateNotificacaoDetalheResponse alterarTemplateNotificacaoUsingPUT(Long id, String conteudo, Long idConfiguracaoEmail, String tipoLayout, String tipoNotificacao, String remetente, String assunto, Boolean templatePadrao) throws ApiException {
    Object postBody = conteudo;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTemplateNotificacaoUsingPUT");
     }
     
     // verify the required parameter 'conteudo' is set
     if (conteudo == null) {
        throw new ApiException(400, "Missing the required parameter 'conteudo' when calling alterarTemplateNotificacaoUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/templates-notificacoes/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConfiguracaoEmail", idConfiguracaoEmail));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoLayout", tipoLayout));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoNotificacao", tipoNotificacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "remetente", remetente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "assunto", assunto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "templatePadrao", templatePadrao));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "text/plain"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<TemplateNotificacaoDetalheResponse> returnType = new GenericType<TemplateNotificacaoDetalheResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Atualizar SMS
   * Esse recurso permite atualizar o status do SMS do emissor
   * @param nsu Seu n\u00FAmero
   * @param status Status
   * @param data Data
   * @param textoStatus TextoStatus
   * @param operadora Operadora
   * @return NotificacaoSMSResponse
   */
  public NotificacaoSMSResponse atualizarSMSUsingPOST(String nsu, String status, String data, String textoStatus, String operadora) throws ApiException {
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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<NotificacaoSMSResponse> returnType = new GenericType<NotificacaoSMSResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta configura\u00E7\u00E3o de E-mail
   * Esse recurso permite consultar uma configura\u00E7\u00E3o espec\u00EDfica por id.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da configura\u00E7\u00E3o de e-mail.
   * @return ConfiguracaoEmailResponse
   */
  public ConfiguracaoEmailResponse consultarConfiguracaoUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarConfiguracaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/configuracoes-email/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ConfiguracaoEmailResponse> returnType = new GenericType<ConfiguracaoEmailResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta c\u00F3digo de seguran\u00E7a E-mail
   * Esse recurso permite consultar um c\u00F3digo de seguran\u00E7a E-mail espec\u00EDfico por id.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da configura\u00E7\u00E3o de e-mail.
   * @return CodigoSegurancaResponse
   */
  public CodigoSegurancaResponse consultarPorEmailUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarPorEmailUsingGET");
     }
     
    // create path and map variables
    String path = "/api/codigos-seguranca-email/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<CodigoSegurancaResponse> returnType = new GenericType<CodigoSegurancaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta c\u00F3digo de seguran\u00E7a SMS
   * Esse recurso permite consultar um c\u00F3digo de seguran\u00E7a SMS espec\u00EDfico por id.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da configura\u00E7\u00E3o de e-mail.
   * @return CodigoSegurancaResponse
   */
  public CodigoSegurancaResponse consultarPorSMSUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarPorSMSUsingGET");
     }
     
    // create path and map variables
    String path = "/api/codigos-seguranca-sms/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<CodigoSegurancaResponse> returnType = new GenericType<CodigoSegurancaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta template de notifica\u00E7\u00E3o
   * Esse recurso permite consultar uma configura\u00E7\u00E3o espec\u00EDfica por id.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do layout de e-mail.
   * @return TemplateNotificacaoDetalheResponse
   */
  public TemplateNotificacaoDetalheResponse consultarTemplateNotificacaoUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTemplateNotificacaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/templates-notificacoes/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TemplateNotificacaoDetalheResponse> returnType = new GenericType<TemplateNotificacaoDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Gerar c\u00F3digo de seguran\u00E7a e enviar por e-mail
   * Esse recurso permite gerar e enviar c\u00F3digos de seguran\u00E7a por e-mail, para valida\u00E7\u00E3o de dispositivos.
   * @param email email
   * @return String
   */
  public String gerarTokenEMAILUsingPOST(String email) throws ApiException {
    Object postBody = email;
    
     // verify the required parameter 'email' is set
     if (email == null) {
        throw new ApiException(400, "Missing the required parameter 'email' when calling gerarTokenEMAILUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/notificacoes-email/gerar-codigo-seguranca".replaceAll("\\{format\\}","json");

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
   * Gerar c\u00F3digo de seguran\u00E7a e enviar por sms
   * Esse recurso permite gerar e enviar c\u00F3digos de seguran\u00E7a por sms, para valida\u00E7\u00E3o de dispositivos.
   * @param persist persist
   * @return String
   */
  public String gerarTokenSMSUsingPOST(CodigoSegurancaSMSPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling gerarTokenSMSUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/notificacoes-sms/gerar-codigo-seguranca".replaceAll("\\{format\\}","json");

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
   * Lista configura\u00E7\u00F5es de E-mails
   * Esse recurso permite listar as configura\u00E7\u00F5es de E-mails.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageConfiguracaoEmailResponse
   */
  public PageConfiguracaoEmailResponse listarConfiguracaoUsingGET(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/configuracoes-email".replaceAll("\\{format\\}","json");

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

    
    GenericType<PageConfiguracaoEmailResponse> returnType = new GenericType<PageConfiguracaoEmailResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os c\u00F3digos de seguran\u00E7a E-Mail
   * Esse recurso permite listar os codigos de seguran\u00E7a por E-Mail.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageCodigoSegurancaResponse
   */
  public PageCodigoSegurancaResponse listarPorEmailUsingGET(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/codigos-seguranca-email".replaceAll("\\{format\\}","json");

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

    
    GenericType<PageCodigoSegurancaResponse> returnType = new GenericType<PageCodigoSegurancaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os c\u00F3digos de seguran\u00E7a SMS
   * Esse recurso permite listar os codigos de seguran\u00E7a por SMS.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageCodigoSegurancaResponse
   */
  public PageCodigoSegurancaResponse listarPorSMSUsingGET(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/codigos-seguranca-sms".replaceAll("\\{format\\}","json");

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

    
    GenericType<PageCodigoSegurancaResponse> returnType = new GenericType<PageCodigoSegurancaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar Push
   * Esse recurso permite listar os Pushes do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param dataEnvio Apresenta a data e em que o registro foi enviado para o dispositivo.
   * @param tipoEvento Nome do tipoEvento da notifica\u00E7\u00E3o
   * @param status Status de envio da notifica\u00E7\u00E3o
   * @param plataforma Plataforma de Push notifications.
   * @param protocolo N\u00FAmero do protocolo de envio de notifica\u00E7\u00F5es
   * @return PagePushResponse
   */
  public PagePushResponse listarPushUsingGET(List<String> sort, Integer page, Integer limit, String dataEnvio, String tipoEvento, String status, String plataforma, String protocolo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/notificacoes/push".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PagePushResponse> returnType = new GenericType<PagePushResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar SMS
   * Esse recurso permite listar os SMS do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param dataInclusao Apresenta a data e em que o registro foi inclu\u00EDdo na base para ser enviado
   * @param tipoEvento Nome do tipoEvento da notifica\u00E7\u00E3o
   * @param status Status de envio da notifica\u00E7\u00E3o
   * @param operadora Nome da operadora a qual a notifica\u00E7\u00E3o foi enviada.
   * @param protocolo N\u00FAmero do protocolo de envio de notifica\u00E7\u00F5es
   * @param nsu Apresenta o nsu da notifica\u00E7\u00E3o
   * @return PageSMSResponse
   */
  public PageSMSResponse listarSMSUsingGET(List<String> sort, Integer page, Integer limit, String dataInclusao, String tipoEvento, String status, String operadora, String protocolo, Long nsu) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/notificacoes/sms".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataInclusao", dataInclusao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoEvento", tipoEvento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "operadora", operadora));
    
    queryParams.addAll(apiClient.parameterToPairs("", "protocolo", protocolo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nsu", nsu));
    

    

    

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

    
    GenericType<PageSMSResponse> returnType = new GenericType<PageSMSResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista templates de notifica\u00E7\u00F5es
   * Esse recurso permite listar templates notifica\u00E7\u00F5es.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageTemplateNotificacaoResponse
   */
  public PageTemplateNotificacaoResponse listarTemplateNotificacaoUsingGET(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/templates-notificacoes".replaceAll("\\{format\\}","json");

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

    
    GenericType<PageTemplateNotificacaoResponse> returnType = new GenericType<PageTemplateNotificacaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os tipos templates de notifica\u00E7\u00E3o
   * Esse recurso permite listar os tipos de templates dispon\u00EDveis os par\u00E2metros devem ser usados entre chaves. Ex: {{nomeParametro}} .
   * @return List<Object>
   */
  public List<Object> listarTiposLayoutsUsingGET() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-layouts".replaceAll("\\{format\\}","json");

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
   * Enviar notifica\u00E7\u00E3o por email
   * Esse recurso permite enviar uma mensagem de notifica\u00E7\u00E3o por email
   * @param request request
   * @return Object
   */
  public Object notificacaoEmailUsingPOST(NotificacaoEmailRequest request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling notificacaoEmailUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/notificacoes-email".replaceAll("\\{format\\}","json");

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

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Reenviar c\u00F3digo de seguran\u00E7a por sms
   * Esse recurso permite que seja reenviado para um determinado n\u00FAmero de telefone, atrav\u00E9s de SMS, o c\u00F3digo de seguran\u00E7a gerado previamente para ele. Caso o c\u00F3digo de seguran\u00E7a j\u00E1 n\u00E3o esteja mais v\u00E1lido, o recurso retornar\u00E1 uma mensagem orientando que seja solicitada uma nova gera\u00E7\u00E3o para o telefone em quest\u00E3o.
   * @param persist persist
   * @return String
   */
  public String reenviarTokenSMSUsingPOST(CodigoSegurancaSMSPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling reenviarTokenSMSUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/notificacoes-sms/reenviar-codigo-seguranca".replaceAll("\\{format\\}","json");

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
   * Responder SMS
   * Esse recurso permite atualizar a resposta do SMS, fornecida pedo usu\u00E1rio
   * @param nsu Seu n\u00FAmero
   * @param data Data
   * @param resposta TextoStatus
   * @return NotificacaoSMSResponse
   */
  public NotificacaoSMSResponse responderSMSGetUsingGET(String nsu, String data, String resposta) throws ApiException {
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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<NotificacaoSMSResponse> returnType = new GenericType<NotificacaoSMSResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Salva configura\u00E7\u00F5es de E-mail
   * Esse recurso salvar configura\u00E7\u00F5es de E-mail.
   * @param persist persist
   * @return ConfiguracaoEmailResponse
   */
  public ConfiguracaoEmailResponse salvarConfiguracaoUsingPOST(ConfiguracaoEmailPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarConfiguracaoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/configuracoes-email".replaceAll("\\{format\\}","json");

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

    
    GenericType<ConfiguracaoEmailResponse> returnType = new GenericType<ConfiguracaoEmailResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Enviar Push FCM
   * Esse recurso permite enviar Push para um determinado dipositivo movel atrav\u00E9s da plataforma FCM (Firebase Cloud Messaging).
   * @param pushPersists pushPersists
   * @return NotificacaoResponse
   */
  public NotificacaoResponse salvarPushFCMUsingPOST(List<PushFCMEGCM> pushPersists) throws ApiException {
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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<NotificacaoResponse> returnType = new GenericType<NotificacaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Enviar Push GCM
   * Esse recurso permite enviar Push para um determinado dipositivo movel atrav\u00E9s da plataforma GCM (Google Cloud Messaging).
   * @param pushPersists pushPersists
   * @return NotificacaoResponse
   */
  public NotificacaoResponse salvarPushGCMUsingPOST(List<PushFCMEGCM> pushPersists) throws ApiException {
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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<NotificacaoResponse> returnType = new GenericType<NotificacaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Enviar Push APNS
   * Esse recurso permite enviar Push para um determinado dipositivo movel atrav\u00E9s da plataforma APNS (Apple Push Notification Service).
   * @param pushPersists pushPersists
   * @return NotificacaoResponse
   */
  public NotificacaoResponse salvarPushUsingPOST(List<PushAPNS> pushPersists) throws ApiException {
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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<NotificacaoResponse> returnType = new GenericType<NotificacaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Enviar SMS
   * Esse recurso permite enviar uma lista de SMS.
   * @param listaSMS listaSMS
   * @return NotificacaoResponse
   */
  public NotificacaoResponse salvarSMSUsingPOST(List<NotificacaoSMSBody> listaSMS) throws ApiException {
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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<NotificacaoResponse> returnType = new GenericType<NotificacaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Salva template de notifica\u00E7\u00E3o
   * Esse recurso salvar template notifica\u00E7\u00F5e.
   * @param conteudo Template HTML
   * @param idConfiguracaoEmail C\u00F3digo de identifica\u00E7\u00E3o da configra\u00E7\u00E3o de EMAIL.
   * @param tipoLayout Tipo do layout.
   * @param tipoNotificacao Tipo da notifica\u00E7\u00E3o.
   * @param remetente Remetente
   * @param assunto Assunto da Notificaca\u00E7\u00E3o.
   * @param templatePadrao Template Padr\u00E3o.
   * @return TemplateNotificacaoDetalheResponse
   */
  public TemplateNotificacaoDetalheResponse salvarTemplateNotificacaoUsingPOST(String conteudo, Long idConfiguracaoEmail, String tipoLayout, String tipoNotificacao, String remetente, String assunto, Boolean templatePadrao) throws ApiException {
    Object postBody = conteudo;
    
     // verify the required parameter 'conteudo' is set
     if (conteudo == null) {
        throw new ApiException(400, "Missing the required parameter 'conteudo' when calling salvarTemplateNotificacaoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/templates-notificacoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConfiguracaoEmail", idConfiguracaoEmail));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoLayout", tipoLayout));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoNotificacao", tipoNotificacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "remetente", remetente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "assunto", assunto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "templatePadrao", templatePadrao));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "text/plain"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<TemplateNotificacaoDetalheResponse> returnType = new GenericType<TemplateNotificacaoDetalheResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Validar c\u00F3digo de seguran\u00E7a enviado por e-mail
   * Esse recurso permite validar os c\u00F3digos de seguran\u00E7a enviador por e-mail, para valida\u00E7\u00E3o de dispositivos.
   * @param request request
   * @return String
   */
  public String validarTokenEMAILUsingPOST(CodigoSegurancaEMAILPersist request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling validarTokenEMAILUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/notificacoes-email/validar-codigo-seguranca".replaceAll("\\{format\\}","json");

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
   * Validar c\u00F3digo de seguran\u00E7a enviado por sms
   * Esse recurso permite validar os c\u00F3digos de seguran\u00E7a enviador por sms, para valida\u00E7\u00E3o de dispositivos.
   * @param request request
   * @return String
   */
  public String validarTokenSMSUsingPOST(CodigoSegurancaSMSRequest request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling validarTokenSMSUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/notificacoes-sms/validar-codigo-seguranca".replaceAll("\\{format\\}","json");

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
