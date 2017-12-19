package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * Transfer\u00C3\u00AAncia cr\u00C3\u00A9dito conta banc\u00C3\u00A1ria request
 **/

@ApiModel(description = "Transfer\u00C3\u00AAncia cr\u00C3\u00A9dito conta banc\u00C3\u00A1ria request")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoParcelamentoTransferenciaCreditoContaBancariaRequest   {
  
  private String nsuOrigem = null;
  private BigDecimal valorTransacao = null;
  private Long idCartao = null;
  private Long numeroMesesCarencia = null;
  private Long numeroEstabelecimento = null;
  private String dataHoraTerminal = null;
  private String terminalRequisitante = null;

  
  /**
   * N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema que a originou.
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaRequest nsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema que a originou.")
  @JsonProperty("nsuOrigem")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * Valor da transa\u00C3\u00A7\u00C3\u00A3o com duas casas decimais para os centavos.
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaRequest valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "0.0", required = true, value = "Valor da transa\u00C3\u00A7\u00C3\u00A3o com duas casas decimais para os centavos.")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o.
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaRequest idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o.")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Representa o N\u00C3\u00BAmero de Meses concedido como car\u00C3\u00AAncia.
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaRequest numeroMesesCarencia(Long numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Representa o N\u00C3\u00BAmero de Meses concedido como car\u00C3\u00AAncia.")
  @JsonProperty("numeroMesesCarencia")
  public Long getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Long numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * N\u00C3\u00BAmero do Estabelecimento (N\u00C3\u00BAmero+DV).
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaRequest numeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00C3\u00BAmero do Estabelecimento (N\u00C3\u00BAmero+DV).")
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
  public PlanoParcelamentoTransferenciaCreditoContaBancariaRequest dataHoraTerminal(String dataHoraTerminal) {
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
   * Apresenta a identifica\u00C3\u00A7\u00C3\u00A3o do terminal requisitante
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaRequest terminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a identifica\u00C3\u00A7\u00C3\u00A3o do terminal requisitante")
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
    PlanoParcelamentoTransferenciaCreditoContaBancariaRequest planoParcelamentoTransferenciaCreditoContaBancariaRequest = (PlanoParcelamentoTransferenciaCreditoContaBancariaRequest) o;
    return Objects.equals(this.nsuOrigem, planoParcelamentoTransferenciaCreditoContaBancariaRequest.nsuOrigem) &&
        Objects.equals(this.valorTransacao, planoParcelamentoTransferenciaCreditoContaBancariaRequest.valorTransacao) &&
        Objects.equals(this.idCartao, planoParcelamentoTransferenciaCreditoContaBancariaRequest.idCartao) &&
        Objects.equals(this.numeroMesesCarencia, planoParcelamentoTransferenciaCreditoContaBancariaRequest.numeroMesesCarencia) &&
        Objects.equals(this.numeroEstabelecimento, planoParcelamentoTransferenciaCreditoContaBancariaRequest.numeroEstabelecimento) &&
        Objects.equals(this.dataHoraTerminal, planoParcelamentoTransferenciaCreditoContaBancariaRequest.dataHoraTerminal) &&
        Objects.equals(this.terminalRequisitante, planoParcelamentoTransferenciaCreditoContaBancariaRequest.terminalRequisitante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuOrigem, valorTransacao, idCartao, numeroMesesCarencia, numeroEstabelecimento, dataHoraTerminal, terminalRequisitante);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoTransferenciaCreditoContaBancariaRequest {\n");
    
    sb.append("    nsuOrigem: ").append(toIndentedString(nsuOrigem)).append("\n");
    sb.append("    valorTransacao: ").append(toIndentedString(valorTransacao)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    numeroMesesCarencia: ").append(toIndentedString(numeroMesesCarencia)).append("\n");
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



