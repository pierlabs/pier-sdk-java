package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de resposta de um log de requisi\u00E7\u00E3o mobile
 **/

@ApiModel(description = "Objeto de resposta de um log de requisi\u00E7\u00E3o mobile")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LogRequisicaoMobileResponse   {
  
  private String appVersion = null;
  private Integer codigoRetorno = null;
  private String cpf = null;
  private String dataHoraRequisicao = null;
  private String deviceId = null;
  private Long id = null;
  private Long idChave = null;
  private Long idConta = null;
  private Long idPlataforma = null;
  private Long idProposta = null;
  private Long idRequisicao = null;
  private String informacaoAdicional = null;
  private String latitude = null;
  private String login = null;
  private String longitude = null;
  private String marcaCelular = null;
  private String metodo = null;
  private String modeloCelular = null;
  private String phoneId = null;
  private String userAgent = null;

  
  /**
   **/
  public LogRequisicaoMobileResponse appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("appVersion")
  public String getAppVersion() {
    return appVersion;
  }
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse codigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codigoRetorno")
  public Integer getCodigoRetorno() {
    return codigoRetorno;
  }
  public void setCodigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse dataHoraRequisicao(String dataHoraRequisicao) {
    this.dataHoraRequisicao = dataHoraRequisicao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataHoraRequisicao")
  public String getDataHoraRequisicao() {
    return dataHoraRequisicao;
  }
  public void setDataHoraRequisicao(String dataHoraRequisicao) {
    this.dataHoraRequisicao = dataHoraRequisicao;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deviceId")
  public String getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse idChave(Long idChave) {
    this.idChave = idChave;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idChave")
  public Long getIdChave() {
    return idChave;
  }
  public void setIdChave(Long idChave) {
    this.idChave = idChave;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse idPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idPlataforma")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse idRequisicao(Long idRequisicao) {
    this.idRequisicao = idRequisicao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idRequisicao")
  public Long getIdRequisicao() {
    return idRequisicao;
  }
  public void setIdRequisicao(Long idRequisicao) {
    this.idRequisicao = idRequisicao;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse informacaoAdicional(String informacaoAdicional) {
    this.informacaoAdicional = informacaoAdicional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("informacaoAdicional")
  public String getInformacaoAdicional() {
    return informacaoAdicional;
  }
  public void setInformacaoAdicional(String informacaoAdicional) {
    this.informacaoAdicional = informacaoAdicional;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse marcaCelular(String marcaCelular) {
    this.marcaCelular = marcaCelular;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("marcaCelular")
  public String getMarcaCelular() {
    return marcaCelular;
  }
  public void setMarcaCelular(String marcaCelular) {
    this.marcaCelular = marcaCelular;
  }

  
  /**
   * M\u00E9todo onde o c\u00F3digo \u00E9 executado
   **/
  public LogRequisicaoMobileResponse metodo(String metodo) {
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
   **/
  public LogRequisicaoMobileResponse modeloCelular(String modeloCelular) {
    this.modeloCelular = modeloCelular;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modeloCelular")
  public String getModeloCelular() {
    return modeloCelular;
  }
  public void setModeloCelular(String modeloCelular) {
    this.modeloCelular = modeloCelular;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse phoneId(String phoneId) {
    this.phoneId = phoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneId")
  public String getPhoneId() {
    return phoneId;
  }
  public void setPhoneId(String phoneId) {
    this.phoneId = phoneId;
  }

  
  /**
   **/
  public LogRequisicaoMobileResponse userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userAgent")
  public String getUserAgent() {
    return userAgent;
  }
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogRequisicaoMobileResponse logRequisicaoMobileResponse = (LogRequisicaoMobileResponse) o;
    return Objects.equals(this.appVersion, logRequisicaoMobileResponse.appVersion) &&
        Objects.equals(this.codigoRetorno, logRequisicaoMobileResponse.codigoRetorno) &&
        Objects.equals(this.cpf, logRequisicaoMobileResponse.cpf) &&
        Objects.equals(this.dataHoraRequisicao, logRequisicaoMobileResponse.dataHoraRequisicao) &&
        Objects.equals(this.deviceId, logRequisicaoMobileResponse.deviceId) &&
        Objects.equals(this.id, logRequisicaoMobileResponse.id) &&
        Objects.equals(this.idChave, logRequisicaoMobileResponse.idChave) &&
        Objects.equals(this.idConta, logRequisicaoMobileResponse.idConta) &&
        Objects.equals(this.idPlataforma, logRequisicaoMobileResponse.idPlataforma) &&
        Objects.equals(this.idProposta, logRequisicaoMobileResponse.idProposta) &&
        Objects.equals(this.idRequisicao, logRequisicaoMobileResponse.idRequisicao) &&
        Objects.equals(this.informacaoAdicional, logRequisicaoMobileResponse.informacaoAdicional) &&
        Objects.equals(this.latitude, logRequisicaoMobileResponse.latitude) &&
        Objects.equals(this.login, logRequisicaoMobileResponse.login) &&
        Objects.equals(this.longitude, logRequisicaoMobileResponse.longitude) &&
        Objects.equals(this.marcaCelular, logRequisicaoMobileResponse.marcaCelular) &&
        Objects.equals(this.metodo, logRequisicaoMobileResponse.metodo) &&
        Objects.equals(this.modeloCelular, logRequisicaoMobileResponse.modeloCelular) &&
        Objects.equals(this.phoneId, logRequisicaoMobileResponse.phoneId) &&
        Objects.equals(this.userAgent, logRequisicaoMobileResponse.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appVersion, codigoRetorno, cpf, dataHoraRequisicao, deviceId, id, idChave, idConta, idPlataforma, idProposta, idRequisicao, informacaoAdicional, latitude, login, longitude, marcaCelular, metodo, modeloCelular, phoneId, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogRequisicaoMobileResponse {\n");
    
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    codigoRetorno: ").append(toIndentedString(codigoRetorno)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    dataHoraRequisicao: ").append(toIndentedString(dataHoraRequisicao)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idChave: ").append(toIndentedString(idChave)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPlataforma: ").append(toIndentedString(idPlataforma)).append("\n");
    sb.append("    idProposta: ").append(toIndentedString(idProposta)).append("\n");
    sb.append("    idRequisicao: ").append(toIndentedString(idRequisicao)).append("\n");
    sb.append("    informacaoAdicional: ").append(toIndentedString(informacaoAdicional)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    marcaCelular: ").append(toIndentedString(marcaCelular)).append("\n");
    sb.append("    metodo: ").append(toIndentedString(metodo)).append("\n");
    sb.append("    modeloCelular: ").append(toIndentedString(modeloCelular)).append("\n");
    sb.append("    phoneId: ").append(toIndentedString(phoneId)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

