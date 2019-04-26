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
public class ContestaoApi {
  private ApiClient apiClient;

  public ContestaoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContestaoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Lista status das contesta\u00E7\u00F5es
   * Este recurso permite a listagem do status das contesta\u00E7\u00F5es
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idStatusContestacao Id status da contesta\u00E7\u00E3o
   * @param idStatusContestacaoOrigem Id status da contesta\u00E7\u00E3o origem
   * @param descricao Decri\u00E7\u00E3o da contesta\u00E7\u00E3o
   * @param flagPermiteAlteracao Flag de verifica\u00E7\u00E3o de permiss\u00E3o para altera\u00E7\u00E3o
   * @param flagSistema Flag do sistema
   * @return PageStatusContestacaoResponse
   */
  public PageStatusContestacaoResponse listarStatusContestacao(List<String> sort, Integer page, Integer limit, Long idStatusContestacao, Long idStatusContestacaoOrigem, String descricao, Integer flagPermiteAlteracao, Integer flagSistema) throws ApiException {
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
   * Listar tipo da contesta\u00E7\u00E3o
   * Este recurso permite a listagem dos tipos de contesta\u00E7\u00F5es
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idTipoResolucaoContestacao Id tipo da resolucao da contesta\u00E7\u00E3o
   * @param descricao Descri\u00E7\u00E3o do tipo de resolu\u00E7\u00E3o da contesta\u00E7\u00E3o
   * @return PageTipoResolucaoContestacaoResponse
   */
  public PageTipoResolucaoContestacaoResponse listarTipoResolucaoContestacao(List<String> sort, Integer page, Integer limit, Long idTipoResolucaoContestacao, String descricao) throws ApiException {
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
