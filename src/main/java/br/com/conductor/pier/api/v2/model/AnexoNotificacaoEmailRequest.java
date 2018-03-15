package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o de um documento anexo para uma notifica\u00E7\u00E3o.
 **/

@ApiModel(description = "Representa\u00E7\u00E3o de um documento anexo para uma notifica\u00E7\u00E3o.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AnexoNotificacaoEmailRequest   {
  
  private Long idDocumento = null;

  
  /**
   * ID do documento que ser\u00E1 anexado a notifica\u00E7\u00E3o.
   **/
  public AnexoNotificacaoEmailRequest idDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID do documento que ser\u00E1 anexado a notifica\u00E7\u00E3o.")
  @JsonProperty("idDocumento")
  public Long getIdDocumento() {
    return idDocumento;
  }
  public void setIdDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnexoNotificacaoEmailRequest anexoNotificacaoEmailRequest = (AnexoNotificacaoEmailRequest) o;
    return Objects.equals(this.idDocumento, anexoNotificacaoEmailRequest.idDocumento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDocumento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnexoNotificacaoEmailRequest {\n");
    
    sb.append("    idDocumento: ").append(toIndentedString(idDocumento)).append("\n");
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

