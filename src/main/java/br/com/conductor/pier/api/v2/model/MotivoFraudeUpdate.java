package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o da requisi\u00E7\u00E3o de atualiza\u00E7\u00E3o do motivo fraude
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da requisi\u00E7\u00E3o de atualiza\u00E7\u00E3o do motivo fraude")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class MotivoFraudeUpdate   {
  
  private String descricao = null;

  
  /**
   * Descri\u00E7\u00E3o motivo fraude
   **/
  public MotivoFraudeUpdate descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o motivo fraude")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MotivoFraudeUpdate motivoFraudeUpdate = (MotivoFraudeUpdate) o;
    return Objects.equals(this.descricao, motivoFraudeUpdate.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MotivoFraudeUpdate {\n");
    
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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

