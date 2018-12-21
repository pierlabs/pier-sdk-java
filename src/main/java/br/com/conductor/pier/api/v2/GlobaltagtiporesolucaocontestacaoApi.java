package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.PageStatusContestacaoResponse;
import br.com.conductor.pier.api.v2.model.PageTipoResolucaoContestacaoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagtiporesolucaocontestacaoApi {
  private ApiClient apiClient;

  public GlobaltagtiporesolucaocontestacaoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagtiporesolucaocontestacaoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{status_contestacao_resource_listar_status_contestacao}}}
   * {{{status_contestacao_resource_listar_status_contestacao_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idStatusContestacao {{{status_contestacao_request_idstatuscontestacao_value}}}
   * @param idStatusContestacaoOrigem {{{status_contestacao_request_idstatuscontestacaoOrigem_value}}}
   * @param descricao {{{status_contestacao_request_descricao_value}}}
   * @param flagPermiteAlteracao {{{status_contestacao_request_flagpermitealteracao_value}}}
   * @param flagSistema {{{status_contestacao_request_flagsistema_value}}}
   * @return PageStatusContestacaoResponse
   */
  public PageStatusContestacaoResponse listarStatusContestacaoUsingGET(List<String> sort, Integer page, Integer limit, Long idStatusContestacao, Long idStatusContestacaoOrigem, String descricao, Integer flagPermiteAlteracao, Integer flagSistema) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/status-contestacoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idStatusContestacao", idStatusContestacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idStatusContestacaoOrigem", idStatusContestacaoOrigem));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagPermiteAlteracao", flagPermiteAlteracao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagSistema", flagSistema));
    

    

    

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

    
    GenericType<PageStatusContestacaoResponse> returnType = new GenericType<PageStatusContestacaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{tipo_resolucao_contestacao_resource_listar_tipo_contestacao}}}
   * {{{tipo_resolucao_contestacao_resource_listar_tipo_resolucao_contestacao_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idTipoResolucaoContestacao {{{tipo_resolucao_contestacao_request_idTipoResolucaoContestacao_value}}}
   * @param descricao {{{tipo_resolucao_contestacao_request_descricao_value}}}
   * @return PageTipoResolucaoContestacaoResponse
   */
  public PageTipoResolucaoContestacaoResponse listarTipoResolucaoContestacaoUsingGET(List<String> sort, Integer page, Integer limit, Long idTipoResolucaoContestacao, String descricao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-resolucoes-contestacoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoResolucaoContestacao", idTipoResolucaoContestacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    

    

    

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

    
    GenericType<PageTipoResolucaoContestacaoResponse> returnType = new GenericType<PageTipoResolucaoContestacaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
