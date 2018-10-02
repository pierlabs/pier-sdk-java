package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.ContaDebitoRecorrentePersistValue;
import br.com.conductor.pier.api.v2.model.ContaDebitoRecorrenteResponse;
import br.com.conductor.pier.api.v2.model.PageContaDebitoRecorrenteResponse;
import br.com.conductor.pier.api.v2.model.PageTipoDebitoRecorrenteResponse;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagdebitorecorrenteApi {
  private ApiClient apiClient;

  public GlobaltagdebitorecorrenteApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagdebitorecorrenteApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{conta_debito_recorrente_resource_aderir}}}
   * {{{conta_debito_recorrente_resource_aderir_notes}}}
   * @param contaDebitoRecorrentePersist contaDebitoRecorrentePersist
   * @return ContaDebitoRecorrenteResponse
   */
  public ContaDebitoRecorrenteResponse aderirDebitoRecorrenteUsingPOST(ContaDebitoRecorrentePersistValue contaDebitoRecorrentePersist) throws ApiException {
    Object postBody = contaDebitoRecorrentePersist;
    
     // verify the required parameter 'contaDebitoRecorrentePersist' is set
     if (contaDebitoRecorrentePersist == null) {
        throw new ApiException(400, "Missing the required parameter 'contaDebitoRecorrentePersist' when calling aderirDebitoRecorrenteUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/debitos-recorrentes".replaceAll("\\{format\\}","json");

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

    
    GenericType<ContaDebitoRecorrenteResponse> returnType = new GenericType<ContaDebitoRecorrenteResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{conta_debito_recorrente_resource_cancelar}}}
   * {{{conta_debito_recorrente_resource_cancelar_notes}}}
   * @param id {{{conta_debito_recorrente_resource_cancelar_param_id_debito_recorrente}}}
   * @param contaDebitoRecorrentePersist contaDebitoRecorrentePersist
   * @return ContaDebitoRecorrenteResponse
   */
  public ContaDebitoRecorrenteResponse cancelarDebitoRecorrenteUsingPOST(Long id, ContaDebitoRecorrentePersistValue contaDebitoRecorrentePersist) throws ApiException {
    Object postBody = contaDebitoRecorrentePersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarDebitoRecorrenteUsingPOST");
     }
     
     // verify the required parameter 'contaDebitoRecorrentePersist' is set
     if (contaDebitoRecorrentePersist == null) {
        throw new ApiException(400, "Missing the required parameter 'contaDebitoRecorrentePersist' when calling cancelarDebitoRecorrenteUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/debitos-recorrentes/{id}/cancelar".replaceAll("\\{format\\}","json")
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

    
    GenericType<ContaDebitoRecorrenteResponse> returnType = new GenericType<ContaDebitoRecorrenteResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{conta_debito_recorrente_resource_listar}}}
   * {{{conta_debito_recorrente_resource_listar_notes}}}
   * @param idConta {{{conta_debito_recorrente_resource_listar_param_id_conta}}}
   * @param idTipoDebitoRecorrente {{{conta_debito_recorrente_resource_listar_param_id_tipo_debito_recorrente}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param dataHoraInicio {{{conta_debito_recorrente_request_data_hora_inicio_value}}}
   * @param dataHoraFim {{{conta_debito_recorrente_request_data_hora_fim_value}}}
   * @param ativo {{{conta_debito_recorrente_request_ativo_value}}}
   * @param dataHoraUltimoPagamento {{{conta_debito_recorrente_request_data_hora_ultimo_pagamento_value}}}
   * @return PageContaDebitoRecorrenteResponse
   */
  public PageContaDebitoRecorrenteResponse listarUsingGET16(Long idConta, Long idTipoDebitoRecorrente, List<String> sort, Integer page, Integer limit, String dataHoraInicio, String dataHoraFim, Boolean ativo, String dataHoraUltimoPagamento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/debitos-recorrentes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoDebitoRecorrente", idTipoDebitoRecorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraInicio", dataHoraInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraFim", dataHoraFim));
    
    queryParams.addAll(apiClient.parameterToPairs("", "ativo", ativo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraUltimoPagamento", dataHoraUltimoPagamento));
    

    

    

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

    
    GenericType<PageContaDebitoRecorrenteResponse> returnType = new GenericType<PageContaDebitoRecorrenteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{tipo_debito_recorrente_resource_listar}}}
   * {{{tipo_debito_recorrente_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{tipo_debito_recorrente_request_id_value}}}
   * @param descricao {{{tipo_debito_recorrente_request_descricao_value}}}
   * @param valor {{{tipo_debito_recorrente_request_valor_value}}}
   * @param flagAtivo {{{tipo_debito_recorrente_request_flag_ativo_value}}}
   * @return PageTipoDebitoRecorrenteResponse
   */
  public PageTipoDebitoRecorrenteResponse listarUsingGET48(List<String> sort, Integer page, Integer limit, Long id, String descricao, BigDecimal valor, Boolean flagAtivo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-debitos-recorrentes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valor", valor));
    
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

    
    GenericType<PageTipoDebitoRecorrenteResponse> returnType = new GenericType<PageTipoDebitoRecorrenteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
