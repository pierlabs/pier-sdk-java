package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o da resposta do dispositivo do usu\u00E1rio
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta do dispositivo do usu\u00E1rio")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ControleSegurancaDispositivoResponse   {
  
  private Long id = null;
  private Long idUsuario = null;
  private String phoneId = null;

  
  /**
   * Identificador do registro do dispositivo do usu\u00E1rio
   **/
  public ControleSegurancaDispositivoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do registro do dispositivo do usu\u00E1rio")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador do usu\u00E1rio
   **/
  public ControleSegurancaDispositivoResponse idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do usu\u00E1rio")
  @JsonProperty("idUsuario")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * Identifica\u00E7\u00E3o do dispositivo do usu\u00E1rio (phoneId)
   **/
  public ControleSegurancaDispositivoResponse phoneId(String phoneId) {
    this.phoneId = phoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifica\u00E7\u00E3o do dispositivo do usu\u00E1rio (phoneId)")
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
    ControleSegurancaDispositivoResponse controleSegurancaDispositivoResponse = (ControleSegurancaDispositivoResponse) o;
    return Objects.equals(this.id, controleSegurancaDispositivoResponse.id) &&
        Objects.equals(this.idUsuario, controleSegurancaDispositivoResponse.idUsuario) &&
        Objects.equals(this.phoneId, controleSegurancaDispositivoResponse.phoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idUsuario, phoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleSegurancaDispositivoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

