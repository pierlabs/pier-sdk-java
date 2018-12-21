package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Response representation of the TypeOpportunityAUD resource
 **/

@ApiModel(description = "Response representation of the TypeOpportunityAUD resource")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoOportunidadeAUDResponse   {
  
  private Long rev = null;
  private Long revType = null;
  private String revDate = null;
  private Long id = null;
  private String descricao = null;
  private Boolean flagAtivo = null;

  
  /**
   * Identifier code of the auditorial of the opportunity types
   **/
  public TipoOportunidadeAUDResponse rev(Long rev) {
    this.rev = rev;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier code of the auditorial of the opportunity types")
  @JsonProperty("rev")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * Code that represents the type of action made in theh resource of opportunity types
   **/
  public TipoOportunidadeAUDResponse revType(Long revType) {
    this.revType = revType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Code that represents the type of action made in theh resource of opportunity types")
  @JsonProperty("revType")
  public Long getRevType() {
    return revType;
  }
  public void setRevType(Long revType) {
    this.revType = revType;
  }

  
  /**
   * Action date of the resource of opportunity types
   **/
  public TipoOportunidadeAUDResponse revDate(String revDate) {
    this.revDate = revDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action date of the resource of opportunity types")
  @JsonProperty("revDate")
  public String getRevDate() {
    return revDate;
  }
  public void setRevDate(String revDate) {
    this.revDate = revDate;
  }

  
  /**
   * Identifier Code of the opportunity type which was made the action
   **/
  public TipoOportunidadeAUDResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier Code of the opportunity type which was made the action")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Description of the opportunity type which was made the action
   **/
  public TipoOportunidadeAUDResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the opportunity type which was made the action")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Attributed that represent if the opportunity type is active
   **/
  public TipoOportunidadeAUDResponse flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Attributed that represent if the opportunity type is active")
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

