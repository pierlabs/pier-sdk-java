package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.ContestarCompraRequest;
import br.com.conductor.pier.api.v2.model.PageGrupoChargebackResponse;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagcompracontestadaApi {
  private ApiClient apiClient;

  public GlobaltagcompracontestadaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagcompracontestadaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{compra_contestada_transacoes_resource_contestar}}}
   * {{{compra_contestada_transacoes_resource_contestar_notes}}}
   * @param idCartao idCartao
   * @param request request
   * @param login login
   * @return Object
   */
  public Object contestarUsingPOST(Long idCartao, ContestarCompraRequest request, String login) throws ApiException {
    Object postBody = login;
    
     // verify the required parameter 'idCartao' is set
     if (idCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idCartao' when calling contestarUsingPOST");
     }
     
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling contestarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/cartoes-com-contestacoes/{idCartao}/contestar".replaceAll("\\{format\\}","json")
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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{compra_contestada_detalhe_cartao_resource_listar}}}
   * {{{compra_contestada_detalhe_cartao_resource_listar_notes}}}
   * @param idCartao idCartao
   * @return PageGrupoChargebackResponse
   */
  public PageGrupoChargebackResponse detalheCartaoUsingGET(Long idCartao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idCartao' is set
     if (idCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idCartao' when calling detalheCartaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/cartoes-com-contestacoes/{idCartao}".replaceAll("\\{format\\}","json")
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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageGrupoChargebackResponse> returnType = new GenericType<PageGrupoChargebackResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_com_compra_contestada_resource_listar}}}
   * {{{cartao_com_compra_contestada_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param agingContestacao 
   * @param nome 
   * @param bandeira 
   * @param cartao 
   * @param cpf 
   * @param conta 
   * @param autorizacao 
   * @param statusCartao 
   * @param statusContestacao 
   * @param dataContestacaoInicio 
   * @param dataContestacaoFim 
   * @param dataAlteracaoInicio 
   * @param dataAlteracaoFim 
   * @param dataReapresentacaoInicio 
   * @param dataReapresentacaoFim 
   * @param diasContestacao 
   * @param diasCompra 
   * @param modoEntrada 
   * @param motivo 
   * @param valorCompra 
   * @return PageGrupoChargebackResponse
   */
  public PageGrupoChargebackResponse listarUsingGET11(List<String> sort, Integer page, Integer limit, Long agingContestacao, String nome, String bandeira, String cartao, String cpf, String conta, String autorizacao, Long statusCartao, Long statusContestacao, String dataContestacaoInicio, String dataContestacaoFim, String dataAlteracaoInicio, String dataAlteracaoFim, String dataReapresentacaoInicio, String dataReapresentacaoFim, Long diasContestacao, Long diasCompra, String modoEntrada, String motivo, BigDecimal valorCompra) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/cartoes-com-contestacoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "agingContestacao", agingContestacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "bandeira", bandeira));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cartao", cartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(apiClient.parameterToPairs("", "conta", conta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "autorizacao", autorizacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "statusCartao", statusCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "statusContestacao", statusContestacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataContestacaoInicio", dataContestacaoInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataContestacaoFim", dataContestacaoFim));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAlteracaoInicio", dataAlteracaoInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAlteracaoFim", dataAlteracaoFim));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataReapresentacaoInicio", dataReapresentacaoInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataReapresentacaoFim", dataReapresentacaoFim));
    
    queryParams.addAll(apiClient.parameterToPairs("", "diasContestacao", diasContestacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "diasCompra", diasCompra));
    
    queryParams.addAll(apiClient.parameterToPairs("", "modoEntrada", modoEntrada));
    
    queryParams.addAll(apiClient.parameterToPairs("", "motivo", motivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valorCompra", valorCompra));
    

    

    

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

    
    GenericType<PageGrupoChargebackResponse> returnType = new GenericType<PageGrupoChargebackResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{compra_contestada_transacoes_resource_listar}}}
   * {{{compra_contestada_transacoes_resource_listar_notes}}}
   * @param idCartao idCartao
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param agingContestacao 
   * @param nome 
   * @param bandeira 
   * @param cartao 
   * @param cpf 
   * @param conta 
   * @param autorizacao 
   * @param statusCartao 
   * @param statusContestacao 
   * @param dataContestacaoInicio 
   * @param dataContestacaoFim 
   * @param dataAlteracaoInicio 
   * @param dataAlteracaoFim 
   * @param dataReapresentacaoInicio 
   * @param dataReapresentacaoFim 
   * @param diasContestacao 
   * @param diasCompra 
   * @param modoEntrada 
   * @param motivo 
   * @param valorCompra 
   * @return PageGrupoChargebackResponse
   */
  public PageGrupoChargebackResponse transacaoUsingGET(Long idCartao, List<String> sort, Integer page, Integer limit, Long agingContestacao, String nome, String bandeira, String cartao, String cpf, String conta, String autorizacao, Long statusCartao, Long statusContestacao, String dataContestacaoInicio, String dataContestacaoFim, String dataAlteracaoInicio, String dataAlteracaoFim, String dataReapresentacaoInicio, String dataReapresentacaoFim, Long diasContestacao, Long diasCompra, String modoEntrada, String motivo, BigDecimal valorCompra) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idCartao' is set
     if (idCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idCartao' when calling transacaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/cartoes-com-contestacoes/{idCartao}/transacoes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idCartao" + "\\}", apiClient.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "agingContestacao", agingContestacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "bandeira", bandeira));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cartao", cartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(apiClient.parameterToPairs("", "conta", conta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "autorizacao", autorizacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "statusCartao", statusCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "statusContestacao", statusContestacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataContestacaoInicio", dataContestacaoInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataContestacaoFim", dataContestacaoFim));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAlteracaoInicio", dataAlteracaoInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAlteracaoFim", dataAlteracaoFim));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataReapresentacaoInicio", dataReapresentacaoInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataReapresentacaoFim", dataReapresentacaoFim));
    
    queryParams.addAll(apiClient.parameterToPairs("", "diasContestacao", diasContestacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "diasCompra", diasCompra));
    
    queryParams.addAll(apiClient.parameterToPairs("", "modoEntrada", modoEntrada));
    
    queryParams.addAll(apiClient.parameterToPairs("", "motivo", motivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valorCompra", valorCompra));
    

    

    

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

    
    GenericType<PageGrupoChargebackResponse> returnType = new GenericType<PageGrupoChargebackResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
