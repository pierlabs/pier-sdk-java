package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{alterar_produto_request_description}}}
 **/

@ApiModel(description = "{{{alterar_produto_request_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AlterarProdutoRequest   {
  
  private Long idProduto = null;
  private Long idOrigemComercial = null;
  private Long idEstabelecimento = null;
  private Long idPromotor = null;

  
  /**
   * {{{alterar_produto_request_id_produto_value}}}
   **/
  public AlterarProdutoRequest idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{alterar_produto_request_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{alterar_produto_request_id_origem_comercial_value}}}
   **/
  public AlterarProdutoRequest idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{alterar_produto_request_id_origem_comercial_value}}}")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{alterar_produto_request_id_estabelecimento_value}}}
   **/
  public AlterarProdutoRequest idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{alterar_produto_request_id_estabelecimento_value}}}")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{alterar_produto_request_id_promotor_value}}}
   **/
  public AlterarProdutoRequest idPromotor(Long idPromotor) {
    this.idPromotor = idPromotor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{alterar_produto_request_id_promotor_value}}}")
  @JsonProperty("idPromotor")
  public Long getIdPromotor() {
    return idPromotor;
  }
  public void setIdPromotor(Long idPromotor) {
    this.idPromotor = idPromotor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlterarProdutoRequest alterarProdutoRequest = (AlterarProdutoRequest) o;
    return Objects.equals(this.idProduto, alterarProdutoRequest.idProduto) &&
        Objects.equals(this.idOrigemComercial, alterarProdutoRequest.idOrigemComercial) &&
        Objects.equals(this.idEstabelecimento, alterarProdutoRequest.idEstabelecimento) &&
        Objects.equals(this.idPromotor, alterarProdutoRequest.idPromotor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduto, idOrigemComercial, idEstabelecimento, idPromotor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlterarProdutoRequest {\n");
    
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    idPromotor: ").append(toIndentedString(idPromotor)).append("\n");
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



