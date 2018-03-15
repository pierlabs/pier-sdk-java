package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de Resposta da Entidade
 **/

@ApiModel(description = "Objeto de Resposta da Entidade")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EntidadeResponse   {
  
  private Long id = null;
  private String descricao = null;
  private Boolean flagAtivo = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da entidade.
   **/
  public EntidadeResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da entidade.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o da entidade.
   **/
  public EntidadeResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o da entidade.")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag que indica se a entidade est\u00E1 ativa.
   **/
  public EntidadeResponse flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se a entidade est\u00E1 ativa.")
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
    EntidadeResponse entidadeResponse = (EntidadeResponse) o;
    return Objects.equals(this.id, entidadeResponse.id) &&
        Objects.equals(this.descricao, entidadeResponse.descricao) &&
        Objects.equals(this.flagAtivo, entidadeResponse.flagAtivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, flagAtivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntidadeResponse {\n");
    
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

