package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{tipo_template_response_description}}}
 **/

@ApiModel(description = "{{{tipo_template_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoTemplateResponse   {
  
  private Long id = null;
  private String nome = null;
  private String descricao = null;
  private String sigla = null;

  
  /**
   * {{{tipo_template_response_id_value}}}
   **/
  public TipoTemplateResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_template_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{tipo_template_response_nome_value}}}
   **/
  public TipoTemplateResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_template_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{tipo_template_response_descricao_value}}}
   **/
  public TipoTemplateResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_template_response_descricao_value}}}")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{tipo_template_response_sigla_value}}}
   **/
  public TipoTemplateResponse sigla(String sigla) {
    this.sigla = sigla;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_template_response_sigla_value}}}")
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
    TipoTemplateResponse tipoTemplateResponse = (TipoTemplateResponse) o;
    return Objects.equals(this.id, tipoTemplateResponse.id) &&
        Objects.equals(this.nome, tipoTemplateResponse.nome) &&
        Objects.equals(this.descricao, tipoTemplateResponse.descricao) &&
        Objects.equals(this.sigla, tipoTemplateResponse.sigla);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, descricao, sigla);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoTemplateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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



