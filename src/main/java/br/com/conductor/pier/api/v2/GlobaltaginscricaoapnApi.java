package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.InscricaoAPNResponse;
import br.com.conductor.pier.api.v2.model.PageInscricaoAPNResponse;
import br.com.conductor.pier.api.v2.model.InscricaoApnPersistencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltaginscricaoapnApi {
  private ApiClient apiClient;

  public GlobaltaginscricaoapnApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltaginscricaoapnApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{inscricao_apn_recurso_desativar}}}
   * {{{inscricao_apn_recurso_desativar_notas}}}
   * @param id id
   * @return InscricaoAPNResponse
   */
  public InscricaoAPNResponse desativarUsingPUT(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/inscricoes-apn/{id}/desativar".replaceAll("\\{format\\}","json")
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

    
    GenericType<InscricaoAPNResponse> returnType = new GenericType<InscricaoAPNResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{inscricao_apn_recurso_listar}}}
   * {{{inscricao_apn_recurso_listar_notas}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param idCartoes {{{inscricao_apn_requisicao_id_cartoes_descricao}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param deviceToken {{{inscricao_apn_requisicao_device_token_descricao}}}
   * @param dataCriacao {{{inscricao_apn_requisicao_data_criacao_descricao}}}
   * @param dataDesativacao {{{inscricao_apn_requisicao_data_desativacao_descricao}}}
   * @param ativo {{{inscricao_apn_requisicao_ativo_descricao}}}
   * @param idAplicacaoMobile {{{inscricao_apn_requisicao_id_aplicacao_mobile_descricao}}}
   * @return PageInscricaoAPNResponse
   */
  public PageInscricaoAPNResponse listarUsingGET27(List<String> sort, List<Long> idCartoes, Integer page, Integer limit, String deviceToken, String dataCriacao, String dataDesativacao, Boolean ativo, Long idAplicacaoMobile) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/inscricoes-apn".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("multi", "idCartoes", idCartoes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "deviceToken", deviceToken));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCriacao", dataCriacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataDesativacao", dataDesativacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "ativo", ativo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idAplicacaoMobile", idAplicacaoMobile));
    

    

    

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

    
    GenericType<PageInscricaoAPNResponse> returnType = new GenericType<PageInscricaoAPNResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{inscricao_apn_recurso_salvar}}}
   * {{{inscricao_apn_recurso_salvar_notas}}}
   * @param inscricaoPersist inscricaoPersist
   * @return List<InscricaoAPNResponse>
   */
  public List<InscricaoAPNResponse> salvarUsingPOST15(InscricaoApnPersistencia inscricaoPersist) throws ApiException {
    Object postBody = inscricaoPersist;
    
     // verify the required parameter 'inscricaoPersist' is set
     if (inscricaoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'inscricaoPersist' when calling salvarUsingPOST15");
     }
     
    // create path and map variables
    String path = "/api/inscricoes-apn".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<InscricaoAPNResponse>> returnType = new GenericType<List<InscricaoAPNResponse>>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
