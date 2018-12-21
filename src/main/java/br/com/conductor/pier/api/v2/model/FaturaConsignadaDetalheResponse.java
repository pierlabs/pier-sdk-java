package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Consignated Invoice detail
 **/

@ApiModel(description = "Consignated Invoice detail")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class FaturaConsignadaDetalheResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private BigDecimal limiteGlobal = null;
  private Integer flagEmiteFatura = null;
  private BigDecimal limiteCompra = null;
  private String dataVencimentoFatura = null;
  private BigDecimal limiteParcelado = null;
  private BigDecimal limiteParcelas = null;
  private BigDecimal valorTotalFatura = null;
  private BigDecimal valorFaturaAnterior = null;
  private BigDecimal valorPagamentoMinimo = null;
  private BigDecimal valorPagamentoConsignado = null;
  private BigDecimal limiteSaqueGlobal = null;
  private BigDecimal valorPagamentoComplementar = null;
  private BigDecimal limiteSaquePeriodo = null;
  private BigDecimal totalComprasNacionais = null;
  private BigDecimal limiteConsignado = null;
  private BigDecimal totalComprasInternacionas = null;
  private BigDecimal limiteInternacionalCompra = null;
  private BigDecimal totalSaquesNacionais = null;
  private BigDecimal limiteInternacionalParcelado = null;
  private BigDecimal totalSaquesInternacionais = null;
  private BigDecimal limiteInternacionalParcelas = null;
  private BigDecimal totalDebitosNacionais = null;
  private BigDecimal limiteInternacionalSaqueGlobal = null;
  private BigDecimal totalDebitosRecorrentes = null;
  private BigDecimal limiteInternacionalSaquePeriodo = null;
  private BigDecimal totalDebitosInternacionais = null;
  private BigDecimal saldoDisponivelGlobal = null;
  private BigDecimal totalDebitosDiversosNacionais = null;
  private BigDecimal saldoDisponivelCompra = null;
  private BigDecimal totalDebitosOpcionais = null;
  private BigDecimal saldoDisponivelParcelado = null;
  private BigDecimal totalPagamentos = null;
  private BigDecimal saldoDisponivelParcelas = null;
  private BigDecimal totalCreditosNacionais = null;
  private BigDecimal totalAjustes = null;
  private BigDecimal totalTarifas = null;
  private BigDecimal totalMulta = null;
  private BigDecimal saldoDisponivelSaque = null;
  private BigDecimal totalJuros = null;
  private BigDecimal saldoPontosFidelidade = null;
  private BigDecimal taxaRotativo = null;
  private BigDecimal saldoDisponivelCompraInternacional = null;
  private BigDecimal taxaSaque = null;
  private BigDecimal saldoDisponivelSaqueInternacional = null;
  private BigDecimal taxaMaximaProximoPeriodo = null;
  private BigDecimal totalServicos = null;

  
  /**
   * Identifier Code of the invoice
   **/
  public FaturaConsignadaDetalheResponse id(Long id) {
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
   * Identifier Code of the Account (id)
   **/
  public FaturaConsignadaDetalheResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier Code of the Account (id)")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * show the limit credit value that the cardholder has
   **/
  public FaturaConsignadaDetalheResponse limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "show the limit credit value that the cardholder has")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Identifier Code of the account which the invoice refers to
   **/
  public FaturaConsignadaDetalheResponse flagEmiteFatura(Integer flagEmiteFatura) {
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
   * When it is used by the issuer, this field shows the limit credit value that the cardholder has to use exclusively in National Purchases
   **/
  public FaturaConsignadaDetalheResponse limiteCompra(BigDecimal limiteCompra) {
    this.limiteCompra = limiteCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used by the issuer, this field shows the limit credit value that the cardholder has to use exclusively in National Purchases")
  @JsonProperty("limiteCompra")
  public BigDecimal getLimiteCompra() {
    return limiteCompra;
  }
  public void setLimiteCompra(BigDecimal limiteCompra) {
    this.limiteCompra = limiteCompra;
  }

  
  /**
   * Expiration date of the invoice
   **/
  public FaturaConsignadaDetalheResponse dataVencimentoFatura(String dataVencimentoFatura) {
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
   * When it is used by the issuer, this field presents the limit credit value that the cardholder has to make transactions of parceled shops
   **/
  public FaturaConsignadaDetalheResponse limiteParcelado(BigDecimal limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used by the issuer, this field presents the limit credit value that the cardholder has to make transactions of parceled shops")
  @JsonProperty("limiteParcelado")
  public BigDecimal getLimiteParcelado() {
    return limiteParcelado;
  }
  public void setLimiteParcelado(BigDecimal limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
  }

  
  /**
   * When it is used by the issuer, this field shows the limit credit value that the cardholder can accumulate since the suum of the shop parcels that they were made in this modality
   **/
  public FaturaConsignadaDetalheResponse limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used by the issuer, this field shows the limit credit value that the cardholder can accumulate since the suum of the shop parcels that they were made in this modality")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Value for total payment of the invoice
   **/
  public FaturaConsignadaDetalheResponse valorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value for total payment of the invoice")
  @JsonProperty("valorTotalFatura")
  public BigDecimal getValorTotalFatura() {
    return valorTotalFatura;
  }
  public void setValorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
  }

  
  /**
   * Total Value of the previous invoice
   **/
  public FaturaConsignadaDetalheResponse valorFaturaAnterior(BigDecimal valorFaturaAnterior) {
    this.valorFaturaAnterior = valorFaturaAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total Value of the previous invoice")
  @JsonProperty("valorFaturaAnterior")
  public BigDecimal getValorFaturaAnterior() {
    return valorFaturaAnterior;
  }
  public void setValorFaturaAnterior(BigDecimal valorFaturaAnterior) {
    this.valorFaturaAnterior = valorFaturaAnterior;
  }

  
  /**
   * Minimum value for the invoice payment
   **/
  public FaturaConsignadaDetalheResponse valorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum value for the invoice payment")
  @JsonProperty("valorPagamentoMinimo")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * Invoice value paid through the discount in payroll
   **/
  public FaturaConsignadaDetalheResponse valorPagamentoConsignado(BigDecimal valorPagamentoConsignado) {
    this.valorPagamentoConsignado = valorPagamentoConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Invoice value paid through the discount in payroll")
  @JsonProperty("valorPagamentoConsignado")
  public BigDecimal getValorPagamentoConsignado() {
    return valorPagamentoConsignado;
  }
  public void setValorPagamentoConsignado(BigDecimal valorPagamentoConsignado) {
    this.valorPagamentoConsignado = valorPagamentoConsignado;
  }

  
  /**
   * When it is used by the issuer, this field presents the limit credit value that the cardholder can use to make National Withdrawal Transactions
   **/
  public FaturaConsignadaDetalheResponse limiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used by the issuer, this field presents the limit credit value that the cardholder can use to make National Withdrawal Transactions")
  @JsonProperty("limiteSaqueGlobal")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * Additional Value to consider the minimum payment of the invoice
   **/
  public FaturaConsignadaDetalheResponse valorPagamentoComplementar(BigDecimal valorPagamentoComplementar) {
    this.valorPagamentoComplementar = valorPagamentoComplementar;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional Value to consider the minimum payment of the invoice")
  @JsonProperty("valorPagamentoComplementar")
  public BigDecimal getValorPagamentoComplementar() {
    return valorPagamentoComplementar;
  }
  public void setValorPagamentoComplementar(BigDecimal valorPagamentoComplementar) {
    this.valorPagamentoComplementar = valorPagamentoComplementar;
  }

  
  /**
   * When it is used by the issuer, this field presents the limit credit value that the cardholder can use to National Withdrawal Transactions inside of each billing cycle
   **/
  public FaturaConsignadaDetalheResponse limiteSaquePeriodo(BigDecimal limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used by the issuer, this field presents the limit credit value that the cardholder can use to National Withdrawal Transactions inside of each billing cycle")
  @JsonProperty("limiteSaquePeriodo")
  public BigDecimal getLimiteSaquePeriodo() {
    return limiteSaquePeriodo;
  }
  public void setLimiteSaquePeriodo(BigDecimal limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
  }

  
  /**
   * Total value of the national shops launched in the invoice
   **/
  public FaturaConsignadaDetalheResponse totalComprasNacionais(BigDecimal totalComprasNacionais) {
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
   * when it is used by the issuer, this field presents the value of the credit margin that can be used to be charged as a consignated form (discount in payroll) in the wage/expiration
   **/
  public FaturaConsignadaDetalheResponse limiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "when it is used by the issuer, this field presents the value of the credit margin that can be used to be charged as a consignated form (discount in payroll) in the wage/expiration")
  @JsonProperty("limiteConsignado")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Total value of the international shops launched in the invoice
   **/
  public FaturaConsignadaDetalheResponse totalComprasInternacionas(BigDecimal totalComprasInternacionas) {
    this.totalComprasInternacionas = totalComprasInternacionas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the international shops launched in the invoice")
  @JsonProperty("totalComprasInternacionas")
  public BigDecimal getTotalComprasInternacionas() {
    return totalComprasInternacionas;
  }
  public void setTotalComprasInternacionas(BigDecimal totalComprasInternacionas) {
    this.totalComprasInternacionas = totalComprasInternacionas;
  }

  
  /**
   * When it is used by the issuer, this field presents the limit credit value that the cardholder can use for International Shops
   **/
  public FaturaConsignadaDetalheResponse limiteInternacionalCompra(BigDecimal limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used by the issuer, this field presents the limit credit value that the cardholder can use for International Shops")
  @JsonProperty("limiteInternacionalCompra")
  public BigDecimal getLimiteInternacionalCompra() {
    return limiteInternacionalCompra;
  }
  public void setLimiteInternacionalCompra(BigDecimal limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
  }

  
  /**
   * Total Value of the National Withdrawals launched in the invoice
   **/
  public FaturaConsignadaDetalheResponse totalSaquesNacionais(BigDecimal totalSaquesNacionais) {
    this.totalSaquesNacionais = totalSaquesNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total Value of the National Withdrawals launched in the invoice")
  @JsonProperty("totalSaquesNacionais")
  public BigDecimal getTotalSaquesNacionais() {
    return totalSaquesNacionais;
  }
  public void setTotalSaquesNacionais(BigDecimal totalSaquesNacionais) {
    this.totalSaquesNacionais = totalSaquesNacionais;
  }

  
  /**
   * When it is used by the issuer, this field presents the limit credit value that the cardholder has to make International transactions of parceled shops
   **/
  public FaturaConsignadaDetalheResponse limiteInternacionalParcelado(BigDecimal limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used by the issuer, this field presents the limit credit value that the cardholder has to make International transactions of parceled shops")
  @JsonProperty("limiteInternacionalParcelado")
  public BigDecimal getLimiteInternacionalParcelado() {
    return limiteInternacionalParcelado;
  }
  public void setLimiteInternacionalParcelado(BigDecimal limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
  }

  
  /**
   * Total value of the international withdrawals launched in the invoice
   **/
  public FaturaConsignadaDetalheResponse totalSaquesInternacionais(BigDecimal totalSaquesInternacionais) {
    this.totalSaquesInternacionais = totalSaquesInternacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the international withdrawals launched in the invoice")
  @JsonProperty("totalSaquesInternacionais")
  public BigDecimal getTotalSaquesInternacionais() {
    return totalSaquesInternacionais;
  }
  public void setTotalSaquesInternacionais(BigDecimal totalSaquesInternacionais) {
    this.totalSaquesInternacionais = totalSaquesInternacionais;
  }

  
  /**
   * When it is used by the issuer, this field presents the limit credit value that the cardholder can accumulate since the sum of parcels of the international shops that they were made in this modality
   **/
  public FaturaConsignadaDetalheResponse limiteInternacionalParcelas(BigDecimal limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used by the issuer, this field presents the limit credit value that the cardholder can accumulate since the sum of parcels of the international shops that they were made in this modality")
  @JsonProperty("limiteInternacionalParcelas")
  public BigDecimal getLimiteInternacionalParcelas() {
    return limiteInternacionalParcelas;
  }
  public void setLimiteInternacionalParcelas(BigDecimal limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
  }

  
  /**
   * Total Value of the national debits launched in the invoice
   **/
  public FaturaConsignadaDetalheResponse totalDebitosNacionais(BigDecimal totalDebitosNacionais) {
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
   * When it is used by the issuer, this field shows the credit value that the cardholder can use to make International withdrawal transactions
   **/
  public FaturaConsignadaDetalheResponse limiteInternacionalSaqueGlobal(BigDecimal limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used by the issuer, this field shows the credit value that the cardholder can use to make International withdrawal transactions")
  @JsonProperty("limiteInternacionalSaqueGlobal")
  public BigDecimal getLimiteInternacionalSaqueGlobal() {
    return limiteInternacionalSaqueGlobal;
  }
  public void setLimiteInternacionalSaqueGlobal(BigDecimal limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
  }

  
  /**
   * Total Value of the recurrent values launched in the invoice
   **/
  public FaturaConsignadaDetalheResponse totalDebitosRecorrentes(BigDecimal totalDebitosRecorrentes) {
    this.totalDebitosRecorrentes = totalDebitosRecorrentes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total Value of the recurrent values launched in the invoice")
  @JsonProperty("totalDebitosRecorrentes")
  public BigDecimal getTotalDebitosRecorrentes() {
    return totalDebitosRecorrentes;
  }
  public void setTotalDebitosRecorrentes(BigDecimal totalDebitosRecorrentes) {
    this.totalDebitosRecorrentes = totalDebitosRecorrentes;
  }

  
  /**
   * Whenn it is used by the issuer, this field presents the limit credit value that the cardholder can use to make National withdrawal Transactions inside of each billing cycle
   **/
  public FaturaConsignadaDetalheResponse limiteInternacionalSaquePeriodo(BigDecimal limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whenn it is used by the issuer, this field presents the limit credit value that the cardholder can use to make National withdrawal Transactions inside of each billing cycle")
  @JsonProperty("limiteInternacionalSaquePeriodo")
  public BigDecimal getLimiteInternacionalSaquePeriodo() {
    return limiteInternacionalSaquePeriodo;
  }
  public void setLimiteInternacionalSaquePeriodo(BigDecimal limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
  }

  
  /**
   * Total value of the international debits launched in the invoice
   **/
  public FaturaConsignadaDetalheResponse totalDebitosInternacionais(BigDecimal totalDebitosInternacionais) {
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
   * Show the value of credit that the cardholder has able to make trasanction
   **/
  public FaturaConsignadaDetalheResponse saldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Show the value of credit that the cardholder has able to make trasanction")
  @JsonProperty("saldoDisponivelGlobal")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * Total Value of the several national debits launched in the invoice
   **/
  public FaturaConsignadaDetalheResponse totalDebitosDiversosNacionais(BigDecimal totalDebitosDiversosNacionais) {
    this.totalDebitosDiversosNacionais = totalDebitosDiversosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total Value of the several national debits launched in the invoice")
  @JsonProperty("totalDebitosDiversosNacionais")
  public BigDecimal getTotalDebitosDiversosNacionais() {
    return totalDebitosDiversosNacionais;
  }
  public void setTotalDebitosDiversosNacionais(BigDecimal totalDebitosDiversosNacionais) {
    this.totalDebitosDiversosNacionais = totalDebitosDiversosNacionais;
  }

  
  /**
   * When it is used by the issuer, this field presents the limit credit value that the cardholder has to make transactions of National Shop
   **/
  public FaturaConsignadaDetalheResponse saldoDisponivelCompra(BigDecimal saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used by the issuer, this field presents the limit credit value that the cardholder has to make transactions of National Shop")
  @JsonProperty("saldoDisponivelCompra")
  public BigDecimal getSaldoDisponivelCompra() {
    return saldoDisponivelCompra;
  }
  public void setSaldoDisponivelCompra(BigDecimal saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
  }

  
  /**
   * Total Value of the several optional debits launched in the invoice
   **/
  public FaturaConsignadaDetalheResponse totalDebitosOpcionais(BigDecimal totalDebitosOpcionais) {
    this.totalDebitosOpcionais = totalDebitosOpcionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total Value of the several optional debits launched in the invoice")
  @JsonProperty("totalDebitosOpcionais")
  public BigDecimal getTotalDebitosOpcionais() {
    return totalDebitosOpcionais;
  }
  public void setTotalDebitosOpcionais(BigDecimal totalDebitosOpcionais) {
    this.totalDebitosOpcionais = totalDebitosOpcionais;
  }

  
  /**
   * When it is used by the issuer the limitParcel modality, this field will present the credit value that the cardholder has available to make National Shop Transactions
   **/
  public FaturaConsignadaDetalheResponse saldoDisponivelParcelado(BigDecimal saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used by the issuer the limitParcel modality, this field will present the credit value that the cardholder has available to make National Shop Transactions")
  @JsonProperty("saldoDisponivelParcelado")
  public BigDecimal getSaldoDisponivelParcelado() {
    return saldoDisponivelParcelado;
  }
  public void setSaldoDisponivelParcelado(BigDecimal saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
  }

  
  /**
   * Total VAlue of the payments launched in the invoice
   **/
  public FaturaConsignadaDetalheResponse totalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total VAlue of the payments launched in the invoice")
  @JsonProperty("totalPagamentos")
  public BigDecimal getTotalPagamentos() {
    return totalPagamentos;
  }
  public void setTotalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
  }

  
  /**
   * When it is used by the issuer the limitparcels modality, this field will present the credit value that the cardholder can used as a value of National parcels in a determined billing cycle
   **/
  public FaturaConsignadaDetalheResponse saldoDisponivelParcelas(BigDecimal saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used by the issuer the limitparcels modality, this field will present the credit value that the cardholder can used as a value of National parcels in a determined billing cycle")
  @JsonProperty("saldoDisponivelParcelas")
  public BigDecimal getSaldoDisponivelParcelas() {
    return saldoDisponivelParcelas;
  }
  public void setSaldoDisponivelParcelas(BigDecimal saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
  }

  
  /**
   * Total National Credit Values launched in the invoice
   **/
  public FaturaConsignadaDetalheResponse totalCreditosNacionais(BigDecimal totalCreditosNacionais) {
    this.totalCreditosNacionais = totalCreditosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total National Credit Values launched in the invoice")
  @JsonProperty("totalCreditosNacionais")
  public BigDecimal getTotalCreditosNacionais() {
    return totalCreditosNacionais;
  }
  public void setTotalCreditosNacionais(BigDecimal totalCreditosNacionais) {
    this.totalCreditosNacionais = totalCreditosNacionais;
  }

  
  /**
   * Total Value of the adjustments launched in the invoice
   **/
  public FaturaConsignadaDetalheResponse totalAjustes(BigDecimal totalAjustes) {
    this.totalAjustes = totalAjustes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total Value of the adjustments launched in the invoice")
  @JsonProperty("totalAjustes")
  public BigDecimal getTotalAjustes() {
    return totalAjustes;
  }
  public void setTotalAjustes(BigDecimal totalAjustes) {
    this.totalAjustes = totalAjustes;
  }

  
  /**
   * Total value of the taxes launched in the invoice
   **/
  public FaturaConsignadaDetalheResponse totalTarifas(BigDecimal totalTarifas) {
    this.totalTarifas = totalTarifas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the taxes launched in the invoice")
  @JsonProperty("totalTarifas")
  public BigDecimal getTotalTarifas() {
    return totalTarifas;
  }
  public void setTotalTarifas(BigDecimal totalTarifas) {
    this.totalTarifas = totalTarifas;
  }

  
  /**
   * Total value of the fine launched in the invoice
   **/
  public FaturaConsignadaDetalheResponse totalMulta(BigDecimal totalMulta) {
    this.totalMulta = totalMulta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the fine launched in the invoice")
  @JsonProperty("totalMulta")
  public BigDecimal getTotalMulta() {
    return totalMulta;
  }
  public void setTotalMulta(BigDecimal totalMulta) {
    this.totalMulta = totalMulta;
  }

  
  /**
   * When it is used by the issuer the LimitWithdrawal modality, this fiel will show the credit value that the cardholder has able to make transactions of National Withdrawal
   **/
  public FaturaConsignadaDetalheResponse saldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used by the issuer the LimitWithdrawal modality, this fiel will show the credit value that the cardholder has able to make transactions of National Withdrawal")
  @JsonProperty("saldoDisponivelSaque")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * Total value of the interest launched in the invoice
   **/
  public FaturaConsignadaDetalheResponse totalJuros(BigDecimal totalJuros) {
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
   * When it is used a fidelity program by the issuer, this field will show the current balance of the points the cardholder has
   **/
  public FaturaConsignadaDetalheResponse saldoPontosFidelidade(BigDecimal saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used a fidelity program by the issuer, this field will show the current balance of the points the cardholder has")
  @JsonProperty("saldoPontosFidelidade")
  public BigDecimal getSaldoPontosFidelidade() {
    return saldoPontosFidelidade;
  }
  public void setSaldoPontosFidelidade(BigDecimal saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
  }

  
  /**
   * Percentage value of the Revolving interest taxes
   **/
  public FaturaConsignadaDetalheResponse taxaRotativo(BigDecimal taxaRotativo) {
    this.taxaRotativo = taxaRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage value of the Revolving interest taxes")
  @JsonProperty("taxaRotativo")
  public BigDecimal getTaxaRotativo() {
    return taxaRotativo;
  }
  public void setTaxaRotativo(BigDecimal taxaRotativo) {
    this.taxaRotativo = taxaRotativo;
  }

  
  /**
   * When it is used by the issuer the limitShopInternational modality, this field will present the credit value that the cardholder has able to make International Shopping Transactions
   **/
  public FaturaConsignadaDetalheResponse saldoDisponivelCompraInternacional(BigDecimal saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used by the issuer the limitShopInternational modality, this field will present the credit value that the cardholder has able to make International Shopping Transactions")
  @JsonProperty("saldoDisponivelCompraInternacional")
  public BigDecimal getSaldoDisponivelCompraInternacional() {
    return saldoDisponivelCompraInternacional;
  }
  public void setSaldoDisponivelCompraInternacional(BigDecimal saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
  }

  
  /**
   * Percentage Value of the withdrawal taxe
   **/
  public FaturaConsignadaDetalheResponse taxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage Value of the withdrawal taxe")
  @JsonProperty("taxaSaque")
  public BigDecimal getTaxaSaque() {
    return taxaSaque;
  }
  public void setTaxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
  }

  
  /**
   * When it is used by the issuer the limitWithdrawalInternational modality, this field will show the credit value that the cardholder has able to make trasactions of International Withdrawal
   **/
  public FaturaConsignadaDetalheResponse saldoDisponivelSaqueInternacional(BigDecimal saldoDisponivelSaqueInternacional) {
    this.saldoDisponivelSaqueInternacional = saldoDisponivelSaqueInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When it is used by the issuer the limitWithdrawalInternational modality, this field will show the credit value that the cardholder has able to make trasactions of International Withdrawal")
  @JsonProperty("saldoDisponivelSaqueInternacional")
  public BigDecimal getSaldoDisponivelSaqueInternacional() {
    return saldoDisponivelSaqueInternacional;
  }
  public void setSaldoDisponivelSaqueInternacional(BigDecimal saldoDisponivelSaqueInternacional) {
    this.saldoDisponivelSaqueInternacional = saldoDisponivelSaqueInternacional;
  }

  
  /**
   * Maximum percentage value of the charge taxes for the next period
   **/
  public FaturaConsignadaDetalheResponse taxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum percentage value of the charge taxes for the next period")
  @JsonProperty("taxaMaximaProximoPeriodo")
  public BigDecimal getTaxaMaximaProximoPeriodo() {
    return taxaMaximaProximoPeriodo;
  }
  public void setTaxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
  }

  
  /**
   * Show the sum of all insurance charged in the invoice of the client
   **/
  public FaturaConsignadaDetalheResponse totalServicos(BigDecimal totalServicos) {
    this.totalServicos = totalServicos;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Show the sum of all insurance charged in the invoice of the client")
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
    FaturaConsignadaDetalheResponse faturaConsignadaDetalheResponse = (FaturaConsignadaDetalheResponse) o;
    return Objects.equals(this.id, faturaConsignadaDetalheResponse.id) &&
        Objects.equals(this.idConta, faturaConsignadaDetalheResponse.idConta) &&
        Objects.equals(this.limiteGlobal, faturaConsignadaDetalheResponse.limiteGlobal) &&
        Objects.equals(this.flagEmiteFatura, faturaConsignadaDetalheResponse.flagEmiteFatura) &&
        Objects.equals(this.limiteCompra, faturaConsignadaDetalheResponse.limiteCompra) &&
        Objects.equals(this.dataVencimentoFatura, faturaConsignadaDetalheResponse.dataVencimentoFatura) &&
        Objects.equals(this.limiteParcelado, faturaConsignadaDetalheResponse.limiteParcelado) &&
        Objects.equals(this.limiteParcelas, faturaConsignadaDetalheResponse.limiteParcelas) &&
        Objects.equals(this.valorTotalFatura, faturaConsignadaDetalheResponse.valorTotalFatura) &&
        Objects.equals(this.valorFaturaAnterior, faturaConsignadaDetalheResponse.valorFaturaAnterior) &&
        Objects.equals(this.valorPagamentoMinimo, faturaConsignadaDetalheResponse.valorPagamentoMinimo) &&
        Objects.equals(this.valorPagamentoConsignado, faturaConsignadaDetalheResponse.valorPagamentoConsignado) &&
        Objects.equals(this.limiteSaqueGlobal, faturaConsignadaDetalheResponse.limiteSaqueGlobal) &&
        Objects.equals(this.valorPagamentoComplementar, faturaConsignadaDetalheResponse.valorPagamentoComplementar) &&
        Objects.equals(this.limiteSaquePeriodo, faturaConsignadaDetalheResponse.limiteSaquePeriodo) &&
        Objects.equals(this.totalComprasNacionais, faturaConsignadaDetalheResponse.totalComprasNacionais) &&
        Objects.equals(this.limiteConsignado, faturaConsignadaDetalheResponse.limiteConsignado) &&
        Objects.equals(this.totalComprasInternacionas, faturaConsignadaDetalheResponse.totalComprasInternacionas) &&
        Objects.equals(this.limiteInternacionalCompra, faturaConsignadaDetalheResponse.limiteInternacionalCompra) &&
        Objects.equals(this.totalSaquesNacionais, faturaConsignadaDetalheResponse.totalSaquesNacionais) &&
        Objects.equals(this.limiteInternacionalParcelado, faturaConsignadaDetalheResponse.limiteInternacionalParcelado) &&
        Objects.equals(this.totalSaquesInternacionais, faturaConsignadaDetalheResponse.totalSaquesInternacionais) &&
        Objects.equals(this.limiteInternacionalParcelas, faturaConsignadaDetalheResponse.limiteInternacionalParcelas) &&
        Objects.equals(this.totalDebitosNacionais, faturaConsignadaDetalheResponse.totalDebitosNacionais) &&
        Objects.equals(this.limiteInternacionalSaqueGlobal, faturaConsignadaDetalheResponse.limiteInternacionalSaqueGlobal) &&
        Objects.equals(this.totalDebitosRecorrentes, faturaConsignadaDetalheResponse.totalDebitosRecorrentes) &&
        Objects.equals(this.limiteInternacionalSaquePeriodo, faturaConsignadaDetalheResponse.limiteInternacionalSaquePeriodo) &&
        Objects.equals(this.totalDebitosInternacionais, faturaConsignadaDetalheResponse.totalDebitosInternacionais) &&
        Objects.equals(this.saldoDisponivelGlobal, faturaConsignadaDetalheResponse.saldoDisponivelGlobal) &&
        Objects.equals(this.totalDebitosDiversosNacionais, faturaConsignadaDetalheResponse.totalDebitosDiversosNacionais) &&
        Objects.equals(this.saldoDisponivelCompra, faturaConsignadaDetalheResponse.saldoDisponivelCompra) &&
        Objects.equals(this.totalDebitosOpcionais, faturaConsignadaDetalheResponse.totalDebitosOpcionais) &&
        Objects.equals(this.saldoDisponivelParcelado, faturaConsignadaDetalheResponse.saldoDisponivelParcelado) &&
        Objects.equals(this.totalPagamentos, faturaConsignadaDetalheResponse.totalPagamentos) &&
        Objects.equals(this.saldoDisponivelParcelas, faturaConsignadaDetalheResponse.saldoDisponivelParcelas) &&
        Objects.equals(this.totalCreditosNacionais, faturaConsignadaDetalheResponse.totalCreditosNacionais) &&
        Objects.equals(this.totalAjustes, faturaConsignadaDetalheResponse.totalAjustes) &&
        Objects.equals(this.totalTarifas, faturaConsignadaDetalheResponse.totalTarifas) &&
        Objects.equals(this.totalMulta, faturaConsignadaDetalheResponse.totalMulta) &&
        Objects.equals(this.saldoDisponivelSaque, faturaConsignadaDetalheResponse.saldoDisponivelSaque) &&
        Objects.equals(this.totalJuros, faturaConsignadaDetalheResponse.totalJuros) &&
        Objects.equals(this.saldoPontosFidelidade, faturaConsignadaDetalheResponse.saldoPontosFidelidade) &&
        Objects.equals(this.taxaRotativo, faturaConsignadaDetalheResponse.taxaRotativo) &&
        Objects.equals(this.saldoDisponivelCompraInternacional, faturaConsignadaDetalheResponse.saldoDisponivelCompraInternacional) &&
        Objects.equals(this.taxaSaque, faturaConsignadaDetalheResponse.taxaSaque) &&
        Objects.equals(this.saldoDisponivelSaqueInternacional, faturaConsignadaDetalheResponse.saldoDisponivelSaqueInternacional) &&
        Objects.equals(this.taxaMaximaProximoPeriodo, faturaConsignadaDetalheResponse.taxaMaximaProximoPeriodo) &&
        Objects.equals(this.totalServicos, faturaConsignadaDetalheResponse.totalServicos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, limiteGlobal, flagEmiteFatura, limiteCompra, dataVencimentoFatura, limiteParcelado, limiteParcelas, valorTotalFatura, valorFaturaAnterior, valorPagamentoMinimo, valorPagamentoConsignado, limiteSaqueGlobal, valorPagamentoComplementar, limiteSaquePeriodo, totalComprasNacionais, limiteConsignado, totalComprasInternacionas, limiteInternacionalCompra, totalSaquesNacionais, limiteInternacionalParcelado, totalSaquesInternacionais, limiteInternacionalParcelas, totalDebitosNacionais, limiteInternacionalSaqueGlobal, totalDebitosRecorrentes, limiteInternacionalSaquePeriodo, totalDebitosInternacionais, saldoDisponivelGlobal, totalDebitosDiversosNacionais, saldoDisponivelCompra, totalDebitosOpcionais, saldoDisponivelParcelado, totalPagamentos, saldoDisponivelParcelas, totalCreditosNacionais, totalAjustes, totalTarifas, totalMulta, saldoDisponivelSaque, totalJuros, saldoPontosFidelidade, taxaRotativo, saldoDisponivelCompraInternacional, taxaSaque, saldoDisponivelSaqueInternacional, taxaMaximaProximoPeriodo, totalServicos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaConsignadaDetalheResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    limiteGlobal: ").append(toIndentedString(limiteGlobal)).append("\n");
    sb.append("    flagEmiteFatura: ").append(toIndentedString(flagEmiteFatura)).append("\n");
    sb.append("    limiteCompra: ").append(toIndentedString(limiteCompra)).append("\n");
    sb.append("    dataVencimentoFatura: ").append(toIndentedString(dataVencimentoFatura)).append("\n");
    sb.append("    limiteParcelado: ").append(toIndentedString(limiteParcelado)).append("\n");
    sb.append("    limiteParcelas: ").append(toIndentedString(limiteParcelas)).append("\n");
    sb.append("    valorTotalFatura: ").append(toIndentedString(valorTotalFatura)).append("\n");
    sb.append("    valorFaturaAnterior: ").append(toIndentedString(valorFaturaAnterior)).append("\n");
    sb.append("    valorPagamentoMinimo: ").append(toIndentedString(valorPagamentoMinimo)).append("\n");
    sb.append("    valorPagamentoConsignado: ").append(toIndentedString(valorPagamentoConsignado)).append("\n");
    sb.append("    limiteSaqueGlobal: ").append(toIndentedString(limiteSaqueGlobal)).append("\n");
    sb.append("    valorPagamentoComplementar: ").append(toIndentedString(valorPagamentoComplementar)).append("\n");
    sb.append("    limiteSaquePeriodo: ").append(toIndentedString(limiteSaquePeriodo)).append("\n");
    sb.append("    totalComprasNacionais: ").append(toIndentedString(totalComprasNacionais)).append("\n");
    sb.append("    limiteConsignado: ").append(toIndentedString(limiteConsignado)).append("\n");
    sb.append("    totalComprasInternacionas: ").append(toIndentedString(totalComprasInternacionas)).append("\n");
    sb.append("    limiteInternacionalCompra: ").append(toIndentedString(limiteInternacionalCompra)).append("\n");
    sb.append("    totalSaquesNacionais: ").append(toIndentedString(totalSaquesNacionais)).append("\n");
    sb.append("    limiteInternacionalParcelado: ").append(toIndentedString(limiteInternacionalParcelado)).append("\n");
    sb.append("    totalSaquesInternacionais: ").append(toIndentedString(totalSaquesInternacionais)).append("\n");
    sb.append("    limiteInternacionalParcelas: ").append(toIndentedString(limiteInternacionalParcelas)).append("\n");
    sb.append("    totalDebitosNacionais: ").append(toIndentedString(totalDebitosNacionais)).append("\n");
    sb.append("    limiteInternacionalSaqueGlobal: ").append(toIndentedString(limiteInternacionalSaqueGlobal)).append("\n");
    sb.append("    totalDebitosRecorrentes: ").append(toIndentedString(totalDebitosRecorrentes)).append("\n");
    sb.append("    limiteInternacionalSaquePeriodo: ").append(toIndentedString(limiteInternacionalSaquePeriodo)).append("\n");
    sb.append("    totalDebitosInternacionais: ").append(toIndentedString(totalDebitosInternacionais)).append("\n");
    sb.append("    saldoDisponivelGlobal: ").append(toIndentedString(saldoDisponivelGlobal)).append("\n");
    sb.append("    totalDebitosDiversosNacionais: ").append(toIndentedString(totalDebitosDiversosNacionais)).append("\n");
    sb.append("    saldoDisponivelCompra: ").append(toIndentedString(saldoDisponivelCompra)).append("\n");
    sb.append("    totalDebitosOpcionais: ").append(toIndentedString(totalDebitosOpcionais)).append("\n");
    sb.append("    saldoDisponivelParcelado: ").append(toIndentedString(saldoDisponivelParcelado)).append("\n");
    sb.append("    totalPagamentos: ").append(toIndentedString(totalPagamentos)).append("\n");
    sb.append("    saldoDisponivelParcelas: ").append(toIndentedString(saldoDisponivelParcelas)).append("\n");
    sb.append("    totalCreditosNacionais: ").append(toIndentedString(totalCreditosNacionais)).append("\n");
    sb.append("    totalAjustes: ").append(toIndentedString(totalAjustes)).append("\n");
    sb.append("    totalTarifas: ").append(toIndentedString(totalTarifas)).append("\n");
    sb.append("    totalMulta: ").append(toIndentedString(totalMulta)).append("\n");
    sb.append("    saldoDisponivelSaque: ").append(toIndentedString(saldoDisponivelSaque)).append("\n");
    sb.append("    totalJuros: ").append(toIndentedString(totalJuros)).append("\n");
    sb.append("    saldoPontosFidelidade: ").append(toIndentedString(saldoPontosFidelidade)).append("\n");
    sb.append("    taxaRotativo: ").append(toIndentedString(taxaRotativo)).append("\n");
    sb.append("    saldoDisponivelCompraInternacional: ").append(toIndentedString(saldoDisponivelCompraInternacional)).append("\n");
    sb.append("    taxaSaque: ").append(toIndentedString(taxaSaque)).append("\n");
    sb.append("    saldoDisponivelSaqueInternacional: ").append(toIndentedString(saldoDisponivelSaqueInternacional)).append("\n");
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

