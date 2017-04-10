package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Objeto DetalheOportunidade
 **/

@ApiModel(description = "Objeto DetalheOportunidade")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DetalheOportunidadePersist   {
  
  private String conteudo = null;
  private String nomeCampo = null;

  
  /**
   * Conte\u00C3\u00BAdo do detalhe
   **/
  public DetalheOportunidadePersist conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Conte\u00C3\u00BAdo do detalhe")
  @JsonProperty("conteudo")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * Nome do conte\u00C3\u00BAdo
   **/
  public DetalheOportunidadePersist nomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome do conte\u00C3\u00BAdo")
  @JsonProperty("nomeCampo")
  public String getNomeCampo() {
    return nomeCampo;
  }
  public void setNomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalheOportunidadePersist detalheOportunidadePersist = (DetalheOportunidadePersist) o;
    return Objects.equals(this.conteudo, detalheOportunidadePersist.conteudo) &&
        Objects.equals(this.nomeCampo, detalheOportunidadePersist.nomeCampo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conteudo, nomeCampo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalheOportunidadePersist {\n");
    
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
    sb.append("    nomeCampo: ").append(toIndentedString(nomeCampo)).append("\n");
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



