package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{tipo_operacao_persist_description}}}
 **/

@ApiModel(description = "{{{tipo_operacao_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoOperacaoParcialUpdate   {
  
  private Boolean flagManterTaxaJurosNoRotativo = null;

  
  /**
   * {{{tipo_operacao_persist_flag_manter_taxa_juros_no_rotativo_value}}}
   **/
  public TipoOperacaoParcialUpdate flagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{tipo_operacao_persist_flag_manter_taxa_juros_no_rotativo_value}}}")
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

