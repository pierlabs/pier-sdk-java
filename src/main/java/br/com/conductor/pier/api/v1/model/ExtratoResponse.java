package br.com.conductor.pier.api.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ExtratoResponse   {
  
  private String cartao = null;
  private String chip = null;
  private String cidadeUFPais = null;
  private String codigoAutorizacao = null;
  private String codigoMoeda = null;
  private String codigoMoedaDestino = null;
  private Double cotacaoDolar = null;
  private Double credito = null;
  private String dataCompra = null;
  private Date dataCotacaoDolar = null;
  private String dataEntradaCompra = null;
  private String dataTransacaoUTC = null;
  private Double debito = null;
  private String descricaoModoEntrada = null;
  private String descricaoTransacao = null;
  private Double encargosFinanceiros = null;
  private String historico = null;
  private Integer idEventoExterno = null;
  private Integer idTipoTransacao = null;
  private Integer idTransacao = null;
  private Integer mcc = null;
  private String nomeEstabVisa = null;
  private String nomePlastico = null;
  private Integer numeroEstabelecimento = null;
  private String origem = null;
  private Double taxaEmbarque = null;
  private String tipoEvento = null;
  private Double valorDolar = null;

  
  /**
   **/
  public ExtratoResponse cartao(String cartao) {
    this.cartao = cartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cartao")
  public String getCartao() {
    return cartao;
  }
  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  
  /**
   **/
  public ExtratoResponse chip(String chip) {
    this.chip = chip;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("chip")
  public String getChip() {
    return chip;
  }
  public void setChip(String chip) {
    this.chip = chip;
  }

  
  /**
   **/
  public ExtratoResponse cidadeUFPais(String cidadeUFPais) {
    this.cidadeUFPais = cidadeUFPais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cidadeUFPais")
  public String getCidadeUFPais() {
    return cidadeUFPais;
  }
  public void setCidadeUFPais(String cidadeUFPais) {
    this.cidadeUFPais = cidadeUFPais;
  }

  
  /**
   **/
  public ExtratoResponse codigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codigoAutorizacao")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   **/
  public ExtratoResponse codigoMoeda(String codigoMoeda) {
    this.codigoMoeda = codigoMoeda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codigoMoeda")
  public String getCodigoMoeda() {
    return codigoMoeda;
  }
  public void setCodigoMoeda(String codigoMoeda) {
    this.codigoMoeda = codigoMoeda;
  }

  
  /**
   **/
  public ExtratoResponse codigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codigoMoedaDestino")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   **/
  public ExtratoResponse cotacaoDolar(Double cotacaoDolar) {
    this.cotacaoDolar = cotacaoDolar;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cotacaoDolar")
  public Double getCotacaoDolar() {
    return cotacaoDolar;
  }
  public void setCotacaoDolar(Double cotacaoDolar) {
    this.cotacaoDolar = cotacaoDolar;
  }

  
  /**
   **/
  public ExtratoResponse credito(Double credito) {
    this.credito = credito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("credito")
  public Double getCredito() {
    return credito;
  }
  public void setCredito(Double credito) {
    this.credito = credito;
  }

  
  /**
   **/
  public ExtratoResponse dataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataCompra")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   **/
  public ExtratoResponse dataCotacaoDolar(Date dataCotacaoDolar) {
    this.dataCotacaoDolar = dataCotacaoDolar;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataCotacaoDolar")
  public Date getDataCotacaoDolar() {
    return dataCotacaoDolar;
  }
  public void setDataCotacaoDolar(Date dataCotacaoDolar) {
    this.dataCotacaoDolar = dataCotacaoDolar;
  }

  
  /**
   **/
  public ExtratoResponse dataEntradaCompra(String dataEntradaCompra) {
    this.dataEntradaCompra = dataEntradaCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataEntradaCompra")
  public String getDataEntradaCompra() {
    return dataEntradaCompra;
  }
  public void setDataEntradaCompra(String dataEntradaCompra) {
    this.dataEntradaCompra = dataEntradaCompra;
  }

  
  /**
   **/
  public ExtratoResponse dataTransacaoUTC(String dataTransacaoUTC) {
    this.dataTransacaoUTC = dataTransacaoUTC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataTransacaoUTC")
  public String getDataTransacaoUTC() {
    return dataTransacaoUTC;
  }
  public void setDataTransacaoUTC(String dataTransacaoUTC) {
    this.dataTransacaoUTC = dataTransacaoUTC;
  }

  
  /**
   **/
  public ExtratoResponse debito(Double debito) {
    this.debito = debito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("debito")
  public Double getDebito() {
    return debito;
  }
  public void setDebito(Double debito) {
    this.debito = debito;
  }

  
  /**
   **/
  public ExtratoResponse descricaoModoEntrada(String descricaoModoEntrada) {
    this.descricaoModoEntrada = descricaoModoEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("descricaoModoEntrada")
  public String getDescricaoModoEntrada() {
    return descricaoModoEntrada;
  }
  public void setDescricaoModoEntrada(String descricaoModoEntrada) {
    this.descricaoModoEntrada = descricaoModoEntrada;
  }

  
  /**
   **/
  public ExtratoResponse descricaoTransacao(String descricaoTransacao) {
    this.descricaoTransacao = descricaoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("descricaoTransacao")
  public String getDescricaoTransacao() {
    return descricaoTransacao;
  }
  public void setDescricaoTransacao(String descricaoTransacao) {
    this.descricaoTransacao = descricaoTransacao;
  }

  
  /**
   **/
  public ExtratoResponse encargosFinanceiros(Double encargosFinanceiros) {
    this.encargosFinanceiros = encargosFinanceiros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("encargosFinanceiros")
  public Double getEncargosFinanceiros() {
    return encargosFinanceiros;
  }
  public void setEncargosFinanceiros(Double encargosFinanceiros) {
    this.encargosFinanceiros = encargosFinanceiros;
  }

  
  /**
   **/
  public ExtratoResponse historico(String historico) {
    this.historico = historico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("historico")
  public String getHistorico() {
    return historico;
  }
  public void setHistorico(String historico) {
    this.historico = historico;
  }

  
  /**
   **/
  public ExtratoResponse idEventoExterno(Integer idEventoExterno) {
    this.idEventoExterno = idEventoExterno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idEventoExterno")
  public Integer getIdEventoExterno() {
    return idEventoExterno;
  }
  public void setIdEventoExterno(Integer idEventoExterno) {
    this.idEventoExterno = idEventoExterno;
  }

  
  /**
   **/
  public ExtratoResponse idTipoTransacao(Integer idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idTipoTransacao")
  public Integer getIdTipoTransacao() {
    return idTipoTransacao;
  }
  public void setIdTipoTransacao(Integer idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
  }

  
  /**
   **/
  public ExtratoResponse idTransacao(Integer idTransacao) {
    this.idTransacao = idTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idTransacao")
  public Integer getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Integer idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   **/
  public ExtratoResponse mcc(Integer mcc) {
    this.mcc = mcc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mcc")
  public Integer getMcc() {
    return mcc;
  }
  public void setMcc(Integer mcc) {
    this.mcc = mcc;
  }

  
  /**
   **/
  public ExtratoResponse nomeEstabVisa(String nomeEstabVisa) {
    this.nomeEstabVisa = nomeEstabVisa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nomeEstabVisa")
  public String getNomeEstabVisa() {
    return nomeEstabVisa;
  }
  public void setNomeEstabVisa(String nomeEstabVisa) {
    this.nomeEstabVisa = nomeEstabVisa;
  }

  
  /**
   **/
  public ExtratoResponse nomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nomePlastico")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   **/
  public ExtratoResponse numeroEstabelecimento(Integer numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroEstabelecimento")
  public Integer getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Integer numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   **/
  public ExtratoResponse origem(String origem) {
    this.origem = origem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("origem")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   **/
  public ExtratoResponse taxaEmbarque(Double taxaEmbarque) {
    this.taxaEmbarque = taxaEmbarque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("taxaEmbarque")
  public Double getTaxaEmbarque() {
    return taxaEmbarque;
  }
  public void setTaxaEmbarque(Double taxaEmbarque) {
    this.taxaEmbarque = taxaEmbarque;
  }

  
  /**
   **/
  public ExtratoResponse tipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tipoEvento")
  public String getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   **/
  public ExtratoResponse valorDolar(Double valorDolar) {
    this.valorDolar = valorDolar;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorDolar")
  public Double getValorDolar() {
    return valorDolar;
  }
  public void setValorDolar(Double valorDolar) {
    this.valorDolar = valorDolar;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtratoResponse extratoResponse = (ExtratoResponse) o;
    return Objects.equals(this.cartao, extratoResponse.cartao) &&
        Objects.equals(this.chip, extratoResponse.chip) &&
        Objects.equals(this.cidadeUFPais, extratoResponse.cidadeUFPais) &&
        Objects.equals(this.codigoAutorizacao, extratoResponse.codigoAutorizacao) &&
        Objects.equals(this.codigoMoeda, extratoResponse.codigoMoeda) &&
        Objects.equals(this.codigoMoedaDestino, extratoResponse.codigoMoedaDestino) &&
        Objects.equals(this.cotacaoDolar, extratoResponse.cotacaoDolar) &&
        Objects.equals(this.credito, extratoResponse.credito) &&
        Objects.equals(this.dataCompra, extratoResponse.dataCompra) &&
        Objects.equals(this.dataCotacaoDolar, extratoResponse.dataCotacaoDolar) &&
        Objects.equals(this.dataEntradaCompra, extratoResponse.dataEntradaCompra) &&
        Objects.equals(this.dataTransacaoUTC, extratoResponse.dataTransacaoUTC) &&
        Objects.equals(this.debito, extratoResponse.debito) &&
        Objects.equals(this.descricaoModoEntrada, extratoResponse.descricaoModoEntrada) &&
        Objects.equals(this.descricaoTransacao, extratoResponse.descricaoTransacao) &&
        Objects.equals(this.encargosFinanceiros, extratoResponse.encargosFinanceiros) &&
        Objects.equals(this.historico, extratoResponse.historico) &&
        Objects.equals(this.idEventoExterno, extratoResponse.idEventoExterno) &&
        Objects.equals(this.idTipoTransacao, extratoResponse.idTipoTransacao) &&
        Objects.equals(this.idTransacao, extratoResponse.idTransacao) &&
        Objects.equals(this.mcc, extratoResponse.mcc) &&
        Objects.equals(this.nomeEstabVisa, extratoResponse.nomeEstabVisa) &&
        Objects.equals(this.nomePlastico, extratoResponse.nomePlastico) &&
        Objects.equals(this.numeroEstabelecimento, extratoResponse.numeroEstabelecimento) &&
        Objects.equals(this.origem, extratoResponse.origem) &&
        Objects.equals(this.taxaEmbarque, extratoResponse.taxaEmbarque) &&
        Objects.equals(this.tipoEvento, extratoResponse.tipoEvento) &&
        Objects.equals(this.valorDolar, extratoResponse.valorDolar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartao, chip, cidadeUFPais, codigoAutorizacao, codigoMoeda, codigoMoedaDestino, cotacaoDolar, credito, dataCompra, dataCotacaoDolar, dataEntradaCompra, dataTransacaoUTC, debito, descricaoModoEntrada, descricaoTransacao, encargosFinanceiros, historico, idEventoExterno, idTipoTransacao, idTransacao, mcc, nomeEstabVisa, nomePlastico, numeroEstabelecimento, origem, taxaEmbarque, tipoEvento, valorDolar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtratoResponse {\n");
    
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    chip: ").append(toIndentedString(chip)).append("\n");
    sb.append("    cidadeUFPais: ").append(toIndentedString(cidadeUFPais)).append("\n");
    sb.append("    codigoAutorizacao: ").append(toIndentedString(codigoAutorizacao)).append("\n");
    sb.append("    codigoMoeda: ").append(toIndentedString(codigoMoeda)).append("\n");
    sb.append("    codigoMoedaDestino: ").append(toIndentedString(codigoMoedaDestino)).append("\n");
    sb.append("    cotacaoDolar: ").append(toIndentedString(cotacaoDolar)).append("\n");
    sb.append("    credito: ").append(toIndentedString(credito)).append("\n");
    sb.append("    dataCompra: ").append(toIndentedString(dataCompra)).append("\n");
    sb.append("    dataCotacaoDolar: ").append(toIndentedString(dataCotacaoDolar)).append("\n");
    sb.append("    dataEntradaCompra: ").append(toIndentedString(dataEntradaCompra)).append("\n");
    sb.append("    dataTransacaoUTC: ").append(toIndentedString(dataTransacaoUTC)).append("\n");
    sb.append("    debito: ").append(toIndentedString(debito)).append("\n");
    sb.append("    descricaoModoEntrada: ").append(toIndentedString(descricaoModoEntrada)).append("\n");
    sb.append("    descricaoTransacao: ").append(toIndentedString(descricaoTransacao)).append("\n");
    sb.append("    encargosFinanceiros: ").append(toIndentedString(encargosFinanceiros)).append("\n");
    sb.append("    historico: ").append(toIndentedString(historico)).append("\n");
    sb.append("    idEventoExterno: ").append(toIndentedString(idEventoExterno)).append("\n");
    sb.append("    idTipoTransacao: ").append(toIndentedString(idTipoTransacao)).append("\n");
    sb.append("    idTransacao: ").append(toIndentedString(idTransacao)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    nomeEstabVisa: ").append(toIndentedString(nomeEstabVisa)).append("\n");
    sb.append("    nomePlastico: ").append(toIndentedString(nomePlastico)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
    sb.append("    taxaEmbarque: ").append(toIndentedString(taxaEmbarque)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    valorDolar: ").append(toIndentedString(valorDolar)).append("\n");
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



