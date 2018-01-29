package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do tipo de template.
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do tipo de template.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoTemplateRequest   {
  
  private String nome = null;
  private String descricao = null;
  private String sigla = null;

  
  /**
   * Nome do tipo de template.
   **/
  public TipoTemplateRequest nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do tipo de template.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do tipo de template.
   **/
  public TipoTemplateRequest descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do tipo de template.")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Sigla do tipo de template.
   **/
  public TipoTemplateRequest sigla(String sigla) {
    this.sigla = sigla;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sigla do tipo de template.")
  @JsonProperty("sigla")
  public String getSigla() {
    return sigla;
  }
  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoTemplateRequest tipoTemplateRequest = (TipoTemplateRequest) o;
    return Objects.equals(this.nome, tipoTemplateRequest.nome) &&
        Objects.equals(this.descricao, tipoTemplateRequest.descricao) &&
        Objects.equals(this.sigla, tipoTemplateRequest.sigla);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, descricao, sigla);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoTemplateRequest {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    sigla: ").append(toIndentedString(sigla)).append("\n");
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

