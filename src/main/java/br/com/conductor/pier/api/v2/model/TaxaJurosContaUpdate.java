package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto Taxa de Juros Conta para Atualiza\u00E7\u00E3o
 **/

@ApiModel(description = "Objeto Taxa de Juros Conta para Atualiza\u00E7\u00E3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TaxaJurosContaUpdate   {
  
  private Integer numeroMesesCarencia = null;
  private BigDecimal taxaJuros = null;

  
  /**
   * N\u00FAmero de meses de car\u00EAncia
   **/
  public TaxaJurosContaUpdate numeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero de meses de car\u00EAncia")
  @JsonProperty("numeroMesesCarencia")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * Valor da taxa de juros
   **/
  public TaxaJurosContaUpdate taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor da taxa de juros")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxaJurosContaUpdate taxaJurosContaUpdate = (TaxaJurosContaUpdate) o;
    return Objects.equals(this.numeroMesesCarencia, taxaJurosContaUpdate.numeroMesesCarencia) &&
        Objects.equals(this.taxaJuros, taxaJurosContaUpdate.taxaJuros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroMesesCarencia, taxaJuros);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxaJurosContaUpdate {\n");
    
    sb.append("    numeroMesesCarencia: ").append(toIndentedString(numeroMesesCarencia)).append("\n");
    sb.append("    taxaJuros: ").append(toIndentedString(taxaJuros)).append("\n");
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

