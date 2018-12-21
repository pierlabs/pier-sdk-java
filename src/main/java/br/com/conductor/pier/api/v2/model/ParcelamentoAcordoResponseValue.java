package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{parcelamento_acordo_response_description}}}
 **/

@ApiModel(description = "{{{parcelamento_acordo_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ParcelamentoAcordoResponseValue   {
  
  private BigDecimal percentualEntrada = null;
  private BigDecimal percentualDesconto = null;
  private BigDecimal valorDesconto = null;
  private BigDecimal valorLiquido = null;
  private BigDecimal valorEntrada = null;
  private BigDecimal valorParcela = null;
  private BigDecimal valorPrimeiraParcela = null;

  
  /**
   * {{{parcelamento_acordo_response_percentual_entrada_value}}}
   **/
  public ParcelamentoAcordoResponseValue percentualEntrada(BigDecimal percentualEntrada) {
    this.percentualEntrada = percentualEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcelamento_acordo_response_percentual_entrada_value}}}")
  @JsonProperty("percentualEntrada")
  public BigDecimal getPercentualEntrada() {
    return percentualEntrada;
  }
  public void setPercentualEntrada(BigDecimal percentualEntrada) {
    this.percentualEntrada = percentualEntrada;
  }

  
  /**
   * {{{parcelamento_acordo_response_percentual_desconto_value}}}
   **/
  public ParcelamentoAcordoResponseValue percentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcelamento_acordo_response_percentual_desconto_value}}}")
  @JsonProperty("percentualDesconto")
  public BigDecimal getPercentualDesconto() {
    return percentualDesconto;
  }
  public void setPercentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
  }

  
  /**
   * {{{parcelamento_acordo_response_valor_desconto_value}}}
   **/
  public ParcelamentoAcordoResponseValue valorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcelamento_acordo_response_valor_desconto_value}}}")
  @JsonProperty("valorDesconto")
  public BigDecimal getValorDesconto() {
    return valorDesconto;
  }
  public void setValorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  
  /**
   * {{{parcelamento_acordo_response_valor_liquido_value}}}
   **/
  public ParcelamentoAcordoResponseValue valorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcelamento_acordo_response_valor_liquido_value}}}")
  @JsonProperty("valorLiquido")
  public BigDecimal getValorLiquido() {
    return valorLiquido;
  }
  public void setValorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
  }

  
  /**
   * {{{parcelamento_acordo_response_valor_entrada_value}}}
   **/
  public ParcelamentoAcordoResponseValue valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcelamento_acordo_response_valor_entrada_value}}}")
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * {{{parcelamento_acordo_response_valor_parcela_value}}}
   **/
  public ParcelamentoAcordoResponseValue valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcelamento_acordo_response_valor_parcela_value}}}")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * {{{parcelamento_acordo_response_valor_primeira_parcela_value}}}
   **/
  public ParcelamentoAcordoResponseValue valorPrimeiraParcela(BigDecimal valorPrimeiraParcela) {
    this.valorPrimeiraParcela = valorPrimeiraParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parcelamento_acordo_response_valor_primeira_parcela_value}}}")
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
    ParcelamentoAcordoResponseValue parcelamentoAcordoResponseValue = (ParcelamentoAcordoResponseValue) o;
    return Objects.equals(this.percentualEntrada, parcelamentoAcordoResponseValue.percentualEntrada) &&
        Objects.equals(this.percentualDesconto, parcelamentoAcordoResponseValue.percentualDesconto) &&
        Objects.equals(this.valorDesconto, parcelamentoAcordoResponseValue.valorDesconto) &&
        Objects.equals(this.valorLiquido, parcelamentoAcordoResponseValue.valorLiquido) &&
        Objects.equals(this.valorEntrada, parcelamentoAcordoResponseValue.valorEntrada) &&
        Objects.equals(this.valorParcela, parcelamentoAcordoResponseValue.valorParcela) &&
        Objects.equals(this.valorPrimeiraParcela, parcelamentoAcordoResponseValue.valorPrimeiraParcela);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentualEntrada, percentualDesconto, valorDesconto, valorLiquido, valorEntrada, valorParcela, valorPrimeiraParcela);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelamentoAcordoResponseValue {\n");
    
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

