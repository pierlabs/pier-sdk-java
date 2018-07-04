package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{transferencia_credito_conta_bancaria_lista_response_description}}}
 **/

@ApiModel(description = "{{{transferencia_credito_conta_bancaria_lista_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransferenciaCreditoContaBancariaListaResponse   {
  
  private Long idTransferencia = null;
  private Long idConta = null;
  private Long idCartao = null;
  private BigDecimal valorCompra = null;
  private BigDecimal valorContrato = null;
  private String dataCompra = null;
  private Integer status = null;
  private String statusProcessamento = null;

  
  /**
   * {{{transferencia_credito_conta_bancaria_lista_response_id_transferencia_value}}}
   **/
  public TransferenciaCreditoContaBancariaListaResponse idTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_credito_conta_bancaria_lista_response_id_transferencia_value}}}")
  @JsonProperty("idTransferencia")
  public Long getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_lista_response_id_conta_value}}}
   **/
  public TransferenciaCreditoContaBancariaListaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_credito_conta_bancaria_lista_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_lista_response_id_cartao_value}}}
   **/
  public TransferenciaCreditoContaBancariaListaResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_credito_conta_bancaria_lista_response_id_cartao_value}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_lista_response_valor_compra_value}}}
   **/
  public TransferenciaCreditoContaBancariaListaResponse valorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_credito_conta_bancaria_lista_response_valor_compra_value}}}")
  @JsonProperty("valorCompra")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_lista_response_valor_contrato_value}}}
   **/
  public TransferenciaCreditoContaBancariaListaResponse valorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_credito_conta_bancaria_lista_response_valor_contrato_value}}}")
  @JsonProperty("valorContrato")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_lista_response_data_compra_value}}}
   **/
  public TransferenciaCreditoContaBancariaListaResponse dataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_credito_conta_bancaria_lista_response_data_compra_value}}}")
  @JsonProperty("dataCompra")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_lista_response_status_value}}}
   **/
  public TransferenciaCreditoContaBancariaListaResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_credito_conta_bancaria_lista_response_status_value}}}")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_lista_response_status_processamento_value}}}
   **/
  public TransferenciaCreditoContaBancariaListaResponse statusProcessamento(String statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_credito_conta_bancaria_lista_response_status_processamento_value}}}")
  @JsonProperty("statusProcessamento")
  public String getStatusProcessamento() {
    return statusProcessamento;
  }
  public void setStatusProcessamento(String statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferenciaCreditoContaBancariaListaResponse transferenciaCreditoContaBancariaListaResponse = (TransferenciaCreditoContaBancariaListaResponse) o;
    return Objects.equals(this.idTransferencia, transferenciaCreditoContaBancariaListaResponse.idTransferencia) &&
        Objects.equals(this.idConta, transferenciaCreditoContaBancariaListaResponse.idConta) &&
        Objects.equals(this.idCartao, transferenciaCreditoContaBancariaListaResponse.idCartao) &&
        Objects.equals(this.valorCompra, transferenciaCreditoContaBancariaListaResponse.valorCompra) &&
        Objects.equals(this.valorContrato, transferenciaCreditoContaBancariaListaResponse.valorContrato) &&
        Objects.equals(this.dataCompra, transferenciaCreditoContaBancariaListaResponse.dataCompra) &&
        Objects.equals(this.status, transferenciaCreditoContaBancariaListaResponse.status) &&
        Objects.equals(this.statusProcessamento, transferenciaCreditoContaBancariaListaResponse.statusProcessamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTransferencia, idConta, idCartao, valorCompra, valorContrato, dataCompra, status, statusProcessamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaCreditoContaBancariaListaResponse {\n");
    
    sb.append("    idTransferencia: ").append(toIndentedString(idTransferencia)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    valorCompra: ").append(toIndentedString(valorCompra)).append("\n");
    sb.append("    valorContrato: ").append(toIndentedString(valorContrato)).append("\n");
    sb.append("    dataCompra: ").append(toIndentedString(dataCompra)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusProcessamento: ").append(toIndentedString(statusProcessamento)).append("\n");
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



