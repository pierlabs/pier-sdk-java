package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{fatura_fechada_response_description}}}
 **/

@ApiModel(description = "{{{fatura_fechada_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class FaturaFechadaResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Integer flagEmiteFatura = null;
  private String dataVencimentoFatura = null;
  private BigDecimal valorTotalFatura = null;
  private BigDecimal valorFaturaAnterior = null;
  private BigDecimal valorPagamentoMinimo = null;
  private BigDecimal totalComprasNacionais = null;
  private BigDecimal totalComprasInternacionas = null;
  private BigDecimal totalSaquesNacionais = null;
  private BigDecimal totalSaquesInternacionais = null;
  private BigDecimal totalDebitosNacionais = null;
  private BigDecimal totalDebitosRecorrentes = null;
  private BigDecimal totalDebitosInternacionais = null;
  private BigDecimal totalDebitosDiversosNacionais = null;
  private BigDecimal totalDebitosOpcionais = null;
  private BigDecimal totalPagamentos = null;
  private BigDecimal totalCreditosNacionais = null;
  private BigDecimal totalAjustes = null;
  private BigDecimal totalTarifas = null;
  private BigDecimal totalMulta = null;
  private BigDecimal totalJuros = null;
  private BigDecimal taxaRotativo = null;
  private BigDecimal taxaSaque = null;
  private BigDecimal taxaMaximaProximoPeriodo = null;
  private BigDecimal totalServicos = null;
  private BigDecimal totalParceladoNacionais = null;
  private BigDecimal totalParceladoInternacionais = null;

  
  /**
   * {{{fatura_fechada_response_id_value}}}
   **/
  public FaturaFechadaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{fatura_fechada_response_id_conta_value}}}
   **/
  public FaturaFechadaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{fatura_fechada_response_flag_emite_fatura_value}}}
   **/
  public FaturaFechadaResponse flagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_flag_emite_fatura_value}}}")
  @JsonProperty("flagEmiteFatura")
  public Integer getFlagEmiteFatura() {
    return flagEmiteFatura;
  }
  public void setFlagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
  }

  
  /**
   * {{{fatura_fechada_response_data_vencimento_fatura_value}}}
   **/
  public FaturaFechadaResponse dataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_data_vencimento_fatura_value}}}")
  @JsonProperty("dataVencimentoFatura")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * {{{fatura_fechada_response_valor_total_fatura_value}}}
   **/
  public FaturaFechadaResponse valorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_valor_total_fatura_value}}}")
  @JsonProperty("valorTotalFatura")
  public BigDecimal getValorTotalFatura() {
    return valorTotalFatura;
  }
  public void setValorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
  }

  
  /**
   * {{{fatura_fechada_response_valor_fatura_anterior_value}}}
   **/
  public FaturaFechadaResponse valorFaturaAnterior(BigDecimal valorFaturaAnterior) {
    this.valorFaturaAnterior = valorFaturaAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_valor_fatura_anterior_value}}}")
  @JsonProperty("valorFaturaAnterior")
  public BigDecimal getValorFaturaAnterior() {
    return valorFaturaAnterior;
  }
  public void setValorFaturaAnterior(BigDecimal valorFaturaAnterior) {
    this.valorFaturaAnterior = valorFaturaAnterior;
  }

  
  /**
   * {{{fatura_fechada_response_valor_pagamento_minimo_value}}}
   **/
  public FaturaFechadaResponse valorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_valor_pagamento_minimo_value}}}")
  @JsonProperty("valorPagamentoMinimo")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * {{{fatura_fechada_response_total_compras_nacionais_value}}}
   **/
  public FaturaFechadaResponse totalComprasNacionais(BigDecimal totalComprasNacionais) {
    this.totalComprasNacionais = totalComprasNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_total_compras_nacionais_value}}}")
  @JsonProperty("totalComprasNacionais")
  public BigDecimal getTotalComprasNacionais() {
    return totalComprasNacionais;
  }
  public void setTotalComprasNacionais(BigDecimal totalComprasNacionais) {
    this.totalComprasNacionais = totalComprasNacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_compras_internacionas_value}}}
   **/
  public FaturaFechadaResponse totalComprasInternacionas(BigDecimal totalComprasInternacionas) {
    this.totalComprasInternacionas = totalComprasInternacionas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_total_compras_internacionas_value}}}")
  @JsonProperty("totalComprasInternacionas")
  public BigDecimal getTotalComprasInternacionas() {
    return totalComprasInternacionas;
  }
  public void setTotalComprasInternacionas(BigDecimal totalComprasInternacionas) {
    this.totalComprasInternacionas = totalComprasInternacionas;
  }

  
  /**
   * {{{fatura_fechada_response_total_saques_nacionais_value}}}
   **/
  public FaturaFechadaResponse totalSaquesNacionais(BigDecimal totalSaquesNacionais) {
    this.totalSaquesNacionais = totalSaquesNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_total_saques_nacionais_value}}}")
  @JsonProperty("totalSaquesNacionais")
  public BigDecimal getTotalSaquesNacionais() {
    return totalSaquesNacionais;
  }
  public void setTotalSaquesNacionais(BigDecimal totalSaquesNacionais) {
    this.totalSaquesNacionais = totalSaquesNacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_saques_internacionais_value}}}
   **/
  public FaturaFechadaResponse totalSaquesInternacionais(BigDecimal totalSaquesInternacionais) {
    this.totalSaquesInternacionais = totalSaquesInternacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_total_saques_internacionais_value}}}")
  @JsonProperty("totalSaquesInternacionais")
  public BigDecimal getTotalSaquesInternacionais() {
    return totalSaquesInternacionais;
  }
  public void setTotalSaquesInternacionais(BigDecimal totalSaquesInternacionais) {
    this.totalSaquesInternacionais = totalSaquesInternacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_debitos_nacionais_value}}}
   **/
  public FaturaFechadaResponse totalDebitosNacionais(BigDecimal totalDebitosNacionais) {
    this.totalDebitosNacionais = totalDebitosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_total_debitos_nacionais_value}}}")
  @JsonProperty("totalDebitosNacionais")
  public BigDecimal getTotalDebitosNacionais() {
    return totalDebitosNacionais;
  }
  public void setTotalDebitosNacionais(BigDecimal totalDebitosNacionais) {
    this.totalDebitosNacionais = totalDebitosNacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_debitos_recorrentes_value}}}
   **/
  public FaturaFechadaResponse totalDebitosRecorrentes(BigDecimal totalDebitosRecorrentes) {
    this.totalDebitosRecorrentes = totalDebitosRecorrentes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_total_debitos_recorrentes_value}}}")
  @JsonProperty("totalDebitosRecorrentes")
  public BigDecimal getTotalDebitosRecorrentes() {
    return totalDebitosRecorrentes;
  }
  public void setTotalDebitosRecorrentes(BigDecimal totalDebitosRecorrentes) {
    this.totalDebitosRecorrentes = totalDebitosRecorrentes;
  }

  
  /**
   * {{{fatura_fechada_response_total_debitos_internacionais_value}}}
   **/
  public FaturaFechadaResponse totalDebitosInternacionais(BigDecimal totalDebitosInternacionais) {
    this.totalDebitosInternacionais = totalDebitosInternacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_total_debitos_internacionais_value}}}")
  @JsonProperty("totalDebitosInternacionais")
  public BigDecimal getTotalDebitosInternacionais() {
    return totalDebitosInternacionais;
  }
  public void setTotalDebitosInternacionais(BigDecimal totalDebitosInternacionais) {
    this.totalDebitosInternacionais = totalDebitosInternacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_debitos_diversos_nacionais_value}}}
   **/
  public FaturaFechadaResponse totalDebitosDiversosNacionais(BigDecimal totalDebitosDiversosNacionais) {
    this.totalDebitosDiversosNacionais = totalDebitosDiversosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_total_debitos_diversos_nacionais_value}}}")
  @JsonProperty("totalDebitosDiversosNacionais")
  public BigDecimal getTotalDebitosDiversosNacionais() {
    return totalDebitosDiversosNacionais;
  }
  public void setTotalDebitosDiversosNacionais(BigDecimal totalDebitosDiversosNacionais) {
    this.totalDebitosDiversosNacionais = totalDebitosDiversosNacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_debitos_opcionais_value}}}
   **/
  public FaturaFechadaResponse totalDebitosOpcionais(BigDecimal totalDebitosOpcionais) {
    this.totalDebitosOpcionais = totalDebitosOpcionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_total_debitos_opcionais_value}}}")
  @JsonProperty("totalDebitosOpcionais")
  public BigDecimal getTotalDebitosOpcionais() {
    return totalDebitosOpcionais;
  }
  public void setTotalDebitosOpcionais(BigDecimal totalDebitosOpcionais) {
    this.totalDebitosOpcionais = totalDebitosOpcionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_pagamentos_value}}}
   **/
  public FaturaFechadaResponse totalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_total_pagamentos_value}}}")
  @JsonProperty("totalPagamentos")
  public BigDecimal getTotalPagamentos() {
    return totalPagamentos;
  }
  public void setTotalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
  }

  
  /**
   * {{{fatura_fechada_response_total_creditos_nacionais_value}}}
   **/
  public FaturaFechadaResponse totalCreditosNacionais(BigDecimal totalCreditosNacionais) {
    this.totalCreditosNacionais = totalCreditosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_total_creditos_nacionais_value}}}")
  @JsonProperty("totalCreditosNacionais")
  public BigDecimal getTotalCreditosNacionais() {
    return totalCreditosNacionais;
  }
  public void setTotalCreditosNacionais(BigDecimal totalCreditosNacionais) {
    this.totalCreditosNacionais = totalCreditosNacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_ajustes_value}}}
   **/
  public FaturaFechadaResponse totalAjustes(BigDecimal totalAjustes) {
    this.totalAjustes = totalAjustes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_total_ajustes_value}}}")
  @JsonProperty("totalAjustes")
  public BigDecimal getTotalAjustes() {
    return totalAjustes;
  }
  public void setTotalAjustes(BigDecimal totalAjustes) {
    this.totalAjustes = totalAjustes;
  }

  
  /**
   * {{{fatura_fechada_response_total_tarifas_value}}}
   **/
  public FaturaFechadaResponse totalTarifas(BigDecimal totalTarifas) {
    this.totalTarifas = totalTarifas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_total_tarifas_value}}}")
  @JsonProperty("totalTarifas")
  public BigDecimal getTotalTarifas() {
    return totalTarifas;
  }
  public void setTotalTarifas(BigDecimal totalTarifas) {
    this.totalTarifas = totalTarifas;
  }

  
  /**
   * {{{fatura_fechada_response_total_multa_value}}}
   **/
  public FaturaFechadaResponse totalMulta(BigDecimal totalMulta) {
    this.totalMulta = totalMulta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_total_multa_value}}}")
  @JsonProperty("totalMulta")
  public BigDecimal getTotalMulta() {
    return totalMulta;
  }
  public void setTotalMulta(BigDecimal totalMulta) {
    this.totalMulta = totalMulta;
  }

  
  /**
   * {{{fatura_fechada_response_total_juros_value}}}
   **/
  public FaturaFechadaResponse totalJuros(BigDecimal totalJuros) {
    this.totalJuros = totalJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_total_juros_value}}}")
  @JsonProperty("totalJuros")
  public BigDecimal getTotalJuros() {
    return totalJuros;
  }
  public void setTotalJuros(BigDecimal totalJuros) {
    this.totalJuros = totalJuros;
  }

  
  /**
   * {{{fatura_fechada_response_taxa_rotativo_value}}}
   **/
  public FaturaFechadaResponse taxaRotativo(BigDecimal taxaRotativo) {
    this.taxaRotativo = taxaRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_taxa_rotativo_value}}}")
  @JsonProperty("taxaRotativo")
  public BigDecimal getTaxaRotativo() {
    return taxaRotativo;
  }
  public void setTaxaRotativo(BigDecimal taxaRotativo) {
    this.taxaRotativo = taxaRotativo;
  }

  
  /**
   * {{{fatura_fechada_response_taxa_saque_value}}}
   **/
  public FaturaFechadaResponse taxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_taxa_saque_value}}}")
  @JsonProperty("taxaSaque")
  public BigDecimal getTaxaSaque() {
    return taxaSaque;
  }
  public void setTaxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
  }

  
  /**
   * {{{fatura_fechada_response_taxa_maxima_proximo_periodo_value}}}
   **/
  public FaturaFechadaResponse taxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_fechada_response_taxa_maxima_proximo_periodo_value}}}")
  @JsonProperty("taxaMaximaProximoPeriodo")
  public BigDecimal getTaxaMaximaProximoPeriodo() {
    return taxaMaximaProximoPeriodo;
  }
  public void setTaxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
  }

  
  /**
   * {{{fatura_fechada_response_total_servicos_value}}}
   **/
  public FaturaFechadaResponse totalServicos(BigDecimal totalServicos) {
    this.totalServicos = totalServicos;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{fatura_fechada_response_total_servicos_value}}}")
  @JsonProperty("totalServicos")
  public BigDecimal getTotalServicos() {
    return totalServicos;
  }
  public void setTotalServicos(BigDecimal totalServicos) {
    this.totalServicos = totalServicos;
  }

  
  /**
   * {{{fatura_fechada_response_total_parcelado_nacionais_value}}}
   **/
  public FaturaFechadaResponse totalParceladoNacionais(BigDecimal totalParceladoNacionais) {
    this.totalParceladoNacionais = totalParceladoNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{fatura_fechada_response_total_parcelado_nacionais_value}}}")
  @JsonProperty("totalParceladoNacionais")
  public BigDecimal getTotalParceladoNacionais() {
    return totalParceladoNacionais;
  }
  public void setTotalParceladoNacionais(BigDecimal totalParceladoNacionais) {
    this.totalParceladoNacionais = totalParceladoNacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_parcelado_internacionais_value}}}
   **/
  public FaturaFechadaResponse totalParceladoInternacionais(BigDecimal totalParceladoInternacionais) {
    this.totalParceladoInternacionais = totalParceladoInternacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{fatura_fechada_response_total_parcelado_internacionais_value}}}")
  @JsonProperty("totalParceladoInternacionais")
  public BigDecimal getTotalParceladoInternacionais() {
    return totalParceladoInternacionais;
  }
  public void setTotalParceladoInternacionais(BigDecimal totalParceladoInternacionais) {
    this.totalParceladoInternacionais = totalParceladoInternacionais;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaturaFechadaResponse faturaFechadaResponse = (FaturaFechadaResponse) o;
    return Objects.equals(this.id, faturaFechadaResponse.id) &&
        Objects.equals(this.idConta, faturaFechadaResponse.idConta) &&
        Objects.equals(this.flagEmiteFatura, faturaFechadaResponse.flagEmiteFatura) &&
        Objects.equals(this.dataVencimentoFatura, faturaFechadaResponse.dataVencimentoFatura) &&
        Objects.equals(this.valorTotalFatura, faturaFechadaResponse.valorTotalFatura) &&
        Objects.equals(this.valorFaturaAnterior, faturaFechadaResponse.valorFaturaAnterior) &&
        Objects.equals(this.valorPagamentoMinimo, faturaFechadaResponse.valorPagamentoMinimo) &&
        Objects.equals(this.totalComprasNacionais, faturaFechadaResponse.totalComprasNacionais) &&
        Objects.equals(this.totalComprasInternacionas, faturaFechadaResponse.totalComprasInternacionas) &&
        Objects.equals(this.totalSaquesNacionais, faturaFechadaResponse.totalSaquesNacionais) &&
        Objects.equals(this.totalSaquesInternacionais, faturaFechadaResponse.totalSaquesInternacionais) &&
        Objects.equals(this.totalDebitosNacionais, faturaFechadaResponse.totalDebitosNacionais) &&
        Objects.equals(this.totalDebitosRecorrentes, faturaFechadaResponse.totalDebitosRecorrentes) &&
        Objects.equals(this.totalDebitosInternacionais, faturaFechadaResponse.totalDebitosInternacionais) &&
        Objects.equals(this.totalDebitosDiversosNacionais, faturaFechadaResponse.totalDebitosDiversosNacionais) &&
        Objects.equals(this.totalDebitosOpcionais, faturaFechadaResponse.totalDebitosOpcionais) &&
        Objects.equals(this.totalPagamentos, faturaFechadaResponse.totalPagamentos) &&
        Objects.equals(this.totalCreditosNacionais, faturaFechadaResponse.totalCreditosNacionais) &&
        Objects.equals(this.totalAjustes, faturaFechadaResponse.totalAjustes) &&
        Objects.equals(this.totalTarifas, faturaFechadaResponse.totalTarifas) &&
        Objects.equals(this.totalMulta, faturaFechadaResponse.totalMulta) &&
        Objects.equals(this.totalJuros, faturaFechadaResponse.totalJuros) &&
        Objects.equals(this.taxaRotativo, faturaFechadaResponse.taxaRotativo) &&
        Objects.equals(this.taxaSaque, faturaFechadaResponse.taxaSaque) &&
        Objects.equals(this.taxaMaximaProximoPeriodo, faturaFechadaResponse.taxaMaximaProximoPeriodo) &&
        Objects.equals(this.totalServicos, faturaFechadaResponse.totalServicos) &&
        Objects.equals(this.totalParceladoNacionais, faturaFechadaResponse.totalParceladoNacionais) &&
        Objects.equals(this.totalParceladoInternacionais, faturaFechadaResponse.totalParceladoInternacionais);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, flagEmiteFatura, dataVencimentoFatura, valorTotalFatura, valorFaturaAnterior, valorPagamentoMinimo, totalComprasNacionais, totalComprasInternacionas, totalSaquesNacionais, totalSaquesInternacionais, totalDebitosNacionais, totalDebitosRecorrentes, totalDebitosInternacionais, totalDebitosDiversosNacionais, totalDebitosOpcionais, totalPagamentos, totalCreditosNacionais, totalAjustes, totalTarifas, totalMulta, totalJuros, taxaRotativo, taxaSaque, taxaMaximaProximoPeriodo, totalServicos, totalParceladoNacionais, totalParceladoInternacionais);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaFechadaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    flagEmiteFatura: ").append(toIndentedString(flagEmiteFatura)).append("\n");
    sb.append("    dataVencimentoFatura: ").append(toIndentedString(dataVencimentoFatura)).append("\n");
    sb.append("    valorTotalFatura: ").append(toIndentedString(valorTotalFatura)).append("\n");
    sb.append("    valorFaturaAnterior: ").append(toIndentedString(valorFaturaAnterior)).append("\n");
    sb.append("    valorPagamentoMinimo: ").append(toIndentedString(valorPagamentoMinimo)).append("\n");
    sb.append("    totalComprasNacionais: ").append(toIndentedString(totalComprasNacionais)).append("\n");
    sb.append("    totalComprasInternacionas: ").append(toIndentedString(totalComprasInternacionas)).append("\n");
    sb.append("    totalSaquesNacionais: ").append(toIndentedString(totalSaquesNacionais)).append("\n");
    sb.append("    totalSaquesInternacionais: ").append(toIndentedString(totalSaquesInternacionais)).append("\n");
    sb.append("    totalDebitosNacionais: ").append(toIndentedString(totalDebitosNacionais)).append("\n");
    sb.append("    totalDebitosRecorrentes: ").append(toIndentedString(totalDebitosRecorrentes)).append("\n");
    sb.append("    totalDebitosInternacionais: ").append(toIndentedString(totalDebitosInternacionais)).append("\n");
    sb.append("    totalDebitosDiversosNacionais: ").append(toIndentedString(totalDebitosDiversosNacionais)).append("\n");
    sb.append("    totalDebitosOpcionais: ").append(toIndentedString(totalDebitosOpcionais)).append("\n");
    sb.append("    totalPagamentos: ").append(toIndentedString(totalPagamentos)).append("\n");
    sb.append("    totalCreditosNacionais: ").append(toIndentedString(totalCreditosNacionais)).append("\n");
    sb.append("    totalAjustes: ").append(toIndentedString(totalAjustes)).append("\n");
    sb.append("    totalTarifas: ").append(toIndentedString(totalTarifas)).append("\n");
    sb.append("    totalMulta: ").append(toIndentedString(totalMulta)).append("\n");
    sb.append("    totalJuros: ").append(toIndentedString(totalJuros)).append("\n");
    sb.append("    taxaRotativo: ").append(toIndentedString(taxaRotativo)).append("\n");
    sb.append("    taxaSaque: ").append(toIndentedString(taxaSaque)).append("\n");
    sb.append("    taxaMaximaProximoPeriodo: ").append(toIndentedString(taxaMaximaProximoPeriodo)).append("\n");
    sb.append("    totalServicos: ").append(toIndentedString(totalServicos)).append("\n");
    sb.append("    totalParceladoNacionais: ").append(toIndentedString(totalParceladoNacionais)).append("\n");
    sb.append("    totalParceladoInternacionais: ").append(toIndentedString(totalParceladoInternacionais)).append("\n");
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



