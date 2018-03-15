package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o da resposta do recurso TipoOportunidade
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso TipoOportunidade")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoOportunidadeResponse   {
  
  private Long id = null;
  private String descricao = null;
  private Boolean flagAtivo = null;

  
  /**
   * C\u00F3digo identificador do TipoOportunidade
   **/
  public TipoOportunidadeResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador do TipoOportunidade")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descricao do TipoOportunidade
   **/
  public TipoOportunidadeResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Descricao do TipoOportunidade")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag que representa se o tipo oportunidade est\u00E1 ativo
   **/
  public TipoOportunidadeResponse flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "true", required = true, value = "Flag que representa se o tipo oportunidade est\u00E1 ativo")
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
    TipoOportunidadeResponse tipoOportunidadeResponse = (TipoOportunidadeResponse) o;
    return Objects.equals(this.id, tipoOportunidadeResponse.id) &&
        Objects.equals(this.descricao, tipoOportunidadeResponse.descricao) &&
        Objects.equals(this.flagAtivo, tipoOportunidadeResponse.flagAtivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, flagAtivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOportunidadeResponse {\n");
    
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

