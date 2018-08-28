package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.TipoFaturamentoPersistValue;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoResponse;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoPorContaPersistValue;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoPorContaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoFaturamentoPorContaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoFaturamentoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagfaturamentoApi {
  private ApiClient apiClient;

  public GlobaltagfaturamentoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagfaturamentoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{faturamento_resource_alterar_tipo_faturamento}}}
   * {{{faturamento_resource_alterar_tipo_faturamento_notes}}}
   * @param id {{{faturamento_resource_alterar_tipo_faturamento_param_id_tipo_faturamento}}}
   * @param tipoFaturamentoPersist tipoFaturamentoPersist
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse alterarTipoFaturamentoUsingPUT(Long id, TipoFaturamentoPersistValue tipoFaturamentoPersist) throws ApiException {
    Object postBody = tipoFaturamentoPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTipoFaturamentoUsingPUT");
     }
     
     // verify the required parameter 'tipoFaturamentoPersist' is set
     if (tipoFaturamentoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'tipoFaturamentoPersist' when calling alterarTipoFaturamentoUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/tipos-faturamento/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoFaturamentoResponse> returnType = new GenericType<TipoFaturamentoResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{faturamento_resource_cadastrar_faturamento_por_conta}}}
   * {{{faturamento_resource_cadastrar_faturamento_por_conta_notes}}}
   * @param tipoFaturamentoPorContaPersist tipoFaturamentoPorContaPersist
   * @return TipoFaturamentoPorContaResponse
   */
  public TipoFaturamentoPorContaResponse cadastrarFaturamentoPorContaUsingPOST(TipoFaturamentoPorContaPersistValue tipoFaturamentoPorContaPersist) throws ApiException {
    Object postBody = tipoFaturamentoPorContaPersist;
    
     // verify the required parameter 'tipoFaturamentoPorContaPersist' is set
     if (tipoFaturamentoPorContaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'tipoFaturamentoPorContaPersist' when calling cadastrarFaturamentoPorContaUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/tipos-faturamento-conta".replaceAll("\\{format\\}","json");

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

    
    GenericType<TipoFaturamentoPorContaResponse> returnType = new GenericType<TipoFaturamentoPorContaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{faturamento_resource_cadastrar_tipo_faturamento}}}
   * {{{faturamento_resource_cadastrar_tipo_faturamento_notes}}}
   * @param tipoFaturamentoPersist tipoFaturamentoPersist
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse cadastrarTipoFaturamentoUsingPOST(TipoFaturamentoPersistValue tipoFaturamentoPersist) throws ApiException {
    Object postBody = tipoFaturamentoPersist;
    
     // verify the required parameter 'tipoFaturamentoPersist' is set
     if (tipoFaturamentoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'tipoFaturamentoPersist' when calling cadastrarTipoFaturamentoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/tipos-faturamento".replaceAll("\\{format\\}","json");

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

    
    GenericType<TipoFaturamentoResponse> returnType = new GenericType<TipoFaturamentoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{faturamento_resource_consultar_tipo_faturamento}}}
   * {{{faturamento_resource_consultar_tipo_faturamento_notes}}}
   * @param id {{{faturamento_resource_consultar_tipo_faturamento_param_id_tipo_faturamento}}}
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse consultarTipoFaturamentoUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTipoFaturamentoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/tipos-faturamento/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoFaturamentoResponse> returnType = new GenericType<TipoFaturamentoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{faturamento_resource_desativar_faturamento_por_conta}}}
   * {{{faturamento_resource_desativar_faturamento_por_conta_notes}}}
   * @param id {{{faturamento_resource_desativar_faturamento_por_conta_param_id}}}
   * @return TipoFaturamentoPorContaResponse
   */
  public TipoFaturamentoPorContaResponse desativarFaturamentoPorContaUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarFaturamentoPorContaUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/tipos-faturamento-conta/{id}/desativar".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoFaturamentoPorContaResponse> returnType = new GenericType<TipoFaturamentoPorContaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{faturamento_resource_desativar_tipo_faturamento}}}
   * {{{faturamento_resource_desativar_tipo_faturamento_notes}}}
   * @param id {{{faturamento_resource_desativar_tipo_faturamento_param_id_tipo_faturamento}}}
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse desativarTipoFaturamentoUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarTipoFaturamentoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/tipos-faturamento/{id}/desativar".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoFaturamentoResponse> returnType = new GenericType<TipoFaturamentoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{faturamento_resource_listar_faturamento_por_conta}}}
   * {{{faturamento_resource_listar_faturamento_por_conta_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idTipoFaturamentoPorConta {{{tipo_faturamento_por_conta_request_id_tipo_faturamento_por_conta_value}}}
   * @param ativo {{{tipo_faturamento_por_conta_request_status_value}}}
   * @param idConta {{{tipo_faturamento_por_conta_request_id_conta_value}}}
   * @param idTipoFaturamento {{{tipo_faturamento_por_conta_request_id_tipo_faturamento_value}}}
   * @param dataHoraInclusao {{{tipo_faturamento_por_conta_request_data_hora_inclusao_value}}}
   * @param dataHoraCancelamento {{{tipo_faturamento_por_conta_request_data_hora_cancelamento_value}}}
   * @param modificadoPor {{{tipo_faturamento_por_conta_request_modificado_por_value}}}
   * @return PageTipoFaturamentoPorContaResponse
   */
  public PageTipoFaturamentoPorContaResponse listarFaturamentoPorContaUsingGET(List<String> sort, Integer page, Integer limit, Long idTipoFaturamentoPorConta, Boolean ativo, Long idConta, Long idTipoFaturamento, String dataHoraInclusao, String dataHoraCancelamento, String modificadoPor) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-faturamento-conta".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoFaturamentoPorConta", idTipoFaturamentoPorConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "ativo", ativo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoFaturamento", idTipoFaturamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraInclusao", dataHoraInclusao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraCancelamento", dataHoraCancelamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "modificadoPor", modificadoPor));
    

    

    

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

    
    GenericType<PageTipoFaturamentoPorContaResponse> returnType = new GenericType<PageTipoFaturamentoPorContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{faturamento_resource_listar_tipo_faturamento}}}
   * {{{faturamento_resource_listar_tipo_faturamento_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idTipoFaturamento {{{tipo_faturamento_request_id_tipo_faturamento_value}}}
   * @param descricao {{{tipo_faturamento_request_descricao_value}}}
   * @param flagApenasDemonstrativo {{{tipo_faturamento_request_flag_apenas_demonstrativo_value}}}
   * @param idConvenio {{{tipo_faturamento_request_id_convenio_value}}}
   * @return PageTipoFaturamentoResponse
   */
  public PageTipoFaturamentoResponse listarTipoFaturamentoUsingGET(List<String> sort, Integer page, Integer limit, Long idTipoFaturamento, String descricao, Boolean flagApenasDemonstrativo, Long idConvenio) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-faturamento".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoFaturamento", idTipoFaturamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagApenasDemonstrativo", flagApenasDemonstrativo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConvenio", idConvenio));
    

    

    

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

    
    GenericType<PageTipoFaturamentoResponse> returnType = new GenericType<PageTipoFaturamentoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
