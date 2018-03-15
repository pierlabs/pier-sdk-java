package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o da resposta dos detalhes do recurso Antecipacao Simulada
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta dos detalhes do recurso Antecipacao Simulada")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AntecipacaoSimuladaDetalhesResponse   {
  
  private Integer quantidadeParcelas = null;
  private BigDecimal valorParcelas = null;
  private BigDecimal valorDesconto = null;
  private BigDecimal valorParcelasDesconto = null;

  
  /**
   * Quantidade de parcelas do plano de parcelamento simulado.
   **/
  public AntecipacaoSimuladaDetalhesResponse quantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de parcelas do plano de parcelamento simulado.")
  @JsonProperty("quantidadeParcelas")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Valor total das parcelas do plano de parcelamento.
   **/
  public AntecipacaoSimuladaDetalhesResponse valorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total das parcelas do plano de parcelamento.")
  @JsonProperty("valorParcelas")
  public BigDecimal getValorParcelas() {
    return valorParcelas;
  }
  public void setValorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
  }

  
  /**
   * Valor do desconto para o plano de parcelamento.
   **/
  public AntecipacaoSimuladaDetalhesResponse valorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do desconto para o plano de parcelamento.")
  @JsonProperty("valorDesconto")
  public BigDecimal getValorDesconto() {
    return valorDesconto;
  }
  public void setValorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  
  /**
   * Valor total da parcela ap\u00F3s a aplica\u00E7\u00E3o do desconto.
   **/
  public AntecipacaoSimuladaDetalhesResponse valorParcelasDesconto(BigDecimal valorParcelasDesconto) {
    this.valorParcelasDesconto = valorParcelasDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total da parcela ap\u00F3s a aplica\u00E7\u00E3o do desconto.")
  @JsonProperty("valorParcelasDesconto")
  public BigDecimal getValorParcelasDesconto() {
    return valorParcelasDesconto;
  }
  public void setValorParcelasDesconto(BigDecimal valorParcelasDesconto) {
    this.valorParcelasDesconto = valorParcelasDesconto;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntecipacaoSimuladaDetalhesResponse antecipacaoSimuladaDetalhesResponse = (AntecipacaoSimuladaDetalhesResponse) o;
    return Objects.equals(this.quantidadeParcelas, antecipacaoSimuladaDetalhesResponse.quantidadeParcelas) &&
        Objects.equals(this.valorParcelas, antecipacaoSimuladaDetalhesResponse.valorParcelas) &&
        Objects.equals(this.valorDesconto, antecipacaoSimuladaDetalhesResponse.valorDesconto) &&
        Objects.equals(this.valorParcelasDesconto, antecipacaoSimuladaDetalhesResponse.valorParcelasDesconto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantidadeParcelas, valorParcelas, valorDesconto, valorParcelasDesconto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntecipacaoSimuladaDetalhesResponse {\n");
    
    sb.append("    quantidadeParcelas: ").append(toIndentedString(quantidadeParcelas)).append("\n");
    sb.append("    valorParcelas: ").append(toIndentedString(valorParcelas)).append("\n");
    sb.append("    valorDesconto: ").append(toIndentedString(valorDesconto)).append("\n");
    sb.append("    valorParcelasDesconto: ").append(toIndentedString(valorParcelasDesconto)).append("\n");
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

