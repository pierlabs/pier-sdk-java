package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Object of request for simulation of an agreement
 **/

@ApiModel(description = "Object of request for simulation of an agreement")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanInstallmentAgreementRequest   {
  
  private BigDecimal saldoDevedor = null;
  private Integer numeroParcelas = null;
  private Integer diasAtraso = null;

  
  /**
   * Debtor balance
   **/
  public PlanInstallmentAgreementRequest saldoDevedor(BigDecimal saldoDevedor) {
    this.saldoDevedor = saldoDevedor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Debtor balance")
  @JsonProperty("saldoDevedor")
  public BigDecimal getSaldoDevedor() {
    return saldoDevedor;
  }
  public void setSaldoDevedor(BigDecimal saldoDevedor) {
    this.saldoDevedor = saldoDevedor;
  }

  
  /**
   * Number of parcels requested for the agreement
   **/
  public PlanInstallmentAgreementRequest numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of parcels requested for the agreement")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Days of delay of debt
   **/
  public PlanInstallmentAgreementRequest diasAtraso(Integer diasAtraso) {
    this.diasAtraso = diasAtraso;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Days of delay of debt")
  @JsonProperty("diasAtraso")
  public Integer getDiasAtraso() {
    return diasAtraso;
  }
  public void setDiasAtraso(Integer diasAtraso) {
    this.diasAtraso = diasAtraso;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanInstallmentAgreementRequest planInstallmentAgreementRequest = (PlanInstallmentAgreementRequest) o;
    return Objects.equals(this.saldoDevedor, planInstallmentAgreementRequest.saldoDevedor) &&
        Objects.equals(this.numeroParcelas, planInstallmentAgreementRequest.numeroParcelas) &&
        Objects.equals(this.diasAtraso, planInstallmentAgreementRequest.diasAtraso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saldoDevedor, numeroParcelas, diasAtraso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanInstallmentAgreementRequest {\n");
    
    sb.append("    saldoDevedor: ").append(toIndentedString(saldoDevedor)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    diasAtraso: ").append(toIndentedString(diasAtraso)).append("\n");
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

