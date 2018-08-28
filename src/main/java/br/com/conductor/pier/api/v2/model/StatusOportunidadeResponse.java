package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{status_oportunidade_response_description}}}
 **/

@ApiModel(description = "{{{status_oportunidade_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class StatusOportunidadeResponse   {
  
  private Long id = null;
  private Long idTipoOportunidade = null;
  private String nome = null;
  private String descricao = null;
  private Boolean flagAtivo = null;

  
  /**
   * {{{status_oportunidade_response_id_value}}}
   **/
  public StatusOportunidadeResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_oportunidade_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{status_oportunidade_response_id_tipo_oportunidade_value}}}
   **/
  public StatusOportunidadeResponse idTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_oportunidade_response_id_tipo_oportunidade_value}}}")
  @JsonProperty("idTipoOportunidade")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * {{{status_oportunidade_response_nome_value}}}
   **/
  public StatusOportunidadeResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_oportunidade_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{status_oportunidade_response_descricao_value}}}
   **/
  public StatusOportunidadeResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_oportunidade_response_descricao_value}}}")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{status_oportunidade_response_flag_ativo_value}}}
   **/
  public StatusOportunidadeResponse flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{status_oportunidade_response_flag_ativo_value}}}")
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
    StatusOportunidadeResponse statusOportunidadeResponse = (StatusOportunidadeResponse) o;
    return Objects.equals(this.id, statusOportunidadeResponse.id) &&
        Objects.equals(this.idTipoOportunidade, statusOportunidadeResponse.idTipoOportunidade) &&
        Objects.equals(this.nome, statusOportunidadeResponse.nome) &&
        Objects.equals(this.descricao, statusOportunidadeResponse.descricao) &&
        Objects.equals(this.flagAtivo, statusOportunidadeResponse.flagAtivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoOportunidade, nome, descricao, flagAtivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusOportunidadeResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoOportunidade: ").append(toIndentedString(idTipoOportunidade)).append("\n");
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

