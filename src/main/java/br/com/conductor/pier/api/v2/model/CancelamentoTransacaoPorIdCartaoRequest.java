package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{cancelamento_transacao_por_id_cartao_request_description}}}
 **/

@ApiModel(description = "{{{cancelamento_transacao_por_id_cartao_request_description}}}")
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
   * {{{transacao_on_us_por_id_cartao_request_nsu_origem_value}}}
   **/
  public CancelamentoTransacaoPorIdCartaoRequest nsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transacao_on_us_por_id_cartao_request_nsu_origem_value}}}")
  @JsonProperty("nsuOrigem")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * {{{cancelamento_transacao_por_id_cartao_request_nsu_origem_transacao_cancelada_value}}}
   **/
  public CancelamentoTransacaoPorIdCartaoRequest nsuOrigemTransacaoCancelada(String nsuOrigemTransacaoCancelada) {
    this.nsuOrigemTransacaoCancelada = nsuOrigemTransacaoCancelada;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{cancelamento_transacao_por_id_cartao_request_nsu_origem_transacao_cancelada_value}}}")
  @JsonProperty("nsuOrigemTransacaoCancelada")
  public String getNsuOrigemTransacaoCancelada() {
    return nsuOrigemTransacaoCancelada;
  }
  public void setNsuOrigemTransacaoCancelada(String nsuOrigemTransacaoCancelada) {
    this.nsuOrigemTransacaoCancelada = nsuOrigemTransacaoCancelada;
  }

  
  /**
   * {{{transacao_on_us_por_id_cartao_request_codigo_processamento_value}}}
   **/
  public CancelamentoTransacaoPorIdCartaoRequest codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transacao_on_us_por_id_cartao_request_codigo_processamento_value}}}")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * {{{cancelamento_transacao_por_id_cartao_request_data_hora_transacao_cancelada_value}}}
   **/
  public CancelamentoTransacaoPorIdCartaoRequest dataHoraTransacaoCancelada(String dataHoraTransacaoCancelada) {
    this.dataHoraTransacaoCancelada = dataHoraTransacaoCancelada;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{cancelamento_transacao_por_id_cartao_request_data_hora_transacao_cancelada_value}}}")
  @JsonProperty("dataHoraTransacaoCancelada")
  public String getDataHoraTransacaoCancelada() {
    return dataHoraTransacaoCancelada;
  }
  public void setDataHoraTransacaoCancelada(String dataHoraTransacaoCancelada) {
    this.dataHoraTransacaoCancelada = dataHoraTransacaoCancelada;
  }

  
  /**
   * {{{cancelamento_transacao_por_id_cartao_request_nsu_autorizacao_transacao_cancelada_value}}}
   **/
  public CancelamentoTransacaoPorIdCartaoRequest nsuAutorizacaoTransacaoCancelada(String nsuAutorizacaoTransacaoCancelada) {
    this.nsuAutorizacaoTransacaoCancelada = nsuAutorizacaoTransacaoCancelada;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{cancelamento_transacao_por_id_cartao_request_nsu_autorizacao_transacao_cancelada_value}}}")
  @JsonProperty("nsuAutorizacaoTransacaoCancelada")
  public String getNsuAutorizacaoTransacaoCancelada() {
    return nsuAutorizacaoTransacaoCancelada;
  }
  public void setNsuAutorizacaoTransacaoCancelada(String nsuAutorizacaoTransacaoCancelada) {
    this.nsuAutorizacaoTransacaoCancelada = nsuAutorizacaoTransacaoCancelada;
  }

  
  /**
   * {{{transacao_on_us_por_id_cartao_request_valor_transacao_value}}}
   **/
  public CancelamentoTransacaoPorIdCartaoRequest valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "10.25", required = true, value = "{{{transacao_on_us_por_id_cartao_request_valor_transacao_value}}}")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * {{{transacao_on_us_por_id_cartao_request_numero_estabelecimento_value}}}
   **/
  public CancelamentoTransacaoPorIdCartaoRequest numeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transacao_on_us_por_id_cartao_request_numero_estabelecimento_value}}}")
  @JsonProperty("numeroEstabelecimento")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * {{{transacao_on_us_por_id_cartao_request_nome_estabelecimento_value}}}
   **/
  public CancelamentoTransacaoPorIdCartaoRequest nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_on_us_por_id_cartao_request_nome_estabelecimento_value}}}")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * {{{transacao_on_us_por_id_cartao_request_data_hora_terminal_value}}}
   **/
  public CancelamentoTransacaoPorIdCartaoRequest dataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transacao_on_us_por_id_cartao_request_data_hora_terminal_value}}}")
  @JsonProperty("dataHoraTerminal")
  public String getDataHoraTerminal() {
    return dataHoraTerminal;
  }
  public void setDataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
  }

  
  /**
   * {{{transacao_on_us_por_id_cartao_request_terminal_requisitante_value}}}
   **/
  public CancelamentoTransacaoPorIdCartaoRequest terminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transacao_on_us_por_id_cartao_request_terminal_requisitante_value}}}")
  @JsonProperty("terminalRequisitante")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * {{{transacao_on_us_por_id_cartao_request_numero_parcelas_value}}}
   **/
  public CancelamentoTransacaoPorIdCartaoRequest numeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transacao_on_us_por_id_cartao_request_numero_parcelas_value}}}")
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

