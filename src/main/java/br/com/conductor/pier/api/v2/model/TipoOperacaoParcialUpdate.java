package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto tipo opera\u00E7\u00E3o com campos pass\u00EDveis de altera\u00E7\u00E3o
 **/

@ApiModel(description = "Objeto tipo opera\u00E7\u00E3o com campos pass\u00EDveis de altera\u00E7\u00E3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoOperacaoParcialUpdate   {
  
  private Boolean flagManterTaxaJurosNoRotativo = null;

  
  /**
   * Flag que indica que a opera\u00E7\u00E3o deve utilizar a taxa da compra como taxa do rotativo para transa\u00E7\u00F5es desse tipo opera\u00E7\u00E3o
   **/
  public TipoOperacaoParcialUpdate flagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica que a opera\u00E7\u00E3o deve utilizar a taxa da compra como taxa do rotativo para transa\u00E7\u00F5es desse tipo opera\u00E7\u00E3o")
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

