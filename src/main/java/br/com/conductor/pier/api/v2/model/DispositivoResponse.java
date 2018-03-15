package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Dispositivo Mobile
 **/

@ApiModel(description = "Dispositivo Mobile")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DispositivoResponse   {
  
  private Long id = null;
  private String token = null;
  private Long idAplicacaoMobile = null;
  private Long idUsuario = null;

  
  /**
   * Identificador do dispositivo.
   **/
  public DispositivoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do dispositivo.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Token do dispositivo.
   **/
  public DispositivoResponse token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Token do dispositivo.")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Identificador da Aplica\u00E7\u00E3o.
   **/
  public DispositivoResponse idAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da Aplica\u00E7\u00E3o.")
  @JsonProperty("idAplicacaoMobile")
  public Long getIdAplicacaoMobile() {
    return idAplicacaoMobile;
  }
  public void setIdAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
  }

  
  /**
   * Identificador do usu\u00E1rio.
   **/
  public DispositivoResponse idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do usu\u00E1rio.")
  @JsonProperty("idUsuario")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispositivoResponse dispositivoResponse = (DispositivoResponse) o;
    return Objects.equals(this.id, dispositivoResponse.id) &&
        Objects.equals(this.token, dispositivoResponse.token) &&
        Objects.equals(this.idAplicacaoMobile, dispositivoResponse.idAplicacaoMobile) &&
        Objects.equals(this.idUsuario, dispositivoResponse.idUsuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, token, idAplicacaoMobile, idUsuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispositivoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    idAplicacaoMobile: ").append(toIndentedString(idAplicacaoMobile)).append("\n");
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
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

