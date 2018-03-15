package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.TipoTemplateResponse;
import br.com.conductor.pier.api.v2.model.TipoTemplateRequest;
import br.com.conductor.pier.api.v2.model.DocumentoTemplatePersist;
import br.com.conductor.pier.api.v2.model.DocumentoTemplateResponse;
import br.com.conductor.pier.api.v2.model.DocumentoDetalhadoResponse;
import br.com.conductor.pier.api.v2.model.IntegrarDocumentoRequest;
import br.com.conductor.pier.api.v2.model.DocumentoIntegracaoResponse;
import br.com.conductor.pier.api.v2.model.PageDocumentoResponse;
import br.com.conductor.pier.api.v2.model.PageDocumentoTemplateResponse;
import br.com.conductor.pier.api.v2.model.PageTipoTemplateResponse;
import br.com.conductor.pier.api.v2.model.DocumentoParametrosRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DocumentoApi {
  private ApiClient apiClient;

  public DocumentoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DocumentoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Altera o tipo de template
   * Esse recurso permite alterar os dados do tipo de template.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do tipo de template (id).
   * @param persist persist
   * @return TipoTemplateResponse
   */
  public TipoTemplateResponse alterarUsingPUT19(Long id, TipoTemplateRequest persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT19");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling alterarUsingPUT19");
     }
     
    // create path and map variables
    String path = "/api/tipos-templates/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoTemplateResponse> returnType = new GenericType<TipoTemplateResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Atualizar templates dos documentos
   * Esse recurso permite atualizar templates dos documentos.
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do documento template (id).
   * @param persist persist
   * @return DocumentoTemplateResponse
   */
  public DocumentoTemplateResponse atualizarUsingPUT2(Long id, DocumentoTemplatePersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarUsingPUT2");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling atualizarUsingPUT2");
     }
     
    // create path and map variables
    String path = "/api/templates-documentos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<DocumentoTemplateResponse> returnType = new GenericType<DocumentoTemplateResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta documentos
   * Esse recurso permite consultar um documento espec\u00EDfico a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do documento (id).
   * @return DocumentoDetalhadoResponse
   */
  public DocumentoDetalhadoResponse consultarUsingGET14(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET14");
     }
     
    // create path and map variables
    String path = "/api/documentos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<DocumentoDetalhadoResponse> returnType = new GenericType<DocumentoDetalhadoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar templates dos documentos
   * Esse recurso permite consultar templates dos documentos.
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do documento template (id).
   * @return DocumentoTemplateResponse
   */
  public DocumentoTemplateResponse consultarUsingGET15(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET15");
     }
     
    // create path and map variables
    String path = "/api/templates-documentos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<DocumentoTemplateResponse> returnType = new GenericType<DocumentoTemplateResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar tipo de template
   * Esse recurso permite consultar um determinado tipo de template a partir do id recebido e do id do emissor.
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do tipo de template (id).
   * @return TipoTemplateResponse
   */
  public TipoTemplateResponse consultarUsingGET39(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET39");
     }
     
    // create path and map variables
    String path = "/api/tipos-templates/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoTemplateResponse> returnType = new GenericType<TipoTemplateResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Integra um arquivo a reposit\u00F3rios remotos.
   * Este recurso permite integrar um documento ao reposit\u00F3rio pre-configurado.
   * @param integrarDocumentoRequest integrarDocumentoRequest
   * @return DocumentoIntegracaoResponse
   */
  public DocumentoIntegracaoResponse integrarUsingPOST1(IntegrarDocumentoRequest integrarDocumentoRequest) throws ApiException {
    Object postBody = integrarDocumentoRequest;
    
     // verify the required parameter 'integrarDocumentoRequest' is set
     if (integrarDocumentoRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'integrarDocumentoRequest' when calling integrarUsingPOST1");
     }
     
    // create path and map variables
    String path = "/api/documentos/integrar".replaceAll("\\{format\\}","json");

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

    
    GenericType<DocumentoIntegracaoResponse> returnType = new GenericType<DocumentoIntegracaoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista documentos
   * Esse recurso permite listar documentos.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param idTemplateDocumento C\u00F3digo de identifica\u00E7\u00E3o do template do documento.
   * @param nome Nome do documento.
   * @param extensao Extensao do documento.
   * @return PageDocumentoResponse
   */
  public PageDocumentoResponse listarUsingGET19(List<String> sort, Integer page, Integer limit, Long idTemplateDocumento, String nome, String extensao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/documentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTemplateDocumento", idTemplateDocumento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "extensao", extensao));
    

    

    

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

    
    GenericType<PageDocumentoResponse> returnType = new GenericType<PageDocumentoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os templates dos documentos
   * Esse recurso permite listar os templates dos documentos.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param idTipoTemplate C\u00F3digo de identifica\u00E7\u00E3o do tipo do template.
   * @return PageDocumentoTemplateResponse
   */
  public PageDocumentoTemplateResponse listarUsingGET20(List<String> sort, Integer page, Integer limit, Long idTipoTemplate) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/templates-documentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoTemplate", idTipoTemplate));
    

    

    

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

    
    GenericType<PageDocumentoTemplateResponse> returnType = new GenericType<PageDocumentoTemplateResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os tipos de templates
   * Esse recurso permite listar os tipos de templates associados ao emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageTipoTemplateResponse
   */
  public PageTipoTemplateResponse listarUsingGET47(List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-templates".replaceAll("\\{format\\}","json");

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

    
    GenericType<PageTipoTemplateResponse> returnType = new GenericType<PageTipoTemplateResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastra documentos
   * Esse recurso permite cadastrar documentos.
   * @param persist persist
   * @return DocumentoDetalhadoResponse
   */
  public DocumentoDetalhadoResponse salvarUsingPOST10(DocumentoParametrosRequest persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST10");
     }
     
    // create path and map variables
    String path = "/api/documentos".replaceAll("\\{format\\}","json");

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

    
    GenericType<DocumentoDetalhadoResponse> returnType = new GenericType<DocumentoDetalhadoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastra os templates dos documentos
   * Esse recurso permite cadastrar templates dos documentos.
   * @param persist persist
   * @return DocumentoTemplateResponse
   */
  public DocumentoTemplateResponse salvarUsingPOST11(DocumentoTemplatePersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST11");
     }
     
    // create path and map variables
    String path = "/api/templates-documentos".replaceAll("\\{format\\}","json");

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

    
    GenericType<DocumentoTemplateResponse> returnType = new GenericType<DocumentoTemplateResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastra os tipos de templates
   * Esse recurso permite cadastrar tipos de templates.
   * @param persist persist
   * @return TipoTemplateResponse
   */
  public TipoTemplateResponse salvarUsingPOST26(TipoTemplateRequest persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling salvarUsingPOST26");
     }
     
    // create path and map variables
    String path = "/api/tipos-templates".replaceAll("\\{format\\}","json");

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

    
    GenericType<TipoTemplateResponse> returnType = new GenericType<TipoTemplateResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
