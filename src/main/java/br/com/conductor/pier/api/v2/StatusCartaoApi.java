package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.StatusCartao;
import br.com.conductor.pier.api.v2.model.PageStatusCartoes;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class StatusCartaoApi {
  private ApiClient apiClient;

  public StatusCartaoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StatusCartaoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Apresenta os dados de um determinado Status Cart\u00C3\u00A3o 
   * Este m\u00C3\u00A9todo permite consultar os par\u00C3\u00A2metros de um determinado Status de Cart\u00C3\u00A3o a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).  
   * @param idStatusCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Est\u00C3\u00A1gio de Entrega do Cart\u00C3\u00A3o (id).
   * @return StatusCartao
   */
  public StatusCartao consultarStatusCartaoUsingGET(Long idStatusCartao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idStatusCartao' is set
     if (idStatusCartao == null) {
        throw new ApiException(400, "Missing the required parameter 'idStatusCartao' when calling consultarStatusCartaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/status-cartoes/{id_status_cartao}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id_status_cartao" + "\\}", apiClient.escapeString(idStatusCartao.toString()));

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

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<StatusCartao> returnType = new GenericType<StatusCartao>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as op\u00C3\u00A7\u00C3\u00B5es de Status do Cart\u00C3\u00A3o 
   * Este m\u00C3\u00A9todo permite que sejam listadas as possibilidades de Status que podem ser atribu\u00C3\u00ADdas aos Cart\u00C3\u00B5es.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id) 
   * @param nome Nome atribu\u00C3\u00ADdo ao Status de Entrega do Cart\u00C3\u00A3o.
   * @param flagAlteraStatus Quando ativa, indica que ao ser atribu\u00C3\u00ADdo um idStatusCartao com essa caracter\u00C3\u00ADstica, o cart\u00C3\u00A3o ter\u00C3\u00A1 o seu idStatusCartao alterado para o que fora escolhido. Caso contr\u00C3\u00A1rio, o idStatusCartao s\u00C3\u00B3 ser\u00C3\u00A1 alterado ap\u00C3\u00B3s o desbloqueio de um novo cart\u00C3\u00A3o do mesmo Portador e Conta.
   * @param flagCancelaNoDesbloqueio Quando ativa, indica que o cart\u00C3\u00A3o ativo que o portador possuir na mesma conta do cart\u00C3\u00A3o a ser desbloqueado, e que o status dele possua essa caracter\u00C3\u00ADstica, dever\u00C3\u00A1 ser cancelado quando um novo cart\u00C3\u00A3o for desbloqueado.
   * @param idStatusDestinoDesbloqueio Indica qual o idStatusCartao que que ser\u00C3\u00A1 atribu\u00C3\u00ADdo aos cart\u00C3\u00B5es que forem cancelados devido ao desbloqueio de um novo cart\u00C3\u00A3o.
   * @param flagCancelaConta Quando ativa, indica que cart\u00C3\u00B5es que tiverem um idStatusCartao atribu\u00C3\u00ADdo com essa caracter\u00C3\u00ADstica, e tal cart\u00C3\u00A3o seja de um titular (portador = 1), ter\u00C3\u00A3o a conta a qual o cart\u00C3\u00A3o pertence cancelada.
   * @param idStatusDestinoConta Indica qual o idStatusCartao que ser\u00C3\u00A1 atribu\u00C3\u00ADdo a conta, caso ela seja cancelada devido ao bloqueio de um cart\u00C3\u00A3o quando for utilizado um idStatusCartao no processo de Bloqueio que possua essa caracter\u00C3\u00ADstica.
   * @param flagCobraTarifa Quando ativa, indica que cart\u00C3\u00B5es que tiverem um idStatusCartao atribu\u00C3\u00ADdo com essa caracter\u00C3\u00ADstica, incluir\u00C3\u00A3o a cobran\u00C3\u00A7a de uma tarifa para a conta de acordo com os valores definidos nos par\u00C3\u00A2metros do emissor.
   * @param flagReemiteCartao Quando ativa, indica que cart\u00C3\u00B5es que tiverem este status atribu\u00C3\u00ADdo ter\u00C3\u00A3o um novo cart\u00C3\u00A3o gerado para o portador, para a mesma conta, automaticamente.
   * @param flagEmiteProvisorio Quando ativa, indica que poder\u00C3\u00A1 ser criado um novo cart\u00C3\u00A3o provis\u00C3\u00B3rio para o portador.
   * @param flagCadastroNovaSenha Quando ativa, indica que a senha cadastrada ser\u00C3\u00A1 exclu\u00C3\u00ADda no momento do Bloqueio do cart\u00C3\u00A3o com um idStatusCartao que possua essa caracter\u00C3\u00ADstica, sendo ent\u00C3\u00A3o necess\u00C3\u00A1rio o cadastro de uma nova senha.
   * @param flagOrigemTransferencia Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem realizar a transfer\u00C3\u00AAncia de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos para outros cart\u00C3\u00B5es.
   * @param flagDestinoTransferencia Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem receber transfer\u00C3\u00AAncias de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos oriundos de outros cart\u00C3\u00B5es.
   * @param flagExcecaoBandeira Quando ativa, indica que os Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo dever\u00C3\u00A3o ter a respectiva informa\u00C3\u00A7\u00C3\u00A3o de mudan\u00C3\u00A7a de status inclu\u00C3\u00ADda no arquivo de exce\u00C3\u00A7\u00C3\u00A3o da Bandeira, a fim de manter atualizado o cadastro do cart\u00C3\u00A3o nela para nortear o que fazer com as transa\u00C3\u00A7\u00C3\u00B5es quando o autorizador estiver indispon\u00C3\u00ADvel.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @return PageStatusCartoes
   */
  public PageStatusCartoes listarStatusCartoesUsingGET(Long id, String nome, Integer flagAlteraStatus, Integer flagCancelaNoDesbloqueio, Long idStatusDestinoDesbloqueio, Integer flagCancelaConta, Long idStatusDestinoConta, Integer flagCobraTarifa, Integer flagReemiteCartao, Integer flagEmiteProvisorio, Integer flagCadastroNovaSenha, Integer flagOrigemTransferencia, Integer flagDestinoTransferencia, Integer flagExcecaoBandeira, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/status-cartoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAlteraStatus", flagAlteraStatus));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagCancelaNoDesbloqueio", flagCancelaNoDesbloqueio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idStatusDestinoDesbloqueio", idStatusDestinoDesbloqueio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagCancelaConta", flagCancelaConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idStatusDestinoConta", idStatusDestinoConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagCobraTarifa", flagCobraTarifa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagReemiteCartao", flagReemiteCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagEmiteProvisorio", flagEmiteProvisorio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagCadastroNovaSenha", flagCadastroNovaSenha));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagOrigemTransferencia", flagOrigemTransferencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagDestinoTransferencia", flagDestinoTransferencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagExcecaoBandeira", flagExcecaoBandeira));
    
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

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageStatusCartoes> returnType = new GenericType<PageStatusCartoes>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

