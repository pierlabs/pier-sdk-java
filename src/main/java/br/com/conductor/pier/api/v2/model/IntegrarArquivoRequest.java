package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de requisi\u00E7\u00E3o da integra\u00E7\u00E3o de Arquivos.
 **/

@ApiModel(description = "Objeto de requisi\u00E7\u00E3o da integra\u00E7\u00E3o de Arquivos.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class IntegrarArquivoRequest   {
  
  private String numeroReceitaFederal = null;

  
  /**
   * N\u00FAmero Receita Federal (CPF) vinculado a um ou mais arquivos que ser\u00E3o enviados para realizar integra\u00E7\u00E3o
   **/
  public IntegrarArquivoRequest numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero Receita Federal (CPF) vinculado a um ou mais arquivos que ser\u00E3o enviados para realizar integra\u00E7\u00E3o")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrarArquivoRequest integrarArquivoRequest = (IntegrarArquivoRequest) o;
    return Objects.equals(this.numeroReceitaFederal, integrarArquivoRequest.numeroReceitaFederal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroReceitaFederal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrarArquivoRequest {\n");
    
    sb.append("    numeroReceitaFederal: ").append(toIndentedString(numeroReceitaFederal)).append("\n");
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

