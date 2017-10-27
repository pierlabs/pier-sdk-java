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
public class AntecipacaoSimuladaMockResponse   {
  
  private Long mcc = null;
  private String uf = null;
  private Long idAntecipacaoSimulada = null;
  private Long idConta = null;
  private Long idCompra = null;
  private Long idTipoTransacao = null;
  private Integer quantidadeParcelasAntecipaveis = null;
  private BigDecimal valorParcela = null;
  private String dataHoraSimulacao = null;
  private BigDecimal taxaAntecipacaoAno = null;
  private String nomeEstabelecimento = null;
  private String status = null;
  private String dataCompra = null;
  private String tipoOrigemTransacao = null;
  private String cidade = null;
  private String pais = null;
  private String latitude = null;
  private String longitude = null;
  private Long idGrupoMCC = null;
  private String descricaoGrupoMCC = null;
  private Long idProduto = null;
  private String descricaoProduto = null;
  private List<AntecipacaoSimuladaDetalhesResponse> detalhes = new ArrayList<AntecipacaoSimuladaDetalhesResponse>();

  
  /**
   **/
  public AntecipacaoSimuladaMockResponse mcc(Long mcc) {
    this.mcc = mcc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mcc")
  public Long getMcc() {
    return mcc;
  }
  public void setMcc(Long mcc) {
    this.mcc = mcc;
  }

  
  /**
   **/
  public AntecipacaoSimuladaMockResponse uf(String uf) {
    this.uf = uf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da simula\u00C3\u00A7\u00C3\u00A3o de antecipa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public AntecipacaoSimuladaMockResponse idAntecipacaoSimulada(Long idAntecipacaoSimulada) {
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
  public AntecipacaoSimuladaMockResponse idConta(Long idConta) {
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
   * C\u00C3\u00B3digo identificador do evento compra.
   **/
  public AntecipacaoSimuladaMockResponse idCompra(Long idCompra) {
    this.idCompra = idCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do evento compra.")
  @JsonProperty("idCompra")
  public Long getIdCompra() {
    return idCompra;
  }
  public void setIdCompra(Long idCompra) {
    this.idCompra = idCompra;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do tipo do evento compra.
   **/
  public AntecipacaoSimuladaMockResponse idTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do tipo do evento compra.")
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
  public AntecipacaoSimuladaMockResponse quantidadeParcelasAntecipaveis(Integer quantidadeParcelasAntecipaveis) {
    this.quantidadeParcelasAntecipaveis = quantidadeParcelasAntecipaveis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de parcelas antecip\u00C3\u00A1veis.")
  @JsonProperty("quantidadeParcelasAntecipaveis")
  public Integer getQuantidadeParcelasAntecipaveis() {
    return quantidadeParcelasAntecipaveis;
  }
  public void setQuantidadeParcelasAntecipaveis(Integer quantidadeParcelasAntecipaveis) {
    this.quantidadeParcelasAntecipaveis = quantidadeParcelasAntecipaveis;
  }

  
  /**
   * Valor da parcela.
   **/
  public AntecipacaoSimuladaMockResponse valorParcela(BigDecimal valorParcela) {
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
  public AntecipacaoSimuladaMockResponse dataHoraSimulacao(String dataHoraSimulacao) {
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
  public AntecipacaoSimuladaMockResponse taxaAntecipacaoAno(BigDecimal taxaAntecipacaoAno) {
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
   * Estabelecimento onde foi realizada a transa\u00C3\u00A7\u00C3\u00A3o
   **/
  public AntecipacaoSimuladaMockResponse nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Estabelecimento onde foi realizada a transa\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status da autoriza\u00C3\u00A7\u00C3\u00A3o da compra.
   **/
  public AntecipacaoSimuladaMockResponse status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do status da autoriza\u00C3\u00A7\u00C3\u00A3o da compra.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Data da compra.
   **/
  public AntecipacaoSimuladaMockResponse dataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da compra.")
  @JsonProperty("dataCompra")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Tipo de transa\u00C3\u00A7\u00C3\u00A3o da compra.
   **/
  public AntecipacaoSimuladaMockResponse tipoOrigemTransacao(String tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo de transa\u00C3\u00A7\u00C3\u00A3o da compra.")
  @JsonProperty("tipoOrigemTransacao")
  public String getTipoOrigemTransacao() {
    return tipoOrigemTransacao;
  }
  public void setTipoOrigemTransacao(String tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
  }

  
  /**
   * Cidade onde a compra foi realizada.
   **/
  public AntecipacaoSimuladaMockResponse cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cidade onde a compra foi realizada.")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Pa\u00C3\u00ADs onde a compra foi realizada.
   **/
  public AntecipacaoSimuladaMockResponse pais(String pais) {
    this.pais = pais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Pa\u00C3\u00ADs onde a compra foi realizada.")
  @JsonProperty("pais")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * Coordenada latitudinal da localiza\u00C3\u00A7\u00C3\u00A3o da compra.
   **/
  public AntecipacaoSimuladaMockResponse latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Coordenada latitudinal da localiza\u00C3\u00A7\u00C3\u00A3o da compra.")
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Coordenada longitudinal da localiza\u00C3\u00A7\u00C3\u00A3o da compra.
   **/
  public AntecipacaoSimuladaMockResponse longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Coordenada longitudinal da localiza\u00C3\u00A7\u00C3\u00A3o da compra.")
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Grupo MCC da compra.
   **/
  public AntecipacaoSimuladaMockResponse idGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Grupo MCC da compra.")
  @JsonProperty("idGrupoMCC")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do Grupo MCC da compra.
   **/
  public AntecipacaoSimuladaMockResponse descricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do Grupo MCC da compra.")
  @JsonProperty("descricaoGrupoMCC")
  public String getDescricaoGrupoMCC() {
    return descricaoGrupoMCC;
  }
  public void setDescricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do produto da compra.
   **/
  public AntecipacaoSimuladaMockResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do produto da compra.")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do produto da compra.
   **/
  public AntecipacaoSimuladaMockResponse descricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do produto da compra.")
  @JsonProperty("descricaoProduto")
  public String getDescricaoProduto() {
    return descricaoProduto;
  }
  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  
  /**
   * Detalhes da simula\u00C3\u00A7\u00C3\u00A3o.
   **/
  public AntecipacaoSimuladaMockResponse detalhes(List<AntecipacaoSimuladaDetalhesResponse> detalhes) {
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
    AntecipacaoSimuladaMockResponse antecipacaoSimuladaMockResponse = (AntecipacaoSimuladaMockResponse) o;
    return Objects.equals(this.mcc, antecipacaoSimuladaMockResponse.mcc) &&
        Objects.equals(this.uf, antecipacaoSimuladaMockResponse.uf) &&
        Objects.equals(this.idAntecipacaoSimulada, antecipacaoSimuladaMockResponse.idAntecipacaoSimulada) &&
        Objects.equals(this.idConta, antecipacaoSimuladaMockResponse.idConta) &&
        Objects.equals(this.idCompra, antecipacaoSimuladaMockResponse.idCompra) &&
        Objects.equals(this.idTipoTransacao, antecipacaoSimuladaMockResponse.idTipoTransacao) &&
        Objects.equals(this.quantidadeParcelasAntecipaveis, antecipacaoSimuladaMockResponse.quantidadeParcelasAntecipaveis) &&
        Objects.equals(this.valorParcela, antecipacaoSimuladaMockResponse.valorParcela) &&
        Objects.equals(this.dataHoraSimulacao, antecipacaoSimuladaMockResponse.dataHoraSimulacao) &&
        Objects.equals(this.taxaAntecipacaoAno, antecipacaoSimuladaMockResponse.taxaAntecipacaoAno) &&
        Objects.equals(this.nomeEstabelecimento, antecipacaoSimuladaMockResponse.nomeEstabelecimento) &&
        Objects.equals(this.status, antecipacaoSimuladaMockResponse.status) &&
        Objects.equals(this.dataCompra, antecipacaoSimuladaMockResponse.dataCompra) &&
        Objects.equals(this.tipoOrigemTransacao, antecipacaoSimuladaMockResponse.tipoOrigemTransacao) &&
        Objects.equals(this.cidade, antecipacaoSimuladaMockResponse.cidade) &&
        Objects.equals(this.pais, antecipacaoSimuladaMockResponse.pais) &&
        Objects.equals(this.latitude, antecipacaoSimuladaMockResponse.latitude) &&
        Objects.equals(this.longitude, antecipacaoSimuladaMockResponse.longitude) &&
        Objects.equals(this.idGrupoMCC, antecipacaoSimuladaMockResponse.idGrupoMCC) &&
        Objects.equals(this.descricaoGrupoMCC, antecipacaoSimuladaMockResponse.descricaoGrupoMCC) &&
        Objects.equals(this.idProduto, antecipacaoSimuladaMockResponse.idProduto) &&
        Objects.equals(this.descricaoProduto, antecipacaoSimuladaMockResponse.descricaoProduto) &&
        Objects.equals(this.detalhes, antecipacaoSimuladaMockResponse.detalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, uf, idAntecipacaoSimulada, idConta, idCompra, idTipoTransacao, quantidadeParcelasAntecipaveis, valorParcela, dataHoraSimulacao, taxaAntecipacaoAno, nomeEstabelecimento, status, dataCompra, tipoOrigemTransacao, cidade, pais, latitude, longitude, idGrupoMCC, descricaoGrupoMCC, idProduto, descricaoProduto, detalhes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntecipacaoSimuladaMockResponse {\n");
    
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    idAntecipacaoSimulada: ").append(toIndentedString(idAntecipacaoSimulada)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idCompra: ").append(toIndentedString(idCompra)).append("\n");
    sb.append("    idTipoTransacao: ").append(toIndentedString(idTipoTransacao)).append("\n");
    sb.append("    quantidadeParcelasAntecipaveis: ").append(toIndentedString(quantidadeParcelasAntecipaveis)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    dataHoraSimulacao: ").append(toIndentedString(dataHoraSimulacao)).append("\n");
    sb.append("    taxaAntecipacaoAno: ").append(toIndentedString(taxaAntecipacaoAno)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataCompra: ").append(toIndentedString(dataCompra)).append("\n");
    sb.append("    tipoOrigemTransacao: ").append(toIndentedString(tipoOrigemTransacao)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    idGrupoMCC: ").append(toIndentedString(idGrupoMCC)).append("\n");
    sb.append("    descricaoGrupoMCC: ").append(toIndentedString(descricaoGrupoMCC)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    descricaoProduto: ").append(toIndentedString(descricaoProduto)).append("\n");
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



