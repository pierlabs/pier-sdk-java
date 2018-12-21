package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{dispositivo_persist_description}}}
 **/

@ApiModel(description = "{{{dispositivo_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DispositivoPersistValue   {
  
  private String token = null;
  private Long idAplicacaoMobile = null;
  private Long idUsuario = null;

  
  /**
   * {{{dispositivo_persist_token_value}}}
   **/
  public DispositivoPersistValue token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dispositivo_persist_token_value}}}")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * {{{dispositivo_persist_id_aplicacao_mobile_value}}}
   **/
  public DispositivoPersistValue idAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dispositivo_persist_id_aplicacao_mobile_value}}}")
  @JsonProperty("idAplicacaoMobile")
  public Long getIdAplicacaoMobile() {
    return idAplicacaoMobile;
  }
  public void setIdAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
  }

  
  /**
   * {{{dispositivo_persist_id_usuario_value}}}
   **/
  public DispositivoPersistValue idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dispositivo_persist_id_usuario_value}}}")
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
    DispositivoPersistValue dispositivoPersistValue = (DispositivoPersistValue) o;
    return Objects.equals(this.token, dispositivoPersistValue.token) &&
        Objects.equals(this.idAplicacaoMobile, dispositivoPersistValue.idAplicacaoMobile) &&
        Objects.equals(this.idUsuario, dispositivoPersistValue.idUsuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, idAplicacaoMobile, idUsuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispositivoPersistValue {\n");
    
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

