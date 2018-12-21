package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.AjusteFinanceiroResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.AlterarProdutoRequest;
import br.com.conductor.pier.api.v2.model.ContaResponse;
import br.com.conductor.pier.api.v2.model.ContaPartialUpdate;
import br.com.conductor.pier.api.v2.model.AdesaoPagamentoSabadoResponse;
import br.com.conductor.pier.api.v2.model.BeneficioPagamentoAtrasoResponse;
import br.com.conductor.pier.api.v2.model.BoletoResponse;
import br.com.conductor.pier.api.v2.model.DividaClienteResponse;
import br.com.conductor.pier.api.v2.model.TransacoesCorrentesResponse;
import br.com.conductor.pier.api.v2.model.PageTaxasRefinanciamentoResponse;
import br.com.conductor.pier.api.v2.model.ContaDetalheResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaDetalheResponse;
import br.com.conductor.pier.api.v2.model.ContaMultiAppResponse;
import br.com.conductor.pier.api.v2.model.CountMultiAppPersist;
import br.com.conductor.pier.api.v2.model.CartaoImpressaoResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmbossingResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmbossingRequest;
import br.com.conductor.pier.api.v2.model.CartaoImpressaoProvisorioResponse;
import br.com.conductor.pier.api.v2.model.PageContaResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoEventosResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoAssessoriaResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoAtrasoFaturaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoNaoProcessadaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacoesCorrentesResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoProcessadaNaoProcessadaResponse;
import br.com.conductor.pier.api.v2.model.PageTransferenciaResponse;
import br.com.conductor.pier.api.v2.model.ContaPersist;
import br.com.conductor.pier.api.v2.model.AdesaoServicoResponse;
import br.com.conductor.pier.api.v2.model.AdesaoServicoPersist;
import br.com.conductor.pier.api.v2.model.EmprestimoPessoalRequest;
import br.com.conductor.pier.api.v2.model.EmprestimoPessoalResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AccountApi {
  private ApiClient apiClient;

  public AccountApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Launch an adjust for the account of the informed ID
   * This resource insert an adjust for the account of the informed ID
   * @param id Id Account
   * @param idTipoAjuste Identifier Code of the adjustment type
   * @param dataAjuste Date of the adjustment in the format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ
   * @param valorAjuste Value of the adjustment
   * @param login login
   * @param identificadorExterno Identifier External
   * @param idTransacaoOriginal Original transaction identifier
   * @param idEstabelecimento Store identifier when payment is made in store
   * @return AjusteFinanceiroResponse
   */
  public AjusteFinanceiroResponse ajustarConta(Long id, Long idTipoAjuste, String dataAjuste, BigDecimal valorAjuste, String login, String identificadorExterno, Long idTransacaoOriginal, Long idEstabelecimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ajustarConta");
     }
     
     // verify the required parameter 'idTipoAjuste' is set
     if (idTipoAjuste == null) {
        throw new ApiException(400, "Missing the required parameter 'idTipoAjuste' when calling ajustarConta");
     }
     
     // verify the required parameter 'dataAjuste' is set
     if (dataAjuste == null) {
        throw new ApiException(400, "Missing the required parameter 'dataAjuste' when calling ajustarConta");
     }
     
     // verify the required parameter 'valorAjuste' is set
     if (valorAjuste == null) {
        throw new ApiException(400, "Missing the required parameter 'valorAjuste' when calling ajustarConta");
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
   * Update the product associated to the account
   * the resource allows to make some modification of the product associated to the account
   * @param id Identification Code of the Account (id)
   * @param request request
   * @return String
   */
  public String alterarProduto(Long id, AlterarProdutoRequest request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarProduto");
     }
     
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling alterarProduto");
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
   * Update the account of a Personal holder
   * This method allows to change the person of the account
   * @param id Identification Code of the Account (id)
   * @param idPessoa Identification Code of a Person (id)
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
   * Update the expiration of the invoices
   * This resource allos to update the expiration for at most in 30 days after the current date  of a specific account on the PIER, respecting the parameter of intervalue among changments of the expiration informed by the Issuer
   * @param id Identification Code of the account (id)
   * @param novoDiaVencimento New day of expiration
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
   * Attribute Annuity
   * This resource allows to configurate what Annuity rule will be attributed for a determined account
   * @param id Identification code of the account (id)
   * @param idAnuidade Identifier of annuity
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param DDD DDD of the cell phone
   * @param celular Cell Phone Number
   * @param idOperadora Identifier of the Cell Phone Operator
   * @param idOrigemComercial Identifier of the Commercial Origin
   * @return Object
   */
  public Object ativarAnuidade(Long id, Long idAnuidade, List<String> sort, Integer page, Integer limit, String DDD, String celular, Long idOperadora, Long idOrigemComercial) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ativarAnuidade");
     }
     
     // verify the required parameter 'idAnuidade' is set
     if (idAnuidade == null) {
        throw new ApiException(400, "Missing the required parameter 'idAnuidade' when calling ativarAnuidade");
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
   * Activate the sending service of invoice by email
   * This resource activates the sending service of invoice by email
   * @param id Identification Code of the Account (id)
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
   * Performs partial account update
   * This feature allows you to perform partial account updating. This indicates that only the fields entered in the request will be updated, and the others will be ignored
   * @param id Account identification code (id)
   * @param contaPartialUpdate contaPartialUpdate
   * @return ContaResponse
   */
  public ContaResponse atualizarParcial(Long id, ContaPartialUpdate contaPartialUpdate) throws ApiException {
    Object postBody = contaPartialUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarParcial");
     }
     
     // verify the required parameter 'contaPartialUpdate' is set
     if (contaPartialUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'contaPartialUpdate' when calling atualizarParcial");
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
   * Block a determined account
   * This method allows to block a determined account using de id code (id)
   * @param id Identification Code of the Account (id)
   * @param idStatus Identification Code of the New Status Account
   * @return ContaResponse
   */
  public ContaResponse bloquear(Long id, Long idStatus) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling bloquear");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling bloquear");
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
   * Registration payment enrollment on Saturday
   * This resource allows you to register a payment membership on Saturday
   * @param id Accout Id
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
   * Do the cancellation of a determined account
   * This method allows to do the cancellation of a determined account using the ID code (id)
   * @param id Identification Code of the Account (id)
   * @param idStatus Idetification Code of the Account Status
   * @return ContaResponse
   */
  public ContaResponse cancelar(Long id, Long idStatus) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cancelar");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling cancelar");
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
   * Find an adhesion of payment on saturday
   * This resource allows you to find an adhesion of payment on saturday
   * @param id Account id
   * @param dataVencimento Adhesion due date
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
   * Show the deadline for payment of the invoice in debt to recieve the benefit
   * This method allows to retrieve if the client has the right to the benefit of the late payment, at the store, until the Saturday subsequent the deadline, being isent of penalty, fees, extra percentual taxe for late payment and IOF
   * @param id Identification Code of the Account (id)
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
   * Retrieve the dates of a determined invoice slip
   * this resource retrieves an invoice slip
   * @param id Id Account
   * @return BoletoResponse
   */
  public BoletoResponse consultarBoletoEmitido(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarBoletoEmitido");
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
   * Retrieve the updated debt of the client
   * This resource retrieves the updated debt of the client
   * @param id Id Account
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param dataVencimento Date of expiration
   * @param idEscritorioCobranca Identification Code of the billing office
   * @return DividaClienteResponse
   */
  public DividaClienteResponse consultarDividaAtualizadaCliente(Long id, List<String> sort, Integer page, Integer limit, String dataVencimento, Long idEscritorioCobranca) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarDividaAtualizadaCliente");
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
   * Retrieves a processed transaction for an account.
   * This resource allows to retrieve the details of a processed transaction belonging to an account.
   * @param id Identification code of the Account (id).
   * @param idTransacao Identification code of the Transaction (id).
   * @return TransacoesCorrentesResponse
   */
  public TransacoesCorrentesResponse consultarProcessada(Long id, Long idTransacao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarProcessada");
     }
     
     // verify the required parameter 'idTransacao' is set
     if (idTransacao == null) {
        throw new ApiException(400, "Missing the required parameter 'idTransacao' when calling consultarProcessada");
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
   * Allow to retrieve using the IDAccount fees and rates
   * This operation has as an aim to allow the Issuers retrieve the taxes and rates of the account. Esta opera??o tem como objetivo permitir que os Emissores consultem as taxas e tarifas da conta
   * @param id ID of the account to be retrieved
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
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
   * Displays data for a particular function type for accounts
   * This method allows you to query data from a particular function type for accounts from your identification code (id)
   * @param id Identification code of the function type for accounts (id)
   * @return String
   */
  public String consultar_0(Integer id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_0");
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
   * Show dates of a determined account
   * This method allows to retrieve dates of a determined account using the identification code (id)
   * @param id Identification Code of the Account (id)
   * @return ContaDetalheResponse
   */
  public ContaDetalheResponse consultar_1(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_1");
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
   * Retrieve the details of a determined transfer
   * This method allowst to retrieve the details of a determined credit transfer made among accounts
   * @param id Identification Code of the Account (id)
   * @param idTransferencia Identification Code of the transfer (id_transfer)
   * @return TransferenciaDetalheResponse
   */
  public TransferenciaDetalheResponse consultar_2(Long id, Long idTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_2");
     }
     
     // verify the required parameter 'idTransferencia' is set
     if (idTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling consultar_2");
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
   * Register accounts MultiApp
   * This feature allows you to register accounts MultiApp
   * @param contaMultiAppPersist contaMultiAppPersist
   * @return ContaMultiAppResponse
   */
  public ContaMultiAppResponse criarContasMultiApp(CountMultiAppPersist contaMultiAppPersist) throws ApiException {
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
   * Disable the service of sending the invoice by email
   * This resorurce desables the service of sending the invoice by email
   * @param id Identification Code of the Account (id)
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
   * Create a slip of recharge
   * This resource creates a slip of recharge
   * @param id Id Account
   * @param valor Attribute that represents the value of the bank slip issued
   * @param dataVencimento Attribute that represents the expiration date of the bank slip
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
   * Create a new card for printing
   * This resource allows to be created a new card for a determined cardholder that it is linked to the account. For this, it will be necessary inform the id code (id), the IdPersonal of the cardholder and the idPlastictype of the Card that must be created for printing. This functionability will be used to print the cards in stores, kiosks, offices, auto-service attendance, or other places that the Issuer chooses, but it is obligated to have Card Printer to make them, in local
   * @param id Identification Code of the Account (id)
   * @param idPessoa Identification Code of the person (id)
   * @param idTipoPlastico Identification Code of the TypePlastic (id)
   * @return CartaoImpressaoResponse
   */
  public CartaoImpressaoResponse gerarCartao(Long id, Long idPessoa, Long idTipoPlastico) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartao");
     }
     
     // verify the required parameter 'idPessoa' is set
     if (idPessoa == null) {
        throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling gerarCartao");
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
   * Do the sending for the generation of a new card in graphic
   * This resource allows to be generate a new Card for a determined cardholder that it is linked to the account. For this, it&#39;ll be necesseary to inform the id code of the account (id), the idPersonal of the cardholder and the idPlasticType of the card that will be printed. This functionality will be used for the cad printing in graphic
   * @param id Identification Code of the Account (id)
   * @param cartaoEmbossingRequest cartaoEmbossingRequest
   * @return CartaoEmbossingResponse
   */
  public CartaoEmbossingResponse gerarCartaoEmbossing(Long id, CartaoEmbossingRequest cartaoEmbossingRequest) throws ApiException {
    Object postBody = cartaoEmbossingRequest;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoEmbossing");
     }
     
     // verify the required parameter 'cartaoEmbossingRequest' is set
     if (cartaoEmbossingRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'cartaoEmbossingRequest' when calling gerarCartaoEmbossing");
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
   * Create a provisory card
   * This resource allows to be created a provisory card to a determined cardholder which one it is linked to an account. For this, it will be necessary to inform the identification code of the account (id)
   * @param id Identification Code of the Account (id)
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
   * Create a virtual card
   * This resource allows to be created a virtual card for a determined cardholder which one it is linked to an account. For this, it will be necessary to inform the identification code of the account (id). This functionability can be used to creat virtual cards through an App
   * @param id Identification Code of the Account (id)
   * @param dataValidade Expiration date
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
   * List existent accounts in the database of the Issuer
   * This resource allows to list existent accounts in the database of the Issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idProduto Identification Code of the product which the account takes part (id)
   * @param idOrigemComercial Identification Code of Commercial Origin (id) that gave origin to the Account
   * @param idPessoa Identification Code of the Personal holder of the Account (id)
   * @param idStatusConta Identification Code of the Account Status
   * @param diaVencimento List the day of expiration
   * @param melhorDiaCompra List the best shopping day
   * @param dataStatusConta List the date that the current idStatusAccount atual was attributed for it
   * @param dataCadastro List the date that the card was created
   * @param dataUltimaAlteracaoVencimento List the date of the last update of the expiration
   * @param funcaoAtiva 
   * @return PageContaResponse
   */
  public PageContaResponse listar(List<String> sort, Integer page, Integer limit, Long idProduto, Long idOrigemComercial, Long idPessoa, Long idStatusConta, Integer diaVencimento, Integer melhorDiaCompra, String dataStatusConta, String dataCadastro, String dataUltimaAlteracaoVencimento, String funcaoAtiva) throws ApiException {
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
   * List the historic of updatings of the Account limit
   * This resource retrieves the historic with the updatings of the Account limit informed
   * @param id Identification Code of the Account (id)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
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
   * List the historic of in/out  of advisories of collection
   * Allow to list all the register of in and out of the Account in files of integration with consulting collection firms through the idcode of the account(idAccount)
   * @param id Id Account
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
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
   * List the historic of late invoices
   * This resource lists the historic the late invoice payments
   * @param id Id Account
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageHistoricoAtrasoFaturaResponse
   */
  public PageHistoricoAtrasoFaturaResponse listarHistoricoAtrasosFaturas(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAtrasosFaturas");
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
   * List the transactions unprocessed of the account
   * This method allows to be listed all the transactions unprocessed of the Account
   * @param id Identification Code of the Account (id)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param dataInicio Date of beginning of the bank statement retrievement in the format yyyy-MM-dd (Parameter ignored if the Ending date is not set)
   * @param dataFim Date of ending of the bank statement retrievement in the format yyyy-MM-dd  (Parameter ignored if the Beginning date is not set)
   * @return PageTransacaoNaoProcessadaResponse
   */
  public PageTransacaoNaoProcessadaResponse listarNaoProcessadas(Long id, List<String> sort, Integer page, Integer limit, String dataInicio, String dataFim) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarNaoProcessadas");
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
   * List of the transactions processed of the account
   * This method allows to be listed all the transactions processed of the account
   * @param id Identification code of the Account (id)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param dataVencimento Date of expiration of the bank statement in the format yyyy-MM-dd
   * @param dataInicio Date of beginning of the bank statement retrievement in the format yyyy-MM-dd (Ignored when the parameter dateExpiration is used)
   * @param dataFim Date of Ending of the bank statement retrievement in the format yyyy-MM-dd (Ignored when the parameter dateExpiration is used)
   * @param idTipoTransacao Transaction Type
   * @param recuperaEncargos Add the interest transactions in the query
   * @return PageTransacoesCorrentesResponse
   */
  public PageTransacoesCorrentesResponse listarProcessadas(Long id, List<String> sort, Integer page, Integer limit, String dataVencimento, String dataInicio, String dataFim, Long idTipoTransacao, Integer recuperaEncargos) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarProcessadas");
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
   * Lista os tipos de fun\u00E7\u00F5es para contas do Emissor
   * This feature allows you to list the types of roles for the Issuer&#39;s accounts
   * @return String
   */
  public String listar_0() throws ApiException {
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
   * Lists unprocessed and processed account transactions
   * This method allows all unprocessed and processed transactions in the Account to be listed
   * @param id Identification Code of the Account (id)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param dataVencimento Date of expiration of the bank statement in the format yyyy-MM-dd
   * @param dataInicio Date of beginning of the bank statement retrievement in the format yyyy-MM-dd (Ignored when the parameter dateExpiration is used)
   * @param dataFim Date of Ending of the bank statement retrievement in the format yyyy-MM-dd (Ignored when the parameter dateExpiration is used)
   * @param idTipoTransacao Transaction Type
   * @param flagCredito Flag that indicates whether the transaction is credit
   * @param flagFaturado Flag indicating whether the transaction was billed
   * @param flagProcessada Flag indicating whether the transaction was processed
   * @param status Transaction Status
   * @param plano Transaction plan
   * @param codigoMCC MCC transaction code
   * @param grupoMCC Transaction MCC Group
   * @return PageTransacaoProcessadaNaoProcessadaResponse
   */
  public PageTransacaoProcessadaNaoProcessadaResponse listar_1(Long id, List<String> sort, Integer page, Integer limit, String dataVencimento, String dataInicio, String dataFim, Long idTipoTransacao, Boolean flagCredito, Boolean flagFaturado, Boolean flagProcessada, Integer status, Integer plano, Long codigoMCC, Long grupoMCC) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listar_1");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transacoes".replaceAll("\\{format\\}","json")
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
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagCredito", flagCredito));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagFaturado", flagFaturado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagProcessada", flagProcessada));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
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
   * List the transfers made by the account
   * This method allows to be listed the transfers made by the existing account in the base of the issuer
   * @param id Identification Code of the Account (id)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idTransferencia Identification Code of the transfer (id)
   * @param idContaOrigem Identification Code of the account which the value will be debited for the transfer (id)
   * @param idContaDestino Identification Code of the account which the value wull be creditedfor the transfer (id)
   * @param valorTransferencia Value established to be transfered
   * @param dataTransferencia Date established to occur the transfer
   * @return PageTransferenciaResponse
   */
  public PageTransferenciaResponse listar_2(Long id, List<String> sort, Integer page, Integer limit, Long idTransferencia, Long idContaOrigem, Long idContaDestino, BigDecimal valorTransferencia, String dataTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listar_2");
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
   * Do the reactivation of the account
   * this resource allows to reactivate the accounts. For this, It&#39;s necessary to inform the idcode of the account (id)
   * @param id Id Account
   * @return Object
   */
  public Object reativar(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling reativar");
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
   * Includes a new account
   * This resource includes a new account for an existing client
   * @param contaPersist contaPersist
   * @return ContaResponse
   */
  public ContaResponse salvar(ContaPersist contaPersist) throws ApiException {
    Object postBody = contaPersist;
    
     // verify the required parameter 'contaPersist' is set
     if (contaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'contaPersist' when calling salvar");
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
   * Make a registration of a new service adhesion
   * This feature allows you to register a new service subscription at the sender base
   * @param id Identify account
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
   * Simulate values of loans/financing
   * This operation can be used to simulate financial operations with the information given by the user. The created calculus must be considered only as a reference for real situations and not as official values
   * @param id Identification Code of the Account (id)
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
   * Allow to list a timeline of the event of the account
   * This operation has as an aim to allow a listing, in a timeline mode, of the events linked to a determined account. Transactions, invoice closing, payments, create cards and update the limit are exemples of the events contemplated for this funcionality. In this method, the operations are ordered in descending form
   * @param id Id Account
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageTransacaoResponse
   */
  public PageTransacaoResponse transacoes(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling transacoes");
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
   * Make a credit transfer to another client of the same Issuer
   * This method allows that a cardholder can make credit transfer to another client of the same Issuer
   * @param id Identification Code of the cardholder client account that will be debited (id)
   * @param idContaDestino Identification Code of the cardholder client that will be credited (id)
   * @param valorTransferencia Value of the Transfer
   * @return TransferenciaDetalheResponse
   */
  public TransferenciaDetalheResponse transferir(Long id, Long idContaDestino, BigDecimal valorTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling transferir");
     }
     
     // verify the required parameter 'idContaDestino' is set
     if (idContaDestino == null) {
        throw new ApiException(400, "Missing the required parameter 'idContaDestino' when calling transferir");
     }
     
     // verify the required parameter 'valorTransferencia' is set
     if (valorTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'valorTransferencia' when calling transferir");
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
  
}
