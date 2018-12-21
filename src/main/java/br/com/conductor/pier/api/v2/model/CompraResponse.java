package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Object of Purchase
 **/

@ApiModel(description = "Object of Purchase")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CompraResponse   {
  
  private Long mcc = null;
  private String uf = null;
  private Long idCompra = null;
  private String status = null;
  private String dataCompra = null;
  private BigDecimal valorTotalCompra = null;
  private BigDecimal valorParcela = null;
  private BigDecimal primeiraParcela = null;
  private Integer numeroParcelas = null;
  private Integer numeroParcelasAntecipaveis = null;
  private String nomeEstabelecimento = null;
  private String tipoOrigemTransacao = null;
  private String cidade = null;
  private String pais = null;
  private String latitude = null;
  private String longitude = null;
  private Long idGrupoMCC = null;
  private String descricaoGrupoMCC = null;
  private Long idConta = null;
  private Long idProduto = null;
  private String descricaoProduto = null;
  private String cartao = null;
  private String nomePortadorCartao = null;

  
  /**
   **/
  public CompraResponse mcc(Long mcc) {
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
  public CompraResponse uf(String uf) {
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
   * Identification Code of the shop
   **/
  public CompraResponse idCompra(Long idCompra) {
    this.idCompra = idCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the shop")
  @JsonProperty("idCompra")
  public Long getIdCompra() {
    return idCompra;
  }
  public void setIdCompra(Long idCompra) {
    this.idCompra = idCompra;
  }

  
  /**
   * Description status of the shop authorization
   **/
  public CompraResponse status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description status of the shop authorization")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Date of the shop
   **/
  public CompraResponse dataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of the shop")
  @JsonProperty("dataCompra")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Total value of the shop
   **/
  public CompraResponse valorTotalCompra(BigDecimal valorTotalCompra) {
    this.valorTotalCompra = valorTotalCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total value of the shop")
  @JsonProperty("valorTotalCompra")
  public BigDecimal getValorTotalCompra() {
    return valorTotalCompra;
  }
  public void setValorTotalCompra(BigDecimal valorTotalCompra) {
    this.valorTotalCompra = valorTotalCompra;
  }

  
  /**
   * Parcel value of the shop
   **/
  public CompraResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parcel value of the shop")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * First parcel value of the shop
   **/
  public CompraResponse primeiraParcela(BigDecimal primeiraParcela) {
    this.primeiraParcela = primeiraParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "First parcel value of the shop")
  @JsonProperty("primeiraParcela")
  public BigDecimal getPrimeiraParcela() {
    return primeiraParcela;
  }
  public void setPrimeiraParcela(BigDecimal primeiraParcela) {
    this.primeiraParcela = primeiraParcela;
  }

  
  /**
   * Number of parcels of the shop
   **/
  public CompraResponse numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of parcels of the shop")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Number of of the antecipated parcels of the shops
   **/
  public CompraResponse numeroParcelasAntecipaveis(Integer numeroParcelasAntecipaveis) {
    this.numeroParcelasAntecipaveis = numeroParcelasAntecipaveis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of of the antecipated parcels of the shops")
  @JsonProperty("numeroParcelasAntecipaveis")
  public Integer getNumeroParcelasAntecipaveis() {
    return numeroParcelasAntecipaveis;
  }
  public void setNumeroParcelasAntecipaveis(Integer numeroParcelasAntecipaveis) {
    this.numeroParcelasAntecipaveis = numeroParcelasAntecipaveis;
  }

  
  /**
   * Establishment name of the shop
   **/
  public CompraResponse nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Establishment name of the shop")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Type of transaction of the shop
   **/
  public CompraResponse tipoOrigemTransacao(String tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of transaction of the shop")
  @JsonProperty("tipoOrigemTransacao")
  public String getTipoOrigemTransacao() {
    return tipoOrigemTransacao;
  }
  public void setTipoOrigemTransacao(String tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
  }

  
  /**
   * City where the shop was made
   **/
  public CompraResponse cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "City where the shop was made")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * country where the shop was made
   **/
  public CompraResponse pais(String pais) {
    this.pais = pais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "country where the shop was made")
  @JsonProperty("pais")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * Latitudinal Coordinate of the shop location
   **/
  public CompraResponse latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Latitudinal Coordinate of the shop location")
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Longitudinal Coordinate of the shop location
   **/
  public CompraResponse longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Longitudinal Coordinate of the shop location")
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  /**
   * Identification Code of MCC Group of the shop
   **/
  public CompraResponse idGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of MCC Group of the shop")
  @JsonProperty("idGrupoMCC")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Description of MCC group of the shop
   **/
  public CompraResponse descricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of MCC group of the shop")
  @JsonProperty("descricaoGrupoMCC")
  public String getDescricaoGrupoMCC() {
    return descricaoGrupoMCC;
  }
  public void setDescricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
  }

  
  /**
   * Identification Code of the account
   **/
  public CompraResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the account")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the product of purchase
   **/
  public CompraResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the product of purchase")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Description of the product of purchase
   **/
  public CompraResponse descricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the product of purchase")
  @JsonProperty("descricaoProduto")
  public String getDescricaoProduto() {
    return descricaoProduto;
  }
  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  
  /**
   * Card number of the shop
   **/
  public CompraResponse cartao(String cartao) {
    this.cartao = cartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Card number of the shop")
  @JsonProperty("cartao")
  public String getCartao() {
    return cartao;
  }
  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  
  /**
   * Cardholder name of the shop
   **/
  public CompraResponse nomePortadorCartao(String nomePortadorCartao) {
    this.nomePortadorCartao = nomePortadorCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cardholder name of the shop")
  @JsonProperty("nomePortadorCartao")
  public String getNomePortadorCartao() {
    return nomePortadorCartao;
  }
  public void setNomePortadorCartao(String nomePortadorCartao) {
    this.nomePortadorCartao = nomePortadorCartao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompraResponse compraResponse = (CompraResponse) o;
    return Objects.equals(this.mcc, compraResponse.mcc) &&
        Objects.equals(this.uf, compraResponse.uf) &&
        Objects.equals(this.idCompra, compraResponse.idCompra) &&
        Objects.equals(this.status, compraResponse.status) &&
        Objects.equals(this.dataCompra, compraResponse.dataCompra) &&
        Objects.equals(this.valorTotalCompra, compraResponse.valorTotalCompra) &&
        Objects.equals(this.valorParcela, compraResponse.valorParcela) &&
        Objects.equals(this.primeiraParcela, compraResponse.primeiraParcela) &&
        Objects.equals(this.numeroParcelas, compraResponse.numeroParcelas) &&
        Objects.equals(this.numeroParcelasAntecipaveis, compraResponse.numeroParcelasAntecipaveis) &&
        Objects.equals(this.nomeEstabelecimento, compraResponse.nomeEstabelecimento) &&
        Objects.equals(this.tipoOrigemTransacao, compraResponse.tipoOrigemTransacao) &&
        Objects.equals(this.cidade, compraResponse.cidade) &&
        Objects.equals(this.pais, compraResponse.pais) &&
        Objects.equals(this.latitude, compraResponse.latitude) &&
        Objects.equals(this.longitude, compraResponse.longitude) &&
        Objects.equals(this.idGrupoMCC, compraResponse.idGrupoMCC) &&
        Objects.equals(this.descricaoGrupoMCC, compraResponse.descricaoGrupoMCC) &&
        Objects.equals(this.idConta, compraResponse.idConta) &&
        Objects.equals(this.idProduto, compraResponse.idProduto) &&
        Objects.equals(this.descricaoProduto, compraResponse.descricaoProduto) &&
        Objects.equals(this.cartao, compraResponse.cartao) &&
        Objects.equals(this.nomePortadorCartao, compraResponse.nomePortadorCartao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, uf, idCompra, status, dataCompra, valorTotalCompra, valorParcela, primeiraParcela, numeroParcelas, numeroParcelasAntecipaveis, nomeEstabelecimento, tipoOrigemTransacao, cidade, pais, latitude, longitude, idGrupoMCC, descricaoGrupoMCC, idConta, idProduto, descricaoProduto, cartao, nomePortadorCartao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompraResponse {\n");
    
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    idCompra: ").append(toIndentedString(idCompra)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataCompra: ").append(toIndentedString(dataCompra)).append("\n");
    sb.append("    valorTotalCompra: ").append(toIndentedString(valorTotalCompra)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    primeiraParcela: ").append(toIndentedString(primeiraParcela)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    numeroParcelasAntecipaveis: ").append(toIndentedString(numeroParcelasAntecipaveis)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
    sb.append("    tipoOrigemTransacao: ").append(toIndentedString(tipoOrigemTransacao)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    idGrupoMCC: ").append(toIndentedString(idGrupoMCC)).append("\n");
    sb.append("    descricaoGrupoMCC: ").append(toIndentedString(descricaoGrupoMCC)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    descricaoProduto: ").append(toIndentedString(descricaoProduto)).append("\n");
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    nomePortadorCartao: ").append(toIndentedString(nomePortadorCartao)).append("\n");
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

