package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.ContaBancariaPortadorUpdate;
import br.com.conductor.pier.api.v2.model.ContaBancariaPortadorResponse;
import br.com.conductor.pier.api.v2.model.TaxaJurosContaUpdate;
import br.com.conductor.pier.api.v2.model.TaxaJurosContaResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaCreditoContaBancariaResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaBancariaResponse;
import br.com.conductor.pier.api.v2.model.PageContaBancariaPortadorResponse;
import br.com.conductor.pier.api.v2.model.PageTransferenciaCreditoContaBancariaResponse;
import br.com.conductor.pier.api.v2.model.PageTransferenciaBancariaResponse;
import br.com.conductor.pier.api.v2.model.ContaBancariaPortadorPersist;
import br.com.conductor.pier.api.v2.model.TaxaTaxaJurosConta;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoTransferenciaCreditoContaBancariaRequest;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoTransferenciaCreditoContaBancariaResponse;
import br.com.conductor.pier.api.v2.model.TransferenciaCreditoContaBancariaPersist;
import br.com.conductor.pier.api.v2.model.TransferenciaBancariaPersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransferenciaBancariaApi {
  private ApiClient apiClient;

  public TransferenciaBancariaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TransferenciaBancariaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Atualiza conta banc\u00E1ria portador
   * Esse recurso permite atualizar uma conta banc\u00E1ria do portador
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta banc\u00E1ria do portador (id)
   * @param update update
   * @return ContaBancariaPortadorResponse
   */
  public ContaBancariaPortadorResponse atualizar(Long id, ContaBancariaPortadorUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizar");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling atualizar");
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
   * Realiza a atualiza\u00E7\u00E3o de novas taxas de juros de uma determinada conta para o recurso de transfer\u00EAncia de cr\u00E9dito
   * Realiza a atualiza\u00E7\u00E3o de novas taxas de juros de uma determinada conta para o recurso de transfer\u00EAncia de cr\u00E9dito
   * @param id Id Conta
   * @param update update
   * @return TaxaJurosContaResponse
   */
  public TaxaJurosContaResponse atualizarTaxasJurosContas(Long id, TaxaJurosContaUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarTaxasJurosContas");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling atualizarTaxasJurosContas");
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
   * Realizar o cancelamento de uma transfer\u00EAncia banc\u00E1ria do cart\u00E3o para contas banc\u00E1rias que esteja pendente de confirma\u00E7\u00E3o
   * Este recurso tem como objetivo permitir o canelamento de uma transfer\u00EAncia de cr\u00E9dito entre contas
   * @param idTransferencia Id Transfer\u00EAncia
   * @return String
   */
  public String cancelarTransferenciaCreditoContaBancaria(Long idTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idTransferencia' is set
     if (idTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling cancelarTransferenciaCreditoContaBancaria");
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
   * Realizar a confirma\u00E7\u00E3o de uma transfer\u00EAncia banc\u00E1ria do cart\u00E3o para contas banc\u00E1rias que esteja pendente de confirma\u00E7\u00E3o
   * Este recurso tem como objetivo permitir a confirma\u00E7\u00E3o da transfer\u00EAncia de cr\u00E9dito entre contas
   * @param idTransferencia Id Transfer\u00EAncia
   * @return String
   */
  public String confirmarTransferenciaCreditoContaBancaria(Long idTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idTransferencia' is set
     if (idTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling confirmarTransferenciaCreditoContaBancaria");
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
   * Consulta conta banc\u00E1ria portador
   * Esse recurso permite consultar uma conta banc\u00E1ria do portador a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta banc\u00E1ria (id)
   * @return ContaBancariaPortadorResponse
   */
  public ContaBancariaPortadorResponse consultar(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
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
   * Realiza a consulta das taxas de juros de uma determinada conta para o recurso de transfer\u00EAncia de cr\u00E9dito
   * Realiza a consulta das taxas de juros de uma determinada conta para o recurso de transfer\u00EAncia de cr\u00E9dito
   * @param id Id Conta
   * @param numeroMesesCarencia numeroMesesCarencia
   * @return TaxaJurosContaResponse
   */
  public TaxaJurosContaResponse consultarTaxasJurosContas(Long id, Integer numeroMesesCarencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxasJurosContas");
     }
     
     // verify the required parameter 'numeroMesesCarencia' is set
     if (numeroMesesCarencia == null) {
        throw new ApiException(400, "Missing the required parameter 'numeroMesesCarencia' when calling consultarTaxasJurosContas");
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
   * Realiza a consulta de uma transfer\u00EAncia banc\u00E1ria de cr\u00E9dito entre contas banc\u00E1rias de um portador
   * Recurso utilizado para recuperar uma transfer\u00EAncia de cr\u00E9dito entre contas banc\u00E1ria de um portador, utiliza o ID da transfer\u00EAncia banc\u00E1riae o idConta para realizar a consulta
   * @param idTransferencia Id Transfer\u00EAncia
   * @return TransferenciaCreditoContaBancariaResponse
   */
  public TransferenciaCreditoContaBancariaResponse consultarTransferenciaBancaria(Long idTransferencia) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idTransferencia' is set
     if (idTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling consultarTransferenciaBancaria");
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
   * Consultar uma transfer\u00EAncia banc\u00E1ria para um banco
   * Este recurso permite consultar os detalhes de uma determinada transfer\u00EAncia de cr\u00E9dito realizada para uma conta banc\u00E1ria. De modo geral, esta opera\u00E7\u00E3o poder\u00E1 ser utilizada para uma consulta simples destes detalhes ou para realizar a montagem de um comprovante de 2\u00AA via de transfer\u00EAncia entre contas
   * @param id Id Conta
   * @param idTransferencia Id Transfer\u00EAncia
   * @param idContaBancariaDestino C\u00F3digo de identifica\u00E7\u00E3o da conta banc\u00E1ria de destino (id)
   * @return TransferenciaBancariaResponse
   */
  public TransferenciaBancariaResponse consultar_0(Long id, Long idTransferencia, Long idContaBancariaDestino) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_0");
     }
     
     // verify the required parameter 'idTransferencia' is set
     if (idTransferencia == null) {
        throw new ApiException(400, "Missing the required parameter 'idTransferencia' when calling consultar_0");
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
   * Lista contas banc\u00E1rias portador
   * Esse recurso permite listar contas banc\u00E1rias do portador
   * @param idConta C\u00F3digo identificador da conta cart\u00E3o
   * @param nomeAgencia Descri\u00E7\u00E3o da ag\u00EAncia
   * @param banco C\u00F3digo do banco
   * @param numeroAgencia N\u00FAmero da ag\u00EAncia
   * @param numeroConta N\u00FAmero da conta
   * @param flagAtivo Indica se a conta banc\u00E1ria est\u00E1 ativa
   * @param flagContaOrigemDoc Sinaliza se origem \u00E9 DOC (1: DOC, 0: TED)
   * @param idPessoaFisica C\u00F3digo da pessoa
   * @param favorecido Nome do favorecido
   * @param numeroReceiraFederal Documento do favorecido
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageContaBancariaPortadorResponse
   */
  public PageContaBancariaPortadorResponse listar(Long idConta, String nomeAgencia, Long banco, String numeroAgencia, String numeroConta, Integer flagAtivo, Integer flagContaOrigemDoc, Long idPessoaFisica, String favorecido, String numeroReceiraFederal, List<String> sort, Integer page, Integer limit) throws ApiException {
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
   * Realiza a listagem das transfer\u00EAncias banc\u00E1rias de cr\u00E9dito entre contas banc\u00E1rias
   * Recurso utilizado para listar as transfer\u00EAncia de cr\u00E9dito entre contas banc\u00E1ria de um portador solicitadas
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da Conta
   * @param dataSolicitacaoInicial Data inicial da solicita\u00E7\u00E3o de transfer\u00EAncia
   * @param dataSolicitacaoFinal Data final da solicita\u00E7\u00E3o de transfer\u00EAncia
   * @param status C\u00F3digo do status do processamento
   * @return PageTransferenciaCreditoContaBancariaResponse
   */
  public PageTransferenciaCreditoContaBancariaResponse listarTransferenciaBancaria(List<String> sort, Integer page, Integer limit, Long idConta, String dataSolicitacaoInicial, String dataSolicitacaoFinal, Integer status) throws ApiException {
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
   * Listar as transfer\u00EAncias banc\u00E1rias realizadas
   * Este recurso tem como objetivo permitir que o portador de um Cart\u00E3o possa consultar uma lista das Transfer\u00EAncias Banc\u00E1rias para os Favorecidos cadastrados
   * @param id Id Conta
   * @param idContaBancariaDestino C\u00F3digo de identifica\u00E7\u00E3o da conta banc\u00E1ria de destino (id)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageTransferenciaBancariaResponse
   */
  public PageTransferenciaBancariaResponse listar_0(Long id, Long idContaBancariaDestino, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listar_0");
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
   * Cadastra uma conta banc\u00E1ria do portador
   * Esse recurso permite cadastrar contas banc\u00E1rias do portador
   * @param persist persist
   * @return ContaBancariaPortadorResponse
   */
  public ContaBancariaPortadorResponse salvar(ContaBancariaPortadorPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvar");
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
   * Realiza o cadastro de novas taxas de juros de uma determinada conta para o recurso de transfer\u00EAncia de cr\u00E9dito
   * Realiza o cadastro de novas taxas de juros de uma determinada conta para o recurso de transfer\u00EAncia de cr\u00E9dito
   * @param id Id Conta
   * @param persist persist
   * @return TaxaJurosContaResponse
   */
  public TaxaJurosContaResponse salvarTaxasJurosContas(Long id, TaxaTaxaJurosConta persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvarTaxasJurosContas");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarTaxasJurosContas");
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
   * Realiza a simula\u00E7\u00E3o dos planos de parcelamentos para uma transfer\u00EAncia banc\u00E1ria de cr\u00E9dito entre contas banc\u00E1rias
   * Realiza a simula\u00E7\u00E3o dos planos de parcelamentos para uma transfer\u00EAncia banc\u00E1ria de cr\u00E9dito entre contas banc\u00E1rias
   * @param request request
   * @return PlanoParcelamentoTransferenciaCreditoContaBancariaResponse
   */
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse simularTransferenciaBancaria(PlanoParcelamentoTransferenciaCreditoContaBancariaRequest request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling simularTransferenciaBancaria");
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
   * Realizar transfer\u00EAncia banc\u00E1ria do cart\u00E3o para contas banc\u00E1rias
   * Este recurso tem como objetivo permitir que o portador de um cart\u00E3o possa realizar a transfer\u00EAncia de cr\u00E9dito para uma conta banc\u00E1ria. Assim, o valor do cr\u00E9dito somado a tarifa para transfer\u00EAncia, quando praticada pelo emissor, ser\u00E1 debitado da conta de origem, se houver saldo suficiente, e ser\u00E1 creditado na conta banc\u00E1ria de destino
   * @param persist persist
   * @return TransferenciaCreditoContaBancariaResponse
   */
  public TransferenciaCreditoContaBancariaResponse transferenciaCreditoContaBancaria(TransferenciaCreditoContaBancariaPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling transferenciaCreditoContaBancaria");
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
   * Realizar transfer\u00EAncia banc\u00E1ria do cart\u00E3o para contas banc\u00E1rias
   * Este recurso tem como objetivo permitir que o portador de um cart\u00E3o possa realizar a transfer\u00EAncia de cr\u00E9dito para uma conta banc\u00E1ria. Assim, o valor do cr\u00E9dito somado a tarifa para transfer\u00EAncia, quando praticada pelo emissor, ser\u00E1 debitado da conta de origem, se houver saldo suficiente, e ser\u00E1 creditado na conta banc\u00E1ria de destino
   * @param id Id Conta
   * @param transferenciaBancariaPersist transferenciaBancariaPersist
   * @return TransferenciaBancariaResponse
   */
  public TransferenciaBancariaResponse transferir(Long id, TransferenciaBancariaPersist transferenciaBancariaPersist) throws ApiException {
    Object postBody = transferenciaBancariaPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling transferir");
     }
     
     // verify the required parameter 'transferenciaBancariaPersist' is set
     if (transferenciaBancariaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'transferenciaBancariaPersist' when calling transferir");
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
