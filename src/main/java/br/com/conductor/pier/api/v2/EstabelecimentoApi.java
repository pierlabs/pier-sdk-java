package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.OrigemComercialUpdate;
import br.com.conductor.pier.api.v2.model.OrigemComercialResponse;
import br.com.conductor.pier.api.v2.model.MaquinetaResponse;
import br.com.conductor.pier.api.v2.model.MaquinetaUpdate;
import br.com.conductor.pier.api.v2.model.OperacaoCredorUpdate;
import br.com.conductor.pier.api.v2.model.OperacaoCredorResponse;
import br.com.conductor.pier.api.v2.model.TelefoneEstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.TelefoneEstabelecimentoUpdate;
import br.com.conductor.pier.api.v2.model.TerminalUpdate;
import br.com.conductor.pier.api.v2.model.TerminalResponse;
import br.com.conductor.pier.api.v2.model.EstabelecimentoUpdate;
import br.com.conductor.pier.api.v2.model.EstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.GrupoEconomicoDTO;
import br.com.conductor.pier.api.v2.model.GrupoEconomicoResponse;
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
public class EstabelecimentoApi {
  private ApiClient apiClient;

  public EstabelecimentoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EstabelecimentoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Alterar Origem Comercial
   * Altera uma origem comercial.
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da origem comercial
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
   * Altera uma Maquineta
   * Este m\u00E9todo realiza a altera\u00E7\u00E3o das maquinetas dos estabelecimentos.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Maquineta (id).
   * @param maquinetaUpdate maquinetaUpdate
   * @return MaquinetaResponse
   */
  public MaquinetaResponse alterarUsingPUT10(Long id, MaquinetaUpdate maquinetaUpdate) throws ApiException {
    Object postBody = maquinetaUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT10");
     }
     
