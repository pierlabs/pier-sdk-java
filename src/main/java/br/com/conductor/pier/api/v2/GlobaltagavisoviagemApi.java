package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.AvisoViagemResponse;
import br.com.conductor.pier.api.v2.model.PageAvisoViagemResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class GlobaltagavisoviagemApi {
  private ApiClient apiClient;

  public GlobaltagavisoviagemApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagavisoviagemApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{aviso_viagem_resource_consultar}}}
   * {{{aviso_viagem_resource_consultar_notes}}}
   * @param id {{{aviso_viagem_resource_consultar_param_id}}}
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse consultarUsingGET6(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET6");
     }
     
    // create path and map variables
    String path = "/api/avisos-viagens/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<AvisoViagemResponse> returnType = new GenericType<AvisoViagemResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{aviso_viagem_resource_desabilitar}}}
   * {{{aviso_viagem_resource_desabilitar_notes}}}
   * @param id {{{aviso_viagem_resource_desabilitar_param_id}}}
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse desabilitarUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desabilitarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/avisos-viagens/{id}/desabilitar".replaceAll("\\{format\\}","json")
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

    
    GenericType<AvisoViagemResponse> returnType = new GenericType<AvisoViagemResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{aviso_viagem_resource_habilitar}}}
   * {{{aviso_viagem_resource_habilitar_notes}}}
   * @param id {{{aviso_viagem_resource_habilitar_param_id}}}
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse habilitarUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling habilitarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/avisos-viagens/{id}/habilitar".replaceAll("\\{format\\}","json")
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

    
    GenericType<AvisoViagemResponse> returnType = new GenericType<AvisoViagemResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{aviso_viagem_resource_listar}}}
   * {{{aviso_viagem_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idCartao {{{aviso_viagem_request_id_cartao_value}}}
   * @param codigoPais {{{aviso_viagem_request_codigo_pais_value}}}
   * @param dataInicio {{{aviso_viagem_request_data_inicio_value}}}
   * @param dataFim {{{aviso_viagem_request_data_fim_value}}}
   * @param flagAtivo {{{aviso_viagem_request_flag_ativo_value}}}
   * @return PageAvisoViagemResponse
   */
  public PageAvisoViagemResponse listarUsingGET8(List<String> sort, Integer page, Integer limit, Long idCartao, String codigoPais, String dataInicio, String dataFim, Integer flagAtivo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/avisos-viagens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigoPais", codigoPais));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataInicio", dataInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataFim", dataFim));
    
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

    
    GenericType<PageAvisoViagemResponse> returnType = new GenericType<PageAvisoViagemResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{aviso_viagem_resource_salvar}}}
   * {{{aviso_viagem_resource_salvar_notes}}}
   * @param idCartao {{{aviso_viagem_persist_id_cartao_value}}}
   * @param codigoPais {{{aviso_viagem_persist_codigo_pais_value}}}
   * @param dataInicio {{{aviso_viagem_persist_data_inicio_value}}}
   * @param dataFim {{{aviso_viagem_persist_data_fim_value}}}
   * @return AvisoViagemResponse
   */
  public AvisoViagemResponse salvarUsingPOST3(Long idCartao, String codigoPais, String dataInicio, String dataFim) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idCartao' is set
     if (idCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idCartao' when calling salvarUsingPOST3");
     }
     
     // verify the required parameter 'codigoPais' is set
     if (codigoPais == null) {
        throw new ApiException(400, "Missing the required parameter 'codigoPais' when calling salvarUsingPOST3");
     }
     
     // verify the required parameter 'dataInicio' is set
     if (dataInicio == null) {
        throw new ApiException(400, "Missing the required parameter 'dataInicio' when calling salvarUsingPOST3");
     }
     
     // verify the required parameter 'dataFim' is set
     if (dataFim == null) {
        throw new ApiException(400, "Missing the required parameter 'dataFim' when calling salvarUsingPOST3");
     }
     
    // create path and map variables
    String path = "/api/avisos-viagens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigoPais", codigoPais));
    
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

    
    GenericType<AvisoViagemResponse> returnType = new GenericType<AvisoViagemResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

