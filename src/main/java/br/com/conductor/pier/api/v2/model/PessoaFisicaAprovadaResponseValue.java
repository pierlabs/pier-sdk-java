package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.EnderecoAprovadoResponseValue;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PessoaFisicaAprovadaResponseValue   {
  
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
  private List<EnderecoAprovadoResponseValue> enderecos = new ArrayList<EnderecoAprovadoResponseValue>();
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
    CREDITO("CREDITO");

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
   * {{{pessoa_fisica_aprovada_response_id_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_nome_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_nome_mae_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue nomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_nome_mae_value}}}")
  @JsonProperty("nomeMae")
  public String getNomeMae() {
    return nomeMae;
  }
  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_data_nascimento_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_data_nascimento_value}}}")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_sexo_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_sexo_value}}}")
  @JsonProperty("sexo")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_cpf_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_response_cpf_value}}}")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_numero_identidade_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue numeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_numero_identidade_value}}}")
  @JsonProperty("numeroIdentidade")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_orgao_expedidor_identidade_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue orgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_orgao_expedidor_identidade_value}}}")
  @JsonProperty("orgaoExpedidorIdentidade")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_unidade_federativa_identidade_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue unidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_unidade_federativa_identidade_value}}}")
  @JsonProperty("unidadeFederativaIdentidade")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_data_emissao_identidade_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue dataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_data_emissao_identidade_value}}}")
  @JsonProperty("dataEmissaoIdentidade")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_id_estado_civil_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue idEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_id_estado_civil_value}}}")
  @JsonProperty("idEstadoCivil")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_id_profissao_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue idProfissao(String idProfissao) {
    this.idProfissao = idProfissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_id_profissao_value}}}")
  @JsonProperty("idProfissao")
  public String getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(String idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_id_natureza_ocupacao_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue idNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_id_natureza_ocupacao_value}}}")
  @JsonProperty("idNaturezaOcupacao")
  public Long getIdNaturezaOcupacao() {
    return idNaturezaOcupacao;
  }
  public void setIdNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_id_nacionalidade_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue idNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_id_nacionalidade_value}}}")
  @JsonProperty("idNacionalidade")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_id_origem_comercial_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_response_id_origem_comercial_value}}}")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_id_produto_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_response_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_numero_agencia_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_numero_agencia_value}}}")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_numero_conta_corrente_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_numero_conta_corrente_value}}}")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_email_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_email_value}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_dia_vencimento_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_response_dia_vencimento_value}}}")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_nome_impresso_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_nome_impresso_value}}}")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_nome_empresa_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue nomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_nome_empresa_value}}}")
  @JsonProperty("nomeEmpresa")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_id_conta_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_id_proposta_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_id_proposta_value}}}")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_canal_entrada_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue canalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_canal_entrada_value}}}")
  @JsonProperty("canalEntrada")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_valor_pontuacao_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue valorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_valor_pontuacao_value}}}")
  @JsonProperty("valorPontuacao")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_telefones_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue telefones(List<TelefonePessoaAprovadaResponse> telefones) {
    this.telefones = telefones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_telefones_value}}}")
  @JsonProperty("telefones")
  public List<TelefonePessoaAprovadaResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaResponse> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_enderecos_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue enderecos(List<EnderecoAprovadoResponseValue> enderecos) {
    this.enderecos = enderecos;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_response_enderecos_value}}}")
  @JsonProperty("enderecos")
  public List<EnderecoAprovadoResponseValue> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<EnderecoAprovadoResponseValue> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_limite_global_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_response_limite_global_value}}}")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_limite_maximo_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue limiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_response_limite_maximo_value}}}")
  @JsonProperty("limiteMaximo")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_limite_parcelas_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_response_limite_parcelas_value}}}")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_limite_consignado_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue limiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_response_limite_consignado_value}}}")
  @JsonProperty("limiteConsignado")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_impedido_de_financiamento_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue impedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{pessoa_fisica_aprovada_response_impedido_de_financiamento_value}}}")
  @JsonProperty("impedidoFinanciamento")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_nome_referencia_1_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue nomeReferencia1(String nomeReferencia1) {
    this.nomeReferencia1 = nomeReferencia1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_nome_referencia_1_value}}}")
  @JsonProperty("nomeReferencia1")
  public String getNomeReferencia1() {
    return nomeReferencia1;
  }
  public void setNomeReferencia1(String nomeReferencia1) {
    this.nomeReferencia1 = nomeReferencia1;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_endereco_referencia_1_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue enderecoReferencia1(String enderecoReferencia1) {
    this.enderecoReferencia1 = enderecoReferencia1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_endereco_referencia_1_value}}}")
  @JsonProperty("enderecoReferencia1")
  public String getEnderecoReferencia1() {
    return enderecoReferencia1;
  }
  public void setEnderecoReferencia1(String enderecoReferencia1) {
    this.enderecoReferencia1 = enderecoReferencia1;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_nome_referencia_2_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue nomeReferencia2(String nomeReferencia2) {
    this.nomeReferencia2 = nomeReferencia2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_nome_referencia_2_value}}}")
  @JsonProperty("nomeReferencia2")
  public String getNomeReferencia2() {
    return nomeReferencia2;
  }
  public void setNomeReferencia2(String nomeReferencia2) {
    this.nomeReferencia2 = nomeReferencia2;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_endereco_referencia_2_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue enderecoReferencia2(String enderecoReferencia2) {
    this.enderecoReferencia2 = enderecoReferencia2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_endereco_referencia_2_value}}}")
  @JsonProperty("enderecoReferencia2")
  public String getEnderecoReferencia2() {
    return enderecoReferencia2;
  }
  public void setEnderecoReferencia2(String enderecoReferencia2) {
    this.enderecoReferencia2 = enderecoReferencia2;
  }

  
  /**
   * {{{conta_response_funcao_ativa_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue funcaoAtiva(FuncaoAtivaEnum funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_response_funcao_ativa_value}}}")
  @JsonProperty("funcaoAtiva")
  public FuncaoAtivaEnum getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(FuncaoAtivaEnum funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_matricula_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue matricula(String matricula) {
    this.matricula = matricula;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_matricula_value}}}")
  @JsonProperty("matricula")
  public String getMatricula() {
    return matricula;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_responsavelDigitacao_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue responsavelDigitacao(String responsavelDigitacao) {
    this.responsavelDigitacao = responsavelDigitacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_responsavelDigitacao_value}}}")
  @JsonProperty("responsavelDigitacao")
  public String getResponsavelDigitacao() {
    return responsavelDigitacao;
  }
  public void setResponsavelDigitacao(String responsavelDigitacao) {
    this.responsavelDigitacao = responsavelDigitacao;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_idPromotorVenda_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue idPromotorVenda(Integer idPromotorVenda) {
    this.idPromotorVenda = idPromotorVenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_persist_idPromotorVenda_value}}}")
  @JsonProperty("idPromotorVenda")
  public Integer getIdPromotorVenda() {
    return idPromotorVenda;
  }
  public void setIdPromotorVenda(Integer idPromotorVenda) {
    this.idPromotorVenda = idPromotorVenda;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_naturalidade_Cidade_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue naturalidadeCidade(String naturalidadeCidade) {
    this.naturalidadeCidade = naturalidadeCidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_naturalidade_Cidade_value}}}")
  @JsonProperty("naturalidadeCidade")
  public String getNaturalidadeCidade() {
    return naturalidadeCidade;
  }
  public void setNaturalidadeCidade(String naturalidadeCidade) {
    this.naturalidadeCidade = naturalidadeCidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_naturalidade_Estado_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue naturalidadeEstado(String naturalidadeEstado) {
    this.naturalidadeEstado = naturalidadeEstado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_naturalidade_Estado_value}}}")
  @JsonProperty("naturalidadeEstado")
  public String getNaturalidadeEstado() {
    return naturalidadeEstado;
  }
  public void setNaturalidadeEstado(String naturalidadeEstado) {
    this.naturalidadeEstado = naturalidadeEstado;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_grau_Instrucao_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue grauInstrucao(Integer grauInstrucao) {
    this.grauInstrucao = grauInstrucao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_grau_Instrucao_value}}}")
  @JsonProperty("grauInstrucao")
  public Integer getGrauInstrucao() {
    return grauInstrucao;
  }
  public void setGrauInstrucao(Integer grauInstrucao) {
    this.grauInstrucao = grauInstrucao;
  }

  
  /**
   * A{{{pessoa_fisica_aprovada_response_numero_Dependentes_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue numeroDependentes(Integer numeroDependentes) {
    this.numeroDependentes = numeroDependentes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A{{{pessoa_fisica_aprovada_response_numero_Dependentes_value}}}")
  @JsonProperty("numeroDependentes")
  public Integer getNumeroDependentes() {
    return numeroDependentes;
  }
  public void setNumeroDependentes(Integer numeroDependentes) {
    this.numeroDependentes = numeroDependentes;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_nome_Pai_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue nomePai(String nomePai) {
    this.nomePai = nomePai;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_nome_Pai_value}}}")
  @JsonProperty("nomePai")
  public String getNomePai() {
    return nomePai;
  }
  public void setNomePai(String nomePai) {
    this.nomePai = nomePai;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_cheque_Especial_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue chequeEspecial(Integer chequeEspecial) {
    this.chequeEspecial = chequeEspecial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_cheque_Especial_value}}}")
  @JsonProperty("chequeEspecial")
  public Integer getChequeEspecial() {
    return chequeEspecial;
  }
  public void setChequeEspecial(Integer chequeEspecial) {
    this.chequeEspecial = chequeEspecial;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_numero_Banco_value}}}
   **/
  public PessoaFisicaAprovadaResponseValue numeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{pessoa_fisica_aprovada_response_numero_Banco_value}}}")
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
    PessoaFisicaAprovadaResponseValue pessoaFisicaAprovadaResponseValue = (PessoaFisicaAprovadaResponseValue) o;
    return Objects.equals(this.id, pessoaFisicaAprovadaResponseValue.id) &&
        Objects.equals(this.nome, pessoaFisicaAprovadaResponseValue.nome) &&
        Objects.equals(this.nomeMae, pessoaFisicaAprovadaResponseValue.nomeMae) &&
        Objects.equals(this.dataNascimento, pessoaFisicaAprovadaResponseValue.dataNascimento) &&
        Objects.equals(this.sexo, pessoaFisicaAprovadaResponseValue.sexo) &&
        Objects.equals(this.cpf, pessoaFisicaAprovadaResponseValue.cpf) &&
        Objects.equals(this.numeroIdentidade, pessoaFisicaAprovadaResponseValue.numeroIdentidade) &&
        Objects.equals(this.orgaoExpedidorIdentidade, pessoaFisicaAprovadaResponseValue.orgaoExpedidorIdentidade) &&
        Objects.equals(this.unidadeFederativaIdentidade, pessoaFisicaAprovadaResponseValue.unidadeFederativaIdentidade) &&
        Objects.equals(this.dataEmissaoIdentidade, pessoaFisicaAprovadaResponseValue.dataEmissaoIdentidade) &&
        Objects.equals(this.idEstadoCivil, pessoaFisicaAprovadaResponseValue.idEstadoCivil) &&
        Objects.equals(this.idProfissao, pessoaFisicaAprovadaResponseValue.idProfissao) &&
        Objects.equals(this.idNaturezaOcupacao, pessoaFisicaAprovadaResponseValue.idNaturezaOcupacao) &&
        Objects.equals(this.idNacionalidade, pessoaFisicaAprovadaResponseValue.idNacionalidade) &&
        Objects.equals(this.idOrigemComercial, pessoaFisicaAprovadaResponseValue.idOrigemComercial) &&
        Objects.equals(this.idProduto, pessoaFisicaAprovadaResponseValue.idProduto) &&
        Objects.equals(this.numeroAgencia, pessoaFisicaAprovadaResponseValue.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, pessoaFisicaAprovadaResponseValue.numeroContaCorrente) &&
        Objects.equals(this.email, pessoaFisicaAprovadaResponseValue.email) &&
        Objects.equals(this.diaVencimento, pessoaFisicaAprovadaResponseValue.diaVencimento) &&
        Objects.equals(this.nomeImpresso, pessoaFisicaAprovadaResponseValue.nomeImpresso) &&
        Objects.equals(this.nomeEmpresa, pessoaFisicaAprovadaResponseValue.nomeEmpresa) &&
        Objects.equals(this.idConta, pessoaFisicaAprovadaResponseValue.idConta) &&
        Objects.equals(this.idProposta, pessoaFisicaAprovadaResponseValue.idProposta) &&
        Objects.equals(this.canalEntrada, pessoaFisicaAprovadaResponseValue.canalEntrada) &&
        Objects.equals(this.valorPontuacao, pessoaFisicaAprovadaResponseValue.valorPontuacao) &&
        Objects.equals(this.telefones, pessoaFisicaAprovadaResponseValue.telefones) &&
        Objects.equals(this.enderecos, pessoaFisicaAprovadaResponseValue.enderecos) &&
        Objects.equals(this.limiteGlobal, pessoaFisicaAprovadaResponseValue.limiteGlobal) &&
        Objects.equals(this.limiteMaximo, pessoaFisicaAprovadaResponseValue.limiteMaximo) &&
        Objects.equals(this.limiteParcelas, pessoaFisicaAprovadaResponseValue.limiteParcelas) &&
        Objects.equals(this.limiteConsignado, pessoaFisicaAprovadaResponseValue.limiteConsignado) &&
        Objects.equals(this.impedidoFinanciamento, pessoaFisicaAprovadaResponseValue.impedidoFinanciamento) &&
        Objects.equals(this.nomeReferencia1, pessoaFisicaAprovadaResponseValue.nomeReferencia1) &&
        Objects.equals(this.enderecoReferencia1, pessoaFisicaAprovadaResponseValue.enderecoReferencia1) &&
        Objects.equals(this.nomeReferencia2, pessoaFisicaAprovadaResponseValue.nomeReferencia2) &&
        Objects.equals(this.enderecoReferencia2, pessoaFisicaAprovadaResponseValue.enderecoReferencia2) &&
        Objects.equals(this.funcaoAtiva, pessoaFisicaAprovadaResponseValue.funcaoAtiva) &&
        Objects.equals(this.matricula, pessoaFisicaAprovadaResponseValue.matricula) &&
        Objects.equals(this.responsavelDigitacao, pessoaFisicaAprovadaResponseValue.responsavelDigitacao) &&
        Objects.equals(this.idPromotorVenda, pessoaFisicaAprovadaResponseValue.idPromotorVenda) &&
        Objects.equals(this.naturalidadeCidade, pessoaFisicaAprovadaResponseValue.naturalidadeCidade) &&
        Objects.equals(this.naturalidadeEstado, pessoaFisicaAprovadaResponseValue.naturalidadeEstado) &&
        Objects.equals(this.grauInstrucao, pessoaFisicaAprovadaResponseValue.grauInstrucao) &&
        Objects.equals(this.numeroDependentes, pessoaFisicaAprovadaResponseValue.numeroDependentes) &&
        Objects.equals(this.nomePai, pessoaFisicaAprovadaResponseValue.nomePai) &&
        Objects.equals(this.chequeEspecial, pessoaFisicaAprovadaResponseValue.chequeEspecial) &&
        Objects.equals(this.numeroBanco, pessoaFisicaAprovadaResponseValue.numeroBanco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, nomeMae, dataNascimento, sexo, cpf, numeroIdentidade, orgaoExpedidorIdentidade, unidadeFederativaIdentidade, dataEmissaoIdentidade, idEstadoCivil, idProfissao, idNaturezaOcupacao, idNacionalidade, idOrigemComercial, idProduto, numeroAgencia, numeroContaCorrente, email, diaVencimento, nomeImpresso, nomeEmpresa, idConta, idProposta, canalEntrada, valorPontuacao, telefones, enderecos, limiteGlobal, limiteMaximo, limiteParcelas, limiteConsignado, impedidoFinanciamento, nomeReferencia1, enderecoReferencia1, nomeReferencia2, enderecoReferencia2, funcaoAtiva, matricula, responsavelDigitacao, idPromotorVenda, naturalidadeCidade, naturalidadeEstado, grauInstrucao, numeroDependentes, nomePai, chequeEspecial, numeroBanco);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaFisicaAprovadaResponseValue {\n");
    
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

