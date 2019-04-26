package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto log acesso usu\u00E1rio
 **/

@ApiModel(description = "Objeto log acesso usu\u00E1rio")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LogAcessoUsuarioPersist   {
  
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
   * C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id)
   **/
  public LogAcessoUsuarioPersist idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id)")
  @JsonProperty("idUsuario")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * Login do Usu\u00E1rio
   **/
  public LogAcessoUsuarioPersist login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Login do Usu\u00E1rio")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * Mensagem do log
   **/
  public LogAcessoUsuarioPersist mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mensagem do log")
  @JsonProperty("mensagem")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   * Vers\u00E2o do aplicativo
   **/
  public LogAcessoUsuarioPersist versaoAPP(String versaoAPP) {
    this.versaoAPP = versaoAPP;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Vers\u00E2o do aplicativo")
  @JsonProperty("versaoAPP")
  public String getVersaoAPP() {
    return versaoAPP;
  }
  public void setVersaoAPP(String versaoAPP) {
    this.versaoAPP = versaoAPP;
  }

  
  /**
   * Opera\u00E7\u00E3o do dispositivo
   **/
  public LogAcessoUsuarioPersist device(String device) {
    this.device = device;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Opera\u00E7\u00E3o do dispositivo")
  @JsonProperty("device")
  public String getDevice() {
    return device;
  }
  public void setDevice(String device) {
    this.device = device;
  }

  
  /**
   * Status da senha
   **/
  public LogAcessoUsuarioPersist senhaOK(Integer senhaOK) {
    this.senhaOK = senhaOK;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status da senha")
  @JsonProperty("senhaOK")
  public Integer getSenhaOK() {
    return senhaOK;
  }
  public void setSenhaOK(Integer senhaOK) {
    this.senhaOK = senhaOK;
  }

  
  /**
   * Quantidade de tentativas incorretas
   **/
  public LogAcessoUsuarioPersist tentativasIncorretas(Long tentativasIncorretas) {
    this.tentativasIncorretas = tentativasIncorretas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de tentativas incorretas")
  @JsonProperty("tentativasIncorretas")
  public Long getTentativasIncorretas() {
    return tentativasIncorretas;
  }
  public void setTentativasIncorretas(Long tentativasIncorretas) {
    this.tentativasIncorretas = tentativasIncorretas;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Plataforma (id)
   **/
  public LogAcessoUsuarioPersist idPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Plataforma (id)")
  @JsonProperty("idPlataforma")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  
  /**
   * Situa\u00E7\u00E3o do Log
   **/
  public LogAcessoUsuarioPersist status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Situa\u00E7\u00E3o do Log")
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
    LogAcessoUsuarioPersist logAcessoUsuarioPersist = (LogAcessoUsuarioPersist) o;
    return Objects.equals(this.idUsuario, logAcessoUsuarioPersist.idUsuario) &&
        Objects.equals(this.login, logAcessoUsuarioPersist.login) &&
        Objects.equals(this.mensagem, logAcessoUsuarioPersist.mensagem) &&
        Objects.equals(this.versaoAPP, logAcessoUsuarioPersist.versaoAPP) &&
        Objects.equals(this.device, logAcessoUsuarioPersist.device) &&
        Objects.equals(this.senhaOK, logAcessoUsuarioPersist.senhaOK) &&
        Objects.equals(this.tentativasIncorretas, logAcessoUsuarioPersist.tentativasIncorretas) &&
        Objects.equals(this.idPlataforma, logAcessoUsuarioPersist.idPlataforma) &&
        Objects.equals(this.status, logAcessoUsuarioPersist.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUsuario, login, mensagem, versaoAPP, device, senhaOK, tentativasIncorretas, idPlataforma, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogAcessoUsuarioPersist {\n");
    
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

