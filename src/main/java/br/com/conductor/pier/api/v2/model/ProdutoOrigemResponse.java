package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o da resposta dos produtosOrigem do recurso de Origem Comercial
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta dos produtosOrigem do recurso de Origem Comercial")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ProdutoOrigemResponse   {
  
  private Long idProduto = null;

  
  /**
   * C\u00F3digo identificador do produto
   **/
  public ProdutoOrigemResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do produto")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProdutoOrigemResponse produtoOrigemResponse = (ProdutoOrigemResponse) o;
    return Objects.equals(this.idProduto, produtoOrigemResponse.idProduto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProdutoOrigemResponse {\n");
    
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
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

