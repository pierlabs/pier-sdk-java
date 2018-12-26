package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.ControleTentativaCadastroResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UsuarioTokenApi {
  private ApiClient apiClient;

  public UsuarioTokenApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsuarioTokenApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Incrementa as tentativas
   * Incrementa as tentativas de cadastro do usu\u00E1rio
   * @param cpf CPF que ser\u00E1 utilizado para incremetar as tentativas
   * @return ControleTentativaCadastroResponse
   */
  public ControleTentativaCadastroResponse incrementarTentativa(String cpf) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'cpf' is set
     if (cpf == null) {
        throw new ApiException(400, "Missing the required parameter 'cpf' when calling incrementarTentativa");
     }
     
    // create path and map variables
    String path = "/api/usuarios-tokens/incrementar-tentativas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "cpf", cpf));
    

    

    

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

    
    GenericType<ControleTentativaCadastroResponse> returnType = new GenericType<ControleTentativaCadastroResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Verifica as tentativas
   * Verifica as tentativas de cadastro do usu\u00E1rio
   * @param cpf CPF que ser\u00E1 utilizado para consulta das tentativas
   * @return ControleTentativaCadastroResponse
   */
  public ControleTentativaCadastroResponse verificarTentativa(String cpf) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'cpf' is set
     if (cpf == null) {
        throw new ApiException(400, "Missing the required parameter 'cpf' when calling verificarTentativa");
     }
     
    // create path and map variables
    String path = "/api/usuarios-tokens/verificar-tentativas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "cpf", cpf));
    

    

    

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

    
    GenericType<ControleTentativaCadastroResponse> returnType = new GenericType<ControleTentativaCadastroResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
