package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ObjetoEndereoAprovado;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ObjetoPessoaFsicaAprovadaResponse   {
  
  private Long id = null;
  private String nome = null;
  private String nomeMae = null;
  private String dataNascimento = null;
  private String sexo = null;
  private String cpf = null;
  private String numeroIdentidade = null;
  private String orgaoExpedidorIdentidade = null;
  private String unidadeFederativaIdentidade = null;
  private String dataEmissaoIdentidade = null;
  private Long idEstadoCivil = null;
  private String idProfissao = null;
  private Long idNaturezaOcupacao = null;
  private Long idNacionalidade = null;
  private Long idOrigemComercial = null;
  private Long idProduto = null;
  private Integer numeroAgencia = null;
  private String numeroContaCorrente = null;
  private String email = null;
  private Integer diaVencimento = null;
  private String nomeImpresso = null;
  private String nomeEmpresa = null;
  private Long idConta = null;
  private Long idProposta = null;
  private String canalEntrada = null;
  private Integer valorPontuacao = null;
  private List<TelefonePessoaAprovadaResponse> telefones = new ArrayList<TelefonePessoaAprovadaResponse>();
  private List<ObjetoEndereoAprovado> enderecos = new ArrayList<ObjetoEndereoAprovado>();
  private BigDecimal limiteGlobal = null;
  private BigDecimal limiteMaximo = null;
  private BigDecimal limiteParcelas = null;
  private BigDecimal limiteConsignado = null;
  private Boolean impedidoFinanciamento = null;
  private String nomeReferencia1 = null;
  private String enderecoReferencia1 = null;
  private String nomeReferencia2 = null;
  private String enderecoReferencia2 = null;


  public enum FuncaoAtivaEnum {
    DEBITO_CREDITO("DEBITO_CREDITO"),
    CREDITO("CREDITO"),
    DEBITO("DEBITO");

    private String value;

    FuncaoAtivaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private FuncaoAtivaEnum funcaoAtiva = null;
  private String matricula = null;
  private String responsavelDigitacao = null;
  private Integer idPromotorVenda = null;
  private String naturalidadeCidade = null;
  private String naturalidadeEstado = null;
  private Integer grauInstrucao = null;
  private Integer numeroDependentes = null;
  private String nomePai = null;
  private Integer chequeEspecial = null;
  private Integer numeroBanco = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da pessoa fisica (id)
   **/
  public ObjetoPessoaFsicaAprovadaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da pessoa fisica (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o nome completo da pessoa fisica
   **/
  public ObjetoPessoaFsicaAprovadaResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o nome completo da pessoa fisica")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Apresenta o nome da m\u00E3e da pessoa fisica
   **/
  public ObjetoPessoaFsicaAprovadaResponse nomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome da m\u00E3e da pessoa fisica")
  @JsonProperty("nomeMae")
  public String getNomeMae() {
    return nomeMae;
  }
  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  
  /**
   * Data de Nascimento da Pessoa. Essa data deve ser informada no formato aaaa-MM-dd
   **/
  public ObjetoPessoaFsicaAprovadaResponse dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Nascimento da Pessoa. Essa data deve ser informada no formato aaaa-MM-dd")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do sexo da pessoa, quando \u00E9 PF, sendo: ('M': Masculino), ('F': Feminino)
   **/
  public ObjetoPessoaFsicaAprovadaResponse sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do sexo da pessoa, quando \u00E9 PF, sendo: ('M': Masculino), ('F': Feminino)")
  @JsonProperty("sexo")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * N\u00FAmero de CPF
   **/
  public ObjetoPessoaFsicaAprovadaResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero de CPF")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * N\u00FAmero da identidade
   **/
  public ObjetoPessoaFsicaAprovadaResponse numeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da identidade")
  @JsonProperty("numeroIdentidade")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Org\u00E3o expedidor da Identidade
   **/
  public ObjetoPessoaFsicaAprovadaResponse orgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Org\u00E3o expedidor da Identidade")
  @JsonProperty("orgaoExpedidorIdentidade")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * Sigla da Unidade Federativa de onde foi expedido a Identidade
   **/
  public ObjetoPessoaFsicaAprovadaResponse unidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sigla da Unidade Federativa de onde foi expedido a Identidade")
  @JsonProperty("unidadeFederativaIdentidade")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * Data emiss\u00E3o da Identidade no formato aaaa-MM-dd
   **/
  public ObjetoPessoaFsicaAprovadaResponse dataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data emiss\u00E3o da Identidade no formato aaaa-MM-dd")
  @JsonProperty("dataEmissaoIdentidade")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * Id Estado civil da pessoa fisica
   **/
  public ObjetoPessoaFsicaAprovadaResponse idEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id Estado civil da pessoa fisica")
  @JsonProperty("idEstadoCivil")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * Profiss\u00E3o da pessoa fisica
   **/
  public ObjetoPessoaFsicaAprovadaResponse idProfissao(String idProfissao) {
    this.idProfissao = idProfissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Profiss\u00E3o da pessoa fisica")
  @JsonProperty("idProfissao")
  public String getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(String idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * Id Natureza Ocupa\u00E7\u00E3o da pessoa fisica
   **/
  public ObjetoPessoaFsicaAprovadaResponse idNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id Natureza Ocupa\u00E7\u00E3o da pessoa fisica")
  @JsonProperty("idNaturezaOcupacao")
  public Long getIdNaturezaOcupacao() {
    return idNaturezaOcupacao;
  }
  public void setIdNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
  }

  
  /**
   * Id Nacionalidade da pessoa fisica
   **/
  public ObjetoPessoaFsicaAprovadaResponse idNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id Nacionalidade da pessoa fisica")
  @JsonProperty("idNacionalidade")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * Id da origem comercial
   **/
  public ObjetoPessoaFsicaAprovadaResponse idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id da origem comercial")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Id do produto
   **/
  public ObjetoPessoaFsicaAprovadaResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id do produto")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * N\u00FAmero da ag\u00EAncia
   **/
  public ObjetoPessoaFsicaAprovadaResponse numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da ag\u00EAncia")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * N\u00FAmero da conta corrente
   **/
  public ObjetoPessoaFsicaAprovadaResponse numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da conta corrente")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Email da pessoa fisica
   **/
  public ObjetoPessoaFsicaAprovadaResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email da pessoa fisica")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Dia vencimento
   **/
  public ObjetoPessoaFsicaAprovadaResponse diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Dia vencimento")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Nome que deve ser impresso no cart\u00E3o
   **/
  public ObjetoPessoaFsicaAprovadaResponse nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome que deve ser impresso no cart\u00E3o")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Nome da empresa
   **/
  public ObjetoPessoaFsicaAprovadaResponse nomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da empresa")
  @JsonProperty("nomeEmpresa")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta cadastrada
   **/
  public ObjetoPessoaFsicaAprovadaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da conta cadastrada")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da proposta
   **/
  public ObjetoPessoaFsicaAprovadaResponse idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da proposta")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * Indica o canal pelo qual o cadastro do cliente foi realizado
   **/
  public ObjetoPessoaFsicaAprovadaResponse canalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica o canal pelo qual o cadastro do cliente foi realizado")
  @JsonProperty("canalEntrada")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * Indica o valor da pontua\u00E7\u00E3o atribuido ao cliente (caso n\u00E3o informado ser\u00E1 atribuido o valor =0)
   **/
  public ObjetoPessoaFsicaAprovadaResponse valorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica o valor da pontua\u00E7\u00E3o atribuido ao cliente (caso n\u00E3o informado ser\u00E1 atribuido o valor =0)")
  @JsonProperty("valorPontuacao")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * Apresenta os telefones da empresa
   **/
  public ObjetoPessoaFsicaAprovadaResponse telefones(List<TelefonePessoaAprovadaResponse> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta os telefones da empresa")
  @JsonProperty("telefones")
  public List<TelefonePessoaAprovadaResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaResponse> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * Pode ser informado os seguintes tipos de endere\u00E7o: Residencial, Comercial, e Outros
   **/
  public ObjetoPessoaFsicaAprovadaResponse enderecos(List<ObjetoEndereoAprovado> enderecos) {
    this.enderecos = enderecos;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Pode ser informado os seguintes tipos de endere\u00E7o: Residencial, Comercial, e Outros")
  @JsonProperty("enderecos")
  public List<ObjetoEndereoAprovado> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<ObjetoEndereoAprovado> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * Valor do Limite Global
   **/
  public ObjetoPessoaFsicaAprovadaResponse limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor do Limite Global")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es
   **/
  public ObjetoPessoaFsicaAprovadaResponse limiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es")
  @JsonProperty("limiteMaximo")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras
   **/
  public ObjetoPessoaFsicaAprovadaResponse limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Valor do limite de margem consignado
   **/
  public ObjetoPessoaFsicaAprovadaResponse limiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor do limite de margem consignado")
  @JsonProperty("limiteConsignado")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito(Lei n. 4.595/64)
   **/
  public ObjetoPessoaFsicaAprovadaResponse impedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito(Lei n. 4.595/64)")
  @JsonProperty("impedidoFinanciamento")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  
  /**
   * Nome de refer\u00EAncia 1
   **/
  public ObjetoPessoaFsicaAprovadaResponse nomeReferencia1(String nomeReferencia1) {
    this.nomeReferencia1 = nomeReferencia1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome de refer\u00EAncia 1")
  @JsonProperty("nomeReferencia1")
  public String getNomeReferencia1() {
    return nomeReferencia1;
  }
  public void setNomeReferencia1(String nomeReferencia1) {
    this.nomeReferencia1 = nomeReferencia1;
  }

  
  /**
   * Endere\u00E7o de refer\u00EAncia 1
   **/
  public ObjetoPessoaFsicaAprovadaResponse enderecoReferencia1(String enderecoReferencia1) {
    this.enderecoReferencia1 = enderecoReferencia1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Endere\u00E7o de refer\u00EAncia 1")
  @JsonProperty("enderecoReferencia1")
  public String getEnderecoReferencia1() {
    return enderecoReferencia1;
  }
  public void setEnderecoReferencia1(String enderecoReferencia1) {
    this.enderecoReferencia1 = enderecoReferencia1;
  }

  
  /**
   * Nome de refer\u00EAncia 2
   **/
  public ObjetoPessoaFsicaAprovadaResponse nomeReferencia2(String nomeReferencia2) {
    this.nomeReferencia2 = nomeReferencia2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome de refer\u00EAncia 2")
  @JsonProperty("nomeReferencia2")
  public String getNomeReferencia2() {
    return nomeReferencia2;
  }
  public void setNomeReferencia2(String nomeReferencia2) {
    this.nomeReferencia2 = nomeReferencia2;
  }

  
  /**
   * Endere\u00E7o de refer\u00EAncia 2
   **/
  public ObjetoPessoaFsicaAprovadaResponse enderecoReferencia2(String enderecoReferencia2) {
    this.enderecoReferencia2 = enderecoReferencia2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Endere\u00E7o de refer\u00EAncia 2")
  @JsonProperty("enderecoReferencia2")
  public String getEnderecoReferencia2() {
    return enderecoReferencia2;
  }
  public void setEnderecoReferencia2(String enderecoReferencia2) {
    this.enderecoReferencia2 = enderecoReferencia2;
  }

  
  /**
   * Fun\u00E7\u00E3o ativa da conta
   **/
  public ObjetoPessoaFsicaAprovadaResponse funcaoAtiva(FuncaoAtivaEnum funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fun\u00E7\u00E3o ativa da conta")
  @JsonProperty("funcaoAtiva")
  public FuncaoAtivaEnum getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(FuncaoAtivaEnum funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  
  /**
   * N\u00FAmero da matr\u00EDcula
   **/
  public ObjetoPessoaFsicaAprovadaResponse matricula(String matricula) {
    this.matricula = matricula;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da matr\u00EDcula")
  @JsonProperty("matricula")
  public String getMatricula() {
    return matricula;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  
  /**
   * Respons\u00E1vel pela digita\u00E7\u00E3o da proposta
   **/
  public ObjetoPessoaFsicaAprovadaResponse responsavelDigitacao(String responsavelDigitacao) {
    this.responsavelDigitacao = responsavelDigitacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Respons\u00E1vel pela digita\u00E7\u00E3o da proposta")
  @JsonProperty("responsavelDigitacao")
  public String getResponsavelDigitacao() {
    return responsavelDigitacao;
  }
  public void setResponsavelDigitacao(String responsavelDigitacao) {
    this.responsavelDigitacao = responsavelDigitacao;
  }

  
  /**
   * C\u00F3digo identificador do promotor de venda
   **/
  public ObjetoPessoaFsicaAprovadaResponse idPromotorVenda(Integer idPromotorVenda) {
    this.idPromotorVenda = idPromotorVenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do promotor de venda")
  @JsonProperty("idPromotorVenda")
  public Integer getIdPromotorVenda() {
    return idPromotorVenda;
  }
  public void setIdPromotorVenda(Integer idPromotorVenda) {
    this.idPromotorVenda = idPromotorVenda;
  }

  
  /**
   * Apresenta o nome da cidade de nascimento da pessoa f\u00EDsica
   **/
  public ObjetoPessoaFsicaAprovadaResponse naturalidadeCidade(String naturalidadeCidade) {
    this.naturalidadeCidade = naturalidadeCidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome da cidade de nascimento da pessoa f\u00EDsica")
  @JsonProperty("naturalidadeCidade")
  public String getNaturalidadeCidade() {
    return naturalidadeCidade;
  }
  public void setNaturalidadeCidade(String naturalidadeCidade) {
    this.naturalidadeCidade = naturalidadeCidade;
  }

  
  /**
   * Apresenta a sigla do estado de nascimento da pessoa f\u00EDsica
   **/
  public ObjetoPessoaFsicaAprovadaResponse naturalidadeEstado(String naturalidadeEstado) {
    this.naturalidadeEstado = naturalidadeEstado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a sigla do estado de nascimento da pessoa f\u00EDsica")
  @JsonProperty("naturalidadeEstado")
  public String getNaturalidadeEstado() {
    return naturalidadeEstado;
  }
  public void setNaturalidadeEstado(String naturalidadeEstado) {
    this.naturalidadeEstado = naturalidadeEstado;
  }

  
  /**
   * Apresenta o grau de instru\u00E7\u00E3o da pessoa f\u00EDsica
   **/
  public ObjetoPessoaFsicaAprovadaResponse grauInstrucao(Integer grauInstrucao) {
    this.grauInstrucao = grauInstrucao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o grau de instru\u00E7\u00E3o da pessoa f\u00EDsica")
  @JsonProperty("grauInstrucao")
  public Integer getGrauInstrucao() {
    return grauInstrucao;
  }
  public void setGrauInstrucao(Integer grauInstrucao) {
    this.grauInstrucao = grauInstrucao;
  }

  
  /**
   * AApresenta o n\u00FAmero de dependentes da pessoa f\u00EDsica
   **/
  public ObjetoPessoaFsicaAprovadaResponse numeroDependentes(Integer numeroDependentes) {
    this.numeroDependentes = numeroDependentes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "AApresenta o n\u00FAmero de dependentes da pessoa f\u00EDsica")
  @JsonProperty("numeroDependentes")
  public Integer getNumeroDependentes() {
    return numeroDependentes;
  }
  public void setNumeroDependentes(Integer numeroDependentes) {
    this.numeroDependentes = numeroDependentes;
  }

  
  /**
   * Apresenta o nome do pai da pessoa f\u00EDsica
   **/
  public ObjetoPessoaFsicaAprovadaResponse nomePai(String nomePai) {
    this.nomePai = nomePai;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome do pai da pessoa f\u00EDsica")
  @JsonProperty("nomePai")
  public String getNomePai() {
    return nomePai;
  }
  public void setNomePai(String nomePai) {
    this.nomePai = nomePai;
  }

  
  /**
   * Indica se pessoa f\u00EDsica aderir ao cheque especial
   **/
  public ObjetoPessoaFsicaAprovadaResponse chequeEspecial(Integer chequeEspecial) {
    this.chequeEspecial = chequeEspecial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica se pessoa f\u00EDsica aderir ao cheque especial")
  @JsonProperty("chequeEspecial")
  public Integer getChequeEspecial() {
    return chequeEspecial;
  }
  public void setChequeEspecial(Integer chequeEspecial) {
    this.chequeEspecial = chequeEspecial;
  }

  
  /**
   * N\u00FAmero do Banco
   **/
  public ObjetoPessoaFsicaAprovadaResponse numeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do Banco")
  @JsonProperty("numeroBanco")
  public Integer getNumeroBanco() {
    return numeroBanco;
  }
  public void setNumeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjetoPessoaFsicaAprovadaResponse objetoPessoaFsicaAprovadaResponse = (ObjetoPessoaFsicaAprovadaResponse) o;
    return Objects.equals(this.id, objetoPessoaFsicaAprovadaResponse.id) &&
        Objects.equals(this.nome, objetoPessoaFsicaAprovadaResponse.nome) &&
        Objects.equals(this.nomeMae, objetoPessoaFsicaAprovadaResponse.nomeMae) &&
        Objects.equals(this.dataNascimento, objetoPessoaFsicaAprovadaResponse.dataNascimento) &&
        Objects.equals(this.sexo, objetoPessoaFsicaAprovadaResponse.sexo) &&
        Objects.equals(this.cpf, objetoPessoaFsicaAprovadaResponse.cpf) &&
        Objects.equals(this.numeroIdentidade, objetoPessoaFsicaAprovadaResponse.numeroIdentidade) &&
        Objects.equals(this.orgaoExpedidorIdentidade, objetoPessoaFsicaAprovadaResponse.orgaoExpedidorIdentidade) &&
        Objects.equals(this.unidadeFederativaIdentidade, objetoPessoaFsicaAprovadaResponse.unidadeFederativaIdentidade) &&
        Objects.equals(this.dataEmissaoIdentidade, objetoPessoaFsicaAprovadaResponse.dataEmissaoIdentidade) &&
        Objects.equals(this.idEstadoCivil, objetoPessoaFsicaAprovadaResponse.idEstadoCivil) &&
        Objects.equals(this.idProfissao, objetoPessoaFsicaAprovadaResponse.idProfissao) &&
        Objects.equals(this.idNaturezaOcupacao, objetoPessoaFsicaAprovadaResponse.idNaturezaOcupacao) &&
        Objects.equals(this.idNacionalidade, objetoPessoaFsicaAprovadaResponse.idNacionalidade) &&
        Objects.equals(this.idOrigemComercial, objetoPessoaFsicaAprovadaResponse.idOrigemComercial) &&
        Objects.equals(this.idProduto, objetoPessoaFsicaAprovadaResponse.idProduto) &&
        Objects.equals(this.numeroAgencia, objetoPessoaFsicaAprovadaResponse.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, objetoPessoaFsicaAprovadaResponse.numeroContaCorrente) &&
        Objects.equals(this.email, objetoPessoaFsicaAprovadaResponse.email) &&
        Objects.equals(this.diaVencimento, objetoPessoaFsicaAprovadaResponse.diaVencimento) &&
        Objects.equals(this.nomeImpresso, objetoPessoaFsicaAprovadaResponse.nomeImpresso) &&
        Objects.equals(this.nomeEmpresa, objetoPessoaFsicaAprovadaResponse.nomeEmpresa) &&
        Objects.equals(this.idConta, objetoPessoaFsicaAprovadaResponse.idConta) &&
        Objects.equals(this.idProposta, objetoPessoaFsicaAprovadaResponse.idProposta) &&
        Objects.equals(this.canalEntrada, objetoPessoaFsicaAprovadaResponse.canalEntrada) &&
        Objects.equals(this.valorPontuacao, objetoPessoaFsicaAprovadaResponse.valorPontuacao) &&
        Objects.equals(this.telefones, objetoPessoaFsicaAprovadaResponse.telefones) &&
        Objects.equals(this.enderecos, objetoPessoaFsicaAprovadaResponse.enderecos) &&
        Objects.equals(this.limiteGlobal, objetoPessoaFsicaAprovadaResponse.limiteGlobal) &&
        Objects.equals(this.limiteMaximo, objetoPessoaFsicaAprovadaResponse.limiteMaximo) &&
        Objects.equals(this.limiteParcelas, objetoPessoaFsicaAprovadaResponse.limiteParcelas) &&
        Objects.equals(this.limiteConsignado, objetoPessoaFsicaAprovadaResponse.limiteConsignado) &&
        Objects.equals(this.impedidoFinanciamento, objetoPessoaFsicaAprovadaResponse.impedidoFinanciamento) &&
        Objects.equals(this.nomeReferencia1, objetoPessoaFsicaAprovadaResponse.nomeReferencia1) &&
        Objects.equals(this.enderecoReferencia1, objetoPessoaFsicaAprovadaResponse.enderecoReferencia1) &&
        Objects.equals(this.nomeReferencia2, objetoPessoaFsicaAprovadaResponse.nomeReferencia2) &&
        Objects.equals(this.enderecoReferencia2, objetoPessoaFsicaAprovadaResponse.enderecoReferencia2) &&
        Objects.equals(this.funcaoAtiva, objetoPessoaFsicaAprovadaResponse.funcaoAtiva) &&
        Objects.equals(this.matricula, objetoPessoaFsicaAprovadaResponse.matricula) &&
        Objects.equals(this.responsavelDigitacao, objetoPessoaFsicaAprovadaResponse.responsavelDigitacao) &&
        Objects.equals(this.idPromotorVenda, objetoPessoaFsicaAprovadaResponse.idPromotorVenda) &&
        Objects.equals(this.naturalidadeCidade, objetoPessoaFsicaAprovadaResponse.naturalidadeCidade) &&
        Objects.equals(this.naturalidadeEstado, objetoPessoaFsicaAprovadaResponse.naturalidadeEstado) &&
        Objects.equals(this.grauInstrucao, objetoPessoaFsicaAprovadaResponse.grauInstrucao) &&
        Objects.equals(this.numeroDependentes, objetoPessoaFsicaAprovadaResponse.numeroDependentes) &&
        Objects.equals(this.nomePai, objetoPessoaFsicaAprovadaResponse.nomePai) &&
        Objects.equals(this.chequeEspecial, objetoPessoaFsicaAprovadaResponse.chequeEspecial) &&
        Objects.equals(this.numeroBanco, objetoPessoaFsicaAprovadaResponse.numeroBanco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, nomeMae, dataNascimento, sexo, cpf, numeroIdentidade, orgaoExpedidorIdentidade, unidadeFederativaIdentidade, dataEmissaoIdentidade, idEstadoCivil, idProfissao, idNaturezaOcupacao, idNacionalidade, idOrigemComercial, idProduto, numeroAgencia, numeroContaCorrente, email, diaVencimento, nomeImpresso, nomeEmpresa, idConta, idProposta, canalEntrada, valorPontuacao, telefones, enderecos, limiteGlobal, limiteMaximo, limiteParcelas, limiteConsignado, impedidoFinanciamento, nomeReferencia1, enderecoReferencia1, nomeReferencia2, enderecoReferencia2, funcaoAtiva, matricula, responsavelDigitacao, idPromotorVenda, naturalidadeCidade, naturalidadeEstado, grauInstrucao, numeroDependentes, nomePai, chequeEspecial, numeroBanco);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjetoPessoaFsicaAprovadaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    nomeMae: ").append(toIndentedString(nomeMae)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    numeroIdentidade: ").append(toIndentedString(numeroIdentidade)).append("\n");
    sb.append("    orgaoExpedidorIdentidade: ").append(toIndentedString(orgaoExpedidorIdentidade)).append("\n");
    sb.append("    unidadeFederativaIdentidade: ").append(toIndentedString(unidadeFederativaIdentidade)).append("\n");
    sb.append("    dataEmissaoIdentidade: ").append(toIndentedString(dataEmissaoIdentidade)).append("\n");
    sb.append("    idEstadoCivil: ").append(toIndentedString(idEstadoCivil)).append("\n");
    sb.append("    idProfissao: ").append(toIndentedString(idProfissao)).append("\n");
    sb.append("    idNaturezaOcupacao: ").append(toIndentedString(idNaturezaOcupacao)).append("\n");
    sb.append("    idNacionalidade: ").append(toIndentedString(idNacionalidade)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorrente: ").append(toIndentedString(numeroContaCorrente)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    diaVencimento: ").append(toIndentedString(diaVencimento)).append("\n");
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    nomeEmpresa: ").append(toIndentedString(nomeEmpresa)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idProposta: ").append(toIndentedString(idProposta)).append("\n");
    sb.append("    canalEntrada: ").append(toIndentedString(canalEntrada)).append("\n");
    sb.append("    valorPontuacao: ").append(toIndentedString(valorPontuacao)).append("\n");
    sb.append("    telefones: ").append(toIndentedString(telefones)).append("\n");
    sb.append("    enderecos: ").append(toIndentedString(enderecos)).append("\n");
    sb.append("    limiteGlobal: ").append(toIndentedString(limiteGlobal)).append("\n");
    sb.append("    limiteMaximo: ").append(toIndentedString(limiteMaximo)).append("\n");
    sb.append("    limiteParcelas: ").append(toIndentedString(limiteParcelas)).append("\n");
    sb.append("    limiteConsignado: ").append(toIndentedString(limiteConsignado)).append("\n");
    sb.append("    impedidoFinanciamento: ").append(toIndentedString(impedidoFinanciamento)).append("\n");
    sb.append("    nomeReferencia1: ").append(toIndentedString(nomeReferencia1)).append("\n");
    sb.append("    enderecoReferencia1: ").append(toIndentedString(enderecoReferencia1)).append("\n");
    sb.append("    nomeReferencia2: ").append(toIndentedString(nomeReferencia2)).append("\n");
    sb.append("    enderecoReferencia2: ").append(toIndentedString(enderecoReferencia2)).append("\n");
    sb.append("    funcaoAtiva: ").append(toIndentedString(funcaoAtiva)).append("\n");
    sb.append("    matricula: ").append(toIndentedString(matricula)).append("\n");
    sb.append("    responsavelDigitacao: ").append(toIndentedString(responsavelDigitacao)).append("\n");
    sb.append("    idPromotorVenda: ").append(toIndentedString(idPromotorVenda)).append("\n");
    sb.append("    naturalidadeCidade: ").append(toIndentedString(naturalidadeCidade)).append("\n");
    sb.append("    naturalidadeEstado: ").append(toIndentedString(naturalidadeEstado)).append("\n");
    sb.append("    grauInstrucao: ").append(toIndentedString(grauInstrucao)).append("\n");
    sb.append("    numeroDependentes: ").append(toIndentedString(numeroDependentes)).append("\n");
    sb.append("    nomePai: ").append(toIndentedString(nomePai)).append("\n");
    sb.append("    chequeEspecial: ").append(toIndentedString(chequeEspecial)).append("\n");
    sb.append("    numeroBanco: ").append(toIndentedString(numeroBanco)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

