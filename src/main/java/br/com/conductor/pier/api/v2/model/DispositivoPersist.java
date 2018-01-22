package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Dispositivo
 **/

@ApiModel(description = "Objeto Dispositivo")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DispositivoPersist   {
  
  private String token = null;
  private Long idAplicacaoMobile = null;
  private Long idUsuario = null;

  
  /**
   * Apresenta o token do dispositivo.
   **/
  public DispositivoPersist token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o token do dispositivo.")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Apresenta o identificador da aplica\u00C3\u00A7\u00C3\u00A3o.
   **/
  public DispositivoPersist idAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o identificador da aplica\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("idAplicacaoMobile")
  public Long getIdAplicacaoMobile() {
    return idAplicacaoMobile;
  }
  public void setIdAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
  }

  
  /**
   * Apresenta o identificador do usu\u00C3\u00A1rio.
   **/
  public DispositivoPersist idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o identificador do usu\u00C3\u00A1rio.")
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
    DispositivoPersist dispositivoPersist = (DispositivoPersist) o;
    return Objects.equals(this.token, dispositivoPersist.token) &&
        Objects.equals(this.idAplicacaoMobile, dispositivoPersist.idAplicacaoMobile) &&
        Objects.equals(this.idUsuario, dispositivoPersist.idUsuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, idAplicacaoMobile, idUsuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispositivoPersist {\n");
    
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

