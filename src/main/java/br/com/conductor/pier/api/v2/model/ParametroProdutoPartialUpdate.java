package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Parameters used in the product parameter partial update
 **/

@ApiModel(description = "Parameters used in the product parameter partial update")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ParametroProdutoPartialUpdate   {
  
  private String dataValidade = null;
  private String descricao = null;
  private String valorParametro = null;

  
  /**
   * Product parameter expiration date
   **/
  public ParametroProdutoPartialUpdate dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "2020-12-31T00:00:00.000Z", value = "Product parameter expiration date")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Description of the product parameter
   **/
  public ParametroProdutoPartialUpdate descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "Parâmetro exemplo do parâmetro de produto", value = "Description of the product parameter")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Product parameter value
   **/
  public ParametroProdutoPartialUpdate valorParametro(String valorParametro) {
    this.valorParametro = valorParametro;
    return this;
  }
  
  @ApiModelProperty(example = "150.50", value = "Product parameter value")
  @JsonProperty("valorParametro")
  public String getValorParametro() {
    return valorParametro;
  }
  public void setValorParametro(String valorParametro) {
    this.valorParametro = valorParametro;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParametroProdutoPartialUpdate parametroProdutoPartialUpdate = (ParametroProdutoPartialUpdate) o;
    return Objects.equals(this.dataValidade, parametroProdutoPartialUpdate.dataValidade) &&
        Objects.equals(this.descricao, parametroProdutoPartialUpdate.descricao) &&
        Objects.equals(this.valorParametro, parametroProdutoPartialUpdate.valorParametro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataValidade, descricao, valorParametro);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametroProdutoPartialUpdate {\n");
    
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    valorParametro: ").append(toIndentedString(valorParametro)).append("\n");
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

