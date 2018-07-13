package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.CartaoImpressaoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{cartao_impressao_multiapp_response_description}}}
 **/

@ApiModel(description = "{{{cartao_impressao_multiapp_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CartaoMultiAppImpressaoResponse   {
  
  private CartaoImpressaoResponse cartaoPai = null;
  private CartaoImpressaoResponse cartao = null;

  
  /**
   * {{{cartao_impressao_multiapp_response_cartao_pai_value}}}
   **/
  public CartaoMultiAppImpressaoResponse cartaoPai(CartaoImpressaoResponse cartaoPai) {
    this.cartaoPai = cartaoPai;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_multiapp_response_cartao_pai_value}}}")
  @JsonProperty("cartaoPai")
  public CartaoImpressaoResponse getCartaoPai() {
    return cartaoPai;
  }
  public void setCartaoPai(CartaoImpressaoResponse cartaoPai) {
    this.cartaoPai = cartaoPai;
  }

  
  /**
   * {{{cartao_impressao_multiapp_response_cartao_filho_value}}}
   **/
  public CartaoMultiAppImpressaoResponse cartao(CartaoImpressaoResponse cartao) {
    this.cartao = cartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{cartao_impressao_multiapp_response_cartao_filho_value}}}")
  @JsonProperty("cartao")
  public CartaoImpressaoResponse getCartao() {
    return cartao;
  }
  public void setCartao(CartaoImpressaoResponse cartao) {
    this.cartao = cartao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartaoMultiAppImpressaoResponse cartaoMultiAppImpressaoResponse = (CartaoMultiAppImpressaoResponse) o;
    return Objects.equals(this.cartaoPai, cartaoMultiAppImpressaoResponse.cartaoPai) &&
        Objects.equals(this.cartao, cartaoMultiAppImpressaoResponse.cartao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartaoPai, cartao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoMultiAppImpressaoResponse {\n");
    
    sb.append("    cartaoPai: ").append(toIndentedString(cartaoPai)).append("\n");
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
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



