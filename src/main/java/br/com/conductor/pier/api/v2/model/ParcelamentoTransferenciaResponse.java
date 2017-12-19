package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * Detalhe do plano de parcelamento para Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias
 **/

@ApiModel(description = "Detalhe do plano de parcelamento para Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ParcelamentoTransferenciaResponse   {
  
  private String numeroParcela = null;
  private BigDecimal valorPrimeiraParcela = null;
  private BigDecimal valorDemaisParcelas = null;
  private BigDecimal valorTotal = null;
  private BigDecimal valorTAC = null;
  private BigDecimal valorIOF = null;
  private BigDecimal taxaJuros = null;
  private BigDecimal cetAnual = null;

  
  /**
   * N\u00C3\u00BAmero de parcelas dispon\u00C3\u00ADveis.
   **/
  public ParcelamentoTransferenciaResponse numeroParcela(String numeroParcela) {
    this.numeroParcela = numeroParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero de parcelas dispon\u00C3\u00ADveis.")
  @JsonProperty("numeroParcela")
  public String getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(String numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * Valor da primeira parcela.
   **/
  public ParcelamentoTransferenciaResponse valorPrimeiraParcela(BigDecimal valorPrimeiraParcela) {
    this.valorPrimeiraParcela = valorPrimeiraParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da primeira parcela.")
  @JsonProperty("valorPrimeiraParcela")
  public BigDecimal getValorPrimeiraParcela() {
    return valorPrimeiraParcela;
  }
  public void setValorPrimeiraParcela(BigDecimal valorPrimeiraParcela) {
    this.valorPrimeiraParcela = valorPrimeiraParcela;
  }

  
  /**
   * Valor das demais parcelas.
   **/
  public ParcelamentoTransferenciaResponse valorDemaisParcelas(BigDecimal valorDemaisParcelas) {
    this.valorDemaisParcelas = valorDemaisParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor das demais parcelas.")
  @JsonProperty("valorDemaisParcelas")
  public BigDecimal getValorDemaisParcelas() {
    return valorDemaisParcelas;
  }
  public void setValorDemaisParcelas(BigDecimal valorDemaisParcelas) {
    this.valorDemaisParcelas = valorDemaisParcelas;
  }

  
  /**
   * Valor total do financiamento.
   **/
  public ParcelamentoTransferenciaResponse valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total do financiamento.")
  @JsonProperty("valorTotal")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * Valor da tarifa de contrata\u00C3\u00A7\u00C3\u00A3o.
   **/
  public ParcelamentoTransferenciaResponse valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da tarifa de contrata\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * IOF
   **/
  public ParcelamentoTransferenciaResponse valorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IOF")
  @JsonProperty("valorIOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Valor da taxa de juros.
   **/
  public ParcelamentoTransferenciaResponse taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da taxa de juros.")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * CET anual.
   **/
  public ParcelamentoTransferenciaResponse cetAnual(BigDecimal cetAnual) {
    this.cetAnual = cetAnual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CET anual.")
  @JsonProperty("cetAnual")
  public BigDecimal getCetAnual() {
    return cetAnual;
  }
  public void setCetAnual(BigDecimal cetAnual) {
    this.cetAnual = cetAnual;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelamentoTransferenciaResponse parcelamentoTransferenciaResponse = (ParcelamentoTransferenciaResponse) o;
    return Objects.equals(this.numeroParcela, parcelamentoTransferenciaResponse.numeroParcela) &&
        Objects.equals(this.valorPrimeiraParcela, parcelamentoTransferenciaResponse.valorPrimeiraParcela) &&
        Objects.equals(this.valorDemaisParcelas, parcelamentoTransferenciaResponse.valorDemaisParcelas) &&
        Objects.equals(this.valorTotal, parcelamentoTransferenciaResponse.valorTotal) &&
        Objects.equals(this.valorTAC, parcelamentoTransferenciaResponse.valorTAC) &&
        Objects.equals(this.valorIOF, parcelamentoTransferenciaResponse.valorIOF) &&
        Objects.equals(this.taxaJuros, parcelamentoTransferenciaResponse.taxaJuros) &&
        Objects.equals(this.cetAnual, parcelamentoTransferenciaResponse.cetAnual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroParcela, valorPrimeiraParcela, valorDemaisParcelas, valorTotal, valorTAC, valorIOF, taxaJuros, cetAnual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelamentoTransferenciaResponse {\n");
    
    sb.append("    numeroParcela: ").append(toIndentedString(numeroParcela)).append("\n");
    sb.append("    valorPrimeiraParcela: ").append(toIndentedString(valorPrimeiraParcela)).append("\n");
    sb.append("    valorDemaisParcelas: ").append(toIndentedString(valorDemaisParcelas)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    valorTAC: ").append(toIndentedString(valorTAC)).append("\n");
    sb.append("    valorIOF: ").append(toIndentedString(valorIOF)).append("\n");
    sb.append("    taxaJuros: ").append(toIndentedString(taxaJuros)).append("\n");
    sb.append("    cetAnual: ").append(toIndentedString(cetAnual)).append("\n");
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



