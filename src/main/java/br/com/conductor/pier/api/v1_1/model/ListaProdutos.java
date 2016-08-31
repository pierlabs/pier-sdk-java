package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import br.com.conductor.pier.api.v1_1.model.Produto;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * Lista de Produtos
 **/

@ApiModel(description = "Lista de Produtos")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ListaProdutos   {
  
  private List<Produto> produtos = new ArrayList<Produto>();

  
  /**
   * Lista de produtos
   **/
  public ListaProdutos produtos(List<Produto> produtos) {
    this.produtos = produtos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de produtos")
  @JsonProperty("produtos")
  public List<Produto> getProdutos() {
    return produtos;
  }
  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListaProdutos listaProdutos = (ListaProdutos) o;
    return Objects.equals(this.produtos, listaProdutos.produtos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(produtos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaProdutos {\n");
    
    sb.append("    produtos: ").append(toIndentedString(produtos)).append("\n");
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



