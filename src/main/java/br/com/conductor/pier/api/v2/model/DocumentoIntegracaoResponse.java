package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{documento_integracao_response_description}}}
 **/

@ApiModel(description = "{{{documento_integracao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DocumentoIntegracaoResponse   {
  
  private Long id = null;
  private Long idTemplate = null;
  private String nome = null;

  
  /**
   * {{{documento_integracao_response_id_value}}}
   **/
  public DocumentoIntegracaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_integracao_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{documento_integracao_response_id_template_value}}}
   **/
  public DocumentoIntegracaoResponse idTemplate(Long idTemplate) {
    this.idTemplate = idTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_integracao_response_id_template_value}}}")
  @JsonProperty("idTemplate")
  public Long getIdTemplate() {
    return idTemplate;
  }
  public void setIdTemplate(Long idTemplate) {
    this.idTemplate = idTemplate;
  }

  
  /**
   * {{{documento_integracao_response_nome_value}}}
   **/
  public DocumentoIntegracaoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_integracao_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoIntegracaoResponse documentoIntegracaoResponse = (DocumentoIntegracaoResponse) o;
    return Objects.equals(this.id, documentoIntegracaoResponse.id) &&
        Objects.equals(this.idTemplate, documentoIntegracaoResponse.idTemplate) &&
        Objects.equals(this.nome, documentoIntegracaoResponse.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTemplate, nome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoIntegracaoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTemplate: ").append(toIndentedString(idTemplate)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
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



