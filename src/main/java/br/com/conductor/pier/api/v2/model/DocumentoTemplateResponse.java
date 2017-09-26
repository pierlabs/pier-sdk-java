package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso do Template de Documento
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso do Template de Documento")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DocumentoTemplateResponse   {
  
  private Long id = null;
  private Long idTipoDocumento = null;

  
  /**
   * ID do Template do Documento.
   **/
  public DocumentoTemplateResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID do Template do Documento.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * ID do Tipo de Documento.
   **/
  public DocumentoTemplateResponse idTipoDocumento(Long idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID do Tipo de Documento.")
  @JsonProperty("idTipoDocumento")
  public Long getIdTipoDocumento() {
    return idTipoDocumento;
  }
  public void setIdTipoDocumento(Long idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoTemplateResponse documentoTemplateResponse = (DocumentoTemplateResponse) o;
    return Objects.equals(this.id, documentoTemplateResponse.id) &&
        Objects.equals(this.idTipoDocumento, documentoTemplateResponse.idTipoDocumento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoDocumento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoTemplateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoDocumento: ").append(toIndentedString(idTipoDocumento)).append("\n");
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



