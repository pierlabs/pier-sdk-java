package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{moeda_response_description}}}
 **/

@ApiModel(description = "{{{moeda_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class MoedaResponse   {
  
  private Long id = null;
  private String codigoMoeda = null;
  private String simbolo = null;
  private String descricao = null;

  
  /**
   * {{{moeda_response_id_value}}}
   **/
  public MoedaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{moeda_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{moeda_response_codigo_moeda_value}}}
   **/
  public MoedaResponse codigoMoeda(String codigoMoeda) {
    this.codigoMoeda = codigoMoeda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{moeda_response_codigo_moeda_value}}}")
  @JsonProperty("codigoMoeda")
  public String getCodigoMoeda() {
    return codigoMoeda;
  }
  public void setCodigoMoeda(String codigoMoeda) {
    this.codigoMoeda = codigoMoeda;
  }

  
  /**
   * {{{moeda_response_simbolo_value}}}
   **/
  public MoedaResponse simbolo(String simbolo) {
    this.simbolo = simbolo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{moeda_response_simbolo_value}}}")
  @JsonProperty("simbolo")
  public String getSimbolo() {
    return simbolo;
  }
  public void setSimbolo(String simbolo) {
    this.simbolo = simbolo;
  }

  
  /**
   * {{{moeda_response_descricao_value}}}
   **/
  public MoedaResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{moeda_response_descricao_value}}}")
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



