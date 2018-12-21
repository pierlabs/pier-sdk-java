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
import br.com.conductor.pier.api.v2.model.Secure3dRequest;
import br.com.conductor.pier.api.v2.model.CodigoSegurancaSMSPersist;
import br.com.conductor.pier.api.v2.model.PageConfiguracaoEmailResponse;
import br.com.conductor.pier.api.v2.model.PageCodigoSegurancaResponse;
import br.com.conductor.pier.api.v2.model.PagePushResponse;
import br.com.conductor.pier.api.v2.model.PageSMSResponse;
import br.com.conductor.pier.api.v2.model.PageTemplateNotificacaoResponse;
import br.com.conductor.pier.api.v2.model.NotificacaoEmailRequest;
import br.com.conductor.pier.api.v2.model.PushFCMGCMPersistValue;
import br.com.conductor.pier.api.v2.model.NotificacaoResponse;
import br.com.conductor.pier.api.v2.model.PushAPNSPersistValue;
import br.com.conductor.pier.api.v2.model.SMSPersistValue;
import br.com.conductor.pier.api.v2.model.CodigoSegurancaEMAILPersist;
import br.com.conductor.pier.api.v2.model.CodigoSegurancaSMSRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagnotificacaoApi {
  private ApiClient apiClient;

  public GlobaltagnotificacaoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagnotificacaoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{email_resource_alterar_configuracao}}}
   * {{{email_resource_alterar_configuracao_notes}}}
   * @param id {{{email_resource_alterar_configuracao_param_id}}}
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
   * {{{notificacao_resource_alterar_template_notificacao}}}
   * {{{notificacao_resource_alterar_template_notificacao_notes}}}
   * @param id {{{notificacao_resource_alterar_template_notificacao_param_id}}}
   * @param conteudo {{{notificacao_resource_alterar_template_notificacao_param_conteudo}}}
   * @param idConfiguracaoEmail {{{template_notificacao_persist_id_configuracao_email_value}}}
   * @param tipoLayout {{{template_notificacao_persist_tipo_layout_value}}}
   * @param tipoNotificacao {{{template_notificacao_persist_tipo_notificacao_value}}}
   * @param remetente {{{template_notificacao_persist_remetente_value}}}
   * @param assunto {{{template_notificacao_persist_assunto_value}}}
   * @param templatePadrao {{{template_notificacao_persist_template_padrao_value}}}
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
   * {{{notificacao_resource_atualizar_s_m_s}}}
   * {{{notificacao_resource_atualizar_s_m_s_notes}}}
   * @param nsu {{{notificacao_resource_atualizar_s_m_s_param_nsu}}}
   * @param status {{{notificacao_resource_atualizar_s_m_s_param_status}}}
   * @param data {{{notificacao_resource_atualizar_s_m_s_param_data}}}
   * @param textoStatus {{{notificacao_resource_atualizar_s_m_s_param_texto_status}}}
   * @param operadora {{{notificacao_resource_atualizar_s_m_s_param_operadora}}}
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
   * {{{email_resource_consultar_configuracao}}}
   * {{{email_resource_consultar_configuracao_notes}}}
   * @param id {{{email_resource_consultar_configuracao_param_id}}}
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
   * {{{codigo_seguranca_resource_consultar_por_email}}}
   * {{{codigo_seguranca_resource_consultar_por_email_notes}}}
   * @param id {{{codigo_seguranca_resource_consultar_por_email_param_id}}}
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
   * {{{codigo_seguranca_resource_consultar_por_s_m_s}}}
   * {{{codigo_seguranca_resource_consultar_por_s_m_s_notes}}}
   * @param id {{{codigo_seguranca_resource_consultar_por_s_m_s_param_id}}}
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
   * {{{notificacao_resource_consultar_template_notificacao}}}
   * {{{notificacao_resource_consultar_template_notificacao_notes}}}
   * @param id {{{notificacao_resource_consultar_template_notificacao_param_id}}}
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
   * {{{notificacao_resource_3d_secure}}}
   * {{{notificacao_resource_3d_secure_notes}}}
   * @param secure3dRequest secure3dRequest
   * @return Object
   */
  public Object enviarOTPUsingPOST(Secure3dRequest secure3dRequest) throws ApiException {
    Object postBody = secure3dRequest;
    
     // verify the required parameter 'secure3dRequest' is set
     if (secure3dRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'secure3dRequest' when calling enviarOTPUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/notificacoes/3d-secure".replaceAll("\\{format\\}","json");

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
   * {{{codigo_seguranca_resource_gerar_token_e_m_a_i_l}}}
   * {{{codigo_seguranca_resource_gerar_token_e_m_a_i_l_notes}}}
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
   * {{{codigo_seguranca_resource_gerar_token_s_m_s}}}
   * {{{codigo_seguranca_resource_gerar_token_s_m_s_notes}}}
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
   * {{{email_resource_listar_configuracao}}}
   * {{{email_resource_listar_configuracao_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
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
   * {{{codigo_seguranca_resource_listar_por_email}}}
   * {{{codigo_seguranca_resource_listar_por_email_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
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
   * {{{codigo_seguranca_resource_listar_por_s_m_s}}}
   * {{{codigo_seguranca_resource_listar_por_s_m_s_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
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
   * {{{notificacao_resource_listar_push}}}
   * {{{notificacao_resource_listar_push_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param dataEnvio {{{notificacao_push_request_data_envio_value}}}
   * @param tipoEvento {{{notificacao_push_request_tipo_evento_value}}}
   * @param status {{{notificacao_push_request_status_value}}}
   * @param plataforma {{{notificacao_push_request_plataforma_value}}}
   * @param protocolo {{{notificacao_push_request_protocolo_value}}}
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
   * {{{notificacao_resource_listar_s_m_s}}}
   * {{{notificacao_resource_listar_s_m_s_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param dataInclusao {{{notificacao_s_m_s_request_data_inclusao_value}}}
   * @param tipoEvento {{{notificacao_s_m_s_request_tipo_evento_value}}}
   * @param status {{{notificacao_s_m_s_request_status_value}}}
   * @param operadora {{{notificacao_s_m_s_request_operadora_value}}}
   * @param protocolo {{{notificacao_s_m_s_request_protocolo_value}}}
   * @param nsu {{{notificacao_s_m_s_request_nsu_value}}}
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
   * {{{notificacao_resource_listar_template_notificacao}}}
   * {{{notificacao_resource_listar_template_notificacao_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
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
   * {{{enum_resource_listar_tipos_layouts}}}
   * {{{enum_resource_listar_tipos_layouts_notes}}}
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
   * {{{notificacao_resource_notificacao_email}}}
   * {{{notificacao_resource_notificacao_email_notes}}}
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
   * {{{codigo_seguranca_resource_reenviar_token_s_m_s}}}
   * {{{codigo_seguranca_resource_reenviar_token_s_m_s_notes}}}
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
   * {{{notificacao_resource_responder_s_m_s_get}}}
   * {{{notificacao_resource_responder_s_m_s_get_notes}}}
   * @param nsu {{{notificacao_resource_responder_s_m_s_get_param_nsu}}}
   * @param data {{{notificacao_resource_responder_s_m_s_get_param_data}}}
   * @param resposta {{{notificacao_resource_responder_s_m_s_get_param_resposta}}}
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
   * {{{email_resource_salvar_configuracao}}}
   * {{{email_resource_salvar_configuracao_notes}}}
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
   * {{{notificacao_resource_salvar_push_f_c_m}}}
   * {{{notificacao_resource_salvar_push_f_c_m_notes}}}
   * @param pushPersists pushPersists
   * @return NotificacaoResponse
   */
  public NotificacaoResponse salvarPushFCMUsingPOST(List<PushFCMGCMPersistValue> pushPersists) throws ApiException {
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
   * {{{notificacao_resource_salvar_push_g_c_m}}}
   * {{{notificacao_resource_salvar_push_g_c_m_notes}}}
   * @param pushPersists pushPersists
   * @return NotificacaoResponse
   */
  public NotificacaoResponse salvarPushGCMUsingPOST(List<PushFCMGCMPersistValue> pushPersists) throws ApiException {
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
   * {{{notificacao_resource_salvar_push}}}
   * {{{notificacao_resource_salvar_push_notes}}}
   * @param pushPersists pushPersists
   * @return NotificacaoResponse
   */
  public NotificacaoResponse salvarPushUsingPOST(List<PushAPNSPersistValue> pushPersists) throws ApiException {
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
   * {{{notificacao_resource_salvar_s_m_s}}}
   * {{{notificacao_resource_salvar_s_m_s_notes}}}
   * @param listaSMS listaSMS
   * @return NotificacaoResponse
   */
  public NotificacaoResponse salvarSMSUsingPOST(List<SMSPersistValue> listaSMS) throws ApiException {
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
   * {{{notificacao_resource_salvar_template_notificacao}}}
   * {{{notificacao_resource_salvar_template_notificacao_notes}}}
   * @param conteudo {{{notificacao_resource_salvar_template_notificacao_param_conteudo}}}
   * @param idConfiguracaoEmail {{{template_notificacao_persist_id_configuracao_email_value}}}
   * @param tipoLayout {{{template_notificacao_persist_tipo_layout_value}}}
   * @param tipoNotificacao {{{template_notificacao_persist_tipo_notificacao_value}}}
   * @param remetente {{{template_notificacao_persist_remetente_value}}}
   * @param assunto {{{template_notificacao_persist_assunto_value}}}
   * @param templatePadrao {{{template_notificacao_persist_template_padrao_value}}}
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
   * {{{codigo_seguranca_resource_validar_token_e_m_a_i_l}}}
   * {{{codigo_seguranca_resource_validar_token_e_m_a_i_l_notes}}}
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
   * {{{codigo_seguranca_resource_validar_token_s_m_s}}}
   * {{{codigo_seguranca_resource_validar_token_s_m_s_notes}}}
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
