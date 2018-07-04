package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{campo_codificado_descricao_response_description}}}
 **/

@ApiModel(description = "{{{campo_codificado_descricao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CampoCodificadoDescricaoResponse   {
  
  private Long codigo = null;
  private String descricao = null;

  
  /**
   * {{{campo_codificado_descricao_response_codigo_value}}}
   **/
  public CampoCodificadoDescricaoResponse codigo(Long codigo) {
    this.codigo = codigo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{campo_codificado_descricao_response_codigo_value}}}")
  @JsonProperty("codigo")
  public Long getCodigo() {
    return codigo;
  }
  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  
  /**
   * {{{campo_codificado_descricao_response_descricao_value}}}
   **/
  public CampoCodificadoDescricaoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{campo_codificado_descricao_response_descricao_value}}}")
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



