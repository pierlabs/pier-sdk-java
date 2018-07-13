package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{controle_seguranca_dispositivo_resposta_descricao}}}
 **/

@ApiModel(description = "{{{controle_seguranca_dispositivo_resposta_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ControleSegurancaDispositivoResponse   {
  
  private Long id = null;
  private Long idUsuario = null;
  private String phoneId = null;

  
  /**
   * {{{controle_seguranca_dispositivo_resposta_id_descricao}}}
   **/
  public ControleSegurancaDispositivoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{controle_seguranca_dispositivo_resposta_id_descricao}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{controle_seguranca_dispositivo_resposta_id_usuario_descricao}}}
   **/
  public ControleSegurancaDispositivoResponse idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{controle_seguranca_dispositivo_resposta_id_usuario_descricao}}}")
  @JsonProperty("idUsuario")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * {{{controle_seguranca_dispositivo_resposta_phone_id_descricao}}}
   **/
  public ControleSegurancaDispositivoResponse phoneId(String phoneId) {
    this.phoneId = phoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{controle_seguranca_dispositivo_resposta_phone_id_descricao}}}")
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



