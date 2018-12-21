package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Credit Transfer for the bank account
 **/

@ApiModel(description = "Credit Transfer for the bank account")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransferCreditBankingAccountPersist   {
  
  private Long nsuOrigem = null;
  private Long idCartao = null;
  private Long idContaBancaria = null;
  private BigDecimal valor = null;
  private Long numeroParcelas = null;
  private Integer numeroMesesCarencia = null;
  private String dataHoraTerminal = null;
  private String terminalRequisitante = null;
  private String numeroEstabelecimento = null;

  
  /**
   * Represent the Unique Sequel Number that identifies the transaction in the system which has created it
   **/
  public TransferCreditBankingAccountPersist nsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Represent the Unique Sequel Number that identifies the transaction in the system which has created it")
  @JsonProperty("nsuOrigem")
  public Long getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * Represent the Card Identifier
   **/
  public TransferCreditBankingAccountPersist idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Represent the Card Identifier")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Represent the Banking account identifier
   **/
  public TransferCreditBankingAccountPersist idContaBancaria(Long idContaBancaria) {
    this.idContaBancaria = idContaBancaria;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Represent the Banking account identifier")
  @JsonProperty("idContaBancaria")
  public Long getIdContaBancaria() {
    return idContaBancaria;
  }
  public void setIdContaBancaria(Long idContaBancaria) {
    this.idContaBancaria = idContaBancaria;
  }

  
  /**
   * Represent the value of the transfer
   **/
  public TransferCreditBankingAccountPersist valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Represent the value of the transfer")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Represent the number of parcels which the value of the transfer will be divided
   **/
  public TransferCreditBankingAccountPersist numeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Represent the number of parcels which the value of the transfer will be divided")
  @JsonProperty("numeroParcelas")
  public Long getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Represent the number of months given as a lack
   **/
  public TransferCreditBankingAccountPersist numeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Represent the number of months given as a lack")
  @JsonProperty("numeroMesesCarencia")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * Represent the date and the time of the terminal requestor
   **/
  public TransferCreditBankingAccountPersist dataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Represent the date and the time of the terminal requestor")
  @JsonProperty("dataHoraTerminal")
  public String getDataHoraTerminal() {
    return dataHoraTerminal;
  }
  public void setDataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
  }

  
  /**
   * Represent the identification of the terminal acquirer
   **/
  public TransferCreditBankingAccountPersist terminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Represent the identification of the terminal acquirer")
  @JsonProperty("terminalRequisitante")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * Represent the Merchant Identification Number
   **/
  public TransferCreditBankingAccountPersist numeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Represent the Merchant Identification Number")
  @JsonProperty("numeroEstabelecimento")
  public String getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferCreditBankingAccountPersist transferCreditBankingAccountPersist = (TransferCreditBankingAccountPersist) o;
    return Objects.equals(this.nsuOrigem, transferCreditBankingAccountPersist.nsuOrigem) &&
        Objects.equals(this.idCartao, transferCreditBankingAccountPersist.idCartao) &&
        Objects.equals(this.idContaBancaria, transferCreditBankingAccountPersist.idContaBancaria) &&
        Objects.equals(this.valor, transferCreditBankingAccountPersist.valor) &&
        Objects.equals(this.numeroParcelas, transferCreditBankingAccountPersist.numeroParcelas) &&
        Objects.equals(this.numeroMesesCarencia, transferCreditBankingAccountPersist.numeroMesesCarencia) &&
        Objects.equals(this.dataHoraTerminal, transferCreditBankingAccountPersist.dataHoraTerminal) &&
        Objects.equals(this.terminalRequisitante, transferCreditBankingAccountPersist.terminalRequisitante) &&
        Objects.equals(this.numeroEstabelecimento, transferCreditBankingAccountPersist.numeroEstabelecimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuOrigem, idCartao, idContaBancaria, valor, numeroParcelas, numeroMesesCarencia, dataHoraTerminal, terminalRequisitante, numeroEstabelecimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferCreditBankingAccountPersist {\n");
    
    sb.append("    nsuOrigem: ").append(toIndentedString(nsuOrigem)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idContaBancaria: ").append(toIndentedString(idContaBancaria)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    numeroMesesCarencia: ").append(toIndentedString(numeroMesesCarencia)).append("\n");
    sb.append("    dataHoraTerminal: ").append(toIndentedString(dataHoraTerminal)).append("\n");
    sb.append("    terminalRequisitante: ").append(toIndentedString(terminalRequisitante)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
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

