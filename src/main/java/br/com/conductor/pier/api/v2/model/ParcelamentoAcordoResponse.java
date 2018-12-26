package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de resposta para o parcelamento de acordo
 **/

@ApiModel(description = "Objeto de resposta para o parcelamento de acordo")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ParcelamentoAcordoResponse   {
  
  private BigDecimal percentualEntrada = null;
  private BigDecimal percentualDesconto = null;
  private BigDecimal valorDesconto = null;
  private BigDecimal valorLiquido = null;
  private BigDecimal valorEntrada = null;
  private BigDecimal valorParcela = null;
  private BigDecimal valorPrimeiraParcela = null;

  
  /**
   * Valor do percentual de entrada do acordo
   **/
  public ParcelamentoAcordoResponse percentualEntrada(BigDecimal percentualEntrada) {
    this.percentualEntrada = percentualEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do percentual de entrada do acordo")
  @JsonProperty("percentualEntrada")
  public BigDecimal getPercentualEntrada() {
    return percentualEntrada;
  }
  public void setPercentualEntrada(BigDecimal percentualEntrada) {
    this.percentualEntrada = percentualEntrada;
  }

  
  /**
   * Valor do percentual de desconto do acordo
   **/
  public ParcelamentoAcordoResponse percentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do percentual de desconto do acordo")
  @JsonProperty("percentualDesconto")
  public BigDecimal getPercentualDesconto() {
    return percentualDesconto;
  }
  public void setPercentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
  }

  
  /**
   * Valor do desconto atribuido
   **/
  public ParcelamentoAcordoResponse valorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do desconto atribuido")
  @JsonProperty("valorDesconto")
  public BigDecimal getValorDesconto() {
    return valorDesconto;
  }
  public void setValorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  
  /**
   * Valor liquido do acordo
   **/
  public ParcelamentoAcordoResponse valorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor liquido do acordo")
  @JsonProperty("valorLiquido")
  public BigDecimal getValorLiquido() {
    return valorLiquido;
  }
  public void setValorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
  }

  
  /**
   * Valor da entrada do acordo
   **/
  public ParcelamentoAcordoResponse valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da entrada do acordo")
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Valor da parcela do acordo
   **/
  public ParcelamentoAcordoResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da parcela do acordo")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Valor da primeira parcela do acordo
   **/
  public ParcelamentoAcordoResponse valorPrimeiraParcela(BigDecimal valorPrimeiraParcela) {
    this.valorPrimeiraParcela = valorPrimeiraParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da primeira parcela do acordo")
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
    ParcelamentoAcordoResponse parcelamentoAcordoResponse = (ParcelamentoAcordoResponse) o;
    return Objects.equals(this.percentualEntrada, parcelamentoAcordoResponse.percentualEntrada) &&
        Objects.equals(this.percentualDesconto, parcelamentoAcordoResponse.percentualDesconto) &&
        Objects.equals(this.valorDesconto, parcelamentoAcordoResponse.valorDesconto) &&
        Objects.equals(this.valorLiquido, parcelamentoAcordoResponse.valorLiquido) &&
        Objects.equals(this.valorEntrada, parcelamentoAcordoResponse.valorEntrada) &&
        Objects.equals(this.valorParcela, parcelamentoAcordoResponse.valorParcela) &&
        Objects.equals(this.valorPrimeiraParcela, parcelamentoAcordoResponse.valorPrimeiraParcela);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentualEntrada, percentualDesconto, valorDesconto, valorLiquido, valorEntrada, valorParcela, valorPrimeiraParcela);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelamentoAcordoResponse {\n");
    
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

