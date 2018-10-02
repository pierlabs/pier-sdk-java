package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.TaxaJurosContaPersistValue;
import br.com.conductor.pier.api.v2.model.TaxaJurosContaResponse;
import br.com.conductor.pier.api.v2.model.ContaBancariaPortadorUpdateValue;
import br.com.conductor.pier.api.v2.model.ContaBancariaPortadorResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaCreditoContaBancariaResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaBancariaResponse;
import br.com.conductor.pier.api.v2.model.PageTransferenciaCreditoContaBancariaResponse;
import br.com.conductor.pier.api.v2.model.PageContaBancariaPortadorResponse;
import br.com.conductor.pier.api.v2.model.PageTransferenciaBancariaResponse;
import br.com.conductor.pier.api.v2.model.ContaBancariaPortadorPersistValue;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoTransferenciaCreditoContaBancariaRequest;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoTransferenciaCreditoContaBancariaResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaCreditoContaBancariaPersistValue;
import br.com.conductor.pier.api.v2.model.TransferenciaBancariaPersistValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagtransferenciabancariaApi {
  private ApiClient apiClient;

  public GlobaltagtransferenciabancariaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagtransferenciabancariaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{transferencia_bancaria_resource_atualizar_taxas_juros_contas}}}
   * {{{transferencia_bancaria_resource_atualizar_taxas_juros_contas_notes}}}
   * @param id {{{transferencia_bancaria_resource_salvar_taxas_juros_contas_param_id}}}
   * @param update update
   * @return TaxaJurosContaResponse
   */
  public TaxaJurosContaResponse atualizarTaxasJurosContasUsingPUT(Long id, TaxaJurosContaPersistValue update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarTaxasJurosContasUsingPUT");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling atualizarTaxasJurosContasUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/taxas-transferencias".replaceAll("\\{format\\}","json")
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

    
    GenericType<TaxaJurosContaResponse> returnType = new GenericType<TaxaJurosContaResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{conta_bancaria_resource_atualizar}}}
   * {{{conta_bancaria_resource_atualizar_notes}}}
   * @param id {{{conta_bancaria_resource_atualizar_param_id}}}
   * @param update update
   * @return ContaBancariaPortadorResponse
   */
  public ContaBancariaPortadorResponse atualizarUsingPUT1(Long id, ContaBancariaPortadorUpdateValue update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarUsingPUT1");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling atualizarUsingPUT1");
     }
     
    // create path and map variables
    String path = "/api/contas-bancarias-portador/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ContaBancariaPortadorResponse> returnType = new GenericType<ContaBancariaPortadorResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{transferencia_bancaria_resource_cancelar_transferencia_credito_conta_bancaria}}}
   * {{{transferencia_bancaria_resource_cancelar_transferencia_credito_conta_bancaria_notes}}}
   * @param idTransferencia {{{transferencia_bancaria_resource_cancelar_transferencia_credito_conta_bancaria_param_id_transferencia}}}
   * @return String
   */
  public String cancelarTransferenciaCreditoContaBancariaUsingPOST(Long idTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idTransferencia' is set
     if (idTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling cancelarTransferenciaCreditoContaBancariaUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/transferencias-creditos-contas-bancarias/{idTransferencia}/cancelar".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idTransferencia" + "\\}", apiClient.escapeString(idTransferencia.toString()));

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
   * {{{transferencia_bancaria_resource_confirmar_transferencia_credito_conta_bancaria}}}
   * {{{transferencia_bancaria_resource_confirmar_transferencia_credito_conta_bancaria_notes}}}
   * @param idTransferencia {{{transferencia_bancaria_resource_confirmar_transferencia_credito_conta_bancaria_param_id_transferencia}}}
   * @return String
   */
  public String confirmarTransferenciaCreditoContaBancariaUsingPOST(Long idTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idTransferencia' is set
     if (idTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling confirmarTransferenciaCreditoContaBancariaUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/transferencias-creditos-contas-bancarias/{idTransferencia}/confirmar".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idTransferencia" + "\\}", apiClient.escapeString(idTransferencia.toString()));

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
   * {{{transferencia_bancaria_resource_consultar_taxas_juros_contas}}}
   * {{{transferencia_bancaria_resource_consultar_taxas_juros_contas_notes}}}
   * @param id {{{transferencia_bancaria_resource_salvar_taxas_juros_contas_param_id}}}
   * @param numeroMesesCarencia numeroMesesCarencia
   * @return TaxaJurosContaResponse
   */
  public TaxaJurosContaResponse consultarTaxasJurosContasUsingGET(Long id, Integer numeroMesesCarencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxasJurosContasUsingGET");
     }
     
     // verify the required parameter 'numeroMesesCarencia' is set
     if (numeroMesesCarencia == null) {
        throw new ApiException(400, "Missing the required parameter 'numeroMesesCarencia' when calling consultarTaxasJurosContasUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/taxas-transferencias".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroMesesCarencia", numeroMesesCarencia));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<TaxaJurosContaResponse> returnType = new GenericType<TaxaJurosContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{transferencia_bancaria_resource_consultar_transferencia_bancaria}}}
   * {{{transferencia_bancaria_resource_consultar_transferencia_bancaria_notes}}}
   * @param idTransferencia {{{transferencia_bancaria_resource_consultar_transferencia_bancaria_param_id_transferencia}}}
   * @return TransferenciaCreditoContaBancariaResponse
   */
  public TransferenciaCreditoContaBancariaResponse consultarTransferenciaBancariaUsingGET(Long idTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idTransferencia' is set
     if (idTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling consultarTransferenciaBancariaUsingGET");
     }
     
    // create path and map variables
    String path = "/api/transferencias-creditos-contas-bancarias/{idTransferencia}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idTransferencia" + "\\}", apiClient.escapeString(idTransferencia.toString()));

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

    
    GenericType<TransferenciaCreditoContaBancariaResponse> returnType = new GenericType<TransferenciaCreditoContaBancariaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{conta_bancaria_resource_consultar}}}
   * {{{conta_bancaria_resource_consultar_notes}}}
   * @param id {{{conta_bancaria_resource_consultar_param_id}}}
   * @return ContaBancariaPortadorResponse
   */
  public ContaBancariaPortadorResponse consultarUsingGET12(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET12");
     }
     
    // create path and map variables
    String path = "/api/contas-bancarias-portador/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ContaBancariaPortadorResponse> returnType = new GenericType<ContaBancariaPortadorResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{transferencia_bancaria_resource_consultar}}}
   * {{{transferencia_bancaria_resource_consultar_notes}}}
   * @param id {{{transferencia_bancaria_resource_consultar_param_id}}}
   * @param idTransferencia {{{transferencia_bancaria_resource_consultar_param_id_evento}}}
   * @param idContaBancariaDestino {{{transferencia_bancaria_resource_consultar_param_id_conta_portador}}}
   * @return TransferenciaBancariaResponse
   */
  public TransferenciaBancariaResponse consultarUsingGET44(Long id, Long idTransferencia, Long idContaBancariaDestino) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET44");
     }
     
     // verify the required parameter 'idTransferencia' is set
     if (idTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling consultarUsingGET44");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-contas-bancarias/{id_transferencia}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "id_transferencia" + "\\}", apiClient.escapeString(idTransferencia.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_conta_bancaria_destino", idContaBancariaDestino));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<TransferenciaBancariaResponse> returnType = new GenericType<TransferenciaBancariaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{transferencia_bancaria_resource_listar_transferencia_bancaria}}}
   * {{{transferencia_bancaria_resource_listar_transferencia_bancaria_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idConta {{{transferencia_credito_conta_bancaria_request_id_conta_value}}}
   * @param dataSolicitacaoInicial {{{transferencia_credito_conta_bancaria_request_data_solicitacao_inicial_value}}}
   * @param dataSolicitacaoFinal {{{transferencia_credito_conta_bancaria_request_data_solicitacao_final_value}}}
   * @param status {{{transferencia_credito_conta_bancaria_request_status_value}}}
   * @return PageTransferenciaCreditoContaBancariaResponse
   */
  public PageTransferenciaCreditoContaBancariaResponse listarTransferenciaBancariaUsingGET(List<String> sort, Integer page, Integer limit, Long idConta, String dataSolicitacaoInicial, String dataSolicitacaoFinal, Integer status) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/transferencias-creditos-contas-bancarias".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataSolicitacaoInicial", dataSolicitacaoInicial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataSolicitacaoFinal", dataSolicitacaoFinal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageTransferenciaCreditoContaBancariaResponse> returnType = new GenericType<PageTransferenciaCreditoContaBancariaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{conta_bancaria_resource_listar}}}
   * {{{conta_bancaria_resource_listar_notes}}}
   * @param idConta {{{conta_bancaria_portador_listar_request_id_conta_value}}}
   * @param nomeAgencia {{{conta_bancaria_portador_listar_request_nome_agencia_value}}}
   * @param banco {{{conta_bancaria_portador_listar_request_codigo_banco_value}}}
   * @param numeroAgencia {{{conta_bancaria_portador_listar_request_numero_agencia_value}}}
   * @param numeroConta {{{conta_bancaria_portador_listar_request_numero_conta_value}}}
   * @param flagAtivo {{{conta_bancaria_portador_listar_request_flag_ativo_value}}}
   * @param flagContaOrigemDoc {{{conta_bancaria_portador_listar_request_flag_conta_origem_doc_value}}}
   * @param idPessoaFisica {{{conta_bancaria_portador_listar_request_id_pessoa_fisica_value}}}
   * @param favorecido {{{conta_bancaria_portador_listar_request_favorecido_value}}}
   * @param numeroReceiraFederal {{{conta_bancaria_portador_listar_request_numero_receira_federal_value}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageContaBancariaPortadorResponse
   */
  public PageContaBancariaPortadorResponse listarUsingGET15(Long idConta, String nomeAgencia, Long banco, String numeroAgencia, String numeroConta, Integer flagAtivo, Integer flagContaOrigemDoc, Long idPessoaFisica, String favorecido, String numeroReceiraFederal, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/contas-bancarias-portador".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeAgencia", nomeAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroConta", numeroConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagContaOrigemDoc", flagContaOrigemDoc));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoaFisica", idPessoaFisica));
    
    queryParams.addAll(apiClient.parameterToPairs("", "favorecido", favorecido));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroReceiraFederal", numeroReceiraFederal));
    
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

    
    GenericType<PageContaBancariaPortadorResponse> returnType = new GenericType<PageContaBancariaPortadorResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{transferencia_bancaria_resource_listar}}}
   * {{{transferencia_bancaria_resource_listar_notes}}}
   * @param id {{{transferencia_bancaria_resource_listar_param_id}}}
   * @param idContaBancariaDestino {{{transferencia_bancaria_resource_listar_param_id_conta_portador}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageTransferenciaBancariaResponse
   */
  public PageTransferenciaBancariaResponse listarUsingGET54(Long id, Long idContaBancariaDestino, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarUsingGET54");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-contas-bancarias".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_conta_bancaria_destino", idContaBancariaDestino));
    
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

    
    GenericType<PageTransferenciaBancariaResponse> returnType = new GenericType<PageTransferenciaBancariaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{transferencia_bancaria_resource_salvar_taxas_juros_contas}}}
   * {{{transferencia_bancaria_resource_salvar_taxas_juros_contas_notes}}}
   * @param id {{{transferencia_bancaria_resource_salvar_taxas_juros_contas_param_id}}}
   * @param persist persist
   * @return TaxaJurosContaResponse
   */
  public TaxaJurosContaResponse salvarTaxasJurosContasUsingPOST(Long id, TaxaJurosContaPersistValue persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvarTaxasJurosContasUsingPOST");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarTaxasJurosContasUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/taxas-transferencias".replaceAll("\\{format\\}","json")
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

    
    GenericType<TaxaJurosContaResponse> returnType = new GenericType<TaxaJurosContaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{conta_bancaria_resource_salvar}}}
   * {{{conta_bancaria_resource_salvar_notes}}}
   * @param persist persist
   * @return ContaBancariaPortadorResponse
   */
  public ContaBancariaPortadorResponse salvarUsingPOST6(ContaBancariaPortadorPersistValue persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST6");
     }
     
    // create path and map variables
    String path = "/api/contas-bancarias-portador".replaceAll("\\{format\\}","json");

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

    
    GenericType<ContaBancariaPortadorResponse> returnType = new GenericType<ContaBancariaPortadorResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{transferencia_bancaria_resource_simular_transferencia_bancaria}}}
   * {{{transferencia_bancaria_resource_simular_transferencia_bancaria_notes}}}
   * @param request request
   * @return PlanoParcelamentoTransferenciaCreditoContaBancariaResponse
   */
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse simularTransferenciaBancariaUsingPOST(PlanoParcelamentoTransferenciaCreditoContaBancariaRequest request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling simularTransferenciaBancariaUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/simular-transferencias-creditos-contas-bancarias".replaceAll("\\{format\\}","json");

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

    
    GenericType<PlanoParcelamentoTransferenciaCreditoContaBancariaResponse> returnType = new GenericType<PlanoParcelamentoTransferenciaCreditoContaBancariaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{transferencia_bancaria_resource_transferencia_credito_conta_bancaria}}}
   * {{{transferencia_bancaria_resource_transferencia_credito_conta_bancaria_notes}}}
   * @param persist persist
   * @return TransferenciaCreditoContaBancariaResponse
   */
  public TransferenciaCreditoContaBancariaResponse transferenciaCreditoContaBancariaUsingPOST(TransferenciaCreditoContaBancariaPersistValue persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling transferenciaCreditoContaBancariaUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/transferencias-creditos-contas-bancarias".replaceAll("\\{format\\}","json");

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

    
    GenericType<TransferenciaCreditoContaBancariaResponse> returnType = new GenericType<TransferenciaCreditoContaBancariaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{transferencia_bancaria_resource_transferir}}}
   * {{{transferencia_bancaria_resource_transferir_notes}}}
   * @param id {{{transferencia_bancaria_resource_transferir_param_id}}}
   * @param transferenciaBancariaPersist transferenciaBancariaPersist
   * @return TransferenciaBancariaResponse
   */
  public TransferenciaBancariaResponse transferirUsingPOST(Long id, TransferenciaBancariaPersistValue transferenciaBancariaPersist) throws ApiException {
    Object postBody = transferenciaBancariaPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling transferirUsingPOST");
     }
     
     // verify the required parameter 'transferenciaBancariaPersist' is set
     if (transferenciaBancariaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'transferenciaBancariaPersist' when calling transferirUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/transferencias-creditos-contas-bancarias".replaceAll("\\{format\\}","json")
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

    
    GenericType<TransferenciaBancariaResponse> returnType = new GenericType<TransferenciaBancariaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
