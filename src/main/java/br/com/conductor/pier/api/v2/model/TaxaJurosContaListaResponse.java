package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{taxa_juros_conta_lista_response_description}}}
 **/

@ApiModel(description = "{{{taxa_juros_conta_lista_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TaxaJurosContaListaResponse   {
  
  private Integer plano = null;
  private BigDecimal taxa = null;

  
  /**
   * {{{taxa_juros_conta_lista_response_plano_value}}}
   **/
  public TaxaJurosContaListaResponse plano(Integer plano) {
    this.plano = plano;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxa_juros_conta_lista_response_plano_value}}}")
  @JsonProperty("plano")
  public Integer getPlano() {
    return plano;
  }
  public void setPlano(Integer plano) {
    this.plano = plano;
  }

  
  /**
   * {{{taxa_juros_conta_lista_response_taxa_value}}}
   **/
  public TaxaJurosContaListaResponse taxa(BigDecimal taxa) {
    this.taxa = taxa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{taxa_juros_conta_lista_response_taxa_value}}}")
  @JsonProperty("taxa")
  public BigDecimal getTaxa() {
    return taxa;
  }
  public void setTaxa(BigDecimal taxa) {
    this.taxa = taxa;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxaJurosContaListaResponse taxaJurosContaListaResponse = (TaxaJurosContaListaResponse) o;
    return Objects.equals(this.plano, taxaJurosContaListaResponse.plano) &&
        Objects.equals(this.taxa, taxaJurosContaListaResponse.taxa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plano, taxa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxaJurosContaListaResponse {\n");
    
    sb.append("    plano: ").append(toIndentedString(plano)).append("\n");
    sb.append("    taxa: ").append(toIndentedString(taxa)).append("\n");
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

