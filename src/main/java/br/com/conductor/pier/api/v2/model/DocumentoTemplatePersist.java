package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ReferenciaIdPersist;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do template do documento.
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do template do documento.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DocumentoTemplatePersist   {
  
  private Long idTipoTemplate = null;
  private String template = null;
  private List<ReferenciaIdPersist> integracoes = new ArrayList<ReferenciaIdPersist>();

  
  /**
   * ID para o Tipo de Template vinculado ao template.
   **/
  public DocumentoTemplatePersist idTipoTemplate(Long idTipoTemplate) {
    this.idTipoTemplate = idTipoTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID para o Tipo de Template vinculado ao template.")
  @JsonProperty("idTipoTemplate")
  public Long getIdTipoTemplate() {
    return idTipoTemplate;
  }
  public void setIdTipoTemplate(Long idTipoTemplate) {
    this.idTipoTemplate = idTipoTemplate;
  }

  
  /**
   * Template para o conte\u00C3\u00BAdo do documento.
   **/
  public DocumentoTemplatePersist template(String template) {
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

  
  /**
   * Lista de configura\u00C3\u00A7\u00C3\u00B5es de integra\u00C3\u00A7\u00C3\u00A3o
   **/
  public DocumentoTemplatePersist integracoes(List<ReferenciaIdPersist> integracoes) {
    this.integracoes = integracoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de configura\u00C3\u00A7\u00C3\u00B5es de integra\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("integracoes")
  public List<ReferenciaIdPersist> getIntegracoes() {
    return integracoes;
  }
  public void setIntegracoes(List<ReferenciaIdPersist> integracoes) {
    this.integracoes = integracoes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoTemplatePersist documentoTemplatePersist = (DocumentoTemplatePersist) o;
    return Objects.equals(this.idTipoTemplate, documentoTemplatePersist.idTipoTemplate) &&
        Objects.equals(this.template, documentoTemplatePersist.template) &&
        Objects.equals(this.integracoes, documentoTemplatePersist.integracoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoTemplate, template, integracoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoTemplatePersist {\n");
    
    sb.append("    idTipoTemplate: ").append(toIndentedString(idTipoTemplate)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    integracoes: ").append(toIndentedString(integracoes)).append("\n");
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

