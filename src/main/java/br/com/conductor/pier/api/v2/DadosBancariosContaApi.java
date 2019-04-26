package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.DadosBancariosContaResponse;
import br.com.conductor.pier.api.v2.model.DadosBancariosContaUpdate;
import br.com.conductor.pier.api.v2.model.CdtTipoContaBancaria;
import br.com.conductor.pier.api.v2.model.PageDadosBancariosContaResponse;
import br.com.conductor.pier.api.v2.model.DadosBancariosContaPersist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DadosBancariosContaApi {
  private ApiClient apiClient;

  public DadosBancariosContaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DadosBancariosContaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Atualiza os dados da conta bancaria
   * Esse recurso permite que voc\u00EA altere os detalhes banc\u00E1rios de uma conta
   * @param id id
   * @param update update
   * @return DadosBancariosContaResponse
   */
  public DadosBancariosContaResponse alterar(Long id, DadosBancariosContaUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterar");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling alterar");
     }
     
    // create path and map variables
    String path = "/api/dados-bancarios-conta/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<DadosBancariosContaResponse> returnType = new GenericType<DadosBancariosContaResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta dados de um determinado tipo de conta banc\u00E1ria
   * Este m\u00E9todo permite consultar dados de um determinado tipo de conta banc\u00E1ria a partir de seu codigo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do tipo de conta banc\u00E1ria (id)
   * @return CdtTipoContaBancaria
   */
  public CdtTipoContaBancaria consultar(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
     }
     
    // create path and map variables
    String path = "/api/dados-bancarios-conta/tipos-contas-bancarias/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<CdtTipoContaBancaria> returnType = new GenericType<CdtTipoContaBancaria>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados banc\u00E1rios de uma determinada conta
   * Este m\u00E9todo permite consultar os dados banc\u00E1rios de uma determinada conta a partir de seu codigo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do dado banc\u00E1rio da conta (id)
   * @return DadosBancariosContaResponse
   */
  public DadosBancariosContaResponse consultar_0(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_0");
     }
     
    // create path and map variables
    String path = "/api/dados-bancarios-conta/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<DadosBancariosContaResponse> returnType = new GenericType<DadosBancariosContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados banc\u00E1rios a partir dos filtros informados
   * Este m\u00E9todo permite consultar os dados banc\u00E1rios a partir dos filtros informados
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do registro dos dados banc\u00E1rios (id)
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param codigoBanco Banco
   * @param numeroAgencia Ag\u00EAncia
   * @param numeroContaCorrente Conta Corrente
   * @param idTipoContaBancaria C\u00F3digo de Identifica\u00E7\u00E3o do tipo de conta banc\u00E1ria (id). 
   * @return PageDadosBancariosContaResponse
   */
  public PageDadosBancariosContaResponse listar(List<String> sort, Integer page, Integer limit, Long id, Long idConta, Long codigoBanco, Long numeroAgencia, String numeroContaCorrente, Long idTipoContaBancaria) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/dados-bancarios-conta".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "codigoBanco", codigoBanco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroContaCorrente", numeroContaCorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoContaBancaria", idTipoContaBancaria));
    

    

    

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

    
    GenericType<PageDadosBancariosContaResponse> returnType = new GenericType<PageDadosBancariosContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os tipos de contas banc\u00E1rias
   * Este recurso permite listar os tipos de contas banc\u00E1rias dispon\u00EDveis
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param descricao Descri\u00E7\u00E3o do tipo de conta banc\u00E1ria
   * @return CdtTipoContaBancaria
   */
  public CdtTipoContaBancaria listar_0(List<String> sort, Integer page, Integer limit, String descricao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/dados-bancarios-conta/tipos-contas-bancarias".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
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

    
    GenericType<CdtTipoContaBancaria> returnType = new GenericType<CdtTipoContaBancaria>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastra registro de dados banc\u00E1rios
   * Este recurso permite associar novos dados banc\u00E1rios a uma conta
   * @param dadosBancariosContaPersist dadosBancariosContaPersist
   * @return DadosBancariosContaResponse
   */
  public DadosBancariosContaResponse salvar(DadosBancariosContaPersist dadosBancariosContaPersist) throws ApiException {
    Object postBody = dadosBancariosContaPersist;
    
     // verify the required parameter 'dadosBancariosContaPersist' is set
     if (dadosBancariosContaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'dadosBancariosContaPersist' when calling salvar");
     }
     
    // create path and map variables
    String path = "/api/dados-bancarios-conta".replaceAll("\\{format\\}","json");

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

    
    GenericType<DadosBancariosContaResponse> returnType = new GenericType<DadosBancariosContaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
