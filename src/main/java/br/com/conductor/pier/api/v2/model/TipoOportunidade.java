package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto TipoOportunidade
 **/

@ApiModel(description = "Objeto TipoOportunidade")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoOportunidade   {
  
  private String descricao = null;
  private Boolean flagAtivo = null;

  
  /**
   * Descri\u00E7\u00E3o do tipo oportunidade
   **/
  public TipoOportunidade descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Descri\u00E7\u00E3o do tipo oportunidade")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag de verifica\u00E7\u00E3o se o tipo oportunidade est\u00E1 ativo
   **/
  public TipoOportunidade flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "Flag de verifica\u00E7\u00E3o se o tipo oportunidade est\u00E1 ativo")
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
    TipoOportunidade tipoOportunidade = (TipoOportunidade) o;
    return Objects.equals(this.descricao, tipoOportunidade.descricao) &&
        Objects.equals(this.flagAtivo, tipoOportunidade.flagAtivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao, flagAtivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOportunidade {\n");
    
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

