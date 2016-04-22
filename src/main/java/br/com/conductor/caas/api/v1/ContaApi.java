
package br.com.conductor.pier.api.v1;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v1.invoker.ApiException;
import br.com.conductor.pier.api.v1.invoker.ApiClient;
import br.com.conductor.pier.api.v1.invoker.Configuration;
import br.com.conductor.pier.api.v1.invoker.Pair;

import br.com.conductor.pier.api.v1.model.ContaResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class ContaApi{

     private ApiClient apiClient;

     public ContaApi(){
          this(Configuration.getDefaultApiClient());
     }

     public ContaApi(ApiClient apiClient){
          this.apiClient = apiClient;
     }

     public ApiClient getApiClient() {

          return apiClient;
     }

     public void setApiClient(ApiClient apiClient) {

          this.apiClient = apiClient;
     }

     /**
      * /contas/{idConta} Consulte informaÃ§Ãµes de uma determinada conta
      * 
      * @param idEmissor
      * ID do Emissor
      * @param idConta
      * ID da Conta
      * @return ContaResponse
      */
     public ContaResponse consultarContaUsingGET1(Integer idEmissor, Integer idConta) throws ApiException {

          Object postBody = null;

          // verify the required parameter 'idEmissor' is set
          if (idEmissor == null) {
               throw new ApiException(400, "Missing the required parameter 'idEmissor' when calling consultarContaUsingGET1");
          }

          // verify the required parameter 'idConta' is set
          if (idConta == null) {
               throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarContaUsingGET1");
          }

          // create path and map variables
          String path = "/api/v1/contas/{idConta}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "idConta" + "\\}", apiClient.escapeString(idConta.toString()));

          // query params
          List<Pair> queryParams = new ArrayList<Pair>();
          Map<String, String> headerParams = new HashMap<String, String>();
          Map<String, Object> formParams = new HashMap<String, Object>();

          if (idEmissor != null)
               headerParams.put("idEmissor", apiClient.parameterToString(idEmissor));

          final String[] accepts = { "application/json" };
          final String accept = apiClient.selectHeaderAccept(accepts);

          final String[] contentTypes = { "application/json" };
          final String contentType = apiClient.selectHeaderContentType(contentTypes);

          String[] authNames = new String[] { "access_token" };

          GenericType<ContaResponse> returnType = new GenericType<ContaResponse>(){
          };
          return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);

     }
     
     public static void main(String[] args) throws ApiException {

          ApiClient apiClient = new ApiClient();
          apiClient.setBasePath("http://localhost:8080");
//          apiClient.setApiKey("XXXX");
          
          ContaApi api = new ContaApi(apiClient);
          ContaResponse consultarContaUsingGET1 = api.consultarContaUsingGET1(54, 14);
          System.out.println(consultarContaUsingGET1);
          
          
     }

}
