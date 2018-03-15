package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de Requisi\u00E7\u00E3o de Desfazimento de transa\u00E7\u00E3o
 **/

@ApiModel(description = "Objeto de Requisi\u00E7\u00E3o de Desfazimento de transa\u00E7\u00E3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DesfazimentoTransacaoOnUsRequest   {
  
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
   * N\u00FAmero Sequencial \u00DAnico que identifica a transa\u00E7\u00E3o no sistema que a originou.
   **/
  public DesfazimentoTransacaoOnUsRequest nsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero Sequencial \u00DAnico que identifica a transa\u00E7\u00E3o no sistema que a originou.")
  @JsonProperty("nsuOrigem")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * N\u00FAmero Sequencial \u00DAnico que identifica a transa\u00E7\u00E3o no sistema a ser cancelada.
   **/
  public DesfazimentoTransacaoOnUsRequest nsuOrigemTransacaoCancelada(String nsuOrigemTransacaoCancelada) {
    this.nsuOrigemTransacaoCancelada = nsuOrigemTransacaoCancelada;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero Sequencial \u00DAnico que identifica a transa\u00E7\u00E3o no sistema a ser cancelada.")
  @JsonProperty("nsuOrigemTransacaoCancelada")
  public String getNsuOrigemTransacaoCancelada() {
    return nsuOrigemTransacaoCancelada;
  }
  public void setNsuOrigemTransacaoCancelada(String nsuOrigemTransacaoCancelada) {
    this.nsuOrigemTransacaoCancelada = nsuOrigemTransacaoCancelada;
  }

  
  /**
   * C\u00F3digo de Processamento que identifica o Tipo da Transa\u00E7\u00E3o.
   **/
  public DesfazimentoTransacaoOnUsRequest codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de Processamento que identifica o Tipo da Transa\u00E7\u00E3o.")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * Apresenta a data e hora local da transa\u00E7\u00E3o a ser cancelada yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00
   **/
  public DesfazimentoTransacaoOnUsRequest dataHoraTransacaoCancelada(String dataHoraTransacaoCancelada) {
    this.dataHoraTransacaoCancelada = dataHoraTransacaoCancelada;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a data e hora local da transa\u00E7\u00E3o a ser cancelada yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00")
  @JsonProperty("dataHoraTransacaoCancelada")
  public String getDataHoraTransacaoCancelada() {
    return dataHoraTransacaoCancelada;
  }
  public void setDataHoraTransacaoCancelada(String dataHoraTransacaoCancelada) {
    this.dataHoraTransacaoCancelada = dataHoraTransacaoCancelada;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o com duas casas decimais para os centavos.
   **/
  public DesfazimentoTransacaoOnUsRequest valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "10.25", required = true, value = "Valor da transa\u00E7\u00E3o com duas casas decimais para os centavos.")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * N\u00FAmero Real do Cart\u00E3o.
   **/
  public DesfazimentoTransacaoOnUsRequest numeroRealCartao(String numeroRealCartao) {
    this.numeroRealCartao = numeroRealCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero Real do Cart\u00E3o.")
  @JsonProperty("numeroRealCartao")
  public String getNumeroRealCartao() {
    return numeroRealCartao;
  }
  public void setNumeroRealCartao(String numeroRealCartao) {
    this.numeroRealCartao = numeroRealCartao;
  }

  
  /**
   * Data de Validade do Cart\u00E3o. Ex: AAMM
   **/
  public DesfazimentoTransacaoOnUsRequest dataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Data de Validade do Cart\u00E3o. Ex: AAMM")
  @JsonProperty("dataValidadeCartao")
  public String getDataValidadeCartao() {
    return dataValidadeCartao;
  }
  public void setDataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
  }

  
  /**
   * N\u00FAmero do Estabelecimento (N\u00FAmero+DV).
   **/
  public DesfazimentoTransacaoOnUsRequest numeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero do Estabelecimento (N\u00FAmero+DV).")
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
  public DesfazimentoTransacaoOnUsRequest dataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a data e hora local da consulta yyyy-MM-dd'T'HH:mm:ss.SSSZ. Ex: 2000-10-31T01:30:00.000-05:00")
  @JsonProperty("dataHoraTerminal")
  public String getDataHoraTerminal() {
    return dataHoraTerminal;
  }
  public void setDataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
  }

  
  /**
   * Apresenta a identifica\u00E7\u00E3o do terminal requisitante
   **/
  public DesfazimentoTransacaoOnUsRequest terminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a identifica\u00E7\u00E3o do terminal requisitante")
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
    DesfazimentoTransacaoOnUsRequest desfazimentoTransacaoOnUsRequest = (DesfazimentoTransacaoOnUsRequest) o;
    return Objects.equals(this.nsuOrigem, desfazimentoTransacaoOnUsRequest.nsuOrigem) &&
        Objects.equals(this.nsuOrigemTransacaoCancelada, desfazimentoTransacaoOnUsRequest.nsuOrigemTransacaoCancelada) &&
        Objects.equals(this.codigoProcessamento, desfazimentoTransacaoOnUsRequest.codigoProcessamento) &&
        Objects.equals(this.dataHoraTransacaoCancelada, desfazimentoTransacaoOnUsRequest.dataHoraTransacaoCancelada) &&
        Objects.equals(this.valorTransacao, desfazimentoTransacaoOnUsRequest.valorTransacao) &&
        Objects.equals(this.numeroRealCartao, desfazimentoTransacaoOnUsRequest.numeroRealCartao) &&
        Objects.equals(this.dataValidadeCartao, desfazimentoTransacaoOnUsRequest.dataValidadeCartao) &&
        Objects.equals(this.numeroEstabelecimento, desfazimentoTransacaoOnUsRequest.numeroEstabelecimento) &&
        Objects.equals(this.dataHoraTerminal, desfazimentoTransacaoOnUsRequest.dataHoraTerminal) &&
        Objects.equals(this.terminalRequisitante, desfazimentoTransacaoOnUsRequest.terminalRequisitante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuOrigem, nsuOrigemTransacaoCancelada, codigoProcessamento, dataHoraTransacaoCancelada, valorTransacao, numeroRealCartao, dataValidadeCartao, numeroEstabelecimento, dataHoraTerminal, terminalRequisitante);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesfazimentoTransacaoOnUsRequest {\n");
    
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

