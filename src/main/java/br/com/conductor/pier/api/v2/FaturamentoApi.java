package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.TipoFaturamentoPersist;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoResponse;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoPorContaPersist;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoPorContaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoFaturamentoPorContaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoFaturamentoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class FaturamentoApi {
  private ApiClient apiClient;

  public FaturamentoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FaturamentoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Alterar Faturamento
   * Alterar as configura\u00E7\u00F5es de um determinado tipo de faturamento
   * @param id Id
   * @param tipoFaturamentoPersist tipoFaturamentoPersist
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse alterarTipoFaturamento(Long id, TipoFaturamentoPersist tipoFaturamentoPersist) throws ApiException {
    Object postBody = tipoFaturamentoPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTipoFaturamento");
     }
     
     // verify the required parameter 'tipoFaturamentoPersist' is set
     if (tipoFaturamentoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'tipoFaturamentoPersist' when calling alterarTipoFaturamento");
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
   * Adiciona uma nova configura\u00E7\u00E3o de faturamento para uma conta
   * Este m\u00E9todo permite adicionar uma nova configura\u00E7\u00E3o de tipo de faturamento para um conta espec\u00EDfica
   * @param tipoFaturamentoPorContaPersist tipoFaturamentoPorContaPersist
   * @return TipoFaturamentoPorContaResponse
   */
  public TipoFaturamentoPorContaResponse cadastrarFaturamentoPorConta(TipoFaturamentoPorContaPersist tipoFaturamentoPorContaPersist) throws ApiException {
    Object postBody = tipoFaturamentoPorContaPersist;
    
     // verify the required parameter 'tipoFaturamentoPorContaPersist' is set
     if (tipoFaturamentoPorContaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'tipoFaturamentoPorContaPersist' when calling cadastrarFaturamentoPorConta");
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
   * Adiciona um novo faturamento
   * Adiciona uma nova configura\u00E7\u00E3o de tipo de faturamento
   * @param tipoFaturamentoPersist tipoFaturamentoPersist
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse cadastrarTipoFaturamento(TipoFaturamentoPersist tipoFaturamentoPersist) throws ApiException {
    Object postBody = tipoFaturamentoPersist;
    
     // verify the required parameter 'tipoFaturamentoPersist' is set
     if (tipoFaturamentoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'tipoFaturamentoPersist' when calling cadastrarTipoFaturamento");
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
   * Consultar Faturamento por id
   * Consulta os detalhes de uma determinada Faturamento
   * @param id Id
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse consultarTipoFaturamento(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTipoFaturamento");
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
   * Desativar uma configura\u00E7\u00E3o de tipo de faturamento por conta atrav\u00E9s do id
   * Desativa uma configura\u00E7\u00E3o de tipo de faturamento de uma determinada conta
   * @param id Id
   * @return TipoFaturamentoPorContaResponse
   */
  public TipoFaturamentoPorContaResponse desativarFaturamentoPorConta(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarFaturamentoPorConta");
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
   * Desativar uma configura\u00E7\u00E3o de tipo de faturamento atrav\u00E9s do id
   * Desativa uma configura\u00E7\u00E3o de tipo de faturamento
   * @param id Id
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse desativarTipoFaturamento(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarTipoFaturamento");
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
   * Lista as configura\u00E7\u00F5es de tipos de faturamento por conta
   * Este m\u00E9todo permite listar as configura\u00E7\u00F5es de tipos de faturamento registrados a uma conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idTipoFaturamentoPorConta C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento por conta (id)
   * @param ativo Representa se a configura\u00E7\u00E3o est\u00E1 ativada ou desativada para a conta
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento por conta (id)
   * @param idTipoFaturamento C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento relacionada (id)
   * @param dataHoraInclusao Data da inclus\u00E3o da configura\u00E7\u00E3o, deve ser informada no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
   * @param dataHoraCancelamento Data do cancelamento da configura\u00E7\u00E3o, deve ser informada no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
   * @param modificadoPor Identificador do respons\u00E1vel pela modifica\u00E7\u00E3o do registro
   * @return PageTipoFaturamentoPorContaResponse
   */
  public PageTipoFaturamentoPorContaResponse listarFaturamentoPorConta(List<String> sort, Integer page, Integer limit, Long idTipoFaturamentoPorConta, Boolean ativo, Long idConta, Long idTipoFaturamento, String dataHoraInclusao, String dataHoraCancelamento, String modificadoPor) throws ApiException {
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
   * Lista Tipos de Faturamento
   * Lista todas as configura\u00E7\u00F5es dos tipos de faturamento
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idTipoFaturamento C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento (id)
   * @param descricao Descri\u00E7\u00E3o do tipo de faturamento
   * @param flagApenasDemonstrativo Flag que representa que o faturamento ser\u00E1 apenas demonstrativo
   * @param idConvenio C\u00F3digo de identifica\u00E7\u00E3o do conv\u00EAnio relacionado ao tipo de faturamento
   * @return PageTipoFaturamentoResponse
   */
  public PageTipoFaturamentoResponse listarTipoFaturamento(List<String> sort, Integer page, Integer limit, Long idTipoFaturamento, String descricao, Boolean flagApenasDemonstrativo, Long idConvenio) throws ApiException {
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
