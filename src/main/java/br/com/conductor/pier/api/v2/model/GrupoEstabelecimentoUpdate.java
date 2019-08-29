package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GrupoEstabelecimentoUpdate   {
  
  private String descricao = null;
  private Long idLayout = null;

  
  /**
   **/
  public GrupoEstabelecimentoUpdate descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   **/
  public GrupoEstabelecimentoUpdate idLayout(Long idLayout) {
    this.idLayout = idLayout;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
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
    GrupoEstabelecimentoUpdate grupoEstabelecimentoUpdate = (GrupoEstabelecimentoUpdate) o;
    return Objects.equals(this.descricao, grupoEstabelecimentoUpdate.descricao) &&
        Objects.equals(this.idLayout, grupoEstabelecimentoUpdate.idLayout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao, idLayout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoEstabelecimentoUpdate {\n");
    
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

