package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Lista Cota\u00E7\u00F5es Dolar
 **/

@ApiModel(description = "Lista Cota\u00E7\u00F5es Dolar")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CotacaoDolarResponse   {
  
  private String dataFechamento = null;
  private BigDecimal taxaPtax = null;
  private BigDecimal taxaSpread = null;
  private BigDecimal taxaCartao = null;

  
  /**
   * Data de fechamento
   **/
  public CotacaoDolarResponse dataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de fechamento")
  @JsonProperty("dataFechamento")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * Taxa PTAX
   **/
  public CotacaoDolarResponse taxaPtax(BigDecimal taxaPtax) {
    this.taxaPtax = taxaPtax;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa PTAX")
  @JsonProperty("taxaPtax")
  public BigDecimal getTaxaPtax() {
    return taxaPtax;
  }
  public void setTaxaPtax(BigDecimal taxaPtax) {
    this.taxaPtax = taxaPtax;
  }

  
  /**
   * Taxa de Spreead
   **/
  public CotacaoDolarResponse taxaSpread(BigDecimal taxaSpread) {
    this.taxaSpread = taxaSpread;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa de Spreead")
  @JsonProperty("taxaSpread")
  public BigDecimal getTaxaSpread() {
    return taxaSpread;
  }
  public void setTaxaSpread(BigDecimal taxaSpread) {
    this.taxaSpread = taxaSpread;
  }

  
  /**
   * Taxa de convers\u00E3o de Dollar para Real
   **/
  public CotacaoDolarResponse taxaCartao(BigDecimal taxaCartao) {
    this.taxaCartao = taxaCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa de convers\u00E3o de Dollar para Real")
  @JsonProperty("taxaCartao")
  public BigDecimal getTaxaCartao() {
    return taxaCartao;
  }
  public void setTaxaCartao(BigDecimal taxaCartao) {
    this.taxaCartao = taxaCartao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CotacaoDolarResponse cotacaoDolarResponse = (CotacaoDolarResponse) o;
    return Objects.equals(this.dataFechamento, cotacaoDolarResponse.dataFechamento) &&
        Objects.equals(this.taxaPtax, cotacaoDolarResponse.taxaPtax) &&
        Objects.equals(this.taxaSpread, cotacaoDolarResponse.taxaSpread) &&
        Objects.equals(this.taxaCartao, cotacaoDolarResponse.taxaCartao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataFechamento, taxaPtax, taxaSpread, taxaCartao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CotacaoDolarResponse {\n");
    
    sb.append("    dataFechamento: ").append(toIndentedString(dataFechamento)).append("\n");
    sb.append("    taxaPtax: ").append(toIndentedString(taxaPtax)).append("\n");
    sb.append("    taxaSpread: ").append(toIndentedString(taxaSpread)).append("\n");
    sb.append("    taxaCartao: ").append(toIndentedString(taxaCartao)).append("\n");
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

