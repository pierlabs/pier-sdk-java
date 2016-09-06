package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * LimiteDisponibilidade
 **/

@ApiModel(description = "LimiteDisponibilidade")
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

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Limite Disponibilidade (id).
   **/
  public LimiteDisponibilidade id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Limite Disponibilidade (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  public LimiteDisponibilidade limiteCompra(Double limiteCompra) {
    this.limiteCompra = limiteCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("limiteCompra")
  public Double getLimiteCompra() {
    return limiteCompra;
  }
  public void setLimiteCompra(Double limiteCompra) {
    this.limiteCompra = limiteCompra;
  }

  
  /**
   **/
  public LimiteDisponibilidade limiteConsignado(Double limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("limiteConsignado")
  public Double getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(Double limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   **/
  public LimiteDisponibilidade limiteExterno(Double limiteExterno) {
    this.limiteExterno = limiteExterno;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("limiteExterno")
  public Double getLimiteExterno() {
    return limiteExterno;
  }
  public void setLimiteExterno(Double limiteExterno) {
    this.limiteExterno = limiteExterno;
  }

  
  /**
   **/
  public LimiteDisponibilidade limiteExtra(Double limiteExtra) {
    this.limiteExtra = limiteExtra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("limiteExtra")
  public Double getLimiteExtra() {
    return limiteExtra;
  }
  public void setLimiteExtra(Double limiteExtra) {
    this.limiteExtra = limiteExtra;
  }

  
  /**
   * Campo que 
   **/
  public LimiteDisponibilidade limiteGlobal(Double limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Campo que ")
  @JsonProperty("limiteGlobal")
  public Double getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(Double limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   **/
  public LimiteDisponibilidade limiteInternacionalCompra(Double limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("limiteInternacionalCompra")
  public Double getLimiteInternacionalCompra() {
    return limiteInternacionalCompra;
  }
  public void setLimiteInternacionalCompra(Double limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
  }

  
  /**
   **/
  public LimiteDisponibilidade limiteInternacionalParcelado(Double limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("limiteInternacionalParcelado")
  public Double getLimiteInternacionalParcelado() {
    return limiteInternacionalParcelado;
  }
  public void setLimiteInternacionalParcelado(Double limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
  }

  
  /**
   **/
  public LimiteDisponibilidade limiteInternacionalParcelas(Double limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
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
   **/
  public LimiteDisponibilidade limiteMensal(Double limiteMensal) {
    this.limiteMensal = limiteMensal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("limiteMensal")
  public Double getLimiteMensal() {
    return limiteMensal;
  }
  public void setLimiteMensal(Double limiteMensal) {
    this.limiteMensal = limiteMensal;
  }

  
  /**
   **/
  public LimiteDisponibilidade limiteParcelado(Double limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("limiteParcelado")
  public Double getLimiteParcelado() {
    return limiteParcelado;
  }
  public void setLimiteParcelado(Double limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
  }

  
  /**
   **/
  public LimiteDisponibilidade limiteParcelas(Double limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("limiteParcelas")
  public Double getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(Double limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   **/
  public LimiteDisponibilidade limiteSaqueGlobal(Double limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("limiteSaqueGlobal")
  public Double getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(Double limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   **/
  public LimiteDisponibilidade limiteSaquePeriodo(Double limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("limiteSaquePeriodo")
  public Double getLimiteSaquePeriodo() {
    return limiteSaquePeriodo;
  }
  public void setLimiteSaquePeriodo(Double limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
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
        Objects.equals(this.limiteSaquePeriodo, limiteDisponibilidade.limiteSaquePeriodo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, limiteCompra, limiteConsignado, limiteExterno, limiteExtra, limiteGlobal, limiteInternacionalCompra, limiteInternacionalParcelado, limiteInternacionalParcelas, limiteInternacionalSaqueGlobal, limiteInternacionalSaquePeriodo, limiteMensal, limiteParcelado, limiteParcelas, limiteSaqueGlobal, limiteSaquePeriodo);
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



