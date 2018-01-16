package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para conta banc\u00C3\u00A1ria
 **/

@ApiModel(description = "Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para conta banc\u00C3\u00A1ria")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransferenciaCreditoContaBancariaPersist   {
  
  private Long nsuOrigem = null;
  private Long idCartao = null;
  private Long idContaBancaria = null;
  private BigDecimal valor = null;
  private Long numeroParcelas = null;
  private Integer numeroMesesCarencia = null;
  private String dataHoraTerminal = null;
  private String terminalRequisitante = null;
  private Long numeroEstabelecimento = null;

  
  /**
   * Representa o N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema que a originou.
   **/
  public TransferenciaCreditoContaBancariaPersist nsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Representa o N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema que a originou.")
  @JsonProperty("nsuOrigem")
  public Long getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * Representa o Identificador do Cartao.
   **/
  public TransferenciaCreditoContaBancariaPersist idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Representa o Identificador do Cartao.")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Representa o Identificador da conta banc\u00C3\u00A1ria.
   **/
  public TransferenciaCreditoContaBancariaPersist idContaBancaria(Long idContaBancaria) {
    this.idContaBancaria = idContaBancaria;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Representa o Identificador da conta banc\u00C3\u00A1ria.")
  @JsonProperty("idContaBancaria")
  public Long getIdContaBancaria() {
    return idContaBancaria;
  }
  public void setIdContaBancaria(Long idContaBancaria) {
    this.idContaBancaria = idContaBancaria;
  }

  
  /**
   * Representa o Valor da transfer\u00C3\u00AAncia.
   **/
  public TransferenciaCreditoContaBancariaPersist valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Representa o Valor da transfer\u00C3\u00AAncia.")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Representa o N\u00C3\u00BAmero de Parcelas pelo qual o valor da transfer\u00C3\u00AAncia ser\u00C3\u00A1 dividido.
   **/
  public TransferenciaCreditoContaBancariaPersist numeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Representa o N\u00C3\u00BAmero de Parcelas pelo qual o valor da transfer\u00C3\u00AAncia ser\u00C3\u00A1 dividido.")
  @JsonProperty("numeroParcelas")
  public Long getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Representa o N\u00C3\u00BAmero de Meses concedido como car\u00C3\u00AAncia.
   **/
  public TransferenciaCreditoContaBancariaPersist numeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Representa o N\u00C3\u00BAmero de Meses concedido como car\u00C3\u00AAncia.")
  @JsonProperty("numeroMesesCarencia")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * Representa a Data e hora do terminal requisitante.
   **/
  public TransferenciaCreditoContaBancariaPersist dataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Representa a Data e hora do terminal requisitante.")
  @JsonProperty("dataHoraTerminal")
  public String getDataHoraTerminal() {
    return dataHoraTerminal;
  }
  public void setDataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
  }

  
  /**
   * Representa a identifica\u00C3\u00A7\u00C3\u00A3o do terminal requisitante.
   **/
  public TransferenciaCreditoContaBancariaPersist terminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Representa a identifica\u00C3\u00A7\u00C3\u00A3o do terminal requisitante.")
  @JsonProperty("terminalRequisitante")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * Representa a identifica\u00C3\u00A7\u00C3\u00A3o do n\u00C3\u00BAmero do estabelecimento.
   **/
  public TransferenciaCreditoContaBancariaPersist numeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Representa a identifica\u00C3\u00A7\u00C3\u00A3o do n\u00C3\u00BAmero do estabelecimento.")
  @JsonProperty("numeroEstabelecimento")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
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
    TransferenciaCreditoContaBancariaPersist transferenciaCreditoContaBancariaPersist = (TransferenciaCreditoContaBancariaPersist) o;
    return Objects.equals(this.nsuOrigem, transferenciaCreditoContaBancariaPersist.nsuOrigem) &&
        Objects.equals(this.idCartao, transferenciaCreditoContaBancariaPersist.idCartao) &&
        Objects.equals(this.idContaBancaria, transferenciaCreditoContaBancariaPersist.idContaBancaria) &&
        Objects.equals(this.valor, transferenciaCreditoContaBancariaPersist.valor) &&
        Objects.equals(this.numeroParcelas, transferenciaCreditoContaBancariaPersist.numeroParcelas) &&
        Objects.equals(this.numeroMesesCarencia, transferenciaCreditoContaBancariaPersist.numeroMesesCarencia) &&
        Objects.equals(this.dataHoraTerminal, transferenciaCreditoContaBancariaPersist.dataHoraTerminal) &&
        Objects.equals(this.terminalRequisitante, transferenciaCreditoContaBancariaPersist.terminalRequisitante) &&
        Objects.equals(this.numeroEstabelecimento, transferenciaCreditoContaBancariaPersist.numeroEstabelecimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuOrigem, idCartao, idContaBancaria, valor, numeroParcelas, numeroMesesCarencia, dataHoraTerminal, terminalRequisitante, numeroEstabelecimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaCreditoContaBancariaPersist {\n");
    
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



