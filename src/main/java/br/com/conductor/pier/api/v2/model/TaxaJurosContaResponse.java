package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.TaxaJurosContaListaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Representation of the interest rate response
 **/

@ApiModel(description = "Representation of the interest rate response")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TaxaJurosContaResponse   {
  
  private Long idConta = null;
  private Long idTabelaJuros = null;
  private List<TaxaJurosContaListaResponse> taxasJuros = new ArrayList<TaxaJurosContaListaResponse>();

  
  /**
   * id_conta
   **/
  public TaxaJurosContaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "id_conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Interest rate identification code
   **/
  public TaxaJurosContaResponse idTabelaJuros(Long idTabelaJuros) {
    this.idTabelaJuros = idTabelaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Interest rate identification code")
  @JsonProperty("idTabelaJuros")
  public Long getIdTabelaJuros() {
    return idTabelaJuros;
  }
  public void setIdTabelaJuros(Long idTabelaJuros) {
    this.idTabelaJuros = idTabelaJuros;
  }

  
  /**
   * Listing of interest rates
   **/
  public TaxaJurosContaResponse taxasJuros(List<TaxaJurosContaListaResponse> taxasJuros) {
    this.taxasJuros = taxasJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Listing of interest rates")
  @JsonProperty("taxasJuros")
  public List<TaxaJurosContaListaResponse> getTaxasJuros() {
    return taxasJuros;
  }
  public void setTaxasJuros(List<TaxaJurosContaListaResponse> taxasJuros) {
    this.taxasJuros = taxasJuros;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxaJurosContaResponse taxaJurosContaResponse = (TaxaJurosContaResponse) o;
    return Objects.equals(this.idConta, taxaJurosContaResponse.idConta) &&
        Objects.equals(this.idTabelaJuros, taxaJurosContaResponse.idTabelaJuros) &&
        Objects.equals(this.taxasJuros, taxaJurosContaResponse.taxasJuros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idTabelaJuros, taxasJuros);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxaJurosContaResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idTabelaJuros: ").append(toIndentedString(idTabelaJuros)).append("\n");
    sb.append("    taxasJuros: ").append(toIndentedString(taxasJuros)).append("\n");
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

