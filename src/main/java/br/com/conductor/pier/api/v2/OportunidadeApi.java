package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.StatusOportunidadeResponse;
import br.com.conductor.pier.api.v2.model.StatusOportunidade;
import br.com.conductor.pier.api.v2.model.TipoOportunidade;
import br.com.conductor.pier.api.v2.model.TipoOportunidadeResponse;
import br.com.conductor.pier.api.v2.model.OportunidadeResponse;
import br.com.conductor.pier.api.v2.model.OportunidadeUpdate;
import br.com.conductor.pier.api.v2.model.PageStatusOportunidadeAUDResponse;
import br.com.conductor.pier.api.v2.model.PageOportunidadeAUDResponse;
import br.com.conductor.pier.api.v2.model.PageTipoOportunidadeAUDResponse;
import br.com.conductor.pier.api.v2.model.PageStatusOportunidadeResponse;
import br.com.conductor.pier.api.v2.model.PageOportunidadeResponse;
import br.com.conductor.pier.api.v2.model.PageTipoOportunidadeResponse;
import br.com.conductor.pier.api.v2.model.OportunidadePersist;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class OportunidadeApi {
  private ApiClient apiClient;

  public OportunidadeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OportunidadeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Altera o status do tipo oportunidade
   * Este m\u00C3\u00A9todo realiza a altera\u00C3\u00A7\u00C3\u00A3o do status do tipo oportunidade.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo oportunidade (id).
   * @param idStatus C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do status do tipo oportunidade (id).
   * @param persist persist
   * @return StatusOportunidadeResponse
   */
  public StatusOportunidadeResponse alterarStatusUsingPUT(Long id, Long idStatus, StatusOportunidade persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarStatusUsingPUT");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling alterarStatusUsingPUT");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling alterarStatusUsingPUT");
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
   * Altera os tipos oportunidades
   * Este m\u00C3\u00A9todo realiza a altera\u00C3\u00A7\u00C3\u00A3o dos tipos oportunidades.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do tipo oportunidade (id).
   * @param persist persist
   * @return TipoOportunidadeResponse
   */
  public TipoOportunidadeResponse alterarUsingPUT14(Long id, TipoOportunidade persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT14");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling alterarUsingPUT14");
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
   * Altera as oportunidades
   * Este m\u00C3\u00A9todo realiza a altera\u00C3\u00A7\u00C3\u00A3o das oportunidades.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da oportunidade (id).
   * @param update update
   * @return OportunidadeResponse
   */
  public OportunidadeResponse alterarUsingPUT8(Long id, OportunidadeUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT8");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling alterarUsingPUT8");
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
   * Apresenta dados de um determinado status do tipo oportunidade
   * Este recurso permite consultar dados de um determinado status do tipo oportunidade a partir de seu codigo de identifica\u00C3\u00A7\u00C3\u00A3o (idStatus).
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo oportunidade (id).
   * @param idStatus C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do status (idStatus).
   * @return StatusOportunidadeResponse
   */
  public StatusOportunidadeResponse consultarStatusUsingGET(Long id, Long idStatus) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarStatusUsingGET");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling consultarStatusUsingGET");
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
   * Apresenta dados de uma determinada oportunidade
   * Este recurso permite consultar dados de uma determinada oportunidade a partir de seu codigo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da oportunidade (id).
   * @return OportunidadeResponse
   */
  public OportunidadeResponse consultarUsingGET17(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET17");
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
   * Apresenta dados de um determinado tipo oportunidade
   * Este recurso permite consultar dados de um determinado tipo oportunidade a partir de seu codigo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo oportunidade (id).
   * @return TipoOportunidadeResponse
   */
  public TipoOportunidadeResponse consultarUsingGET31(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET31");
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
   * Lista as auditorias dos status oportunidades
   * Este recurso permite listar os status oportunidades.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param revType C\u00C3\u00B3digo que representa o tipo de a\u00C3\u00A7\u00C3\u00A3o realizada no recurso de tipos oportunidades
   * @param revDate Data da a\u00C3\u00A7\u00C3\u00A3o realizada no recurso de tipos oportunidades
   * @param id C\u00C3\u00B3digo identificador do status oportunidade
   * @param idTipoOportunidade C\u00C3\u00B3digo identificador do tipo oportunidade
   * @param nome Nome do status oportunidade
   * @param descricao Descri\u00C3\u00A7\u00C3\u00A3o do status oportunidade
   * @param flagAtivo Flag de verifica\u00C3\u00A7\u00C3\u00A3o se o status oportunidade est\u00C3\u00A1 ativo
   * @param revUser Usu\u00C3\u00A1rio da auditoria
   * @return PageStatusOportunidadeAUDResponse
   */
  public PageStatusOportunidadeAUDResponse listarAuditoriasStatusUsingGET(List<String> sort, Integer page, Integer limit, Long revType, String revDate, Long id, Long idTipoOportunidade, String nome, String descricao, Boolean flagAtivo, String revUser) throws ApiException {
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
   * Lista as auditorias das oportunidades
   * Este recurso permite listar as auditorias das oportunidades.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idStatusOportunidade C\u00C3\u00B3digo identificador do status oportunidade
   * @param dataCadastro Data do cadastro da oportunidade
   * @param dataAtualizacao Data da atualiza\u00C3\u00A7\u00C3\u00A3o da oportunidade
   * @param numeroReceitaFederal N\u00C3\u00BAmero receita federal do cliente ao qual ser\u00C3\u00A1 ofertada a oportunidade
   * @param dataInicioVigencia In\u00C3\u00ADcio da vig\u00C3\u00AAncia da oportunidade
   * @param datatFimVigencia Fim da vig\u00C3\u00AAncia da oportunidade
   * @param flagAtivo Flag de verifica\u00C3\u00A7\u00C3\u00A3o se a oportunidade est\u00C3\u00A1 ativa
   * @param revDate Data da auditoria
   * @param revType Tipo da auditoria
   * @param revUser Usu\u00C3\u00A1rio da auditoria
   * @return PageOportunidadeAUDResponse
   */
  public PageOportunidadeAUDResponse listarAuditoriasUsingGET(List<String> sort, Integer page, Integer limit, Long idStatusOportunidade, String dataCadastro, String dataAtualizacao, String numeroReceitaFederal, String dataInicioVigencia, String datatFimVigencia, Boolean flagAtivo, String revDate, String revType, String revUser) throws ApiException {
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
   * Lista as auditorias dos tipos oportunidades
   * Este recurso permite listar os tipos oportunidades.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param revType C\u00C3\u00B3digo que representa o tipo de a\u00C3\u00A7\u00C3\u00A3o realizada no recurso de tipos oportunidades
   * @param revDate Data da a\u00C3\u00A7\u00C3\u00A3o realizada no recurso de tipos oportunidades
   * @param id C\u00C3\u00B3digo identificador do tipo oportunidade no qual foi realizado a a\u00C3\u00A7\u00C3\u00A3o
   * @param descricao Descri\u00C3\u00A7\u00C3\u00A3o do tipo oportunidade no qual foi realizado a a\u00C3\u00A7\u00C3\u00A3o
   * @param flagAtivo Atributo que representa se o tipo oportunidade est\u00C3\u00A1 ativo
   * @param revUser Usu\u00C3\u00A1rio da auditoria
   * @return PageTipoOportunidadeAUDResponse
   */
  public PageTipoOportunidadeAUDResponse listarAuditoriasUsingGET1(List<String> sort, Integer page, Integer limit, Long revType, String revDate, Long id, String descricao, Boolean flagAtivo, String revUser) throws ApiException {
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
   * Lista os status do tipo oportunidades
   * Este recurso permite listar os status do tipo oportunidades.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo oportunidade (id).
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param nome Nome do status oportunidade
   * @param descricao Descri\u00C3\u00A7\u00C3\u00A3o do status oportunidade
   * @param flagAtivo Flag de verifica\u00C3\u00A7\u00C3\u00A3o se o status oportunidade est\u00C3\u00A1 ativo
   * @return PageStatusOportunidadeResponse
   */
  public PageStatusOportunidadeResponse listarStatusUsingGET(Long id, List<String> sort, Integer page, Integer limit, String nome, String descricao, Boolean flagAtivo) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarStatusUsingGET");
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
   * Lista as oportunidades
   * Este recurso permite listar as oportunidades.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idStatusOportunidade C\u00C3\u00B3digo identificador do status oportunidade
   * @param dataCadastro Data do cadastro da oportunidade
   * @param dataAtualizacao Data da atualiza\u00C3\u00A7\u00C3\u00A3o da oportunidade
   * @param numeroReceitaFederal N\u00C3\u00BAmero receita federal do cliente ao qual ser\u00C3\u00A1 ofertada a oportunidade
   * @param dataInicioVigencia Data de in\u00C3\u00ADcio da vig\u00C3\u00AAncia da oportunidade
   * @param dataFimVigencia Data do fim da vig\u00C3\u00AAncia da oportunidade
   * @param flagAtivo Flag de verifica\u00C3\u00A7\u00C3\u00A3o se a oportunidade est\u00C3\u00A1 ativa
   * @return PageOportunidadeResponse
   */
  public PageOportunidadeResponse listarUsingGET21(List<String> sort, Integer page, Integer limit, Long idStatusOportunidade, String dataCadastro, String dataAtualizacao, String numeroReceitaFederal, String dataInicioVigencia, String dataFimVigencia, Boolean flagAtivo) throws ApiException {
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
   * Lista os tipos oportunidades
   * Este recurso permite listar os tipos oportunidades.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param descricao Descri\u00C3\u00A7\u00C3\u00A3o do tipo oportunidade
   * @param flagAtivo Flag de verifica\u00C3\u00A7\u00C3\u00A3o se o tipo oportunidade est\u00C3\u00A1 ativo
   * @return PageTipoOportunidadeResponse
   */
  public PageTipoOportunidadeResponse listarUsingGET36(List<String> sort, Integer page, Integer limit, String descricao, Boolean flagAtivo) throws ApiException {
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
   * Cadastra status para o tipo oportunidade
   * Esse recurso permite cadastrar status para o tipo oportunidade.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo oportunidade (id).
   * @param persist persist
   * @return StatusOportunidadeResponse
   */
  public StatusOportunidadeResponse salvarStatusUsingPOST(Long id, StatusOportunidade persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvarStatusUsingPOST");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarStatusUsingPOST");
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
   * Cadastra as oportunidades
   * Esse recurso permite cadastrar oportunidades.
   * @param persist persist
   * @return OportunidadeResponse
   */
  public OportunidadeResponse salvarUsingPOST15(OportunidadePersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST15");
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
   * Cadastra tipos oportunidades
   * Esse recurso permite cadastrar tipos oportunidades.
   * @param persist persist
   * @return TipoOportunidadeResponse
   */
  public TipoOportunidadeResponse salvarUsingPOST21(TipoOportunidade persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST21");
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

