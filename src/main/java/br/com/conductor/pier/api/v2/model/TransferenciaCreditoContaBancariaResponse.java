package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Credit Transfer for the banking accounts
 **/

@ApiModel(description = "Credit Transfer for the banking accounts")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransferenciaCreditoContaBancariaResponse   {
  
  private Long idTransferencia = null;
  private BigDecimal valorCET = null;
  private Long idAutorizacao = null;
  private String codigoAutorizacao = null;
  private Long nsuOrigem = null;
  private Long idConta = null;
  private Long idCartao = null;
  private Long idOperacao = null;
  private BigDecimal valorCompra = null;
  private BigDecimal valorParcela = null;
  private BigDecimal valorContrato = null;
  private Integer numeroParcelas = null;
  private BigDecimal valorIOF = null;
  private BigDecimal valorTAC = null;
  private BigDecimal valorTaxaSaque = null;
  private BigDecimal taxaJuros = null;
  private String dataCompra = null;
  private String dataMovimento = null;
  private String dataVencimentoReal = null;
  private String dataVencimentoPadrao = null;
  private String dataAutorizacao = null;
  private Long banco = null;
  private String numeroAgencia = null;
  private String digitoAgencia = null;
  private String numeroConta = null;
  private String digitoConta = null;
  private Boolean flagContaPoupanca = null;
  private String documentoFavorecido = null;
  private String nomeFavorecido = null;
  private String status = null;
  private String statusProcessamento = null;

  
  /**
   * Identification Code of the Transfer
   **/
  public TransferenciaCreditoContaBancariaResponse idTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Transfer")
  @JsonProperty("idTransferencia")
  public Long getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  
  /**
   * Total cost effective taxe
   **/
  public TransferenciaCreditoContaBancariaResponse valorCET(BigDecimal valorCET) {
    this.valorCET = valorCET;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total cost effective taxe")
  @JsonProperty("valorCET")
  public BigDecimal getValorCET() {
    return valorCET;
  }
  public void setValorCET(BigDecimal valorCET) {
    this.valorCET = valorCET;
  }

  
  /**
   * Identification Code of the authorization
   **/
  public TransferenciaCreditoContaBancariaResponse idAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the authorization")
  @JsonProperty("idAutorizacao")
  public Long getIdAutorizacao() {
    return idAutorizacao;
  }
  public void setIdAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
  }

  
  /**
   * Authorization Code
   **/
  public TransferenciaCreditoContaBancariaResponse codigoAutorizacao(String codigoAutorizacao) {
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
   * NSU of the origin
   **/
  public TransferenciaCreditoContaBancariaResponse nsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "NSU of the origin")
  @JsonProperty("nsuOrigem")
  public Long getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * Identification Code of the Account
   **/
  public TransferenciaCreditoContaBancariaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Account")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the Card
   **/
  public TransferenciaCreditoContaBancariaResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Card")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Identification Code of the type of operation
   **/
  public TransferenciaCreditoContaBancariaResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the type of operation")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Value of the transfer
   **/
  public TransferenciaCreditoContaBancariaResponse valorCompra(BigDecimal valorCompra) {
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
   * Value of the parcel
   **/
  public TransferenciaCreditoContaBancariaResponse valorParcela(BigDecimal valorParcela) {
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
   * Value of the transfer added to the Withdrawal taxe value if there is withdrawal taxe
   **/
  public TransferenciaCreditoContaBancariaResponse valorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the transfer added to the Withdrawal taxe value if there is withdrawal taxe")
  @JsonProperty("valorContrato")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * N?mber of parcels
   **/
  public TransferenciaCreditoContaBancariaResponse numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N?mber of parcels")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Value of the IOF
   **/
  public TransferenciaCreditoContaBancariaResponse valorIOF(BigDecimal valorIOF) {
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
  public TransferenciaCreditoContaBancariaResponse valorTAC(BigDecimal valorTAC) {
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
   * Value of the withdrawal taxe
   **/
  public TransferenciaCreditoContaBancariaResponse valorTaxaSaque(BigDecimal valorTaxaSaque) {
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
   * Interest percentage
   **/
  public TransferenciaCreditoContaBancariaResponse taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Interest percentage")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Date of the transfer
   **/
  public TransferenciaCreditoContaBancariaResponse dataCompra(String dataCompra) {
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
   * Movement date
   **/
  public TransferenciaCreditoContaBancariaResponse dataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Movement date")
  @JsonProperty("dataMovimento")
  public String getDataMovimento() {
    return dataMovimento;
  }
  public void setDataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
  }

  
  /**
   * Expiration date of the invoice
   **/
  public TransferenciaCreditoContaBancariaResponse dataVencimentoReal(String dataVencimentoReal) {
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
   * Standard Expiration date of the invoice
   **/
  public TransferenciaCreditoContaBancariaResponse dataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Standard Expiration date of the invoice")
  @JsonProperty("dataVencimentoPadrao")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * Date of authorization
   **/
  public TransferenciaCreditoContaBancariaResponse dataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of authorization")
  @JsonProperty("dataAutorizacao")
  public String getDataAutorizacao() {
    return dataAutorizacao;
  }
  public void setDataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
  }

  
  /**
   * Bank Code
   **/
  public TransferenciaCreditoContaBancariaResponse banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Bank Code")
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
  public TransferenciaCreditoContaBancariaResponse numeroAgencia(String numeroAgencia) {
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
   * Digit of the Agency
   **/
  public TransferenciaCreditoContaBancariaResponse digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Digit of the Agency")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * Account number
   **/
  public TransferenciaCreditoContaBancariaResponse numeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Account number")
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
  public TransferenciaCreditoContaBancariaResponse digitoConta(String digitoConta) {
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
   * Type of the Account
   **/
  public TransferenciaCreditoContaBancariaResponse flagContaPoupanca(Boolean flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Type of the Account")
  @JsonProperty("flagContaPoupanca")
  public Boolean getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Boolean flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * Document of the favored
   **/
  public TransferenciaCreditoContaBancariaResponse documentoFavorecido(String documentoFavorecido) {
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
  public TransferenciaCreditoContaBancariaResponse nomeFavorecido(String nomeFavorecido) {
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

  
  /**
   * Code of the Status
   **/
  public TransferenciaCreditoContaBancariaResponse status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Code of the Status")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Status Processing
   **/
  public TransferenciaCreditoContaBancariaResponse statusProcessamento(String statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status Processing")
  @JsonProperty("statusProcessamento")
  public String getStatusProcessamento() {
    return statusProcessamento;
  }
  public void setStatusProcessamento(String statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferenciaCreditoContaBancariaResponse transferenciaCreditoContaBancariaResponse = (TransferenciaCreditoContaBancariaResponse) o;
    return Objects.equals(this.idTransferencia, transferenciaCreditoContaBancariaResponse.idTransferencia) &&
        Objects.equals(this.valorCET, transferenciaCreditoContaBancariaResponse.valorCET) &&
        Objects.equals(this.idAutorizacao, transferenciaCreditoContaBancariaResponse.idAutorizacao) &&
        Objects.equals(this.codigoAutorizacao, transferenciaCreditoContaBancariaResponse.codigoAutorizacao) &&
        Objects.equals(this.nsuOrigem, transferenciaCreditoContaBancariaResponse.nsuOrigem) &&
        Objects.equals(this.idConta, transferenciaCreditoContaBancariaResponse.idConta) &&
        Objects.equals(this.idCartao, transferenciaCreditoContaBancariaResponse.idCartao) &&
        Objects.equals(this.idOperacao, transferenciaCreditoContaBancariaResponse.idOperacao) &&
        Objects.equals(this.valorCompra, transferenciaCreditoContaBancariaResponse.valorCompra) &&
        Objects.equals(this.valorParcela, transferenciaCreditoContaBancariaResponse.valorParcela) &&
        Objects.equals(this.valorContrato, transferenciaCreditoContaBancariaResponse.valorContrato) &&
        Objects.equals(this.numeroParcelas, transferenciaCreditoContaBancariaResponse.numeroParcelas) &&
        Objects.equals(this.valorIOF, transferenciaCreditoContaBancariaResponse.valorIOF) &&
        Objects.equals(this.valorTAC, transferenciaCreditoContaBancariaResponse.valorTAC) &&
        Objects.equals(this.valorTaxaSaque, transferenciaCreditoContaBancariaResponse.valorTaxaSaque) &&
        Objects.equals(this.taxaJuros, transferenciaCreditoContaBancariaResponse.taxaJuros) &&
        Objects.equals(this.dataCompra, transferenciaCreditoContaBancariaResponse.dataCompra) &&
        Objects.equals(this.dataMovimento, transferenciaCreditoContaBancariaResponse.dataMovimento) &&
        Objects.equals(this.dataVencimentoReal, transferenciaCreditoContaBancariaResponse.dataVencimentoReal) &&
        Objects.equals(this.dataVencimentoPadrao, transferenciaCreditoContaBancariaResponse.dataVencimentoPadrao) &&
        Objects.equals(this.dataAutorizacao, transferenciaCreditoContaBancariaResponse.dataAutorizacao) &&
        Objects.equals(this.banco, transferenciaCreditoContaBancariaResponse.banco) &&
        Objects.equals(this.numeroAgencia, transferenciaCreditoContaBancariaResponse.numeroAgencia) &&
        Objects.equals(this.digitoAgencia, transferenciaCreditoContaBancariaResponse.digitoAgencia) &&
        Objects.equals(this.numeroConta, transferenciaCreditoContaBancariaResponse.numeroConta) &&
        Objects.equals(this.digitoConta, transferenciaCreditoContaBancariaResponse.digitoConta) &&
        Objects.equals(this.flagContaPoupanca, transferenciaCreditoContaBancariaResponse.flagContaPoupanca) &&
        Objects.equals(this.documentoFavorecido, transferenciaCreditoContaBancariaResponse.documentoFavorecido) &&
        Objects.equals(this.nomeFavorecido, transferenciaCreditoContaBancariaResponse.nomeFavorecido) &&
        Objects.equals(this.status, transferenciaCreditoContaBancariaResponse.status) &&
        Objects.equals(this.statusProcessamento, transferenciaCreditoContaBancariaResponse.statusProcessamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTransferencia, valorCET, idAutorizacao, codigoAutorizacao, nsuOrigem, idConta, idCartao, idOperacao, valorCompra, valorParcela, valorContrato, numeroParcelas, valorIOF, valorTAC, valorTaxaSaque, taxaJuros, dataCompra, dataMovimento, dataVencimentoReal, dataVencimentoPadrao, dataAutorizacao, banco, numeroAgencia, digitoAgencia, numeroConta, digitoConta, flagContaPoupanca, documentoFavorecido, nomeFavorecido, status, statusProcessamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaCreditoContaBancariaResponse {\n");
    
    sb.append("    idTransferencia: ").append(toIndentedString(idTransferencia)).append("\n");
    sb.append("    valorCET: ").append(toIndentedString(valorCET)).append("\n");
    sb.append("    idAutorizacao: ").append(toIndentedString(idAutorizacao)).append("\n");
    sb.append("    codigoAutorizacao: ").append(toIndentedString(codigoAutorizacao)).append("\n");
    sb.append("    nsuOrigem: ").append(toIndentedString(nsuOrigem)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
    sb.append("    valorCompra: ").append(toIndentedString(valorCompra)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    valorContrato: ").append(toIndentedString(valorContrato)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    valorIOF: ").append(toIndentedString(valorIOF)).append("\n");
    sb.append("    valorTAC: ").append(toIndentedString(valorTAC)).append("\n");
    sb.append("    valorTaxaSaque: ").append(toIndentedString(valorTaxaSaque)).append("\n");
    sb.append("    taxaJuros: ").append(toIndentedString(taxaJuros)).append("\n");
    sb.append("    dataCompra: ").append(toIndentedString(dataCompra)).append("\n");
    sb.append("    dataMovimento: ").append(toIndentedString(dataMovimento)).append("\n");
    sb.append("    dataVencimentoReal: ").append(toIndentedString(dataVencimentoReal)).append("\n");
    sb.append("    dataVencimentoPadrao: ").append(toIndentedString(dataVencimentoPadrao)).append("\n");
    sb.append("    dataAutorizacao: ").append(toIndentedString(dataAutorizacao)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    digitoAgencia: ").append(toIndentedString(digitoAgencia)).append("\n");
    sb.append("    numeroConta: ").append(toIndentedString(numeroConta)).append("\n");
    sb.append("    digitoConta: ").append(toIndentedString(digitoConta)).append("\n");
    sb.append("    flagContaPoupanca: ").append(toIndentedString(flagContaPoupanca)).append("\n");
    sb.append("    documentoFavorecido: ").append(toIndentedString(documentoFavorecido)).append("\n");
    sb.append("    nomeFavorecido: ").append(toIndentedString(nomeFavorecido)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusProcessamento: ").append(toIndentedString(statusProcessamento)).append("\n");
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

