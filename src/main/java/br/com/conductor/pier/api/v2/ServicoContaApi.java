package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.AdesaoPacoteTarifaPersist;
import br.com.conductor.pier.api.v2.model.AdesaoPacoteTarifaResponse;
import br.com.conductor.pier.api.v2.model.PageServicoContaResponse;
import br.com.conductor.pier.api.v2.model.PageAnuidadeResponse;
import br.com.conductor.pier.api.v2.model.PageOperadoraResponse;
import br.com.conductor.pier.api.v2.model.PageTipoServicoResponse;
import br.com.conductor.pier.api.v2.model.RepresentaoDaEntradaDoRecursoDeCadastrarUmServioConta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ServicoContaApi {
  private ApiClient apiClient;

  public ServicoContaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ServicoContaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Realiza a ades\u00E3o de um pacote de tarifa
   * Esse recurso permite \u00E0 conta aderir um pacote de tarifa
   * @param id Id da conta
   * @param adesaoPacoteTarifaPersist adesaoPacoteTarifaPersist
   * @return AdesaoPacoteTarifaResponse
   */
  public AdesaoPacoteTarifaResponse aderirPacoteTarifa(Long id, AdesaoPacoteTarifaPersist adesaoPacoteTarifaPersist) throws ApiException {
    Object postBody = adesaoPacoteTarifaPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling aderirPacoteTarifa");
     }
     
     // verify the required parameter 'adesaoPacoteTarifaPersist' is set
     if (adesaoPacoteTarifaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'adesaoPacoteTarifaPersist' when calling aderirPacoteTarifa");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/adesoes-pacotes-tarifas".replaceAll("\\{format\\}","json")
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

    
    GenericType<AdesaoPacoteTarifaResponse> returnType = new GenericType<AdesaoPacoteTarifaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Atribuir Anuidade
   * Esse recurso permite configurar qual a regra de Anuidade que ser\u00E1 atribu\u00EDda a uma determinada Conta
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param idAnuidade Identificador da anuidade
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param DDD DDD do celular
   * @param celular N\u00FAmero do celular
   * @param idOperadora Identificador da operadora do celular
   * @param idOrigemComercial Identificador da origem comercial
   * @return Object
   */
  public Object ativarAnuidade(Long id, Long idAnuidade, List<String> sort, Integer page, Integer limit, String DDD, String celular, Long idOperadora, Long idOrigemComercial) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ativarAnuidade");
     }
     
     // verify the required parameter 'idAnuidade' is set
     if (idAnuidade == null) {
        throw new ApiException(400, "Missing the required parameter 'idAnuidade' when calling ativarAnuidade");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/atribuir-anuidade".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idAnuidade", idAnuidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "DDD", DDD));
    
    queryParams.addAll(apiClient.parameterToPairs("", "celular", celular));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idOperadora", idOperadora));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    

    

    

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
   * Ativa o servi\u00E7o de envio de fatura por email
   * Este recurso ativa o servi\u00E7o de envio de fatura por email
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @return Object
   */
  public Object ativarEnvioFaturaEmail(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ativarEnvioFaturaEmail");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/ativar-fatura-email".replaceAll("\\{format\\}","json")
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
   * Desativa servi\u00E7o das contas
   * Desativa servi\u00E7o das contas
   * @param id C\u00F3digo Identificador do servi\u00E7o conta
   * @return Object
   */
  public Object desativar(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativar");
     }
     
    // create path and map variables
    String path = "/api/contas/servicos/{id}".replaceAll("\\{format\\}","json")
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
   * Desativa o servi\u00E7o de envio de fatura por email
   * Este recurso desativa o servi\u00E7o de envio de fatura por email
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @return Object
   */
  public Object desativarEnvioFaturaEmail(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarEnvioFaturaEmail");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/desativar-fatura-email".replaceAll("\\{format\\}","json")
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
   * Lista os servi\u00E7os ativos
   * Lista os servi\u00E7os ativos
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idConta C\u00F3digo Identificador da conta
   * @param idTipoServico C\u00F3digo Identificador do tipo de servi\u00E7o
   * @return PageServicoContaResponse
   */
  public PageServicoContaResponse listar(List<String> sort, Integer page, Integer limit, Long idConta, Long idTipoServico) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/contas/servicos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoServico", idTipoServico));
    

    

    

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

    
    GenericType<PageServicoContaResponse> returnType = new GenericType<PageServicoContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar Anuidades
   * Lista as anuidades
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageAnuidadeResponse
   */
  public PageAnuidadeResponse listarAnuidades(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/anuidades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
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

    
    GenericType<PageAnuidadeResponse> returnType = new GenericType<PageAnuidadeResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar Operadoras
   * Lista as operadoras
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageOperadoraResponse
   */
  public PageOperadoraResponse listarOperadorasTelefonicas(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/operadoras-telefonicas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
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

    
    GenericType<PageOperadoraResponse> returnType = new GenericType<PageOperadoraResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Tipos de Servi\u00E7os
   * Esse recurso permite listar os Tipos de Servi\u00E7os
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageTipoServicoResponse
   */
  public PageTipoServicoResponse listarTipoServico(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-servicos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageTipoServicoResponse> returnType = new GenericType<PageTipoServicoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Ativa servi\u00E7os para contas
   * Ativa servi\u00E7os para contas
   * @param servicoContaPersist servicoContaPersist
   * @return Object
   */
  public Object salvar(RepresentaoDaEntradaDoRecursoDeCadastrarUmServioConta servicoContaPersist) throws ApiException {
    Object postBody = servicoContaPersist;
    
     // verify the required parameter 'servicoContaPersist' is set
     if (servicoContaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'servicoContaPersist' when calling salvar");
     }
     
    // create path and map variables
    String path = "/api/contas/servicos".replaceAll("\\{format\\}","json");

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
  
}
