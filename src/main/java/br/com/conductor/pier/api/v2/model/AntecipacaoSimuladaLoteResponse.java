package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;





/**
 * {{{antecipacao_simulada_lote_response_description}}}
 **/

@ApiModel(description = "{{{antecipacao_simulada_lote_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AntecipacaoSimuladaLoteResponse   {
  
  private BigDecimal valorTotalAntecipado = null;
  private BigDecimal valorTotalDesconto = null;
  private BigDecimal valorTotalComDesconto = null;
  private List<AntecipacaoSimuladaResponse> antecipacoesSimuladas = new ArrayList<AntecipacaoSimuladaResponse>();

  
  /**
   * {{{antecipacao_simulada_lote_response_valor_total_antecipado_value}}}
   **/
  public AntecipacaoSimuladaLoteResponse valorTotalAntecipado(BigDecimal valorTotalAntecipado) {
    this.valorTotalAntecipado = valorTotalAntecipado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{antecipacao_simulada_lote_response_valor_total_antecipado_value}}}")
  @JsonProperty("valorTotalAntecipado")
  public BigDecimal getValorTotalAntecipado() {
    return valorTotalAntecipado;
  }
  public void setValorTotalAntecipado(BigDecimal valorTotalAntecipado) {
    this.valorTotalAntecipado = valorTotalAntecipado;
  }

  
  /**
   * {{{antecipacao_simulada_lote_response_valor_total_desconto_value}}}
   **/
  public AntecipacaoSimuladaLoteResponse valorTotalDesconto(BigDecimal valorTotalDesconto) {
    this.valorTotalDesconto = valorTotalDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{antecipacao_simulada_lote_response_valor_total_desconto_value}}}")
  @JsonProperty("valorTotalDesconto")
  public BigDecimal getValorTotalDesconto() {
    return valorTotalDesconto;
  }
  public void setValorTotalDesconto(BigDecimal valorTotalDesconto) {
    this.valorTotalDesconto = valorTotalDesconto;
  }

  
  /**
   * {{{antecipacao_simulada_lote_response_valor_total_com_desconto_value}}}
   **/
  public AntecipacaoSimuladaLoteResponse valorTotalComDesconto(BigDecimal valorTotalComDesconto) {
    this.valorTotalComDesconto = valorTotalComDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{antecipacao_simulada_lote_response_valor_total_com_desconto_value}}}")
  @JsonProperty("valorTotalComDesconto")
  public BigDecimal getValorTotalComDesconto() {
    return valorTotalComDesconto;
  }
  public void setValorTotalComDesconto(BigDecimal valorTotalComDesconto) {
    this.valorTotalComDesconto = valorTotalComDesconto;
  }

  
  /**
   * {{{antecipacao_simulada_lote_response_antecipacoes_simuladas_value}}}
   **/
  public AntecipacaoSimuladaLoteResponse antecipacoesSimuladas(List<AntecipacaoSimuladaResponse> antecipacoesSimuladas) {
    this.antecipacoesSimuladas = antecipacoesSimuladas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{antecipacao_simulada_lote_response_antecipacoes_simuladas_value}}}")
  @JsonProperty("antecipacoesSimuladas")
  public List<AntecipacaoSimuladaResponse> getAntecipacoesSimuladas() {
    return antecipacoesSimuladas;
  }
  public void setAntecipacoesSimuladas(List<AntecipacaoSimuladaResponse> antecipacoesSimuladas) {
    this.antecipacoesSimuladas = antecipacoesSimuladas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntecipacaoSimuladaLoteResponse antecipacaoSimuladaLoteResponse = (AntecipacaoSimuladaLoteResponse) o;
    return Objects.equals(this.valorTotalAntecipado, antecipacaoSimuladaLoteResponse.valorTotalAntecipado) &&
        Objects.equals(this.valorTotalDesconto, antecipacaoSimuladaLoteResponse.valorTotalDesconto) &&
        Objects.equals(this.valorTotalComDesconto, antecipacaoSimuladaLoteResponse.valorTotalComDesconto) &&
        Objects.equals(this.antecipacoesSimuladas, antecipacaoSimuladaLoteResponse.antecipacoesSimuladas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valorTotalAntecipado, valorTotalDesconto, valorTotalComDesconto, antecipacoesSimuladas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntecipacaoSimuladaLoteResponse {\n");
    
    sb.append("    valorTotalAntecipado: ").append(toIndentedString(valorTotalAntecipado)).append("\n");
    sb.append("    valorTotalDesconto: ").append(toIndentedString(valorTotalDesconto)).append("\n");
    sb.append("    valorTotalComDesconto: ").append(toIndentedString(valorTotalComDesconto)).append("\n");
    sb.append("    antecipacoesSimuladas: ").append(toIndentedString(antecipacoesSimuladas)).append("\n");
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



