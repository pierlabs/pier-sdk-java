package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.AcordoDetalheResponse;
import br.com.conductor.pier.api.v2.model.ParcelaAcordoResponse;
import br.com.conductor.pier.api.v2.model.AcordoEmailRequest;
import br.com.conductor.pier.api.v2.model.AcordoBoletoPersist;
import br.com.conductor.pier.api.v2.model.BoletoResponse;
import br.com.conductor.pier.api.v2.model.BoletoParcelaAcordoResponse;
import br.com.conductor.pier.api.v2.model.AcordoPersist;
import br.com.conductor.pier.api.v2.model.PageAcordoResponse;
import br.com.conductor.pier.api.v2.model.PageAcordoParcelaResponse;
import br.com.conductor.pier.api.v2.model.AcordoQuebraResponse;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoAcordoResponse;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoAcordoRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AcordoApi {
  private ApiClient apiClient;

  public AcordoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AcordoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Consulta os dados de um determinado acordo
   * Este m\u00E9todo permite consultar dados de um determinado acordo a partir de seu codigo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do acordo (id)
   * @return AcordoDetalheResponse
   */
  public AcordoDetalheResponse consultarAcordo(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarAcordo");
     }
     
    // create path and map variables
    String path = "/api/acordos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<AcordoDetalheResponse> returnType = new GenericType<AcordoDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta uma parcela do acordo
   * Consulta uma parcela do acordo
   * @param id Identificador da parcela
   * @return ParcelaAcordoResponse
   */
  public ParcelaAcordoResponse consultarParcelaAcordo(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarParcelaAcordo");
     }
     
    // create path and map variables
    String path = "/api/parcelas-acordos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ParcelaAcordoResponse> returnType = new GenericType<ParcelaAcordoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Enviar termo do acordo por e-mail.
   * Este recurso permite o envio por e-mail do termo de um acordo ativo a partir de seu identificador. Caso o e-mail para envio n\u00E3o seja informado, o termo ser\u00E1 enviado para o e-mail cadastrado na conta
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do acordo (id).
   * @param emailRequest emailRequest
   * @return String
   */
  public String enviarTermoPorEmail(Long id, AcordoEmailRequest emailRequest) throws ApiException {
    Object postBody = emailRequest;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling enviarTermoPorEmail");
     }
     
     // verify the required parameter 'emailRequest' is set
     if (emailRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'emailRequest' when calling enviarTermoPorEmail");
     }
     
    // create path and map variables
    String path = "/api/acordos/{id}/enviar-termo".replaceAll("\\{format\\}","json")
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

    
    GenericType<String> returnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a gera\u00E7\u00E3o de um boleto de entrada para o c\u00F3digo de identifica\u00E7\u00E3o do acordo informado
   * Realiza a gera\u00E7\u00E3o de um boleto de entrada para o c\u00F3digo de identifica\u00E7\u00E3o do acordo informado.
   * @param id id
   * @param acordoBoletoPersist acordoBoletoPersist
   * @return BoletoResponse
   */
  public BoletoResponse gerarBoletoEntrada(Long id, AcordoBoletoPersist acordoBoletoPersist) throws ApiException {
    Object postBody = acordoBoletoPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarBoletoEntrada");
     }
     
    // create path and map variables
    String path = "/api/acordos/{id}/boletos".replaceAll("\\{format\\}","json")
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
      "application/json;charset=UTF-8"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<BoletoResponse> returnType = new GenericType<BoletoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Gerar boleto da parcela do acordo
   * Este recurso permite a gera\u00E7\u00E3o do boleto de uma parcela de um acordo
   * @param id Identificador da parcela
   * @return BoletoParcelaAcordoResponse
   */
  public BoletoParcelaAcordoResponse gerarBoletoParcelaAcordo(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarBoletoParcelaAcordo");
     }
     
    // create path and map variables
    String path = "/api/parcelas-acordos/{id}/boletos".replaceAll("\\{format\\}","json")
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

    
    GenericType<BoletoParcelaAcordoResponse> returnType = new GenericType<BoletoParcelaAcordoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Gerar arquivo do termo de acordo
   * Este recurso permite a gera\u00E7\u00E3o e download do termo de um acordo ativo a partir de seu identificador.
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do acordo (id).
   * @return Object
   */
  public Object gerarTermoAcordo(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarTermoAcordo");
     }
     
    // create path and map variables
    String path = "/api/acordos/{id}/arquivo.pdf".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/pdf", "application/json"
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
   * Insere um novo acordo.
   * Recurso para a cria\u00E7\u00E3o de um novo acordo de cobran\u00E7a.
   * @param acordoPersist acordoPersist
   * @return AcordoDetalheResponse
   */
  public AcordoDetalheResponse incluirAcordo(AcordoPersist acordoPersist) throws ApiException {
    Object postBody = acordoPersist;
    
     // verify the required parameter 'acordoPersist' is set
     if (acordoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'acordoPersist' when calling incluirAcordo");
     }
     
    // create path and map variables
    String path = "/api/acordos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json;charset=UTF-8"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<AcordoDetalheResponse> returnType = new GenericType<AcordoDetalheResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os acordos existentes na base
   * Este m\u00E9todo permite que sejam listados todos os acordos existentes na base do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idConta C\u00F3digo Identificador da conta na base (id)
   * @param statusAcordo Status do acordo na base
   * @param dataAcordo Data do acordo
   * @param quantidadeParcelas Quantidade de parcelas
   * @return PageAcordoResponse
   */
  public PageAcordoResponse listarAcordos(List<String> sort, Integer page, Integer limit, Long idConta, Long statusAcordo, String dataAcordo, Integer quantidadeParcelas) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/acordos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "statusAcordo", statusAcordo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAcordo", dataAcordo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "quantidadeParcelas", quantidadeParcelas));
    

    

    

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

    
    GenericType<PageAcordoResponse> returnType = new GenericType<PageAcordoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar parcelas do acordo
   * Este recurso permite a listagem paginada das parcelas do acordo, podendo filtrar pelos atributos: id do acordo, nosso n\u00FAmero e n\u00FAmero da parcela
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idAcordo Identificador do acordo
   * @param nossoNumero Nosso n\u00FAmero do boleto
   * @param numeroParcela N\u00FAmero da parcela
   * @param dataVencimento Data vencimento da parcela do acordo
   * @return PageAcordoParcelaResponse
   */
  public PageAcordoParcelaResponse listarParcelasAcordo(List<String> sort, Integer page, Integer limit, Long idAcordo, String nossoNumero, Integer numeroParcela, String dataVencimento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/parcelas-acordos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idAcordo", idAcordo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nossoNumero", nossoNumero));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroParcela", numeroParcela));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataVencimento", dataVencimento));
    

    

    

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

    
    GenericType<PageAcordoParcelaResponse> returnType = new GenericType<PageAcordoParcelaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Quebra o acordo pelo id informado
   * Este m\u00E9todo permite que um acordo seja quebrado a partir de um id de acordo informado
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do acordo.
   * @return AcordoQuebraResponse
   */
  public AcordoQuebraResponse quebrarAcordo(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling quebrarAcordo");
     }
     
    // create path and map variables
    String path = "/api/acordos/{id}/quebrar".replaceAll("\\{format\\}","json")
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

    
    GenericType<AcordoQuebraResponse> returnType = new GenericType<AcordoQuebraResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza simula\u00E7\u00F5es de planos de parcelamento para acordos
   * Este recurso que permite realizar a simula\u00E7\u00E3o de planos de parcelamentos para abertura de acordos
   * @param request request
   * @return PlanoParcelamentoAcordoResponse
   */
  public PlanoParcelamentoAcordoResponse simularPlanosParcelamentosAcordos(PlanoParcelamentoAcordoRequest request) throws ApiException {
    Object postBody = request;
    
     // verify the required parameter 'request' is set
     if (request == null) {
        throw new ApiException(400, "Missing the required parameter 'request' when calling simularPlanosParcelamentosAcordos");
     }
     
    // create path and map variables
    String path = "/api/acordos/planos-parcelamentos".replaceAll("\\{format\\}","json");

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

    
    GenericType<PlanoParcelamentoAcordoResponse> returnType = new GenericType<PlanoParcelamentoAcordoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Visualiza os boletos das parcelas do acordo
   * Este m\u00E9todo permite visualizar, em formato PDF, os boletos das parcelas do acordo informado
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do acordo (id)
   * @return Object
   */
  public Object visualizarBoletosAcordo(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling visualizarBoletosAcordo");
     }
     
    // create path and map variables
    String path = "/api/acordos/{id}/boletos.pdf".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

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
