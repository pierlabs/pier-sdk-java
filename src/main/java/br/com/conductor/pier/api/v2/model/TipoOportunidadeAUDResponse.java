package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{tipo_oportunidade_a_u_d_response_description}}}
 **/

@ApiModel(description = "{{{tipo_oportunidade_a_u_d_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoOportunidadeAUDResponse   {
  
  private Long rev = null;
  private Long revType = null;
  private String revDate = null;
  private Long id = null;
  private String descricao = null;
  private Boolean flagAtivo = null;

  
  /**
   * {{{tipo_oportunidade_a_u_d_response_rev_value}}}
   **/
  public TipoOportunidadeAUDResponse rev(Long rev) {
    this.rev = rev;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_oportunidade_a_u_d_response_rev_value}}}")
  @JsonProperty("rev")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * {{{tipo_oportunidade_a_u_d_response_rev_type_value}}}
   **/
  public TipoOportunidadeAUDResponse revType(Long revType) {
    this.revType = revType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_oportunidade_a_u_d_response_rev_type_value}}}")
  @JsonProperty("revType")
  public Long getRevType() {
    return revType;
  }
  public void setRevType(Long revType) {
    this.revType = revType;
  }

  
  /**
   * {{{tipo_oportunidade_a_u_d_response_rev_date_value}}}
   **/
  public TipoOportunidadeAUDResponse revDate(String revDate) {
    this.revDate = revDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_oportunidade_a_u_d_response_rev_date_value}}}")
  @JsonProperty("revDate")
  public String getRevDate() {
    return revDate;
  }
  public void setRevDate(String revDate) {
    this.revDate = revDate;
  }

  
  /**
   * {{{tipo_oportunidade_a_u_d_response_id_value}}}
   **/
  public TipoOportunidadeAUDResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_oportunidade_a_u_d_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{tipo_oportunidade_a_u_d_response_descricao_value}}}
   **/
  public TipoOportunidadeAUDResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_oportunidade_a_u_d_response_descricao_value}}}")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{tipo_oportunidade_a_u_d_response_flag_ativo_value}}}
   **/
  public TipoOportunidadeAUDResponse flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{tipo_oportunidade_a_u_d_response_flag_ativo_value}}}")
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
    TipoOportunidadeAUDResponse tipoOportunidadeAUDResponse = (TipoOportunidadeAUDResponse) o;
    return Objects.equals(this.rev, tipoOportunidadeAUDResponse.rev) &&
        Objects.equals(this.revType, tipoOportunidadeAUDResponse.revType) &&
        Objects.equals(this.revDate, tipoOportunidadeAUDResponse.revDate) &&
        Objects.equals(this.id, tipoOportunidadeAUDResponse.id) &&
        Objects.equals(this.descricao, tipoOportunidadeAUDResponse.descricao) &&
        Objects.equals(this.flagAtivo, tipoOportunidadeAUDResponse.flagAtivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rev, revType, revDate, id, descricao, flagAtivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOportunidadeAUDResponse {\n");
    
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    revType: ").append(toIndentedString(revType)).append("\n");
    sb.append("    revDate: ").append(toIndentedString(revDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

