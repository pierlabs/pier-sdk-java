package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.AutorizacaoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de retorno de um evento externo de compras n\u00E3o processadas
 **/

@ApiModel(description = "Objeto de retorno de um evento externo de compras n\u00E3o processadas")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EventoExternoCompraResponse   {
  
  private Integer dvnumeroEstabelecimento = null;
  private Long mcc = null;
  private String tipoEntrada = null;
  private Long id = null;
  private Long idEstabelecimento = null;
  private Long idConta = null;
  private Long idCartao = null;
  private Long status = null;
  private Integer numeroParcelas = null;
  private BigDecimal valorParcela = null;
  private BigDecimal valorEntrada = null;
  private BigDecimal valorCompra = null;
  private BigDecimal valorContrato = null;
  private BigDecimal valorEncargosTotais = null;
  private String dataCompra = null;
  private Long idOperacao = null;
  private BigDecimal taxaJuros = null;
  private BigDecimal valorIOF = null;
  private BigDecimal valorTAC = null;
  private String origem = null;
  private String dataEntradaCompra = null;
  private String dataVencimentoPadrao = null;
  private String dataVencimentoReal = null;
  private Integer carencia = null;
  private String descricao = null;
  private String cartao = null;
  private BigDecimal valorOrigem = null;
  private Long idIncoming = null;
  private Long idEstabelecimentoVISA = null;
  private String nomeEstabelecimentoVISA = null;
  private Long idEstabelecimentoExterno = null;
  private Long idAutorizacao = null;
  private Long idMovimento = null;
  private Long idRemessa = null;
  private String codigoAutorizacao = null;
  private String numeroContrato = null;
  private Long idContaPortador = null;
  private String dataMovimento = null;
  private Integer lote = null;
  private Integer numeroEstabelecimento = null;
  private BigDecimal quantidadeMoeda = null;
  private BigDecimal fatorTotalAjustado = null;
  private BigDecimal fatorBancoAjustado = null;
  private BigDecimal fatorTaxaAdministracao = null;
  private BigDecimal fatorComissaoGarantia = null;
  private BigDecimal fatorTotal = null;
  private String dataFinanciamento = null;
  private String dataVencimentoCompraInicial = null;
  private String dataVencimentoCompraFinal = null;
  private Boolean flagSelecionado = null;
  private Boolean flagRefinanciamento = null;
  private Integer tipoCompra = null;
  private Integer tipoPagamento = null;
  private Integer tipoCalculoPrestacao = null;
  private Integer tipoLiquidacao = null;
  private Long idCredor = null;
  private BigDecimal valorComissao = null;
  private BigDecimal valorLiquido = null;
  private BigDecimal valorEncargosBancarios = null;
  private BigDecimal valorGarantias = null;
  private BigDecimal valorAgenciamento = null;
  private String origemResolucao = null;
  private Long idOrigem = null;
  private String acquireReferenceNumber = null;
  private AutorizacaoResponse autorizacao = null;

  
  /**
   **/
  public EventoExternoCompraResponse dvnumeroEstabelecimento(Integer dvnumeroEstabelecimento) {
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
  public EventoExternoCompraResponse mcc(Long mcc) {
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
  public EventoExternoCompraResponse tipoEntrada(String tipoEntrada) {
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
   * C\u00F3digo do evento
   **/
  public EventoExternoCompraResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo do evento")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo do estabelecimento
   **/
  public EventoExternoCompraResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo do estabelecimento")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00F3digo da conta
   **/
  public EventoExternoCompraResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo do cart\u00E3o
   **/
  public EventoExternoCompraResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo do cart\u00E3o")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Status do evento
   **/
  public EventoExternoCompraResponse status(Long status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status do evento")
  @JsonProperty("status")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  
  /**
   * N\u00FAmero de parcelas
   **/
  public EventoExternoCompraResponse numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero de parcelas")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Valor da parcela
   **/
  public EventoExternoCompraResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da parcela")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Valor da primeira parcela
   **/
  public EventoExternoCompraResponse valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da primeira parcela")
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Valor da compra
   **/
  public EventoExternoCompraResponse valorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da compra")
  @JsonProperty("valorCompra")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * Valor do contrato
   **/
  public EventoExternoCompraResponse valorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do contrato")
  @JsonProperty("valorContrato")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * Valor dos encargos totais
   **/
  public EventoExternoCompraResponse valorEncargosTotais(BigDecimal valorEncargosTotais) {
    this.valorEncargosTotais = valorEncargosTotais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor dos encargos totais")
  @JsonProperty("valorEncargosTotais")
  public BigDecimal getValorEncargosTotais() {
    return valorEncargosTotais;
  }
  public void setValorEncargosTotais(BigDecimal valorEncargosTotais) {
    this.valorEncargosTotais = valorEncargosTotais;
  }

  
  /**
   * Data da compra
   **/
  public EventoExternoCompraResponse dataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da compra")
  @JsonProperty("dataCompra")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * C\u00F3digo do tipo de opera\u00E7\u00E3o
   **/
  public EventoExternoCompraResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo do tipo de opera\u00E7\u00E3o")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Valor da taxa de juros
   **/
  public EventoExternoCompraResponse taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da taxa de juros")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Valor IOF
   **/
  public EventoExternoCompraResponse valorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor IOF")
  @JsonProperty("valorIOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Valor TAC
   **/
  public EventoExternoCompraResponse valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor TAC")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Origem do evento
   **/
  public EventoExternoCompraResponse origem(String origem) {
    this.origem = origem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Origem do evento")
  @JsonProperty("origem")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * Data de entrada do evento
   **/
  public EventoExternoCompraResponse dataEntradaCompra(String dataEntradaCompra) {
    this.dataEntradaCompra = dataEntradaCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de entrada do evento")
  @JsonProperty("dataEntradaCompra")
  public String getDataEntradaCompra() {
    return dataEntradaCompra;
  }
  public void setDataEntradaCompra(String dataEntradaCompra) {
    this.dataEntradaCompra = dataEntradaCompra;
  }

  
  /**
   * Data de vencimento padr\u00E3o
   **/
  public EventoExternoCompraResponse dataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento padr\u00E3o")
  @JsonProperty("dataVencimentoPadrao")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * Data de vencimento real
   **/
  public EventoExternoCompraResponse dataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento real")
  @JsonProperty("dataVencimentoReal")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Car\u00EAncia
   **/
  public EventoExternoCompraResponse carencia(Integer carencia) {
    this.carencia = carencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Car\u00EAncia")
  @JsonProperty("carencia")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   * Descri\u00E7\u00E3o do evento
   **/
  public EventoExternoCompraResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do evento")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * N\u00FAmero do cart\u00E3o
   **/
  public EventoExternoCompraResponse cartao(String cartao) {
    this.cartao = cartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do cart\u00E3o")
  @JsonProperty("cartao")
  public String getCartao() {
    return cartao;
  }
  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  
  /**
   * Valor de origem
   **/
  public EventoExternoCompraResponse valorOrigem(BigDecimal valorOrigem) {
    this.valorOrigem = valorOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor de origem")
  @JsonProperty("valorOrigem")
  public BigDecimal getValorOrigem() {
    return valorOrigem;
  }
  public void setValorOrigem(BigDecimal valorOrigem) {
    this.valorOrigem = valorOrigem;
  }

  
  /**
   * C\u00F3digo de entrada
   **/
  public EventoExternoCompraResponse idIncoming(Long idIncoming) {
    this.idIncoming = idIncoming;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de entrada")
  @JsonProperty("idIncoming")
  public Long getIdIncoming() {
    return idIncoming;
  }
  public void setIdIncoming(Long idIncoming) {
    this.idIncoming = idIncoming;
  }

  
  /**
   * C\u00F3digo do estabelecimento VISA
   **/
  public EventoExternoCompraResponse idEstabelecimentoVISA(Long idEstabelecimentoVISA) {
    this.idEstabelecimentoVISA = idEstabelecimentoVISA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo do estabelecimento VISA")
  @JsonProperty("idEstabelecimentoVISA")
  public Long getIdEstabelecimentoVISA() {
    return idEstabelecimentoVISA;
  }
  public void setIdEstabelecimentoVISA(Long idEstabelecimentoVISA) {
    this.idEstabelecimentoVISA = idEstabelecimentoVISA;
  }

  
  /**
   * Nome do estabelecimento VISA
   **/
  public EventoExternoCompraResponse nomeEstabelecimentoVISA(String nomeEstabelecimentoVISA) {
    this.nomeEstabelecimentoVISA = nomeEstabelecimentoVISA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do estabelecimento VISA")
  @JsonProperty("nomeEstabelecimentoVISA")
  public String getNomeEstabelecimentoVISA() {
    return nomeEstabelecimentoVISA;
  }
  public void setNomeEstabelecimentoVISA(String nomeEstabelecimentoVISA) {
    this.nomeEstabelecimentoVISA = nomeEstabelecimentoVISA;
  }

  
  /**
   * C\u00F3digo do estabelecimento externo
   **/
  public EventoExternoCompraResponse idEstabelecimentoExterno(Long idEstabelecimentoExterno) {
    this.idEstabelecimentoExterno = idEstabelecimentoExterno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo do estabelecimento externo")
  @JsonProperty("idEstabelecimentoExterno")
  public Long getIdEstabelecimentoExterno() {
    return idEstabelecimentoExterno;
  }
  public void setIdEstabelecimentoExterno(Long idEstabelecimentoExterno) {
    this.idEstabelecimentoExterno = idEstabelecimentoExterno;
  }

  
  /**
   * Identificador de autoriza\u00E7\u00E3o
   **/
  public EventoExternoCompraResponse idAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador de autoriza\u00E7\u00E3o")
  @JsonProperty("idAutorizacao")
  public Long getIdAutorizacao() {
    return idAutorizacao;
  }
  public void setIdAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
  }

  
  /**
   * C\u00F3digo de movimento
   **/
  public EventoExternoCompraResponse idMovimento(Long idMovimento) {
    this.idMovimento = idMovimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de movimento")
  @JsonProperty("idMovimento")
  public Long getIdMovimento() {
    return idMovimento;
  }
  public void setIdMovimento(Long idMovimento) {
    this.idMovimento = idMovimento;
  }

  
  /**
   * C\u00F3digo de remessa
   **/
  public EventoExternoCompraResponse idRemessa(Long idRemessa) {
    this.idRemessa = idRemessa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de remessa")
  @JsonProperty("idRemessa")
  public Long getIdRemessa() {
    return idRemessa;
  }
  public void setIdRemessa(Long idRemessa) {
    this.idRemessa = idRemessa;
  }

  
  /**
   * C\u00F3digo de autorizac\u00E3o
   **/
  public EventoExternoCompraResponse codigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de autorizac\u00E3o")
  @JsonProperty("codigoAutorizacao")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * N\u00FAmero do contrato
   **/
  public EventoExternoCompraResponse numeroContrato(String numeroContrato) {
    this.numeroContrato = numeroContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do contrato")
  @JsonProperty("numeroContrato")
  public String getNumeroContrato() {
    return numeroContrato;
  }
  public void setNumeroContrato(String numeroContrato) {
    this.numeroContrato = numeroContrato;
  }

  
  /**
   * C\u00F3digo da conta do portador
   **/
  public EventoExternoCompraResponse idContaPortador(Long idContaPortador) {
    this.idContaPortador = idContaPortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo da conta do portador")
  @JsonProperty("idContaPortador")
  public Long getIdContaPortador() {
    return idContaPortador;
  }
  public void setIdContaPortador(Long idContaPortador) {
    this.idContaPortador = idContaPortador;
  }

  
  /**
   * Data de movimento
   **/
  public EventoExternoCompraResponse dataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de movimento")
  @JsonProperty("dataMovimento")
  public String getDataMovimento() {
    return dataMovimento;
  }
  public void setDataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
  }

  
  /**
   * N\u00FAmero do lote
   **/
  public EventoExternoCompraResponse lote(Integer lote) {
    this.lote = lote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do lote")
  @JsonProperty("lote")
  public Integer getLote() {
    return lote;
  }
  public void setLote(Integer lote) {
    this.lote = lote;
  }

  
  /**
   * N\u00FAmero do estabelecimento
   **/
  public EventoExternoCompraResponse numeroEstabelecimento(Integer numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do estabelecimento")
  @JsonProperty("numeroEstabelecimento")
  public Integer getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Integer numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * Quantidade de moeda
   **/
  public EventoExternoCompraResponse quantidadeMoeda(BigDecimal quantidadeMoeda) {
    this.quantidadeMoeda = quantidadeMoeda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de moeda")
  @JsonProperty("quantidadeMoeda")
  public BigDecimal getQuantidadeMoeda() {
    return quantidadeMoeda;
  }
  public void setQuantidadeMoeda(BigDecimal quantidadeMoeda) {
    this.quantidadeMoeda = quantidadeMoeda;
  }

  
  /**
   * Fator total ajustado
   **/
  public EventoExternoCompraResponse fatorTotalAjustado(BigDecimal fatorTotalAjustado) {
    this.fatorTotalAjustado = fatorTotalAjustado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fator total ajustado")
  @JsonProperty("fatorTotalAjustado")
  public BigDecimal getFatorTotalAjustado() {
    return fatorTotalAjustado;
  }
  public void setFatorTotalAjustado(BigDecimal fatorTotalAjustado) {
    this.fatorTotalAjustado = fatorTotalAjustado;
  }

  
  /**
   * Fator de banco ajustado
   **/
  public EventoExternoCompraResponse fatorBancoAjustado(BigDecimal fatorBancoAjustado) {
    this.fatorBancoAjustado = fatorBancoAjustado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fator de banco ajustado")
  @JsonProperty("fatorBancoAjustado")
  public BigDecimal getFatorBancoAjustado() {
    return fatorBancoAjustado;
  }
  public void setFatorBancoAjustado(BigDecimal fatorBancoAjustado) {
    this.fatorBancoAjustado = fatorBancoAjustado;
  }

  
  /**
   * Fator da taxa de administra\u00E7\u00E3o
   **/
  public EventoExternoCompraResponse fatorTaxaAdministracao(BigDecimal fatorTaxaAdministracao) {
    this.fatorTaxaAdministracao = fatorTaxaAdministracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fator da taxa de administra\u00E7\u00E3o")
  @JsonProperty("fatorTaxaAdministracao")
  public BigDecimal getFatorTaxaAdministracao() {
    return fatorTaxaAdministracao;
  }
  public void setFatorTaxaAdministracao(BigDecimal fatorTaxaAdministracao) {
    this.fatorTaxaAdministracao = fatorTaxaAdministracao;
  }

  
  /**
   * Fator da comiss\u00E3o de garantia
   **/
  public EventoExternoCompraResponse fatorComissaoGarantia(BigDecimal fatorComissaoGarantia) {
    this.fatorComissaoGarantia = fatorComissaoGarantia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fator da comiss\u00E3o de garantia")
  @JsonProperty("fatorComissaoGarantia")
  public BigDecimal getFatorComissaoGarantia() {
    return fatorComissaoGarantia;
  }
  public void setFatorComissaoGarantia(BigDecimal fatorComissaoGarantia) {
    this.fatorComissaoGarantia = fatorComissaoGarantia;
  }

  
  /**
   * Fator total
   **/
  public EventoExternoCompraResponse fatorTotal(BigDecimal fatorTotal) {
    this.fatorTotal = fatorTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fator total")
  @JsonProperty("fatorTotal")
  public BigDecimal getFatorTotal() {
    return fatorTotal;
  }
  public void setFatorTotal(BigDecimal fatorTotal) {
    this.fatorTotal = fatorTotal;
  }

  
  /**
   * Data de financiamento
   **/
  public EventoExternoCompraResponse dataFinanciamento(String dataFinanciamento) {
    this.dataFinanciamento = dataFinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de financiamento")
  @JsonProperty("dataFinanciamento")
  public String getDataFinanciamento() {
    return dataFinanciamento;
  }
  public void setDataFinanciamento(String dataFinanciamento) {
    this.dataFinanciamento = dataFinanciamento;
  }

  
  /**
   * Data de vencimento de compra inicial
   **/
  public EventoExternoCompraResponse dataVencimentoCompraInicial(String dataVencimentoCompraInicial) {
    this.dataVencimentoCompraInicial = dataVencimentoCompraInicial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento de compra inicial")
  @JsonProperty("dataVencimentoCompraInicial")
  public String getDataVencimentoCompraInicial() {
    return dataVencimentoCompraInicial;
  }
  public void setDataVencimentoCompraInicial(String dataVencimentoCompraInicial) {
    this.dataVencimentoCompraInicial = dataVencimentoCompraInicial;
  }

  
  /**
   * Data de vencimento de compra final
   **/
  public EventoExternoCompraResponse dataVencimentoCompraFinal(String dataVencimentoCompraFinal) {
    this.dataVencimentoCompraFinal = dataVencimentoCompraFinal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento de compra final")
  @JsonProperty("dataVencimentoCompraFinal")
  public String getDataVencimentoCompraFinal() {
    return dataVencimentoCompraFinal;
  }
  public void setDataVencimentoCompraFinal(String dataVencimentoCompraFinal) {
    this.dataVencimentoCompraFinal = dataVencimentoCompraFinal;
  }

  
  /**
   * Flag de sele\u00E7\u00E3o
   **/
  public EventoExternoCompraResponse flagSelecionado(Boolean flagSelecionado) {
    this.flagSelecionado = flagSelecionado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag de sele\u00E7\u00E3o")
  @JsonProperty("flagSelecionado")
  public Boolean getFlagSelecionado() {
    return flagSelecionado;
  }
  public void setFlagSelecionado(Boolean flagSelecionado) {
    this.flagSelecionado = flagSelecionado;
  }

  
  /**
   * Flag de refinanciamento
   **/
  public EventoExternoCompraResponse flagRefinanciamento(Boolean flagRefinanciamento) {
    this.flagRefinanciamento = flagRefinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag de refinanciamento")
  @JsonProperty("flagRefinanciamento")
  public Boolean getFlagRefinanciamento() {
    return flagRefinanciamento;
  }
  public void setFlagRefinanciamento(Boolean flagRefinanciamento) {
    this.flagRefinanciamento = flagRefinanciamento;
  }

  
  /**
   * Tipo de compra
   **/
  public EventoExternoCompraResponse tipoCompra(Integer tipoCompra) {
    this.tipoCompra = tipoCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo de compra")
  @JsonProperty("tipoCompra")
  public Integer getTipoCompra() {
    return tipoCompra;
  }
  public void setTipoCompra(Integer tipoCompra) {
    this.tipoCompra = tipoCompra;
  }

  
  /**
   * Tipo de pagamento
   **/
  public EventoExternoCompraResponse tipoPagamento(Integer tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo de pagamento")
  @JsonProperty("tipoPagamento")
  public Integer getTipoPagamento() {
    return tipoPagamento;
  }
  public void setTipoPagamento(Integer tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  
  /**
   * Tipo de c\u00E1lculo de presta\u00E7\u00E3o
   **/
  public EventoExternoCompraResponse tipoCalculoPrestacao(Integer tipoCalculoPrestacao) {
    this.tipoCalculoPrestacao = tipoCalculoPrestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo de c\u00E1lculo de presta\u00E7\u00E3o")
  @JsonProperty("tipoCalculoPrestacao")
  public Integer getTipoCalculoPrestacao() {
    return tipoCalculoPrestacao;
  }
  public void setTipoCalculoPrestacao(Integer tipoCalculoPrestacao) {
    this.tipoCalculoPrestacao = tipoCalculoPrestacao;
  }

  
  /**
   * Tipo de liquida\u00E7\u00E3o
   **/
  public EventoExternoCompraResponse tipoLiquidacao(Integer tipoLiquidacao) {
    this.tipoLiquidacao = tipoLiquidacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo de liquida\u00E7\u00E3o")
  @JsonProperty("tipoLiquidacao")
  public Integer getTipoLiquidacao() {
    return tipoLiquidacao;
  }
  public void setTipoLiquidacao(Integer tipoLiquidacao) {
    this.tipoLiquidacao = tipoLiquidacao;
  }

  
  /**
   * C\u00F3digo do credor
   **/
  public EventoExternoCompraResponse idCredor(Long idCredor) {
    this.idCredor = idCredor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo do credor")
  @JsonProperty("idCredor")
  public Long getIdCredor() {
    return idCredor;
  }
  public void setIdCredor(Long idCredor) {
    this.idCredor = idCredor;
  }

  
  /**
   * Valor da comiss\u00E3o
   **/
  public EventoExternoCompraResponse valorComissao(BigDecimal valorComissao) {
    this.valorComissao = valorComissao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da comiss\u00E3o")
  @JsonProperty("valorComissao")
  public BigDecimal getValorComissao() {
    return valorComissao;
  }
  public void setValorComissao(BigDecimal valorComissao) {
    this.valorComissao = valorComissao;
  }

  
  /**
   * Valor l\u00EDquido
   **/
  public EventoExternoCompraResponse valorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor l\u00EDquido")
  @JsonProperty("valorLiquido")
  public BigDecimal getValorLiquido() {
    return valorLiquido;
  }
  public void setValorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
  }

  
  /**
   * Valor dos encargos banc\u00E1rios
   **/
  public EventoExternoCompraResponse valorEncargosBancarios(BigDecimal valorEncargosBancarios) {
    this.valorEncargosBancarios = valorEncargosBancarios;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor dos encargos banc\u00E1rios")
  @JsonProperty("valorEncargosBancarios")
  public BigDecimal getValorEncargosBancarios() {
    return valorEncargosBancarios;
  }
  public void setValorEncargosBancarios(BigDecimal valorEncargosBancarios) {
    this.valorEncargosBancarios = valorEncargosBancarios;
  }

  
  /**
   * Valor das garantias
   **/
  public EventoExternoCompraResponse valorGarantias(BigDecimal valorGarantias) {
    this.valorGarantias = valorGarantias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor das garantias")
  @JsonProperty("valorGarantias")
  public BigDecimal getValorGarantias() {
    return valorGarantias;
  }
  public void setValorGarantias(BigDecimal valorGarantias) {
    this.valorGarantias = valorGarantias;
  }

  
  /**
   * Valor do agenciamento
   **/
  public EventoExternoCompraResponse valorAgenciamento(BigDecimal valorAgenciamento) {
    this.valorAgenciamento = valorAgenciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do agenciamento")
  @JsonProperty("valorAgenciamento")
  public BigDecimal getValorAgenciamento() {
    return valorAgenciamento;
  }
  public void setValorAgenciamento(BigDecimal valorAgenciamento) {
    this.valorAgenciamento = valorAgenciamento;
  }

  
  /**
   * Origem da resolu\u00E7\u00E3o
   **/
  public EventoExternoCompraResponse origemResolucao(String origemResolucao) {
    this.origemResolucao = origemResolucao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Origem da resolu\u00E7\u00E3o")
  @JsonProperty("origemResolucao")
  public String getOrigemResolucao() {
    return origemResolucao;
  }
  public void setOrigemResolucao(String origemResolucao) {
    this.origemResolucao = origemResolucao;
  }

  
  /**
   * Identificador de origem
   **/
  public EventoExternoCompraResponse idOrigem(Long idOrigem) {
    this.idOrigem = idOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador de origem")
  @JsonProperty("idOrigem")
  public Long getIdOrigem() {
    return idOrigem;
  }
  public void setIdOrigem(Long idOrigem) {
    this.idOrigem = idOrigem;
  }

  
  /**
   * N\u00FAmero de refer\u00EAncia de aquisi\u00E7\u00E3o
   **/
  public EventoExternoCompraResponse acquireReferenceNumber(String acquireReferenceNumber) {
    this.acquireReferenceNumber = acquireReferenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero de refer\u00EAncia de aquisi\u00E7\u00E3o")
  @JsonProperty("acquireReferenceNumber")
  public String getAcquireReferenceNumber() {
    return acquireReferenceNumber;
  }
  public void setAcquireReferenceNumber(String acquireReferenceNumber) {
    this.acquireReferenceNumber = acquireReferenceNumber;
  }

  
  /**
   * Informa\u00E7\u00F5es de autoriza\u00E7\u00E3o
   **/
  public EventoExternoCompraResponse autorizacao(AutorizacaoResponse autorizacao) {
    this.autorizacao = autorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Informa\u00E7\u00F5es de autoriza\u00E7\u00E3o")
  @JsonProperty("autorizacao")
  public AutorizacaoResponse getAutorizacao() {
    return autorizacao;
  }
  public void setAutorizacao(AutorizacaoResponse autorizacao) {
    this.autorizacao = autorizacao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventoExternoCompraResponse eventoExternoCompraResponse = (EventoExternoCompraResponse) o;
    return Objects.equals(this.dvnumeroEstabelecimento, eventoExternoCompraResponse.dvnumeroEstabelecimento) &&
        Objects.equals(this.mcc, eventoExternoCompraResponse.mcc) &&
        Objects.equals(this.tipoEntrada, eventoExternoCompraResponse.tipoEntrada) &&
        Objects.equals(this.id, eventoExternoCompraResponse.id) &&
        Objects.equals(this.idEstabelecimento, eventoExternoCompraResponse.idEstabelecimento) &&
        Objects.equals(this.idConta, eventoExternoCompraResponse.idConta) &&
        Objects.equals(this.idCartao, eventoExternoCompraResponse.idCartao) &&
        Objects.equals(this.status, eventoExternoCompraResponse.status) &&
        Objects.equals(this.numeroParcelas, eventoExternoCompraResponse.numeroParcelas) &&
        Objects.equals(this.valorParcela, eventoExternoCompraResponse.valorParcela) &&
        Objects.equals(this.valorEntrada, eventoExternoCompraResponse.valorEntrada) &&
        Objects.equals(this.valorCompra, eventoExternoCompraResponse.valorCompra) &&
        Objects.equals(this.valorContrato, eventoExternoCompraResponse.valorContrato) &&
        Objects.equals(this.valorEncargosTotais, eventoExternoCompraResponse.valorEncargosTotais) &&
        Objects.equals(this.dataCompra, eventoExternoCompraResponse.dataCompra) &&
        Objects.equals(this.idOperacao, eventoExternoCompraResponse.idOperacao) &&
        Objects.equals(this.taxaJuros, eventoExternoCompraResponse.taxaJuros) &&
        Objects.equals(this.valorIOF, eventoExternoCompraResponse.valorIOF) &&
        Objects.equals(this.valorTAC, eventoExternoCompraResponse.valorTAC) &&
        Objects.equals(this.origem, eventoExternoCompraResponse.origem) &&
        Objects.equals(this.dataEntradaCompra, eventoExternoCompraResponse.dataEntradaCompra) &&
        Objects.equals(this.dataVencimentoPadrao, eventoExternoCompraResponse.dataVencimentoPadrao) &&
        Objects.equals(this.dataVencimentoReal, eventoExternoCompraResponse.dataVencimentoReal) &&
        Objects.equals(this.carencia, eventoExternoCompraResponse.carencia) &&
        Objects.equals(this.descricao, eventoExternoCompraResponse.descricao) &&
        Objects.equals(this.cartao, eventoExternoCompraResponse.cartao) &&
        Objects.equals(this.valorOrigem, eventoExternoCompraResponse.valorOrigem) &&
        Objects.equals(this.idIncoming, eventoExternoCompraResponse.idIncoming) &&
        Objects.equals(this.idEstabelecimentoVISA, eventoExternoCompraResponse.idEstabelecimentoVISA) &&
        Objects.equals(this.nomeEstabelecimentoVISA, eventoExternoCompraResponse.nomeEstabelecimentoVISA) &&
        Objects.equals(this.idEstabelecimentoExterno, eventoExternoCompraResponse.idEstabelecimentoExterno) &&
        Objects.equals(this.idAutorizacao, eventoExternoCompraResponse.idAutorizacao) &&
        Objects.equals(this.idMovimento, eventoExternoCompraResponse.idMovimento) &&
        Objects.equals(this.idRemessa, eventoExternoCompraResponse.idRemessa) &&
        Objects.equals(this.codigoAutorizacao, eventoExternoCompraResponse.codigoAutorizacao) &&
        Objects.equals(this.numeroContrato, eventoExternoCompraResponse.numeroContrato) &&
        Objects.equals(this.idContaPortador, eventoExternoCompraResponse.idContaPortador) &&
        Objects.equals(this.dataMovimento, eventoExternoCompraResponse.dataMovimento) &&
        Objects.equals(this.lote, eventoExternoCompraResponse.lote) &&
        Objects.equals(this.numeroEstabelecimento, eventoExternoCompraResponse.numeroEstabelecimento) &&
        Objects.equals(this.quantidadeMoeda, eventoExternoCompraResponse.quantidadeMoeda) &&
        Objects.equals(this.fatorTotalAjustado, eventoExternoCompraResponse.fatorTotalAjustado) &&
        Objects.equals(this.fatorBancoAjustado, eventoExternoCompraResponse.fatorBancoAjustado) &&
        Objects.equals(this.fatorTaxaAdministracao, eventoExternoCompraResponse.fatorTaxaAdministracao) &&
        Objects.equals(this.fatorComissaoGarantia, eventoExternoCompraResponse.fatorComissaoGarantia) &&
        Objects.equals(this.fatorTotal, eventoExternoCompraResponse.fatorTotal) &&
        Objects.equals(this.dataFinanciamento, eventoExternoCompraResponse.dataFinanciamento) &&
        Objects.equals(this.dataVencimentoCompraInicial, eventoExternoCompraResponse.dataVencimentoCompraInicial) &&
        Objects.equals(this.dataVencimentoCompraFinal, eventoExternoCompraResponse.dataVencimentoCompraFinal) &&
        Objects.equals(this.flagSelecionado, eventoExternoCompraResponse.flagSelecionado) &&
        Objects.equals(this.flagRefinanciamento, eventoExternoCompraResponse.flagRefinanciamento) &&
        Objects.equals(this.tipoCompra, eventoExternoCompraResponse.tipoCompra) &&
        Objects.equals(this.tipoPagamento, eventoExternoCompraResponse.tipoPagamento) &&
        Objects.equals(this.tipoCalculoPrestacao, eventoExternoCompraResponse.tipoCalculoPrestacao) &&
        Objects.equals(this.tipoLiquidacao, eventoExternoCompraResponse.tipoLiquidacao) &&
        Objects.equals(this.idCredor, eventoExternoCompraResponse.idCredor) &&
        Objects.equals(this.valorComissao, eventoExternoCompraResponse.valorComissao) &&
        Objects.equals(this.valorLiquido, eventoExternoCompraResponse.valorLiquido) &&
        Objects.equals(this.valorEncargosBancarios, eventoExternoCompraResponse.valorEncargosBancarios) &&
        Objects.equals(this.valorGarantias, eventoExternoCompraResponse.valorGarantias) &&
        Objects.equals(this.valorAgenciamento, eventoExternoCompraResponse.valorAgenciamento) &&
        Objects.equals(this.origemResolucao, eventoExternoCompraResponse.origemResolucao) &&
        Objects.equals(this.idOrigem, eventoExternoCompraResponse.idOrigem) &&
        Objects.equals(this.acquireReferenceNumber, eventoExternoCompraResponse.acquireReferenceNumber) &&
        Objects.equals(this.autorizacao, eventoExternoCompraResponse.autorizacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dvnumeroEstabelecimento, mcc, tipoEntrada, id, idEstabelecimento, idConta, idCartao, status, numeroParcelas, valorParcela, valorEntrada, valorCompra, valorContrato, valorEncargosTotais, dataCompra, idOperacao, taxaJuros, valorIOF, valorTAC, origem, dataEntradaCompra, dataVencimentoPadrao, dataVencimentoReal, carencia, descricao, cartao, valorOrigem, idIncoming, idEstabelecimentoVISA, nomeEstabelecimentoVISA, idEstabelecimentoExterno, idAutorizacao, idMovimento, idRemessa, codigoAutorizacao, numeroContrato, idContaPortador, dataMovimento, lote, numeroEstabelecimento, quantidadeMoeda, fatorTotalAjustado, fatorBancoAjustado, fatorTaxaAdministracao, fatorComissaoGarantia, fatorTotal, dataFinanciamento, dataVencimentoCompraInicial, dataVencimentoCompraFinal, flagSelecionado, flagRefinanciamento, tipoCompra, tipoPagamento, tipoCalculoPrestacao, tipoLiquidacao, idCredor, valorComissao, valorLiquido, valorEncargosBancarios, valorGarantias, valorAgenciamento, origemResolucao, idOrigem, acquireReferenceNumber, autorizacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventoExternoCompraResponse {\n");
    
    sb.append("    dvnumeroEstabelecimento: ").append(toIndentedString(dvnumeroEstabelecimento)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    tipoEntrada: ").append(toIndentedString(tipoEntrada)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    valorEntrada: ").append(toIndentedString(valorEntrada)).append("\n");
    sb.append("    valorCompra: ").append(toIndentedString(valorCompra)).append("\n");
    sb.append("    valorContrato: ").append(toIndentedString(valorContrato)).append("\n");
    sb.append("    valorEncargosTotais: ").append(toIndentedString(valorEncargosTotais)).append("\n");
    sb.append("    dataCompra: ").append(toIndentedString(dataCompra)).append("\n");
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
    sb.append("    taxaJuros: ").append(toIndentedString(taxaJuros)).append("\n");
    sb.append("    valorIOF: ").append(toIndentedString(valorIOF)).append("\n");
    sb.append("    valorTAC: ").append(toIndentedString(valorTAC)).append("\n");
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
    sb.append("    dataEntradaCompra: ").append(toIndentedString(dataEntradaCompra)).append("\n");
    sb.append("    dataVencimentoPadrao: ").append(toIndentedString(dataVencimentoPadrao)).append("\n");
    sb.append("    dataVencimentoReal: ").append(toIndentedString(dataVencimentoReal)).append("\n");
    sb.append("    carencia: ").append(toIndentedString(carencia)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    valorOrigem: ").append(toIndentedString(valorOrigem)).append("\n");
    sb.append("    idIncoming: ").append(toIndentedString(idIncoming)).append("\n");
    sb.append("    idEstabelecimentoVISA: ").append(toIndentedString(idEstabelecimentoVISA)).append("\n");
    sb.append("    nomeEstabelecimentoVISA: ").append(toIndentedString(nomeEstabelecimentoVISA)).append("\n");
    sb.append("    idEstabelecimentoExterno: ").append(toIndentedString(idEstabelecimentoExterno)).append("\n");
    sb.append("    idAutorizacao: ").append(toIndentedString(idAutorizacao)).append("\n");
    sb.append("    idMovimento: ").append(toIndentedString(idMovimento)).append("\n");
    sb.append("    idRemessa: ").append(toIndentedString(idRemessa)).append("\n");
    sb.append("    codigoAutorizacao: ").append(toIndentedString(codigoAutorizacao)).append("\n");
    sb.append("    numeroContrato: ").append(toIndentedString(numeroContrato)).append("\n");
    sb.append("    idContaPortador: ").append(toIndentedString(idContaPortador)).append("\n");
    sb.append("    dataMovimento: ").append(toIndentedString(dataMovimento)).append("\n");
    sb.append("    lote: ").append(toIndentedString(lote)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
    sb.append("    quantidadeMoeda: ").append(toIndentedString(quantidadeMoeda)).append("\n");
    sb.append("    fatorTotalAjustado: ").append(toIndentedString(fatorTotalAjustado)).append("\n");
    sb.append("    fatorBancoAjustado: ").append(toIndentedString(fatorBancoAjustado)).append("\n");
    sb.append("    fatorTaxaAdministracao: ").append(toIndentedString(fatorTaxaAdministracao)).append("\n");
    sb.append("    fatorComissaoGarantia: ").append(toIndentedString(fatorComissaoGarantia)).append("\n");
    sb.append("    fatorTotal: ").append(toIndentedString(fatorTotal)).append("\n");
    sb.append("    dataFinanciamento: ").append(toIndentedString(dataFinanciamento)).append("\n");
    sb.append("    dataVencimentoCompraInicial: ").append(toIndentedString(dataVencimentoCompraInicial)).append("\n");
    sb.append("    dataVencimentoCompraFinal: ").append(toIndentedString(dataVencimentoCompraFinal)).append("\n");
    sb.append("    flagSelecionado: ").append(toIndentedString(flagSelecionado)).append("\n");
    sb.append("    flagRefinanciamento: ").append(toIndentedString(flagRefinanciamento)).append("\n");
    sb.append("    tipoCompra: ").append(toIndentedString(tipoCompra)).append("\n");
    sb.append("    tipoPagamento: ").append(toIndentedString(tipoPagamento)).append("\n");
    sb.append("    tipoCalculoPrestacao: ").append(toIndentedString(tipoCalculoPrestacao)).append("\n");
    sb.append("    tipoLiquidacao: ").append(toIndentedString(tipoLiquidacao)).append("\n");
    sb.append("    idCredor: ").append(toIndentedString(idCredor)).append("\n");
    sb.append("    valorComissao: ").append(toIndentedString(valorComissao)).append("\n");
    sb.append("    valorLiquido: ").append(toIndentedString(valorLiquido)).append("\n");
    sb.append("    valorEncargosBancarios: ").append(toIndentedString(valorEncargosBancarios)).append("\n");
    sb.append("    valorGarantias: ").append(toIndentedString(valorGarantias)).append("\n");
    sb.append("    valorAgenciamento: ").append(toIndentedString(valorAgenciamento)).append("\n");
    sb.append("    origemResolucao: ").append(toIndentedString(origemResolucao)).append("\n");
    sb.append("    idOrigem: ").append(toIndentedString(idOrigem)).append("\n");
    sb.append("    acquireReferenceNumber: ").append(toIndentedString(acquireReferenceNumber)).append("\n");
    sb.append("    autorizacao: ").append(toIndentedString(autorizacao)).append("\n");
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

