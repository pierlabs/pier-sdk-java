package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Object of response to the installment agreement
 **/

@ApiModel(description = "Object of response to the installment agreement")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PaymentAgreementAgreement   {
  
  private BigDecimal percentualEntrada = null;
  private BigDecimal percentualDesconto = null;
  private BigDecimal valorDesconto = null;
  private BigDecimal valorLiquido = null;
  private BigDecimal valorEntrada = null;
  private BigDecimal valorParcela = null;
  private BigDecimal valorPrimeiraParcela = null;

  
  /**
   * Value of the entry percentage of the agreement
   **/
  public PaymentAgreementAgreement percentualEntrada(BigDecimal percentualEntrada) {
    this.percentualEntrada = percentualEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the entry percentage of the agreement")
  @JsonProperty("percentualEntrada")
  public BigDecimal getPercentualEntrada() {
    return percentualEntrada;
  }
  public void setPercentualEntrada(BigDecimal percentualEntrada) {
    this.percentualEntrada = percentualEntrada;
  }

  
  /**
   * Value of the discount percentage of the agreement
   **/
  public PaymentAgreementAgreement percentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the discount percentage of the agreement")
  @JsonProperty("percentualDesconto")
  public BigDecimal getPercentualDesconto() {
    return percentualDesconto;
  }
  public void setPercentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
  }

  
  /**
   * Amount discount amount
   **/
  public PaymentAgreementAgreement valorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Amount discount amount")
  @JsonProperty("valorDesconto")
  public BigDecimal getValorDesconto() {
    return valorDesconto;
  }
  public void setValorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  
  /**
   * Net value of the agreement
   **/
  public PaymentAgreementAgreement valorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Net value of the agreement")
  @JsonProperty("valorLiquido")
  public BigDecimal getValorLiquido() {
    return valorLiquido;
  }
  public void setValorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
  }

  
  /**
   * Value of agreement
   **/
  public PaymentAgreementAgreement valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of agreement")
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Amount of the agreement
   **/
  public PaymentAgreementAgreement valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Amount of the agreement")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Value of the first installment of the agreement
   **/
  public PaymentAgreementAgreement valorPrimeiraParcela(BigDecimal valorPrimeiraParcela) {
    this.valorPrimeiraParcela = valorPrimeiraParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the first installment of the agreement")
  @JsonProperty("valorPrimeiraParcela")
  public BigDecimal getValorPrimeiraParcela() {
    return valorPrimeiraParcela;
  }
  public void setValorPrimeiraParcela(BigDecimal valorPrimeiraParcela) {
    this.valorPrimeiraParcela = valorPrimeiraParcela;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAgreementAgreement paymentAgreementAgreement = (PaymentAgreementAgreement) o;
    return Objects.equals(this.percentualEntrada, paymentAgreementAgreement.percentualEntrada) &&
        Objects.equals(this.percentualDesconto, paymentAgreementAgreement.percentualDesconto) &&
        Objects.equals(this.valorDesconto, paymentAgreementAgreement.valorDesconto) &&
        Objects.equals(this.valorLiquido, paymentAgreementAgreement.valorLiquido) &&
        Objects.equals(this.valorEntrada, paymentAgreementAgreement.valorEntrada) &&
        Objects.equals(this.valorParcela, paymentAgreementAgreement.valorParcela) &&
        Objects.equals(this.valorPrimeiraParcela, paymentAgreementAgreement.valorPrimeiraParcela);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentualEntrada, percentualDesconto, valorDesconto, valorLiquido, valorEntrada, valorParcela, valorPrimeiraParcela);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAgreementAgreement {\n");
    
    sb.append("    percentualEntrada: ").append(toIndentedString(percentualEntrada)).append("\n");
    sb.append("    percentualDesconto: ").append(toIndentedString(percentualDesconto)).append("\n");
    sb.append("    valorDesconto: ").append(toIndentedString(valorDesconto)).append("\n");
    sb.append("    valorLiquido: ").append(toIndentedString(valorLiquido)).append("\n");
    sb.append("    valorEntrada: ").append(toIndentedString(valorEntrada)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    valorPrimeiraParcela: ").append(toIndentedString(valorPrimeiraParcela)).append("\n");
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

