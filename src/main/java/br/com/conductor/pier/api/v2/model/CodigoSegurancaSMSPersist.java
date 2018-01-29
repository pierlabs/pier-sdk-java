package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da requisi\u00C3\u00A7\u00C3\u00A3o do recurso gerar c\u00C3\u00B3digo de seguran\u00C3\u00A7a.
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da requisi\u00C3\u00A7\u00C3\u00A3o do recurso gerar c\u00C3\u00B3digo de seguran\u00C3\u00A7a.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CodigoSegurancaSMSPersist   {
  
  private String ddd = null;
  private String telefone = null;

  
  /**
   * DDD do n\u00C3\u00BAmero de telefone para envio do sms.
   **/
  public CodigoSegurancaSMSPersist ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "DDD do n\u00C3\u00BAmero de telefone para envio do sms.")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * N\u00C3\u00BAmero do telefone para envio do sms.
   **/
  public CodigoSegurancaSMSPersist telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do telefone para envio do sms.")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodigoSegurancaSMSPersist codigoSegurancaSMSPersist = (CodigoSegurancaSMSPersist) o;
    return Objects.equals(this.ddd, codigoSegurancaSMSPersist.ddd) &&
        Objects.equals(this.telefone, codigoSegurancaSMSPersist.telefone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddd, telefone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoSegurancaSMSPersist {\n");
    
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
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

