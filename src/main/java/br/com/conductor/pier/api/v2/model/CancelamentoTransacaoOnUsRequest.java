package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Request Object of Transaction Cancellation
 **/

@ApiModel(description = "Request Object of Transaction Cancellation")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CancelamentoTransacaoOnUsRequest   {
  
  private String nsuAutorizacaoTransacaoCancelada = null;
  private String nsuOrigem = null;
  private String nsuOrigemTransacaoCancelada = null;
  private String codigoProcessamento = null;
  private String dataHoraTransacaoCancelada = null;
  private BigDecimal valorTransacao = null;
  private String numeroRealCartao = null;
  private String dataValidadeCartao = null;
  private Long numeroEstabelecimento = null;
  private String dataHoraTerminal = null;
  private String terminalRequisitante = null;

  
  /**
   * Unique Sequel Number of HOST that identifies the transaction in the system that was authorized
   **/
  public CancelamentoTransacaoOnUsRequest nsuAutorizacaoTransacaoCancelada(String nsuAutorizacaoTransacaoCancelada) {
    this.nsuAutorizacaoTransacaoCancelada = nsuAutorizacaoTransacaoCancelada;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique Sequel Number of HOST that identifies the transaction in the system that was authorized")
  @JsonProperty("nsuAutorizacaoTransacaoCancelada")
  public String getNsuAutorizacaoTransacaoCancelada() {
    return nsuAutorizacaoTransacaoCancelada;
  }
  public void setNsuAutorizacaoTransacaoCancelada(String nsuAutorizacaoTransacaoCancelada) {
    this.nsuAutorizacaoTransacaoCancelada = nsuAutorizacaoTransacaoCancelada;
  }

  
  /**
   * Unique Sequel Number that identifies the transaction in the system that has originated it
   **/
  public CancelamentoTransacaoOnUsRequest nsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique Sequel Number that identifies the transaction in the system that has originated it")
  @JsonProperty("nsuOrigem")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * Unique Sequel Number that identifies the transaction in the system to be canceled
   **/
  public CancelamentoTransacaoOnUsRequest nsuOrigemTransacaoCancelada(String nsuOrigemTransacaoCancelada) {
    this.nsuOrigemTransacaoCancelada = nsuOrigemTransacaoCancelada;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique Sequel Number that identifies the transaction in the system to be canceled")
  @JsonProperty("nsuOrigemTransacaoCancelada")
  public String getNsuOrigemTransacaoCancelada() {
    return nsuOrigemTransacaoCancelada;
  }
  public void setNsuOrigemTransacaoCancelada(String nsuOrigemTransacaoCancelada) {
    this.nsuOrigemTransacaoCancelada = nsuOrigemTransacaoCancelada;
  }

  
  /**
   * Code of Processing that identifies the Type of Transaction
   **/
  public CancelamentoTransacaoOnUsRequest codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Code of Processing that identifies the Type of Transaction")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * List the date and local time of the transactionto be canceled yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   **/
  public CancelamentoTransacaoOnUsRequest dataHoraTransacaoCancelada(String dataHoraTransacaoCancelada) {
    this.dataHoraTransacaoCancelada = dataHoraTransacaoCancelada;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List the date and local time of the transactionto be canceled yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00")
  @JsonProperty("dataHoraTransacaoCancelada")
  public String getDataHoraTransacaoCancelada() {
    return dataHoraTransacaoCancelada;
  }
  public void setDataHoraTransacaoCancelada(String dataHoraTransacaoCancelada) {
    this.dataHoraTransacaoCancelada = dataHoraTransacaoCancelada;
  }

  
  /**
   * Value of transaction with two decimal places for the cents
   **/
  public CancelamentoTransacaoOnUsRequest valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "10.25", required = true, value = "Value of transaction with two decimal places for the cents")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * Real number of the card
   **/
  public CancelamentoTransacaoOnUsRequest numeroRealCartao(String numeroRealCartao) {
    this.numeroRealCartao = numeroRealCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Real number of the card")
  @JsonProperty("numeroRealCartao")
  public String getNumeroRealCartao() {
    return numeroRealCartao;
  }
  public void setNumeroRealCartao(String numeroRealCartao) {
    this.numeroRealCartao = numeroRealCartao;
  }

  
  /**
   * Expiration date of the Card. Ex: YYMM
   **/
  public CancelamentoTransacaoOnUsRequest dataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Expiration date of the Card. Ex: YYMM")
  @JsonProperty("dataValidadeCartao")
  public String getDataValidadeCartao() {
    return dataValidadeCartao;
  }
  public void setDataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
  }

  
  /**
   * Number of the Establishment (Number+DV)
   **/
  public CancelamentoTransacaoOnUsRequest numeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of the Establishment (Number+DV)")
  @JsonProperty("numeroEstabelecimento")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * show the date and local time of the retrievement yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   **/
  public CancelamentoTransacaoOnUsRequest dataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "show the date and local time of the retrievement yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00")
  @JsonProperty("dataHoraTerminal")
  public String getDataHoraTerminal() {
    return dataHoraTerminal;
  }
  public void setDataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
  }

  
  /**
   * Show the identification of the terminal applicant
   **/
  public CancelamentoTransacaoOnUsRequest terminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Show the identification of the terminal applicant")
  @JsonProperty("terminalRequisitante")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelamentoTransacaoOnUsRequest cancelamentoTransacaoOnUsRequest = (CancelamentoTransacaoOnUsRequest) o;
    return Objects.equals(this.nsuAutorizacaoTransacaoCancelada, cancelamentoTransacaoOnUsRequest.nsuAutorizacaoTransacaoCancelada) &&
        Objects.equals(this.nsuOrigem, cancelamentoTransacaoOnUsRequest.nsuOrigem) &&
        Objects.equals(this.nsuOrigemTransacaoCancelada, cancelamentoTransacaoOnUsRequest.nsuOrigemTransacaoCancelada) &&
        Objects.equals(this.codigoProcessamento, cancelamentoTransacaoOnUsRequest.codigoProcessamento) &&
        Objects.equals(this.dataHoraTransacaoCancelada, cancelamentoTransacaoOnUsRequest.dataHoraTransacaoCancelada) &&
        Objects.equals(this.valorTransacao, cancelamentoTransacaoOnUsRequest.valorTransacao) &&
        Objects.equals(this.numeroRealCartao, cancelamentoTransacaoOnUsRequest.numeroRealCartao) &&
        Objects.equals(this.dataValidadeCartao, cancelamentoTransacaoOnUsRequest.dataValidadeCartao) &&
        Objects.equals(this.numeroEstabelecimento, cancelamentoTransacaoOnUsRequest.numeroEstabelecimento) &&
        Objects.equals(this.dataHoraTerminal, cancelamentoTransacaoOnUsRequest.dataHoraTerminal) &&
        Objects.equals(this.terminalRequisitante, cancelamentoTransacaoOnUsRequest.terminalRequisitante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuAutorizacaoTransacaoCancelada, nsuOrigem, nsuOrigemTransacaoCancelada, codigoProcessamento, dataHoraTransacaoCancelada, valorTransacao, numeroRealCartao, dataValidadeCartao, numeroEstabelecimento, dataHoraTerminal, terminalRequisitante);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelamentoTransacaoOnUsRequest {\n");
    
    sb.append("    nsuAutorizacaoTransacaoCancelada: ").append(toIndentedString(nsuAutorizacaoTransacaoCancelada)).append("\n");
    sb.append("    nsuOrigem: ").append(toIndentedString(nsuOrigem)).append("\n");
    sb.append("    nsuOrigemTransacaoCancelada: ").append(toIndentedString(nsuOrigemTransacaoCancelada)).append("\n");
    sb.append("    codigoProcessamento: ").append(toIndentedString(codigoProcessamento)).append("\n");
    sb.append("    dataHoraTransacaoCancelada: ").append(toIndentedString(dataHoraTransacaoCancelada)).append("\n");
    sb.append("    valorTransacao: ").append(toIndentedString(valorTransacao)).append("\n");
    sb.append("    numeroRealCartao: ").append(toIndentedString(numeroRealCartao)).append("\n");
    sb.append("    dataValidadeCartao: ").append(toIndentedString(dataValidadeCartao)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
    sb.append("    dataHoraTerminal: ").append(toIndentedString(dataHoraTerminal)).append("\n");
    sb.append("    terminalRequisitante: ").append(toIndentedString(terminalRequisitante)).append("\n");
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

