package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o do recurso validar c\u00F3digo de seguran\u00E7a.
 **/

@ApiModel(description = "Representa\u00E7\u00E3o do recurso validar c\u00F3digo de seguran\u00E7a.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CodigoSegurancaEMAILPersist   {
  
  private String email = null;
  private String codigoSeguranca = null;

  
  /**
   * E-mail usado para envio do c\u00F3digo de seguran\u00E7a.
   **/
  public CodigoSegurancaEMAILPersist email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "E-mail usado para envio do c\u00F3digo de seguran\u00E7a.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Token para valida\u00E7\u00E3o.
   **/
  public CodigoSegurancaEMAILPersist codigoSeguranca(String codigoSeguranca) {
    this.codigoSeguranca = codigoSeguranca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Token para valida\u00E7\u00E3o.")
  @JsonProperty("codigoSeguranca")
  public String getCodigoSeguranca() {
    return codigoSeguranca;
  }
  public void setCodigoSeguranca(String codigoSeguranca) {
    this.codigoSeguranca = codigoSeguranca;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodigoSegurancaEMAILPersist codigoSegurancaEMAILPersist = (CodigoSegurancaEMAILPersist) o;
    return Objects.equals(this.email, codigoSegurancaEMAILPersist.email) &&
        Objects.equals(this.codigoSeguranca, codigoSegurancaEMAILPersist.codigoSeguranca);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, codigoSeguranca);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoSegurancaEMAILPersist {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    codigoSeguranca: ").append(toIndentedString(codigoSeguranca)).append("\n");
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

