package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ReferenciaIdPersist;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * {{{documento_template_persist_description}}}
 **/

@ApiModel(description = "{{{documento_template_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DocumentoTemplatePersist   {
  
  private Long idTipoTemplate = null;
  private String template = null;
  private List<ReferenciaIdPersist> integracoes = new ArrayList<ReferenciaIdPersist>();

  
  /**
   * {{{documento_template_persist_id_tipo_template_value}}}
   **/
  public DocumentoTemplatePersist idTipoTemplate(Long idTipoTemplate) {
    this.idTipoTemplate = idTipoTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_template_persist_id_tipo_template_value}}}")
  @JsonProperty("idTipoTemplate")
  public Long getIdTipoTemplate() {
    return idTipoTemplate;
  }
  public void setIdTipoTemplate(Long idTipoTemplate) {
    this.idTipoTemplate = idTipoTemplate;
  }

  
  /**
   * {{{documento_template_persist_template_value}}}
   **/
  public DocumentoTemplatePersist template(String template) {
    this.template = template;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_template_persist_template_value}}}")
  @JsonProperty("template")
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
  }

  
  /**
   * {{{documento_template_persist_integracoes_value}}}
   **/
  public DocumentoTemplatePersist integracoes(List<ReferenciaIdPersist> integracoes) {
    this.integracoes = integracoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_template_persist_integracoes_value}}}")
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



