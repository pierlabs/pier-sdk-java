package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.PageSMSEnvioResponse;
import br.com.conductor.pier.api.v2.model.PageSMSContaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoServicoSMSResponse;
import br.com.conductor.pier.api.v2.model.SMSContaPersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class SMSApi {
  private ApiClient apiClient;

  public SMSApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SMSApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Desativa um servi\u00E7o SMS da conta
   * Esse recurso permite desativar um servi\u00E7o SMS ativado de uma conta.
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do Servi\u00E7o SMS Conta
   * @param idServicoSMSConta idServicoSMSConta
   * @return Object
   */
  public Object desativarServicoSMSParaConta(Long id, Long idServicoSMSConta) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarServicoSMSParaConta");
     }
     
     // verify the required parameter 'idServicoSMSConta' is set
     if (idServicoSMSConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idServicoSMSConta' when calling desativarServicoSMSParaConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/servicos-sms/{idServicoSMSConta}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idServicoSMSConta" + "\\}", apiClient.escapeString(idServicoSMSConta.toString()));

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
   * Listar SMS
   * Esse recurso permite listar os SMS de uma determinada conta
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataInicio Data in\u00EDcio do per\u00EDodo da consulta
   * @param dataFim Data fim do per\u00EDodo da consulta
   * @return PageSMSEnvioResponse
   */
  public PageSMSEnvioResponse listarSMS1(Long idConta, List<String> sort, Integer page, Integer limit, String dataInicio, String dataFim) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling listarSMS1");
     }
     
    // create path and map variables
    String path = "/api/sms".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
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

    
    GenericType<PageSMSEnvioResponse> returnType = new GenericType<PageSMSEnvioResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os servi\u00E7os SMS da conta
   * Esse recurso permite listar servi\u00E7os SMS de uma determinada conta
   * @param id id
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idSMSTipoServico C\u00F3digo Identificador do tipo de Servi\u00E7o SMS (Id_SMSTipoServico)
   * @param flagAtivo Se o par\u00E2metro for verdadeiro o recurso s\u00F3 retornar\u00E1 os servi\u00E7os ativos para a conta requisitada. Caso seja falso, retornar\u00E1 os servi\u00E7os inativos. Se o par\u00E2metro for nulo, retornar\u00E1 servi\u00E7os ativos e inativos
   * @return PageSMSContaResponse
   */
  public PageSMSContaResponse listarServicosSMSPorConta(Long id, List<String> sort, Integer page, Integer limit, Long idSMSTipoServico, Boolean flagAtivo) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarServicosSMSPorConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/servicos-sms".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idSMSTipoServico", idSMSTipoServico));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageSMSContaResponse> returnType = new GenericType<PageSMSContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Tipos de Servi\u00E7os SMS
   * Esse recurso permite listar os Tipos de Servi\u00E7os SMS
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageTipoServicoSMSResponse
   */
  public PageTipoServicoSMSResponse listarTiposServicosSMS(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-servicos-sms".replaceAll("\\{format\\}","json");

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

    
    GenericType<PageTipoServicoSMSResponse> returnType = new GenericType<PageTipoServicoSMSResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Salva um Servi\u00E7o SMS para uma conta.
   * Esse recurso permite salvar um servi\u00E7o SMS para uma conta.
   * @param id id
   * @param smsContaPersist smsContaPersist
   * @return Object
   */
  public Object salvarServicoSMSParaConta(Long id, SMSContaPersist smsContaPersist) throws ApiException {
    Object postBody = smsContaPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvarServicoSMSParaConta");
     }
     
     // verify the required parameter 'smsContaPersist' is set
     if (smsContaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'smsContaPersist' when calling salvarServicoSMSParaConta");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/servicos-sms".replaceAll("\\{format\\}","json")
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
  
}
