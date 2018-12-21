package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * BankAccountCardholderPersist
 **/

@ApiModel(description = "BankAccountCardholderPersist")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BankaccountCardholderPersist   {
  
  private Long idConta = null;
  private String nomeAgencia = null;
  private Long banco = null;
  private String numeroAgencia = null;
  private String digitoAgencia = null;
  private String numeroConta = null;
  private String digitoConta = null;
  private Integer flagAtivo = null;
  private Integer flagContaOrigemDoc = null;
  private Long idPessoaFisica = null;
  private Integer flagContaPoupanca = null;
  private String favorecido = null;
  private String numeroReceiraFederal = null;
  private Integer titularidade = null;

  
  /**
   * Identifier Code of the card account
   **/
  public BankaccountCardholderPersist idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier Code of the card account")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Description of the Agency
   **/
  public BankaccountCardholderPersist nomeAgencia(String nomeAgencia) {
    this.nomeAgencia = nomeAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the Agency")
  @JsonProperty("nomeAgencia")
  public String getNomeAgencia() {
    return nomeAgencia;
  }
  public void setNomeAgencia(String nomeAgencia) {
    this.nomeAgencia = nomeAgencia;
  }

  
  /**
   * bank Code
   **/
  public BankaccountCardholderPersist banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "bank Code")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * Agency Number
   **/
  public BankaccountCardholderPersist numeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Agency Number")
  @JsonProperty("numeroAgencia")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Digit of the agency
   **/
  public BankaccountCardholderPersist digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Digit of the agency")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * Account Number
   **/
  public BankaccountCardholderPersist numeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Account Number")
  @JsonProperty("numeroConta")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * Digit of the account
   **/
  public BankaccountCardholderPersist digitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Digit of the account")
  @JsonProperty("digitoConta")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * Signal if the bank account is active or not (1: Active, 0: Inactive)
   **/
  public BankaccountCardholderPersist flagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Signal if the bank account is active or not (1: Active, 0: Inactive)")
  @JsonProperty("flagAtivo")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Signals if the origin is DOC (1: DOC, 0: TED)
   **/
  public BankaccountCardholderPersist flagContaOrigemDoc(Integer flagContaOrigemDoc) {
    this.flagContaOrigemDoc = flagContaOrigemDoc;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Signals if the origin is DOC (1: DOC, 0: TED)")
  @JsonProperty("flagContaOrigemDoc")
  public Integer getFlagContaOrigemDoc() {
    return flagContaOrigemDoc;
  }
  public void setFlagContaOrigemDoc(Integer flagContaOrigemDoc) {
    this.flagContaOrigemDoc = flagContaOrigemDoc;
  }

  
  /**
   * Code of the person
   **/
  public BankaccountCardholderPersist idPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Code of the person")
  @JsonProperty("idPessoaFisica")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   * Signal if the banking account is a saving account (1: saving account, 0: Current Account)
   **/
  public BankaccountCardholderPersist flagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Signal if the banking account is a saving account (1: saving account, 0: Current Account)")
  @JsonProperty("flagContaPoupanca")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * Favored Name
   **/
  public BankaccountCardholderPersist favorecido(String favorecido) {
    this.favorecido = favorecido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Favored Name")
  @JsonProperty("favorecido")
  public String getFavorecido() {
    return favorecido;
  }
  public void setFavorecido(String favorecido) {
    this.favorecido = favorecido;
  }

  
  /**
   * Document of the favored
   **/
  public BankaccountCardholderPersist numeroReceiraFederal(String numeroReceiraFederal) {
    this.numeroReceiraFederal = numeroReceiraFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Document of the favored")
  @JsonProperty("numeroReceiraFederal")
  public String getNumeroReceiraFederal() {
    return numeroReceiraFederal;
  }
  public void setNumeroReceiraFederal(String numeroReceiraFederal) {
    this.numeroReceiraFederal = numeroReceiraFederal;
  }

  
  /**
   * Owner of the account (1:Cardholder is the owner, 0: Cardholder is not the owner)
   **/
  public BankaccountCardholderPersist titularidade(Integer titularidade) {
    this.titularidade = titularidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Owner of the account (1:Cardholder is the owner, 0: Cardholder is not the owner)")
  @JsonProperty("titularidade")
  public Integer getTitularidade() {
    return titularidade;
  }
  public void setTitularidade(Integer titularidade) {
    this.titularidade = titularidade;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankaccountCardholderPersist bankaccountCardholderPersist = (BankaccountCardholderPersist) o;
    return Objects.equals(this.idConta, bankaccountCardholderPersist.idConta) &&
        Objects.equals(this.nomeAgencia, bankaccountCardholderPersist.nomeAgencia) &&
        Objects.equals(this.banco, bankaccountCardholderPersist.banco) &&
        Objects.equals(this.numeroAgencia, bankaccountCardholderPersist.numeroAgencia) &&
        Objects.equals(this.digitoAgencia, bankaccountCardholderPersist.digitoAgencia) &&
        Objects.equals(this.numeroConta, bankaccountCardholderPersist.numeroConta) &&
        Objects.equals(this.digitoConta, bankaccountCardholderPersist.digitoConta) &&
        Objects.equals(this.flagAtivo, bankaccountCardholderPersist.flagAtivo) &&
        Objects.equals(this.flagContaOrigemDoc, bankaccountCardholderPersist.flagContaOrigemDoc) &&
        Objects.equals(this.idPessoaFisica, bankaccountCardholderPersist.idPessoaFisica) &&
        Objects.equals(this.flagContaPoupanca, bankaccountCardholderPersist.flagContaPoupanca) &&
        Objects.equals(this.favorecido, bankaccountCardholderPersist.favorecido) &&
        Objects.equals(this.numeroReceiraFederal, bankaccountCardholderPersist.numeroReceiraFederal) &&
        Objects.equals(this.titularidade, bankaccountCardholderPersist.titularidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, nomeAgencia, banco, numeroAgencia, digitoAgencia, numeroConta, digitoConta, flagAtivo, flagContaOrigemDoc, idPessoaFisica, flagContaPoupanca, favorecido, numeroReceiraFederal, titularidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankaccountCardholderPersist {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    nomeAgencia: ").append(toIndentedString(nomeAgencia)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    digitoAgencia: ").append(toIndentedString(digitoAgencia)).append("\n");
    sb.append("    numeroConta: ").append(toIndentedString(numeroConta)).append("\n");
    sb.append("    digitoConta: ").append(toIndentedString(digitoConta)).append("\n");
    sb.append("    flagAtivo: ").append(toIndentedString(flagAtivo)).append("\n");
    sb.append("    flagContaOrigemDoc: ").append(toIndentedString(flagContaOrigemDoc)).append("\n");
    sb.append("    idPessoaFisica: ").append(toIndentedString(idPessoaFisica)).append("\n");
    sb.append("    flagContaPoupanca: ").append(toIndentedString(flagContaPoupanca)).append("\n");
    sb.append("    favorecido: ").append(toIndentedString(favorecido)).append("\n");
    sb.append("    numeroReceiraFederal: ").append(toIndentedString(numeroReceiraFederal)).append("\n");
    sb.append("    titularidade: ").append(toIndentedString(titularidade)).append("\n");
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

