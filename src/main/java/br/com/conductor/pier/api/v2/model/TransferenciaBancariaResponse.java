package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{transferencia_bancaria_response_description}}}
 **/

@ApiModel(description = "{{{transferencia_bancaria_response_description}}}")
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
   * {{{transferencia_bancaria_response_id_autorizacao_value}}}
   **/
  public TransferenciaBancariaResponse idAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_id_autorizacao_value}}}")
  @JsonProperty("idAutorizacao")
  public Long getIdAutorizacao() {
    return idAutorizacao;
  }
  public void setIdAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
  }

  
  /**
   * {{{transferencia_bancaria_response_id_transferencia_value}}}
   **/
  public TransferenciaBancariaResponse idTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_id_transferencia_value}}}")
  @JsonProperty("idTransferencia")
  public Long getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  
  /**
   * {{{transferencia_bancaria_response_codigo_autorizacao_value}}}
   **/
  public TransferenciaBancariaResponse codigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_codigo_autorizacao_value}}}")
  @JsonProperty("codigoAutorizacao")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * {{{transferencia_bancaria_response_data_autorizacao_value}}}
   **/
  public TransferenciaBancariaResponse dataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_data_autorizacao_value}}}")
  @JsonProperty("dataAutorizacao")
  public String getDataAutorizacao() {
    return dataAutorizacao;
  }
  public void setDataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
  }

  
  /**
   * {{{transferencia_bancaria_response_origem_value}}}
   **/
  public TransferenciaBancariaResponse origem(String origem) {
    this.origem = origem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_origem_value}}}")
  @JsonProperty("origem")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_value}}}
   **/
  public TransferenciaBancariaResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_valor_value}}}")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{transferencia_bancaria_response_id_operacao_value}}}
   **/
  public TransferenciaBancariaResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_id_operacao_value}}}")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * {{{transferencia_bancaria_response_terminal_value}}}
   **/
  public TransferenciaBancariaResponse terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_terminal_value}}}")
  @JsonProperty("terminal")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * {{{transferencia_bancaria_response_id_cartao_value}}}
   **/
  public TransferenciaBancariaResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_id_cartao_value}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{transferencia_bancaria_response_data_compra_value}}}
   **/
  public TransferenciaBancariaResponse dataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_data_compra_value}}}")
  @JsonProperty("dataCompra")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_compra_value}}}
   **/
  public TransferenciaBancariaResponse valorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_valor_compra_value}}}")
  @JsonProperty("valorCompra")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * {{{transferencia_bancaria_response_numero_parcelas_value}}}
   **/
  public TransferenciaBancariaResponse numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_numero_parcelas_value}}}")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_parcela_value}}}
   **/
  public TransferenciaBancariaResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_valor_parcela_value}}}")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * {{{transferencia_bancaria_response_id_estabelecimento_value}}}
   **/
  public TransferenciaBancariaResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_id_estabelecimento_value}}}")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{transferencia_bancaria_response_data_movimento_value}}}
   **/
  public TransferenciaBancariaResponse dataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_data_movimento_value}}}")
  @JsonProperty("dataMovimento")
  public String getDataMovimento() {
    return dataMovimento;
  }
  public void setDataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_contrato_value}}}
   **/
  public TransferenciaBancariaResponse valorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_valor_contrato_value}}}")
  @JsonProperty("valorContrato")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * {{{transferencia_bancaria_response_taxa_juros_value}}}
   **/
  public TransferenciaBancariaResponse taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_taxa_juros_value}}}")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_i_o_f_value}}}
   **/
  public TransferenciaBancariaResponse valorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_valor_i_o_f_value}}}")
  @JsonProperty("valorIOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_t_a_c_value}}}
   **/
  public TransferenciaBancariaResponse valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_valor_t_a_c_value}}}")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * {{{transferencia_bancaria_response_id_conta_value}}}
   **/
  public TransferenciaBancariaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_entrada_value}}}
   **/
  public TransferenciaBancariaResponse valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_valor_entrada_value}}}")
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * {{{transferencia_bancaria_response_data_vencimento_real_value}}}
   **/
  public TransferenciaBancariaResponse dataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_data_vencimento_real_value}}}")
  @JsonProperty("dataVencimentoReal")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * {{{transferencia_bancaria_response_data_vencimento_padrao_value}}}
   **/
  public TransferenciaBancariaResponse dataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_data_vencimento_padrao_value}}}")
  @JsonProperty("dataVencimentoPadrao")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * {{{transferencia_bancaria_response_id_conta_portador_value}}}
   **/
  public TransferenciaBancariaResponse idContaPortador(Long idContaPortador) {
    this.idContaPortador = idContaPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_id_conta_portador_value}}}")
  @JsonProperty("idContaPortador")
  public Long getIdContaPortador() {
    return idContaPortador;
  }
  public void setIdContaPortador(Long idContaPortador) {
    this.idContaPortador = idContaPortador;
  }

  
  /**
   * {{{transferencia_bancaria_response_numero_estabelecimento_value}}}
   **/
  public TransferenciaBancariaResponse numeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_numero_estabelecimento_value}}}")
  @JsonProperty("numeroEstabelecimento")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_taxa_saque_value}}}
   **/
  public TransferenciaBancariaResponse valorTaxaSaque(BigDecimal valorTaxaSaque) {
    this.valorTaxaSaque = valorTaxaSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_valor_taxa_saque_value}}}")
  @JsonProperty("valorTaxaSaque")
  public BigDecimal getValorTaxaSaque() {
    return valorTaxaSaque;
  }
  public void setValorTaxaSaque(BigDecimal valorTaxaSaque) {
    this.valorTaxaSaque = valorTaxaSaque;
  }

  
  /**
   * {{{transferencia_bancaria_response_banco_value}}}
   **/
  public TransferenciaBancariaResponse banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_banco_value}}}")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * {{{transferencia_bancaria_response_numero_agencia_value}}}
   **/
  public TransferenciaBancariaResponse numeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_numero_agencia_value}}}")
  @JsonProperty("numeroAgencia")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{transferencia_bancaria_response_digito_agencia_value}}}
   **/
  public TransferenciaBancariaResponse digitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_digito_agencia_value}}}")
  @JsonProperty("digitoAgencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * {{{transferencia_bancaria_response_numero_conta_value}}}
   **/
  public TransferenciaBancariaResponse numeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_numero_conta_value}}}")
  @JsonProperty("numeroConta")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * {{{transferencia_bancaria_response_digito_conta_value}}}
   **/
  public TransferenciaBancariaResponse digitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_digito_conta_value}}}")
  @JsonProperty("digitoConta")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * {{{transferencia_bancaria_response_flag_conta_poupanca_value}}}
   **/
  public TransferenciaBancariaResponse flagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_flag_conta_poupanca_value}}}")
  @JsonProperty("flagContaPoupanca")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * {{{transferencia_bancaria_response_documento_favorecido_value}}}
   **/
  public TransferenciaBancariaResponse documentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_documento_favorecido_value}}}")
  @JsonProperty("documentoFavorecido")
  public String getDocumentoFavorecido() {
    return documentoFavorecido;
  }
  public void setDocumentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
  }

  
  /**
   * {{{transferencia_bancaria_response_nome_favorecido_value}}}
   **/
  public TransferenciaBancariaResponse nomeFavorecido(String nomeFavorecido) {
    this.nomeFavorecido = nomeFavorecido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transferencia_bancaria_response_nome_favorecido_value}}}")
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



