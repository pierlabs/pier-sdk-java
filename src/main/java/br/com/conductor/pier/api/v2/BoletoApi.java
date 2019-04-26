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
import br.com.conductor.pier.api.v2.model.PageStatusBoletoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BoletoApi {
  private ApiClient apiClient;

  public BoletoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BoletoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Busca um boleto pelo seu identificador
   * Este servi\u00E7o busca um boleto pelo seu identificador
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Cobranca (id)
   * @param zeraValorCodigoBarras Indica se deve zerar o campo de valor do c\u00F3digo de barras
   * @return BoletoResponse
   */
  public BoletoResponse consultar(Long id, Boolean zeraValorCodigoBarras) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
     }
     
    // create path and map variables
    String path = "/api/boletos/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "zeraValorCodigoBarras", zeraValorCodigoBarras));
    

    

    

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
   * Envia um boleto por E-mail
   * Este servi\u00E7o envia um boleto por E-mail
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Cobranca (id)
   * @param request request
   * @return Object
   */
  public Object enviarBoletoEmail(Long id, BoletoEmailRequest request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling enviarBoletoEmail");
     }
     
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling enviarBoletoEmail");
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
   * Gera um tipo de boleto
   * Este recurso gera um tipo de boleto
   * @param boletoRequest boletoRequest
   * @return BoletoResponse
   */
  public BoletoResponse gerarBoleto(BoletoRequest boletoRequest) throws ApiException {
    Object postBody = boletoRequest;
    
     // verify the required parameter 'boletoRequest' is set
     if (boletoRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'boletoRequest' when calling gerarBoleto");
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
   * Lista os boletos especificados
   * Este servi\u00E7o lista os boletos especificados
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idConta Id da Conta
   * @param dataVencimento Data de vencimento
   * @param valorBoleto Valor do boleto
   * @param idTipoBoleto Tipo de boleto
   * @param nossoNumero Nosso n\u00FAmero
   * @param idEventoPagamento Id do evento de pagamento
   * @param statusParcela Status da parcela
   * @return PageBoletoListarResponse
   */
  public PageBoletoListarResponse listar(List<String> sort, Integer page, Integer limit, Long idConta, String dataVencimento, BigDecimal valorBoleto, Long idTipoBoleto, Long nossoNumero, Integer idEventoPagamento, Integer statusParcela) throws ApiException {
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
    
    queryParams.addAll(apiClient.parameterToPairs("", "nossoNumero", nossoNumero));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEventoPagamento", idEventoPagamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "statusParcela", statusParcela));
    

    

    

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
   * Listar hist\u00F3rico de status do boleto
   * Lista todos os status que um determinado boleto passou
   * @param id C\u00F3digo Identificador do boleto
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageStatusBoletoResponse
   */
  public PageStatusBoletoResponse listarHistoricoStatusBoleto(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoStatusBoleto");
     }
     
    // create path and map variables
    String path = "/api/boletos/{id}/historicos".replaceAll("\\{format\\}","json")
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

    
    GenericType<PageStatusBoletoResponse> returnType = new GenericType<PageStatusBoletoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Registra uma cobranca na entidade banco relacionada a cobranca informado
   * Este recurso registra uma cobranca emitido
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Cobranca (id)
   * @return BoletoResponse
   */
  public BoletoResponse registrarBoleto(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling registrarBoleto");
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
   * Gera um pdf do boleto
   * Este servi\u00E7o gera um pdf do boleto
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Cobranca (id)
   * @return Object
   */
  public Object visualizarBoleto(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling visualizarBoleto");
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
