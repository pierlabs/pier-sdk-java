package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{status_oportunidade_persist_description}}}
 **/

@ApiModel(description = "{{{status_oportunidade_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class StatusOportunidadePersistValue   {
  
  private String nome = null;
  private String descricao = null;
  private Boolean flagAtivo = null;

  
  /**
   * {{{status_oportunidade_persist_nome_value}}}
   **/
  public StatusOportunidadePersistValue nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_oportunidade_persist_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{status_oportunidade_persist_descricao_value}}}
   **/
  public StatusOportunidadePersistValue descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{status_oportunidade_persist_descricao_value}}}")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{status_oportunidade_persist_flag_ativo_value}}}
   **/
  public StatusOportunidadePersistValue flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "{{{status_oportunidade_persist_flag_ativo_value}}}")
  @JsonProperty("flagAtivo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusOportunidadePersistValue statusOportunidadePersistValue = (StatusOportunidadePersistValue) o;
    return Objects.equals(this.nome, statusOportunidadePersistValue.nome) &&
        Objects.equals(this.descricao, statusOportunidadePersistValue.descricao) &&
        Objects.equals(this.flagAtivo, statusOportunidadePersistValue.flagAtivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, descricao, flagAtivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusOportunidadePersistValue {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    flagAtivo: ").append(toIndentedString(flagAtivo)).append("\n");
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

