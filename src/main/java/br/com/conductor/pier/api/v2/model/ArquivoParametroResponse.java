package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Response de par\u00E2metros do arquivo.
 **/

@ApiModel(description = "Objeto Response de par\u00E2metros do arquivo.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ArquivoParametroResponse   {
  
  private Long id = null;
  private String nomeCampo = null;
  private String conteudo = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do detalhe do arquivo.
   **/
  public ArquivoParametroResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do detalhe do arquivo.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome que identifica o detalhe do arquivo
   **/
  public ArquivoParametroResponse nomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome que identifica o detalhe do arquivo")
  @JsonProperty("nomeCampo")
  public String getNomeCampo() {
    return nomeCampo;
  }
  public void setNomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
  }

  
  /**
   * Conte\u00FAdo do nomeCampo
   **/
  public ArquivoParametroResponse conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Conte\u00FAdo do nomeCampo")
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
    ArquivoParametroResponse arquivoParametroResponse = (ArquivoParametroResponse) o;
    return Objects.equals(this.id, arquivoParametroResponse.id) &&
        Objects.equals(this.nomeCampo, arquivoParametroResponse.nomeCampo) &&
        Objects.equals(this.conteudo, arquivoParametroResponse.conteudo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nomeCampo, conteudo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoParametroResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nomeCampo: ").append(toIndentedString(nomeCampo)).append("\n");
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

