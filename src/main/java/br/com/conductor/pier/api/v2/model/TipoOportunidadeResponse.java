package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{tipo_oportunidade_response_description}}}
 **/

@ApiModel(description = "{{{tipo_oportunidade_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoOportunidadeResponse   {
  
  private Long id = null;
  private String descricao = null;
  private Boolean flagAtivo = null;

  
  /**
   * {{{tipo_oportunidade_response_id_value}}}
   **/
  public TipoOportunidadeResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{tipo_oportunidade_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{tipo_oportunidade_response_descricao_value}}}
   **/
  public TipoOportunidadeResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{tipo_oportunidade_response_descricao_value}}}")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{tipo_oportunidade_response_flag_ativo_value}}}
   **/
  public TipoOportunidadeResponse flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "true", required = true, value = "{{{tipo_oportunidade_response_flag_ativo_value}}}")
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



