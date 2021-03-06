package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto que representa a proposta
 **/

@ApiModel(description = "Objeto que representa a proposta")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PropostaParcialUpdate   {
  
  private Integer correspondencia = null;

  
  /**
   * C\u00F3digo identificador do endere\u00E7o de correspond\u00EAncia da proposta
   **/
  public PropostaParcialUpdate correspondencia(Integer correspondencia) {
    this.correspondencia = correspondencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do endere\u00E7o de correspond\u00EAncia da proposta")
  @JsonProperty("correspondencia")
  public Integer getCorrespondencia() {
    return correspondencia;
  }
  public void setCorrespondencia(Integer correspondencia) {
    this.correspondencia = correspondencia;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropostaParcialUpdate propostaParcialUpdate = (PropostaParcialUpdate) o;
    return Objects.equals(this.correspondencia, propostaParcialUpdate.correspondencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropostaParcialUpdate {\n");
    
    sb.append("    correspondencia: ").append(toIndentedString(correspondencia)).append("\n");
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

