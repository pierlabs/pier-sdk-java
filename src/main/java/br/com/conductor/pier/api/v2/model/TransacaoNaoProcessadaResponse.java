package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{transacao_nao_processada_response_description}}}
 **/

@ApiModel(description = "{{{transacao_nao_processada_response_description}}}")
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
   * {{{transacao_nao_processada_response_cartao_mascarado_value}}}
   **/
  public TransacaoNaoProcessadaResponse cartaoMascarado(String cartaoMascarado) {
    this.cartaoMascarado = cartaoMascarado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_cartao_mascarado_value}}}")
  @JsonProperty("cartaoMascarado")
  public String getCartaoMascarado() {
    return cartaoMascarado;
  }
  public void setCartaoMascarado(String cartaoMascarado) {
    this.cartaoMascarado = cartaoMascarado;
  }

  
  /**
   * {{{transacao_nao_processada_response_codigo_autorizacao_value}}}
   **/
  public TransacaoNaoProcessadaResponse codigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_codigo_autorizacao_value}}}")
  @JsonProperty("codigoAutorizacao")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * {{{transacao_nao_processada_response_codigo_mcc_value}}}
   **/
  public TransacaoNaoProcessadaResponse codigoMCC(Long codigoMCC) {
    this.codigoMCC = codigoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_codigo_mcc_value}}}")
  @JsonProperty("codigoMCC")
  public Long getCodigoMCC() {
    return codigoMCC;
  }
  public void setCodigoMCC(Long codigoMCC) {
    this.codigoMCC = codigoMCC;
  }

  
  /**
   * {{{transacao_nao_processada_response_codigo_moeda_destino_value}}}
   **/
  public TransacaoNaoProcessadaResponse codigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_codigo_moeda_destino_value}}}")
  @JsonProperty("codigoMoedaDestino")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * {{{transacao_nao_processada_response_codigo_moeda_origem_value}}}
   **/
  public TransacaoNaoProcessadaResponse codigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_codigo_moeda_origem_value}}}")
  @JsonProperty("codigoMoedaOrigem")
  public String getCodigoMoedaOrigem() {
    return codigoMoedaOrigem;
  }
  public void setCodigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
  }

  
  /**
   * {{{transacao_nao_processada_response_codigo_referencia_value}}}
   **/
  public TransacaoNaoProcessadaResponse codigoReferencia(String codigoReferencia) {
    this.codigoReferencia = codigoReferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_codigo_referencia_value}}}")
  @JsonProperty("codigoReferencia")
  public String getCodigoReferencia() {
    return codigoReferencia;
  }
  public void setCodigoReferencia(String codigoReferencia) {
    this.codigoReferencia = codigoReferencia;
  }

  
  /**
   * {{{transacao_nao_processada_response_codigo_terminal_value}}}
   **/
  public TransacaoNaoProcessadaResponse codigoTerminal(String codigoTerminal) {
    this.codigoTerminal = codigoTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_codigo_terminal_value}}}")
  @JsonProperty("codigoTerminal")
  public String getCodigoTerminal() {
    return codigoTerminal;
  }
  public void setCodigoTerminal(String codigoTerminal) {
    this.codigoTerminal = codigoTerminal;
  }

  
  /**
   * {{{transacao_nao_processada_response_cotacao_usd_value}}}
   **/
  public TransacaoNaoProcessadaResponse cotacaoUSD(BigDecimal cotacaoUSD) {
    this.cotacaoUSD = cotacaoUSD;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_cotacao_usd_value}}}")
  @JsonProperty("cotacaoUSD")
  public BigDecimal getCotacaoUSD() {
    return cotacaoUSD;
  }
  public void setCotacaoUSD(BigDecimal cotacaoUSD) {
    this.cotacaoUSD = cotacaoUSD;
  }

  
  /**
   * {{{transacao_nao_processada_response_data_cotacao_usd_value}}}
   **/
  public TransacaoNaoProcessadaResponse dataCotacaoUSD(String dataCotacaoUSD) {
    this.dataCotacaoUSD = dataCotacaoUSD;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_data_cotacao_usd_value}}}")
  @JsonProperty("dataCotacaoUSD")
  public String getDataCotacaoUSD() {
    return dataCotacaoUSD;
  }
  public void setDataCotacaoUSD(String dataCotacaoUSD) {
    this.dataCotacaoUSD = dataCotacaoUSD;
  }

  
  /**
   * {{{transacao_nao_processada_response_data_faturamento_value}}}
   **/
  public TransacaoNaoProcessadaResponse dataFaturamento(String dataFaturamento) {
    this.dataFaturamento = dataFaturamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_data_faturamento_value}}}")
  @JsonProperty("dataFaturamento")
  public String getDataFaturamento() {
    return dataFaturamento;
  }
  public void setDataFaturamento(String dataFaturamento) {
    this.dataFaturamento = dataFaturamento;
  }

  
  /**
   * {{{transacao_nao_processada_response_data_origem_value}}}
   **/
  public TransacaoNaoProcessadaResponse dataOrigem(String dataOrigem) {
    this.dataOrigem = dataOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_data_origem_value}}}")
  @JsonProperty("dataOrigem")
  public String getDataOrigem() {
    return dataOrigem;
  }
  public void setDataOrigem(String dataOrigem) {
    this.dataOrigem = dataOrigem;
  }

  
  /**
   * {{{transacao_nao_processada_response_data_vencimento_value}}}
   **/
  public TransacaoNaoProcessadaResponse dataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_data_vencimento_value}}}")
  @JsonProperty("dataVencimentoReal")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * {{{transacao_nao_processada_response_descricao_abreviada_value}}}
   **/
  public TransacaoNaoProcessadaResponse descricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_descricao_abreviada_value}}}")
  @JsonProperty("descricaoAbreviada")
  public String getDescricaoAbreviada() {
    return descricaoAbreviada;
  }
  public void setDescricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
  }

  
  /**
   * {{{transacao_nao_processada_response_descricao_tipo_transacao_nao_processada_value}}}
   **/
  public TransacaoNaoProcessadaResponse descricaoTipoTransacaoNaoProcessada(String descricaoTipoTransacaoNaoProcessada) {
    this.descricaoTipoTransacaoNaoProcessada = descricaoTipoTransacaoNaoProcessada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_descricao_tipo_transacao_nao_processada_value}}}")
  @JsonProperty("descricaoTipoTransacaoNaoProcessada")
  public String getDescricaoTipoTransacaoNaoProcessada() {
    return descricaoTipoTransacaoNaoProcessada;
  }
  public void setDescricaoTipoTransacaoNaoProcessada(String descricaoTipoTransacaoNaoProcessada) {
    this.descricaoTipoTransacaoNaoProcessada = descricaoTipoTransacaoNaoProcessada;
  }

  
  /**
   * {{{transacao_nao_processada_response_detalhes_transacao_value}}}
   **/
  public TransacaoNaoProcessadaResponse detalhesTransacao(String detalhesTransacao) {
    this.detalhesTransacao = detalhesTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_detalhes_transacao_value}}}")
  @JsonProperty("detalhesTransacao")
  public String getDetalhesTransacao() {
    return detalhesTransacao;
  }
  public void setDetalhesTransacao(String detalhesTransacao) {
    this.detalhesTransacao = detalhesTransacao;
  }

  
  /**
   * {{{transacao_nao_processada_response_flag_credito_value}}}
   **/
  public TransacaoNaoProcessadaResponse flagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_flag_credito_value}}}")
  @JsonProperty("flagCredito")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * {{{transacao_nao_processada_response_flag_faturado_value}}}
   **/
  public TransacaoNaoProcessadaResponse flagFaturado(Integer flagFaturado) {
    this.flagFaturado = flagFaturado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_flag_faturado_value}}}")
  @JsonProperty("flagFaturado")
  public Integer getFlagFaturado() {
    return flagFaturado;
  }
  public void setFlagFaturado(Integer flagFaturado) {
    this.flagFaturado = flagFaturado;
  }

  
  /**
   * {{{transacao_nao_processada_response_grupo_descricao_mcc_value}}}
   **/
  public TransacaoNaoProcessadaResponse grupoDescricaoMCC(String grupoDescricaoMCC) {
    this.grupoDescricaoMCC = grupoDescricaoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_grupo_descricao_mcc_value}}}")
  @JsonProperty("grupoDescricaoMCC")
  public String getGrupoDescricaoMCC() {
    return grupoDescricaoMCC;
  }
  public void setGrupoDescricaoMCC(String grupoDescricaoMCC) {
    this.grupoDescricaoMCC = grupoDescricaoMCC;
  }

  
  /**
   * {{{transacao_nao_processada_response_grupo_mcc_value}}}
   **/
  public TransacaoNaoProcessadaResponse grupoMCC(Long grupoMCC) {
    this.grupoMCC = grupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_grupo_mcc_value}}}")
  @JsonProperty("grupoMCC")
  public Long getGrupoMCC() {
    return grupoMCC;
  }
  public void setGrupoMCC(Long grupoMCC) {
    this.grupoMCC = grupoMCC;
  }

  
  /**
   * {{{transacao_nao_processada_response_id_conta_value}}}
   **/
  public TransacaoNaoProcessadaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{transacao_nao_processada_response_id_estabelecimento_value}}}
   **/
  public TransacaoNaoProcessadaResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_id_estabelecimento_value}}}")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{transacao_nao_processada_response_id_tipo_transacao_nao_processada_value}}}
   **/
  public TransacaoNaoProcessadaResponse idTipoTransacaoNaoProcessada(Long idTipoTransacaoNaoProcessada) {
    this.idTipoTransacaoNaoProcessada = idTipoTransacaoNaoProcessada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_id_tipo_transacao_nao_processada_value}}}")
  @JsonProperty("idTipoTransacaoNaoProcessada")
  public Long getIdTipoTransacaoNaoProcessada() {
    return idTipoTransacaoNaoProcessada;
  }
  public void setIdTipoTransacaoNaoProcessada(Long idTipoTransacaoNaoProcessada) {
    this.idTipoTransacaoNaoProcessada = idTipoTransacaoNaoProcessada;
  }

  
  /**
   * {{{transacao_nao_processada_response_id_transacao_estorno_value}}}
   **/
  public TransacaoNaoProcessadaResponse idTransacaoEstorno(Long idTransacaoEstorno) {
    this.idTransacaoEstorno = idTransacaoEstorno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_id_transacao_estorno_value}}}")
  @JsonProperty("idTransacaoEstorno")
  public Long getIdTransacaoEstorno() {
    return idTransacaoEstorno;
  }
  public void setIdTransacaoEstorno(Long idTransacaoEstorno) {
    this.idTransacaoEstorno = idTransacaoEstorno;
  }

  
  /**
   * {{{transacao_nao_processada_response_localidade_estabelecimento_value}}}
   **/
  public TransacaoNaoProcessadaResponse localidadeEstabelecimento(String localidadeEstabelecimento) {
    this.localidadeEstabelecimento = localidadeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_localidade_estabelecimento_value}}}")
  @JsonProperty("localidadeEstabelecimento")
  public String getLocalidadeEstabelecimento() {
    return localidadeEstabelecimento;
  }
  public void setLocalidadeEstabelecimento(String localidadeEstabelecimento) {
    this.localidadeEstabelecimento = localidadeEstabelecimento;
  }

  
  /**
   * {{{transacao_nao_processada_response_modo_entrada_transacao_value}}}
   **/
  public TransacaoNaoProcessadaResponse modoEntradaTransacao(String modoEntradaTransacao) {
    this.modoEntradaTransacao = modoEntradaTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_modo_entrada_transacao_value}}}")
  @JsonProperty("modoEntradaTransacao")
  public String getModoEntradaTransacao() {
    return modoEntradaTransacao;
  }
  public void setModoEntradaTransacao(String modoEntradaTransacao) {
    this.modoEntradaTransacao = modoEntradaTransacao;
  }

  
  /**
   * {{{transacao_nao_processada_response_nome_estabelecimento_value}}}
   **/
  public TransacaoNaoProcessadaResponse nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_nome_estabelecimento_value}}}")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * {{{transacao_nao_processada_response_nome_fantasia_estabelecimento_value}}}
   **/
  public TransacaoNaoProcessadaResponse nomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_nome_fantasia_estabelecimento_value}}}")
  @JsonProperty("nomeFantasiaEstabelecimento")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * {{{transacao_nao_processada_response_nome_portador_value}}}
   **/
  public TransacaoNaoProcessadaResponse nomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_nome_portador_value}}}")
  @JsonProperty("nomePortador")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * {{{transacao_nao_processada_response_numero_parcela_value}}}
   **/
  public TransacaoNaoProcessadaResponse parcela(Long parcela) {
    this.parcela = parcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_numero_parcela_value}}}")
  @JsonProperty("parcela")
  public Long getParcela() {
    return parcela;
  }
  public void setParcela(Long parcela) {
    this.parcela = parcela;
  }

  
  /**
   * {{{transacao_nao_processada_response_plano_parcelamento_value}}}
   **/
  public TransacaoNaoProcessadaResponse plano(Long plano) {
    this.plano = plano;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_plano_parcelamento_value}}}")
  @JsonProperty("plano")
  public Long getPlano() {
    return plano;
  }
  public void setPlano(Long plano) {
    this.plano = plano;
  }

  
  /**
   * {{{transacao_nao_processada_response_status_value}}}
   **/
  public TransacaoNaoProcessadaResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_status_value}}}")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {{{transacao_nao_processada_response_valor_taxa_embarque_value}}}
   **/
  public TransacaoNaoProcessadaResponse taxaEmbarque(BigDecimal taxaEmbarque) {
    this.taxaEmbarque = taxaEmbarque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_valor_taxa_embarque_value}}}")
  @JsonProperty("taxaEmbarque")
  public BigDecimal getTaxaEmbarque() {
    return taxaEmbarque;
  }
  public void setTaxaEmbarque(BigDecimal taxaEmbarque) {
    this.taxaEmbarque = taxaEmbarque;
  }

  
  /**
   * {{{transacao_nao_processada_response_valor_brl_value}}}
   **/
  public TransacaoNaoProcessadaResponse valorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_valor_brl_value}}}")
  @JsonProperty("valorBRL")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }
  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  
  /**
   * {{{transacao_nao_processada_response_valor_entrada_value}}}
   **/
  public TransacaoNaoProcessadaResponse valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_valor_entrada_value}}}")
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * {{{transacao_nao_processada_response_valor_usd_value}}}
   **/
  public TransacaoNaoProcessadaResponse valorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_nao_processada_response_valor_usd_value}}}")
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

