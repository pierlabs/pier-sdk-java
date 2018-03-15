package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o do recurso de atualiza\u00E7\u00E3o de chave
 **/

@ApiModel(description = "Representa\u00E7\u00E3o do recurso de atualiza\u00E7\u00E3o de chave")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoPayKeyUpdate   {
  
  private String chaveCriptograma = null;

  
  /**
   * Chave de gera\u00E7\u00E3o de transa\u00E7\u00E3o criptografada
   **/
  public CartaoPayKeyUpdate chaveCriptograma(String chaveCriptograma) {
    this.chaveCriptograma = chaveCriptograma;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Chave de gera\u00E7\u00E3o de transa\u00E7\u00E3o criptografada")
  @JsonProperty("chaveCriptograma")
  public String getChaveCriptograma() {
    return chaveCriptograma;
  }
  public void setChaveCriptograma(String chaveCriptograma) {
    this.chaveCriptograma = chaveCriptograma;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoPayKeyUpdate cartaoPayKeyUpdate = (CartaoPayKeyUpdate) o;
    return Objects.equals(this.chaveCriptograma, cartaoPayKeyUpdate.chaveCriptograma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chaveCriptograma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoPayKeyUpdate {\n");
    
    sb.append("    chaveCriptograma: ").append(toIndentedString(chaveCriptograma)).append("\n");
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

