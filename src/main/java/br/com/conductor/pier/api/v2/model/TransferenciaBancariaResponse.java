package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Bank transfer
 **/

@ApiModel(description = "Bank transfer")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransferenciaBancariaResponse   {
  
  private Long nsuorigem = null;
  private Long idAutorizacao = null;
  private Long idTransferencia = null;
  private String codigoAutorizacao = null;
  private String dataAutorizacao = null;
  private String origem = null;
  private BigDecimal valor = null;
  private Long idOperacao = null;
  private String terminal = null;
  private Long idCartao = null;
  private String dataCompra = null;
  private BigDecimal valorCompra = null;
  private Integer numeroParcelas = null;
  private BigDecimal valorParcela = null;
  private Long idEstabelecimento = null;
  private String dataMovimento = null;
  private BigDecimal valorContrato = null;
  private BigDecimal taxaJuros = null;
  private BigDecimal valorIOF = null;
  private BigDecimal valorTAC = null;
  private Long idConta = null;
  private BigDecimal valorEntrada = null;
  private String dataVencimentoReal = null;
  private String dataVencimentoPadrao = null;
  private Long idContaPortador = null;
  private Long numeroEstabelecimento = null;
  private BigDecimal valorTaxaSaque = null;
  private Long banco = null;
  private String numeroAgencia = null;
  private String digitoAgencia = null;
  private String numeroConta = null;
  private String digitoConta = null;
  private Integer flagContaPoupanca = null;
  private String documentoFavorecido = null;
  private String nomeFavorecido = null;

  
  /**
   **/
  public TransferenciaBancariaResponse nsuorigem(Long nsuorigem) {
    this.nsuorigem = nsuorigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nsuorigem")
  public Long getNsuorigem() {
    return nsuorigem;
  }
  public void setNsuorigem(Long nsuorigem) {
    this.nsuorigem = nsuorigem;
  }

  
  /**
   * Identification Code of the Authorization (id)
   **/
  public TransferenciaBancariaResponse idAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Authorization (id)")
  @JsonProperty("idAutorizacao")
  public Long getIdAutorizacao() {
    return idAutorizacao;
  }
  public void setIdAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
  }

  
  /**
   * Identification Code of the transfer (id)
   **/
  public TransferenciaBancariaResponse idTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the transfer (id)")
  @JsonProperty("idTransferencia")
  public Long getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  
  /**
   * Authorization Code
   **/
  public TransferenciaBancariaResponse codigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Authorization Code")
  @JsonProperty("codigoAutorizacao")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * Date of the authorization
   **/
  public TransferenciaBancariaResponse dataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of the authorization")
  @JsonProperty("dataAutorizacao")
  public String getDataAutorizacao() {
    return dataAutorizacao;
  }
  public void setDataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
  }

  
  /**
   * Origin
   **/
  public TransferenciaBancariaResponse origem(String origem) {
    this.origem = origem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Origin")
  @JsonProperty("origem")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * Value
   **/
  public TransferenciaBancariaResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Identification type of the operation type (id)
   **/
  public TransferenciaBancariaResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification type of the operation type (id)")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Terminal
   **/
  public TransferenciaBancariaResponse terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Terminal")
  @JsonProperty("terminal")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * Identification code of the card (id)
   **/
  public TransferenciaBancariaResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification code of the card (id)")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Date of the transfer
   **/
  public TransferenciaBancariaResponse dataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of the transfer")
  @JsonProperty("dataCompra")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Value of the transfer
   **/
  public TransferenciaBancariaResponse valorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the transfer")
  @JsonProperty("valorCompra")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * Number of parcels
   **/
  public TransferenciaBancariaResponse numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of parcels")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Value of the parcel
   **/
  public TransferenciaBancariaResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the parcel")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Identification Code of the Merchant (id)
   **/
  public TransferenciaBancariaResponse idEstabelecimento(Long idEstabelecimento) {
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
   * Date of the movement
   **/
  public TransferenciaBancariaResponse dataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of the movement")
  @JsonProperty("dataMovimento")
  public String getDataMovimento() {
    return dataMovimento;
  }
  public void setDataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
  }

  
  /**
   * Transfer value added to the withdrawal rate value if there is withdrawal rate
   **/
  public TransferenciaBancariaResponse valorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Transfer value added to the withdrawal rate value if there is withdrawal rate")
  @JsonProperty("valorContrato")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * Percentage of interest
   **/
  public TransferenciaBancariaResponse taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of interest")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Value of the IOF
   **/
  public TransferenciaBancariaResponse valorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the IOF")
  @JsonProperty("valorIOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Value of the TAC
   **/
  public TransferenciaBancariaResponse valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the TAC")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Identification Code of the Account (id)
   **/
  public TransferenciaBancariaResponse idConta(Long idConta) {
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
   * Value of the entrance (first parcel)
   **/
  public TransferenciaBancariaResponse valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the entrance (first parcel)")
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Real expiration date of the invoice
   **/
  public TransferenciaBancariaResponse dataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Real expiration date of the invoice")
  @JsonProperty("dataVencimentoReal")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Expiration date of the invoice
   **/
  public TransferenciaBancariaResponse dataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expiration date of the invoice")
  @JsonProperty("dataVencimentoPadrao")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * Identification Code of the destination bank account (id)
   **/
  public TransferenciaBancariaResponse idContaPortador(Long idContaPortador) {
    this.idContaPortador = idContaPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the destination bank account (id)")
  @JsonProperty("idContaPortador")
  public Long getIdContaPortador() {
    return idContaPortador;
  }
  public void setIdContaPortador(Long idContaPortador) {
    this.idContaPortador = idContaPortador;
  }

  
  /**
   * Attributed that represent the number of the merchant
   **/
  public TransferenciaBancariaResponse numeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attributed that represent the number of the merchant")
  @JsonProperty("numeroEstabelecimento")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * Value of the withdrawal taxe
   **/
  public TransferenciaBancariaResponse valorTaxaSaque(BigDecimal valorTaxaSaque) {
    this.valorTaxaSaque = valorTaxaSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the withdrawal taxe")
  @JsonProperty("valorTaxaSaque")
  public BigDecimal getValorTaxaSaque() {
    return valorTaxaSaque;
  }
  public void setValorTaxaSaque(BigDecimal valorTaxaSaque) {
    this.valorTaxaSaque = valorTaxaSaque;
  }

  
  /**
   * Bank code
   **/
  public TransferenciaBancariaResponse banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Bank code")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * Agency number
   **/
  public TransferenciaBancariaResponse numeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agency number")
  @JsonProperty("numeroAgencia")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Digit of the agency
   **/
  public TransferenciaBancariaResponse digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Digit of the agency")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * Number of the account
   **/
  public TransferenciaBancariaResponse numeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of the account")
  @JsonProperty("numeroConta")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * Digit of the account
   **/
  public TransferenciaBancariaResponse digitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Digit of the account")
  @JsonProperty("digitoConta")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * Type of the account
   **/
  public TransferenciaBancariaResponse flagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the account")
  @JsonProperty("flagContaPoupanca")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * Document of the favored
   **/
  public TransferenciaBancariaResponse documentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Document of the favored")
  @JsonProperty("documentoFavorecido")
  public String getDocumentoFavorecido() {
    return documentoFavorecido;
  }
  public void setDocumentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
  }

  
  /**
   * Name of the favored
   **/
  public TransferenciaBancariaResponse nomeFavorecido(String nomeFavorecido) {
    this.nomeFavorecido = nomeFavorecido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the favored")
  @JsonProperty("nomeFavorecido")
  public String getNomeFavorecido() {
    return nomeFavorecido;
  }
  public void setNomeFavorecido(String nomeFavorecido) {
    this.nomeFavorecido = nomeFavorecido;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferenciaBancariaResponse transferenciaBancariaResponse = (TransferenciaBancariaResponse) o;
    return Objects.equals(this.nsuorigem, transferenciaBancariaResponse.nsuorigem) &&
        Objects.equals(this.idAutorizacao, transferenciaBancariaResponse.idAutorizacao) &&
        Objects.equals(this.idTransferencia, transferenciaBancariaResponse.idTransferencia) &&
        Objects.equals(this.codigoAutorizacao, transferenciaBancariaResponse.codigoAutorizacao) &&
        Objects.equals(this.dataAutorizacao, transferenciaBancariaResponse.dataAutorizacao) &&
        Objects.equals(this.origem, transferenciaBancariaResponse.origem) &&
        Objects.equals(this.valor, transferenciaBancariaResponse.valor) &&
        Objects.equals(this.idOperacao, transferenciaBancariaResponse.idOperacao) &&
        Objects.equals(this.terminal, transferenciaBancariaResponse.terminal) &&
        Objects.equals(this.idCartao, transferenciaBancariaResponse.idCartao) &&
        Objects.equals(this.dataCompra, transferenciaBancariaResponse.dataCompra) &&
        Objects.equals(this.valorCompra, transferenciaBancariaResponse.valorCompra) &&
        Objects.equals(this.numeroParcelas, transferenciaBancariaResponse.numeroParcelas) &&
        Objects.equals(this.valorParcela, transferenciaBancariaResponse.valorParcela) &&
        Objects.equals(this.idEstabelecimento, transferenciaBancariaResponse.idEstabelecimento) &&
        Objects.equals(this.dataMovimento, transferenciaBancariaResponse.dataMovimento) &&
        Objects.equals(this.valorContrato, transferenciaBancariaResponse.valorContrato) &&
        Objects.equals(this.taxaJuros, transferenciaBancariaResponse.taxaJuros) &&
        Objects.equals(this.valorIOF, transferenciaBancariaResponse.valorIOF) &&
        Objects.equals(this.valorTAC, transferenciaBancariaResponse.valorTAC) &&
        Objects.equals(this.idConta, transferenciaBancariaResponse.idConta) &&
        Objects.equals(this.valorEntrada, transferenciaBancariaResponse.valorEntrada) &&
        Objects.equals(this.dataVencimentoReal, transferenciaBancariaResponse.dataVencimentoReal) &&
        Objects.equals(this.dataVencimentoPadrao, transferenciaBancariaResponse.dataVencimentoPadrao) &&
        Objects.equals(this.idContaPortador, transferenciaBancariaResponse.idContaPortador) &&
        Objects.equals(this.numeroEstabelecimento, transferenciaBancariaResponse.numeroEstabelecimento) &&
        Objects.equals(this.valorTaxaSaque, transferenciaBancariaResponse.valorTaxaSaque) &&
        Objects.equals(this.banco, transferenciaBancariaResponse.banco) &&
        Objects.equals(this.numeroAgencia, transferenciaBancariaResponse.numeroAgencia) &&
        Objects.equals(this.digitoAgencia, transferenciaBancariaResponse.digitoAgencia) &&
        Objects.equals(this.numeroConta, transferenciaBancariaResponse.numeroConta) &&
        Objects.equals(this.digitoConta, transferenciaBancariaResponse.digitoConta) &&
        Objects.equals(this.flagContaPoupanca, transferenciaBancariaResponse.flagContaPoupanca) &&
        Objects.equals(this.documentoFavorecido, transferenciaBancariaResponse.documentoFavorecido) &&
        Objects.equals(this.nomeFavorecido, transferenciaBancariaResponse.nomeFavorecido);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuorigem, idAutorizacao, idTransferencia, codigoAutorizacao, dataAutorizacao, origem, valor, idOperacao, terminal, idCartao, dataCompra, valorCompra, numeroParcelas, valorParcela, idEstabelecimento, dataMovimento, valorContrato, taxaJuros, valorIOF, valorTAC, idConta, valorEntrada, dataVencimentoReal, dataVencimentoPadrao, idContaPortador, numeroEstabelecimento, valorTaxaSaque, banco, numeroAgencia, digitoAgencia, numeroConta, digitoConta, flagContaPoupanca, documentoFavorecido, nomeFavorecido);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaBancariaResponse {\n");
    
    sb.append("    nsuorigem: ").append(toIndentedString(nsuorigem)).append("\n");
    sb.append("    idAutorizacao: ").append(toIndentedString(idAutorizacao)).append("\n");
    sb.append("    idTransferencia: ").append(toIndentedString(idTransferencia)).append("\n");
    sb.append("    codigoAutorizacao: ").append(toIndentedString(codigoAutorizacao)).append("\n");
    sb.append("    dataAutorizacao: ").append(toIndentedString(dataAutorizacao)).append("\n");
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    dataCompra: ").append(toIndentedString(dataCompra)).append("\n");
    sb.append("    valorCompra: ").append(toIndentedString(valorCompra)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    dataMovimento: ").append(toIndentedString(dataMovimento)).append("\n");
    sb.append("    valorContrato: ").append(toIndentedString(valorContrato)).append("\n");
    sb.append("    taxaJuros: ").append(toIndentedString(taxaJuros)).append("\n");
    sb.append("    valorIOF: ").append(toIndentedString(valorIOF)).append("\n");
    sb.append("    valorTAC: ").append(toIndentedString(valorTAC)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    valorEntrada: ").append(toIndentedString(valorEntrada)).append("\n");
    sb.append("    dataVencimentoReal: ").append(toIndentedString(dataVencimentoReal)).append("\n");
    sb.append("    dataVencimentoPadrao: ").append(toIndentedString(dataVencimentoPadrao)).append("\n");
    sb.append("    idContaPortador: ").append(toIndentedString(idContaPortador)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
    sb.append("    valorTaxaSaque: ").append(toIndentedString(valorTaxaSaque)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    digitoAgencia: ").append(toIndentedString(digitoAgencia)).append("\n");
    sb.append("    numeroConta: ").append(toIndentedString(numeroConta)).append("\n");
    sb.append("    digitoConta: ").append(toIndentedString(digitoConta)).append("\n");
    sb.append("    flagContaPoupanca: ").append(toIndentedString(flagContaPoupanca)).append("\n");
    sb.append("    documentoFavorecido: ").append(toIndentedString(documentoFavorecido)).append("\n");
    sb.append("    nomeFavorecido: ").append(toIndentedString(nomeFavorecido)).append("\n");
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

