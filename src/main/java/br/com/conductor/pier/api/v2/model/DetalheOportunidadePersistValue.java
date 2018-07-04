package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{detalhe_oportunidade_persist_description}}}
 **/

@ApiModel(description = "{{{detalhe_oportunidade_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DetalheOportunidadePersistValue   {
  
  private String nomeCampo = null;
  private String conteudo = null;

  
  /**
   * {{{detalhe_oportunidade_persist_nome_campo_value}}}
   **/
  public DetalheOportunidadePersistValue nomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{detalhe_oportunidade_persist_nome_campo_value}}}")
  @JsonProperty("nomeCampo")
  public String getNomeCampo() {
    return nomeCampo;
  }
  public void setNomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
  }

  
  /**
   * {{{detalhe_oportunidade_persist_conteudo_value}}}
   **/
  public DetalheOportunidadePersistValue conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{detalhe_oportunidade_persist_conteudo_value}}}")
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
    DetalheOportunidadePersistValue detalheOportunidadePersistValue = (DetalheOportunidadePersistValue) o;
    return Objects.equals(this.nomeCampo, detalheOportunidadePersistValue.nomeCampo) &&
        Objects.equals(this.conteudo, detalheOportunidadePersistValue.conteudo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeCampo, conteudo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalheOportunidadePersistValue {\n");
    
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



