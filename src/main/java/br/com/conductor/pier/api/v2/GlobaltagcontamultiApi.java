package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.VinculoCartoesResponse;
import br.com.conductor.pier.api.v2.model.CartaoMultiAppPersistValue;
import br.com.conductor.pier.api.v2.model.ContaMultiAppResponse;
import br.com.conductor.pier.api.v2.model.ContaMultiAppPersistValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagcontamultiApi {
  private ApiClient apiClient;

  public GlobaltagcontamultiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagcontamultiApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{conta_resource_cadastrar_cartao_multiapp}}}
   * {{{conta_resource_cadastrar_cartao_multiapp_notes}}}
   * @param cartaoMultiAppPersist cartaoMultiAppPersist
   * @return VinculoCartoesResponse
   */
  public VinculoCartoesResponse criarCartoesMultiAppUsingPOST(CartaoMultiAppPersistValue cartaoMultiAppPersist) throws ApiException {
    Object postBody = cartaoMultiAppPersist;
    
     // verify the required parameter 'cartaoMultiAppPersist' is set
     if (cartaoMultiAppPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'cartaoMultiAppPersist' when calling criarCartoesMultiAppUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/cartoes/gerar-cartoes-multiapp".replaceAll("\\{format\\}","json");

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

    
    GenericType<VinculoCartoesResponse> returnType = new GenericType<VinculoCartoesResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{conta_resource_cadastrar_conta_multiapp}}}
   * {{{conta_resource_cadastrar_conta_multiapp_notes}}}
   * @param contaMultiAppPersist contaMultiAppPersist
   * @return ContaMultiAppResponse
   */
  public ContaMultiAppResponse criarContasMultiAppUsingPOST(ContaMultiAppPersistValue contaMultiAppPersist) throws ApiException {
    Object postBody = contaMultiAppPersist;
    
     // verify the required parameter 'contaMultiAppPersist' is set
     if (contaMultiAppPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'contaMultiAppPersist' when calling criarContasMultiAppUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/contas/cadastrar-conta-multiapp".replaceAll("\\{format\\}","json");

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

    
    GenericType<ContaMultiAppResponse> returnType = new GenericType<ContaMultiAppResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
