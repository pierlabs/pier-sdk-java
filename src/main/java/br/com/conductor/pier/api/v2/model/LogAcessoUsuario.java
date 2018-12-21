package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Log user access object
 **/

@ApiModel(description = "Log user access object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LogAcessoUsuario   {
  
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
   * Unique user identifier (id)
   **/
  public LogAcessoUsuario idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique user identifier (id)")
  @JsonProperty("idUsuario")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * User login
   **/
  public LogAcessoUsuario login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User login")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * Log message
   **/
  public LogAcessoUsuario mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Log message")
  @JsonProperty("mensagem")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   * Application version
   **/
  public LogAcessoUsuario versaoAPP(String versaoAPP) {
    this.versaoAPP = versaoAPP;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Application version")
  @JsonProperty("versaoAPP")
  public String getVersaoAPP() {
    return versaoAPP;
  }
  public void setVersaoAPP(String versaoAPP) {
    this.versaoAPP = versaoAPP;
  }

  
  /**
   * Disposition operation
   **/
  public LogAcessoUsuario device(String device) {
    this.device = device;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Disposition operation")
  @JsonProperty("device")
  public String getDevice() {
    return device;
  }
  public void setDevice(String device) {
    this.device = device;
  }

  
  /**
   * Passaword status
   **/
  public LogAcessoUsuario senhaOK(Integer senhaOK) {
    this.senhaOK = senhaOK;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Passaword status")
  @JsonProperty("senhaOK")
  public Integer getSenhaOK() {
    return senhaOK;
  }
  public void setSenhaOK(Integer senhaOK) {
    this.senhaOK = senhaOK;
  }

  
  /**
   * Number of incorrect attemps
   **/
  public LogAcessoUsuario tentativasIncorretas(Long tentativasIncorretas) {
    this.tentativasIncorretas = tentativasIncorretas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of incorrect attemps")
  @JsonProperty("tentativasIncorretas")
  public Long getTentativasIncorretas() {
    return tentativasIncorretas;
  }
  public void setTentativasIncorretas(Long tentativasIncorretas) {
    this.tentativasIncorretas = tentativasIncorretas;
  }

  
  /**
   * Unique platform identifier (id)
   **/
  public LogAcessoUsuario idPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique platform identifier (id)")
  @JsonProperty("idPlataforma")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  
  /**
   * User status
   **/
  public LogAcessoUsuario status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User status")
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
    LogAcessoUsuario logAcessoUsuario = (LogAcessoUsuario) o;
    return Objects.equals(this.idUsuario, logAcessoUsuario.idUsuario) &&
        Objects.equals(this.login, logAcessoUsuario.login) &&
        Objects.equals(this.mensagem, logAcessoUsuario.mensagem) &&
        Objects.equals(this.versaoAPP, logAcessoUsuario.versaoAPP) &&
        Objects.equals(this.device, logAcessoUsuario.device) &&
        Objects.equals(this.senhaOK, logAcessoUsuario.senhaOK) &&
        Objects.equals(this.tentativasIncorretas, logAcessoUsuario.tentativasIncorretas) &&
        Objects.equals(this.idPlataforma, logAcessoUsuario.idPlataforma) &&
        Objects.equals(this.status, logAcessoUsuario.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUsuario, login, mensagem, versaoAPP, device, senhaOK, tentativasIncorretas, idPlataforma, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogAcessoUsuario {\n");
    
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

