package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto transacao N\u00E3o Processada
 **/

@ApiModel(description = "Objeto transacao N\u00E3o Processada")
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
  private BigDecimal valorIOF = null;
  private BigDecimal valorTAC = null;
  private BigDecimal valorUSD = null;

  
  /**
   * N\u00FAmero do Cart\u00E3o em Formato 0000XXXXXXXX0000
   **/
  public TransacaoNaoProcessadaResponse cartaoMascarado(String cartaoMascarado) {
    this.cartaoMascarado = cartaoMascarado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do Cart\u00E3o em Formato 0000XXXXXXXX0000")
  @JsonProperty("cartaoMascarado")
  public String getCartaoMascarado() {
    return cartaoMascarado;
  }
  public void setCartaoMascarado(String cartaoMascarado) {
    this.cartaoMascarado = cartaoMascarado;
  }

  
  /**
   * C\u00F3digo de Autoriza\u00E7\u00E3o da Transa\u00E7\u00E3o
   **/
  public TransacaoNaoProcessadaResponse codigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Autoriza\u00E7\u00E3o da Transa\u00E7\u00E3o")
  @JsonProperty("codigoAutorizacao")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da categoria do Estabelecimento
   **/
  public TransacaoNaoProcessadaResponse codigoMCC(Long codigoMCC) {
    this.codigoMCC = codigoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da categoria do Estabelecimento")
  @JsonProperty("codigoMCC")
  public Long getCodigoMCC() {
    return codigoMCC;
  }
  public void setCodigoMCC(Long codigoMCC) {
    this.codigoMCC = codigoMCC;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Moeda da Transa\u00E7\u00E3o ap\u00F3s a convers\u00E3o, seguindo padr\u00E3o ISO 4217
   **/
  public TransacaoNaoProcessadaResponse codigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Moeda da Transa\u00E7\u00E3o ap\u00F3s a convers\u00E3o, seguindo padr\u00E3o ISO 4217")
  @JsonProperty("codigoMoedaDestino")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Moeda utilizada na Transa\u00E7\u00E3o, seguindo padr\u00E3o ISO 4217
   **/
  public TransacaoNaoProcessadaResponse codigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Moeda utilizada na Transa\u00E7\u00E3o, seguindo padr\u00E3o ISO 4217")
  @JsonProperty("codigoMoedaOrigem")
  public String getCodigoMoedaOrigem() {
    return codigoMoedaOrigem;
  }
  public void setCodigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
  }

  
  /**
   * C\u00F3digo de Refer\u00EAncia da Transa\u00E7\u00E3o quando utilizado Cart\u00E3o Bandeirado
   **/
  public TransacaoNaoProcessadaResponse codigoReferencia(String codigoReferencia) {
    this.codigoReferencia = codigoReferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Refer\u00EAncia da Transa\u00E7\u00E3o quando utilizado Cart\u00E3o Bandeirado")
  @JsonProperty("codigoReferencia")
  public String getCodigoReferencia() {
    return codigoReferencia;
  }
  public void setCodigoReferencia(String codigoReferencia) {
    this.codigoReferencia = codigoReferencia;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da origem da captura da Transa\u00E7\u00E3o
   **/
  public TransacaoNaoProcessadaResponse codigoTerminal(String codigoTerminal) {
    this.codigoTerminal = codigoTerminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da origem da captura da Transa\u00E7\u00E3o")
  @JsonProperty("codigoTerminal")
  public String getCodigoTerminal() {
    return codigoTerminal;
  }
  public void setCodigoTerminal(String codigoTerminal) {
    this.codigoTerminal = codigoTerminal;
  }

  
  /**
   * Valor do D\u00F3lar Americano (USD) convertido em Real (BRL)
   **/
  public TransacaoNaoProcessadaResponse cotacaoUSD(BigDecimal cotacaoUSD) {
    this.cotacaoUSD = cotacaoUSD;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do D\u00F3lar Americano (USD) convertido em Real (BRL)")
  @JsonProperty("cotacaoUSD")
  public BigDecimal getCotacaoUSD() {
    return cotacaoUSD;
  }
  public void setCotacaoUSD(BigDecimal cotacaoUSD) {
    this.cotacaoUSD = cotacaoUSD;
  }

  
  /**
   * Data de Fechamento da Cota\u00E7\u00E3o do D\u00F3lar Americano (USD)
   **/
  public TransacaoNaoProcessadaResponse dataCotacaoUSD(String dataCotacaoUSD) {
    this.dataCotacaoUSD = dataCotacaoUSD;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Fechamento da Cota\u00E7\u00E3o do D\u00F3lar Americano (USD)")
  @JsonProperty("dataCotacaoUSD")
  public String getDataCotacaoUSD() {
    return dataCotacaoUSD;
  }
  public void setDataCotacaoUSD(String dataCotacaoUSD) {
    this.dataCotacaoUSD = dataCotacaoUSD;
  }

  
  /**
   * Data de Faturamento da Transa\u00E7\u00E3o
   **/
  public TransacaoNaoProcessadaResponse dataFaturamento(String dataFaturamento) {
    this.dataFaturamento = dataFaturamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Faturamento da Transa\u00E7\u00E3o")
  @JsonProperty("dataFaturamento")
  public String getDataFaturamento() {
    return dataFaturamento;
  }
  public void setDataFaturamento(String dataFaturamento) {
    this.dataFaturamento = dataFaturamento;
  }

  
  /**
   * Data em que a Transa\u00E7\u00E3o foi realizada
   **/
  public TransacaoNaoProcessadaResponse dataOrigem(String dataOrigem) {
    this.dataOrigem = dataOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data em que a Transa\u00E7\u00E3o foi realizada")
  @JsonProperty("dataOrigem")
  public String getDataOrigem() {
    return dataOrigem;
  }
  public void setDataOrigem(String dataOrigem) {
    this.dataOrigem = dataOrigem;
  }

  
  /**
   * Data de Vencimento da Fatura
   **/
  public TransacaoNaoProcessadaResponse dataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Vencimento da Fatura")
  @JsonProperty("dataVencimentoReal")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Descri\u00E7\u00E3o Abreviada da Transa\u00E7\u00E3o
   **/
  public TransacaoNaoProcessadaResponse descricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o Abreviada da Transa\u00E7\u00E3o")
  @JsonProperty("descricaoAbreviada")
  public String getDescricaoAbreviada() {
    return descricaoAbreviada;
  }
  public void setDescricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
  }

  
  /**
   * Descri\u00E7\u00E3o do Tipo da Transa\u00E7\u00E3o n\u00E3o Processada
   **/
  public TransacaoNaoProcessadaResponse descricaoTipoTransacaoNaoProcessada(String descricaoTipoTransacaoNaoProcessada) {
    this.descricaoTipoTransacaoNaoProcessada = descricaoTipoTransacaoNaoProcessada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do Tipo da Transa\u00E7\u00E3o n\u00E3o Processada")
  @JsonProperty("descricaoTipoTransacaoNaoProcessada")
  public String getDescricaoTipoTransacaoNaoProcessada() {
    return descricaoTipoTransacaoNaoProcessada;
  }
  public void setDescricaoTipoTransacaoNaoProcessada(String descricaoTipoTransacaoNaoProcessada) {
    this.descricaoTipoTransacaoNaoProcessada = descricaoTipoTransacaoNaoProcessada;
  }

  
  /**
   * Detalhes complementares a respeito da Transa\u00E7\u00E3o
   **/
  public TransacaoNaoProcessadaResponse detalhesTransacao(String detalhesTransacao) {
    this.detalhesTransacao = detalhesTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detalhes complementares a respeito da Transa\u00E7\u00E3o")
  @JsonProperty("detalhesTransacao")
  public String getDetalhesTransacao() {
    return detalhesTransacao;
  }
  public void setDetalhesTransacao(String detalhesTransacao) {
    this.detalhesTransacao = detalhesTransacao;
  }

  
  /**
   * Quando ativa, indica que a Transa\u00E7\u00E3o \u00E9 do Tipo 'Cr\u00E9dito'
   **/
  public TransacaoNaoProcessadaResponse flagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando ativa, indica que a Transa\u00E7\u00E3o \u00E9 do Tipo 'Cr\u00E9dito'")
  @JsonProperty("flagCredito")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * Quando ativa, indica que a Transa\u00E7\u00E3o foi consolidada em uma Fatura
   **/
  public TransacaoNaoProcessadaResponse flagFaturado(Integer flagFaturado) {
    this.flagFaturado = flagFaturado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando ativa, indica que a Transa\u00E7\u00E3o foi consolidada em uma Fatura")
  @JsonProperty("flagFaturado")
  public Integer getFlagFaturado() {
    return flagFaturado;
  }
  public void setFlagFaturado(Integer flagFaturado) {
    this.flagFaturado = flagFaturado;
  }

  
  /**
   * Descri\u00E7\u00E3o do grupo do Estabelecimento
   **/
  public TransacaoNaoProcessadaResponse grupoDescricaoMCC(String grupoDescricaoMCC) {
    this.grupoDescricaoMCC = grupoDescricaoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do grupo do Estabelecimento")
  @JsonProperty("grupoDescricaoMCC")
  public String getGrupoDescricaoMCC() {
    return grupoDescricaoMCC;
  }
  public void setGrupoDescricaoMCC(String grupoDescricaoMCC) {
    this.grupoDescricaoMCC = grupoDescricaoMCC;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do grupo do Estabelecimento
   **/
  public TransacaoNaoProcessadaResponse grupoMCC(Long grupoMCC) {
    this.grupoMCC = grupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do grupo do Estabelecimento")
  @JsonProperty("grupoMCC")
  public Long getGrupoMCC() {
    return grupoMCC;
  }
  public void setGrupoMCC(Long grupoMCC) {
    this.grupoMCC = grupoMCC;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id)
   **/
  public TransacaoNaoProcessadaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id)")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento (id)
   **/
  public TransacaoNaoProcessadaResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento (id)")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Tipo da Transa\u00E7\u00E3o
   **/
  public TransacaoNaoProcessadaResponse idTipoTransacaoNaoProcessada(Long idTipoTransacaoNaoProcessada) {
    this.idTipoTransacaoNaoProcessada = idTipoTransacaoNaoProcessada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Tipo da Transa\u00E7\u00E3o")
  @JsonProperty("idTipoTransacaoNaoProcessada")
  public Long getIdTipoTransacaoNaoProcessada() {
    return idTipoTransacaoNaoProcessada;
  }
  public void setIdTipoTransacaoNaoProcessada(Long idTipoTransacaoNaoProcessada) {
    this.idTipoTransacaoNaoProcessada = idTipoTransacaoNaoProcessada;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Transa\u00E7\u00E3o (id) que gerou o estorno
   **/
  public TransacaoNaoProcessadaResponse idTransacaoEstorno(Long idTransacaoEstorno) {
    this.idTransacaoEstorno = idTransacaoEstorno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Transa\u00E7\u00E3o (id) que gerou o estorno")
  @JsonProperty("idTransacaoEstorno")
  public Long getIdTransacaoEstorno() {
    return idTransacaoEstorno;
  }
  public void setIdTransacaoEstorno(Long idTransacaoEstorno) {
    this.idTransacaoEstorno = idTransacaoEstorno;
  }

  
  /**
   * Localidade do Estabelecimento
   **/
  public TransacaoNaoProcessadaResponse localidadeEstabelecimento(String localidadeEstabelecimento) {
    this.localidadeEstabelecimento = localidadeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Localidade do Estabelecimento")
  @JsonProperty("localidadeEstabelecimento")
  public String getLocalidadeEstabelecimento() {
    return localidadeEstabelecimento;
  }
  public void setLocalidadeEstabelecimento(String localidadeEstabelecimento) {
    this.localidadeEstabelecimento = localidadeEstabelecimento;
  }

  
  /**
   * Descreve o modo utilizado para realizar a leitura dos dados do cart\u00E3o para realizar a Transa\u00E7\u00E3o
   **/
  public TransacaoNaoProcessadaResponse modoEntradaTransacao(String modoEntradaTransacao) {
    this.modoEntradaTransacao = modoEntradaTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descreve o modo utilizado para realizar a leitura dos dados do cart\u00E3o para realizar a Transa\u00E7\u00E3o")
  @JsonProperty("modoEntradaTransacao")
  public String getModoEntradaTransacao() {
    return modoEntradaTransacao;
  }
  public void setModoEntradaTransacao(String modoEntradaTransacao) {
    this.modoEntradaTransacao = modoEntradaTransacao;
  }

  
  /**
   * Nome do Estabelecimento
   **/
  public TransacaoNaoProcessadaResponse nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Estabelecimento")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Nome Fantasia do Estabelecimento
   **/
  public TransacaoNaoProcessadaResponse nomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome Fantasia do Estabelecimento")
  @JsonProperty("nomeFantasiaEstabelecimento")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * Nome completo do Portador do Cart\u00E3o
   **/
  public TransacaoNaoProcessadaResponse nomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome completo do Portador do Cart\u00E3o")
  @JsonProperty("nomePortador")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * Quando a Transa\u00E7\u00E3o for do tipo Parcelada, apresenta o n\u00FAmero da Parcela
   **/
  public TransacaoNaoProcessadaResponse parcela(Long parcela) {
    this.parcela = parcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando a Transa\u00E7\u00E3o for do tipo Parcelada, apresenta o n\u00FAmero da Parcela")
  @JsonProperty("parcela")
  public Long getParcela() {
    return parcela;
  }
  public void setParcela(Long parcela) {
    this.parcela = parcela;
  }

  
  /**
   * Quando a Transa\u00E7\u00E3o for do tipo Parcelada, apresenta o n\u00FAmero total de Parcelas
   **/
  public TransacaoNaoProcessadaResponse plano(Long plano) {
    this.plano = plano;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando a Transa\u00E7\u00E3o for do tipo Parcelada, apresenta o n\u00FAmero total de Parcelas")
  @JsonProperty("plano")
  public Long getPlano() {
    return plano;
  }
  public void setPlano(Long plano) {
    this.plano = plano;
  }

  
  /**
   * Atributo que representa o c\u00F3digo identificador do status da transa\u00E7\u00E3o
   **/
  public TransacaoNaoProcessadaResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Atributo que representa o c\u00F3digo identificador do status da transa\u00E7\u00E3o")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Valor da Taxa de Embarque em Real (BRL) quando a transa\u00E7\u00E3o for relacionada a Compra de Passagens A\u00E9reas
   **/
  public TransacaoNaoProcessadaResponse taxaEmbarque(BigDecimal taxaEmbarque) {
    this.taxaEmbarque = taxaEmbarque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da Taxa de Embarque em Real (BRL) quando a transa\u00E7\u00E3o for relacionada a Compra de Passagens A\u00E9reas")
  @JsonProperty("taxaEmbarque")
  public BigDecimal getTaxaEmbarque() {
    return taxaEmbarque;
  }
  public void setTaxaEmbarque(BigDecimal taxaEmbarque) {
    this.taxaEmbarque = taxaEmbarque;
  }

  
  /**
   * Valor da Transa\u00E7\u00E3o em Real (BRL)
   **/
  public TransacaoNaoProcessadaResponse valorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da Transa\u00E7\u00E3o em Real (BRL)")
  @JsonProperty("valorBRL")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }
  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  
  /**
   * Valor da Entrada em Real (BRL) quando a transa\u00E7\u00E3o for do tipo Parcelada com o pagamento de um valor de Entrada
   **/
  public TransacaoNaoProcessadaResponse valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da Entrada em Real (BRL) quando a transa\u00E7\u00E3o for do tipo Parcelada com o pagamento de um valor de Entrada")
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Valor do IOF
   **/
  public TransacaoNaoProcessadaResponse valorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do IOF")
  @JsonProperty("valorIOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Valor da TAC
   **/
  public TransacaoNaoProcessadaResponse valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da TAC")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Valor da Transa\u00E7\u00E3o em D\u00F3lar Americano (USD)
   **/
  public TransacaoNaoProcessadaResponse valorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da Transa\u00E7\u00E3o em D\u00F3lar Americano (USD)")
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
        Objects.equals(this.valorIOF, transacaoNaoProcessadaResponse.valorIOF) &&
        Objects.equals(this.valorTAC, transacaoNaoProcessadaResponse.valorTAC) &&
        Objects.equals(this.valorUSD, transacaoNaoProcessadaResponse.valorUSD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartaoMascarado, codigoAutorizacao, codigoMCC, codigoMoedaDestino, codigoMoedaOrigem, codigoReferencia, codigoTerminal, cotacaoUSD, dataCotacaoUSD, dataFaturamento, dataOrigem, dataVencimentoReal, descricaoAbreviada, descricaoTipoTransacaoNaoProcessada, detalhesTransacao, flagCredito, flagFaturado, grupoDescricaoMCC, grupoMCC, idConta, idEstabelecimento, idTipoTransacaoNaoProcessada, idTransacaoEstorno, localidadeEstabelecimento, modoEntradaTransacao, nomeEstabelecimento, nomeFantasiaEstabelecimento, nomePortador, parcela, plano, status, taxaEmbarque, valorBRL, valorEntrada, valorIOF, valorTAC, valorUSD);
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
    sb.append("    valorIOF: ").append(toIndentedString(valorIOF)).append("\n");
    sb.append("    valorTAC: ").append(toIndentedString(valorTAC)).append("\n");
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

