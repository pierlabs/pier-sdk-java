package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{fatura_consignada_response_description}}}
 **/

@ApiModel(description = "{{{fatura_consignada_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class FaturaConsignadaResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Integer flagEmiteFatura = null;
  private String dataVencimentoFatura = null;
  private BigDecimal valorTotalFatura = null;
  private BigDecimal valorFaturaAnterior = null;
  private BigDecimal valorPagamentoMinimo = null;
  private BigDecimal valorPagamentoConsignado = null;
  private BigDecimal valorPagamentoComplementar = null;
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

  
  /**
   * {{{fatura_consignada_response_id_value}}}
   **/
  public FaturaConsignadaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{fatura_consignada_response_id_conta_value}}}
   **/
  public FaturaConsignadaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{fatura_consignada_response_flag_emite_fatura_value}}}
   **/
  public FaturaConsignadaResponse flagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_flag_emite_fatura_value}}}")
  @JsonProperty("flagEmiteFatura")
  public Integer getFlagEmiteFatura() {
    return flagEmiteFatura;
  }
  public void setFlagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
  }

  
  /**
   * {{{fatura_consignada_response_data_vencimento_fatura_value}}}
   **/
  public FaturaConsignadaResponse dataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_data_vencimento_fatura_value}}}")
  @JsonProperty("dataVencimentoFatura")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * {{{fatura_consignada_response_valor_total_fatura_value}}}
   **/
  public FaturaConsignadaResponse valorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_valor_total_fatura_value}}}")
  @JsonProperty("valorTotalFatura")
  public BigDecimal getValorTotalFatura() {
    return valorTotalFatura;
  }
  public void setValorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
  }

  
  /**
   * {{{fatura_consignada_response_valor_fatura_anterior_value}}}
   **/
  public FaturaConsignadaResponse valorFaturaAnterior(BigDecimal valorFaturaAnterior) {
    this.valorFaturaAnterior = valorFaturaAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_valor_fatura_anterior_value}}}")
  @JsonProperty("valorFaturaAnterior")
  public BigDecimal getValorFaturaAnterior() {
    return valorFaturaAnterior;
  }
  public void setValorFaturaAnterior(BigDecimal valorFaturaAnterior) {
    this.valorFaturaAnterior = valorFaturaAnterior;
  }

  
  /**
   * {{{fatura_consignada_response_valor_pagamento_minimo_value}}}
   **/
  public FaturaConsignadaResponse valorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_valor_pagamento_minimo_value}}}")
  @JsonProperty("valorPagamentoMinimo")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * {{{fatura_consignada_response_valor_pagamento_consignado_value}}}
   **/
  public FaturaConsignadaResponse valorPagamentoConsignado(BigDecimal valorPagamentoConsignado) {
    this.valorPagamentoConsignado = valorPagamentoConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_valor_pagamento_consignado_value}}}")
  @JsonProperty("valorPagamentoConsignado")
  public BigDecimal getValorPagamentoConsignado() {
    return valorPagamentoConsignado;
  }
  public void setValorPagamentoConsignado(BigDecimal valorPagamentoConsignado) {
    this.valorPagamentoConsignado = valorPagamentoConsignado;
  }

  
  /**
   * {{{fatura_consignada_response_valor_pagamento_complementar_value}}}
   **/
  public FaturaConsignadaResponse valorPagamentoComplementar(BigDecimal valorPagamentoComplementar) {
    this.valorPagamentoComplementar = valorPagamentoComplementar;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_valor_pagamento_complementar_value}}}")
  @JsonProperty("valorPagamentoComplementar")
  public BigDecimal getValorPagamentoComplementar() {
    return valorPagamentoComplementar;
  }
  public void setValorPagamentoComplementar(BigDecimal valorPagamentoComplementar) {
    this.valorPagamentoComplementar = valorPagamentoComplementar;
  }

  
  /**
   * {{{fatura_consignada_response_total_compras_nacionais_value}}}
   **/
  public FaturaConsignadaResponse totalComprasNacionais(BigDecimal totalComprasNacionais) {
    this.totalComprasNacionais = totalComprasNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_total_compras_nacionais_value}}}")
  @JsonProperty("totalComprasNacionais")
  public BigDecimal getTotalComprasNacionais() {
    return totalComprasNacionais;
  }
  public void setTotalComprasNacionais(BigDecimal totalComprasNacionais) {
    this.totalComprasNacionais = totalComprasNacionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_compras_internacionas_value}}}
   **/
  public FaturaConsignadaResponse totalComprasInternacionas(BigDecimal totalComprasInternacionas) {
    this.totalComprasInternacionas = totalComprasInternacionas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_total_compras_internacionas_value}}}")
  @JsonProperty("totalComprasInternacionas")
  public BigDecimal getTotalComprasInternacionas() {
    return totalComprasInternacionas;
  }
  public void setTotalComprasInternacionas(BigDecimal totalComprasInternacionas) {
    this.totalComprasInternacionas = totalComprasInternacionas;
  }

  
  /**
   * {{{fatura_consignada_response_total_saques_nacionais_value}}}
   **/
  public FaturaConsignadaResponse totalSaquesNacionais(BigDecimal totalSaquesNacionais) {
    this.totalSaquesNacionais = totalSaquesNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_total_saques_nacionais_value}}}")
  @JsonProperty("totalSaquesNacionais")
  public BigDecimal getTotalSaquesNacionais() {
    return totalSaquesNacionais;
  }
  public void setTotalSaquesNacionais(BigDecimal totalSaquesNacionais) {
    this.totalSaquesNacionais = totalSaquesNacionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_saques_internacionais_value}}}
   **/
  public FaturaConsignadaResponse totalSaquesInternacionais(BigDecimal totalSaquesInternacionais) {
    this.totalSaquesInternacionais = totalSaquesInternacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_total_saques_internacionais_value}}}")
  @JsonProperty("totalSaquesInternacionais")
  public BigDecimal getTotalSaquesInternacionais() {
    return totalSaquesInternacionais;
  }
  public void setTotalSaquesInternacionais(BigDecimal totalSaquesInternacionais) {
    this.totalSaquesInternacionais = totalSaquesInternacionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_debitos_nacionais_value}}}
   **/
  public FaturaConsignadaResponse totalDebitosNacionais(BigDecimal totalDebitosNacionais) {
    this.totalDebitosNacionais = totalDebitosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_total_debitos_nacionais_value}}}")
  @JsonProperty("totalDebitosNacionais")
  public BigDecimal getTotalDebitosNacionais() {
    return totalDebitosNacionais;
  }
  public void setTotalDebitosNacionais(BigDecimal totalDebitosNacionais) {
    this.totalDebitosNacionais = totalDebitosNacionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_debitos_recorrentes_value}}}
   **/
  public FaturaConsignadaResponse totalDebitosRecorrentes(BigDecimal totalDebitosRecorrentes) {
    this.totalDebitosRecorrentes = totalDebitosRecorrentes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_total_debitos_recorrentes_value}}}")
  @JsonProperty("totalDebitosRecorrentes")
  public BigDecimal getTotalDebitosRecorrentes() {
    return totalDebitosRecorrentes;
  }
  public void setTotalDebitosRecorrentes(BigDecimal totalDebitosRecorrentes) {
    this.totalDebitosRecorrentes = totalDebitosRecorrentes;
  }

  
  /**
   * {{{fatura_consignada_response_total_debitos_internacionais_value}}}
   **/
  public FaturaConsignadaResponse totalDebitosInternacionais(BigDecimal totalDebitosInternacionais) {
    this.totalDebitosInternacionais = totalDebitosInternacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_total_debitos_internacionais_value}}}")
  @JsonProperty("totalDebitosInternacionais")
  public BigDecimal getTotalDebitosInternacionais() {
    return totalDebitosInternacionais;
  }
  public void setTotalDebitosInternacionais(BigDecimal totalDebitosInternacionais) {
    this.totalDebitosInternacionais = totalDebitosInternacionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_debitos_diversos_nacionais_value}}}
   **/
  public FaturaConsignadaResponse totalDebitosDiversosNacionais(BigDecimal totalDebitosDiversosNacionais) {
    this.totalDebitosDiversosNacionais = totalDebitosDiversosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_total_debitos_diversos_nacionais_value}}}")
  @JsonProperty("totalDebitosDiversosNacionais")
  public BigDecimal getTotalDebitosDiversosNacionais() {
    return totalDebitosDiversosNacionais;
  }
  public void setTotalDebitosDiversosNacionais(BigDecimal totalDebitosDiversosNacionais) {
    this.totalDebitosDiversosNacionais = totalDebitosDiversosNacionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_debitos_opcionais_value}}}
   **/
  public FaturaConsignadaResponse totalDebitosOpcionais(BigDecimal totalDebitosOpcionais) {
    this.totalDebitosOpcionais = totalDebitosOpcionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_total_debitos_opcionais_value}}}")
  @JsonProperty("totalDebitosOpcionais")
  public BigDecimal getTotalDebitosOpcionais() {
    return totalDebitosOpcionais;
  }
  public void setTotalDebitosOpcionais(BigDecimal totalDebitosOpcionais) {
    this.totalDebitosOpcionais = totalDebitosOpcionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_pagamentos_value}}}
   **/
  public FaturaConsignadaResponse totalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_total_pagamentos_value}}}")
  @JsonProperty("totalPagamentos")
  public BigDecimal getTotalPagamentos() {
    return totalPagamentos;
  }
  public void setTotalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
  }

  
  /**
   * {{{fatura_consignada_response_total_creditos_nacionais_value}}}
   **/
  public FaturaConsignadaResponse totalCreditosNacionais(BigDecimal totalCreditosNacionais) {
    this.totalCreditosNacionais = totalCreditosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_total_creditos_nacionais_value}}}")
  @JsonProperty("totalCreditosNacionais")
  public BigDecimal getTotalCreditosNacionais() {
    return totalCreditosNacionais;
  }
  public void setTotalCreditosNacionais(BigDecimal totalCreditosNacionais) {
    this.totalCreditosNacionais = totalCreditosNacionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_ajustes_value}}}
   **/
  public FaturaConsignadaResponse totalAjustes(BigDecimal totalAjustes) {
    this.totalAjustes = totalAjustes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_total_ajustes_value}}}")
  @JsonProperty("totalAjustes")
  public BigDecimal getTotalAjustes() {
    return totalAjustes;
  }
  public void setTotalAjustes(BigDecimal totalAjustes) {
    this.totalAjustes = totalAjustes;
  }

  
  /**
   * {{{fatura_consignada_response_total_tarifas_value}}}
   **/
  public FaturaConsignadaResponse totalTarifas(BigDecimal totalTarifas) {
    this.totalTarifas = totalTarifas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_total_tarifas_value}}}")
  @JsonProperty("totalTarifas")
  public BigDecimal getTotalTarifas() {
    return totalTarifas;
  }
  public void setTotalTarifas(BigDecimal totalTarifas) {
    this.totalTarifas = totalTarifas;
  }

  
  /**
   * {{{fatura_consignada_response_total_multa_value}}}
   **/
  public FaturaConsignadaResponse totalMulta(BigDecimal totalMulta) {
    this.totalMulta = totalMulta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_total_multa_value}}}")
  @JsonProperty("totalMulta")
  public BigDecimal getTotalMulta() {
    return totalMulta;
  }
  public void setTotalMulta(BigDecimal totalMulta) {
    this.totalMulta = totalMulta;
  }

  
  /**
   * {{{fatura_consignada_response_total_juros_value}}}
   **/
  public FaturaConsignadaResponse totalJuros(BigDecimal totalJuros) {
    this.totalJuros = totalJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_total_juros_value}}}")
  @JsonProperty("totalJuros")
  public BigDecimal getTotalJuros() {
    return totalJuros;
  }
  public void setTotalJuros(BigDecimal totalJuros) {
    this.totalJuros = totalJuros;
  }

  
  /**
   * {{{fatura_consignada_response_taxa_rotativo_value}}}
   **/
  public FaturaConsignadaResponse taxaRotativo(BigDecimal taxaRotativo) {
    this.taxaRotativo = taxaRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_taxa_rotativo_value}}}")
  @JsonProperty("taxaRotativo")
  public BigDecimal getTaxaRotativo() {
    return taxaRotativo;
  }
  public void setTaxaRotativo(BigDecimal taxaRotativo) {
    this.taxaRotativo = taxaRotativo;
  }

  
  /**
   * {{{fatura_consignada_response_taxa_saque_value}}}
   **/
  public FaturaConsignadaResponse taxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_taxa_saque_value}}}")
  @JsonProperty("taxaSaque")
  public BigDecimal getTaxaSaque() {
    return taxaSaque;
  }
  public void setTaxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
  }

  
  /**
   * {{{fatura_consignada_response_taxa_maxima_proximo_periodo_value}}}
   **/
  public FaturaConsignadaResponse taxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_consignada_response_taxa_maxima_proximo_periodo_value}}}")
  @JsonProperty("taxaMaximaProximoPeriodo")
  public BigDecimal getTaxaMaximaProximoPeriodo() {
    return taxaMaximaProximoPeriodo;
  }
  public void setTaxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
  }

  
  /**
   * {{{fatura_consignada_response_total_servicos_value}}}
   **/
  public FaturaConsignadaResponse totalServicos(BigDecimal totalServicos) {
    this.totalServicos = totalServicos;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{fatura_consignada_response_total_servicos_value}}}")
  @JsonProperty("totalServicos")
  public BigDecimal getTotalServicos() {
    return totalServicos;
  }
  public void setTotalServicos(BigDecimal totalServicos) {
    this.totalServicos = totalServicos;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaturaConsignadaResponse faturaConsignadaResponse = (FaturaConsignadaResponse) o;
    return Objects.equals(this.id, faturaConsignadaResponse.id) &&
        Objects.equals(this.idConta, faturaConsignadaResponse.idConta) &&
        Objects.equals(this.flagEmiteFatura, faturaConsignadaResponse.flagEmiteFatura) &&
        Objects.equals(this.dataVencimentoFatura, faturaConsignadaResponse.dataVencimentoFatura) &&
        Objects.equals(this.valorTotalFatura, faturaConsignadaResponse.valorTotalFatura) &&
        Objects.equals(this.valorFaturaAnterior, faturaConsignadaResponse.valorFaturaAnterior) &&
        Objects.equals(this.valorPagamentoMinimo, faturaConsignadaResponse.valorPagamentoMinimo) &&
        Objects.equals(this.valorPagamentoConsignado, faturaConsignadaResponse.valorPagamentoConsignado) &&
        Objects.equals(this.valorPagamentoComplementar, faturaConsignadaResponse.valorPagamentoComplementar) &&
        Objects.equals(this.totalComprasNacionais, faturaConsignadaResponse.totalComprasNacionais) &&
        Objects.equals(this.totalComprasInternacionas, faturaConsignadaResponse.totalComprasInternacionas) &&
        Objects.equals(this.totalSaquesNacionais, faturaConsignadaResponse.totalSaquesNacionais) &&
        Objects.equals(this.totalSaquesInternacionais, faturaConsignadaResponse.totalSaquesInternacionais) &&
        Objects.equals(this.totalDebitosNacionais, faturaConsignadaResponse.totalDebitosNacionais) &&
        Objects.equals(this.totalDebitosRecorrentes, faturaConsignadaResponse.totalDebitosRecorrentes) &&
        Objects.equals(this.totalDebitosInternacionais, faturaConsignadaResponse.totalDebitosInternacionais) &&
        Objects.equals(this.totalDebitosDiversosNacionais, faturaConsignadaResponse.totalDebitosDiversosNacionais) &&
        Objects.equals(this.totalDebitosOpcionais, faturaConsignadaResponse.totalDebitosOpcionais) &&
        Objects.equals(this.totalPagamentos, faturaConsignadaResponse.totalPagamentos) &&
        Objects.equals(this.totalCreditosNacionais, faturaConsignadaResponse.totalCreditosNacionais) &&
        Objects.equals(this.totalAjustes, faturaConsignadaResponse.totalAjustes) &&
        Objects.equals(this.totalTarifas, faturaConsignadaResponse.totalTarifas) &&
        Objects.equals(this.totalMulta, faturaConsignadaResponse.totalMulta) &&
        Objects.equals(this.totalJuros, faturaConsignadaResponse.totalJuros) &&
        Objects.equals(this.taxaRotativo, faturaConsignadaResponse.taxaRotativo) &&
        Objects.equals(this.taxaSaque, faturaConsignadaResponse.taxaSaque) &&
        Objects.equals(this.taxaMaximaProximoPeriodo, faturaConsignadaResponse.taxaMaximaProximoPeriodo) &&
        Objects.equals(this.totalServicos, faturaConsignadaResponse.totalServicos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, flagEmiteFatura, dataVencimentoFatura, valorTotalFatura, valorFaturaAnterior, valorPagamentoMinimo, valorPagamentoConsignado, valorPagamentoComplementar, totalComprasNacionais, totalComprasInternacionas, totalSaquesNacionais, totalSaquesInternacionais, totalDebitosNacionais, totalDebitosRecorrentes, totalDebitosInternacionais, totalDebitosDiversosNacionais, totalDebitosOpcionais, totalPagamentos, totalCreditosNacionais, totalAjustes, totalTarifas, totalMulta, totalJuros, taxaRotativo, taxaSaque, taxaMaximaProximoPeriodo, totalServicos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaConsignadaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    flagEmiteFatura: ").append(toIndentedString(flagEmiteFatura)).append("\n");
    sb.append("    dataVencimentoFatura: ").append(toIndentedString(dataVencimentoFatura)).append("\n");
    sb.append("    valorTotalFatura: ").append(toIndentedString(valorTotalFatura)).append("\n");
    sb.append("    valorFaturaAnterior: ").append(toIndentedString(valorFaturaAnterior)).append("\n");
    sb.append("    valorPagamentoMinimo: ").append(toIndentedString(valorPagamentoMinimo)).append("\n");
    sb.append("    valorPagamentoConsignado: ").append(toIndentedString(valorPagamentoConsignado)).append("\n");
    sb.append("    valorPagamentoComplementar: ").append(toIndentedString(valorPagamentoComplementar)).append("\n");
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



