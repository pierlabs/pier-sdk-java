package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Campo Condificado
 **/

@ApiModel(description = "Objeto Campo Condificado")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CampoCodificadoDescricaoResponse   {
  
  private Long codigo = null;
  private String descricao = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da descri\u00E7\u00E3o.
   **/
  public CampoCodificadoDescricaoResponse codigo(Long codigo) {
    this.codigo = codigo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da descri\u00E7\u00E3o.")
  @JsonProperty("codigo")
  public Long getCodigo() {
    return codigo;
  }
  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Descri\u00E7\u00E3o do campo codificado.
   **/
  public CampoCodificadoDescricaoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do campo codificado.")
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
    CampoCodificadoDescricaoResponse campoCodificadoDescricaoResponse = (CampoCodificadoDescricaoResponse) o;
    return Objects.equals(this.codigo, campoCodificadoDescricaoResponse.codigo) &&
        Objects.equals(this.descricao, campoCodificadoDescricaoResponse.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampoCodificadoDescricaoResponse {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
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

