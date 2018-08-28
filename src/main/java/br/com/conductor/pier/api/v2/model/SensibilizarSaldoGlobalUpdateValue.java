package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{sensibilizar_saldo_global_update_description}}}
 **/

@ApiModel(description = "{{{sensibilizar_saldo_global_update_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class SensibilizarSaldoGlobalUpdateValue   {
  
  private BigDecimal valor = null;

  
  /**
   * {{{sensibilizar_saldo_global_update_valor_value}}}
   **/
  public SensibilizarSaldoGlobalUpdateValue valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{sensibilizar_saldo_global_update_valor_value}}}")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensibilizarSaldoGlobalUpdateValue sensibilizarSaldoGlobalUpdateValue = (SensibilizarSaldoGlobalUpdateValue) o;
    return Objects.equals(this.valor, sensibilizarSaldoGlobalUpdateValue.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensibilizarSaldoGlobalUpdateValue {\n");
    
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

