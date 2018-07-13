package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{controle_seguranca_dispositivo_update_descricao}}}
 **/

@ApiModel(description = "{{{controle_seguranca_dispositivo_update_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ControleSegurancaDispositivoUpdateValor   {
  
  private Long id = null;
  private Long idUsuario = null;
  private String phoneId = null;

  
  /**
   * {{{controle_seguranca_dispositivo_id_descricao}}}
   **/
  public ControleSegurancaDispositivoUpdateValor id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{controle_seguranca_dispositivo_id_descricao}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{controle_seguranca_dispositivo_id_usuario_descricao}}}
   **/
  public ControleSegurancaDispositivoUpdateValor idUsuario(Long idUsuario) {
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
  public ControleSegurancaDispositivoUpdateValor phoneId(String phoneId) {
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
    ControleSegurancaDispositivoUpdateValor controleSegurancaDispositivoUpdateValor = (ControleSegurancaDispositivoUpdateValor) o;
    return Objects.equals(this.id, controleSegurancaDispositivoUpdateValor.id) &&
        Objects.equals(this.idUsuario, controleSegurancaDispositivoUpdateValor.idUsuario) &&
        Objects.equals(this.phoneId, controleSegurancaDispositivoUpdateValor.phoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idUsuario, phoneId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleSegurancaDispositivoUpdateValor {\n");
    
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



