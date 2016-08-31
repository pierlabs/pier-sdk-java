package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import br.com.conductor.pier.api.v1_1.model.Cartao;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * Lista de Cart\u00C3\u00B5es
 **/

@ApiModel(description = "Lista de Cart\u00C3\u00B5es")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ListaCartoes   {
  
  private List<Cartao> cartoes = new ArrayList<Cartao>();

  
  /**
   * Lista de cart\u00C3\u00B5es
   **/
  public ListaCartoes cartoes(List<Cartao> cartoes) {
    this.cartoes = cartoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de cart\u00C3\u00B5es")
  @JsonProperty("cartoes")
  public List<Cartao> getCartoes() {
    return cartoes;
  }
  public void setCartoes(List<Cartao> cartoes) {
    this.cartoes = cartoes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListaCartoes listaCartoes = (ListaCartoes) o;
    return Objects.equals(this.cartoes, listaCartoes.cartoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaCartoes {\n");
    
    sb.append("    cartoes: ").append(toIndentedString(cartoes)).append("\n");
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



