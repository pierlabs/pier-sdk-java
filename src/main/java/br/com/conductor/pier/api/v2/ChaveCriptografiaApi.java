package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.ChaveCriptografiaResponse;
import br.com.conductor.pier.api.v2.model.ChaveCriptografiaRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ChaveCriptografiaApi {
  private ApiClient apiClient;

  public ChaveCriptografiaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChaveCriptografiaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Recurso para consultar a chave de criptografia AES.
   * O recurso retorna a chave AES criptografada com a chave p\u00FAblica do emissor relacionado ao token da requisi\u00E7\u00E3o.
   * @return ChaveCriptografiaResponse
   */
  public ChaveCriptografiaResponse consultarChaveCriptografia() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/criptografia/chave".replaceAll("\\{format\\}","json");

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

    
    GenericType<ChaveCriptografiaResponse> returnType = new GenericType<ChaveCriptografiaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Descriptografa o conteudo recebido
   * Este m\u00E9todo realiza a descriptografia de conteudos no padr\u00E3o BouncyCastle
   * @param chaveCriptografiaRequest chaveCriptografiaRequest
   * @return ChaveCriptografiaResponse
   */
  public ChaveCriptografiaResponse descriptografarChave(ChaveCriptografiaRequest chaveCriptografiaRequest) throws ApiException {
    Object postBody = chaveCriptografiaRequest;
    
     // verify the required parameter 'chaveCriptografiaRequest' is set
     if (chaveCriptografiaRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'chaveCriptografiaRequest' when calling descriptografarChave");
     }
     
    // create path and map variables
    String path = "/api/chaves-criptografia/descriptografar".replaceAll("\\{format\\}","json");

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

    
    GenericType<ChaveCriptografiaResponse> returnType = new GenericType<ChaveCriptografiaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
