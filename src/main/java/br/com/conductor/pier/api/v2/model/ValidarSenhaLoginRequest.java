package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{validar_senha_login_request_description}}}
 **/

@ApiModel(description = "{{{validar_senha_login_request_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ValidarSenhaLoginRequest   {
  
  private Integer idPlataforma = null;

  
  /**
   * {{{validar_senha_login_request_id_plataforma_value}}}
   **/
  public ValidarSenhaLoginRequest idPlataforma(Integer idPlataforma) {
    this.idPlataforma = idPlataforma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{validar_senha_login_request_id_plataforma_value}}}")
  @JsonProperty("idPlataforma")
  public Integer getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Integer idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidarSenhaLoginRequest validarSenhaLoginRequest = (ValidarSenhaLoginRequest) o;
    return Objects.equals(this.idPlataforma, validarSenhaLoginRequest.idPlataforma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPlataforma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidarSenhaLoginRequest {\n");
    
    sb.append("    idPlataforma: ").append(toIndentedString(idPlataforma)).append("\n");
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

