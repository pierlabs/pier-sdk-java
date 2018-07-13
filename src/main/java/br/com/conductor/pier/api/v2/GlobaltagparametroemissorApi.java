package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.ParametroEmissorResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class GlobaltagparametroemissorApi {
  private ApiClient apiClient;

  public GlobaltagparametroemissorApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagparametroemissorApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{parametro_emissor_recurso}}}
   * {{{parametro_emissor_recurso_notas}}}
   * @param codigo {{{parametro_emissor_recurso_pesquisa_codigo_param}}}
   * @return ParametroEmissorResponse
   */
  public ParametroEmissorResponse consultarUsingGET27(String codigo) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'codigo' is set
     if (codigo == null) {
        throw new ApiException(400, "Missing the required parameter 'codigo' when calling consultarUsingGET27");
     }
     
    // create path and map variables
    String path = "/api/parametros-emissor/{codigo}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "codigo" + "\\}", apiClient.escapeString(codigo.toString()));

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

    
    GenericType<ParametroEmissorResponse> returnType = new GenericType<ParametroEmissorResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

