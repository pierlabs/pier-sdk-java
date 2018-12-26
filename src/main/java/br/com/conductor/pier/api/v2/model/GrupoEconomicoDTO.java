package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{grupo_economico_d_t_o_description}}}
 **/

@ApiModel(description = "{{{grupo_economico_d_t_o_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GrupoEconomicoDTO   {
  
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
   * {{{grupo_economico_d_t_o_razao_social_value}}}
   **/
  public GrupoEconomicoDTO razaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  @ApiModelProperty(example = "Razão social exemplo", required = true, value = "{{{grupo_economico_d_t_o_razao_social_value}}}")
  @JsonProperty("razaoSocial")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * {{{grupo_economico_d_t_o_nome_credor_value}}}
   **/
  public GrupoEconomicoDTO nomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
    return this;
  }
  
  @ApiModelProperty(example = "Exemplo", value = "{{{grupo_economico_d_t_o_nome_credor_value}}}")
  @JsonProperty("nomeCredor")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   * {{{grupo_economico_d_t_o_numero_receita_federal_value}}}
   **/
  public GrupoEconomicoDTO numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "00405702000155", required = true, value = "{{{grupo_economico_d_t_o_numero_receita_federal_value}}}")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * {{{grupo_economico_d_t_o_inscricao_estadual_value}}}
   **/
  public GrupoEconomicoDTO inscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
    return this;
  }
  
  @ApiModelProperty(example = "14511", value = "{{{grupo_economico_d_t_o_inscricao_estadual_value}}}")
  @JsonProperty("inscricaoEstadual")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * {{{grupo_economico_d_t_o_contato_value}}}
   **/
  public GrupoEconomicoDTO contato(String contato) {
    this.contato = contato;
    return this;
  }
  
  @ApiModelProperty(example = "NOME DE PESSOA PARA CONTATO", value = "{{{grupo_economico_d_t_o_contato_value}}}")
  @JsonProperty("contato")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * {{{grupo_economico_d_t_o_banco_value}}}
   **/
  public GrupoEconomicoDTO banco(Integer banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "{{{grupo_economico_d_t_o_banco_value}}}")
  @JsonProperty("banco")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * {{{grupo_economico_d_t_o_agencia_value}}}
   **/
  public GrupoEconomicoDTO agencia(Integer agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "4571", value = "{{{grupo_economico_d_t_o_agencia_value}}}")
  @JsonProperty("agencia")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * {{{grupo_economico_d_t_o_digito_agencia_value}}}
   **/
  public GrupoEconomicoDTO digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "XX", value = "{{{grupo_economico_d_t_o_digito_agencia_value}}}")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * {{{grupo_economico_d_t_o_conta_corrente_value}}}
   **/
  public GrupoEconomicoDTO contaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "100887", value = "{{{grupo_economico_d_t_o_conta_corrente_value}}}")
  @JsonProperty("contaCorrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * {{{grupo_economico_d_t_o_digito_conta_corrente_value}}}
   **/
  public GrupoEconomicoDTO digitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "11", value = "{{{grupo_economico_d_t_o_digito_conta_corrente_value}}}")
  @JsonProperty("digitoContaCorrente")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  
  /**
   * {{{grupo_economico_d_t_o_periodicidade_value}}}
   **/
  public GrupoEconomicoDTO periodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
    return this;
  }
  
  @ApiModelProperty(example = "DIARIO", required = true, value = "{{{grupo_economico_d_t_o_periodicidade_value}}}")
  @JsonProperty("periodicidade")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * {{{grupo_economico_d_t_o_pagamento_semanal_value}}}
   **/
  public GrupoEconomicoDTO pagamentoSemanal(PagamentoSemanalEnum pagamentoSemanal) {
    this.pagamentoSemanal = pagamentoSemanal;
    return this;
  }
  
  @ApiModelProperty(example = "SEGUNDA", value = "{{{grupo_economico_d_t_o_pagamento_semanal_value}}}")
  @JsonProperty("pagamentoSemanal")
  public PagamentoSemanalEnum getPagamentoSemanal() {
    return pagamentoSemanal;
  }
  public void setPagamentoSemanal(PagamentoSemanalEnum pagamentoSemanal) {
    this.pagamentoSemanal = pagamentoSemanal;
  }

  
  /**
   * {{{grupo_economico_d_t_o_pagamento_mensal_value}}}
   **/
  public GrupoEconomicoDTO pagamentoMensal(Integer pagamentoMensal) {
    this.pagamentoMensal = pagamentoMensal;
    return this;
  }
  
  @ApiModelProperty(example = "10", value = "{{{grupo_economico_d_t_o_pagamento_mensal_value}}}")
  @JsonProperty("pagamentoMensal")
  public Integer getPagamentoMensal() {
    return pagamentoMensal;
  }
  public void setPagamentoMensal(Integer pagamentoMensal) {
    this.pagamentoMensal = pagamentoMensal;
  }

  
  /**
   * {{{grupo_economico_d_t_o_pagamento_decendial_primeiro_value}}}
   **/
  public GrupoEconomicoDTO pagamentoDecendialPrimeiro(Integer pagamentoDecendialPrimeiro) {
    this.pagamentoDecendialPrimeiro = pagamentoDecendialPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "5", value = "{{{grupo_economico_d_t_o_pagamento_decendial_primeiro_value}}}")
  @JsonProperty("pagamentoDecendialPrimeiro")
  public Integer getPagamentoDecendialPrimeiro() {
    return pagamentoDecendialPrimeiro;
  }
  public void setPagamentoDecendialPrimeiro(Integer pagamentoDecendialPrimeiro) {
    this.pagamentoDecendialPrimeiro = pagamentoDecendialPrimeiro;
  }

  
  /**
   * {{{grupo_economico_d_t_o_pagamento_decendial_segundo_value}}}
   **/
  public GrupoEconomicoDTO pagamentoDecendialSegundo(Integer pagamentoDecendialSegundo) {
    this.pagamentoDecendialSegundo = pagamentoDecendialSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "15", value = "{{{grupo_economico_d_t_o_pagamento_decendial_segundo_value}}}")
  @JsonProperty("pagamentoDecendialSegundo")
  public Integer getPagamentoDecendialSegundo() {
    return pagamentoDecendialSegundo;
  }
  public void setPagamentoDecendialSegundo(Integer pagamentoDecendialSegundo) {
    this.pagamentoDecendialSegundo = pagamentoDecendialSegundo;
  }

  
  /**
   * {{{grupo_economico_d_t_o_pagamento_decendial_terceiro_value}}}
   **/
  public GrupoEconomicoDTO pagamentoDecendialTerceiro(Integer pagamentoDecendialTerceiro) {
    this.pagamentoDecendialTerceiro = pagamentoDecendialTerceiro;
    return this;
  }
  
  @ApiModelProperty(example = "25", value = "{{{grupo_economico_d_t_o_pagamento_decendial_terceiro_value}}}")
  @JsonProperty("pagamentoDecendialTerceiro")
  public Integer getPagamentoDecendialTerceiro() {
    return pagamentoDecendialTerceiro;
  }
  public void setPagamentoDecendialTerceiro(Integer pagamentoDecendialTerceiro) {
    this.pagamentoDecendialTerceiro = pagamentoDecendialTerceiro;
  }

  
  /**
   * {{{grupo_economico_d_t_o_pagamento_quinzenal_primeiro_value}}}
   **/
  public GrupoEconomicoDTO pagamentoQuinzenalPrimeiro(Integer pagamentoQuinzenalPrimeiro) {
    this.pagamentoQuinzenalPrimeiro = pagamentoQuinzenalPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "5", value = "{{{grupo_economico_d_t_o_pagamento_quinzenal_primeiro_value}}}")
  @JsonProperty("pagamentoQuinzenalPrimeiro")
  public Integer getPagamentoQuinzenalPrimeiro() {
    return pagamentoQuinzenalPrimeiro;
  }
  public void setPagamentoQuinzenalPrimeiro(Integer pagamentoQuinzenalPrimeiro) {
    this.pagamentoQuinzenalPrimeiro = pagamentoQuinzenalPrimeiro;
  }

  
  /**
   * {{{grupo_economico_d_t_o_pagamento_quinzenal_segundo_value}}}
   **/
  public GrupoEconomicoDTO pagamentoQuinzenalSegundo(Integer pagamentoQuinzenalSegundo) {
    this.pagamentoQuinzenalSegundo = pagamentoQuinzenalSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "20", value = "{{{grupo_economico_d_t_o_pagamento_quinzenal_segundo_value}}}")
  @JsonProperty("pagamentoQuinzenalSegundo")
  public Integer getPagamentoQuinzenalSegundo() {
    return pagamentoQuinzenalSegundo;
  }
  public void setPagamentoQuinzenalSegundo(Integer pagamentoQuinzenalSegundo) {
    this.pagamentoQuinzenalSegundo = pagamentoQuinzenalSegundo;
  }

  
  /**
   * {{{grupo_economico_d_t_o_id_credor_r_a_v_value}}}
   **/
  public GrupoEconomicoDTO idCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
    return this;
  }
  
  @ApiModelProperty(example = "1", required = true, value = "{{{grupo_economico_d_t_o_id_credor_r_a_v_value}}}")
  @JsonProperty("idCredorRAV")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * {{{grupo_economico_d_t_o_percentual_r_a_v_value}}}
   **/
  public GrupoEconomicoDTO percentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
    return this;
  }
  
  @ApiModelProperty(example = "0.015", required = true, value = "{{{grupo_economico_d_t_o_percentual_r_a_v_value}}}")
  @JsonProperty("percentualRAV")
  public BigDecimal getPercentualRAV() {
    return percentualRAV;
  }
  public void setPercentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
  }

  
  /**
   * {{{grupo_economico_d_t_o_recebe_r_a_v_value}}}
   **/
  public GrupoEconomicoDTO recebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
    return this;
  }
  
  @ApiModelProperty(example = "NAO_TEM_PERMISSAO_RAV", value = "{{{grupo_economico_d_t_o_recebe_r_a_v_value}}}")
  @JsonProperty("recebeRAV")
  public RecebeRAVEnum getRecebeRAV() {
    return recebeRAV;
  }
  public void setRecebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
  }

  
  /**
   * {{{grupo_economico_d_t_o_percentual_multiplica_value}}}
   **/
  public GrupoEconomicoDTO percentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
    return this;
  }
  
  @ApiModelProperty(example = "0.1", value = "{{{grupo_economico_d_t_o_percentual_multiplica_value}}}")
  @JsonProperty("percentualMultiplica")
  public BigDecimal getPercentualMultiplica() {
    return percentualMultiplica;
  }
  public void setPercentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
  }

  
  /**
   * {{{grupo_economico_d_t_o_taxa_adm_value}}}
   **/
  public GrupoEconomicoDTO taxaAdm(BigDecimal taxaAdm) {
    this.taxaAdm = taxaAdm;
    return this;
  }
  
  @ApiModelProperty(example = "0.1", value = "{{{grupo_economico_d_t_o_taxa_adm_value}}}")
  @JsonProperty("taxaAdm")
  public BigDecimal getTaxaAdm() {
    return taxaAdm;
  }
  public void setTaxaAdm(BigDecimal taxaAdm) {
    this.taxaAdm = taxaAdm;
  }

  
  /**
   * {{{grupo_economico_d_t_o_taxa_banco_value}}}
   **/
  public GrupoEconomicoDTO taxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
    return this;
  }
  
  @ApiModelProperty(example = "0.1", value = "{{{grupo_economico_d_t_o_taxa_banco_value}}}")
  @JsonProperty("taxaBanco")
  public BigDecimal getTaxaBanco() {
    return taxaBanco;
  }
  public void setTaxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
  }

  
  /**
   * {{{grupo_economico_d_t_o_limite_r_a_v_value}}}
   **/
  public GrupoEconomicoDTO limiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
    return this;
  }
  
  @ApiModelProperty(example = "0.015", value = "{{{grupo_economico_d_t_o_limite_r_a_v_value}}}")
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
    GrupoEconomicoDTO grupoEconomicoDTO = (GrupoEconomicoDTO) o;
    return Objects.equals(this.razaoSocial, grupoEconomicoDTO.razaoSocial) &&
        Objects.equals(this.nomeCredor, grupoEconomicoDTO.nomeCredor) &&
        Objects.equals(this.numeroReceitaFederal, grupoEconomicoDTO.numeroReceitaFederal) &&
        Objects.equals(this.inscricaoEstadual, grupoEconomicoDTO.inscricaoEstadual) &&
        Objects.equals(this.contato, grupoEconomicoDTO.contato) &&
        Objects.equals(this.banco, grupoEconomicoDTO.banco) &&
        Objects.equals(this.agencia, grupoEconomicoDTO.agencia) &&
        Objects.equals(this.digitoAgencia, grupoEconomicoDTO.digitoAgencia) &&
        Objects.equals(this.contaCorrente, grupoEconomicoDTO.contaCorrente) &&
        Objects.equals(this.digitoContaCorrente, grupoEconomicoDTO.digitoContaCorrente) &&
        Objects.equals(this.periodicidade, grupoEconomicoDTO.periodicidade) &&
        Objects.equals(this.pagamentoSemanal, grupoEconomicoDTO.pagamentoSemanal) &&
        Objects.equals(this.pagamentoMensal, grupoEconomicoDTO.pagamentoMensal) &&
        Objects.equals(this.pagamentoDecendialPrimeiro, grupoEconomicoDTO.pagamentoDecendialPrimeiro) &&
        Objects.equals(this.pagamentoDecendialSegundo, grupoEconomicoDTO.pagamentoDecendialSegundo) &&
        Objects.equals(this.pagamentoDecendialTerceiro, grupoEconomicoDTO.pagamentoDecendialTerceiro) &&
        Objects.equals(this.pagamentoQuinzenalPrimeiro, grupoEconomicoDTO.pagamentoQuinzenalPrimeiro) &&
        Objects.equals(this.pagamentoQuinzenalSegundo, grupoEconomicoDTO.pagamentoQuinzenalSegundo) &&
        Objects.equals(this.idCredorRAV, grupoEconomicoDTO.idCredorRAV) &&
        Objects.equals(this.percentualRAV, grupoEconomicoDTO.percentualRAV) &&
        Objects.equals(this.recebeRAV, grupoEconomicoDTO.recebeRAV) &&
        Objects.equals(this.percentualMultiplica, grupoEconomicoDTO.percentualMultiplica) &&
        Objects.equals(this.taxaAdm, grupoEconomicoDTO.taxaAdm) &&
        Objects.equals(this.taxaBanco, grupoEconomicoDTO.taxaBanco) &&
        Objects.equals(this.limiteRAV, grupoEconomicoDTO.limiteRAV);
  }

  @Override
  public int hashCode() {
    return Objects.hash(razaoSocial, nomeCredor, numeroReceitaFederal, inscricaoEstadual, contato, banco, agencia, digitoAgencia, contaCorrente, digitoContaCorrente, periodicidade, pagamentoSemanal, pagamentoMensal, pagamentoDecendialPrimeiro, pagamentoDecendialSegundo, pagamentoDecendialTerceiro, pagamentoQuinzenalPrimeiro, pagamentoQuinzenalSegundo, idCredorRAV, percentualRAV, recebeRAV, percentualMultiplica, taxaAdm, taxaBanco, limiteRAV);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoEconomicoDTO {\n");
    
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

