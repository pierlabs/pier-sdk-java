package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.OrigemComercialUpdate;
import br.com.conductor.pier.api.v2.model.OrigemComercialResponse;
import br.com.conductor.pier.api.v2.model.OperacaoCredorUpdate;
import br.com.conductor.pier.api.v2.model.OperacaoCredorResponse;
import br.com.conductor.pier.api.v2.model.TelefoneEstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.TelefoneEstabelecimentoUpdate;
import br.com.conductor.pier.api.v2.model.TerminalUpdateValue;
import br.com.conductor.pier.api.v2.model.TerminalResponse;
import br.com.conductor.pier.api.v2.model.EstabelecimentoUpdate;
import br.com.conductor.pier.api.v2.model.EstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.GrupoEconomicoDTO;
import br.com.conductor.pier.api.v2.model.GrupoEconomicoResponse;
import br.com.conductor.pier.api.v2.model.MaquinetaResponse;
import br.com.conductor.pier.api.v2.model.MaquinetaUpdate;
import br.com.conductor.pier.api.v2.model.OrigemComercialPersist;
import br.com.conductor.pier.api.v2.model.EstabelecimentoPersist;
import br.com.conductor.pier.api.v2.model.DetalheOperacaoResponse;
import br.com.conductor.pier.api.v2.model.VinculoEstabelecimentoAdquirenteResponse;
import br.com.conductor.pier.api.v2.model.VinculoOperacaoPersist;
import br.com.conductor.pier.api.v2.model.PageOperacaoResponse;
import br.com.conductor.pier.api.v2.model.PageMCCResponse;
import br.com.conductor.pier.api.v2.model.PageOrigemComercialResponse;
import br.com.conductor.pier.api.v2.model.PageEntidadeResponse;
import br.com.conductor.pier.api.v2.model.PageTipoEstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.PageCampoCodificadoDescricaoResponse;
import br.com.conductor.pier.api.v2.model.PageTipoOrigemComercialResponse;
import br.com.conductor.pier.api.v2.model.PageTipoTerminalResponse;
import br.com.conductor.pier.api.v2.model.PageEstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.PageGrupoEconomicoResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PageGrupoOrigemComercialResponse;
import br.com.conductor.pier.api.v2.model.PageMaquinetaResponse;
import br.com.conductor.pier.api.v2.model.PageMoedaResponse;
import br.com.conductor.pier.api.v2.model.PageOperacaoCredorResponse;
import br.com.conductor.pier.api.v2.model.PageTelefoneEstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.PageTerminalResponse;
import br.com.conductor.pier.api.v2.model.PageVinculoEstabelecimentoAdquirenteResponse;
import br.com.conductor.pier.api.v2.model.PageVinculoOperacaoResponse;
import br.com.conductor.pier.api.v2.model.MaquinetaPersist;
import br.com.conductor.pier.api.v2.model.OperacaoCredorPersist;
import br.com.conductor.pier.api.v2.model.TelefoneEstabelecimentoPersist;
import br.com.conductor.pier.api.v2.model.TerminalPersist;
import br.com.conductor.pier.api.v2.model.VinculoEstabelecimentoAdquirentePersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagestabelecimentoApi {
  private ApiClient apiClient;

  public GlobaltagestabelecimentoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagestabelecimentoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{origem_comercial_resource_alterar_origem_comercial}}}
   * {{{origem_comercial_resource_alterar_origem_comercial_notes}}}
   * @param id {{{origem_comercial_resource_alterar_origem_comercial_param_id}}}
   * @param origemComercialUpdate origemComercialUpdate
   * @return OrigemComercialResponse
   */
  public OrigemComercialResponse alterarOrigemComercialUsingPUT(Long id, OrigemComercialUpdate origemComercialUpdate) throws ApiException {
    Object postBody = origemComercialUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarOrigemComercialUsingPUT");
     }
     
     // verify the required parameter 'origemComercialUpdate' is set
     if (origemComercialUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'origemComercialUpdate' when calling alterarOrigemComercialUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/origens-comerciais/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<OrigemComercialResponse> returnType = new GenericType<OrigemComercialResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{operacao_credor_resource_alterar}}}
   * {{{operacao_credor_resource_alterar_notes}}}
   * @param id {{{operacao_credor_resource_alterar_param_id}}}
   * @param operacaoCredorUpdate operacaoCredorUpdate
   * @return OperacaoCredorResponse
   */
  public OperacaoCredorResponse alterarUsingPUT10(Long id, OperacaoCredorUpdate operacaoCredorUpdate) throws ApiException {
    Object postBody = operacaoCredorUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT10");
     }
     
     // verify the required parameter 'operacaoCredorUpdate' is set
     if (operacaoCredorUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'operacaoCredorUpdate' when calling alterarUsingPUT10");
     }
     
    // create path and map variables
    String path = "/api/regras-operacoes-estabelecimentos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<OperacaoCredorResponse> returnType = new GenericType<OperacaoCredorResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{telefone_estabelecimento_resource_alterar}}}
   * {{{telefone_estabelecimento_resource_alterar_notes}}}
   * @param id {{{telefone_estabelecimento_resource_alterar_param_id}}}
   * @param telefoneEstabelecimentoUpdate telefoneEstabelecimentoUpdate
   * @return TelefoneEstabelecimentoResponse
   */
  public TelefoneEstabelecimentoResponse alterarUsingPUT14(Long id, TelefoneEstabelecimentoUpdate telefoneEstabelecimentoUpdate) throws ApiException {
    Object postBody = telefoneEstabelecimentoUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT14");
     }
     
     // verify the required parameter 'telefoneEstabelecimentoUpdate' is set
     if (telefoneEstabelecimentoUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'telefoneEstabelecimentoUpdate' when calling alterarUsingPUT14");
     }
     
    // create path and map variables
    String path = "/api/telefones-estabelecimentos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TelefoneEstabelecimentoResponse> returnType = new GenericType<TelefoneEstabelecimentoResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{terminal_resource_alterar}}}
   * {{{terminal_resource_alterar_notes}}}
   * @param id {{{terminal_resource_alterar_param_id}}}
   * @param terminalUpdate terminalUpdate
   * @return TerminalResponse
   */
  public TerminalResponse alterarUsingPUT16(Long id, TerminalUpdateValue terminalUpdate) throws ApiException {
    Object postBody = terminalUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT16");
     }
     
     // verify the required parameter 'terminalUpdate' is set
     if (terminalUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'terminalUpdate' when calling alterarUsingPUT16");
     }
     
    // create path and map variables
    String path = "/api/terminais/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TerminalResponse> returnType = new GenericType<TerminalResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{estabelecimento_resource_alterar}}}
   * {{{estabelecimento_resource_alterar_notes}}}
   * @param id {{{estabelecimento_resource_alterar_param_id_estabelecimento}}}
   * @param update update
   * @return EstabelecimentoResponse
   */
  public EstabelecimentoResponse alterarUsingPUT5(Long id, EstabelecimentoUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT5");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling alterarUsingPUT5");
     }
     
    // create path and map variables
    String path = "/api/estabelecimentos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<EstabelecimentoResponse> returnType = new GenericType<EstabelecimentoResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{grupo_economico_resource_alterar}}}
   * {{{grupo_economico_resource_alterar_notes}}}
   * @param id {{{grupo_economico_resource_alterar_param_id}}}
   * @param grupoEconomicoDTO grupoEconomicoDTO
   * @return GrupoEconomicoResponse
   */
  public GrupoEconomicoResponse alterarUsingPUT7(Long id, GrupoEconomicoDTO grupoEconomicoDTO) throws ApiException {
    Object postBody = grupoEconomicoDTO;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT7");
     }
     
     // verify the required parameter 'grupoEconomicoDTO' is set
     if (grupoEconomicoDTO == null) {
        throw new ApiException(400, "Missing the required parameter 'grupoEconomicoDTO' when calling alterarUsingPUT7");
     }
     
    // create path and map variables
    String path = "/api/grupos-economicos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<GrupoEconomicoResponse> returnType = new GenericType<GrupoEconomicoResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{maquineta_resource_alterar}}}
   * {{{maquineta_resource_alterar_notes}}}
   * @param id {{{maquineta_resource_alterar_param_id}}}
   * @param maquinetaUpdate maquinetaUpdate
   * @return MaquinetaResponse
   */
  public MaquinetaResponse alterarUsingPUT9(Long id, MaquinetaUpdate maquinetaUpdate) throws ApiException {
    Object postBody = maquinetaUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT9");
     }
     
     // verify the required parameter 'maquinetaUpdate' is set
     if (maquinetaUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'maquinetaUpdate' when calling alterarUsingPUT9");
     }
     
    // create path and map variables
    String path = "/api/maquinetas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<MaquinetaResponse> returnType = new GenericType<MaquinetaResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{origem_comercial_resource_cadastrar_origem_comercial}}}
   * {{{origem_comercial_resource_cadastrar_origem_comercial_notes}}}
   * @param origemComercialPersist origemComercialPersist
   * @return OrigemComercialResponse
   */
  public OrigemComercialResponse cadastrarOrigemComercialUsingPOST(OrigemComercialPersist origemComercialPersist) throws ApiException {
    Object postBody = origemComercialPersist;
    
     // verify the required parameter 'origemComercialPersist' is set
     if (origemComercialPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'origemComercialPersist' when calling cadastrarOrigemComercialUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/origens-comerciais".replaceAll("\\{format\\}","json");

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

    
    GenericType<OrigemComercialResponse> returnType = new GenericType<OrigemComercialResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{estabelecimento_resource_cadastrar}}}
   * {{{estabelecimento_resource_cadastrar_notes}}}
   * @param persist persist
   * @return EstabelecimentoResponse
   */
  public EstabelecimentoResponse cadastrarUsingPOST3(EstabelecimentoPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling cadastrarUsingPOST3");
     }
     
    // create path and map variables
    String path = "/api/estabelecimentos".replaceAll("\\{format\\}","json");

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

    
    GenericType<EstabelecimentoResponse> returnType = new GenericType<EstabelecimentoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{grupo_economico_resource_cadastrar}}}
   * {{{grupo_economico_resource_cadastrar_notes}}}
   * @param grupoEconomicoDTO GrupoEconomicoDTO
   * @return GrupoEconomicoResponse
   */
  public GrupoEconomicoResponse cadastrarUsingPOST4(GrupoEconomicoDTO grupoEconomicoDTO) throws ApiException {
    Object postBody = grupoEconomicoDTO;
    
     // verify the required parameter 'grupoEconomicoDTO' is set
     if (grupoEconomicoDTO == null) {
        throw new ApiException(400, "Missing the required parameter 'grupoEconomicoDTO' when calling cadastrarUsingPOST4");
     }
     
    // create path and map variables
    String path = "/api/grupos-economicos".replaceAll("\\{format\\}","json");

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

    
    GenericType<GrupoEconomicoResponse> returnType = new GenericType<GrupoEconomicoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{operacao_resource_consulta_operacao}}}
   * {{{operacao_resource_consulta_operacao_notes}}}
   * @param id {{{operacao_resource_consulta_operacao_param_id_operacao}}}
   * @return DetalheOperacaoResponse
   */
  public DetalheOperacaoResponse consultaOperacaoUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultaOperacaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/tipos-operacoes-estabelecimentos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<DetalheOperacaoResponse> returnType = new GenericType<DetalheOperacaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{origem_comercial_resource_consultar_origem_comercial}}}
   * {{{origem_comercial_resource_consultar_origem_comercial_notes}}}
   * @param id {{{origem_comercial_resource_consultar_origem_comercial_param_id}}}
   * @return OrigemComercialResponse
   */
  public OrigemComercialResponse consultarOrigemComercialUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarOrigemComercialUsingGET");
     }
     
    // create path and map variables
    String path = "/api/origens-comerciais/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<OrigemComercialResponse> returnType = new GenericType<OrigemComercialResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{estabelecimento_resource_consultar}}}
   * {{{estabelecimento_resource_consultar_notes}}}
   * @param id {{{estabelecimento_resource_consultar_param_id_estabelecimento}}}
   * @return EstabelecimentoResponse
   */
  public EstabelecimentoResponse consultarUsingGET18(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET18");
     }
     
    // create path and map variables
    String path = "/api/estabelecimentos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<EstabelecimentoResponse> returnType = new GenericType<EstabelecimentoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{grupo_economico_resource_consultar}}}
   * {{{grupo_economico_resource_consultar_notes}}}
   * @param id {{{grupo_economico_resource_consultar_param_id}}}
   * @return GrupoEconomicoResponse
   */
  public GrupoEconomicoResponse consultarUsingGET20(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET20");
     }
     
    // create path and map variables
    String path = "/api/grupos-economicos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<GrupoEconomicoResponse> returnType = new GenericType<GrupoEconomicoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{maquineta_resource_consultar}}}
   * {{{maquineta_resource_consultar_notes}}}
   * @param id {{{maquineta_resource_consultar_param_id}}}
   * @return MaquinetaResponse
   */
  public MaquinetaResponse consultarUsingGET22(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET22");
     }
     
    // create path and map variables
    String path = "/api/maquinetas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<MaquinetaResponse> returnType = new GenericType<MaquinetaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{operacao_credor_resource_consultar}}}
   * {{{operacao_credor_resource_consultar_notes}}}
   * @param id {{{operacao_credor_resource_consultar_param_id}}}
   * @return OperacaoCredorResponse
   */
  public OperacaoCredorResponse consultarUsingGET23(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET23");
     }
     
    // create path and map variables
    String path = "/api/regras-operacoes-estabelecimentos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<OperacaoCredorResponse> returnType = new GenericType<OperacaoCredorResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{telefone_estabelecimento_resource_consultar}}}
   * {{{telefone_estabelecimento_resource_consultar_notes}}}
   * @param id {{{telefone_estabelecimento_resource_consultar_param_id}}}
   * @return TelefoneEstabelecimentoResponse
   */
  public TelefoneEstabelecimentoResponse consultarUsingGET34(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET34");
     }
     
    // create path and map variables
    String path = "/api/telefones-estabelecimentos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TelefoneEstabelecimentoResponse> returnType = new GenericType<TelefoneEstabelecimentoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{terminal_resource_consultar}}}
   * {{{terminal_resource_consultar_notes}}}
   * @param id {{{terminal_resource_consultar_param_id}}}
   * @return TerminalResponse
   */
  public TerminalResponse consultarUsingGET36(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET36");
     }
     
    // create path and map variables
    String path = "/api/terminais/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TerminalResponse> returnType = new GenericType<TerminalResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{vinculo_estabelecimento_adquirente_resource_consultar}}}
   * {{{vinculo_estabelecimento_adquirente_resource_consultar_notes}}}
   * @param id {{{vinculo_estabelecimento_adquirente_resource_consultar_param_id}}}
   * @return VinculoEstabelecimentoAdquirenteResponse
   */
  public VinculoEstabelecimentoAdquirenteResponse consultarUsingGET47(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET47");
     }
     
    // create path and map variables
    String path = "/api/adquirentes-estabelecimento/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<VinculoEstabelecimentoAdquirenteResponse> returnType = new GenericType<VinculoEstabelecimentoAdquirenteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{vinculo_estabelecimento_adquirente_resource_desabilitar_vinculo}}}
   * {{{vinculo_estabelecimento_adquirente_resource_desabilitar_vinculo_notes}}}
   * @param id {{{vinculo_estabelecimento_adquirente_resource_desabilitar_vinculo_param_id}}}
   * @return Object
   */
  public Object desabilitarVinculoUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desabilitarVinculoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/adquirentes-estabelecimento/{id}/desabilitar".replaceAll("\\{format\\}","json")
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

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{vinculo_operacao_resource_desabilitar_vinculo}}}
   * {{{vinculo_operacao_resource_desabilitar_vinculo_notes}}}
   * @param id {{{vinculo_operacao_resource_desabilitar_vinculo_param_id}}}
   * @param vinculoOperacaoPersist vinculoOperacaoPersist
   * @return Object
   */
  public Object desabilitarVinculoUsingPOST1(Long id, VinculoOperacaoPersist vinculoOperacaoPersist) throws ApiException {
    Object postBody = vinculoOperacaoPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desabilitarVinculoUsingPOST1");
     }
     
     // verify the required parameter 'vinculoOperacaoPersist' is set
     if (vinculoOperacaoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'vinculoOperacaoPersist' when calling desabilitarVinculoUsingPOST1");
     }
     
    // create path and map variables
    String path = "/api/estabelecimentos/{id}/desabilitar-operacao".replaceAll("\\{format\\}","json")
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

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{vinculo_estabelecimento_adquirente_resource_habilitar_vinculo}}}
   * {{{vinculo_estabelecimento_adquirente_resource_habilitar_vinculo_notes}}}
   * @param id {{{vinculo_estabelecimento_adquirente_resource_habilitar_vinculo_param_id}}}
   * @return Object
   */
  public Object habilitarVinculoUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling habilitarVinculoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/adquirentes-estabelecimento/{id}/habilitar".replaceAll("\\{format\\}","json")
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

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{vinculo_operacao_resource_habilitar_vinculo}}}
   * {{{vinculo_operacao_resource_habilitar_vinculo_notes}}}
   * @param id {{{vinculo_operacao_resource_habilitar_vinculo_param_id}}}
   * @param vinculoOperacaoPersist vinculoOperacaoPersist
   * @return Object
   */
  public Object habilitarVinculoUsingPOST1(Long id, VinculoOperacaoPersist vinculoOperacaoPersist) throws ApiException {
    Object postBody = vinculoOperacaoPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling habilitarVinculoUsingPOST1");
     }
     
     // verify the required parameter 'vinculoOperacaoPersist' is set
     if (vinculoOperacaoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'vinculoOperacaoPersist' when calling habilitarVinculoUsingPOST1");
     }
     
    // create path and map variables
    String path = "/api/estabelecimentos/{id}/habilitar-operacao".replaceAll("\\{format\\}","json")
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

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{operacao_resource_lista_operacao}}}
   * {{{operacao_resource_lista_operacao_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idOperacao {{{operacao_request_id_operacao_value}}}
   * @param codigoProcessamento {{{operacao_request_codigo_processamento_value}}}
   * @param nomeOperacao {{{operacao_request_nome_operacao_value}}}
   * @return PageOperacaoResponse
   */
  public PageOperacaoResponse listaOperacaoUsingGET(List<String> sort, Integer page, Integer limit, Long idOperacao, String codigoProcessamento, String nomeOperacao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-operacoes-estabelecimentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idOperacao", idOperacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigoProcessamento", codigoProcessamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeOperacao", nomeOperacao));
    

    

    

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

    
    GenericType<PageOperacaoResponse> returnType = new GenericType<PageOperacaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{m_c_c_resource_listar_m_c_c}}}
   * {{{m_c_c_resource_listar_m_c_c_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageMCCResponse
   */
  public PageMCCResponse listarMCCUsingGET(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/mcc-estabelecimentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
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

    
    GenericType<PageMCCResponse> returnType = new GenericType<PageMCCResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{origem_comercial_resource_listar_origens_comerciais}}}
   * {{{origem_comercial_resource_listar_origens_comerciais_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{origem_comercial_request_id_value}}}
   * @param nome {{{origem_comercial_request_nome_value}}}
   * @param status {{{origem_comercial_request_status_value}}}
   * @param idEstabelecimento {{{origem_comercial_request_id_estabelecimento_value}}}
   * @param idProduto {{{origem_comercial_request_id_produto_value}}}
   * @param descricao {{{origem_comercial_request_descricao_value}}}
   * @param idTipoOrigemComercial {{{origem_comercial_request_id_tipo_origem_comercial_value}}}
   * @param idGrupoOrigemComercial {{{origem_comercial_request_id_grupo_origem_comercial_value}}}
   * @param flagPreAprovado {{{origem_comercial_request_flag_pre_aprovado_value}}}
   * @param flagAprovacaoImediata {{{origem_comercial_request_flag_aprovacao_imediata_value}}}
   * @param nomeFantasiaPlastico {{{origem_comercial_request_nome_fantasia_plastico_value}}}
   * @param flagCartaoProvisorio {{{origem_comercial_request_flag_cartao_provisorio_value}}}
   * @param flagCartaoDefinitivo {{{origem_comercial_request_flag_cartao_definitivo_value}}}
   * @param usuario {{{origem_comercial_request_usuario_value}}}
   * @param senha {{{origem_comercial_request_senha_value}}}
   * @param flagOrigemExterna {{{origem_comercial_request_flag_origem_externa_value}}}
   * @param flagModificado {{{origem_comercial_request_flag_modificado_value}}}
   * @param flagEnviaFaturaUsuario {{{origem_comercial_request_flag_envia_fatura_usuario_value}}}
   * @param flagCreditoFaturamento {{{origem_comercial_request_flag_credito_faturamento_value}}}
   * @param flagConcedeLimiteProvisorio {{{origem_comercial_request_flag_concede_limite_provisorio_value}}}
   * @param flagDigitalizarDoc {{{origem_comercial_request_flag_digitalizar_doc_value}}}
   * @param flagEmbossingLoja {{{origem_comercial_request_flag_embossing_loja_value}}}
   * @param flagConsultaPrevia {{{origem_comercial_request_flag_consulta_previa_value}}}
   * @param tipoPessoa {{{origem_comercial_request_tipo_pessoa_value}}}
   * @return PageOrigemComercialResponse
   */
  public PageOrigemComercialResponse listarOrigensComerciaisUsingGET(List<String> sort, Integer page, Integer limit, Long id, String nome, Integer status, Long idEstabelecimento, Long idProduto, String descricao, Long idTipoOrigemComercial, Long idGrupoOrigemComercial, Boolean flagPreAprovado, Boolean flagAprovacaoImediata, String nomeFantasiaPlastico, Boolean flagCartaoProvisorio, Boolean flagCartaoDefinitivo, String usuario, String senha, Boolean flagOrigemExterna, Boolean flagModificado, Boolean flagEnviaFaturaUsuario, Boolean flagCreditoFaturamento, Boolean flagConcedeLimiteProvisorio, Boolean flagDigitalizarDoc, Boolean flagEmbossingLoja, Boolean flagConsultaPrevia, String tipoPessoa) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/origens-comerciais".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoOrigemComercial", idTipoOrigemComercial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idGrupoOrigemComercial", idGrupoOrigemComercial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagPreAprovado", flagPreAprovado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAprovacaoImediata", flagAprovacaoImediata));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeFantasiaPlastico", nomeFantasiaPlastico));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagCartaoProvisorio", flagCartaoProvisorio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagCartaoDefinitivo", flagCartaoDefinitivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "usuario", usuario));
    
    queryParams.addAll(apiClient.parameterToPairs("", "senha", senha));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagOrigemExterna", flagOrigemExterna));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagModificado", flagModificado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagEnviaFaturaUsuario", flagEnviaFaturaUsuario));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagCreditoFaturamento", flagCreditoFaturamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagConcedeLimiteProvisorio", flagConcedeLimiteProvisorio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagDigitalizarDoc", flagDigitalizarDoc));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagEmbossingLoja", flagEmbossingLoja));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagConsultaPrevia", flagConsultaPrevia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoPessoa", tipoPessoa));
    

    

    

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

    
    GenericType<PageOrigemComercialResponse> returnType = new GenericType<PageOrigemComercialResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{vinculo_estabelecimento_adquirente_resource_listar_tipos_adquirentes}}}
   * {{{vinculo_estabelecimento_adquirente_resource_listar_tipos_adquirentes_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageEntidadeResponse
   */
  public PageEntidadeResponse listarTiposAdquirentesUsingGET(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-adquirentes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
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

    
    GenericType<PageEntidadeResponse> returnType = new GenericType<PageEntidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{tipo_estabelecimento_resource_listar_tipos_estabelecimentos}}}
   * {{{tipo_estabelecimento_resource_listar_tipos_estabelecimentos_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param descricao {{{tipo_estabelecimento_request_descricao_value}}}
   * @return PageTipoEstabelecimentoResponse
   */
  public PageTipoEstabelecimentoResponse listarTiposEstabelecimentosUsingGET(List<String> sort, Integer page, Integer limit, String descricao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-estabelecimentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
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

    
    GenericType<PageTipoEstabelecimentoResponse> returnType = new GenericType<PageTipoEstabelecimentoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{maquineta_resource_listar_tipos_maquinetas}}}
   * {{{maquineta_resource_listar_tipos_maquinetas_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse listarTiposMaquinetasUsingGET(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-maquinetas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
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

    
    GenericType<PageCampoCodificadoDescricaoResponse> returnType = new GenericType<PageCampoCodificadoDescricaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{tipo_origem_comercial_resource_listar_tipos_origens_comerciais}}}
   * {{{tipo_origem_comercial_resource_listar_tipos_origens_comerciais_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param nome {{{tipo_origem_comercial_request_nome_value}}}
   * @return PageTipoOrigemComercialResponse
   */
  public PageTipoOrigemComercialResponse listarTiposOrigensComerciaisUsingGET(List<String> sort, Integer page, Integer limit, String nome) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-origens-comerciais".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    

    

    

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

    
    GenericType<PageTipoOrigemComercialResponse> returnType = new GenericType<PageTipoOrigemComercialResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{terminal_resource_listar_tipos_terminais}}}
   * {{{terminal_resource_listar_tipos_terminais_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageTipoTerminalResponse
   */
  public PageTipoTerminalResponse listarTiposTerminaisUsingGET(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-terminais-estabelecimento".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
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

    
    GenericType<PageTipoTerminalResponse> returnType = new GenericType<PageTipoTerminalResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{estabelecimento_resource_listar}}}
   * {{{estabelecimento_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{estabelecimento_request_id_value}}}
   * @param idGrupoEconomico {{{estabelecimento_request_id_grupo_economico_value}}}
   * @param numeroReceitaFederal {{{estabelecimento_request_numero_receita_federal_value}}}
   * @param nome {{{estabelecimento_request_nome_value}}}
   * @param descricao {{{estabelecimento_request_descricao_value}}}
   * @param nomeFantasia {{{estabelecimento_request_nome_fantasia_value}}}
   * @param cep {{{estabelecimento_request_cep_value}}}
   * @param nomeLogradouro {{{estabelecimento_request_nome_logradouro_value}}}
   * @param numeroEndereco {{{estabelecimento_request_numero_endereco_value}}}
   * @param complemento {{{estabelecimento_request_complemento_value}}}
   * @param bairro {{{estabelecimento_request_bairro_value}}}
   * @param cidade {{{estabelecimento_request_cidade_value}}}
   * @param uf {{{estabelecimento_request_uf_value}}}
   * @param pais {{{estabelecimento_request_pais_value}}}
   * @param dataCadastramento {{{estabelecimento_request_data_cadastramento_value}}}
   * @param contato {{{estabelecimento_request_contato_value}}}
   * @param email {{{estabelecimento_request_email_value}}}
   * @param flagArquivoSecrFazenda {{{estabelecimento_request_flag_arquivo_secr_fazenda_value}}}
   * @param flagCartaoDigitado {{{estabelecimento_request_flag_cartao_digitado_value}}}
   * @param inativo {{{estabelecimento_request_inativo_value}}}
   * @param idPais {{{estabelecimento_request_id_pais_value}}}
   * @param mcc {{{estabelecimento_request_mcc_value}}}
   * @param idTipoEstabelecimento {{{estabelecimento_request_id_tipo_estabelecimento_value}}}
   * @param correspondencia {{{estabelecimento_request_correspondencia_value}}}
   * @param idMoeda {{{estabelecimento_request_id_moeda_value}}}
   * @param tipoPagamento {{{estabelecimento_request_tipo_pagamento_value}}}
   * @param numeroEstabelecimento {{{estabelecimento_request_numero_estabelecimento_value}}}
   * @param cep2 {{{estabelecimento_request_cep2_value}}}
   * @param nomeLogradouro2 {{{estabelecimento_request_nome_logradouro2_value}}}
   * @param numeroEndereco2 {{{estabelecimento_request_numero_endereco2_value}}}
   * @param complemento2 {{{estabelecimento_request_complemento2_value}}}
   * @param bairro2 {{{estabelecimento_request_bairro2_value}}}
   * @param cidade2 {{{estabelecimento_request_cidade2_value}}}
   * @param uf2 {{{estabelecimento_request_uf2_value}}}
   * @param flagMatriz {{{estabelecimento_request_flag_matriz_value}}}
   * @return PageEstabelecimentoResponse
   */
  public PageEstabelecimentoResponse listarUsingGET22(List<String> sort, Integer page, Integer limit, Long id, Long idGrupoEconomico, String numeroReceitaFederal, String nome, String descricao, String nomeFantasia, String cep, String nomeLogradouro, Integer numeroEndereco, String complemento, String bairro, String cidade, String uf, String pais, String dataCadastramento, String contato, String email, Integer flagArquivoSecrFazenda, Integer flagCartaoDigitado, Integer inativo, Long idPais, Long mcc, Long idTipoEstabelecimento, Integer correspondencia, Long idMoeda, String tipoPagamento, String numeroEstabelecimento, String cep2, String nomeLogradouro2, Integer numeroEndereco2, String complemento2, String bairro2, String cidade2, String uf2, Integer flagMatriz) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/estabelecimentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idGrupoEconomico", idGrupoEconomico));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeFantasia", nomeFantasia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cep", cep));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeLogradouro", nomeLogradouro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroEndereco", numeroEndereco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "bairro", bairro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cidade", cidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "uf", uf));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pais", pais));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCadastramento", dataCadastramento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "contato", contato));
    
    queryParams.addAll(apiClient.parameterToPairs("", "email", email));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagArquivoSecrFazenda", flagArquivoSecrFazenda));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagCartaoDigitado", flagCartaoDigitado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "inativo", inativo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPais", idPais));
    
    queryParams.addAll(apiClient.parameterToPairs("", "mcc", mcc));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoEstabelecimento", idTipoEstabelecimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "correspondencia", correspondencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idMoeda", idMoeda));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoPagamento", tipoPagamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroEstabelecimento", numeroEstabelecimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cep2", cep2));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeLogradouro2", nomeLogradouro2));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroEndereco2", numeroEndereco2));
    
    queryParams.addAll(apiClient.parameterToPairs("", "complemento2", complemento2));
    
    queryParams.addAll(apiClient.parameterToPairs("", "bairro2", bairro2));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cidade2", cidade2));
    
    queryParams.addAll(apiClient.parameterToPairs("", "uf2", uf2));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagMatriz", flagMatriz));
    

    

    

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

    
    GenericType<PageEstabelecimentoResponse> returnType = new GenericType<PageEstabelecimentoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{grupo_economico_resource_listar}}}
   * {{{grupo_economico_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param razaoSocial {{{grupo_economico_request_razao_social_value}}}
   * @param nomeCredor {{{grupo_economico_request_nome_credor_value}}}
   * @param numeroReceitaFederal {{{grupo_economico_request_numero_receita_federal_value}}}
   * @param inscricaoEstadual {{{grupo_economico_request_inscricao_estadual_value}}}
   * @param contato {{{grupo_economico_request_contato_value}}}
   * @param banco {{{grupo_economico_request_banco_value}}}
   * @param agencia {{{grupo_economico_request_agencia_value}}}
   * @param digitoAgencia {{{grupo_economico_request_digito_agencia_value}}}
   * @param contaCorrente {{{grupo_economico_request_conta_corrente_value}}}
   * @param digitoContaCorrente {{{grupo_economico_request_digito_conta_corrente_value}}}
   * @param periodicidade {{{grupo_economico_request_periodicidade_value}}}
   * @param pagamentoSemanal {{{grupo_economico_request_pagamento_semanal_value}}}
   * @param pagamentoMensal {{{grupo_economico_request_pagamento_mensal_value}}}
   * @param pagamentoDecendialPrimeiro {{{grupo_economico_request_pagamento_decendial_primeiro_value}}}
   * @param pagamentoDecendialSegundo {{{grupo_economico_request_pagamento_decendial_segundo_value}}}
   * @param pagamentoDecendialTerceiro {{{grupo_economico_request_pagamento_decendial_terceiro_value}}}
   * @param pagamentoQuinzenalPrimeiro {{{grupo_economico_request_pagamento_quinzenal_primeiro_value}}}
   * @param pagamentoQuinzenalSegundo {{{grupo_economico_request_pagamento_quinzenal_segundo_value}}}
   * @param percentualRAV {{{grupo_economico_request_percentual_r_a_v_value}}}
   * @param recebeRAV {{{grupo_economico_request_recebe_r_a_v_value}}}
   * @param percentualMultiplica {{{grupo_economico_request_percentual_multiplica_value}}}
   * @param taxaAdm {{{grupo_economico_request_taxa_adm_value}}}
   * @param taxaBanco {{{grupo_economico_request_taxa_banco_value}}}
   * @param limiteRAV {{{grupo_economico_request_limite_r_a_v_value}}}
   * @param idCredorRAV {{{grupo_economico_request_id_credor_r_a_v_value}}}
   * @return PageGrupoEconomicoResponse
   */
  public PageGrupoEconomicoResponse listarUsingGET25(List<String> sort, Integer page, Integer limit, String razaoSocial, String nomeCredor, String numeroReceitaFederal, String inscricaoEstadual, String contato, Integer banco, Integer agencia, String digitoAgencia, String contaCorrente, String digitoContaCorrente, String periodicidade, String pagamentoSemanal, Integer pagamentoMensal, Integer pagamentoDecendialPrimeiro, Integer pagamentoDecendialSegundo, Integer pagamentoDecendialTerceiro, Integer pagamentoQuinzenalPrimeiro, Integer pagamentoQuinzenalSegundo, BigDecimal percentualRAV, String recebeRAV, BigDecimal percentualMultiplica, BigDecimal taxaAdm, BigDecimal taxaBanco, BigDecimal limiteRAV, Long idCredorRAV) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/grupos-economicos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "razaoSocial", razaoSocial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeCredor", nomeCredor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "inscricaoEstadual", inscricaoEstadual));
    
    queryParams.addAll(apiClient.parameterToPairs("", "contato", contato));
    
    queryParams.addAll(apiClient.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "agencia", agencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "digitoAgencia", digitoAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "contaCorrente", contaCorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "digitoContaCorrente", digitoContaCorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "periodicidade", periodicidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pagamentoSemanal", pagamentoSemanal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pagamentoMensal", pagamentoMensal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pagamentoDecendialPrimeiro", pagamentoDecendialPrimeiro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pagamentoDecendialSegundo", pagamentoDecendialSegundo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pagamentoDecendialTerceiro", pagamentoDecendialTerceiro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pagamentoQuinzenalPrimeiro", pagamentoQuinzenalPrimeiro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pagamentoQuinzenalSegundo", pagamentoQuinzenalSegundo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "percentualRAV", percentualRAV));
    
    queryParams.addAll(apiClient.parameterToPairs("", "recebeRAV", recebeRAV));
    
    queryParams.addAll(apiClient.parameterToPairs("", "percentualMultiplica", percentualMultiplica));
    
    queryParams.addAll(apiClient.parameterToPairs("", "taxaAdm", taxaAdm));
    
    queryParams.addAll(apiClient.parameterToPairs("", "taxaBanco", taxaBanco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteRAV", limiteRAV));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idCredorRAV", idCredorRAV));
    

    

    

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

    
    GenericType<PageGrupoEconomicoResponse> returnType = new GenericType<PageGrupoEconomicoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{grupo_origem_comercial_resource_listar}}}
   * {{{grupo_origem_comercial_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param nome {{{grupo_origem_comercial_request_nome_value}}}
   * @return PageGrupoOrigemComercialResponse
   */
  public PageGrupoOrigemComercialResponse listarUsingGET26(List<String> sort, Integer page, Integer limit, String nome) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/grupos-origens-comerciais".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    

    

    

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

    
    GenericType<PageGrupoOrigemComercialResponse> returnType = new GenericType<PageGrupoOrigemComercialResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{maquineta_resource_listar}}}
   * {{{maquineta_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idEstabelecimento {{{maquineta_request_id_estabelecimento_value}}}
   * @return PageMaquinetaResponse
   */
  public PageMaquinetaResponse listarUsingGET28(List<String> sort, Integer page, Integer limit, Long idEstabelecimento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/maquinetas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    

    

    

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

    
    GenericType<PageMaquinetaResponse> returnType = new GenericType<PageMaquinetaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{moeda_resource_listar}}}
   * {{{moeda_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param codigoMoeda {{{moeda_request_codigo_moeda_value}}}
   * @param simbolo {{{moeda_request_simbolo_value}}}
   * @param descricao {{{moeda_request_descricao_value}}}
   * @return PageMoedaResponse
   */
  public PageMoedaResponse listarUsingGET29(List<String> sort, Integer page, Integer limit, String codigoMoeda, String simbolo, String descricao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-moedas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigoMoeda", codigoMoeda));
    
    queryParams.addAll(apiClient.parameterToPairs("", "simbolo", simbolo));
    
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

    
    GenericType<PageMoedaResponse> returnType = new GenericType<PageMoedaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{operacao_credor_resource_listar}}}
   * {{{operacao_credor_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idOperacao {{{operacao_credor_request_id_operacao_value}}}
   * @param idCredor {{{operacao_credor_request_id_credor_value}}}
   * @param idProduto {{{operacao_credor_request_id_produto_value}}}
   * @return PageOperacaoCredorResponse
   */
  public PageOperacaoCredorResponse listarUsingGET30(List<String> sort, Integer page, Integer limit, Long idOperacao, Long idCredor, Long idProduto) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/regras-operacoes-estabelecimentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idOperacao", idOperacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idCredor", idCredor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    

    

    

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

    
    GenericType<PageOperacaoCredorResponse> returnType = new GenericType<PageOperacaoCredorResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{telefone_estabelecimento_resource_listar}}}
   * {{{telefone_estabelecimento_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idEstabelecimento {{{telefone_estabelecimento_request_id_estabelecimento_value}}}
   * @return PageTelefoneEstabelecimentoResponse
   */
  public PageTelefoneEstabelecimentoResponse listarUsingGET44(List<String> sort, Integer page, Integer limit, Long idEstabelecimento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/telefones-estabelecimentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    

    

    

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

    
    GenericType<PageTelefoneEstabelecimentoResponse> returnType = new GenericType<PageTelefoneEstabelecimentoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{terminal_resource_listar}}}
   * {{{terminal_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{terminal_request_id_value}}}
   * @param terminal {{{terminal_request_terminal_value}}}
   * @param numeroEstabelecimento {{{terminal_request_numero_estabelecimento_value}}}
   * @param idEstabelecimento {{{terminal_request_id_estabelecimento_value}}}
   * @return PageTerminalResponse
   */
  public PageTerminalResponse listarUsingGET46(List<String> sort, Integer page, Integer limit, Long id, String terminal, Long numeroEstabelecimento, Long idEstabelecimento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/terminais".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "terminal", terminal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroEstabelecimento", numeroEstabelecimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    

    

    

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

    
    GenericType<PageTerminalResponse> returnType = new GenericType<PageTerminalResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{vinculo_estabelecimento_adquirente_resource_listar}}}
   * {{{vinculo_estabelecimento_adquirente_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idAdquirente {{{vinculo_estabelecimento_adquirente_request_id_adquirente_value}}}
   * @param idEstabelecimento {{{vinculo_estabelecimento_adquirente_request_id_estabelecimento_value}}}
   * @param codigoEstabelecimentoAdquirente {{{vinculo_estabelecimento_adquirente_request_codigo_estabelecimento_adquirente_value}}}
   * @return PageVinculoEstabelecimentoAdquirenteResponse
   */
  public PageVinculoEstabelecimentoAdquirenteResponse listarUsingGET58(List<String> sort, Integer page, Integer limit, Long idAdquirente, Long idEstabelecimento, String codigoEstabelecimentoAdquirente) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/adquirentes-estabelecimento".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idAdquirente", idAdquirente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigoEstabelecimentoAdquirente", codigoEstabelecimentoAdquirente));
    

    

    

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

    
    GenericType<PageVinculoEstabelecimentoAdquirenteResponse> returnType = new GenericType<PageVinculoEstabelecimentoAdquirenteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{vinculo_operacao_resource_listar}}}
   * {{{vinculo_operacao_resource_listar_notes}}}
   * @param id {{{vinculo_operacao_resource_listar_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idProduto {{{vinculo_operacao_request_id_produto_value}}}
   * @param idOperacao {{{vinculo_operacao_request_id_operacao_value}}}
   * @param codigoMCC {{{vinculo_operacao_request_codigo_m_c_c_value}}}
   * @return PageVinculoOperacaoResponse
   */
  public PageVinculoOperacaoResponse listarUsingGET59(Long id, List<String> sort, Integer page, Integer limit, Long idProduto, Long idOperacao, Integer codigoMCC) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarUsingGET59");
     }
     
    // create path and map variables
    String path = "/api/estabelecimentos/{id}/operacoes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idOperacao", idOperacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigoMCC", codigoMCC));
    

    

    

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

    
    GenericType<PageVinculoOperacaoResponse> returnType = new GenericType<PageVinculoOperacaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{maquineta_resource_salvar}}}
   * {{{maquineta_resource_salvar_notes}}}
   * @param maquinetaPersist maquinetaPersist
   * @return MaquinetaResponse
   */
  public MaquinetaResponse salvarUsingPOST17(MaquinetaPersist maquinetaPersist) throws ApiException {
    Object postBody = maquinetaPersist;
    
     // verify the required parameter 'maquinetaPersist' is set
     if (maquinetaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'maquinetaPersist' when calling salvarUsingPOST17");
     }
     
    // create path and map variables
    String path = "/api/maquinetas".replaceAll("\\{format\\}","json");

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

    
    GenericType<MaquinetaResponse> returnType = new GenericType<MaquinetaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{operacao_credor_resource_salvar}}}
   * {{{operacao_credor_resource_salvar_notes}}}
   * @param operacaoCredorPersist operacaoCredorPersist
   * @return OperacaoCredorResponse
   */
  public OperacaoCredorResponse salvarUsingPOST18(OperacaoCredorPersist operacaoCredorPersist) throws ApiException {
    Object postBody = operacaoCredorPersist;
    
     // verify the required parameter 'operacaoCredorPersist' is set
     if (operacaoCredorPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'operacaoCredorPersist' when calling salvarUsingPOST18");
     }
     
    // create path and map variables
    String path = "/api/regras-operacoes-estabelecimentos".replaceAll("\\{format\\}","json");

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

    
    GenericType<OperacaoCredorResponse> returnType = new GenericType<OperacaoCredorResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{telefone_estabelecimento_resource_salvar}}}
   * {{{telefone_estabelecimento_resource_salvar_notes}}}
   * @param telefoneEstabelecimentoPersist telefoneEstabelecimentoPersist
   * @return TelefoneEstabelecimentoResponse
   */
  public TelefoneEstabelecimentoResponse salvarUsingPOST23(TelefoneEstabelecimentoPersist telefoneEstabelecimentoPersist) throws ApiException {
    Object postBody = telefoneEstabelecimentoPersist;
    
     // verify the required parameter 'telefoneEstabelecimentoPersist' is set
     if (telefoneEstabelecimentoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'telefoneEstabelecimentoPersist' when calling salvarUsingPOST23");
     }
     
    // create path and map variables
    String path = "/api/telefones-estabelecimentos".replaceAll("\\{format\\}","json");

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

    
    GenericType<TelefoneEstabelecimentoResponse> returnType = new GenericType<TelefoneEstabelecimentoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{terminal_resource_salvar}}}
   * {{{terminal_resource_salvar_notes}}}
   * @param terminalPersist terminalPersist
   * @return TerminalResponse
   */
  public TerminalResponse salvarUsingPOST25(TerminalPersist terminalPersist) throws ApiException {
    Object postBody = terminalPersist;
    
     // verify the required parameter 'terminalPersist' is set
     if (terminalPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'terminalPersist' when calling salvarUsingPOST25");
     }
     
    // create path and map variables
    String path = "/api/terminais".replaceAll("\\{format\\}","json");

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

    
    GenericType<TerminalResponse> returnType = new GenericType<TerminalResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{vinculo_estabelecimento_adquirente_resource_salvar}}}
   * {{{vinculo_estabelecimento_adquirente_resource_salvar_notes}}}
   * @param vinculoEstabelecimentoAdquirentePersist vinculoEstabelecimentoAdquirentePersist
   * @return VinculoEstabelecimentoAdquirenteResponse
   */
  public VinculoEstabelecimentoAdquirenteResponse salvarUsingPOST29(VinculoEstabelecimentoAdquirentePersist vinculoEstabelecimentoAdquirentePersist) throws ApiException {
    Object postBody = vinculoEstabelecimentoAdquirentePersist;
    
     // verify the required parameter 'vinculoEstabelecimentoAdquirentePersist' is set
     if (vinculoEstabelecimentoAdquirentePersist == null) {
        throw new ApiException(400, "Missing the required parameter 'vinculoEstabelecimentoAdquirentePersist' when calling salvarUsingPOST29");
     }
     
    // create path and map variables
    String path = "/api/adquirentes-estabelecimento".replaceAll("\\{format\\}","json");

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

    
    GenericType<VinculoEstabelecimentoAdquirenteResponse> returnType = new GenericType<VinculoEstabelecimentoAdquirenteResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
