package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.BoletoResponse;
import br.com.conductor.pier.api.v2.model.BoletoEmailRequest;
import br.com.conductor.pier.api.v2.model.BoletoRequest;
import br.com.conductor.pier.api.v2.model.PageBoletoListarResponse;
import java.math.BigDecimal;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class GlobaltagboletoApi {
  private ApiClient apiClient;

  public GlobaltagboletoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagboletoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{boleto_resource_consultar}}}
   * {{{boleto_resource_consultar_notes}}}
   * @param id {{{boleto_resource_consultar_param_id}}}
   * @return BoletoResponse
   */
  public BoletoResponse consultarUsingGET34(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET34");
     }
     
    // create path and map variables
    String path = "/api/boletos/{id}".replaceAll("\\{format\\}","json")
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
   * {{{boleto_resource_enviar_boleto_email}}}
   * {{{boleto_resource_enviar_boleto_email_notes}}}
   * @param id {{{boleto_resource_enviar_boleto_param_id}}}
   * @param request request
   * @return Object
   */
  public Object enviarBoletoEmailUsingPOST(Long id, BoletoEmailRequest request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling enviarBoletoEmailUsingPOST");
     }
     
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling enviarBoletoEmailUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/boletos/{id}/enviar-email".replaceAll("\\{format\\}","json")
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
   * {{{boleto_resource_gerar_boleto}}}
   * {{{boleto_resource_gerar_boleto_notes}}}
   * @param boletoRequest boletoRequest
   * @return BoletoResponse
   */
  public BoletoResponse gerarBoletoUsingPOST(BoletoRequest boletoRequest) throws ApiException {
    Object postBody = boletoRequest;
    
     // verify the required parameter 'boletoRequest' is set
     if (boletoRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'boletoRequest' when calling gerarBoletoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/boletos".replaceAll("\\{format\\}","json");

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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{boleto_resource_listar}}}
   * {{{boleto_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idConta {{{boleto_listar_request_id_conta_value}}}
   * @param dataVencimento {{{boleto_listar_request_data_vencimento_value}}}
   * @param valorBoleto {{{boleto_listar_request_valor_value}}}
   * @param idTipoBoleto {{{boleto_listar_request_id_tipo_boleto_value}}}
   * @return PageBoletoListarResponse
   */
  public PageBoletoListarResponse listarUsingGET45(List<String> sort, Integer page, Integer limit, Long idConta, String dataVencimento, BigDecimal valorBoleto, Long idTipoBoleto) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/boletos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataVencimento", dataVencimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valorBoleto", valorBoleto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoBoleto", idTipoBoleto));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageBoletoListarResponse> returnType = new GenericType<PageBoletoListarResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{registro_cobranca_resource_registrar_boleto}}}
   * {{{registro_cobranca_resource_registrar_boleto_notes}}}
   * @param id {{{registro_cobranca_resource_registrar_boleto_param_id_boleto}}}
   * @return BoletoResponse
   */
  public BoletoResponse registrarBoletoUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling registrarBoletoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/boletos/{id}/registrar".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{boleto_resource_visualizar_boleto}}}
   * {{{boleto_resource_visualizar_boleto_notes}}}
   * @param id {{{boleto_resource_visualizar_boleto_param_id}}}
   * @return Object
   */
  public Object visualizarBoletoUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling visualizarBoletoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/boletos/{id}/arquivo.pdf".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/pdf"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

