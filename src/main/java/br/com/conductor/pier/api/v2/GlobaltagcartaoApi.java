package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.CartaoResponse;
import br.com.conductor.pier.api.v2.model.EstagioCartaoUpdate;
import br.com.conductor.pier.api.v2.model.HistoricoImpressaoCartaoResponse;
import br.com.conductor.pier.api.v2.model.DadosCartaoImpressaoResponse;
import br.com.conductor.pier.api.v2.model.DadosCartaoResponse;
import br.com.conductor.pier.api.v2.model.LimiteDisponibilidadeResponse;
import br.com.conductor.pier.api.v2.model.LoteCartoesPrePagosResponse;
import br.com.conductor.pier.api.v2.model.PortadorResponse;
import br.com.conductor.pier.api.v2.model.CartaoDetalheResponse;
import br.com.conductor.pier.api.v2.model.CartaoMultiAppImpressaoResponse;
import br.com.conductor.pier.api.v2.model.PageLoteCartoesPrePagosResponse;
import br.com.conductor.pier.api.v2.model.PageCartaoResponse;
import br.com.conductor.pier.api.v2.model.ValidaCVVRequest;
import br.com.conductor.pier.api.v2.model.ValidaCartaoResponse;
import br.com.conductor.pier.api.v2.model.ValidaSenhaCartaoResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class GlobaltagcartaoApi {
  private ApiClient apiClient;

  public GlobaltagcartaoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagcartaoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{cartao_resource_alterar_alterar_senha}}}
   * {{{cartao_resource_alterar_alterar_senha_notes}}}
   * @param id {{{cartao_resource_alterar_alterar_senha_param_id}}}
   * @param senha {{{cartao_resource_alterar_alterar_senha_param_nova_senha}}}
   * @param authorization Authorization
   * @return String
   */
  public String alterarAlterarSenhaUsingPUT(Long id, String senha, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarAlterarSenhaUsingPUT");
     }
     
     // verify the required parameter 'senha' is set
     if (senha == null) {
        throw new ApiException(400, "Missing the required parameter 'senha' when calling alterarAlterarSenhaUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/alterar-senha".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    if (senha != null)
      headerParams.put("senha", apiClient.parameterToString(senha));
    

    

    final String[] accepts = {
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
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_alterar_estagio}}}
   * {{{cartao_resource_alterar_estagio_notes}}}
   * @param id {{{cartao_resource_alterar_estagio_param_id}}}
   * @param update {{{cartao_resource_alterar_estagio_param_id_estagio_cartao}}}
   * @param authorization Authorization
   * @return CartaoResponse
   */
  public CartaoResponse alterarEstagioUsingPOST(Long id, EstagioCartaoUpdate update, String authorization) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarEstagioUsingPOST");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling alterarEstagioUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/alterar-estagio".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<CartaoResponse> returnType = new GenericType<CartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_alterar_status_impressao}}}
   * {{{cartao_resource_alterar_status_impressao_notes}}}
   * @param id {{{cartao_resource_alterar_status_impressao_param_id}}}
   * @param idStatusImpressao {{{cartao_resource_alterar_status_impressao_param_id_status_impressao}}}
   * @param authorization Authorization
   * @return HistoricoImpressaoCartaoResponse
   */
  public HistoricoImpressaoCartaoResponse alterarStatusImpressaoUsingPUT(Long id, Long idStatusImpressao, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarStatusImpressaoUsingPUT");
     }
     
     // verify the required parameter 'idStatusImpressao' is set
     if (idStatusImpressao == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatusImpressao' when calling alterarStatusImpressaoUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/alterar-status-impressao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_status_impressao", idStatusImpressao));
    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<HistoricoImpressaoCartaoResponse> returnType = new GenericType<HistoricoImpressaoCartaoResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_atribuir_pessoa}}}
   * {{{cartao_resource_atribuir_pessoa_notes}}}
   * @param id {{{cartao_resource_atribuir_pessoa_param_id_cartao}}}
   * @param idPessoa {{{cartao_resource_atribuir_pessoa_param_id_pessoa}}}
   * @param authorization Authorization
   * @return CartaoResponse
   */
  public CartaoResponse atribuirPessoaUsingPUT(Long id, Long idPessoa, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atribuirPessoaUsingPUT");
     }
     
     // verify the required parameter 'idPessoa' is set
     if (idPessoa == null) {
        throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling atribuirPessoaUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/atribuir-titular".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_pessoa", idPessoa));
    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<CartaoResponse> returnType = new GenericType<CartaoResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_bloquear}}}
   * {{{cartao_resource_bloquear_notes}}}
   * @param id {{{cartao_resource_bloquear_param_id}}}
   * @param idStatus {{{cartao_resource_bloquear_param_id_status}}}
   * @param observacao {{{cartao_resource_bloquear_param_observacao}}}
   * @param authorization Authorization
   * @return CartaoResponse
   */
  public CartaoResponse bloquearUsingPOST(Long id, Long idStatus, String observacao, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling bloquearUsingPOST");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling bloquearUsingPOST");
     }
     
     // verify the required parameter 'observacao' is set
     if (observacao == null) {
        throw new ApiException(400, "Missing the required parameter 'observacao' when calling bloquearUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/bloquear".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_status", idStatus));
    
    queryParams.addAll(apiClient.parameterToPairs("", "observacao", observacao));
    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<CartaoResponse> returnType = new GenericType<CartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_cadastrar_alterar_senha}}}
   * {{{cartao_resource_cadastrar_alterar_senha_notes}}}
   * @param id {{{cartao_resource_cadastrar_alterar_senha_param_id}}}
   * @param senha {{{cartao_resource_cadastrar_alterar_senha_param_nova_senha}}}
   * @param authorization Authorization
   * @return String
   */
  public String cadastrarAlterarSenhaUsingPOST(Long id, String senha, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrarAlterarSenhaUsingPOST");
     }
     
     // verify the required parameter 'senha' is set
     if (senha == null) {
        throw new ApiException(400, "Missing the required parameter 'senha' when calling cadastrarAlterarSenhaUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/cadastrar-senha".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    if (senha != null)
      headerParams.put("senha", apiClient.parameterToString(senha));
    

    

    final String[] accepts = {
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
   * {{{cartao_resource_cancelar}}}
   * {{{cartao_resource_cancelar_notes}}}
   * @param id {{{cartao_resource_cancelar_param_id}}}
   * @param idStatus {{{cartao_resource_cancelar_param_id_status}}}
   * @param observacao {{{cartao_resource_cancelar_param_observacao}}}
   * @param authorization Authorization
   * @return CartaoResponse
   */
  public CartaoResponse cancelarUsingPOST(Long id, Long idStatus, String observacao, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarUsingPOST");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling cancelarUsingPOST");
     }
     
     // verify the required parameter 'observacao' is set
     if (observacao == null) {
        throw new ApiException(400, "Missing the required parameter 'observacao' when calling cancelarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/cancelar".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_status", idStatus));
    
    queryParams.addAll(apiClient.parameterToPairs("", "observacao", observacao));
    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<CartaoResponse> returnType = new GenericType<CartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_consultar_cartao_impressao}}}
   * {{{cartao_resource_consultar_cartao_impressao_notes}}}
   * @param id {{{cartao_resource_consultar_cartao_impressao_param_id}}}
   * @param authorization Authorization
   * @return DadosCartaoImpressaoResponse
   */
  public DadosCartaoImpressaoResponse consultarCartaoImpressaoUsingGET(Long id, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarCartaoImpressaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/consultar-dados-impressao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<DadosCartaoImpressaoResponse> returnType = new GenericType<DadosCartaoImpressaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_consultar_dados_reais_cartao}}}
   * {{{cartao_resource_consultar_dados_reais_cartao_notes}}}
   * @param id id
   * @param authorization Authorization
   * @return DadosCartaoResponse
   */
  public DadosCartaoResponse consultarDadosReaisCartaoUsingGET(Long id, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarDadosReaisCartaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/consultar-dados-reais".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<DadosCartaoResponse> returnType = new GenericType<DadosCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_consultar_limite_disponibilidade}}}
   * {{{cartao_resource_consultar_limite_disponibilidade_notes}}}
   * @param id {{{cartao_resource_consultar_limite_disponibilidade_param_id}}}
   * @param authorization Authorization
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse consultarLimiteDisponibilidadeUsingGET(Long id, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLimiteDisponibilidadeUsingGET");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/limites-disponibilidades".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<LimiteDisponibilidadeResponse> returnType = new GenericType<LimiteDisponibilidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_consultar_lotes_cartoes_pre_pagos}}}
   * {{{cartao_resource_consultar_lotes_cartoes_pre_pagos_notes}}}
   * @param id {{{cartao_resource_consultar_lotes_cartoes_pre_pagos_param_id_lote}}}
   * @param authorization Authorization
   * @return LoteCartoesPrePagosResponse
   */
  public LoteCartoesPrePagosResponse consultarLotesCartoesPrePagosUsingGET(Long id, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLotesCartoesPrePagosUsingGET");
     }
     
    // create path and map variables
    String path = "/api/cartoes/lotes-cartoes-pre-pagos/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<LoteCartoesPrePagosResponse> returnType = new GenericType<LoteCartoesPrePagosResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_consultar_portador}}}
   * {{{cartao_resource_consultar_portador_notes}}}
   * @param id {{{cartao_resource_consultar_portador_param_id}}}
   * @param authorization Authorization
   * @return PortadorResponse
   */
  public PortadorResponse consultarPortadorUsingGET(Long id, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarPortadorUsingGET");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/portadores".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PortadorResponse> returnType = new GenericType<PortadorResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_consultar}}}
   * {{{cartao_resource_consultar_notes}}}
   * @param id {{{cartao_resource_consultar_param_id}}}
   * @param authorization Authorization
   * @return CartaoDetalheResponse
   */
  public CartaoDetalheResponse consultarUsingGET10(Long id, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET10");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<CartaoDetalheResponse> returnType = new GenericType<CartaoDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_desbloquear_senha_incorreta}}}
   * {{{cartao_resource_desbloquear_senha_incorreta_notes}}}
   * @param id {{{cartao_resource_desbloquear_senha_incorreta_param_id}}}
   * @param authorization Authorization
   * @return CartaoResponse
   */
  public CartaoResponse desbloquearSenhaIncorretaUsingPOST(Long id, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desbloquearSenhaIncorretaUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/desbloquear-senha-incorreta".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<CartaoResponse> returnType = new GenericType<CartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_desbloquear}}}
   * {{{cartao_resource_desbloquear_notes}}}
   * @param id {{{cartao_resource_desbloquear_param_id}}}
   * @param authorization Authorization
   * @return CartaoResponse
   */
  public CartaoResponse desbloquearUsingPOST(Long id, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desbloquearUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/desbloquear".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<CartaoResponse> returnType = new GenericType<CartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_gerar_lotes_cartoes_pre_pagos}}}
   * {{{cartao_resource_gerar_lotes_cartoes_pre_pagos_notes}}}
   * @param authorization Authorization
   * @param idOrigemComercial {{{lote_cartoes_pre_pagos_persist_id_origem_comercial_value}}}
   * @param idProduto {{{lote_cartoes_pre_pagos_persist_id_produto_value}}}
   * @param idTipoCartao {{{lote_cartoes_pre_pagos_persist_id_tipo_cartao_value}}}
   * @param idImagem {{{lote_cartoes_pre_pagos_persist_id_imagem_value}}}
   * @param idEndereco {{{lote_cartoes_pre_pagos_persist_id_endereco_value}}}
   * @param quantidadeCartoes {{{lote_cartoes_pre_pagos_persist_quantidade_cartoes_value}}}
   * @param identificadorExterno {{{lote_cartoes_pre_pagos_persist_identificador_externo_value}}}
   * @return LoteCartoesPrePagosResponse
   */
  public LoteCartoesPrePagosResponse gerarLotesCartoesPrePagosUsingPOST(String authorization, Long idOrigemComercial, Long idProduto, Long idTipoCartao, Long idImagem, Long idEndereco, Integer quantidadeCartoes, String identificadorExterno) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/cartoes/lotes-cartoes-pre-pagos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoCartao", idTipoCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idImagem", idImagem));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEndereco", idEndereco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "quantidadeCartoes", quantidadeCartoes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "identificadorExterno", identificadorExterno));
    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<LoteCartoesPrePagosResponse> returnType = new GenericType<LoteCartoesPrePagosResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_gerar_nova_via_multiplo}}}
   * {{{cartao_resource_gerar_nova_via_multiplo_notes}}}
   * @param id {{{cartao_resource_gerar_nova_via_param_id_cartao}}}
   * @param authorization Authorization
   * @return CartaoMultiAppImpressaoResponse
   */
  public CartaoMultiAppImpressaoResponse gerarNovaViaCartaoMultiAppUsingPOST(Long id, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarNovaViaCartaoMultiAppUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/gerar-nova-via-multiplo".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<CartaoMultiAppImpressaoResponse> returnType = new GenericType<CartaoMultiAppImpressaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_gerar_nova_via}}}
   * {{{cartao_resource_gerar_nova_via_notes}}}
   * @param id {{{cartao_resource_gerar_nova_via_param_id_cartao}}}
   * @param authorization Authorization
   * @return CartaoResponse
   */
  public CartaoResponse gerarNovaViaUsingPOST(Long id, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarNovaViaUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/gerar-nova-via".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<CartaoResponse> returnType = new GenericType<CartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_lancar_tarifa_segunda_via}}}
   * {{{cartao_resource_lancar_tarifa_segunda_via_notes}}}
   * @param id {{{cartao_resource_lancar_tarifa_segunda_via_param_id}}}
   * @param authorization Authorization
   * @return Object
   */
  public Object lancarTarifaSegundaViaUsingPOST(Long id, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling lancarTarifaSegundaViaUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/lancar-tarifa-reemissao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
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
   * {{{cartao_resource_listar_lotes_cartoes_pre_pagos}}}
   * {{{cartao_resource_listar_lotes_cartoes_pre_pagos_notes}}}
   * @param authorization Authorization
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idOrigemComercial {{{lote_cartoes_pre_pagos_request_id_origem_comercial_value}}}
   * @param idProduto {{{lote_cartoes_pre_pagos_request_id_produto_value}}}
   * @param idTipoCartao {{{lote_cartoes_pre_pagos_request_id_tipo_cartao_value}}}
   * @param idImagem {{{lote_cartoes_pre_pagos_request_id_imagem_value}}}
   * @param idEndereco {{{lote_cartoes_pre_pagos_request_id_endereco_value}}}
   * @param quantidadeCartoes {{{lote_cartoes_pre_pagos_request_quantidade_cartoes_value}}}
   * @param dataCadastro {{{lote_cartoes_pre_pagos_request_data_cadastro_value}}}
   * @param usuarioCadastro {{{lote_cartoes_pre_pagos_request_usuario_cadastro_value}}}
   * @param statusProcessamento {{{lote_cartoes_pre_pagos_request_status_processamento_value}}}
   * @param identificadorExterno {{{lote_cartoes_pre_pagos_request_identificador_externo_value}}}
   * @return PageLoteCartoesPrePagosResponse
   */
  public PageLoteCartoesPrePagosResponse listarLotesCartoesPrePagosUsingGET(String authorization, List<String> sort, Integer page, Integer limit, Long idOrigemComercial, Long idProduto, Long idTipoCartao, Long idImagem, Long idEndereco, Integer quantidadeCartoes, String dataCadastro, String usuarioCadastro, Integer statusProcessamento, String identificadorExterno) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/cartoes/lotes-cartoes-pre-pagos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoCartao", idTipoCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idImagem", idImagem));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEndereco", idEndereco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "quantidadeCartoes", quantidadeCartoes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "usuarioCadastro", usuarioCadastro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "statusProcessamento", statusProcessamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "identificadorExterno", identificadorExterno));
    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageLoteCartoesPrePagosResponse> returnType = new GenericType<PageLoteCartoesPrePagosResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_listar}}}
   * {{{cartao_resource_listar_notes}}}
   * @param authorization Authorization
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idStatusCartao {{{cartao_request_id_status_cartao_value}}}
   * @param idEstagioCartao {{{cartao_request_id_estagio_cartao_value}}}
   * @param idConta {{{cartao_request_id_conta_value}}}
   * @param idPessoa {{{cartao_request_id_pessoa_value}}}
   * @param idProduto {{{cartao_request_id_produto_value}}}
   * @param tipoPortador {{{cartao_request_tipo_portador_value}}}
   * @param numeroCartao {{{cartao_request_numero_cartao_value}}}
   * @param nomeImpresso {{{cartao_request_nome_impresso_value}}}
   * @param dataGeracao {{{cartao_request_data_geracao_value}}}
   * @param dataStatusCartao {{{cartao_request_data_status_cartao_value}}}
   * @param dataEstagioCartao {{{cartao_request_data_estagio_cartao_value}}}
   * @param dataValidade {{{cartao_request_data_validade_value}}}
   * @param dataImpressao {{{cartao_request_data_impressao_value}}}
   * @param arquivoImpressao {{{cartao_request_arquivo_impressao_value}}}
   * @param flagImpressaoOrigemComercial {{{cartao_request_flag_impressao_origem_comercial_value}}}
   * @param flagProvisorio {{{cartao_request_flag_provisorio_value}}}
   * @param codigoDesbloqueio {{{cartao_request_codigo_desbloqueio_value}}}
   * @param sequencialCartao {{{cartao_request_sequencial_cartao_value}}}
   * @return PageCartaoResponse
   */
  public PageCartaoResponse listarUsingGET11(String authorization, List<String> sort, Integer page, Integer limit, Long idStatusCartao, Long idEstagioCartao, Long idConta, Long idPessoa, Long idProduto, String tipoPortador, String numeroCartao, String nomeImpresso, String dataGeracao, String dataStatusCartao, String dataEstagioCartao, String dataValidade, String dataImpressao, String arquivoImpressao, Integer flagImpressaoOrigemComercial, Integer flagProvisorio, String codigoDesbloqueio, Integer sequencialCartao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/cartoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idStatusCartao", idStatusCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstagioCartao", idEstagioCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoPortador", tipoPortador));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroCartao", numeroCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeImpresso", nomeImpresso));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataGeracao", dataGeracao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataStatusCartao", dataStatusCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataEstagioCartao", dataEstagioCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataValidade", dataValidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataImpressao", dataImpressao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "arquivoImpressao", arquivoImpressao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagImpressaoOrigemComercial", flagImpressaoOrigemComercial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagProvisorio", flagProvisorio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigoDesbloqueio", codigoDesbloqueio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sequencialCartao", sequencialCartao));
    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageCartaoResponse> returnType = new GenericType<PageCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_reativar}}}
   * {{{cartao_resource_reativar_notes}}}
   * @param id {{{cartao_resource_reativar_param_id}}}
   * @param authorization Authorization
   * @return CartaoResponse
   */
  public CartaoResponse reativarUsingPOST(Long id, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling reativarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/reativar".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<CartaoResponse> returnType = new GenericType<CartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_validar_c_v_v}}}
   * {{{cartao_resource_validar_c_v_v_notes}}}
   * @param id {{{cartao_resource_validar_c_v_v_param_id}}}
   * @param validaCVV validaCVV
   * @param authorization Authorization
   * @return String
   */
  public String validarCVVUsingPOST(Long id, ValidaCVVRequest validaCVV, String authorization) throws ApiException {
    Object postBody = validaCVV;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling validarCVVUsingPOST");
     }
     
     // verify the required parameter 'validaCVV' is set
     if (validaCVV == null) {
        throw new ApiException(400, "Missing the required parameter 'validaCVV' when calling validarCVVUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/validar-cvv".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
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
   * {{{cartao_resource_validar_dados_impressos_bandeirado}}}
   * {{{cartao_resource_validar_dados_impressos_bandeirado_notes}}}
   * @param numeroCartao {{{cartao_resource_validar_dados_impressos_bandeirado_param_numero_cartao}}}
   * @param nomePortador {{{cartao_resource_validar_dados_impressos_bandeirado_param_nome_portador}}}
   * @param dataValidade {{{cartao_resource_validar_dados_impressos_bandeirado_param_data_validade}}}
   * @param codigoSeguranca {{{cartao_resource_validar_dados_impressos_bandeirado_param_codigo_seguranca}}}
   * @param authorization Authorization
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse validarDadosImpressosBandeiradoUsingGET(String numeroCartao, String nomePortador, String dataValidade, String codigoSeguranca, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'numeroCartao' is set
     if (numeroCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarDadosImpressosBandeiradoUsingGET");
     }
     
     // verify the required parameter 'nomePortador' is set
     if (nomePortador == null) {
        throw new ApiException(400, "Missing the required parameter 'nomePortador' when calling validarDadosImpressosBandeiradoUsingGET");
     }
     
     // verify the required parameter 'dataValidade' is set
     if (dataValidade == null) {
        throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling validarDadosImpressosBandeiradoUsingGET");
     }
     
     // verify the required parameter 'codigoSeguranca' is set
     if (codigoSeguranca == null) {
        throw new ApiException(400, "Missing the required parameter 'codigoSeguranca' when calling validarDadosImpressosBandeiradoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/cartoes/validar-dados-impressos-bandeirados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome_portador", nomePortador));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data_validade", dataValidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigo_seguranca", codigoSeguranca));
    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ValidaCartaoResponse> returnType = new GenericType<ValidaCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_validar_dados_impressos_nao_bandeirado}}}
   * {{{cartao_resource_validar_dados_impressos_nao_bandeirado_notes}}}
   * @param numeroCartao {{{cartao_resource_validar_dados_impressos_nao_bandeirado_param_numero_cartao}}}
   * @param nomePortador {{{cartao_resource_validar_dados_impressos_nao_bandeirado_param_nome_portador}}}
   * @param dataValidade {{{cartao_resource_validar_dados_impressos_nao_bandeirado_param_data_validade}}}
   * @param codigoSeguranca {{{cartao_resource_validar_dados_impressos_nao_bandeirado_param_codigo_seguranca}}}
   * @param authorization Authorization
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse validarDadosImpressosNaoBandeiradoUsingGET(String numeroCartao, String nomePortador, String dataValidade, String codigoSeguranca, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'numeroCartao' is set
     if (numeroCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarDadosImpressosNaoBandeiradoUsingGET");
     }
     
     // verify the required parameter 'nomePortador' is set
     if (nomePortador == null) {
        throw new ApiException(400, "Missing the required parameter 'nomePortador' when calling validarDadosImpressosNaoBandeiradoUsingGET");
     }
     
     // verify the required parameter 'dataValidade' is set
     if (dataValidade == null) {
        throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling validarDadosImpressosNaoBandeiradoUsingGET");
     }
     
     // verify the required parameter 'codigoSeguranca' is set
     if (codigoSeguranca == null) {
        throw new ApiException(400, "Missing the required parameter 'codigoSeguranca' when calling validarDadosImpressosNaoBandeiradoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/cartoes/validar-dados-impressos-nao-bandeirados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome_portador", nomePortador));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data_validade", dataValidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigo_seguranca", codigoSeguranca));
    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ValidaCartaoResponse> returnType = new GenericType<ValidaCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_validar_de55_cartao_mastercard}}}
   * {{{cartao_resource_validar_de55_cartao_mastercard_notes}}}
   * @param numeroCartao {{{cartao_resource_validar_de55_cartao_mastercard_param_numero_cartao}}}
   * @param criptograma {{{cartao_resource_validar_de55_cartao_mastercard_param_criptograma}}}
   * @param authorization Authorization
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse validarDe55CartaoMastercardUsingGET(String numeroCartao, String criptograma, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'numeroCartao' is set
     if (numeroCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarDe55CartaoMastercardUsingGET");
     }
     
     // verify the required parameter 'criptograma' is set
     if (criptograma == null) {
        throw new ApiException(400, "Missing the required parameter 'criptograma' when calling validarDe55CartaoMastercardUsingGET");
     }
     
    // create path and map variables
    String path = "/api/cartoes/validar-de55-mastercard".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "criptograma", criptograma));
    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ValidaCartaoResponse> returnType = new GenericType<ValidaCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_validar_senha}}}
   * {{{cartao_resource_validar_senha_notes}}}
   * @param id {{{cartao_resource_validar_senha_param_id}}}
   * @param senha {{{cartao_resource_validar_senha_param_senha}}}
   * @param authorization Authorization
   * @return ValidaSenhaCartaoResponse
   */
  public ValidaSenhaCartaoResponse validarSenhaUsingGET(Long id, String senha, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling validarSenhaUsingGET");
     }
     
     // verify the required parameter 'senha' is set
     if (senha == null) {
        throw new ApiException(400, "Missing the required parameter 'senha' when calling validarSenhaUsingGET");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/validar-senha".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    if (senha != null)
      headerParams.put("senha", apiClient.parameterToString(senha));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ValidaSenhaCartaoResponse> returnType = new GenericType<ValidaSenhaCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{cartao_resource_validar_tarja}}}
   * {{{cartao_resource_validar_tarja_notes}}}
   * @param numeroCartao {{{cartao_resource_validar_tarja_param_numero_cartao}}}
   * @param trilha1 {{{cartao_resource_validar_tarja_param_trilha1}}}
   * @param trilha2 {{{cartao_resource_validar_tarja_param_trilha2}}}
   * @param authorization Authorization
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse validarTarjaUsingGET(String numeroCartao, String trilha1, String trilha2, String authorization) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'numeroCartao' is set
     if (numeroCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarTarjaUsingGET");
     }
     
     // verify the required parameter 'trilha1' is set
     if (trilha1 == null) {
        throw new ApiException(400, "Missing the required parameter 'trilha1' when calling validarTarjaUsingGET");
     }
     
     // verify the required parameter 'trilha2' is set
     if (trilha2 == null) {
        throw new ApiException(400, "Missing the required parameter 'trilha2' when calling validarTarjaUsingGET");
     }
     
    // create path and map variables
    String path = "/api/cartoes/validar-tarja".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "trilha1", trilha1));
    
    queryParams.addAll(apiClient.parameterToPairs("", "trilha2", trilha2));
    

    if (authorization != null)
      headerParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ValidaCartaoResponse> returnType = new GenericType<ValidaCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

