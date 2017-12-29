package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do detalhe da resposta do recurso Oportunidades
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do detalhe da resposta do recurso Oportunidades")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DetalheOportunidadeResponse   {
  
  private Long id = null;
  private String nomeCampo = null;
  private String conteudo = null;

  
  /**
   * C\u00C3\u00B3digo identificador do detalhe
   **/
  public DetalheOportunidadeResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do detalhe")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do conte\u00C3\u00BAdo
   **/
  public DetalheOportunidadeResponse nomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do conte\u00C3\u00BAdo")
  @JsonProperty("nomeCampo")
  public String getNomeCampo() {
    return nomeCampo;
  }
  public void setNomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
  }

  
  /**
   * Conte\u00C3\u00BAdo do detalhe
   **/
  public DetalheOportunidadeResponse conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conte\u00C3\u00BAdo do detalhe")
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
    DetalheOportunidadeResponse detalheOportunidadeResponse = (DetalheOportunidadeResponse) o;
    return Objects.equals(this.id, detalheOportunidadeResponse.id) &&
        Objects.equals(this.nomeCampo, detalheOportunidadeResponse.nomeCampo) &&
        Objects.equals(this.conteudo, detalheOportunidadeResponse.conteudo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nomeCampo, conteudo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalheOportunidadeResponse {\n");
    
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

