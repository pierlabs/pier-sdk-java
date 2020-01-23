package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * ObjetoMCC
 **/

@ApiModel(description = "ObjetoMCC")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class MCCResponse   {
  
  private Long id = null;
  private String descricao = null;
  private Long grupoMCCId = null;
  private String grupoMCCDescricao = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do MCC (id)
   **/
  public MCCResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do MCC (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * descricao do MCC
   **/
  public MCCResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "descricao do MCC")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * C\u00F3digo de indentifica\u00E7\u00E3o do grupo MCC
   **/
  public MCCResponse grupoMCCId(Long grupoMCCId) {
    this.grupoMCCId = grupoMCCId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de indentifica\u00E7\u00E3o do grupo MCC")
  @JsonProperty("grupoMCCId")
  public Long getGrupoMCCId() {
    return grupoMCCId;
  }
  public void setGrupoMCCId(Long grupoMCCId) {
    this.grupoMCCId = grupoMCCId;
  }

  
  /**
   * Descri\u00E7\u00E3o do grupo MCC
   **/
  public MCCResponse grupoMCCDescricao(String grupoMCCDescricao) {
    this.grupoMCCDescricao = grupoMCCDescricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do grupo MCC")
  @JsonProperty("grupoMCCDescricao")
  public String getGrupoMCCDescricao() {
    return grupoMCCDescricao;
  }
  public void setGrupoMCCDescricao(String grupoMCCDescricao) {
    this.grupoMCCDescricao = grupoMCCDescricao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MCCResponse mCCResponse = (MCCResponse) o;
    return Objects.equals(this.id, mCCResponse.id) &&
        Objects.equals(this.descricao, mCCResponse.descricao) &&
        Objects.equals(this.grupoMCCId, mCCResponse.grupoMCCId) &&
        Objects.equals(this.grupoMCCDescricao, mCCResponse.grupoMCCDescricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, grupoMCCId, grupoMCCDescricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MCCResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    grupoMCCId: ").append(toIndentedString(grupoMCCId)).append("\n");
    sb.append("    grupoMCCDescricao: ").append(toIndentedString(grupoMCCDescricao)).append("\n");
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

