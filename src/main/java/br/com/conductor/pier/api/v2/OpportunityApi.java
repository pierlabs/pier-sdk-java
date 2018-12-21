package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.OportunidadeResponse;
import br.com.conductor.pier.api.v2.model.OpportunityUpdate;
import br.com.conductor.pier.api.v2.model.StatusOpportunity;
import br.com.conductor.pier.api.v2.model.StatusOportunidadeResponse;
import br.com.conductor.pier.api.v2.model.TypeOpportunity;
import br.com.conductor.pier.api.v2.model.TipoOportunidadeResponse;
import br.com.conductor.pier.api.v2.model.PageOportunidadeResponse;
import br.com.conductor.pier.api.v2.model.PageOportunidadeAUDResponse;
import br.com.conductor.pier.api.v2.model.PageStatusOportunidadeAUDResponse;
import br.com.conductor.pier.api.v2.model.PageTipoOportunidadeAUDResponse;
import br.com.conductor.pier.api.v2.model.PageStatusOportunidadeResponse;
import br.com.conductor.pier.api.v2.model.PageTipoOportunidadeResponse;
import br.com.conductor.pier.api.v2.model.OpportunityPersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OpportunityApi {
  private ApiClient apiClient;

  public OpportunityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OpportunityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update the Opportunities
   * This method allows to update the Opportunities
   * @param id Identification Code of the Opportunity (id)
   * @param update update
   * @return OportunidadeResponse
   */
  public OportunidadeResponse alterar(Long id, OpportunityUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterar");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling alterar");
     }
     
    // create path and map variables
    String path = "/api/oportunidades/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<OportunidadeResponse> returnType = new GenericType<OportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Update the status of the type opportunity
   * This method update the status of the type opportunity
   * @param id Identification Code of the Opportunity type (id)
   * @param idStatus Identification Code of the Opportunity type status (id)
   * @param persist persist
   * @return StatusOportunidadeResponse
   */
  public StatusOportunidadeResponse alterarStatus(Long id, Long idStatus, StatusOpportunity persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarStatus");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling alterarStatus");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling alterarStatus");
     }
     
    // create path and map variables
    String path = "/api/tipos-oportunidades/{id}/status/{idStatus}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idStatus" + "\\}", apiClient.escapeString(idStatus.toString()));

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

    
    GenericType<StatusOportunidadeResponse> returnType = new GenericType<StatusOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Update the types Opportunities
   * This method updates the types of opportunities
   * @param id Identification Code of the opportunity type (id)
   * @param persist persist
   * @return TipoOportunidadeResponse
   */
  public TipoOportunidadeResponse alterar_0(Long id, TypeOpportunity persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterar_0");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling alterar_0");
     }
     
    // create path and map variables
    String path = "/api/tipos-oportunidades/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoOportunidadeResponse> returnType = new GenericType<TipoOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List the dates of a determined Opportunity
   * this resource allows to retrieve dates of a determined Opportunity using the identification code (id)
   * @param id identification Code of the Opportunity (id)
   * @return OportunidadeResponse
   */
  public OportunidadeResponse consultar(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
     }
     
    // create path and map variables
    String path = "/api/oportunidades/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<OportunidadeResponse> returnType = new GenericType<OportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List the dates of a determined status of the type opportunity
   * This resource alloes to retrieve dates of a determined status of the type opportunity using the identification code (idStatus)
   * @param id Identification code of the Opportunity type (id)
   * @param idStatus Identification Code of the Status (idStatus)
   * @return StatusOportunidadeResponse
   */
  public StatusOportunidadeResponse consultarStatus(Long id, Long idStatus) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarStatus");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling consultarStatus");
     }
     
    // create path and map variables
    String path = "/api/tipos-oportunidades/{id}/status/{idStatus}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idStatus" + "\\}", apiClient.escapeString(idStatus.toString()));

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

    
    GenericType<StatusOportunidadeResponse> returnType = new GenericType<StatusOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List the dates of a determined tyipe opportunity
   * This resource allows to retrieve dates of a determined type opportunity using its identification code (id)
   * @param id Identification Code of the Opportunity type (id)
   * @return TipoOportunidadeResponse
   */
  public TipoOportunidadeResponse consultar_0(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_0");
     }
     
    // create path and map variables
    String path = "/api/tipos-oportunidades/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoOportunidadeResponse> returnType = new GenericType<TipoOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List the Opportunities
   * This resource allows to list the Opportunities
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idStatusOportunidade Identifier Code of the Opportunity Status
   * @param dataCadastro Date of register of the opportunity
   * @param dataAtualizacao Date of updating the opportunity
   * @param numeroReceitaFederal IRs number of the client which it will be offered the opportunity
   * @param dataInicioVigencia Date of the beginning of validity of the opportunity
   * @param dataFimVigencia Date of Ending the validity of the opportunity
   * @param flagAtivo Flag of checking if the opportunity was active
   * @return PageOportunidadeResponse
   */
  public PageOportunidadeResponse listar(List<String> sort, Integer page, Integer limit, Long idStatusOportunidade, String dataCadastro, String dataAtualizacao, String numeroReceitaFederal, String dataInicioVigencia, String dataFimVigencia, Boolean flagAtivo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/oportunidades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idStatusOportunidade", idStatusOportunidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAtualizacao", dataAtualizacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataInicioVigencia", dataInicioVigencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataFimVigencia", dataFimVigencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    

    

    

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

    
    GenericType<PageOportunidadeResponse> returnType = new GenericType<PageOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List the auditorial of the Opportunities
   * This resource allows to list the auditorial of the Opportunities
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idStatusOportunidade Identifier Code of the status opportunity
   * @param dataCadastro Date of the register of the opportunity
   * @param dataAtualizacao Date of updating of the opportunity
   * @param numeroReceitaFederal IRs number of the client which is offered the opportunity
   * @param dataInicioVigencia Beginning of the validity of the opportunity
   * @param datatFimVigencia Ending of the validity of the opportunity
   * @param flagAtivo Flag of checking if the opportunity was active
   * @param revDate Date of the auditorial
   * @param revType Type of the auditorial
   * @param revUser User of the auditorial
   * @return PageOportunidadeAUDResponse
   */
  public PageOportunidadeAUDResponse listarAuditorias(List<String> sort, Integer page, Integer limit, Long idStatusOportunidade, String dataCadastro, String dataAtualizacao, String numeroReceitaFederal, String dataInicioVigencia, String datatFimVigencia, Boolean flagAtivo, String revDate, String revType, String revUser) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/auditorias-oportunidades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idStatusOportunidade", idStatusOportunidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAtualizacao", dataAtualizacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataInicioVigencia", dataInicioVigencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "datatFimVigencia", datatFimVigencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revDate", revDate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revType", revType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revUser", revUser));
    

    

    

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

    
    GenericType<PageOportunidadeAUDResponse> returnType = new GenericType<PageOportunidadeAUDResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List the auditorials of the status opportunities
   * This resource allows to list the status opportunities
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param revType Code that represents the type of action made in the resource opportunities
   * @param revDate Date of the action made in the resource of types of opportunities
   * @param id Identifier Code of the Status opportunity
   * @param idTipoOportunidade Identifier Code of the type opportunity
   * @param nome Name of the Status opportunity
   * @param descricao Description of the status opportunity
   * @param flagAtivo Flag of checking if the status opportunity is active
   * @param revUser User of auditorial
   * @return PageStatusOportunidadeAUDResponse
   */
  public PageStatusOportunidadeAUDResponse listarAuditoriasStatus(List<String> sort, Integer page, Integer limit, Long revType, String revDate, Long id, Long idTipoOportunidade, String nome, String descricao, Boolean flagAtivo, String revUser) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/auditorias-status-oportunidades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revType", revType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revDate", revDate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoOportunidade", idTipoOportunidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revUser", revUser));
    

    

    

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

    
    GenericType<PageStatusOportunidadeAUDResponse> returnType = new GenericType<PageStatusOportunidadeAUDResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List the auditorials of the types opportunities
   * This resource allows to list the types opportunities
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param revType Code that represents the type of action in the resource of type opportunities
   * @param revDate Date of the action made in the resource of the types of opportunities
   * @param id Identifier Code of the type of opportunity which was made the action
   * @param descricao Description of the type of opportunity which was made the action
   * @param flagAtivo Attributed that represents if the type of opportunity is active
   * @param revUser User of the auditorial
   * @return PageTipoOportunidadeAUDResponse
   */
  public PageTipoOportunidadeAUDResponse listarAuditorias_0(List<String> sort, Integer page, Integer limit, Long revType, String revDate, Long id, String descricao, Boolean flagAtivo, String revUser) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/auditorias-tipos-oportunidades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revType", revType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revDate", revDate));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "revUser", revUser));
    

    

    

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

    
    GenericType<PageTipoOportunidadeAUDResponse> returnType = new GenericType<PageTipoOportunidadeAUDResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List the status of type of the opportunities
   * This resource allows to list the status of type of the opportunities
   * @param id Identification Code of the opportunity type (id)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param nome Name of the status opportunity
   * @param descricao Description of the status opportunity
   * @param flagAtivo Flag of checking if the status opportunity is active
   * @return PageStatusOportunidadeResponse
   */
  public PageStatusOportunidadeResponse listarStatus(Long id, List<String> sort, Integer page, Integer limit, String nome, String descricao, Boolean flagAtivo) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarStatus");
     }
     
    // create path and map variables
    String path = "/api/tipos-oportunidades/{id}/status".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    

    

    

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

    
    GenericType<PageStatusOportunidadeResponse> returnType = new GenericType<PageStatusOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List the types opportunities
   * This resource allows to list the ypes opportunities
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param descricao Description of the type of opportunity
   * @param flagAtivo Flag of checking if the type of opportunity is active
   * @return PageTipoOportunidadeResponse
   */
  public PageTipoOportunidadeResponse listar_0(List<String> sort, Integer page, Integer limit, String descricao, Boolean flagAtivo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-oportunidades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    

    

    

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

    
    GenericType<PageTipoOportunidadeResponse> returnType = new GenericType<PageTipoOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Create the Opportunities
   * This resource allows to create the Opportunities
   * @param persist persist
   * @return OportunidadeResponse
   */
  public OportunidadeResponse salvar(OpportunityPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvar");
     }
     
    // create path and map variables
    String path = "/api/oportunidades".replaceAll("\\{format\\}","json");

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

    
    GenericType<OportunidadeResponse> returnType = new GenericType<OportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Create status for a type opportunity
   * This resource allows to register status for the type opportunity
   * @param id Identification code of the opportunity type (id)
   * @param persist persist
   * @return StatusOportunidadeResponse
   */
  public StatusOportunidadeResponse salvarStatus(Long id, StatusOpportunity persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvarStatus");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarStatus");
     }
     
    // create path and map variables
    String path = "/api/tipos-oportunidades/{id}/status".replaceAll("\\{format\\}","json")
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

    
    GenericType<StatusOportunidadeResponse> returnType = new GenericType<StatusOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Create types opportunities
   * This resource allows to create types opportunities
   * @param persist persist
   * @return TipoOportunidadeResponse
   */
  public TipoOportunidadeResponse salvar_0(TypeOpportunity persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvar_0");
     }
     
    // create path and map variables
    String path = "/api/tipos-oportunidades".replaceAll("\\{format\\}","json");

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

    
    GenericType<TipoOportunidadeResponse> returnType = new GenericType<TipoOportunidadeResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
