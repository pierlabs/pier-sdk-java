package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * ServiceObject object for data persistence
 **/

@ApiModel(description = "ServiceObject object for data persistence")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class RepresentationOfTheResourceEntryOfRegisteringAServiceAccount   {
  
  private Long idConta = null;
  private Long idTipoServico = null;

  
  /**
   * Account ID code
   **/
  public RepresentationOfTheResourceEntryOfRegisteringAServiceAccount idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Account ID code")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Service Type Identification Code
   **/
  public RepresentationOfTheResourceEntryOfRegisteringAServiceAccount idTipoServico(Long idTipoServico) {
    this.idTipoServico = idTipoServico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service Type Identification Code")
  @JsonProperty("idTipoServico")
  public Long getIdTipoServico() {
    return idTipoServico;
  }
  public void setIdTipoServico(Long idTipoServico) {
    this.idTipoServico = idTipoServico;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepresentationOfTheResourceEntryOfRegisteringAServiceAccount representationOfTheResourceEntryOfRegisteringAServiceAccount = (RepresentationOfTheResourceEntryOfRegisteringAServiceAccount) o;
    return Objects.equals(this.idConta, representationOfTheResourceEntryOfRegisteringAServiceAccount.idConta) &&
        Objects.equals(this.idTipoServico, representationOfTheResourceEntryOfRegisteringAServiceAccount.idTipoServico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idTipoServico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepresentationOfTheResourceEntryOfRegisteringAServiceAccount {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idTipoServico: ").append(toIndentedString(idTipoServico)).append("\n");
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

