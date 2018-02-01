package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Tipo de moeda
 **/

@ApiModel(description = "Tipo de moeda")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class MoedaResponse   {
  
  private Long id = null;
  private String codigoMoeda = null;
  private String simbolo = null;
  private String descricao = null;

  
  /**
   * Identificador do tipo de moeda.
   **/
  public MoedaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do tipo de moeda.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do tipo de moeda.
   **/
  public MoedaResponse codigoMoeda(String codigoMoeda) {
    this.codigoMoeda = codigoMoeda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do tipo de moeda.")
  @JsonProperty("codigoMoeda")
  public String getCodigoMoeda() {
    return codigoMoeda;
  }
  public void setCodigoMoeda(String codigoMoeda) {
    this.codigoMoeda = codigoMoeda;
  }

  
  /**
   * S\u00C3\u00ADmbolo da Moeda.
   **/
  public MoedaResponse simbolo(String simbolo) {
    this.simbolo = simbolo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "S\u00C3\u00ADmbolo da Moeda.")
  @JsonProperty("simbolo")
  public String getSimbolo() {
    return simbolo;
  }
  public void setSimbolo(String simbolo) {
    this.simbolo = simbolo;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do tipo da moeda.
   **/
  public MoedaResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do tipo da moeda.")
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
    MoedaResponse moedaResponse = (MoedaResponse) o;
    return Objects.equals(this.id, moedaResponse.id) &&
        Objects.equals(this.codigoMoeda, moedaResponse.codigoMoeda) &&
        Objects.equals(this.simbolo, moedaResponse.simbolo) &&
        Objects.equals(this.descricao, moedaResponse.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codigoMoeda, simbolo, descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoedaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    codigoMoeda: ").append(toIndentedString(codigoMoeda)).append("\n");
    sb.append("    simbolo: ").append(toIndentedString(simbolo)).append("\n");
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

