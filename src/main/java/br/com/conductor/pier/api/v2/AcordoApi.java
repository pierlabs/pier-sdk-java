package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.AcordoDetalheResponse;
import br.com.conductor.pier.api.v2.model.ParcelaAcordoResponse;
import br.com.conductor.pier.api.v2.model.BoletoParcelaAcordoResponse;
import br.com.conductor.pier.api.v2.model.PageAcordoResponse;
import br.com.conductor.pier.api.v2.model.PageAcordoParcelaResponse;
import br.com.conductor.pier.api.v2.model.AcordoQuebraResponse;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoAcordoResponse;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoAcordoRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AcordoApi {
  private ApiClient apiClient;

  public AcordoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AcordoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Consulta os dados de um determinado acordo
   * Este m\u00E9todo permite consultar dados de um determinado acordo a partir de seu codigo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do acordo (id)
   * @return AcordoDetalheResponse
   */
  public AcordoDetalheResponse consultar(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
     }
     
    // create path and map variables
    String path = "/api/acordos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<AcordoDetalheResponse> returnType = new GenericType<AcordoDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta uma parcela do acordo
   * Consulta uma parcela do acordo
   * @param id Identificador da parcela
   * @return ParcelaAcordoResponse
   */
  public ParcelaAcordoResponse consultarPorId(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarPorId");
     }
     
    // create path and map variables
    String path = "/api/parcelas-acordos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ParcelaAcordoResponse> returnType = new GenericType<ParcelaAcordoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Gerar boleto da parcela do acordo
   * Este recurso permite a gera\u00E7\u00E3o do boleto de uma parcela de um acordo
   * @param id Identificador da parcela
   * @return BoletoParcelaAcordoResponse
   */
  public BoletoParcelaAcordoResponse gerarBoleto(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarBoleto");
     }
     
    // create path and map variables
    String path = "/api/parcelas-acordos/{id}/boletos".replaceAll("\\{format\\}","json")
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

    
    GenericType<BoletoParcelaAcordoResponse> returnType = new GenericType<BoletoParcelaAcordoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os acordos existentes na base
   * Este m\u00E9todo permite que sejam listados todos os acordos existentes na base do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idConta C\u00F3digo Identificador da conta na base (id)
   * @param statusAcordo Status do acordo na base
   * @param dataAcordo Data do acordo
   * @param quantidadeParcelas Quantidade de parcelas
   * @return PageAcordoResponse
   */
  public PageAcordoResponse listar(List<String> sort, Integer page, Integer limit, Long idConta, Long statusAcordo, String dataAcordo, Integer quantidadeParcelas) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/acordos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "statusAcordo", statusAcordo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAcordo", dataAcordo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "quantidadeParcelas", quantidadeParcelas));
    

    

    

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

    
    GenericType<PageAcordoResponse> returnType = new GenericType<PageAcordoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar parcelas do acordo
   * Este recurso permite a listagem paginada das parcelas do acordo, podendo filtrar pelos atributos: id do acordo, nosso n\u00FAmero e n\u00FAmero da parcela
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idAcordo Identificador do acordo
   * @param nossoNumero Nosso n\u00FAmero do boleto
   * @param numeroParcela N\u00FAmero da parcela
   * @param dataVencimento Data vencimento da parcela do acordo
   * @return PageAcordoParcelaResponse
   */
  public PageAcordoParcelaResponse listar_0(List<String> sort, Integer page, Integer limit, Long idAcordo, String nossoNumero, Integer numeroParcela, String dataVencimento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/parcelas-acordos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idAcordo", idAcordo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nossoNumero", nossoNumero));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroParcela", numeroParcela));
    
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

    
    GenericType<PageAcordoParcelaResponse> returnType = new GenericType<PageAcordoParcelaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Quebra o acordo pelo id informado
   * Este m\u00E9todo permite que um acordo seja quebrado a partir de um id de acordo informado
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do acordo
   * @return AcordoQuebraResponse
   */
  public AcordoQuebraResponse quebrarAcordo(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling quebrarAcordo");
     }
     
    // create path and map variables
    String path = "/api/acordos/{id}/quebrar".replaceAll("\\{format\\}","json")
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

    
    GenericType<AcordoQuebraResponse> returnType = new GenericType<AcordoQuebraResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza simula\u00E7\u00F5es de planos de parcelamento para acordos
   * Este recurso que permite realizar a simula\u00E7\u00E3o de planos de parcelamentos para abertura de acordos
   * @param request request
   * @return PlanoParcelamentoAcordoResponse
   */
  public PlanoParcelamentoAcordoResponse simularPlanosParcelamentos(PlanoParcelamentoAcordoRequest request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling simularPlanosParcelamentos");
     }
     
    // create path and map variables
    String path = "/api/acordos/planos-parcelamentos".replaceAll("\\{format\\}","json");

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

    
    GenericType<PlanoParcelamentoAcordoResponse> returnType = new GenericType<PlanoParcelamentoAcordoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
