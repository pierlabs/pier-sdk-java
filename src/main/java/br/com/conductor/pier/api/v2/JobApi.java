package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.JobResponse;
import br.com.conductor.pier.api.v2.model.PageJobResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class JobApi {
  private ApiClient apiClient;

  public JobApi() {
    this(Configuration.getDefaultApiClient());
  }

  public JobApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Ativar Job
   * Este recurso adiciona o job ao agendador de tarefas.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Job (id).
   * @return JobResponse
   */
  public JobResponse ativarJobUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ativarJobUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/jobs/{id}/ativar-job".replaceAll("\\{format\\}","json")
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

    
    GenericType<JobResponse> returnType = new GenericType<JobResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Atualizar Job
   * Este recurso permite atualizar os dados de um job cadastrado.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Job (id).
   * @param descricao descricao.
   * @param cron Cron do Job.
   * @param groovy groovy
   * @return JobResponse
   */
  public JobResponse atualizarUsingPUT3(Long id, String descricao, String cron, String groovy) throws ApiException {
    Object postBody = groovy;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarUsingPUT3");
     }
     
     // verify the required parameter 'descricao' is set
     if (descricao == null) {
        throw new ApiException(400, "Missing the required parameter 'descricao' when calling atualizarUsingPUT3");
     }
     
     // verify the required parameter 'cron' is set
     if (cron == null) {
        throw new ApiException(400, "Missing the required parameter 'cron' when calling atualizarUsingPUT3");
     }
     
     // verify the required parameter 'groovy' is set
     if (groovy == null) {
        throw new ApiException(400, "Missing the required parameter 'groovy' when calling atualizarUsingPUT3");
     }
     
    // create path and map variables
    String path = "/api/jobs/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cron", cron));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "text/plain"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<JobResponse> returnType = new GenericType<JobResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Desativar Job
   * Este recurso retira o job do agendador de tarefas.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Job (id).
   * @return JobResponse
   */
  public JobResponse desativarJobUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarJobUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/jobs/{id}/desativar-job".replaceAll("\\{format\\}","json")
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

    
    GenericType<JobResponse> returnType = new GenericType<JobResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar Jobs
   * Este recurso permite que sejam listados os jobs existentes na base do PIER.
   * @param groovy Script Groovy do Job
   * @param descricao Descri\u00C3\u00A7\u00C3\u00A3o do Job
   * @param cron Cron do Job
   * @param status Status do Job
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageJobResponse
   */
  public PageJobResponse listarUsingGET20(String groovy, String descricao, String cron, String status, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/jobs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "groovy", groovy));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cron", cron));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
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

    
    GenericType<PageJobResponse> returnType = new GenericType<PageJobResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastrar Job
   * Esse recurso permite cadastrar jobs.
   * @param descricao descricao.
   * @param cron Cron do Job.
   * @param groovy groovy
   * @return JobResponse
   */
  public JobResponse salvarUsingPOST14(String descricao, String cron, String groovy) throws ApiException {
    Object postBody = groovy;
    
     // verify the required parameter 'descricao' is set
     if (descricao == null) {
        throw new ApiException(400, "Missing the required parameter 'descricao' when calling salvarUsingPOST14");
     }
     
     // verify the required parameter 'cron' is set
     if (cron == null) {
        throw new ApiException(400, "Missing the required parameter 'cron' when calling salvarUsingPOST14");
     }
     
     // verify the required parameter 'groovy' is set
     if (groovy == null) {
        throw new ApiException(400, "Missing the required parameter 'groovy' when calling salvarUsingPOST14");
     }
     
    // create path and map variables
    String path = "/api/jobs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cron", cron));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "text/plain"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<JobResponse> returnType = new GenericType<JobResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

