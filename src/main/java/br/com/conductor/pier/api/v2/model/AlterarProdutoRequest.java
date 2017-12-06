package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da requisi\u00C3\u00A7\u00C3\u00A3o do  recurso Dispositivo
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da requisi\u00C3\u00A7\u00C3\u00A3o do  recurso Dispositivo")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AlterarProdutoRequest   {
  
  private Long idProduto = null;
  private Long idOrigemComercial = null;
  private Long idEstabelecimento = null;
  private Long idPromotor = null;

  
  /**
   * C\u00C3\u00B3digo identificador do produto.
   **/
  public AlterarProdutoRequest idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo identificador do produto.")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da origem comercial.
   **/
  public AlterarProdutoRequest idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da origem comercial.")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Deve ser preenchido com o idEstabelecimento onde o Grade foi realizado. Quando n\u00C3\u00A3o informado, \u00C3\u00A9 gravado com o idEstabelecimento associado a Origem Comercial que capturou o cadastro inicial da Conta.
   **/
  public AlterarProdutoRequest idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Deve ser preenchido com o idEstabelecimento onde o Grade foi realizado. Quando n\u00C3\u00A3o informado, \u00C3\u00A9 gravado com o idEstabelecimento associado a Origem Comercial que capturou o cadastro inicial da Conta.")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Deve ser preenchido com o C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Promotor que realizou o Grade. Quando n\u00C3\u00A3o informado, ser\u00C3\u00A1 gravado com um c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o padr\u00C3\u00A3o.
   **/
  public AlterarProdutoRequest idPromotor(Long idPromotor) {
    this.idPromotor = idPromotor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Deve ser preenchido com o C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Promotor que realizou o Grade. Quando n\u00C3\u00A3o informado, ser\u00C3\u00A1 gravado com um c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o padr\u00C3\u00A3o.")
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



