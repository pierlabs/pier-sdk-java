package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.FaturaResponse;
import br.com.conductor.pier.api.v2.model.TransacoesCorrentes;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * Objeto contendo os detalhes de uma fatura
 **/

@ApiModel(description = "Objeto contendo os detalhes de uma fatura")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DetalhesFaturaResponse   {
  
  private FaturaResponse fatura = null;
  private List<TransacoesCorrentes> transacoes = new ArrayList<TransacoesCorrentes>();

  
  /**
   * Apresenta os detalhes da fatura
   **/
  public DetalhesFaturaResponse fatura(FaturaResponse fatura) {
    this.fatura = fatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta os detalhes da fatura")
  @JsonProperty("fatura")
  public FaturaResponse getFatura() {
    return fatura;
  }
  public void setFatura(FaturaResponse fatura) {
    this.fatura = fatura;
  }

  
  /**
   * Apresenta as transa\u00C3\u00A7\u00C3\u00B5es relacionadas a fatura.
   **/
  public DetalhesFaturaResponse transacoes(List<TransacoesCorrentes> transacoes) {
    this.transacoes = transacoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta as transa\u00C3\u00A7\u00C3\u00B5es relacionadas a fatura.")
  @JsonProperty("transacoes")
  public List<TransacoesCorrentes> getTransacoes() {
    return transacoes;
  }
  public void setTransacoes(List<TransacoesCorrentes> transacoes) {
    this.transacoes = transacoes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalhesFaturaResponse detalhesFaturaResponse = (DetalhesFaturaResponse) o;
    return Objects.equals(this.fatura, detalhesFaturaResponse.fatura) &&
        Objects.equals(this.transacoes, detalhesFaturaResponse.transacoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fatura, transacoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalhesFaturaResponse {\n");
    
    sb.append("    fatura: ").append(toIndentedString(fatura)).append("\n");
    sb.append("    transacoes: ").append(toIndentedString(transacoes)).append("\n");
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



