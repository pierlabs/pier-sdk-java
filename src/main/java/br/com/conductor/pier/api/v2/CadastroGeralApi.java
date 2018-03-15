package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.CampanhaResponse;
import br.com.conductor.pier.api.v2.model.CampanhaUpdate;
import br.com.conductor.pier.api.v2.model.ConfiguracaoRegistroCobrancaPersist;
import br.com.conductor.pier.api.v2.model.ConfiguracaoRegistroCobrancaResponse;
import br.com.conductor.pier.api.v2.model.ConfiguracaoRotativoDetalheResponse;
import br.com.conductor.pier.api.v2.model.ConfiguracaoRotativoPersist;
import br.com.conductor.pier.api.v2.model.ParametroProdutoResponse;
import br.com.conductor.pier.api.v2.model.TaxaAntecipacaoRequest;
import br.com.conductor.pier.api.v2.model.ProdutoDetalhesResponse;
import br.com.conductor.pier.api.v2.model.PageTipoAjusteResponse;
import br.com.conductor.pier.api.v2.model.PageTipoBoletoResponse;
import br.com.conductor.pier.api.v2.model.TipoEnderecoResponse;
import br.com.conductor.pier.api.v2.model.TipoOperacaoResponse;
import br.com.conductor.pier.api.v2.model.TipoTelefoneResponse;
import br.com.conductor.pier.api.v2.model.AtendimentoClienteResponse;
import br.com.conductor.pier.api.v2.model.BancoResponse;
import br.com.conductor.pier.api.v2.model.PageCampanhaResponse;
import br.com.conductor.pier.api.v2.model.PageContaDetalheResponse;
import br.com.conductor.pier.api.v2.model.PageCampoCodificadoDescricaoResponse;
import br.com.conductor.pier.api.v2.model.PageFantasiaBasicaResponse;
import br.com.conductor.pier.api.v2.model.HistoricoTelefoneResponse;
import br.com.conductor.pier.api.v2.model.PageTipoCampanhaResponse;
import br.com.conductor.pier.api.v2.model.PageConfiguracaoRotativoResponse;
import br.com.conductor.pier.api.v2.model.PagePortadorResponse;
import br.com.conductor.pier.api.v2.model.PageProdutoResponse;
import br.com.conductor.pier.api.v2.model.PagePromotorResponse;
import br.com.conductor.pier.api.v2.model.PageTipoEnderecoResponse;
import br.com.conductor.pier.api.v2.model.PageTipoTelefoneResponse;
import br.com.conductor.pier.api.v2.model.PageControleVencimentoResponse;
import br.com.conductor.pier.api.v2.model.PageAtendimentoClienteResponse;
import br.com.conductor.pier.api.v2.model.PageBancoResponse;
import br.com.conductor.pier.api.v2.model.CampanhaPersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CadastroGeralApi {
  private ApiClient apiClient;

  public CadastroGeralApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CadastroGeralApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Alterar campanha
   * Este m\u00E9todo permite que sejam alterados os dados de uma campanha.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da campanha (id).
   * @param update update
   * @return CampanhaResponse
   */
  public CampanhaResponse alterarUsingPUT2(Long id, CampanhaUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT2");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling alterarUsingPUT2");
     }
     
    // create path and map variables
    String path = "/api/campanhas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<CampanhaResponse> returnType = new GenericType<CampanhaResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Atualizar configura\u00E7\u00E3o para registro de cobran\u00E7a
   * Este m\u00E9todo permite atualizar uma configura\u00E7\u00E3o, para registro de cobran\u00E7a.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da configura\u00E7\u00E3o (id).
   * @param configuracaoPersist configuracaoPersist
   * @return ConfiguracaoRegistroCobrancaResponse
   */
  public ConfiguracaoRegistroCobrancaResponse alterarUsingPUT3(Long id, ConfiguracaoRegistroCobrancaPersist configuracaoPersist) throws ApiException {
    Object postBody = configuracaoPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT3");
     }
     
     // verify the required parameter 'configuracaoPersist' is set
     if (configuracaoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'configuracaoPersist' when calling alterarUsingPUT3");
     }
     
    // create path and map variables
    String path = "/api/configuracoes-registro-cobranca/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ConfiguracaoRegistroCobrancaResponse> returnType = new GenericType<ConfiguracaoRegistroCobrancaResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Alterar os dados de configura\u00E7\u00E3o do rotativo de um produto
   * Este m\u00E9todo permite que seja alterada uma configura\u00E7\u00E3o do rotativo para um determinado produto.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da configura\u00E7\u00E3o (id).
   * @param configuracaoRotativoPersist configuracaoRotativoPersist
   * @return ConfiguracaoRotativoDetalheResponse
   */
  public ConfiguracaoRotativoDetalheResponse alterarUsingPUT4(Long id, ConfiguracaoRotativoPersist configuracaoRotativoPersist) throws ApiException {
    Object postBody = configuracaoRotativoPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT4");
     }
     
     // verify the required parameter 'configuracaoRotativoPersist' is set
     if (configuracaoRotativoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'configuracaoRotativoPersist' when calling alterarUsingPUT4");
     }
     
    // create path and map variables
    String path = "/api/configuracoes-rotativos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ConfiguracaoRotativoDetalheResponse> returnType = new GenericType<ConfiguracaoRotativoDetalheResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Inserir configura\u00E7\u00E3o para registro de cobran\u00E7a
   * Este m\u00E9todo permite que seja cadastrado uma nova configura\u00E7\u00E3o, para registro de cobran\u00E7a.
   * @param configuracaoPersist configuracaoPersist
   * @return ConfiguracaoRegistroCobrancaResponse
   */
  public ConfiguracaoRegistroCobrancaResponse cadastrarUsingPOST1(ConfiguracaoRegistroCobrancaPersist configuracaoPersist) throws ApiException {
    Object postBody = configuracaoPersist;
    
     // verify the required parameter 'configuracaoPersist' is set
     if (configuracaoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'configuracaoPersist' when calling cadastrarUsingPOST1");
     }
     
    // create path and map variables
    String path = "/api/configuracoes-registro-cobranca".replaceAll("\\{format\\}","json");

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

    
    GenericType<ConfiguracaoRegistroCobrancaResponse> returnType = new GenericType<ConfiguracaoRegistroCobrancaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Configura a Taxa de Antecipa\u00E7\u00E3o de um Produto
   * Este recurso permite configurar a Taxa de Antecipa\u00E7\u00E3o de um Produto, a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id Id Produto
   * @param taxaAntecipacaoRequest taxaAntecipacaoRequest
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse configurarTaxaAntecipacaoUsingPOST(Long id, TaxaAntecipacaoRequest taxaAntecipacaoRequest) throws ApiException {
    Object postBody = taxaAntecipacaoRequest;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling configurarTaxaAntecipacaoUsingPOST");
     }
     
     // verify the required parameter 'taxaAntecipacaoRequest' is set
     if (taxaAntecipacaoRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'taxaAntecipacaoRequest' when calling configurarTaxaAntecipacaoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/produtos/{id}/configurar-taxa-antecipacao".replaceAll("\\{format\\}","json")
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

    
    GenericType<ParametroProdutoResponse> returnType = new GenericType<ParametroProdutoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar campanha
   * Este m\u00E9todo permite que sejam listados os dados de uma determinada campanha existente na base do emissor. Para isso, \u00E9 preciso informar o seu respectivo c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id ID da Campanha
   * @return CampanhaResponse
   */
  public CampanhaResponse consultarCampanhaUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarCampanhaUsingGET");
     }
     
    // create path and map variables
    String path = "/api/campanhas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<CampanhaResponse> returnType = new GenericType<CampanhaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta a Taxa de Antecipa\u00E7\u00E3o de um Produto
   * Este recurso permite consultar a Taxa de Antecipa\u00E7\u00E3o de um Produto, a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id Id Produto
   * @param tipoTransacao Tipo da Transa\u00E7\u00E3o (ON-US ou OFF-US)
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse consultarTaxaAntecipacaoUsingGET(Long id, String tipoTransacao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxaAntecipacaoUsingGET");
     }
     
     // verify the required parameter 'tipoTransacao' is set
     if (tipoTransacao == null) {
        throw new ApiException(400, "Missing the required parameter 'tipoTransacao' when calling consultarTaxaAntecipacaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/produtos/{id}/consultar-taxa-antecipacao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoTransacao", tipoTransacao));
    

    

    

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

    
    GenericType<ParametroProdutoResponse> returnType = new GenericType<ParametroProdutoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar configura\u00E7\u00E3o para registro de cobran\u00E7a
   * Este m\u00E9todo permite buscar uma configura\u00E7\u00E3o, para registro de cobran\u00E7a.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da configura\u00E7\u00E3o (id).
   * @return ConfiguracaoRegistroCobrancaResponse
   */
  public ConfiguracaoRegistroCobrancaResponse consultarUsingGET10(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET10");
     }
     
    // create path and map variables
    String path = "/api/configuracoes-registro-cobranca/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ConfiguracaoRegistroCobrancaResponse> returnType = new GenericType<ConfiguracaoRegistroCobrancaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta dados de configura\u00E7\u00E3o do rotativo espec\u00EDfico.
   * Este recurso permite consultar dados de configura\u00E7\u00E3o do parcelamento rotativo a partir de seu codigo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de identifica\u00E7\u00E3o de configura\u00E7\u00E3o rotativo (id).
   * @return ConfiguracaoRotativoDetalheResponse
   */
  public ConfiguracaoRotativoDetalheResponse consultarUsingGET11(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET11");
     }
     
    // create path and map variables
    String path = "/api/configuracoes-rotativos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ConfiguracaoRotativoDetalheResponse> returnType = new GenericType<ConfiguracaoRotativoDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Produto
   * Este m\u00E9todo permite consultar um determinado Produto a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Produto (id)
   * @return ProdutoDetalhesResponse
   */
  public ProdutoDetalhesResponse consultarUsingGET26(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET26");
     }
     
    // create path and map variables
    String path = "/api/produtos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ProdutoDetalhesResponse> returnType = new GenericType<ProdutoDetalhesResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os tipos de ajustes do emissor 
   * Este recurso permite que sejam listados os tipos de ajustes existentes na base de dados do emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param id C\u00F3digo identificador do tipo de ajuste.
   * @param descricao Descri\u00E7\u00E3o do tipo de ajuste.
   * @return PageTipoAjusteResponse
   */
  public PageTipoAjusteResponse consultarUsingGET33(List<String> sort, Integer page, Integer limit, Long id, String descricao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-ajustes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
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

    
    GenericType<PageTipoAjusteResponse> returnType = new GenericType<PageTipoAjusteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os tipos de boletos do emissor 
   * Este recurso permite que sejam listados os tipos de boletos existentes na base de dados do emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param id C\u00F3digo identificador do tipo de boleto.
   * @param descricao Descri\u00E7\u00E3o do tipo de boleto.
   * @param banco C\u00F3digo identificador do banco.
   * @return PageTipoBoletoResponse
   */
  public PageTipoBoletoResponse consultarUsingGET34(List<String> sort, Integer page, Integer limit, Long id, String descricao, Long banco) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-boletos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "banco", banco));
    

    

    

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

    
    GenericType<PageTipoBoletoResponse> returnType = new GenericType<PageTipoBoletoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Tipo de Endere\u00E7o
   * Este m\u00E9todo permite consultar um determinado Tipo de Endere\u00E7o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Endere\u00E7o (id)
   * @return TipoEnderecoResponse
   */
  public TipoEnderecoResponse consultarUsingGET35(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET35");
     }
     
    // create path and map variables
    String path = "/api/tipos-enderecos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoEnderecoResponse> returnType = new GenericType<TipoEnderecoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta dados de um determinado tipo de opera\u00E7\u00E3o
   * Este recurso permite consultar dados de um determinado tipo opera\u00E7\u00E3o a partir do idCartao, idEstabelecimento e codigoProcessamento.
   * @param idCartao C\u00F3digo de identifica\u00E7\u00E3o do cartao (idCartao).
   * @param idEstabelecimento C\u00F3digo de identifica\u00E7\u00E3o do estabelecimento (idEstabelecimento).
   * @param codigoProcessamento C\u00F3digo de processamento da opera\u00E7\u00E3o.
   * @return TipoOperacaoResponse
   */
  public TipoOperacaoResponse consultarUsingGET36(Long idCartao, Long idEstabelecimento, String codigoProcessamento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idCartao' is set
     if (idCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idCartao' when calling consultarUsingGET36");
     }
     
     // verify the required parameter 'idEstabelecimento' is set
     if (idEstabelecimento == null) {
        throw new ApiException(400, "Missing the required parameter 'idEstabelecimento' when calling consultarUsingGET36");
     }
     
     // verify the required parameter 'codigoProcessamento' is set
     if (codigoProcessamento == null) {
        throw new ApiException(400, "Missing the required parameter 'codigoProcessamento' when calling consultarUsingGET36");
     }
     
    // create path and map variables
    String path = "/api/tipos-operacoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
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

    
    GenericType<TipoOperacaoResponse> returnType = new GenericType<TipoOperacaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Tipo de Telefone
   * Este m\u00E9todo permite consultar um determinado Tipo de Telefone a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id)
   * @return TipoTelefoneResponse
   */
  public TipoTelefoneResponse consultarUsingGET38(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET38");
     }
     
    // create path and map variables
    String path = "/api/tipos-telefones/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoTelefoneResponse> returnType = new GenericType<TipoTelefoneResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Atendimento
   * Este m\u00E9todo permite consultar os par\u00E2metros de um determinado Atendimento a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (idAtendimento).
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do atendimento cliente (id).
   * @return AtendimentoClienteResponse
   */
  public AtendimentoClienteResponse consultarUsingGET4(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET4");
     }
     
    // create path and map variables
    String path = "/api/atendimento-clientes/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<AtendimentoClienteResponse> returnType = new GenericType<AtendimentoClienteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Banco
   * Este m\u00E9todo permite consultar um determinado Banco a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Banco (id).
   * @return BancoResponse
   */
  public BancoResponse consultarUsingGET6(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET6");
     }
     
    // create path and map variables
    String path = "/api/bancos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<BancoResponse> returnType = new GenericType<BancoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar Campanhas
   * Lista as campanhas.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param idTipoCampanha C\u00F3digo de Identifica\u00E7\u00E3o do tipo de campanha (id).
   * @return PageCampanhaResponse
   */
  public PageCampanhaResponse listarCampanhasUsingGET(List<String> sort, Integer page, Integer limit, Long idTipoCampanha) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/campanhas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoCampanha", idTipoCampanha));
    

    

    

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

    
    GenericType<PageCampanhaResponse> returnType = new GenericType<PageCampanhaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as contas da pessoa
   * Permite listar as contas de um pessoa a partir do seu numero na receita federal.
   * @param numeroReceitaFederal N\u00FAmero de identifica\u00E7\u00E3o do cliente na Receita Federal (CPF ou CNPJ)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageContaDetalheResponse
   */
  public PageContaDetalheResponse listarContasPorPessoaUsingGET(String numeroReceitaFederal, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'numeroReceitaFederal' is set
     if (numeroReceitaFederal == null) {
        throw new ApiException(400, "Missing the required parameter 'numeroReceitaFederal' when calling listarContasPorPessoaUsingGET");
     }
     
    // create path and map variables
    String path = "/api/pessoas/listar-contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
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

    
    GenericType<PageContaDetalheResponse> returnType = new GenericType<PageContaDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Estados C\u00EDvis
   * Este m\u00E9todo permite que sejam listados os Estados C\u00EDvis na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse listarEstadosCivisUsingGET(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/estados-civis".replaceAll("\\{format\\}","json");

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
   * Listar Fantasias B\u00E1sicas
   * Lista as fantasia b\u00E1sicas.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageFantasiaBasicaResponse
   */
  public PageFantasiaBasicaResponse listarFantasiasBasicasUsingGET(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/fantasias-basicas".replaceAll("\\{format\\}","json");

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

    
    GenericType<PageFantasiaBasicaResponse> returnType = new GenericType<PageFantasiaBasicaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar altera\u00E7\u00F5es de telefones realizadas nos \u00FAltimos 60 dias
   * Este m\u00E9todo permite verificar quais os telefones de um determinado que cliente que sofreram altera\u00E7\u00E3o nos \u00FAltimos 60 dias.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da pessoa (id).
   * @return HistoricoTelefoneResponse
   */
  public HistoricoTelefoneResponse listarHistoricoTelefonesUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoTelefonesUsingGET");
     }
     
    // create path and map variables
    String path = "/api/pessoas/{id}/historico-telefones".replaceAll("\\{format\\}","json")
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

    
    GenericType<HistoricoTelefoneResponse> returnType = new GenericType<HistoricoTelefoneResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista nacionalidades
   * Este m\u00E9todo permite que sejam listados as nacionalidades na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse listarNacionalidadesUsingGET(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/nacionalidades".replaceAll("\\{format\\}","json");

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
   * Lista as Ocupa\u00E7\u00F5es
   * Este m\u00E9todo permite que sejam listados as naturezas de opera\u00E7\u00F5es na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse listarNaturezasOcupacoesUsingGET(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/ocupacoes".replaceAll("\\{format\\}","json");

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
   * Lista os Parentescos
   * Este m\u00E9todo permite que sejam listados parentescos na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse listarParentescosUsingGET(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/parentescos".replaceAll("\\{format\\}","json");

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
   * Lista profiss\u00F5es
   * Este m\u00E9todo permite que sejam listados as profiss\u00F5es na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse listarProfissoesUsingGET(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/profissoes".replaceAll("\\{format\\}","json");

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
   * Listar Tipos de Campanhas
   * Lista os tipos de campanhas.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageTipoCampanhaResponse
   */
  public PageTipoCampanhaResponse listarTiposCampanhasUsingGET(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-campanhas".replaceAll("\\{format\\}","json");

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

    
    GenericType<PageTipoCampanhaResponse> returnType = new GenericType<PageTipoCampanhaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar configura\u00E7\u00F5es para registro de cobran\u00E7a
   * Este m\u00E9todo permite listar as configura\u00E7\u00F5es de registro de cobran\u00E7a.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return ConfiguracaoRegistroCobrancaResponse
   */
  public ConfiguracaoRegistroCobrancaResponse listarUsingGET13(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/configuracoes-registro-cobranca".replaceAll("\\{format\\}","json");

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

    
    GenericType<ConfiguracaoRegistroCobrancaResponse> returnType = new GenericType<ConfiguracaoRegistroCobrancaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar as configura\u00E7\u00F5es rotativo.
   * Este recurso permite listar as configura\u00E7\u00F5es rotativo.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param idProduto C\u00F3digo de identifica\u00E7\u00E3o do Produto.
   * @return PageConfiguracaoRotativoResponse
   */
  public PageConfiguracaoRotativoResponse listarUsingGET14(List<String> sort, Integer page, Integer limit, Long idProduto) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/configuracoes-rotativos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
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

    
    GenericType<PageConfiguracaoRotativoResponse> returnType = new GenericType<PageConfiguracaoRotativoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Portadores existentes
   * Este m\u00E9todo permite que sejam listados os portadores cadastrados na base do emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id).
   * @param idProduto C\u00F3digo de Identifica\u00E7\u00E3o do Produto (id).
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa (id).
   * @param idParentesco C\u00F3digo de Identifica\u00E7\u00E3o do Parentesco (id)
   * @param tipoPortador Apresenta o tipo do Portador do cart\u00E3o, sendo: (&#39;T&#39;: Titular, &#39;A&#39;: Adicional).
   * @param nomeImpresso Apresenta o nome a ser impresso no cart\u00E3o.
   * @param idTipoCartao Apresenta o c\u00F3digo de identifica\u00E7\u00E3o do tipo do cart\u00E3o (id), que ser\u00E1 utilizado para gerar os cart\u00F5es deste portador, vinculados a sua respectiva conta atrav\u00E9s do campo idConta.
   * @param flagAtivo Quanto ativa, indica que o cadastro do Portador est\u00E1 ativo, em emissores que realizam este tipo de gest\u00E3o.
   * @param dataCadastroPortador Apresenta a data em que o Portador fora cadastrado, quando possuir esta informa\u00E7\u00E3o.
   * @param dataCancelamentoPortador Apresenta a data em que o Portador fora cancelado, quando possuir esta informa\u00E7\u00E3o.
   * @return PagePortadorResponse
   */
  public PagePortadorResponse listarUsingGET34(List<String> sort, Integer page, Integer limit, Long idConta, Long idProduto, Long idPessoa, Long idParentesco, String tipoPortador, String nomeImpresso, Long idTipoCartao, Integer flagAtivo, String dataCadastroPortador, String dataCancelamentoPortador) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/portadores".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idParentesco", idParentesco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoPortador", tipoPortador));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeImpresso", nomeImpresso));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoCartao", idTipoCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCadastroPortador", dataCadastroPortador));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCancelamentoPortador", dataCancelamentoPortador));
    

    

    

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

    
    GenericType<PagePortadorResponse> returnType = new GenericType<PagePortadorResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Produtos do Emissor
   * Este m\u00E9todo permite que sejam listados os Produtos existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param nome Descri\u00E7\u00E3o do Nome do Produto.
   * @param status Representa o Status do Produto, onde: (\&quot;0\&quot;: Inativo), (\&quot;1\&quot;: Ativo).
   * @param idFantasiaBasica C\u00F3digo de Identifica\u00E7\u00E3o da Fantasia B\u00E1sica (id) a qual o produto pertence.
   * @return PageProdutoResponse
   */
  public PageProdutoResponse listarUsingGET35(List<String> sort, Integer page, Integer limit, String nome, Integer status, Long idFantasiaBasica) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/produtos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idFantasiaBasica", idFantasiaBasica));
    

    

    

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

    
    GenericType<PageProdutoResponse> returnType = new GenericType<PageProdutoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista promotores cadastrados na base do emissor
   * Este m\u00E9todo permite que sejam listados os cadastros de Promoteres existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do promotor (id)
   * @param nome Nome do Promotor
   * @param dataCadastro Data da Inclus\u00E3o.
   * @param idEstabelecimento C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento
   * @param idUsuario C\u00F3digo de Identifica\u00E7\u00E3o do usu\u00E1rio
   * @return PagePromotorResponse
   */
  public PagePromotorResponse listarUsingGET36(List<String> sort, Integer page, Integer limit, Long id, String nome, String dataCadastro, Long idEstabelecimento, Long idUsuario) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/promotores".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idUsuario", idUsuario));
    

    

    

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

    
    GenericType<PagePromotorResponse> returnType = new GenericType<PagePromotorResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as op\u00F5es de Tipos de Endere\u00E7os do Emissor 
   * Este m\u00E9todo permite que sejam listados os Tipos de Endere\u00E7os existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Endere\u00E7o (id)
   * @param nome Nome do Tipo do Endere\u00E7o
   * @return PageTipoEnderecoResponse
   */
  public PageTipoEnderecoResponse listarUsingGET44(List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-enderecos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
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

    
    GenericType<PageTipoEnderecoResponse> returnType = new GenericType<PageTipoEnderecoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Tipos de Telefones
   * Este m\u00E9todo permite que sejam listados os Tipos de Telefones existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id).
   * @param nome Nome do Tipo do Telefone
   * @return PageTipoTelefoneResponse
   */
  public PageTipoTelefoneResponse listarUsingGET46(List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-telefones".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
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

    
    GenericType<PageTipoTelefoneResponse> returnType = new GenericType<PageTipoTelefoneResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar Vencimentos
   * Este recurso permite que sejam listados os Vencimentos do emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param dataVencimento Indica a data de vencimento das faturas
   * @return PageControleVencimentoResponse
   */
  public PageControleVencimentoResponse listarUsingGET52(List<String> sort, Integer page, Integer limit, String dataVencimento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/vencimentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataVencimento", dataVencimento));
    

    

    

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

    
    GenericType<PageControleVencimentoResponse> returnType = new GenericType<PageControleVencimentoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista todos os atendimentos
   * Este m\u00E9todo permite que sejam listados todos os Registro de Atendimento, independente do Tipo.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param idTipoAtendimento C\u00F3digo de Identifica\u00E7\u00E3o do Tipo de Atendimento (id)
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o de conta (id).
   * @param nomeAtendente Apresenta o nome do Atendente que registrou o Atendimento.
   * @param dataAtendimento Apresenta a data em que o Atendimento foi realizado.
   * @return PageAtendimentoClienteResponse
   */
  public PageAtendimentoClienteResponse listarUsingGET6(List<String> sort, Integer page, Integer limit, Long idTipoAtendimento, Long idConta, String nomeAtendente, String dataAtendimento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/atendimento-clientes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoAtendimento", idTipoAtendimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeAtendente", nomeAtendente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAtendimento", dataAtendimento));
    

    

    

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

    
    GenericType<PageAtendimentoClienteResponse> returnType = new GenericType<PageAtendimentoClienteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Bancos cadastrados para o Emissor
   * Este m\u00E9todo permite que sejam listados os Bancos existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageBancoResponse
   */
  public PageBancoResponse listarUsingGET8(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/bancos".replaceAll("\\{format\\}","json");

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

    
    GenericType<PageBancoResponse> returnType = new GenericType<PageBancoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastro um novo Atendimento do tipo Gen\u00E9rico para uma Conta
   * 
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta a qual o Atendimento est\u00E1 associado
   * @param conteudoAtendimento Apresenta as informa\u00E7\u00F5es que foram utilizadas para consultar, cadastrar ou alterar informa\u00E7\u00F5es relacionadas ao Atendimento.
   * @param detalhesAtendimento Apresenta os detalhes lan\u00E7ados pelo sistema ou pelo Atendente durante relacionados ao Atendimento.
   * @param nomeAtendente Apresenta o nome do Atendente que registrou o Atendimento.
   * @param dataAtendimento Apresenta a data e hora em que o Atendimento foi realizado no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;.
   * @param dataAgendamento Quando utilizado, de acordo com o Tipo de Atendimento, apresenta a data e hora para processamento ou a data e hora para retorno do Atendimento no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;.
   * @param dataHoraInicioAtendimento Apresenta a data e hora em que o Atendimento foi iniciado. Quando utilizado, serve para medir a performance dos Atendimentos no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;.
   * @param dataHoraFimAtendimento Apresenta a data e hora em que o Atendimento foi finalizado. Quando utilizado, serve para medir a performance dos Atendimentos no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;.
   * @param flagFilaFraude Flag fila fraude
   * @return AtendimentoClienteResponse
   */
  public AtendimentoClienteResponse salvarUsingPOST2(Long idConta, String conteudoAtendimento, String detalhesAtendimento, String nomeAtendente, String dataAtendimento, String dataAgendamento, String dataHoraInicioAtendimento, String dataHoraFimAtendimento, Integer flagFilaFraude) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/atendimento-clientes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "conteudoAtendimento", conteudoAtendimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "detalhesAtendimento", detalhesAtendimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeAtendente", nomeAtendente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAtendimento", dataAtendimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAgendamento", dataAgendamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraInicioAtendimento", dataHoraInicioAtendimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraFimAtendimento", dataHoraFimAtendimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagFilaFraude", flagFilaFraude));
    

    

    

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

    
    GenericType<AtendimentoClienteResponse> returnType = new GenericType<AtendimentoClienteResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Inserir campanha
   * Este m\u00E9todo permite que seja cadastrado uma nova campanha.
   * @param campanhaPersist campanhaPersist
   * @return CampanhaResponse
   */
  public CampanhaResponse salvarUsingPOST5(CampanhaPersist campanhaPersist) throws ApiException {
    Object postBody = campanhaPersist;
    
     // verify the required parameter 'campanhaPersist' is set
     if (campanhaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'campanhaPersist' when calling salvarUsingPOST5");
     }
     
    // create path and map variables
    String path = "/api/campanhas".replaceAll("\\{format\\}","json");

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

    
    GenericType<CampanhaResponse> returnType = new GenericType<CampanhaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Inserir os dados de configura\u00E7\u00E3o do rotativo de um produto
   * Este m\u00E9todo permite que seja cadastrado uma nova configura\u00E7\u00E3o do rotativo para um determinado produto.
   * @param configuracaoRotativoPersist configuracaoRotativoPersist
   * @return ConfiguracaoRotativoDetalheResponse
   */
  public ConfiguracaoRotativoDetalheResponse salvarUsingPOST7(ConfiguracaoRotativoPersist configuracaoRotativoPersist) throws ApiException {
    Object postBody = configuracaoRotativoPersist;
    
     // verify the required parameter 'configuracaoRotativoPersist' is set
     if (configuracaoRotativoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'configuracaoRotativoPersist' when calling salvarUsingPOST7");
     }
     
    // create path and map variables
    String path = "/api/configuracoes-rotativos".replaceAll("\\{format\\}","json");

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

    
    GenericType<ConfiguracaoRotativoDetalheResponse> returnType = new GenericType<ConfiguracaoRotativoDetalheResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
