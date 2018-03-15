package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.TransacaoOnUsResponse;
import br.com.conductor.pier.api.v2.model.TransacaoOnUsPorIdCartaoRequest;
import br.com.conductor.pier.api.v2.model.AutorizacaoOnUsRequest;
import br.com.conductor.pier.api.v2.model.CancelamentoTransacaoPorIdCartaoRequest;
import br.com.conductor.pier.api.v2.model.CancelamentoTransacaoOnUsRequest;
import br.com.conductor.pier.api.v2.model.TransacaoOnUsRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AutorizacaoApi {
  private ApiClient apiClient;

  public AutorizacaoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AutorizacaoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Autoriza transa\u00E7\u00E3o financeira por idConta
   * Este m\u00E9todo faz uma autoriza\u00E7\u00E3o de transa\u00E7\u00E3o financeira com o idConta.
   * @param id Id Conta
   * @param transacaoOnUsPorIdCartaoRequest transacaoOnUsPorIdCartaoRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse autorizarPorContaUsingPOST(Long id, TransacaoOnUsPorIdCartaoRequest transacaoOnUsPorIdCartaoRequest) throws ApiException {
    Object postBody = transacaoOnUsPorIdCartaoRequest;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling autorizarPorContaUsingPOST");
     }
     
     // verify the required parameter 'transacaoOnUsPorIdCartaoRequest' is set
     if (transacaoOnUsPorIdCartaoRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'transacaoOnUsPorIdCartaoRequest' when calling autorizarPorContaUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/autorizar-transacao".replaceAll("\\{format\\}","json")
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

    
    GenericType<TransacaoOnUsResponse> returnType = new GenericType<TransacaoOnUsResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Autoriza transa\u00E7\u00E3o financeira
   * Este m\u00E9todo faz uma autoriza\u00E7\u00E3o de transa\u00E7\u00E3o financeira.
   * @param autorizacaoOnUsRequest autorizacaoOnUsRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse autorizarUsingPOST(AutorizacaoOnUsRequest autorizacaoOnUsRequest) throws ApiException {
    Object postBody = autorizacaoOnUsRequest;
    
     // verify the required parameter 'autorizacaoOnUsRequest' is set
     if (autorizacaoOnUsRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'autorizacaoOnUsRequest' when calling autorizarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/autorizar-transacao".replaceAll("\\{format\\}","json");

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

    
    GenericType<TransacaoOnUsResponse> returnType = new GenericType<TransacaoOnUsResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Autoriza transa\u00E7\u00E3o financeira por idCartao
   * Este m\u00E9todo faz uma autoriza\u00E7\u00E3o de transa\u00E7\u00E3o financeira com o idCartao.
   * @param id Id Cartao
   * @param transacaoOnUsPorIdCartaoRequest transacaoOnUsPorIdCartaoRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse autorizarUsingPOST1(Long id, TransacaoOnUsPorIdCartaoRequest transacaoOnUsPorIdCartaoRequest) throws ApiException {
    Object postBody = transacaoOnUsPorIdCartaoRequest;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling autorizarUsingPOST1");
     }
     
     // verify the required parameter 'transacaoOnUsPorIdCartaoRequest' is set
     if (transacaoOnUsPorIdCartaoRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'transacaoOnUsPorIdCartaoRequest' when calling autorizarUsingPOST1");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/autorizar-transacao".replaceAll("\\{format\\}","json")
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

    
    GenericType<TransacaoOnUsResponse> returnType = new GenericType<TransacaoOnUsResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cancela transa\u00E7\u00E3o financeira por idConta
   * Este m\u00E9todo permite que seja cancelada uma transa\u00E7\u00E3o a partir do idConta.
   * @param id Id Conta
   * @param cancelamentoRequest cancelamentoRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse cancelarPorIdContaUsingPOST(Long id, CancelamentoTransacaoPorIdCartaoRequest cancelamentoRequest) throws ApiException {
    Object postBody = cancelamentoRequest;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarPorIdContaUsingPOST");
     }
     
     // verify the required parameter 'cancelamentoRequest' is set
     if (cancelamentoRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'cancelamentoRequest' when calling cancelarPorIdContaUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/cancelar-transacao".replaceAll("\\{format\\}","json")
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

    
    GenericType<TransacaoOnUsResponse> returnType = new GenericType<TransacaoOnUsResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cancela transa\u00E7\u00E3o financeira
   * Este m\u00E9todo permite que seja cancelada uma transa\u00E7\u00E3o.
   * @param cancelamentoRequest cancelamentoRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse cancelarUsingPOST2(CancelamentoTransacaoOnUsRequest cancelamentoRequest) throws ApiException {
    Object postBody = cancelamentoRequest;
    
     // verify the required parameter 'cancelamentoRequest' is set
     if (cancelamentoRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'cancelamentoRequest' when calling cancelarUsingPOST2");
     }
     
    // create path and map variables
    String path = "/api/cancelar-transacao".replaceAll("\\{format\\}","json");

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

    
    GenericType<TransacaoOnUsResponse> returnType = new GenericType<TransacaoOnUsResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cancela transa\u00E7\u00E3o financeira por idCartao
   * Este m\u00E9todo permite que seja cancelada uma transa\u00E7\u00E3o a partir do idCartao.
   * @param id Id Cartao
   * @param cancelamentoRequest cancelamentoRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse cancelarUsingPOST3(Long id, CancelamentoTransacaoPorIdCartaoRequest cancelamentoRequest) throws ApiException {
    Object postBody = cancelamentoRequest;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarUsingPOST3");
     }
     
     // verify the required parameter 'cancelamentoRequest' is set
     if (cancelamentoRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'cancelamentoRequest' when calling cancelarUsingPOST3");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/cancelar-transacao".replaceAll("\\{format\\}","json")
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

    
    GenericType<TransacaoOnUsResponse> returnType = new GenericType<TransacaoOnUsResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Retorna c\u00F3digos de processamento de autoriza\u00E7\u00E3o
   * Este m\u00E9todo retorna a lista dos c\u00F3digos de processamento para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es financeiras.
   * @return List<Object>
   */
  public List<Object> listarCodigosProcessamentoAutorizacaoUsingGET() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/consultar-codigos-processamento-autorizacao".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Object>> returnType = new GenericType<List<Object>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Simula planos de transa\u00E7\u00F5es
   * Este m\u00E9todo permite que seja simulada um plano de transa\u00E7\u00F5es.
   * @param transacoesRequest transacoesRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse simularUsingPOST(TransacaoOnUsRequest transacoesRequest) throws ApiException {
    Object postBody = transacoesRequest;
    
     // verify the required parameter 'transacoesRequest' is set
     if (transacoesRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'transacoesRequest' when calling simularUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/simular-transacao".replaceAll("\\{format\\}","json");

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

    
    GenericType<TransacaoOnUsResponse> returnType = new GenericType<TransacaoOnUsResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
