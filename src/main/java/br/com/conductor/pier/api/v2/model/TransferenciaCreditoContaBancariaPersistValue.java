package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{transferencia_credito_conta_bancaria_persist_description}}}
 **/

@ApiModel(description = "{{{transferencia_credito_conta_bancaria_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransferenciaCreditoContaBancariaPersistValue   {
  
  private Long nsuOrigem = null;
  private Long idCartao = null;
  private Long idContaBancaria = null;
  private BigDecimal valor = null;
  private Long numeroParcelas = null;
  private Integer numeroMesesCarencia = null;
  private String dataHoraTerminal = null;
  private String terminalRequisitante = null;
  private String numeroEstabelecimento = null;

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_nsu_origem_value}}}
   **/
  public TransferenciaCreditoContaBancariaPersistValue nsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_credito_conta_bancaria_persist_nsu_origem_value}}}")
  @JsonProperty("nsuOrigem")
  public Long getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_id_cartao_value}}}
   **/
  public TransferenciaCreditoContaBancariaPersistValue idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_credito_conta_bancaria_persist_id_cartao_value}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_id_conta_bancaria_value}}}
   **/
  public TransferenciaCreditoContaBancariaPersistValue idContaBancaria(Long idContaBancaria) {
    this.idContaBancaria = idContaBancaria;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_credito_conta_bancaria_persist_id_conta_bancaria_value}}}")
  @JsonProperty("idContaBancaria")
  public Long getIdContaBancaria() {
    return idContaBancaria;
  }
  public void setIdContaBancaria(Long idContaBancaria) {
    this.idContaBancaria = idContaBancaria;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_valor_value}}}
   **/
  public TransferenciaCreditoContaBancariaPersistValue valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_credito_conta_bancaria_persist_valor_value}}}")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_numero_parcelas_value}}}
   **/
  public TransferenciaCreditoContaBancariaPersistValue numeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_credito_conta_bancaria_persist_numero_parcelas_value}}}")
  @JsonProperty("numeroParcelas")
  public Long getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_numero_meses_carencia_value}}}
   **/
  public TransferenciaCreditoContaBancariaPersistValue numeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_credito_conta_bancaria_persist_numero_meses_carencia_value}}}")
  @JsonProperty("numeroMesesCarencia")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_data_hora_terminal_value}}}
   **/
  public TransferenciaCreditoContaBancariaPersistValue dataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_credito_conta_bancaria_persist_data_hora_terminal_value}}}")
  @JsonProperty("dataHoraTerminal")
  public String getDataHoraTerminal() {
    return dataHoraTerminal;
  }
  public void setDataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_terminal_requisitante_value}}}
   **/
  public TransferenciaCreditoContaBancariaPersistValue terminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_credito_conta_bancaria_persist_terminal_requisitante_value}}}")
  @JsonProperty("terminalRequisitante")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_persist_numero_estabelecimento_value}}}
   **/
  public TransferenciaCreditoContaBancariaPersistValue numeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transferencia_credito_conta_bancaria_persist_numero_estabelecimento_value}}}")
  @JsonProperty("numeroEstabelecimento")
  public String getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(String numeroEstabelecimento) {
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
    TransferenciaCreditoContaBancariaPersistValue transferenciaCreditoContaBancariaPersistValue = (TransferenciaCreditoContaBancariaPersistValue) o;
    return Objects.equals(this.nsuOrigem, transferenciaCreditoContaBancariaPersistValue.nsuOrigem) &&
        Objects.equals(this.idCartao, transferenciaCreditoContaBancariaPersistValue.idCartao) &&
        Objects.equals(this.idContaBancaria, transferenciaCreditoContaBancariaPersistValue.idContaBancaria) &&
        Objects.equals(this.valor, transferenciaCreditoContaBancariaPersistValue.valor) &&
        Objects.equals(this.numeroParcelas, transferenciaCreditoContaBancariaPersistValue.numeroParcelas) &&
        Objects.equals(this.numeroMesesCarencia, transferenciaCreditoContaBancariaPersistValue.numeroMesesCarencia) &&
        Objects.equals(this.dataHoraTerminal, transferenciaCreditoContaBancariaPersistValue.dataHoraTerminal) &&
        Objects.equals(this.terminalRequisitante, transferenciaCreditoContaBancariaPersistValue.terminalRequisitante) &&
        Objects.equals(this.numeroEstabelecimento, transferenciaCreditoContaBancariaPersistValue.numeroEstabelecimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuOrigem, idCartao, idContaBancaria, valor, numeroParcelas, numeroMesesCarencia, dataHoraTerminal, terminalRequisitante, numeroEstabelecimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaCreditoContaBancariaPersistValue {\n");
    
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



