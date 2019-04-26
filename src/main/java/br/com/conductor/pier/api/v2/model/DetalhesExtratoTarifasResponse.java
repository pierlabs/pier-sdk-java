package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto response dos detalhes do extrato de tarifas
 **/

@ApiModel(description = "Objeto response dos detalhes do extrato de tarifas")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DetalhesExtratoTarifasResponse   {
  
  private String dataVencimentoPadrao = null;
  private BigDecimal iof = null;
  private BigDecimal juros = null;
  private BigDecimal tarifas = null;
  private BigDecimal multas = null;
  private BigDecimal mora = null;
  private BigDecimal total = null;

  
  /**
   * Data de vencimento padr\u00E3o da fatura
   **/
  public DetalhesExtratoTarifasResponse dataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento padr\u00E3o da fatura")
  @JsonProperty("dataVencimentoPadrao")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * Valor do IOF pago na fatura
   **/
  public DetalhesExtratoTarifasResponse iof(BigDecimal iof) {
    this.iof = iof;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do IOF pago na fatura")
  @JsonProperty("iof")
  public BigDecimal getIof() {
    return iof;
  }
  public void setIof(BigDecimal iof) {
    this.iof = iof;
  }

  
  /**
   * Valor de juros pago na fatura
   **/
  public DetalhesExtratoTarifasResponse juros(BigDecimal juros) {
    this.juros = juros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor de juros pago na fatura")
  @JsonProperty("juros")
  public BigDecimal getJuros() {
    return juros;
  }
  public void setJuros(BigDecimal juros) {
    this.juros = juros;
  }

  
  /**
   * Valor de tarifas pago na fatura
   **/
  public DetalhesExtratoTarifasResponse tarifas(BigDecimal tarifas) {
    this.tarifas = tarifas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor de tarifas pago na fatura")
  @JsonProperty("tarifas")
  public BigDecimal getTarifas() {
    return tarifas;
  }
  public void setTarifas(BigDecimal tarifas) {
    this.tarifas = tarifas;
  }

  
  /**
   * Valor de multas pago na fatura
   **/
  public DetalhesExtratoTarifasResponse multas(BigDecimal multas) {
    this.multas = multas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor de multas pago na fatura")
  @JsonProperty("multas")
  public BigDecimal getMultas() {
    return multas;
  }
  public void setMultas(BigDecimal multas) {
    this.multas = multas;
  }

  
  /**
   * Valor de mora pago na fatura
   **/
  public DetalhesExtratoTarifasResponse mora(BigDecimal mora) {
    this.mora = mora;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor de mora pago na fatura")
  @JsonProperty("mora")
  public BigDecimal getMora() {
    return mora;
  }
  public void setMora(BigDecimal mora) {
    this.mora = mora;
  }

  
  /**
   * Valor total de taxas pagas na fatura
   **/
  public DetalhesExtratoTarifasResponse total(BigDecimal total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total de taxas pagas na fatura")
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }
  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalhesExtratoTarifasResponse detalhesExtratoTarifasResponse = (DetalhesExtratoTarifasResponse) o;
    return Objects.equals(this.dataVencimentoPadrao, detalhesExtratoTarifasResponse.dataVencimentoPadrao) &&
        Objects.equals(this.iof, detalhesExtratoTarifasResponse.iof) &&
        Objects.equals(this.juros, detalhesExtratoTarifasResponse.juros) &&
        Objects.equals(this.tarifas, detalhesExtratoTarifasResponse.tarifas) &&
        Objects.equals(this.multas, detalhesExtratoTarifasResponse.multas) &&
        Objects.equals(this.mora, detalhesExtratoTarifasResponse.mora) &&
        Objects.equals(this.total, detalhesExtratoTarifasResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataVencimentoPadrao, iof, juros, tarifas, multas, mora, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalhesExtratoTarifasResponse {\n");
    
    sb.append("    dataVencimentoPadrao: ").append(toIndentedString(dataVencimentoPadrao)).append("\n");
    sb.append("    iof: ").append(toIndentedString(iof)).append("\n");
    sb.append("    juros: ").append(toIndentedString(juros)).append("\n");
    sb.append("    tarifas: ").append(toIndentedString(tarifas)).append("\n");
    sb.append("    multas: ").append(toIndentedString(multas)).append("\n");
    sb.append("    mora: ").append(toIndentedString(mora)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

