package br.com.conductor.pier.api.v1_1;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v1_1.invoker.ApiException;
import br.com.conductor.pier.api.v1_1.invoker.ApiClient;
import br.com.conductor.pier.api.v1_1.invoker.Configuration;
import br.com.conductor.pier.api.v1_1.invoker.Pair;

import br.com.conductor.pier.api.v1_1.model.StatusCarto;
import br.com.conductor.pier.api.v1_1.model.ListaDeStatusCartes;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class StatusCartoApi {
  private ApiClient apiClient;

  public StatusCartoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StatusCartoApi(ApiClient apiClient) {
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
   * @return StatusCarto
   */
  public StatusCarto consultarStatusCartaoUsingGET(Long idStatusCartao) throws ApiException {
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

    
    GenericType<StatusCarto> returnType = new GenericType<StatusCarto>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as op\u00C3\u00A7\u00C3\u00B5es de Status do Cart\u00C3\u00A3o 
   * Este m\u00C3\u00A9todo permite que sejam listadas as possibilidades de Status que podem ser atribu\u00C3\u00ADdas aos Cart\u00C3\u00B5es.
   * @param idStatusCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id).
   * @param nome Nome atribu\u00C3\u00ADdo ao Status de Entrega do Cart\u00C3\u00A3o.
   * @param flagAlteraStatus Quanto ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo n\u00C3\u00A3o ter\u00C3\u00A3o seu idStatusCartao Alterado, fazendo com que o Cart\u00C3\u00A3o atual possa continuar sendo utilizado at\u00C3\u00A9 o desbloqueio de um novo cart\u00C3\u00A3o.
   * @param flagDesbloqueio Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao poder\u00C3\u00A3o ser Desbloqueados.
   * @param flagReversaoDesbloqueio Quando ativa, indica que o cart\u00C3\u00A3o, mesmo tendo sido bloqueado, poder\u00C3\u00A1 ter o processo desfeito.
   * @param idStatusDestinoDesbloqueio Indica qual o idStatusCartao que deve ser atribu\u00C3\u00ADdo a um idCartao quando ele for desbloqueado.
   * @param flagCancelaCartao Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o o cart\u00C3\u00A3o Cancelado. 
   * @param flagReversaoCancelamento Quando ativa, indica que o cart\u00C3\u00A3o, mesmo tendo sido cancelado, poder\u00C3\u00A1 ter o processo desfeito.
   * @param flagEmiteProvisorio Quando ativa, indica que os portadores que tiverem seus cart\u00C3\u00B5es associados a idStatusCartao com esta flag poder\u00C3\u00A3o solicitar a emiss\u00C3\u00A3o de um cart\u00C3\u00A3o provis\u00C3\u00B3rio at\u00C3\u00A9 que um novo cart\u00C3\u00A3o definitivo seja recebido. 
   * @param flagCancelaConta Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o a conta Cancelada.
   * @param idStatusDestinoConta Indica qual o idStatusConta que ser\u00C3\u00A1 atribu\u00C3\u00ADdo ao idConta que tiver o Cartao do titular da mesma cancelado por um idStatusCartao que recomenda o cancelamento da conta.
   * @param flagReemiteCartao Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o um novo cart\u00C3\u00A3o automaticamente gerado.
   * @param flagCobraTarifa Quando ativa, indica que Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o a cobran\u00C3\u00A7a de tarifa lan\u00C3\u00A7ada junto a gera\u00C3\u00A7\u00C3\u00A3o do novo cart\u00C3\u00A3o, desde que o Produto ao qual o cart\u00C3\u00A3o pertence possua o respectivo par\u00C3\u00A2metro configurado.
   * @param flagOrigemTransferencia Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem realizar a transfer\u00C3\u00AAncia de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos para outros cart\u00C3\u00B5es.
   * @param flagDestinoTransferencia Quando ativa, indica que Cart\u00C3\u00B5es com este idStatusCartao podem receber transfer\u00C3\u00AAncias de cr\u00C3\u00A9ditos/d\u00C3\u00A9bitos oriundos de outros cart\u00C3\u00B5es.
   * @param flagCadastroSenha Quando ativa, indica se poder\u00C3\u00A1 ser realizado o cadastro de uma senha para o Cart\u00C3\u00A3o.
   * @param flagCadastroNovaSenha Quando ativa, indica que os Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo ter\u00C3\u00A3o a senha atual exclu\u00C3\u00ADda.
   * @param flagExcecaoBandeira Quando ativa, indica que os Cart\u00C3\u00B5es que tiverem este idStatusCartao atribu\u00C3\u00ADdo dever\u00C3\u00A3o ter a respectiva informa\u00C3\u00A7\u00C3\u00A3o de mudan\u00C3\u00A7a de status inclu\u00C3\u00ADda no arquivo de exce\u00C3\u00A7\u00C3\u00A3o da Bandeira, a fim de manter atualizado o cadastro do cart\u00C3\u00A3o nela para nortear o que fazer com as transa\u00C3\u00A7\u00C3\u00B5es quando o autorizador estiver indispon\u00C3\u00ADvel.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @return ListaDeStatusCartes
   */
  public ListaDeStatusCartes listarStatusCartoesUsingGET(Long idStatusCartao, String nome, String flagAlteraStatus, String flagDesbloqueio, String flagReversaoDesbloqueio, Long idStatusDestinoDesbloqueio, String flagCancelaCartao, String flagReversaoCancelamento, String flagEmiteProvisorio, String flagCancelaConta, Long idStatusDestinoConta, String flagReemiteCartao, String flagCobraTarifa, String flagOrigemTransferencia, String flagDestinoTransferencia, String flagCadastroSenha, String flagCadastroNovaSenha, String flagExcecaoBandeira, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/status-cartoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id_status_cartao", idStatusCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flag_altera_status", flagAlteraStatus));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flag_desbloqueio", flagDesbloqueio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flag_reversao_desbloqueio", flagReversaoDesbloqueio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id_status_destino_desbloqueio", idStatusDestinoDesbloqueio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flag_cancela_cartao", flagCancelaCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flag_reversao_cancelamento", flagReversaoCancelamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flag_emite_provisorio", flagEmiteProvisorio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flag_cancela_conta", flagCancelaConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id_status_destino_conta", idStatusDestinoConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flag_reemite_cartao", flagReemiteCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flag_cobra_tarifa", flagCobraTarifa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flag_origem_transferencia", flagOrigemTransferencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flag_destino_transferencia", flagDestinoTransferencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flag_cadastro_senha", flagCadastroSenha));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flag_cadastro_nova_senha", flagCadastroNovaSenha));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flag_excecao_bandeira", flagExcecaoBandeira));
    
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

    
    GenericType<ListaDeStatusCartes> returnType = new GenericType<ListaDeStatusCartes>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

