package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.ParametroEmissorResponse;
import br.com.conductor.pier.api.v2.model.ParametrosProdutoResponse;
import br.com.conductor.pier.api.v2.model.PageParametroProdutoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagparametroApi {
  private ApiClient apiClient;

  public GlobaltagparametroApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagparametroApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{parametro_emissor_recurso}}}
   * {{{parametro_emissor_recurso_notas}}}
   * @param codigo {{{parametro_emissor_recurso_pesquisa_codigo_param}}}
   * @return ParametroEmissorResponse
   */
  public ParametroEmissorResponse consultarUsingGET27(String codigo) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'codigo' is set
     if (codigo == null) {
        throw new ApiException(400, "Missing the required parameter 'codigo' when calling consultarUsingGET27");
     }
     
    // create path and map variables
    String path = "/api/parametros-emissor/{codigo}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "codigo" + "\\}", apiClient.escapeString(codigo.toString()));

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

    
    GenericType<ParametroEmissorResponse> returnType = new GenericType<ParametroEmissorResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{parametro_produto_consultar}}}
   * {{{parametro_produto_consultar_notas}}}
   * @param id id
   * @return ParametrosProdutoResponse
   */
  public ParametrosProdutoResponse consultarUsingGET28(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET28");
     }
     
    // create path and map variables
    String path = "/api/parametros-produto/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ParametrosProdutoResponse> returnType = new GenericType<ParametrosProdutoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{parametro_produto_listar}}}
   * {{{parametro_produto_listar_notas}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{parametro_produto_dto_id_value}}}
   * @param codigo {{{parametro_produto_dto_codigo_value}}}
   * @param tipo {{{parametro_produto_dto_tipo_value}}}
   * @param idProduto {{{parametro_produto_dto_id_produto_value}}}
   * @param descricao {{{parametro_produto_dto_descricao_value}}}
   * @return PageParametroProdutoResponse
   */
  public PageParametroProdutoResponse listarParametrosProdutoUsingGET(List<String> sort, Integer page, Integer limit, Long id, String codigo, String tipo, Long idProduto, String descricao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/parametros-produto".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigo", codigo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipo", tipo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    
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

    
    GenericType<PageParametroProdutoResponse> returnType = new GenericType<PageParametroProdutoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
