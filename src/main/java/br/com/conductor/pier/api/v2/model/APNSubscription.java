package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Represents a new subscription
 **/

@ApiModel(description = "Represents a new subscription")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class APNSubscription   {
  
  private String deviceToken = null;
  private Long idAplicacaoMobile = null;
  private List<Long> idCartoes = new ArrayList<Long>();

  
  /**
   * The device token
   **/
  public APNSubscription deviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The device token")
  @JsonProperty("deviceToken")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  
  /**
   * The mobile application id
   **/
  public APNSubscription idAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The mobile application id")
  @JsonProperty("idAplicacaoMobile")
  public Long getIdAplicacaoMobile() {
    return idAplicacaoMobile;
  }
  public void setIdAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
  }

  
  /**
   * List of card ids
   **/
  public APNSubscription idCartoes(List<Long> idCartoes) {
    this.idCartoes = idCartoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of card ids")
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
    APNSubscription aPNSubscription = (APNSubscription) o;
    return Objects.equals(this.deviceToken, aPNSubscription.deviceToken) &&
        Objects.equals(this.idAplicacaoMobile, aPNSubscription.idAplicacaoMobile) &&
        Objects.equals(this.idCartoes, aPNSubscription.idCartoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceToken, idAplicacaoMobile, idCartoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APNSubscription {\n");
    
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

