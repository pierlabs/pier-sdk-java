package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.EnderecoAprovadoResponse;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{pessoa_fisica_aprovada_response_description}}}
 **/

@ApiModel(description = "{{{pessoa_fisica_aprovada_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PessoaFisicaAprovadaResponse   {
  
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
  private List<EnderecoAprovadoResponse> enderecos = new ArrayList<EnderecoAprovadoResponse>();
  private BigDecimal limiteGlobal = null;
  private BigDecimal limiteMaximo = null;
  private String enderecoReferencia1 = null;
  private String enderecoReferencia2 = null;
  private BigDecimal limiteParcelas = null;
  private String nomeReferencia1 = null;
  private String nomeReferencia2 = null;
  private BigDecimal limiteConsignado = null;

  
  /**
   * {{{pessoa_fisica_aprovada_response_id_value}}}
   **/
  public PessoaFisicaAprovadaResponse id(Long id) {
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
  public PessoaFisicaAprovadaResponse nome(String nome) {
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
  public PessoaFisicaAprovadaResponse nomeMae(String nomeMae) {
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
  public PessoaFisicaAprovadaResponse dataNascimento(String dataNascimento) {
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
  public PessoaFisicaAprovadaResponse sexo(String sexo) {
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
  public PessoaFisicaAprovadaResponse cpf(String cpf) {
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
  public PessoaFisicaAprovadaResponse numeroIdentidade(String numeroIdentidade) {
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
  public PessoaFisicaAprovadaResponse orgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
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
  public PessoaFisicaAprovadaResponse unidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
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
  public PessoaFisicaAprovadaResponse dataEmissaoIdentidade(String dataEmissaoIdentidade) {
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
  public PessoaFisicaAprovadaResponse idEstadoCivil(Long idEstadoCivil) {
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
  public PessoaFisicaAprovadaResponse idProfissao(String idProfissao) {
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
  public PessoaFisicaAprovadaResponse idNaturezaOcupacao(Long idNaturezaOcupacao) {
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
  public PessoaFisicaAprovadaResponse idNacionalidade(Long idNacionalidade) {
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
  public PessoaFisicaAprovadaResponse idOrigemComercial(Long idOrigemComercial) {
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
  public PessoaFisicaAprovadaResponse idProduto(Long idProduto) {
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
  public PessoaFisicaAprovadaResponse numeroAgencia(Integer numeroAgencia) {
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
  public PessoaFisicaAprovadaResponse numeroContaCorrente(String numeroContaCorrente) {
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
  public PessoaFisicaAprovadaResponse email(String email) {
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
  public PessoaFisicaAprovadaResponse diaVencimento(Integer diaVencimento) {
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
  public PessoaFisicaAprovadaResponse nomeImpresso(String nomeImpresso) {
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
  public PessoaFisicaAprovadaResponse nomeEmpresa(String nomeEmpresa) {
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
  public PessoaFisicaAprovadaResponse idConta(Long idConta) {
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
  public PessoaFisicaAprovadaResponse idProposta(Long idProposta) {
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
  public PessoaFisicaAprovadaResponse canalEntrada(String canalEntrada) {
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
  public PessoaFisicaAprovadaResponse valorPontuacao(Integer valorPontuacao) {
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
  public PessoaFisicaAprovadaResponse telefones(List<TelefonePessoaAprovadaResponse> telefones) {
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
  public PessoaFisicaAprovadaResponse enderecos(List<EnderecoAprovadoResponse> enderecos) {
    this.enderecos = enderecos;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{pessoa_fisica_aprovada_response_enderecos_value}}}")
  @JsonProperty("enderecos")
  public List<EnderecoAprovadoResponse> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<EnderecoAprovadoResponse> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_response_limite_global_value}}}
   **/
  public PessoaFisicaAprovadaResponse limiteGlobal(BigDecimal limiteGlobal) {
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
  public PessoaFisicaAprovadaResponse limiteMaximo(BigDecimal limiteMaximo) {
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
   * {{{pessoa_fisica_aprovada_response_endereco_referencia_1_value}}}
   **/
  public PessoaFisicaAprovadaResponse enderecoReferencia1(String enderecoReferencia1) {
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
   * {{{pessoa_fisica_aprovada_response_endereco_referencia_2_value}}}
   **/
  public PessoaFisicaAprovadaResponse enderecoReferencia2(String enderecoReferencia2) {
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
   * {{{pessoa_fisica_aprovada_response_limite_parcelas_value}}}
   **/
  public PessoaFisicaAprovadaResponse limiteParcelas(BigDecimal limiteParcelas) {
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
   * {{{pessoa_fisica_aprovada_response_nome_referencia_1_value}}}
   **/
  public PessoaFisicaAprovadaResponse nomeReferencia1(String nomeReferencia1) {
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
   * {{{pessoa_fisica_aprovada_response_nome_referencia_2_value}}}
   **/
  public PessoaFisicaAprovadaResponse nomeReferencia2(String nomeReferencia2) {
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
   * {{{pessoa_fisica_aprovada_response_limite_consignado_value}}}
   **/
  public PessoaFisicaAprovadaResponse limiteConsignado(BigDecimal limiteConsignado) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PessoaFisicaAprovadaResponse pessoaFisicaAprovadaResponse = (PessoaFisicaAprovadaResponse) o;
    return Objects.equals(this.id, pessoaFisicaAprovadaResponse.id) &&
        Objects.equals(this.nome, pessoaFisicaAprovadaResponse.nome) &&
        Objects.equals(this.nomeMae, pessoaFisicaAprovadaResponse.nomeMae) &&
        Objects.equals(this.dataNascimento, pessoaFisicaAprovadaResponse.dataNascimento) &&
        Objects.equals(this.sexo, pessoaFisicaAprovadaResponse.sexo) &&
        Objects.equals(this.cpf, pessoaFisicaAprovadaResponse.cpf) &&
        Objects.equals(this.numeroIdentidade, pessoaFisicaAprovadaResponse.numeroIdentidade) &&
        Objects.equals(this.orgaoExpedidorIdentidade, pessoaFisicaAprovadaResponse.orgaoExpedidorIdentidade) &&
        Objects.equals(this.unidadeFederativaIdentidade, pessoaFisicaAprovadaResponse.unidadeFederativaIdentidade) &&
        Objects.equals(this.dataEmissaoIdentidade, pessoaFisicaAprovadaResponse.dataEmissaoIdentidade) &&
        Objects.equals(this.idEstadoCivil, pessoaFisicaAprovadaResponse.idEstadoCivil) &&
        Objects.equals(this.idProfissao, pessoaFisicaAprovadaResponse.idProfissao) &&
        Objects.equals(this.idNaturezaOcupacao, pessoaFisicaAprovadaResponse.idNaturezaOcupacao) &&
        Objects.equals(this.idNacionalidade, pessoaFisicaAprovadaResponse.idNacionalidade) &&
        Objects.equals(this.idOrigemComercial, pessoaFisicaAprovadaResponse.idOrigemComercial) &&
        Objects.equals(this.idProduto, pessoaFisicaAprovadaResponse.idProduto) &&
        Objects.equals(this.numeroAgencia, pessoaFisicaAprovadaResponse.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, pessoaFisicaAprovadaResponse.numeroContaCorrente) &&
        Objects.equals(this.email, pessoaFisicaAprovadaResponse.email) &&
        Objects.equals(this.diaVencimento, pessoaFisicaAprovadaResponse.diaVencimento) &&
        Objects.equals(this.nomeImpresso, pessoaFisicaAprovadaResponse.nomeImpresso) &&
        Objects.equals(this.nomeEmpresa, pessoaFisicaAprovadaResponse.nomeEmpresa) &&
        Objects.equals(this.idConta, pessoaFisicaAprovadaResponse.idConta) &&
        Objects.equals(this.idProposta, pessoaFisicaAprovadaResponse.idProposta) &&
        Objects.equals(this.canalEntrada, pessoaFisicaAprovadaResponse.canalEntrada) &&
        Objects.equals(this.valorPontuacao, pessoaFisicaAprovadaResponse.valorPontuacao) &&
        Objects.equals(this.telefones, pessoaFisicaAprovadaResponse.telefones) &&
        Objects.equals(this.enderecos, pessoaFisicaAprovadaResponse.enderecos) &&
        Objects.equals(this.limiteGlobal, pessoaFisicaAprovadaResponse.limiteGlobal) &&
        Objects.equals(this.limiteMaximo, pessoaFisicaAprovadaResponse.limiteMaximo) &&
        Objects.equals(this.enderecoReferencia1, pessoaFisicaAprovadaResponse.enderecoReferencia1) &&
        Objects.equals(this.enderecoReferencia2, pessoaFisicaAprovadaResponse.enderecoReferencia2) &&
        Objects.equals(this.limiteParcelas, pessoaFisicaAprovadaResponse.limiteParcelas) &&
        Objects.equals(this.nomeReferencia1, pessoaFisicaAprovadaResponse.nomeReferencia1) &&
        Objects.equals(this.nomeReferencia2, pessoaFisicaAprovadaResponse.nomeReferencia2) &&
        Objects.equals(this.limiteConsignado, pessoaFisicaAprovadaResponse.limiteConsignado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, nomeMae, dataNascimento, sexo, cpf, numeroIdentidade, orgaoExpedidorIdentidade, unidadeFederativaIdentidade, dataEmissaoIdentidade, idEstadoCivil, idProfissao, idNaturezaOcupacao, idNacionalidade, idOrigemComercial, idProduto, numeroAgencia, numeroContaCorrente, email, diaVencimento, nomeImpresso, nomeEmpresa, idConta, idProposta, canalEntrada, valorPontuacao, telefones, enderecos, limiteGlobal, limiteMaximo, enderecoReferencia1, enderecoReferencia2, limiteParcelas, nomeReferencia1, nomeReferencia2, limiteConsignado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaFisicaAprovadaResponse {\n");
    
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
    sb.append("    enderecoReferencia1: ").append(toIndentedString(enderecoReferencia1)).append("\n");
    sb.append("    enderecoReferencia2: ").append(toIndentedString(enderecoReferencia2)).append("\n");
    sb.append("    limiteParcelas: ").append(toIndentedString(limiteParcelas)).append("\n");
    sb.append("    nomeReferencia1: ").append(toIndentedString(nomeReferencia1)).append("\n");
    sb.append("    nomeReferencia2: ").append(toIndentedString(nomeReferencia2)).append("\n");
    sb.append("    limiteConsignado: ").append(toIndentedString(limiteConsignado)).append("\n");
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

