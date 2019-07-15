package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.PageCodigoChargebackResponse;
import br.com.conductor.pier.api.v2.model.PageGrupoChargebackResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GrupoChargebackApi {
  private ApiClient apiClient;

  public GrupoChargebackApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GrupoChargebackApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Listar c\u00F3digo de chargeback
   * Lista os c\u00F3digo de chargeback
   * @param grupoChargebackId grupoChargebackId
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id 
   * @param descricao 
   * @param flagAtm 
   * @param grupoChargebackId2 
   * @param bandeiraId 
   * @return PageCodigoChargebackResponse
   */
  public PageCodigoChargebackResponse listarCodigosDosGruposChargeback(Long grupoChargebackId, List<String> sort, Integer page, Integer limit, Long id, String descricao, Boolean flagAtm, Long grupoChargebackId2, Long bandeiraId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'grupoChargebackId' is set
     if (grupoChargebackId == null) {
        throw new ApiException(400, "Missing the required parameter 'grupoChargebackId' when calling listarCodigosDosGruposChargeback");
     }
     
    // create path and map variables
    String path = "/api/grupos-chargeback/{grupoChargebackId}/codigos".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "grupoChargebackId" + "\\}", apiClient.escapeString(grupoChargebackId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtm", flagAtm));
    
    queryParams.addAll(apiClient.parameterToPairs("", "grupoChargebackId", grupoChargebackId2));
    
    queryParams.addAll(apiClient.parameterToPairs("", "bandeiraId", bandeiraId));
    

    

    

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

    
    GenericType<PageCodigoChargebackResponse> returnType = new GenericType<PageCodigoChargebackResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar grupos de chargeback
   * Lista os grupos de chargeback
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageGrupoChargebackResponse
   */
  public PageGrupoChargebackResponse listarGruposChargeback(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/grupos-chargeback".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

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

    
    GenericType<PageGrupoChargebackResponse> returnType = new GenericType<PageGrupoChargebackResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
