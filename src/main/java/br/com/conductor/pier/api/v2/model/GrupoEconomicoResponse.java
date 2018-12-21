package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Response Representation of the economic group resource
 **/

@ApiModel(description = "Response Representation of the economic group resource")
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
   * Identifier code of the economic group
   **/
  public GrupoEconomicoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier code of the economic group")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Social reason of the Legal person
   **/
  public GrupoEconomicoResponse razaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Social reason of the Legal person")
  @JsonProperty("razaoSocial")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * Name of the Creditor
   **/
  public GrupoEconomicoResponse nomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
    return this;
  }
  
  @ApiModelProperty(example = "Exemplo", value = "Name of the Creditor")
  @JsonProperty("nomeCredor")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   * Number of the IRs
   **/
  public GrupoEconomicoResponse numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of the IRs")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * State Registration Number
   **/
  public GrupoEconomicoResponse inscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State Registration Number")
  @JsonProperty("inscricaoEstadual")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Name of the person to keep contact
   **/
  public GrupoEconomicoResponse contato(String contato) {
    this.contato = contato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the person to keep contact")
  @JsonProperty("contato")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * Bank code
   **/
  public GrupoEconomicoResponse banco(Integer banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Bank code")
  @JsonProperty("banco")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * Agency Code
   **/
  public GrupoEconomicoResponse agencia(Integer agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agency Code")
  @JsonProperty("agencia")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * Verifier digit of the agency
   **/
  public GrupoEconomicoResponse digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Verifier digit of the agency")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * Code of the Current Account
   **/
  public GrupoEconomicoResponse contaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Code of the Current Account")
  @JsonProperty("contaCorrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * Verifier Digit of the current account
   **/
  public GrupoEconomicoResponse digitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Verifier Digit of the current account")
  @JsonProperty("digitoContaCorrente")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  
  /**
   * User login for registering the insertion
   **/
  public GrupoEconomicoResponse usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User login for registering the insertion")
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * Payment Frequency
   **/
  public GrupoEconomicoResponse periodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
    return this;
  }
  
  @ApiModelProperty(example = "DIARIO", value = "Payment Frequency")
  @JsonProperty("periodicidade")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * Weekly payday
   **/
  public GrupoEconomicoResponse pagamentoSemanal(PagamentoSemanalEnum pagamentoSemanal) {
    this.pagamentoSemanal = pagamentoSemanal;
    return this;
  }
  
  @ApiModelProperty(example = "SEGUNDA", value = "Weekly payday")
  @JsonProperty("pagamentoSemanal")
  public PagamentoSemanalEnum getPagamentoSemanal() {
    return pagamentoSemanal;
  }
  public void setPagamentoSemanal(PagamentoSemanalEnum pagamentoSemanal) {
    this.pagamentoSemanal = pagamentoSemanal;
  }

  
  /**
   * Monthly payment date
   **/
  public GrupoEconomicoResponse pagamentoMensal(Integer pagamentoMensal) {
    this.pagamentoMensal = pagamentoMensal;
    return this;
  }
  
  @ApiModelProperty(example = "10", value = "Monthly payment date")
  @JsonProperty("pagamentoMensal")
  public Integer getPagamentoMensal() {
    return pagamentoMensal;
  }
  public void setPagamentoMensal(Integer pagamentoMensal) {
    this.pagamentoMensal = pagamentoMensal;
  }

  
  /**
   * First decendial payment date
   **/
  public GrupoEconomicoResponse pagamentoDecendialPrimeiro(Integer pagamentoDecendialPrimeiro) {
    this.pagamentoDecendialPrimeiro = pagamentoDecendialPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "5", value = "First decendial payment date")
  @JsonProperty("pagamentoDecendialPrimeiro")
  public Integer getPagamentoDecendialPrimeiro() {
    return pagamentoDecendialPrimeiro;
  }
  public void setPagamentoDecendialPrimeiro(Integer pagamentoDecendialPrimeiro) {
    this.pagamentoDecendialPrimeiro = pagamentoDecendialPrimeiro;
  }

  
  /**
   * Second decendial payment date
   **/
  public GrupoEconomicoResponse pagamentoDecendialSegundo(Integer pagamentoDecendialSegundo) {
    this.pagamentoDecendialSegundo = pagamentoDecendialSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "15", value = "Second decendial payment date")
  @JsonProperty("pagamentoDecendialSegundo")
  public Integer getPagamentoDecendialSegundo() {
    return pagamentoDecendialSegundo;
  }
  public void setPagamentoDecendialSegundo(Integer pagamentoDecendialSegundo) {
    this.pagamentoDecendialSegundo = pagamentoDecendialSegundo;
  }

  
  /**
   * Third decendial payment date
   **/
  public GrupoEconomicoResponse pagamentoDecendialTerceiro(Integer pagamentoDecendialTerceiro) {
    this.pagamentoDecendialTerceiro = pagamentoDecendialTerceiro;
    return this;
  }
  
  @ApiModelProperty(example = "25", value = "Third decendial payment date")
  @JsonProperty("pagamentoDecendialTerceiro")
  public Integer getPagamentoDecendialTerceiro() {
    return pagamentoDecendialTerceiro;
  }
  public void setPagamentoDecendialTerceiro(Integer pagamentoDecendialTerceiro) {
    this.pagamentoDecendialTerceiro = pagamentoDecendialTerceiro;
  }

  
  /**
   * First Biweekly Payment Date
   **/
  public GrupoEconomicoResponse pagamentoQuinzenalPrimeiro(Integer pagamentoQuinzenalPrimeiro) {
    this.pagamentoQuinzenalPrimeiro = pagamentoQuinzenalPrimeiro;
    return this;
  }
  
  @ApiModelProperty(example = "5", value = "First Biweekly Payment Date")
  @JsonProperty("pagamentoQuinzenalPrimeiro")
  public Integer getPagamentoQuinzenalPrimeiro() {
    return pagamentoQuinzenalPrimeiro;
  }
  public void setPagamentoQuinzenalPrimeiro(Integer pagamentoQuinzenalPrimeiro) {
    this.pagamentoQuinzenalPrimeiro = pagamentoQuinzenalPrimeiro;
  }

  
  /**
   * Second Biweekly payment date
   **/
  public GrupoEconomicoResponse pagamentoQuinzenalSegundo(Integer pagamentoQuinzenalSegundo) {
    this.pagamentoQuinzenalSegundo = pagamentoQuinzenalSegundo;
    return this;
  }
  
  @ApiModelProperty(example = "20", value = "Second Biweekly payment date")
  @JsonProperty("pagamentoQuinzenalSegundo")
  public Integer getPagamentoQuinzenalSegundo() {
    return pagamentoQuinzenalSegundo;
  }
  public void setPagamentoQuinzenalSegundo(Integer pagamentoQuinzenalSegundo) {
    this.pagamentoQuinzenalSegundo = pagamentoQuinzenalSegundo;
  }

  
  /**
   * Identifier of the creditor RAV
   **/
  public GrupoEconomicoResponse idCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "Identifier of the creditor RAV")
  @JsonProperty("idCredorRAV")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * Percentage Value of the creditor RAV
   **/
  public GrupoEconomicoResponse percentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
    return this;
  }
  
  @ApiModelProperty(example = "0.015", value = "Percentage Value of the creditor RAV")
  @JsonProperty("percentualRAV")
  public BigDecimal getPercentualRAV() {
    return percentualRAV;
  }
  public void setPercentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
  }

  
  /**
   * Indicate if the creditor recieves RAV and the type
   **/
  public GrupoEconomicoResponse recebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
    return this;
  }
  
  @ApiModelProperty(example = "NAO_TEM_PERMISSAO_RAV", value = "Indicate if the creditor recieves RAV and the type")
  @JsonProperty("recebeRAV")
  public RecebeRAVEnum getRecebeRAV() {
    return recebeRAV;
  }
  public void setRecebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
  }

  
  /**
   * Percentage Multiply
   **/
  public GrupoEconomicoResponse percentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
    return this;
  }
  
  @ApiModelProperty(example = "0.1", value = "Percentage Multiply")
  @JsonProperty("percentualMultiplica")
  public BigDecimal getPercentualMultiplica() {
    return percentualMultiplica;
  }
  public void setPercentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
  }

  
  /**
   * Administrative Taxe
   **/
  public GrupoEconomicoResponse taxaAdm(BigDecimal taxaAdm) {
    this.taxaAdm = taxaAdm;
    return this;
  }
  
  @ApiModelProperty(example = "0.1", value = "Administrative Taxe")
  @JsonProperty("taxaAdm")
  public BigDecimal getTaxaAdm() {
    return taxaAdm;
  }
  public void setTaxaAdm(BigDecimal taxaAdm) {
    this.taxaAdm = taxaAdm;
  }

  
  /**
   * Taxe of the Bank
   **/
  public GrupoEconomicoResponse taxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
    return this;
  }
  
  @ApiModelProperty(example = "0.1", value = "Taxe of the Bank")
  @JsonProperty("taxaBanco")
  public BigDecimal getTaxaBanco() {
    return taxaBanco;
  }
  public void setTaxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
  }

  
  /**
   * Limit value of the RAV
   **/
  public GrupoEconomicoResponse limiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
    return this;
  }
  
  @ApiModelProperty(example = "0.015", value = "Limit value of the RAV")
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

