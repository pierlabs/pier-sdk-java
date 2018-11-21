package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.EscritorioCobrancaDTO;
import br.com.conductor.pier.api.v2.model.TelefoneEscritorioCobrancaDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CredorResponse   {
  
  private Long id = null;
  private String nomeCredor = null;
  private Integer diaPagamentoSemanal = null;
  private Integer diaPagamentoMensal = null;
  private Integer diaPagamentoDecendialPrimeiro = null;
  private Integer diaPagamentoDecendialSegundo = null;
  private Integer diaPagamentoDecendialTerceiro = null;
  private Integer diaPagamentoQuinzenalPrimeiro = null;
  private Integer diaPagamentoQuinzenalSegundo = null;
  private Integer banco = null;
  private Integer agencia = null;
  private String digitoAgencia = null;
  private String contaCorrente = null;
  private String digitoContaCorrente = null;
  private Boolean credorBanco = null;
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
  private BigDecimal taxaAdministrativa = null;
  private BigDecimal taxaBanco = null;
  private BigDecimal limiteRAV = null;
  private Long idCredorRAV = null;


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
  private Long idPessoaJuridica = null;
  private Boolean flagEscritorioCobranca = null;
  private EscritorioCobrancaDTO escritoriosCobranca = null;
  private List<TelefoneEscritorioCobrancaDTO> telefonesEscritoriosCobranca = new ArrayList<TelefoneEscritorioCobrancaDTO>();

  
  /**
   * {{{credor_response_id_value}}}
   **/
  public CredorResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{credor_response_nome_credor_value}}}
   **/
  public CredorResponse nomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_nome_credor_value}}}")
  @JsonProperty("nomeCredor")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   * {{{credor_response_pagamento_semanal_value}}}
   **/
  public CredorResponse diaPagamentoSemanal(Integer diaPagamentoSemanal) {
    this.diaPagamentoSemanal = diaPagamentoSemanal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_pagamento_semanal_value}}}")
  @JsonProperty("diaPagamentoSemanal")
  public Integer getDiaPagamentoSemanal() {
    return diaPagamentoSemanal;
  }
  public void setDiaPagamentoSemanal(Integer diaPagamentoSemanal) {
    this.diaPagamentoSemanal = diaPagamentoSemanal;
  }

  
  /**
   * {{{credor_response_pagamento_mensal_value}}}
   **/
  public CredorResponse diaPagamentoMensal(Integer diaPagamentoMensal) {
    this.diaPagamentoMensal = diaPagamentoMensal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_pagamento_mensal_value}}}")
  @JsonProperty("diaPagamentoMensal")
  public Integer getDiaPagamentoMensal() {
    return diaPagamentoMensal;
  }
  public void setDiaPagamentoMensal(Integer diaPagamentoMensal) {
    this.diaPagamentoMensal = diaPagamentoMensal;
  }

  
  /**
   * {{{credor_response_pagamento_decendial_primeiro_value}}}
   **/
  public CredorResponse diaPagamentoDecendialPrimeiro(Integer diaPagamentoDecendialPrimeiro) {
    this.diaPagamentoDecendialPrimeiro = diaPagamentoDecendialPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_pagamento_decendial_primeiro_value}}}")
  @JsonProperty("diaPagamentoDecendialPrimeiro")
  public Integer getDiaPagamentoDecendialPrimeiro() {
    return diaPagamentoDecendialPrimeiro;
  }
  public void setDiaPagamentoDecendialPrimeiro(Integer diaPagamentoDecendialPrimeiro) {
    this.diaPagamentoDecendialPrimeiro = diaPagamentoDecendialPrimeiro;
  }

  
  /**
   * {{{credor_response_pagamento_decendial_segundo_value}}}
   **/
  public CredorResponse diaPagamentoDecendialSegundo(Integer diaPagamentoDecendialSegundo) {
    this.diaPagamentoDecendialSegundo = diaPagamentoDecendialSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_pagamento_decendial_segundo_value}}}")
  @JsonProperty("diaPagamentoDecendialSegundo")
  public Integer getDiaPagamentoDecendialSegundo() {
    return diaPagamentoDecendialSegundo;
  }
  public void setDiaPagamentoDecendialSegundo(Integer diaPagamentoDecendialSegundo) {
    this.diaPagamentoDecendialSegundo = diaPagamentoDecendialSegundo;
  }

  
  /**
   * {{{credor_response_pagamento_decendial_terceiro_value}}}
   **/
  public CredorResponse diaPagamentoDecendialTerceiro(Integer diaPagamentoDecendialTerceiro) {
    this.diaPagamentoDecendialTerceiro = diaPagamentoDecendialTerceiro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_pagamento_decendial_terceiro_value}}}")
  @JsonProperty("diaPagamentoDecendialTerceiro")
  public Integer getDiaPagamentoDecendialTerceiro() {
    return diaPagamentoDecendialTerceiro;
  }
  public void setDiaPagamentoDecendialTerceiro(Integer diaPagamentoDecendialTerceiro) {
    this.diaPagamentoDecendialTerceiro = diaPagamentoDecendialTerceiro;
  }

  
  /**
   * {{{credor_response_pagamento_quinzenal_primeiro_value}}}
   **/
  public CredorResponse diaPagamentoQuinzenalPrimeiro(Integer diaPagamentoQuinzenalPrimeiro) {
    this.diaPagamentoQuinzenalPrimeiro = diaPagamentoQuinzenalPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_pagamento_quinzenal_primeiro_value}}}")
  @JsonProperty("diaPagamentoQuinzenalPrimeiro")
  public Integer getDiaPagamentoQuinzenalPrimeiro() {
    return diaPagamentoQuinzenalPrimeiro;
  }
  public void setDiaPagamentoQuinzenalPrimeiro(Integer diaPagamentoQuinzenalPrimeiro) {
    this.diaPagamentoQuinzenalPrimeiro = diaPagamentoQuinzenalPrimeiro;
  }

  
  /**
   * {{{credor_response_pagamento_quinzenal_segundo_value}}}
   **/
  public CredorResponse diaPagamentoQuinzenalSegundo(Integer diaPagamentoQuinzenalSegundo) {
    this.diaPagamentoQuinzenalSegundo = diaPagamentoQuinzenalSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_pagamento_quinzenal_segundo_value}}}")
  @JsonProperty("diaPagamentoQuinzenalSegundo")
  public Integer getDiaPagamentoQuinzenalSegundo() {
    return diaPagamentoQuinzenalSegundo;
  }
  public void setDiaPagamentoQuinzenalSegundo(Integer diaPagamentoQuinzenalSegundo) {
    this.diaPagamentoQuinzenalSegundo = diaPagamentoQuinzenalSegundo;
  }

  
  /**
   * {{{credor_response_banco_value}}}
   **/
  public CredorResponse banco(Integer banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_banco_value}}}")
  @JsonProperty("banco")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * {{{credor_response_agencia_value}}}
   **/
  public CredorResponse agencia(Integer agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_agencia_value}}}")
  @JsonProperty("agencia")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * {{{credor_response_digito_agencia_value}}}
   **/
  public CredorResponse digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_digito_agencia_value}}}")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * {{{credor_response_conta_corrente_value}}}
   **/
  public CredorResponse contaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_conta_corrente_value}}}")
  @JsonProperty("contaCorrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * {{{credor_response_digito_conta_corrente_value}}}
   **/
  public CredorResponse digitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_digito_conta_corrente_value}}}")
  @JsonProperty("digitoContaCorrente")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  
  /**
   * {{{credor_response_credor_banco_value}}}
   **/
  public CredorResponse credorBanco(Boolean credorBanco) {
    this.credorBanco = credorBanco;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{credor_response_credor_banco_value}}}")
  @JsonProperty("credorBanco")
  public Boolean getCredorBanco() {
    return credorBanco;
  }
  public void setCredorBanco(Boolean credorBanco) {
    this.credorBanco = credorBanco;
  }

  
  /**
   * {{{credor_response_percentual_rav_value}}}
   **/
  public CredorResponse percentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_percentual_rav_value}}}")
  @JsonProperty("percentualRAV")
  public BigDecimal getPercentualRAV() {
    return percentualRAV;
  }
  public void setPercentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
  }

  
  /**
   * {{{credor_response_recebe_rav_value}}}
   **/
  public CredorResponse recebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_recebe_rav_value}}}")
  @JsonProperty("recebeRAV")
  public RecebeRAVEnum getRecebeRAV() {
    return recebeRAV;
  }
  public void setRecebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
  }

  
  /**
   * {{{credor_response_percentual_multiplica_value}}}
   **/
  public CredorResponse percentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_percentual_multiplica_value}}}")
  @JsonProperty("percentualMultiplica")
  public BigDecimal getPercentualMultiplica() {
    return percentualMultiplica;
  }
  public void setPercentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
  }

  
  /**
   * {{{credor_response_taxa_adm_value}}}
   **/
  public CredorResponse taxaAdministrativa(BigDecimal taxaAdministrativa) {
    this.taxaAdministrativa = taxaAdministrativa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_taxa_adm_value}}}")
  @JsonProperty("taxaAdministrativa")
  public BigDecimal getTaxaAdministrativa() {
    return taxaAdministrativa;
  }
  public void setTaxaAdministrativa(BigDecimal taxaAdministrativa) {
    this.taxaAdministrativa = taxaAdministrativa;
  }

  
  /**
   * {{{credor_response_taxa_banco_value}}}
   **/
  public CredorResponse taxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_taxa_banco_value}}}")
  @JsonProperty("taxaBanco")
  public BigDecimal getTaxaBanco() {
    return taxaBanco;
  }
  public void setTaxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
  }

  
  /**
   * {{{credor_response_limite_rav_value}}}
   **/
  public CredorResponse limiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_limite_rav_value}}}")
  @JsonProperty("limiteRAV")
  public BigDecimal getLimiteRAV() {
    return limiteRAV;
  }
  public void setLimiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
  }

  
  /**
   * {{{credor_response_id_credor_rav_value}}}
   **/
  public CredorResponse idCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_id_credor_rav_value}}}")
  @JsonProperty("idCredorRAV")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * {{{credor_response_periodicidade_value}}}
   **/
  public CredorResponse periodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_periodicidade_value}}}")
  @JsonProperty("periodicidade")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * {{{credor_response_id_pessoa_juridica_value}}}
   **/
  public CredorResponse idPessoaJuridica(Long idPessoaJuridica) {
    this.idPessoaJuridica = idPessoaJuridica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_id_pessoa_juridica_value}}}")
  @JsonProperty("idPessoaJuridica")
  public Long getIdPessoaJuridica() {
    return idPessoaJuridica;
  }
  public void setIdPessoaJuridica(Long idPessoaJuridica) {
    this.idPessoaJuridica = idPessoaJuridica;
  }

  
  /**
   * {{{credor_response_flag_escritorio_cobranca_value}}}
   **/
  public CredorResponse flagEscritorioCobranca(Boolean flagEscritorioCobranca) {
    this.flagEscritorioCobranca = flagEscritorioCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{credor_response_flag_escritorio_cobranca_value}}}")
  @JsonProperty("flagEscritorioCobranca")
  public Boolean getFlagEscritorioCobranca() {
    return flagEscritorioCobranca;
  }
  public void setFlagEscritorioCobranca(Boolean flagEscritorioCobranca) {
    this.flagEscritorioCobranca = flagEscritorioCobranca;
  }

  
  /**
   * {{{credor_response_escritorio_cobranca_value}}}
   **/
  public CredorResponse escritoriosCobranca(EscritorioCobrancaDTO escritoriosCobranca) {
    this.escritoriosCobranca = escritoriosCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_escritorio_cobranca_value}}}")
  @JsonProperty("escritoriosCobranca")
  public EscritorioCobrancaDTO getEscritoriosCobranca() {
    return escritoriosCobranca;
  }
  public void setEscritoriosCobranca(EscritorioCobrancaDTO escritoriosCobranca) {
    this.escritoriosCobranca = escritoriosCobranca;
  }

  
  /**
   * {{{credor_response_telefone_escritorio_cobranca_value}}}
   **/
  public CredorResponse telefonesEscritoriosCobranca(List<TelefoneEscritorioCobrancaDTO> telefonesEscritoriosCobranca) {
    this.telefonesEscritoriosCobranca = telefonesEscritoriosCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{credor_response_telefone_escritorio_cobranca_value}}}")
  @JsonProperty("telefonesEscritoriosCobranca")
  public List<TelefoneEscritorioCobrancaDTO> getTelefonesEscritoriosCobranca() {
    return telefonesEscritoriosCobranca;
  }
  public void setTelefonesEscritoriosCobranca(List<TelefoneEscritorioCobrancaDTO> telefonesEscritoriosCobranca) {
    this.telefonesEscritoriosCobranca = telefonesEscritoriosCobranca;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredorResponse credorResponse = (CredorResponse) o;
    return Objects.equals(this.id, credorResponse.id) &&
        Objects.equals(this.nomeCredor, credorResponse.nomeCredor) &&
        Objects.equals(this.diaPagamentoSemanal, credorResponse.diaPagamentoSemanal) &&
        Objects.equals(this.diaPagamentoMensal, credorResponse.diaPagamentoMensal) &&
        Objects.equals(this.diaPagamentoDecendialPrimeiro, credorResponse.diaPagamentoDecendialPrimeiro) &&
        Objects.equals(this.diaPagamentoDecendialSegundo, credorResponse.diaPagamentoDecendialSegundo) &&
        Objects.equals(this.diaPagamentoDecendialTerceiro, credorResponse.diaPagamentoDecendialTerceiro) &&
        Objects.equals(this.diaPagamentoQuinzenalPrimeiro, credorResponse.diaPagamentoQuinzenalPrimeiro) &&
        Objects.equals(this.diaPagamentoQuinzenalSegundo, credorResponse.diaPagamentoQuinzenalSegundo) &&
        Objects.equals(this.banco, credorResponse.banco) &&
        Objects.equals(this.agencia, credorResponse.agencia) &&
        Objects.equals(this.digitoAgencia, credorResponse.digitoAgencia) &&
        Objects.equals(this.contaCorrente, credorResponse.contaCorrente) &&
        Objects.equals(this.digitoContaCorrente, credorResponse.digitoContaCorrente) &&
        Objects.equals(this.credorBanco, credorResponse.credorBanco) &&
        Objects.equals(this.percentualRAV, credorResponse.percentualRAV) &&
        Objects.equals(this.recebeRAV, credorResponse.recebeRAV) &&
        Objects.equals(this.percentualMultiplica, credorResponse.percentualMultiplica) &&
        Objects.equals(this.taxaAdministrativa, credorResponse.taxaAdministrativa) &&
        Objects.equals(this.taxaBanco, credorResponse.taxaBanco) &&
        Objects.equals(this.limiteRAV, credorResponse.limiteRAV) &&
        Objects.equals(this.idCredorRAV, credorResponse.idCredorRAV) &&
        Objects.equals(this.periodicidade, credorResponse.periodicidade) &&
        Objects.equals(this.idPessoaJuridica, credorResponse.idPessoaJuridica) &&
        Objects.equals(this.flagEscritorioCobranca, credorResponse.flagEscritorioCobranca) &&
        Objects.equals(this.escritoriosCobranca, credorResponse.escritoriosCobranca) &&
        Objects.equals(this.telefonesEscritoriosCobranca, credorResponse.telefonesEscritoriosCobranca);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nomeCredor, diaPagamentoSemanal, diaPagamentoMensal, diaPagamentoDecendialPrimeiro, diaPagamentoDecendialSegundo, diaPagamentoDecendialTerceiro, diaPagamentoQuinzenalPrimeiro, diaPagamentoQuinzenalSegundo, banco, agencia, digitoAgencia, contaCorrente, digitoContaCorrente, credorBanco, percentualRAV, recebeRAV, percentualMultiplica, taxaAdministrativa, taxaBanco, limiteRAV, idCredorRAV, periodicidade, idPessoaJuridica, flagEscritorioCobranca, escritoriosCobranca, telefonesEscritoriosCobranca);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredorResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nomeCredor: ").append(toIndentedString(nomeCredor)).append("\n");
    sb.append("    diaPagamentoSemanal: ").append(toIndentedString(diaPagamentoSemanal)).append("\n");
    sb.append("    diaPagamentoMensal: ").append(toIndentedString(diaPagamentoMensal)).append("\n");
    sb.append("    diaPagamentoDecendialPrimeiro: ").append(toIndentedString(diaPagamentoDecendialPrimeiro)).append("\n");
    sb.append("    diaPagamentoDecendialSegundo: ").append(toIndentedString(diaPagamentoDecendialSegundo)).append("\n");
    sb.append("    diaPagamentoDecendialTerceiro: ").append(toIndentedString(diaPagamentoDecendialTerceiro)).append("\n");
    sb.append("    diaPagamentoQuinzenalPrimeiro: ").append(toIndentedString(diaPagamentoQuinzenalPrimeiro)).append("\n");
    sb.append("    diaPagamentoQuinzenalSegundo: ").append(toIndentedString(diaPagamentoQuinzenalSegundo)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    digitoAgencia: ").append(toIndentedString(digitoAgencia)).append("\n");
    sb.append("    contaCorrente: ").append(toIndentedString(contaCorrente)).append("\n");
    sb.append("    digitoContaCorrente: ").append(toIndentedString(digitoContaCorrente)).append("\n");
    sb.append("    credorBanco: ").append(toIndentedString(credorBanco)).append("\n");
    sb.append("    percentualRAV: ").append(toIndentedString(percentualRAV)).append("\n");
    sb.append("    recebeRAV: ").append(toIndentedString(recebeRAV)).append("\n");
    sb.append("    percentualMultiplica: ").append(toIndentedString(percentualMultiplica)).append("\n");
    sb.append("    taxaAdministrativa: ").append(toIndentedString(taxaAdministrativa)).append("\n");
    sb.append("    taxaBanco: ").append(toIndentedString(taxaBanco)).append("\n");
    sb.append("    limiteRAV: ").append(toIndentedString(limiteRAV)).append("\n");
    sb.append("    idCredorRAV: ").append(toIndentedString(idCredorRAV)).append("\n");
    sb.append("    periodicidade: ").append(toIndentedString(periodicidade)).append("\n");
    sb.append("    idPessoaJuridica: ").append(toIndentedString(idPessoaJuridica)).append("\n");
    sb.append("    flagEscritorioCobranca: ").append(toIndentedString(flagEscritorioCobranca)).append("\n");
    sb.append("    escritoriosCobranca: ").append(toIndentedString(escritoriosCobranca)).append("\n");
    sb.append("    telefonesEscritoriosCobranca: ").append(toIndentedString(telefonesEscritoriosCobranca)).append("\n");
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

