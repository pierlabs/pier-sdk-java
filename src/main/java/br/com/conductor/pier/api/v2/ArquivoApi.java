package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.ArquivoDetalheResponse;
import br.com.conductor.pier.api.v2.model.IntegrarArquivoRequest;
import br.com.conductor.pier.api.v2.model.PageArquivoAUDResponse;
import br.com.conductor.pier.api.v2.model.PageArquivoResponse;
import br.com.conductor.pier.api.v2.model.ArquivoPersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ArquivoApi {
  private ApiClient apiClient;

  public ArquivoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ArquivoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Consulta de arquivo no PIER Cloud
   * Este recurso permite consultar um determinado arquivo armazenado no PIER Cloud.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do arquivo
   * @return ArquivoDetalheResponse
   */
  public ArquivoDetalheResponse consultarUsingGET2(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET2");
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
   * Integrar Arquivos
   * Este recurso foi desenvolvido para realizar a integra\u00C3\u00A7\u00C3\u00A3o de arquivos do PIER Cloud junto a reposit\u00C3\u00B3rios externos pr\u00C3\u00A9-configurado.
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
   * Lista as auditorias do arquivo
   * Este recurso permite listar as auditorias de um determinado arquivo a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do arquivo
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageArquivoAUDResponse
   */
  public PageArquivoAUDResponse listarUsingGET3(Long id, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarUsingGET3");
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
   * Listar arquivos do Pier Cloud
   * Este recurso permite a listagem de todos os arquivos dispon\u00C3\u00ADveis no Pier Cloud.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param nome Nome do arquivo
   * @param idTipoArquivo Tipo do arquivo
   * @param idStatusArquivo Identificador do status do arquivo
   * @param extensao Extens\u00C3\u00A3o do arquivo
   * @return PageArquivoResponse
   */
  public PageArquivoResponse listarUsingGET4(List<String> sort, Integer page, Integer limit, String nome, Long idTipoArquivo, Long idStatusArquivo, String extensao) throws ApiException {
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
   * Permite armazenar arquivos no PIER Cloud
   * Este recurso permite o armazenamento de arquivos no PIER Cloud.
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
