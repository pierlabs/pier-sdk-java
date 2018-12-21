package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Limit Availability
 **/

@ApiModel(description = "Limit Availability")
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
   * Identification Code of the Availability aand Limit (id)
   **/
  public LimiteDisponibilidadeResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Availability aand Limit (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Value of the Credit limit
   **/
  public LimiteDisponibilidadeResponse limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the Credit limit")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Value of the credit limit to use in national shops
   **/
  public LimiteDisponibilidadeResponse limiteCompra(BigDecimal limiteCompra) {
    this.limiteCompra = limiteCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the credit limit to use in national shops")
  @JsonProperty("limiteCompra")
  public BigDecimal getLimiteCompra() {
    return limiteCompra;
  }
  public void setLimiteCompra(BigDecimal limiteCompra) {
    this.limiteCompra = limiteCompra;
  }

  
  /**
   * Value of credit limit for transactions of parceled shops
   **/
  public LimiteDisponibilidadeResponse limiteParcelado(BigDecimal limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of credit limit for transactions of parceled shops")
  @JsonProperty("limiteParcelado")
  public BigDecimal getLimiteParcelado() {
    return limiteParcelado;
  }
  public void setLimiteParcelado(BigDecimal limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
  }

  
  /**
   * Value of accumulated credit limit of the sum of parcels that are made in this modality
   **/
  public LimiteDisponibilidadeResponse limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of accumulated credit limit of the sum of parcels that are made in this modality")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Value of the credit limit for transactions of National Withdrawal
   **/
  public LimiteDisponibilidadeResponse limiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the credit limit for transactions of National Withdrawal")
  @JsonProperty("limiteSaqueGlobal")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * Value of the credit limit for transactions of National Withdrawal inside of each billing cycle
   **/
  public LimiteDisponibilidadeResponse limiteSaquePeriodo(BigDecimal limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the credit limit for transactions of National Withdrawal inside of each billing cycle")
  @JsonProperty("limiteSaquePeriodo")
  public BigDecimal getLimiteSaquePeriodo() {
    return limiteSaquePeriodo;
  }
  public void setLimiteSaquePeriodo(BigDecimal limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
  }

  
  /**
   * Value of the credit margin for consignations (discount in payroll)
   **/
  public LimiteDisponibilidadeResponse limiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the credit margin for consignations (discount in payroll)")
  @JsonProperty("limiteConsignado")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Value of the Credit limit to use in international shops
   **/
  public LimiteDisponibilidadeResponse limiteInternacionalCompra(BigDecimal limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the Credit limit to use in international shops")
  @JsonProperty("limiteInternacionalCompra")
  public BigDecimal getLimiteInternacionalCompra() {
    return limiteInternacionalCompra;
  }
  public void setLimiteInternacionalCompra(BigDecimal limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
  }

  
  /**
   * Value of the credit limit for international transactions of parceled shops
   **/
  public LimiteDisponibilidadeResponse limiteInternacionalParcelado(BigDecimal limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the credit limit for international transactions of parceled shops")
  @JsonProperty("limiteInternacionalParcelado")
  public BigDecimal getLimiteInternacionalParcelado() {
    return limiteInternacionalParcelado;
  }
  public void setLimiteInternacionalParcelado(BigDecimal limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
  }

  
  /**
   * Value of the credit limit accumulated of the sum of international shop parcels that are made in this modality
   **/
  public LimiteDisponibilidadeResponse limiteInternacionalParcelas(BigDecimal limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the credit limit accumulated of the sum of international shop parcels that are made in this modality")
  @JsonProperty("limiteInternacionalParcelas")
  public BigDecimal getLimiteInternacionalParcelas() {
    return limiteInternacionalParcelas;
  }
  public void setLimiteInternacionalParcelas(BigDecimal limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
  }

  
  /**
   * Value of Credit limit for transactions of international withdrawals
   **/
  public LimiteDisponibilidadeResponse limiteInternacionalSaqueGlobal(BigDecimal limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of Credit limit for transactions of international withdrawals")
  @JsonProperty("limiteInternacionalSaqueGlobal")
  public BigDecimal getLimiteInternacionalSaqueGlobal() {
    return limiteInternacionalSaqueGlobal;
  }
  public void setLimiteInternacionalSaqueGlobal(BigDecimal limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
  }

  
  /**
   * Value of the credit limit for transactions of international Withdrawal inside of each billing cycle
   **/
  public LimiteDisponibilidadeResponse limiteInternacionalSaquePeriodo(BigDecimal limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the credit limit for transactions of international Withdrawal inside of each billing cycle")
  @JsonProperty("limiteInternacionalSaquePeriodo")
  public BigDecimal getLimiteInternacionalSaquePeriodo() {
    return limiteInternacionalSaquePeriodo;
  }
  public void setLimiteInternacionalSaquePeriodo(BigDecimal limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
  }

  
  /**
   * Maximum value of the credit limit to make transactions
   **/
  public LimiteDisponibilidadeResponse limiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum value of the credit limit to make transactions")
  @JsonProperty("limiteMaximo")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Credit value available for the transactions
   **/
  public LimiteDisponibilidadeResponse saldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Credit value available for the transactions")
  @JsonProperty("saldoDisponivelGlobal")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * Credit Value available for transactions of National shop
   **/
  public LimiteDisponibilidadeResponse saldoDisponivelCompra(BigDecimal saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Credit Value available for transactions of National shop")
  @JsonProperty("saldoDisponivelCompra")
  public BigDecimal getSaldoDisponivelCompra() {
    return saldoDisponivelCompra;
  }
  public void setSaldoDisponivelCompra(BigDecimal saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
  }

  
  /**
   * Value of the available credit for transactions of Parceled National Shop
   **/
  public LimiteDisponibilidadeResponse saldoDisponivelParcelado(BigDecimal saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the available credit for transactions of Parceled National Shop")
  @JsonProperty("saldoDisponivelParcelado")
  public BigDecimal getSaldoDisponivelParcelado() {
    return saldoDisponivelParcelado;
  }
  public void setSaldoDisponivelParcelado(BigDecimal saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
  }

  
  /**
   * Credit value available to use as the National parcel value in a determined billing cycle
   **/
  public LimiteDisponibilidadeResponse saldoDisponivelParcelas(BigDecimal saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Credit value available to use as the National parcel value in a determined billing cycle")
  @JsonProperty("saldoDisponivelParcelas")
  public BigDecimal getSaldoDisponivelParcelas() {
    return saldoDisponivelParcelas;
  }
  public void setSaldoDisponivelParcelas(BigDecimal saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
  }

  
  /**
   * Value of the credit that the cardholder has available to make transactions of National Withdrawal
   **/
  public LimiteDisponibilidadeResponse saldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the credit that the cardholder has available to make transactions of National Withdrawal")
  @JsonProperty("saldoDisponivelSaque")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * Current Balance of the Fidelity Point Program
   **/
  public LimiteDisponibilidadeResponse saldoPontosFidelidade(BigDecimal saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current Balance of the Fidelity Point Program")
  @JsonProperty("saldoPontosFidelidade")
  public BigDecimal getSaldoPontosFidelidade() {
    return saldoPontosFidelidade;
  }
  public void setSaldoPontosFidelidade(BigDecimal saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
  }

  
  /**
   * Value of the available credit for transactions of international shop
   **/
  public LimiteDisponibilidadeResponse saldoDisponivelCompraInternacional(BigDecimal saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the available credit for transactions of international shop")
  @JsonProperty("saldoDisponivelCompraInternacional")
  public BigDecimal getSaldoDisponivelCompraInternacional() {
    return saldoDisponivelCompraInternacional;
  }
  public void setSaldoDisponivelCompraInternacional(BigDecimal saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
  }

  
  /**
   * Value of available credit for transactions of international Withdrawal
   **/
  public LimiteDisponibilidadeResponse saldoDisponivelSaqueInternacional(BigDecimal saldoDisponivelSaqueInternacional) {
    this.saldoDisponivelSaqueInternacional = saldoDisponivelSaqueInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of available credit for transactions of international Withdrawal")
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

