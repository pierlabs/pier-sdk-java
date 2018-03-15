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
public class CodigoSegurancaSMSRequest   {
  
  private String ddd = null;
  private String telefone = null;
  private String codigoSeguranca = null;

  
  /**
   * C\u00F3digo DDD do telefone (id).
   **/
  public CodigoSegurancaSMSRequest ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo DDD do telefone (id).")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * N\u00FAmero do telefone.
   **/
  public CodigoSegurancaSMSRequest telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do telefone.")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * Token para valida\u00E7\u00E3o.
   **/
  public CodigoSegurancaSMSRequest codigoSeguranca(String codigoSeguranca) {
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
    CodigoSegurancaSMSRequest codigoSegurancaSMSRequest = (CodigoSegurancaSMSRequest) o;
    return Objects.equals(this.ddd, codigoSegurancaSMSRequest.ddd) &&
        Objects.equals(this.telefone, codigoSegurancaSMSRequest.telefone) &&
        Objects.equals(this.codigoSeguranca, codigoSegurancaSMSRequest.codigoSeguranca);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddd, telefone, codigoSeguranca);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoSegurancaSMSRequest {\n");
    
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
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

