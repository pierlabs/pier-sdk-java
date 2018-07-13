package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{log_acesso_usuario_persistencia_descricao}}}
 **/

@ApiModel(description = "{{{log_acesso_usuario_persistencia_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LogAcessoUsuarioPersistencia   {
  
  private Long idUsuario = null;
  private String login = null;
  private String mensagem = null;
  private String versaoAPP = null;
  private String device = null;
  private Integer senhaOK = null;
  private Long tentativasIncorretas = null;
  private Long idPlataforma = null;


  public enum StatusEnum {
    SUCESSO("SUCESSO"),
    SENHA_INVALIDA("SENHA_INVALIDA"),
    BLOQUEDO("BLOQUEDO"),
    CADASTRADO("CADASTRADO"),
    SENHA_ALTERADO("SENHA_ALTERADO");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;

  
  /**
   * {{{log_acesso_usuario_persistencia_id_usuario_descricao}}}
   **/
  public LogAcessoUsuarioPersistencia idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{log_acesso_usuario_persistencia_id_usuario_descricao}}}")
  @JsonProperty("idUsuario")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_login_descricao}}}
   **/
  public LogAcessoUsuarioPersistencia login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{log_acesso_usuario_persistencia_login_descricao}}}")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_message_descricao}}}
   **/
  public LogAcessoUsuarioPersistencia mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{log_acesso_usuario_persistencia_message_descricao}}}")
  @JsonProperty("mensagem")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_versao_app_descricao}}}
   **/
  public LogAcessoUsuarioPersistencia versaoAPP(String versaoAPP) {
    this.versaoAPP = versaoAPP;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{log_acesso_usuario_persistencia_versao_app_descricao}}}")
  @JsonProperty("versaoAPP")
  public String getVersaoAPP() {
    return versaoAPP;
  }
  public void setVersaoAPP(String versaoAPP) {
    this.versaoAPP = versaoAPP;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_versao_app_descricao}}}
   **/
  public LogAcessoUsuarioPersistencia device(String device) {
    this.device = device;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{log_acesso_usuario_persistencia_versao_app_descricao}}}")
  @JsonProperty("device")
  public String getDevice() {
    return device;
  }
  public void setDevice(String device) {
    this.device = device;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_senha_ok_descricao}}}
   **/
  public LogAcessoUsuarioPersistencia senhaOK(Integer senhaOK) {
    this.senhaOK = senhaOK;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{log_acesso_usuario_persistencia_senha_ok_descricao}}}")
  @JsonProperty("senhaOK")
  public Integer getSenhaOK() {
    return senhaOK;
  }
  public void setSenhaOK(Integer senhaOK) {
    this.senhaOK = senhaOK;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_tentativas_incorretas_descricao}}}
   **/
  public LogAcessoUsuarioPersistencia tentativasIncorretas(Long tentativasIncorretas) {
    this.tentativasIncorretas = tentativasIncorretas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{log_acesso_usuario_persistencia_tentativas_incorretas_descricao}}}")
  @JsonProperty("tentativasIncorretas")
  public Long getTentativasIncorretas() {
    return tentativasIncorretas;
  }
  public void setTentativasIncorretas(Long tentativasIncorretas) {
    this.tentativasIncorretas = tentativasIncorretas;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_id_plataforma_descricao}}}
   **/
  public LogAcessoUsuarioPersistencia idPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{log_acesso_usuario_persistencia_id_plataforma_descricao}}}")
  @JsonProperty("idPlataforma")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_status_log_acesso}}}
   **/
  public LogAcessoUsuarioPersistencia status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{log_acesso_usuario_persistencia_status_log_acesso}}}")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogAcessoUsuarioPersistencia logAcessoUsuarioPersistencia = (LogAcessoUsuarioPersistencia) o;
    return Objects.equals(this.idUsuario, logAcessoUsuarioPersistencia.idUsuario) &&
        Objects.equals(this.login, logAcessoUsuarioPersistencia.login) &&
        Objects.equals(this.mensagem, logAcessoUsuarioPersistencia.mensagem) &&
        Objects.equals(this.versaoAPP, logAcessoUsuarioPersistencia.versaoAPP) &&
        Objects.equals(this.device, logAcessoUsuarioPersistencia.device) &&
        Objects.equals(this.senhaOK, logAcessoUsuarioPersistencia.senhaOK) &&
        Objects.equals(this.tentativasIncorretas, logAcessoUsuarioPersistencia.tentativasIncorretas) &&
        Objects.equals(this.idPlataforma, logAcessoUsuarioPersistencia.idPlataforma) &&
        Objects.equals(this.status, logAcessoUsuarioPersistencia.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUsuario, login, mensagem, versaoAPP, device, senhaOK, tentativasIncorretas, idPlataforma, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogAcessoUsuarioPersistencia {\n");
    
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
    sb.append("    versaoAPP: ").append(toIndentedString(versaoAPP)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    senhaOK: ").append(toIndentedString(senhaOK)).append("\n");
    sb.append("    tentativasIncorretas: ").append(toIndentedString(tentativasIncorretas)).append("\n");
    sb.append("    idPlataforma: ").append(toIndentedString(idPlataforma)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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



