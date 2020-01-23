package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de resposta do tipo de benef\u00EDcio
 **/

@ApiModel(description = "Objeto de resposta do tipo de benef\u00EDcio")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoBeneficioResponse   {
  
  private Long id = null;
  private String descricao = null;

  
  /**
   * Identificador do tipo de benef\u00EDcio
   **/
  public TipoBeneficioResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do tipo de benef\u00EDcio")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de benef\u00EDcio
   **/
  public TipoBeneficioResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do tipo de benef\u00EDcio")
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
    TipoBeneficioResponse tipoBeneficioResponse = (TipoBeneficioResponse) o;
    return Objects.equals(this.id, tipoBeneficioResponse.id) &&
        Objects.equals(this.descricao, tipoBeneficioResponse.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoBeneficioResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

