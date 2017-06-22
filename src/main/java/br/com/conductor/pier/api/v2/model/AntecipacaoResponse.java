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
  private BigDecimal valorParcela = null;
  private BigDecimal valorDescontoTotal = null;
  private BigDecimal valorTotalComDesconto = null;
  private BigDecimal taxaDesconto = null;

  
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
   * Apresenta o numero total de parcelas da compra
   **/
  public AntecipacaoResponse quantidadeParcelasTotal(Long quantidadeParcelasTotal) {
    this.quantidadeParcelasTotal = quantidadeParcelasTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o numero total de parcelas da compra")
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
   * Apresenta o valor de cada parcela antecipadas
   **/
  public AntecipacaoResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o valor de cada parcela antecipadas")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Apresenta o valor total do desconto
   **/
  public AntecipacaoResponse valorDescontoTotal(BigDecimal valorDescontoTotal) {
    this.valorDescontoTotal = valorDescontoTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o valor total do desconto")
  @JsonProperty("valorDescontoTotal")
  public BigDecimal getValorDescontoTotal() {
    return valorDescontoTotal;
  }
  public void setValorDescontoTotal(BigDecimal valorDescontoTotal) {
    this.valorDescontoTotal = valorDescontoTotal;
  }

  
  /**
   * Apresenta o valor total com desconto
   **/
  public AntecipacaoResponse valorTotalComDesconto(BigDecimal valorTotalComDesconto) {
    this.valorTotalComDesconto = valorTotalComDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o valor total com desconto")
  @JsonProperty("valorTotalComDesconto")
  public BigDecimal getValorTotalComDesconto() {
    return valorTotalComDesconto;
  }
  public void setValorTotalComDesconto(BigDecimal valorTotalComDesconto) {
    this.valorTotalComDesconto = valorTotalComDesconto;
  }

  
  /**
   * Apresenta a taxa de desconto
   **/
  public AntecipacaoResponse taxaDesconto(BigDecimal taxaDesconto) {
    this.taxaDesconto = taxaDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a taxa de desconto")
  @JsonProperty("taxaDesconto")
  public BigDecimal getTaxaDesconto() {
    return taxaDesconto;
  }
  public void setTaxaDesconto(BigDecimal taxaDesconto) {
    this.taxaDesconto = taxaDesconto;
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
        Objects.equals(this.valorParcela, antecipacaoResponse.valorParcela) &&
        Objects.equals(this.valorDescontoTotal, antecipacaoResponse.valorDescontoTotal) &&
        Objects.equals(this.valorTotalComDesconto, antecipacaoResponse.valorTotalComDesconto) &&
        Objects.equals(this.taxaDesconto, antecipacaoResponse.taxaDesconto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, idCompra, quantidadeParcelasTotal, quantidadeParcelasAntecipadas, valorParcela, valorDescontoTotal, valorTotalComDesconto, taxaDesconto);
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
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    valorDescontoTotal: ").append(toIndentedString(valorDescontoTotal)).append("\n");
    sb.append("    valorTotalComDesconto: ").append(toIndentedString(valorTotalComDesconto)).append("\n");
    sb.append("    taxaDesconto: ").append(toIndentedString(taxaDesconto)).append("\n");
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



