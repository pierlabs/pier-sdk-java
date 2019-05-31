package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa a requisi\u00E7\u00E3o do recurso de cadastro de um tipo de v\u00EDnculo
 **/

@ApiModel(description = "Representa a requisi\u00E7\u00E3o do recurso de cadastro de um tipo de v\u00EDnculo")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoVinculoContaPersist   {
  
  private String descricao = null;

  
  /**
   * Descri\u00E7\u00E3o do tipo de v\u00EDnculo
   **/
  public TipoVinculoContaPersist descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do tipo de v\u00EDnculo")
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
    TipoVinculoContaPersist tipoVinculoContaPersist = (TipoVinculoContaPersist) o;
    return Objects.equals(this.descricao, tipoVinculoContaPersist.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoVinculoContaPersist {\n");
    
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

