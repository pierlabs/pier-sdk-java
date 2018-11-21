package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.StatusOportunidadeResponse;
import br.com.conductor.pier.api.v2.model.StatusOportunidadePersistValue;
import br.com.conductor.pier.api.v2.model.OportunidadeResponse;
import br.com.conductor.pier.api.v2.model.OportunidadeUpdateValue;
import br.com.conductor.pier.api.v2.model.TipoOportunidadePersistValue;
import br.com.conductor.pier.api.v2.model.TipoOportunidadeResponse;
import br.com.conductor.pier.api.v2.model.PageStatusOportunidadeAUDResponse;
import br.com.conductor.pier.api.v2.model.PageOportunidadeAUDResponse;
import br.com.conductor.pier.api.v2.model.PageTipoOportunidadeAUDResponse;
import br.com.conductor.pier.api.v2.model.PageStatusOportunidadeResponse;
import br.com.conductor.pier.api.v2.model.PageOportunidadeResponse;
import br.com.conductor.pier.api.v2.model.PageTipoOportunidadeResponse;
import br.com.conductor.pier.api.v2.model.OportunidadePersistValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagoportunidadeApi {
  private ApiClient apiClient;

  public GlobaltagoportunidadeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagoportunidadeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{tipo_oportunidade_resource_alterar_status}}}
   * {{{tipo_oportunidade_resource_alterar_status_notes}}}
   * @param id {{{tipo_oportunidade_resource_alterar_status_param_id}}}
   * @param idStatus {{{tipo_oportunidade_resource_alterar_status_param_id_status}}}
   * @param persist persist
   * @return StatusOportunidadeResponse
   */
  public StatusOportunidadeResponse alterarStatusUsingPUT(Long id, Long idStatus, StatusOportunidadePersistValue persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarStatusUsingPUT");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling alterarStatusUsingPUT");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling alterarStatusUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/tipos-oportunidades/{id}/status/{idStatus}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idStatus" + "\\}", apiClient.escapeString(idStatus.toString()));

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

    
    GenericType<StatusOportunidadeResponse> returnType = new GenericType<StatusOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{oportunidade_resource_alterar}}}
   * {{{oportunidade_resource_alterar_notes}}}
   * @param id {{{oportunidade_resource_alterar_param_id}}}
   * @param update update
   * @return OportunidadeResponse
   */
  public OportunidadeResponse alterarUsingPUT13(Long id, OportunidadeUpdateValue update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT13");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling alterarUsingPUT13");
     }
     
    // create path and map variables
    String path = "/api/oportunidades/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<OportunidadeResponse> returnType = new GenericType<OportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{tipo_oportunidade_resource_alterar}}}
   * {{{tipo_oportunidade_resource_alterar_notes}}}
   * @param id {{{tipo_oportunidade_resource_alterar_param_id}}}
   * @param persist persist
   * @return TipoOportunidadeResponse
   */
  public TipoOportunidadeResponse alterarUsingPUT19(Long id, TipoOportunidadePersistValue persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT19");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling alterarUsingPUT19");
     }
     
    // create path and map variables
    String path = "/api/tipos-oportunidades/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoOportunidadeResponse> returnType = new GenericType<TipoOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{tipo_oportunidade_resource_consultar_status}}}
   * {{{tipo_oportunidade_resource_consultar_status_notes}}}
   * @param id {{{tipo_oportunidade_resource_consultar_status_param_id}}}
   * @param idStatus {{{tipo_oportunidade_resource_consultar_status_param_id_status}}}
   * @return StatusOportunidadeResponse
   */
  public StatusOportunidadeResponse consultarStatusUsingGET(Long id, Long idStatus) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarStatusUsingGET");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling consultarStatusUsingGET");
     }
     
    // create path and map variables
    String path = "/api/tipos-oportunidades/{id}/status/{idStatus}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idStatus" + "\\}", apiClient.escapeString(idStatus.toString()));

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

    
    GenericType<StatusOportunidadeResponse> returnType = new GenericType<StatusOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{oportunidade_resource_consultar}}}
   * {{{oportunidade_resource_consultar_notes}}}
   * @param id {{{oportunidade_resource_consultar_param_id}}}
   * @return OportunidadeResponse
   */
  public OportunidadeResponse consultarUsingGET26(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET26");
     }
     
    // create path and map variables
    String path = "/api/oportunidades/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<OportunidadeResponse> returnType = new GenericType<OportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{tipo_oportunidade_resource_consultar}}}
   * {{{tipo_oportunidade_resource_consultar_notes}}}
   * @param id {{{tipo_oportunidade_resource_consultar_param_id}}}
   * @return TipoOportunidadeResponse
   */
  public TipoOportunidadeResponse consultarUsingGET44(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET44");
     }
     
    // create path and map variables
    String path = "/api/tipos-oportunidades/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoOportunidadeResponse> returnType = new GenericType<TipoOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{tipo_oportunidade_resource_listar_auditorias_status}}}
   * {{{tipo_oportunidade_resource_listar_auditorias_status_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param revType {{{status_oportunidade_a_u_d_request_rev_type_value}}}
   * @param revDate {{{status_oportunidade_a_u_d_request_rev_date_value}}}
   * @param id {{{status_oportunidade_a_u_d_request_id_value}}}
   * @param idTipoOportunidade {{{status_oportunidade_a_u_d_request_id_tipo_oportunidade_value}}}
   * @param nome {{{status_oportunidade_a_u_d_request_nome_value}}}
   * @param descricao {{{status_oportunidade_a_u_d_request_descricao_value}}}
   * @param flagAtivo {{{status_oportunidade_a_u_d_request_flag_ativo_value}}}
   * @param revUser {{{status_oportunidade_a_u_d_request_rev_user_value}}}
   * @return PageStatusOportunidadeAUDResponse
   */
  public PageStatusOportunidadeAUDResponse listarAuditoriasStatusUsingGET(List<String> sort, Integer page, Integer limit, Long revType, String revDate, Long id, Long idTipoOportunidade, String nome, String descricao, Boolean flagAtivo, String revUser) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/auditorias-status-oportunidades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revType", revType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revDate", revDate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoOportunidade", idTipoOportunidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revUser", revUser));
    

    

    

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

    
    GenericType<PageStatusOportunidadeAUDResponse> returnType = new GenericType<PageStatusOportunidadeAUDResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{oportunidade_resource_listar_auditorias}}}
   * {{{oportunidade_resource_listar_auditorias_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idStatusOportunidade {{{oportunidade_a_u_d_request_id_status_oportunidade_value}}}
   * @param dataCadastro {{{oportunidade_a_u_d_request_data_cadastro_value}}}
   * @param dataAtualizacao {{{oportunidade_a_u_d_request_data_atualizacao_value}}}
   * @param numeroReceitaFederal {{{oportunidade_a_u_d_request_numero_receita_federal_value}}}
   * @param dataInicioVigencia {{{oportunidade_a_u_d_request_data_inicio_vigencia_value}}}
   * @param datatFimVigencia {{{oportunidade_a_u_d_request_datat_fim_vigencia_value}}}
   * @param flagAtivo {{{oportunidade_a_u_d_request_flag_ativo_value}}}
   * @param revDate {{{oportunidade_a_u_d_request_rev_date_value}}}
   * @param revType {{{oportunidade_a_u_d_request_rev_type_value}}}
   * @param revUser {{{oportunidade_a_u_d_request_rev_user_value}}}
   * @return PageOportunidadeAUDResponse
   */
  public PageOportunidadeAUDResponse listarAuditoriasUsingGET(List<String> sort, Integer page, Integer limit, Long idStatusOportunidade, String dataCadastro, String dataAtualizacao, String numeroReceitaFederal, String dataInicioVigencia, String datatFimVigencia, Boolean flagAtivo, String revDate, String revType, String revUser) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/auditorias-oportunidades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idStatusOportunidade", idStatusOportunidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAtualizacao", dataAtualizacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataInicioVigencia", dataInicioVigencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "datatFimVigencia", datatFimVigencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revDate", revDate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revType", revType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revUser", revUser));
    

    

    

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

    
    GenericType<PageOportunidadeAUDResponse> returnType = new GenericType<PageOportunidadeAUDResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{tipo_oportunidade_resource_listar_auditorias}}}
   * {{{tipo_oportunidade_resource_listar_auditorias_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param revType {{{tipo_oportunidade_a_u_d_request_rev_type_value}}}
   * @param revDate {{{tipo_oportunidade_a_u_d_request_rev_date_value}}}
   * @param id {{{tipo_oportunidade_a_u_d_request_id_value}}}
   * @param descricao {{{tipo_oportunidade_a_u_d_request_descricao_value}}}
   * @param flagAtivo {{{tipo_oportunidade_a_u_d_request_flag_ativo_value}}}
   * @param revUser {{{tipo_oportunidade_a_u_d_request_rev_user_value}}}
   * @return PageTipoOportunidadeAUDResponse
   */
  public PageTipoOportunidadeAUDResponse listarAuditoriasUsingGET1(List<String> sort, Integer page, Integer limit, Long revType, String revDate, Long id, String descricao, Boolean flagAtivo, String revUser) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/auditorias-tipos-oportunidades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revType", revType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revDate", revDate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revUser", revUser));
    

    

    

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

    
    GenericType<PageTipoOportunidadeAUDResponse> returnType = new GenericType<PageTipoOportunidadeAUDResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{tipo_oportunidade_resource_listar_status}}}
   * {{{tipo_oportunidade_resource_listar_status_notes}}}
   * @param id {{{tipo_oportunidade_resource_listar_status_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param nome {{{status_oportunidade_request_nome_value}}}
   * @param descricao {{{status_oportunidade_request_descricao_value}}}
   * @param flagAtivo {{{status_oportunidade_request_flag_ativo_value}}}
   * @return PageStatusOportunidadeResponse
   */
  public PageStatusOportunidadeResponse listarStatusUsingGET(Long id, List<String> sort, Integer page, Integer limit, String nome, String descricao, Boolean flagAtivo) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarStatusUsingGET");
     }
     
    // create path and map variables
    String path = "/api/tipos-oportunidades/{id}/status".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    

    

    

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

    
    GenericType<PageStatusOportunidadeResponse> returnType = new GenericType<PageStatusOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{oportunidade_resource_listar}}}
   * {{{oportunidade_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idStatusOportunidade {{{oportunidade_request_id_status_oportunidade_value}}}
   * @param dataCadastro {{{oportunidade_request_data_cadastro_value}}}
   * @param dataAtualizacao {{{oportunidade_request_data_atualizacao_value}}}
   * @param numeroReceitaFederal {{{oportunidade_request_numero_receita_federal_value}}}
   * @param dataInicioVigencia {{{oportunidade_request_data_inicio_vigencia_value}}}
   * @param dataFimVigencia {{{oportunidade_request_data_fim_vigencia_value}}}
   * @param flagAtivo {{{oportunidade_request_flag_ativo_value}}}
   * @return PageOportunidadeResponse
   */
  public PageOportunidadeResponse listarUsingGET31(List<String> sort, Integer page, Integer limit, Long idStatusOportunidade, String dataCadastro, String dataAtualizacao, String numeroReceitaFederal, String dataInicioVigencia, String dataFimVigencia, Boolean flagAtivo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/oportunidades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idStatusOportunidade", idStatusOportunidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAtualizacao", dataAtualizacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataInicioVigencia", dataInicioVigencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataFimVigencia", dataFimVigencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    

    

    

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

    
    GenericType<PageOportunidadeResponse> returnType = new GenericType<PageOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{tipo_oportunidade_resource_listar}}}
   * {{{tipo_oportunidade_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param descricao {{{tipo_oportunidade_request_descricao_value}}}
   * @param flagAtivo {{{tipo_oportunidade_request_flag_ativo_value}}}
   * @return PageTipoOportunidadeResponse
   */
  public PageTipoOportunidadeResponse listarUsingGET52(List<String> sort, Integer page, Integer limit, String descricao, Boolean flagAtivo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-oportunidades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    

    

    

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

    
    GenericType<PageTipoOportunidadeResponse> returnType = new GenericType<PageTipoOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{tipo_oportunidade_resource_salvar_status}}}
   * {{{tipo_oportunidade_resource_salvar_status_notes}}}
   * @param id {{{tipo_oportunidade_resource_salvar_status_param_id}}}
   * @param persist persist
   * @return StatusOportunidadeResponse
   */
  public StatusOportunidadeResponse salvarStatusUsingPOST(Long id, StatusOportunidadePersistValue persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvarStatusUsingPOST");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarStatusUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/tipos-oportunidades/{id}/status".replaceAll("\\{format\\}","json")
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

    
    GenericType<StatusOportunidadeResponse> returnType = new GenericType<StatusOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{oportunidade_resource_salvar}}}
   * {{{oportunidade_resource_salvar_notes}}}
   * @param persist persist
   * @return OportunidadeResponse
   */
  public OportunidadeResponse salvarUsingPOST21(OportunidadePersistValue persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST21");
     }
     
    // create path and map variables
    String path = "/api/oportunidades".replaceAll("\\{format\\}","json");

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

    
    GenericType<OportunidadeResponse> returnType = new GenericType<OportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{tipo_oportunidade_resource_salvar}}}
   * {{{tipo_oportunidade_resource_salvar_notes}}}
   * @param persist persist
   * @return TipoOportunidadeResponse
   */
  public TipoOportunidadeResponse salvarUsingPOST29(TipoOportunidadePersistValue persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST29");
     }
     
    // create path and map variables
    String path = "/api/tipos-oportunidades".replaceAll("\\{format\\}","json");

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

    
    GenericType<TipoOportunidadeResponse> returnType = new GenericType<TipoOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
