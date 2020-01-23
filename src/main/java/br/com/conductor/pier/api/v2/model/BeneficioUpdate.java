package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto para altera\u00E7\u00E3o do benef\u00EDcio
 **/

@ApiModel(description = "Objeto para altera\u00E7\u00E3o do benef\u00EDcio")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BeneficioUpdate   {
  
  private String numeroBeneficio = null;
  private Integer mesProvaVida = null;

  
  /**
   * N\u00FAmero do benef\u00EDcio
   **/
  public BeneficioUpdate numeroBeneficio(String numeroBeneficio) {
    this.numeroBeneficio = numeroBeneficio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do benef\u00EDcio")
  @JsonProperty("numeroBeneficio")
  public String getNumeroBeneficio() {
    return numeroBeneficio;
  }
  public void setNumeroBeneficio(String numeroBeneficio) {
    this.numeroBeneficio = numeroBeneficio;
  }

  
  /**
   * M\u00EAs de prova de vida do benefici\u00E1rio
   **/
  public BeneficioUpdate mesProvaVida(Integer mesProvaVida) {
    this.mesProvaVida = mesProvaVida;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "M\u00EAs de prova de vida do benefici\u00E1rio")
  @JsonProperty("mesProvaVida")
  public Integer getMesProvaVida() {
    return mesProvaVida;
  }
  public void setMesProvaVida(Integer mesProvaVida) {
    this.mesProvaVida = mesProvaVida;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeneficioUpdate beneficioUpdate = (BeneficioUpdate) o;
    return Objects.equals(this.numeroBeneficio, beneficioUpdate.numeroBeneficio) &&
        Objects.equals(this.mesProvaVida, beneficioUpdate.mesProvaVida);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroBeneficio, mesProvaVida);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeneficioUpdate {\n");
    
    sb.append("    numeroBeneficio: ").append(toIndentedString(numeroBeneficio)).append("\n");
    sb.append("    mesProvaVida: ").append(toIndentedString(mesProvaVida)).append("\n");
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

