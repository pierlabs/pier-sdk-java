package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AntecipacaoResponse   {
  
  private Long mcc = null;
  private String uf = null;
  private Long id = null;
  private Long idConta = null;
  private Long idCompra = null;
  private Long quantidadeParcelasTotal = null;
  private Long quantidadeParcelasAntecipadas = null;
  private BigDecimal valorParcela = null;
  private BigDecimal valorDescontoTotal = null;
  private BigDecimal valorTotalComDesconto = null;
  private BigDecimal taxaDesconto = null;
  private String dataCompra = null;
  private String status = null;
  private String nomeEstabelecimento = null;
  private String tipoOrigemTransacao = null;
  private String cidade = null;
  private String pais = null;
  private String latitude = null;
  private String longitude = null;
  private Long idGrupoMCC = null;
  private String descricaoGrupoMCC = null;
  private Long idProduto = null;
  private String descricaoProduto = null;
  private String descricaoEstabelecimento = null;
  private String nomeFantasiaEstabelecimento = null;

  
  /**
   **/
  public AntecipacaoResponse mcc(Long mcc) {
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
  public AntecipacaoResponse uf(String uf) {
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
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da antecipa\u00C3\u00A7\u00C3\u00A3o
   **/
  public AntecipacaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da antecipa\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta
   **/
  public AntecipacaoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da compra
   **/
  public AntecipacaoResponse idCompra(Long idCompra) {
    this.idCompra = idCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da compra")
  @JsonProperty("idCompra")
  public Long getIdCompra() {
    return idCompra;
  }
  public void setIdCompra(Long idCompra) {
    this.idCompra = idCompra;
  }

  
  /**
   * Apresenta o numero total de parcelas da compra
   **/
  public AntecipacaoResponse quantidadeParcelasTotal(Long quantidadeParcelasTotal) {
    this.quantidadeParcelasTotal = quantidadeParcelasTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o numero total de parcelas da compra")
  @JsonProperty("quantidadeParcelasTotal")
  public Long getQuantidadeParcelasTotal() {
    return quantidadeParcelasTotal;
  }
  public void setQuantidadeParcelasTotal(Long quantidadeParcelasTotal) {
    this.quantidadeParcelasTotal = quantidadeParcelasTotal;
  }

  
  /**
   * Apresenta o numero de parcelas antecipadas
   **/
  public AntecipacaoResponse quantidadeParcelasAntecipadas(Long quantidadeParcelasAntecipadas) {
    this.quantidadeParcelasAntecipadas = quantidadeParcelasAntecipadas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o numero de parcelas antecipadas")
  @JsonProperty("quantidadeParcelasAntecipadas")
  public Long getQuantidadeParcelasAntecipadas() {
    return quantidadeParcelasAntecipadas;
  }
  public void setQuantidadeParcelasAntecipadas(Long quantidadeParcelasAntecipadas) {
    this.quantidadeParcelasAntecipadas = quantidadeParcelasAntecipadas;
  }

  
  /**
   * Apresenta o valor de cada parcela antecipadas
   **/
  public AntecipacaoResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o valor de cada parcela antecipadas")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Apresenta o valor total do desconto
   **/
  public AntecipacaoResponse valorDescontoTotal(BigDecimal valorDescontoTotal) {
    this.valorDescontoTotal = valorDescontoTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o valor total do desconto")
  @JsonProperty("valorDescontoTotal")
  public BigDecimal getValorDescontoTotal() {
    return valorDescontoTotal;
  }
  public void setValorDescontoTotal(BigDecimal valorDescontoTotal) {
    this.valorDescontoTotal = valorDescontoTotal;
  }

  
  /**
   * Apresenta o valor total com desconto
   **/
  public AntecipacaoResponse valorTotalComDesconto(BigDecimal valorTotalComDesconto) {
    this.valorTotalComDesconto = valorTotalComDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o valor total com desconto")
  @JsonProperty("valorTotalComDesconto")
  public BigDecimal getValorTotalComDesconto() {
    return valorTotalComDesconto;
  }
  public void setValorTotalComDesconto(BigDecimal valorTotalComDesconto) {
    this.valorTotalComDesconto = valorTotalComDesconto;
  }

  
  /**
   * Apresenta a taxa de desconto
   **/
  public AntecipacaoResponse taxaDesconto(BigDecimal taxaDesconto) {
    this.taxaDesconto = taxaDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a taxa de desconto")
  @JsonProperty("taxaDesconto")
  public BigDecimal getTaxaDesconto() {
    return taxaDesconto;
  }
  public void setTaxaDesconto(BigDecimal taxaDesconto) {
    this.taxaDesconto = taxaDesconto;
  }

  
  /**
   * Data da compra.
   **/
  public AntecipacaoResponse dataCompra(String dataCompra) {
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
   * Descri\u00C3\u00A7\u00C3\u00A3o do status da autoriza\u00C3\u00A7\u00C3\u00A3o da compra.
   **/
  public AntecipacaoResponse status(String status) {
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
   * Nome do estabelecimento da compra.
   **/
  public AntecipacaoResponse nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do estabelecimento da compra.")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Tipo de transa\u00C3\u00A7\u00C3\u00A3o da compra.
   **/
  public AntecipacaoResponse tipoOrigemTransacao(String tipoOrigemTransacao) {
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
  public AntecipacaoResponse cidade(String cidade) {
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
  public AntecipacaoResponse pais(String pais) {
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
  public AntecipacaoResponse latitude(String latitude) {
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
  public AntecipacaoResponse longitude(String longitude) {
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
  public AntecipacaoResponse idGrupoMCC(Long idGrupoMCC) {
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
  public AntecipacaoResponse descricaoGrupoMCC(String descricaoGrupoMCC) {
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
  public AntecipacaoResponse idProduto(Long idProduto) {
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
  public AntecipacaoResponse descricaoProduto(String descricaoProduto) {
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
   * Descri\u00C3\u00A7\u00C3\u00A3o do estabelecimento da compra.
   **/
  public AntecipacaoResponse descricaoEstabelecimento(String descricaoEstabelecimento) {
    this.descricaoEstabelecimento = descricaoEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do estabelecimento da compra.")
  @JsonProperty("descricaoEstabelecimento")
  public String getDescricaoEstabelecimento() {
    return descricaoEstabelecimento;
  }
  public void setDescricaoEstabelecimento(String descricaoEstabelecimento) {
    this.descricaoEstabelecimento = descricaoEstabelecimento;
  }

  
  /**
   * Nome fantasia do estabelecimento da compra.
   **/
  public AntecipacaoResponse nomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome fantasia do estabelecimento da compra.")
  @JsonProperty("nomeFantasiaEstabelecimento")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntecipacaoResponse antecipacaoResponse = (AntecipacaoResponse) o;
    return Objects.equals(this.mcc, antecipacaoResponse.mcc) &&
        Objects.equals(this.uf, antecipacaoResponse.uf) &&
        Objects.equals(this.id, antecipacaoResponse.id) &&
        Objects.equals(this.idConta, antecipacaoResponse.idConta) &&
        Objects.equals(this.idCompra, antecipacaoResponse.idCompra) &&
        Objects.equals(this.quantidadeParcelasTotal, antecipacaoResponse.quantidadeParcelasTotal) &&
        Objects.equals(this.quantidadeParcelasAntecipadas, antecipacaoResponse.quantidadeParcelasAntecipadas) &&
        Objects.equals(this.valorParcela, antecipacaoResponse.valorParcela) &&
        Objects.equals(this.valorDescontoTotal, antecipacaoResponse.valorDescontoTotal) &&
        Objects.equals(this.valorTotalComDesconto, antecipacaoResponse.valorTotalComDesconto) &&
        Objects.equals(this.taxaDesconto, antecipacaoResponse.taxaDesconto) &&
        Objects.equals(this.dataCompra, antecipacaoResponse.dataCompra) &&
        Objects.equals(this.status, antecipacaoResponse.status) &&
        Objects.equals(this.nomeEstabelecimento, antecipacaoResponse.nomeEstabelecimento) &&
        Objects.equals(this.tipoOrigemTransacao, antecipacaoResponse.tipoOrigemTransacao) &&
        Objects.equals(this.cidade, antecipacaoResponse.cidade) &&
        Objects.equals(this.pais, antecipacaoResponse.pais) &&
        Objects.equals(this.latitude, antecipacaoResponse.latitude) &&
        Objects.equals(this.longitude, antecipacaoResponse.longitude) &&
        Objects.equals(this.idGrupoMCC, antecipacaoResponse.idGrupoMCC) &&
        Objects.equals(this.descricaoGrupoMCC, antecipacaoResponse.descricaoGrupoMCC) &&
        Objects.equals(this.idProduto, antecipacaoResponse.idProduto) &&
        Objects.equals(this.descricaoProduto, antecipacaoResponse.descricaoProduto) &&
        Objects.equals(this.descricaoEstabelecimento, antecipacaoResponse.descricaoEstabelecimento) &&
        Objects.equals(this.nomeFantasiaEstabelecimento, antecipacaoResponse.nomeFantasiaEstabelecimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, uf, id, idConta, idCompra, quantidadeParcelasTotal, quantidadeParcelasAntecipadas, valorParcela, valorDescontoTotal, valorTotalComDesconto, taxaDesconto, dataCompra, status, nomeEstabelecimento, tipoOrigemTransacao, cidade, pais, latitude, longitude, idGrupoMCC, descricaoGrupoMCC, idProduto, descricaoProduto, descricaoEstabelecimento, nomeFantasiaEstabelecimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntecipacaoResponse {\n");
    
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idCompra: ").append(toIndentedString(idCompra)).append("\n");
    sb.append("    quantidadeParcelasTotal: ").append(toIndentedString(quantidadeParcelasTotal)).append("\n");
    sb.append("    quantidadeParcelasAntecipadas: ").append(toIndentedString(quantidadeParcelasAntecipadas)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    valorDescontoTotal: ").append(toIndentedString(valorDescontoTotal)).append("\n");
    sb.append("    valorTotalComDesconto: ").append(toIndentedString(valorTotalComDesconto)).append("\n");
    sb.append("    taxaDesconto: ").append(toIndentedString(taxaDesconto)).append("\n");
    sb.append("    dataCompra: ").append(toIndentedString(dataCompra)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
    sb.append("    tipoOrigemTransacao: ").append(toIndentedString(tipoOrigemTransacao)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    idGrupoMCC: ").append(toIndentedString(idGrupoMCC)).append("\n");
    sb.append("    descricaoGrupoMCC: ").append(toIndentedString(descricaoGrupoMCC)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    descricaoProduto: ").append(toIndentedString(descricaoProduto)).append("\n");
    sb.append("    descricaoEstabelecimento: ").append(toIndentedString(descricaoEstabelecimento)).append("\n");
    sb.append("    nomeFantasiaEstabelecimento: ").append(toIndentedString(nomeFantasiaEstabelecimento)).append("\n");
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

