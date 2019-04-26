package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Objeto de persist\u00EAncia para novas incri\u00E7\u00F5es
 **/

@ApiModel(description = "Objeto de persist\u00EAncia para novas incri\u00E7\u00F5es")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class InscricaoAPN   {
  
  private String deviceToken = null;
  private Long idAplicacaoMobile = null;
  private List<Long> idCartoes = new ArrayList<Long>();

  
  /**
   * Token do dispositivo
   **/
  public InscricaoAPN deviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Token do dispositivo")
  @JsonProperty("deviceToken")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  
  /**
   * Id da aplica\u00E7\u00E3o mobile
   **/
  public InscricaoAPN idAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id da aplica\u00E7\u00E3o mobile")
  @JsonProperty("idAplicacaoMobile")
  public Long getIdAplicacaoMobile() {
    return idAplicacaoMobile;
  }
  public void setIdAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
  }

  
  /**
   * Lista de ids dos cart\u00F5es
   **/
  public InscricaoAPN idCartoes(List<Long> idCartoes) {
    this.idCartoes = idCartoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de ids dos cart\u00F5es")
  @JsonProperty("idCartoes")
  public List<Long> getIdCartoes() {
    return idCartoes;
  }
  public void setIdCartoes(List<Long> idCartoes) {
    this.idCartoes = idCartoes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InscricaoAPN inscricaoAPN = (InscricaoAPN) o;
    return Objects.equals(this.deviceToken, inscricaoAPN.deviceToken) &&
        Objects.equals(this.idAplicacaoMobile, inscricaoAPN.idAplicacaoMobile) &&
        Objects.equals(this.idCartoes, inscricaoAPN.idCartoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceToken, idAplicacaoMobile, idCartoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InscricaoAPN {\n");
    
    sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
    sb.append("    idAplicacaoMobile: ").append(toIndentedString(idAplicacaoMobile)).append("\n");
    sb.append("    idCartoes: ").append(toIndentedString(idCartoes)).append("\n");
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