     // verify the required parameter 'maquinetaUpdate' is set
     if (maquinetaUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'maquinetaUpdate' when calling alterarUsingPUT10");
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
   * Altera uma Regra Opera\u00E7\u00E3o
   * Este m\u00E9todo realiza a altera\u00E7\u00E3o de uma regra opera\u00E7\u00E3o.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Regra Opera\u00E7\u00E3o (id).
   * @param operacaoCredorUpdate operacaoCredorUpdate
   * @return OperacaoCredorResponse
   */
  public OperacaoCredorResponse alterarUsingPUT11(Long id, OperacaoCredorUpdate operacaoCredorUpdate) throws ApiException {
    Object postBody = operacaoCredorUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT11");
     }
     
     // verify the required parameter 'operacaoCredorUpdate' is set
     if (operacaoCredorUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'operacaoCredorUpdate' when calling alterarUsingPUT11");
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
   * Altera um Telefone do estabelecimento
   * Este m\u00E9todo realiza a altera\u00E7\u00E3o dos telefones dos estabelecimentos.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Telefone Estabelecimento (id).
   * @param telefoneEstabelecimentoUpdate telefoneEstabelecimentoUpdate
   * @return TelefoneEstabelecimentoResponse
   */
  public TelefoneEstabelecimentoResponse alterarUsingPUT15(Long id, TelefoneEstabelecimentoUpdate telefoneEstabelecimentoUpdate) throws ApiException {
    Object postBody = telefoneEstabelecimentoUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT15");
     }
     
     // verify the required parameter 'telefoneEstabelecimentoUpdate' is set
     if (telefoneEstabelecimentoUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'telefoneEstabelecimentoUpdate' when calling alterarUsingPUT15");
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
   * Altera um Terminal
   * Este m\u00E9todo realiza a altera\u00E7\u00E3o dos Terminais.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do terminal (id).
   * @param terminalUpdate terminalUpdate
   * @return TerminalResponse
   */
  public TerminalResponse alterarUsingPUT17(Long id, TerminalUpdate terminalUpdate) throws ApiException {
    Object postBody = terminalUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT17");
     }
     
     // verify the required parameter 'terminalUpdate' is set
     if (terminalUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'terminalUpdate' when calling alterarUsingPUT17");
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
   * Alterar um estabelecimento
   * Altera um estabelecimento
   * @param id Id
   * @param update update
   * @return EstabelecimentoResponse
   */
  public EstabelecimentoResponse alterarUsingPUT6(Long id, EstabelecimentoUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT6");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling alterarUsingPUT6");
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
   * Alterar Grupo Econ\u00F4mico
   * Altera um grupo econ\u00F4mico.
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do grupo econ\u00F4mico
   * @param grupoEconomicoDTO grupoEconomicoDTO
   * @return GrupoEconomicoResponse
   */
  public GrupoEconomicoResponse alterarUsingPUT8(Long id, GrupoEconomicoDTO grupoEconomicoDTO) throws ApiException {
    Object postBody = grupoEconomicoDTO;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT8");
     }
     
     // verify the required parameter 'grupoEconomicoDTO' is set
     if (grupoEconomicoDTO == null) {
        throw new ApiException(400, "Missing the required parameter 'grupoEconomicoDTO' when calling alterarUsingPUT8");
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
   * Cadastrar Origem Comercial
   * Cadastra uma origem comercial.
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
   * Cadastrar um estabelecimento
   * Cadastra um novo estabelecimento
   * @param persist persist
   * @return EstabelecimentoResponse
   */
  public EstabelecimentoResponse cadastrarUsingPOST2(EstabelecimentoPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling cadastrarUsingPOST2");
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
   * Cadastrar Grupo Econ\u00F4mico
   * Cadastra um grupo econ\u00F4mico.
   * @param grupoEconomicoDTO GrupoEconomicoDTO
   * @return GrupoEconomicoResponse
   */
  public GrupoEconomicoResponse cadastrarUsingPOST3(GrupoEconomicoDTO grupoEconomicoDTO) throws ApiException {
    Object postBody = grupoEconomicoDTO;
    
     // verify the required parameter 'grupoEconomicoDTO' is set
     if (grupoEconomicoDTO == null) {
        throw new ApiException(400, "Missing the required parameter 'grupoEconomicoDTO' when calling cadastrarUsingPOST3");
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
   * Apresenta dados de um determinado tipo de opera\u00E7\u00E3o
   * Este recurso permite consultar dados de um determinado tipo opera\u00E7\u00E3o a partir do idoperacao
   * @param id C\u00F3digo de processamento da opera\u00E7\u00E3o (idOperacao).
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
   * Consultar Origem Comercial
   * Consulta uma origem comercial atrav\u00E9s do seu identificador.
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da origem comercial
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
   * Consultar estabelecimento por id
   * Consulta os detalhes de um determinado estabelecimento
   * @param id Id
   * @return EstabelecimentoResponse
   */
  public EstabelecimentoResponse consultarUsingGET17(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET17");
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
   * Consultar grupo econ\u00F4mico
   * Consulta um grupo econ\u00F4mico atrav\u00E9s do seu identificador.
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do grupo econ\u00F4mico
   * @return GrupoEconomicoResponse
   */
  public GrupoEconomicoResponse consultarUsingGET19(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET19");
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
   * Apresenta os dados de uma determinada maquineta
   * Este m\u00E9todo permite consultar uma determinada maquineta a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Maquineta (id).
   * @return MaquinetaResponse
   */
  public MaquinetaResponse consultarUsingGET21(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET21");
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
   * Apresenta os dados de uma determinada Regra Opera\u00E7\u00E3o
   * Este m\u00E9todo permite consultar uma determinada regra opera\u00E7\u00E3o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Regra Opera\u00E7\u00E3o (id).
   * @return OperacaoCredorResponse
   */
  public OperacaoCredorResponse consultarUsingGET22(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET22");
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
   * Apresenta os dados de um determinado telefone de um estabelecimento
   * Este m\u00E9todo permite consultar um determinado telefone de um estabelecimento a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Telefone Estabelecimento (id).
   * @return TelefoneEstabelecimentoResponse
   */
  public TelefoneEstabelecimentoResponse consultarUsingGET30(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET30");
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
   * Apresenta os dados de um determinado Terminal
   * Este m\u00E9todo permite consultar um determinado Terminal a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Terminal (id).
   * @return TerminalResponse
   */
  public TerminalResponse consultarUsingGET32(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET32");
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
   * Apresenta os dados de um determinado V\u00EDnculo
   * Este m\u00E9todo permite consultar um determinado V\u00EDnculo a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do V\u00CDnculo (id).
   * @return VinculoEstabelecimentoAdquirenteResponse
   */
  public VinculoEstabelecimentoAdquirenteResponse consultarUsingGET44(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET44");
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
   * Desabilitar um V\u00EDnculo
   * Este m\u00E9todo realiza a desativa\u00E7\u00E3o de um v\u00EDnculo.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do V\u00EDnculo (id).
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
   * Desabilitar um v\u00EDnculo opera\u00E7\u00E3o
   * Este m\u00E9todo permite desabilitar um v\u00EDnculo.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do estabelecimento (id).
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
   * Habilitar um V\u00EDnculo
   * Este m\u00E9todo realiza a ativa\u00E7\u00E3o de um v\u00EDnculo.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do V\u00EDnculo (id).
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
   * Habilitar um v\u00EDnculo opera\u00E7\u00E3o
   * Este m\u00E9todo permite habilitar um v\u00EDnculo.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do estabelecimento (id).
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
   * Apresenta dados de opera\u00E7\u00F5es em uma lista
   * Este recurso permite listar as opera\u00E7\u00E3o
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param idOperacao C\u00F3digo que identifica a opera\u00E7\u00E3o
   * @param codigoProcessamento C\u00F3digo de processamento usado em transa\u00E7\u00F5es com o autorizador
   * @return PageOperacaoResponse
   */
  public PageOperacaoResponse listaOperacaoUsingGET(List<String> sort, Integer page, Integer limit, Long idOperacao, String codigoProcessamento) throws ApiException {
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
   * Lista os MCCs
   * Este m\u00E9todo permite que sejam listados os MCCs existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
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
   * Listar Origens Comerciais
   * Lista origens comerciais cadastradas.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param id Id da origem comercial
   * @param nome Nome da origem comercial
   * @param status Indica o status da origem comercial
   * @param idEstabelecimento Identificador do estabelecimento
   * @param idProduto Identificador do produto
   * @param descricao Descri\u00E7\u00E3o da origem comercial
   * @param idTipoOrigemComercial Identificador do tipo de origem comercial
   * @param idGrupoOrigemComercial Identificador do grupo de origem comercial
   * @param flagPreAprovado Indica se permite pr\u00E9 aprova\u00E7\u00E3o
   * @param flagAprovacaoImediata Indica se permite aprova\u00E7\u00E3o imediata
   * @param nomeFantasiaPlastico Nome fantasia impresso no pl\u00E1stico
   * @param flagCartaoProvisorio Indica se permite cart\u00E3o provis\u00F3rio
   * @param flagCartaoDefinitivo Indica se permite cart\u00E3o definitivo
   * @param usuario Usu\u00E1rio para autentica\u00E7\u00E3o
   * @param senha Senha para autentica\u00E7\u00E3o
   * @param flagOrigemExterna Indica se \u00E9 origem externa
   * @param flagModificado Indica se h\u00E1 modifica\u00E7\u00E3o
   * @param flagEnviaFaturaUsuario Indica se envia fatura
   * @param flagCreditoFaturamento Indica se permite cr\u00E9dito de faturamento
   * @param flagConcedeLimiteProvisorio Indica se concede limite provis\u00F3rio
   * @param flagDigitalizarDoc Indica se digitaliza documento
   * @param flagEmbossingLoja Indica se realiza embossing em loja
   * @param flagConsultaPrevia Indica se realiza consulta pr\u00E9via
   * @param tipoPessoa Tipo de pessoa
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
   * Lista os Tipos de adquirentes
   * Este m\u00E9todo permite que sejam listados os tipos de adquirentes.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
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
   * Lista os tipos de estabelecimentos
   * Lista os tipos de estabelecimentos
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param descricao Descri\u00E7\u00E3o do tipo de estabelecimento.
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
   * Lista os Tipos de  Maquinetas
   * Este m\u00E9todo permite que sejam listadas os Tipos de maquinetas existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
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
   * Listar tipos de origens comerciais
   * Lista os tipos de origens comerciais
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param nome Nome do tipo de origem comercial
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
   * Lista os Tipos Terminais
   * Este m\u00E9todo permite que sejam listados os tipos de terminais existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageTipoTerminalResponse
   */
  public PageTipoTerminalResponse listarTiposTerminaisUsingGET1(List<String> sort, Integer page, Integer limit) throws ApiException {
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
   * Lista Estabelecimentos
   * Lista todos os Estabelecimentos
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do estabelecimento (id).
   * @param idGrupoEconomico Apresenta o n\u00FAmero de identifica\u00E7\u00E3o do Grupo Econ\u00F4mico.
   * @param numeroReceitaFederal Apresenta o n\u00FAmero de identifica\u00E7\u00E3o do Estabelecimento na Receita Federal.
   * @param nome Nome do Estabelecimento.
   * @param descricao Raz\u00E3o Social do Estabelecimento.
   * @param nomeFantasia T\u00EDtulo Comercial do Estabelecimento.
   * @param cep C\u00F3digo de Endere\u00E7amento Postal (CEP).
   * @param nomeLogradouro Nome do Logradouro.
   * @param numeroEndereco N\u00FAmero do endere\u00E7o.
   * @param complemento Descri\u00E7\u00F5es complementares referente ao endere\u00E7o.
   * @param bairro Nome do bairro do endere\u00E7o.
   * @param cidade Nome da cidade do endere\u00E7o.
   * @param uf Sigla de identifica\u00E7\u00E3o da Unidade Federativa do endere\u00E7o.
   * @param pais Nome do pa\u00EDs.
   * @param dataCadastramento Data de Cadastro do Estabelecimento, no formato yyyy-MM-dd.
   * @param contato Nome da pessoa para contato com o Estabelecimento.
   * @param email E-mail da pessoa para contato com o Estabelecimento.
   * @param flagArquivoSecrFazenda Indica se o estabelecimento ser\u00E1 inclu\u00EDdo no arquivo de registro para a Secretaria da Fazenda Estadual.
   * @param flagCartaoDigitado Indica se o estabelecimento poder\u00E1 originar transa\u00E7\u00F5es sem a leitura da tarja ou do chip do cart\u00E3o.
   * @param inativo Indica se o estabelecimento est\u00E1 inativo.
   * @param idPais Identificador de Pa\u00EDs.
   * @param mcc C\u00F3digo de Categoria de Mercado
   * @param idTipoEstabelecimento C\u00F3digo de identifica\u00E7\u00E3o do tipo de Estabelecimento.
   * @param correspondencia Indicador para qual endere\u00E7o as correspond\u00EAncias ser\u00E3o enviadas, onde 1 \u00E9 ORIGEM e 2 ENDERE\u00C7O DE CORRESPOND\u00CANCIA.
   * @param idMoeda C\u00F3digo identificador da moeda.
   * @param tipoPagamento Tipo do regime de pagamento do estabelecimento.
   * @param numeroEstabelecimento N\u00FAmero de identifica\u00E7\u00E3o do Estabelecimento na Conductor.
   * @param cep2 C\u00F3digo de Endere\u00E7amento Postal (CEP).
   * @param nomeLogradouro2 Nome do Logradouro.
   * @param numeroEndereco2 N\u00FAmero do endere\u00E7o.
   * @param complemento2 Descri\u00E7\u00F5es complementares referente ao endere\u00E7o.
   * @param bairro2 Nome do bairro do endere\u00E7o.
   * @param cidade2 Nome da cidade do endere\u00E7o.
   * @param uf2 Sigla de identifica\u00E7\u00E3o da Unidade Federativa do endere\u00E7o.
   * @param flagMatriz Indica se \u00E9 matriz ou filial.
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
   * Listar grupos econ\u00F4micos
   * Lista grupos econ\u00F4micos cadastrados. 
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param razaoSocial Raz\u00E3o social da pessoa jur\u00EDdica
   * @param nomeCredor Nome do credor
   * @param numeroReceitaFederal N\u00FAmero da Receita Federal
   * @param inscricaoEstadual N\u00FAmero da inscri\u00E7\u00E3o estadual
   * @param contato Nome da pessoa para entrar em contato
   * @param banco C\u00F3digo do banco
   * @param agencia Raz\u00E3o social da pessoa jur\u00EDdica
   * @param digitoAgencia D\u00EDgito Verificador da ag\u00EAncia
   * @param contaCorrente C\u00F3digo da Conta Corrente
   * @param digitoContaCorrente D\u00EDgito Verificador da Conta Corrente
   * @param periodicidade Periodicidade do pagamento
   * @param pagamentoSemanal Dia para pagamento semanal
   * @param pagamentoMensal Dia da data para o pagamento mensal
   * @param pagamentoDecendialPrimeiro Dia da data para o primeiro pagamento decendial
   * @param pagamentoDecendialSegundo Dia da data para o segundo pagamento decendial
   * @param pagamentoDecendialTerceiro Dia da data para o terceiro pagamento decendial
   * @param pagamentoQuinzenalPrimeiro Dia da data para o primeiro pagamento quinzenal
   * @param pagamentoQuinzenalSegundo Dia da data para o segundo pagamento quinzenal
   * @param percentualRAV Valor percentual do RAV do credor
   * @param recebeRAV Indica se o credor recebe RAV e o tipo
   * @param percentualMultiplica Percentual Multiplica
   * @param taxaAdm Taxa Administrativa
   * @param taxaBanco Taxa do Banco
   * @param limiteRAV Valor limite do RAV
   * @param idCredorRAV C\u00F3digo identificador do credor RAV
   * @return PageGrupoEconomicoResponse
   */
  public PageGrupoEconomicoResponse listarUsingGET24(List<String> sort, Integer page, Integer limit, String razaoSocial, String nomeCredor, String numeroReceitaFederal, String inscricaoEstadual, String contato, Integer banco, Integer agencia, String digitoAgencia, String contaCorrente, String digitoContaCorrente, String periodicidade, String pagamentoSemanal, Integer pagamentoMensal, Integer pagamentoDecendialPrimeiro, Integer pagamentoDecendialSegundo, Integer pagamentoDecendialTerceiro, Integer pagamentoQuinzenalPrimeiro, Integer pagamentoQuinzenalSegundo, BigDecimal percentualRAV, String recebeRAV, BigDecimal percentualMultiplica, BigDecimal taxaAdm, BigDecimal taxaBanco, BigDecimal limiteRAV, Long idCredorRAV) throws ApiException {
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
   * Listar grupos de origens comerciais
   * Lista os grupos de origens comerciais
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param nome Nome do grupo de origem comercial
   * @return PageGrupoOrigemComercialResponse
   */
  public PageGrupoOrigemComercialResponse listarUsingGET25(List<String> sort, Integer page, Integer limit, String nome) throws ApiException {
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
   * Lista as Maquinetas
   * Este m\u00E9todo permite que sejam listadas as maquinetas existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param idEstabelecimento C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Estabelecimento (id).
   * @return PageMaquinetaResponse
   */
  public PageMaquinetaResponse listarUsingGET27(List<String> sort, Integer page, Integer limit, Long idEstabelecimento) throws ApiException {
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
   * Lista os tipos de moedas do emissor 
   * Este recurso permite que sejam listados os tipos de moedas existentes na base de dados do emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param codigoMoeda C\u00F3digo identificador do tipo de moeda.
   * @param simbolo S\u00EDmbolo da Moeda.
   * @param descricao Descri\u00E7\u00E3o do tipo da moeda.
   * @return PageMoedaResponse
   */
  public PageMoedaResponse listarUsingGET28(List<String> sort, Integer page, Integer limit, String codigoMoeda, String simbolo, String descricao) throws ApiException {
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
   * Lista as Regras Opera\u00E7\u00F5es
   * Este m\u00E9todo permite que sejam listados as Regras opera\u00E7\u00F5es existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param idOperacao Apresenta o id da Opera\u00E7\u00E3o.
   * @param idCredor Apresenta o id do Credor.
   * @param idProduto Apresenta o id do produto que vai ser alterado.
   * @return PageOperacaoCredorResponse
   */
  public PageOperacaoCredorResponse listarUsingGET29(List<String> sort, Integer page, Integer limit, Long idOperacao, Long idCredor, Long idProduto) throws ApiException {
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
   * Lista os Telefones Estabelecimentos
   * Este m\u00E9todo permite que sejam listados os telefones dos estabelecimentos existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param idEstabelecimento C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Estabelecimento (id).
   * @return PageTelefoneEstabelecimentoResponse
   */
  public PageTelefoneEstabelecimentoResponse listarUsingGET40(List<String> sort, Integer page, Integer limit, Long idEstabelecimento) throws ApiException {
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
   * Lista os Terminais cadastrados no Emissor
   * Este m\u00E9todo permite que sejam listados os terminais existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Terminal (id).
   * @param terminal C\u00F3digo de Identifica\u00E7\u00E3o do terminal.
   * @param numeroEstabelecimento N\u00FAmero do estabelecimento a qual o terminal pertence.
   * @param idEstabelecimento N\u00FAmero de identifica\u00E7\u00E3o do estabelecimento a qual o terminal pertence.
   * @return PageTerminalResponse
   */
  public PageTerminalResponse listarUsingGET42(List<String> sort, Integer page, Integer limit, Long id, String terminal, Long numeroEstabelecimento, Long idEstabelecimento) throws ApiException {
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
   * Lista os V\u00EDnculos dos estabelecimento com os adquirentes
   * Este m\u00E9todo permite que sejam listados os V\u00EDnculos dos estabelecimento com os adquirentes.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param idAdquirente C\u00F3digo de Identifica\u00E7\u00E3o do adquirente (id).
   * @param idEstabelecimento C\u00F3digo de Identifica\u00E7\u00E3o do estabelecimento.
   * @param codigoEstabelecimentoAdquirente C\u00F3digo do v\u00EDnculo entre o estabelecimento e o adquirente.
   * @return PageVinculoEstabelecimentoAdquirenteResponse
   */
  public PageVinculoEstabelecimentoAdquirenteResponse listarUsingGET53(List<String> sort, Integer page, Integer limit, Long idAdquirente, Long idEstabelecimento, String codigoEstabelecimentoAdquirente) throws ApiException {
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
   * Listar v\u00EDnculos de opera\u00E7\u00F5es do estabelecimento
   * Lista os v\u00EDnculos de opera\u00E7\u00F5es do estabelecimento. 
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do estabelecimento (id).
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param idProduto C\u00F3digo de Identifica\u00E7\u00E3o do Produto (id).
   * @param idOperacao C\u00F3digo de Identifica\u00E7\u00E3o da Opera\u00E7\u00E3o (id).
   * @param codigoMCC C\u00F3digo MCC.
   * @return PageVinculoOperacaoResponse
   */
  public PageVinculoOperacaoResponse listarUsingGET54(Long id, List<String> sort, Integer page, Integer limit, Long idProduto, Long idOperacao, Integer codigoMCC) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarUsingGET54");
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
   * Realiza o cadastro de uma nova maquineta para um estabelecimento 
   * Este m\u00E9todo permite que seja cadastrada uma nova maquineta para um estabelecimento.
   * @param maquinetaPersist maquinetaPersist
   * @return MaquinetaResponse
   */
  public MaquinetaResponse salvarUsingPOST16(MaquinetaPersist maquinetaPersist) throws ApiException {
    Object postBody = maquinetaPersist;
    
     // verify the required parameter 'maquinetaPersist' is set
     if (maquinetaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'maquinetaPersist' when calling salvarUsingPOST16");
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
   * Realiza o cadastro de uma nova Regra Opera\u00E7\u00E3o
   * Este m\u00E9todo permite que seja cadastrada uma nova Regra Opera\u00E7\u00E3o.
   * @param oprecaoCredorPersist oprecaoCredorPersist
   * @return OperacaoCredorResponse
   */
  public OperacaoCredorResponse salvarUsingPOST17(OperacaoCredorPersist oprecaoCredorPersist) throws ApiException {
    Object postBody = oprecaoCredorPersist;
    
     // verify the required parameter 'oprecaoCredorPersist' is set
     if (oprecaoCredorPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'oprecaoCredorPersist' when calling salvarUsingPOST17");
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
   * Realiza o cadastro de um novo telefone para um estabelecimento 
   * Este m\u00E9todo permite que seja cadastrado um novo telefone para um estabelecimento.
   * @param telefoneEstabelecimentoPersist telefoneEstabelecimentoPersist
   * @return TelefoneEstabelecimentoResponse
   */
  public TelefoneEstabelecimentoResponse salvarUsingPOST22(TelefoneEstabelecimentoPersist telefoneEstabelecimentoPersist) throws ApiException {
    Object postBody = telefoneEstabelecimentoPersist;
    
     // verify the required parameter 'telefoneEstabelecimentoPersist' is set
     if (telefoneEstabelecimentoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'telefoneEstabelecimentoPersist' when calling salvarUsingPOST22");
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
   * Realiza o cadastro de um novo Terminal
   * Este m\u00E9todo permite que seja cadastrado um novo Terminal.
   * @param terminalPersist terminalPersist
   * @return TerminalResponse
   */
  public TerminalResponse salvarUsingPOST24(TerminalPersist terminalPersist) throws ApiException {
    Object postBody = terminalPersist;
    
     // verify the required parameter 'terminalPersist' is set
     if (terminalPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'terminalPersist' when calling salvarUsingPOST24");
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
   * Realiza o cadastro de um novo VinculoEstabelecimentoAdquirente
   * Este m\u00E9todo permite que seja cadastrado um novo VinculoEstabelecimentoAdquirente.
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
