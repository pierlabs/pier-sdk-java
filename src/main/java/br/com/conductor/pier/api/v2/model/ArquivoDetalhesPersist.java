package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto ArquivoParametros para persist\u00EAncia de dados.
 **/

@ApiModel(description = "Objeto ArquivoParametros para persist\u00EAncia de dados.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ArquivoDetalhesPersist   {
  
  private String nomeCampo = null;
  private String conteudo = null;

  
  /**
   * Nome que identifica o detalhe do arquivo
   **/
  public ArquivoDetalhesPersist nomeCampo(String nomeCampo) {
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
  public ArquivoDetalhesPersist conteudo(String conteudo) {
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
    ArquivoDetalhesPersist arquivoDetalhesPersist = (ArquivoDetalhesPersist) o;
    return Objects.equals(this.nomeCampo, arquivoDetalhesPersist.nomeCampo) &&
        Objects.equals(this.conteudo, arquivoDetalhesPersist.conteudo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeCampo, conteudo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoDetalhesPersist {\n");
    
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

