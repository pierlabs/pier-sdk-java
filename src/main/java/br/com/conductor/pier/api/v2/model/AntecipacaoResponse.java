package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AntecipacaoResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Long idCompra = null;
  private Long quantidadeParcelasTotal = null;
  private Long quantidadeParcelasAntecipadas = null;
  private BigDecimal valorParcelas = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da antecipa\u00C3\u00A7\u00C3\u00A3o
   **/
  public AntecipacaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da antecipa\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta
   **/
  public AntecipacaoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da compra
   **/
  public AntecipacaoResponse idCompra(Long idCompra) {
    this.idCompra = idCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da compra")
  @JsonProperty("idCompra")
  public Long getIdCompra() {
    return idCompra;
  }
  public void setIdCompra(Long idCompra) {
    this.idCompra = idCompra;
  }

  
  /**
   * Apresenta o numero total de parcelas da comprae
   **/
  public AntecipacaoResponse quantidadeParcelasTotal(Long quantidadeParcelasTotal) {
    this.quantidadeParcelasTotal = quantidadeParcelasTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o numero total de parcelas da comprae")
  @JsonProperty("quantidadeParcelasTotal")
  public Long getQuantidadeParcelasTotal() {
    return quantidadeParcelasTotal;
  }
  public void setQuantidadeParcelasTotal(Long quantidadeParcelasTotal) {
    this.quantidadeParcelasTotal = quantidadeParcelasTotal;
  }

  
  /**
   * Apresenta o numero de parcelas antecipadas
   **/
  public AntecipacaoResponse quantidadeParcelasAntecipadas(Long quantidadeParcelasAntecipadas) {
    this.quantidadeParcelasAntecipadas = quantidadeParcelasAntecipadas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o numero de parcelas antecipadas")
  @JsonProperty("quantidadeParcelasAntecipadas")
  public Long getQuantidadeParcelasAntecipadas() {
    return quantidadeParcelasAntecipadas;
  }
  public void setQuantidadeParcelasAntecipadas(Long quantidadeParcelasAntecipadas) {
    this.quantidadeParcelasAntecipadas = quantidadeParcelasAntecipadas;
  }

  
  /**
   * Apresenta o valor das parcelas efetivadas
   **/
  public AntecipacaoResponse valorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o valor das parcelas efetivadas")
  @JsonProperty("valorParcelas")
  public BigDecimal getValorParcelas() {
    return valorParcelas;
  }
  public void setValorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntecipacaoResponse antecipacaoResponse = (AntecipacaoResponse) o;
    return Objects.equals(this.id, antecipacaoResponse.id) &&
        Objects.equals(this.idConta, antecipacaoResponse.idConta) &&
        Objects.equals(this.idCompra, antecipacaoResponse.idCompra) &&
        Objects.equals(this.quantidadeParcelasTotal, antecipacaoResponse.quantidadeParcelasTotal) &&
        Objects.equals(this.quantidadeParcelasAntecipadas, antecipacaoResponse.quantidadeParcelasAntecipadas) &&
        Objects.equals(this.valorParcelas, antecipacaoResponse.valorParcelas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, idCompra, quantidadeParcelasTotal, quantidadeParcelasAntecipadas, valorParcelas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntecipacaoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idCompra: ").append(toIndentedString(idCompra)).append("\n");
    sb.append("    quantidadeParcelasTotal: ").append(toIndentedString(quantidadeParcelasTotal)).append("\n");
    sb.append("    quantidadeParcelasAntecipadas: ").append(toIndentedString(quantidadeParcelasAntecipadas)).append("\n");
    sb.append("    valorParcelas: ").append(toIndentedString(valorParcelas)).append("\n");
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



