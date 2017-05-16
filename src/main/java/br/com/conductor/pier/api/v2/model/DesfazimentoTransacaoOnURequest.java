package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;





/**
 * Objeto de Requisi\u00C3\u00A7\u00C3\u00A3o de Desfazimento de transa\u00C3\u00A7\u00C3\u00A3o
 **/

@ApiModel(description = "Objeto de Requisi\u00C3\u00A7\u00C3\u00A3o de Desfazimento de transa\u00C3\u00A7\u00C3\u00A3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DesfazimentoTransacaoOnURequest   {
  
  private String nsuOrigem = null;
  private String codigoProcessamento = null;
  private BigDecimal valorTransacao = null;
  private String numeroRealCartao = null;
  private String dataValidadeCartao = null;
  private Long numeroEstabelecimento = null;
  private Date dataHoraTerminal = null;
  private String terminalRequisitante = null;
  private String nsuOrigemTransacaoCancelada = null;
  private Date dataHoraTransacaoCancelada = null;
  private String codigoTransacaoCancelada = null;

  
  /**
   * N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema que a originou.
   **/
  public DesfazimentoTransacaoOnURequest nsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema que a originou.")
  @JsonProperty("nsuOrigem")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * C\u00C3\u00B3digo de Processamento que identifica o Tipo da Transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public DesfazimentoTransacaoOnURequest codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Processamento que identifica o Tipo da Transa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * Valor da transa\u00C3\u00A7\u00C3\u00A3o com duas casas decimais para os centavos.
   **/
  public DesfazimentoTransacaoOnURequest valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da transa\u00C3\u00A7\u00C3\u00A3o com duas casas decimais para os centavos.")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * N\u00C3\u00BAmero Real do Cart\u00C3\u00A3o.
   **/
  public DesfazimentoTransacaoOnURequest numeroRealCartao(String numeroRealCartao) {
    this.numeroRealCartao = numeroRealCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero Real do Cart\u00C3\u00A3o.")
  @JsonProperty("numeroRealCartao")
  public String getNumeroRealCartao() {
    return numeroRealCartao;
  }
  public void setNumeroRealCartao(String numeroRealCartao) {
    this.numeroRealCartao = numeroRealCartao;
  }

  
  /**
   * Data de Validade do Cart\u00C3\u00A3o. Ex: AAMM
   **/
  public DesfazimentoTransacaoOnURequest dataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Validade do Cart\u00C3\u00A3o. Ex: AAMM")
  @JsonProperty("dataValidadeCartao")
  public String getDataValidadeCartao() {
    return dataValidadeCartao;
  }
  public void setDataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
  }

  
  /**
   * N\u00C3\u00BAmero do Estabelecimento (N\u00C3\u00BAmero+DV).
   **/
  public DesfazimentoTransacaoOnURequest numeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do Estabelecimento (N\u00C3\u00BAmero+DV).")
  @JsonProperty("numeroEstabelecimento")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * Apresenta a data e hora local da consulta yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   **/
  public DesfazimentoTransacaoOnURequest dataHoraTerminal(Date dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data e hora local da consulta yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00")
  @JsonProperty("dataHoraTerminal")
  public Date getDataHoraTerminal() {
    return dataHoraTerminal;
  }
  public void setDataHoraTerminal(Date dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
  }

  
  /**
   * Apresenta a identifica\u00C3\u00A7\u00C3\u00A3o do terminal requisitante
   **/
  public DesfazimentoTransacaoOnURequest terminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a identifica\u00C3\u00A7\u00C3\u00A3o do terminal requisitante")
  @JsonProperty("terminalRequisitante")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema a ser cancelada.
   **/
  public DesfazimentoTransacaoOnURequest nsuOrigemTransacaoCancelada(String nsuOrigemTransacaoCancelada) {
    this.nsuOrigemTransacaoCancelada = nsuOrigemTransacaoCancelada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema a ser cancelada.")
  @JsonProperty("nsuOrigemTransacaoCancelada")
  public String getNsuOrigemTransacaoCancelada() {
    return nsuOrigemTransacaoCancelada;
  }
  public void setNsuOrigemTransacaoCancelada(String nsuOrigemTransacaoCancelada) {
    this.nsuOrigemTransacaoCancelada = nsuOrigemTransacaoCancelada;
  }

  
  /**
   * Apresenta a data e hora local da transa\u00C3\u00A7\u00C3\u00A3o a ser cancelada yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   **/
  public DesfazimentoTransacaoOnURequest dataHoraTransacaoCancelada(Date dataHoraTransacaoCancelada) {
    this.dataHoraTransacaoCancelada = dataHoraTransacaoCancelada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data e hora local da transa\u00C3\u00A7\u00C3\u00A3o a ser cancelada yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00")
  @JsonProperty("dataHoraTransacaoCancelada")
  public Date getDataHoraTransacaoCancelada() {
    return dataHoraTransacaoCancelada;
  }
  public void setDataHoraTransacaoCancelada(Date dataHoraTransacaoCancelada) {
    this.dataHoraTransacaoCancelada = dataHoraTransacaoCancelada;
  }

  
  /**
   * C\u00C3\u00B3digo de Processamento da transa\u00C3\u00A7\u00C3\u00A3o cancelada.
   **/
  public DesfazimentoTransacaoOnURequest codigoTransacaoCancelada(String codigoTransacaoCancelada) {
    this.codigoTransacaoCancelada = codigoTransacaoCancelada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Processamento da transa\u00C3\u00A7\u00C3\u00A3o cancelada.")
  @JsonProperty("codigoTransacaoCancelada")
  public String getCodigoTransacaoCancelada() {
    return codigoTransacaoCancelada;
  }
  public void setCodigoTransacaoCancelada(String codigoTransacaoCancelada) {
    this.codigoTransacaoCancelada = codigoTransacaoCancelada;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DesfazimentoTransacaoOnURequest desfazimentoTransacaoOnURequest = (DesfazimentoTransacaoOnURequest) o;
    return Objects.equals(this.nsuOrigem, desfazimentoTransacaoOnURequest.nsuOrigem) &&
        Objects.equals(this.codigoProcessamento, desfazimentoTransacaoOnURequest.codigoProcessamento) &&
        Objects.equals(this.valorTransacao, desfazimentoTransacaoOnURequest.valorTransacao) &&
        Objects.equals(this.numeroRealCartao, desfazimentoTransacaoOnURequest.numeroRealCartao) &&
        Objects.equals(this.dataValidadeCartao, desfazimentoTransacaoOnURequest.dataValidadeCartao) &&
        Objects.equals(this.numeroEstabelecimento, desfazimentoTransacaoOnURequest.numeroEstabelecimento) &&
        Objects.equals(this.dataHoraTerminal, desfazimentoTransacaoOnURequest.dataHoraTerminal) &&
        Objects.equals(this.terminalRequisitante, desfazimentoTransacaoOnURequest.terminalRequisitante) &&
        Objects.equals(this.nsuOrigemTransacaoCancelada, desfazimentoTransacaoOnURequest.nsuOrigemTransacaoCancelada) &&
        Objects.equals(this.dataHoraTransacaoCancelada, desfazimentoTransacaoOnURequest.dataHoraTransacaoCancelada) &&
        Objects.equals(this.codigoTransacaoCancelada, desfazimentoTransacaoOnURequest.codigoTransacaoCancelada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuOrigem, codigoProcessamento, valorTransacao, numeroRealCartao, dataValidadeCartao, numeroEstabelecimento, dataHoraTerminal, terminalRequisitante, nsuOrigemTransacaoCancelada, dataHoraTransacaoCancelada, codigoTransacaoCancelada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesfazimentoTransacaoOnURequest {\n");
    
    sb.append("    nsuOrigem: ").append(toIndentedString(nsuOrigem)).append("\n");
    sb.append("    codigoProcessamento: ").append(toIndentedString(codigoProcessamento)).append("\n");
    sb.append("    valorTransacao: ").append(toIndentedString(valorTransacao)).append("\n");
    sb.append("    numeroRealCartao: ").append(toIndentedString(numeroRealCartao)).append("\n");
    sb.append("    dataValidadeCartao: ").append(toIndentedString(dataValidadeCartao)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
    sb.append("    dataHoraTerminal: ").append(toIndentedString(dataHoraTerminal)).append("\n");
    sb.append("    terminalRequisitante: ").append(toIndentedString(terminalRequisitante)).append("\n");
    sb.append("    nsuOrigemTransacaoCancelada: ").append(toIndentedString(nsuOrigemTransacaoCancelada)).append("\n");
    sb.append("    dataHoraTransacaoCancelada: ").append(toIndentedString(dataHoraTransacaoCancelada)).append("\n");
    sb.append("    codigoTransacaoCancelada: ").append(toIndentedString(codigoTransacaoCancelada)).append("\n");
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



