package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.PropostaResponse;
import br.com.conductor.pier.api.v2.model.StatusPropostaUpdate;
import br.com.conductor.pier.api.v2.model.PropostaParcialUpdate;
import br.com.conductor.pier.api.v2.model.DocumentoPropostaResponse;
import br.com.conductor.pier.api.v2.model.DocumentoPropostaPersist;
import br.com.conductor.pier.api.v2.model.PagePropostaResponse;
import br.com.conductor.pier.api.v2.model.PageDocumentoCreditoResponse;
import br.com.conductor.pier.api.v2.model.PageDocumentoPropostaResponse;
import br.com.conductor.pier.api.v2.model.PageStatusPropostaResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PropostaApi {
  private ApiClient apiClient;

  public PropostaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PropostaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Changes the status of a proposal
   * This service changes the status of a proposal
   * @param id Proposal Identification Code (id)
   * @param update update
   * @return PropostaResponse
   */
  public PropostaResponse alterar(Long id, StatusPropostaUpdate update) throws ApiException {
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
    String path = "/api/propostas/{id}/alterar-status".replaceAll("\\{format\\}","json")
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

    
    GenericType<PropostaResponse> returnType = new GenericType<PropostaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Partially updates a proposal.
   * This feature allows you to partially update a proposal.
   * @param id Propostal Identifier
   * @param propostaParcialUpdate propostaParcialUpdate
   * @return PropostaResponse
   */
  public PropostaResponse alterarParcial(Long id, PropostaParcialUpdate propostaParcialUpdate) throws ApiException {
    Object postBody = propostaParcialUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarParcial");
     }
     
     // verify the required parameter 'propostaParcialUpdate' is set
     if (propostaParcialUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'propostaParcialUpdate' when calling alterarParcial");
     }
     
    // create path and map variables
    String path = "/api/propostas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<PropostaResponse> returnType = new GenericType<PropostaResponse>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Search for a proposal by its identifier
   * This service searches for a proposal by its identifier
   * @param id Proposal Identification Code (id)
   * @return PropostaResponse
   */
  public PropostaResponse consultar(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
     }
     
    // create path and map variables
    String path = "/api/propostas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<PropostaResponse> returnType = new GenericType<PropostaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Create a new document for a proposal
   * Create a new document for a specific proposal and send a image file related to this document 
   * @param persist persist
   * @return DocumentoPropostaResponse
   */
  public DocumentoPropostaResponse enviarDocumentoProposta(DocumentoPropostaPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling enviarDocumentoProposta");
     }
     
    // create path and map variables
    String path = "/api/documentos-propostas".replaceAll("\\{format\\}","json");

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

    
    GenericType<DocumentoPropostaResponse> returnType = new GenericType<DocumentoPropostaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List all proposals
   * This service list all proposals
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param status Proposal status
   * @param idPessoaFisica idPhysicalPerson
   * @return PagePropostaResponse
   */
  public PagePropostaResponse listar(List<String> sort, Integer page, Integer limit, Integer status, Long idPessoaFisica) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/propostas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoaFisica", idPessoaFisica));
    

    

    

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

    
    GenericType<PagePropostaResponse> returnType = new GenericType<PagePropostaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List all credit documents 
   * Lists all credit documents which are the types of documents for a proposal
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Identification code of the credit document(id)
   * @param descricao Description of the type for the credit document
   * @param tela Flag Screen
   * @param doc Flag Document
   * @param idAtividadeDeCredito Identification code of the AtividadeCredito(id)
   * @param obrigatorio Flag Obligatory
   * @return PageDocumentoCreditoResponse
   */
  public PageDocumentoCreditoResponse listarDocumentosCredito(List<String> sort, Integer page, Integer limit, Long id, String descricao, Integer tela, Integer doc, Long idAtividadeDeCredito, Integer obrigatorio) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/documentos-creditos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tela", tela));
    
    queryParams.addAll(apiClient.parameterToPairs("", "doc", doc));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idAtividadeDeCredito", idAtividadeDeCredito));
    
    queryParams.addAll(apiClient.parameterToPairs("", "obrigatorio", obrigatorio));
    

    

    

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

    
    GenericType<PageDocumentoCreditoResponse> returnType = new GenericType<PageDocumentoCreditoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List documents for a proposal
   * Lists the documents for a proposa
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Idenfitication code of the document proposal
   * @param idProposta Idenfitication code of the proposal
   * @param idDocumentosCredito Idenfitication code of the type of document
   * @param idStatusDocumentosCredito Idenfitication code of credit document status
   * @param idCondicoesDocumentosCredito Idenfitication code of credit credit condition
   * @param idTipoDocumentoCredito Idenfitication code of credit document type
   * @param idPessoaFisica Idenfitication code of person
   * @param idLogAtendimento Idenfitication code of log
   * @param responsavel Responsible
   * @param flagDocumentoDigitalizado Flag for digitalization of the document
   * @param documentoDigitalizado Name of the digital document
   * @param seqAnaliseCondicao Analytical Sequence code
   * @param observacao Note
   * @param dataStatus Status Date
   * @return PageDocumentoPropostaResponse
   */
  public PageDocumentoPropostaResponse listarDocumentosProposta(List<String> sort, Integer page, Integer limit, Long id, Long idProposta, Long idDocumentosCredito, Long idStatusDocumentosCredito, Long idCondicoesDocumentosCredito, Long idTipoDocumentoCredito, Long idPessoaFisica, Long idLogAtendimento, String responsavel, Integer flagDocumentoDigitalizado, String documentoDigitalizado, Long seqAnaliseCondicao, String observacao, String dataStatus) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/documentos-propostas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProposta", idProposta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idDocumentosCredito", idDocumentosCredito));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idStatusDocumentosCredito", idStatusDocumentosCredito));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idCondicoesDocumentosCredito", idCondicoesDocumentosCredito));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoDocumentoCredito", idTipoDocumentoCredito));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoaFisica", idPessoaFisica));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idLogAtendimento", idLogAtendimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "responsavel", responsavel));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagDocumentoDigitalizado", flagDocumentoDigitalizado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "documentoDigitalizado", documentoDigitalizado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "seqAnaliseCondicao", seqAnaliseCondicao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "observacao", observacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataStatus", dataStatus));
    

    

    

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

    
    GenericType<PageDocumentoPropostaResponse> returnType = new GenericType<PageDocumentoPropostaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lists all possible statuses in existing proposals
   * This service lists all possible statuses in existing proposals
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param status Proposal status
   * @param flagPermiteAlteracao Flag that allows you to change the status of the proposal
   * @return PageStatusPropostaResponse
   */
  public PageStatusPropostaResponse listarStatusProposta(List<String> sort, Integer page, Integer limit, Integer status, Boolean flagPermiteAlteracao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/status-propostas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagPermiteAlteracao", flagPermiteAlteracao));
    

    

    

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

    
    GenericType<PageStatusPropostaResponse> returnType = new GenericType<PageStatusPropostaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
