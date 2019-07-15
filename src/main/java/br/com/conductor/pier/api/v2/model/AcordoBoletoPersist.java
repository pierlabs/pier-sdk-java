package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de refer\u00EAncia para os dados do boleto de entrada
 **/

@ApiModel(description = "Objeto de refer\u00EAncia para os dados do boleto de entrada")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AcordoBoletoPersist   {
  
  private Long idConvenio = null;

  
  /**
   * C\u00F3digo de identifia\u00E7\u00E3o do conv\u00EAnio
   **/
  public AcordoBoletoPersist idConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifia\u00E7\u00E3o do conv\u00EAnio")
  @JsonProperty("idConvenio")
  public Long getIdConvenio() {
    return idConvenio;
  }
  public void setIdConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcordoBoletoPersist acordoBoletoPersist = (AcordoBoletoPersist) o;
    return Objects.equals(this.idConvenio, acordoBoletoPersist.idConvenio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConvenio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoBoletoPersist {\n");
    
    sb.append("    idConvenio: ").append(toIndentedString(idConvenio)).append("\n");
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

