package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Par\u00E2metros utilizados na altera\u00E7\u00E3o parcial de par\u00E2metros de produto 
 **/

@ApiModel(description = "Par\u00E2metros utilizados na altera\u00E7\u00E3o parcial de par\u00E2metros de produto ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ParametroProdutoPartialUpdate   {
  
  private String dataValidade = null;
  private String descricao = null;
  private String valorParametro = null;

  
  /**
   * Data de validade do par\u00E2metro de produto
   **/
  public ParametroProdutoPartialUpdate dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "2020-12-31T00:00:00.000Z", value = "Data de validade do par\u00E2metro de produto")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Descri\u00E7\u00E3o do par\u00E2metro de produto
   **/
  public ParametroProdutoPartialUpdate descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "Parâmetro exemplo do parâmetro de produto", value = "Descri\u00E7\u00E3o do par\u00E2metro de produto")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Valor do par\u00E2metro do produto
   **/
  public ParametroProdutoPartialUpdate valorParametro(String valorParametro) {
    this.valorParametro = valorParametro;
    return this;
  }
  
  @ApiModelProperty(example = "150.50", value = "Valor do par\u00E2metro do produto")
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

