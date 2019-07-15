package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.OperacaoBancariaParcialUpdate;
import br.com.conductor.pier.api.v2.model.OperacaoBancariaResponse;
import br.com.conductor.pier.api.v2.model.PageOperacaoBancariaResponse;
import br.com.conductor.pier.api.v2.model.TipoOperacaoBancariaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoOperacaoBancariaResponse;
import br.com.conductor.pier.api.v2.model.OperacaoBancariaPersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OperacoesBancariasApi {
  private ApiClient apiClient;

  public OperacoesBancariasApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OperacoesBancariasApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Atualiza\u00E7\u00E3o parcial da opera\u00E7\u00E3o banc\u00E1ria
   * Este recurso permite atualizar parcialmente uma Operac\u00E3o Banc\u00E1ria
   * @param id Identificador da conta
   * @param idOperacaoBancaria Identificador da opera\u00E7\u00E3o banc\u00E1ria
   * @param parcialUpdate parcialUpdate
   * @return OperacaoBancariaResponse
   */
  public OperacaoBancariaResponse atualizarParcialmenteOperacaoBancaria(Long id, Long idOperacaoBancaria, OperacaoBancariaParcialUpdate parcialUpdate) throws ApiException {
    Object postBody = parcialUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarParcialmenteOperacaoBancaria");
     }
     
     // verify the required parameter 'idOperacaoBancaria' is set
     if (idOperacaoBancaria == null) {
        throw new ApiException(400, "Missing the required parameter 'idOperacaoBancaria' when calling atualizarParcialmenteOperacaoBancaria");
     }
     
     // verify the required parameter 'parcialUpdate' is set
     if (parcialUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'parcialUpdate' when calling atualizarParcialmenteOperacaoBancaria");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/operacoes-bancarias/{idOperacaoBancaria}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idOperacaoBancaria" + "\\}", apiClient.escapeString(idOperacaoBancaria.toString()));

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

    
    GenericType<OperacaoBancariaResponse> returnType = new GenericType<OperacaoBancariaResponse>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta de opera\u00E7\u00F5es banc\u00E1rias
   * Este m\u00E9todo permite consultar opera\u00E7\u00F5es banc\u00E1rias
   * @param id id
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idOperacao C\u00F3digo Identificador da opera\u00E7\u00E3o
   * @param dataGeracaoInicial Data de gera\u00E7\u00E3o inicial do registro
   * @param dataGeracaoFinal Data de gera\u00E7\u00E3o final do registro
   * @param idTipoOperacaoBancaria Identificador do tipo da opera\u00E7\u00E3o banc\u00E1ria
   * @param statusOperacao Status da opera\u00E7\u00E3o banc\u00E1ria
   * @return PageOperacaoBancariaResponse
   */
  public PageOperacaoBancariaResponse consultarOperacaoBancaria(Long id, List<String> sort, Integer page, Integer limit, Long idOperacao, String dataGeracaoInicial, String dataGeracaoFinal, Long idTipoOperacaoBancaria, String statusOperacao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarOperacaoBancaria");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/operacoes-bancarias".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idOperacao", idOperacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataGeracaoInicial", dataGeracaoInicial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataGeracaoFinal", dataGeracaoFinal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoOperacaoBancaria", idTipoOperacaoBancaria));
    
    queryParams.addAll(apiClient.parameterToPairs("", "statusOperacao", statusOperacao));
    

    

    

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

    
    GenericType<PageOperacaoBancariaResponse> returnType = new GenericType<PageOperacaoBancariaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Busca um tipo de opera\u00E7\u00E3o banc\u00E1ria
   * Este recurso busca um tipo de opera\u00E7\u00E3o banc\u00E1ria
   * @param id Identificador do tipo de opera\u00E7\u00E3o banc\u00E1ria
   * @return TipoOperacaoBancariaResponse
   */
  public TipoOperacaoBancariaResponse consultarTipoOperacaoBancaria(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTipoOperacaoBancaria");
     }
     
    // create path and map variables
    String path = "/api/tipos-operacoes-bancarias/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoOperacaoBancariaResponse> returnType = new GenericType<TipoOperacaoBancariaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista tipos de opera\u00E7\u00F5es banc\u00E1rias
   * Este recurso lista tipos de opera\u00E7\u00F5es banc\u00E1rias
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param descricao Descri\u00E7\u00E3o do tipo da opera\u00E7\u00E3o banc\u00E1ria
   * @param idTipoTemplate Identificador do template
   * @return PageTipoOperacaoBancariaResponse
   */
  public PageTipoOperacaoBancariaResponse listarTiposOperacoesBancarias(List<String> sort, Integer page, Integer limit, String descricao, Long idTipoTemplate) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-operacoes-bancarias".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoTemplate", idTipoTemplate));
    

    

    

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

    
    GenericType<PageTipoOperacaoBancariaResponse> returnType = new GenericType<PageTipoOperacaoBancariaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastra opera\u00E7\u00E3o banc\u00E1ria
   * Este recurso permite cadastrar uma opera\u00E7\u00E3o banc\u00E1ria
   * @param id Identificador da conta
   * @param persist persist
   * @return OperacaoBancariaResponse
   */
  public OperacaoBancariaResponse salvarOperacaoBancaria(Long id, OperacaoBancariaPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvarOperacaoBancaria");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarOperacaoBancaria");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/operacoes-bancarias".replaceAll("\\{format\\}","json")
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

    
    GenericType<OperacaoBancariaResponse> returnType = new GenericType<OperacaoBancariaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
