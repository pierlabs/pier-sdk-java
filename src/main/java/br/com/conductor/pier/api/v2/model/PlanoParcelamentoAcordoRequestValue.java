package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{plano_parcelamento_acordo_request_description}}}
 **/

@ApiModel(description = "{{{plano_parcelamento_acordo_request_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoParcelamentoAcordoRequestValue   {
  
  private BigDecimal saldoDevedor = null;
  private Integer numeroParcelas = null;
  private Integer diasAtraso = null;

  
  /**
   * {{{plano_parcelamento_acordo_request_saldo_devedor_value}}}
   **/
  public PlanoParcelamentoAcordoRequestValue saldoDevedor(BigDecimal saldoDevedor) {
    this.saldoDevedor = saldoDevedor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{plano_parcelamento_acordo_request_saldo_devedor_value}}}")
  @JsonProperty("saldoDevedor")
  public BigDecimal getSaldoDevedor() {
    return saldoDevedor;
  }
  public void setSaldoDevedor(BigDecimal saldoDevedor) {
    this.saldoDevedor = saldoDevedor;
  }

  
  /**
   * {{{plano_parcelamento_acordo_request_numero_parcelas_value}}}
   **/
  public PlanoParcelamentoAcordoRequestValue numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{plano_parcelamento_acordo_request_numero_parcelas_value}}}")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{plano_parcelamento_acordo_request_dias_atraso_value}}}
   **/
  public PlanoParcelamentoAcordoRequestValue diasAtraso(Integer diasAtraso) {
    this.diasAtraso = diasAtraso;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{plano_parcelamento_acordo_request_dias_atraso_value}}}")
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
    PlanoParcelamentoAcordoRequestValue planoParcelamentoAcordoRequestValue = (PlanoParcelamentoAcordoRequestValue) o;
    return Objects.equals(this.saldoDevedor, planoParcelamentoAcordoRequestValue.saldoDevedor) &&
        Objects.equals(this.numeroParcelas, planoParcelamentoAcordoRequestValue.numeroParcelas) &&
        Objects.equals(this.diasAtraso, planoParcelamentoAcordoRequestValue.diasAtraso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saldoDevedor, numeroParcelas, diasAtraso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoAcordoRequestValue {\n");
    
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

