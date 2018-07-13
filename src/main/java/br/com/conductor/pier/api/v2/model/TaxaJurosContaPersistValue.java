package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{taxa_juros_conta_persist_value}}}
 **/

@ApiModel(description = "{{{taxa_juros_conta_persist_value}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TaxaJurosContaPersistValue   {
  
  private Integer numeroMesesCarencia = null;
  private BigDecimal taxaJuros = null;

  
  /**
   * {{{taxa_juros_conta_update_numero_meses_carencia_value}}}
   **/
  public TaxaJurosContaPersistValue numeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{taxa_juros_conta_update_numero_meses_carencia_value}}}")
  @JsonProperty("numeroMesesCarencia")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * {{{taxa_juros_conta_update_taxa_juros_value}}}
   **/
  public TaxaJurosContaPersistValue taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{taxa_juros_conta_update_taxa_juros_value}}}")
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
    TaxaJurosContaPersistValue taxaJurosContaPersistValue = (TaxaJurosContaPersistValue) o;
    return Objects.equals(this.numeroMesesCarencia, taxaJurosContaPersistValue.numeroMesesCarencia) &&
        Objects.equals(this.taxaJuros, taxaJurosContaPersistValue.taxaJuros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroMesesCarencia, taxaJuros);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxaJurosContaPersistValue {\n");
    
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



