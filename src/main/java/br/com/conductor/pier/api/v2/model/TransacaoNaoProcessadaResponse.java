package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Object transaction not processed
 **/

@ApiModel(description = "Object transaction not processed")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransacaoNaoProcessadaResponse   {
  
  private String cartaoMascarado = null;
  private String codigoAutorizacao = null;
  private Long codigoMCC = null;
  private String codigoMoedaDestino = null;
  private String codigoMoedaOrigem = null;
  private String codigoReferencia = null;
  private String codigoTerminal = null;
  private BigDecimal cotacaoUSD = null;
  private String dataCotacaoUSD = null;
  private String dataFaturamento = null;
  private String dataOrigem = null;
  private String dataVencimentoReal = null;
  private String descricaoAbreviada = null;
  private String descricaoTipoTransacaoNaoProcessada = null;
  private String detalhesTransacao = null;
  private Integer flagCredito = null;
  private Integer flagFaturado = null;
  private String grupoDescricaoMCC = null;
  private Long grupoMCC = null;
  private Long idConta = null;
  private Long idEstabelecimento = null;
  private Long idTipoTransacaoNaoProcessada = null;
  private Long idTransacaoEstorno = null;
  private String localidadeEstabelecimento = null;
  private String modoEntradaTransacao = null;
  private String nomeEstabelecimento = null;
  private String nomeFantasiaEstabelecimento = null;
  private String nomePortador = null;
  private Long parcela = null;
  private Long plano = null;
  private Integer status = null;
  private BigDecimal taxaEmbarque = null;
  private BigDecimal valorBRL = null;
  private BigDecimal valorEntrada = null;
  private BigDecimal valorUSD = null;

  
  /**
   * Card Number in format 0000XXXXXXXX0000
   **/
  public TransacaoNaoProcessadaResponse cartaoMascarado(String cartaoMascarado) {
    this.cartaoMascarado = cartaoMascarado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Card Number in format 0000XXXXXXXX0000")
  @JsonProperty("cartaoMascarado")
  public String getCartaoMascarado() {
    return cartaoMascarado;
  }
  public void setCartaoMascarado(String cartaoMascarado) {
    this.cartaoMascarado = cartaoMascarado;
  }

  
  /**
   * Authorization Code of the transaction
   **/
  public TransacaoNaoProcessadaResponse codigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Authorization Code of the transaction")
  @JsonProperty("codigoAutorizacao")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * Identification Code of the Merchant Category
   **/
  public TransacaoNaoProcessadaResponse codigoMCC(Long codigoMCC) {
    this.codigoMCC = codigoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Merchant Category")
  @JsonProperty("codigoMCC")
  public Long getCodigoMCC() {
    return codigoMCC;
  }
  public void setCodigoMCC(Long codigoMCC) {
    this.codigoMCC = codigoMCC;
  }

  
  /**
   * Identification Code of the transaction currency after the conversion, following standard ISO 4217
   **/
  public TransacaoNaoProcessadaResponse codigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the transaction currency after the conversion, following standard ISO 4217")
  @JsonProperty("codigoMoedaDestino")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * Identification Code of the Currency used in the transaction, following standard ISO 4217
   **/
  public TransacaoNaoProcessadaResponse codigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Currency used in the transaction, following standard ISO 4217")
  @JsonProperty("codigoMoedaOrigem")
  public String getCodigoMoedaOrigem() {
    return codigoMoedaOrigem;
  }
  public void setCodigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
  }

  
  /**
   * Reference Code of the Transaction when used Flagged Card
   **/
  public TransacaoNaoProcessadaResponse codigoReferencia(String codigoReferencia) {
    this.codigoReferencia = codigoReferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reference Code of the Transaction when used Flagged Card")
  @JsonProperty("codigoReferencia")
  public String getCodigoReferencia() {
    return codigoReferencia;
  }
  public void setCodigoReferencia(String codigoReferencia) {
    this.codigoReferencia = codigoReferencia;
  }

  
  /**
   * Identification Code of the Transaction Capture Source
   **/
  public TransacaoNaoProcessadaResponse codigoTerminal(String codigoTerminal) {
    this.codigoTerminal = codigoTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Transaction Capture Source")
  @JsonProperty("codigoTerminal")
  public String getCodigoTerminal() {
    return codigoTerminal;
  }
  public void setCodigoTerminal(String codigoTerminal) {
    this.codigoTerminal = codigoTerminal;
  }

  
  /**
   * Value of the American Dollar (USD) converted in Real (BRL)
   **/
  public TransacaoNaoProcessadaResponse cotacaoUSD(BigDecimal cotacaoUSD) {
    this.cotacaoUSD = cotacaoUSD;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the American Dollar (USD) converted in Real (BRL)")
  @JsonProperty("cotacaoUSD")
  public BigDecimal getCotacaoUSD() {
    return cotacaoUSD;
  }
  public void setCotacaoUSD(BigDecimal cotacaoUSD) {
    this.cotacaoUSD = cotacaoUSD;
  }

  
  /**
   * Closing date of quotation of the American Dollar (USD)
   **/
  public TransacaoNaoProcessadaResponse dataCotacaoUSD(String dataCotacaoUSD) {
    this.dataCotacaoUSD = dataCotacaoUSD;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Closing date of quotation of the American Dollar (USD)")
  @JsonProperty("dataCotacaoUSD")
  public String getDataCotacaoUSD() {
    return dataCotacaoUSD;
  }
  public void setDataCotacaoUSD(String dataCotacaoUSD) {
    this.dataCotacaoUSD = dataCotacaoUSD;
  }

  
  /**
   * Billing date of the transaction
   **/
  public TransacaoNaoProcessadaResponse dataFaturamento(String dataFaturamento) {
    this.dataFaturamento = dataFaturamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Billing date of the transaction")
  @JsonProperty("dataFaturamento")
  public String getDataFaturamento() {
    return dataFaturamento;
  }
  public void setDataFaturamento(String dataFaturamento) {
    this.dataFaturamento = dataFaturamento;
  }

  
  /**
   * Date which the transaction was made
   **/
  public TransacaoNaoProcessadaResponse dataOrigem(String dataOrigem) {
    this.dataOrigem = dataOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date which the transaction was made")
  @JsonProperty("dataOrigem")
  public String getDataOrigem() {
    return dataOrigem;
  }
  public void setDataOrigem(String dataOrigem) {
    this.dataOrigem = dataOrigem;
  }

  
  /**
   * Expiration date of the invoice
   **/
  public TransacaoNaoProcessadaResponse dataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expiration date of the invoice")
  @JsonProperty("dataVencimentoReal")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Abbreviated Description of the transactions
   **/
  public TransacaoNaoProcessadaResponse descricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Abbreviated Description of the transactions")
  @JsonProperty("descricaoAbreviada")
  public String getDescricaoAbreviada() {
    return descricaoAbreviada;
  }
  public void setDescricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
  }

  
  /**
   * Description of the transaction type not processed
   **/
  public TransacaoNaoProcessadaResponse descricaoTipoTransacaoNaoProcessada(String descricaoTipoTransacaoNaoProcessada) {
    this.descricaoTipoTransacaoNaoProcessada = descricaoTipoTransacaoNaoProcessada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the transaction type not processed")
  @JsonProperty("descricaoTipoTransacaoNaoProcessada")
  public String getDescricaoTipoTransacaoNaoProcessada() {
    return descricaoTipoTransacaoNaoProcessada;
  }
  public void setDescricaoTipoTransacaoNaoProcessada(String descricaoTipoTransacaoNaoProcessada) {
    this.descricaoTipoTransacaoNaoProcessada = descricaoTipoTransacaoNaoProcessada;
  }

  
  /**
   * Complementary details regarding the transaction
   **/
  public TransacaoNaoProcessadaResponse detalhesTransacao(String detalhesTransacao) {
    this.detalhesTransacao = detalhesTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Complementary details regarding the transaction")
  @JsonProperty("detalhesTransacao")
  public String getDetalhesTransacao() {
    return detalhesTransacao;
  }
  public void setDetalhesTransacao(String detalhesTransacao) {
    this.detalhesTransacao = detalhesTransacao;
  }

  
  /**
   * When it is activate, indicate that the transaction is the credit type
   **/
  public TransacaoNaoProcessadaResponse flagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When it is activate, indicate that the transaction is the credit type")
  @JsonProperty("flagCredito")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * When it is activate, indicates that the transaction was consolidated in an invoice
   **/
  public TransacaoNaoProcessadaResponse flagFaturado(Integer flagFaturado) {
    this.flagFaturado = flagFaturado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When it is activate, indicates that the transaction was consolidated in an invoice")
  @JsonProperty("flagFaturado")
  public Integer getFlagFaturado() {
    return flagFaturado;
  }
  public void setFlagFaturado(Integer flagFaturado) {
    this.flagFaturado = flagFaturado;
  }

  
  /**
   * Description of the Merchant Group
   **/
  public TransacaoNaoProcessadaResponse grupoDescricaoMCC(String grupoDescricaoMCC) {
    this.grupoDescricaoMCC = grupoDescricaoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the Merchant Group")
  @JsonProperty("grupoDescricaoMCC")
  public String getGrupoDescricaoMCC() {
    return grupoDescricaoMCC;
  }
  public void setGrupoDescricaoMCC(String grupoDescricaoMCC) {
    this.grupoDescricaoMCC = grupoDescricaoMCC;
  }

  
  /**
   * Identification Code of the Merchant Group
   **/
  public TransacaoNaoProcessadaResponse grupoMCC(Long grupoMCC) {
    this.grupoMCC = grupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Merchant Group")
  @JsonProperty("grupoMCC")
  public Long getGrupoMCC() {
    return grupoMCC;
  }
  public void setGrupoMCC(Long grupoMCC) {
    this.grupoMCC = grupoMCC;
  }

  
  /**
   * Identification Code of the Account (id)
   **/
  public TransacaoNaoProcessadaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Account (id)")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the Merchant (id)
   **/
  public TransacaoNaoProcessadaResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Merchant (id)")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Identification Code of the Transaction type
   **/
  public TransacaoNaoProcessadaResponse idTipoTransacaoNaoProcessada(Long idTipoTransacaoNaoProcessada) {
    this.idTipoTransacaoNaoProcessada = idTipoTransacaoNaoProcessada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Transaction type")
  @JsonProperty("idTipoTransacaoNaoProcessada")
  public Long getIdTipoTransacaoNaoProcessada() {
    return idTipoTransacaoNaoProcessada;
  }
  public void setIdTipoTransacaoNaoProcessada(Long idTipoTransacaoNaoProcessada) {
    this.idTipoTransacaoNaoProcessada = idTipoTransacaoNaoProcessada;
  }

  
  /**
   * Identification Code of the Transaction (id) that generated the reversal
   **/
  public TransacaoNaoProcessadaResponse idTransacaoEstorno(Long idTransacaoEstorno) {
    this.idTransacaoEstorno = idTransacaoEstorno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Transaction (id) that generated the reversal")
  @JsonProperty("idTransacaoEstorno")
  public Long getIdTransacaoEstorno() {
    return idTransacaoEstorno;
  }
  public void setIdTransacaoEstorno(Long idTransacaoEstorno) {
    this.idTransacaoEstorno = idTransacaoEstorno;
  }

  
  /**
   * Merchant location
   **/
  public TransacaoNaoProcessadaResponse localidadeEstabelecimento(String localidadeEstabelecimento) {
    this.localidadeEstabelecimento = localidadeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Merchant location")
  @JsonProperty("localidadeEstabelecimento")
  public String getLocalidadeEstabelecimento() {
    return localidadeEstabelecimento;
  }
  public void setLocalidadeEstabelecimento(String localidadeEstabelecimento) {
    this.localidadeEstabelecimento = localidadeEstabelecimento;
  }

  
  /**
   * Describe the mode used to perform the card dates reading to make the transaction
   **/
  public TransacaoNaoProcessadaResponse modoEntradaTransacao(String modoEntradaTransacao) {
    this.modoEntradaTransacao = modoEntradaTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describe the mode used to perform the card dates reading to make the transaction")
  @JsonProperty("modoEntradaTransacao")
  public String getModoEntradaTransacao() {
    return modoEntradaTransacao;
  }
  public void setModoEntradaTransacao(String modoEntradaTransacao) {
    this.modoEntradaTransacao = modoEntradaTransacao;
  }

  
  /**
   * Merchant Name
   **/
  public TransacaoNaoProcessadaResponse nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Merchant Name")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Fantasy name of the Merchant
   **/
  public TransacaoNaoProcessadaResponse nomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fantasy name of the Merchant")
  @JsonProperty("nomeFantasiaEstabelecimento")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * Full name of the Cardholder
   **/
  public TransacaoNaoProcessadaResponse nomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Full name of the Cardholder")
  @JsonProperty("nomePortador")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * When the transaction is the installment type, show the number of the Parcels
   **/
  public TransacaoNaoProcessadaResponse parcela(Long parcela) {
    this.parcela = parcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When the transaction is the installment type, show the number of the Parcels")
  @JsonProperty("parcela")
  public Long getParcela() {
    return parcela;
  }
  public void setParcela(Long parcela) {
    this.parcela = parcela;
  }

  
  /**
   * When the transaction is the Installment type, show the total number of the parcels
   **/
  public TransacaoNaoProcessadaResponse plano(Long plano) {
    this.plano = plano;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When the transaction is the Installment type, show the total number of the parcels")
  @JsonProperty("plano")
  public Long getPlano() {
    return plano;
  }
  public void setPlano(Long plano) {
    this.plano = plano;
  }

  
  /**
   * Attributed that represents the identifier code of the transaction status
   **/
  public TransacaoNaoProcessadaResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attributed that represents the identifier code of the transaction status")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Value of the Boarding fee in Real (BRL) when the transaction is related to the purchase of airline tickets
   **/
  public TransacaoNaoProcessadaResponse taxaEmbarque(BigDecimal taxaEmbarque) {
    this.taxaEmbarque = taxaEmbarque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the Boarding fee in Real (BRL) when the transaction is related to the purchase of airline tickets")
  @JsonProperty("taxaEmbarque")
  public BigDecimal getTaxaEmbarque() {
    return taxaEmbarque;
  }
  public void setTaxaEmbarque(BigDecimal taxaEmbarque) {
    this.taxaEmbarque = taxaEmbarque;
  }

  
  /**
   * Transaction value in Real (BRL)
   **/
  public TransacaoNaoProcessadaResponse valorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Transaction value in Real (BRL)")
  @JsonProperty("valorBRL")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }
  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  
  /**
   * Entrance value in Real (BRL) when the transaction is installment type with the payment of an entrance value
   **/
  public TransacaoNaoProcessadaResponse valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Entrance value in Real (BRL) when the transaction is installment type with the payment of an entrance value")
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Transaction value in American Dollar (USD)
   **/
  public TransacaoNaoProcessadaResponse valorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Transaction value in American Dollar (USD)")
  @JsonProperty("valorUSD")
  public BigDecimal getValorUSD() {
    return valorUSD;
  }
  public void setValorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransacaoNaoProcessadaResponse transacaoNaoProcessadaResponse = (TransacaoNaoProcessadaResponse) o;
    return Objects.equals(this.cartaoMascarado, transacaoNaoProcessadaResponse.cartaoMascarado) &&
        Objects.equals(this.codigoAutorizacao, transacaoNaoProcessadaResponse.codigoAutorizacao) &&
        Objects.equals(this.codigoMCC, transacaoNaoProcessadaResponse.codigoMCC) &&
        Objects.equals(this.codigoMoedaDestino, transacaoNaoProcessadaResponse.codigoMoedaDestino) &&
        Objects.equals(this.codigoMoedaOrigem, transacaoNaoProcessadaResponse.codigoMoedaOrigem) &&
        Objects.equals(this.codigoReferencia, transacaoNaoProcessadaResponse.codigoReferencia) &&
        Objects.equals(this.codigoTerminal, transacaoNaoProcessadaResponse.codigoTerminal) &&
        Objects.equals(this.cotacaoUSD, transacaoNaoProcessadaResponse.cotacaoUSD) &&
        Objects.equals(this.dataCotacaoUSD, transacaoNaoProcessadaResponse.dataCotacaoUSD) &&
        Objects.equals(this.dataFaturamento, transacaoNaoProcessadaResponse.dataFaturamento) &&
        Objects.equals(this.dataOrigem, transacaoNaoProcessadaResponse.dataOrigem) &&
        Objects.equals(this.dataVencimentoReal, transacaoNaoProcessadaResponse.dataVencimentoReal) &&
        Objects.equals(this.descricaoAbreviada, transacaoNaoProcessadaResponse.descricaoAbreviada) &&
        Objects.equals(this.descricaoTipoTransacaoNaoProcessada, transacaoNaoProcessadaResponse.descricaoTipoTransacaoNaoProcessada) &&
        Objects.equals(this.detalhesTransacao, transacaoNaoProcessadaResponse.detalhesTransacao) &&
        Objects.equals(this.flagCredito, transacaoNaoProcessadaResponse.flagCredito) &&
        Objects.equals(this.flagFaturado, transacaoNaoProcessadaResponse.flagFaturado) &&
        Objects.equals(this.grupoDescricaoMCC, transacaoNaoProcessadaResponse.grupoDescricaoMCC) &&
        Objects.equals(this.grupoMCC, transacaoNaoProcessadaResponse.grupoMCC) &&
        Objects.equals(this.idConta, transacaoNaoProcessadaResponse.idConta) &&
        Objects.equals(this.idEstabelecimento, transacaoNaoProcessadaResponse.idEstabelecimento) &&
        Objects.equals(this.idTipoTransacaoNaoProcessada, transacaoNaoProcessadaResponse.idTipoTransacaoNaoProcessada) &&
        Objects.equals(this.idTransacaoEstorno, transacaoNaoProcessadaResponse.idTransacaoEstorno) &&
        Objects.equals(this.localidadeEstabelecimento, transacaoNaoProcessadaResponse.localidadeEstabelecimento) &&
        Objects.equals(this.modoEntradaTransacao, transacaoNaoProcessadaResponse.modoEntradaTransacao) &&
        Objects.equals(this.nomeEstabelecimento, transacaoNaoProcessadaResponse.nomeEstabelecimento) &&
        Objects.equals(this.nomeFantasiaEstabelecimento, transacaoNaoProcessadaResponse.nomeFantasiaEstabelecimento) &&
        Objects.equals(this.nomePortador, transacaoNaoProcessadaResponse.nomePortador) &&
        Objects.equals(this.parcela, transacaoNaoProcessadaResponse.parcela) &&
        Objects.equals(this.plano, transacaoNaoProcessadaResponse.plano) &&
        Objects.equals(this.status, transacaoNaoProcessadaResponse.status) &&
        Objects.equals(this.taxaEmbarque, transacaoNaoProcessadaResponse.taxaEmbarque) &&
        Objects.equals(this.valorBRL, transacaoNaoProcessadaResponse.valorBRL) &&
        Objects.equals(this.valorEntrada, transacaoNaoProcessadaResponse.valorEntrada) &&
        Objects.equals(this.valorUSD, transacaoNaoProcessadaResponse.valorUSD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartaoMascarado, codigoAutorizacao, codigoMCC, codigoMoedaDestino, codigoMoedaOrigem, codigoReferencia, codigoTerminal, cotacaoUSD, dataCotacaoUSD, dataFaturamento, dataOrigem, dataVencimentoReal, descricaoAbreviada, descricaoTipoTransacaoNaoProcessada, detalhesTransacao, flagCredito, flagFaturado, grupoDescricaoMCC, grupoMCC, idConta, idEstabelecimento, idTipoTransacaoNaoProcessada, idTransacaoEstorno, localidadeEstabelecimento, modoEntradaTransacao, nomeEstabelecimento, nomeFantasiaEstabelecimento, nomePortador, parcela, plano, status, taxaEmbarque, valorBRL, valorEntrada, valorUSD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoNaoProcessadaResponse {\n");
    
    sb.append("    cartaoMascarado: ").append(toIndentedString(cartaoMascarado)).append("\n");
    sb.append("    codigoAutorizacao: ").append(toIndentedString(codigoAutorizacao)).append("\n");
    sb.append("    codigoMCC: ").append(toIndentedString(codigoMCC)).append("\n");
    sb.append("    codigoMoedaDestino: ").append(toIndentedString(codigoMoedaDestino)).append("\n");
    sb.append("    codigoMoedaOrigem: ").append(toIndentedString(codigoMoedaOrigem)).append("\n");
    sb.append("    codigoReferencia: ").append(toIndentedString(codigoReferencia)).append("\n");
    sb.append("    codigoTerminal: ").append(toIndentedString(codigoTerminal)).append("\n");
    sb.append("    cotacaoUSD: ").append(toIndentedString(cotacaoUSD)).append("\n");
    sb.append("    dataCotacaoUSD: ").append(toIndentedString(dataCotacaoUSD)).append("\n");
    sb.append("    dataFaturamento: ").append(toIndentedString(dataFaturamento)).append("\n");
    sb.append("    dataOrigem: ").append(toIndentedString(dataOrigem)).append("\n");
    sb.append("    dataVencimentoReal: ").append(toIndentedString(dataVencimentoReal)).append("\n");
    sb.append("    descricaoAbreviada: ").append(toIndentedString(descricaoAbreviada)).append("\n");
    sb.append("    descricaoTipoTransacaoNaoProcessada: ").append(toIndentedString(descricaoTipoTransacaoNaoProcessada)).append("\n");
    sb.append("    detalhesTransacao: ").append(toIndentedString(detalhesTransacao)).append("\n");
    sb.append("    flagCredito: ").append(toIndentedString(flagCredito)).append("\n");
    sb.append("    flagFaturado: ").append(toIndentedString(flagFaturado)).append("\n");
    sb.append("    grupoDescricaoMCC: ").append(toIndentedString(grupoDescricaoMCC)).append("\n");
    sb.append("    grupoMCC: ").append(toIndentedString(grupoMCC)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    idTipoTransacaoNaoProcessada: ").append(toIndentedString(idTipoTransacaoNaoProcessada)).append("\n");
    sb.append("    idTransacaoEstorno: ").append(toIndentedString(idTransacaoEstorno)).append("\n");
    sb.append("    localidadeEstabelecimento: ").append(toIndentedString(localidadeEstabelecimento)).append("\n");
    sb.append("    modoEntradaTransacao: ").append(toIndentedString(modoEntradaTransacao)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
    sb.append("    nomeFantasiaEstabelecimento: ").append(toIndentedString(nomeFantasiaEstabelecimento)).append("\n");
    sb.append("    nomePortador: ").append(toIndentedString(nomePortador)).append("\n");
    sb.append("    parcela: ").append(toIndentedString(parcela)).append("\n");
    sb.append("    plano: ").append(toIndentedString(plano)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taxaEmbarque: ").append(toIndentedString(taxaEmbarque)).append("\n");
    sb.append("    valorBRL: ").append(toIndentedString(valorBRL)).append("\n");
    sb.append("    valorEntrada: ").append(toIndentedString(valorEntrada)).append("\n");
    sb.append("    valorUSD: ").append(toIndentedString(valorUSD)).append("\n");
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

