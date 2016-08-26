package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import br.com.conductor.pier.api.v1_1.model.CartaoResponseOld;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConsultarCartaoResponse   {
  
  private List<CartaoResponseOld> cartoes = new ArrayList<CartaoResponseOld>();
  private Integer codigoRetorno = null;
  private String descricaoRetorno = null;

  
  /**
   **/
  public ConsultarCartaoResponse cartoes(List<CartaoResponseOld> cartoes) {
    this.cartoes = cartoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cartoes")
  public List<CartaoResponseOld> getCartoes() {
    return cartoes;
  }
  public void setCartoes(List<CartaoResponseOld> cartoes) {
    this.cartoes = cartoes;
  }

  
  /**
   **/
  public ConsultarCartaoResponse codigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codigoRetorno")
  public Integer getCodigoRetorno() {
    return codigoRetorno;
  }
  public void setCodigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
  }

  
  /**
   **/
  public ConsultarCartaoResponse descricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("descricaoRetorno")
  public String getDescricaoRetorno() {
    return descricaoRetorno;
  }
  public void setDescricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultarCartaoResponse consultarCartaoResponse = (ConsultarCartaoResponse) o;
    return Objects.equals(this.cartoes, consultarCartaoResponse.cartoes) &&
        Objects.equals(this.codigoRetorno, consultarCartaoResponse.codigoRetorno) &&
        Objects.equals(this.descricaoRetorno, consultarCartaoResponse.descricaoRetorno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartoes, codigoRetorno, descricaoRetorno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarCartaoResponse {\n");
    
    sb.append("    cartoes: ").append(toIndentedString(cartoes)).append("\n");
    sb.append("    codigoRetorno: ").append(toIndentedString(codigoRetorno)).append("\n");
    sb.append("    descricaoRetorno: ").append(toIndentedString(descricaoRetorno)).append("\n");
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



