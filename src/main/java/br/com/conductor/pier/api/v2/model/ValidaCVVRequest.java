package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Request Representation of the CVV validation
 **/

@ApiModel(description = "Request Representation of the CVV validation")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ValidaCVVRequest   {
  
  private Long idChaveCriptografia = null;
  private String cvv = null;

  
  /**
   * Identification Code of the encrypted key
   **/
  public ValidaCVVRequest idChaveCriptografia(Long idChaveCriptografia) {
    this.idChaveCriptografia = idChaveCriptografia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the encrypted key")
  @JsonProperty("idChaveCriptografia")
  public Long getIdChaveCriptografia() {
    return idChaveCriptografia;
  }
  public void setIdChaveCriptografia(Long idChaveCriptografia) {
    this.idChaveCriptografia = idChaveCriptografia;
  }

  
  /**
   * Value of the Card Checking (CVV)
   **/
  public ValidaCVVRequest cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the Card Checking (CVV)")
  @JsonProperty("cvv")
  public String getCvv() {
    return cvv;
  }
  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidaCVVRequest validaCVVRequest = (ValidaCVVRequest) o;
    return Objects.equals(this.idChaveCriptografia, validaCVVRequest.idChaveCriptografia) &&
        Objects.equals(this.cvv, validaCVVRequest.cvv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idChaveCriptografia, cvv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidaCVVRequest {\n");
    
    sb.append("    idChaveCriptografia: ").append(toIndentedString(idChaveCriptografia)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
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

