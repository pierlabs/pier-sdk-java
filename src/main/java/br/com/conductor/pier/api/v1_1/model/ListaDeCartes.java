package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import br.com.conductor.pier.api.v1_1.model.CartaoResponse;
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
public class ListaDeCartes   {
  
  private List<CartaoResponse> cartoes = new ArrayList<CartaoResponse>();

  
  /**
   * Lista de cart\u00C3\u00B5es
   **/
  public ListaDeCartes cartoes(List<CartaoResponse> cartoes) {
    this.cartoes = cartoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de cart\u00C3\u00B5es")
  @JsonProperty("cartoes")
  public List<CartaoResponse> getCartoes() {
    return cartoes;
  }
  public void setCartoes(List<CartaoResponse> cartoes) {
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
    ListaDeCartes listaDeCartes = (ListaDeCartes) o;
    return Objects.equals(this.cartoes, listaDeCartes.cartoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaDeCartes {\n");
    
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



