package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.PessoaJuridicaResponse;
import br.com.conductor.pier.api.v2.model.TerminalUpdate;
import br.com.conductor.pier.api.v2.model.TerminalResponse;
import br.com.conductor.pier.api.v2.model.EstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.PageEstabelecimentoResponse;
import br.com.conductor.pier.api.v2.model.PagePessoaJuridicaResponse;
import br.com.conductor.pier.api.v2.model.PageTerminalResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class EstabelecimentoApi {
  private ApiClient apiClient;

  public EstabelecimentoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EstabelecimentoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Alterar Pessoa Jur\u00C3\u00ADdica
   * Altera uma pessoa jur\u00C3\u00ADdica.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da pessoa jur\u00C3\u00ADdica
   * @param razaoSocial Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   * @param inscricaoEstadual N\u00C3\u00BAmero da inscri\u00C3\u00A7\u00C3\u00A3o estadual
   * @param contato Nome da pessoa para entrar em contato
   * @param banco C\u00C3\u00B3digo do banco
   * @param agencia Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   * @param digitoVerificadorAgencia D\u00C3\u00ADgito Verificador da ag\u00C3\u00AAncia
   * @param contaCorrente C\u00C3\u00B3digo da Conta Corrente
   * @param digitoVerificadorContaCorrente D\u00C3\u00ADgito Verificador da Conta Corrente
   * @return PessoaJuridicaResponse
   */
  public PessoaJuridicaResponse alterarUsingPUT10(Long id, String razaoSocial, String inscricaoEstadual, String contato, Integer banco, Integer agencia, String digitoVerificadorAgencia, String contaCorrente, String digitoVerificadorContaCorrente) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT10");
     }
     
     // verify the required parameter 'razaoSocial' is set
     if (razaoSocial == null) {
        throw new ApiException(400, "Missing the required parameter 'razaoSocial' when calling alterarUsingPUT10");
     }
     
    // create path and map variables
    String path = "/api/pessoas-juridicas/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "razaoSocial", razaoSocial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "inscricaoEstadual", inscricaoEstadual));
    
    queryParams.addAll(apiClient.parameterToPairs("", "contato", contato));
    
    queryParams.addAll(apiClient.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "agencia", agencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "digitoVerificadorAgencia", digitoVerificadorAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "contaCorrente", contaCorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "digitoVerificadorContaCorrente", digitoVerificadorContaCorrente));
    

    

    

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

    
    GenericType<PessoaJuridicaResponse> returnType = new GenericType<PessoaJuridicaResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Altera um Terminal
   * Este m\u00C3\u00A9todo realiza a altera\u00C3\u00A7\u00C3\u00A3o dos Terminais.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do terminal (id).
   * @param terminalUpdate terminalUpdate
   * @return TerminalResponse
   */
  public TerminalResponse alterarUsingPUT13(Long id, TerminalUpdate terminalUpdate) throws ApiException {
    Object postBody = terminalUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT13");
     }
     
     // verify the required parameter 'terminalUpdate' is set
     if (terminalUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'terminalUpdate' when calling alterarUsingPUT13");
     }
     
    // create path and map variables
    String path = "/api/terminais/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TerminalResponse> returnType = new GenericType<TerminalResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastrar Pessoa Jur\u00C3\u00ADdica
   * Cadastra uma pessoa jur\u00C3\u00ADdica.
   * @param razaoSocial Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   * @param cnpj C\u00C3\u00B3digo do Cadastro Nacional de Pessoas Jur\u00C3\u00ADdicas
   * @param inscricaoEstadual N\u00C3\u00BAmero da inscri\u00C3\u00A7\u00C3\u00A3o estadual
   * @param contato Nome da pessoa para entrar em contato
   * @param banco C\u00C3\u00B3digo do banco
   * @param agencia Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   * @param digitoVerificadorAgencia D\u00C3\u00ADgito Verificador da ag\u00C3\u00AAncia
   * @param contaCorrente C\u00C3\u00B3digo da Conta Corrente
   * @param digitoVerificadorContaCorrente D\u00C3\u00ADgito Verificador da Conta Corrente
   * @return PessoaJuridicaResponse
   */
  public PessoaJuridicaResponse cadastrarUsingPOST2(String razaoSocial, String cnpj, String inscricaoEstadual, String contato, Integer banco, Integer agencia, String digitoVerificadorAgencia, String contaCorrente, String digitoVerificadorContaCorrente) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'razaoSocial' is set
     if (razaoSocial == null) {
        throw new ApiException(400, "Missing the required parameter 'razaoSocial' when calling cadastrarUsingPOST2");
     }
     
     // verify the required parameter 'cnpj' is set
     if (cnpj == null) {
        throw new ApiException(400, "Missing the required parameter 'cnpj' when calling cadastrarUsingPOST2");
     }
     
    // create path and map variables
    String path = "/api/pessoas-juridicas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "razaoSocial", razaoSocial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cnpj", cnpj));
    
    queryParams.addAll(apiClient.parameterToPairs("", "inscricaoEstadual", inscricaoEstadual));
    
    queryParams.addAll(apiClient.parameterToPairs("", "contato", contato));
    
    queryParams.addAll(apiClient.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "agencia", agencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "digitoVerificadorAgencia", digitoVerificadorAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "contaCorrente", contaCorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "digitoVerificadorContaCorrente", digitoVerificadorContaCorrente));
    

    

    

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

    
    GenericType<PessoaJuridicaResponse> returnType = new GenericType<PessoaJuridicaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar estabelecimento por id
   * Consulta os detalhes de um determinado estabelecimento
   * @param id Id
   * @return EstabelecimentoResponse
   */
  public EstabelecimentoResponse consultarUsingGET14(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET14");
     }
     
    // create path and map variables
    String path = "/api/estabelecimentos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<EstabelecimentoResponse> returnType = new GenericType<EstabelecimentoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consultar pessoa jur\u00C3\u00ADdica
   * Consulta uma pessoa jur\u00C3\u00ADdica atrav\u00C3\u00A9s do seu identificador.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da pessoa jur\u00C3\u00ADdica
   * @return PessoaJuridicaResponse
   */
  public PessoaJuridicaResponse consultarUsingGET19(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET19");
     }
     
    // create path and map variables
    String path = "/api/pessoas-juridicas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<PessoaJuridicaResponse> returnType = new GenericType<PessoaJuridicaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Terminal
   * Este m\u00C3\u00A9todo permite consultar um determinado Terminal a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Terminal (id).
   * @return TerminalResponse
   */
  public TerminalResponse consultarUsingGET26(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET26");
     }
     
    // create path and map variables
    String path = "/api/terminais/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TerminalResponse> returnType = new GenericType<TerminalResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista Estabelecimentos
   * Lista todas os Estabelecimentos
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento (id).
   * @param numeroReceitaFederal Apresenta o n\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento na Receita Federal.
   * @param nome Nome do Estabelecimento.
   * @param descricao Raz\u00C3\u00A3o Social do Estabelecimento.
   * @param nomeFantasia T\u00C3\u00ADtulo Comercial do Estabelecimento.
   * @param cep C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP).
   * @param nomeLogradouro Nome do Logradouro.
   * @param numeroEndereco N\u00C3\u00BAmero do endere\u00C3\u00A7o.
   * @param complemento Descri\u00C3\u00A7\u00C3\u00B5es complementares referente ao endere\u00C3\u00A7o.
   * @param bairro Nome do bairro do endere\u00C3\u00A7o.
   * @param cidade Nome da cidade do endere\u00C3\u00A7o.
   * @param uf Sigla de identifica\u00C3\u00A7\u00C3\u00A3o da Unidade Federativa do endere\u00C3\u00A7o.
   * @param pais Nome do pa\u00C3\u00ADs.
   * @param dataCadastramento Data de Cadastro do Estabelecimento, no formato yyyy-MM-dd.
   * @param contato Nome da pessoa para contato com o Estabelecimento.
   * @param email E-mail da pessoa para contato com o Estabelecimento.
   * @param flagArquivoSecrFazenda Indica se o estabelecimento ser\u00C3\u00A1 inclu\u00C3\u00ADdo no arquivo de registro para a Secretaria da Fazenda Estadual.
   * @param flagCartaoDigitado Indica se o estabelecimento poder\u00C3\u00A1 originar transa\u00C3\u00A7\u00C3\u00B5es sem a leitura da tarja ou do chip do cart\u00C3\u00A3o.
   * @param inativo Indica se o estabelecimento est\u00C3\u00A1 inativo.
   * @return PageEstabelecimentoResponse
   */
  public PageEstabelecimentoResponse listarUsingGET18(List<String> sort, Integer page, Integer limit, Long id, Long numeroReceitaFederal, String nome, String descricao, String nomeFantasia, String cep, String nomeLogradouro, Long numeroEndereco, String complemento, String bairro, String cidade, String uf, String pais, String dataCadastramento, String contato, String email, Integer flagArquivoSecrFazenda, Integer flagCartaoDigitado, Integer inativo) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/estabelecimentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeFantasia", nomeFantasia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cep", cep));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeLogradouro", nomeLogradouro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroEndereco", numeroEndereco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "bairro", bairro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cidade", cidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "uf", uf));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pais", pais));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCadastramento", dataCadastramento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "contato", contato));
    
    queryParams.addAll(apiClient.parameterToPairs("", "email", email));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagArquivoSecrFazenda", flagArquivoSecrFazenda));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagCartaoDigitado", flagCartaoDigitado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "inativo", inativo));
    

    

    

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

    
    GenericType<PageEstabelecimentoResponse> returnType = new GenericType<PageEstabelecimentoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar pessoas jur\u00C3\u00ADdicas
   * Lista pessoas jur\u00C3\u00ADdicas cadastradas. 
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param razaoSocial Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   * @param cnpj C\u00C3\u00B3digo do Cadastro Nacional de Pessoas Jur\u00C3\u00ADdicas
   * @param inscricaoEstadual N\u00C3\u00BAmero da inscri\u00C3\u00A7\u00C3\u00A3o estadual
   * @param contato Nome da pessoa para entrar em contato
   * @param banco C\u00C3\u00B3digo do banco
   * @param agencia Raz\u00C3\u00A3o social da pessoa jur\u00C3\u00ADdica
   * @param digitoVerificadorAgencia D\u00C3\u00ADgito Verificador da ag\u00C3\u00AAncia
   * @param contaCorrente C\u00C3\u00B3digo da Conta Corrente
   * @param digitoVerificadorContaCorrente D\u00C3\u00ADgito Verificador da Conta Corrente
   * @return PagePessoaJuridicaResponse
   */
  public PagePessoaJuridicaResponse listarUsingGET23(List<String> sort, Integer page, Integer limit, String razaoSocial, String cnpj, String inscricaoEstadual, String contato, Integer banco, Integer agencia, String digitoVerificadorAgencia, String contaCorrente, String digitoVerificadorContaCorrente) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/pessoas-juridicas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "razaoSocial", razaoSocial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cnpj", cnpj));
    
    queryParams.addAll(apiClient.parameterToPairs("", "inscricaoEstadual", inscricaoEstadual));
    
    queryParams.addAll(apiClient.parameterToPairs("", "contato", contato));
    
    queryParams.addAll(apiClient.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "agencia", agencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "digitoVerificadorAgencia", digitoVerificadorAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "contaCorrente", contaCorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "digitoVerificadorContaCorrente", digitoVerificadorContaCorrente));
    

    

    

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

    
    GenericType<PagePessoaJuridicaResponse> returnType = new GenericType<PagePessoaJuridicaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Terminais cadastrados no Emissor
   * Este m\u00C3\u00A9todo permite que sejam listados os terminais existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Terminal (id).
   * @param terminal C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do terminal.
   * @param numeroEstabelecimento N\u00C3\u00BAmero do estabelecimento a qual o terminal pertence.
   * @param idEstabelecimento N\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento a qual o terminal pertence.
   * @return PageTerminalResponse
   */
  public PageTerminalResponse listarUsingGET33(List<String> sort, Integer page, Integer limit, Long id, String terminal, Long numeroEstabelecimento, Long idEstabelecimento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/terminais".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "terminal", terminal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroEstabelecimento", numeroEstabelecimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    

    

    

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

    
    GenericType<PageTerminalResponse> returnType = new GenericType<PageTerminalResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza o cadastro de um novo Terminal
   * Este m\u00C3\u00A9todo permite que seja cadastrado um novo Terminal.
   * @param idEstabelecimento Apresenta o id do estabelecimento.
   * @param flagConsultaExtrato Flag indicando se o terminal \u00C3\u00A9 f\u00C3\u00ADsico ou virtual, sendo: (true: Sim), (false: N\u00C3\u00A3o)).
   * @param flagTerminalVirtual Flag indicando se o terminal permite consultar extrato, sendo: (true: Sim), (false: N\u00C3\u00A3o)).
   * @return TerminalResponse
   */
  public TerminalResponse salvarUsingPOST20(Long idEstabelecimento, Boolean flagConsultaExtrato, Boolean flagTerminalVirtual) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idEstabelecimento' is set
     if (idEstabelecimento == null) {
        throw new ApiException(400, "Missing the required parameter 'idEstabelecimento' when calling salvarUsingPOST20");
     }
     
     // verify the required parameter 'flagConsultaExtrato' is set
     if (flagConsultaExtrato == null) {
        throw new ApiException(400, "Missing the required parameter 'flagConsultaExtrato' when calling salvarUsingPOST20");
     }
     
     // verify the required parameter 'flagTerminalVirtual' is set
     if (flagTerminalVirtual == null) {
        throw new ApiException(400, "Missing the required parameter 'flagTerminalVirtual' when calling salvarUsingPOST20");
     }
     
    // create path and map variables
    String path = "/api/terminais".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagConsultaExtrato", flagConsultaExtrato));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagTerminalVirtual", flagTerminalVirtual));
    

    

    

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

    
    GenericType<TerminalResponse> returnType = new GenericType<TerminalResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

