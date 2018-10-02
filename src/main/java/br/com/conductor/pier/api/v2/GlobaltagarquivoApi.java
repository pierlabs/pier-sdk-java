package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.ArquivoDetalheResponse;
import br.com.conductor.pier.api.v2.model.IntegrarArquivoRequest;
import br.com.conductor.pier.api.v2.model.PageArquivoAUDResponse;
import br.com.conductor.pier.api.v2.model.PageStatusArquivoResponse;
import br.com.conductor.pier.api.v2.model.PageTipoArquivoResponse;
import br.com.conductor.pier.api.v2.model.PageArquivoResponse;
import br.com.conductor.pier.api.v2.model.ArquivoPersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagarquivoApi {
  private ApiClient apiClient;

  public GlobaltagarquivoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagarquivoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{arquivo_resource_consultar}}}
   * {{{arquivo_resource_consultar_notes}}}
   * @param id {{{arquivo_resource_consultar_param_id}}}
   * @return ArquivoDetalheResponse
   */
  public ArquivoDetalheResponse consultarUsingGET5(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET5");
     }
     
    // create path and map variables
    String path = "/api/arquivos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ArquivoDetalheResponse> returnType = new GenericType<ArquivoDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{arquivo_resource_integrar}}}
   * {{{arquivo_resource_integrar_notes}}}
   * @param integrarArquivoRequest integrarArquivoRequest
   * @return Object
   */
  public Object integrarUsingPOST(IntegrarArquivoRequest integrarArquivoRequest) throws ApiException {
    Object postBody = integrarArquivoRequest;
    
     // verify the required parameter 'integrarArquivoRequest' is set
     if (integrarArquivoRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'integrarArquivoRequest' when calling integrarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/arquivos/integrar".replaceAll("\\{format\\}","json");

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
   * {{{arquivo_a_u_d_resource_listar_por_numero_receita_federal}}}
   * {{{arquivo_a_u_d_resource_listar_por_numero_receita_federal_notes}}}
   * @param numeroReceitaFederal {{{arquivo_a_u_d_resource_listar_por_numero_receita_federal_param_numero_receita_federal}}}
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageArquivoAUDResponse
   */
  public PageArquivoAUDResponse listarPorNumeroReceitaFederalUsingGET(String numeroReceitaFederal, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'numeroReceitaFederal' is set
     if (numeroReceitaFederal == null) {
        throw new ApiException(400, "Missing the required parameter 'numeroReceitaFederal' when calling listarPorNumeroReceitaFederalUsingGET");
     }
     
    // create path and map variables
    String path = "/api/arquivos-auditorias".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
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

    
    GenericType<PageArquivoAUDResponse> returnType = new GenericType<PageArquivoAUDResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{arquivo_resource_listar_status_arquivos}}}
   * {{{arquivo_resource_listar_status_arquivos_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param nome {{{status_arquivo_request_nome_value}}}
   * @param descricao {{{status_arquivo_request_descricao_value}}}
   * @return PageStatusArquivoResponse
   */
  public PageStatusArquivoResponse listarStatusArquivosUsingGET(List<String> sort, Integer page, Integer limit, String nome, String descricao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/status-arquivos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
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

    
    GenericType<PageStatusArquivoResponse> returnType = new GenericType<PageStatusArquivoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{arquivo_resource_listar_tipos_arquivos}}}
   * {{{arquivo_resource_listar_tipos_arquivos_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param nome {{{tipo_arquivo_request_nome_value}}}
   * @param descricao {{{tipo_arquivo_request_descricao_value}}}
   * @return PageTipoArquivoResponse
   */
  public PageTipoArquivoResponse listarTiposArquivosUsingGET(List<String> sort, Integer page, Integer limit, String nome, String descricao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-arquivos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
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

    
    GenericType<PageTipoArquivoResponse> returnType = new GenericType<PageTipoArquivoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{arquivo_a_u_d_resource_listar}}}
   * {{{arquivo_a_u_d_resource_listar_notes}}}
   * @param id {{{arquivo_a_u_d_resource_listar_param_id}}}
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageArquivoAUDResponse
   */
  public PageArquivoAUDResponse listarUsingGET5(Long id, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarUsingGET5");
     }
     
    // create path and map variables
    String path = "/api/arquivos/{id}/auditorias".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
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

    
    GenericType<PageArquivoAUDResponse> returnType = new GenericType<PageArquivoAUDResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{arquivo_resource_listar}}}
   * {{{arquivo_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param nome {{{arquivo_request_nome_value}}}
   * @param idTipoArquivo {{{arquivo_request_id_tipo_arquivo_value}}}
   * @param idStatusArquivo {{{arquivo_request_id_status_arquivo_value}}}
   * @param extensao {{{arquivo_request_extensao_value}}}
   * @return PageArquivoResponse
   */
  public PageArquivoResponse listarUsingGET6(List<String> sort, Integer page, Integer limit, String nome, Long idTipoArquivo, Long idStatusArquivo, String extensao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/arquivos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoArquivo", idTipoArquivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idStatusArquivo", idStatusArquivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "extensao", extensao));
    

    

    

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

    
    GenericType<PageArquivoResponse> returnType = new GenericType<PageArquivoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{arquivo_resource_salvar}}}
   * {{{arquivo_resource_salvar_notes}}}
   * @param arquivoPersist arquivoPersist
   * @return ArquivoDetalheResponse
   */
  public ArquivoDetalheResponse salvarUsingPOST1(ArquivoPersist arquivoPersist) throws ApiException {
    Object postBody = arquivoPersist;
    
     // verify the required parameter 'arquivoPersist' is set
     if (arquivoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'arquivoPersist' when calling salvarUsingPOST1");
     }
     
    // create path and map variables
    String path = "/api/arquivos".replaceAll("\\{format\\}","json");

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

    
    GenericType<ArquivoDetalheResponse> returnType = new GenericType<ArquivoDetalheResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
