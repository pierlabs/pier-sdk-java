package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.LimiteDisponibilidadeResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PagePIEROfLimiteDisponibilidadeLogResponse;
import br.com.conductor.pier.api.v2.model.SensibilizarSaldoGlobalUpdate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LimiteDisponibilidadeApi {
  private ApiClient apiClient;

  public LimiteDisponibilidadeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LimiteDisponibilidadeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Realiza a altera\u00E7\u00E3o dos limites da conta
   * Esse recurso permite realizar a altera\u00E7\u00E3o dos Limites de uma determinada Conta
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da Conta
   * @param limiteGlobal Apresenta o valor do limite de cr\u00E9dito que o portador do cart\u00E3o possui
   * @param limiteCompra Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para uso exclusivo em Compras Nacionais
   * @param limiteParcelado Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para realizar transa\u00E7\u00F5es de compras parceladas
   * @param limiteParcelas Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que portador pode acumular a partir da soma das parcelas das compras que forem realizadas nesta modalidade
   * @param limiteSaqueGlobal Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional
   * @param limiteSaquePeriodo Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional dentro de cada ciclo de faturamento
   * @param limiteConsignado Quando utilizado pelo emissor, este campo apresenta o valor da margem de cr\u00E9dito que ele poder\u00E1 utilizar para ser cobrado de forma consignada (desconto em folha) em seu sal\u00E1rio/vencimentos
   * @param limiteInternacionalCompra Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para uso exclusivo em Compras Internacionais
   * @param limiteInternacionalParcelado Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para realizar transa\u00E7\u00F5es Internacionais de Compras Parceladas
   * @param limiteInternacionalParcelas Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que portador pode acumular a partir da soma das parcelas das compras internacionais que forem realizadas nesta modalidade
   * @param limiteInternacionalSaqueGlobal Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Internacional
   * @param limiteInternacionalSaquePeriodo Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Internacional dentro de cada ciclo de faturamento
   * @param limiteMaximo Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse alterarLimitesDisponiveis(Long idConta, BigDecimal limiteGlobal, BigDecimal limiteCompra, BigDecimal limiteParcelado, BigDecimal limiteParcelas, BigDecimal limiteSaqueGlobal, BigDecimal limiteSaquePeriodo, BigDecimal limiteConsignado, BigDecimal limiteInternacionalCompra, BigDecimal limiteInternacionalParcelado, BigDecimal limiteInternacionalParcelas, BigDecimal limiteInternacionalSaqueGlobal, BigDecimal limiteInternacionalSaquePeriodo, BigDecimal limiteMaximo) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling alterarLimitesDisponiveis");
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
   * Apresenta os limites da conta
   * Este m\u00E9todo permite consultar os Limites configurados para uma determinada Conta, a partir do c\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param idConta Id Conta
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse consultarLimitesDisponiveis1(Long idConta) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarLimitesDisponiveis1");
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
   * Lista o hist\u00F3rico de limites
   * Este recurso permite listar o hist\u00F3rico de limites disponibilidades
   * @param id C\u00F3digo identificador da conta
   * @param dataAlteracaoInicio Data inicial para busca de hist\u00F3ricos por per\u00EDodo
   * @param dataAlteracaoFim Data final para busca de hist\u00F3ricos por per\u00EDodo
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PagePIEROfLimiteDisponibilidadeLogResponse
   */
  public PagePIEROfLimiteDisponibilidadeLogResponse listarHistoricoAlteracoesLimitesDisponiveis(Long id, String dataAlteracaoInicio, String dataAlteracaoFim, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAlteracoesLimitesDisponiveis");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/limites-disponibilidades/historicos".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAlteracaoInicio", dataAlteracaoInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAlteracaoFim", dataAlteracaoFim));
    
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

    
    GenericType<PagePIEROfLimiteDisponibilidadeLogResponse> returnType = new GenericType<PagePIEROfLimiteDisponibilidadeLogResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Sensibilizar uma quantidade de cr\u00E9dito de global de uma conta
   * Este m\u00E9todo permite sensibilizar, para mais ou para menos, a quantidade de cr\u00E9dito global de uma conta
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param sensibilizarSaldoGlobal sensibilizarSaldoGlobal
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse sensibilizarSaldoDisponivelGlobal(Long id, SensibilizarSaldoGlobalUpdate sensibilizarSaldoGlobal) throws ApiException {
    Object postBody = sensibilizarSaldoGlobal;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling sensibilizarSaldoDisponivelGlobal");
     }
     
     // verify the required parameter 'sensibilizarSaldoGlobal' is set
     if (sensibilizarSaldoGlobal == null) {
        throw new ApiException(400, "Missing the required parameter 'sensibilizarSaldoGlobal' when calling sensibilizarSaldoDisponivelGlobal");
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
