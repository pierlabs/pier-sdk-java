package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaDetalhesResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Antecipacao Simulada
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Antecipacao Simulada")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AntecipacaoSimuladaResponse   {
  
  private Long idSimulacao = null;
  private Long idCompra = null;
  private Long idConta = null;
  private String dataHoraSimulacao = null;
  private List<AntecipacaoSimuladaDetalhesResponse> detalhes = new ArrayList<AntecipacaoSimuladaDetalhesResponse>();

  
  /**
   * C\u00C3\u00B3digo identificador da simula\u00C3\u00A7\u00C3\u00A3o de antecipa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public AntecipacaoSimuladaResponse idSimulacao(Long idSimulacao) {
    this.idSimulacao = idSimulacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da simula\u00C3\u00A7\u00C3\u00A3o de antecipa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("idSimulacao")
  public Long getIdSimulacao() {
    return idSimulacao;
  }
  public void setIdSimulacao(Long idSimulacao) {
    this.idSimulacao = idSimulacao;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da compra.
   **/
  public AntecipacaoSimuladaResponse idCompra(Long idCompra) {
    this.idCompra = idCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da compra.")
  @JsonProperty("idCompra")
  public Long getIdCompra() {
    return idCompra;
  }
  public void setIdCompra(Long idCompra) {
    this.idCompra = idCompra;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da conta.
   **/
  public AntecipacaoSimuladaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da conta.")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Data e hora em que a simula\u00C3\u00A7\u00C3\u00A3o foi feita.
   **/
  public AntecipacaoSimuladaResponse dataHoraSimulacao(String dataHoraSimulacao) {
    this.dataHoraSimulacao = dataHoraSimulacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e hora em que a simula\u00C3\u00A7\u00C3\u00A3o foi feita.")
  @JsonProperty("dataHoraSimulacao")
  public String getDataHoraSimulacao() {
    return dataHoraSimulacao;
  }
  public void setDataHoraSimulacao(String dataHoraSimulacao) {
    this.dataHoraSimulacao = dataHoraSimulacao;
  }

  
  /**
   * Detalhes da simula\u00C3\u00A7\u00C3\u00A3o.
   **/
  public AntecipacaoSimuladaResponse detalhes(List<AntecipacaoSimuladaDetalhesResponse> detalhes) {
    this.detalhes = detalhes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detalhes da simula\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("detalhes")
  public List<AntecipacaoSimuladaDetalhesResponse> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<AntecipacaoSimuladaDetalhesResponse> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntecipacaoSimuladaResponse antecipacaoSimuladaResponse = (AntecipacaoSimuladaResponse) o;
    return Objects.equals(this.idSimulacao, antecipacaoSimuladaResponse.idSimulacao) &&
        Objects.equals(this.idCompra, antecipacaoSimuladaResponse.idCompra) &&
        Objects.equals(this.idConta, antecipacaoSimuladaResponse.idConta) &&
        Objects.equals(this.dataHoraSimulacao, antecipacaoSimuladaResponse.dataHoraSimulacao) &&
        Objects.equals(this.detalhes, antecipacaoSimuladaResponse.detalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idSimulacao, idCompra, idConta, dataHoraSimulacao, detalhes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntecipacaoSimuladaResponse {\n");
    
    sb.append("    idSimulacao: ").append(toIndentedString(idSimulacao)).append("\n");
    sb.append("    idCompra: ").append(toIndentedString(idCompra)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    dataHoraSimulacao: ").append(toIndentedString(dataHoraSimulacao)).append("\n");
    sb.append("    detalhes: ").append(toIndentedString(detalhes)).append("\n");
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



