package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.PropostaResponse;
import br.com.conductor.pier.api.v2.model.StatusPropostaUpdate;
import br.com.conductor.pier.api.v2.model.DocumentoPropostaResponse;
import br.com.conductor.pier.api.v2.model.DocumentoPropostaPersist;
import br.com.conductor.pier.api.v2.model.PageDocumentoCreditoResponse;
import br.com.conductor.pier.api.v2.model.PageDocumentoPropostaResponse;
import br.com.conductor.pier.api.v2.model.PageStatusPropostaResponse;
import br.com.conductor.pier.api.v2.model.PagePropostaResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GlobaltagpropostaApi {
  private ApiClient apiClient;

  public GlobaltagpropostaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GlobaltagpropostaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * {{{proposta_resource_alterar_status}}}
   * {{{proposta_resource_alterar_status_notes}}}
   * @param id {{{proposta_resource_alterar_status_param_id}}}
   * @param update update
   * @return PropostaResponse
   */
  public PropostaResponse alterarUsingPOST(Long id, StatusPropostaUpdate update) throws ApiException {
    Object postBody = update;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPOST");
     }
     
     // verify the required parameter 'update' is set
     if (update == null) {
        throw new ApiException(400, "Missing the required parameter 'update' when calling alterarUsingPOST");
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
   * {{{proposta_resource_consultar}}}
   * {{{proposta_resource_consultar_notes}}}
   * @param id {{{proposta_resource_consultar_param_id}}}
   * @return PropostaResponse
   */
  public PropostaResponse consultarUsingGET31(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET31");
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
   * {{{documento_proposta_resource_enviar}}}
   * {{{documento_proposta_resource_enviar_notes}}}
   * @param persist persist
   * @return DocumentoPropostaResponse
   */
  public DocumentoPropostaResponse enviarDocumentoPropostaUsingPOST(DocumentoPropostaPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling enviarDocumentoPropostaUsingPOST");
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
   * {{{documento_proposta_resource_listar_documentos_credito}}}
   * {{{documento_proposta_resource_listar_documentos_credito_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{documento_credito_request_id_value}}}
   * @param descricao {{{documento_credito_request_descricao_value}}}
   * @param tela {{{documento_credito_request_flag_tela_value}}}
   * @param doc {{{documento_credito_request_flag_doc_value}}}
   * @param idAtividadeDeCredito {{{documento_credito_request_id_atividade_credito_value}}}
   * @param obrigatorio {{{documento_credito_request_flag_obrigatorio_value}}}
   * @return PageDocumentoCreditoResponse
   */
  public PageDocumentoCreditoResponse listarDocumentosCreditoUsingGET(List<String> sort, Integer page, Integer limit, Long id, String descricao, Integer tela, Integer doc, Long idAtividadeDeCredito, Integer obrigatorio) throws ApiException {
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
   * {{{documento_proposta_resource_listar}}}
   * {{{documento_proposta_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{documento_proposta_request_id_value}}}
   * @param idProposta {{{documento_proposta_request_id_proposta_value}}}
   * @param idDocumentosCredito {{{documento_proposta_request_id_tipo_documento_value}}}
   * @param idStatusDocumentosCredito {{{documento_proposta_request_id_status_documento_credito_value}}}
   * @param idCondicoesDocumentosCredito {{{documento_proposta_request_id_condicao_documento_credito_value}}}
   * @param idTipoDocumentoCredito {{{documento_proposta_request_id_tipo_documento_credito_value}}}
   * @param idPessoaFisica {{{documento_proposta_request_id_pessoa_fisica_value}}}
   * @param idLogAtendimento {{{documento_proposta_request_id_log_atendimento_value}}}
   * @param responsavel {{{documento_proposta_request_responsavel_value}}}
   * @param flagDocumentoDigitalizado {{{documento_proposta_request_flag_documento_digitalizado_value}}}
   * @param documentoDigitalizado {{{documento_proposta_request_documento_digitalizado_value}}}
   * @param seqAnaliseCondicao {{{documento_proposta_request_seq_analise_condicao_value}}}
   * @param observacao {{{documento_proposta_request_observacao_value}}}
   * @param dataStatus {{{documento_proposta_request_data_status_value}}}
   * @return PageDocumentoPropostaResponse
   */
  public PageDocumentoPropostaResponse listarDocumentosPropostaUsingGET(List<String> sort, Integer page, Integer limit, Long id, Long idProposta, Long idDocumentosCredito, Long idStatusDocumentosCredito, Long idCondicoesDocumentosCredito, Long idTipoDocumentoCredito, Long idPessoaFisica, Long idLogAtendimento, String responsavel, Integer flagDocumentoDigitalizado, String documentoDigitalizado, Long seqAnaliseCondicao, String observacao, String dataStatus) throws ApiException {
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
   * {{{proposta_resource_listar_status}}}
   * {{{proposta_resource_listar_status_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param status {{{status_proposta_request_status_value}}}
   * @param flagPermiteAlteracao {{{status_proposta_request_flag_permite_alteracao_value}}}
   * @return PageStatusPropostaResponse
   */
  public PageStatusPropostaResponse listarStatusPropostaUsingGET(List<String> sort, Integer page, Integer limit, Integer status, Boolean flagPermiteAlteracao) throws ApiException {
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
  
  /**
   * {{{proposta_resource_listar}}}
   * {{{proposta_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param status {{{proposta_request_status_value}}}
   * @param idPessoaFisica {{{proposta_request_idPessoaFisica_value}}}
   * @return PagePropostaResponse
   */
  public PagePropostaResponse listarUsingGET38(List<String> sort, Integer page, Integer limit, Integer status, Long idPessoaFisica) throws ApiException {
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
  
}
