package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o da resposta para o detalhamento do documento
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta para o detalhamento do documento")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DocumentoDetalheResponse   {
  
  private Long id = null;
  private String propriedade = null;
  private String conteudo = null;

  
  /**
   * ID de identifica\u00E7\u00E3o do detalhamento do documento.
   **/
  public DocumentoDetalheResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID de identifica\u00E7\u00E3o do detalhamento do documento.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Propriedade do detalhamento do documento.
   **/
  public DocumentoDetalheResponse propriedade(String propriedade) {
    this.propriedade = propriedade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Propriedade do detalhamento do documento.")
  @JsonProperty("propriedade")
  public String getPropriedade() {
    return propriedade;
  }
  public void setPropriedade(String propriedade) {
    this.propriedade = propriedade;
  }

  
  /**
   * Conte\u00FAdo do detalhamento do documento.
   **/
  public DocumentoDetalheResponse conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conte\u00FAdo do detalhamento do documento.")
  @JsonProperty("conteudo")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoDetalheResponse documentoDetalheResponse = (DocumentoDetalheResponse) o;
    return Objects.equals(this.id, documentoDetalheResponse.id) &&
        Objects.equals(this.propriedade, documentoDetalheResponse.propriedade) &&
        Objects.equals(this.conteudo, documentoDetalheResponse.conteudo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, propriedade, conteudo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoDetalheResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    propriedade: ").append(toIndentedString(propriedade)).append("\n");
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
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

