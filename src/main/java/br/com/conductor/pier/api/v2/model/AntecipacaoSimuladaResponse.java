package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaDetalhesResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Antecipacao Simulada
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Antecipacao Simulada")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AntecipacaoSimuladaResponse   {
  
  private Long idAntecipacaoSimulada = null;
  private Long idConta = null;
  private Long idEventoExterno = null;
  private Long idTipoTransacao = null;
  private Integer qtdeParcelasAntecipaveis = null;
  private BigDecimal valorParcela = null;
  private String dataHoraSimulacao = null;
  private BigDecimal taxaAntecipacaoAno = null;
  private List<AntecipacaoSimuladaDetalhesResponse> detalhes = new ArrayList<AntecipacaoSimuladaDetalhesResponse>();

  
  /**
   * C\u00C3\u00B3digo identificador da simula\u00C3\u00A7\u00C3\u00A3o de antecipa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public AntecipacaoSimuladaResponse idAntecipacaoSimulada(Long idAntecipacaoSimulada) {
    this.idAntecipacaoSimulada = idAntecipacaoSimulada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da simula\u00C3\u00A7\u00C3\u00A3o de antecipa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("idAntecipacaoSimulada")
  public Long getIdAntecipacaoSimulada() {
    return idAntecipacaoSimulada;
  }
  public void setIdAntecipacaoSimulada(Long idAntecipacaoSimulada) {
    this.idAntecipacaoSimulada = idAntecipacaoSimulada;
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
   * C\u00C3\u00B3digo identificador do evento.
   **/
  public AntecipacaoSimuladaResponse idEventoExterno(Long idEventoExterno) {
    this.idEventoExterno = idEventoExterno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do evento.")
  @JsonProperty("idEventoExterno")
  public Long getIdEventoExterno() {
    return idEventoExterno;
  }
  public void setIdEventoExterno(Long idEventoExterno) {
    this.idEventoExterno = idEventoExterno;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do tipo do evento.
   **/
  public AntecipacaoSimuladaResponse idTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do tipo do evento.")
  @JsonProperty("idTipoTransacao")
  public Long getIdTipoTransacao() {
    return idTipoTransacao;
  }
  public void setIdTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
  }

  
  /**
   * Quantidade de parcelas antecip\u00C3\u00A1veis.
   **/
  public AntecipacaoSimuladaResponse qtdeParcelasAntecipaveis(Integer qtdeParcelasAntecipaveis) {
    this.qtdeParcelasAntecipaveis = qtdeParcelasAntecipaveis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de parcelas antecip\u00C3\u00A1veis.")
  @JsonProperty("qtdeParcelasAntecipaveis")
  public Integer getQtdeParcelasAntecipaveis() {
    return qtdeParcelasAntecipaveis;
  }
  public void setQtdeParcelasAntecipaveis(Integer qtdeParcelasAntecipaveis) {
    this.qtdeParcelasAntecipaveis = qtdeParcelasAntecipaveis;
  }

  
  /**
   * Valor da parcela.
   **/
  public AntecipacaoSimuladaResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da parcela.")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
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
   * Taxa de antecipa\u00C3\u00A7\u00C3\u00A3o aplicada (ao ano).
   **/
  public AntecipacaoSimuladaResponse taxaAntecipacaoAno(BigDecimal taxaAntecipacaoAno) {
    this.taxaAntecipacaoAno = taxaAntecipacaoAno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa de antecipa\u00C3\u00A7\u00C3\u00A3o aplicada (ao ano).")
  @JsonProperty("taxaAntecipacaoAno")
  public BigDecimal getTaxaAntecipacaoAno() {
    return taxaAntecipacaoAno;
  }
  public void setTaxaAntecipacaoAno(BigDecimal taxaAntecipacaoAno) {
    this.taxaAntecipacaoAno = taxaAntecipacaoAno;
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
    return Objects.equals(this.idAntecipacaoSimulada, antecipacaoSimuladaResponse.idAntecipacaoSimulada) &&
        Objects.equals(this.idConta, antecipacaoSimuladaResponse.idConta) &&
        Objects.equals(this.idEventoExterno, antecipacaoSimuladaResponse.idEventoExterno) &&
        Objects.equals(this.idTipoTransacao, antecipacaoSimuladaResponse.idTipoTransacao) &&
        Objects.equals(this.qtdeParcelasAntecipaveis, antecipacaoSimuladaResponse.qtdeParcelasAntecipaveis) &&
        Objects.equals(this.valorParcela, antecipacaoSimuladaResponse.valorParcela) &&
        Objects.equals(this.dataHoraSimulacao, antecipacaoSimuladaResponse.dataHoraSimulacao) &&
        Objects.equals(this.taxaAntecipacaoAno, antecipacaoSimuladaResponse.taxaAntecipacaoAno) &&
        Objects.equals(this.detalhes, antecipacaoSimuladaResponse.detalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAntecipacaoSimulada, idConta, idEventoExterno, idTipoTransacao, qtdeParcelasAntecipaveis, valorParcela, dataHoraSimulacao, taxaAntecipacaoAno, detalhes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntecipacaoSimuladaResponse {\n");
    
    sb.append("    idAntecipacaoSimulada: ").append(toIndentedString(idAntecipacaoSimulada)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idEventoExterno: ").append(toIndentedString(idEventoExterno)).append("\n");
    sb.append("    idTipoTransacao: ").append(toIndentedString(idTipoTransacao)).append("\n");
    sb.append("    qtdeParcelasAntecipaveis: ").append(toIndentedString(qtdeParcelasAntecipaveis)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    dataHoraSimulacao: ").append(toIndentedString(dataHoraSimulacao)).append("\n");
    sb.append("    taxaAntecipacaoAno: ").append(toIndentedString(taxaAntecipacaoAno)).append("\n");
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



