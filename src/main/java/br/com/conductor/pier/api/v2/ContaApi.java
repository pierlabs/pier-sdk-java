package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.ControleSubcontaResponse;
import br.com.conductor.pier.api.v2.model.ControleSubcontaUpdate;
import br.com.conductor.pier.api.v2.model.AlterarProdutoRequest;
import br.com.conductor.pier.api.v2.model.ContaResponse;
import br.com.conductor.pier.api.v2.model.ContaAtribuirCartaoPrePagoRequest;
import br.com.conductor.pier.api.v2.model.AdesaoServicoPartialUpdate;
import br.com.conductor.pier.api.v2.model.AdesaoServicoResponse;
import br.com.conductor.pier.api.v2.model.ContaPartialUpdate;
import br.com.conductor.pier.api.v2.model.SegurancaMobileResponse;
import br.com.conductor.pier.api.v2.model.SegurancaMobileParcialUpdate;
import br.com.conductor.pier.api.v2.model.ContaDebitoTarifaUpdate;
import br.com.conductor.pier.api.v2.model.ContaDebitoTarifaResponse;
import br.com.conductor.pier.api.v2.model.RecargaCelularFavoritoParcialUpdate;
import br.com.conductor.pier.api.v2.model.RecargaCelularFavoritoResponse;
import br.com.conductor.pier.api.v2.model.AdesaoPagamentoSabadoResponse;
import br.com.conductor.pier.api.v2.model.RecargaCelularFavoritoPersist;
import br.com.conductor.pier.api.v2.model.SegurancaMobilePersist;
import br.com.conductor.pier.api.v2.model.BeneficioPagamentoAtrasoResponse;
import br.com.conductor.pier.api.v2.model.BoletoResponse;
import br.com.conductor.pier.api.v2.model.ContaDetalheResponse;
import br.com.conductor.pier.api.v2.model.DividaClienteResponse;
import br.com.conductor.pier.api.v2.model.PageExtratoResponse;
import br.com.conductor.pier.api.v2.model.ExtratoTarifasResponse;
import br.com.conductor.pier.api.v2.model.QuitacaoAnualResponse;
import br.com.conductor.pier.api.v2.model.PageTaxasRefinanciamentoResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoResponse;
import br.com.conductor.pier.api.v2.model.TipoVinculoContaResponse;
import br.com.conductor.pier.api.v2.model.TransacoesCorrentesResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaDetalheResponse;
import br.com.conductor.pier.api.v2.model.ContaMultiAppResponse;
import br.com.conductor.pier.api.v2.model.ContaMultiAppPersist;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.CartaoImpressaoResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmbossingResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmbossingRequest;
import br.com.conductor.pier.api.v2.model.CartaoImpressaoProvisorioResponse;
import br.com.conductor.pier.api.v2.model.PageContaDebitoTarifaResponse;
import br.com.conductor.pier.api.v2.model.PageContaResponse;
import br.com.conductor.pier.api.v2.model.PageControleSubcontaResponse;
import br.com.conductor.pier.api.v2.model.PageRecargaCelularFavoritoResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoEventosResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoAssessoriaResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoAtrasoFaturaResponse;
import br.com.conductor.pier.api.v2.model.PageSegurancaMobileResponse;
import br.com.conductor.pier.api.v2.model.PageVinculoContaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoVinculoContaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoProcessadaNaoProcessadaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoNaoProcessadaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoNegadaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacoesCorrentesResponse;
import br.com.conductor.pier.api.v2.model.PageProjecaoCompraNaoProcessadaResponse;
import br.com.conductor.pier.api.v2.model.PageTransferenciaResponse;
import br.com.conductor.pier.api.v2.model.AdesaoServicoPersist;
import br.com.conductor.pier.api.v2.model.AjusteFinanceiroResponse;
import br.com.conductor.pier.api.v2.model.ContaPersist;
import br.com.conductor.pier.api.v2.model.ContaDebitoTarifaPersist;
import br.com.conductor.pier.api.v2.model.ControleSubcontaPersist;
import br.com.conductor.pier.api.v2.model.TipoVinculoContaPersist;
import br.com.conductor.pier.api.v2.model.VinculoContaPersist;
import br.com.conductor.pier.api.v2.model.VinculoContaResponse;
import br.com.conductor.pier.api.v2.model.EmprestimoPessoalRequest;
import br.com.conductor.pier.api.v2.model.EmprestimoPessoalResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaPortadoresResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaPortadoresPersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaApi {
  private ApiClient apiClient;

  public ContaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Altera parcialmente um controle de uma subconta
   * Este recurso permite atualizar parcialmente um controle de subconta a partir do seu c\u00F3digo de identifica\u00E7\u00E3o. O controle de subconta serve para registrar informa\u00E7\u00F5es adicionais da subconta como apelido, prop\u00F3sito da cria\u00E7\u00E3o da subconta e se ela pode ser gerenciada pela pr\u00F3pria subconta ou apenas pela conta pai.
   * @param id C\u00F3digo identificador do controle de subconta (id)
   * @param controleSubcontaUpdate controleSubcontaUpdate
   * @return ControleSubcontaResponse
   */
  public ControleSubcontaResponse alterarParcialControlesSubcontas(Long id, ControleSubcontaUpdate controleSubcontaUpdate) throws ApiException {
    Object postBody = controleSubcontaUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarParcialControlesSubcontas");
     }
     
     // verify the required parameter 'controleSubcontaUpdate' is set
     if (controleSubcontaUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'controleSubcontaUpdate' when calling alterarParcialControlesSubcontas");
     }
     
    // create path and map variables
    String path = "/api/contas/vinculos/controles-subcontas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ControleSubcontaResponse> returnType = new GenericType<ControleSubcontaResponse>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Altera o produto associado \u00E0 conta
   * O recurso permite fazer modifica\u00E7\u00E3o do produto associado \u00E0 conta
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param request request
   * @return String
   */
  public String alterarProdutoConta(Long id, AlterarProdutoRequest request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarProdutoConta");
     }
     
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling alterarProdutoConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/alterar-produto".replaceAll("\\{format\\}","json")
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

    
    GenericType<String> returnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a altera\u00E7\u00E3o de uma Pessoa tilular da conta
   * Esta m\u00E9todo permite altera a pessoa de uma conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id)
   * @param idPessoa C\u00F3digo de identifica\u00E7\u00E3o de uma Pessoa (id)
   * @return ContaResponse
   */
  public ContaResponse alterarTitular(Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTitular");
     }
     
     // verify the required parameter 'idPessoa' is set
     if (idPessoa == null) {
        throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling alterarTitular");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/alterar-titular".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_pessoa", idPessoa));
    

    

    

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

    
    GenericType<ContaResponse> returnType = new GenericType<ContaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a altera\u00E7\u00E3o do dia de vencimento das faturas da conta
   * Esse recurso permite alterar o vencimento para no m\u00E1ximo at\u00E9 30 dias ap\u00F3s data atual de uma conta especifica no PIER, respeitando o par\u00E2metro de intervalor entre as modifica\u00E7\u00F5es do vencimento informado pelo emissor
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param novoDiaVencimento Novo dia de vencimento
   * @return ContaResponse
   */
  public ContaResponse alterarVencimento(Long id, Integer novoDiaVencimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarVencimento");
     }
     
     // verify the required parameter 'novoDiaVencimento' is set
     if (novoDiaVencimento == null) {
        throw new ApiException(400, "Missing the required parameter 'novoDiaVencimento' when calling alterarVencimento");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/alterar-vencimento".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "novo_dia_vencimento", novoDiaVencimento));
    

    

    

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

    
    GenericType<ContaResponse> returnType = new GenericType<ContaResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Ativa o servi\u00E7o de envio de fatura por email
   * Este recurso ativa o servi\u00E7o de envio de fatura por email
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @return Object
   */
  public Object ativarEnvioFaturaEmail(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ativarEnvioFaturaEmail");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/ativar-fatura-email".replaceAll("\\{format\\}","json")
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
   * Atribuir Anuidade
   * Esse recurso permite configurar qual a regra de Anuidade que ser\u00E1 atribu\u00EDda a uma determinada Conta
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param idAnuidade Identificador da anuidade
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param DDD DDD do celular
   * @param celular N\u00FAmero do celular
   * @param idOperadora Identificador da operadora do celular
   * @param idOrigemComercial Identificador da origem comercial
   * @param colaborador Matr\u00EDcula do colaborador
   * @return Object
   */
  public Object atribuirAnuidade(Long id, Long idAnuidade, List<String> sort, Integer page, Integer limit, String DDD, String celular, Long idOperadora, Long idOrigemComercial, String colaborador) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atribuirAnuidade");
     }
     
     // verify the required parameter 'idAnuidade' is set
     if (idAnuidade == null) {
        throw new ApiException(400, "Missing the required parameter 'idAnuidade' when calling atribuirAnuidade");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/atribuir-anuidade".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idAnuidade", idAnuidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "DDD", DDD));
    
    queryParams.addAll(apiClient.parameterToPairs("", "celular", celular));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idOperadora", idOperadora));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "colaborador", colaborador));
    

    

    

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
   * Realiza a atribui\u00E7\u00E3o de um cart\u00E3o pr\u00E9-pago a uma conta
   * Este m\u00E9todo permite que um cart\u00E3o pr\u00E9-pago impresso de forma avulsa e an\u00F4nimo seja atribu\u00EDdo a uma conta, tornando-a portadora dele.
   * @param id C\u00F3digo de identifica\u00E7\u00E3o de uma Conta (id).
   * @param contaAtribuirCartaoRequest contaAtribuirCartaoRequest
   * @return String
   */
  public String atribuirCartaoPrePago(Long id, ContaAtribuirCartaoPrePagoRequest contaAtribuirCartaoRequest) throws ApiException {
    Object postBody = contaAtribuirCartaoRequest;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atribuirCartaoPrePago");
     }
     
     // verify the required parameter 'contaAtribuirCartaoRequest' is set
     if (contaAtribuirCartaoRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'contaAtribuirCartaoRequest' when calling atribuirCartaoPrePago");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/atribuir-cartao-prepago".replaceAll("\\{format\\}","json")
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

    
    GenericType<String> returnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza uma atualiza\u00E7\u00E3o parcial da ades\u00E3o do servi\u00E7o
   * Este recurso permite atualizar parcialmente uma ades\u00E3o de servi\u00E7o existente na base do emissor
   * @param id Identificador da conta para atualiza\u00E7\u00E3o da ades\u00E3o parcial
   * @param adesaoServicoUpdate adesaoServicoUpdate
   * @return AdesaoServicoResponse
   */
  public AdesaoServicoResponse atualizarAdesaoServicosParcial(Long id, AdesaoServicoPartialUpdate adesaoServicoUpdate) throws ApiException {
    Object postBody = adesaoServicoUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarAdesaoServicosParcial");
     }
     
     // verify the required parameter 'adesaoServicoUpdate' is set
     if (adesaoServicoUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'adesaoServicoUpdate' when calling atualizarAdesaoServicosParcial");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/adesoes-servicos".replaceAll("\\{format\\}","json")
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

    
    GenericType<AdesaoServicoResponse> returnType = new GenericType<AdesaoServicoResponse>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a atualiza\u00E7\u00E3o parcial da conta
   * Esse recurso permite realizar a atualiza\u00E7\u00E3o parcial da conta. Isso indica dizer que apenas os campos informados na requisi\u00E7\u00E3o ser\u00E3o atualizados, sendo ignorados os demais
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param contaPartialUpdate contaPartialUpdate
   * @return ContaResponse
   */
  public ContaResponse atualizarContaParcialmente(Long id, ContaPartialUpdate contaPartialUpdate) throws ApiException {
    Object postBody = contaPartialUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarContaParcialmente");
     }
     
     // verify the required parameter 'contaPartialUpdate' is set
     if (contaPartialUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'contaPartialUpdate' when calling atualizarContaParcialmente");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ContaResponse> returnType = new GenericType<ContaResponse>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Atualiza parcialmente o registro de uma seguran\u00E7a mobile
   * Este recurso permite Atualizar parcialmente uma seguran\u00E7a mobile
   * @param id Identificador da conta
   * @param idSegurancaMobile Identificador da seguran\u00E7a mobile
   * @param parcialUpdate parcialUpdate
   * @return SegurancaMobileResponse
   */
  public SegurancaMobileResponse atualizarParcialSegurancaMobile(Long id, Long idSegurancaMobile, SegurancaMobileParcialUpdate parcialUpdate) throws ApiException {
    Object postBody = parcialUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarParcialSegurancaMobile");
     }
     
     // verify the required parameter 'idSegurancaMobile' is set
     if (idSegurancaMobile == null) {
        throw new ApiException(400, "Missing the required parameter 'idSegurancaMobile' when calling atualizarParcialSegurancaMobile");
     }
     
     // verify the required parameter 'parcialUpdate' is set
     if (parcialUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'parcialUpdate' when calling atualizarParcialSegurancaMobile");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/seguranca/mobile/{idSegurancaMobile}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idSegurancaMobile" + "\\}", apiClient.escapeString(idSegurancaMobile.toString()));

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

    
    GenericType<SegurancaMobileResponse> returnType = new GenericType<SegurancaMobileResponse>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Atualizar parcialmente uma tarifa de d\u00E9bito da conta
   * Este recurso permite atualizar parcialmente uma tarifa de d\u00E9bito da conta
   * @param id Identificador da conta
   * @param idDebitoTarifa Identificador do registro de d\u00E9bito tarifa da conta
   * @param contaDebitoTarifaUpdate contaDebitoTarifaUpdate
   * @return ContaDebitoTarifaResponse
   */
  public ContaDebitoTarifaResponse atualizarParcialmenteContaDebitoTarifa(Long id, Long idDebitoTarifa, ContaDebitoTarifaUpdate contaDebitoTarifaUpdate) throws ApiException {
    Object postBody = contaDebitoTarifaUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarParcialmenteContaDebitoTarifa");
     }
     
     // verify the required parameter 'idDebitoTarifa' is set
     if (idDebitoTarifa == null) {
        throw new ApiException(400, "Missing the required parameter 'idDebitoTarifa' when calling atualizarParcialmenteContaDebitoTarifa");
     }
     
     // verify the required parameter 'contaDebitoTarifaUpdate' is set
     if (contaDebitoTarifaUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'contaDebitoTarifaUpdate' when calling atualizarParcialmenteContaDebitoTarifa");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/tarifas/debitos/{idDebitoTarifa}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idDebitoTarifa" + "\\}", apiClient.escapeString(idDebitoTarifa.toString()));

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

    
    GenericType<ContaDebitoTarifaResponse> returnType = new GenericType<ContaDebitoTarifaResponse>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Atualiza parcialmente o registro de um favorito de recarga de celular
   * Este recurso permite Atualizar parcialmente um favorito de recarga de celular
   * @param id Identificador da conta
   * @param idFavorito Identificador do favorito de recarga
   * @param parcialUpdate parcialUpdate
   * @return RecargaCelularFavoritoResponse
   */
  public RecargaCelularFavoritoResponse atualizarParcialmenteFavoritoRecargaCelular(Long id, Long idFavorito, RecargaCelularFavoritoParcialUpdate parcialUpdate) throws ApiException {
    Object postBody = parcialUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarParcialmenteFavoritoRecargaCelular");
     }
     
     // verify the required parameter 'idFavorito' is set
     if (idFavorito == null) {
        throw new ApiException(400, "Missing the required parameter 'idFavorito' when calling atualizarParcialmenteFavoritoRecargaCelular");
     }
     
     // verify the required parameter 'parcialUpdate' is set
     if (parcialUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'parcialUpdate' when calling atualizarParcialmenteFavoritoRecargaCelular");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/celulares/recargas/favoritos/{idFavorito}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idFavorito" + "\\}", apiClient.escapeString(idFavorito.toString()));

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

    
    GenericType<RecargaCelularFavoritoResponse> returnType = new GenericType<RecargaCelularFavoritoResponse>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza o bloqueio de uma determinada Conta
   * Este m\u00E9todo permite a realiza\u00E7\u00E3o do bloqueio de uma determinada conta a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param idStatus C\u00F3digo de Identifica\u00E7\u00E3o do Novo Status Conta
   * @return ContaResponse
   */
  public ContaResponse bloquearConta(Long id, Long idStatus) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling bloquearConta");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling bloquearConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/bloquear".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_status", idStatus));
    

    

    

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

    
    GenericType<ContaResponse> returnType = new GenericType<ContaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastro ades\u00E3o de pagamento no s\u00E1bado
   * Este recurso permite cadastrar uma ades\u00E3o de pagamento no s\u00E1bado
   * @param id Id da conta
   * @return AdesaoPagamentoSabadoResponse
   */
  public AdesaoPagamentoSabadoResponse cadastrar(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrar");
     }
     
    // create path and map variables
    String path = "/api/adesoes-pagamentos-sabados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    

    

    

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

    
    GenericType<AdesaoPagamentoSabadoResponse> returnType = new GenericType<AdesaoPagamentoSabadoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastro de favorito de recarga de celular
   * Este recurso permite cadastrar um favorito de recarga de celular
   * @param id Identificador da conta
   * @param persist persist
   * @return RecargaCelularFavoritoResponse
   */
  public RecargaCelularFavoritoResponse cadastrarRecargaCelularFavorito(Long id, RecargaCelularFavoritoPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrarRecargaCelularFavorito");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling cadastrarRecargaCelularFavorito");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/celulares/recargas/favoritos".replaceAll("\\{format\\}","json")
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

    
    GenericType<RecargaCelularFavoritoResponse> returnType = new GenericType<RecargaCelularFavoritoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastro de uma seguran\u00E7a mobile
   * Este recurso permite registrar uma seguran\u00E7a mobile
   * @param id Identificador da conta
   * @param persist persist
   * @return SegurancaMobileResponse
   */
  public SegurancaMobileResponse cadastrarSegurancaMobile(Long id, SegurancaMobilePersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrarSegurancaMobile");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling cadastrarSegurancaMobile");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/seguranca/mobile".replaceAll("\\{format\\}","json")
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

    
    GenericType<SegurancaMobileResponse> returnType = new GenericType<SegurancaMobileResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza o cancelamento de uma determinada Conta
   * Este m\u00E9todo permite a realiza\u00E7\u00E3o do cancelamento de uma determinada conta a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param idStatus C\u00F3digo de Identifica\u00E7\u00E3o do Novo Status Conta
   * @return ContaResponse
   */
  public ContaResponse cancelarConta(Long id, Long idStatus) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarConta");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling cancelarConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/cancelar".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_status", idStatus));
    

    

    

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

    
    GenericType<ContaResponse> returnType = new GenericType<ContaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta ades\u00E3o de pagamento no s\u00E1bado
   * Este recurso permite consultar uma ades\u00E3o de pagamento no s\u00E1bado
   * @param id Id da conta
   * @param dataVencimento Data de vencimento da ades\u00E3o
   * @return AdesaoPagamentoSabadoResponse
   */
  public AdesaoPagamentoSabadoResponse consultar(Long id, String dataVencimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
     }
     
     // verify the required parameter 'dataVencimento' is set
     if (dataVencimento == null) {
        throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling consultar");
     }
     
    // create path and map variables
    String path = "/api/adesoes-pagamentos-sabados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
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

    
    GenericType<AdesaoPagamentoSabadoResponse> returnType = new GenericType<AdesaoPagamentoSabadoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta a data m\u00E1xima para pagamento da fatura em atraso para receber o benef\u00EDcio
   * Este m\u00E9todo permite consultar se o cliente tem direito ao benef\u00EDcio de pagamento em atraso, em loja, at\u00E9 o s\u00E1bado subsequente ao vencimento, ficando isento do pagamento de multa, encargos, mora e IOF
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @return BeneficioPagamentoAtrasoResponse
   */
  public BeneficioPagamentoAtrasoResponse consultarBeneficioPagamentoAtraso(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarBeneficioPagamentoAtraso");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/consultar-beneficio-pagamento-atraso".replaceAll("\\{format\\}","json")
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

    
    GenericType<BeneficioPagamentoAtrasoResponse> returnType = new GenericType<BeneficioPagamentoAtrasoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta os dados de um determinado boleto da fatura
   * Este recurso consulta um boleto da fatura
   * @param id Id Conta
   * @return BoletoResponse
   */
  public BoletoResponse consultarBoletosEmitidos(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarBoletosEmitidos");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/consultar-dados-pagamento-fatura".replaceAll("\\{format\\}","json")
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

    
    GenericType<BoletoResponse> returnType = new GenericType<BoletoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta dados de uma determinada conta
   * Este m\u00E9todo permite consultar dados de uma determinada conta a partir de seu codigo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @return ContaDetalheResponse
   */
  public ContaDetalheResponse consultarConta(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ContaDetalheResponse> returnType = new GenericType<ContaDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta o controle de uma subconta
   * Este recurso permite consultar um controle de subconta a partir do seu c\u00F3digo de identifica\u00E7\u00E3o. O controle de subconta serve para registrar informa\u00E7\u00F5es adicionais da subconta como apelido, prop\u00F3sito da cria\u00E7\u00E3o da subconta e se ela pode ser gerenciada pela pr\u00F3pria subconta ou apenas pela conta pai.
   * @param id C\u00F3digo identificador do controle de subconta (id)
   * @return ControleSubcontaResponse
   */
  public ControleSubcontaResponse consultarControlesSubcontas(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarControlesSubcontas");
     }
     
    // create path and map variables
    String path = "/api/contas/vinculos/controles-subcontas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ControleSubcontaResponse> returnType = new GenericType<ControleSubcontaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta a d\u00EDvida atualizada do cliente
   * Este recurso consulta a d\u00EDvida atualizada do cliente
   * @param id Id Conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataVencimento Data do vencimento
   * @param idEscritorioCobranca C\u00F3digo de identifica\u00E7\u00E3o do escrit\u00F3rio de cobran\u00E7a
   * @return DividaClienteResponse
   */
  public DividaClienteResponse consultarDividaAtualizada(Long id, List<String> sort, Integer page, Integer limit, String dataVencimento, Long idEscritorioCobranca) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarDividaAtualizada");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/recuperar-divida-atualizada".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataVencimento", dataVencimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEscritorioCobranca", idEscritorioCobranca));
    

    

    

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

    
    GenericType<DividaClienteResponse> returnType = new GenericType<DividaClienteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta extrato da conta
   * Consulta extrato da conta
   * @param id Identificador da conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param idsTiposTransacoes C\u00F3digos identificadores dos tipos de transa\u00E7\u00F5es para transfer\u00EAncia de valores e que possuir\u00E3o na descri\u00E7\u00E3o do extrato, os dados da conta destino da transfer\u00EAncia.
   * @param idsTiposTransacoesTransferencias C\u00F3digos identificadores dos tipos de transa\u00E7\u00F5es que ser\u00E3o consultadas no extrato 
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataInicio Data de in\u00EDcio para consulta do extrato da conta formato yyyy-MM-dd
   * @param dataFim Data de fim para consulta do extrato da conta formato yyyy-MM-dd
   * @param idPessoaFisicaSolicitante C\u00F3digo identificador da pessoa que solicitou o extrato
   * @return PageExtratoResponse
   */
  public PageExtratoResponse consultarExtratoConta(Long id, List<String> sort, List<Long> idsTiposTransacoes, List<Long> idsTiposTransacoesTransferencias, Integer page, Integer limit, String dataInicio, String dataFim, Long idPessoaFisicaSolicitante) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarExtratoConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/extratos".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("multi", "idsTiposTransacoes", idsTiposTransacoes));
    
    queryParams.addAll(apiClient.parameterToPairs("multi", "idsTiposTransacoesTransferencias", idsTiposTransacoesTransferencias));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataFim", dataFim));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoaFisicaSolicitante", idPessoaFisicaSolicitante));
    

    

    

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

    
    GenericType<PageExtratoResponse> returnType = new GenericType<PageExtratoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta o extrato anual de tarifas de uma conta
   * Esse recurso permite consultar o extrato anual de tarifas cobradas de uma determinada conta
   * @param id Identificador da conta
   * @param ano Ano base para gera\u00E7\u00E3o do extrato de tarifas
   * @return ExtratoTarifasResponse
   */
  public ExtratoTarifasResponse consultarExtratoTarifasAnual(Long id, Integer ano) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarExtratoTarifasAnual");
     }
     
     // verify the required parameter 'ano' is set
     if (ano == null) {
        throw new ApiException(400, "Missing the required parameter 'ano' when calling consultarExtratoTarifasAnual");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/extrato-tarifas/{ano}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "ano" + "\\}", apiClient.escapeString(ano.toString()));

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

    
    GenericType<ExtratoTarifasResponse> returnType = new GenericType<ExtratoTarifasResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta dados de um determinado tipo de fun\u00E7\u00E3o para contas
   * Este m\u00E9todo permite consultar dados de um determinado tipo de fun\u00E7\u00E3o para contas a partir de seu codigo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do tipo de fun\u00E7\u00E3o para contas (id)
   * @return String
   */
  public String consultarFuncaoConta(Integer id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarFuncaoConta");
     }
     
    // create path and map variables
    String path = "/api/contas/tipos-funcoes/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<String> returnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta a quita\u00E7\u00E3o de d\u00E9bitos do portador no ano referente
   * Este recurso permite consultar a quita\u00E7\u00E3o de d\u00E9bitos do portador no ano referente
   * @param id Identificador da conta
   * @param ano Ano de refer\u00EAncia
   * @return QuitacaoAnualResponse
   */
  public QuitacaoAnualResponse consultarQuitacaoAnual(Long id, String ano) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarQuitacaoAnual");
     }
     
     // verify the required parameter 'ano' is set
     if (ano == null) {
        throw new ApiException(400, "Missing the required parameter 'ano' when calling consultarQuitacaoAnual");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/quitacoes-anuais/{ano}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "ano" + "\\}", apiClient.escapeString(ano.toString()));

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

    
    GenericType<QuitacaoAnualResponse> returnType = new GenericType<QuitacaoAnualResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Permite consultar a partir do ID da conta as taxas e tarifas
   * Esta opera\u00E7\u00E3o tem como objetivo permitir que os Emissores consultem as taxas e tarifas da conta
   * @param id ID da conta a ser consultada
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageTaxasRefinanciamentoResponse
   */
  public PageTaxasRefinanciamentoResponse consultarTaxasTarifas(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxasTarifas");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/consultar-taxas-tarifas".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<PageTaxasRefinanciamentoResponse> returnType = new GenericType<PageTaxasRefinanciamentoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Permite listar uma linha do tempo com os eventos da conta
   * Esta opera\u00E7\u00E3o tem como objetivo permitir a listagem, em formato de timeline, dos eventos vinculados a uma detemrinada conta. Transa\u00E7\u00F5es, fechamento da fatura, pagamentos, gera\u00E7\u00E3o de cart\u00F5es e altera\u00E7\u00E3o de limite s\u00E3o exemplos de eventos contemplados por esta funcionalidade. Neste m\u00E9todo, as opera\u00E7\u00F5es s\u00E3o ordenadas de forma decrescente
   * @param id Id Conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageTransacaoResponse
   */
  public PageTransacaoResponse consultarTimeline(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTimeline");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/timeline".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<PageTransacaoResponse> returnType = new GenericType<PageTransacaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta um tipo de v\u00EDnculo
   * Este recurso permite consultar um tipo de v\u00EDnculo cadastrado na base do emissor a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo identificador do tipo de v\u00EDnculo (id)
   * @return TipoVinculoContaResponse
   */
  public TipoVinculoContaResponse consultarTipoVinculoConta(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTipoVinculoConta");
     }
     
    // create path and map variables
    String path = "/api/contas/vinculos/tipos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoVinculoContaResponse> returnType = new GenericType<TipoVinculoContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta uma transa\u00E7\u00E3o processada da conta.
   * Este recurso permite consultar os detalhes de uma transa\u00E7\u00E3o processada pertencente a uma conta.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id).
   * @param idTransacao C\u00F3digo de Identifica\u00E7\u00E3o da transa\u00E7\u00E3o (id).
   * @return TransacoesCorrentesResponse
   */
  public TransacoesCorrentesResponse consultarTransacaoProcessadaConta(Long id, Long idTransacao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTransacaoProcessadaConta");
     }
     
     // verify the required parameter 'idTransacao' is set
     if (idTransacao == null) {
        throw new ApiException(400, "Missing the required parameter 'idTransacao' when calling consultarTransacaoProcessadaConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transacoes-processadas/{idTransacao}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idTransacao" + "\\}", apiClient.escapeString(idTransacao.toString()));

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

    
    GenericType<TransacoesCorrentesResponse> returnType = new GenericType<TransacoesCorrentesResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta os detalhes de uma determinada transfer\u00EAncia
   * Este m\u00E9todo permite consultar os detalhes de uma determinada transfer\u00EAncia de cr\u00E9dito realizada entre contas
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param idTransferencia C\u00F3digo de Identifica\u00E7\u00E3o da transfer\u00EAncia (id_transferencia)
   * @return TransferenciaDetalheResponse
   */
  public TransferenciaDetalheResponse consultarTransferenciaDeCreditoEntreCartoes(Long id, Long idTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTransferenciaDeCreditoEntreCartoes");
     }
     
     // verify the required parameter 'idTransferencia' is set
     if (idTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling consultarTransferenciaDeCreditoEntreCartoes");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-cartoes/{id_transferencia}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "id_transferencia" + "\\}", apiClient.escapeString(idTransferencia.toString()));

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

    
    GenericType<TransferenciaDetalheResponse> returnType = new GenericType<TransferenciaDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastrar contas MultiApp
   * Este recurso permite o cadastro de contas MultiApp
   * @param contaMultiAppPersist contaMultiAppPersist
   * @return ContaMultiAppResponse
   */
  public ContaMultiAppResponse criarContasMultiApp(ContaMultiAppPersist contaMultiAppPersist) throws ApiException {
    Object postBody = contaMultiAppPersist;
    
     // verify the required parameter 'contaMultiAppPersist' is set
     if (contaMultiAppPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'contaMultiAppPersist' when calling criarContasMultiApp");
     }
     
    // create path and map variables
    String path = "/api/contas/cadastrar-conta-multiapp".replaceAll("\\{format\\}","json");

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

    
    GenericType<ContaMultiAppResponse> returnType = new GenericType<ContaMultiAppResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Exclui um controle de uma subconta
   * Este recurso permite excluir um controle de subconta a partir do seu c\u00F3digo de identifica\u00E7\u00E3o. O controle de subconta serve para registrar informa\u00E7\u00F5es adicionais da subconta como apelido, prop\u00F3sito da cria\u00E7\u00E3o da subconta e se ela pode ser gerenciada pela pr\u00F3pria subconta ou apenas pela conta pai.
   * @param id C\u00F3digo identificador do controle de subconta (id)
   * @return Object
   */
  public Object deletarControlesSubcontas(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deletarControlesSubcontas");
     }
     
    // create path and map variables
    String path = "/api/contas/vinculos/controles-subcontas/{id}".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Deleta um v\u00EDnculo entre duas contas
   * Este recurso permite deletar um v\u00EDnculo entre duas contas
   * @param id id
   * @return Object
   */
  public Object deletarVinculoConta(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deletarVinculoConta");
     }
     
    // create path and map variables
    String path = "/api/contas/vinculos/{id}".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Desativa o servi\u00E7o de envio de fatura por email
   * Este recurso desativa o servi\u00E7o de envio de fatura por email
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @return Object
   */
  public Object desativarEnvioFaturaEmail(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarEnvioFaturaEmail");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/desativar-fatura-email".replaceAll("\\{format\\}","json")
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
   * Gera um boleto de recarga
   * Este recurso gera um boleto de recarga
   * @param id Id Conta
   * @param valor Atributo que representa o valor do Boleto Emitido
   * @param dataVencimento Atributo que representa a data de vencimento do boleto
   * @return BoletoResponse
   */
  public BoletoResponse gerarBoletoRecarga(Long id, BigDecimal valor, String dataVencimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarBoletoRecarga");
     }
     
     // verify the required parameter 'valor' is set
     if (valor == null) {
        throw new ApiException(400, "Missing the required parameter 'valor' when calling gerarBoletoRecarga");
     }
     
     // verify the required parameter 'dataVencimento' is set
     if (dataVencimento == null) {
        throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling gerarBoletoRecarga");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/gerar-boleto-recarga".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "valor", valor));
    
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

    
    GenericType<BoletoResponse> returnType = new GenericType<BoletoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a gera\u00E7\u00E3o de um novo cart\u00E3o para impress\u00E3o avulsa
   * Este recurso permite que seja gerado um novo Cart\u00E3o para um determinado Portador que esteja vinculado a uma Conta. Para isso, ser\u00E1 preciso informar o c\u00F3digo de identifica\u00E7\u00E3o da Conta (id), o idPessoa do Portador e o idTipoPlastico do Cart\u00E3o que dever\u00E1 ser gerado para impress\u00E3o. Esta funcionalidade poder\u00E1 ser utilizada para realizar a impress\u00E3o de cart\u00F5es em Lojas, Quiosques, Escrit\u00F3rios, Terminais de Auto Atendimento, ou outro local que o Emissor escolher, desde que se possua uma impressora de Cart\u00F5es habilidade para o fazer, no local
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param idPessoa C\u00F3digo de identifica\u00E7\u00E3o da pessoa (id)
   * @param idTipoPlastico C\u00F3digo de identifica\u00E7\u00E3o do TipoPlastico (id)
   * @return CartaoImpressaoResponse
   */
  public CartaoImpressaoResponse gerarCartaoDaPessoa(Long id, Long idPessoa, Long idTipoPlastico) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoDaPessoa");
     }
     
     // verify the required parameter 'idPessoa' is set
     if (idPessoa == null) {
        throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling gerarCartaoDaPessoa");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/pessoas/{id_pessoa}/gerar-cartao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "id_pessoa" + "\\}", apiClient.escapeString(idPessoa.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_tipo_plastico", idTipoPlastico));
    

    

    

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

    
    GenericType<CartaoImpressaoResponse> returnType = new GenericType<CartaoImpressaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza o envio para gera\u00E7\u00E3o de um novo cart\u00E3o na gr\u00E1fica
   * Este recurso permite que seja gerado um novo Cart\u00E3o para um determinado Portador que esteja vinculado a uma Conta. Para isso, ser\u00E1 preciso informar o c\u00F3digo de identifica\u00E7\u00E3o da Conta (id), o idPessoa do Portador e o idTipoPlastico do Cart\u00E3o que dever\u00E1 ser gerado para impress\u00E3o. Esta funcionalidade poder\u00E1 ser utilizada para impress\u00E3o de cart\u00F5es em gr\u00E1fica
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param cartaoEmbossingRequest cartaoEmbossingRequest
   * @return CartaoEmbossingResponse
   */
  public CartaoEmbossingResponse gerarCartaoGrafica(Long id, CartaoEmbossingRequest cartaoEmbossingRequest) throws ApiException {
    Object postBody = cartaoEmbossingRequest;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoGrafica");
     }
     
     // verify the required parameter 'cartaoEmbossingRequest' is set
     if (cartaoEmbossingRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'cartaoEmbossingRequest' when calling gerarCartaoGrafica");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/gerar-cartao-grafica".replaceAll("\\{format\\}","json")
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

    
    GenericType<CartaoEmbossingResponse> returnType = new GenericType<CartaoEmbossingResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a gera\u00E7\u00E3o de um cart\u00E3o provisorio
   * Este recurso permite que seja gerado um cart\u00E3o provis\u00F3rio para um determinado Portador que esteja vinculado a uma Conta. Para isso, ser\u00E1 preciso informar o c\u00F3digo de identifica\u00E7\u00E3o da Conta (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @return CartaoImpressaoProvisorioResponse
   */
  public CartaoImpressaoProvisorioResponse gerarCartaoProvisorio(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoProvisorio");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/gerar-cartao-provisorio".replaceAll("\\{format\\}","json")
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

    
    GenericType<CartaoImpressaoProvisorioResponse> returnType = new GenericType<CartaoImpressaoProvisorioResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a gera\u00E7\u00E3o de um cart\u00E3o virtual
   * Este recurso permite que seja gerado um Cart\u00E3o virtual para um determinado Portador que esteja vinculado a uma Conta. Para isso, ser\u00E1 preciso informar o c\u00F3digo de identifica\u00E7\u00E3o da Conta (id). Esta funcionalidade poder\u00E1 ser utilizada para realizar a cria\u00E7\u00E3o de cart\u00F5es virtuaes atraves de um app
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param dataValidade Data de Validade
   * @return CartaoImpressaoResponse
   */
  public CartaoImpressaoResponse gerarCartaoVirtual(Long id, String dataValidade) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoVirtual");
     }
     
     // verify the required parameter 'dataValidade' is set
     if (dataValidade == null) {
        throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling gerarCartaoVirtual");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/gerar-cartao-virtual".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "dataValidade", dataValidade));
    

    

    

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

    
    GenericType<CartaoImpressaoResponse> returnType = new GenericType<CartaoImpressaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar uma tarifa de d\u00E9bito para uma conta
   * Este recurso permite listar as tarifas de d\u00E9bito de uma conta
   * @param id Identificador da conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageContaDebitoTarifaResponse
   */
  public PageContaDebitoTarifaResponse listarContaDebitoTarifa(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarContaDebitoTarifa");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/tarifas/debitos".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<PageContaDebitoTarifaResponse> returnType = new GenericType<PageContaDebitoTarifaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista contas existentes na base de dados do Emissor
   * Este recurso permite listar contas existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idProduto C\u00F3digo de identifica\u00E7\u00E3o do produto ao qual a conta faz parte. (id)
   * @param idOrigemComercial C\u00F3digo de Identifica\u00E7\u00E3o da Origem Comercial (id) que deu origem a Conta
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa Titular da Conta (id)
   * @param idStatusConta C\u00F3digo de Identifica\u00E7\u00E3o do status da conta
   * @param diaVencimento Apresenta o dia de vencimento
   * @param melhorDiaCompra Apresenta o melhor dia de compra
   * @param dataStatusConta Apresenta a data em que o idStatusConta atual fora atribu\u00EDdo para ela
   * @param dataCadastro Apresenta a data em que o cart\u00E3o foi gerado
   * @param dataUltimaAlteracaoVencimento Apresenta a data da ultima altera\u00E7\u00E3o de vencimento
   * @param funcaoAtiva 
   * @return PageContaResponse
   */
  public PageContaResponse listarContas(List<String> sort, Integer page, Integer limit, Long idProduto, Long idOrigemComercial, Long idPessoa, Long idStatusConta, Integer diaVencimento, Integer melhorDiaCompra, String dataStatusConta, String dataCadastro, String dataUltimaAlteracaoVencimento, String funcaoAtiva) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idStatusConta", idStatusConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "diaVencimento", diaVencimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "melhorDiaCompra", melhorDiaCompra));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataStatusConta", dataStatusConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataUltimaAlteracaoVencimento", dataUltimaAlteracaoVencimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "funcaoAtiva", funcaoAtiva));
    

    

    

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

    
    GenericType<PageContaResponse> returnType = new GenericType<PageContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os controles de subcontas
   * Este recurso permite listar os controles de subcontas cadastrados na base do emissor. O controle de subconta serve para registrar informa\u00E7\u00F5es adicionais da subconta como apelido, prop\u00F3sito da cria\u00E7\u00E3o da subconta e se ela pode ser gerenciada pela pr\u00F3pria subconta ou apenas pela conta pai.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idVinculoConta Id referenciando o v\u00EDnculo da subconta na tabela VinculosContas
   * @param idConta C\u00F3digo identificador da subconta (id)
   * @param nome Nome/apelido dado para a subconta
   * @param finalidade Finalidade da cria\u00E7\u00E3o da subconta
   * @param autoGerenciavel Indica se a subconta \u00E9 auto gerenci\u00E1vel ou se apenas a conta pai poder\u00E1 gerir
   * @return PageControleSubcontaResponse
   */
  public PageControleSubcontaResponse listarControlesSubcontas(List<String> sort, Integer page, Integer limit, Long idVinculoConta, Long idConta, String nome, String finalidade, Boolean autoGerenciavel) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/contas/vinculos/controles-subcontas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idVinculoConta", idVinculoConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "finalidade", finalidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "autoGerenciavel", autoGerenciavel));
    

    

    

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

    
    GenericType<PageControleSubcontaResponse> returnType = new GenericType<PageControleSubcontaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista registros de favoritos de recarga de celular
   * Este recurso permite listar registros de favoritos de recarga de celular
   * @param id Identificador da conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dddCelular DDD do celular
   * @param numeroCelular N\u00FAmero do celular
   * @param nome Nome do propriet\u00E1rio do celular
   * @param ativo Indicador de status do favorito
   * @param descricaoOperadora Descri\u00E7\u00E3o da operadora
   * @return PageRecargaCelularFavoritoResponse
   */
  public PageRecargaCelularFavoritoResponse listarFavoritosRecargasCelular(Long id, List<String> sort, Integer page, Integer limit, String dddCelular, String numeroCelular, String nome, Boolean ativo, String descricaoOperadora) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarFavoritosRecargasCelular");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/celulares/recargas/favoritos".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dddCelular", dddCelular));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroCelular", numeroCelular));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "ativo", ativo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricaoOperadora", descricaoOperadora));
    

    

    

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

    
    GenericType<PageRecargaCelularFavoritoResponse> returnType = new GenericType<PageRecargaCelularFavoritoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os tipos de fun\u00E7\u00F5es para contas do Emissor
   * Este recurso permite listar os tipos de fun\u00E7\u00F5es para as contas do Emissor
   * @return String
   */
  public String listarFuncoesContas() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/contas/tipos-funcoes".replaceAll("\\{format\\}","json");

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

    
    GenericType<String> returnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista o hist\u00F3rico de altera\u00E7\u00F5es de limites da conta
   * Este recurso consulta o hist\u00F3rico com as altera\u00E7\u00F5es de limites da conta informada
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageHistoricoEventosResponse
   */
  public PageHistoricoEventosResponse listarHistoricoAlteracoesLimites(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAlteracoesLimites");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/historicos-alteracoes-limites".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<PageHistoricoEventosResponse> returnType = new GenericType<PageHistoricoEventosResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista o hist\u00F3rico de entradas/sa\u00EDdas de assessorias de cobran\u00E7a
   * Permite listar todos os registros de entrada e sa\u00EDda da Conta em arquivos de integra\u00E7\u00E3o com empresas de assessorias de cobran\u00E7a a partir do c\u00F3digo de identifica\u00E7\u00E3o da conta (idConta)
   * @param id Id Conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageHistoricoAssessoriaResponse
   */
  public PageHistoricoAssessoriaResponse listarHistoricoAssessoria(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAssessoria");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/historicos-assessorias-cobranca".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<PageHistoricoAssessoriaResponse> returnType = new GenericType<PageHistoricoAssessoriaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista o historico de atrasos das faturas
   * Este recurso lista o hist\u00F3rico do pagamento de faturas em atraso
   * @param id Id Conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageHistoricoAtrasoFaturaResponse
   */
  public PageHistoricoAtrasoFaturaResponse listarHistoricoFaturasAtrasadas(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoFaturasAtrasadas");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/historicos-faturas-atrasos".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<PageHistoricoAtrasoFaturaResponse> returnType = new GenericType<PageHistoricoAtrasoFaturaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista registros da seguran\u00E7a mobile
   * Este recurso permite listar registros da seguran\u00E7a mobile
   * @param id Identificador da conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param validos Obt\u00EAm registros n\u00E3o expirados caso for verdadeiro
   * @param statusRequisicao Status da requisi\u00E7\u00E3o/solicita\u00E7\u00E3o do token
   * @param cpfCnpj CNPJ ou CPF da pessoa
   * @param dataExpiracao Data de expira\u00E7\u00E3o do token
   * @param token Valor do token
   * @param tablet Identificador do Tablet
   * @param deviceName Nome do dispositivo
   * @param deviceToken Token do dispositivo
   * @param canal Canal de entrada
   * @param dataUtilizacao Data da utiliza\u00E7\u00E3o do token
   * @param dataAtivacao Data da ativa\u00E7\u00E3o do token
   * @param chapaPromotor Chapa do promotor 
   * @param codOperacaoNeurotech C\u00F3digo de opera\u00E7\u00E3o da Neurotech
   * @param respostaNeurotech Resposta da Neurotech
   * @return PageSegurancaMobileResponse
   */
  public PageSegurancaMobileResponse listarSegurancaMobile(Long id, List<String> sort, Integer page, Integer limit, Boolean validos, String statusRequisicao, String cpfCnpj, String dataExpiracao, String token, String tablet, String deviceName, String deviceToken, String canal, String dataUtilizacao, String dataAtivacao, String chapaPromotor, String codOperacaoNeurotech, String respostaNeurotech) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarSegurancaMobile");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/seguranca/mobile".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "validos", validos));
    
    queryParams.addAll(apiClient.parameterToPairs("", "statusRequisicao", statusRequisicao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cpfCnpj", cpfCnpj));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataExpiracao", dataExpiracao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "token", token));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tablet", tablet));
    
    queryParams.addAll(apiClient.parameterToPairs("", "deviceName", deviceName));
    
    queryParams.addAll(apiClient.parameterToPairs("", "deviceToken", deviceToken));
    
    queryParams.addAll(apiClient.parameterToPairs("", "canal", canal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataUtilizacao", dataUtilizacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAtivacao", dataAtivacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "chapaPromotor", chapaPromotor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codOperacaoNeurotech", codOperacaoNeurotech));
    
    queryParams.addAll(apiClient.parameterToPairs("", "respostaNeurotech", respostaNeurotech));
    

    

    

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

    
    GenericType<PageSegurancaMobileResponse> returnType = new GenericType<PageSegurancaMobileResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista contas v\u00EDnculadas a uma conta pai
   * Este recurso permite listar as contas que est\u00E3o v\u00EDnculadas a conta pai, informada no path
   * @param id id
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idConta Id da subconta
   * @param idTipoVinculo Id do tipo de v\u00EDnculo entre as duas contas
   * @return PageVinculoContaResponse
   */
  public PageVinculoContaResponse listarSubcontasVinculadas(Long id, List<String> sort, Integer page, Integer limit, Long idConta, Long idTipoVinculo) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarSubcontasVinculadas");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/vinculos".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoVinculo", idTipoVinculo));
    

    

    

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

    
    GenericType<PageVinculoContaResponse> returnType = new GenericType<PageVinculoContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os tipos de v\u00EDnculos
   * Este recurso permite listar os tipos de v\u00EDnculos cadastrados na base do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param descricao Descri\u00E7\u00E3o do tipo de v\u00EDnculo
   * @return PageTipoVinculoContaResponse
   */
  public PageTipoVinculoContaResponse listarTipoVinculo(List<String> sort, Integer page, Integer limit, String descricao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/contas/vinculos/tipos".replaceAll("\\{format\\}","json");

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

    
    GenericType<PageTipoVinculoContaResponse> returnType = new GenericType<PageTipoVinculoContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as transa\u00E7\u00F5es n\u00E3o processadas e processadas da conta
   * Este m\u00E9todo permite que sejam listadas todas as transa\u00E7\u00F5es n\u00E3o processadas e processadas da Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param status Status da transa\u00E7\u00E3o
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataVencimento Data de vencimento do extrato no formato yyyy-MM-dd
   * @param dataInicio Data de in\u00EDcio da consulta do extrato no formato yyyy-MM-dd (Ignorado quando o par\u00E2mentro dataVencimento \u00E9 usado)
   * @param dataFim Data fim da consulta do extrato no formato yyyy-MM-dd  (Ignorado quando o par\u00E2mentro dataVencimento \u00E9 usado)
   * @param idTipoTransacao transacoes_processadas_nao_processadas_request_tipo_transacao
   * @param flagCredito Flag que indica se a transa\u00E7\u00E3o \u00E9 cr\u00E9dito
   * @param flagFaturado Flag que indica se a transa\u00E7\u00E3o foi faturada
   * @param flagProcessada Flag que indica se a transa\u00E7\u00E3o foi processada
   * @param plano Plano da transa\u00E7\u00E3o
   * @param codigoMCC C\u00F3digo MCC da transa\u00E7\u00E3o
   * @param grupoMCC Grupo MCC da transa\u00E7\u00E3o
   * @return PageTransacaoProcessadaNaoProcessadaResponse
   */
  public PageTransacaoProcessadaNaoProcessadaResponse listarTransacoesConta(Long id, List<String> sort, List<Integer> status, Integer page, Integer limit, String dataVencimento, String dataInicio, String dataFim, Long idTipoTransacao, Boolean flagCredito, Boolean flagFaturado, Boolean flagProcessada, Integer plano, Long codigoMCC, Long grupoMCC) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarTransacoesConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transacoes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("multi", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataVencimento", dataVencimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataFim", dataFim));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoTransacao", idTipoTransacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagCredito", flagCredito));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagFaturado", flagFaturado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagProcessada", flagProcessada));
    
    queryParams.addAll(apiClient.parameterToPairs("", "plano", plano));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigoMCC", codigoMCC));
    
    queryParams.addAll(apiClient.parameterToPairs("", "grupoMCC", grupoMCC));
    

    

    

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

    
    GenericType<PageTransacaoProcessadaNaoProcessadaResponse> returnType = new GenericType<PageTransacaoProcessadaNaoProcessadaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as transa\u00E7\u00F5es n\u00E3o processadas da conta
   * Este m\u00E9todo permite que sejam listadas todas as transa\u00E7\u00F5es n\u00E3o processadas da Conta.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataInicio Data de in\u00EDcio da consulta do extrato no formato yyyy-MM-dd (Par\u00E2mentro Ignorado se dataFim n\u00E3o for definida)
   * @param dataFim Data fim da consulta do extrato no formato yyyy-MM-dd  (Par\u00E2mentro Ignorado se dataInicio n\u00E3o for definida)
   * @return PageTransacaoNaoProcessadaResponse
   */
  public PageTransacaoNaoProcessadaResponse listarTransacoesNaoProcessadasConta(Long id, List<String> sort, Integer page, Integer limit, String dataInicio, String dataFim) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarTransacoesNaoProcessadasConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transacoes/listar-nao-processadas".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataFim", dataFim));
    

    

    

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

    
    GenericType<PageTransacaoNaoProcessadaResponse> returnType = new GenericType<PageTransacaoNaoProcessadaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar as transa\u00E7\u00F5es negadas da conta
   * Este m\u00E9todo permite que sejam listadas todas as transa\u00E7\u00F5es negadas da Conta
   * @param id C\u00F3digo identificador da conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idCartao C\u00F3digo identificador do cart\u00E3o
   * @return PageTransacaoNegadaResponse
   */
  public PageTransacaoNegadaResponse listarTransacoesNegadas(Long id, List<String> sort, Integer page, Integer limit, Long idCartao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarTransacoesNegadas");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transacoes/negadas".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idCartao", idCartao));
    

    

    

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

    
    GenericType<PageTransacaoNegadaResponse> returnType = new GenericType<PageTransacaoNegadaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as transa\u00E7\u00F5es processadas da conta
   * Este m\u00E9todo permite que sejam listadas todas as transa\u00E7\u00F5es processadas da Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id).
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataVencimento Data de vencimento do extrato no formato yyyy-MM-dd
   * @param dataInicio Data de in\u00EDcio da consulta do extrato no formato yyyy-MM-dd (Ignorado quando o par\u00E2mentro dataVencimento \u00E9 usado)
   * @param dataFim Data fim da consulta do extrato no formato yyyy-MM-dd  (Ignorado quando o par\u00E2mentro dataVencimento \u00E9 usado)
   * @param idTipoTransacao transacoes_processadas_request_tipo_transacao
   * @param recuperaEncargos Adiciona as transa\u00E7\u00F5es de encargos na consulta
   * @return PageTransacoesCorrentesResponse
   */
  public PageTransacoesCorrentesResponse listarTransacoesProcessadasConta(Long id, List<String> sort, Integer page, Integer limit, String dataVencimento, String dataInicio, String dataFim, Long idTipoTransacao, Integer recuperaEncargos) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarTransacoesProcessadasConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transacoes/listar-processadas".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataVencimento", dataVencimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataFim", dataFim));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoTransacao", idTipoTransacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "recuperaEncargos", recuperaEncargos));
    

    

    

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

    
    GenericType<PageTransacoesCorrentesResponse> returnType = new GenericType<PageTransacoesCorrentesResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Este recurso permite que uma proje\u00E7\u00E3o de compra ainda n\u00E3o processada seja recuperada. Os valores das compras s\u00E3o agrupados e exibidos em blocos mensais.
   * Este recurso permite que uma proje\u00E7\u00E3o de compra ainda n\u00E3o processada seja recuperada. Os valores das compras s\u00E3o agrupados e exibidos em blocos mensais.
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageProjecaoCompraNaoProcessadaResponse
   */
  public PageProjecaoCompraNaoProcessadaResponse listarTransacoesProjetadasConta(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarTransacoesProjetadasConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transacoes/projetadas".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<PageProjecaoCompraNaoProcessadaResponse> returnType = new GenericType<PageProjecaoCompraNaoProcessadaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as transfer\u00EAncias realizadas pela conta
   * Este m\u00E9todo permite que sejam listadas as transfer\u00EAncias realizadas pela conta existentes na base do emissor
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idTransferencia C\u00F3digo de identifica\u00E7\u00E3o da transfer\u00EAncia (id)
   * @param idContaOrigem C\u00F3digo de identifica\u00E7\u00E3o da conta em que o valor ser\u00E1 debitado para a transfer\u00EAncia. (id)
   * @param idContaDestino C\u00F3digo de identifica\u00E7\u00E3o da conta em que o valor ser\u00E1 creditado para a transfer\u00EAncia. (id)
   * @param valorTransferencia Valor estabelecido para ser transferido
   * @param dataTransferencia Data estabelecida para ocorrer a transfer\u00EAncia
   * @return PageTransferenciaResponse
   */
  public PageTransferenciaResponse listarTransferenciasDeCreditoEntreCartoes(Long id, List<String> sort, Integer page, Integer limit, Long idTransferencia, Long idContaOrigem, Long idContaDestino, BigDecimal valorTransferencia, String dataTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarTransferenciasDeCreditoEntreCartoes");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-cartoes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTransferencia", idTransferencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idContaOrigem", idContaOrigem));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idContaDestino", idContaDestino));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valorTransferencia", valorTransferencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataTransferencia", dataTransferencia));
    

    

    

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

    
    GenericType<PageTransferenciaResponse> returnType = new GenericType<PageTransferenciaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista v\u00EDnculos de contas
   * Este recurso permite listar os v\u00EDnculos de contas existentes na base
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idConta Id da subconta
   * @param idTipoVinculo Id do tipo de v\u00EDnculo entre as duas contas
   * @return PageVinculoContaResponse
   */
  public PageVinculoContaResponse listarVinculoConta(List<String> sort, Integer page, Integer limit, Long idConta, Long idTipoVinculo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/contas/vinculos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoVinculo", idTipoVinculo));
    

    

    

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

    
    GenericType<PageVinculoContaResponse> returnType = new GenericType<PageVinculoContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a normaliza\u00E7\u00E3o de uma conta
   * Este m\u00E9todo permite que uma conta seja normalizada, ajustando assim o seu status e lan\u00E7ando os ajustes necess\u00E1rios
   * @param id C\u00F3digo de identifica\u00E7\u00E3o de uma Conta (id)
   * @param login login
   * @return Object
   */
  public Object normalizarConta(Long id, String login) throws ApiException {
    Object postBody = login;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling normalizarConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/normalizacao".replaceAll("\\{format\\}","json")
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
   * Realiza a reativa\u00E7\u00E3o de contas
   * Este recurso permite reativar contas. Para isso, ser\u00E1 preciso informar o c\u00F3digo de identifica\u00E7\u00E3o da Conta (id)
   * @param id Id Conta
   * @return Object
   */
  public Object reativarConta(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling reativarConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/reativar".replaceAll("\\{format\\}","json")
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
   * Realiza um cadastro de uma nova ades\u00E3o do servi\u00E7o
   * Este recurso permite cadastrar uma nova ades\u00E3o de servi\u00E7o na base do emissor
   * @param id Identificador da conta
   * @param adesaoServicoPersist adesaoServicoPersist
   * @return AdesaoServicoResponse
   */
  public AdesaoServicoResponse salvarAdesaoServicos(Long id, AdesaoServicoPersist adesaoServicoPersist) throws ApiException {
    Object postBody = adesaoServicoPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvarAdesaoServicos");
     }
     
     // verify the required parameter 'adesaoServicoPersist' is set
     if (adesaoServicoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'adesaoServicoPersist' when calling salvarAdesaoServicos");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/adesoes-servicos".replaceAll("\\{format\\}","json")
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

    
    GenericType<AdesaoServicoResponse> returnType = new GenericType<AdesaoServicoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lan\u00E7a um ajuste para a conta do id informado
   * Este recurso insere um ajuste para a conta do id informado
   * @param id Id Conta
   * @param idTipoAjuste C\u00F3digo identificador do tipo de ajuste
   * @param dataAjuste Data do ajuste no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ
   * @param valorAjuste Valor do ajuste
   * @param login login
   * @param identificadorExterno Identificador Externo
   * @param idTransacaoOriginal Identificador da transa\u00E7\u00E3o original (estorno)
   * @param idEstabelecimento Identificador do estabelecimento quando o pagamento for efetuado em loja
   * @param flagAtendimento Flag para lan\u00E7ar o atendimento
   * @param mensagemAtendimento Mensagem enviada no atendimento
   * @return AjusteFinanceiroResponse
   */
  public AjusteFinanceiroResponse salvarAjusteFinanceiroConta(Long id, Long idTipoAjuste, String dataAjuste, BigDecimal valorAjuste, String login, String identificadorExterno, Long idTransacaoOriginal, Long idEstabelecimento, Boolean flagAtendimento, String mensagemAtendimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvarAjusteFinanceiroConta");
     }
     
     // verify the required parameter 'idTipoAjuste' is set
     if (idTipoAjuste == null) {
        throw new ApiException(400, "Missing the required parameter 'idTipoAjuste' when calling salvarAjusteFinanceiroConta");
     }
     
     // verify the required parameter 'dataAjuste' is set
     if (dataAjuste == null) {
        throw new ApiException(400, "Missing the required parameter 'dataAjuste' when calling salvarAjusteFinanceiroConta");
     }
     
     // verify the required parameter 'valorAjuste' is set
     if (valorAjuste == null) {
        throw new ApiException(400, "Missing the required parameter 'valorAjuste' when calling salvarAjusteFinanceiroConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/ajustes-financeiros".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoAjuste", idTipoAjuste));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAjuste", dataAjuste));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valorAjuste", valorAjuste));
    
    queryParams.addAll(apiClient.parameterToPairs("", "identificadorExterno", identificadorExterno));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTransacaoOriginal", idTransacaoOriginal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtendimento", flagAtendimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "mensagemAtendimento", mensagemAtendimento));
    

    if (login != null)
      headerParams.put("login", apiClient.parameterToString(login));
    

    

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

    
    GenericType<AjusteFinanceiroResponse> returnType = new GenericType<AjusteFinanceiroResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza o cadastro de uma nova conta
   * Esse recurso permite cadastrar uma nova conta para uma pessoa j\u00E1 existente na base de dados do emissor
   * @param contaPersist contaPersist
   * @return ContaResponse
   */
  public ContaResponse salvarConta(ContaPersist contaPersist) throws ApiException {
    Object postBody = contaPersist;
    
     // verify the required parameter 'contaPersist' is set
     if (contaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'contaPersist' when calling salvarConta");
     }
     
    // create path and map variables
    String path = "/api/contas".replaceAll("\\{format\\}","json");

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

    
    GenericType<ContaResponse> returnType = new GenericType<ContaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Salvar uma tarifa de d\u00E9bito para uma conta
   * Este recurso permite salvar uma tarifa de d\u00E9bito para a conta
   * @param id Identificador da conta
   * @param contaDebitoTarifaPersist contaDebitoTarifaPersist
   * @return ContaDebitoTarifaResponse
   */
  public ContaDebitoTarifaResponse salvarContaDebitoTarifa(Long id, ContaDebitoTarifaPersist contaDebitoTarifaPersist) throws ApiException {
    Object postBody = contaDebitoTarifaPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvarContaDebitoTarifa");
     }
     
     // verify the required parameter 'contaDebitoTarifaPersist' is set
     if (contaDebitoTarifaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'contaDebitoTarifaPersist' when calling salvarContaDebitoTarifa");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/tarifas/debitos".replaceAll("\\{format\\}","json")
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

    
    GenericType<ContaDebitoTarifaResponse> returnType = new GenericType<ContaDebitoTarifaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastra um controle para uma subconta
   * Este recurso permite cadastrar um controle de subconta. O controle de subconta serve para registrar informa\u00E7\u00F5es adicionais da subconta como apelido, prop\u00F3sito da cria\u00E7\u00E3o da subconta e se ela pode ser gerenciada pela pr\u00F3pria subconta ou apenas pela conta pai.
   * @param id C\u00F3digo identificador da conta (id)
   * @param idVinculoConta Id referenciando o v\u00EDnculo da subconta na tabela VinculosContas
   * @param controleSubcontaPersist controleSubcontaPersist
   * @return ControleSubcontaResponse
   */
  public ControleSubcontaResponse salvarControlesSubcontas(Long id, Long idVinculoConta, ControleSubcontaPersist controleSubcontaPersist) throws ApiException {
    Object postBody = controleSubcontaPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvarControlesSubcontas");
     }
     
     // verify the required parameter 'idVinculoConta' is set
     if (idVinculoConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idVinculoConta' when calling salvarControlesSubcontas");
     }
     
     // verify the required parameter 'controleSubcontaPersist' is set
     if (controleSubcontaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'controleSubcontaPersist' when calling salvarControlesSubcontas");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/vinculos/{idVinculoConta}/controles-subcontas".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idVinculoConta" + "\\}", apiClient.escapeString(idVinculoConta.toString()));

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

    
    GenericType<ControleSubcontaResponse> returnType = new GenericType<ControleSubcontaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Salva um tipo de v\u00EDnculo
   * Este recurso permite cadastrar um tipo de v\u00EDnculo na base do emissor
   * @param tipoVinculoContaPersist tipoVinculoContaPersist
   * @return TipoVinculoContaResponse
   */
  public TipoVinculoContaResponse salvarTipoVinculoConta(TipoVinculoContaPersist tipoVinculoContaPersist) throws ApiException {
    Object postBody = tipoVinculoContaPersist;
    
     // verify the required parameter 'tipoVinculoContaPersist' is set
     if (tipoVinculoContaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'tipoVinculoContaPersist' when calling salvarTipoVinculoConta");
     }
     
    // create path and map variables
    String path = "/api/contas/vinculos/tipos".replaceAll("\\{format\\}","json");

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

    
    GenericType<TipoVinculoContaResponse> returnType = new GenericType<TipoVinculoContaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastra um v\u00EDnculo entre duas contas
   * Este recurso permite cadastrar um v\u00EDnculo de uma conta com uma conta pai
   * @param id id
   * @param vinculoContaPersist vinculoContaPersist
   * @return VinculoContaResponse
   */
  public VinculoContaResponse salvarVinculoConta(Long id, VinculoContaPersist vinculoContaPersist) throws ApiException {
    Object postBody = vinculoContaPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvarVinculoConta");
     }
     
     // verify the required parameter 'vinculoContaPersist' is set
     if (vinculoContaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'vinculoContaPersist' when calling salvarVinculoConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/vinculos".replaceAll("\\{format\\}","json")
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

    
    GenericType<VinculoContaResponse> returnType = new GenericType<VinculoContaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Simula valores de presta\u00E7\u00F5es de empr\u00E9stimos/financiamentos
   * Esta opera\u00E7\u00E3o pode ser utilizada para simular opera\u00E7\u00F5es financeiras a partir de informa\u00E7\u00F5es fornecidas pelo usu\u00E1rio. Os c\u00E1lculos gerados devem ser considerados apenas como refer\u00EAncia para as situa\u00E7\u00F5es reais e n\u00E3o como valores oficiais
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param request request
   * @return EmprestimoPessoalResponse
   */
  public EmprestimoPessoalResponse simularEmprestimoFinanciamento(Long id, EmprestimoPessoalRequest request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling simularEmprestimoFinanciamento");
     }
     
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling simularEmprestimoFinanciamento");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/simular-emprestimos-financiamentos".replaceAll("\\{format\\}","json")
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

    
    GenericType<EmprestimoPessoalResponse> returnType = new GenericType<EmprestimoPessoalResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza uma transfer\u00EAncia de Cr\u00E9dito para outro cliente do mesmo Emissor
   * Este m\u00E9todo permite que um portador de um cart\u00E3o possa realizar auma transfer\u00EAncia de cr\u00E9dito para outro cliente do mesmo emissor
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta do cliente portador do cart\u00E3o que ser\u00E1 debitado (id)
   * @param idContaDestino C\u00F3digo de Identifica\u00E7\u00E3o do cliente portador do cart\u00E3o que ser\u00E1 creditado (id)
   * @param valorTransferencia Valor da Transfer\u00EAncia
   * @return TransferenciaDetalheResponse
   */
  public TransferenciaDetalheResponse transferirCreditoEntreCartoes(Long id, Long idContaDestino, BigDecimal valorTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling transferirCreditoEntreCartoes");
     }
     
     // verify the required parameter 'idContaDestino' is set
     if (idContaDestino == null) {
        throw new ApiException(400, "Missing the required parameter 'idContaDestino' when calling transferirCreditoEntreCartoes");
     }
     
     // verify the required parameter 'valorTransferencia' is set
     if (valorTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'valorTransferencia' when calling transferirCreditoEntreCartoes");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-cartoes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_conta_destino", idContaDestino));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valor_transferencia", valorTransferencia));
    

    

    

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

    
    GenericType<TransferenciaDetalheResponse> returnType = new GenericType<TransferenciaDetalheResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Transferir cr\u00E9dito entre portadores
   * Este recurso permite realizar uma transfer\u00EAncia de cr\u00E9ditos, atrav\u00E9s de ajustes, entre portadores da mesma conta
   * @param id Id da conta
   * @param transferencia transferencia
   * @return TransferenciaPortadoresResponse
   */
  public TransferenciaPortadoresResponse transferirCreditoEntrePortadores(Long id, TransferenciaPortadoresPersist transferencia) throws ApiException {
    Object postBody = transferencia;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling transferirCreditoEntrePortadores");
     }
     
     // verify the required parameter 'transferencia' is set
     if (transferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'transferencia' when calling transferirCreditoEntrePortadores");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-portadores".replaceAll("\\{format\\}","json")
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

    
    GenericType<TransferenciaPortadoresResponse> returnType = new GenericType<TransferenciaPortadoresResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
