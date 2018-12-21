package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * List of credit transfer to other banking accounts
 **/

@ApiModel(description = "List of credit transfer to other banking accounts")
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
   * Identification code of the transfer
   **/
  public TransferenciaCreditoContaBancariaListaResponse idTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification code of the transfer")
  @JsonProperty("idTransferencia")
  public Long getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  
  /**
   * Identification Code of the Account
   **/
  public TransferenciaCreditoContaBancariaListaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Account")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the Card
   **/
  public TransferenciaCreditoContaBancariaListaResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Card")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Value of the transfer
   **/
  public TransferenciaCreditoContaBancariaListaResponse valorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the transfer")
  @JsonProperty("valorCompra")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * Transfer value added to the withdrawal rate value if there is withdrawal rate
   **/
  public TransferenciaCreditoContaBancariaListaResponse valorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Transfer value added to the withdrawal rate value if there is withdrawal rate")
  @JsonProperty("valorContrato")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * Date of the transfer
   **/
  public TransferenciaCreditoContaBancariaListaResponse dataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of the transfer")
  @JsonProperty("dataCompra")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Processing Status Code
   **/
  public TransferenciaCreditoContaBancariaListaResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Processing Status Code")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Processing Status
   **/
  public TransferenciaCreditoContaBancariaListaResponse statusProcessamento(String statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Processing Status")
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

