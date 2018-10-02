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
import br.com.conductor.pier.api.v2.model.AdesaoPagamentoSabadoResponse;
import br.com.conductor.pier.api.v2.model.BeneficioPagamentoAtrasoResponse;
import br.com.conductor.pier.api.v2.model.BoletoResponse;
import br.com.conductor.pier.api.v2.model.DividaClienteResponse;
import br.com.conductor.pier.api.v2.model.PageTaxasRefinanciamentoResponse;
import br.com.conductor.pier.api.v2.model.ContaDetalheResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaDetalheResponse;
import br.com.conductor.pier.api.v2.model.ContaMultiAppResponse;
import br.com.conductor.pier.api.v2.model.ContaMultiAppPersistValue;
import br.com.conductor.pier.api.v2.model.CartaoEmbossingResponse;
import br.com.conductor.pier.api.v2.model.CartaoEmbossingRequest;
import br.com.conductor.pier.api.v2.model.CartaoImpressaoProvisorioResponse;
import br.com.conductor.pier.api.v2.model.CartaoImpressaoResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoEventosResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoAssessoriaResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoAtrasoFaturaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoNaoProcessadaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacoesCorrentesResponse;
import br.com.conductor.pier.api.v2.model.PageContaResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoProcessadaNaoProcessadaResponse;
import br.com.conductor.pier.api.v2.model.PageTransferenciaResponse;
import br.com.conductor.pier.api.v2.model.ContaPersistValue;
import br.com.conductor.pier.api.v2.model.EmprestimoPessoalRequest;
import br.com.conductor.pier.api.v2.model.EmprestimoPessoalResponse;
import br.com.conductor.pier.api.v2.model.PageTransacaoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagcontaApi {
  private ApiClient apiClient;

  public GlobaltagcontaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagcontaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{conta_resource_ajustar_conta}}}
   * {{{conta_resource_ajustar_conta_notes}}}
   * @param id {{{conta_resource_ajustar_conta_param_id}}}
   * @param idTipoAjuste {{{ajuste_persist_id_tipo_ajuste_value}}}
   * @param dataAjuste {{{ajuste_persist_data_ajuste_value}}}
   * @param valorAjuste {{{ajuste_persist_valor_ajuste_value}}}
   * @param login login
   * @param identificadorExterno {{{ajuste_persist_identificador_externo_value}}}
   * @param idTransacaoOriginal {{{ajuste_persist_id_transacao_original}}}
   * @return AjusteFinanceiroResponse
   */
  public AjusteFinanceiroResponse ajustarContaUsingPOST1(Long id, Long idTipoAjuste, String dataAjuste, BigDecimal valorAjuste, String login, String identificadorExterno, Long idTransacaoOriginal) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ajustarContaUsingPOST1");
     }
     
     // verify the required parameter 'idTipoAjuste' is set
     if (idTipoAjuste == null) {
        throw new ApiException(400, "Missing the required parameter 'idTipoAjuste' when calling ajustarContaUsingPOST1");
     }
     
     // verify the required parameter 'dataAjuste' is set
     if (dataAjuste == null) {
        throw new ApiException(400, "Missing the required parameter 'dataAjuste' when calling ajustarContaUsingPOST1");
     }
     
     // verify the required parameter 'valorAjuste' is set
     if (valorAjuste == null) {
        throw new ApiException(400, "Missing the required parameter 'valorAjuste' when calling ajustarContaUsingPOST1");
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
   * {{{conta_resource_alterar_produto}}}
   * {{{conta_resource_alterar_produto_notes}}}
   * @param id {{{conta_resource_alterar_produto_param_id}}}
   * @param request request
   * @return String
   */
  public String alterarProdutoUsingPOST(Long id, AlterarProdutoRequest request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarProdutoUsingPOST");
     }
     
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling alterarProdutoUsingPOST");
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
   * {{{conta_resource_alterar_titular}}}
   * {{{conta_resource_alterar_titular_notes}}}
   * @param id {{{conta_resource_alterar_titular_param_id_conta}}}
   * @param idPessoa {{{conta_resource_alterar_titular_param_id_pessoa}}}
   * @return ContaResponse
   */
  public ContaResponse alterarTitularUsingPOST(Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTitularUsingPOST");
     }
     
     // verify the required parameter 'idPessoa' is set
     if (idPessoa == null) {
        throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling alterarTitularUsingPOST");
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
   * {{{conta_resource_alterar_vencimento}}}
   * {{{conta_resource_alterar_vencimento_notes}}}
   * @param id {{{conta_resource_alterar_vencimento_param_id}}}
   * @param novoDiaVencimento {{{conta_resource_alterar_vencimento_param_novo_dia_vencimento}}}
   * @return ContaResponse
   */
  public ContaResponse alterarVencimentoUsingPUT(Long id, Integer novoDiaVencimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarVencimentoUsingPUT");
     }
     
     // verify the required parameter 'novoDiaVencimento' is set
     if (novoDiaVencimento == null) {
        throw new ApiException(400, "Missing the required parameter 'novoDiaVencimento' when calling alterarVencimentoUsingPUT");
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
   * {{{conta_resource_ativar_anuidade}}}
   * {{{conta_resource_ativar_anuidade_notes}}}
   * @param id {{{conta_resource_ativar_anuidade_param_id}}}
   * @param idAnuidade {{{anuidade_request_id_anuidade_value}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param DDD {{{anuidade_request_d_d_d_value}}}
   * @param celular {{{anuidade_request_celular_value}}}
   * @param idOperadora {{{anuidade_request_id_operadora_value}}}
   * @param idOrigemComercial {{{anuidade_request_id_origem_comercial_value}}}
   * @return Object
   */
  public Object ativarAnuidadeUsingPOST(Long id, Long idAnuidade, List<String> sort, Integer page, Integer limit, String DDD, String celular, Long idOperadora, Long idOrigemComercial) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ativarAnuidadeUsingPOST");
     }
     
     // verify the required parameter 'idAnuidade' is set
     if (idAnuidade == null) {
        throw new ApiException(400, "Missing the required parameter 'idAnuidade' when calling ativarAnuidadeUsingPOST");
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
   * {{{conta_resource_ativar_envio_fatura_email}}}
   * {{{conta_resource_ativar_envio_fatura_email_notes}}}
   * @param id {{{conta_resource_ativar_envio_fatura_email_param_id}}}
   * @return Object
   */
  public Object ativarEnvioFaturaEmailUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ativarEnvioFaturaEmailUsingPOST");
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
   * {{{conta_resource_bloquear}}}
   * {{{conta_resource_bloquear_notes}}}
   * @param id {{{conta_resource_bloquear_param_id}}}
   * @param idStatus {{{conta_resource_bloquear_param_id_status}}}
   * @return ContaResponse
   */
  public ContaResponse bloquearUsingPOST1(Long id, Long idStatus) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling bloquearUsingPOST1");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling bloquearUsingPOST1");
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
   * {{{aderir_pagamento_sabado_recurso_cadastrar}}}
   * {{{aderir_pagamento_sabado_recurso_cadastrar_notas}}}
   * @param id {{{aderir_pagamento_sabado_recurso_cadastrar_param_id}}}
   * @return AdesaoPagamentoSabadoResponse
   */
  public AdesaoPagamentoSabadoResponse cadastrarUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrarUsingPOST");
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
   * {{{conta_resource_cancelar}}}
   * {{{conta_resource_cancelar_notes}}}
   * @param id {{{conta_resource_cancelar_param_id}}}
   * @param idStatus {{{conta_resource_cancelar_param_id_status}}}
   * @return ContaResponse
   */
  public ContaResponse cancelarUsingPOST1(Long id, Long idStatus) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarUsingPOST1");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling cancelarUsingPOST1");
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
   * {{{conta_resource_consultar_beneficio_pagamento_atraso}}}
   * {{{conta_resource_consultar_beneficio_pagamento_atraso_notes}}}
   * @param id {{{conta_resource_consultar_beneficio_pagamento_atraso_param_id}}}
   * @return BeneficioPagamentoAtrasoResponse
   */
  public BeneficioPagamentoAtrasoResponse consultarBeneficioPagamentoAtrasoUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarBeneficioPagamentoAtrasoUsingGET");
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
   * {{{conta_resource_consultar_boleto_emitido}}}
   * {{{conta_resource_consultar_boleto_emitido_notes}}}
   * @param id {{{conta_resource_consultar_boleto_emitido_param_id}}}
   * @return BoletoResponse
   */
  public BoletoResponse consultarBoletoEmitidoUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarBoletoEmitidoUsingGET");
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
   * {{{conta_resource_consultar_divida_atualizada_cliente}}}
   * {{{conta_resource_consultar_divida_atualizada_cliente_notes}}}
   * @param id {{{conta_resource_consultar_divida_atualizada_cliente_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param dataVencimento {{{divida_cliente_request_data_vencimento_value}}}
   * @param idEscritorioCobranca {{{divida_cliente_request_id_escritorio_cobranca_value}}}
   * @return DividaClienteResponse
   */
  public DividaClienteResponse consultarDividaAtualizadaClienteUsingGET(Long id, List<String> sort, Integer page, Integer limit, String dataVencimento, Long idEscritorioCobranca) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarDividaAtualizadaClienteUsingGET");
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
   * {{{conta_resource_consultar_taxas_tarifas}}}
   * {{{conta_resource_consultar_taxas_tarifas_notes}}}
   * @param id {{{conta_resource_consultar_taxas_tarifas_param_id_conta}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageTaxasRefinanciamentoResponse
   */
  public PageTaxasRefinanciamentoResponse consultarTaxasTarifasUsingGET(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxasTarifasUsingGET");
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
   * {{{aderir_pagamento_sabado_recurso_consultar}}}
   * {{{aderir_pagamento_sabado_recurso_consultar_notas}}}
   * @param id {{{aderir_pagamento_sabado_recurso_consultar_param_id}}}
   * @param dataVencimento {{{aderir_pagamento_sabado_recurso_consultar_param_data_vencimento}}}
   * @return AdesaoPagamentoSabadoResponse
   */
  public AdesaoPagamentoSabadoResponse consultarUsingGET1(Long id, String dataVencimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET1");
     }
     
     // verify the required parameter 'dataVencimento' is set
     if (dataVencimento == null) {
        throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling consultarUsingGET1");
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
   * {{{conta_resource_consultar}}}
   * {{{conta_resource_consultar_notes}}}
   * @param id {{{conta_resource_consultar_param_id}}}
   * @return ContaDetalheResponse
   */
  public ContaDetalheResponse consultarUsingGET13(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET13");
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
   * {{{transferencia_resource_consultar}}}
   * {{{transferencia_resource_consultar_notes}}}
   * @param id {{{transferencia_resource_consultar_param_id_conta}}}
   * @param idTransferencia {{{transferencia_resource_consultar_param_id_transferencia}}}
   * @return TransferenciaDetalheResponse
   */
  public TransferenciaDetalheResponse consultarUsingGET45(Long id, Long idTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET45");
     }
     
     // verify the required parameter 'idTransferencia' is set
     if (idTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling consultarUsingGET45");
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
   * {{{conta_resource_cadastrar_conta_multiapp}}}
   * {{{conta_resource_cadastrar_conta_multiapp_notes}}}
   * @param contaMultiAppPersist contaMultiAppPersist
   * @return ContaMultiAppResponse
   */
  public ContaMultiAppResponse criarContasMultiAppUsingPOST(ContaMultiAppPersistValue contaMultiAppPersist) throws ApiException {
    Object postBody = contaMultiAppPersist;
    
     // verify the required parameter 'contaMultiAppPersist' is set
     if (contaMultiAppPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'contaMultiAppPersist' when calling criarContasMultiAppUsingPOST");
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
   * {{{conta_resource_desativar_envio_fatura_email}}}
   * {{{conta_resource_desativar_envio_fatura_email_notes}}}
   * @param id {{{conta_resource_desativar_envio_fatura_email_param_id}}}
   * @return Object
   */
  public Object desativarEnvioFaturaEmailUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarEnvioFaturaEmailUsingPOST");
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
   * {{{conta_resource_gerar_boleto_recarga}}}
   * {{{conta_resource_gerar_boleto_recarga_notes}}}
   * @param id {{{conta_resource_gerar_boleto_recarga_param_id}}}
   * @param valor {{{boleto_recarga_request_valor_value}}}
   * @param dataVencimento {{{boleto_recarga_request_data_vencimento_value}}}
   * @return BoletoResponse
   */
  public BoletoResponse gerarBoletoRecargaUsingPOST(Long id, BigDecimal valor, String dataVencimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarBoletoRecargaUsingPOST");
     }
     
     // verify the required parameter 'valor' is set
     if (valor == null) {
        throw new ApiException(400, "Missing the required parameter 'valor' when calling gerarBoletoRecargaUsingPOST");
     }
     
     // verify the required parameter 'dataVencimento' is set
     if (dataVencimento == null) {
        throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling gerarBoletoRecargaUsingPOST");
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
   * {{{conta_resource_gerar_cartao_embossing}}}
   * {{{conta_resource_gerar_cartao_embossing_notes}}}
   * @param id {{{conta_resource_gerar_cartao_embossing_param_id}}}
   * @param cartaoEmbossingRequest cartaoEmbossingRequest
   * @return CartaoEmbossingResponse
   */
  public CartaoEmbossingResponse gerarCartaoEmbossingUsingPOST(Long id, CartaoEmbossingRequest cartaoEmbossingRequest) throws ApiException {
    Object postBody = cartaoEmbossingRequest;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoEmbossingUsingPOST");
     }
     
     // verify the required parameter 'cartaoEmbossingRequest' is set
     if (cartaoEmbossingRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'cartaoEmbossingRequest' when calling gerarCartaoEmbossingUsingPOST");
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
   * {{{conta_resource_gerar_cartao_provisorio}}}
   * {{{conta_resource_gerar_cartao_provisorio_notes}}}
   * @param id {{{conta_resource_gerar_cartao_provisorio_param_id_conta}}}
   * @return CartaoImpressaoProvisorioResponse
   */
  public CartaoImpressaoProvisorioResponse gerarCartaoProvisorioUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoProvisorioUsingPOST");
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
   * {{{conta_resource_gerar_cartao}}}
   * {{{conta_resource_gerar_cartao_notes}}}
   * @param id {{{conta_resource_gerar_cartao_param_id}}}
   * @param idPessoa {{{conta_resource_gerar_cartao_param_id_pessoa}}}
   * @param idTipoPlastico {{{conta_resource_gerar_cartao_param_id_tipo_plastico}}}
   * @return CartaoImpressaoResponse
   */
  public CartaoImpressaoResponse gerarCartaoUsingPOST(Long id, Long idPessoa, Long idTipoPlastico) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoUsingPOST");
     }
     
     // verify the required parameter 'idPessoa' is set
     if (idPessoa == null) {
        throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling gerarCartaoUsingPOST");
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
   * {{{conta_resource_gerar_cartao_virtual}}}
   * {{{conta_resource_gerar_cartao_virtual_notes}}}
   * @param id {{{conta_resource_gerar_cartao_virtual_param_id}}}
   * @param dataValidade {{{conta_resource_gerar_cartao_virtual_param_data_validade}}}
   * @return CartaoImpressaoResponse
   */
  public CartaoImpressaoResponse gerarCartaoVirtualUsingPOST(Long id, String dataValidade) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoVirtualUsingPOST");
     }
     
     // verify the required parameter 'dataValidade' is set
     if (dataValidade == null) {
        throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling gerarCartaoVirtualUsingPOST");
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
   * {{{conta_resource_listar_historico_alteracoes_limites}}}
   * {{{conta_resource_listar_historico_alteracoes_limites_notes}}}
   * @param id {{{conta_resource_listar_historico_alteracoes_limites_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageHistoricoEventosResponse
   */
  public PageHistoricoEventosResponse listarHistoricoAlteracoesLimitesUsingGET(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAlteracoesLimitesUsingGET");
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
   * {{{conta_resource_listar_historico_assessoria}}}
   * {{{conta_resource_listar_historico_assessoria_notes}}}
   * @param id {{{conta_resource_listar_historico_assessoria_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageHistoricoAssessoriaResponse
   */
  public PageHistoricoAssessoriaResponse listarHistoricoAssessoriaUsingGET(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAssessoriaUsingGET");
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
   * {{{conta_resource_listar_historico_atrasos_faturas}}}
   * {{{conta_resource_listar_historico_atrasos_faturas_notes}}}
   * @param id {{{conta_resource_listar_historico_atrasos_faturas_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageHistoricoAtrasoFaturaResponse
   */
  public PageHistoricoAtrasoFaturaResponse listarHistoricoAtrasosFaturasUsingGET(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAtrasosFaturasUsingGET");
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
   * {{{transacoes_correntes_resource_listar_nao_processadas}}}
   * {{{transacoes_correntes_resource_listar_nao_processadas_notes}}}
   * @param id {{{transacoes_correntes_resource_listar_nao_processadas_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param dataInicio {{{transacoes_nao_processadas_request_data_inicio_value}}}
   * @param dataFim {{{transacoes_nao_processadas_request_data_fim_value}}}
   * @return PageTransacaoNaoProcessadaResponse
   */
  public PageTransacaoNaoProcessadaResponse listarNaoProcessadasUsingGET(Long id, List<String> sort, Integer page, Integer limit, String dataInicio, String dataFim) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarNaoProcessadasUsingGET");
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
   * {{{transacoes_correntes_resource_listar_processadas}}}
   * {{{transacoes_correntes_resource_listar_processadas_notes}}}
   * @param id {{{transacoes_correntes_resource_listar_processadas_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param dataVencimento {{{transacoes_processadas_request_data_vencimento_value}}}
   * @param dataInicio {{{transacoes_processadas_request_data_inicio_value}}}
   * @param dataFim {{{transacoes_processadas_request_data_fim_value}}}
   * @param idTipoTransacao {{{transacoes_processadas_request_tipo_transacao}}}
   * @param recuperaEncargos {{{transacoes_processadas_request_recupera_encargos}}}
   * @return PageTransacoesCorrentesResponse
   */
  public PageTransacoesCorrentesResponse listarProcessadasUsingGET(Long id, List<String> sort, Integer page, Integer limit, String dataVencimento, String dataInicio, String dataFim, Long idTipoTransacao, Integer recuperaEncargos) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarProcessadasUsingGET");
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
   * {{{conta_resource_listar}}}
   * {{{conta_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idProduto {{{conta_request_id_produto_value}}}
   * @param idOrigemComercial {{{conta_request_id_origem_comercial_value}}}
   * @param idPessoa {{{conta_request_id_pessoa_value}}}
   * @param idStatusConta {{{conta_request_id_status_conta_value}}}
   * @param diaVencimento {{{conta_request_dia_vencimento_value}}}
   * @param melhorDiaCompra {{{conta_request_melhor_dia_compra_value}}}
   * @param dataStatusConta {{{conta_request_data_status_conta_value}}}
   * @param dataCadastro {{{conta_request_data_cadastro_value}}}
   * @param dataUltimaAlteracaoVencimento {{{conta_request_data_ultima_alteracao_vencimento_value}}}
   * @return PageContaResponse
   */
  public PageContaResponse listarUsingGET17(List<String> sort, Integer page, Integer limit, Long idProduto, Long idOrigemComercial, Long idPessoa, Long idStatusConta, Integer diaVencimento, Integer melhorDiaCompra, String dataStatusConta, String dataCadastro, String dataUltimaAlteracaoVencimento) throws ApiException {
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
    

    

    

    final String[] accepts = {
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
   * {{{transacoes_correntes_resource_listar_nao_processadas_e_processadas}}}
   * {{{transacoes_correntes_resource_listar_nao_processadas_e_processadas_notes}}}
   * @param id {{{transacoes_correntes_resource_listar_nao_processadas_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param dataVencimento {{{transacoes_processadas_request_data_vencimento_value}}}
   * @param dataInicio {{{transacoes_processadas_request_data_inicio_value}}}
   * @param dataFim {{{transacoes_processadas_request_data_fim_value}}}
   * @param idTipoTransacao {{{transacoes_processadas_request_tipo_transacao}}}
   * @param flagCredito {{{transacoes_processadas_request_flag_credito}}}
   * @param flagFaturado {{{transacoes_processadas_request_flag_faturado}}}
   * @param flagProcessada {{{transacoes_processadas_request_flag_processada}}}
   * @param status {{{transacoes_processadas_request_status}}}
   * @param plano {{{transacoes_processadas_request_plano}}}
   * @param codigoMCC {{{transacoes_processadas_request_codigo_mcc}}}
   * @param grupoMCC {{{transacoes_processadas_request_grupo_mcc}}}
   * @return PageTransacaoProcessadaNaoProcessadaResponse
   */
  public PageTransacaoProcessadaNaoProcessadaResponse listarUsingGET53(Long id, List<String> sort, Integer page, Integer limit, String dataVencimento, String dataInicio, String dataFim, Long idTipoTransacao, Boolean flagCredito, Boolean flagFaturado, Boolean flagProcessada, Integer status, Integer plano, Long codigoMCC, Long grupoMCC) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarUsingGET53");
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
   * {{{transferencia_resource_listar}}}
   * {{{transferencia_resource_listar_notes}}}
   * @param id {{{transferencia_resource_listar_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idTransferencia {{{transferencia_request_id_transferencia_value}}}
   * @param idContaOrigem {{{transferencia_request_id_conta_origem_value}}}
   * @param idContaDestino {{{transferencia_request_id_conta_destino_value}}}
   * @param valorTransferencia {{{transferencia_request_valor_transferencia_value}}}
   * @param dataTransferencia {{{transferencia_request_data_transferencia_value}}}
   * @return PageTransferenciaResponse
   */
  public PageTransferenciaResponse listarUsingGET55(Long id, List<String> sort, Integer page, Integer limit, Long idTransferencia, Long idContaOrigem, Long idContaDestino, BigDecimal valorTransferencia, String dataTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarUsingGET55");
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
   * {{{conta_resource_reativar}}}
   * {{{conta_resource_reativar_notes}}}
   * @param id {{{conta_resource_reativar_param_id}}}
   * @return Object
   */
  public Object reativarUsingPOST1(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling reativarUsingPOST1");
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
   * {{{conta_resource_salvar}}}
   * {{{conta_resource_salvar_notes}}}
   * @param contaPersist contaPersist
   * @return ContaResponse
   */
  public ContaResponse salvarUsingPOST7(ContaPersistValue contaPersist) throws ApiException {
    Object postBody = contaPersist;
    
     // verify the required parameter 'contaPersist' is set
     if (contaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'contaPersist' when calling salvarUsingPOST7");
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
   * {{{financiamento_resource_simular_emprestimo_financiamento}}}
   * {{{financiamento_resource_simular_emprestimo_financiamento_notes}}}
   * @param id {{{financiamento_resource_simular_emprestimo_financiamento_param_id_conta}}}
   * @param request request
   * @return EmprestimoPessoalResponse
   */
  public EmprestimoPessoalResponse simularEmprestimoFinanciamentoUsingPOST(Long id, EmprestimoPessoalRequest request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling simularEmprestimoFinanciamentoUsingPOST");
     }
     
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling simularEmprestimoFinanciamentoUsingPOST");
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
   * {{{conta_resource_transacoes}}}
   * {{{conta_resource_transacoes_notes}}}
   * @param id {{{conta_resource_transacoes_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageTransacaoResponse
   */
  public PageTransacaoResponse transacoesUsingGET(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling transacoesUsingGET");
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
   * {{{transferencia_resource_transferir}}}
   * {{{transferencia_resource_transferir_notes}}}
   * @param id {{{transferencia_resource_transferir_param_id_conta_origem}}}
   * @param idContaDestino {{{transferencia_resource_transferir_param_id_conta_destino}}}
   * @param valorTransferencia {{{transferencia_resource_transferir_param_valor_transferencia}}}
   * @return TransferenciaDetalheResponse
   */
  public TransferenciaDetalheResponse transferirUsingPOST1(Long id, Long idContaDestino, BigDecimal valorTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling transferirUsingPOST1");
     }
     
     // verify the required parameter 'idContaDestino' is set
     if (idContaDestino == null) {
        throw new ApiException(400, "Missing the required parameter 'idContaDestino' when calling transferirUsingPOST1");
     }
     
     // verify the required parameter 'valorTransferencia' is set
     if (valorTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'valorTransferencia' when calling transferirUsingPOST1");
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
