package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{grupo_economico_response_description}}}
 **/

@ApiModel(description = "{{{grupo_economico_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GrupoEconomicoResponse   {
  
  private Long id = null;
  private String razaoSocial = null;
  private String nomeCredor = null;
  private String numeroReceitaFederal = null;
  private String inscricaoEstadual = null;
  private String contato = null;
  private Integer banco = null;
  private Integer agencia = null;
  private String digitoAgencia = null;
  private String contaCorrente = null;
  private String digitoContaCorrente = null;
  private String usuario = null;


  public enum PeriodicidadeEnum {
    DIARIO("DIARIO"),
    SEMANAL("SEMANAL"),
    MENSAL("MENSAL"),
    DECENDIAL("DECENDIAL"),
    QUINZENAL("QUINZENAL");

    private String value;

    PeriodicidadeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PeriodicidadeEnum periodicidade = null;


  public enum PagamentoSemanalEnum {
    SEGUNDA("SEGUNDA"),
    TERCA("TERCA"),
    QUARTA("QUARTA"),
    QUINTA("QUINTA"),
    SEXTA("SEXTA"),
    SABADO("SABADO"),
    DOMINGO("DOMINGO");

    private String value;

    PagamentoSemanalEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PagamentoSemanalEnum pagamentoSemanal = null;
  private Integer pagamentoMensal = null;
  private Integer pagamentoDecendialPrimeiro = null;
  private Integer pagamentoDecendialSegundo = null;
  private Integer pagamentoDecendialTerceiro = null;
  private Integer pagamentoQuinzenalPrimeiro = null;
  private Integer pagamentoQuinzenalSegundo = null;
  private Long idCredorRAV = null;
  private BigDecimal percentualRAV = null;


  public enum RecebeRAVEnum {
    NAO_TEM_PERMISSAO_RAV("NAO_TEM_PERMISSAO_RAV"),
    CREDITO_RAV("CREDITO_RAV"),
    DEBITO_RAV("DEBITO_RAV");

    private String value;

    RecebeRAVEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RecebeRAVEnum recebeRAV = null;
  private BigDecimal percentualMultiplica = null;
  private BigDecimal taxaAdm = null;
  private BigDecimal taxaBanco = null;
  private BigDecimal limiteRAV = null;

  
  /**
   * {{{grupo_economico_response_id_value}}}
   **/
  public GrupoEconomicoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{grupo_economico_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{grupo_economico_response_razao_social_value}}}
   **/
  public GrupoEconomicoResponse razaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{grupo_economico_response_razao_social_value}}}")
  @JsonProperty("razaoSocial")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * {{{grupo_economico_response_nome_credor_value}}}
   **/
  public GrupoEconomicoResponse nomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
    return this;
  }
  
  @ApiModelProperty(example = "Exemplo", value = "{{{grupo_economico_response_nome_credor_value}}}")
  @JsonProperty("nomeCredor")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   * {{{grupo_economico_response_numero_receita_federal_value}}}
   **/
  public GrupoEconomicoResponse numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{grupo_economico_response_numero_receita_federal_value}}}")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * {{{grupo_economico_response_inscricao_estadual_value}}}
   **/
  public GrupoEconomicoResponse inscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{grupo_economico_response_inscricao_estadual_value}}}")
  @JsonProperty("inscricaoEstadual")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * {{{grupo_economico_response_contato_value}}}
   **/
  public GrupoEconomicoResponse contato(String contato) {
    this.contato = contato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{grupo_economico_response_contato_value}}}")
  @JsonProperty("contato")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * {{{grupo_economico_response_banco_value}}}
   **/
  public GrupoEconomicoResponse banco(Integer banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{grupo_economico_response_banco_value}}}")
  @JsonProperty("banco")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * {{{grupo_economico_response_agencia_value}}}
   **/
  public GrupoEconomicoResponse agencia(Integer agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{grupo_economico_response_agencia_value}}}")
  @JsonProperty("agencia")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * {{{grupo_economico_response_digito_agencia_value}}}
   **/
  public GrupoEconomicoResponse digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{grupo_economico_response_digito_agencia_value}}}")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * {{{grupo_economico_response_conta_corrente_value}}}
   **/
  public GrupoEconomicoResponse contaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{grupo_economico_response_conta_corrente_value}}}")
  @JsonProperty("contaCorrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * {{{grupo_economico_response_digito_conta_corrente_value}}}
   **/
  public GrupoEconomicoResponse digitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{grupo_economico_response_digito_conta_corrente_value}}}")
  @JsonProperty("digitoContaCorrente")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  
  /**
   * {{{grupo_economico_response_usuario_value}}}
   **/
  public GrupoEconomicoResponse usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{grupo_economico_response_usuario_value}}}")
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * {{{grupo_economico_response_periodicidade_value}}}
   **/
  public GrupoEconomicoResponse periodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
    return this;
  }
  
  @ApiModelProperty(example = "DIARIO", value = "{{{grupo_economico_response_periodicidade_value}}}")
  @JsonProperty("periodicidade")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * {{{grupo_economico_response_pagamento_semanal_value}}}
   **/
  public GrupoEconomicoResponse pagamentoSemanal(PagamentoSemanalEnum pagamentoSemanal) {
    this.pagamentoSemanal = pagamentoSemanal;
    return this;
  }
  
  @ApiModelProperty(example = "SEGUNDA", value = "{{{grupo_economico_response_pagamento_semanal_value}}}")
  @JsonProperty("pagamentoSemanal")
  public PagamentoSemanalEnum getPagamentoSemanal() {
    return pagamentoSemanal;
  }
  public void setPagamentoSemanal(PagamentoSemanalEnum pagamentoSemanal) {
    this.pagamentoSemanal = pagamentoSemanal;
  }

  
  /**
   * {{{grupo_economico_response_pagamento_mensal_value}}}
   **/
  public GrupoEconomicoResponse pagamentoMensal(Integer pagamentoMensal) {
    this.pagamentoMensal = pagamentoMensal;
    return this;
  }
  
  @ApiModelProperty(example = "10", value = "{{{grupo_economico_response_pagamento_mensal_value}}}")
  @JsonProperty("pagamentoMensal")
  public Integer getPagamentoMensal() {
    return pagamentoMensal;
  }
  public void setPagamentoMensal(Integer pagamentoMensal) {
    this.pagamentoMensal = pagamentoMensal;
  }

  
  /**
   * {{{grupo_economico_response_pagamento_decendial_primeiro_value}}}
   **/
  public GrupoEconomicoResponse pagamentoDecendialPrimeiro(Integer pagamentoDecendialPrimeiro) {
    this.pagamentoDecendialPrimeiro = pagamentoDecendialPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "5", value = "{{{grupo_economico_response_pagamento_decendial_primeiro_value}}}")
  @JsonProperty("pagamentoDecendialPrimeiro")
  public Integer getPagamentoDecendialPrimeiro() {
    return pagamentoDecendialPrimeiro;
  }
  public void setPagamentoDecendialPrimeiro(Integer pagamentoDecendialPrimeiro) {
    this.pagamentoDecendialPrimeiro = pagamentoDecendialPrimeiro;
  }

  
  /**
   * {{{grupo_economico_response_pagamento_decendial_segundo_value}}}
   **/
  public GrupoEconomicoResponse pagamentoDecendialSegundo(Integer pagamentoDecendialSegundo) {
    this.pagamentoDecendialSegundo = pagamentoDecendialSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "15", value = "{{{grupo_economico_response_pagamento_decendial_segundo_value}}}")
  @JsonProperty("pagamentoDecendialSegundo")
  public Integer getPagamentoDecendialSegundo() {
    return pagamentoDecendialSegundo;
  }
  public void setPagamentoDecendialSegundo(Integer pagamentoDecendialSegundo) {
    this.pagamentoDecendialSegundo = pagamentoDecendialSegundo;
  }

  
  /**
   * {{{grupo_economico_response_pagamento_decendial_terceiro_value}}}
   **/
  public GrupoEconomicoResponse pagamentoDecendialTerceiro(Integer pagamentoDecendialTerceiro) {
    this.pagamentoDecendialTerceiro = pagamentoDecendialTerceiro;
    return this;
  }
  
  @ApiModelProperty(example = "25", value = "{{{grupo_economico_response_pagamento_decendial_terceiro_value}}}")
  @JsonProperty("pagamentoDecendialTerceiro")
  public Integer getPagamentoDecendialTerceiro() {
    return pagamentoDecendialTerceiro;
  }
  public void setPagamentoDecendialTerceiro(Integer pagamentoDecendialTerceiro) {
    this.pagamentoDecendialTerceiro = pagamentoDecendialTerceiro;
  }

  
  /**
   * {{{grupo_economico_response_pagamento_quinzenal_primeiro_value}}}
   **/
  public GrupoEconomicoResponse pagamentoQuinzenalPrimeiro(Integer pagamentoQuinzenalPrimeiro) {
    this.pagamentoQuinzenalPrimeiro = pagamentoQuinzenalPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "5", value = "{{{grupo_economico_response_pagamento_quinzenal_primeiro_value}}}")
  @JsonProperty("pagamentoQuinzenalPrimeiro")
  public Integer getPagamentoQuinzenalPrimeiro() {
    return pagamentoQuinzenalPrimeiro;
  }
  public void setPagamentoQuinzenalPrimeiro(Integer pagamentoQuinzenalPrimeiro) {
    this.pagamentoQuinzenalPrimeiro = pagamentoQuinzenalPrimeiro;
  }

  
  /**
   * {{{grupo_economico_response_pagamento_quinzenal_segundo_value}}}
   **/
  public GrupoEconomicoResponse pagamentoQuinzenalSegundo(Integer pagamentoQuinzenalSegundo) {
    this.pagamentoQuinzenalSegundo = pagamentoQuinzenalSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "20", value = "{{{grupo_economico_response_pagamento_quinzenal_segundo_value}}}")
  @JsonProperty("pagamentoQuinzenalSegundo")
  public Integer getPagamentoQuinzenalSegundo() {
    return pagamentoQuinzenalSegundo;
  }
  public void setPagamentoQuinzenalSegundo(Integer pagamentoQuinzenalSegundo) {
    this.pagamentoQuinzenalSegundo = pagamentoQuinzenalSegundo;
  }

  
  /**
   * {{{grupo_economico_response_id_credor_r_a_v_value}}}
   **/
  public GrupoEconomicoResponse idCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "{{{grupo_economico_response_id_credor_r_a_v_value}}}")
  @JsonProperty("idCredorRAV")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * {{{grupo_economico_response_percentual_r_a_v_value}}}
   **/
  public GrupoEconomicoResponse percentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
    return this;
  }
  
  @ApiModelProperty(example = "0.015", value = "{{{grupo_economico_response_percentual_r_a_v_value}}}")
  @JsonProperty("percentualRAV")
  public BigDecimal getPercentualRAV() {
    return percentualRAV;
  }
  public void setPercentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
  }

  
  /**
   * {{{grupo_economico_response_recebe_r_a_v_value}}}
   **/
  public GrupoEconomicoResponse recebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
    return this;
  }
  
  @ApiModelProperty(example = "NAO_TEM_PERMISSAO_RAV", value = "{{{grupo_economico_response_recebe_r_a_v_value}}}")
  @JsonProperty("recebeRAV")
  public RecebeRAVEnum getRecebeRAV() {
    return recebeRAV;
  }
  public void setRecebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
  }

  
  /**
   * {{{grupo_economico_response_percentual_multiplica_value}}}
   **/
  public GrupoEconomicoResponse percentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
    return this;
  }
  
  @ApiModelProperty(example = "0.1", value = "{{{grupo_economico_response_percentual_multiplica_value}}}")
  @JsonProperty("percentualMultiplica")
  public BigDecimal getPercentualMultiplica() {
    return percentualMultiplica;
  }
  public void setPercentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
  }

  
  /**
   * {{{grupo_economico_response_taxa_adm_value}}}
   **/
  public GrupoEconomicoResponse taxaAdm(BigDecimal taxaAdm) {
    this.taxaAdm = taxaAdm;
    return this;
  }
  
  @ApiModelProperty(example = "0.1", value = "{{{grupo_economico_response_taxa_adm_value}}}")
  @JsonProperty("taxaAdm")
  public BigDecimal getTaxaAdm() {
    return taxaAdm;
  }
  public void setTaxaAdm(BigDecimal taxaAdm) {
    this.taxaAdm = taxaAdm;
  }

  
  /**
   * {{{grupo_economico_response_taxa_banco_value}}}
   **/
  public GrupoEconomicoResponse taxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
    return this;
  }
  
  @ApiModelProperty(example = "0.1", value = "{{{grupo_economico_response_taxa_banco_value}}}")
  @JsonProperty("taxaBanco")
  public BigDecimal getTaxaBanco() {
    return taxaBanco;
  }
  public void setTaxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
  }

  
  /**
   * {{{grupo_economico_response_limite_r_a_v_value}}}
   **/
  public GrupoEconomicoResponse limiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
    return this;
  }
  
  @ApiModelProperty(example = "0.015", value = "{{{grupo_economico_response_limite_r_a_v_value}}}")
  @JsonProperty("limiteRAV")
  public BigDecimal getLimiteRAV() {
    return limiteRAV;
  }
  public void setLimiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrupoEconomicoResponse grupoEconomicoResponse = (GrupoEconomicoResponse) o;
    return Objects.equals(this.id, grupoEconomicoResponse.id) &&
        Objects.equals(this.razaoSocial, grupoEconomicoResponse.razaoSocial) &&
        Objects.equals(this.nomeCredor, grupoEconomicoResponse.nomeCredor) &&
        Objects.equals(this.numeroReceitaFederal, grupoEconomicoResponse.numeroReceitaFederal) &&
        Objects.equals(this.inscricaoEstadual, grupoEconomicoResponse.inscricaoEstadual) &&
        Objects.equals(this.contato, grupoEconomicoResponse.contato) &&
        Objects.equals(this.banco, grupoEconomicoResponse.banco) &&
        Objects.equals(this.agencia, grupoEconomicoResponse.agencia) &&
        Objects.equals(this.digitoAgencia, grupoEconomicoResponse.digitoAgencia) &&
        Objects.equals(this.contaCorrente, grupoEconomicoResponse.contaCorrente) &&
        Objects.equals(this.digitoContaCorrente, grupoEconomicoResponse.digitoContaCorrente) &&
        Objects.equals(this.usuario, grupoEconomicoResponse.usuario) &&
        Objects.equals(this.periodicidade, grupoEconomicoResponse.periodicidade) &&
        Objects.equals(this.pagamentoSemanal, grupoEconomicoResponse.pagamentoSemanal) &&
        Objects.equals(this.pagamentoMensal, grupoEconomicoResponse.pagamentoMensal) &&
        Objects.equals(this.pagamentoDecendialPrimeiro, grupoEconomicoResponse.pagamentoDecendialPrimeiro) &&
        Objects.equals(this.pagamentoDecendialSegundo, grupoEconomicoResponse.pagamentoDecendialSegundo) &&
        Objects.equals(this.pagamentoDecendialTerceiro, grupoEconomicoResponse.pagamentoDecendialTerceiro) &&
        Objects.equals(this.pagamentoQuinzenalPrimeiro, grupoEconomicoResponse.pagamentoQuinzenalPrimeiro) &&
        Objects.equals(this.pagamentoQuinzenalSegundo, grupoEconomicoResponse.pagamentoQuinzenalSegundo) &&
        Objects.equals(this.idCredorRAV, grupoEconomicoResponse.idCredorRAV) &&
        Objects.equals(this.percentualRAV, grupoEconomicoResponse.percentualRAV) &&
        Objects.equals(this.recebeRAV, grupoEconomicoResponse.recebeRAV) &&
        Objects.equals(this.percentualMultiplica, grupoEconomicoResponse.percentualMultiplica) &&
        Objects.equals(this.taxaAdm, grupoEconomicoResponse.taxaAdm) &&
        Objects.equals(this.taxaBanco, grupoEconomicoResponse.taxaBanco) &&
        Objects.equals(this.limiteRAV, grupoEconomicoResponse.limiteRAV);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, razaoSocial, nomeCredor, numeroReceitaFederal, inscricaoEstadual, contato, banco, agencia, digitoAgencia, contaCorrente, digitoContaCorrente, usuario, periodicidade, pagamentoSemanal, pagamentoMensal, pagamentoDecendialPrimeiro, pagamentoDecendialSegundo, pagamentoDecendialTerceiro, pagamentoQuinzenalPrimeiro, pagamentoQuinzenalSegundo, idCredorRAV, percentualRAV, recebeRAV, percentualMultiplica, taxaAdm, taxaBanco, limiteRAV);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoEconomicoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    razaoSocial: ").append(toIndentedString(razaoSocial)).append("\n");
    sb.append("    nomeCredor: ").append(toIndentedString(nomeCredor)).append("\n");
    sb.append("    numeroReceitaFederal: ").append(toIndentedString(numeroReceitaFederal)).append("\n");
    sb.append("    inscricaoEstadual: ").append(toIndentedString(inscricaoEstadual)).append("\n");
    sb.append("    contato: ").append(toIndentedString(contato)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    digitoAgencia: ").append(toIndentedString(digitoAgencia)).append("\n");
    sb.append("    contaCorrente: ").append(toIndentedString(contaCorrente)).append("\n");
    sb.append("    digitoContaCorrente: ").append(toIndentedString(digitoContaCorrente)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    periodicidade: ").append(toIndentedString(periodicidade)).append("\n");
    sb.append("    pagamentoSemanal: ").append(toIndentedString(pagamentoSemanal)).append("\n");
    sb.append("    pagamentoMensal: ").append(toIndentedString(pagamentoMensal)).append("\n");
    sb.append("    pagamentoDecendialPrimeiro: ").append(toIndentedString(pagamentoDecendialPrimeiro)).append("\n");
    sb.append("    pagamentoDecendialSegundo: ").append(toIndentedString(pagamentoDecendialSegundo)).append("\n");
    sb.append("    pagamentoDecendialTerceiro: ").append(toIndentedString(pagamentoDecendialTerceiro)).append("\n");
    sb.append("    pagamentoQuinzenalPrimeiro: ").append(toIndentedString(pagamentoQuinzenalPrimeiro)).append("\n");
    sb.append("    pagamentoQuinzenalSegundo: ").append(toIndentedString(pagamentoQuinzenalSegundo)).append("\n");
    sb.append("    idCredorRAV: ").append(toIndentedString(idCredorRAV)).append("\n");
    sb.append("    percentualRAV: ").append(toIndentedString(percentualRAV)).append("\n");
    sb.append("    recebeRAV: ").append(toIndentedString(recebeRAV)).append("\n");
    sb.append("    percentualMultiplica: ").append(toIndentedString(percentualMultiplica)).append("\n");
    sb.append("    taxaAdm: ").append(toIndentedString(taxaAdm)).append("\n");
    sb.append("    taxaBanco: ").append(toIndentedString(taxaBanco)).append("\n");
    sb.append("    limiteRAV: ").append(toIndentedString(limiteRAV)).append("\n");
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

