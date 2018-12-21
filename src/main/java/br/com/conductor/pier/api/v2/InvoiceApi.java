package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.FaturaDetalheResponse;
import br.com.conductor.pier.api.v2.model.PagePlanoParcelamentoResponse;
import br.com.conductor.pier.api.v2.model.PageFaturaResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class InvoiceApi {
  private ApiClient apiClient;

  public InvoiceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InvoiceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Retrieve the invoice of a clien
   * Retrieve invoice of a client by the expiration date
   * @param dataVencimento Expiration date
   * @param idConta Identification Code of the Account (id)
   * @return FaturaDetalheResponse
   */
  public FaturaDetalheResponse consultarFatura(String dataVencimento, Long idConta) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'dataVencimento' is set
     if (dataVencimento == null) {
        throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling consultarFatura");
     }
     
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarFatura");
     }
     
    // create path and map variables
    String path = "/api/faturas/{dataVencimento}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dataVencimento" + "\\}", apiClient.escapeString(dataVencimento.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    

    

    

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

    
    GenericType<FaturaDetalheResponse> returnType = new GenericType<FaturaDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List the plans of installment
   * List the plans of installment of the invoice of an account
   * @param id Identification Code of the Account (id)
   * @param dataVencimentoPadrao Indicate the date of standard expiration of the invoices
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PagePlanoParcelamentoResponse
   */
  public PagePlanoParcelamentoResponse consultarLancamentosFuturosFatura(Long id, String dataVencimentoPadrao, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLancamentosFuturosFatura");
     }
     
     // verify the required parameter 'dataVencimentoPadrao' is set
     if (dataVencimentoPadrao == null) {
        throw new ApiException(400, "Missing the required parameter 'dataVencimentoPadrao' when calling consultarLancamentosFuturosFatura");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/faturas/planos-parcelamento".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataVencimentoPadrao", dataVencimentoPadrao));
    

    

    

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

    
    GenericType<PagePlanoParcelamentoResponse> returnType = new GenericType<PagePlanoParcelamentoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Send the second billing of the invoice by email
   * Send the second billing of the invoice by the e-mail informed/registered
   * @param id Identification Code of the Account (id)
   * @param dataVencimento Expiration date in the format (yyyy-MM-dd)
   * @param email E-mail to send the second invoice, in case it is not informed it will be used the registered e-mail
   * @return Object
   */
  public Object enviarFaturaEmail(Long id, String dataVencimento, String email) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling enviarFaturaEmail");
     }
     
     // verify the required parameter 'dataVencimento' is set
     if (dataVencimento == null) {
        throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling enviarFaturaEmail");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/faturas/{dataVencimento}/enviar-email".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "dataVencimento" + "\\}", apiClient.escapeString(dataVencimento.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "email", email));
    

    

    

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

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List the invoices of a client
   * List the invoices of a client
   * @param idConta Identification Code of the Account (id)
   * @param situacaoProcessamento Invoice processing status. Possible values [OPENED, CLOSED, ALL]
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageFaturaResponse
   */
  public PageFaturaResponse listarFaturas(Long idConta, String situacaoProcessamento, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling listarFaturas");
     }
     
    // create path and map variables
    String path = "/api/faturas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "situacaoProcessamento", situacaoProcessamento));
    
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

    
    GenericType<PageFaturaResponse> returnType = new GenericType<PageFaturaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Allow to visualize the invoice statement in PDF format
   * This operation allows to visualize the statement of the invoice of a determined account, in PDF format. When it is the active invoice, by the way, from the current month, the PDF will be composed by the release statement and the bank clearing sheet. When it is the historic of the invoice of the client, the PDF will be composed only by the statement of transactions
   * @param id Identification Code of the Account (id)
   * @param dataVencimento Expiration date of the invoice
   * @param flagApenasDemostrativo If the parameter is true the invoice will be displayed without the bank slip. If the parameter is false or null the invoice will be displayed normally, with the bank slip
   * @param flagRegistraBoleto If the parameter is true, the bank slip will be registered before the invoice is displayed. If the parameter is false or null the ticket the resource will not register the bank slip
   * @return Object
   */
  public Object visualizarDocumento(Long id, String dataVencimento, Boolean flagApenasDemostrativo, Boolean flagRegistraBoleto) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling visualizarDocumento");
     }
     
     // verify the required parameter 'dataVencimento' is set
     if (dataVencimento == null) {
        throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling visualizarDocumento");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/faturas/{dataVencimento}/arquivo.pdf".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "dataVencimento" + "\\}", apiClient.escapeString(dataVencimento.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "flagApenasDemostrativo", flagApenasDemostrativo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagRegistraBoleto", flagRegistraBoleto));
    

    

    

    final String[] accepts = {
      "application/pdf"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
