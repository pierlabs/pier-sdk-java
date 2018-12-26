package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.PageBinResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BinApi {
  private ApiClient apiClient;

  public BinApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BinApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Listar Bin
   * Listar Bin notes
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id Bin id
   * @param proximaConta Bin proxima conta
   * @param flagCartaoVirtual Bin flag cartao virtual
   * @param flagProvisorio Bin flag provisorio
   * @param serviceCode Bin service code
   * @return PageBinResponse
   */
  public PageBinResponse listarBin(List<String> sort, Integer page, Integer limit, Long id, Long proximaConta, Integer flagCartaoVirtual, Integer flagProvisorio, Integer serviceCode) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/bins".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "proximaConta", proximaConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagCartaoVirtual", flagCartaoVirtual));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagProvisorio", flagProvisorio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "serviceCode", serviceCode));
    

    

    

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

    
    GenericType<PageBinResponse> returnType = new GenericType<PageBinResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
