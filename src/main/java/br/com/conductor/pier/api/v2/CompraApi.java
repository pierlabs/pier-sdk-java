package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.EventoExternoCompraParcialUpdate;
import br.com.conductor.pier.api.v2.model.EventoExternoCompraResponse;
import br.com.conductor.pier.api.v2.model.EventoExternoCompraPersist;
import br.com.conductor.pier.api.v2.model.CdtEventoExternoCompra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CompraApi {
  private ApiClient apiClient;

  public CompraApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CompraApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Atualizar eventos externos de compras
   * Atualiza um evento externos de compras
   * @param id Id do evento externo de compra a ser alterado
   * @param eventoExternoCompraParcialUpdate eventoExternoCompraParcialUpdate
   * @return EventoExternoCompraResponse
   */
  public EventoExternoCompraResponse atualizarEventoCompra(Long id, EventoExternoCompraParcialUpdate eventoExternoCompraParcialUpdate) throws ApiException {
    Object postBody = eventoExternoCompraParcialUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarEventoCompra");
     }
     
     // verify the required parameter 'eventoExternoCompraParcialUpdate' is set
     if (eventoExternoCompraParcialUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'eventoExternoCompraParcialUpdate' when calling atualizarEventoCompra");
     }
     
    // create path and map variables
    String path = "/api/eventos-externos-compras/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<EventoExternoCompraResponse> returnType = new GenericType<EventoExternoCompraResponse>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * consultar
   * 
   * @param id id
   * @return Object
   */
  public Object consultar(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
     }
     
    // create path and map variables
    String path = "/api/eventos-externos-compras/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar eventos externos de compras
   * Lista os eventos externos de compras
   * @param dataCompraInicial Data da compra inicial
   * @param dataCompraFinal Data da compra final
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo do evento
   * @param idConta C\u00F3digo da conta
   * @param idCartao C\u00F3digo do cart\u00E3o
   * @param idOperacao C\u00F3digo do tipo de opera\u00E7\u00E3o
   * @param idEstabelecimento C\u00F3digo do estabelecimento
   * @param dataLocal M\u00EAs/dia autoriza\u00E7\u00E3o
   * @param dataEntradaCompra 
   * @return EventoExternoCompraResponse
   */
  public EventoExternoCompraResponse listarEventoCompra(String dataCompraInicial, String dataCompraFinal, List<String> sort, Integer page, Integer limit, Long id, Long idConta, Long idCartao, Long idOperacao, Long idEstabelecimento, String dataLocal, String dataEntradaCompra) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'dataCompraInicial' is set
     if (dataCompraInicial == null) {
        throw new ApiException(400, "Missing the required parameter 'dataCompraInicial' when calling listarEventoCompra");
     }
     
     // verify the required parameter 'dataCompraFinal' is set
     if (dataCompraFinal == null) {
        throw new ApiException(400, "Missing the required parameter 'dataCompraFinal' when calling listarEventoCompra");
     }
     
    // create path and map variables
    String path = "/api/eventos-externos-compras".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCompraInicial", dataCompraInicial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCompraFinal", dataCompraFinal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idOperacao", idOperacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataLocal", dataLocal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataEntradaCompra", dataEntradaCompra));
    

    

    

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

    
    GenericType<EventoExternoCompraResponse> returnType = new GenericType<EventoExternoCompraResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Salvar eventos externos de compras
   * Salva os eventos externos de compras
   * @param eventoExternoCompraPersist eventoExternoCompraPersist
   * @return CdtEventoExternoCompra
   */
  public CdtEventoExternoCompra salvarEventoCompra(EventoExternoCompraPersist eventoExternoCompraPersist) throws ApiException {
    Object postBody = eventoExternoCompraPersist;
    
     // verify the required parameter 'eventoExternoCompraPersist' is set
     if (eventoExternoCompraPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'eventoExternoCompraPersist' when calling salvarEventoCompra");
     }
     
    // create path and map variables
    String path = "/api/eventos-externos-compras".replaceAll("\\{format\\}","json");

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

    
    GenericType<CdtEventoExternoCompra> returnType = new GenericType<CdtEventoExternoCompra>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
