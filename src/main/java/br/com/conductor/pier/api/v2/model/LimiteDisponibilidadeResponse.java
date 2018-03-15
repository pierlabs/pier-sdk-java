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
public class LimiteDisponibilidadeResponse   {
  
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
  private BigDecimal limiteMaximo = null;
  private BigDecimal saldoDisponivelGlobal = null;
  private BigDecimal saldoDisponivelCompra = null;
  private BigDecimal saldoDisponivelParcelado = null;
  private BigDecimal saldoDisponivelParcelas = null;
  private BigDecimal saldoDisponivelSaque = null;
  private BigDecimal saldoPontosFidelidade = null;
  private BigDecimal saldoDisponivelCompraInternacional = null;
  private BigDecimal saldoDisponivelSaqueInternacional = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o de Limite e Disponibilidade (id).
   **/
  public LimiteDisponibilidadeResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o de Limite e Disponibilidade (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Valor do limite de cr\u00E9dito.
   **/
  public LimiteDisponibilidadeResponse limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite de cr\u00E9dito.")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para uso exclusivo em compras nacionais.
   **/
  public LimiteDisponibilidadeResponse limiteCompra(BigDecimal limiteCompra) {
    this.limiteCompra = limiteCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite de cr\u00E9dito para uso exclusivo em compras nacionais.")
  @JsonProperty("limiteCompra")
  public BigDecimal getLimiteCompra() {
    return limiteCompra;
  }
  public void setLimiteCompra(BigDecimal limiteCompra) {
    this.limiteCompra = limiteCompra;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de compras parceladas.
   **/
  public LimiteDisponibilidadeResponse limiteParcelado(BigDecimal limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de compras parceladas.")
  @JsonProperty("limiteParcelado")
  public BigDecimal getLimiteParcelado() {
    return limiteParcelado;
  }
  public void setLimiteParcelado(BigDecimal limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
  }

  
  /**
   * Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras que forem realizadas nesta modalidade.
   **/
  public LimiteDisponibilidadeResponse limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras que forem realizadas nesta modalidade.")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de Saque Nacional.
   **/
  public LimiteDisponibilidadeResponse limiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de Saque Nacional.")
  @JsonProperty("limiteSaqueGlobal")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de Saque Nacional dentro de cada ciclo de faturamento.
   **/
  public LimiteDisponibilidadeResponse limiteSaquePeriodo(BigDecimal limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de Saque Nacional dentro de cada ciclo de faturamento.")
  @JsonProperty("limiteSaquePeriodo")
  public BigDecimal getLimiteSaquePeriodo() {
    return limiteSaquePeriodo;
  }
  public void setLimiteSaquePeriodo(BigDecimal limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
  }

  
  /**
   * Valor da margem de cr\u00E9dito para consigna\u00E7\u00F5es (desconto em folha).
   **/
  public LimiteDisponibilidadeResponse limiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da margem de cr\u00E9dito para consigna\u00E7\u00F5es (desconto em folha).")
  @JsonProperty("limiteConsignado")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para uso exclusivo em compras internacionais.
   **/
  public LimiteDisponibilidadeResponse limiteInternacionalCompra(BigDecimal limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite de cr\u00E9dito para uso exclusivo em compras internacionais.")
  @JsonProperty("limiteInternacionalCompra")
  public BigDecimal getLimiteInternacionalCompra() {
    return limiteInternacionalCompra;
  }
  public void setLimiteInternacionalCompra(BigDecimal limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es internacionais de compras parceladas.
   **/
  public LimiteDisponibilidadeResponse limiteInternacionalParcelado(BigDecimal limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es internacionais de compras parceladas.")
  @JsonProperty("limiteInternacionalParcelado")
  public BigDecimal getLimiteInternacionalParcelado() {
    return limiteInternacionalParcelado;
  }
  public void setLimiteInternacionalParcelado(BigDecimal limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
  }

  
  /**
   * Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.
   **/
  public LimiteDisponibilidadeResponse limiteInternacionalParcelas(BigDecimal limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite de cr\u00E9dito acumulado da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.")
  @JsonProperty("limiteInternacionalParcelas")
  public BigDecimal getLimiteInternacionalParcelas() {
    return limiteInternacionalParcelas;
  }
  public void setLimiteInternacionalParcelas(BigDecimal limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de saque internacional.
   **/
  public LimiteDisponibilidadeResponse limiteInternacionalSaqueGlobal(BigDecimal limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de saque internacional.")
  @JsonProperty("limiteInternacionalSaqueGlobal")
  public BigDecimal getLimiteInternacionalSaqueGlobal() {
    return limiteInternacionalSaqueGlobal;
  }
  public void setLimiteInternacionalSaqueGlobal(BigDecimal limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
  }

  
  /**
   * Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de saque internacional dentro de cada ciclo de faturamento.
   **/
  public LimiteDisponibilidadeResponse limiteInternacionalSaquePeriodo(BigDecimal limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite de cr\u00E9dito para transa\u00E7\u00F5es de saque internacional dentro de cada ciclo de faturamento.")
  @JsonProperty("limiteInternacionalSaquePeriodo")
  public BigDecimal getLimiteInternacionalSaquePeriodo() {
    return limiteInternacionalSaquePeriodo;
  }
  public void setLimiteInternacionalSaquePeriodo(BigDecimal limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
  }

  
  /**
   * Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es.
   **/
  public LimiteDisponibilidadeResponse limiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es.")
  @JsonProperty("limiteMaximo")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es.
   **/
  public LimiteDisponibilidadeResponse saldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es.")
  @JsonProperty("saldoDisponivelGlobal")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de compra nacional.
   **/
  public LimiteDisponibilidadeResponse saldoDisponivelCompra(BigDecimal saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de compra nacional.")
  @JsonProperty("saldoDisponivelCompra")
  public BigDecimal getSaldoDisponivelCompra() {
    return saldoDisponivelCompra;
  }
  public void setSaldoDisponivelCompra(BigDecimal saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
  }

  
  /**
   * Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de compra nacional parcelada.
   **/
  public LimiteDisponibilidadeResponse saldoDisponivelParcelado(BigDecimal saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de compra nacional parcelada.")
  @JsonProperty("saldoDisponivelParcelado")
  public BigDecimal getSaldoDisponivelParcelado() {
    return saldoDisponivelParcelado;
  }
  public void setSaldoDisponivelParcelado(BigDecimal saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
  }

  
  /**
   * Valor de cr\u00E9dito dispon\u00EDvel para utilizar como valor de parcelas Nacionais em um determinado ciclo de faturamento.
   **/
  public LimiteDisponibilidadeResponse saldoDisponivelParcelas(BigDecimal saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor de cr\u00E9dito dispon\u00EDvel para utilizar como valor de parcelas Nacionais em um determinado ciclo de faturamento.")
  @JsonProperty("saldoDisponivelParcelas")
  public BigDecimal getSaldoDisponivelParcelas() {
    return saldoDisponivelParcelas;
  }
  public void setSaldoDisponivelParcelas(BigDecimal saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
  }

  
  /**
   * Valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es de Saque Nacional.
   **/
  public LimiteDisponibilidadeResponse saldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es de Saque Nacional.")
  @JsonProperty("saldoDisponivelSaque")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * Saldo atual de pontos do programa de fidelidade.
   **/
  public LimiteDisponibilidadeResponse saldoPontosFidelidade(BigDecimal saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo atual de pontos do programa de fidelidade.")
  @JsonProperty("saldoPontosFidelidade")
  public BigDecimal getSaldoPontosFidelidade() {
    return saldoPontosFidelidade;
  }
  public void setSaldoPontosFidelidade(BigDecimal saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
  }

  
  /**
   * Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de compra internacional.
   **/
  public LimiteDisponibilidadeResponse saldoDisponivelCompraInternacional(BigDecimal saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de compra internacional.")
  @JsonProperty("saldoDisponivelCompraInternacional")
  public BigDecimal getSaldoDisponivelCompraInternacional() {
    return saldoDisponivelCompraInternacional;
  }
  public void setSaldoDisponivelCompraInternacional(BigDecimal saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
  }

  
  /**
   * Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de saque internacional.
   **/
  public LimiteDisponibilidadeResponse saldoDisponivelSaqueInternacional(BigDecimal saldoDisponivelSaqueInternacional) {
    this.saldoDisponivelSaqueInternacional = saldoDisponivelSaqueInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor de cr\u00E9dito dispon\u00EDvel para transa\u00E7\u00F5es de saque internacional.")
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
    LimiteDisponibilidadeResponse limiteDisponibilidadeResponse = (LimiteDisponibilidadeResponse) o;
    return Objects.equals(this.id, limiteDisponibilidadeResponse.id) &&
        Objects.equals(this.limiteGlobal, limiteDisponibilidadeResponse.limiteGlobal) &&
        Objects.equals(this.limiteCompra, limiteDisponibilidadeResponse.limiteCompra) &&
        Objects.equals(this.limiteParcelado, limiteDisponibilidadeResponse.limiteParcelado) &&
        Objects.equals(this.limiteParcelas, limiteDisponibilidadeResponse.limiteParcelas) &&
        Objects.equals(this.limiteSaqueGlobal, limiteDisponibilidadeResponse.limiteSaqueGlobal) &&
        Objects.equals(this.limiteSaquePeriodo, limiteDisponibilidadeResponse.limiteSaquePeriodo) &&
        Objects.equals(this.limiteConsignado, limiteDisponibilidadeResponse.limiteConsignado) &&
        Objects.equals(this.limiteInternacionalCompra, limiteDisponibilidadeResponse.limiteInternacionalCompra) &&
        Objects.equals(this.limiteInternacionalParcelado, limiteDisponibilidadeResponse.limiteInternacionalParcelado) &&
        Objects.equals(this.limiteInternacionalParcelas, limiteDisponibilidadeResponse.limiteInternacionalParcelas) &&
        Objects.equals(this.limiteInternacionalSaqueGlobal, limiteDisponibilidadeResponse.limiteInternacionalSaqueGlobal) &&
        Objects.equals(this.limiteInternacionalSaquePeriodo, limiteDisponibilidadeResponse.limiteInternacionalSaquePeriodo) &&
        Objects.equals(this.limiteMaximo, limiteDisponibilidadeResponse.limiteMaximo) &&
        Objects.equals(this.saldoDisponivelGlobal, limiteDisponibilidadeResponse.saldoDisponivelGlobal) &&
        Objects.equals(this.saldoDisponivelCompra, limiteDisponibilidadeResponse.saldoDisponivelCompra) &&
        Objects.equals(this.saldoDisponivelParcelado, limiteDisponibilidadeResponse.saldoDisponivelParcelado) &&
        Objects.equals(this.saldoDisponivelParcelas, limiteDisponibilidadeResponse.saldoDisponivelParcelas) &&
        Objects.equals(this.saldoDisponivelSaque, limiteDisponibilidadeResponse.saldoDisponivelSaque) &&
        Objects.equals(this.saldoPontosFidelidade, limiteDisponibilidadeResponse.saldoPontosFidelidade) &&
        Objects.equals(this.saldoDisponivelCompraInternacional, limiteDisponibilidadeResponse.saldoDisponivelCompraInternacional) &&
        Objects.equals(this.saldoDisponivelSaqueInternacional, limiteDisponibilidadeResponse.saldoDisponivelSaqueInternacional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, limiteGlobal, limiteCompra, limiteParcelado, limiteParcelas, limiteSaqueGlobal, limiteSaquePeriodo, limiteConsignado, limiteInternacionalCompra, limiteInternacionalParcelado, limiteInternacionalParcelas, limiteInternacionalSaqueGlobal, limiteInternacionalSaquePeriodo, limiteMaximo, saldoDisponivelGlobal, saldoDisponivelCompra, saldoDisponivelParcelado, saldoDisponivelParcelas, saldoDisponivelSaque, saldoPontosFidelidade, saldoDisponivelCompraInternacional, saldoDisponivelSaqueInternacional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimiteDisponibilidadeResponse {\n");
    
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
    sb.append("    limiteMaximo: ").append(toIndentedString(limiteMaximo)).append("\n");
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

