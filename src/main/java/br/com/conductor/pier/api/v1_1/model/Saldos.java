package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Saldos
 **/

@ApiModel(description = "Saldos")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class Saldos   {
  
  private Long id = null;
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
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Limite Disponibilidade (id).
   **/
  public Saldos id(Long id) {
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
  public Saldos saldoDisponivelCompra(Double saldoDisponivelCompra) {
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
  public Saldos saldoDisponivelCompraInternacional(Double saldoDisponivelCompraInternacional) {
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
  public Saldos saldoDisponivelExterno(Double saldoDisponivelExterno) {
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
  public Saldos saldoDisponivelExtra(Double saldoDisponivelExtra) {
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
  public Saldos saldoDisponivelGlobal(Double saldoDisponivelGlobal) {
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
  public Saldos saldoDisponivelMensal(Double saldoDisponivelMensal) {
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
  public Saldos saldoDisponivelParcelado(Double saldoDisponivelParcelado) {
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
  public Saldos saldoDisponivelParcelas(Double saldoDisponivelParcelas) {
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
  public Saldos saldoDisponivelSaque(Double saldoDisponivelSaque) {
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
  public Saldos saldoDisponivelSaqueInternacional(Double saldoDisponivelSaqueInternacional) {
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
  public Saldos saldoPontosFidelidade(Double saldoPontosFidelidade) {
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
    Saldos saldos = (Saldos) o;
    return Objects.equals(this.id, saldos.id) &&
        Objects.equals(this.saldoDisponivelCompra, saldos.saldoDisponivelCompra) &&
        Objects.equals(this.saldoDisponivelCompraInternacional, saldos.saldoDisponivelCompraInternacional) &&
        Objects.equals(this.saldoDisponivelExterno, saldos.saldoDisponivelExterno) &&
        Objects.equals(this.saldoDisponivelExtra, saldos.saldoDisponivelExtra) &&
        Objects.equals(this.saldoDisponivelGlobal, saldos.saldoDisponivelGlobal) &&
        Objects.equals(this.saldoDisponivelMensal, saldos.saldoDisponivelMensal) &&
        Objects.equals(this.saldoDisponivelParcelado, saldos.saldoDisponivelParcelado) &&
        Objects.equals(this.saldoDisponivelParcelas, saldos.saldoDisponivelParcelas) &&
        Objects.equals(this.saldoDisponivelSaque, saldos.saldoDisponivelSaque) &&
        Objects.equals(this.saldoDisponivelSaqueInternacional, saldos.saldoDisponivelSaqueInternacional) &&
        Objects.equals(this.saldoPontosFidelidade, saldos.saldoPontosFidelidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, saldoDisponivelCompra, saldoDisponivelCompraInternacional, saldoDisponivelExterno, saldoDisponivelExtra, saldoDisponivelGlobal, saldoDisponivelMensal, saldoDisponivelParcelado, saldoDisponivelParcelas, saldoDisponivelSaque, saldoDisponivelSaqueInternacional, saldoPontosFidelidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Saldos {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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



