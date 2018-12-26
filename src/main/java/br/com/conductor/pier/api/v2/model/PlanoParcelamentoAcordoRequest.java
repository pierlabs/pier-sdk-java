package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de requisi\u00E7\u00E3o para simula\u00E7\u00E3o de um acordo
 **/

@ApiModel(description = "Objeto de requisi\u00E7\u00E3o para simula\u00E7\u00E3o de um acordo")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoParcelamentoAcordoRequest   {
  
  private BigDecimal saldoDevedor = null;
  private Integer numeroParcelas = null;
  private Integer diasAtraso = null;

  
  /**
   * Saldo devedor
   **/
  public PlanoParcelamentoAcordoRequest saldoDevedor(BigDecimal saldoDevedor) {
    this.saldoDevedor = saldoDevedor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Saldo devedor")
  @JsonProperty("saldoDevedor")
  public BigDecimal getSaldoDevedor() {
    return saldoDevedor;
  }
  public void setSaldoDevedor(BigDecimal saldoDevedor) {
    this.saldoDevedor = saldoDevedor;
  }

  
  /**
   * N\u00FAmero de parcelas solicitadas para o acordo
   **/
  public PlanoParcelamentoAcordoRequest numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero de parcelas solicitadas para o acordo")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Dias de atraso da d\u00EDvida
   **/
  public PlanoParcelamentoAcordoRequest diasAtraso(Integer diasAtraso) {
    this.diasAtraso = diasAtraso;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Dias de atraso da d\u00EDvida")
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
    PlanoParcelamentoAcordoRequest planoParcelamentoAcordoRequest = (PlanoParcelamentoAcordoRequest) o;
    return Objects.equals(this.saldoDevedor, planoParcelamentoAcordoRequest.saldoDevedor) &&
        Objects.equals(this.numeroParcelas, planoParcelamentoAcordoRequest.numeroParcelas) &&
        Objects.equals(this.diasAtraso, planoParcelamentoAcordoRequest.diasAtraso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saldoDevedor, numeroParcelas, diasAtraso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoAcordoRequest {\n");
    
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

