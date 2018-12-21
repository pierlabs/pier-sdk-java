package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{detalhe_oportunidade_update_description}}}
 **/

@ApiModel(description = "{{{detalhe_oportunidade_update_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DetalheOportunidadeUpdateValue   {
  
  private Long id = null;
  private String nomeCampo = null;
  private String conteudo = null;

  
  /**
   * {{{detalhe_oportunidade_update_id_value}}}
   **/
  public DetalheOportunidadeUpdateValue id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_oportunidade_update_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{detalhe_oportunidade_update_nome_campo_value}}}
   **/
  public DetalheOportunidadeUpdateValue nomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_oportunidade_update_nome_campo_value}}}")
  @JsonProperty("nomeCampo")
  public String getNomeCampo() {
    return nomeCampo;
  }
  public void setNomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
  }

  
  /**
   * {{{detalhe_oportunidade_update_conteudo_value}}}
   **/
  public DetalheOportunidadeUpdateValue conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_oportunidade_update_conteudo_value}}}")
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
    DetalheOportunidadeUpdateValue detalheOportunidadeUpdateValue = (DetalheOportunidadeUpdateValue) o;
    return Objects.equals(this.id, detalheOportunidadeUpdateValue.id) &&
        Objects.equals(this.nomeCampo, detalheOportunidadeUpdateValue.nomeCampo) &&
        Objects.equals(this.conteudo, detalheOportunidadeUpdateValue.conteudo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nomeCampo, conteudo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalheOportunidadeUpdateValue {\n");
    
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

