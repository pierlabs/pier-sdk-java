package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.FaturaFechadaResponse;
import br.com.conductor.pier.api.v2.model.TransacoesCorrentesResponse;
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
  
  private FaturaFechadaResponse fatura = null;
  private List<TransacoesCorrentesResponse> transacoes = new ArrayList<TransacoesCorrentesResponse>();

  
  /**
   * Apresenta os detalhes da fatura
   **/
  public DetalhesFaturaResponse fatura(FaturaFechadaResponse fatura) {
    this.fatura = fatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta os detalhes da fatura")
  @JsonProperty("fatura")
  public FaturaFechadaResponse getFatura() {
    return fatura;
  }
  public void setFatura(FaturaFechadaResponse fatura) {
    this.fatura = fatura;
  }

  
  /**
   * Apresenta as transa\u00E7\u00F5es relacionadas a fatura.
   **/
  public DetalhesFaturaResponse transacoes(List<TransacoesCorrentesResponse> transacoes) {
    this.transacoes = transacoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta as transa\u00E7\u00F5es relacionadas a fatura.")
  @JsonProperty("transacoes")
  public List<TransacoesCorrentesResponse> getTransacoes() {
    return transacoes;
  }
  public void setTransacoes(List<TransacoesCorrentesResponse> transacoes) {
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

