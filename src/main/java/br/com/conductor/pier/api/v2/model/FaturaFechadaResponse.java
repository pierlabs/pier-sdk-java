package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Invoice
 **/

@ApiModel(description = "Invoice")
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
   * Identifier Code of the invoice
   **/
  public FaturaFechadaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier Code of the invoice")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identifier code of the account
   **/
  public FaturaFechadaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier code of the account")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identifier Code of the account which the invoice refers to
   **/
  public FaturaFechadaResponse flagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier Code of the account which the invoice refers to")
  @JsonProperty("flagEmiteFatura")
  public Integer getFlagEmiteFatura() {
    return flagEmiteFatura;
  }
  public void setFlagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
  }

  
  /**
   * Expiration date of the invoice
   **/
  public FaturaFechadaResponse dataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expiration date of the invoice")
  @JsonProperty("dataVencimentoFatura")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * Value for the total payment of the invoice
   **/
  public FaturaFechadaResponse valorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value for the total payment of the invoice")
  @JsonProperty("valorTotalFatura")
  public BigDecimal getValorTotalFatura() {
    return valorTotalFatura;
  }
  public void setValorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
  }

  
  /**
   * Total value of the previous invoice
   **/
  public FaturaFechadaResponse valorFaturaAnterior(BigDecimal valorFaturaAnterior) {
    this.valorFaturaAnterior = valorFaturaAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the previous invoice")
  @JsonProperty("valorFaturaAnterior")
  public BigDecimal getValorFaturaAnterior() {
    return valorFaturaAnterior;
  }
  public void setValorFaturaAnterior(BigDecimal valorFaturaAnterior) {
    this.valorFaturaAnterior = valorFaturaAnterior;
  }

  
  /**
   * Minimum value for payment of the invoice
   **/
  public FaturaFechadaResponse valorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum value for payment of the invoice")
  @JsonProperty("valorPagamentoMinimo")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * Total value of the national shops launched in the invoice
   **/
  public FaturaFechadaResponse totalComprasNacionais(BigDecimal totalComprasNacionais) {
    this.totalComprasNacionais = totalComprasNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the national shops launched in the invoice")
  @JsonProperty("totalComprasNacionais")
  public BigDecimal getTotalComprasNacionais() {
    return totalComprasNacionais;
  }
  public void setTotalComprasNacionais(BigDecimal totalComprasNacionais) {
    this.totalComprasNacionais = totalComprasNacionais;
  }

  
  /**
   * Total value of the internatitional shops launched in the invoice
   **/
  public FaturaFechadaResponse totalComprasInternacionas(BigDecimal totalComprasInternacionas) {
    this.totalComprasInternacionas = totalComprasInternacionas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the internatitional shops launched in the invoice")
  @JsonProperty("totalComprasInternacionas")
  public BigDecimal getTotalComprasInternacionas() {
    return totalComprasInternacionas;
  }
  public void setTotalComprasInternacionas(BigDecimal totalComprasInternacionas) {
    this.totalComprasInternacionas = totalComprasInternacionas;
  }

  
  /**
   * Total value of the national Withdrawals launched in the invoice
   **/
  public FaturaFechadaResponse totalSaquesNacionais(BigDecimal totalSaquesNacionais) {
    this.totalSaquesNacionais = totalSaquesNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the national Withdrawals launched in the invoice")
  @JsonProperty("totalSaquesNacionais")
  public BigDecimal getTotalSaquesNacionais() {
    return totalSaquesNacionais;
  }
  public void setTotalSaquesNacionais(BigDecimal totalSaquesNacionais) {
    this.totalSaquesNacionais = totalSaquesNacionais;
  }

  
  /**
   * Total value of the international Withdrawals launched in the invoice
   **/
  public FaturaFechadaResponse totalSaquesInternacionais(BigDecimal totalSaquesInternacionais) {
    this.totalSaquesInternacionais = totalSaquesInternacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the international Withdrawals launched in the invoice")
  @JsonProperty("totalSaquesInternacionais")
  public BigDecimal getTotalSaquesInternacionais() {
    return totalSaquesInternacionais;
  }
  public void setTotalSaquesInternacionais(BigDecimal totalSaquesInternacionais) {
    this.totalSaquesInternacionais = totalSaquesInternacionais;
  }

  
  /**
   * Total Value of the national debits launched in the invoice
   **/
  public FaturaFechadaResponse totalDebitosNacionais(BigDecimal totalDebitosNacionais) {
    this.totalDebitosNacionais = totalDebitosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total Value of the national debits launched in the invoice")
  @JsonProperty("totalDebitosNacionais")
  public BigDecimal getTotalDebitosNacionais() {
    return totalDebitosNacionais;
  }
  public void setTotalDebitosNacionais(BigDecimal totalDebitosNacionais) {
    this.totalDebitosNacionais = totalDebitosNacionais;
  }

  
  /**
   * Total Value of the recurrent debits launched in the invoice
   **/
  public FaturaFechadaResponse totalDebitosRecorrentes(BigDecimal totalDebitosRecorrentes) {
    this.totalDebitosRecorrentes = totalDebitosRecorrentes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total Value of the recurrent debits launched in the invoice")
  @JsonProperty("totalDebitosRecorrentes")
  public BigDecimal getTotalDebitosRecorrentes() {
    return totalDebitosRecorrentes;
  }
  public void setTotalDebitosRecorrentes(BigDecimal totalDebitosRecorrentes) {
    this.totalDebitosRecorrentes = totalDebitosRecorrentes;
  }

  
  /**
   * Total value of the international debits launched in the invoice
   **/
  public FaturaFechadaResponse totalDebitosInternacionais(BigDecimal totalDebitosInternacionais) {
    this.totalDebitosInternacionais = totalDebitosInternacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the international debits launched in the invoice")
  @JsonProperty("totalDebitosInternacionais")
  public BigDecimal getTotalDebitosInternacionais() {
    return totalDebitosInternacionais;
  }
  public void setTotalDebitosInternacionais(BigDecimal totalDebitosInternacionais) {
    this.totalDebitosInternacionais = totalDebitosInternacionais;
  }

  
  /**
   * Total Value of the Several National Debits launched in the invoice
   **/
  public FaturaFechadaResponse totalDebitosDiversosNacionais(BigDecimal totalDebitosDiversosNacionais) {
    this.totalDebitosDiversosNacionais = totalDebitosDiversosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total Value of the Several National Debits launched in the invoice")
  @JsonProperty("totalDebitosDiversosNacionais")
  public BigDecimal getTotalDebitosDiversosNacionais() {
    return totalDebitosDiversosNacionais;
  }
  public void setTotalDebitosDiversosNacionais(BigDecimal totalDebitosDiversosNacionais) {
    this.totalDebitosDiversosNacionais = totalDebitosDiversosNacionais;
  }

  
  /**
   * Total value of the Several Optional Debits launched in the invoice
   **/
  public FaturaFechadaResponse totalDebitosOpcionais(BigDecimal totalDebitosOpcionais) {
    this.totalDebitosOpcionais = totalDebitosOpcionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the Several Optional Debits launched in the invoice")
  @JsonProperty("totalDebitosOpcionais")
  public BigDecimal getTotalDebitosOpcionais() {
    return totalDebitosOpcionais;
  }
  public void setTotalDebitosOpcionais(BigDecimal totalDebitosOpcionais) {
    this.totalDebitosOpcionais = totalDebitosOpcionais;
  }

  
  /**
   * total value of the payments launched in the invoice
   **/
  public FaturaFechadaResponse totalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "total value of the payments launched in the invoice")
  @JsonProperty("totalPagamentos")
  public BigDecimal getTotalPagamentos() {
    return totalPagamentos;
  }
  public void setTotalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
  }

  
  /**
   * Total value of the national credits launched in the invoice
   **/
  public FaturaFechadaResponse totalCreditosNacionais(BigDecimal totalCreditosNacionais) {
    this.totalCreditosNacionais = totalCreditosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the national credits launched in the invoice")
  @JsonProperty("totalCreditosNacionais")
  public BigDecimal getTotalCreditosNacionais() {
    return totalCreditosNacionais;
  }
  public void setTotalCreditosNacionais(BigDecimal totalCreditosNacionais) {
    this.totalCreditosNacionais = totalCreditosNacionais;
  }

  
  /**
   * Total value of the adjustments launched in the invoice
   **/
  public FaturaFechadaResponse totalAjustes(BigDecimal totalAjustes) {
    this.totalAjustes = totalAjustes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the adjustments launched in the invoice")
  @JsonProperty("totalAjustes")
  public BigDecimal getTotalAjustes() {
    return totalAjustes;
  }
  public void setTotalAjustes(BigDecimal totalAjustes) {
    this.totalAjustes = totalAjustes;
  }

  
  /**
   * Total value of the fees launched in the invoice
   **/
  public FaturaFechadaResponse totalTarifas(BigDecimal totalTarifas) {
    this.totalTarifas = totalTarifas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the fees launched in the invoice")
  @JsonProperty("totalTarifas")
  public BigDecimal getTotalTarifas() {
    return totalTarifas;
  }
  public void setTotalTarifas(BigDecimal totalTarifas) {
    this.totalTarifas = totalTarifas;
  }

  
  /**
   * Total Value of the fine launched in the invoice
   **/
  public FaturaFechadaResponse totalMulta(BigDecimal totalMulta) {
    this.totalMulta = totalMulta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total Value of the fine launched in the invoice")
  @JsonProperty("totalMulta")
  public BigDecimal getTotalMulta() {
    return totalMulta;
  }
  public void setTotalMulta(BigDecimal totalMulta) {
    this.totalMulta = totalMulta;
  }

  
  /**
   * Total value of the interest launched in the invoice
   **/
  public FaturaFechadaResponse totalJuros(BigDecimal totalJuros) {
    this.totalJuros = totalJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the interest launched in the invoice")
  @JsonProperty("totalJuros")
  public BigDecimal getTotalJuros() {
    return totalJuros;
  }
  public void setTotalJuros(BigDecimal totalJuros) {
    this.totalJuros = totalJuros;
  }

  
  /**
   * Percentage value of the revolving interest taxes
   **/
  public FaturaFechadaResponse taxaRotativo(BigDecimal taxaRotativo) {
    this.taxaRotativo = taxaRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage value of the revolving interest taxes")
  @JsonProperty("taxaRotativo")
  public BigDecimal getTaxaRotativo() {
    return taxaRotativo;
  }
  public void setTaxaRotativo(BigDecimal taxaRotativo) {
    this.taxaRotativo = taxaRotativo;
  }

  
  /**
   * Percentage value of the Withdrawal taxe
   **/
  public FaturaFechadaResponse taxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage value of the Withdrawal taxe")
  @JsonProperty("taxaSaque")
  public BigDecimal getTaxaSaque() {
    return taxaSaque;
  }
  public void setTaxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
  }

  
  /**
   * Maximum percentage value of the charges for the next period
   **/
  public FaturaFechadaResponse taxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum percentage value of the charges for the next period")
  @JsonProperty("taxaMaximaProximoPeriodo")
  public BigDecimal getTaxaMaximaProximoPeriodo() {
    return taxaMaximaProximoPeriodo;
  }
  public void setTaxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
  }

  
  /**
   * Show the sum of all the charged insurances in the invoice of the client
   **/
  public FaturaFechadaResponse totalServicos(BigDecimal totalServicos) {
    this.totalServicos = totalServicos;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Show the sum of all the charged insurances in the invoice of the client")
  @JsonProperty("totalServicos")
  public BigDecimal getTotalServicos() {
    return totalServicos;
  }
  public void setTotalServicos(BigDecimal totalServicos) {
    this.totalServicos = totalServicos;
  }

  
  /**
   * Show the sum of all parceled values + national shops
   **/
  public FaturaFechadaResponse totalParceladoNacionais(BigDecimal totalParceladoNacionais) {
    this.totalParceladoNacionais = totalParceladoNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Show the sum of all parceled values + national shops")
  @JsonProperty("totalParceladoNacionais")
  public BigDecimal getTotalParceladoNacionais() {
    return totalParceladoNacionais;
  }
  public void setTotalParceladoNacionais(BigDecimal totalParceladoNacionais) {
    this.totalParceladoNacionais = totalParceladoNacionais;
  }

  
  /**
   * Show the sum of all the parceled values + international shops
   **/
  public FaturaFechadaResponse totalParceladoInternacionais(BigDecimal totalParceladoInternacionais) {
    this.totalParceladoInternacionais = totalParceladoInternacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Show the sum of all the parceled values + international shops")
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

