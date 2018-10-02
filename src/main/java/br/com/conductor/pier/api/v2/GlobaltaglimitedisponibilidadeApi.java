package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.LimiteDisponibilidadeResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.SensibilizarSaldoGlobalUpdateValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltaglimitedisponibilidadeApi {
  private ApiClient apiClient;

  public GlobaltaglimitedisponibilidadeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltaglimitedisponibilidadeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{limite_disponibilidade_resource_alterar}}}
   * {{{limite_disponibilidade_resource_alterar_notes}}}
   * @param idConta {{{limite_disponibilidade_update_id_conta_value}}}
   * @param limiteGlobal {{{limite_disponibilidade_persist_limite_global_value}}}
   * @param limiteCompra {{{limite_disponibilidade_persist_limite_compra_value}}}
   * @param limiteParcelado {{{limite_disponibilidade_persist_limite_parcelado_value}}}
   * @param limiteParcelas {{{limite_disponibilidade_persist_limite_parcelas_value}}}
   * @param limiteSaqueGlobal {{{limite_disponibilidade_persist_limite_saque_global_value}}}
   * @param limiteSaquePeriodo {{{limite_disponibilidade_persist_limite_saque_periodo_value}}}
   * @param limiteConsignado {{{limite_disponibilidade_persist_limite_consignado_value}}}
   * @param limiteInternacionalCompra {{{limite_disponibilidade_persist_limite_internacional_compra_value}}}
   * @param limiteInternacionalParcelado {{{limite_disponibilidade_persist_limite_internacional_parcelado_value}}}
   * @param limiteInternacionalParcelas {{{limite_disponibilidade_persist_limite_internacional_parcelas_value}}}
   * @param limiteInternacionalSaqueGlobal {{{limite_disponibilidade_persist_limite_internacional_saque_global_value}}}
   * @param limiteInternacionalSaquePeriodo {{{limite_disponibilidade_persist_limite_internacional_saque_periodo_value}}}
   * @param limiteMaximo {{{limite_disponibilidade_persist_limite_maximo_value}}}
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse alterarUsingPUT8(Long idConta, BigDecimal limiteGlobal, BigDecimal limiteCompra, BigDecimal limiteParcelado, BigDecimal limiteParcelas, BigDecimal limiteSaqueGlobal, BigDecimal limiteSaquePeriodo, BigDecimal limiteConsignado, BigDecimal limiteInternacionalCompra, BigDecimal limiteInternacionalParcelado, BigDecimal limiteInternacionalParcelas, BigDecimal limiteInternacionalSaqueGlobal, BigDecimal limiteInternacionalSaquePeriodo, BigDecimal limiteMaximo) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling alterarUsingPUT8");
     }
     
    // create path and map variables
    String path = "/api/limites-disponibilidades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteGlobal", limiteGlobal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteCompra", limiteCompra));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteParcelado", limiteParcelado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteParcelas", limiteParcelas));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteSaqueGlobal", limiteSaqueGlobal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteSaquePeriodo", limiteSaquePeriodo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteConsignado", limiteConsignado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteInternacionalCompra", limiteInternacionalCompra));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteInternacionalParcelado", limiteInternacionalParcelado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteInternacionalParcelas", limiteInternacionalParcelas));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteInternacionalSaqueGlobal", limiteInternacionalSaqueGlobal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteInternacionalSaquePeriodo", limiteInternacionalSaquePeriodo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteMaximo", limiteMaximo));
    
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

    
    GenericType<LimiteDisponibilidadeResponse> returnType = new GenericType<LimiteDisponibilidadeResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{limite_disponibilidade_resource_consultar}}}
   * {{{limite_disponibilidade_resource_consultar_notes}}}
   * @param idConta {{{limite_disponibilidade_resource_consultar_param_id_conta}}}
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse consultarUsingGET21(Long idConta) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarUsingGET21");
     }
     
    // create path and map variables
    String path = "/api/limites-disponibilidades".replaceAll("\\{format\\}","json");

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

    
    GenericType<LimiteDisponibilidadeResponse> returnType = new GenericType<LimiteDisponibilidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * {{{limite_disponibilidade_resource_sensibilizar_credito_disponivel}}}
   * {{{limite_disponibilidade_resource_sensibilizar_credito_disponivel_notes}}}
   * @param id {{{sensibilizar_saldo_global_param_id}}}
   * @param sensibilizarSaldoGlobal sensibilizarSaldoGlobal
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse sensibilizarSaldoDisponivelGlobalUsingPOST(Long id, SensibilizarSaldoGlobalUpdateValue sensibilizarSaldoGlobal) throws ApiException {
    Object postBody = sensibilizarSaldoGlobal;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling sensibilizarSaldoDisponivelGlobalUsingPOST");
     }
     
     // verify the required parameter 'sensibilizarSaldoGlobal' is set
     if (sensibilizarSaldoGlobal == null) {
        throw new ApiException(400, "Missing the required parameter 'sensibilizarSaldoGlobal' when calling sensibilizarSaldoDisponivelGlobalUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/limites-disponibilidades/sensibilizar-saldo-disponivel-global".replaceAll("\\{format\\}","json")
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

    
    GenericType<LimiteDisponibilidadeResponse> returnType = new GenericType<LimiteDisponibilidadeResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
