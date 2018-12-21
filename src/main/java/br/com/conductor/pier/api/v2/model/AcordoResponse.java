package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Agreement Object
 **/

@ApiModel(description = "Agreement Object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AcordoResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Long statusAcordo = null;
  private BigDecimal valorAcordo = null;
  private String dataAcordo = null;
  private Integer quantidadeParcelas = null;
  private BigDecimal saldoAtualFinal = null;
  private Integer diasEmAtraso = null;

  
  /**
   * Identification Code of the agreement (id)
   **/
  public AcordoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the agreement (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the account
   **/
  public AcordoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the account")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Status of the agreement
   **/
  public AcordoResponse statusAcordo(Long statusAcordo) {
    this.statusAcordo = statusAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of the agreement")
  @JsonProperty("statusAcordo")
  public Long getStatusAcordo() {
    return statusAcordo;
  }
  public void setStatusAcordo(Long statusAcordo) {
    this.statusAcordo = statusAcordo;
  }

  
  /**
   * Value of the Agreement
   **/
  public AcordoResponse valorAcordo(BigDecimal valorAcordo) {
    this.valorAcordo = valorAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the Agreement")
  @JsonProperty("valorAcordo")
  public BigDecimal getValorAcordo() {
    return valorAcordo;
  }
  public void setValorAcordo(BigDecimal valorAcordo) {
    this.valorAcordo = valorAcordo;
  }

  
  /**
   * Date and time of the agreement
   **/
  public AcordoResponse dataAcordo(String dataAcordo) {
    this.dataAcordo = dataAcordo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time of the agreement")
  @JsonProperty("dataAcordo")
  public String getDataAcordo() {
    return dataAcordo;
  }
  public void setDataAcordo(String dataAcordo) {
    this.dataAcordo = dataAcordo;
  }

  
  /**
   * Quantity of parcels of the agreement
   **/
  public AcordoResponse quantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantity of parcels of the agreement")
  @JsonProperty("quantidadeParcelas")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Current final balance
   **/
  public AcordoResponse saldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current final balance")
  @JsonProperty("saldoAtualFinal")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * Days in Arrears
   **/
  public AcordoResponse diasEmAtraso(Integer diasEmAtraso) {
    this.diasEmAtraso = diasEmAtraso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Days in Arrears")
  @JsonProperty("diasEmAtraso")
  public Integer getDiasEmAtraso() {
    return diasEmAtraso;
  }
  public void setDiasEmAtraso(Integer diasEmAtraso) {
    this.diasEmAtraso = diasEmAtraso;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcordoResponse acordoResponse = (AcordoResponse) o;
    return Objects.equals(this.id, acordoResponse.id) &&
        Objects.equals(this.idConta, acordoResponse.idConta) &&
        Objects.equals(this.statusAcordo, acordoResponse.statusAcordo) &&
        Objects.equals(this.valorAcordo, acordoResponse.valorAcordo) &&
        Objects.equals(this.dataAcordo, acordoResponse.dataAcordo) &&
        Objects.equals(this.quantidadeParcelas, acordoResponse.quantidadeParcelas) &&
        Objects.equals(this.saldoAtualFinal, acordoResponse.saldoAtualFinal) &&
        Objects.equals(this.diasEmAtraso, acordoResponse.diasEmAtraso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, statusAcordo, valorAcordo, dataAcordo, quantidadeParcelas, saldoAtualFinal, diasEmAtraso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    statusAcordo: ").append(toIndentedString(statusAcordo)).append("\n");
    sb.append("    valorAcordo: ").append(toIndentedString(valorAcordo)).append("\n");
    sb.append("    dataAcordo: ").append(toIndentedString(dataAcordo)).append("\n");
    sb.append("    quantidadeParcelas: ").append(toIndentedString(quantidadeParcelas)).append("\n");
    sb.append("    saldoAtualFinal: ").append(toIndentedString(saldoAtualFinal)).append("\n");
    sb.append("    diasEmAtraso: ").append(toIndentedString(diasEmAtraso)).append("\n");
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

