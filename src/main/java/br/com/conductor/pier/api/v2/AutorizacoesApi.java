package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.TransacaoOnUsResponse;
import br.com.conductor.pier.api.v2.model.CancelamentoTransacaoOnUsRequest;
import br.com.conductor.pier.api.v2.model.AutorizacaoOnUsRequest;
import br.com.conductor.pier.api.v2.model.DesfazimentoTransacaoOnURequest;
import br.com.conductor.pier.api.v2.model.TransacaoOnUsRequest;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class AutorizacoesApi {
  private ApiClient apiClient;

  public AutorizacoesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AutorizacoesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Cancela Transa\u00C3\u00A7\u00C3\u00A3o financeira
   * Este m\u00C3\u00A9todo permite que seja cancelada uma transa\u00C3\u00A7\u00C3\u00A3o.
   * @param cancelamentoRequest cancelamentoRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse cancelarUsingPOST(CancelamentoTransacaoOnUsRequest cancelamentoRequest) throws ApiException {
    Object postBody = cancelamentoRequest;
    
     // verify the required parameter 'cancelamentoRequest' is set
     if (cancelamentoRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'cancelamentoRequest' when calling cancelarUsingPOST");
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

    String[] authNames = new String[] {"client_id",  };

    
    GenericType<TransacaoOnUsResponse> returnType = new GenericType<TransacaoOnUsResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Autoriza transa\u00C3\u00A7\u00C3\u00A3o financeira
   * Este m\u00C3\u00A9todo faz uma autoriza\u00C3\u00A7\u00C3\u00A3o de transa\u00C3\u00A7\u00C3\u00A3o financeira.
   * @param autorizacaoOnUsRequest autorizacaoOnUsRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse desfazerUsingPOST(AutorizacaoOnUsRequest autorizacaoOnUsRequest) throws ApiException {
    Object postBody = autorizacaoOnUsRequest;
    
     // verify the required parameter 'autorizacaoOnUsRequest' is set
     if (autorizacaoOnUsRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'autorizacaoOnUsRequest' when calling desfazerUsingPOST");
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

    String[] authNames = new String[] {"client_id",  };

    
    GenericType<TransacaoOnUsResponse> returnType = new GenericType<TransacaoOnUsResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Desfazimento de Transa\u00C3\u00A7\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite que seja desfeita uma transa\u00C3\u00A7\u00C3\u00A3o.
   * @param desfazimentoRequest desfazimentoRequest
   * @return TransacaoOnUsResponse
   */
  public TransacaoOnUsResponse desfazerUsingPOST1(DesfazimentoTransacaoOnURequest desfazimentoRequest) throws ApiException {
    Object postBody = desfazimentoRequest;
    
     // verify the required parameter 'desfazimentoRequest' is set
     if (desfazimentoRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'desfazimentoRequest' when calling desfazerUsingPOST1");
     }
     
    // create path and map variables
    String path = "/api/desfazer-transacao".replaceAll("\\{format\\}","json");

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

    String[] authNames = new String[] {"client_id",  };

    
    GenericType<TransacaoOnUsResponse> returnType = new GenericType<TransacaoOnUsResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Simula Compra Parcelada
   * Este m\u00C3\u00A9todo permite que seja simulada uma compra parcelada.
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

    String[] authNames = new String[] {"client_id",  };

    
    GenericType<TransacaoOnUsResponse> returnType = new GenericType<TransacaoOnUsResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

