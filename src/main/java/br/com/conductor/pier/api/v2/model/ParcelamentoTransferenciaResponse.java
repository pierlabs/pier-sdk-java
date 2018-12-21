package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{parcelamento_transferencia_response_description}}}
 **/

@ApiModel(description = "{{{parcelamento_transferencia_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ParcelamentoTransferenciaResponse   {
  
  private Integer numeroParcela = null;
  private BigDecimal valorParcelas = null;
  private BigDecimal valorTotal = null;
  private BigDecimal valorTAC = null;
  private BigDecimal valorIOF = null;
  private BigDecimal taxaJuros = null;
  private BigDecimal cetAnual = null;

  
  /**
   * {{{parcelamento_transferencia_response_numero_parcela_value}}}
   **/
  public ParcelamentoTransferenciaResponse numeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcelamento_transferencia_response_numero_parcela_value}}}")
  @JsonProperty("numeroParcela")
  public Integer getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * {{{parcelamento_transferencia_response_valor_parcelas_value}}}
   **/
  public ParcelamentoTransferenciaResponse valorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcelamento_transferencia_response_valor_parcelas_value}}}")
  @JsonProperty("valorParcelas")
  public BigDecimal getValorParcelas() {
    return valorParcelas;
  }
  public void setValorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
  }

  
  /**
   * {{{parcelamento_transferencia_response_valor_total_value}}}
   **/
  public ParcelamentoTransferenciaResponse valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcelamento_transferencia_response_valor_total_value}}}")
  @JsonProperty("valorTotal")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * {{{parcelamento_transferencia_response_valor_t_a_c_value}}}
   **/
  public ParcelamentoTransferenciaResponse valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcelamento_transferencia_response_valor_t_a_c_value}}}")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * {{{parcelamento_transferencia_response_valor_i_o_f_value}}}
   **/
  public ParcelamentoTransferenciaResponse valorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcelamento_transferencia_response_valor_i_o_f_value}}}")
  @JsonProperty("valorIOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * {{{parcelamento_transferencia_response_taxa_juros_value}}}
   **/
  public ParcelamentoTransferenciaResponse taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcelamento_transferencia_response_taxa_juros_value}}}")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * {{{parcelamento_transferencia_response_cet_anual_value}}}
   **/
  public ParcelamentoTransferenciaResponse cetAnual(BigDecimal cetAnual) {
    this.cetAnual = cetAnual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcelamento_transferencia_response_cet_anual_value}}}")
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
        Objects.equals(this.valorParcelas, parcelamentoTransferenciaResponse.valorParcelas) &&
        Objects.equals(this.valorTotal, parcelamentoTransferenciaResponse.valorTotal) &&
        Objects.equals(this.valorTAC, parcelamentoTransferenciaResponse.valorTAC) &&
        Objects.equals(this.valorIOF, parcelamentoTransferenciaResponse.valorIOF) &&
        Objects.equals(this.taxaJuros, parcelamentoTransferenciaResponse.taxaJuros) &&
        Objects.equals(this.cetAnual, parcelamentoTransferenciaResponse.cetAnual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroParcela, valorParcelas, valorTotal, valorTAC, valorIOF, taxaJuros, cetAnual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelamentoTransferenciaResponse {\n");
    
    sb.append("    numeroParcela: ").append(toIndentedString(numeroParcela)).append("\n");
    sb.append("    valorParcelas: ").append(toIndentedString(valorParcelas)).append("\n");
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

