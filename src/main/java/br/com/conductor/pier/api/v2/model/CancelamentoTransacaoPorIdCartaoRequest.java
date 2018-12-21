package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Cancellation request object of the transaction per idCard
 **/

@ApiModel(description = "Cancellation request object of the transaction per idCard")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CancelamentoTransacaoPorIdCartaoRequest   {
  
  private String nsuOrigem = null;
  private String nsuOrigemTransacaoCancelada = null;
  private String codigoProcessamento = null;
  private String dataHoraTransacaoCancelada = null;
  private String nsuAutorizacaoTransacaoCancelada = null;
  private BigDecimal valorTransacao = null;
  private Long numeroEstabelecimento = null;
  private String nomeEstabelecimento = null;
  private String dataHoraTerminal = null;
  private String terminalRequisitante = null;
  private Long numeroParcelas = null;

  
  /**
   * Unique Sequel Number that identifies the transaction in the system that originated it
   **/
  public CancelamentoTransacaoPorIdCartaoRequest nsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique Sequel Number that identifies the transaction in the system that originated it")
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
  public CancelamentoTransacaoPorIdCartaoRequest nsuOrigemTransacaoCancelada(String nsuOrigemTransacaoCancelada) {
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
   * Code of Processing that identifies the type of transaction
   **/
  public CancelamentoTransacaoPorIdCartaoRequest codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Code of Processing that identifies the type of transaction")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * Show the date and local time of the Transaction to be canceled yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   **/
  public CancelamentoTransacaoPorIdCartaoRequest dataHoraTransacaoCancelada(String dataHoraTransacaoCancelada) {
    this.dataHoraTransacaoCancelada = dataHoraTransacaoCancelada;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Show the date and local time of the Transaction to be canceled yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00")
  @JsonProperty("dataHoraTransacaoCancelada")
  public String getDataHoraTransacaoCancelada() {
    return dataHoraTransacaoCancelada;
  }
  public void setDataHoraTransacaoCancelada(String dataHoraTransacaoCancelada) {
    this.dataHoraTransacaoCancelada = dataHoraTransacaoCancelada;
  }

  
  /**
   * Unique Sequel Number of HOST that identifies the transactionin the system that was authorized
   **/
  public CancelamentoTransacaoPorIdCartaoRequest nsuAutorizacaoTransacaoCancelada(String nsuAutorizacaoTransacaoCancelada) {
    this.nsuAutorizacaoTransacaoCancelada = nsuAutorizacaoTransacaoCancelada;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique Sequel Number of HOST that identifies the transactionin the system that was authorized")
  @JsonProperty("nsuAutorizacaoTransacaoCancelada")
  public String getNsuAutorizacaoTransacaoCancelada() {
    return nsuAutorizacaoTransacaoCancelada;
  }
  public void setNsuAutorizacaoTransacaoCancelada(String nsuAutorizacaoTransacaoCancelada) {
    this.nsuAutorizacaoTransacaoCancelada = nsuAutorizacaoTransacaoCancelada;
  }

  
  /**
   * Value of the transaction with two decimal places for the cents
   **/
  public CancelamentoTransacaoPorIdCartaoRequest valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "10.25", required = true, value = "Value of the transaction with two decimal places for the cents")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * Number of the Establishment (Number+DV)
   **/
  public CancelamentoTransacaoPorIdCartaoRequest numeroEstabelecimento(Long numeroEstabelecimento) {
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
   * Establishment Name
   **/
  public CancelamentoTransacaoPorIdCartaoRequest nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Establishment Name")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Show the date and local time of the retrievement yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   **/
  public CancelamentoTransacaoPorIdCartaoRequest dataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Show the date and local time of the retrievement yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00")
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
  public CancelamentoTransacaoPorIdCartaoRequest terminalRequisitante(String terminalRequisitante) {
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

  
  /**
   * Number of Parcels
   **/
  public CancelamentoTransacaoPorIdCartaoRequest numeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of Parcels")
  @JsonProperty("numeroParcelas")
  public Long getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelamentoTransacaoPorIdCartaoRequest cancelamentoTransacaoPorIdCartaoRequest = (CancelamentoTransacaoPorIdCartaoRequest) o;
    return Objects.equals(this.nsuOrigem, cancelamentoTransacaoPorIdCartaoRequest.nsuOrigem) &&
        Objects.equals(this.nsuOrigemTransacaoCancelada, cancelamentoTransacaoPorIdCartaoRequest.nsuOrigemTransacaoCancelada) &&
        Objects.equals(this.codigoProcessamento, cancelamentoTransacaoPorIdCartaoRequest.codigoProcessamento) &&
        Objects.equals(this.dataHoraTransacaoCancelada, cancelamentoTransacaoPorIdCartaoRequest.dataHoraTransacaoCancelada) &&
        Objects.equals(this.nsuAutorizacaoTransacaoCancelada, cancelamentoTransacaoPorIdCartaoRequest.nsuAutorizacaoTransacaoCancelada) &&
        Objects.equals(this.valorTransacao, cancelamentoTransacaoPorIdCartaoRequest.valorTransacao) &&
        Objects.equals(this.numeroEstabelecimento, cancelamentoTransacaoPorIdCartaoRequest.numeroEstabelecimento) &&
        Objects.equals(this.nomeEstabelecimento, cancelamentoTransacaoPorIdCartaoRequest.nomeEstabelecimento) &&
        Objects.equals(this.dataHoraTerminal, cancelamentoTransacaoPorIdCartaoRequest.dataHoraTerminal) &&
        Objects.equals(this.terminalRequisitante, cancelamentoTransacaoPorIdCartaoRequest.terminalRequisitante) &&
        Objects.equals(this.numeroParcelas, cancelamentoTransacaoPorIdCartaoRequest.numeroParcelas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuOrigem, nsuOrigemTransacaoCancelada, codigoProcessamento, dataHoraTransacaoCancelada, nsuAutorizacaoTransacaoCancelada, valorTransacao, numeroEstabelecimento, nomeEstabelecimento, dataHoraTerminal, terminalRequisitante, numeroParcelas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelamentoTransacaoPorIdCartaoRequest {\n");
    
    sb.append("    nsuOrigem: ").append(toIndentedString(nsuOrigem)).append("\n");
    sb.append("    nsuOrigemTransacaoCancelada: ").append(toIndentedString(nsuOrigemTransacaoCancelada)).append("\n");
    sb.append("    codigoProcessamento: ").append(toIndentedString(codigoProcessamento)).append("\n");
    sb.append("    dataHoraTransacaoCancelada: ").append(toIndentedString(dataHoraTransacaoCancelada)).append("\n");
    sb.append("    nsuAutorizacaoTransacaoCancelada: ").append(toIndentedString(nsuAutorizacaoTransacaoCancelada)).append("\n");
    sb.append("    valorTransacao: ").append(toIndentedString(valorTransacao)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
    sb.append("    dataHoraTerminal: ").append(toIndentedString(dataHoraTerminal)).append("\n");
    sb.append("    terminalRequisitante: ").append(toIndentedString(terminalRequisitante)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
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

