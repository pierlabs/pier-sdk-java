package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.CdtAutorizacao;
import br.com.conductor.pier.api.v2.model.CdtTipoOperacao;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CdtEventoExternoCompra   {
  
  private String acquireReferenceNumber = null;
  private CdtAutorizacao autorizacao = null;
  private Integer carencia = null;
  private String cartao = null;
  private String codigoAutorizacao = null;
  private String dataCompra = null;
  private String dataEntradaCompra = null;
  private String dataFinanciamento = null;
  private String dataMovimento = null;
  private String dataVencimentoCompraFinal = null;
  private String dataVencimentoCompraInicial = null;
  private String dataVencimentoPadrao = null;
  private String dataVencimentoReal = null;
  private String descricao = null;
  private Integer dvnumeroEstabelecimento = null;
  private BigDecimal fatorBancoAjustado = null;
  private BigDecimal fatorComissaoGarantia = null;
  private BigDecimal fatorTaxaAdministracao = null;
  private BigDecimal fatorTotal = null;
  private BigDecimal fatorTotalAjustado = null;
  private Boolean flagRefinanciamento = null;
  private Boolean flagSelecionado = null;
  private Long id = null;
  private Long idCartao = null;
  private Long idConta = null;
  private Long idContaPortador = null;
  private Long idCredor = null;
  private Long idEstabelecimento = null;
  private Long idEstabelecimentoExterno = null;
  private Long idEstabelecimentoVISA = null;
  private Long idIncoming = null;
  private Long idMovimento = null;
  private Long idOrigem = null;
  private Long idRemessa = null;
  private Integer lote = null;
  private Long mcc = null;
  private String nomeEstabelecimentoVISA = null;
  private String numeroContrato = null;
  private Integer numeroEstabelecimento = null;
  private Integer numeroParcelas = null;
  private CdtTipoOperacao operacao = null;
  private String origem = null;
  private String origemResolucao = null;
  private BigDecimal quantidadeMoeda = null;
  private Long status = null;
  private BigDecimal taxaJuros = null;
  private Integer tipoCalculoPrestacao = null;
  private Integer tipoCompra = null;
  private String tipoEntrada = null;
  private Integer tipoLiquidacao = null;
  private Integer tipoPagamento = null;
  private BigDecimal valorAgenciamento = null;
  private BigDecimal valorComissao = null;
  private BigDecimal valorCompra = null;
  private BigDecimal valorContrato = null;
  private BigDecimal valorEncargosBancarios = null;
  private BigDecimal valorEncargosTotais = null;
  private BigDecimal valorEntrada = null;
  private BigDecimal valorGarantias = null;
  private BigDecimal valorIOF = null;
  private BigDecimal valorLiquido = null;
  private BigDecimal valorOrigem = null;
  private BigDecimal valorParcela = null;
  private BigDecimal valorTAC = null;

  
  /**
   **/
  public CdtEventoExternoCompra acquireReferenceNumber(String acquireReferenceNumber) {
    this.acquireReferenceNumber = acquireReferenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("acquireReferenceNumber")
  public String getAcquireReferenceNumber() {
    return acquireReferenceNumber;
  }
  public void setAcquireReferenceNumber(String acquireReferenceNumber) {
    this.acquireReferenceNumber = acquireReferenceNumber;
  }

  
  /**
   **/
  public CdtEventoExternoCompra autorizacao(CdtAutorizacao autorizacao) {
    this.autorizacao = autorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("autorizacao")
  public CdtAutorizacao getAutorizacao() {
    return autorizacao;
  }
  public void setAutorizacao(CdtAutorizacao autorizacao) {
    this.autorizacao = autorizacao;
  }

  
  /**
   **/
  public CdtEventoExternoCompra carencia(Integer carencia) {
    this.carencia = carencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("carencia")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   **/
  public CdtEventoExternoCompra cartao(String cartao) {
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
  public CdtEventoExternoCompra codigoAutorizacao(String codigoAutorizacao) {
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
  public CdtEventoExternoCompra dataCompra(String dataCompra) {
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
  public CdtEventoExternoCompra dataEntradaCompra(String dataEntradaCompra) {
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
  public CdtEventoExternoCompra dataFinanciamento(String dataFinanciamento) {
    this.dataFinanciamento = dataFinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataFinanciamento")
  public String getDataFinanciamento() {
    return dataFinanciamento;
  }
  public void setDataFinanciamento(String dataFinanciamento) {
    this.dataFinanciamento = dataFinanciamento;
  }

  
  /**
   **/
  public CdtEventoExternoCompra dataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataMovimento")
  public String getDataMovimento() {
    return dataMovimento;
  }
  public void setDataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
  }

  
  /**
   **/
  public CdtEventoExternoCompra dataVencimentoCompraFinal(String dataVencimentoCompraFinal) {
    this.dataVencimentoCompraFinal = dataVencimentoCompraFinal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataVencimentoCompraFinal")
  public String getDataVencimentoCompraFinal() {
    return dataVencimentoCompraFinal;
  }
  public void setDataVencimentoCompraFinal(String dataVencimentoCompraFinal) {
    this.dataVencimentoCompraFinal = dataVencimentoCompraFinal;
  }

  
  /**
   **/
  public CdtEventoExternoCompra dataVencimentoCompraInicial(String dataVencimentoCompraInicial) {
    this.dataVencimentoCompraInicial = dataVencimentoCompraInicial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataVencimentoCompraInicial")
  public String getDataVencimentoCompraInicial() {
    return dataVencimentoCompraInicial;
  }
  public void setDataVencimentoCompraInicial(String dataVencimentoCompraInicial) {
    this.dataVencimentoCompraInicial = dataVencimentoCompraInicial;
  }

  
  /**
   **/
  public CdtEventoExternoCompra dataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataVencimentoPadrao")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   **/
  public CdtEventoExternoCompra dataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataVencimentoReal")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   **/
  public CdtEventoExternoCompra descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   **/
  public CdtEventoExternoCompra dvnumeroEstabelecimento(Integer dvnumeroEstabelecimento) {
    this.dvnumeroEstabelecimento = dvnumeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dvnumeroEstabelecimento")
  public Integer getDvnumeroEstabelecimento() {
    return dvnumeroEstabelecimento;
  }
  public void setDvnumeroEstabelecimento(Integer dvnumeroEstabelecimento) {
    this.dvnumeroEstabelecimento = dvnumeroEstabelecimento;
  }

  
  /**
   **/
  public CdtEventoExternoCompra fatorBancoAjustado(BigDecimal fatorBancoAjustado) {
    this.fatorBancoAjustado = fatorBancoAjustado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fatorBancoAjustado")
  public BigDecimal getFatorBancoAjustado() {
    return fatorBancoAjustado;
  }
  public void setFatorBancoAjustado(BigDecimal fatorBancoAjustado) {
    this.fatorBancoAjustado = fatorBancoAjustado;
  }

  
  /**
   **/
  public CdtEventoExternoCompra fatorComissaoGarantia(BigDecimal fatorComissaoGarantia) {
    this.fatorComissaoGarantia = fatorComissaoGarantia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fatorComissaoGarantia")
  public BigDecimal getFatorComissaoGarantia() {
    return fatorComissaoGarantia;
  }
  public void setFatorComissaoGarantia(BigDecimal fatorComissaoGarantia) {
    this.fatorComissaoGarantia = fatorComissaoGarantia;
  }

  
  /**
   **/
  public CdtEventoExternoCompra fatorTaxaAdministracao(BigDecimal fatorTaxaAdministracao) {
    this.fatorTaxaAdministracao = fatorTaxaAdministracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fatorTaxaAdministracao")
  public BigDecimal getFatorTaxaAdministracao() {
    return fatorTaxaAdministracao;
  }
  public void setFatorTaxaAdministracao(BigDecimal fatorTaxaAdministracao) {
    this.fatorTaxaAdministracao = fatorTaxaAdministracao;
  }

  
  /**
   **/
  public CdtEventoExternoCompra fatorTotal(BigDecimal fatorTotal) {
    this.fatorTotal = fatorTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fatorTotal")
  public BigDecimal getFatorTotal() {
    return fatorTotal;
  }
  public void setFatorTotal(BigDecimal fatorTotal) {
    this.fatorTotal = fatorTotal;
  }

  
  /**
   **/
  public CdtEventoExternoCompra fatorTotalAjustado(BigDecimal fatorTotalAjustado) {
    this.fatorTotalAjustado = fatorTotalAjustado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fatorTotalAjustado")
  public BigDecimal getFatorTotalAjustado() {
    return fatorTotalAjustado;
  }
  public void setFatorTotalAjustado(BigDecimal fatorTotalAjustado) {
    this.fatorTotalAjustado = fatorTotalAjustado;
  }

  
  /**
   **/
  public CdtEventoExternoCompra flagRefinanciamento(Boolean flagRefinanciamento) {
    this.flagRefinanciamento = flagRefinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagRefinanciamento")
  public Boolean getFlagRefinanciamento() {
    return flagRefinanciamento;
  }
  public void setFlagRefinanciamento(Boolean flagRefinanciamento) {
    this.flagRefinanciamento = flagRefinanciamento;
  }

  
  /**
   **/
  public CdtEventoExternoCompra flagSelecionado(Boolean flagSelecionado) {
    this.flagSelecionado = flagSelecionado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagSelecionado")
  public Boolean getFlagSelecionado() {
    return flagSelecionado;
  }
  public void setFlagSelecionado(Boolean flagSelecionado) {
    this.flagSelecionado = flagSelecionado;
  }

  
  /**
   **/
  public CdtEventoExternoCompra id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  public CdtEventoExternoCompra idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   **/
  public CdtEventoExternoCompra idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   **/
  public CdtEventoExternoCompra idContaPortador(Long idContaPortador) {
    this.idContaPortador = idContaPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idContaPortador")
  public Long getIdContaPortador() {
    return idContaPortador;
  }
  public void setIdContaPortador(Long idContaPortador) {
    this.idContaPortador = idContaPortador;
  }

  
  /**
   **/
  public CdtEventoExternoCompra idCredor(Long idCredor) {
    this.idCredor = idCredor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idCredor")
  public Long getIdCredor() {
    return idCredor;
  }
  public void setIdCredor(Long idCredor) {
    this.idCredor = idCredor;
  }

  
  /**
   **/
  public CdtEventoExternoCompra idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   **/
  public CdtEventoExternoCompra idEstabelecimentoExterno(Long idEstabelecimentoExterno) {
    this.idEstabelecimentoExterno = idEstabelecimentoExterno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idEstabelecimentoExterno")
  public Long getIdEstabelecimentoExterno() {
    return idEstabelecimentoExterno;
  }
  public void setIdEstabelecimentoExterno(Long idEstabelecimentoExterno) {
    this.idEstabelecimentoExterno = idEstabelecimentoExterno;
  }

  
  /**
   **/
  public CdtEventoExternoCompra idEstabelecimentoVISA(Long idEstabelecimentoVISA) {
    this.idEstabelecimentoVISA = idEstabelecimentoVISA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idEstabelecimentoVISA")
  public Long getIdEstabelecimentoVISA() {
    return idEstabelecimentoVISA;
  }
  public void setIdEstabelecimentoVISA(Long idEstabelecimentoVISA) {
    this.idEstabelecimentoVISA = idEstabelecimentoVISA;
  }

  
  /**
   **/
  public CdtEventoExternoCompra idIncoming(Long idIncoming) {
    this.idIncoming = idIncoming;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idIncoming")
  public Long getIdIncoming() {
    return idIncoming;
  }
  public void setIdIncoming(Long idIncoming) {
    this.idIncoming = idIncoming;
  }

  
  /**
   **/
  public CdtEventoExternoCompra idMovimento(Long idMovimento) {
    this.idMovimento = idMovimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idMovimento")
  public Long getIdMovimento() {
    return idMovimento;
  }
  public void setIdMovimento(Long idMovimento) {
    this.idMovimento = idMovimento;
  }

  
  /**
   **/
  public CdtEventoExternoCompra idOrigem(Long idOrigem) {
    this.idOrigem = idOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idOrigem")
  public Long getIdOrigem() {
    return idOrigem;
  }
  public void setIdOrigem(Long idOrigem) {
    this.idOrigem = idOrigem;
  }

  
  /**
   **/
  public CdtEventoExternoCompra idRemessa(Long idRemessa) {
    this.idRemessa = idRemessa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idRemessa")
  public Long getIdRemessa() {
    return idRemessa;
  }
  public void setIdRemessa(Long idRemessa) {
    this.idRemessa = idRemessa;
  }

  
  /**
   **/
  public CdtEventoExternoCompra lote(Integer lote) {
    this.lote = lote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lote")
  public Integer getLote() {
    return lote;
  }
  public void setLote(Integer lote) {
    this.lote = lote;
  }

  
  /**
   **/
  public CdtEventoExternoCompra mcc(Long mcc) {
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
  public CdtEventoExternoCompra nomeEstabelecimentoVISA(String nomeEstabelecimentoVISA) {
    this.nomeEstabelecimentoVISA = nomeEstabelecimentoVISA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nomeEstabelecimentoVISA")
  public String getNomeEstabelecimentoVISA() {
    return nomeEstabelecimentoVISA;
  }
  public void setNomeEstabelecimentoVISA(String nomeEstabelecimentoVISA) {
    this.nomeEstabelecimentoVISA = nomeEstabelecimentoVISA;
  }

  
  /**
   **/
  public CdtEventoExternoCompra numeroContrato(String numeroContrato) {
    this.numeroContrato = numeroContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroContrato")
  public String getNumeroContrato() {
    return numeroContrato;
  }
  public void setNumeroContrato(String numeroContrato) {
    this.numeroContrato = numeroContrato;
  }

  
  /**
   **/
  public CdtEventoExternoCompra numeroEstabelecimento(Integer numeroEstabelecimento) {
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
  public CdtEventoExternoCompra numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   **/
  public CdtEventoExternoCompra operacao(CdtTipoOperacao operacao) {
    this.operacao = operacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("operacao")
  public CdtTipoOperacao getOperacao() {
    return operacao;
  }
  public void setOperacao(CdtTipoOperacao operacao) {
    this.operacao = operacao;
  }

  
  /**
   **/
  public CdtEventoExternoCompra origem(String origem) {
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
  public CdtEventoExternoCompra origemResolucao(String origemResolucao) {
    this.origemResolucao = origemResolucao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("origemResolucao")
  public String getOrigemResolucao() {
    return origemResolucao;
  }
  public void setOrigemResolucao(String origemResolucao) {
    this.origemResolucao = origemResolucao;
  }

  
  /**
   **/
  public CdtEventoExternoCompra quantidadeMoeda(BigDecimal quantidadeMoeda) {
    this.quantidadeMoeda = quantidadeMoeda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quantidadeMoeda")
  public BigDecimal getQuantidadeMoeda() {
    return quantidadeMoeda;
  }
  public void setQuantidadeMoeda(BigDecimal quantidadeMoeda) {
    this.quantidadeMoeda = quantidadeMoeda;
  }

  
  /**
   **/
  public CdtEventoExternoCompra status(Long status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  
  /**
   **/
  public CdtEventoExternoCompra taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   **/
  public CdtEventoExternoCompra tipoCalculoPrestacao(Integer tipoCalculoPrestacao) {
    this.tipoCalculoPrestacao = tipoCalculoPrestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tipoCalculoPrestacao")
  public Integer getTipoCalculoPrestacao() {
    return tipoCalculoPrestacao;
  }
  public void setTipoCalculoPrestacao(Integer tipoCalculoPrestacao) {
    this.tipoCalculoPrestacao = tipoCalculoPrestacao;
  }

  
  /**
   **/
  public CdtEventoExternoCompra tipoCompra(Integer tipoCompra) {
    this.tipoCompra = tipoCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tipoCompra")
  public Integer getTipoCompra() {
    return tipoCompra;
  }
  public void setTipoCompra(Integer tipoCompra) {
    this.tipoCompra = tipoCompra;
  }

  
  /**
   **/
  public CdtEventoExternoCompra tipoEntrada(String tipoEntrada) {
    this.tipoEntrada = tipoEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tipoEntrada")
  public String getTipoEntrada() {
    return tipoEntrada;
  }
  public void setTipoEntrada(String tipoEntrada) {
    this.tipoEntrada = tipoEntrada;
  }

  
  /**
   **/
  public CdtEventoExternoCompra tipoLiquidacao(Integer tipoLiquidacao) {
    this.tipoLiquidacao = tipoLiquidacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tipoLiquidacao")
  public Integer getTipoLiquidacao() {
    return tipoLiquidacao;
  }
  public void setTipoLiquidacao(Integer tipoLiquidacao) {
    this.tipoLiquidacao = tipoLiquidacao;
  }

  
  /**
   **/
  public CdtEventoExternoCompra tipoPagamento(Integer tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tipoPagamento")
  public Integer getTipoPagamento() {
    return tipoPagamento;
  }
  public void setTipoPagamento(Integer tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  
  /**
   **/
  public CdtEventoExternoCompra valorAgenciamento(BigDecimal valorAgenciamento) {
    this.valorAgenciamento = valorAgenciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorAgenciamento")
  public BigDecimal getValorAgenciamento() {
    return valorAgenciamento;
  }
  public void setValorAgenciamento(BigDecimal valorAgenciamento) {
    this.valorAgenciamento = valorAgenciamento;
  }

  
  /**
   **/
  public CdtEventoExternoCompra valorComissao(BigDecimal valorComissao) {
    this.valorComissao = valorComissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorComissao")
  public BigDecimal getValorComissao() {
    return valorComissao;
  }
  public void setValorComissao(BigDecimal valorComissao) {
    this.valorComissao = valorComissao;
  }

  
  /**
   **/
  public CdtEventoExternoCompra valorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorCompra")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   **/
  public CdtEventoExternoCompra valorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorContrato")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   **/
  public CdtEventoExternoCompra valorEncargosBancarios(BigDecimal valorEncargosBancarios) {
    this.valorEncargosBancarios = valorEncargosBancarios;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorEncargosBancarios")
  public BigDecimal getValorEncargosBancarios() {
    return valorEncargosBancarios;
  }
  public void setValorEncargosBancarios(BigDecimal valorEncargosBancarios) {
    this.valorEncargosBancarios = valorEncargosBancarios;
  }

  
  /**
   **/
  public CdtEventoExternoCompra valorEncargosTotais(BigDecimal valorEncargosTotais) {
    this.valorEncargosTotais = valorEncargosTotais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorEncargosTotais")
  public BigDecimal getValorEncargosTotais() {
    return valorEncargosTotais;
  }
  public void setValorEncargosTotais(BigDecimal valorEncargosTotais) {
    this.valorEncargosTotais = valorEncargosTotais;
  }

  
  /**
   **/
  public CdtEventoExternoCompra valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   **/
  public CdtEventoExternoCompra valorGarantias(BigDecimal valorGarantias) {
    this.valorGarantias = valorGarantias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorGarantias")
  public BigDecimal getValorGarantias() {
    return valorGarantias;
  }
  public void setValorGarantias(BigDecimal valorGarantias) {
    this.valorGarantias = valorGarantias;
  }

  
  /**
   **/
  public CdtEventoExternoCompra valorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorIOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   **/
  public CdtEventoExternoCompra valorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorLiquido")
  public BigDecimal getValorLiquido() {
    return valorLiquido;
  }
  public void setValorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
  }

  
  /**
   **/
  public CdtEventoExternoCompra valorOrigem(BigDecimal valorOrigem) {
    this.valorOrigem = valorOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorOrigem")
  public BigDecimal getValorOrigem() {
    return valorOrigem;
  }
  public void setValorOrigem(BigDecimal valorOrigem) {
    this.valorOrigem = valorOrigem;
  }

  
  /**
   **/
  public CdtEventoExternoCompra valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   **/
  public CdtEventoExternoCompra valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdtEventoExternoCompra cdtEventoExternoCompra = (CdtEventoExternoCompra) o;
    return Objects.equals(this.acquireReferenceNumber, cdtEventoExternoCompra.acquireReferenceNumber) &&
        Objects.equals(this.autorizacao, cdtEventoExternoCompra.autorizacao) &&
        Objects.equals(this.carencia, cdtEventoExternoCompra.carencia) &&
        Objects.equals(this.cartao, cdtEventoExternoCompra.cartao) &&
        Objects.equals(this.codigoAutorizacao, cdtEventoExternoCompra.codigoAutorizacao) &&
        Objects.equals(this.dataCompra, cdtEventoExternoCompra.dataCompra) &&
        Objects.equals(this.dataEntradaCompra, cdtEventoExternoCompra.dataEntradaCompra) &&
        Objects.equals(this.dataFinanciamento, cdtEventoExternoCompra.dataFinanciamento) &&
        Objects.equals(this.dataMovimento, cdtEventoExternoCompra.dataMovimento) &&
        Objects.equals(this.dataVencimentoCompraFinal, cdtEventoExternoCompra.dataVencimentoCompraFinal) &&
        Objects.equals(this.dataVencimentoCompraInicial, cdtEventoExternoCompra.dataVencimentoCompraInicial) &&
        Objects.equals(this.dataVencimentoPadrao, cdtEventoExternoCompra.dataVencimentoPadrao) &&
        Objects.equals(this.dataVencimentoReal, cdtEventoExternoCompra.dataVencimentoReal) &&
        Objects.equals(this.descricao, cdtEventoExternoCompra.descricao) &&
        Objects.equals(this.dvnumeroEstabelecimento, cdtEventoExternoCompra.dvnumeroEstabelecimento) &&
        Objects.equals(this.fatorBancoAjustado, cdtEventoExternoCompra.fatorBancoAjustado) &&
        Objects.equals(this.fatorComissaoGarantia, cdtEventoExternoCompra.fatorComissaoGarantia) &&
        Objects.equals(this.fatorTaxaAdministracao, cdtEventoExternoCompra.fatorTaxaAdministracao) &&
        Objects.equals(this.fatorTotal, cdtEventoExternoCompra.fatorTotal) &&
        Objects.equals(this.fatorTotalAjustado, cdtEventoExternoCompra.fatorTotalAjustado) &&
        Objects.equals(this.flagRefinanciamento, cdtEventoExternoCompra.flagRefinanciamento) &&
        Objects.equals(this.flagSelecionado, cdtEventoExternoCompra.flagSelecionado) &&
        Objects.equals(this.id, cdtEventoExternoCompra.id) &&
        Objects.equals(this.idCartao, cdtEventoExternoCompra.idCartao) &&
        Objects.equals(this.idConta, cdtEventoExternoCompra.idConta) &&
        Objects.equals(this.idContaPortador, cdtEventoExternoCompra.idContaPortador) &&
        Objects.equals(this.idCredor, cdtEventoExternoCompra.idCredor) &&
        Objects.equals(this.idEstabelecimento, cdtEventoExternoCompra.idEstabelecimento) &&
        Objects.equals(this.idEstabelecimentoExterno, cdtEventoExternoCompra.idEstabelecimentoExterno) &&
        Objects.equals(this.idEstabelecimentoVISA, cdtEventoExternoCompra.idEstabelecimentoVISA) &&
        Objects.equals(this.idIncoming, cdtEventoExternoCompra.idIncoming) &&
        Objects.equals(this.idMovimento, cdtEventoExternoCompra.idMovimento) &&
        Objects.equals(this.idOrigem, cdtEventoExternoCompra.idOrigem) &&
        Objects.equals(this.idRemessa, cdtEventoExternoCompra.idRemessa) &&
        Objects.equals(this.lote, cdtEventoExternoCompra.lote) &&
        Objects.equals(this.mcc, cdtEventoExternoCompra.mcc) &&
        Objects.equals(this.nomeEstabelecimentoVISA, cdtEventoExternoCompra.nomeEstabelecimentoVISA) &&
        Objects.equals(this.numeroContrato, cdtEventoExternoCompra.numeroContrato) &&
        Objects.equals(this.numeroEstabelecimento, cdtEventoExternoCompra.numeroEstabelecimento) &&
        Objects.equals(this.numeroParcelas, cdtEventoExternoCompra.numeroParcelas) &&
        Objects.equals(this.operacao, cdtEventoExternoCompra.operacao) &&
        Objects.equals(this.origem, cdtEventoExternoCompra.origem) &&
        Objects.equals(this.origemResolucao, cdtEventoExternoCompra.origemResolucao) &&
        Objects.equals(this.quantidadeMoeda, cdtEventoExternoCompra.quantidadeMoeda) &&
        Objects.equals(this.status, cdtEventoExternoCompra.status) &&
        Objects.equals(this.taxaJuros, cdtEventoExternoCompra.taxaJuros) &&
        Objects.equals(this.tipoCalculoPrestacao, cdtEventoExternoCompra.tipoCalculoPrestacao) &&
        Objects.equals(this.tipoCompra, cdtEventoExternoCompra.tipoCompra) &&
        Objects.equals(this.tipoEntrada, cdtEventoExternoCompra.tipoEntrada) &&
        Objects.equals(this.tipoLiquidacao, cdtEventoExternoCompra.tipoLiquidacao) &&
        Objects.equals(this.tipoPagamento, cdtEventoExternoCompra.tipoPagamento) &&
        Objects.equals(this.valorAgenciamento, cdtEventoExternoCompra.valorAgenciamento) &&
        Objects.equals(this.valorComissao, cdtEventoExternoCompra.valorComissao) &&
        Objects.equals(this.valorCompra, cdtEventoExternoCompra.valorCompra) &&
        Objects.equals(this.valorContrato, cdtEventoExternoCompra.valorContrato) &&
        Objects.equals(this.valorEncargosBancarios, cdtEventoExternoCompra.valorEncargosBancarios) &&
        Objects.equals(this.valorEncargosTotais, cdtEventoExternoCompra.valorEncargosTotais) &&
        Objects.equals(this.valorEntrada, cdtEventoExternoCompra.valorEntrada) &&
        Objects.equals(this.valorGarantias, cdtEventoExternoCompra.valorGarantias) &&
        Objects.equals(this.valorIOF, cdtEventoExternoCompra.valorIOF) &&
        Objects.equals(this.valorLiquido, cdtEventoExternoCompra.valorLiquido) &&
        Objects.equals(this.valorOrigem, cdtEventoExternoCompra.valorOrigem) &&
        Objects.equals(this.valorParcela, cdtEventoExternoCompra.valorParcela) &&
        Objects.equals(this.valorTAC, cdtEventoExternoCompra.valorTAC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquireReferenceNumber, autorizacao, carencia, cartao, codigoAutorizacao, dataCompra, dataEntradaCompra, dataFinanciamento, dataMovimento, dataVencimentoCompraFinal, dataVencimentoCompraInicial, dataVencimentoPadrao, dataVencimentoReal, descricao, dvnumeroEstabelecimento, fatorBancoAjustado, fatorComissaoGarantia, fatorTaxaAdministracao, fatorTotal, fatorTotalAjustado, flagRefinanciamento, flagSelecionado, id, idCartao, idConta, idContaPortador, idCredor, idEstabelecimento, idEstabelecimentoExterno, idEstabelecimentoVISA, idIncoming, idMovimento, idOrigem, idRemessa, lote, mcc, nomeEstabelecimentoVISA, numeroContrato, numeroEstabelecimento, numeroParcelas, operacao, origem, origemResolucao, quantidadeMoeda, status, taxaJuros, tipoCalculoPrestacao, tipoCompra, tipoEntrada, tipoLiquidacao, tipoPagamento, valorAgenciamento, valorComissao, valorCompra, valorContrato, valorEncargosBancarios, valorEncargosTotais, valorEntrada, valorGarantias, valorIOF, valorLiquido, valorOrigem, valorParcela, valorTAC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdtEventoExternoCompra {\n");
    
    sb.append("    acquireReferenceNumber: ").append(toIndentedString(acquireReferenceNumber)).append("\n");
    sb.append("    autorizacao: ").append(toIndentedString(autorizacao)).append("\n");
    sb.append("    carencia: ").append(toIndentedString(carencia)).append("\n");
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    codigoAutorizacao: ").append(toIndentedString(codigoAutorizacao)).append("\n");
    sb.append("    dataCompra: ").append(toIndentedString(dataCompra)).append("\n");
    sb.append("    dataEntradaCompra: ").append(toIndentedString(dataEntradaCompra)).append("\n");
    sb.append("    dataFinanciamento: ").append(toIndentedString(dataFinanciamento)).append("\n");
    sb.append("    dataMovimento: ").append(toIndentedString(dataMovimento)).append("\n");
    sb.append("    dataVencimentoCompraFinal: ").append(toIndentedString(dataVencimentoCompraFinal)).append("\n");
    sb.append("    dataVencimentoCompraInicial: ").append(toIndentedString(dataVencimentoCompraInicial)).append("\n");
    sb.append("    dataVencimentoPadrao: ").append(toIndentedString(dataVencimentoPadrao)).append("\n");
    sb.append("    dataVencimentoReal: ").append(toIndentedString(dataVencimentoReal)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    dvnumeroEstabelecimento: ").append(toIndentedString(dvnumeroEstabelecimento)).append("\n");
    sb.append("    fatorBancoAjustado: ").append(toIndentedString(fatorBancoAjustado)).append("\n");
    sb.append("    fatorComissaoGarantia: ").append(toIndentedString(fatorComissaoGarantia)).append("\n");
    sb.append("    fatorTaxaAdministracao: ").append(toIndentedString(fatorTaxaAdministracao)).append("\n");
    sb.append("    fatorTotal: ").append(toIndentedString(fatorTotal)).append("\n");
    sb.append("    fatorTotalAjustado: ").append(toIndentedString(fatorTotalAjustado)).append("\n");
    sb.append("    flagRefinanciamento: ").append(toIndentedString(flagRefinanciamento)).append("\n");
    sb.append("    flagSelecionado: ").append(toIndentedString(flagSelecionado)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idContaPortador: ").append(toIndentedString(idContaPortador)).append("\n");
    sb.append("    idCredor: ").append(toIndentedString(idCredor)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    idEstabelecimentoExterno: ").append(toIndentedString(idEstabelecimentoExterno)).append("\n");
    sb.append("    idEstabelecimentoVISA: ").append(toIndentedString(idEstabelecimentoVISA)).append("\n");
    sb.append("    idIncoming: ").append(toIndentedString(idIncoming)).append("\n");
    sb.append("    idMovimento: ").append(toIndentedString(idMovimento)).append("\n");
    sb.append("    idOrigem: ").append(toIndentedString(idOrigem)).append("\n");
    sb.append("    idRemessa: ").append(toIndentedString(idRemessa)).append("\n");
    sb.append("    lote: ").append(toIndentedString(lote)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    nomeEstabelecimentoVISA: ").append(toIndentedString(nomeEstabelecimentoVISA)).append("\n");
    sb.append("    numeroContrato: ").append(toIndentedString(numeroContrato)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    operacao: ").append(toIndentedString(operacao)).append("\n");
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
    sb.append("    origemResolucao: ").append(toIndentedString(origemResolucao)).append("\n");
    sb.append("    quantidadeMoeda: ").append(toIndentedString(quantidadeMoeda)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taxaJuros: ").append(toIndentedString(taxaJuros)).append("\n");
    sb.append("    tipoCalculoPrestacao: ").append(toIndentedString(tipoCalculoPrestacao)).append("\n");
    sb.append("    tipoCompra: ").append(toIndentedString(tipoCompra)).append("\n");
    sb.append("    tipoEntrada: ").append(toIndentedString(tipoEntrada)).append("\n");
    sb.append("    tipoLiquidacao: ").append(toIndentedString(tipoLiquidacao)).append("\n");
    sb.append("    tipoPagamento: ").append(toIndentedString(tipoPagamento)).append("\n");
    sb.append("    valorAgenciamento: ").append(toIndentedString(valorAgenciamento)).append("\n");
    sb.append("    valorComissao: ").append(toIndentedString(valorComissao)).append("\n");
    sb.append("    valorCompra: ").append(toIndentedString(valorCompra)).append("\n");
    sb.append("    valorContrato: ").append(toIndentedString(valorContrato)).append("\n");
    sb.append("    valorEncargosBancarios: ").append(toIndentedString(valorEncargosBancarios)).append("\n");
    sb.append("    valorEncargosTotais: ").append(toIndentedString(valorEncargosTotais)).append("\n");
    sb.append("    valorEntrada: ").append(toIndentedString(valorEntrada)).append("\n");
    sb.append("    valorGarantias: ").append(toIndentedString(valorGarantias)).append("\n");
    sb.append("    valorIOF: ").append(toIndentedString(valorIOF)).append("\n");
    sb.append("    valorLiquido: ").append(toIndentedString(valorLiquido)).append("\n");
    sb.append("    valorOrigem: ").append(toIndentedString(valorOrigem)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    valorTAC: ").append(toIndentedString(valorTAC)).append("\n");
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

