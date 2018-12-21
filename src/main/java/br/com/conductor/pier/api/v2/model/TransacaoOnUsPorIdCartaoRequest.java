package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Object of transaction resquest On Us per idCard
 **/

@ApiModel(description = "Object of transaction resquest On Us per idCard")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransacaoOnUsPorIdCartaoRequest   {
  
  private String nsuOrigem = null;
  private String codigoProcessamento = null;
  private BigDecimal valorTransacao = null;
  private Long numeroEstabelecimento = null;
  private String nomeEstabelecimento = null;
  private String dataHoraTerminal = null;
  private String terminalRequisitante = null;
  private Long numeroParcelas = null;

  
  /**
   * Unique Sequel Number that identifies the transaction in the system that originated it
   **/
  public TransacaoOnUsPorIdCartaoRequest nsuOrigem(String nsuOrigem) {
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
   * Code of Processing that identifies the type of transaction
   **/
  public TransacaoOnUsPorIdCartaoRequest codigoProcessamento(String codigoProcessamento) {
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
   * Value of the transaction with two decimal places for the cents
   **/
  public TransacaoOnUsPorIdCartaoRequest valorTransacao(BigDecimal valorTransacao) {
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
  public TransacaoOnUsPorIdCartaoRequest numeroEstabelecimento(Long numeroEstabelecimento) {
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
  public TransacaoOnUsPorIdCartaoRequest nomeEstabelecimento(String nomeEstabelecimento) {
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
  public TransacaoOnUsPorIdCartaoRequest dataHoraTerminal(String dataHoraTerminal) {
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
  public TransacaoOnUsPorIdCartaoRequest terminalRequisitante(String terminalRequisitante) {
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
  public TransacaoOnUsPorIdCartaoRequest numeroParcelas(Long numeroParcelas) {
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
    TransacaoOnUsPorIdCartaoRequest transacaoOnUsPorIdCartaoRequest = (TransacaoOnUsPorIdCartaoRequest) o;
    return Objects.equals(this.nsuOrigem, transacaoOnUsPorIdCartaoRequest.nsuOrigem) &&
        Objects.equals(this.codigoProcessamento, transacaoOnUsPorIdCartaoRequest.codigoProcessamento) &&
        Objects.equals(this.valorTransacao, transacaoOnUsPorIdCartaoRequest.valorTransacao) &&
        Objects.equals(this.numeroEstabelecimento, transacaoOnUsPorIdCartaoRequest.numeroEstabelecimento) &&
        Objects.equals(this.nomeEstabelecimento, transacaoOnUsPorIdCartaoRequest.nomeEstabelecimento) &&
        Objects.equals(this.dataHoraTerminal, transacaoOnUsPorIdCartaoRequest.dataHoraTerminal) &&
        Objects.equals(this.terminalRequisitante, transacaoOnUsPorIdCartaoRequest.terminalRequisitante) &&
        Objects.equals(this.numeroParcelas, transacaoOnUsPorIdCartaoRequest.numeroParcelas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuOrigem, codigoProcessamento, valorTransacao, numeroEstabelecimento, nomeEstabelecimento, dataHoraTerminal, terminalRequisitante, numeroParcelas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoOnUsPorIdCartaoRequest {\n");
    
    sb.append("    nsuOrigem: ").append(toIndentedString(nsuOrigem)).append("\n");
    sb.append("    codigoProcessamento: ").append(toIndentedString(codigoProcessamento)).append("\n");
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

