package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto identificador do dispositivo do usu\u00E1rio
 **/

@ApiModel(description = "Objeto identificador do dispositivo do usu\u00E1rio")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UsuarioDispositivoPersist   {
  
  private Long idUsuario = null;
  private String phoneId = null;

  
  /**
   * C\u00F3digo identificador do usu\u00E1rio
   **/
  public UsuarioDispositivoPersist idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador do usu\u00E1rio")
  @JsonProperty("idUsuario")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * C\u00F3digo identificador do dispositivo do usu\u00E1rio
   **/
  public UsuarioDispositivoPersist phoneId(String phoneId) {
    this.phoneId = phoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador do dispositivo do usu\u00E1rio")
  @JsonProperty("phoneId")
  public String getPhoneId() {
    return phoneId;
  }
  public void setPhoneId(String phoneId) {
    this.phoneId = phoneId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsuarioDispositivoPersist usuarioDispositivoPersist = (UsuarioDispositivoPersist) o;
    return Objects.equals(this.idUsuario, usuarioDispositivoPersist.idUsuario) &&
        Objects.equals(this.phoneId, usuarioDispositivoPersist.phoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUsuario, phoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioDispositivoPersist {\n");
    
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    phoneId: ").append(toIndentedString(phoneId)).append("\n");
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

