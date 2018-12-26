package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.AdicionalDetalheResponse;
import br.com.conductor.pier.api.v2.model.AdicionalUpdate;
import br.com.conductor.pier.api.v2.model.EnderecoResponse;
import br.com.conductor.pier.api.v2.model.PessoaDetalheResponse;
import br.com.conductor.pier.api.v2.model.PessoaResponse;
import br.com.conductor.pier.api.v2.model.TelefoneResponse;
import br.com.conductor.pier.api.v2.model.AtribuirAssinaturaClientePersist;
import br.com.conductor.pier.api.v2.model.IntegracaoEmissorPersist;
import br.com.conductor.pier.api.v2.model.IntegracaoEmissorResponse;
import br.com.conductor.pier.api.v2.model.CelularRecargaProgramadaPersist;
import br.com.conductor.pier.api.v2.model.CelularRecargaProgramadaResponse;
import br.com.conductor.pier.api.v2.model.AdicionalContaPersist;
import br.com.conductor.pier.api.v2.model.AdicionalContaResponse;
import br.com.conductor.pier.api.v2.model.AdicionalPersist;
import br.com.conductor.pier.api.v2.model.AdicionalResponse;
import br.com.conductor.pier.api.v2.model.PageContaDetalheResponse;
import br.com.conductor.pier.api.v2.model.HistoricoTelefoneResponse;
import br.com.conductor.pier.api.v2.model.PagePessoaResponse;
import br.com.conductor.pier.api.v2.model.PageEnderecoResponse;
import br.com.conductor.pier.api.v2.model.PagePessoaDetalheResponse;
import br.com.conductor.pier.api.v2.model.PageTelefoneResponse;
import br.com.conductor.pier.api.v2.model.ObjetoPessoaFsicaAprovadaResponse;
import br.com.conductor.pier.api.v2.model.ObjetoPessoaFsicaAprovada;
import br.com.conductor.pier.api.v2.model.PessoaJuridicaAprovadaResponse;
import br.com.conductor.pier.api.v2.model.PessoaJuridicaAprovadaPersist;
import br.com.conductor.pier.api.v2.model.IntegracaoEmissorPropostaPersist;
import br.com.conductor.pier.api.v2.model.IntegracaoEmissorPropostaResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CadastroClienteApi {
  private ApiClient apiClient;

  public CadastroClienteApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CadastroClienteApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Altera Adicional de uma Conta
   * Este m\u00E9todo permite que seja alterado um portador Adicional de uma determinada Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da pessoa (id)
   * @param adicionalUpdate adicionalUpdate
   * @return AdicionalDetalheResponse
   */
  public AdicionalDetalheResponse alterar(Long id, Long idPessoa, AdicionalUpdate adicionalUpdate) throws ApiException {
    Object postBody = adicionalUpdate;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterar");
     }
     
     // verify the required parameter 'idPessoa' is set
     if (idPessoa == null) {
        throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling alterar");
     }
     
     // verify the required parameter 'adicionalUpdate' is set
     if (adicionalUpdate == null) {
        throw new ApiException(400, "Missing the required parameter 'adicionalUpdate' when calling alterar");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/adicionais/{idPessoa}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idPessoa" + "\\}", apiClient.escapeString(idPessoa.toString()));

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

    
    GenericType<AdicionalDetalheResponse> returnType = new GenericType<AdicionalDetalheResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Atualiza os dados de um determinado Endere\u00E7o
   * Este m\u00E9todo permite que seja alterado na base do emissor um ou mais registros ligados a um determinado Endere\u00E7o
   * @param id id
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa a qual o endere\u00E7o pertence (id)
   * @param idTipoEndereco C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)
   * @param cep CEP do endere\u00E7o
   * @param logradouro Apresenta o nome do Logradouro
   * @param numero Apresenta o n\u00FAmero do endere\u00E7o
   * @param complemento Apresenta descri\u00E7oes complementares referente ao endere\u00E7o
   * @param pontoReferencia Apresenta a descri\u00E7\u00E3o de ponto de refer\u00EAncia do endere\u00E7o
   * @param bairro Apresenta nome do bairro
   * @param cidade Apresenta nome da cidade
   * @param uf Apresenta sigla da Unidade Federativa
   * @param pais Apresenta nome do Pa\u00EDs
   * @param tempoResidenciaAnos Apresenta a quantidade de anos em que habita na resid\u00EAncia
   * @param tempoResidenciaMeses Apresenta a quantidade de meses que habita na resid\u00EAncia
   * @param aplicativoAlteracao Apresenta a aplica\u00E7\u00E3o respons\u00E1vel por alterar o endere\u00E7o
   * @return EnderecoResponse
   */
  public EnderecoResponse alterar_0(Long id, Long idPessoa, Long idTipoEndereco, String cep, String logradouro, Integer numero, String complemento, String pontoReferencia, String bairro, String cidade, String uf, String pais, Integer tempoResidenciaAnos, Integer tempoResidenciaMeses, String aplicativoAlteracao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterar_0");
     }
     
    // create path and map variables
    String path = "/api/enderecos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoEndereco", idTipoEndereco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cep", cep));
    
    queryParams.addAll(apiClient.parameterToPairs("", "logradouro", logradouro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numero", numero));
    
    queryParams.addAll(apiClient.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pontoReferencia", pontoReferencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "bairro", bairro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cidade", cidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "uf", uf));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pais", pais));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tempoResidenciaAnos", tempoResidenciaAnos));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tempoResidenciaMeses", tempoResidenciaMeses));
    
    queryParams.addAll(apiClient.parameterToPairs("", "aplicativoAlteracao", aplicativoAlteracao));
    

    

    

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

    
    GenericType<EnderecoResponse> returnType = new GenericType<EnderecoResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Atualiza os detalhes de uma determinada Pessoa
   * Este m\u00E9todo permite que seja alterado na base do emissor os detalhes de uma determinada Pessoa
   * @param id ID da Pessoa
   * @param nomeMae Apresenta o nome da m\u00E3e da pessoa fisica
   * @param idEstadoCivil Id Estado civil da pessoa fisica
   * @param idProfissao Profiss\u00E3o da pessoa fisica
   * @param idNaturezaOcupacao Id Natureza Ocupa\u00E7\u00E3o da pessoa fisica
   * @param idNacionalidade Id Nacionalidade da pessoa fisica
   * @param numeroBanco N\u00FAmero do banco
   * @param numeroAgencia N\u00FAmero da ag\u00EAncia
   * @param numeroContaCorrente N\u00FAmero da conta corrente
   * @param email Email da pessoa fisica
   * @param nomeEmpresa Nome que deve ser impresso no cart\u00E3o
   * @param nomeReferencia1 Nome de refer\u00EAncia 1
   * @param enderecoReferencia1 Endere\u00E7o de refer\u00EAncia 1
   * @param nomeReferencia2 Nome de refer\u00EAncia 2
   * @param enderecoReferencia2 Endere\u00E7o de refer\u00EAncia 2
   * @param impedidoFinanciamento Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito(Lei n. 4.595/64)
   * @param naturalidadeCidade Apresenta o nome da cidade de nascimento da pessoa f\u00EDsica
   * @param naturalidadeEstado Apresenta a sigla do estado de nascimento da pessoa f\u00EDsica
   * @param grauInstrucao Apresenta o grau de instru\u00E7\u00E3o da pessoa f\u00EDsica
   * @param numeroDependentes Apresenta o n\u00FAmero de dependentes da pessoa f\u00EDsica
   * @param nomePai Apresenta o nome do pai da pessoa f\u00EDsica
   * @param chequeEspecial Indica se pessoa f\u00EDsica aderir ao cheque especial
   * @return PessoaDetalheResponse
   */
  public PessoaDetalheResponse alterar_1(Long id, String nomeMae, Long idEstadoCivil, String idProfissao, Long idNaturezaOcupacao, Long idNacionalidade, Integer numeroBanco, Integer numeroAgencia, String numeroContaCorrente, String email, String nomeEmpresa, String nomeReferencia1, String enderecoReferencia1, String nomeReferencia2, String enderecoReferencia2, Boolean impedidoFinanciamento, String naturalidadeCidade, String naturalidadeEstado, Integer grauInstrucao, Integer numeroDependentes, String nomePai, Integer chequeEspecial) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterar_1");
     }
     
    // create path and map variables
    String path = "/api/pessoas-detalhes/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeMae", nomeMae));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstadoCivil", idEstadoCivil));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProfissao", idProfissao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idNaturezaOcupacao", idNaturezaOcupacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idNacionalidade", idNacionalidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroBanco", numeroBanco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroContaCorrente", numeroContaCorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "email", email));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeEmpresa", nomeEmpresa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeReferencia1", nomeReferencia1));
    
    queryParams.addAll(apiClient.parameterToPairs("", "enderecoReferencia1", enderecoReferencia1));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeReferencia2", nomeReferencia2));
    
    queryParams.addAll(apiClient.parameterToPairs("", "enderecoReferencia2", enderecoReferencia2));
    
    queryParams.addAll(apiClient.parameterToPairs("", "impedidoFinanciamento", impedidoFinanciamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "naturalidadeCidade", naturalidadeCidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "naturalidadeEstado", naturalidadeEstado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "grauInstrucao", grauInstrucao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroDependentes", numeroDependentes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomePai", nomePai));
    
    queryParams.addAll(apiClient.parameterToPairs("", "chequeEspecial", chequeEspecial));
    

    

    

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

    
    GenericType<PessoaDetalheResponse> returnType = new GenericType<PessoaDetalheResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Atualiza os dados de uma determinada Pessoa
   * Este m\u00E9todo permite que seja alterado na base do emissor um registro de determinada Pessoa
   * @param id ID da Pessoa
   * @param nome Apresenta o &#39;Nome Completo da PF&#39; ou o &#39;Nome Completo da Raz\u00E3o Social (Nome Empresarial)&#39;
   * @param tipo Tipo de Pessoa (PF ou PJ)
   * @param dataNascimento Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd
   * @param cpf N\u00FAmero do CPF, quando PF
   * @param cnpj N\u00FAmero do CNPJ, quando PJ
   * @param sexo Sexo da Pessoa
   * @param numeroIdentidade N\u00FAmero da Identidade
   * @param orgaoExpedidorIdentidade Org\u00E3o expedidor do Identidade
   * @param unidadeFederativaIdentidade Sigla da Unidade Federativa de onde foi expedido a Identidade
   * @param dataEmissaoIdentidade Data emiss\u00E3o da Identidade
   * @return PessoaResponse
   */
  public PessoaResponse alterar_2(Long id, String nome, String tipo, String dataNascimento, String cpf, String cnpj, String sexo, String numeroIdentidade, String orgaoExpedidorIdentidade, String unidadeFederativaIdentidade, String dataEmissaoIdentidade) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterar_2");
     }
     
     // verify the required parameter 'nome' is set
     if (nome == null) {
        throw new ApiException(400, "Missing the required parameter 'nome' when calling alterar_2");
     }
     
     // verify the required parameter 'tipo' is set
     if (tipo == null) {
        throw new ApiException(400, "Missing the required parameter 'tipo' when calling alterar_2");
     }
     
     // verify the required parameter 'dataNascimento' is set
     if (dataNascimento == null) {
        throw new ApiException(400, "Missing the required parameter 'dataNascimento' when calling alterar_2");
     }
     
    // create path and map variables
    String path = "/api/pessoas/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipo", tipo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cnpj", cnpj));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataNascimento", dataNascimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sexo", sexo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroIdentidade", numeroIdentidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "orgaoExpedidorIdentidade", orgaoExpedidorIdentidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "unidadeFederativaIdentidade", unidadeFederativaIdentidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataEmissaoIdentidade", dataEmissaoIdentidade));
    

    

    

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

    
    GenericType<PessoaResponse> returnType = new GenericType<PessoaResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a altera\u00E7\u00E3o de um determinado Telefone
   * Este m\u00E9todo permite que seja alterado um determinado Telefone na base de dados do Emissor
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Telefone (id)
   * @param idTipoTelefone C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id)
   * @param ddd DDD do n\u00FAmero do telfone
   * @param telefone N\u00FAmero do telefone
   * @param ramal Ramal do telefone
   * @return TelefoneResponse
   */
  public TelefoneResponse alterar_3(Long id, Long idTipoTelefone, String ddd, String telefone, String ramal) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterar_3");
     }
     
    // create path and map variables
    String path = "/api/telefones".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoTelefone", idTipoTelefone));
    
    queryParams.addAll(apiClient.parameterToPairs("", "ddd", ddd));
    
    queryParams.addAll(apiClient.parameterToPairs("", "telefone", telefone));
    
    queryParams.addAll(apiClient.parameterToPairs("", "ramal", ramal));
    

    

    

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

    
    GenericType<TelefoneResponse> returnType = new GenericType<TelefoneResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Permite atribuir um documento para uma Conta
   * Este m\u00E9todo permite que seja atribu\u00EDdo a uma determinada Conta um documento que esteja armazenado no PIER Cloud, informando qual o tipo do documento e o seu respectivo id
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   * @param body C\u00F3digo de Identifica\u00E7\u00E3o do Arquivo
   * @return Object
   */
  public Object atribuirAssinaturaCliente(Long id, AtribuirAssinaturaClientePersist body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atribuirAssinaturaCliente");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling atribuirAssinaturaCliente");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/atribuir-assinatura-cliente".replaceAll("\\{format\\}","json")
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
   * Atualiza conta integrada com o emissor
   * Este recurso permite a atualiza\u00E7\u00E3o de uma conta integrada com o emissor
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param body Descri\u00E7\u00E3o do canal de entrada
   * @return IntegracaoEmissorResponse
   */
  public IntegracaoEmissorResponse atualizar(Long id, IntegracaoEmissorPersist body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizar");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/atualizar-registro-integracao".replaceAll("\\{format\\}","json")
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

    
    GenericType<IntegracaoEmissorResponse> returnType = new GenericType<IntegracaoEmissorResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Atualiza o endere\u00E7o de correspond\u00EAncia, para o endere\u00E7o informado
   * Este m\u00E9todo permite que o endere\u00E7o de correspond\u00EAncia de uma determinada conta, seja atualizado para o endere\u00E7o de correspond\u00EAncia informado
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o (id)
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   * @return EnderecoResponse
   */
  public EnderecoResponse atualizarEnderecoDeCorrespondencia(Long id, Long idConta) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarEnderecoDeCorrespondencia");
     }
     
     // verify the required parameter 'idConta' is set
     if (idConta == null) {
        throw new ApiException(400, "Missing the required parameter 'idConta' when calling atualizarEnderecoDeCorrespondencia");
     }
     
    // create path and map variables
    String path = "/api/enderecos/{id}/alterar-endereco-correspondencia".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    

    

    

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

    
    GenericType<EnderecoResponse> returnType = new GenericType<EnderecoResponse>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastro da recarga programada
   * Este recurso permite cadastrar uma nova recarga programada na base do emissor
   * @param persistencia persistencia
   * @return CelularRecargaProgramadaResponse
   */
  public CelularRecargaProgramadaResponse cadastrar(CelularRecargaProgramadaPersist persistencia) throws ApiException {
    Object postBody = persistencia;
    
     // verify the required parameter 'persistencia' is set
     if (persistencia == null) {
        throw new ApiException(400, "Missing the required parameter 'persistencia' when calling cadastrar");
     }
     
    // create path and map variables
    String path = "/api/celulares/recargas-programadas".replaceAll("\\{format\\}","json");

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

    
    GenericType<CelularRecargaProgramadaResponse> returnType = new GenericType<CelularRecargaProgramadaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza o cadastro de Adicionais para uma Conta
   * Este m\u00E9todo permite que uma pessoa existente na base possa ser um adicional na conta informada
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param adicionalContaPersist adicionalContaPersist
   * @return AdicionalContaResponse
   */
  public AdicionalContaResponse cadastrarAdicional(Long id, AdicionalContaPersist adicionalContaPersist) throws ApiException {
    Object postBody = adicionalContaPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrarAdicional");
     }
     
     // verify the required parameter 'adicionalContaPersist' is set
     if (adicionalContaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'adicionalContaPersist' when calling cadastrarAdicional");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/adicionais".replaceAll("\\{format\\}","json")
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

    
    GenericType<AdicionalContaResponse> returnType = new GenericType<AdicionalContaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza o cadastro de Adicionais para uma Conta
   * Este m\u00E9todo permite que sejam cadastrados um portador Adicional para uma determinada Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param persist persist
   * @return AdicionalDetalheResponse
   */
  public AdicionalDetalheResponse cadastrar_0(Long id, AdicionalPersist persist) throws ApiException {
    Object postBody = persist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrar_0");
     }
     
     // verify the required parameter 'persist' is set
     if (persist == null) {
        throw new ApiException(400, "Missing the required parameter 'persist' when calling cadastrar_0");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/cadastrar-adicional".replaceAll("\\{format\\}","json")
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

    
    GenericType<AdicionalDetalheResponse> returnType = new GenericType<AdicionalDetalheResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta Adicional de uma Conta
   * Este m\u00E9todo permite que seja consultado um portador Adicional de uma determinada Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da pessoa (id)
   * @return AdicionalDetalheResponse
   */
  public AdicionalDetalheResponse consultar(Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
     }
     
     // verify the required parameter 'idPessoa' is set
     if (idPessoa == null) {
        throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling consultar");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/adicionais/{idPessoa}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idPessoa" + "\\}", apiClient.escapeString(idPessoa.toString()));

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

    
    GenericType<AdicionalDetalheResponse> returnType = new GenericType<AdicionalDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Endere\u00E7o
   * Este m\u00E9todo permite consultar um determinado Endere\u00E7o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o (id)
   * @return EnderecoResponse
   */
  public EnderecoResponse consultar_0(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_0");
     }
     
    // create path and map variables
    String path = "/api/enderecos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<EnderecoResponse> returnType = new GenericType<EnderecoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os detalhes de uma determinada Pessoa
   * Este m\u00E9todo permite a consulta dos detalhes de uma Pessoa existentes na base de dados do Emissor
   * @param id ID da Pessoa
   * @return PessoaDetalheResponse
   */
  public PessoaDetalheResponse consultar_1(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_1");
     }
     
    // create path and map variables
    String path = "/api/pessoas-detalhes/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<PessoaDetalheResponse> returnType = new GenericType<PessoaDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de uma determinada Pessoa
   * Este m\u00E9todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor
   * @param id ID da Pessoa
   * @return PessoaResponse
   */
  public PessoaResponse consultar_2(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_2");
     }
     
    // create path and map variables
    String path = "/api/pessoas/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<PessoaResponse> returnType = new GenericType<PessoaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Telefone
   * Este m\u00E9todo permite consultar um determinado Telefone a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Telefone (id)
   * @return TelefoneResponse
   */
  public TelefoneResponse consultar_3(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_3");
     }
     
    // create path and map variables
    String path = "/api/telefones/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TelefoneResponse> returnType = new GenericType<TelefoneResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Inativa Adicional de uma Conta
   * Este m\u00E9todo permite que seja inativado um portador Adicional de uma determinada Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da pessoa (id)
   * @return String
   */
  public String inativar(Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling inativar");
     }
     
     // verify the required parameter 'idPessoa' is set
     if (idPessoa == null) {
        throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling inativar");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/adicionais/{idPessoa}/inativar".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "idPessoa" + "\\}", apiClient.escapeString(idPessoa.toString()));

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
   * Lista os Adicionais de uma Conta
   * Este m\u00E9todo permite que sejam listados portadores Adicionais de uma determinada Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return AdicionalResponse
   */
  public AdicionalResponse listar(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listar");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/adicionais".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<AdicionalResponse> returnType = new GenericType<AdicionalResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as contas da pessoa
   * Permite listar as contas de um pessoa a partir do seu numero na receita federal
   * @param numeroReceitaFederal N\u00FAmero de identifica\u00E7\u00E3o do cliente na Receita Federal (CPF ou CNPJ)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageContaDetalheResponse
   */
  public PageContaDetalheResponse listarContasPorPessoa(String numeroReceitaFederal, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'numeroReceitaFederal' is set
     if (numeroReceitaFederal == null) {
        throw new ApiException(400, "Missing the required parameter 'numeroReceitaFederal' when calling listarContasPorPessoa");
     }
     
    // create path and map variables
    String path = "/api/pessoas/listar-contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
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

    
    GenericType<PageContaDetalheResponse> returnType = new GenericType<PageContaDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar altera\u00E7\u00F5es de telefones realizadas nos \u00FAltimos 60 dias
   * Este m\u00E9todo permite verificar quais os telefones de um determinado que cliente que sofreram altera\u00E7\u00E3o nos \u00FAltimos 60 dias
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da pessoa (id)
   * @return HistoricoTelefoneResponse
   */
  public HistoricoTelefoneResponse listarHistoricoTelefones(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoTelefones");
     }
     
    // create path and map variables
    String path = "/api/pessoas/{id}/historico-telefones".replaceAll("\\{format\\}","json")
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

    
    GenericType<HistoricoTelefoneResponse> returnType = new GenericType<HistoricoTelefoneResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar s\u00F3cios de uma pessoa jur\u00EDdica
   * Lista os s\u00F3cios vinculados \u00E0 uma Pessoa Jur\u00EDdica cadastrada
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa Jur\u00EDdica
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PagePessoaResponse
   */
  public PagePessoaResponse listarSocios(Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarSocios");
     }
     
    // create path and map variables
    String path = "/api/clientes-pessoas-juridicas/{id}/socios".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    
    GenericType<PagePessoaResponse> returnType = new GenericType<PagePessoaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Endere\u00E7os cadastrados para o Emissor
   * Este m\u00E9todo permite que sejam listados os Endere\u00E7os existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o (id)
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa a qual o endere\u00E7o pertence (id)
   * @param idTipoEndereco C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)
   * @param cep List os CEPs
   * @param logradouro Apresenta o nome do Logradouro
   * @param numero Apresenta o n\u00FAmero do endere\u00E7o
   * @param complemento Apresenta descri\u00E7oes complementares referente ao endere\u00E7o
   * @param pontoReferencia Apresenta a descri\u00E7\u00E3o de ponto de refer\u00EAncia do endere\u00E7o
   * @param bairro Apresenta nome do bairro
   * @param cidade Apresenta nome da cidade
   * @param uf Apresenta sigla da Unidade Federativa
   * @param pais Apresenta nome do Pa\u00EDs
   * @param dataInclusao Apresenta a data em que fora cadastrado o Endere\u00E7o
   * @param dataUltimaAtualizacao Data em que fora realizada a \u00FAltima mudan\u00E7a neste registro de endere\u00E7o. Quando n\u00E3o tiver ocorrido mudan\u00E7a, conter\u00E1 a mesma informa\u00E7\u00E3o que o campo dataInclusao
   * @param tempoResidenciaAnos Apresenta a quantidade de anos em que habita na resid\u00EAncia
   * @param tempoResidenciaMeses Apresenta a quantidade de meses que habita na resid\u00EAncia
   * @return PageEnderecoResponse
   */
  public PageEnderecoResponse listar_0(List<String> sort, Integer page, Integer limit, Long id, Long idPessoa, Long idTipoEndereco, String cep, String logradouro, Integer numero, String complemento, String pontoReferencia, String bairro, String cidade, String uf, String pais, String dataInclusao, String dataUltimaAtualizacao, Integer tempoResidenciaAnos, Integer tempoResidenciaMeses) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/enderecos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoEndereco", idTipoEndereco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cep", cep));
    
    queryParams.addAll(apiClient.parameterToPairs("", "logradouro", logradouro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numero", numero));
    
    queryParams.addAll(apiClient.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pontoReferencia", pontoReferencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "bairro", bairro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cidade", cidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "uf", uf));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pais", pais));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataInclusao", dataInclusao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataUltimaAtualizacao", dataUltimaAtualizacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tempoResidenciaAnos", tempoResidenciaAnos));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tempoResidenciaMeses", tempoResidenciaMeses));
    

    

    

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

    
    GenericType<PageEnderecoResponse> returnType = new GenericType<PageEnderecoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as Pessoas cadastradas no Emissor
   * Este m\u00E9todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa (id)
   * @param nome Apresenta o &#39;Nome Completo da PF&#39; ou o &#39;Nome Completo da Raz\u00E3o Social (Nome Empresarial)&#39;
   * @param tipo C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa F\u00EDsica, sendo: (&#39;PF&#39;: Pessoa F\u00EDsica), (&#39;PJ&#39;: Pessoa Jur\u00EDdica)
   * @param cpf Quando uma pessoa f\u00EDsica preencha com o CPF
   * @param cnpj Quando um pessoa jur\u00EDdica preencha o CNPJ
   * @param dataNascimento Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ
   * @param sexo C\u00F3digo de Identifica\u00E7\u00E3o do sexo da pessoa, quando \u00E9 PF, sendo: (&#39;M&#39;: Masculino), (&#39;F&#39;: Feminino), (&#39;O&#39;: Outro), (&#39;N&#39;: N\u00E3o especificado)
   * @param numeroIdentidade N\u00FAmero da Identidade
   * @param orgaoExpedidorIdentidade Org\u00E3o expedidor do RG
   * @param unidadeFederativaIdentidade Sigla da Unidade Federativa de onde foi expedido a Identidade
   * @param dataEmissaoIdentidade Data emiss\u00E3o da identidade no formato aaaa-MM-dd
   * @return PagePessoaResponse
   */
  public PagePessoaResponse listar_1(List<String> sort, Integer page, Integer limit, Long id, String nome, String tipo, String cpf, String cnpj, String dataNascimento, String sexo, String numeroIdentidade, String orgaoExpedidorIdentidade, String unidadeFederativaIdentidade, String dataEmissaoIdentidade) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/pessoas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipo", tipo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cnpj", cnpj));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataNascimento", dataNascimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sexo", sexo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroIdentidade", numeroIdentidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "orgaoExpedidorIdentidade", orgaoExpedidorIdentidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "unidadeFederativaIdentidade", unidadeFederativaIdentidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataEmissaoIdentidade", dataEmissaoIdentidade));
    

    

    

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

    
    GenericType<PagePessoaResponse> returnType = new GenericType<PagePessoaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Detalhes das Pessoas cadastradas no Emissor
   * Este m\u00E9todo permite que sejam listadas od detalhes das Pessoas existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idPessoa C\u00F3digo identificador da pessoa
   * @param nomeMae Apresenta o nome da m\u00E3e da pessoa fisica
   * @param idEstadoCivil Id Estado civil da pessoa fisica
   * @param idProfissao Profiss\u00E3o da pessoa fisica
   * @param idNaturezaOcupacao Id Natureza Ocupa\u00E7\u00E3o da pessoa fisica
   * @param idNacionalidade Id Nacionalidade da pessoa fisica
   * @param numeroBanco N\u00FAmero do Banco
   * @param numeroAgencia N\u00FAmero da ag\u00EAncia
   * @param numeroContaCorrente N\u00FAmero da conta corrente
   * @param email Email da pessoa fisica
   * @param nomeEmpresa Nome que deve ser impresso no cart\u00E3o
   * @param naturalidadeCidade Apresenta o nome da cidade de nascimento da pessoa f\u00EDsica
   * @param naturalidadeEstado Apresenta a sigla do estado de nascimento da pessoa f\u00EDsica
   * @param grauInstrucao Apresenta o grau de instru\u00E7\u00E3o da pessoa f\u00EDsica
   * @param numeroDependentes Apresenta o n\u00FAmero de dependentes da pessoa f\u00EDsica
   * @param nomePai Apresenta o nome do pai da pessoa f\u00EDsica
   * @param chequeEspecial Indica se pessoa f\u00EDsica aderir ao cheque especial
   * @param impedidoFinanciamento Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5esde cr\u00E9dito(Lei n. 4.595/64)
   * @return PagePessoaDetalheResponse
   */
  public PagePessoaDetalheResponse listar_2(List<String> sort, Integer page, Integer limit, Long idPessoa, String nomeMae, Long idEstadoCivil, String idProfissao, Long idNaturezaOcupacao, Long idNacionalidade, Integer numeroBanco, Integer numeroAgencia, String numeroContaCorrente, String email, String nomeEmpresa, String naturalidadeCidade, String naturalidadeEstado, Integer grauInstrucao, Integer numeroDependentes, String nomePai, Integer chequeEspecial, Boolean impedidoFinanciamento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/pessoas-detalhes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeMae", nomeMae));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstadoCivil", idEstadoCivil));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProfissao", idProfissao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idNaturezaOcupacao", idNaturezaOcupacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idNacionalidade", idNacionalidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroBanco", numeroBanco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroContaCorrente", numeroContaCorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "email", email));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeEmpresa", nomeEmpresa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "naturalidadeCidade", naturalidadeCidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "naturalidadeEstado", naturalidadeEstado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "grauInstrucao", grauInstrucao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroDependentes", numeroDependentes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomePai", nomePai));
    
    queryParams.addAll(apiClient.parameterToPairs("", "chequeEspecial", chequeEspecial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "impedidoFinanciamento", impedidoFinanciamento));
    

    

    

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

    
    GenericType<PagePessoaDetalheResponse> returnType = new GenericType<PagePessoaDetalheResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Telefones cadastrados no Emissor
   * Este m\u00E9todo permite que sejam listados os Telefones existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Telefone (id)
   * @param idTipoTelefone C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id)
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa (id) a qual o telefone pertence
   * @param ddd Telefone DDD
   * @param telefone Telefone n\u00FAmero
   * @param ramal N\u00FAmero do ramal
   * @param status Apresenta o Status do Telefone, onde: &#39;0&#39;: Inativo e &#39;1&#39;: Ativo
   * @return PageTelefoneResponse
   */
  public PageTelefoneResponse listar_3(List<String> sort, Integer page, Integer limit, Long id, Long idTipoTelefone, Long idPessoa, String ddd, String telefone, String ramal, Integer status) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/telefones".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoTelefone", idTipoTelefone));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "ddd", ddd));
    
    queryParams.addAll(apiClient.parameterToPairs("", "telefone", telefone));
    
    queryParams.addAll(apiClient.parameterToPairs("", "ramal", ramal));
    
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

    
    GenericType<PageTelefoneResponse> returnType = new GenericType<PageTelefoneResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Inclui a conta como registro para integra\u00E7\u00E3o
   * Este recurso permite incluir uma conta como registro para integra\u00E7\u00E3o
   * @param id idConta
   * @param body IntegracaoEmissorPersist
   * @return IntegracaoEmissorResponse
   */
  public IntegracaoEmissorResponse salvar(Long id, IntegracaoEmissorPersist body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvar");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/incluir-registro-integracao".replaceAll("\\{format\\}","json")
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

    
    GenericType<IntegracaoEmissorResponse> returnType = new GenericType<IntegracaoEmissorResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastro de Conta e Pessoa Fisica
   * Permite realizar o cadastro de uma Conta para um cliente do tipo Pessoa F\u00EDsica, recebendo nesta opera\u00E7\u00E3o todos os dados cadastrais que se fazem necess\u00E1rios para isso. Uma vez criado, poder\u00E1 ser acionado o m\u00E9todo de &#39;Gera\u00E7\u00E3o de Cart\u00E3o&#39; para o cliente e seus adicionais
   * @param pessoaPersist pessoaPersist
   * @return ObjetoPessoaFsicaAprovadaResponse
   */
  public ObjetoPessoaFsicaAprovadaResponse salvarPessoaFisicaAprovada(ObjetoPessoaFsicaAprovada pessoaPersist) throws ApiException {
    Object postBody = pessoaPersist;
    
     // verify the required parameter 'pessoaPersist' is set
     if (pessoaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'pessoaPersist' when calling salvarPessoaFisicaAprovada");
     }
     
    // create path and map variables
    String path = "/api/clientes-pessoas-fisicas".replaceAll("\\{format\\}","json");

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

    
    GenericType<ObjetoPessoaFsicaAprovadaResponse> returnType = new GenericType<ObjetoPessoaFsicaAprovadaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastro de Conta e Pessoa Jur\u00EDdica
   * Cadastro de Conta e Pessoa Jur\u00EDdica Permite realizar o cadastro de uma Conta para um cliente do tipo Pessoa Jur\u00EDdica, recebendo nesta opera\u00E7\u00E3o todos os dados cadastrais que se fazem necess\u00E1rios para isso, inclu\u00EDndo o registro de cada um dos s\u00F3cios. Uma vez criado, poder\u00E1 ser acionado o m\u00E9todo de &#39;Gera\u00E7\u00E3o de Cart\u00E3o&#39; para o cliente e cada um dos s\u00F3cios vinculados
   * @param pessoaPersist pessoaPersist
   * @return PessoaJuridicaAprovadaResponse
   */
  public PessoaJuridicaAprovadaResponse salvarPessoaJuridicaAprovada(PessoaJuridicaAprovadaPersist pessoaPersist) throws ApiException {
    Object postBody = pessoaPersist;
    
     // verify the required parameter 'pessoaPersist' is set
     if (pessoaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'pessoaPersist' when calling salvarPessoaJuridicaAprovada");
     }
     
    // create path and map variables
    String path = "/api/clientes-pessoas-juridicas".replaceAll("\\{format\\}","json");

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

    
    GenericType<PessoaJuridicaAprovadaResponse> returnType = new GenericType<PessoaJuridicaAprovadaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Inclui registro de integra\u00E7\u00E3o
   * Este recurso permite incluir um registro de integra\u00E7\u00E3o
   * @param id Identificador da conta
   * @param integracaoEmissorPropostaPersist integracaoEmissorPropostaPersist
   * @return IntegracaoEmissorPropostaResponse
   */
  public IntegracaoEmissorPropostaResponse salvarRegistroIntegracaoManager(Long id, IntegracaoEmissorPropostaPersist integracaoEmissorPropostaPersist) throws ApiException {
    Object postBody = integracaoEmissorPropostaPersist;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling salvarRegistroIntegracaoManager");
     }
     
     // verify the required parameter 'integracaoEmissorPropostaPersist' is set
     if (integracaoEmissorPropostaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'integracaoEmissorPropostaPersist' when calling salvarRegistroIntegracaoManager");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/registros-integracao-manager".replaceAll("\\{format\\}","json")
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

    
    GenericType<IntegracaoEmissorPropostaResponse> returnType = new GenericType<IntegracaoEmissorPropostaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza o cadastro de um novo Endere\u00E7o
   * Este m\u00E9todo permite que seja cadastrado um novo Endere\u00E7o na base de dados do Emissor
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa a qual o endere\u00E7o pertence (id)
   * @param idTipoEndereco C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)
   * @param cep CEP do endere\u00E7o
   * @param logradouro Apresenta o nome do Logradouro
   * @param numero Apresenta o n\u00FAmero do endere\u00E7o
   * @param complemento Apresenta descri\u00E7oes complementares referente ao endere\u00E7o
   * @param pontoReferencia Apresenta a descri\u00E7\u00E3o de ponto de refer\u00EAncia do endere\u00E7o
   * @param bairro Apresenta nome do bairro
   * @param cidade Apresenta nome da cidade
   * @param uf Apresenta sigla da Unidade Federativa
   * @param pais Apresenta nome do Pa\u00EDs
   * @param tempoResidenciaAnos Apresenta a quantidade de anos em que habita na resid\u00EAncia
   * @param tempoResidenciaMeses Apresenta a quantidade de meses que habita na resid\u00EAncia
   * @param aplicativoAlteracao Apresenta a aplica\u00E7\u00E3o respons\u00E1vel por alterar o endere\u00E7o
   * @return EnderecoResponse
   */
  public EnderecoResponse salvar_0(Long idPessoa, Long idTipoEndereco, String cep, String logradouro, Integer numero, String complemento, String pontoReferencia, String bairro, String cidade, String uf, String pais, Integer tempoResidenciaAnos, Integer tempoResidenciaMeses, String aplicativoAlteracao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/enderecos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoEndereco", idTipoEndereco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cep", cep));
    
    queryParams.addAll(apiClient.parameterToPairs("", "logradouro", logradouro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numero", numero));
    
    queryParams.addAll(apiClient.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pontoReferencia", pontoReferencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "bairro", bairro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cidade", cidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "uf", uf));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pais", pais));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tempoResidenciaAnos", tempoResidenciaAnos));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tempoResidenciaMeses", tempoResidenciaMeses));
    
    queryParams.addAll(apiClient.parameterToPairs("", "aplicativoAlteracao", aplicativoAlteracao));
    

    

    

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

    
    GenericType<EnderecoResponse> returnType = new GenericType<EnderecoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza o cadastro de um nova Pessoa
   * Este m\u00E9todo permite que seja cadastrado uma nova Pessoa na base de dados do Emissor
   * @param nome Apresenta o &#39;Nome Completo da PF&#39; ou o &#39;Nome Completo da Raz\u00E3o Social (Nome Empresarial)&#39;
   * @param tipo Tipo de Pessoa (PF ou PJ)
   * @param dataNascimento Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd
   * @param cpf N\u00FAmero do CPF, quando PF
   * @param cnpj N\u00FAmero do CNPJ, quando PJ
   * @param sexo Sexo da Pessoa
   * @param numeroIdentidade N\u00FAmero da Identidade
   * @param orgaoExpedidorIdentidade Org\u00E3o expedidor do Identidade
   * @param unidadeFederativaIdentidade Sigla da Unidade Federativa de onde foi expedido a Identidade
   * @param dataEmissaoIdentidade Data emiss\u00E3o da Identidade
   * @return PessoaResponse
   */
  public PessoaResponse salvar_1(String nome, String tipo, String dataNascimento, String cpf, String cnpj, String sexo, String numeroIdentidade, String orgaoExpedidorIdentidade, String unidadeFederativaIdentidade, String dataEmissaoIdentidade) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'nome' is set
     if (nome == null) {
        throw new ApiException(400, "Missing the required parameter 'nome' when calling salvar_1");
     }
     
     // verify the required parameter 'tipo' is set
     if (tipo == null) {
        throw new ApiException(400, "Missing the required parameter 'tipo' when calling salvar_1");
     }
     
     // verify the required parameter 'dataNascimento' is set
     if (dataNascimento == null) {
        throw new ApiException(400, "Missing the required parameter 'dataNascimento' when calling salvar_1");
     }
     
    // create path and map variables
    String path = "/api/pessoas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipo", tipo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cnpj", cnpj));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataNascimento", dataNascimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sexo", sexo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroIdentidade", numeroIdentidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "orgaoExpedidorIdentidade", orgaoExpedidorIdentidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "unidadeFederativaIdentidade", unidadeFederativaIdentidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataEmissaoIdentidade", dataEmissaoIdentidade));
    

    

    

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

    
    GenericType<PessoaResponse> returnType = new GenericType<PessoaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Salvar os detalhes de uma determinada Pessoa
   * Este m\u00E9todo permite que seja incluido na base do emissor os detalhes de uma determinada Pessoa
   * @param idPessoa Apresenta o c\u00F3digo identificador da pessoa
   * @param nomeMae Apresenta o nome da m\u00E3e da pessoa fisica
   * @param idEstadoCivil Id Estado civil da pessoa fisica
   * @param idProfissao Profiss\u00E3o da pessoa fisica
   * @param idNaturezaOcupacao Id Natureza Ocupa\u00E7\u00E3o da pessoa fisica
   * @param idNacionalidade Id Nacionalidade da pessoa fisica
   * @param numeroBanco N\u00FAmero do banco
   * @param numeroAgencia N\u00FAmero da ag\u00EAncia
   * @param numeroContaCorrente N\u00FAmero da conta corrente
   * @param email Email da pessoa fisica
   * @param nomeEmpresa Nome que deve ser impresso no cart\u00E3o
   * @param nomeReferencia1 Nome de refer\u00EAncia 1
   * @param enderecoReferencia1 Endere\u00E7o de refer\u00EAncia 1
   * @param nomeReferencia2 Nome de refer\u00EAncia 2
   * @param enderecoReferencia2 Endere\u00E7o de refer\u00EAncia 2
   * @param naturalidadeCidade Apresenta o nome da cidade de nascimento da pessoa f\u00EDsica
   * @param naturalidadeEstado Apresenta a sigla do estado de nascimento da pessoa f\u00EDsica
   * @param grauInstrucao Apresenta o grau de instru\u00E7\u00E3o da pessoa f\u00EDsica
   * @param numeroDependentes Apresenta o n\u00FAmero de dependentes da pessoa f\u00EDsica
   * @param nomePai Apresenta o nome do pai da pessoa f\u00EDsica
   * @param chequeEspecial Indica se pessoa f\u00EDsica aderir ao cheque especial
   * @param impedidoFinanciamento Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito(Lei n. 4.595/64)
   * @return PessoaDetalheResponse
   */
  public PessoaDetalheResponse salvar_2(Long idPessoa, String nomeMae, Long idEstadoCivil, String idProfissao, Long idNaturezaOcupacao, Long idNacionalidade, Integer numeroBanco, Integer numeroAgencia, String numeroContaCorrente, String email, String nomeEmpresa, String nomeReferencia1, String enderecoReferencia1, String nomeReferencia2, String enderecoReferencia2, String naturalidadeCidade, String naturalidadeEstado, Integer grauInstrucao, Integer numeroDependentes, String nomePai, Integer chequeEspecial, Boolean impedidoFinanciamento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'idPessoa' is set
     if (idPessoa == null) {
        throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling salvar_2");
     }
     
    // create path and map variables
    String path = "/api/pessoas-detalhes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeMae", nomeMae));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstadoCivil", idEstadoCivil));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProfissao", idProfissao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idNaturezaOcupacao", idNaturezaOcupacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idNacionalidade", idNacionalidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroBanco", numeroBanco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroContaCorrente", numeroContaCorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "email", email));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeEmpresa", nomeEmpresa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeReferencia1", nomeReferencia1));
    
    queryParams.addAll(apiClient.parameterToPairs("", "enderecoReferencia1", enderecoReferencia1));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeReferencia2", nomeReferencia2));
    
    queryParams.addAll(apiClient.parameterToPairs("", "enderecoReferencia2", enderecoReferencia2));
    
    queryParams.addAll(apiClient.parameterToPairs("", "naturalidadeCidade", naturalidadeCidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "naturalidadeEstado", naturalidadeEstado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "grauInstrucao", grauInstrucao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroDependentes", numeroDependentes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomePai", nomePai));
    
    queryParams.addAll(apiClient.parameterToPairs("", "chequeEspecial", chequeEspecial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "impedidoFinanciamento", impedidoFinanciamento));
    

    

    

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

    
    GenericType<PessoaDetalheResponse> returnType = new GenericType<PessoaDetalheResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza o cadastro de um novo Telefone
   * Este m\u00E9todo permite que seja cadastrado um novo Telefone na base de dados do Emissor
   * @param idTipoTelefone C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id)
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa (id) a qual o telefone pertence
   * @param ddd C\u00F3digo DDD do telefone (id)
   * @param telefone N\u00FAmero do telefone
   * @param ramal N\u00FAmero do ramal
   * @return TelefoneResponse
   */
  public TelefoneResponse salvar_3(Long idTipoTelefone, Long idPessoa, String ddd, String telefone, String ramal) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/telefones".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoTelefone", idTipoTelefone));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "ddd", ddd));
    
    queryParams.addAll(apiClient.parameterToPairs("", "telefone", telefone));
    
    queryParams.addAll(apiClient.parameterToPairs("", "ramal", ramal));
    

    

    

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

    
    GenericType<TelefoneResponse> returnType = new GenericType<TelefoneResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
