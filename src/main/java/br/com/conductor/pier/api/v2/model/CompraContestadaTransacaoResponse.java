package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * {{{compra_contestada_transacao_response_description}}}
 **/

@ApiModel(description = "{{{compra_contestada_transacao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CompraContestadaTransacaoResponse   {
  
  private String mcc = null;
  private Long idCompraContestada = null;
  private String bandeira = null;
  private String historico = null;
  private Date dataTransacao = null;
  private Long agingCompras = null;
  private Double valorContrato = null;
  private Double valorCompra = null;
  private String tipoTransacao = null;
  private String codigoAutorizacao = null;
  private String codigoMoedaDestino = null;
  private Double valorDestino = null;
  private String codigoEventoCompra = null;
  private String codigoContestacao = null;
  private Integer internacional = null;
  private String modoEntrada = null;
  private String modoDeEntradaDescricao = null;
  private String nomeEstabelecimento = null;
  private Date dataContestacao = null;
  private String responsavelAbertuda = null;
  private Long agingContestacao = null;
  private String statusContestacao = null;
  private Date dataAlteracao = null;
  private String responsavelAlteracao = null;
  private String razaoCB = null;
  private String dataEnvioCB = null;
  private String reporteBandeira = null;
  private String numeroControle = null;
  private String referenceNumber = null;
  private String transacaoSegura = null;
  private String motivo2Reapresentacao = null;
  private String data2Reapresentacao = null;

  
  /**
   **/
  public CompraContestadaTransacaoResponse mcc(String mcc) {
    this.mcc = mcc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mcc")
  public String getMcc() {
    return mcc;
  }
  public void setMcc(String mcc) {
    this.mcc = mcc;
  }

  
  /**
   * {{{compra_contestada_transacao_response_id_compra_contestada_value}}}
   **/
  public CompraContestadaTransacaoResponse idCompraContestada(Long idCompraContestada) {
    this.idCompraContestada = idCompraContestada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_id_compra_contestada_value}}}")
  @JsonProperty("idCompraContestada")
  public Long getIdCompraContestada() {
    return idCompraContestada;
  }
  public void setIdCompraContestada(Long idCompraContestada) {
    this.idCompraContestada = idCompraContestada;
  }

  
  /**
   * {{{compra_contestada_transacao_response_bandeira_value}}}
   **/
  public CompraContestadaTransacaoResponse bandeira(String bandeira) {
    this.bandeira = bandeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_bandeira_value}}}")
  @JsonProperty("bandeira")
  public String getBandeira() {
    return bandeira;
  }
  public void setBandeira(String bandeira) {
    this.bandeira = bandeira;
  }

  
  /**
   * {{{compra_contestada_transacao_response_historico_value}}}
   **/
  public CompraContestadaTransacaoResponse historico(String historico) {
    this.historico = historico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_historico_value}}}")
  @JsonProperty("historico")
  public String getHistorico() {
    return historico;
  }
  public void setHistorico(String historico) {
    this.historico = historico;
  }

  
  /**
   * {{{compra_contestada_transacao_response_data_transacao_value}}}
   **/
  public CompraContestadaTransacaoResponse dataTransacao(Date dataTransacao) {
    this.dataTransacao = dataTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_data_transacao_value}}}")
  @JsonProperty("dataTransacao")
  public Date getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(Date dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_aging_compras_value}}}
   **/
  public CompraContestadaTransacaoResponse agingCompras(Long agingCompras) {
    this.agingCompras = agingCompras;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_aging_compras_value}}}")
  @JsonProperty("agingCompras")
  public Long getAgingCompras() {
    return agingCompras;
  }
  public void setAgingCompras(Long agingCompras) {
    this.agingCompras = agingCompras;
  }

  
  /**
   * {{{compra_contestada_transacao_response_valor_contrato_value}}}
   **/
  public CompraContestadaTransacaoResponse valorContrato(Double valorContrato) {
    this.valorContrato = valorContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_valor_contrato_value}}}")
  @JsonProperty("valorContrato")
  public Double getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(Double valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * {{{compra_contestada_transacao_response_valor_compra_value}}}
   **/
  public CompraContestadaTransacaoResponse valorCompra(Double valorCompra) {
    this.valorCompra = valorCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_valor_compra_value}}}")
  @JsonProperty("valorCompra")
  public Double getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(Double valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * {{{compra_contestada_transacao_response_tipo_transacao_value}}}
   **/
  public CompraContestadaTransacaoResponse tipoTransacao(String tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_tipo_transacao_value}}}")
  @JsonProperty("tipoTransacao")
  public String getTipoTransacao() {
    return tipoTransacao;
  }
  public void setTipoTransacao(String tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_codigo_autorizacao_value}}}
   **/
  public CompraContestadaTransacaoResponse codigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_codigo_autorizacao_value}}}")
  @JsonProperty("codigoAutorizacao")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_codigo_moeda_destino_value}}}
   **/
  public CompraContestadaTransacaoResponse codigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_codigo_moeda_destino_value}}}")
  @JsonProperty("codigoMoedaDestino")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * {{{compra_contestada_transacao_response_valor_destino_value}}}
   **/
  public CompraContestadaTransacaoResponse valorDestino(Double valorDestino) {
    this.valorDestino = valorDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_valor_destino_value}}}")
  @JsonProperty("valorDestino")
  public Double getValorDestino() {
    return valorDestino;
  }
  public void setValorDestino(Double valorDestino) {
    this.valorDestino = valorDestino;
  }

  
  /**
   * {{{compra_contestada_transacao_response_codigo_evento_compra_value}}}
   **/
  public CompraContestadaTransacaoResponse codigoEventoCompra(String codigoEventoCompra) {
    this.codigoEventoCompra = codigoEventoCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_codigo_evento_compra_value}}}")
  @JsonProperty("codigoEventoCompra")
  public String getCodigoEventoCompra() {
    return codigoEventoCompra;
  }
  public void setCodigoEventoCompra(String codigoEventoCompra) {
    this.codigoEventoCompra = codigoEventoCompra;
  }

  
  /**
   * {{{compra_contestada_transacao_response_codigo_contestacao_value}}}
   **/
  public CompraContestadaTransacaoResponse codigoContestacao(String codigoContestacao) {
    this.codigoContestacao = codigoContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_codigo_contestacao_value}}}")
  @JsonProperty("codigoContestacao")
  public String getCodigoContestacao() {
    return codigoContestacao;
  }
  public void setCodigoContestacao(String codigoContestacao) {
    this.codigoContestacao = codigoContestacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_internacional_value}}}
   **/
  public CompraContestadaTransacaoResponse internacional(Integer internacional) {
    this.internacional = internacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_internacional_value}}}")
  @JsonProperty("internacional")
  public Integer getInternacional() {
    return internacional;
  }
  public void setInternacional(Integer internacional) {
    this.internacional = internacional;
  }

  
  /**
   * {{{compra_contestada_transacao_response_modo_entrada_value}}}
   **/
  public CompraContestadaTransacaoResponse modoEntrada(String modoEntrada) {
    this.modoEntrada = modoEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_modo_entrada_value}}}")
  @JsonProperty("modoEntrada")
  public String getModoEntrada() {
    return modoEntrada;
  }
  public void setModoEntrada(String modoEntrada) {
    this.modoEntrada = modoEntrada;
  }

  
  /**
   * {{{compra_contestada_transacao_response_modo_deentrada_descricao_value}}}
   **/
  public CompraContestadaTransacaoResponse modoDeEntradaDescricao(String modoDeEntradaDescricao) {
    this.modoDeEntradaDescricao = modoDeEntradaDescricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_modo_deentrada_descricao_value}}}")
  @JsonProperty("modoDeEntradaDescricao")
  public String getModoDeEntradaDescricao() {
    return modoDeEntradaDescricao;
  }
  public void setModoDeEntradaDescricao(String modoDeEntradaDescricao) {
    this.modoDeEntradaDescricao = modoDeEntradaDescricao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_nome_estabelecimento_value}}}
   **/
  public CompraContestadaTransacaoResponse nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_nome_estabelecimento_value}}}")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * {{{compra_contestada_transacao_response_data_contestacao_value}}}
   **/
  public CompraContestadaTransacaoResponse dataContestacao(Date dataContestacao) {
    this.dataContestacao = dataContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_data_contestacao_value}}}")
  @JsonProperty("dataContestacao")
  public Date getDataContestacao() {
    return dataContestacao;
  }
  public void setDataContestacao(Date dataContestacao) {
    this.dataContestacao = dataContestacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_responsavel_abertuda_value}}}
   **/
  public CompraContestadaTransacaoResponse responsavelAbertuda(String responsavelAbertuda) {
    this.responsavelAbertuda = responsavelAbertuda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_responsavel_abertuda_value}}}")
  @JsonProperty("responsavelAbertuda")
  public String getResponsavelAbertuda() {
    return responsavelAbertuda;
  }
  public void setResponsavelAbertuda(String responsavelAbertuda) {
    this.responsavelAbertuda = responsavelAbertuda;
  }

  
  /**
   * {{{compra_contestada_transacao_response_aging_contestacao_value}}}
   **/
  public CompraContestadaTransacaoResponse agingContestacao(Long agingContestacao) {
    this.agingContestacao = agingContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_aging_contestacao_value}}}")
  @JsonProperty("agingContestacao")
  public Long getAgingContestacao() {
    return agingContestacao;
  }
  public void setAgingContestacao(Long agingContestacao) {
    this.agingContestacao = agingContestacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_status_contestacao_value}}}
   **/
  public CompraContestadaTransacaoResponse statusContestacao(String statusContestacao) {
    this.statusContestacao = statusContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_status_contestacao_value}}}")
  @JsonProperty("statusContestacao")
  public String getStatusContestacao() {
    return statusContestacao;
  }
  public void setStatusContestacao(String statusContestacao) {
    this.statusContestacao = statusContestacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_data_alteracao_value}}}
   **/
  public CompraContestadaTransacaoResponse dataAlteracao(Date dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_data_alteracao_value}}}")
  @JsonProperty("dataAlteracao")
  public Date getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(Date dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_responsavel_alteracao_value}}}
   **/
  public CompraContestadaTransacaoResponse responsavelAlteracao(String responsavelAlteracao) {
    this.responsavelAlteracao = responsavelAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_responsavel_alteracao_value}}}")
  @JsonProperty("responsavelAlteracao")
  public String getResponsavelAlteracao() {
    return responsavelAlteracao;
  }
  public void setResponsavelAlteracao(String responsavelAlteracao) {
    this.responsavelAlteracao = responsavelAlteracao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_razao_cb_value}}}
   **/
  public CompraContestadaTransacaoResponse razaoCB(String razaoCB) {
    this.razaoCB = razaoCB;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_razao_cb_value}}}")
  @JsonProperty("razaoCB")
  public String getRazaoCB() {
    return razaoCB;
  }
  public void setRazaoCB(String razaoCB) {
    this.razaoCB = razaoCB;
  }

  
  /**
   * {{{compra_contestada_transacao_response_data_envio_cb_value}}}
   **/
  public CompraContestadaTransacaoResponse dataEnvioCB(String dataEnvioCB) {
    this.dataEnvioCB = dataEnvioCB;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_data_envio_cb_value}}}")
  @JsonProperty("dataEnvioCB")
  public String getDataEnvioCB() {
    return dataEnvioCB;
  }
  public void setDataEnvioCB(String dataEnvioCB) {
    this.dataEnvioCB = dataEnvioCB;
  }

  
  /**
   * {{{compra_contestada_transacao_response_reporte_bandeira_value}}}
   **/
  public CompraContestadaTransacaoResponse reporteBandeira(String reporteBandeira) {
    this.reporteBandeira = reporteBandeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_reporte_bandeira_value}}}")
  @JsonProperty("reporteBandeira")
  public String getReporteBandeira() {
    return reporteBandeira;
  }
  public void setReporteBandeira(String reporteBandeira) {
    this.reporteBandeira = reporteBandeira;
  }

  
  /**
   * {{{compra_contestada_transacao_response_numero_controle_value}}}
   **/
  public CompraContestadaTransacaoResponse numeroControle(String numeroControle) {
    this.numeroControle = numeroControle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_numero_controle_value}}}")
  @JsonProperty("numeroControle")
  public String getNumeroControle() {
    return numeroControle;
  }
  public void setNumeroControle(String numeroControle) {
    this.numeroControle = numeroControle;
  }

  
  /**
   * {{{compra_contestada_transacao_response_reference_number_value}}}
   **/
  public CompraContestadaTransacaoResponse referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_reference_number_value}}}")
  @JsonProperty("referenceNumber")
  public String getReferenceNumber() {
    return referenceNumber;
  }
  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  
  /**
   * {{{compra_contestada_transacao_response_transacao_segura_value}}}
   **/
  public CompraContestadaTransacaoResponse transacaoSegura(String transacaoSegura) {
    this.transacaoSegura = transacaoSegura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_transacao_segura_value}}}")
  @JsonProperty("transacaoSegura")
  public String getTransacaoSegura() {
    return transacaoSegura;
  }
  public void setTransacaoSegura(String transacaoSegura) {
    this.transacaoSegura = transacaoSegura;
  }

  
  /**
   * {{{compra_contestada_transacao_response_motivo_2_reapresentacao_value}}}
   **/
  public CompraContestadaTransacaoResponse motivo2Reapresentacao(String motivo2Reapresentacao) {
    this.motivo2Reapresentacao = motivo2Reapresentacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_motivo_2_reapresentacao_value}}}")
  @JsonProperty("motivo2Reapresentacao")
  public String getMotivo2Reapresentacao() {
    return motivo2Reapresentacao;
  }
  public void setMotivo2Reapresentacao(String motivo2Reapresentacao) {
    this.motivo2Reapresentacao = motivo2Reapresentacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_data_2_reapresentacao_value}}}
   **/
  public CompraContestadaTransacaoResponse data2Reapresentacao(String data2Reapresentacao) {
    this.data2Reapresentacao = data2Reapresentacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{compra_contestada_transacao_response_data_2_reapresentacao_value}}}")
  @JsonProperty("data2Reapresentacao")
  public String getData2Reapresentacao() {
    return data2Reapresentacao;
  }
  public void setData2Reapresentacao(String data2Reapresentacao) {
    this.data2Reapresentacao = data2Reapresentacao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompraContestadaTransacaoResponse compraContestadaTransacaoResponse = (CompraContestadaTransacaoResponse) o;
    return Objects.equals(this.mcc, compraContestadaTransacaoResponse.mcc) &&
        Objects.equals(this.idCompraContestada, compraContestadaTransacaoResponse.idCompraContestada) &&
        Objects.equals(this.bandeira, compraContestadaTransacaoResponse.bandeira) &&
        Objects.equals(this.historico, compraContestadaTransacaoResponse.historico) &&
        Objects.equals(this.dataTransacao, compraContestadaTransacaoResponse.dataTransacao) &&
        Objects.equals(this.agingCompras, compraContestadaTransacaoResponse.agingCompras) &&
        Objects.equals(this.valorContrato, compraContestadaTransacaoResponse.valorContrato) &&
        Objects.equals(this.valorCompra, compraContestadaTransacaoResponse.valorCompra) &&
        Objects.equals(this.tipoTransacao, compraContestadaTransacaoResponse.tipoTransacao) &&
        Objects.equals(this.codigoAutorizacao, compraContestadaTransacaoResponse.codigoAutorizacao) &&
        Objects.equals(this.codigoMoedaDestino, compraContestadaTransacaoResponse.codigoMoedaDestino) &&
        Objects.equals(this.valorDestino, compraContestadaTransacaoResponse.valorDestino) &&
        Objects.equals(this.codigoEventoCompra, compraContestadaTransacaoResponse.codigoEventoCompra) &&
        Objects.equals(this.codigoContestacao, compraContestadaTransacaoResponse.codigoContestacao) &&
        Objects.equals(this.internacional, compraContestadaTransacaoResponse.internacional) &&
        Objects.equals(this.modoEntrada, compraContestadaTransacaoResponse.modoEntrada) &&
        Objects.equals(this.modoDeEntradaDescricao, compraContestadaTransacaoResponse.modoDeEntradaDescricao) &&
        Objects.equals(this.nomeEstabelecimento, compraContestadaTransacaoResponse.nomeEstabelecimento) &&
        Objects.equals(this.dataContestacao, compraContestadaTransacaoResponse.dataContestacao) &&
        Objects.equals(this.responsavelAbertuda, compraContestadaTransacaoResponse.responsavelAbertuda) &&
        Objects.equals(this.agingContestacao, compraContestadaTransacaoResponse.agingContestacao) &&
        Objects.equals(this.statusContestacao, compraContestadaTransacaoResponse.statusContestacao) &&
        Objects.equals(this.dataAlteracao, compraContestadaTransacaoResponse.dataAlteracao) &&
        Objects.equals(this.responsavelAlteracao, compraContestadaTransacaoResponse.responsavelAlteracao) &&
        Objects.equals(this.razaoCB, compraContestadaTransacaoResponse.razaoCB) &&
        Objects.equals(this.dataEnvioCB, compraContestadaTransacaoResponse.dataEnvioCB) &&
        Objects.equals(this.reporteBandeira, compraContestadaTransacaoResponse.reporteBandeira) &&
        Objects.equals(this.numeroControle, compraContestadaTransacaoResponse.numeroControle) &&
        Objects.equals(this.referenceNumber, compraContestadaTransacaoResponse.referenceNumber) &&
        Objects.equals(this.transacaoSegura, compraContestadaTransacaoResponse.transacaoSegura) &&
        Objects.equals(this.motivo2Reapresentacao, compraContestadaTransacaoResponse.motivo2Reapresentacao) &&
        Objects.equals(this.data2Reapresentacao, compraContestadaTransacaoResponse.data2Reapresentacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, idCompraContestada, bandeira, historico, dataTransacao, agingCompras, valorContrato, valorCompra, tipoTransacao, codigoAutorizacao, codigoMoedaDestino, valorDestino, codigoEventoCompra, codigoContestacao, internacional, modoEntrada, modoDeEntradaDescricao, nomeEstabelecimento, dataContestacao, responsavelAbertuda, agingContestacao, statusContestacao, dataAlteracao, responsavelAlteracao, razaoCB, dataEnvioCB, reporteBandeira, numeroControle, referenceNumber, transacaoSegura, motivo2Reapresentacao, data2Reapresentacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompraContestadaTransacaoResponse {\n");
    
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    idCompraContestada: ").append(toIndentedString(idCompraContestada)).append("\n");
    sb.append("    bandeira: ").append(toIndentedString(bandeira)).append("\n");
    sb.append("    historico: ").append(toIndentedString(historico)).append("\n");
    sb.append("    dataTransacao: ").append(toIndentedString(dataTransacao)).append("\n");
    sb.append("    agingCompras: ").append(toIndentedString(agingCompras)).append("\n");
    sb.append("    valorContrato: ").append(toIndentedString(valorContrato)).append("\n");
    sb.append("    valorCompra: ").append(toIndentedString(valorCompra)).append("\n");
    sb.append("    tipoTransacao: ").append(toIndentedString(tipoTransacao)).append("\n");
    sb.append("    codigoAutorizacao: ").append(toIndentedString(codigoAutorizacao)).append("\n");
    sb.append("    codigoMoedaDestino: ").append(toIndentedString(codigoMoedaDestino)).append("\n");
    sb.append("    valorDestino: ").append(toIndentedString(valorDestino)).append("\n");
    sb.append("    codigoEventoCompra: ").append(toIndentedString(codigoEventoCompra)).append("\n");
    sb.append("    codigoContestacao: ").append(toIndentedString(codigoContestacao)).append("\n");
    sb.append("    internacional: ").append(toIndentedString(internacional)).append("\n");
    sb.append("    modoEntrada: ").append(toIndentedString(modoEntrada)).append("\n");
    sb.append("    modoDeEntradaDescricao: ").append(toIndentedString(modoDeEntradaDescricao)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
    sb.append("    dataContestacao: ").append(toIndentedString(dataContestacao)).append("\n");
    sb.append("    responsavelAbertuda: ").append(toIndentedString(responsavelAbertuda)).append("\n");
    sb.append("    agingContestacao: ").append(toIndentedString(agingContestacao)).append("\n");
    sb.append("    statusContestacao: ").append(toIndentedString(statusContestacao)).append("\n");
    sb.append("    dataAlteracao: ").append(toIndentedString(dataAlteracao)).append("\n");
    sb.append("    responsavelAlteracao: ").append(toIndentedString(responsavelAlteracao)).append("\n");
    sb.append("    razaoCB: ").append(toIndentedString(razaoCB)).append("\n");
    sb.append("    dataEnvioCB: ").append(toIndentedString(dataEnvioCB)).append("\n");
    sb.append("    reporteBandeira: ").append(toIndentedString(reporteBandeira)).append("\n");
    sb.append("    numeroControle: ").append(toIndentedString(numeroControle)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    transacaoSegura: ").append(toIndentedString(transacaoSegura)).append("\n");
    sb.append("    motivo2Reapresentacao: ").append(toIndentedString(motivo2Reapresentacao)).append("\n");
    sb.append("    data2Reapresentacao: ").append(toIndentedString(data2Reapresentacao)).append("\n");
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

