package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.FaturaConsignadaResponse;
import br.com.conductor.pier.api.v2.model.TransacoesCorrentesResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Objeto contendo os detalhes de uma fatura consignada
 **/

@ApiModel(description = "Objeto contendo os detalhes de uma fatura consignada")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DetalhesFaturaConsignadaResponse   {
  
  private FaturaConsignadaResponse faturaConsignadaResponse = null;
  private List<TransacoesCorrentesResponse> transacoes = new ArrayList<TransacoesCorrentesResponse>();

  
  /**
   * Apresenta os detalhes da fatura
   **/
  public DetalhesFaturaConsignadaResponse faturaConsignadaResponse(FaturaConsignadaResponse faturaConsignadaResponse) {
    this.faturaConsignadaResponse = faturaConsignadaResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta os detalhes da fatura")
  @JsonProperty("faturaConsignadaResponse")
  public FaturaConsignadaResponse getFaturaConsignadaResponse() {
    return faturaConsignadaResponse;
  }
  public void setFaturaConsignadaResponse(FaturaConsignadaResponse faturaConsignadaResponse) {
    this.faturaConsignadaResponse = faturaConsignadaResponse;
  }

  
  /**
   * Apresenta as transa\u00C3\u00A7\u00C3\u00B5es relacionadas a fatura.
   **/
  public DetalhesFaturaConsignadaResponse transacoes(List<TransacoesCorrentesResponse> transacoes) {
    this.transacoes = transacoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta as transa\u00C3\u00A7\u00C3\u00B5es relacionadas a fatura.")
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
    DetalhesFaturaConsignadaResponse detalhesFaturaConsignadaResponse = (DetalhesFaturaConsignadaResponse) o;
    return Objects.equals(this.faturaConsignadaResponse, detalhesFaturaConsignadaResponse.faturaConsignadaResponse) &&
        Objects.equals(this.transacoes, detalhesFaturaConsignadaResponse.transacoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faturaConsignadaResponse, transacoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalhesFaturaConsignadaResponse {\n");
    
    sb.append("    faturaConsignadaResponse: ").append(toIndentedString(faturaConsignadaResponse)).append("\n");
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

