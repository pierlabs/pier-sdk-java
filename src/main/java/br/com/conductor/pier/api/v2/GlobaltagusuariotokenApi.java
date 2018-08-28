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
public class GlobaltagusuariotokenApi {
  private ApiClient apiClient;

  public GlobaltagusuariotokenApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagusuariotokenApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{usuario_token_recurso_controle_tentativa_cadastro_incrementar}}}
   * {{{usuario_token_recurso_controle_tentativa_cadastro_incrementar_notas}}}
   * @param cpf {{{usuario_token_recurso_controle_tentativa_cadastro_incrementar_param_cpf}}}
   * @return ControleTentativaCadastroResponse
   */
  public ControleTentativaCadastroResponse incrementarTentativaUsingPUT(String cpf) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'cpf' is set
     if (cpf == null) {
        throw new ApiException(400, "Missing the required parameter 'cpf' when calling incrementarTentativaUsingPUT");
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
   * {{{usuario_token_recurso_controle_tentativa_cadastro_verificar}}}
   * {{{usuario_token_recurso_controle_tentativa_cadastro_verificar_notas}}}
   * @param cpf {{{usuario_token_recurso_controle_tentativa_cadastro_verificar_param_cpf}}}
   * @return ControleTentativaCadastroResponse
   */
  public ControleTentativaCadastroResponse verificarTentativaUsingGET(String cpf) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'cpf' is set
     if (cpf == null) {
        throw new ApiException(400, "Missing the required parameter 'cpf' when calling verificarTentativaUsingGET");
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
