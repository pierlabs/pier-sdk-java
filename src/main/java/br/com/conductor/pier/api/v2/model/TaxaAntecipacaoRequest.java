package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{taxa_antecipacao_request_description}}}
 **/

@ApiModel(description = "{{{taxa_antecipacao_request_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TaxaAntecipacaoRequest   {
  


  public enum TipoTransacaoEnum {
    ON_US("ON_US"),
    OFF_US("OFF_US");

    private String value;

    TipoTransacaoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TipoTransacaoEnum tipoTransacao = null;
  private BigDecimal valorTaxa = null;

  
  /**
   * {{{taxa_antecipacao_request_tipo_transacao_value}}}
   **/
  public TaxaAntecipacaoRequest tipoTransacao(TipoTransacaoEnum tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxa_antecipacao_request_tipo_transacao_value}}}")
  @JsonProperty("tipoTransacao")
  public TipoTransacaoEnum getTipoTransacao() {
    return tipoTransacao;
  }
  public void setTipoTransacao(TipoTransacaoEnum tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
  }

  
  /**
   * {{{taxa_antecipacao_request_valor_taxa_value}}}
   **/
  public TaxaAntecipacaoRequest valorTaxa(BigDecimal valorTaxa) {
    this.valorTaxa = valorTaxa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxa_antecipacao_request_valor_taxa_value}}}")
  @JsonProperty("valorTaxa")
  public BigDecimal getValorTaxa() {
    return valorTaxa;
  }
  public void setValorTaxa(BigDecimal valorTaxa) {
    this.valorTaxa = valorTaxa;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxaAntecipacaoRequest taxaAntecipacaoRequest = (TaxaAntecipacaoRequest) o;
    return Objects.equals(this.tipoTransacao, taxaAntecipacaoRequest.tipoTransacao) &&
        Objects.equals(this.valorTaxa, taxaAntecipacaoRequest.valorTaxa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoTransacao, valorTaxa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxaAntecipacaoRequest {\n");
    
    sb.append("    tipoTransacao: ").append(toIndentedString(tipoTransacao)).append("\n");
    sb.append("    valorTaxa: ").append(toIndentedString(valorTaxa)).append("\n");
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



