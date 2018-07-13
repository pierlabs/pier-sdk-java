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

public class GlobaltagjobApi {
  private ApiClient apiClient;

  public GlobaltagjobApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagjobApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{job_resource_ativar_job}}}
   * {{{job_resource_ativar_job_notes}}}
   * @param id {{{job_resource_ativar_job_param_id}}}
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
   * {{{job_resource_atualizar}}}
   * {{{job_resource_atualizar_notes}}}
   * @param id {{{job_resource_atualizar_param_id}}}
   * @param descricao {{{job_resource_atualizar_param_descricao}}}
   * @param cron {{{job_resource_atualizar_param_cron}}}
   * @param groovy groovy
   * @return JobResponse
   */
  public JobResponse atualizarUsingPUT4(Long id, String descricao, String cron, String groovy) throws ApiException {
    Object postBody = groovy;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarUsingPUT4");
     }
     
     // verify the required parameter 'descricao' is set
     if (descricao == null) {
        throw new ApiException(400, "Missing the required parameter 'descricao' when calling atualizarUsingPUT4");
     }
     
     // verify the required parameter 'cron' is set
     if (cron == null) {
        throw new ApiException(400, "Missing the required parameter 'cron' when calling atualizarUsingPUT4");
     }
     
     // verify the required parameter 'groovy' is set
     if (groovy == null) {
        throw new ApiException(400, "Missing the required parameter 'groovy' when calling atualizarUsingPUT4");
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
   * {{{job_resource_desativar_job}}}
   * {{{job_resource_desativar_job_notes}}}
   * @param id {{{job_resource_desativar_job_param_id}}}
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
   * {{{job_resource_listar}}}
   * {{{job_resource_listar_notes}}}
   * @param groovy {{{job_d_t_o_groovy_value}}}
   * @param descricao {{{job_d_t_o_descricao_value}}}
   * @param cron {{{job_d_t_o_cron_value}}}
   * @param status {{{job_d_t_o_status_value}}}
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageJobResponse
   */
  public PageJobResponse listarUsingGET31(String groovy, String descricao, String cron, String status, Integer page, Integer limit) throws ApiException {
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
   * {{{job_resource_salvar}}}
   * {{{job_resource_salvar_notes}}}
   * @param descricao {{{job_resource_salvar_param_descricao}}}
   * @param cron {{{job_resource_salvar_param_cron}}}
   * @param groovy groovy
   * @return JobResponse
   */
  public JobResponse salvarUsingPOST17(String descricao, String cron, String groovy) throws ApiException {
    Object postBody = groovy;
    
     // verify the required parameter 'descricao' is set
     if (descricao == null) {
        throw new ApiException(400, "Missing the required parameter 'descricao' when calling salvarUsingPOST17");
     }
     
     // verify the required parameter 'cron' is set
     if (cron == null) {
        throw new ApiException(400, "Missing the required parameter 'cron' when calling salvarUsingPOST17");
     }
     
     // verify the required parameter 'groovy' is set
     if (groovy == null) {
        throw new ApiException(400, "Missing the required parameter 'groovy' when calling salvarUsingPOST17");
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

