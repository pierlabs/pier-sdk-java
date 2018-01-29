package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Listagem de Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias
 **/

@ApiModel(description = "Listagem de Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransferenciaCreditoContaBancariaListaResponse   {
  
  private Long idTransferencia = null;
  private BigDecimal valorCompra = null;
  private BigDecimal valorContrato = null;
  private String dataCompra = null;
  private String statusProcessamento = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transferencia.
   **/
  public TransferenciaCreditoContaBancariaListaResponse idTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transferencia.")
  @JsonProperty("idTransferencia")
  public Long getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  
  /**
   * Valor da transfer\u00C3\u00AAncia.
   **/
  public TransferenciaCreditoContaBancariaListaResponse valorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da transfer\u00C3\u00AAncia.")
  @JsonProperty("valorCompra")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * Valor da transfer\u00C3\u00AAncia acrescido do valor da tarifa de saque se houver tarifa de saque.
   **/
  public TransferenciaCreditoContaBancariaListaResponse valorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da transfer\u00C3\u00AAncia acrescido do valor da tarifa de saque se houver tarifa de saque.")
  @JsonProperty("valorContrato")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * Data da transfer\u00C3\u00AAncia.
   **/
  public TransferenciaCreditoContaBancariaListaResponse dataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da transfer\u00C3\u00AAncia.")
  @JsonProperty("dataCompra")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Status Processamento.
   **/
  public TransferenciaCreditoContaBancariaListaResponse statusProcessamento(String statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status Processamento.")
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
        Objects.equals(this.valorCompra, transferenciaCreditoContaBancariaListaResponse.valorCompra) &&
        Objects.equals(this.valorContrato, transferenciaCreditoContaBancariaListaResponse.valorContrato) &&
        Objects.equals(this.dataCompra, transferenciaCreditoContaBancariaListaResponse.dataCompra) &&
        Objects.equals(this.statusProcessamento, transferenciaCreditoContaBancariaListaResponse.statusProcessamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTransferencia, valorCompra, valorContrato, dataCompra, statusProcessamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaCreditoContaBancariaListaResponse {\n");
    
    sb.append("    idTransferencia: ").append(toIndentedString(idTransferencia)).append("\n");
    sb.append("    valorCompra: ").append(toIndentedString(valorCompra)).append("\n");
    sb.append("    valorContrato: ").append(toIndentedString(valorContrato)).append("\n");
    sb.append("    dataCompra: ").append(toIndentedString(dataCompra)).append("\n");
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

