package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.EstagioCartaoResponse;
import br.com.conductor.pier.api.v2.model.StatusCartaoResponse;
import br.com.conductor.pier.api.v2.model.StatusContaResponse;
import br.com.conductor.pier.api.v2.model.StatusImpressaoResponse;
import br.com.conductor.pier.api.v2.model.PageEstagioCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageStatusCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageStatusContaResponse;
import br.com.conductor.pier.api.v2.model.PageStatusImpressaoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagstatusparametroApi {
  private ApiClient apiClient;

  public GlobaltagstatusparametroApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagstatusparametroApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{estagio_cartao_resource_consultar_estagio_cartao}}}
   * {{{estagio_cartao_resource_consultar_estagio_cartao_notes}}}
   * @param id {{{estagio_cartao_resource_consultar_estagio_cartao_param_id}}}
   * @return EstagioCartaoResponse
   */
  public EstagioCartaoResponse consultarEstagioCartaoUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarEstagioCartaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/estagios-cartoes/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<EstagioCartaoResponse> returnType = new GenericType<EstagioCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{status_cartao_resource_consultar_status_cartao}}}
   * {{{status_cartao_resource_consultar_status_cartao_notes}}}
   * @param id {{{status_cartao_resource_consultar_status_cartao_param_id}}}
   * @return StatusCartaoResponse
   */
  public StatusCartaoResponse consultarStatusCartaoUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarStatusCartaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/status-cartoes/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<StatusCartaoResponse> returnType = new GenericType<StatusCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{status_conta_resource_consultar}}}
   * {{{status_conta_resource_consultar_notes}}}
   * @param id {{{status_conta_resource_consultar_param_id}}}
   * @return StatusContaResponse
   */
  public StatusContaResponse consultarUsingGET32(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET32");
     }
     
    // create path and map variables
    String path = "/api/status-contas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<StatusContaResponse> returnType = new GenericType<StatusContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{status_impressao_resource_consultar}}}
   * {{{status_impressao_resource_consultar_notes}}}
   * @param id {{{status_impressao_resource_consultar_param_id}}}
   * @return StatusImpressaoResponse
   */
  public StatusImpressaoResponse consultarUsingGET33(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET33");
     }
     
    // create path and map variables
    String path = "/api/status-impressoes/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<StatusImpressaoResponse> returnType = new GenericType<StatusImpressaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{estagio_cartao_resource_listar_estagios_cartoes}}}
   * {{{estagio_cartao_resource_listar_estagios_cartoes_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{estagio_cartao_request_id_value}}}
   * @param nome {{{estagio_cartao_request_nome_value}}}
   * @return PageEstagioCartaoResponse
   */
  public PageEstagioCartaoResponse listarEstagiosCartoesUsingGET(List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/estagios-cartoes".replaceAll("\\{format\\}","json");

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

    
    GenericType<PageEstagioCartaoResponse> returnType = new GenericType<PageEstagioCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{status_cartao_resource_listar_status_cartoes}}}
   * {{{status_cartao_resource_listar_status_cartoes_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{status_cartao_request_id_value}}}
   * @param nome {{{status_cartao_request_nome_value}}}
   * @param permiteDesbloquear {{{status_cartao_request_permite_desbloquear_value}}}
   * @param permiteAtribuirComoBloqueio {{{status_cartao_request_permite_atribuir_como_bloqueio_value}}}
   * @param permiteAtribuirComoCancelamento {{{status_cartao_request_permite_atribuir_como_cancelamento_value}}}
   * @param cobrarTarifaAoEmitirNovaVia {{{status_cartao_request_cobrar_tarifa_ao_emitir_nova_via_value}}}
   * @return PageStatusCartaoResponse
   */
  public PageStatusCartaoResponse listarStatusCartoesUsingGET(List<String> sort, Integer page, Integer limit, Long id, String nome, Integer permiteDesbloquear, Integer permiteAtribuirComoBloqueio, Integer permiteAtribuirComoCancelamento, Integer cobrarTarifaAoEmitirNovaVia) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/status-cartoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteDesbloquear", permiteDesbloquear));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteAtribuirComoBloqueio", permiteAtribuirComoBloqueio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteAtribuirComoCancelamento", permiteAtribuirComoCancelamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cobrarTarifaAoEmitirNovaVia", cobrarTarifaAoEmitirNovaVia));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageStatusCartaoResponse> returnType = new GenericType<PageStatusCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{status_conta_resource_listar}}}
   * {{{status_conta_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{status_conta_request_id_value}}}
   * @param nome {{{status_conta_request_nome_value}}}
   * @param permiteAlterarVencimento {{{status_conta_request_permite_alterar_vencimento_value}}}
   * @param permiteAlterarLimite {{{status_conta_request_permite_alterar_limite_value}}}
   * @param permiteEmitirNovaViaCartao {{{status_conta_request_permite_emitir_nova_via_cartao_value}}}
   * @param permiteFazerTransferencia {{{status_conta_request_permite_fazer_transferencia_value}}}
   * @param permiteReceberTransferencia {{{status_conta_request_permite_receber_transferencia_value}}}
   * @param permiteCriarAcordoCobranca {{{status_conta_request_permite_criar_acordo_cobranca_value}}}
   * @param permiteAtribuirComoBloqueio {{{status_conta_request_permite_atribuir_como_bloqueio_value}}}
   * @param permiteDesbloquear {{{status_conta_request_permite_desbloquear_value}}}
   * @param permiteAtribuirComoCancelamento {{{status_conta_request_permite_atribuir_como_cancelamento_value}}}
   * @return PageStatusContaResponse
   */
  public PageStatusContaResponse listarUsingGET41(List<String> sort, Integer page, Integer limit, Long id, String nome, Integer permiteAlterarVencimento, Integer permiteAlterarLimite, Integer permiteEmitirNovaViaCartao, Integer permiteFazerTransferencia, Integer permiteReceberTransferencia, Integer permiteCriarAcordoCobranca, Integer permiteAtribuirComoBloqueio, Integer permiteDesbloquear, Integer permiteAtribuirComoCancelamento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/status-contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteAlterarVencimento", permiteAlterarVencimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteAlterarLimite", permiteAlterarLimite));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteEmitirNovaViaCartao", permiteEmitirNovaViaCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteFazerTransferencia", permiteFazerTransferencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteReceberTransferencia", permiteReceberTransferencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteCriarAcordoCobranca", permiteCriarAcordoCobranca));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteAtribuirComoBloqueio", permiteAtribuirComoBloqueio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteDesbloquear", permiteDesbloquear));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteAtribuirComoCancelamento", permiteAtribuirComoCancelamento));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageStatusContaResponse> returnType = new GenericType<PageStatusContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{status_impressao_resource_listar}}}
   * {{{status_impressao_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{status_impressao_request_id_value}}}
   * @param nome {{{status_impressao_request_nome_value}}}
   * @return PageStatusImpressaoResponse
   */
  public PageStatusImpressaoResponse listarUsingGET42(List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/status-impressoes".replaceAll("\\{format\\}","json");

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

    
    GenericType<PageStatusImpressaoResponse> returnType = new GenericType<PageStatusImpressaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
