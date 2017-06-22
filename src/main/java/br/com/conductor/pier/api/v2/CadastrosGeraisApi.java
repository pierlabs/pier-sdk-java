package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.EnderecoResponse;
import br.com.conductor.pier.api.v2.model.PessoaDetalheResponse;
import br.com.conductor.pier.api.v2.model.PessoaResponse;
import br.com.conductor.pier.api.v2.model.TelefoneResponse;
import br.com.conductor.pier.api.v2.model.ProdutoDetalhesResponse;
import br.com.conductor.pier.api.v2.model.ParametroProdutoResponse;
import br.com.conductor.pier.api.v2.model.TaxaAntecipacaoRequest;
import br.com.conductor.pier.api.v2.model.OrigemComercialResponse;
import br.com.conductor.pier.api.v2.model.AtendimentoClienteResponse;
import br.com.conductor.pier.api.v2.model.BancoResponse;
import br.com.conductor.pier.api.v2.model.PageTipoAjusteResponse;
import br.com.conductor.pier.api.v2.model.PageTipoBoletoResponse;
import br.com.conductor.pier.api.v2.model.TipoEnderecoResponse;
import br.com.conductor.pier.api.v2.model.TipoTelefoneResponse;
import br.com.conductor.pier.api.v2.model.PageContaDetalheResponse;
import br.com.conductor.pier.api.v2.model.PageCampoCodificadoDescricaoResponse;
import br.com.conductor.pier.api.v2.model.HistoricoTelefoneResponse;
import br.com.conductor.pier.api.v2.model.PageOrigemComercialResponse;
import br.com.conductor.pier.api.v2.model.PageAtendimentoClienteResponse;
import br.com.conductor.pier.api.v2.model.PagePessoaDetalheResponse;
import br.com.conductor.pier.api.v2.model.PagePessoaResponse;
import br.com.conductor.pier.api.v2.model.PagePortadorResponse;
import br.com.conductor.pier.api.v2.model.PageProdutoResponse;
import br.com.conductor.pier.api.v2.model.PageBancoResponse;
import br.com.conductor.pier.api.v2.model.PageTelefoneResponse;
import br.com.conductor.pier.api.v2.model.PageTipoEnderecoResponse;
import br.com.conductor.pier.api.v2.model.PageTipoTelefoneResponse;
import br.com.conductor.pier.api.v2.model.PageEnderecoResponse;
import br.com.conductor.pier.api.v2.model.PessoaFisicaAprovadaPersist;
import br.com.conductor.pier.api.v2.model.PessoaFisicaAprovadaResponse;
import br.com.conductor.pier.api.v2.model.PessoaJuridicaAprovadaResponse;
import br.com.conductor.pier.api.v2.model.PessoaJuridicaAprovadaPersist;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class CadastrosGeraisApi {
  private ApiClient apiClient;

  public CadastrosGeraisApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CadastrosGeraisApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Atualiza os dados de um determinado Endere\u00C3\u00A7o
   * Este m\u00C3\u00A9todo permite que seja alterado na base do emissor um ou mais registros ligados a um determinado Endere\u00C3\u00A7o.
   * @param id id
   * @param idPessoa C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o endere\u00C3\u00A7o pertence (id)
   * @param idTipoEndereco C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Tipo Endere\u00C3\u00A7o (id)
   * @param cep Apresenta o C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP) no formaro &#39;58800000&#39;
   * @param logradouro Apresenta o nome do Logradouro
   * @param numero Apresenta o n\u00C3\u00BAmero do endere\u00C3\u00A7o
   * @param complemento Apresenta descri\u00C3\u00A7oes complementares referente ao endere\u00C3\u00A7o
   * @param pontoReferencia Apresenta a descri\u00C3\u00A7\u00C3\u00A3o de ponto de refer\u00C3\u00AAncia do endere\u00C3\u00A7o
   * @param bairro Apresenta nome do bairro
   * @param cidade Apresenta nome da cidade
   * @param uf Apresenta sigla da Unidade Federativa
   * @param pais Apresenta nome do Pais
   * @return EnderecoResponse
   */
  public EnderecoResponse alterarUsingPUT1(Long id, Long idPessoa, Long idTipoEndereco, String cep, String logradouro, Integer numero, String complemento, String pontoReferencia, String bairro, String cidade, String uf, String pais) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT1");
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
   * Este m\u00C3\u00A9todo permite que seja alterado na base do emissor os detalhes de uma determinada Pessoa.
   * @param id ID da Pessoa
   * @param nomeMae Apresenta o nome da m\u00C3\u00A3e da pessoa fisica
   * @param idEstadoCivil Id Estado civil da pessoa fisica
   * @param profissao Profiss\u00C3\u00A3o da pessoa fisica
   * @param idNaturezaOcupacao Id Natureza Ocupa\u00C3\u00A7\u00C3\u00A3o da pessoa fisica
   * @param idNacionalidade Id Nacionalidade da pessoa fisica
   * @param numeroAgencia N\u00C3\u00BAmero da ag\u00C3\u00AAncia.
   * @param numeroContaCorrente N\u00C3\u00BAmero da conta corrente.
   * @param email Email da pessoa fisica
   * @param nomeEmpresa Nome que deve ser impresso no cart\u00C3\u00A3o
   * @return PessoaDetalheResponse
   */
  public PessoaDetalheResponse alterarUsingPUT4(Long id, String nomeMae, Long idEstadoCivil, String profissao, Long idNaturezaOcupacao, Long idNacionalidade, Integer numeroAgencia, String numeroContaCorrente, String email, String nomeEmpresa) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT4");
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
    
    queryParams.addAll(apiClient.parameterToPairs("", "profissao", profissao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idNaturezaOcupacao", idNaturezaOcupacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idNacionalidade", idNacionalidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroContaCorrente", numeroContaCorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "email", email));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeEmpresa", nomeEmpresa));
    

    

    

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
   * Este m\u00C3\u00A9todo permite que seja alterado na base do emissor um registro de determinada Pessoa.
   * @param id ID da Pessoa
   * @param nome Apresenta o &#39;Nome Completo da PF&#39; ou o &#39;Nome Completo da Raz\u00C3\u00A3o Social (Nome Empresarial)&#39;.
   * @param tipo C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo da Pessoa, sendo: (\&quot;PF\&quot;: Pessoa F\u00C3\u00ADsica), (\&quot;PJ\&quot;: Pessoa Jur\u00C3\u00ADdica).
   * @param cpf N\u00C3\u00BAmero do CPF, quando PF.
   * @param cnpj N\u00C3\u00BAmero do CNPJ, quando PJ.
   * @param dataNascimento Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd.
   * @param sexo C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do sexo da Pessoa, quando PF, sendo: (\&quot;M\&quot;: Masculino), (\&quot;F\&quot;: Feminino), (\&quot;O\&quot;: Outro), (\&quot;N\&quot;: N\u00C3\u00A3o Especificado).
   * @param numeroIdentidade N\u00C3\u00BAmero da Identidade.
   * @param orgaoExpedidorIdentidade Org\u00C3\u00A3o expedidor do Identidade.
   * @param unidadeFederativaIdentidade Sigla da Unidade Federativa de onde foi expedido a Identidade
   * @param dataEmissaoIdentidade Data emiss\u00C3\u00A3o da Identidade.
   * @return PessoaResponse
   */
  public PessoaResponse alterarUsingPUT5(Long id, String nome, String tipo, String cpf, String cnpj, String dataNascimento, String sexo, String numeroIdentidade, String orgaoExpedidorIdentidade, String unidadeFederativaIdentidade, String dataEmissaoIdentidade) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT5");
     }
     
     // verify the required parameter 'nome' is set
     if (nome == null) {
        throw new ApiException(400, "Missing the required parameter 'nome' when calling alterarUsingPUT5");
     }
     
     // verify the required parameter 'tipo' is set
     if (tipo == null) {
        throw new ApiException(400, "Missing the required parameter 'tipo' when calling alterarUsingPUT5");
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
   * Realiza a altera\u00C3\u00A7\u00C3\u00A3o de um determinado Telefone
   * Este m\u00C3\u00A9todo permite que seja alterado um determinado Telefone na base de dados do Emissor.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Telefone (id).
   * @param idTipoTelefone C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Telefone (id).
   * @param ddd C\u00C3\u00B3digo DDD do telefone (id).
   * @param telefone N\u00C3\u00BAmero do telefone.
   * @param ramal N\u00C3\u00BAmero do ramal.
   * @return TelefoneResponse
   */
  public TelefoneResponse alterarUsingPUT6(Long id, Long idTipoTelefone, String ddd, String telefone, String ramal) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT6");
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
   * Ativa o par\u00C3\u00A2metro uso exterior para o produto
   * Este m\u00C3\u00A9todo permite ativar o uso no exterior para o produto atrav\u00C3\u00A9s do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id)
   * @return ProdutoDetalhesResponse
   */
  public ProdutoDetalhesResponse ativarUsoExteriorUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling ativarUsoExteriorUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/produtos/{id}/ativar-uso-exterior".replaceAll("\\{format\\}","json")
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

    
    GenericType<ProdutoDetalhesResponse> returnType = new GenericType<ProdutoDetalhesResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Configura a Taxa de Antecipa\u00C3\u00A7\u00C3\u00A3o de um Produto
   * Este recurso permite configurar a Taxa de Antecipa\u00C3\u00A7\u00C3\u00A3o de um Produto, a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id Id Produto
   * @param taxaAntecipacaoRequest taxaAntecipacaoRequest
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse configurarTaxaAntecipacaoUsingPOST(Long id, TaxaAntecipacaoRequest taxaAntecipacaoRequest) throws ApiException {
    Object postBody = taxaAntecipacaoRequest;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling configurarTaxaAntecipacaoUsingPOST");
     }
     
     // verify the required parameter 'taxaAntecipacaoRequest' is set
     if (taxaAntecipacaoRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'taxaAntecipacaoRequest' when calling configurarTaxaAntecipacaoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/produtos/{id}/configurar-taxa-antecipacao".replaceAll("\\{format\\}","json")
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

    
    GenericType<ParametroProdutoResponse> returnType = new GenericType<ParametroProdutoResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Opera\u00C3\u00A7\u00C3\u00A3o utilizada para consultar uma determinada Origem Comercial
   * Este m\u00C3\u00A9todo permite que sejam listados os registros de uma determinada Origem Comercial existente na base do emissor. Para isso, \u00C3\u00A9 preciso informar o seu respectivo c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id ID da Origem Comercial
   * @return OrigemComercialResponse
   */
  public OrigemComercialResponse consultarOrigemComercialUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarOrigemComercialUsingGET");
     }
     
    // create path and map variables
    String path = "/api/origens-comerciais/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<OrigemComercialResponse> returnType = new GenericType<OrigemComercialResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Consulta a Taxa de Antecipa\u00C3\u00A7\u00C3\u00A3o de um Produto
   * Este recurso permite consultar a Taxa de Antecipa\u00C3\u00A7\u00C3\u00A3o de um Produto, a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id Id Produto
   * @param tipoTransacao Tipo da Transa\u00C3\u00A7\u00C3\u00A3o (ON-US ou OFF-US)
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse consultarTaxaAntecipacaoUsingGET(Long id, String tipoTransacao) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxaAntecipacaoUsingGET");
     }
     
     // verify the required parameter 'tipoTransacao' is set
     if (tipoTransacao == null) {
        throw new ApiException(400, "Missing the required parameter 'tipoTransacao' when calling consultarTaxaAntecipacaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/produtos/{id}/consultar-taxa-antecipacao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoTransacao", tipoTransacao));
    

    

    

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

    
    GenericType<ParametroProdutoResponse> returnType = new GenericType<ParametroProdutoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Atendimento
   * Este m\u00C3\u00A9todo permite consultar os par\u00C3\u00A2metros de um determinado Atendimento a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (idAtendimento).
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do atendimento cliente (id).
   * @return AtendimentoClienteResponse
   */
  public AtendimentoClienteResponse consultarUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET");
     }
     
    // create path and map variables
    String path = "/api/atendimento-clientes/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<AtendimentoClienteResponse> returnType = new GenericType<AtendimentoClienteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Banco
   * Este m\u00C3\u00A9todo permite consultar um determinado Banco a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Banco (id).
   * @return BancoResponse
   */
  public BancoResponse consultarUsingGET1(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET1");
     }
     
    // create path and map variables
    String path = "/api/bancos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<BancoResponse> returnType = new GenericType<BancoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de uma determinada Pessoa
   * Este m\u00C3\u00A9todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor.
   * @param id ID da Pessoa
   * @return PessoaResponse
   */
  public PessoaResponse consultarUsingGET10(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET10");
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
   * Apresenta os dados de um determinado Produto
   * Este m\u00C3\u00A9todo permite consultar um determinado Produto a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id)
   * @return ProdutoDetalhesResponse
   */
  public ProdutoDetalhesResponse consultarUsingGET11(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET11");
     }
     
    // create path and map variables
    String path = "/api/produtos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ProdutoDetalhesResponse> returnType = new GenericType<ProdutoDetalhesResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Telefone
   * Este m\u00C3\u00A9todo permite consultar um determinado Telefone a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Telefone (id).
   * @return TelefoneResponse
   */
  public TelefoneResponse consultarUsingGET15(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET15");
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
   * Lista os tipos de ajustes do emissor 
   * Este recurso permite que sejam listados os tipos de ajustes existentes na base de dados do emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id C\u00C3\u00B3digo identificador do tipo de ajuste.
   * @param descricao Descri\u00C3\u00A7\u00C3\u00A3o do tipo de ajuste.
   * @return PageTipoAjusteResponse
   */
  public PageTipoAjusteResponse consultarUsingGET17(Integer page, Integer limit, Long id, String descricao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-ajustes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
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

    
    GenericType<PageTipoAjusteResponse> returnType = new GenericType<PageTipoAjusteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os tipos de boletos do emissor 
   * Este recurso permite que sejam listados os tipos de boletos existentes na base de dados do emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id C\u00C3\u00B3digo identificador do tipo de boleto.
   * @param descricao Descri\u00C3\u00A7\u00C3\u00A3o do tipo de boleto.
   * @param banco C\u00C3\u00B3digo identificador do banco.
   * @return PageTipoBoletoResponse
   */
  public PageTipoBoletoResponse consultarUsingGET18(Integer page, Integer limit, Long id, String descricao, Long banco) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-boletos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "banco", banco));
    

    

    

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

    
    GenericType<PageTipoBoletoResponse> returnType = new GenericType<PageTipoBoletoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Tipo de Endere\u00C3\u00A7o
   * Este m\u00C3\u00A9todo permite consultar um determinado Tipo de Endere\u00C3\u00A7o a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Endere\u00C3\u00A7o (id)
   * @return TipoEnderecoResponse
   */
  public TipoEnderecoResponse consultarUsingGET19(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET19");
     }
     
    // create path and map variables
    String path = "/api/tipos-enderecos/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoEnderecoResponse> returnType = new GenericType<TipoEnderecoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Tipo de Telefone
   * Este m\u00C3\u00A9todo permite consultar um determinado Tipo de Telefone a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Telefone (id)
   * @return TipoTelefoneResponse
   */
  public TipoTelefoneResponse consultarUsingGET21(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET21");
     }
     
    // create path and map variables
    String path = "/api/tipos-telefones/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TipoTelefoneResponse> returnType = new GenericType<TipoTelefoneResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Endere\u00C3\u00A7o
   * Este m\u00C3\u00A9todo permite consultar um determinado Endere\u00C3\u00A7o a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Endere\u00C3\u00A7o (id).
   * @return EnderecoResponse
   */
  public EnderecoResponse consultarUsingGET5(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET5");
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
   * Este m\u00C3\u00A9todo permite a consulta dos detalhes de uma Pessoa existentes na base de dados do Emissor.
   * @param id ID da Pessoa
   * @return PessoaDetalheResponse
   */
  public PessoaDetalheResponse consultarUsingGET9(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET9");
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
   * Desativa o par\u00C3\u00A2metro uso exterior para o produto
   * Este m\u00C3\u00A9todo permite desativar o uso no exterior para o produto atrav\u00C3\u00A9s do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id)
   * @return ProdutoDetalhesResponse
   */
  public ProdutoDetalhesResponse desativarUsoExteriorUsingPOST(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling desativarUsoExteriorUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/produtos/{id}/desativar-uso-exterior".replaceAll("\\{format\\}","json")
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

    
    GenericType<ProdutoDetalhesResponse> returnType = new GenericType<ProdutoDetalhesResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as contas da pessoa
   * Permite listar as contas de um pessoa a partir do seu numero na receita federal.
   * @param numeroReceitaFederal N\u00C3\u00BAmero de identifica\u00C3\u00A7\u00C3\u00A3o do cliente na Receita Federal (CPF ou CNPJ)
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageContaDetalheResponse
   */
  public PageContaDetalheResponse listarContasPorPessoaUsingGET(String numeroReceitaFederal, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'numeroReceitaFederal' is set
     if (numeroReceitaFederal == null) {
        throw new ApiException(400, "Missing the required parameter 'numeroReceitaFederal' when calling listarContasPorPessoaUsingGET");
     }
     
    // create path and map variables
    String path = "/api/pessoas/listar-contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
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
   * Lista os Estados C\u00C3\u00ADvis
   * Este m\u00C3\u00A9todo permite que sejam listados os Estados C\u00C3\u00ADvis na base de dados do Emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse listarEstadosCivisUsingGET(Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/estados-civis".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
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

    
    GenericType<PageCampoCodificadoDescricaoResponse> returnType = new GenericType<PageCampoCodificadoDescricaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar altera\u00C3\u00A7\u00C3\u00B5es de telefones realizadas nos \u00C3\u00BAltimos 60 dias
   * Este m\u00C3\u00A9todo permite verificar quais os telefones de um determinado que cliente que sofreram altera\u00C3\u00A7\u00C3\u00A3o nos \u00C3\u00BAltimos 60 dias.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da pessoa (id).
   * @return HistoricoTelefoneResponse
   */
  public HistoricoTelefoneResponse listarHistoricoTelefonesUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoTelefonesUsingGET");
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
   * Lista nacionalidades
   * Este m\u00C3\u00A9todo permite que sejam listados as nacionalidades na base de dados do Emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse listarNacionalidadesUsingGET(Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/nacionalidades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
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

    
    GenericType<PageCampoCodificadoDescricaoResponse> returnType = new GenericType<PageCampoCodificadoDescricaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as Ocupa\u00C3\u00A7\u00C3\u00B5es
   * Este m\u00C3\u00A9todo permite que sejam listados as naturezas de opera\u00C3\u00A7\u00C3\u00B5es na base de dados do Emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse listarNaturezasOcupacoesUsingGET(Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/ocupacoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
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

    
    GenericType<PageCampoCodificadoDescricaoResponse> returnType = new GenericType<PageCampoCodificadoDescricaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Opera\u00C3\u00A7\u00C3\u00A3o utilizada para listar Origens Comerciais
   * Este m\u00C3\u00A9todo permite que sejam listadas as Origens Comerciais existentes na base do emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id Id da origem comercial
   * @param nome Nome da origem comercial
   * @param status Status da origem comercial
   * @return PageOrigemComercialResponse
   */
  public PageOrigemComercialResponse listarOrigensComerciaisUsingGET(Integer page, Integer limit, Long id, String nome, Integer status) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/origens-comerciais".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
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

    
    GenericType<PageOrigemComercialResponse> returnType = new GenericType<PageOrigemComercialResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista profiss\u00C3\u00B5es
   * Este m\u00C3\u00A9todo permite que sejam listados as profiss\u00C3\u00B5es na base de dados do Emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageCampoCodificadoDescricaoResponse
   */
  public PageCampoCodificadoDescricaoResponse listarProfissoesUsingGET(Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/profissoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
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

    
    GenericType<PageCampoCodificadoDescricaoResponse> returnType = new GenericType<PageCampoCodificadoDescricaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista todos os atendimentos
   * Este m\u00C3\u00A9todo permite que sejam listados todos os Registro de Atendimento, independente do Tipo.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idTipoAtendimento C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo de Atendimento (id)
   * @param idConta C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o de conta (id).
   * @param nomeAtendente Apresenta o nome do Atendente que registrou o Atendimento.
   * @param dataAtendimento Apresenta a data em que o Atendimento foi realizado.
   * @return PageAtendimentoClienteResponse
   */
  public PageAtendimentoClienteResponse listarUsingGET1(Integer page, Integer limit, Long idTipoAtendimento, Long idConta, String nomeAtendente, String dataAtendimento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/atendimento-clientes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoAtendimento", idTipoAtendimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeAtendente", nomeAtendente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAtendimento", dataAtendimento));
    

    

    

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

    
    GenericType<PageAtendimentoClienteResponse> returnType = new GenericType<PageAtendimentoClienteResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Detalhes das Pessoas cadastradas no Emissor
   * Este m\u00C3\u00A9todo permite que sejam listadas od detalhes das Pessoas existentes na base de dados do Emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idPessoa C\u00C3\u00B3digo identificador da pessoa
   * @param nomeMae Apresenta o nome da m\u00C3\u00A3e da pessoa fisica
   * @param idEstadoCivil Id Estado civil da pessoa fisica
   * @param profissao Profiss\u00C3\u00A3o da pessoa fisica
   * @param idNaturezaOcupacao Id Natureza Ocupa\u00C3\u00A7\u00C3\u00A3o da pessoa fisica
   * @param idNacionalidade Id Nacionalidade da pessoa fisica
   * @param numeroAgencia N\u00C3\u00BAmero da ag\u00C3\u00AAncia.
   * @param numeroContaCorrente N\u00C3\u00BAmero da conta corrente.
   * @param email Email da pessoa fisica
   * @param nomeEmpresa Nome que deve ser impresso no cart\u00C3\u00A3o
   * @return PagePessoaDetalheResponse
   */
  public PagePessoaDetalheResponse listarUsingGET14(Integer page, Integer limit, Long idPessoa, String nomeMae, Long idEstadoCivil, String profissao, Long idNaturezaOcupacao, Long idNacionalidade, Integer numeroAgencia, String numeroContaCorrente, String email, String nomeEmpresa) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/pessoas-detalhes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeMae", nomeMae));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstadoCivil", idEstadoCivil));
    
    queryParams.addAll(apiClient.parameterToPairs("", "profissao", profissao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idNaturezaOcupacao", idNaturezaOcupacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idNacionalidade", idNacionalidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroContaCorrente", numeroContaCorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "email", email));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeEmpresa", nomeEmpresa));
    

    

    

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
   * Lista as Pessoas cadastradas no Emissor
   * Este m\u00C3\u00A9todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id).
   * @param nome Apresenta o &#39;Nome Completo da PF&#39; ou o &#39;Nome Completo da Raz\u00C3\u00A3o Social (Nome Empresarial)&#39;.
   * @param tipo C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo da Pessoa, sendo: (\&quot;PF\&quot;: Pessoa F\u00C3\u00ADsica), (\&quot;PJ\&quot;: Pessoa Jur\u00C3\u00ADdica).
   * @param cpf N\u00C3\u00BAmero do CPF, quando PF.
   * @param cnpj N\u00C3\u00BAmero do CNPJ, quando PJ.
   * @param dataNascimento Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ.
   * @param sexo C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do sexo da Pessoa, quando PF, sendo: (\&quot;M\&quot;: Masculino), (\&quot;F\&quot;: Feminino), (\&quot;O\&quot;: Outro), (\&quot;N\&quot;: N\u00C3\u00A3o Especificado).
   * @param numeroIdentidade N\u00C3\u00BAmero da Identidade
   * @param orgaoExpedidorIdentidade Org\u00C3\u00A3o expedidor do RG.
   * @param unidadeFederativaIdentidade Sigla da Unidade Federativa de onde foi expedido a Identidade
   * @param dataEmissaoIdentidade Data emiss\u00C3\u00A3o da identidade no formato aaaa-MM-dd
   * @return PagePessoaResponse
   */
  public PagePessoaResponse listarUsingGET15(Integer page, Integer limit, Long id, String nome, String tipo, String cpf, String cnpj, String dataNascimento, String sexo, String numeroIdentidade, String orgaoExpedidorIdentidade, String unidadeFederativaIdentidade, String dataEmissaoIdentidade) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/pessoas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
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
   * Lista os Portadores existentes
   * Este m\u00C3\u00A9todo permite que sejam listados os portadores cadastrados na base do emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param idConta C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id).
   * @param idProduto C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).
   * @param idPessoa C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id).
   * @param idParentesco C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Parentesco (id)
   * @param tipoPortador Apresenta o tipo do Portador do cart\u00C3\u00A3o, sendo: (&#39;T&#39;: Titular, &#39;A&#39;: Adicional).
   * @param nomeImpresso Apresenta o nome a ser impresso no cart\u00C3\u00A3o.
   * @param idTipoCartao Apresenta o c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo do cart\u00C3\u00A3o (id), que ser\u00C3\u00A1 utilizado para gerar os cart\u00C3\u00B5es deste portador, vinculados a sua respectiva conta atrav\u00C3\u00A9s do campo idConta.
   * @param flagAtivo Quanto ativa, indica que o cadastro do Portador est\u00C3\u00A1 ativo, em emissores que realizam este tipo de gest\u00C3\u00A3o.
   * @param dataCadastroPortador Apresenta a data em que o Portador fora cadastrado, quando possuir esta informa\u00C3\u00A7\u00C3\u00A3o.
   * @param dataCancelamentoPortador Apresenta a data em que o Portador fora cancelado, quando possuir esta informa\u00C3\u00A7\u00C3\u00A3o.
   * @return PagePortadorResponse
   */
  public PagePortadorResponse listarUsingGET17(Integer page, Integer limit, Long idConta, Long idProduto, Long idPessoa, Long idParentesco, String tipoPortador, String nomeImpresso, Long idTipoCartao, Integer flagAtivo, String dataCadastroPortador, String dataCancelamentoPortador) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/portadores".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idParentesco", idParentesco));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tipoPortador", tipoPortador));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeImpresso", nomeImpresso));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idTipoCartao", idTipoCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagAtivo", flagAtivo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCadastroPortador", dataCadastroPortador));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCancelamentoPortador", dataCancelamentoPortador));
    

    

    

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

    
    GenericType<PagePortadorResponse> returnType = new GenericType<PagePortadorResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Produtos do Emissor
   * Este m\u00C3\u00A9todo permite que sejam listados os Produtos existentes na base de dados do Emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param nome Descri\u00C3\u00A7\u00C3\u00A3o do Nome do Produto.
   * @param status Representa o Status do Produto, onde: (\&quot;0\&quot;: Inativo), (\&quot;1\&quot;: Ativo).
   * @param idFantasiaBasica C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Fantasia B\u00C3\u00A1sica (id) a qual o produto pertence.
   * @return PageProdutoResponse
   */
  public PageProdutoResponse listarUsingGET18(Integer page, Integer limit, String nome, Integer status, Long idFantasiaBasica) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/produtos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idFantasiaBasica", idFantasiaBasica));
    

    

    

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

    
    GenericType<PageProdutoResponse> returnType = new GenericType<PageProdutoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Bancos cadastrados para o Emissor
   * Este m\u00C3\u00A9todo permite que sejam listados os Bancos existentes na base de dados do Emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @return PageBancoResponse
   */
  public PageBancoResponse listarUsingGET2(Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/bancos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
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

    
    GenericType<PageBancoResponse> returnType = new GenericType<PageBancoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Telefones cadastrados no Emissor
   * Este m\u00C3\u00A9todo permite que sejam listados os Telefones existentes na base de dados do Emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Telefone (id).
   * @param idTipoTelefone C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Telefone (id).
   * @param idPessoa C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id) a qual o telefone pertence.
   * @param ddd C\u00C3\u00B3digo DDD do telefone (id).
   * @param telefone N\u00C3\u00BAmero do telefone.
   * @param ramal N\u00C3\u00BAmero do ramal.
   * @param status Apresenta o Status do Telefone, onde: &#39;0&#39;: Inativo e &#39;1&#39;: Ativo
   * @return PageTelefoneResponse
   */
  public PageTelefoneResponse listarUsingGET22(Integer page, Integer limit, Long id, Long idTipoTelefone, Long idPessoa, String ddd, String telefone, String ramal, Integer status) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/telefones".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
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
   * Lista as op\u00C3\u00B5es de Tipos de Endere\u00C3\u00A7os do Emissor 
   * Este m\u00C3\u00A9todo permite que sejam listados os Tipos de Endere\u00C3\u00A7os existentes na base de dados do Emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Endere\u00C3\u00A7o (id)
   * @param nome Nome do Tipo do Endere\u00C3\u00A7o
   * @return PageTipoEnderecoResponse
   */
  public PageTipoEnderecoResponse listarUsingGET24(Integer page, Integer limit, Long id, String nome) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-enderecos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    

    

    

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

    
    GenericType<PageTipoEnderecoResponse> returnType = new GenericType<PageTipoEnderecoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Tipos de Telefones
   * Este m\u00C3\u00A9todo permite que sejam listados os Tipos de Telefones existentes na base de dados do Emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Telefone (id).
   * @param nome Nome do Tipo do Telefone
   * @return PageTipoTelefoneResponse
   */
  public PageTipoTelefoneResponse listarUsingGET26(Integer page, Integer limit, Long id, String nome) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-telefones".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    

    

    

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

    
    GenericType<PageTipoTelefoneResponse> returnType = new GenericType<PageTipoTelefoneResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Endere\u00C3\u00A7os cadastrados para o Emissor
   * Este m\u00C3\u00A9todo permite que sejam listados os Endere\u00C3\u00A7os existentes na base de dados do Emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 50, Max = 50)
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Endere\u00C3\u00A7o (id).
   * @param idPessoa C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o endere\u00C3\u00A7o pertence (id)
   * @param idTipoEndereco C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Tipo Endere\u00C3\u00A7o (id)
   * @param cep Apresenta o C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP)
   * @param logradouro Apresenta o nome do Logradouro
   * @param numero Apresenta o n\u00C3\u00BAmero do endere\u00C3\u00A7o
   * @param complemento Apresenta descri\u00C3\u00A7oes complementares referente ao endere\u00C3\u00A7o
   * @param pontoReferencia Apresenta a descri\u00C3\u00A7\u00C3\u00A3o de ponto de refer\u00C3\u00AAncia do endere\u00C3\u00A7o
   * @param bairro Apresenta nome do bairro
   * @param cidade Apresenta nome da cidade
   * @param uf Apresenta sigla da Unidade Federativa
   * @param pais Apresenta nome do Pais
   * @param dataInclusao Apresenta a data em que fora cadastrado o Endere\u00C3\u00A7o
   * @param dataUltimaAtualizacao Data em que fora realizada a \u00C3\u00BAltima mudan\u00C3\u00A7a neste registro de endere\u00C3\u00A7o. Quando n\u00C3\u00A3o tiver ocorrido mudan\u00C3\u00A7a, conter\u00C3\u00A1 a mesma informa\u00C3\u00A7\u00C3\u00A3o que o campo dataInclusao
   * @return PageEnderecoResponse
   */
  public PageEnderecoResponse listarUsingGET9(Integer page, Integer limit, Long id, Long idPessoa, Long idTipoEndereco, String cep, String logradouro, Integer numero, String complemento, String pontoReferencia, String bairro, String cidade, String uf, String pais, String dataInclusao, String dataUltimaAtualizacao) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/enderecos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
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
   * Cadastro de Conta e Pessoa Fisica
   * Permite realizar o cadastro de uma Conta para um cliente do tipo Pessoa F\u00C3\u00ADsica, recebendo nesta opera\u00C3\u00A7\u00C3\u00A3o todos os dados cadastrais que se fazem necess\u00C3\u00A1rios para isso. Uma vez criado, poder\u00C3\u00A1 ser acionado o m\u00C3\u00A9todo de &#39;Gera\u00C3\u00A7\u00C3\u00A3o de Cart\u00C3\u00A3o&#39; para o cliente e seus adicionais.
   * @param pessoaPersist pessoaPersist
   * @return PessoaFisicaAprovadaResponse
   */
  public PessoaFisicaAprovadaResponse salvarPessoaFisicaAprovadaUsingPOST(PessoaFisicaAprovadaPersist pessoaPersist) throws ApiException {
    Object postBody = pessoaPersist;
    
     // verify the required parameter 'pessoaPersist' is set
     if (pessoaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'pessoaPersist' when calling salvarPessoaFisicaAprovadaUsingPOST");
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

    
    GenericType<PessoaFisicaAprovadaResponse> returnType = new GenericType<PessoaFisicaAprovadaResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cadastro de Conta e Pessoa Jur\u00C3\u00ADdica
   * Cadastro de Conta e Pessoa Jur\u00C3\u00ADdica Permite realizar o cadastro de uma Conta para um cliente do tipo Pessoa Jur\u00C3\u00ADdica, recebendo nesta opera\u00C3\u00A7\u00C3\u00A3o todos os dados cadastrais que se fazem necess\u00C3\u00A1rios para isso, inclu\u00C3\u00ADndo o registro de cada um dos s\u00C3\u00B3cios. Uma vez criado, poder\u00C3\u00A1 ser acionado o m\u00C3\u00A9todo de &#39;Gera\u00C3\u00A7\u00C3\u00A3o de Cart\u00C3\u00A3o&#39; para o cliente e cada um dos s\u00C3\u00B3cios vinculados.
   * @param pessoaPersist pessoaPersist
   * @return PessoaJuridicaAprovadaResponse
   */
  public PessoaJuridicaAprovadaResponse salvarPessoaJuridicaAprovadaUsingPOST(PessoaJuridicaAprovadaPersist pessoaPersist) throws ApiException {
    Object postBody = pessoaPersist;
    
     // verify the required parameter 'pessoaPersist' is set
     if (pessoaPersist == null) {
        throw new ApiException(400, "Missing the required parameter 'pessoaPersist' when calling salvarPessoaJuridicaAprovadaUsingPOST");
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
   * Cadastro um novo Atendimento do tipo Gen\u00C3\u00A9rico para uma Conta
   * 
   * @param idConta C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o Atendimento est\u00C3\u00A1 associado
   * @param conteudoAtendimento Apresenta as informa\u00C3\u00A7\u00C3\u00B5es que foram utilizadas para consultar, cadastrar ou alterar informa\u00C3\u00A7\u00C3\u00B5es relacionadas ao Atendimento.
   * @param detalhesAtendimento Apresenta os detalhes lan\u00C3\u00A7ados pelo sistema ou pelo Atendente durante relacionados ao Atendimento.
   * @param nomeAtendente Apresenta o nome do Atendente que registrou o Atendimento.
   * @param dataAtendimento Apresenta a data e hora em que o Atendimento foi realizado no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;.
   * @param dataAgendamento Quando utilizado, de acordo com o Tipo de Atendimento, apresenta a data e hora para processamento ou a data e hora para retorno do Atendimento no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;.
   * @param dataHoraInicioAtendimento Apresenta a data e hora em que o Atendimento foi iniciado. Quando utilizado, serve para medir a performance dos Atendimentos no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;.
   * @param dataHoraFimAtendimento Apresenta a data e hora em que o Atendimento foi iniciado. Quando utilizado, serve para medir a performance dos Atendimentos no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;.
   * @param flagFilaFraude Flag fila fraude
   * @return AtendimentoClienteResponse
   */
  public AtendimentoClienteResponse salvarUsingPOST1(Long idConta, String conteudoAtendimento, String detalhesAtendimento, String nomeAtendente, String dataAtendimento, String dataAgendamento, String dataHoraInicioAtendimento, String dataHoraFimAtendimento, Integer flagFilaFraude) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/atendimento-clientes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "conteudoAtendimento", conteudoAtendimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "detalhesAtendimento", detalhesAtendimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeAtendente", nomeAtendente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAtendimento", dataAtendimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataAgendamento", dataAgendamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraInicioAtendimento", dataHoraInicioAtendimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataHoraFimAtendimento", dataHoraFimAtendimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "flagFilaFraude", flagFilaFraude));
    

    

    

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

    
    GenericType<AtendimentoClienteResponse> returnType = new GenericType<AtendimentoClienteResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza o cadastro de um novo Telefone
   * Este m\u00C3\u00A9todo permite que seja cadastrado um novo Telefone na base de dados do Emissor.
   * @param idTipoTelefone C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Telefone (id).
   * @param idPessoa C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id) a qual o telefone pertence.
   * @param ddd C\u00C3\u00B3digo DDD do telefone (id).
   * @param telefone N\u00C3\u00BAmero do telefone.
   * @param ramal N\u00C3\u00BAmero do ramal.
   * @return TelefoneResponse
   */
  public TelefoneResponse salvarUsingPOST10(Long idTipoTelefone, Long idPessoa, String ddd, String telefone, String ramal) throws ApiException {
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
  
  /**
   * Realiza o cadastro de um novo Endere\u00C3\u00A7o
   * Este m\u00C3\u00A9todo permite que seja cadastrado um novo Endere\u00C3\u00A7o na base de dados do Emissor.
   * @param idPessoa C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o endere\u00C3\u00A7o pertence (id)
   * @param idTipoEndereco C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Tipo Endere\u00C3\u00A7o (id)
   * @param cep Apresenta o C\u00C3\u00B3digo de Endere\u00C3\u00A7amento Postal (CEP) no formaro &#39;58800000&#39;
   * @param logradouro Apresenta o nome do Logradouro
   * @param numero Apresenta o n\u00C3\u00BAmero do endere\u00C3\u00A7o
   * @param complemento Apresenta descri\u00C3\u00A7oes complementares referente ao endere\u00C3\u00A7o
   * @param pontoReferencia Apresenta a descri\u00C3\u00A7\u00C3\u00A3o de ponto de refer\u00C3\u00AAncia do endere\u00C3\u00A7o
   * @param bairro Apresenta nome do bairro
   * @param cidade Apresenta nome da cidade
   * @param uf Apresenta sigla da Unidade Federativa
   * @param pais Apresenta nome do Pais
   * @return EnderecoResponse
   */
  public EnderecoResponse salvarUsingPOST4(Long idPessoa, Long idTipoEndereco, String cep, String logradouro, Integer numero, String complemento, String pontoReferencia, String bairro, String cidade, String uf, String pais) throws ApiException {
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
   * Salvar os detalhes de uma determinada Pessoa
   * Este m\u00C3\u00A9todo permite que seja incluido na base do emissor os detalhes de uma determinada Pessoa.
   * @param idPessoa Apresenta o c\u00C3\u00B3digo identificador da pessoa
   * @param nomeMae Apresenta o nome da m\u00C3\u00A3e da pessoa fisica
   * @param idEstadoCivil Id Estado civil da pessoa fisica
   * @param profissao Profiss\u00C3\u00A3o da pessoa fisica
   * @param idNaturezaOcupacao Id Natureza Ocupa\u00C3\u00A7\u00C3\u00A3o da pessoa fisica
   * @param idNacionalidade Id Nacionalidade da pessoa fisica
   * @param numeroAgencia N\u00C3\u00BAmero da ag\u00C3\u00AAncia.
   * @param numeroContaCorrente N\u00C3\u00BAmero da conta corrente.
   * @param email Email da pessoa fisica
   * @param nomeEmpresa Nome que deve ser impresso no cart\u00C3\u00A3o
   * @return PessoaDetalheResponse
   */
  public PessoaDetalheResponse salvarUsingPOST7(Long idPessoa, String nomeMae, Long idEstadoCivil, String profissao, Long idNaturezaOcupacao, Long idNacionalidade, Integer numeroAgencia, String numeroContaCorrente, String email, String nomeEmpresa) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/pessoas-detalhes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeMae", nomeMae));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idEstadoCivil", idEstadoCivil));
    
    queryParams.addAll(apiClient.parameterToPairs("", "profissao", profissao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idNaturezaOcupacao", idNaturezaOcupacao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idNacionalidade", idNacionalidade));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "numeroContaCorrente", numeroContaCorrente));
    
    queryParams.addAll(apiClient.parameterToPairs("", "email", email));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nomeEmpresa", nomeEmpresa));
    

    

    

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
   * Realiza o cadastro de um nova Pessoa
   * Este m\u00C3\u00A9todo permite que seja cadastrado uma nova Pessoa na base de dados do Emissor.
   * @param nome Apresenta o &#39;Nome Completo da PF&#39; ou o &#39;Nome Completo da Raz\u00C3\u00A3o Social (Nome Empresarial)&#39;.
   * @param tipo C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo da Pessoa, sendo: (\&quot;PF\&quot;: Pessoa F\u00C3\u00ADsica), (\&quot;PJ\&quot;: Pessoa Jur\u00C3\u00ADdica).
   * @param cpf N\u00C3\u00BAmero do CPF, quando PF.
   * @param cnpj N\u00C3\u00BAmero do CNPJ, quando PJ.
   * @param dataNascimento Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd.
   * @param sexo C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do sexo da Pessoa, quando PF, sendo: (\&quot;M\&quot;: Masculino), (\&quot;F\&quot;: Feminino), (\&quot;O\&quot;: Outro), (\&quot;N\&quot;: N\u00C3\u00A3o Especificado).
   * @param numeroIdentidade N\u00C3\u00BAmero da Identidade.
   * @param orgaoExpedidorIdentidade Org\u00C3\u00A3o expedidor do Identidade.
   * @param unidadeFederativaIdentidade Sigla da Unidade Federativa de onde foi expedido a Identidade
   * @param dataEmissaoIdentidade Data emiss\u00C3\u00A3o da Identidade.
   * @return PessoaResponse
   */
  public PessoaResponse salvarUsingPOST8(String nome, String tipo, String cpf, String cnpj, String dataNascimento, String sexo, String numeroIdentidade, String orgaoExpedidorIdentidade, String unidadeFederativaIdentidade, String dataEmissaoIdentidade) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'nome' is set
     if (nome == null) {
        throw new ApiException(400, "Missing the required parameter 'nome' when calling salvarUsingPOST8");
     }
     
     // verify the required parameter 'tipo' is set
     if (tipo == null) {
        throw new ApiException(400, "Missing the required parameter 'tipo' when calling salvarUsingPOST8");
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
  
}

