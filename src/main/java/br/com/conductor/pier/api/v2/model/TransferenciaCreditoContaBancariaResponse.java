package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias
 **/

@ApiModel(description = "Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias")
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
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transferencia.
   **/
  public TransferenciaCreditoContaBancariaResponse idTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transferencia.")
  @JsonProperty("idTransferencia")
  public Long getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  
  /**
   * Taxa de custo efetivo total.
   **/
  public TransferenciaCreditoContaBancariaResponse valorCET(BigDecimal valorCET) {
    this.valorCET = valorCET;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa de custo efetivo total.")
  @JsonProperty("valorCET")
  public BigDecimal getValorCET() {
    return valorCET;
  }
  public void setValorCET(BigDecimal valorCET) {
    this.valorCET = valorCET;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da autoriza\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransferenciaCreditoContaBancariaResponse idAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da autoriza\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("idAutorizacao")
  public Long getIdAutorizacao() {
    return idAutorizacao;
  }
  public void setIdAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
  }

  
  /**
   * C\u00C3\u00B3digo da autoriza\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransferenciaCreditoContaBancariaResponse codigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo da autoriza\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("codigoAutorizacao")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * NSU de origem.
   **/
  public TransferenciaCreditoContaBancariaResponse nsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "NSU de origem.")
  @JsonProperty("nsuOrigem")
  public Long getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta.
   **/
  public TransferenciaCreditoContaBancariaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta.")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o.
   **/
  public TransferenciaCreditoContaBancariaResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o.")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de opera\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransferenciaCreditoContaBancariaResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de opera\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Valor da transfer\u00C3\u00AAncia.
   **/
  public TransferenciaCreditoContaBancariaResponse valorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da transfer\u00C3\u00AAncia.")
  @JsonProperty("valorCompra")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * Valor da parcela.
   **/
  public TransferenciaCreditoContaBancariaResponse valorParcela(BigDecimal valorParcela) {
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
   * Valor da transfer\u00C3\u00AAncia acrescido do valor da tarifa de saque se houver tarifa de saque.
   **/
  public TransferenciaCreditoContaBancariaResponse valorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da transfer\u00C3\u00AAncia acrescido do valor da tarifa de saque se houver tarifa de saque.")
  @JsonProperty("valorContrato")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * N\u00C3\u00BAmero de parcelas.
   **/
  public TransferenciaCreditoContaBancariaResponse numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero de parcelas.")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Valor do IOF.
   **/
  public TransferenciaCreditoContaBancariaResponse valorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do IOF.")
  @JsonProperty("valorIOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Valor da TAC.
   **/
  public TransferenciaCreditoContaBancariaResponse valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da TAC.")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Valor da taxa saque.
   **/
  public TransferenciaCreditoContaBancariaResponse valorTaxaSaque(BigDecimal valorTaxaSaque) {
    this.valorTaxaSaque = valorTaxaSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da taxa saque.")
  @JsonProperty("valorTaxaSaque")
  public BigDecimal getValorTaxaSaque() {
    return valorTaxaSaque;
  }
  public void setValorTaxaSaque(BigDecimal valorTaxaSaque) {
    this.valorTaxaSaque = valorTaxaSaque;
  }

  
  /**
   * Percentual de juros.
   **/
  public TransferenciaCreditoContaBancariaResponse taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentual de juros.")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Data da transfer\u00C3\u00AAncia.
   **/
  public TransferenciaCreditoContaBancariaResponse dataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da transfer\u00C3\u00AAncia.")
  @JsonProperty("dataCompra")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Data do movimento.
   **/
  public TransferenciaCreditoContaBancariaResponse dataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data do movimento.")
  @JsonProperty("dataMovimento")
  public String getDataMovimento() {
    return dataMovimento;
  }
  public void setDataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
  }

  
  /**
   * Data do vencimento real da fatura.
   **/
  public TransferenciaCreditoContaBancariaResponse dataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data do vencimento real da fatura.")
  @JsonProperty("dataVencimentoReal")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Dia do vencimento padr\u00C3\u00A3o da fatura.
   **/
  public TransferenciaCreditoContaBancariaResponse dataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dia do vencimento padr\u00C3\u00A3o da fatura.")
  @JsonProperty("dataVencimentoPadrao")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * Data da autoriza\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransferenciaCreditoContaBancariaResponse dataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da autoriza\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("dataAutorizacao")
  public String getDataAutorizacao() {
    return dataAutorizacao;
  }
  public void setDataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
  }

  
  /**
   * C\u00C3\u00B3digo do Banco.
   **/
  public TransferenciaCreditoContaBancariaResponse banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo do Banco.")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * N\u00C3\u00BAmero da Ag\u00C3\u00AAncia.
   **/
  public TransferenciaCreditoContaBancariaResponse numeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero da Ag\u00C3\u00AAncia.")
  @JsonProperty("numeroAgencia")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * D\u00C3\u00ADgito da Ag\u00C3\u00AAncia.
   **/
  public TransferenciaCreditoContaBancariaResponse digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00C3\u00ADgito da Ag\u00C3\u00AAncia.")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * N\u00C3\u00BAmero da Conta.
   **/
  public TransferenciaCreditoContaBancariaResponse numeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero da Conta.")
  @JsonProperty("numeroConta")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * D\u00C3\u00ADgito da Conta.
   **/
  public TransferenciaCreditoContaBancariaResponse digitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00C3\u00ADgito da Conta.")
  @JsonProperty("digitoConta")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * Tipo da Conta.
   **/
  public TransferenciaCreditoContaBancariaResponse flagContaPoupanca(Boolean flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Tipo da Conta.")
  @JsonProperty("flagContaPoupanca")
  public Boolean getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Boolean flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * Documento do Favorecido.
   **/
  public TransferenciaCreditoContaBancariaResponse documentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Documento do Favorecido.")
  @JsonProperty("documentoFavorecido")
  public String getDocumentoFavorecido() {
    return documentoFavorecido;
  }
  public void setDocumentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
  }

  
  /**
   * Nome do Favorecido.
   **/
  public TransferenciaCreditoContaBancariaResponse nomeFavorecido(String nomeFavorecido) {
    this.nomeFavorecido = nomeFavorecido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Favorecido.")
  @JsonProperty("nomeFavorecido")
  public String getNomeFavorecido() {
    return nomeFavorecido;
  }
  public void setNomeFavorecido(String nomeFavorecido) {
    this.nomeFavorecido = nomeFavorecido;
  }

  
  /**
   * C\u00C3\u00B3digo do Status
   **/
  public TransferenciaCreditoContaBancariaResponse status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo do Status")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Status Processamento.
   **/
  public TransferenciaCreditoContaBancariaResponse statusProcessamento(String statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status Processamento.")
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



