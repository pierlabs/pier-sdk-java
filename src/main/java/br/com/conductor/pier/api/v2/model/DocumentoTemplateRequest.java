package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do template do documento.
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do template do documento.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DocumentoTemplateRequest   {
  
  private Long idTipoDocumento = null;
  private String template = null;

  
  /**
   * ID para o Tipo de Documento vinculado ao template.
   **/
  public DocumentoTemplateRequest idTipoDocumento(Long idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID para o Tipo de Documento vinculado ao template.")
  @JsonProperty("idTipoDocumento")
  public Long getIdTipoDocumento() {
    return idTipoDocumento;
  }
  public void setIdTipoDocumento(Long idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
  }

  
  /**
   * Template para o conte\u00C3\u00BAdo do documento.
   **/
  public DocumentoTemplateRequest template(String template) {
    this.template = template;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template para o conte\u00C3\u00BAdo do documento.")
  @JsonProperty("template")
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoTemplateRequest documentoTemplateRequest = (DocumentoTemplateRequest) o;
    return Objects.equals(this.idTipoDocumento, documentoTemplateRequest.idTipoDocumento) &&
        Objects.equals(this.template, documentoTemplateRequest.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoDocumento, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoTemplateRequest {\n");
    
    sb.append("    idTipoDocumento: ").append(toIndentedString(idTipoDocumento)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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



