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
  private Long idTipoTemplate = null;

  
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
   * ID do Tipo de Template.
   **/
  public DocumentoTemplateResponse idTipoTemplate(Long idTipoTemplate) {
    this.idTipoTemplate = idTipoTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID do Tipo de Template.")
  @JsonProperty("idTipoTemplate")
  public Long getIdTipoTemplate() {
    return idTipoTemplate;
  }
  public void setIdTipoTemplate(Long idTipoTemplate) {
    this.idTipoTemplate = idTipoTemplate;
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
        Objects.equals(this.idTipoTemplate, documentoTemplateResponse.idTipoTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoTemplateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoTemplate: ").append(toIndentedString(idTipoTemplate)).append("\n");
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

