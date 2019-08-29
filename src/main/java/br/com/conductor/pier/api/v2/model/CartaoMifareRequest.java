package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Request parameters related to mifare technology
 **/

@ApiModel(description = "Request parameters related to mifare technology")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoMifareRequest   {
  
  private Long idMifare = null;
  private String matriculaMifare = null;

  
  /**
   * C\u00F3digo identificador da tecnologia MIFARE
   **/
  public CartaoMifareRequest idMifare(Long idMifare) {
    this.idMifare = idMifare;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da tecnologia MIFARE")
  @JsonProperty("idMifare")
  public Long getIdMifare() {
    return idMifare;
  }
  public void setIdMifare(Long idMifare) {
    this.idMifare = idMifare;
  }

  
  /**
   * N\u00FAmero da matricula do portador
   **/
  public CartaoMifareRequest matriculaMifare(String matriculaMifare) {
    this.matriculaMifare = matriculaMifare;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da matricula do portador")
  @JsonProperty("matriculaMifare")
  public String getMatriculaMifare() {
    return matriculaMifare;
  }
  public void setMatriculaMifare(String matriculaMifare) {
    this.matriculaMifare = matriculaMifare;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoMifareRequest cartaoMifareRequest = (CartaoMifareRequest) o;
    return Objects.equals(this.idMifare, cartaoMifareRequest.idMifare) &&
        Objects.equals(this.matriculaMifare, cartaoMifareRequest.matriculaMifare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idMifare, matriculaMifare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoMifareRequest {\n");
    
    sb.append("    idMifare: ").append(toIndentedString(idMifare)).append("\n");
    sb.append("    matriculaMifare: ").append(toIndentedString(matriculaMifare)).append("\n");
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

