package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Operation type object, containing only properties that can be changed
 **/

@ApiModel(description = "Operation type object, containing only properties that can be changed")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoOperacaoParcialUpdate   {
  
  private Boolean flagManterTaxaJurosNoRotativo = null;

  
  /**
   * Boolean that signals to all transactions of this operation type must use the purchase interest rate as the due balance interest rate
   **/
  public TipoOperacaoParcialUpdate flagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Boolean that signals to all transactions of this operation type must use the purchase interest rate as the due balance interest rate")
  @JsonProperty("flagManterTaxaJurosNoRotativo")
  public Boolean getFlagManterTaxaJurosNoRotativo() {
    return flagManterTaxaJurosNoRotativo;
  }
  public void setFlagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoOperacaoParcialUpdate tipoOperacaoParcialUpdate = (TipoOperacaoParcialUpdate) o;
    return Objects.equals(this.flagManterTaxaJurosNoRotativo, tipoOperacaoParcialUpdate.flagManterTaxaJurosNoRotativo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagManterTaxaJurosNoRotativo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOperacaoParcialUpdate {\n");
    
    sb.append("    flagManterTaxaJurosNoRotativo: ").append(toIndentedString(flagManterTaxaJurosNoRotativo)).append("\n");
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

