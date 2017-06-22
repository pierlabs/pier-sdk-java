package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.AntecipacaoResponse;
import br.com.conductor.pier.api.v2.model.PageCompraResponse;
import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class CompraApi {
  private ApiClient apiClient;

  public CompraApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CompraApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Faz a efetiva\u00C3\u00A7\u00C3\u00A3o da antecipa\u00C3\u00A7\u00C3\u00A3o
   * Metodo responsavel pela efetiva\u00C3\u00A7\u00C3\u00A3o da antecipa\u00C3\u00A7\u00C3\u00A3o.
   * @param idConta C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do evento.
   * @param quantidadeParcelas Quantidade de parcelas para serem antecipadas.
   * @return AntecipacaoResponse
   */
  public AntecipacaoResponse efetivarAntecipacaoUsingPOST(Long idConta, Long id, Long quantidadeParcelas) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling efetivarAntecipacaoUsingPOST");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling efetivarAntecipacaoUsingPOST");
     }
     
     // verify the required parameter 'quantidadeParcelas' is set
     if (quantidadeParcelas == null) {
        throw new ApiException(400, "Missing the required parameter 'quantidadeParcelas' when calling efetivarAntecipacaoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/compras/{id}/efetivar-antecipacao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
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

    
    GenericType<AntecipacaoResponse> returnType = new GenericType<AntecipacaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar compras
   * Lista as compras de uma conta.
   * @param idConta C\u00C3\u00B3digo identificador da conta da Compra.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idCompra C\u00C3\u00B3digo identificador da Compra.
   * @param parcelada Indica se a compra \u00C3\u00A9 parcelada.
   * @param juros Indica se a compra \u00C3\u00A9 com ou sem juros.
   * @param tipoOrigemTransacao Indica se a compra \u00C3\u00A9 ON-US ou OFF-US
   * @return PageCompraResponse
   */
  public PageCompraResponse listarUsingGET6(Long idConta, Integer page, Integer limit, Long idCompra, Boolean parcelada, Boolean juros, String tipoOrigemTransacao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling listarUsingGET6");
     }
     
    // create path and map variables
    String path = "/api/compras".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idCompra", idCompra));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "parcelada", parcelada));
    
    queryParams.addAll(apiClient.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoOrigemTransacao", tipoOrigemTransacao));
    

    

    

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

    
    GenericType<PageCompraResponse> returnType = new GenericType<PageCompraResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Simular antecipa\u00C3\u00A7\u00C3\u00A3o de parcelas
   * Simula a antecipa\u00C3\u00A7\u00C3\u00A3o de parcelas de um evento, listando todos os planos de parcelamento dispon\u00C3\u00ADveis.
   * @param idConta C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do evento.
   * @return AntecipacaoSimuladaResponse
   */
  public AntecipacaoSimuladaResponse simularAntecipacaoUsingGET(Long idConta, Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling simularAntecipacaoUsingGET");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling simularAntecipacaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/compras/{id}/simular-antecipacao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    

    

    

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

    
    GenericType<AntecipacaoSimuladaResponse> returnType = new GenericType<AntecipacaoSimuladaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

