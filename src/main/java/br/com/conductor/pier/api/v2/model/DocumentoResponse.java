package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o da resposta resumida para o recurso de Documento
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta resumida para o recurso de Documento")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DocumentoResponse   {
  
  private Long id = null;
  private Long idTemplateDocumento = null;
  private String nome = null;
  private String extensao = null;

  
  /**
   * ID do Documento.
   **/
  public DocumentoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID do Documento.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * ID do Template de Documento associado.
   **/
  public DocumentoResponse idTemplateDocumento(Long idTemplateDocumento) {
    this.idTemplateDocumento = idTemplateDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID do Template de Documento associado.")
  @JsonProperty("idTemplateDocumento")
  public Long getIdTemplateDocumento() {
    return idTemplateDocumento;
  }
  public void setIdTemplateDocumento(Long idTemplateDocumento) {
    this.idTemplateDocumento = idTemplateDocumento;
  }

  
  /**
   * Nome do Documento.
   **/
  public DocumentoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Documento.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Extens\u00E3o do Documento.
   **/
  public DocumentoResponse extensao(String extensao) {
    this.extensao = extensao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Extens\u00E3o do Documento.")
  @JsonProperty("extensao")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoResponse documentoResponse = (DocumentoResponse) o;
    return Objects.equals(this.id, documentoResponse.id) &&
        Objects.equals(this.idTemplateDocumento, documentoResponse.idTemplateDocumento) &&
        Objects.equals(this.nome, documentoResponse.nome) &&
        Objects.equals(this.extensao, documentoResponse.extensao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTemplateDocumento, nome, extensao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTemplateDocumento: ").append(toIndentedString(idTemplateDocumento)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    extensao: ").append(toIndentedString(extensao)).append("\n");
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

