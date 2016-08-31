package br.com.conductor.pier.api.v1_1;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v1_1.invoker.ApiException;
import br.com.conductor.pier.api.v1_1.invoker.ApiClient;
import br.com.conductor.pier.api.v1_1.invoker.Configuration;
import br.com.conductor.pier.api.v1_1.invoker.Pair;

import br.com.conductor.pier.api.v1_1.model.EstagioCartao;
import br.com.conductor.pier.api.v1_1.model.ListaEstagiosCartoes;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class EstagioCartaoApi {
  private ApiClient apiClient;

  public EstagioCartaoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EstagioCartaoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Apresenta os dados de um determinado Estagio Cart\u00C3\u00A3o 
   * Este m\u00C3\u00A9todo permite consultar os par\u00C3\u00A2metros de um determinado Est\u00C3\u00A1gio de Entrega do Cart\u00C3\u00A3o a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).  
   * @param idEstagioCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Est\u00C3\u00A1gio de Entrega do Cart\u00C3\u00A3o (id).
   * @return EstagioCartao
   */
  public EstagioCartao consultarEstagioCartaoUsingGET(Long idEstagioCartao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idEstagioCartao' is set
     if (idEstagioCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idEstagioCartao' when calling consultarEstagioCartaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/estagios-cartoes/{id_estagio_cartao}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id_estagio_cartao" + "\\}", apiClient.escapeString(idEstagioCartao.toString()));

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

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<EstagioCartao> returnType = new GenericType<EstagioCartao>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as op\u00C3\u00A7\u00C3\u00B5es de Est\u00C3\u00A1gios do Cart\u00C3\u00A3o 
   * Este m\u00C3\u00A9todo permite que sejam listadas as op\u00C3\u00A7\u00C3\u00B5es de Est\u00C3\u00A1gio de Entrega que podem ser atribu\u00C3\u00ADdas aos Cart\u00C3\u00B5es.
   * @param id Id do est\u00C3\u00A1gio cart\u00C3\u00A3o
   * @param nome Nome do est\u00C3\u00A1gio cart\u00C3\u00A3o
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @return ListaEstagiosCartoes
   */
  public ListaEstagiosCartoes listarEstagiosCartoesUsingGET(Long id, String nome, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/estagios-cartoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
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

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<ListaEstagiosCartoes> returnType = new GenericType<ListaEstagiosCartoes>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

