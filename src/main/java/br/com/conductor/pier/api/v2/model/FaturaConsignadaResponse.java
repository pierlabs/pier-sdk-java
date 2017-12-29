package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Fatura Consignada
 **/

@ApiModel(description = "Fatura Consignada")
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
   * C\u00C3\u00B3digo identificador da fatura.
   **/
  public FaturaConsignadaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da fatura.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da conta (id).
   **/
  public FaturaConsignadaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da conta (id).")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da conta a qual a fatura se refere.
   **/
  public FaturaConsignadaResponse flagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da conta a qual a fatura se refere.")
  @JsonProperty("flagEmiteFatura")
  public Integer getFlagEmiteFatura() {
    return flagEmiteFatura;
  }
  public void setFlagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
  }

  
  /**
   * Data de vencimento da fatura.
   **/
  public FaturaConsignadaResponse dataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento da fatura.")
  @JsonProperty("dataVencimentoFatura")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * Valor para pagamento total da fatura.
   **/
  public FaturaConsignadaResponse valorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor para pagamento total da fatura.")
  @JsonProperty("valorTotalFatura")
  public BigDecimal getValorTotalFatura() {
    return valorTotalFatura;
  }
  public void setValorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
  }

  
  /**
   * Valor total da fatura anterior.
   **/
  public FaturaConsignadaResponse valorFaturaAnterior(BigDecimal valorFaturaAnterior) {
    this.valorFaturaAnterior = valorFaturaAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total da fatura anterior.")
  @JsonProperty("valorFaturaAnterior")
  public BigDecimal getValorFaturaAnterior() {
    return valorFaturaAnterior;
  }
  public void setValorFaturaAnterior(BigDecimal valorFaturaAnterior) {
    this.valorFaturaAnterior = valorFaturaAnterior;
  }

  
  /**
   * Valor m\u00C3\u00ADnimo para pagamento da fatura.
   **/
  public FaturaConsignadaResponse valorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00C3\u00ADnimo para pagamento da fatura.")
  @JsonProperty("valorPagamentoMinimo")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * Valor da fatura pago atrav\u00C3\u00A9s de desconto em folha.
   **/
  public FaturaConsignadaResponse valorPagamentoConsignado(BigDecimal valorPagamentoConsignado) {
    this.valorPagamentoConsignado = valorPagamentoConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da fatura pago atrav\u00C3\u00A9s de desconto em folha.")
  @JsonProperty("valorPagamentoConsignado")
  public BigDecimal getValorPagamentoConsignado() {
    return valorPagamentoConsignado;
  }
  public void setValorPagamentoConsignado(BigDecimal valorPagamentoConsignado) {
    this.valorPagamentoConsignado = valorPagamentoConsignado;
  }

  
  /**
   * Valor complementar para considerar o pagamento m\u00C3\u00ADnimo da fatura.
   **/
  public FaturaConsignadaResponse valorPagamentoComplementar(BigDecimal valorPagamentoComplementar) {
    this.valorPagamentoComplementar = valorPagamentoComplementar;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor complementar para considerar o pagamento m\u00C3\u00ADnimo da fatura.")
  @JsonProperty("valorPagamentoComplementar")
  public BigDecimal getValorPagamentoComplementar() {
    return valorPagamentoComplementar;
  }
  public void setValorPagamentoComplementar(BigDecimal valorPagamentoComplementar) {
    this.valorPagamentoComplementar = valorPagamentoComplementar;
  }

  
  /**
   * Valor total das compras nacionais lan\u00C3\u00A7adas na fatura.
   **/
  public FaturaConsignadaResponse totalComprasNacionais(BigDecimal totalComprasNacionais) {
    this.totalComprasNacionais = totalComprasNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total das compras nacionais lan\u00C3\u00A7adas na fatura.")
  @JsonProperty("totalComprasNacionais")
  public BigDecimal getTotalComprasNacionais() {
    return totalComprasNacionais;
  }
  public void setTotalComprasNacionais(BigDecimal totalComprasNacionais) {
    this.totalComprasNacionais = totalComprasNacionais;
  }

  
  /**
   * Valor total das compras internacionais lan\u00C3\u00A7adas na fatura.
   **/
  public FaturaConsignadaResponse totalComprasInternacionas(BigDecimal totalComprasInternacionas) {
    this.totalComprasInternacionas = totalComprasInternacionas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total das compras internacionais lan\u00C3\u00A7adas na fatura.")
  @JsonProperty("totalComprasInternacionas")
  public BigDecimal getTotalComprasInternacionas() {
    return totalComprasInternacionas;
  }
  public void setTotalComprasInternacionas(BigDecimal totalComprasInternacionas) {
    this.totalComprasInternacionas = totalComprasInternacionas;
  }

  
  /**
   * Valor total dos saques nacionais lan\u00C3\u00A7ados na fatura.
   **/
  public FaturaConsignadaResponse totalSaquesNacionais(BigDecimal totalSaquesNacionais) {
    this.totalSaquesNacionais = totalSaquesNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total dos saques nacionais lan\u00C3\u00A7ados na fatura.")
  @JsonProperty("totalSaquesNacionais")
  public BigDecimal getTotalSaquesNacionais() {
    return totalSaquesNacionais;
  }
  public void setTotalSaquesNacionais(BigDecimal totalSaquesNacionais) {
    this.totalSaquesNacionais = totalSaquesNacionais;
  }

  
  /**
   * Valor total dos saques internacionais lan\u00C3\u00A7ados na fatura.
   **/
  public FaturaConsignadaResponse totalSaquesInternacionais(BigDecimal totalSaquesInternacionais) {
    this.totalSaquesInternacionais = totalSaquesInternacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total dos saques internacionais lan\u00C3\u00A7ados na fatura.")
  @JsonProperty("totalSaquesInternacionais")
  public BigDecimal getTotalSaquesInternacionais() {
    return totalSaquesInternacionais;
  }
  public void setTotalSaquesInternacionais(BigDecimal totalSaquesInternacionais) {
    this.totalSaquesInternacionais = totalSaquesInternacionais;
  }

  
  /**
   * Valor total dos d\u00C3\u00A9bitos nacionais lan\u00C3\u00A7ados na fatura.
   **/
  public FaturaConsignadaResponse totalDebitosNacionais(BigDecimal totalDebitosNacionais) {
    this.totalDebitosNacionais = totalDebitosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total dos d\u00C3\u00A9bitos nacionais lan\u00C3\u00A7ados na fatura.")
  @JsonProperty("totalDebitosNacionais")
  public BigDecimal getTotalDebitosNacionais() {
    return totalDebitosNacionais;
  }
  public void setTotalDebitosNacionais(BigDecimal totalDebitosNacionais) {
    this.totalDebitosNacionais = totalDebitosNacionais;
  }

  
  /**
   * Valor total dos d\u00C3\u00A9bitos recorrentes lan\u00C3\u00A7ados na fatura.
   **/
  public FaturaConsignadaResponse totalDebitosRecorrentes(BigDecimal totalDebitosRecorrentes) {
    this.totalDebitosRecorrentes = totalDebitosRecorrentes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total dos d\u00C3\u00A9bitos recorrentes lan\u00C3\u00A7ados na fatura.")
  @JsonProperty("totalDebitosRecorrentes")
  public BigDecimal getTotalDebitosRecorrentes() {
    return totalDebitosRecorrentes;
  }
  public void setTotalDebitosRecorrentes(BigDecimal totalDebitosRecorrentes) {
    this.totalDebitosRecorrentes = totalDebitosRecorrentes;
  }

  
  /**
   * Valor total dos d\u00C3\u00A9bitos internacionais lan\u00C3\u00A7ados na fatura.
   **/
  public FaturaConsignadaResponse totalDebitosInternacionais(BigDecimal totalDebitosInternacionais) {
    this.totalDebitosInternacionais = totalDebitosInternacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total dos d\u00C3\u00A9bitos internacionais lan\u00C3\u00A7ados na fatura.")
  @JsonProperty("totalDebitosInternacionais")
  public BigDecimal getTotalDebitosInternacionais() {
    return totalDebitosInternacionais;
  }
  public void setTotalDebitosInternacionais(BigDecimal totalDebitosInternacionais) {
    this.totalDebitosInternacionais = totalDebitosInternacionais;
  }

  
  /**
   * Valor total dos d\u00C3\u00A9bitos diversos nacionais lan\u00C3\u00A7ados na fatura.
   **/
  public FaturaConsignadaResponse totalDebitosDiversosNacionais(BigDecimal totalDebitosDiversosNacionais) {
    this.totalDebitosDiversosNacionais = totalDebitosDiversosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total dos d\u00C3\u00A9bitos diversos nacionais lan\u00C3\u00A7ados na fatura.")
  @JsonProperty("totalDebitosDiversosNacionais")
  public BigDecimal getTotalDebitosDiversosNacionais() {
    return totalDebitosDiversosNacionais;
  }
  public void setTotalDebitosDiversosNacionais(BigDecimal totalDebitosDiversosNacionais) {
    this.totalDebitosDiversosNacionais = totalDebitosDiversosNacionais;
  }

  
  /**
   * Valor total dos d\u00C3\u00A9bitos diversos opcionais lan\u00C3\u00A7ados na fatura.
   **/
  public FaturaConsignadaResponse totalDebitosOpcionais(BigDecimal totalDebitosOpcionais) {
    this.totalDebitosOpcionais = totalDebitosOpcionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total dos d\u00C3\u00A9bitos diversos opcionais lan\u00C3\u00A7ados na fatura.")
  @JsonProperty("totalDebitosOpcionais")
  public BigDecimal getTotalDebitosOpcionais() {
    return totalDebitosOpcionais;
  }
  public void setTotalDebitosOpcionais(BigDecimal totalDebitosOpcionais) {
    this.totalDebitosOpcionais = totalDebitosOpcionais;
  }

  
  /**
   * Valor total dos pagamentos lan\u00C3\u00A7ados na fatura.
   **/
  public FaturaConsignadaResponse totalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total dos pagamentos lan\u00C3\u00A7ados na fatura.")
  @JsonProperty("totalPagamentos")
  public BigDecimal getTotalPagamentos() {
    return totalPagamentos;
  }
  public void setTotalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
  }

  
  /**
   * Valor total dos cr\u00C3\u00A9ditos nacionais lan\u00C3\u00A7ados na fatura.
   **/
  public FaturaConsignadaResponse totalCreditosNacionais(BigDecimal totalCreditosNacionais) {
    this.totalCreditosNacionais = totalCreditosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total dos cr\u00C3\u00A9ditos nacionais lan\u00C3\u00A7ados na fatura.")
  @JsonProperty("totalCreditosNacionais")
  public BigDecimal getTotalCreditosNacionais() {
    return totalCreditosNacionais;
  }
  public void setTotalCreditosNacionais(BigDecimal totalCreditosNacionais) {
    this.totalCreditosNacionais = totalCreditosNacionais;
  }

  
  /**
   * Valor total dos ajustes lan\u00C3\u00A7ados na fatura.
   **/
  public FaturaConsignadaResponse totalAjustes(BigDecimal totalAjustes) {
    this.totalAjustes = totalAjustes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total dos ajustes lan\u00C3\u00A7ados na fatura.")
  @JsonProperty("totalAjustes")
  public BigDecimal getTotalAjustes() {
    return totalAjustes;
  }
  public void setTotalAjustes(BigDecimal totalAjustes) {
    this.totalAjustes = totalAjustes;
  }

  
  /**
   * Valor total das tarifas lan\u00C3\u00A7adas na fatura.
   **/
  public FaturaConsignadaResponse totalTarifas(BigDecimal totalTarifas) {
    this.totalTarifas = totalTarifas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total das tarifas lan\u00C3\u00A7adas na fatura.")
  @JsonProperty("totalTarifas")
  public BigDecimal getTotalTarifas() {
    return totalTarifas;
  }
  public void setTotalTarifas(BigDecimal totalTarifas) {
    this.totalTarifas = totalTarifas;
  }

  
  /**
   * Valor total da multa lan\u00C3\u00A7ada na fatura.
   **/
  public FaturaConsignadaResponse totalMulta(BigDecimal totalMulta) {
    this.totalMulta = totalMulta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total da multa lan\u00C3\u00A7ada na fatura.")
  @JsonProperty("totalMulta")
  public BigDecimal getTotalMulta() {
    return totalMulta;
  }
  public void setTotalMulta(BigDecimal totalMulta) {
    this.totalMulta = totalMulta;
  }

  
  /**
   * Valor total dos juros de mora lan\u00C3\u00A7ados na fatura.
   **/
  public FaturaConsignadaResponse totalJuros(BigDecimal totalJuros) {
    this.totalJuros = totalJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total dos juros de mora lan\u00C3\u00A7ados na fatura.")
  @JsonProperty("totalJuros")
  public BigDecimal getTotalJuros() {
    return totalJuros;
  }
  public void setTotalJuros(BigDecimal totalJuros) {
    this.totalJuros = totalJuros;
  }

  
  /**
   * Valor percentual da taxa de juros rotativos.
   **/
  public FaturaConsignadaResponse taxaRotativo(BigDecimal taxaRotativo) {
    this.taxaRotativo = taxaRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor percentual da taxa de juros rotativos.")
  @JsonProperty("taxaRotativo")
  public BigDecimal getTaxaRotativo() {
    return taxaRotativo;
  }
  public void setTaxaRotativo(BigDecimal taxaRotativo) {
    this.taxaRotativo = taxaRotativo;
  }

  
  /**
   * Valor percentual da taxa de saque.
   **/
  public FaturaConsignadaResponse taxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor percentual da taxa de saque.")
  @JsonProperty("taxaSaque")
  public BigDecimal getTaxaSaque() {
    return taxaSaque;
  }
  public void setTaxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
  }

  
  /**
   * Valor m\u00C3\u00A1ximo percentual da taxa de encargos para o pr\u00C3\u00B3ximo per\u00C3\u00ADodo.
   **/
  public FaturaConsignadaResponse taxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00C3\u00A1ximo percentual da taxa de encargos para o pr\u00C3\u00B3ximo per\u00C3\u00ADodo.")
  @JsonProperty("taxaMaximaProximoPeriodo")
  public BigDecimal getTaxaMaximaProximoPeriodo() {
    return taxaMaximaProximoPeriodo;
  }
  public void setTaxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
  }

  
  /**
   * Apresenta a soma de todos os seguros cobrados na fatura do cliente.
   **/
  public FaturaConsignadaResponse totalServicos(BigDecimal totalServicos) {
    this.totalServicos = totalServicos;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a soma de todos os seguros cobrados na fatura do cliente.")
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

