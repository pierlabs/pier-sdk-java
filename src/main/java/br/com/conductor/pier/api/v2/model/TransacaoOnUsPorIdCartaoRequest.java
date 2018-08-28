package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{transacao_on_us_por_id_cartao_request_description}}}
 **/

@ApiModel(description = "{{{transacao_on_us_por_id_cartao_request_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransacaoOnUsPorIdCartaoRequest   {
  
  private String nsuOrigem = null;
  private String codigoProcessamento = null;
  private BigDecimal valorTransacao = null;
  private Long numeroEstabelecimento = null;
  private String dataHoraTerminal = null;
  private String terminalRequisitante = null;
  private Long numeroParcelas = null;

  
  /**
   * {{{transacao_on_us_por_id_cartao_request_nsu_origem_value}}}
   **/
  public TransacaoOnUsPorIdCartaoRequest nsuOrigem(String nsuOrigem) {
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
   * {{{transacao_on_us_por_id_cartao_request_codigo_processamento_value}}}
   **/
  public TransacaoOnUsPorIdCartaoRequest codigoProcessamento(String codigoProcessamento) {
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
   * {{{transacao_on_us_por_id_cartao_request_valor_transacao_value}}}
   **/
  public TransacaoOnUsPorIdCartaoRequest valorTransacao(BigDecimal valorTransacao) {
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
  public TransacaoOnUsPorIdCartaoRequest numeroEstabelecimento(Long numeroEstabelecimento) {
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
   * {{{transacao_on_us_por_id_cartao_request_data_hora_terminal_value}}}
   **/
  public TransacaoOnUsPorIdCartaoRequest dataHoraTerminal(String dataHoraTerminal) {
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
  public TransacaoOnUsPorIdCartaoRequest terminalRequisitante(String terminalRequisitante) {
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
  public TransacaoOnUsPorIdCartaoRequest numeroParcelas(Long numeroParcelas) {
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
    TransacaoOnUsPorIdCartaoRequest transacaoOnUsPorIdCartaoRequest = (TransacaoOnUsPorIdCartaoRequest) o;
    return Objects.equals(this.nsuOrigem, transacaoOnUsPorIdCartaoRequest.nsuOrigem) &&
        Objects.equals(this.codigoProcessamento, transacaoOnUsPorIdCartaoRequest.codigoProcessamento) &&
        Objects.equals(this.valorTransacao, transacaoOnUsPorIdCartaoRequest.valorTransacao) &&
        Objects.equals(this.numeroEstabelecimento, transacaoOnUsPorIdCartaoRequest.numeroEstabelecimento) &&
        Objects.equals(this.dataHoraTerminal, transacaoOnUsPorIdCartaoRequest.dataHoraTerminal) &&
        Objects.equals(this.terminalRequisitante, transacaoOnUsPorIdCartaoRequest.terminalRequisitante) &&
        Objects.equals(this.numeroParcelas, transacaoOnUsPorIdCartaoRequest.numeroParcelas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuOrigem, codigoProcessamento, valorTransacao, numeroEstabelecimento, dataHoraTerminal, terminalRequisitante, numeroParcelas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoOnUsPorIdCartaoRequest {\n");
    
    sb.append("    nsuOrigem: ").append(toIndentedString(nsuOrigem)).append("\n");
    sb.append("    codigoProcessamento: ").append(toIndentedString(codigoProcessamento)).append("\n");
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

