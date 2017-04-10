package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;





/**
 * Fatura
 **/

@ApiModel(description = "Fatura")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class FaturaResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Long idProduto = null;
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
   * C\u00C3\u00B3digo identificador da fatura.
   **/
  public FaturaResponse id(Long id) {
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
   * C\u00C3\u00B3digo identificador da conta.
   **/
  public FaturaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da conta.")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do produto.
   **/
  public FaturaResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do produto.")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Data de vencimento da fatura.
   **/
  public FaturaResponse dataVencimento(Date dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento da fatura.")
  @JsonProperty("dataVencimento")
  public Date getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(Date dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Saldo da fatura anterior.
   **/
  public FaturaResponse saldoFaturaAnterior(BigDecimal saldoFaturaAnterior) {
    this.saldoFaturaAnterior = saldoFaturaAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo da fatura anterior.")
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
  public FaturaResponse saldoMulta(BigDecimal saldoMulta) {
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
   * Saldo total das compras lan\u00C3\u00A7adas na fatura atual.
   **/
  public FaturaResponse saldoCompras(BigDecimal saldoCompras) {
    this.saldoCompras = saldoCompras;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo total das compras lan\u00C3\u00A7adas na fatura atual.")
  @JsonProperty("saldoCompras")
  public BigDecimal getSaldoCompras() {
    return saldoCompras;
  }
  public void setSaldoCompras(BigDecimal saldoCompras) {
    this.saldoCompras = saldoCompras;
  }

  
  /**
   * Saldo total dos pagamentos lan\u00C3\u00A7ados na fatura atual.
   **/
  public FaturaResponse saldoPagamentos(BigDecimal saldoPagamentos) {
    this.saldoPagamentos = saldoPagamentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo total dos pagamentos lan\u00C3\u00A7ados na fatura atual.")
  @JsonProperty("saldoPagamentos")
  public BigDecimal getSaldoPagamentos() {
    return saldoPagamentos;
  }
  public void setSaldoPagamentos(BigDecimal saldoPagamentos) {
    this.saldoPagamentos = saldoPagamentos;
  }

  
  /**
   * Saldo total das tarifas lan\u00C3\u00A7adas na fatura atual.
   **/
  public FaturaResponse saldoTarifas(BigDecimal saldoTarifas) {
    this.saldoTarifas = saldoTarifas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo total das tarifas lan\u00C3\u00A7adas na fatura atual.")
  @JsonProperty("saldoTarifas")
  public BigDecimal getSaldoTarifas() {
    return saldoTarifas;
  }
  public void setSaldoTarifas(BigDecimal saldoTarifas) {
    this.saldoTarifas = saldoTarifas;
  }

  
  /**
   * Saldo total dos d\u00C3\u00A9bitos lan\u00C3\u00A7ados na fatura atual.
   **/
  public FaturaResponse saldoDebitos(BigDecimal saldoDebitos) {
    this.saldoDebitos = saldoDebitos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo total dos d\u00C3\u00A9bitos lan\u00C3\u00A7ados na fatura atual.")
  @JsonProperty("saldoDebitos")
  public BigDecimal getSaldoDebitos() {
    return saldoDebitos;
  }
  public void setSaldoDebitos(BigDecimal saldoDebitos) {
    this.saldoDebitos = saldoDebitos;
  }

  
  /**
   * Saldo total dos cr\u00C3\u00A9dito lan\u00C3\u00A7ados na fatura atual.
   **/
  public FaturaResponse saldoCreditos(BigDecimal saldoCreditos) {
    this.saldoCreditos = saldoCreditos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo total dos cr\u00C3\u00A9dito lan\u00C3\u00A7ados na fatura atual.")
  @JsonProperty("saldoCreditos")
  public BigDecimal getSaldoCreditos() {
    return saldoCreditos;
  }
  public void setSaldoCreditos(BigDecimal saldoCreditos) {
    this.saldoCreditos = saldoCreditos;
  }

  
  /**
   * Salto total devedor da fatura atual.
   **/
  public FaturaResponse saldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Salto total devedor da fatura atual.")
  @JsonProperty("saldoAtualFinal")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * Valor m\u00C3\u00ADnimo para pagamento da fatura.
   **/
  public FaturaResponse valorMinimoFatura(BigDecimal valorMinimoFatura) {
    this.valorMinimoFatura = valorMinimoFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00C3\u00ADnimo para pagamento da fatura.")
  @JsonProperty("valorMinimoFatura")
  public BigDecimal getValorMinimoFatura() {
    return valorMinimoFatura;
  }
  public void setValorMinimoFatura(BigDecimal valorMinimoFatura) {
    this.valorMinimoFatura = valorMinimoFatura;
  }

  
  /**
   * Quando ativa, indica que fora emitida uma fatura.
   **/
  public FaturaResponse flagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando ativa, indica que fora emitida uma fatura.")
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
    FaturaResponse faturaResponse = (FaturaResponse) o;
    return Objects.equals(this.id, faturaResponse.id) &&
        Objects.equals(this.idConta, faturaResponse.idConta) &&
        Objects.equals(this.idProduto, faturaResponse.idProduto) &&
        Objects.equals(this.dataVencimento, faturaResponse.dataVencimento) &&
        Objects.equals(this.saldoFaturaAnterior, faturaResponse.saldoFaturaAnterior) &&
        Objects.equals(this.saldoMulta, faturaResponse.saldoMulta) &&
        Objects.equals(this.saldoCompras, faturaResponse.saldoCompras) &&
        Objects.equals(this.saldoPagamentos, faturaResponse.saldoPagamentos) &&
        Objects.equals(this.saldoTarifas, faturaResponse.saldoTarifas) &&
        Objects.equals(this.saldoDebitos, faturaResponse.saldoDebitos) &&
        Objects.equals(this.saldoCreditos, faturaResponse.saldoCreditos) &&
        Objects.equals(this.saldoAtualFinal, faturaResponse.saldoAtualFinal) &&
        Objects.equals(this.valorMinimoFatura, faturaResponse.valorMinimoFatura) &&
        Objects.equals(this.flagEmiteFatura, faturaResponse.flagEmiteFatura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, idProduto, dataVencimento, saldoFaturaAnterior, saldoMulta, saldoCompras, saldoPagamentos, saldoTarifas, saldoDebitos, saldoCreditos, saldoAtualFinal, valorMinimoFatura, flagEmiteFatura);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
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



