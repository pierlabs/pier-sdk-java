package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * Limite Disponibilidade
 **/

@ApiModel(description = "Limite Disponibilidade")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LimiteDisponibilidade   {
  
  private Long id = null;
  private BigDecimal limiteGlobal = null;
  private BigDecimal limiteCompra = null;
  private BigDecimal limiteParcelado = null;
  private BigDecimal limiteParcelas = null;
  private BigDecimal limiteSaqueGlobal = null;
  private BigDecimal limiteSaquePeriodo = null;
  private BigDecimal limiteConsignado = null;
  private BigDecimal limiteInternacionalCompra = null;
  private BigDecimal limiteInternacionalParcelado = null;
  private BigDecimal limiteInternacionalParcelas = null;
  private BigDecimal limiteInternacionalSaqueGlobal = null;
  private BigDecimal limiteInternacionalSaquePeriodo = null;
  private BigDecimal saldoDisponivelGlobal = null;
  private BigDecimal saldoDisponivelCompra = null;
  private BigDecimal saldoDisponivelParcelado = null;
  private BigDecimal saldoDisponivelParcelas = null;
  private BigDecimal saldoDisponivelSaque = null;
  private BigDecimal saldoPontosFidelidade = null;
  private BigDecimal saldoDisponivelCompraInternacional = null;
  private BigDecimal saldoDisponivelSaqueInternacional = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o de Limite e Disponibilidade (id).
   **/
  public LimiteDisponibilidade id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o de Limite e Disponibilidade (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o valor do limite de cr\u00C3\u00A9dito que o portador do cart\u00C3\u00A3o possui.
   **/
  public LimiteDisponibilidade limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o valor do limite de cr\u00C3\u00A9dito que o portador do cart\u00C3\u00A3o possui.")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Nacionais.
   **/
  public LimiteDisponibilidade limiteCompra(BigDecimal limiteCompra) {
    this.limiteCompra = limiteCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Nacionais.")
  @JsonProperty("limiteCompra")
  public BigDecimal getLimiteCompra() {
    return limiteCompra;
  }
  public void setLimiteCompra(BigDecimal limiteCompra) {
    this.limiteCompra = limiteCompra;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es de compras parceladas.
   **/
  public LimiteDisponibilidade limiteParcelado(BigDecimal limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es de compras parceladas.")
  @JsonProperty("limiteParcelado")
  public BigDecimal getLimiteParcelado() {
    return limiteParcelado;
  }
  public void setLimiteParcelado(BigDecimal limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras que forem realizadas nesta modalidade.
   **/
  public LimiteDisponibilidade limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras que forem realizadas nesta modalidade.")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional.
   **/
  public LimiteDisponibilidade limiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional.")
  @JsonProperty("limiteSaqueGlobal")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional dentro de cada ciclo de faturamento.
   **/
  public LimiteDisponibilidade limiteSaquePeriodo(BigDecimal limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional dentro de cada ciclo de faturamento.")
  @JsonProperty("limiteSaquePeriodo")
  public BigDecimal getLimiteSaquePeriodo() {
    return limiteSaquePeriodo;
  }
  public void setLimiteSaquePeriodo(BigDecimal limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor da margem de cr\u00C3\u00A9dito que ele poder\u00C3\u00A1 utilizar para ser cobrado de forma consignada (desconto em folha) em seu sal\u00C3\u00A1rio/vencimentos.
   **/
  public LimiteDisponibilidade limiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor da margem de cr\u00C3\u00A9dito que ele poder\u00C3\u00A1 utilizar para ser cobrado de forma consignada (desconto em folha) em seu sal\u00C3\u00A1rio/vencimentos.")
  @JsonProperty("limiteConsignado")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Internacionais.
   **/
  public LimiteDisponibilidade limiteInternacionalCompra(BigDecimal limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Internacionais.")
  @JsonProperty("limiteInternacionalCompra")
  public BigDecimal getLimiteInternacionalCompra() {
    return limiteInternacionalCompra;
  }
  public void setLimiteInternacionalCompra(BigDecimal limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es Internacionais de Compras Parceladas.
   **/
  public LimiteDisponibilidade limiteInternacionalParcelado(BigDecimal limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es Internacionais de Compras Parceladas.")
  @JsonProperty("limiteInternacionalParcelado")
  public BigDecimal getLimiteInternacionalParcelado() {
    return limiteInternacionalParcelado;
  }
  public void setLimiteInternacionalParcelado(BigDecimal limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.
   **/
  public LimiteDisponibilidade limiteInternacionalParcelas(BigDecimal limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.")
  @JsonProperty("limiteInternacionalParcelas")
  public BigDecimal getLimiteInternacionalParcelas() {
    return limiteInternacionalParcelas;
  }
  public void setLimiteInternacionalParcelas(BigDecimal limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Internacional.
   **/
  public LimiteDisponibilidade limiteInternacionalSaqueGlobal(BigDecimal limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Internacional.")
  @JsonProperty("limiteInternacionalSaqueGlobal")
  public BigDecimal getLimiteInternacionalSaqueGlobal() {
    return limiteInternacionalSaqueGlobal;
  }
  public void setLimiteInternacionalSaqueGlobal(BigDecimal limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Internacional dentro de cada ciclo de faturamento.
   **/
  public LimiteDisponibilidade limiteInternacionalSaquePeriodo(BigDecimal limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Internacional dentro de cada ciclo de faturamento.")
  @JsonProperty("limiteInternacionalSaquePeriodo")
  public BigDecimal getLimiteInternacionalSaquePeriodo() {
    return limiteInternacionalSaquePeriodo;
  }
  public void setLimiteInternacionalSaquePeriodo(BigDecimal limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
  }

  
  /**
   * Apresenta o valor de cr\u00C3\u00A9dito que o portador possui dispon\u00C3\u00ADvel para realizar transa\u00C3\u00A7\u00C3\u00B5es.
   **/
  public LimiteDisponibilidade saldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o valor de cr\u00C3\u00A9dito que o portador possui dispon\u00C3\u00ADvel para realizar transa\u00C3\u00A7\u00C3\u00B5es.")
  @JsonProperty("saldoDisponivelGlobal")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor a modalidade limiteCompra, este campo apresentar\u00C3\u00A1 o valor de cr\u00C3\u00A9dito que o portador possui dispon\u00C3\u00ADvel para realizar transa\u00C3\u00A7\u00C3\u00B5es de compra Nacional.
   **/
  public LimiteDisponibilidade saldoDisponivelCompra(BigDecimal saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor a modalidade limiteCompra, este campo apresentar\u00C3\u00A1 o valor de cr\u00C3\u00A9dito que o portador possui dispon\u00C3\u00ADvel para realizar transa\u00C3\u00A7\u00C3\u00B5es de compra Nacional.")
  @JsonProperty("saldoDisponivelCompra")
  public BigDecimal getSaldoDisponivelCompra() {
    return saldoDisponivelCompra;
  }
  public void setSaldoDisponivelCompra(BigDecimal saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
  }

  
  /**
   * Quando utilizado pelo emissor a modalidade limiteParcelado, este campo apresentar\u00C3\u00A1 o valor de cr\u00C3\u00A9dito que o portador possui dispon\u00C3\u00ADvel para realizar transa\u00C3\u00A7\u00C3\u00B5es de compra Nacional.
   **/
  public LimiteDisponibilidade saldoDisponivelParcelado(BigDecimal saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor a modalidade limiteParcelado, este campo apresentar\u00C3\u00A1 o valor de cr\u00C3\u00A9dito que o portador possui dispon\u00C3\u00ADvel para realizar transa\u00C3\u00A7\u00C3\u00B5es de compra Nacional.")
  @JsonProperty("saldoDisponivelParcelado")
  public BigDecimal getSaldoDisponivelParcelado() {
    return saldoDisponivelParcelado;
  }
  public void setSaldoDisponivelParcelado(BigDecimal saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
  }

  
  /**
   * Quando utilizado pelo emissor a modalidade limiteParcelas, este campo apresentar\u00C3\u00A1 o valor de cr\u00C3\u00A9dito que o portador possui dispon\u00C3\u00ADvel para utilizar como valor de parcelas Nacionais em um determinado ciclo de faturamento.
   **/
  public LimiteDisponibilidade saldoDisponivelParcelas(BigDecimal saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor a modalidade limiteParcelas, este campo apresentar\u00C3\u00A1 o valor de cr\u00C3\u00A9dito que o portador possui dispon\u00C3\u00ADvel para utilizar como valor de parcelas Nacionais em um determinado ciclo de faturamento.")
  @JsonProperty("saldoDisponivelParcelas")
  public BigDecimal getSaldoDisponivelParcelas() {
    return saldoDisponivelParcelas;
  }
  public void setSaldoDisponivelParcelas(BigDecimal saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
  }

  
  /**
   * Quando utilizado pelo emissor a modalidade limiteSaque, este campo apresentar\u00C3\u00A1 o valor de cr\u00C3\u00A9dito que o portador possui dispon\u00C3\u00ADvel para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional.
   **/
  public LimiteDisponibilidade saldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor a modalidade limiteSaque, este campo apresentar\u00C3\u00A1 o valor de cr\u00C3\u00A9dito que o portador possui dispon\u00C3\u00ADvel para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional.")
  @JsonProperty("saldoDisponivelSaque")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * Quando utilizado um programa de fidelidade pelo emissor, este campo apresentar\u00C3\u00A1 o saldo atual de pontos que o portador possui.
   **/
  public LimiteDisponibilidade saldoPontosFidelidade(BigDecimal saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado um programa de fidelidade pelo emissor, este campo apresentar\u00C3\u00A1 o saldo atual de pontos que o portador possui.")
  @JsonProperty("saldoPontosFidelidade")
  public BigDecimal getSaldoPontosFidelidade() {
    return saldoPontosFidelidade;
  }
  public void setSaldoPontosFidelidade(BigDecimal saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
  }

  
  /**
   * Quando utilizado pelo emissor a modalidade limiteCompraInternacional, este campo apresentar\u00C3\u00A1 o valor de cr\u00C3\u00A9dito que o portador possui dispon\u00C3\u00ADvel para realizar transa\u00C3\u00A7\u00C3\u00B5es de Compra Internacional.
   **/
  public LimiteDisponibilidade saldoDisponivelCompraInternacional(BigDecimal saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor a modalidade limiteCompraInternacional, este campo apresentar\u00C3\u00A1 o valor de cr\u00C3\u00A9dito que o portador possui dispon\u00C3\u00ADvel para realizar transa\u00C3\u00A7\u00C3\u00B5es de Compra Internacional.")
  @JsonProperty("saldoDisponivelCompraInternacional")
  public BigDecimal getSaldoDisponivelCompraInternacional() {
    return saldoDisponivelCompraInternacional;
  }
  public void setSaldoDisponivelCompraInternacional(BigDecimal saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
  }

  
  /**
   * Quando utilizado pelo emissor a modalidade limiteSaqueInternacional, este campo apresentar\u00C3\u00A1 o valor de cr\u00C3\u00A9dito que o portador possui dispon\u00C3\u00ADvel para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Internacional.
   **/
  public LimiteDisponibilidade saldoDisponivelSaqueInternacional(BigDecimal saldoDisponivelSaqueInternacional) {
    this.saldoDisponivelSaqueInternacional = saldoDisponivelSaqueInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor a modalidade limiteSaqueInternacional, este campo apresentar\u00C3\u00A1 o valor de cr\u00C3\u00A9dito que o portador possui dispon\u00C3\u00ADvel para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Internacional.")
  @JsonProperty("saldoDisponivelSaqueInternacional")
  public BigDecimal getSaldoDisponivelSaqueInternacional() {
    return saldoDisponivelSaqueInternacional;
  }
  public void setSaldoDisponivelSaqueInternacional(BigDecimal saldoDisponivelSaqueInternacional) {
    this.saldoDisponivelSaqueInternacional = saldoDisponivelSaqueInternacional;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimiteDisponibilidade limiteDisponibilidade = (LimiteDisponibilidade) o;
    return Objects.equals(this.id, limiteDisponibilidade.id) &&
        Objects.equals(this.limiteGlobal, limiteDisponibilidade.limiteGlobal) &&
        Objects.equals(this.limiteCompra, limiteDisponibilidade.limiteCompra) &&
        Objects.equals(this.limiteParcelado, limiteDisponibilidade.limiteParcelado) &&
        Objects.equals(this.limiteParcelas, limiteDisponibilidade.limiteParcelas) &&
        Objects.equals(this.limiteSaqueGlobal, limiteDisponibilidade.limiteSaqueGlobal) &&
        Objects.equals(this.limiteSaquePeriodo, limiteDisponibilidade.limiteSaquePeriodo) &&
        Objects.equals(this.limiteConsignado, limiteDisponibilidade.limiteConsignado) &&
        Objects.equals(this.limiteInternacionalCompra, limiteDisponibilidade.limiteInternacionalCompra) &&
        Objects.equals(this.limiteInternacionalParcelado, limiteDisponibilidade.limiteInternacionalParcelado) &&
        Objects.equals(this.limiteInternacionalParcelas, limiteDisponibilidade.limiteInternacionalParcelas) &&
        Objects.equals(this.limiteInternacionalSaqueGlobal, limiteDisponibilidade.limiteInternacionalSaqueGlobal) &&
        Objects.equals(this.limiteInternacionalSaquePeriodo, limiteDisponibilidade.limiteInternacionalSaquePeriodo) &&
        Objects.equals(this.saldoDisponivelGlobal, limiteDisponibilidade.saldoDisponivelGlobal) &&
        Objects.equals(this.saldoDisponivelCompra, limiteDisponibilidade.saldoDisponivelCompra) &&
        Objects.equals(this.saldoDisponivelParcelado, limiteDisponibilidade.saldoDisponivelParcelado) &&
        Objects.equals(this.saldoDisponivelParcelas, limiteDisponibilidade.saldoDisponivelParcelas) &&
        Objects.equals(this.saldoDisponivelSaque, limiteDisponibilidade.saldoDisponivelSaque) &&
        Objects.equals(this.saldoPontosFidelidade, limiteDisponibilidade.saldoPontosFidelidade) &&
        Objects.equals(this.saldoDisponivelCompraInternacional, limiteDisponibilidade.saldoDisponivelCompraInternacional) &&
        Objects.equals(this.saldoDisponivelSaqueInternacional, limiteDisponibilidade.saldoDisponivelSaqueInternacional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, limiteGlobal, limiteCompra, limiteParcelado, limiteParcelas, limiteSaqueGlobal, limiteSaquePeriodo, limiteConsignado, limiteInternacionalCompra, limiteInternacionalParcelado, limiteInternacionalParcelas, limiteInternacionalSaqueGlobal, limiteInternacionalSaquePeriodo, saldoDisponivelGlobal, saldoDisponivelCompra, saldoDisponivelParcelado, saldoDisponivelParcelas, saldoDisponivelSaque, saldoPontosFidelidade, saldoDisponivelCompraInternacional, saldoDisponivelSaqueInternacional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimiteDisponibilidade {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limiteGlobal: ").append(toIndentedString(limiteGlobal)).append("\n");
    sb.append("    limiteCompra: ").append(toIndentedString(limiteCompra)).append("\n");
    sb.append("    limiteParcelado: ").append(toIndentedString(limiteParcelado)).append("\n");
    sb.append("    limiteParcelas: ").append(toIndentedString(limiteParcelas)).append("\n");
    sb.append("    limiteSaqueGlobal: ").append(toIndentedString(limiteSaqueGlobal)).append("\n");
    sb.append("    limiteSaquePeriodo: ").append(toIndentedString(limiteSaquePeriodo)).append("\n");
    sb.append("    limiteConsignado: ").append(toIndentedString(limiteConsignado)).append("\n");
    sb.append("    limiteInternacionalCompra: ").append(toIndentedString(limiteInternacionalCompra)).append("\n");
    sb.append("    limiteInternacionalParcelado: ").append(toIndentedString(limiteInternacionalParcelado)).append("\n");
    sb.append("    limiteInternacionalParcelas: ").append(toIndentedString(limiteInternacionalParcelas)).append("\n");
    sb.append("    limiteInternacionalSaqueGlobal: ").append(toIndentedString(limiteInternacionalSaqueGlobal)).append("\n");
    sb.append("    limiteInternacionalSaquePeriodo: ").append(toIndentedString(limiteInternacionalSaquePeriodo)).append("\n");
    sb.append("    saldoDisponivelGlobal: ").append(toIndentedString(saldoDisponivelGlobal)).append("\n");
    sb.append("    saldoDisponivelCompra: ").append(toIndentedString(saldoDisponivelCompra)).append("\n");
    sb.append("    saldoDisponivelParcelado: ").append(toIndentedString(saldoDisponivelParcelado)).append("\n");
    sb.append("    saldoDisponivelParcelas: ").append(toIndentedString(saldoDisponivelParcelas)).append("\n");
    sb.append("    saldoDisponivelSaque: ").append(toIndentedString(saldoDisponivelSaque)).append("\n");
    sb.append("    saldoPontosFidelidade: ").append(toIndentedString(saldoPontosFidelidade)).append("\n");
    sb.append("    saldoDisponivelCompraInternacional: ").append(toIndentedString(saldoDisponivelCompraInternacional)).append("\n");
    sb.append("    saldoDisponivelSaqueInternacional: ").append(toIndentedString(saldoDisponivelSaqueInternacional)).append("\n");
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



