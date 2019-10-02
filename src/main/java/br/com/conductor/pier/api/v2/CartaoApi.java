package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.CartaoResponse;
import br.com.conductor.pier.api.v2.model.EstagioCartaoUpdate;
import br.com.conductor.pier.api.v2.model.HistoricoImpressaoCartaoResponse;
import br.com.conductor.pier.api.v2.model.CvvDinamicoResponse;
import br.com.conductor.pier.api.v2.model.CvvDinamicoPersist;
import br.com.conductor.pier.api.v2.model.CartaoDetalheResponse;
import br.com.conductor.pier.api.v2.model.DadosCartaoImpressaoResponse;
import br.com.conductor.pier.api.v2.model.DadosCartaoResponse;
import br.com.conductor.pier.api.v2.model.LimiteDisponibilidadeResponse;
import br.com.conductor.pier.api.v2.model.LoteCartoesPrePagosResponse;
import br.com.conductor.pier.api.v2.model.PortadorResponse;
import br.com.conductor.pier.api.v2.model.VinculoCartoesResponse;
import br.com.conductor.pier.api.v2.model.CartaoMultiAppPersist;
import br.com.conductor.pier.api.v2.model.SenhaDTO;
import br.com.conductor.pier.api.v2.model.CartaoImpressaoResponse;
import br.com.conductor.pier.api.v2.model.CartaoMifareRequest;
import br.com.conductor.pier.api.v2.model.CartaoMultiAppImpressaoResponse;
import br.com.conductor.pier.api.v2.model.PageCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageLoteCartoesPrePagosResponse;
import br.com.conductor.pier.api.v2.model.ValidaCVVRequest;
import br.com.conductor.pier.api.v2.model.ValidaCartaoResponse;
import br.com.conductor.pier.api.v2.model.ValidaSenhaCartaoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoApi {
  private ApiClient apiClient;

  public CartaoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CartaoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Realiza a altera\u00E7\u00E3o de um est\u00E1gio de cart\u00E3o
   * Esta m\u00E9todo permite que seja alterado o est\u00E1gio do cart\u00E3o para um outro informado na requisi\u00E7\u00E3o
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @param update C\u00F3digo de identifica\u00E7\u00E3o de um est\u00E1gio de cartao (est\u00E1gio)
   * @return CartaoResponse
   */
  public CartaoResponse alterarEstagio(Long id, EstagioCartaoUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarEstagio");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling alterarEstagio");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/alterar-estagio".replaceAll("\\{format\\}","json")
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

    
    GenericType<CartaoResponse> returnType = new GenericType<CartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a altera\u00E7\u00E3o do Status de Impress\u00E3o do Cart\u00E3o
   * Este m\u00E9todo permite que uma Aplica\u00E7\u00E3o que realize a impress\u00E3o de cart\u00F5es possa indicar que um determinado idCartao fora impresso ou est\u00E1 em processo de impress\u00E3o. Para isso, basta informar o respectivo c\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id) que deseja ter seu um determinado id_status_impressao atribu\u00EDdo a ele. Por padr\u00E3o, cart\u00F5es provis\u00F3rios ou que j\u00E1 tenham sido inclu\u00EDdos em um arquivo para impress\u00E3o via gr\u00E1fica ter\u00E3o esta requisi\u00E7\u00E3o negada, se utilizada
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @param idStatusImpressao C\u00F3digo de Identifica\u00E7\u00E3o do Status Impress\u00E3o (Id)
   * @return HistoricoImpressaoCartaoResponse
   */
  public HistoricoImpressaoCartaoResponse alterarStatusImpressao(Long id, Long idStatusImpressao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarStatusImpressao");
     }
     
     // verify the required parameter 'idStatusImpressao' is set
     if (idStatusImpressao == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatusImpressao' when calling alterarStatusImpressao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/alterar-status-impressao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_status_impressao", idStatusImpressao));
    

    

    

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

    
    GenericType<HistoricoImpressaoCartaoResponse> returnType = new GenericType<HistoricoImpressaoCartaoResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a atribui\u00E7\u00E3o de um cart\u00E3o pr\u00E9-pago a uma pessoa
   * Esta m\u00E9todo permite que um cart\u00E3o pr\u00E9-pago impresso de forma avulsa e an\u00F4nimo seja atribu\u00EDdo a uma pessoa para que esta passe a ser a portadora titular dele
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @param idPessoa C\u00F3digo de identifica\u00E7\u00E3o de uma Pessoa (id)
   * @return CartaoResponse
   */
  public CartaoResponse atribuirPessoa(Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atribuirPessoa");
     }
     
     // verify the required parameter 'idPessoa' is set
     if (idPessoa == null) {
        throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling atribuirPessoa");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/atribuir-titular".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_pessoa", idPessoa));
    

    

    

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

    
    GenericType<CartaoResponse> returnType = new GenericType<CartaoResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza o bloqueio de um determinado Cart\u00E3o
   * Este m\u00E9todo permite a realiza\u00E7\u00E3o do bloqueio (tempor\u00E1rio) ou do cancelamento (definitivo) de um determinado cart\u00E3o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id). Para isso, \u00E9 preciso informar qual o motivo deste bloqueio que nada mais \u00E9 do que atribuir um novo StatusCartao para ele dentre as op\u00E7\u00F5es praticadas pelo emissor
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @param idStatus C\u00F3digo de Identifica\u00E7\u00E3o do Novo Status Cart\u00E3o
   * @param observacao Texto informando uma observa\u00E7\u00E3o sobre o bloqueio
   * @param usuario Usu\u00E1rio que realizou a requisi\u00E7\u00E3o
   * @return CartaoResponse
   */
  public CartaoResponse bloquearCartao(Long id, Long idStatus, String observacao, String usuario) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling bloquearCartao");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling bloquearCartao");
     }
     
     // verify the required parameter 'observacao' is set
     if (observacao == null) {
        throw new ApiException(400, "Missing the required parameter 'observacao' when calling bloquearCartao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/bloquear".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_status", idStatus));
    
    queryParams.addAll(apiClient.parameterToPairs("", "observacao", observacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "usuario", usuario));
    

    

    

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

    
    GenericType<CartaoResponse> returnType = new GenericType<CartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza o cancelamento de um determinado Cart\u00E3o
   * Este m\u00E9todo permite a realiza\u00E7\u00E3o cancelamento de um determinado cart\u00E3o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id). Para isso, \u00E9 preciso informar qual o motivo deste bloqueio que nada mais \u00E9 do que atribuir um novo StatusCartao para ele dentre as op\u00E7\u00F5es praticadas pelo emissor
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @param idStatus C\u00F3digo de Identifica\u00E7\u00E3o do Novo Status Cart\u00E3o
   * @param observacao Texto informando uma observa\u00E7\u00E3o sobre o cancelamento
   * @return CartaoResponse
   */
  public CartaoResponse cancelarCartao(Long id, Long idStatus, String observacao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cancelarCartao");
     }
     
     // verify the required parameter 'idStatus' is set
     if (idStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatus' when calling cancelarCartao");
     }
     
     // verify the required parameter 'observacao' is set
     if (observacao == null) {
        throw new ApiException(400, "Missing the required parameter 'observacao' when calling cancelarCartao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/cancelar".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_status", idStatus));
    
    queryParams.addAll(apiClient.parameterToPairs("", "observacao", observacao));
    

    

    

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

    
    GenericType<CartaoResponse> returnType = new GenericType<CartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar CVV2 din\u00E2mico ativo
   * Este recurso permite realizar a consulta ao CVV2 din\u00E2mico ativo
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @return CvvDinamicoResponse
   */
  public CvvDinamicoResponse cartaoConsultarCvvDinamico(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cartaoConsultarCvvDinamico");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/cvv-dinamico".replaceAll("\\{format\\}","json")
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

    
    GenericType<CvvDinamicoResponse> returnType = new GenericType<CvvDinamicoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Expirar um CVV2 din\u00E2mico que estiver ativo
   * Este recurso expira o CVV2 din\u00E2mico que estiver ativo
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @return Object
   */
  public Object cartaoExpirarCvvDinamico(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cartaoExpirarCvvDinamico");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/cvv-dinamico".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Gerar CVV2 de forma din\u00E2mica para cart\u00F5es virtuais
   * Este recurso permite gerar CVV2 de forma din\u00E2mica para cart\u00F5es do tipo virtual com par\u00E2metro produto &#39;CVV2DINAMICO&#39; devidamente cadastrado com valor 1
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @param cvvDinamicoPersist Objeto de cria\u00E7\u00E3o para um CVV din\u00E2mico
   * @return CvvDinamicoResponse
   */
  public CvvDinamicoResponse cartaoGerarCvvDinamico(Long id, CvvDinamicoPersist cvvDinamicoPersist) throws ApiException {
    Object postBody = cvvDinamicoPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cartaoGerarCvvDinamico");
     }
     
     // verify the required parameter 'cvvDinamicoPersist' is set
     if (cvvDinamicoPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'cvvDinamicoPersist' when calling cartaoGerarCvvDinamico");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/cvv-dinamico".replaceAll("\\{format\\}","json")
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

    
    GenericType<CvvDinamicoResponse> returnType = new GenericType<CvvDinamicoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Cart\u00E3o
   * Este m\u00E9todo permite consultar as informa\u00E7\u00F5es b\u00E1sicas de um determinado Cart\u00E3o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @return CartaoDetalheResponse
   */
  public CartaoDetalheResponse consultarCartao(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarCartao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<CartaoDetalheResponse> returnType = new GenericType<CartaoDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar os dados de impress\u00E3o de um Cart\u00E3o
   * Esse recurso permite consultar os dados de impress\u00E3o de um cart\u00E3o
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id)
   * @return DadosCartaoImpressaoResponse
   */
  public DadosCartaoImpressaoResponse consultarDadosImpressao(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarDadosImpressao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/consultar-dados-impressao".replaceAll("\\{format\\}","json")
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

    
    GenericType<DadosCartaoImpressaoResponse> returnType = new GenericType<DadosCartaoImpressaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar Detalhes do Cart\u00E3o
   * Este m\u00E9todo permite consultar os dados necessarios de um cart\u00E3o para executar servi\u00E7os de autoriza\u00E7\u00E3o.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @return DadosCartaoResponse
   */
  public DadosCartaoResponse consultarDadosReaisCartao(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarDadosReaisCartao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/consultar-dados-reais".replaceAll("\\{format\\}","json")
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

    
    GenericType<DadosCartaoResponse> returnType = new GenericType<DadosCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os limites do Portador do Cart\u00E3o
   * Este m\u00E9todo permite consultar os Limites configurados para o Portador de um determinado Cart\u00E3o, seja ele o titular da conta ou um adicional, a partir do c\u00F3digo de identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse consultarLimitesDisponiveis(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLimitesDisponiveis");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/limites-disponibilidades".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Permite consultar um determinado Lote de Cart\u00F5es Pr\u00E9-Pago
   * Este m\u00E9todo permite consultar os cart\u00F5es pr\u00E9-pagos existentes na base do emissor atrav\u00E9s do id do lote
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do lote de cart\u00F5es (id)
   * @return LoteCartoesPrePagosResponse
   */
  public LoteCartoesPrePagosResponse consultarLoteCartoesPrePagos(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLoteCartoesPrePagos");
     }
     
    // create path and map variables
    String path = "/api/cartoes/lotes-cartoes-pre-pagos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<LoteCartoesPrePagosResponse> returnType = new GenericType<LoteCartoesPrePagosResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados do Portador do Cart\u00E3o
   * Este m\u00E9todo permite consultar as informa\u00E7\u00F5es do Portador de um determinado Cart\u00E3o a partir do c\u00F3digo de identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @return PortadorResponse
   */
  public PortadorResponse consultarPortador(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarPortador");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/portadores".replaceAll("\\{format\\}","json")
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

    
    GenericType<PortadorResponse> returnType = new GenericType<PortadorResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastrar cart\u00F5es MultiApp
   * Este recurso permite o cadastro de cart\u00F5es MultiApp
   * @param cartaoMultiAppPersist cartaoMultiAppPersist
   * @return VinculoCartoesResponse
   */
  public VinculoCartoesResponse criarCartoesMultiApp(CartaoMultiAppPersist cartaoMultiAppPersist) throws ApiException {
    Object postBody = cartaoMultiAppPersist;
    
     // verify the required parameter 'cartaoMultiAppPersist' is set
     if (cartaoMultiAppPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'cartaoMultiAppPersist' when calling criarCartoesMultiApp");
     }
     
    // create path and map variables
    String path = "/api/cartoes/gerar-cartoes-multiapp".replaceAll("\\{format\\}","json");

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

    
    GenericType<VinculoCartoesResponse> returnType = new GenericType<VinculoCartoesResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a defini\u00E7\u00E3o da senha de um cart\u00E3o
   * Esta opera\u00E7\u00E3o tem como objetivo permitir que o portador de um determinado cart\u00E3o possa definir uma senha a sua escolha
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id)
   * @param senhaDTO senhaDTO
   * @return String
   */
  public String definirSenhaCartao(Long id, SenhaDTO senhaDTO) throws ApiException {
    Object postBody = senhaDTO;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling definirSenhaCartao");
     }
     
     // verify the required parameter 'senhaDTO' is set
     if (senhaDTO == null) {
        throw new ApiException(400, "Missing the required parameter 'senhaDTO' when calling definirSenhaCartao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/senhas".replaceAll("\\{format\\}","json")
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
   * Realiza o desbloqueio de um determinado Cart\u00E3o
   * Este m\u00E9todo permite que seja desbloqueado um determinado cart\u00E3o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @return CartaoResponse
   */
  public CartaoResponse desbloquearCartao(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desbloquearCartao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/desbloquear".replaceAll("\\{format\\}","json")
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

    
    GenericType<CartaoResponse> returnType = new GenericType<CartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Permite gerar um novo Lote de Cart\u00F5es Pr\u00E9-Pago
   * Esta opera\u00E7\u00E3o tem como objetivo permitir que os Emissores gerem uma determinada quantidade de Cart\u00F5es Pr\u00E9-Pagos, de forma n\u00E3o nominal, os quais poder\u00E3o ser comercializados e posteriormente vinculados a um cliente que o adquirir. Para isso, al\u00E9m de definir quantos cart\u00F5es dever\u00E3o ser gerados, ser\u00E1 poss\u00EDvel definir qual a Origem Comercial, o Produto, o Tipo do Cart\u00E3o, a Imagem e o Endere\u00E7o para entrega dos Cart\u00F5es presentes no lote gerado. Por padr\u00E3o, todos os cart\u00F5es ser\u00E3o associados a um idPessoa fict\u00EDcio e receber\u00E1 um idConta \u00FAnico para cada um deles. Feito isso, os Cart\u00F5es gerados por esta opera\u00E7\u00E3o seguir\u00E3o os mesmos processos de impress\u00E3o via gr\u00E1fica previamente definidos entre o Emissor e a Conductor
   * @param idOrigemComercial C\u00F3digo de Identifica\u00E7\u00E3o da Origem Comercial (id)
   * @param idProduto C\u00F3digo de Identifica\u00E7\u00E3o do Produto (id)
   * @param idTipoCartao C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Cart\u00E3o (id)
   * @param idImagem C\u00F3digo de Identifica\u00E7\u00E3o da Imagem (id)
   * @param idEndereco C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o (id)
   * @param quantidadeCartoes N\u00FAmero de cart\u00F5es existentes no Lote
   * @param identificadorExterno N\u00FAmero de identifica\u00E7\u00E3o externo (utilizado pelo emissor)
   * @return LoteCartoesPrePagosResponse
   */
  public LoteCartoesPrePagosResponse gerarLoteCartoesPrePagos(Long idOrigemComercial, Long idProduto, Long idTipoCartao, Long idImagem, Long idEndereco, Integer quantidadeCartoes, String identificadorExterno) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/cartoes/lotes-cartoes-pre-pagos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoCartao", idTipoCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idImagem", idImagem));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEndereco", idEndereco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "quantidadeCartoes", quantidadeCartoes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "identificadorExterno", identificadorExterno));
    

    

    

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

    
    GenericType<LoteCartoesPrePagosResponse> returnType = new GenericType<LoteCartoesPrePagosResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Gerar uma nova via de Cart\u00E3o
   * Esta opera\u00E7\u00E3o tem como objetivo permitir que os Emissores ou seus clientes possam solicitar a gera\u00E7\u00E3o de uma nova via de Cart\u00E3o que ser\u00E1 encaminhando para impress\u00E3o e postagem de acordo com os fluxos padr\u00F5es j\u00E1 definidos pelo emissor. Para isso, \u00E9 preciso que o cliente j\u00E1 possua um cart\u00E3o gerado e informar o C\u00F3digo de Identifica\u00E7\u00E3o deste (idCartao) para que ele possa utilizar esta opera\u00E7\u00E3o. Assim, esta funcionalidade se aplica apenas para a gera\u00E7\u00E3o de cart\u00F5es f\u00EDsicos
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @param idImagem C\u00F3digo de Identifica\u00E7\u00E3o da imagem do cart\u00E3o (id)
   * @param cartaoMifareRequest cartaoMifareRequest
   * @return CartaoImpressaoResponse
   */
  public CartaoImpressaoResponse gerarNovaViaCartao(Long id, Long idImagem, CartaoMifareRequest cartaoMifareRequest) throws ApiException {
    Object postBody = cartaoMifareRequest;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarNovaViaCartao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/gerar-nova-via".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idImagem", idImagem));
    

    

    

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

    
    GenericType<CartaoImpressaoResponse> returnType = new GenericType<CartaoImpressaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Gerar nova via de cart\u00E3o m\u00FAltiplo
   * Este recurso permite gerar uma nova via de cart\u00E3o m\u00FAltiplo (com dois produtos relacionados)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @param cartaoMifareRequest cartaoMifareRequest
   * @return CartaoMultiAppImpressaoResponse
   */
  public CartaoMultiAppImpressaoResponse gerarNovaViaCartaoMultiApp(Long id, CartaoMifareRequest cartaoMifareRequest) throws ApiException {
    Object postBody = cartaoMifareRequest;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarNovaViaCartaoMultiApp");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/gerar-nova-via-multiplo".replaceAll("\\{format\\}","json")
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

    
    GenericType<CartaoMultiAppImpressaoResponse> returnType = new GenericType<CartaoMultiAppImpressaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Adiciona tarifa de ajuste da segunda via do cart\u00E3o
   * Esse recurso permite adicionar tar\u00EDfa de ajuste pela emiss\u00E3o da segunda via do cart\u00E3o
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id)
   * @return Object
   */
  public Object lancarTarifaReemissao(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling lancarTarifaReemissao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/lancar-tarifa-reemissao".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Cart\u00F5es gerados pelo Emissor
   * Este m\u00E9todo permite que sejam listados os cart\u00F5es existentes na base do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idStatusCartao C\u00F3digo de Identifica\u00E7\u00E3o do Status do Cart\u00E3o (id)
   * @param idEstagioCartao C\u00F3digo de Identifica\u00E7\u00E3o do Est\u00E1gio de Impress\u00E3o do Cart\u00E3o (id)
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta a qual o cart\u00E3o pertence (id)
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa a qual o cart\u00E3o pertence (id)
   * @param idProduto C\u00F3digo de Identifica\u00E7\u00E3o do Produto a qual o cart\u00E3o pertence (id)
   * @param tipoPortador Mostre o tipo do titular do cart\u00E3o, sendo: (&#39;T&#39;: titular, &#39;A&#39;: adicional)
   * @param numeroCartao Apresenta o n\u00FAmero do cart\u00E3o
   * @param nomeImpresso Apresenta o nome impresso no cart\u00E3o
   * @param dataGeracao Apresenta a data em que o cart\u00E3o foi gerado
   * @param dataStatusCartao Apresenta a data em que o idStatusCartao atual do cart\u00E3o fora aplicado, quando houver
   * @param dataEstagioCartao Apresenta a data em que o idEstagioCartao atual do cart\u00E3o fora aplicado, quando houver
   * @param dataValidade Mostrar a data da expira\u00E7\u00E3o do cart\u00E3o no formato aaaa-MM, quando houver
   * @param dataImpressao Apresenta a data em que o cart\u00E3o fora impresso, caso impress\u00E3o em loja, ou a data em que ele fora inclu\u00EDdo no arquivo para impress\u00E3o via gr\u00E1fica
   * @param arquivoImpressao Apresenta o nome do arquivo onde o cart\u00E3o fora inclu\u00EDdo para impress\u00E3o por uma gr\u00E1fica, quando houver
   * @param flagImpressaoOrigemComercial Quando ativa, indica que o cart\u00E3o fora impresso na Origem Comercial
   * @param flagProvisorio Quando ativa, indica que o cart\u00E3o \u00E9 provis\u00F3rio. Ou seja, \u00E9 um cart\u00E3o para uso tempor\u00E1rio quando se deseja permitir que o cliente transacione sem que ele tenha recebido um cart\u00E3o definitivo
   * @param codigoDesbloqueio Apresenta um c\u00F3digo espec\u00EDfico para ser utilizado como vari\u00E1vel no processo de desbloqueio do cart\u00E3o para emissores que querem usar esta funcionalidade
   * @param sequencialCartao N\u00FAmero sequencial do cart\u00E3o
   * @param identificadorExterno Identificador externo do cart\u00E3o
   * @param flagCartaoMifare Identifica se o cart\u00E3o cont\u00E9m a tecnologia mifare
   * @return PageCartaoResponse
   */
  public PageCartaoResponse listarCartoes(List<String> sort, Integer page, Integer limit, Long idStatusCartao, Long idEstagioCartao, Long idConta, Long idPessoa, Long idProduto, String tipoPortador, String numeroCartao, String nomeImpresso, String dataGeracao, String dataStatusCartao, String dataEstagioCartao, String dataValidade, String dataImpressao, String arquivoImpressao, Integer flagImpressaoOrigemComercial, Integer flagProvisorio, String codigoDesbloqueio, Integer sequencialCartao, Long identificadorExterno, Boolean flagCartaoMifare) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/cartoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idStatusCartao", idStatusCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstagioCartao", idEstagioCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoPortador", tipoPortador));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroCartao", numeroCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeImpresso", nomeImpresso));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataGeracao", dataGeracao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataStatusCartao", dataStatusCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataEstagioCartao", dataEstagioCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataValidade", dataValidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataImpressao", dataImpressao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "arquivoImpressao", arquivoImpressao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagImpressaoOrigemComercial", flagImpressaoOrigemComercial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagProvisorio", flagProvisorio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigoDesbloqueio", codigoDesbloqueio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sequencialCartao", sequencialCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "identificadorExterno", identificadorExterno));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagCartaoMifare", flagCartaoMifare));
    

    

    

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

    
    GenericType<PageCartaoResponse> returnType = new GenericType<PageCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Permite listar os Lotes de Cart\u00F5es Pr\u00E9-Pago
   * Este m\u00E9todo permite que sejam listados os cart\u00F5es pr\u00E9-pagos existentes na base do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idOrigemComercial C\u00F3digo de Identifica\u00E7\u00E3o da Origem Comercial (id)
   * @param idProduto C\u00F3digo de Identifica\u00E7\u00E3o do Produto (id)
   * @param idTipoCartao C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Cart\u00E3o (id)
   * @param idImagem C\u00F3digo de Identifica\u00E7\u00E3o da Imagem (id)
   * @param idEndereco C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o (id)
   * @param quantidadeCartoes N\u00FAmero de cart\u00F5es existentes no Lote
   * @param dataCadastro Data de Cadastro do Lote de Cart\u00F5es N\u00E3o Nominais
   * @param usuarioCadastro Nome do Usu\u00E1rio que criou o Lote
   * @param statusProcessamento Indica o Status de Processamento do Lote
   * @param identificadorExterno N\u00FAmero de identifica\u00E7\u00E3o externo (utilizado pelo emissor)
   * @return PageLoteCartoesPrePagosResponse
   */
  public PageLoteCartoesPrePagosResponse listarLotesCartoesPrePagos(List<String> sort, Integer page, Integer limit, Long idOrigemComercial, Long idProduto, Long idTipoCartao, Long idImagem, Long idEndereco, Integer quantidadeCartoes, String dataCadastro, String usuarioCadastro, Integer statusProcessamento, String identificadorExterno) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/cartoes/lotes-cartoes-pre-pagos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoCartao", idTipoCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idImagem", idImagem));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEndereco", idEndereco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "quantidadeCartoes", quantidadeCartoes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "usuarioCadastro", usuarioCadastro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "statusProcessamento", statusProcessamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "identificadorExterno", identificadorExterno));
    

    

    

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

    
    GenericType<PageLoteCartoesPrePagosResponse> returnType = new GenericType<PageLoteCartoesPrePagosResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a reativa\u00E7\u00E3o de um determinado Cart\u00E3o
   * Este m\u00E9todo permite a realiza\u00E7\u00E3o da reativa\u00E7\u00E3o de um determinado cart\u00E3o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @return CartaoResponse
   */
  public CartaoResponse reativarCartao(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling reativarCartao");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/reativar".replaceAll("\\{format\\}","json")
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

    
    GenericType<CartaoResponse> returnType = new GenericType<CartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza o desbloqueio de um cart\u00E3o bloqueado por tentativas de senha incorretas
   * Este m\u00E9todo permite que seja desbloqueado um determinado cart\u00E3o que foi bloqueado por tentativas de senha incorretas, a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @return CartaoResponse
   */
  public CartaoResponse resetarTentativasSenhaIncorreta(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling resetarTentativasSenhaIncorreta");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/desbloquear-senha-incorreta".replaceAll("\\{format\\}","json")
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

    
    GenericType<CartaoResponse> returnType = new GenericType<CartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Validar CVV do cart\u00E3o
   * Esse recurso permite a valida\u00E7\u00E3o do cvv de um cart\u00E3o
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o (id)
   * @param validaCVV validaCVV
   * @return String
   */
  public String validarCVV(Long id, ValidaCVVRequest validaCVV) throws ApiException {
    Object postBody = validaCVV;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling validarCVV");
     }
     
     // verify the required parameter 'validaCVV' is set
     if (validaCVV == null) {
        throw new ApiException(400, "Missing the required parameter 'validaCVV' when calling validarCVV");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/validar-cvv".replaceAll("\\{format\\}","json")
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
   * Permite validar um Cart\u00E3o com bandeira Mastercard a partir do de55
   * Esta opera\u00E7\u00E3o tem como objetivo permitir que os Emissores validem o DE55 gerado a partir da leitura de um chip EMV de um Cart\u00E3o com bandeira Mastercard a fim de verificar a sua autenticidade. A utiliza\u00E7\u00E3o desde m\u00E9todo tem diversas aplica\u00E7\u00F5es, sendo a principal delas a de Identifica\u00E7\u00E3o Positiva do Cart\u00E3o antes de permitir que o portador realize transa\u00E7\u00F5es diversas, como as de compra e saque na modalidade d\u00E9bito em conta corrente, dentre outras
   * @param numeroCartao N\u00FAmero do cart\u00E3o a ser validado
   * @param criptograma Criptograma do cart\u00E3o no formato de55
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse validarDE55Mastercard(String numeroCartao, String criptograma) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'numeroCartao' is set
     if (numeroCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarDE55Mastercard");
     }
     
     // verify the required parameter 'criptograma' is set
     if (criptograma == null) {
        throw new ApiException(400, "Missing the required parameter 'criptograma' when calling validarDE55Mastercard");
     }
     
    // create path and map variables
    String path = "/api/cartoes/validar-de55-mastercard".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "criptograma", criptograma));
    

    

    

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

    
    GenericType<ValidaCartaoResponse> returnType = new GenericType<ValidaCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Permite validar os dados impressos em um cart\u00E3o bandeirado
   * Esta opera\u00E7\u00E3o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado Cart\u00E3o a partir do envio dos dados sens\u00EDveis impressos nele. A utiliza\u00E7\u00E3o desde m\u00E9todo tem diversas aplica\u00E7\u00F5es, sendo a principal delas a de Identifica\u00E7\u00E3o Positiva do Cart\u00E3o para a realiza\u00E7\u00E3o de transa\u00E7\u00F5es e-commerce ou por meio de Centrais de Atendimento Eletr\u00F4nico (URA), dentre outras
   * @param numeroCartao N\u00FAmero do cart\u00E3o a ser validado
   * @param nomePortador Nome do portador do cart\u00E3o
   * @param dataValidade Data de validade do cart\u00E3o no formato yyyy-MM
   * @param codigoSeguranca C\u00F3digo de seguran\u00E7a do cart\u00E3o com tr\u00EAs n\u00FAmeros
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse validarDadosCartaoBandeirado(String numeroCartao, String nomePortador, String dataValidade, String codigoSeguranca) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'numeroCartao' is set
     if (numeroCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarDadosCartaoBandeirado");
     }
     
     // verify the required parameter 'nomePortador' is set
     if (nomePortador == null) {
        throw new ApiException(400, "Missing the required parameter 'nomePortador' when calling validarDadosCartaoBandeirado");
     }
     
     // verify the required parameter 'dataValidade' is set
     if (dataValidade == null) {
        throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling validarDadosCartaoBandeirado");
     }
     
     // verify the required parameter 'codigoSeguranca' is set
     if (codigoSeguranca == null) {
        throw new ApiException(400, "Missing the required parameter 'codigoSeguranca' when calling validarDadosCartaoBandeirado");
     }
     
    // create path and map variables
    String path = "/api/cartoes/validar-dados-impressos-bandeirados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome_portador", nomePortador));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data_validade", dataValidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigo_seguranca", codigoSeguranca));
    

    

    

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

    
    GenericType<ValidaCartaoResponse> returnType = new GenericType<ValidaCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Permite validar os dados impressos de um cartao n\u00E3o bandeirado
   * Esta opera\u00E7\u00E3o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado Cart\u00E3o a partir do envio dos dados sens\u00EDveis impressos nele. A utiliza\u00E7\u00E3o desde m\u00E9todo tem diversas aplica\u00E7\u00F5es, sendo a principal delas a de Identifica\u00E7\u00E3o Positiva do Cart\u00E3o para a realiza\u00E7\u00E3o de transa\u00E7\u00F5es e-commerce ou por meio de Centrais de Atendimento Eletr\u00F4nico (URA), dentre outras
   * @param numeroCartao N\u00FAmero do cart\u00E3o a ser validado
   * @param nomePortador Nome do portador do cart\u00E3o
   * @param dataValidade Data de validade do cart\u00E3o no formato yyyy-MM
   * @param codigoSeguranca C\u00F3digo de seguran\u00E7a do cart\u00E3o com tr\u00EAs n\u00FAmeros
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse validarDadosCartaoPrivate(String numeroCartao, String nomePortador, String dataValidade, String codigoSeguranca) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'numeroCartao' is set
     if (numeroCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarDadosCartaoPrivate");
     }
     
     // verify the required parameter 'nomePortador' is set
     if (nomePortador == null) {
        throw new ApiException(400, "Missing the required parameter 'nomePortador' when calling validarDadosCartaoPrivate");
     }
     
     // verify the required parameter 'dataValidade' is set
     if (dataValidade == null) {
        throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling validarDadosCartaoPrivate");
     }
     
     // verify the required parameter 'codigoSeguranca' is set
     if (codigoSeguranca == null) {
        throw new ApiException(400, "Missing the required parameter 'codigoSeguranca' when calling validarDadosCartaoPrivate");
     }
     
    // create path and map variables
    String path = "/api/cartoes/validar-dados-impressos-nao-bandeirados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome_portador", nomePortador));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data_validade", dataValidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigo_seguranca", codigoSeguranca));
    

    

    

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

    
    GenericType<ValidaCartaoResponse> returnType = new GenericType<ValidaCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Permite validar a senha de um Cart\u00E3o
   * Esta opera\u00E7\u00E3o tem como objetivo permitir validar que a senha informada pelo portador de um determinado cart\u00E3o est\u00E1 correta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id)
   * @param senhaDTO Representa o DTO de senha para usu\u00E1rio
   * @return ValidaSenhaCartaoResponse
   */
  public ValidaSenhaCartaoResponse validarSenha(Long id, SenhaDTO senhaDTO) throws ApiException {
    Object postBody = senhaDTO;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling validarSenha");
     }
     
     // verify the required parameter 'senhaDTO' is set
     if (senhaDTO == null) {
        throw new ApiException(400, "Missing the required parameter 'senhaDTO' when calling validarSenha");
     }
     
    // create path and map variables
    String path = "/api/cartoes/{id}/validar-senha".replaceAll("\\{format\\}","json")
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
      "application/json", "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<ValidaSenhaCartaoResponse> returnType = new GenericType<ValidaSenhaCartaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Permite validar um Cart\u00E3o Bandeirado a partir da Tarja
   * Esta opera\u00E7\u00E3o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado Cart\u00E3o a partir da leitura da tarja magn\u00E9tica do mesmo. A utiliza\u00E7\u00E3o desde m\u00E9todo tem diversas aplica\u00E7\u00F5es, sendo a principal delas a de Identifica\u00E7\u00E3o Positiva do Cart\u00E3o antes de permitir que o portador realize transa\u00E7\u00F5es diversas, como as de compra e saque na modalidade d\u00E9bito em conta corrente, dentre outras
   * @param numeroCartao N\u00FAmero do cart\u00E3o a ser validado
   * @param trilha1 Trilha 1 do cart\u00E3o a ser validado
   * @param trilha2 Trilha 2 do cart\u00E3o a ser validado
   * @return ValidaCartaoResponse
   */
  public ValidaCartaoResponse validarTarja(String numeroCartao, String trilha1, String trilha2) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'numeroCartao' is set
     if (numeroCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarTarja");
     }
     
     // verify the required parameter 'trilha1' is set
     if (trilha1 == null) {
        throw new ApiException(400, "Missing the required parameter 'trilha1' when calling validarTarja");
     }
     
     // verify the required parameter 'trilha2' is set
     if (trilha2 == null) {
        throw new ApiException(400, "Missing the required parameter 'trilha2' when calling validarTarja");
     }
     
    // create path and map variables
    String path = "/api/cartoes/validar-tarja".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "numero_cartao", numeroCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "trilha1", trilha1));
    
    queryParams.addAll(apiClient.parameterToPairs("", "trilha2", trilha2));
    

    

    

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

    
    GenericType<ValidaCartaoResponse> returnType = new GenericType<ValidaCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
