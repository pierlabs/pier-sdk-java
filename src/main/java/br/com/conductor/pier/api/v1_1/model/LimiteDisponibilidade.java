package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Limite Disponibilidade
 **/

@ApiModel(description = "Limite Disponibilidade")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LimiteDisponibilidade   {
  
  private Long id = null;
  private Double limiteCompra = null;
  private Double limiteConsignado = null;
  private Double limiteExterno = null;
  private Double limiteExtra = null;
  private Double limiteGlobal = null;
  private Double limiteInternacionalCompra = null;
  private Double limiteInternacionalParcelado = null;
  private Double limiteInternacionalParcelas = null;
  private Double limiteInternacionalSaqueGlobal = null;
  private Double limiteInternacionalSaquePeriodo = null;
  private Double limiteMensal = null;
  private Double limiteParcelado = null;
  private Double limiteParcelas = null;
  private Double limiteSaqueGlobal = null;
  private Double limiteSaquePeriodo = null;
  private Double saldoDisponivelCompra = null;
  private Double saldoDisponivelCompraInternacional = null;
  private Double saldoDisponivelExterno = null;
  private Double saldoDisponivelExtra = null;
  private Double saldoDisponivelGlobal = null;
  private Double saldoDisponivelMensal = null;
  private Double saldoDisponivelParcelado = null;
  private Double saldoDisponivelParcelas = null;
  private Double saldoDisponivelSaque = null;
  private Double saldoDisponivelSaqueInternacional = null;
  private Double saldoPontosFidelidade = null;

  
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
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Nacionais
   **/
  public LimiteDisponibilidade limiteCompra(Double limiteCompra) {
    this.limiteCompra = limiteCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Nacionais")
  @JsonProperty("limiteCompra")
  public Double getLimiteCompra() {
    return limiteCompra;
  }
  public void setLimiteCompra(Double limiteCompra) {
    this.limiteCompra = limiteCompra;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor da margem de cr\u00C3\u00A9dito que ele poder\u00C3\u00A1 utilizar para ser cobrado de forma consignada (desconto em folha) em seu sal\u00C3\u00A1rio/vencimentos.
   **/
  public LimiteDisponibilidade limiteConsignado(Double limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor da margem de cr\u00C3\u00A9dito que ele poder\u00C3\u00A1 utilizar para ser cobrado de forma consignada (desconto em folha) em seu sal\u00C3\u00A1rio/vencimentos.")
  @JsonProperty("limiteConsignado")
  public Double getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(Double limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es fora da rede pr\u00C3\u00B3pria do emissor, tamb\u00C3\u00A9m chamado de limite para transa\u00C3\u00A7\u00C3\u00B5es off-us.
   **/
  public LimiteDisponibilidade limiteExterno(Double limiteExterno) {
    this.limiteExterno = limiteExterno;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es fora da rede pr\u00C3\u00B3pria do emissor, tamb\u00C3\u00A9m chamado de limite para transa\u00C3\u00A7\u00C3\u00B5es off-us.")
  @JsonProperty("limiteExterno")
  public Double getLimiteExterno() {
    return limiteExterno;
  }
  public void setLimiteExterno(Double limiteExterno) {
    this.limiteExterno = limiteExterno;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para utiliza\u00C3\u00A7\u00C3\u00A3o al\u00C3\u00A9m do valor do limiteGlobal. 
   **/
  public LimiteDisponibilidade limiteExtra(Double limiteExtra) {
    this.limiteExtra = limiteExtra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para utiliza\u00C3\u00A7\u00C3\u00A3o al\u00C3\u00A9m do valor do limiteGlobal. ")
  @JsonProperty("limiteExtra")
  public Double getLimiteExtra() {
    return limiteExtra;
  }
  public void setLimiteExtra(Double limiteExtra) {
    this.limiteExtra = limiteExtra;
  }

  
  /**
   * Apresenta o valor do limite de cr\u00C3\u00A9dito que o portador do cart\u00C3\u00A3o possui.
   **/
  public LimiteDisponibilidade limiteGlobal(Double limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o valor do limite de cr\u00C3\u00A9dito que o portador do cart\u00C3\u00A3o possui.")
  @JsonProperty("limiteGlobal")
  public Double getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(Double limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Internacionais.
   **/
  public LimiteDisponibilidade limiteInternacionalCompra(Double limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Internacionais.")
  @JsonProperty("limiteInternacionalCompra")
  public Double getLimiteInternacionalCompra() {
    return limiteInternacionalCompra;
  }
  public void setLimiteInternacionalCompra(Double limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es Internacionais de Compras Parceladas.
   **/
  public LimiteDisponibilidade limiteInternacionalParcelado(Double limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es Internacionais de Compras Parceladas.")
  @JsonProperty("limiteInternacionalParcelado")
  public Double getLimiteInternacionalParcelado() {
    return limiteInternacionalParcelado;
  }
  public void setLimiteInternacionalParcelado(Double limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.
   **/
  public LimiteDisponibilidade limiteInternacionalParcelas(Double limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.")
  @JsonProperty("limiteInternacionalParcelas")
  public Double getLimiteInternacionalParcelas() {
    return limiteInternacionalParcelas;
  }
  public void setLimiteInternacionalParcelas(Double limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
  }

  
  /**
   **/
  public LimiteDisponibilidade limiteInternacionalSaqueGlobal(Double limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("limiteInternacionalSaqueGlobal")
  public Double getLimiteInternacionalSaqueGlobal() {
    return limiteInternacionalSaqueGlobal;
  }
  public void setLimiteInternacionalSaqueGlobal(Double limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
  }

  
  /**
   **/
  public LimiteDisponibilidade limiteInternacionalSaquePeriodo(Double limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("limiteInternacionalSaquePeriodo")
  public Double getLimiteInternacionalSaquePeriodo() {
    return limiteInternacionalSaquePeriodo;
  }
  public void setLimiteInternacionalSaquePeriodo(Double limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que a fatura do portador pode ter em um determinado per\u00C3\u00ADodo.
   **/
  public LimiteDisponibilidade limiteMensal(Double limiteMensal) {
    this.limiteMensal = limiteMensal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que a fatura do portador pode ter em um determinado per\u00C3\u00ADodo.")
  @JsonProperty("limiteMensal")
  public Double getLimiteMensal() {
    return limiteMensal;
  }
  public void setLimiteMensal(Double limiteMensal) {
    this.limiteMensal = limiteMensal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es de compras parceladas.
   **/
  public LimiteDisponibilidade limiteParcelado(Double limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es de compras parceladas.")
  @JsonProperty("limiteParcelado")
  public Double getLimiteParcelado() {
    return limiteParcelado;
  }
  public void setLimiteParcelado(Double limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras que forem realizadas nesta modalidade.
   **/
  public LimiteDisponibilidade limiteParcelas(Double limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras que forem realizadas nesta modalidade.")
  @JsonProperty("limiteParcelas")
  public Double getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(Double limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional.
   **/
  public LimiteDisponibilidade limiteSaqueGlobal(Double limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional.")
  @JsonProperty("limiteSaqueGlobal")
  public Double getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(Double limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional dentro de cada ciclo de faturamento.
   **/
  public LimiteDisponibilidade limiteSaquePeriodo(Double limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional dentro de cada ciclo de faturamento.")
  @JsonProperty("limiteSaquePeriodo")
  public Double getLimiteSaquePeriodo() {
    return limiteSaquePeriodo;
  }
  public void setLimiteSaquePeriodo(Double limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
  }

  
  /**
   **/
  public LimiteDisponibilidade saldoDisponivelCompra(Double saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("saldoDisponivelCompra")
  public Double getSaldoDisponivelCompra() {
    return saldoDisponivelCompra;
  }
  public void setSaldoDisponivelCompra(Double saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
  }

  
  /**
   **/
  public LimiteDisponibilidade saldoDisponivelCompraInternacional(Double saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("saldoDisponivelCompraInternacional")
  public Double getSaldoDisponivelCompraInternacional() {
    return saldoDisponivelCompraInternacional;
  }
  public void setSaldoDisponivelCompraInternacional(Double saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
  }

  
  /**
   **/
  public LimiteDisponibilidade saldoDisponivelExterno(Double saldoDisponivelExterno) {
    this.saldoDisponivelExterno = saldoDisponivelExterno;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("saldoDisponivelExterno")
  public Double getSaldoDisponivelExterno() {
    return saldoDisponivelExterno;
  }
  public void setSaldoDisponivelExterno(Double saldoDisponivelExterno) {
    this.saldoDisponivelExterno = saldoDisponivelExterno;
  }

  
  /**
   **/
  public LimiteDisponibilidade saldoDisponivelExtra(Double saldoDisponivelExtra) {
    this.saldoDisponivelExtra = saldoDisponivelExtra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("saldoDisponivelExtra")
  public Double getSaldoDisponivelExtra() {
    return saldoDisponivelExtra;
  }
  public void setSaldoDisponivelExtra(Double saldoDisponivelExtra) {
    this.saldoDisponivelExtra = saldoDisponivelExtra;
  }

  
  /**
   * Campo que 
   **/
  public LimiteDisponibilidade saldoDisponivelGlobal(Double saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Campo que ")
  @JsonProperty("saldoDisponivelGlobal")
  public Double getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(Double saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   **/
  public LimiteDisponibilidade saldoDisponivelMensal(Double saldoDisponivelMensal) {
    this.saldoDisponivelMensal = saldoDisponivelMensal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("saldoDisponivelMensal")
  public Double getSaldoDisponivelMensal() {
    return saldoDisponivelMensal;
  }
  public void setSaldoDisponivelMensal(Double saldoDisponivelMensal) {
    this.saldoDisponivelMensal = saldoDisponivelMensal;
  }

  
  /**
   **/
  public LimiteDisponibilidade saldoDisponivelParcelado(Double saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("saldoDisponivelParcelado")
  public Double getSaldoDisponivelParcelado() {
    return saldoDisponivelParcelado;
  }
  public void setSaldoDisponivelParcelado(Double saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
  }

  
  /**
   **/
  public LimiteDisponibilidade saldoDisponivelParcelas(Double saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("saldoDisponivelParcelas")
  public Double getSaldoDisponivelParcelas() {
    return saldoDisponivelParcelas;
  }
  public void setSaldoDisponivelParcelas(Double saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
  }

  
  /**
   **/
  public LimiteDisponibilidade saldoDisponivelSaque(Double saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("saldoDisponivelSaque")
  public Double getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(Double saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   **/
  public LimiteDisponibilidade saldoDisponivelSaqueInternacional(Double saldoDisponivelSaqueInternacional) {
    this.saldoDisponivelSaqueInternacional = saldoDisponivelSaqueInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("saldoDisponivelSaqueInternacional")
  public Double getSaldoDisponivelSaqueInternacional() {
    return saldoDisponivelSaqueInternacional;
  }
  public void setSaldoDisponivelSaqueInternacional(Double saldoDisponivelSaqueInternacional) {
    this.saldoDisponivelSaqueInternacional = saldoDisponivelSaqueInternacional;
  }

  
  /**
   **/
  public LimiteDisponibilidade saldoPontosFidelidade(Double saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("saldoPontosFidelidade")
  public Double getSaldoPontosFidelidade() {
    return saldoPontosFidelidade;
  }
  public void setSaldoPontosFidelidade(Double saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
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
        Objects.equals(this.limiteCompra, limiteDisponibilidade.limiteCompra) &&
        Objects.equals(this.limiteConsignado, limiteDisponibilidade.limiteConsignado) &&
        Objects.equals(this.limiteExterno, limiteDisponibilidade.limiteExterno) &&
        Objects.equals(this.limiteExtra, limiteDisponibilidade.limiteExtra) &&
        Objects.equals(this.limiteGlobal, limiteDisponibilidade.limiteGlobal) &&
        Objects.equals(this.limiteInternacionalCompra, limiteDisponibilidade.limiteInternacionalCompra) &&
        Objects.equals(this.limiteInternacionalParcelado, limiteDisponibilidade.limiteInternacionalParcelado) &&
        Objects.equals(this.limiteInternacionalParcelas, limiteDisponibilidade.limiteInternacionalParcelas) &&
        Objects.equals(this.limiteInternacionalSaqueGlobal, limiteDisponibilidade.limiteInternacionalSaqueGlobal) &&
        Objects.equals(this.limiteInternacionalSaquePeriodo, limiteDisponibilidade.limiteInternacionalSaquePeriodo) &&
        Objects.equals(this.limiteMensal, limiteDisponibilidade.limiteMensal) &&
        Objects.equals(this.limiteParcelado, limiteDisponibilidade.limiteParcelado) &&
        Objects.equals(this.limiteParcelas, limiteDisponibilidade.limiteParcelas) &&
        Objects.equals(this.limiteSaqueGlobal, limiteDisponibilidade.limiteSaqueGlobal) &&
        Objects.equals(this.limiteSaquePeriodo, limiteDisponibilidade.limiteSaquePeriodo) &&
        Objects.equals(this.saldoDisponivelCompra, limiteDisponibilidade.saldoDisponivelCompra) &&
        Objects.equals(this.saldoDisponivelCompraInternacional, limiteDisponibilidade.saldoDisponivelCompraInternacional) &&
        Objects.equals(this.saldoDisponivelExterno, limiteDisponibilidade.saldoDisponivelExterno) &&
        Objects.equals(this.saldoDisponivelExtra, limiteDisponibilidade.saldoDisponivelExtra) &&
        Objects.equals(this.saldoDisponivelGlobal, limiteDisponibilidade.saldoDisponivelGlobal) &&
        Objects.equals(this.saldoDisponivelMensal, limiteDisponibilidade.saldoDisponivelMensal) &&
        Objects.equals(this.saldoDisponivelParcelado, limiteDisponibilidade.saldoDisponivelParcelado) &&
        Objects.equals(this.saldoDisponivelParcelas, limiteDisponibilidade.saldoDisponivelParcelas) &&
        Objects.equals(this.saldoDisponivelSaque, limiteDisponibilidade.saldoDisponivelSaque) &&
        Objects.equals(this.saldoDisponivelSaqueInternacional, limiteDisponibilidade.saldoDisponivelSaqueInternacional) &&
        Objects.equals(this.saldoPontosFidelidade, limiteDisponibilidade.saldoPontosFidelidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, limiteCompra, limiteConsignado, limiteExterno, limiteExtra, limiteGlobal, limiteInternacionalCompra, limiteInternacionalParcelado, limiteInternacionalParcelas, limiteInternacionalSaqueGlobal, limiteInternacionalSaquePeriodo, limiteMensal, limiteParcelado, limiteParcelas, limiteSaqueGlobal, limiteSaquePeriodo, saldoDisponivelCompra, saldoDisponivelCompraInternacional, saldoDisponivelExterno, saldoDisponivelExtra, saldoDisponivelGlobal, saldoDisponivelMensal, saldoDisponivelParcelado, saldoDisponivelParcelas, saldoDisponivelSaque, saldoDisponivelSaqueInternacional, saldoPontosFidelidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimiteDisponibilidade {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limiteCompra: ").append(toIndentedString(limiteCompra)).append("\n");
    sb.append("    limiteConsignado: ").append(toIndentedString(limiteConsignado)).append("\n");
    sb.append("    limiteExterno: ").append(toIndentedString(limiteExterno)).append("\n");
    sb.append("    limiteExtra: ").append(toIndentedString(limiteExtra)).append("\n");
    sb.append("    limiteGlobal: ").append(toIndentedString(limiteGlobal)).append("\n");
    sb.append("    limiteInternacionalCompra: ").append(toIndentedString(limiteInternacionalCompra)).append("\n");
    sb.append("    limiteInternacionalParcelado: ").append(toIndentedString(limiteInternacionalParcelado)).append("\n");
    sb.append("    limiteInternacionalParcelas: ").append(toIndentedString(limiteInternacionalParcelas)).append("\n");
    sb.append("    limiteInternacionalSaqueGlobal: ").append(toIndentedString(limiteInternacionalSaqueGlobal)).append("\n");
    sb.append("    limiteInternacionalSaquePeriodo: ").append(toIndentedString(limiteInternacionalSaquePeriodo)).append("\n");
    sb.append("    limiteMensal: ").append(toIndentedString(limiteMensal)).append("\n");
    sb.append("    limiteParcelado: ").append(toIndentedString(limiteParcelado)).append("\n");
    sb.append("    limiteParcelas: ").append(toIndentedString(limiteParcelas)).append("\n");
    sb.append("    limiteSaqueGlobal: ").append(toIndentedString(limiteSaqueGlobal)).append("\n");
    sb.append("    limiteSaquePeriodo: ").append(toIndentedString(limiteSaquePeriodo)).append("\n");
    sb.append("    saldoDisponivelCompra: ").append(toIndentedString(saldoDisponivelCompra)).append("\n");
    sb.append("    saldoDisponivelCompraInternacional: ").append(toIndentedString(saldoDisponivelCompraInternacional)).append("\n");
    sb.append("    saldoDisponivelExterno: ").append(toIndentedString(saldoDisponivelExterno)).append("\n");
    sb.append("    saldoDisponivelExtra: ").append(toIndentedString(saldoDisponivelExtra)).append("\n");
    sb.append("    saldoDisponivelGlobal: ").append(toIndentedString(saldoDisponivelGlobal)).append("\n");
    sb.append("    saldoDisponivelMensal: ").append(toIndentedString(saldoDisponivelMensal)).append("\n");
    sb.append("    saldoDisponivelParcelado: ").append(toIndentedString(saldoDisponivelParcelado)).append("\n");
    sb.append("    saldoDisponivelParcelas: ").append(toIndentedString(saldoDisponivelParcelas)).append("\n");
    sb.append("    saldoDisponivelSaque: ").append(toIndentedString(saldoDisponivelSaque)).append("\n");
    sb.append("    saldoDisponivelSaqueInternacional: ").append(toIndentedString(saldoDisponivelSaqueInternacional)).append("\n");
    sb.append("    saldoPontosFidelidade: ").append(toIndentedString(saldoPontosFidelidade)).append("\n");
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



