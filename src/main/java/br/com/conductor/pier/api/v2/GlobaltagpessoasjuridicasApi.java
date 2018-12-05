package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.PessoaJuridicaUpdate;
import br.com.conductor.pier.api.v2.model.PessoaJuridicaResponse;
import br.com.conductor.pier.api.v2.model.PagePessoaJuridicaResponse;
import br.com.conductor.pier.api.v2.model.PessoaJuridicaPersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagpessoasjuridicasApi {
  private ApiClient apiClient;

  public GlobaltagpessoasjuridicasApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagpessoasjuridicasApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{pessoa_juridica_resource_alterar}}}
   * {{{pessoa_juridica_resource_alterar_notes}}}
   * @param id id
   * @param request request
   * @param login login
   * @return PessoaJuridicaResponse
   */
  public PessoaJuridicaResponse alterarUsingPUT15(Long id, PessoaJuridicaUpdate request, String login) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT15");
     }
     
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling alterarUsingPUT15");
     }
     
    // create path and map variables
    String path = "/api/pessoas-juridicas/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (login != null)
      headerParams.put("login", apiClient.parameterToString(login));
    

    

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

    
    GenericType<PessoaJuridicaResponse> returnType = new GenericType<PessoaJuridicaResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{pessoa_juridica_resource_consultar}}}
   * {{{pessoa_juridica_resource_consultar_notes}}}
   * @param id {{{pessoa_juridica_resource_consultar_param_id}}}
   * @return PessoaJuridicaResponse
   */
  public PessoaJuridicaResponse consultarUsingGET30(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET30");
     }
     
    // create path and map variables
    String path = "/api/pessoas-juridicas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<PessoaJuridicaResponse> returnType = new GenericType<PessoaJuridicaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{pessoa_juridica_resource_listar}}}
   * {{{pessoa_juridica_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param contato {{{pessoa_juridica_request_contato_value}}}
   * @param razaoSocial {{{pessoa_juridica_request_razao_social_value}}}
   * @param numeroReceitaFederal {{{pessoa_juridica_request_CGC_value}}}
   * @param inscricaoEstadual {{{pessoa_juridica_request_inscricao_estadual_value}}}
   * @param banco {{{pessoa_juridica_request_banco_value}}}
   * @param agencia {{{pessoa_juridica_request_agencia_value}}}
   * @param digitoAgencia {{{pessoa_juridica_request_digito_agencia_value}}}
   * @param contaCorrente {{{pessoa_juridica_request_conta_corrente_value}}}
   * @param digitoContaCorrente {{{pessoa_juridica_request_digito_conta_corrente_value}}}
   * @return PagePessoaJuridicaResponse
   */
  public PagePessoaJuridicaResponse listarUsingGET34(List<String> sort, Integer page, Integer limit, String contato, String razaoSocial, String numeroReceitaFederal, String inscricaoEstadual, Integer banco, Integer agencia, String digitoAgencia, String contaCorrente, String digitoContaCorrente) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/pessoas-juridicas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "contato", contato));
    
    queryParams.addAll(apiClient.parameterToPairs("", "razaoSocial", razaoSocial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "inscricaoEstadual", inscricaoEstadual));
    
    queryParams.addAll(apiClient.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "agencia", agencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "digitoAgencia", digitoAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "contaCorrente", contaCorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "digitoContaCorrente", digitoContaCorrente));
    

    

    

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

    
    GenericType<PagePessoaJuridicaResponse> returnType = new GenericType<PagePessoaJuridicaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{pessoa_juridica_resource_salvar}}}
   * {{{pessoa_juridica_resource_salvar_notes}}}
   * @param pessoaJuridicaPersist pessoaJuridicaPersist
   * @param login login
   * @return PessoaJuridicaResponse
   */
  public PessoaJuridicaResponse salvarUsingPOST23(PessoaJuridicaPersist pessoaJuridicaPersist, String login) throws ApiException {
    Object postBody = pessoaJuridicaPersist;
    
     // verify the required parameter 'pessoaJuridicaPersist' is set
     if (pessoaJuridicaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'pessoaJuridicaPersist' when calling salvarUsingPOST23");
     }
     
    // create path and map variables
    String path = "/api/pessoas-juridicas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    if (login != null)
      headerParams.put("login", apiClient.parameterToString(login));
    

    

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

    
    GenericType<PessoaJuridicaResponse> returnType = new GenericType<PessoaJuridicaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
