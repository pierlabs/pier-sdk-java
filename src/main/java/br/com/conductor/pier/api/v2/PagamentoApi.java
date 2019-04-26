package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.PagamentosInvalidosResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoPagamentoResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PagePagamentosInvalidosResponse;
import br.com.conductor.pier.api.v2.model.RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido;
import br.com.conductor.pier.api.v2.model.RegularizacaoPagamentoPersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PagamentoApi {
  private ApiClient apiClient;

  public PagamentoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PagamentoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Consultar pagamento inv\u00E1lido
   * Esse recurso permite consultar um pagamento inv\u00E1lido a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do pagamento inv\u00E1lido
   * @return PagamentosInvalidosResponse
   */
  public PagamentosInvalidosResponse consultarPagamentoInvalido(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarPagamentoInvalido");
     }
     
    // create path and map variables
    String path = "/api/pagamentos-invalidos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<PagamentosInvalidosResponse> returnType = new GenericType<PagamentosInvalidosResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista hist\u00F3rico de pagamentos
   * Este recurso permite listar todos os Pagamentos realizados independente do seu Status de Processamento
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   * @param idPagamento C\u00F3digo de Identifica\u00E7\u00E3o do Pagamento
   * @param idEstabelecimento C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento onde o Pagamento foi realizado, quando este for o local de pagamento
   * @param idBanco C\u00F3digo de Identifica\u00E7\u00E3o da Institui\u00E7\u00E3o Banc\u00E1ria onde o Pagamento foi realizado, quando este for o local de pagamento
   * @param idCartao C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o
   * @param dataHoraPagamento Data e Hora da realiza\u00E7\u00E3o do Pagamento. Quando feito em Institui\u00E7\u00E3o Banc\u00E1ria, o hor\u00E1rio do pagamento \u00E9 exibido com valor zero
   * @param status C\u00F3digo de Identifica\u00E7\u00E3o do Status do Pagamento
   * @return PageHistoricoPagamentoResponse
   */
  public PageHistoricoPagamentoResponse listarPagamentos(List<String> sort, Integer page, Integer limit, Long idConta, Long idPagamento, Long idEstabelecimento, Long idBanco, Long idCartao, String dataHoraPagamento, Long status) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/pagamentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPagamento", idPagamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idBanco", idBanco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraPagamento", dataHoraPagamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    

    

    

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

    
    GenericType<PageHistoricoPagamentoResponse> returnType = new GenericType<PageHistoricoPagamentoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar pagamentos inv\u00E1lidos
   * Esse recurso permite listar os pagamentos inv\u00E1lidos na base do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param banco C\u00F3digo de identifica\u00E7\u00E3o do banco
   * @param dataPagamento Data de pagamento do boleto
   * @param valorPago Valor pago da fatura
   * @param descricao Descri\u00E7\u00E3o do erro ocorrido durante a importa\u00E7\u00E3o do pagamento
   * @return PagePagamentosInvalidosResponse
   */
  public PagePagamentosInvalidosResponse listarPagamentosInvalidos(List<String> sort, Integer page, Integer limit, Long banco, String dataPagamento, BigDecimal valorPago, String descricao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/pagamentos-invalidos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataPagamento", dataPagamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "valorPago", valorPago));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    

    

    

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

    
    GenericType<PagePagamentosInvalidosResponse> returnType = new GenericType<PagePagamentosInvalidosResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Regularizar um pagamento inv\u00E1lido
   * Esse recurso permite regularizar os pagamentos inv\u00E1lidos na base do emissor
   * @param id id
   * @param persistDto persistDto
   * @return RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido
   */
  public RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido regularizar(Long id, RegularizacaoPagamentoPersist persistDto) throws ApiException {
    Object postBody = persistDto;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling regularizar");
     }
     
     // verify the required parameter 'persistDto' is set
     if (persistDto == null) {
        throw new ApiException(400, "Missing the required parameter 'persistDto' when calling regularizar");
     }
     
    // create path and map variables
    String path = "/api/pagamentos-invalidos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido> returnType = new GenericType<RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
