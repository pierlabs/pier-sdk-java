package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{detalhe_operacao_response_description}}}
 **/

@ApiModel(description = "{{{detalhe_operacao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DetalheOperacaoResponse   {
  
  private Long idOperacao = null;
  private String codigoProcessamento = null;
  private String codigoProcessamentoCancelamento = null;
  private String nomeOperacao = null;
  private String descricaoOperacao = null;
  private Integer planoMinimo = null;
  private Integer planoMaximo = null;
  private BigDecimal valorMinimo = null;
  private BigDecimal valorMaximo = null;
  private Boolean flagCobraJuros = null;
  private BigDecimal taxaJuros = null;
  private Boolean flagCobraTarifa = null;
  private BigDecimal taxaTarifa = null;
  private BigDecimal valorTac = null;
  private BigDecimal percentualTac = null;
  private BigDecimal valorOperacao = null;
  private Integer carencia = null;
  private BigDecimal excedentePermitido = null;
  private Boolean flagPermitirParcelamento = null;

  
  /**
   * {{{detalhe_operacao_response_id_operacao_value}}}
   **/
  public DetalheOperacaoResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_id_operacao_value}}}")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * {{{detalhe_operacao_response_codigo_processamento_value}}}
   **/
  public DetalheOperacaoResponse codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_codigo_processamento_value}}}")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * {{{detalhe_operacao_response_codigo_processamento_cancelamento_value}}}
   **/
  public DetalheOperacaoResponse codigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_codigo_processamento_cancelamento_value}}}")
  @JsonProperty("codigoProcessamentoCancelamento")
  public String getCodigoProcessamentoCancelamento() {
    return codigoProcessamentoCancelamento;
  }
  public void setCodigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
  }

  
  /**
   * {{{detalhe_operacao_response_nome_operacao_value}}}
   **/
  public DetalheOperacaoResponse nomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_nome_operacao_value}}}")
  @JsonProperty("nomeOperacao")
  public String getNomeOperacao() {
    return nomeOperacao;
  }
  public void setNomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
  }

  
  /**
   * {{{detalhe_operacao_response_descricao_operacao_value}}}
   **/
  public DetalheOperacaoResponse descricaoOperacao(String descricaoOperacao) {
    this.descricaoOperacao = descricaoOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_descricao_operacao_value}}}")
  @JsonProperty("descricaoOperacao")
  public String getDescricaoOperacao() {
    return descricaoOperacao;
  }
  public void setDescricaoOperacao(String descricaoOperacao) {
    this.descricaoOperacao = descricaoOperacao;
  }

  
  /**
   * {{{detalhe_operacao_response_plano_minimo_value}}}
   **/
  public DetalheOperacaoResponse planoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_plano_minimo_value}}}")
  @JsonProperty("planoMinimo")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * {{{detalhe_operacao_response_plano_maximo_value}}}
   **/
  public DetalheOperacaoResponse planoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_plano_maximo_value}}}")
  @JsonProperty("planoMaximo")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   * {{{detalhe_operacao_response_valor_minimo_value}}}
   **/
  public DetalheOperacaoResponse valorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_valor_minimo_value}}}")
  @JsonProperty("valorMinimo")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   * {{{detalhe_operacao_response_valor_maximo_value}}}
   **/
  public DetalheOperacaoResponse valorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_valor_maximo_value}}}")
  @JsonProperty("valorMaximo")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  
  /**
   * {{{detalhe_operacao_response_flag_cobra_juros_value}}}
   **/
  public DetalheOperacaoResponse flagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{detalhe_operacao_response_flag_cobra_juros_value}}}")
  @JsonProperty("flagCobraJuros")
  public Boolean getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   * {{{detalhe_operacao_response_taxa_juros_value}}}
   **/
  public DetalheOperacaoResponse taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_taxa_juros_value}}}")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * {{{detalhe_operacao_response_flag_cobra_tarifa_value}}}
   **/
  public DetalheOperacaoResponse flagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{detalhe_operacao_response_flag_cobra_tarifa_value}}}")
  @JsonProperty("flagCobraTarifa")
  public Boolean getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * {{{detalhe_operacao_response_taxa_tarifa_value}}}
   **/
  public DetalheOperacaoResponse taxaTarifa(BigDecimal taxaTarifa) {
    this.taxaTarifa = taxaTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_taxa_tarifa_value}}}")
  @JsonProperty("taxaTarifa")
  public BigDecimal getTaxaTarifa() {
    return taxaTarifa;
  }
  public void setTaxaTarifa(BigDecimal taxaTarifa) {
    this.taxaTarifa = taxaTarifa;
  }

  
  /**
   * {{{detalhe_operacao_response_valor_tac_value}}}
   **/
  public DetalheOperacaoResponse valorTac(BigDecimal valorTac) {
    this.valorTac = valorTac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_valor_tac_value}}}")
  @JsonProperty("valorTac")
  public BigDecimal getValorTac() {
    return valorTac;
  }
  public void setValorTac(BigDecimal valorTac) {
    this.valorTac = valorTac;
  }

  
  /**
   * {{{detalhe_operacao_response_percentual_tac_value}}}
   **/
  public DetalheOperacaoResponse percentualTac(BigDecimal percentualTac) {
    this.percentualTac = percentualTac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_percentual_tac_value}}}")
  @JsonProperty("percentualTac")
  public BigDecimal getPercentualTac() {
    return percentualTac;
  }
  public void setPercentualTac(BigDecimal percentualTac) {
    this.percentualTac = percentualTac;
  }

  
  /**
   * {{{detalhe_operacao_response_valor_operacao_value}}}
   **/
  public DetalheOperacaoResponse valorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_valor_operacao_value}}}")
  @JsonProperty("valorOperacao")
  public BigDecimal getValorOperacao() {
    return valorOperacao;
  }
  public void setValorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
  }

  
  /**
   * {{{detalhe_operacao_response_carencia_value}}}
   **/
  public DetalheOperacaoResponse carencia(Integer carencia) {
    this.carencia = carencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_carencia_value}}}")
  @JsonProperty("carencia")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   * {{{detalhe_operacao_response_excedente_permitido_value}}}
   **/
  public DetalheOperacaoResponse excedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_operacao_response_excedente_permitido_value}}}")
  @JsonProperty("excedentePermitido")
  public BigDecimal getExcedentePermitido() {
    return excedentePermitido;
  }
  public void setExcedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
  }

  
  /**
   * {{{detalhe_operacao_response_flag_permitir_parcelamento_value}}}
   **/
  public DetalheOperacaoResponse flagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{detalhe_operacao_response_flag_permitir_parcelamento_value}}}")
  @JsonProperty("flagPermitirParcelamento")
  public Boolean getFlagPermitirParcelamento() {
    return flagPermitirParcelamento;
  }
  public void setFlagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalheOperacaoResponse detalheOperacaoResponse = (DetalheOperacaoResponse) o;
    return Objects.equals(this.idOperacao, detalheOperacaoResponse.idOperacao) &&
        Objects.equals(this.codigoProcessamento, detalheOperacaoResponse.codigoProcessamento) &&
        Objects.equals(this.codigoProcessamentoCancelamento, detalheOperacaoResponse.codigoProcessamentoCancelamento) &&
        Objects.equals(this.nomeOperacao, detalheOperacaoResponse.nomeOperacao) &&
        Objects.equals(this.descricaoOperacao, detalheOperacaoResponse.descricaoOperacao) &&
        Objects.equals(this.planoMinimo, detalheOperacaoResponse.planoMinimo) &&
        Objects.equals(this.planoMaximo, detalheOperacaoResponse.planoMaximo) &&
        Objects.equals(this.valorMinimo, detalheOperacaoResponse.valorMinimo) &&
        Objects.equals(this.valorMaximo, detalheOperacaoResponse.valorMaximo) &&
        Objects.equals(this.flagCobraJuros, detalheOperacaoResponse.flagCobraJuros) &&
        Objects.equals(this.taxaJuros, detalheOperacaoResponse.taxaJuros) &&
        Objects.equals(this.flagCobraTarifa, detalheOperacaoResponse.flagCobraTarifa) &&
        Objects.equals(this.taxaTarifa, detalheOperacaoResponse.taxaTarifa) &&
        Objects.equals(this.valorTac, detalheOperacaoResponse.valorTac) &&
        Objects.equals(this.percentualTac, detalheOperacaoResponse.percentualTac) &&
        Objects.equals(this.valorOperacao, detalheOperacaoResponse.valorOperacao) &&
        Objects.equals(this.carencia, detalheOperacaoResponse.carencia) &&
        Objects.equals(this.excedentePermitido, detalheOperacaoResponse.excedentePermitido) &&
        Objects.equals(this.flagPermitirParcelamento, detalheOperacaoResponse.flagPermitirParcelamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOperacao, codigoProcessamento, codigoProcessamentoCancelamento, nomeOperacao, descricaoOperacao, planoMinimo, planoMaximo, valorMinimo, valorMaximo, flagCobraJuros, taxaJuros, flagCobraTarifa, taxaTarifa, valorTac, percentualTac, valorOperacao, carencia, excedentePermitido, flagPermitirParcelamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalheOperacaoResponse {\n");
    
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
    sb.append("    codigoProcessamento: ").append(toIndentedString(codigoProcessamento)).append("\n");
    sb.append("    codigoProcessamentoCancelamento: ").append(toIndentedString(codigoProcessamentoCancelamento)).append("\n");
    sb.append("    nomeOperacao: ").append(toIndentedString(nomeOperacao)).append("\n");
    sb.append("    descricaoOperacao: ").append(toIndentedString(descricaoOperacao)).append("\n");
    sb.append("    planoMinimo: ").append(toIndentedString(planoMinimo)).append("\n");
    sb.append("    planoMaximo: ").append(toIndentedString(planoMaximo)).append("\n");
    sb.append("    valorMinimo: ").append(toIndentedString(valorMinimo)).append("\n");
    sb.append("    valorMaximo: ").append(toIndentedString(valorMaximo)).append("\n");
    sb.append("    flagCobraJuros: ").append(toIndentedString(flagCobraJuros)).append("\n");
    sb.append("    taxaJuros: ").append(toIndentedString(taxaJuros)).append("\n");
    sb.append("    flagCobraTarifa: ").append(toIndentedString(flagCobraTarifa)).append("\n");
    sb.append("    taxaTarifa: ").append(toIndentedString(taxaTarifa)).append("\n");
    sb.append("    valorTac: ").append(toIndentedString(valorTac)).append("\n");
    sb.append("    percentualTac: ").append(toIndentedString(percentualTac)).append("\n");
    sb.append("    valorOperacao: ").append(toIndentedString(valorOperacao)).append("\n");
    sb.append("    carencia: ").append(toIndentedString(carencia)).append("\n");
    sb.append("    excedentePermitido: ").append(toIndentedString(excedentePermitido)).append("\n");
    sb.append("    flagPermitirParcelamento: ").append(toIndentedString(flagPermitirParcelamento)).append("\n");
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



