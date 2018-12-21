package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{chave_criptografia_resposta_descricao}}}
 **/

@ApiModel(description = "{{{chave_criptografia_resposta_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ChaveCriptografiaResponse   {
  
  private String conteudo = null;

  
  /**
   * {{{chave_criptografia_resposta_texto_conteudo}}}
   **/
  public ChaveCriptografiaResponse conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{chave_criptografia_resposta_texto_conteudo}}}")
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
    ChaveCriptografiaResponse chaveCriptografiaResponse = (ChaveCriptografiaResponse) o;
    return Objects.equals(this.conteudo, chaveCriptografiaResponse.conteudo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conteudo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChaveCriptografiaResponse {\n");
    
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

