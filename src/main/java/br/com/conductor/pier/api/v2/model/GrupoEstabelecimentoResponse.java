package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o da resposta do recurso de grupo estabelecimento
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de grupo estabelecimento")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GrupoEstabelecimentoResponse   {
  
  private Long id = null;
  private String descricao = null;
  private Long idLayout = null;

  
  /**
   * C\u00F3digo identificador do grupo de estabelecimento
   **/
  public GrupoEstabelecimentoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do grupo de estabelecimento")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do grupo de estabelecimento
   **/
  public GrupoEstabelecimentoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do grupo de estabelecimento")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * idLayout
   **/
  public GrupoEstabelecimentoResponse idLayout(Long idLayout) {
    this.idLayout = idLayout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "idLayout")
  @JsonProperty("idLayout")
  public Long getIdLayout() {
    return idLayout;
  }
  public void setIdLayout(Long idLayout) {
    this.idLayout = idLayout;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrupoEstabelecimentoResponse grupoEstabelecimentoResponse = (GrupoEstabelecimentoResponse) o;
    return Objects.equals(this.id, grupoEstabelecimentoResponse.id) &&
        Objects.equals(this.descricao, grupoEstabelecimentoResponse.descricao) &&
        Objects.equals(this.idLayout, grupoEstabelecimentoResponse.idLayout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, idLayout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoEstabelecimentoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    idLayout: ").append(toIndentedString(idLayout)).append("\n");
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

