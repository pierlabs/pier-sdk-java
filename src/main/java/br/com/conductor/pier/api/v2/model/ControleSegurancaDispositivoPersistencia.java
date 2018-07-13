package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{controle_seguranca_dispositivo_persistencia_descricao}}}
 **/

@ApiModel(description = "{{{controle_seguranca_dispositivo_persistencia_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ControleSegurancaDispositivoPersistencia   {
  
  private Long idUsuario = null;
  private String phoneId = null;

  
  /**
   * {{{controle_seguranca_dispositivo_id_usuario_descricao}}}
   **/
  public ControleSegurancaDispositivoPersistencia idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{controle_seguranca_dispositivo_id_usuario_descricao}}}")
  @JsonProperty("idUsuario")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * {{{controle_seguranca_dispositivo_phone_id_descricao}}}
   **/
  public ControleSegurancaDispositivoPersistencia phoneId(String phoneId) {
    this.phoneId = phoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{controle_seguranca_dispositivo_phone_id_descricao}}}")
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
    ControleSegurancaDispositivoPersistencia controleSegurancaDispositivoPersistencia = (ControleSegurancaDispositivoPersistencia) o;
    return Objects.equals(this.idUsuario, controleSegurancaDispositivoPersistencia.idUsuario) &&
        Objects.equals(this.phoneId, controleSegurancaDispositivoPersistencia.phoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUsuario, phoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleSegurancaDispositivoPersistencia {\n");
    
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



