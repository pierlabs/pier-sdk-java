package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{antecipacao_simulada_detalhes_response_description}}}
 **/

@ApiModel(description = "{{{antecipacao_simulada_detalhes_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AntecipacaoSimuladaDetalhesResponse   {
  
  private Integer quantidadeParcelas = null;
  private BigDecimal valorParcelas = null;
  private BigDecimal valorDesconto = null;
  private BigDecimal valorParcelasDesconto = null;

  
  /**
   * {{{antecipacao_simulada_detalhes_response_quantidade_parcelas_value}}}
   **/
  public AntecipacaoSimuladaDetalhesResponse quantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{antecipacao_simulada_detalhes_response_quantidade_parcelas_value}}}")
  @JsonProperty("quantidadeParcelas")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * {{{antecipacao_simulada_detalhes_response_valor_parcelas_value}}}
   **/
  public AntecipacaoSimuladaDetalhesResponse valorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{antecipacao_simulada_detalhes_response_valor_parcelas_value}}}")
  @JsonProperty("valorParcelas")
  public BigDecimal getValorParcelas() {
    return valorParcelas;
  }
  public void setValorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
  }

  
  /**
   * {{{antecipacao_simulada_detalhes_response_valor_desconto_value}}}
   **/
  public AntecipacaoSimuladaDetalhesResponse valorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{antecipacao_simulada_detalhes_response_valor_desconto_value}}}")
  @JsonProperty("valorDesconto")
  public BigDecimal getValorDesconto() {
    return valorDesconto;
  }
  public void setValorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  
  /**
   * {{{antecipacao_simulada_detalhes_response_valor_parcelas_desconto_value}}}
   **/
  public AntecipacaoSimuladaDetalhesResponse valorParcelasDesconto(BigDecimal valorParcelasDesconto) {
    this.valorParcelasDesconto = valorParcelasDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{antecipacao_simulada_detalhes_response_valor_parcelas_desconto_value}}}")
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



