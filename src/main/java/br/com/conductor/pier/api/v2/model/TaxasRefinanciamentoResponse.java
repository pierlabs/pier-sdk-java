package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{taxas_refinanciamento_response_description}}}
 **/

@ApiModel(description = "{{{taxas_refinanciamento_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TaxasRefinanciamentoResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Long idProduto = null;
  private Long idPlanoConta = null;
  private Long idPlanoPct = null;
  private Long idPlanoCreditoTaxa = null;
  private String dataEntrada = null;
  private String vencimento = null;
  private BigDecimal recuperacaoEncargosFinanceiros = null;
  private BigDecimal comissaoGarantia = null;
  private BigDecimal agenciamento = null;
  private BigDecimal taxaMaximaProximoPeriodo = null;
  private BigDecimal taxaEncargosFinanciamento = null;
  private BigDecimal taxaMaximaSaque = null;
  private BigDecimal taxaSaque = null;
  private BigDecimal taxaMaximaCompraJuros = null;
  private BigDecimal taxaCompraJuros = null;
  private BigDecimal taxaPermanencia = null;
  private BigDecimal taxaRefinanciamento = null;
  private BigDecimal taxaRecuperacaoRefinanciamento = null;
  private BigDecimal taxaPercCalcPagamentoMinimo = null;
  private Integer planoTaxaDefault = null;

  
  /**
   * {{{taxas_refinanciamento_response_id_value}}}
   **/
  public TaxasRefinanciamentoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{taxas_refinanciamento_response_id_conta_value}}}
   **/
  public TaxasRefinanciamentoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{taxas_refinanciamento_response_id_produto_value}}}
   **/
  public TaxasRefinanciamentoResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{taxas_refinanciamento_response_id_plano_conta_value}}}
   **/
  public TaxasRefinanciamentoResponse idPlanoConta(Long idPlanoConta) {
    this.idPlanoConta = idPlanoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_id_plano_conta_value}}}")
  @JsonProperty("idPlanoConta")
  public Long getIdPlanoConta() {
    return idPlanoConta;
  }
  public void setIdPlanoConta(Long idPlanoConta) {
    this.idPlanoConta = idPlanoConta;
  }

  
  /**
   * {{{taxas_refinanciamento_response_id_plano_pct_value}}}
   **/
  public TaxasRefinanciamentoResponse idPlanoPct(Long idPlanoPct) {
    this.idPlanoPct = idPlanoPct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_id_plano_pct_value}}}")
  @JsonProperty("idPlanoPct")
  public Long getIdPlanoPct() {
    return idPlanoPct;
  }
  public void setIdPlanoPct(Long idPlanoPct) {
    this.idPlanoPct = idPlanoPct;
  }

  
  /**
   * {{{taxas_refinanciamento_response_id_plano_credito_taxa_value}}}
   **/
  public TaxasRefinanciamentoResponse idPlanoCreditoTaxa(Long idPlanoCreditoTaxa) {
    this.idPlanoCreditoTaxa = idPlanoCreditoTaxa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_id_plano_credito_taxa_value}}}")
  @JsonProperty("idPlanoCreditoTaxa")
  public Long getIdPlanoCreditoTaxa() {
    return idPlanoCreditoTaxa;
  }
  public void setIdPlanoCreditoTaxa(Long idPlanoCreditoTaxa) {
    this.idPlanoCreditoTaxa = idPlanoCreditoTaxa;
  }

  
  /**
   * {{{taxas_refinanciamento_response_data_entrada_value}}}
   **/
  public TaxasRefinanciamentoResponse dataEntrada(String dataEntrada) {
    this.dataEntrada = dataEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_data_entrada_value}}}")
  @JsonProperty("dataEntrada")
  public String getDataEntrada() {
    return dataEntrada;
  }
  public void setDataEntrada(String dataEntrada) {
    this.dataEntrada = dataEntrada;
  }

  
  /**
   * {{{taxas_refinanciamento_response_vencimento_value}}}
   **/
  public TaxasRefinanciamentoResponse vencimento(String vencimento) {
    this.vencimento = vencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_vencimento_value}}}")
  @JsonProperty("vencimento")
  public String getVencimento() {
    return vencimento;
  }
  public void setVencimento(String vencimento) {
    this.vencimento = vencimento;
  }

  
  /**
   * {{{taxas_refinanciamento_response_recuperacao_encargos_financeiros_value}}}
   **/
  public TaxasRefinanciamentoResponse recuperacaoEncargosFinanceiros(BigDecimal recuperacaoEncargosFinanceiros) {
    this.recuperacaoEncargosFinanceiros = recuperacaoEncargosFinanceiros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_recuperacao_encargos_financeiros_value}}}")
  @JsonProperty("recuperacaoEncargosFinanceiros")
  public BigDecimal getRecuperacaoEncargosFinanceiros() {
    return recuperacaoEncargosFinanceiros;
  }
  public void setRecuperacaoEncargosFinanceiros(BigDecimal recuperacaoEncargosFinanceiros) {
    this.recuperacaoEncargosFinanceiros = recuperacaoEncargosFinanceiros;
  }

  
  /**
   * {{{taxas_refinanciamento_response_comissao_garantia_value}}}
   **/
  public TaxasRefinanciamentoResponse comissaoGarantia(BigDecimal comissaoGarantia) {
    this.comissaoGarantia = comissaoGarantia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_comissao_garantia_value}}}")
  @JsonProperty("comissaoGarantia")
  public BigDecimal getComissaoGarantia() {
    return comissaoGarantia;
  }
  public void setComissaoGarantia(BigDecimal comissaoGarantia) {
    this.comissaoGarantia = comissaoGarantia;
  }

  
  /**
   * {{{taxas_refinanciamento_response_agenciamento_value}}}
   **/
  public TaxasRefinanciamentoResponse agenciamento(BigDecimal agenciamento) {
    this.agenciamento = agenciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_agenciamento_value}}}")
  @JsonProperty("agenciamento")
  public BigDecimal getAgenciamento() {
    return agenciamento;
  }
  public void setAgenciamento(BigDecimal agenciamento) {
    this.agenciamento = agenciamento;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_maxima_proximo_periodo_value}}}
   **/
  public TaxasRefinanciamentoResponse taxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_taxa_maxima_proximo_periodo_value}}}")
  @JsonProperty("taxaMaximaProximoPeriodo")
  public BigDecimal getTaxaMaximaProximoPeriodo() {
    return taxaMaximaProximoPeriodo;
  }
  public void setTaxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_encargos_financiamento_value}}}
   **/
  public TaxasRefinanciamentoResponse taxaEncargosFinanciamento(BigDecimal taxaEncargosFinanciamento) {
    this.taxaEncargosFinanciamento = taxaEncargosFinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_taxa_encargos_financiamento_value}}}")
  @JsonProperty("taxaEncargosFinanciamento")
  public BigDecimal getTaxaEncargosFinanciamento() {
    return taxaEncargosFinanciamento;
  }
  public void setTaxaEncargosFinanciamento(BigDecimal taxaEncargosFinanciamento) {
    this.taxaEncargosFinanciamento = taxaEncargosFinanciamento;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_maxima_saque_value}}}
   **/
  public TaxasRefinanciamentoResponse taxaMaximaSaque(BigDecimal taxaMaximaSaque) {
    this.taxaMaximaSaque = taxaMaximaSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_taxa_maxima_saque_value}}}")
  @JsonProperty("taxaMaximaSaque")
  public BigDecimal getTaxaMaximaSaque() {
    return taxaMaximaSaque;
  }
  public void setTaxaMaximaSaque(BigDecimal taxaMaximaSaque) {
    this.taxaMaximaSaque = taxaMaximaSaque;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_saque_value}}}
   **/
  public TaxasRefinanciamentoResponse taxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_taxa_saque_value}}}")
  @JsonProperty("taxaSaque")
  public BigDecimal getTaxaSaque() {
    return taxaSaque;
  }
  public void setTaxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_maxima_compra_juros_value}}}
   **/
  public TaxasRefinanciamentoResponse taxaMaximaCompraJuros(BigDecimal taxaMaximaCompraJuros) {
    this.taxaMaximaCompraJuros = taxaMaximaCompraJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_taxa_maxima_compra_juros_value}}}")
  @JsonProperty("taxaMaximaCompraJuros")
  public BigDecimal getTaxaMaximaCompraJuros() {
    return taxaMaximaCompraJuros;
  }
  public void setTaxaMaximaCompraJuros(BigDecimal taxaMaximaCompraJuros) {
    this.taxaMaximaCompraJuros = taxaMaximaCompraJuros;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_compra_juros_value}}}
   **/
  public TaxasRefinanciamentoResponse taxaCompraJuros(BigDecimal taxaCompraJuros) {
    this.taxaCompraJuros = taxaCompraJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_taxa_compra_juros_value}}}")
  @JsonProperty("taxaCompraJuros")
  public BigDecimal getTaxaCompraJuros() {
    return taxaCompraJuros;
  }
  public void setTaxaCompraJuros(BigDecimal taxaCompraJuros) {
    this.taxaCompraJuros = taxaCompraJuros;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_permanencia_value}}}
   **/
  public TaxasRefinanciamentoResponse taxaPermanencia(BigDecimal taxaPermanencia) {
    this.taxaPermanencia = taxaPermanencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_taxa_permanencia_value}}}")
  @JsonProperty("taxaPermanencia")
  public BigDecimal getTaxaPermanencia() {
    return taxaPermanencia;
  }
  public void setTaxaPermanencia(BigDecimal taxaPermanencia) {
    this.taxaPermanencia = taxaPermanencia;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_refinanciamento_value}}}
   **/
  public TaxasRefinanciamentoResponse taxaRefinanciamento(BigDecimal taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_taxa_refinanciamento_value}}}")
  @JsonProperty("taxaRefinanciamento")
  public BigDecimal getTaxaRefinanciamento() {
    return taxaRefinanciamento;
  }
  public void setTaxaRefinanciamento(BigDecimal taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_recuperacao_refinanciamento_value}}}
   **/
  public TaxasRefinanciamentoResponse taxaRecuperacaoRefinanciamento(BigDecimal taxaRecuperacaoRefinanciamento) {
    this.taxaRecuperacaoRefinanciamento = taxaRecuperacaoRefinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_taxa_recuperacao_refinanciamento_value}}}")
  @JsonProperty("taxaRecuperacaoRefinanciamento")
  public BigDecimal getTaxaRecuperacaoRefinanciamento() {
    return taxaRecuperacaoRefinanciamento;
  }
  public void setTaxaRecuperacaoRefinanciamento(BigDecimal taxaRecuperacaoRefinanciamento) {
    this.taxaRecuperacaoRefinanciamento = taxaRecuperacaoRefinanciamento;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_perc_calc_pagamento_minimo_value}}}
   **/
  public TaxasRefinanciamentoResponse taxaPercCalcPagamentoMinimo(BigDecimal taxaPercCalcPagamentoMinimo) {
    this.taxaPercCalcPagamentoMinimo = taxaPercCalcPagamentoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_taxa_perc_calc_pagamento_minimo_value}}}")
  @JsonProperty("taxaPercCalcPagamentoMinimo")
  public BigDecimal getTaxaPercCalcPagamentoMinimo() {
    return taxaPercCalcPagamentoMinimo;
  }
  public void setTaxaPercCalcPagamentoMinimo(BigDecimal taxaPercCalcPagamentoMinimo) {
    this.taxaPercCalcPagamentoMinimo = taxaPercCalcPagamentoMinimo;
  }

  
  /**
   * {{{taxas_refinanciamento_response_plano_taxa_default_value}}}
   **/
  public TaxasRefinanciamentoResponse planoTaxaDefault(Integer planoTaxaDefault) {
    this.planoTaxaDefault = planoTaxaDefault;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxas_refinanciamento_response_plano_taxa_default_value}}}")
  @JsonProperty("planoTaxaDefault")
  public Integer getPlanoTaxaDefault() {
    return planoTaxaDefault;
  }
  public void setPlanoTaxaDefault(Integer planoTaxaDefault) {
    this.planoTaxaDefault = planoTaxaDefault;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxasRefinanciamentoResponse taxasRefinanciamentoResponse = (TaxasRefinanciamentoResponse) o;
    return Objects.equals(this.id, taxasRefinanciamentoResponse.id) &&
        Objects.equals(this.idConta, taxasRefinanciamentoResponse.idConta) &&
        Objects.equals(this.idProduto, taxasRefinanciamentoResponse.idProduto) &&
        Objects.equals(this.idPlanoConta, taxasRefinanciamentoResponse.idPlanoConta) &&
        Objects.equals(this.idPlanoPct, taxasRefinanciamentoResponse.idPlanoPct) &&
        Objects.equals(this.idPlanoCreditoTaxa, taxasRefinanciamentoResponse.idPlanoCreditoTaxa) &&
        Objects.equals(this.dataEntrada, taxasRefinanciamentoResponse.dataEntrada) &&
        Objects.equals(this.vencimento, taxasRefinanciamentoResponse.vencimento) &&
        Objects.equals(this.recuperacaoEncargosFinanceiros, taxasRefinanciamentoResponse.recuperacaoEncargosFinanceiros) &&
        Objects.equals(this.comissaoGarantia, taxasRefinanciamentoResponse.comissaoGarantia) &&
        Objects.equals(this.agenciamento, taxasRefinanciamentoResponse.agenciamento) &&
        Objects.equals(this.taxaMaximaProximoPeriodo, taxasRefinanciamentoResponse.taxaMaximaProximoPeriodo) &&
        Objects.equals(this.taxaEncargosFinanciamento, taxasRefinanciamentoResponse.taxaEncargosFinanciamento) &&
        Objects.equals(this.taxaMaximaSaque, taxasRefinanciamentoResponse.taxaMaximaSaque) &&
        Objects.equals(this.taxaSaque, taxasRefinanciamentoResponse.taxaSaque) &&
        Objects.equals(this.taxaMaximaCompraJuros, taxasRefinanciamentoResponse.taxaMaximaCompraJuros) &&
        Objects.equals(this.taxaCompraJuros, taxasRefinanciamentoResponse.taxaCompraJuros) &&
        Objects.equals(this.taxaPermanencia, taxasRefinanciamentoResponse.taxaPermanencia) &&
        Objects.equals(this.taxaRefinanciamento, taxasRefinanciamentoResponse.taxaRefinanciamento) &&
        Objects.equals(this.taxaRecuperacaoRefinanciamento, taxasRefinanciamentoResponse.taxaRecuperacaoRefinanciamento) &&
        Objects.equals(this.taxaPercCalcPagamentoMinimo, taxasRefinanciamentoResponse.taxaPercCalcPagamentoMinimo) &&
        Objects.equals(this.planoTaxaDefault, taxasRefinanciamentoResponse.planoTaxaDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, idProduto, idPlanoConta, idPlanoPct, idPlanoCreditoTaxa, dataEntrada, vencimento, recuperacaoEncargosFinanceiros, comissaoGarantia, agenciamento, taxaMaximaProximoPeriodo, taxaEncargosFinanciamento, taxaMaximaSaque, taxaSaque, taxaMaximaCompraJuros, taxaCompraJuros, taxaPermanencia, taxaRefinanciamento, taxaRecuperacaoRefinanciamento, taxaPercCalcPagamentoMinimo, planoTaxaDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxasRefinanciamentoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idPlanoConta: ").append(toIndentedString(idPlanoConta)).append("\n");
    sb.append("    idPlanoPct: ").append(toIndentedString(idPlanoPct)).append("\n");
    sb.append("    idPlanoCreditoTaxa: ").append(toIndentedString(idPlanoCreditoTaxa)).append("\n");
    sb.append("    dataEntrada: ").append(toIndentedString(dataEntrada)).append("\n");
    sb.append("    vencimento: ").append(toIndentedString(vencimento)).append("\n");
    sb.append("    recuperacaoEncargosFinanceiros: ").append(toIndentedString(recuperacaoEncargosFinanceiros)).append("\n");
    sb.append("    comissaoGarantia: ").append(toIndentedString(comissaoGarantia)).append("\n");
    sb.append("    agenciamento: ").append(toIndentedString(agenciamento)).append("\n");
    sb.append("    taxaMaximaProximoPeriodo: ").append(toIndentedString(taxaMaximaProximoPeriodo)).append("\n");
    sb.append("    taxaEncargosFinanciamento: ").append(toIndentedString(taxaEncargosFinanciamento)).append("\n");
    sb.append("    taxaMaximaSaque: ").append(toIndentedString(taxaMaximaSaque)).append("\n");
    sb.append("    taxaSaque: ").append(toIndentedString(taxaSaque)).append("\n");
    sb.append("    taxaMaximaCompraJuros: ").append(toIndentedString(taxaMaximaCompraJuros)).append("\n");
    sb.append("    taxaCompraJuros: ").append(toIndentedString(taxaCompraJuros)).append("\n");
    sb.append("    taxaPermanencia: ").append(toIndentedString(taxaPermanencia)).append("\n");
    sb.append("    taxaRefinanciamento: ").append(toIndentedString(taxaRefinanciamento)).append("\n");
    sb.append("    taxaRecuperacaoRefinanciamento: ").append(toIndentedString(taxaRecuperacaoRefinanciamento)).append("\n");
    sb.append("    taxaPercCalcPagamentoMinimo: ").append(toIndentedString(taxaPercCalcPagamentoMinimo)).append("\n");
    sb.append("    planoTaxaDefault: ").append(toIndentedString(planoTaxaDefault)).append("\n");
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

