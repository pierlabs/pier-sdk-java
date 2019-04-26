package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Configura\u00E7\u00E3o SMS
 **/

@ApiModel(description = "Objeto Configura\u00E7\u00E3o SMS")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConfiguracaoSMSResponse   {
  
  private Long id = null;
  private Long idEmissor = null;
  private String usuarioSMS = null;
  private String senhaSMS = null;

  
  /**
   * Id Configura\u00E7\u00E3o SMS
   **/
  public ConfiguracaoSMSResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id Configura\u00E7\u00E3o SMS")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Id emissor
   **/
  public ConfiguracaoSMSResponse idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id emissor")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * Usuario SMS
   **/
  public ConfiguracaoSMSResponse usuarioSMS(String usuarioSMS) {
    this.usuarioSMS = usuarioSMS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Usuario SMS")
  @JsonProperty("usuarioSMS")
  public String getUsuarioSMS() {
    return usuarioSMS;
  }
  public void setUsuarioSMS(String usuarioSMS) {
    this.usuarioSMS = usuarioSMS;
  }

  
  /**
   * Senha SMS
   **/
  public ConfiguracaoSMSResponse senhaSMS(String senhaSMS) {
    this.senhaSMS = senhaSMS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Senha SMS")
  @JsonProperty("senhaSMS")
  public String getSenhaSMS() {
    return senhaSMS;
  }
  public void setSenhaSMS(String senhaSMS) {
    this.senhaSMS = senhaSMS;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfiguracaoSMSResponse configuracaoSMSResponse = (ConfiguracaoSMSResponse) o;
    return Objects.equals(this.id, configuracaoSMSResponse.id) &&
        Objects.equals(this.idEmissor, configuracaoSMSResponse.idEmissor) &&
        Objects.equals(this.usuarioSMS, configuracaoSMSResponse.usuarioSMS) &&
        Objects.equals(this.senhaSMS, configuracaoSMSResponse.senhaSMS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idEmissor, usuarioSMS, senhaSMS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoSMSResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    usuarioSMS: ").append(toIndentedString(usuarioSMS)).append("\n");
    sb.append("    senhaSMS: ").append(toIndentedString(senhaSMS)).append("\n");
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

