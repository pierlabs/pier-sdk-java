package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.PageTipoDebitoRecorrenteResponse;
import java.math.BigDecimal;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class DebitoRecorrenteApi {
  private ApiClient apiClient;

  public DebitoRecorrenteApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DebitoRecorrenteApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Lista os d\u00C3\u00A9bitos recorrentes de uma Conta
   * A entidade D\u00C3\u00A9bito Recorrente trata dos registros contratados por um determinado cliente (idConta) onde a cobran\u00C3\u00A7a dele se d\u00C3\u00A1 de forma cont\u00C3\u00ADnua, consistindo em uma \u00E2\u0080\u009Cassinatura\u00E2\u0080\u009D ou pagamento de mensalidades. Isso significa que, enquanto o servi\u00C3\u00A7o continuar a ser prestado, o cliente dever\u00C3\u00A1 continuar realizando os pagamentos. A determina\u00C3\u00A7\u00C3\u00A3o de quanto tempo essa rela\u00C3\u00A7\u00C3\u00A3o ir\u00C3\u00A1 durar \u00C3\u00A9 feita em contrato. Na maioria das vezes, existe um per\u00C3\u00ADodo m\u00C3\u00ADnimo e, caso o servi\u00C3\u00A7o seja cancelado ou o pagamento n\u00C3\u00A3o seja realizado, o status do D\u00C3\u00A9bito Recorrente ter\u00C3\u00A1 a FlagAtivo com valor false. Assim, este m\u00C3\u00A9todo lista todas as opera\u00C3\u00A7\u00C3\u00B5es de D\u00C3\u00A9bitos Recorrentes que um determinado idConta j\u00C3\u00A1 contratou, esteja ele ativo ou n\u00C3\u00A3o.
   * @param idConta C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id)
   * @param idTipoDebitoRecorrente C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de d\u00C3\u00A9bito recorrente (id)
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param dataHoraInicio Data inicio do d\u00C3\u00A9bito recorrente.
   * @param dataHoraFim Data fim do d\u00C3\u00A9bito recorrente.
   * @param ativo Identifica se o d\u00C3\u00A9bito recorrente est\u00C3\u00A1 ativo.
   * @param dataHoraUltimoPagamento Data do \u00C3\u00BAltimo pagamento efetuado.
   * @return PageTipoDebitoRecorrenteResponse
   */
  public PageTipoDebitoRecorrenteResponse listarUsingGET12(Long idConta, Long idTipoDebitoRecorrente, List<String> sort, Integer page, Integer limit, String dataHoraInicio, String dataHoraFim, Boolean ativo, String dataHoraUltimoPagamento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling listarUsingGET12");
     }
     
    // create path and map variables
    String path = "/api/debitos-recorrentes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoDebitoRecorrente", idTipoDebitoRecorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraInicio", dataHoraInicio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraFim", dataHoraFim));
    
    queryParams.addAll(apiClient.parameterToPairs("", "ativo", ativo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraUltimoPagamento", dataHoraUltimoPagamento));
    

    

    

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

    
    GenericType<PageTipoDebitoRecorrenteResponse> returnType = new GenericType<PageTipoDebitoRecorrenteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar Tipos Debitos Recorrentes
   * Para os emissores que utilizam a entidade Debitos Recorrentes precisam previamente solicitar a Conductor o cadastro de quais Tipos eles poder\u00C3\u00A3o comercializar. Por isso, este recurso tem como objetivo apresentar todos os Tipos de D\u00C3\u00A9bitos Recorrentes que est\u00C3\u00A3o cadastrados para um determinado Emissor, independente do status dele.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de d\u00C3\u00A9bito recorrente (id).
   * @param descricao Descri\u00C3\u00A7\u00C3\u00A3o do tipo de d\u00C3\u00A9bito recorrente.
   * @param valor Valor do tipo de d\u00C3\u00A9bito recorrente.
   * @param flagAtivo Flag que identifica se o tipo d\u00C3\u00A9bito recorrente est\u00C3\u00A1 ativo.
   * @return PageTipoDebitoRecorrenteResponse
   */
  public PageTipoDebitoRecorrenteResponse listarUsingGET34(List<String> sort, Integer page, Integer limit, Long id, String descricao, BigDecimal valor, Boolean flagAtivo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-debitos-recorrentes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valor", valor));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    

    

    

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

    
    GenericType<PageTipoDebitoRecorrenteResponse> returnType = new GenericType<PageTipoDebitoRecorrenteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

