package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de Requisi\u00E7\u00E3o de Cancelamento de transa\u00E7\u00E3o por idCartao
 **/

@ApiModel(description = "Objeto de Requisi\u00E7\u00E3o de Cancelamento de transa\u00E7\u00E3o por idCartao")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CancelamentoTransacaoPorIdCartaoRequest   {
  
  private String nsuOrigem = null;
  private String nsuOrigemTransacaoCancelada = null;
  private String codigoProcessamento = null;
  private String dataHoraTransacaoCancelada = null;
  private String nsuAutorizacaoTransacaoCancelada = null;
  private BigDecimal valorTransacao = null;
  private Long numeroEstabelecimento = null;
  private String dataHoraTerminal = null;
  private String terminalRequisitante = null;
  private Long numeroParcelas = null;

  
  /**
   * N\u00FAmero Sequencial \u00DAnico que identifica a transa\u00E7\u00E3o no sistema que a originou.
   **/
  public CancelamentoTransacaoPorIdCartaoRequest nsuOrigem(String nsuOrigem) {
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
  public CancelamentoTransacaoPorIdCartaoRequest nsuOrigemTransacaoCancelada(String nsuOrigemTransacaoCancelada) {
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
  public CancelamentoTransacaoPorIdCartaoRequest codigoProcessamento(String codigoProcessamento) {
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
  public CancelamentoTransacaoPorIdCartaoRequest dataHoraTransacaoCancelada(String dataHoraTransacaoCancelada) {
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
   * N\u00FAmero Sequencial \u00DAnico do HOST que identifica a transa\u00E7\u00E3o no sistema que autorizou.
   **/
  public CancelamentoTransacaoPorIdCartaoRequest nsuAutorizacaoTransacaoCancelada(String nsuAutorizacaoTransacaoCancelada) {
    this.nsuAutorizacaoTransacaoCancelada = nsuAutorizacaoTransacaoCancelada;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero Sequencial \u00DAnico do HOST que identifica a transa\u00E7\u00E3o no sistema que autorizou.")
  @JsonProperty("nsuAutorizacaoTransacaoCancelada")
  public String getNsuAutorizacaoTransacaoCancelada() {
    return nsuAutorizacaoTransacaoCancelada;
  }
  public void setNsuAutorizacaoTransacaoCancelada(String nsuAutorizacaoTransacaoCancelada) {
    this.nsuAutorizacaoTransacaoCancelada = nsuAutorizacaoTransacaoCancelada;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o com duas casas decimais para os centavos.
   **/
  public CancelamentoTransacaoPorIdCartaoRequest valorTransacao(BigDecimal valorTransacao) {
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
   * N\u00FAmero do Estabelecimento (N\u00FAmero+DV).
   **/
  public CancelamentoTransacaoPorIdCartaoRequest numeroEstabelecimento(Long numeroEstabelecimento) {
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
  public CancelamentoTransacaoPorIdCartaoRequest dataHoraTerminal(String dataHoraTerminal) {
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
  public CancelamentoTransacaoPorIdCartaoRequest terminalRequisitante(String terminalRequisitante) {
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

  
  /**
   * N\u00FAmero de Parcelas.
   **/
  public CancelamentoTransacaoPorIdCartaoRequest numeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero de Parcelas.")
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
        Objects.equals(this.dataHoraTerminal, cancelamentoTransacaoPorIdCartaoRequest.dataHoraTerminal) &&
        Objects.equals(this.terminalRequisitante, cancelamentoTransacaoPorIdCartaoRequest.terminalRequisitante) &&
        Objects.equals(this.numeroParcelas, cancelamentoTransacaoPorIdCartaoRequest.numeroParcelas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuOrigem, nsuOrigemTransacaoCancelada, codigoProcessamento, dataHoraTransacaoCancelada, nsuAutorizacaoTransacaoCancelada, valorTransacao, numeroEstabelecimento, dataHoraTerminal, terminalRequisitante, numeroParcelas);
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

