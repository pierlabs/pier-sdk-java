package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;





/**
 * Objeto Fatura
 **/

@ApiModel(description = "Objeto Fatura")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class Fatura   {
  
  private Date dataVencimento = null;
  private BigDecimal saldoFaturaAnterior = null;
  private BigDecimal saldoMulta = null;
  private BigDecimal saldoCompras = null;
  private BigDecimal saldoPagamentos = null;
  private BigDecimal saldoTarifas = null;
  private BigDecimal saldoDebitos = null;
  private BigDecimal saldoCreditos = null;
  private BigDecimal saldoAtualFinal = null;
  private BigDecimal valorMinimoFatura = null;
  private Integer flagEmiteFatura = null;

  
  /**
   * Data de Vencimento da Fatura.
   **/
  public Fatura dataVencimento(Date dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Vencimento da Fatura.")
  @JsonProperty("dataVencimento")
  public Date getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(Date dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Saldo da Fatura Anterior.
   **/
  public Fatura saldoFaturaAnterior(BigDecimal saldoFaturaAnterior) {
    this.saldoFaturaAnterior = saldoFaturaAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo da Fatura Anterior.")
  @JsonProperty("saldoFaturaAnterior")
  public BigDecimal getSaldoFaturaAnterior() {
    return saldoFaturaAnterior;
  }
  public void setSaldoFaturaAnterior(BigDecimal saldoFaturaAnterior) {
    this.saldoFaturaAnterior = saldoFaturaAnterior;
  }

  
  /**
   * Saldo total da Multa lan\u00C3\u00A7ada na Fatura atual.
   **/
  public Fatura saldoMulta(BigDecimal saldoMulta) {
    this.saldoMulta = saldoMulta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo total da Multa lan\u00C3\u00A7ada na Fatura atual.")
  @JsonProperty("saldoMulta")
  public BigDecimal getSaldoMulta() {
    return saldoMulta;
  }
  public void setSaldoMulta(BigDecimal saldoMulta) {
    this.saldoMulta = saldoMulta;
  }

  
  /**
   * Saldo total das Compras lan\u00C3\u00A7adas na Fatura atual.
   **/
  public Fatura saldoCompras(BigDecimal saldoCompras) {
    this.saldoCompras = saldoCompras;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo total das Compras lan\u00C3\u00A7adas na Fatura atual.")
  @JsonProperty("saldoCompras")
  public BigDecimal getSaldoCompras() {
    return saldoCompras;
  }
  public void setSaldoCompras(BigDecimal saldoCompras) {
    this.saldoCompras = saldoCompras;
  }

  
  /**
   * Saldo total dos Pagamentos lan\u00C3\u00A7ados na Fatura atual.
   **/
  public Fatura saldoPagamentos(BigDecimal saldoPagamentos) {
    this.saldoPagamentos = saldoPagamentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo total dos Pagamentos lan\u00C3\u00A7ados na Fatura atual.")
  @JsonProperty("saldoPagamentos")
  public BigDecimal getSaldoPagamentos() {
    return saldoPagamentos;
  }
  public void setSaldoPagamentos(BigDecimal saldoPagamentos) {
    this.saldoPagamentos = saldoPagamentos;
  }

  
  /**
   * Saldo total das Tarifas lan\u00C3\u00A7adas na Fatura atual.
   **/
  public Fatura saldoTarifas(BigDecimal saldoTarifas) {
    this.saldoTarifas = saldoTarifas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo total das Tarifas lan\u00C3\u00A7adas na Fatura atual.")
  @JsonProperty("saldoTarifas")
  public BigDecimal getSaldoTarifas() {
    return saldoTarifas;
  }
  public void setSaldoTarifas(BigDecimal saldoTarifas) {
    this.saldoTarifas = saldoTarifas;
  }

  
  /**
   * Saldo total dos D\u00C3\u00A9bitos lan\u00C3\u00A7ados na Fatura atual.
   **/
  public Fatura saldoDebitos(BigDecimal saldoDebitos) {
    this.saldoDebitos = saldoDebitos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo total dos D\u00C3\u00A9bitos lan\u00C3\u00A7ados na Fatura atual.")
  @JsonProperty("saldoDebitos")
  public BigDecimal getSaldoDebitos() {
    return saldoDebitos;
  }
  public void setSaldoDebitos(BigDecimal saldoDebitos) {
    this.saldoDebitos = saldoDebitos;
  }

  
  /**
   * Saldo total dos Cr\u00C3\u00A9dito lan\u00C3\u00A7ados na Fatura atual.
   **/
  public Fatura saldoCreditos(BigDecimal saldoCreditos) {
    this.saldoCreditos = saldoCreditos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo total dos Cr\u00C3\u00A9dito lan\u00C3\u00A7ados na Fatura atual.")
  @JsonProperty("saldoCreditos")
  public BigDecimal getSaldoCreditos() {
    return saldoCreditos;
  }
  public void setSaldoCreditos(BigDecimal saldoCreditos) {
    this.saldoCreditos = saldoCreditos;
  }

  
  /**
   * Salto total devedor da Fatura atual.
   **/
  public Fatura saldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Salto total devedor da Fatura atual.")
  @JsonProperty("saldoAtualFinal")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * Valor m\u00C3\u00ADnimo para Pagamento da Fatura.
   **/
  public Fatura valorMinimoFatura(BigDecimal valorMinimoFatura) {
    this.valorMinimoFatura = valorMinimoFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00C3\u00ADnimo para Pagamento da Fatura.")
  @JsonProperty("valorMinimoFatura")
  public BigDecimal getValorMinimoFatura() {
    return valorMinimoFatura;
  }
  public void setValorMinimoFatura(BigDecimal valorMinimoFatura) {
    this.valorMinimoFatura = valorMinimoFatura;
  }

  
  /**
   * Quando ativa, indica que fora emitida uma Fatura.
   **/
  public Fatura flagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando ativa, indica que fora emitida uma Fatura.")
  @JsonProperty("flagEmiteFatura")
  public Integer getFlagEmiteFatura() {
    return flagEmiteFatura;
  }
  public void setFlagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fatura fatura = (Fatura) o;
    return Objects.equals(this.dataVencimento, fatura.dataVencimento) &&
        Objects.equals(this.saldoFaturaAnterior, fatura.saldoFaturaAnterior) &&
        Objects.equals(this.saldoMulta, fatura.saldoMulta) &&
        Objects.equals(this.saldoCompras, fatura.saldoCompras) &&
        Objects.equals(this.saldoPagamentos, fatura.saldoPagamentos) &&
        Objects.equals(this.saldoTarifas, fatura.saldoTarifas) &&
        Objects.equals(this.saldoDebitos, fatura.saldoDebitos) &&
        Objects.equals(this.saldoCreditos, fatura.saldoCreditos) &&
        Objects.equals(this.saldoAtualFinal, fatura.saldoAtualFinal) &&
        Objects.equals(this.valorMinimoFatura, fatura.valorMinimoFatura) &&
        Objects.equals(this.flagEmiteFatura, fatura.flagEmiteFatura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataVencimento, saldoFaturaAnterior, saldoMulta, saldoCompras, saldoPagamentos, saldoTarifas, saldoDebitos, saldoCreditos, saldoAtualFinal, valorMinimoFatura, flagEmiteFatura);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fatura {\n");
    
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    saldoFaturaAnterior: ").append(toIndentedString(saldoFaturaAnterior)).append("\n");
    sb.append("    saldoMulta: ").append(toIndentedString(saldoMulta)).append("\n");
    sb.append("    saldoCompras: ").append(toIndentedString(saldoCompras)).append("\n");
    sb.append("    saldoPagamentos: ").append(toIndentedString(saldoPagamentos)).append("\n");
    sb.append("    saldoTarifas: ").append(toIndentedString(saldoTarifas)).append("\n");
    sb.append("    saldoDebitos: ").append(toIndentedString(saldoDebitos)).append("\n");
    sb.append("    saldoCreditos: ").append(toIndentedString(saldoCreditos)).append("\n");
    sb.append("    saldoAtualFinal: ").append(toIndentedString(saldoAtualFinal)).append("\n");
    sb.append("    valorMinimoFatura: ").append(toIndentedString(valorMinimoFatura)).append("\n");
    sb.append("    flagEmiteFatura: ").append(toIndentedString(flagEmiteFatura)).append("\n");
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



