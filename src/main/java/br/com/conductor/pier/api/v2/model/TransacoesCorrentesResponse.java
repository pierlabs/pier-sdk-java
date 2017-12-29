package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto transacoes correntes
 **/

@ApiModel(description = "Objeto transacoes correntes")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransacoesCorrentesResponse   {
  
  private Long id = null;
  private Long idTipoTransacao = null;
  private String descricaoAbreviada = null;
  private String statusTransacao = null;
  private Long idEvento = null;
  private String tipoEvento = null;
  private Long idConta = null;
  private String cartaoMascarado = null;
  private String nomePortador = null;
  private String dataTransacao = null;
  private String dataFaturamento = null;
  private String dataVencimento = null;
  private String modoEntradaTransacao = null;
  private BigDecimal valorTaxaEmbarque = null;
  private BigDecimal valorEntrada = null;
  private BigDecimal valorBRL = null;
  private BigDecimal valorUSD = null;
  private BigDecimal cotacaoUSD = null;
  private String dataCotacaoUSD = null;
  private String codigoMoedaOrigem = null;
  private String codigoMoedaDestino = null;
  private String codigoAutorizacao = null;
  private String codigoReferencia = null;
  private String codigoTerminal = null;
  private Long codigoMCC = null;
  private Long grupoMCC = null;
  private String grupoDescricaoMCC = null;
  private Long idEstabelecimento = null;
  private String nomeEstabelecimento = null;
  private String nomeFantasiaEstabelecimento = null;
  private String localidadeEstabelecimento = null;
  private Long planoParcelamento = null;
  private Long numeroParcela = null;
  private String detalhesTransacao = null;
  private Integer flagCredito = null;
  private Integer flagFaturado = null;
  private Integer flagEstorno = null;
  private Long idTransacaoEstorno = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transfer\u00C3\u00AAncia (id).
   **/
  public TransacoesCorrentesResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transfer\u00C3\u00AAncia (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo da Transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransacoesCorrentesResponse idTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo da Transa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("idTipoTransacao")
  public Long getIdTipoTransacao() {
    return idTipoTransacao;
  }
  public void setIdTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o Abreviada da Transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransacoesCorrentesResponse descricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o Abreviada da Transa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("descricaoAbreviada")
  public String getDescricaoAbreviada() {
    return descricaoAbreviada;
  }
  public void setDescricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
  }

  
  /**
   * Status de Processamento da Transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransacoesCorrentesResponse statusTransacao(String statusTransacao) {
    this.statusTransacao = statusTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status de Processamento da Transa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("statusTransacao")
  public String getStatusTransacao() {
    return statusTransacao;
  }
  public void setStatusTransacao(String statusTransacao) {
    this.statusTransacao = statusTransacao;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Evento que originou a Transa\u00C3\u00A7\u00C3\u00A3o (id).
   **/
  public TransacoesCorrentesResponse idEvento(Long idEvento) {
    this.idEvento = idEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Evento que originou a Transa\u00C3\u00A7\u00C3\u00A3o (id).")
  @JsonProperty("idEvento")
  public Long getIdEvento() {
    return idEvento;
  }
  public void setIdEvento(Long idEvento) {
    this.idEvento = idEvento;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do Evento que representa a Transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransacoesCorrentesResponse tipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do Evento que representa a Transa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("tipoEvento")
  public String getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id).
   **/
  public TransacoesCorrentesResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id).")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * N\u00C3\u00BAmero do Cart\u00C3\u00A3o em Formato 0000XXXXXXXX0000.
   **/
  public TransacoesCorrentesResponse cartaoMascarado(String cartaoMascarado) {
    this.cartaoMascarado = cartaoMascarado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do Cart\u00C3\u00A3o em Formato 0000XXXXXXXX0000.")
  @JsonProperty("cartaoMascarado")
  public String getCartaoMascarado() {
    return cartaoMascarado;
  }
  public void setCartaoMascarado(String cartaoMascarado) {
    this.cartaoMascarado = cartaoMascarado;
  }

  
  /**
   * Nome completo do Portador do Cart\u00C3\u00A3o.
   **/
  public TransacoesCorrentesResponse nomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome completo do Portador do Cart\u00C3\u00A3o.")
  @JsonProperty("nomePortador")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * Data em que a Transa\u00C3\u00A7\u00C3\u00A3o foi realizada.
   **/
  public TransacoesCorrentesResponse dataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data em que a Transa\u00C3\u00A7\u00C3\u00A3o foi realizada.")
  @JsonProperty("dataTransacao")
  public String getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * Data de Faturamento da Transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransacoesCorrentesResponse dataFaturamento(String dataFaturamento) {
    this.dataFaturamento = dataFaturamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Faturamento da Transa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("dataFaturamento")
  public String getDataFaturamento() {
    return dataFaturamento;
  }
  public void setDataFaturamento(String dataFaturamento) {
    this.dataFaturamento = dataFaturamento;
  }

  
  /**
   * Data de Vencimento da Fatura.
   **/
  public TransacoesCorrentesResponse dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Vencimento da Fatura.")
  @JsonProperty("dataVencimento")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Descreve o modo utilizado para realizar a leitura dos dados do cart\u00C3\u00A3o para realizar a Transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransacoesCorrentesResponse modoEntradaTransacao(String modoEntradaTransacao) {
    this.modoEntradaTransacao = modoEntradaTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descreve o modo utilizado para realizar a leitura dos dados do cart\u00C3\u00A3o para realizar a Transa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("modoEntradaTransacao")
  public String getModoEntradaTransacao() {
    return modoEntradaTransacao;
  }
  public void setModoEntradaTransacao(String modoEntradaTransacao) {
    this.modoEntradaTransacao = modoEntradaTransacao;
  }

  
  /**
   * Valor da Taxa de Embarque em Real (BRL) quando a transa\u00C3\u00A7\u00C3\u00A3o for relacionada a Compra de Passagens A\u00C3\u00A9reas.
   **/
  public TransacoesCorrentesResponse valorTaxaEmbarque(BigDecimal valorTaxaEmbarque) {
    this.valorTaxaEmbarque = valorTaxaEmbarque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da Taxa de Embarque em Real (BRL) quando a transa\u00C3\u00A7\u00C3\u00A3o for relacionada a Compra de Passagens A\u00C3\u00A9reas.")
  @JsonProperty("valorTaxaEmbarque")
  public BigDecimal getValorTaxaEmbarque() {
    return valorTaxaEmbarque;
  }
  public void setValorTaxaEmbarque(BigDecimal valorTaxaEmbarque) {
    this.valorTaxaEmbarque = valorTaxaEmbarque;
  }

  
  /**
   * Valor da Entrada em Real (BRL) quando a transa\u00C3\u00A7\u00C3\u00A3o for do tipo Parcelada com o pagamento de um valor de Entrada.
   **/
  public TransacoesCorrentesResponse valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da Entrada em Real (BRL) quando a transa\u00C3\u00A7\u00C3\u00A3o for do tipo Parcelada com o pagamento de um valor de Entrada.")
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Valor da Transa\u00C3\u00A7\u00C3\u00A3o em Real (BRL).
   **/
  public TransacoesCorrentesResponse valorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da Transa\u00C3\u00A7\u00C3\u00A3o em Real (BRL).")
  @JsonProperty("valorBRL")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }
  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  
  /**
   * Valor da Transa\u00C3\u00A7\u00C3\u00A3o em D\u00C3\u00B3lar Americano (USD).
   **/
  public TransacoesCorrentesResponse valorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da Transa\u00C3\u00A7\u00C3\u00A3o em D\u00C3\u00B3lar Americano (USD).")
  @JsonProperty("valorUSD")
  public BigDecimal getValorUSD() {
    return valorUSD;
  }
  public void setValorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
  }

  
  /**
   * Valor do D\u00C3\u00B3lar Americano (USD) convertido em Real (BRL).
   **/
  public TransacoesCorrentesResponse cotacaoUSD(BigDecimal cotacaoUSD) {
    this.cotacaoUSD = cotacaoUSD;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do D\u00C3\u00B3lar Americano (USD) convertido em Real (BRL).")
  @JsonProperty("cotacaoUSD")
  public BigDecimal getCotacaoUSD() {
    return cotacaoUSD;
  }
  public void setCotacaoUSD(BigDecimal cotacaoUSD) {
    this.cotacaoUSD = cotacaoUSD;
  }

  
  /**
   * Data de Fechamento da Cota\u00C3\u00A7\u00C3\u00A3o do D\u00C3\u00B3lar Americano (USD).
   **/
  public TransacoesCorrentesResponse dataCotacaoUSD(String dataCotacaoUSD) {
    this.dataCotacaoUSD = dataCotacaoUSD;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Fechamento da Cota\u00C3\u00A7\u00C3\u00A3o do D\u00C3\u00B3lar Americano (USD).")
  @JsonProperty("dataCotacaoUSD")
  public String getDataCotacaoUSD() {
    return dataCotacaoUSD;
  }
  public void setDataCotacaoUSD(String dataCotacaoUSD) {
    this.dataCotacaoUSD = dataCotacaoUSD;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Moeda utilizada na Transa\u00C3\u00A7\u00C3\u00A3o, seguindo padr\u00C3\u00A3o ISO 4217.
   **/
  public TransacoesCorrentesResponse codigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Moeda utilizada na Transa\u00C3\u00A7\u00C3\u00A3o, seguindo padr\u00C3\u00A3o ISO 4217.")
  @JsonProperty("codigoMoedaOrigem")
  public String getCodigoMoedaOrigem() {
    return codigoMoedaOrigem;
  }
  public void setCodigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Moeda da Transa\u00C3\u00A7\u00C3\u00A3o ap\u00C3\u00B3s a convers\u00C3\u00A3o, seguindo padr\u00C3\u00A3o ISO 4217.
   **/
  public TransacoesCorrentesResponse codigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Moeda da Transa\u00C3\u00A7\u00C3\u00A3o ap\u00C3\u00B3s a convers\u00C3\u00A3o, seguindo padr\u00C3\u00A3o ISO 4217.")
  @JsonProperty("codigoMoedaDestino")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * C\u00C3\u00B3digo de Autoriza\u00C3\u00A7\u00C3\u00A3o da Transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransacoesCorrentesResponse codigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Autoriza\u00C3\u00A7\u00C3\u00A3o da Transa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("codigoAutorizacao")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * C\u00C3\u00B3digo de Refer\u00C3\u00AAncia da Transa\u00C3\u00A7\u00C3\u00A3o quando utilizado Cart\u00C3\u00A3o Bandeirado.
   **/
  public TransacoesCorrentesResponse codigoReferencia(String codigoReferencia) {
    this.codigoReferencia = codigoReferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Refer\u00C3\u00AAncia da Transa\u00C3\u00A7\u00C3\u00A3o quando utilizado Cart\u00C3\u00A3o Bandeirado.")
  @JsonProperty("codigoReferencia")
  public String getCodigoReferencia() {
    return codigoReferencia;
  }
  public void setCodigoReferencia(String codigoReferencia) {
    this.codigoReferencia = codigoReferencia;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da origem da captura da Transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransacoesCorrentesResponse codigoTerminal(String codigoTerminal) {
    this.codigoTerminal = codigoTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da origem da captura da Transa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("codigoTerminal")
  public String getCodigoTerminal() {
    return codigoTerminal;
  }
  public void setCodigoTerminal(String codigoTerminal) {
    this.codigoTerminal = codigoTerminal;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da categoria do Estabelecimento.
   **/
  public TransacoesCorrentesResponse codigoMCC(Long codigoMCC) {
    this.codigoMCC = codigoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da categoria do Estabelecimento.")
  @JsonProperty("codigoMCC")
  public Long getCodigoMCC() {
    return codigoMCC;
  }
  public void setCodigoMCC(Long codigoMCC) {
    this.codigoMCC = codigoMCC;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do grupo do Estabelecimento.
   **/
  public TransacoesCorrentesResponse grupoMCC(Long grupoMCC) {
    this.grupoMCC = grupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do grupo do Estabelecimento.")
  @JsonProperty("grupoMCC")
  public Long getGrupoMCC() {
    return grupoMCC;
  }
  public void setGrupoMCC(Long grupoMCC) {
    this.grupoMCC = grupoMCC;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do grupo do Estabelecimento.
   **/
  public TransacoesCorrentesResponse grupoDescricaoMCC(String grupoDescricaoMCC) {
    this.grupoDescricaoMCC = grupoDescricaoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do grupo do Estabelecimento.")
  @JsonProperty("grupoDescricaoMCC")
  public String getGrupoDescricaoMCC() {
    return grupoDescricaoMCC;
  }
  public void setGrupoDescricaoMCC(String grupoDescricaoMCC) {
    this.grupoDescricaoMCC = grupoDescricaoMCC;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento (id).
   **/
  public TransacoesCorrentesResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento (id).")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Nome do Estabelecimento.
   **/
  public TransacoesCorrentesResponse nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Estabelecimento.")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Nome Fantasia do Estabelecimento.
   **/
  public TransacoesCorrentesResponse nomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome Fantasia do Estabelecimento.")
  @JsonProperty("nomeFantasiaEstabelecimento")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * Localidade do Estabelecimento.
   **/
  public TransacoesCorrentesResponse localidadeEstabelecimento(String localidadeEstabelecimento) {
    this.localidadeEstabelecimento = localidadeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Localidade do Estabelecimento.")
  @JsonProperty("localidadeEstabelecimento")
  public String getLocalidadeEstabelecimento() {
    return localidadeEstabelecimento;
  }
  public void setLocalidadeEstabelecimento(String localidadeEstabelecimento) {
    this.localidadeEstabelecimento = localidadeEstabelecimento;
  }

  
  /**
   * Quando a Transa\u00C3\u00A7\u00C3\u00A3o for do tipo Parcelada, apresenta o n\u00C3\u00BAmero total de Parcelas.
   **/
  public TransacoesCorrentesResponse planoParcelamento(Long planoParcelamento) {
    this.planoParcelamento = planoParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando a Transa\u00C3\u00A7\u00C3\u00A3o for do tipo Parcelada, apresenta o n\u00C3\u00BAmero total de Parcelas.")
  @JsonProperty("planoParcelamento")
  public Long getPlanoParcelamento() {
    return planoParcelamento;
  }
  public void setPlanoParcelamento(Long planoParcelamento) {
    this.planoParcelamento = planoParcelamento;
  }

  
  /**
   * Quando a Transa\u00C3\u00A7\u00C3\u00A3o for do tipo Parcelada, apresenta o n\u00C3\u00BAmero da Parcela.
   **/
  public TransacoesCorrentesResponse numeroParcela(Long numeroParcela) {
    this.numeroParcela = numeroParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando a Transa\u00C3\u00A7\u00C3\u00A3o for do tipo Parcelada, apresenta o n\u00C3\u00BAmero da Parcela.")
  @JsonProperty("numeroParcela")
  public Long getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Long numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * Detalhes complementares a respeito da Transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransacoesCorrentesResponse detalhesTransacao(String detalhesTransacao) {
    this.detalhesTransacao = detalhesTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detalhes complementares a respeito da Transa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("detalhesTransacao")
  public String getDetalhesTransacao() {
    return detalhesTransacao;
  }
  public void setDetalhesTransacao(String detalhesTransacao) {
    this.detalhesTransacao = detalhesTransacao;
  }

  
  /**
   * Quando ativa, indica que a Transa\u00C3\u00A7\u00C3\u00A3o \u00C3\u00A9 do Tipo 'Cr\u00C3\u00A9dito'.
   **/
  public TransacoesCorrentesResponse flagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando ativa, indica que a Transa\u00C3\u00A7\u00C3\u00A3o \u00C3\u00A9 do Tipo 'Cr\u00C3\u00A9dito'.")
  @JsonProperty("flagCredito")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * Quando ativa, indica que a Transa\u00C3\u00A7\u00C3\u00A3o foi consolidada em uma Fatura.
   **/
  public TransacoesCorrentesResponse flagFaturado(Integer flagFaturado) {
    this.flagFaturado = flagFaturado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando ativa, indica que a Transa\u00C3\u00A7\u00C3\u00A3o foi consolidada em uma Fatura.")
  @JsonProperty("flagFaturado")
  public Integer getFlagFaturado() {
    return flagFaturado;
  }
  public void setFlagFaturado(Integer flagFaturado) {
    this.flagFaturado = flagFaturado;
  }

  
  /**
   * Quando ativa, indica que a Transa\u00C3\u00A7\u00C3\u00A3o foi estornada.
   **/
  public TransacoesCorrentesResponse flagEstorno(Integer flagEstorno) {
    this.flagEstorno = flagEstorno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando ativa, indica que a Transa\u00C3\u00A7\u00C3\u00A3o foi estornada.")
  @JsonProperty("flagEstorno")
  public Integer getFlagEstorno() {
    return flagEstorno;
  }
  public void setFlagEstorno(Integer flagEstorno) {
    this.flagEstorno = flagEstorno;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Transa\u00C3\u00A7\u00C3\u00A3o (id) que gerou o estorno.
   **/
  public TransacoesCorrentesResponse idTransacaoEstorno(Long idTransacaoEstorno) {
    this.idTransacaoEstorno = idTransacaoEstorno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Transa\u00C3\u00A7\u00C3\u00A3o (id) que gerou o estorno.")
  @JsonProperty("idTransacaoEstorno")
  public Long getIdTransacaoEstorno() {
    return idTransacaoEstorno;
  }
  public void setIdTransacaoEstorno(Long idTransacaoEstorno) {
    this.idTransacaoEstorno = idTransacaoEstorno;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransacoesCorrentesResponse transacoesCorrentesResponse = (TransacoesCorrentesResponse) o;
    return Objects.equals(this.id, transacoesCorrentesResponse.id) &&
        Objects.equals(this.idTipoTransacao, transacoesCorrentesResponse.idTipoTransacao) &&
        Objects.equals(this.descricaoAbreviada, transacoesCorrentesResponse.descricaoAbreviada) &&
        Objects.equals(this.statusTransacao, transacoesCorrentesResponse.statusTransacao) &&
        Objects.equals(this.idEvento, transacoesCorrentesResponse.idEvento) &&
        Objects.equals(this.tipoEvento, transacoesCorrentesResponse.tipoEvento) &&
        Objects.equals(this.idConta, transacoesCorrentesResponse.idConta) &&
        Objects.equals(this.cartaoMascarado, transacoesCorrentesResponse.cartaoMascarado) &&
        Objects.equals(this.nomePortador, transacoesCorrentesResponse.nomePortador) &&
        Objects.equals(this.dataTransacao, transacoesCorrentesResponse.dataTransacao) &&
        Objects.equals(this.dataFaturamento, transacoesCorrentesResponse.dataFaturamento) &&
        Objects.equals(this.dataVencimento, transacoesCorrentesResponse.dataVencimento) &&
        Objects.equals(this.modoEntradaTransacao, transacoesCorrentesResponse.modoEntradaTransacao) &&
        Objects.equals(this.valorTaxaEmbarque, transacoesCorrentesResponse.valorTaxaEmbarque) &&
        Objects.equals(this.valorEntrada, transacoesCorrentesResponse.valorEntrada) &&
        Objects.equals(this.valorBRL, transacoesCorrentesResponse.valorBRL) &&
        Objects.equals(this.valorUSD, transacoesCorrentesResponse.valorUSD) &&
        Objects.equals(this.cotacaoUSD, transacoesCorrentesResponse.cotacaoUSD) &&
        Objects.equals(this.dataCotacaoUSD, transacoesCorrentesResponse.dataCotacaoUSD) &&
        Objects.equals(this.codigoMoedaOrigem, transacoesCorrentesResponse.codigoMoedaOrigem) &&
        Objects.equals(this.codigoMoedaDestino, transacoesCorrentesResponse.codigoMoedaDestino) &&
        Objects.equals(this.codigoAutorizacao, transacoesCorrentesResponse.codigoAutorizacao) &&
        Objects.equals(this.codigoReferencia, transacoesCorrentesResponse.codigoReferencia) &&
        Objects.equals(this.codigoTerminal, transacoesCorrentesResponse.codigoTerminal) &&
        Objects.equals(this.codigoMCC, transacoesCorrentesResponse.codigoMCC) &&
        Objects.equals(this.grupoMCC, transacoesCorrentesResponse.grupoMCC) &&
        Objects.equals(this.grupoDescricaoMCC, transacoesCorrentesResponse.grupoDescricaoMCC) &&
        Objects.equals(this.idEstabelecimento, transacoesCorrentesResponse.idEstabelecimento) &&
        Objects.equals(this.nomeEstabelecimento, transacoesCorrentesResponse.nomeEstabelecimento) &&
        Objects.equals(this.nomeFantasiaEstabelecimento, transacoesCorrentesResponse.nomeFantasiaEstabelecimento) &&
        Objects.equals(this.localidadeEstabelecimento, transacoesCorrentesResponse.localidadeEstabelecimento) &&
        Objects.equals(this.planoParcelamento, transacoesCorrentesResponse.planoParcelamento) &&
        Objects.equals(this.numeroParcela, transacoesCorrentesResponse.numeroParcela) &&
        Objects.equals(this.detalhesTransacao, transacoesCorrentesResponse.detalhesTransacao) &&
        Objects.equals(this.flagCredito, transacoesCorrentesResponse.flagCredito) &&
        Objects.equals(this.flagFaturado, transacoesCorrentesResponse.flagFaturado) &&
        Objects.equals(this.flagEstorno, transacoesCorrentesResponse.flagEstorno) &&
        Objects.equals(this.idTransacaoEstorno, transacoesCorrentesResponse.idTransacaoEstorno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoTransacao, descricaoAbreviada, statusTransacao, idEvento, tipoEvento, idConta, cartaoMascarado, nomePortador, dataTransacao, dataFaturamento, dataVencimento, modoEntradaTransacao, valorTaxaEmbarque, valorEntrada, valorBRL, valorUSD, cotacaoUSD, dataCotacaoUSD, codigoMoedaOrigem, codigoMoedaDestino, codigoAutorizacao, codigoReferencia, codigoTerminal, codigoMCC, grupoMCC, grupoDescricaoMCC, idEstabelecimento, nomeEstabelecimento, nomeFantasiaEstabelecimento, localidadeEstabelecimento, planoParcelamento, numeroParcela, detalhesTransacao, flagCredito, flagFaturado, flagEstorno, idTransacaoEstorno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacoesCorrentesResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoTransacao: ").append(toIndentedString(idTipoTransacao)).append("\n");
    sb.append("    descricaoAbreviada: ").append(toIndentedString(descricaoAbreviada)).append("\n");
    sb.append("    statusTransacao: ").append(toIndentedString(statusTransacao)).append("\n");
    sb.append("    idEvento: ").append(toIndentedString(idEvento)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    cartaoMascarado: ").append(toIndentedString(cartaoMascarado)).append("\n");
    sb.append("    nomePortador: ").append(toIndentedString(nomePortador)).append("\n");
    sb.append("    dataTransacao: ").append(toIndentedString(dataTransacao)).append("\n");
    sb.append("    dataFaturamento: ").append(toIndentedString(dataFaturamento)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    modoEntradaTransacao: ").append(toIndentedString(modoEntradaTransacao)).append("\n");
    sb.append("    valorTaxaEmbarque: ").append(toIndentedString(valorTaxaEmbarque)).append("\n");
    sb.append("    valorEntrada: ").append(toIndentedString(valorEntrada)).append("\n");
    sb.append("    valorBRL: ").append(toIndentedString(valorBRL)).append("\n");
    sb.append("    valorUSD: ").append(toIndentedString(valorUSD)).append("\n");
    sb.append("    cotacaoUSD: ").append(toIndentedString(cotacaoUSD)).append("\n");
    sb.append("    dataCotacaoUSD: ").append(toIndentedString(dataCotacaoUSD)).append("\n");
    sb.append("    codigoMoedaOrigem: ").append(toIndentedString(codigoMoedaOrigem)).append("\n");
    sb.append("    codigoMoedaDestino: ").append(toIndentedString(codigoMoedaDestino)).append("\n");
    sb.append("    codigoAutorizacao: ").append(toIndentedString(codigoAutorizacao)).append("\n");
    sb.append("    codigoReferencia: ").append(toIndentedString(codigoReferencia)).append("\n");
    sb.append("    codigoTerminal: ").append(toIndentedString(codigoTerminal)).append("\n");
    sb.append("    codigoMCC: ").append(toIndentedString(codigoMCC)).append("\n");
    sb.append("    grupoMCC: ").append(toIndentedString(grupoMCC)).append("\n");
    sb.append("    grupoDescricaoMCC: ").append(toIndentedString(grupoDescricaoMCC)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
    sb.append("    nomeFantasiaEstabelecimento: ").append(toIndentedString(nomeFantasiaEstabelecimento)).append("\n");
    sb.append("    localidadeEstabelecimento: ").append(toIndentedString(localidadeEstabelecimento)).append("\n");
    sb.append("    planoParcelamento: ").append(toIndentedString(planoParcelamento)).append("\n");
    sb.append("    numeroParcela: ").append(toIndentedString(numeroParcela)).append("\n");
    sb.append("    detalhesTransacao: ").append(toIndentedString(detalhesTransacao)).append("\n");
    sb.append("    flagCredito: ").append(toIndentedString(flagCredito)).append("\n");
    sb.append("    flagFaturado: ").append(toIndentedString(flagFaturado)).append("\n");
    sb.append("    flagEstorno: ").append(toIndentedString(flagEstorno)).append("\n");
    sb.append("    idTransacaoEstorno: ").append(toIndentedString(idTransacaoEstorno)).append("\n");
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

