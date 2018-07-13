package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CdtDetalheOportunidadeAUD   {
  
  private String conteudo = null;
  private Long id = null;
  private Long idOportunidade = null;
  private String nomeCampo = null;
  private Long rev = null;
  private String revDate = null;
  private Long revOportunidade = null;
  private Long revType = null;
  private String revUser = null;

  
  /**
   **/
  public CdtDetalheOportunidadeAUD conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conteudo")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   **/
  public CdtDetalheOportunidadeAUD id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  public CdtDetalheOportunidadeAUD idOportunidade(Long idOportunidade) {
    this.idOportunidade = idOportunidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idOportunidade")
  public Long getIdOportunidade() {
    return idOportunidade;
  }
  public void setIdOportunidade(Long idOportunidade) {
    this.idOportunidade = idOportunidade;
  }

  
  /**
   **/
  public CdtDetalheOportunidadeAUD nomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nomeCampo")
  public String getNomeCampo() {
    return nomeCampo;
  }
  public void setNomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
  }

  
  /**
   **/
  public CdtDetalheOportunidadeAUD rev(Long rev) {
    this.rev = rev;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("rev")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   **/
  public CdtDetalheOportunidadeAUD revDate(String revDate) {
    this.revDate = revDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("revDate")
  public String getRevDate() {
    return revDate;
  }
  public void setRevDate(String revDate) {
    this.revDate = revDate;
  }

  
  /**
   **/
  public CdtDetalheOportunidadeAUD revOportunidade(Long revOportunidade) {
    this.revOportunidade = revOportunidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("revOportunidade")
  public Long getRevOportunidade() {
    return revOportunidade;
  }
  public void setRevOportunidade(Long revOportunidade) {
    this.revOportunidade = revOportunidade;
  }

  
  /**
   **/
  public CdtDetalheOportunidadeAUD revType(Long revType) {
    this.revType = revType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("revType")
  public Long getRevType() {
    return revType;
  }
  public void setRevType(Long revType) {
    this.revType = revType;
  }

  
  /**
   **/
  public CdtDetalheOportunidadeAUD revUser(String revUser) {
    this.revUser = revUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("revUser")
  public String getRevUser() {
    return revUser;
  }
  public void setRevUser(String revUser) {
    this.revUser = revUser;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdtDetalheOportunidadeAUD cdtDetalheOportunidadeAUD = (CdtDetalheOportunidadeAUD) o;
    return Objects.equals(this.conteudo, cdtDetalheOportunidadeAUD.conteudo) &&
        Objects.equals(this.id, cdtDetalheOportunidadeAUD.id) &&
        Objects.equals(this.idOportunidade, cdtDetalheOportunidadeAUD.idOportunidade) &&
        Objects.equals(this.nomeCampo, cdtDetalheOportunidadeAUD.nomeCampo) &&
        Objects.equals(this.rev, cdtDetalheOportunidadeAUD.rev) &&
        Objects.equals(this.revDate, cdtDetalheOportunidadeAUD.revDate) &&
        Objects.equals(this.revOportunidade, cdtDetalheOportunidadeAUD.revOportunidade) &&
        Objects.equals(this.revType, cdtDetalheOportunidadeAUD.revType) &&
        Objects.equals(this.revUser, cdtDetalheOportunidadeAUD.revUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conteudo, id, idOportunidade, nomeCampo, rev, revDate, revOportunidade, revType, revUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdtDetalheOportunidadeAUD {\n");
    
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idOportunidade: ").append(toIndentedString(idOportunidade)).append("\n");
    sb.append("    nomeCampo: ").append(toIndentedString(nomeCampo)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    revDate: ").append(toIndentedString(revDate)).append("\n");
    sb.append("    revOportunidade: ").append(toIndentedString(revOportunidade)).append("\n");
    sb.append("    revType: ").append(toIndentedString(revType)).append("\n");
    sb.append("    revUser: ").append(toIndentedString(revUser)).append("\n");
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



