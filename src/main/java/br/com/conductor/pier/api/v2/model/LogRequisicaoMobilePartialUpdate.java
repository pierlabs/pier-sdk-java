package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de atualiza\u00E7\u00E3o parcial de um log de requisi\u00E7\u00E3o mobile
 **/

@ApiModel(description = "Objeto de atualiza\u00E7\u00E3o parcial de um log de requisi\u00E7\u00E3o mobile")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LogRequisicaoMobilePartialUpdate   {
  
  private String metodo = null;
  private Long idRequisicao = null;
  private String login = null;
  private String cpf = null;
  private String appVersion = null;
  private String deviceId = null;
  private String phoneId = null;
  private Long idChave = null;
  private Long idPlataforma = null;
  private String userAgent = null;
  private String marcaCelular = null;
  private String modeloCelular = null;
  private String latitude = null;
  private String longitude = null;
  private Integer codigoRetorno = null;
  private Long idProposta = null;
  private Long idConta = null;
  private String informacaoAdicional = null;

  
  /**
   * M\u00E9todo onde o c\u00F3digo \u00E9 executado
   **/
  public LogRequisicaoMobilePartialUpdate metodo(String metodo) {
    this.metodo = metodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "M\u00E9todo onde o c\u00F3digo \u00E9 executado")
  @JsonProperty("metodo")
  public String getMetodo() {
    return metodo;
  }
  public void setMetodo(String metodo) {
    this.metodo = metodo;
  }

  
  /**
   * Identificador da requisi\u00E7\u00E3o
   **/
  public LogRequisicaoMobilePartialUpdate idRequisicao(Long idRequisicao) {
    this.idRequisicao = idRequisicao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da requisi\u00E7\u00E3o")
  @JsonProperty("idRequisicao")
  public Long getIdRequisicao() {
    return idRequisicao;
  }
  public void setIdRequisicao(Long idRequisicao) {
    this.idRequisicao = idRequisicao;
  }

  
  /**
   * Login do usu\u00E1rio
   **/
  public LogRequisicaoMobilePartialUpdate login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Login do usu\u00E1rio")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * N\u00FAmero do cpf do usu\u00E1rio
   **/
  public LogRequisicaoMobilePartialUpdate cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do cpf do usu\u00E1rio")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Vers\u00E3o da aplica\u00E7\u00E3o
   **/
  public LogRequisicaoMobilePartialUpdate appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Vers\u00E3o da aplica\u00E7\u00E3o")
  @JsonProperty("appVersion")
  public String getAppVersion() {
    return appVersion;
  }
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  
  /**
   * Identifica\u00E7\u00E3o do dispositivo
   **/
  public LogRequisicaoMobilePartialUpdate deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifica\u00E7\u00E3o do dispositivo")
  @JsonProperty("deviceId")
  public String getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  
  /**
   * Identifica\u00E7\u00E3o do mobile
   **/
  public LogRequisicaoMobilePartialUpdate phoneId(String phoneId) {
    this.phoneId = phoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifica\u00E7\u00E3o do mobile")
  @JsonProperty("phoneId")
  public String getPhoneId() {
    return phoneId;
  }
  public void setPhoneId(String phoneId) {
    this.phoneId = phoneId;
  }

  
  /**
   * Identifica\u00E7\u00E3o da chave
   **/
  public LogRequisicaoMobilePartialUpdate idChave(Long idChave) {
    this.idChave = idChave;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifica\u00E7\u00E3o da chave")
  @JsonProperty("idChave")
  public Long getIdChave() {
    return idChave;
  }
  public void setIdChave(Long idChave) {
    this.idChave = idChave;
  }

  
  /**
   * Identifica\u00E7\u00E3o da plataforma
   **/
  public LogRequisicaoMobilePartialUpdate idPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifica\u00E7\u00E3o da plataforma")
  @JsonProperty("idPlataforma")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  
  /**
   * Agente de usu\u00E1rio
   **/
  public LogRequisicaoMobilePartialUpdate userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agente de usu\u00E1rio")
  @JsonProperty("userAgent")
  public String getUserAgent() {
    return userAgent;
  }
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  
  /**
   * Marca do celular
   **/
  public LogRequisicaoMobilePartialUpdate marcaCelular(String marcaCelular) {
    this.marcaCelular = marcaCelular;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Marca do celular")
  @JsonProperty("marcaCelular")
  public String getMarcaCelular() {
    return marcaCelular;
  }
  public void setMarcaCelular(String marcaCelular) {
    this.marcaCelular = marcaCelular;
  }

  
  /**
   * Modelo do celular
   **/
  public LogRequisicaoMobilePartialUpdate modeloCelular(String modeloCelular) {
    this.modeloCelular = modeloCelular;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Modelo do celular")
  @JsonProperty("modeloCelular")
  public String getModeloCelular() {
    return modeloCelular;
  }
  public void setModeloCelular(String modeloCelular) {
    this.modeloCelular = modeloCelular;
  }

  
  /**
   * Latitude do celular acessado
   **/
  public LogRequisicaoMobilePartialUpdate latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Latitude do celular acessado")
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Longitude do celular acessado
   **/
  public LogRequisicaoMobilePartialUpdate longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Longitude do celular acessado")
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  /**
   * C\u00F3digo de retorno
   **/
  public LogRequisicaoMobilePartialUpdate codigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de retorno")
  @JsonProperty("codigoRetorno")
  public Integer getCodigoRetorno() {
    return codigoRetorno;
  }
  public void setCodigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
  }

  
  /**
   * Identifica\u00E7\u00E3o da proposta
   **/
  public LogRequisicaoMobilePartialUpdate idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifica\u00E7\u00E3o da proposta")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * Identifica\u00E7\u00E3o da conta
   **/
  public LogRequisicaoMobilePartialUpdate idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifica\u00E7\u00E3o da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Informa\u00E7\u00F5es complementares
   **/
  public LogRequisicaoMobilePartialUpdate informacaoAdicional(String informacaoAdicional) {
    this.informacaoAdicional = informacaoAdicional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Informa\u00E7\u00F5es complementares")
  @JsonProperty("informacaoAdicional")
  public String getInformacaoAdicional() {
    return informacaoAdicional;
  }
  public void setInformacaoAdicional(String informacaoAdicional) {
    this.informacaoAdicional = informacaoAdicional;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogRequisicaoMobilePartialUpdate logRequisicaoMobilePartialUpdate = (LogRequisicaoMobilePartialUpdate) o;
    return Objects.equals(this.metodo, logRequisicaoMobilePartialUpdate.metodo) &&
        Objects.equals(this.idRequisicao, logRequisicaoMobilePartialUpdate.idRequisicao) &&
        Objects.equals(this.login, logRequisicaoMobilePartialUpdate.login) &&
        Objects.equals(this.cpf, logRequisicaoMobilePartialUpdate.cpf) &&
        Objects.equals(this.appVersion, logRequisicaoMobilePartialUpdate.appVersion) &&
        Objects.equals(this.deviceId, logRequisicaoMobilePartialUpdate.deviceId) &&
        Objects.equals(this.phoneId, logRequisicaoMobilePartialUpdate.phoneId) &&
        Objects.equals(this.idChave, logRequisicaoMobilePartialUpdate.idChave) &&
        Objects.equals(this.idPlataforma, logRequisicaoMobilePartialUpdate.idPlataforma) &&
        Objects.equals(this.userAgent, logRequisicaoMobilePartialUpdate.userAgent) &&
        Objects.equals(this.marcaCelular, logRequisicaoMobilePartialUpdate.marcaCelular) &&
        Objects.equals(this.modeloCelular, logRequisicaoMobilePartialUpdate.modeloCelular) &&
        Objects.equals(this.latitude, logRequisicaoMobilePartialUpdate.latitude) &&
        Objects.equals(this.longitude, logRequisicaoMobilePartialUpdate.longitude) &&
        Objects.equals(this.codigoRetorno, logRequisicaoMobilePartialUpdate.codigoRetorno) &&
        Objects.equals(this.idProposta, logRequisicaoMobilePartialUpdate.idProposta) &&
        Objects.equals(this.idConta, logRequisicaoMobilePartialUpdate.idConta) &&
        Objects.equals(this.informacaoAdicional, logRequisicaoMobilePartialUpdate.informacaoAdicional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metodo, idRequisicao, login, cpf, appVersion, deviceId, phoneId, idChave, idPlataforma, userAgent, marcaCelular, modeloCelular, latitude, longitude, codigoRetorno, idProposta, idConta, informacaoAdicional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogRequisicaoMobilePartialUpdate {\n");
    
    sb.append("    metodo: ").append(toIndentedString(metodo)).append("\n");
    sb.append("    idRequisicao: ").append(toIndentedString(idRequisicao)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    phoneId: ").append(toIndentedString(phoneId)).append("\n");
    sb.append("    idChave: ").append(toIndentedString(idChave)).append("\n");
    sb.append("    idPlataforma: ").append(toIndentedString(idPlataforma)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    marcaCelular: ").append(toIndentedString(marcaCelular)).append("\n");
    sb.append("    modeloCelular: ").append(toIndentedString(modeloCelular)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    codigoRetorno: ").append(toIndentedString(codigoRetorno)).append("\n");
    sb.append("    idProposta: ").append(toIndentedString(idProposta)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    informacaoAdicional: ").append(toIndentedString(informacaoAdicional)).append("\n");
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

