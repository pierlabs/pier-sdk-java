package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{status_oportunidade_a_u_d_response_description}}}
 **/

@ApiModel(description = "{{{status_oportunidade_a_u_d_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class StatusOportunidadeAUDResponse   {
  
  private Long rev = null;
  private Long revType = null;
  private String revDate = null;
  private Long id = null;
  private Long idTipoOportunidade = null;
  private String nome = null;
  private String descricao = null;
  private Boolean flagAtivo = null;

  
  /**
   * {{{status_oportunidade_a_u_d_response_rev_value}}}
   **/
  public StatusOportunidadeAUDResponse rev(Long rev) {
    this.rev = rev;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_oportunidade_a_u_d_response_rev_value}}}")
  @JsonProperty("rev")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * {{{status_oportunidade_a_u_d_response_rev_type_value}}}
   **/
  public StatusOportunidadeAUDResponse revType(Long revType) {
    this.revType = revType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_oportunidade_a_u_d_response_rev_type_value}}}")
  @JsonProperty("revType")
  public Long getRevType() {
    return revType;
  }
  public void setRevType(Long revType) {
    this.revType = revType;
  }

  
  /**
   * {{{status_oportunidade_a_u_d_response_rev_date_value}}}
   **/
  public StatusOportunidadeAUDResponse revDate(String revDate) {
    this.revDate = revDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_oportunidade_a_u_d_response_rev_date_value}}}")
  @JsonProperty("revDate")
  public String getRevDate() {
    return revDate;
  }
  public void setRevDate(String revDate) {
    this.revDate = revDate;
  }

  
  /**
   * {{{status_oportunidade_a_u_d_response_id_value}}}
   **/
  public StatusOportunidadeAUDResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_oportunidade_a_u_d_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{status_oportunidade_a_u_d_response_id_tipo_oportunidade_value}}}
   **/
  public StatusOportunidadeAUDResponse idTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_oportunidade_a_u_d_response_id_tipo_oportunidade_value}}}")
  @JsonProperty("idTipoOportunidade")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * {{{status_oportunidade_a_u_d_response_nome_value}}}
   **/
  public StatusOportunidadeAUDResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_oportunidade_a_u_d_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{status_oportunidade_a_u_d_response_descricao_value}}}
   **/
  public StatusOportunidadeAUDResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{status_oportunidade_a_u_d_response_descricao_value}}}")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{status_oportunidade_a_u_d_response_flag_ativo_value}}}
   **/
  public StatusOportunidadeAUDResponse flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{status_oportunidade_a_u_d_response_flag_ativo_value}}}")
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
    StatusOportunidadeAUDResponse statusOportunidadeAUDResponse = (StatusOportunidadeAUDResponse) o;
    return Objects.equals(this.rev, statusOportunidadeAUDResponse.rev) &&
        Objects.equals(this.revType, statusOportunidadeAUDResponse.revType) &&
        Objects.equals(this.revDate, statusOportunidadeAUDResponse.revDate) &&
        Objects.equals(this.id, statusOportunidadeAUDResponse.id) &&
        Objects.equals(this.idTipoOportunidade, statusOportunidadeAUDResponse.idTipoOportunidade) &&
        Objects.equals(this.nome, statusOportunidadeAUDResponse.nome) &&
        Objects.equals(this.descricao, statusOportunidadeAUDResponse.descricao) &&
        Objects.equals(this.flagAtivo, statusOportunidadeAUDResponse.flagAtivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rev, revType, revDate, id, idTipoOportunidade, nome, descricao, flagAtivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusOportunidadeAUDResponse {\n");
    
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    revType: ").append(toIndentedString(revType)).append("\n");
    sb.append("    revDate: ").append(toIndentedString(revDate)).append("\n");
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

