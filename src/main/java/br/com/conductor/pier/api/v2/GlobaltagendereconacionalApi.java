package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.EnderecoResponseValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagendereconacionalApi {
  private ApiClient apiClient;

  public GlobaltagendereconacionalApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagendereconacionalApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{c_e_p_endereco_resource_consultar_endereco}}}
   * {{{c_e_p_endereco_resource_consultar_endereco_notes}}}
   * @param CEP CEP
   * @return EnderecoResponseValue
   */
  public EnderecoResponseValue consultarEnderecoUsingGET(String CEP) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'CEP' is set
     if (CEP == null) {
        throw new ApiException(400, "Missing the required parameter 'CEP' when calling consultarEnderecoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/ceps".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "CEP", CEP));
    

    

    

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

    
    GenericType<EnderecoResponseValue> returnType = new GenericType<EnderecoResponseValue>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
