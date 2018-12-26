package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.AjusteFinanceiroResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PageAjusteResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagajustefinanceiroApi {
  private ApiClient apiClient;

  public GlobaltagajustefinanceiroApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagajustefinanceiroApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{ajuste_financeiro_resource_ajustar_conta}}}
   * {{{ajuste_financeiro_resource_ajustar_conta_notes}}}
   * @param idTipoAjuste {{{ajuste_financeiro_persist_id_tipo_ajuste_value}}}
   * @param dataAjuste {{{ajuste_financeiro_persist_data_ajuste_value}}}
   * @param valorAjuste {{{ajuste_financeiro_persist_valor_ajuste_value}}}
   * @param idConta {{{ajuste_financeiro_persist_id_conta_value}}}
   * @param login login
   * @param identificadorExterno {{{ajuste_financeiro_persist_identificador_externo_value}}}
   * @param idTransacaoOriginal {{{ajuste_fincanceiro_persist_id_transacao_original}}}
   * @param idEstabelecimento {{{ajuste_fincanceiro_persist_id_estabelecimento_value}}}
   * @return AjusteFinanceiroResponse
   */
  public AjusteFinanceiroResponse ajustarContaUsingPOST(Long idTipoAjuste, String dataAjuste, BigDecimal valorAjuste, Long idConta, String login, String identificadorExterno, Long idTransacaoOriginal, Long idEstabelecimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idTipoAjuste' is set
     if (idTipoAjuste == null) {
        throw new ApiException(400, "Missing the required parameter 'idTipoAjuste' when calling ajustarContaUsingPOST");
     }
     
     // verify the required parameter 'dataAjuste' is set
     if (dataAjuste == null) {
        throw new ApiException(400, "Missing the required parameter 'dataAjuste' when calling ajustarContaUsingPOST");
     }
     
     // verify the required parameter 'valorAjuste' is set
     if (valorAjuste == null) {
        throw new ApiException(400, "Missing the required parameter 'valorAjuste' when calling ajustarContaUsingPOST");
     }
     
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling ajustarContaUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/ajustes-financeiros".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoAjuste", idTipoAjuste));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAjuste", dataAjuste));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valorAjuste", valorAjuste));
    
    queryParams.addAll(apiClient.parameterToPairs("", "identificadorExterno", identificadorExterno));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTransacaoOriginal", idTransacaoOriginal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    

    if (login != null)
      headerParams.put("login", apiClient.parameterToString(login));
    

    

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

    
    GenericType<AjusteFinanceiroResponse> returnType = new GenericType<AjusteFinanceiroResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{ajuste_financeiro_resource_consultar}}}
   * {{{ajuste_financeiro_resource_consultar_notes}}}
   * @param id {{{ajuste_financeiro_resource_consultar_param_id}}}
   * @return AjusteFinanceiroResponse
   */
  public AjusteFinanceiroResponse consultarUsingGET3(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET3");
     }
     
    // create path and map variables
    String path = "/api/ajustes-financeiros/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<AjusteFinanceiroResponse> returnType = new GenericType<AjusteFinanceiroResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{ajuste_financeiro_resource_listar}}}
   * {{{ajuste_financeiro_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idTipoAjuste {{{ajuste_request_id_tipo_ajuste_value}}}
   * @param dataAjuste {{{ajuste_request_data_ajuste_value}}}
   * @param valorAjuste {{{ajuste_request_valor_ajuste_value}}}
   * @param identificadorExterno {{{ajuste_request_identificador_externo_value}}}
   * @param idConta {{{ajuste_request_id_conta_value}}}
   * @return PageAjusteResponse
   */
  public PageAjusteResponse listarUsingGET2(List<String> sort, Integer page, Integer limit, Long idTipoAjuste, String dataAjuste, BigDecimal valorAjuste, String identificadorExterno, Long idConta) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/ajustes-financeiros".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoAjuste", idTipoAjuste));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAjuste", dataAjuste));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valorAjuste", valorAjuste));
    
    queryParams.addAll(apiClient.parameterToPairs("", "identificadorExterno", identificadorExterno));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    

    

    

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

    
    GenericType<PageAjusteResponse> returnType = new GenericType<PageAjusteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
