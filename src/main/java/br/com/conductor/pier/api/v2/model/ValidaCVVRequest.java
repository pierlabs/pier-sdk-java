package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da requisi\u00C3\u00A7\u00C3\u00A3o de valida\u00C3\u00A7\u00C3\u00A3o do CVV.
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da requisi\u00C3\u00A7\u00C3\u00A3o de valida\u00C3\u00A7\u00C3\u00A3o do CVV.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ValidaCVVRequest   {
  
  private Long idChaveCriptografia = null;
  private String cvv = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do chave de criptografia.
   **/
  public ValidaCVVRequest idChaveCriptografia(Long idChaveCriptografia) {
    this.idChaveCriptografia = idChaveCriptografia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do chave de criptografia.")
  @JsonProperty("idChaveCriptografia")
  public Long getIdChaveCriptografia() {
    return idChaveCriptografia;
  }
  public void setIdChaveCriptografia(Long idChaveCriptografia) {
    this.idChaveCriptografia = idChaveCriptografia;
  }

  
  /**
   * Valor de Verifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (CVV).
   **/
  public ValidaCVVRequest cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor de Verifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (CVV).")
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

