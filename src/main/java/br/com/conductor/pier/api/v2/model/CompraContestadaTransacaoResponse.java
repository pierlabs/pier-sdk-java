package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





/**
 * {{{codigo_chargeback_response_description}}}
 **/

@ApiModel(description = "{{{codigo_chargeback_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CompraContestadaTransacaoResponse   {
  
  private Long agingCompras = null;
  private Long agingContestacao = null;
  private String bandeira = null;
  private String codigoAutorizacao = null;
  private String codigoContestacao = null;
  private String codigoEventoCompra = null;
  private String codigoMoedaDestino = null;
  private String data2Reapresentacao = null;
  private Date dataAlteracao = null;
  private Date dataContestacao = null;
  private String dataEnvioCB = null;
  private Date dataTransacao = null;
  private Long idCompraContestada = null;
  private Integer internacional = null;
  private String mcc = null;
  private String modoDeEntradaDescricao = null;
  private String modoEntrada = null;
  private String motivo2Reapresentacao = null;
  private String nomeEstabelecimento = null;
  private String numeroControle = null;
  private String razaoCB = null;
  private String referenceNumber = null;
  private String reporteBandeira = null;
  private String responsavelAbertuda = null;
  private String responsavelAlteracao = null;
  private String statusContestacao = null;
  private String texto2Reapresentacao = null;
  private String tipoTransacao = null;
  private String transacaoSegura = null;
  private Double valorCompra = null;
  private Double valorContrato = null;
  private Double valorDestino = null;

  
  /**
   **/
  public CompraContestadaTransacaoResponse agingCompras(Long agingCompras) {
    this.agingCompras = agingCompras;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agingCompras")
  public Long getAgingCompras() {
    return agingCompras;
  }
  public void setAgingCompras(Long agingCompras) {
    this.agingCompras = agingCompras;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse agingContestacao(Long agingContestacao) {
    this.agingContestacao = agingContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agingContestacao")
  public Long getAgingContestacao() {
    return agingContestacao;
  }
  public void setAgingContestacao(Long agingContestacao) {
    this.agingContestacao = agingContestacao;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse bandeira(String bandeira) {
    this.bandeira = bandeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bandeira")
  public String getBandeira() {
    return bandeira;
  }
  public void setBandeira(String bandeira) {
    this.bandeira = bandeira;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse codigoAutorizacao(String codigoAutorizacao) {
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
  public CompraContestadaTransacaoResponse codigoContestacao(String codigoContestacao) {
    this.codigoContestacao = codigoContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codigoContestacao")
  public String getCodigoContestacao() {
    return codigoContestacao;
  }
  public void setCodigoContestacao(String codigoContestacao) {
    this.codigoContestacao = codigoContestacao;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse codigoEventoCompra(String codigoEventoCompra) {
    this.codigoEventoCompra = codigoEventoCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codigoEventoCompra")
  public String getCodigoEventoCompra() {
    return codigoEventoCompra;
  }
  public void setCodigoEventoCompra(String codigoEventoCompra) {
    this.codigoEventoCompra = codigoEventoCompra;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse codigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codigoMoedaDestino")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse data2Reapresentacao(String data2Reapresentacao) {
    this.data2Reapresentacao = data2Reapresentacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("data2Reapresentacao")
  public String getData2Reapresentacao() {
    return data2Reapresentacao;
  }
  public void setData2Reapresentacao(String data2Reapresentacao) {
    this.data2Reapresentacao = data2Reapresentacao;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse dataAlteracao(Date dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataAlteracao")
  public Date getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(Date dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse dataContestacao(Date dataContestacao) {
    this.dataContestacao = dataContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataContestacao")
  public Date getDataContestacao() {
    return dataContestacao;
  }
  public void setDataContestacao(Date dataContestacao) {
    this.dataContestacao = dataContestacao;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse dataEnvioCB(String dataEnvioCB) {
    this.dataEnvioCB = dataEnvioCB;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataEnvioCB")
  public String getDataEnvioCB() {
    return dataEnvioCB;
  }
  public void setDataEnvioCB(String dataEnvioCB) {
    this.dataEnvioCB = dataEnvioCB;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse dataTransacao(Date dataTransacao) {
    this.dataTransacao = dataTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataTransacao")
  public Date getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(Date dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse idCompraContestada(Long idCompraContestada) {
    this.idCompraContestada = idCompraContestada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idCompraContestada")
  public Long getIdCompraContestada() {
    return idCompraContestada;
  }
  public void setIdCompraContestada(Long idCompraContestada) {
    this.idCompraContestada = idCompraContestada;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse internacional(Integer internacional) {
    this.internacional = internacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("internacional")
  public Integer getInternacional() {
    return internacional;
  }
  public void setInternacional(Integer internacional) {
    this.internacional = internacional;
  }

  
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
   **/
  public CompraContestadaTransacaoResponse modoDeEntradaDescricao(String modoDeEntradaDescricao) {
    this.modoDeEntradaDescricao = modoDeEntradaDescricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modoDeEntradaDescricao")
  public String getModoDeEntradaDescricao() {
    return modoDeEntradaDescricao;
  }
  public void setModoDeEntradaDescricao(String modoDeEntradaDescricao) {
    this.modoDeEntradaDescricao = modoDeEntradaDescricao;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse modoEntrada(String modoEntrada) {
    this.modoEntrada = modoEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modoEntrada")
  public String getModoEntrada() {
    return modoEntrada;
  }
  public void setModoEntrada(String modoEntrada) {
    this.modoEntrada = modoEntrada;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse motivo2Reapresentacao(String motivo2Reapresentacao) {
    this.motivo2Reapresentacao = motivo2Reapresentacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("motivo2Reapresentacao")
  public String getMotivo2Reapresentacao() {
    return motivo2Reapresentacao;
  }
  public void setMotivo2Reapresentacao(String motivo2Reapresentacao) {
    this.motivo2Reapresentacao = motivo2Reapresentacao;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse numeroControle(String numeroControle) {
    this.numeroControle = numeroControle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroControle")
  public String getNumeroControle() {
    return numeroControle;
  }
  public void setNumeroControle(String numeroControle) {
    this.numeroControle = numeroControle;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse razaoCB(String razaoCB) {
    this.razaoCB = razaoCB;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("razaoCB")
  public String getRazaoCB() {
    return razaoCB;
  }
  public void setRazaoCB(String razaoCB) {
    this.razaoCB = razaoCB;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("referenceNumber")
  public String getReferenceNumber() {
    return referenceNumber;
  }
  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse reporteBandeira(String reporteBandeira) {
    this.reporteBandeira = reporteBandeira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reporteBandeira")
  public String getReporteBandeira() {
    return reporteBandeira;
  }
  public void setReporteBandeira(String reporteBandeira) {
    this.reporteBandeira = reporteBandeira;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse responsavelAbertuda(String responsavelAbertuda) {
    this.responsavelAbertuda = responsavelAbertuda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("responsavelAbertuda")
  public String getResponsavelAbertuda() {
    return responsavelAbertuda;
  }
  public void setResponsavelAbertuda(String responsavelAbertuda) {
    this.responsavelAbertuda = responsavelAbertuda;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse responsavelAlteracao(String responsavelAlteracao) {
    this.responsavelAlteracao = responsavelAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("responsavelAlteracao")
  public String getResponsavelAlteracao() {
    return responsavelAlteracao;
  }
  public void setResponsavelAlteracao(String responsavelAlteracao) {
    this.responsavelAlteracao = responsavelAlteracao;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse statusContestacao(String statusContestacao) {
    this.statusContestacao = statusContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statusContestacao")
  public String getStatusContestacao() {
    return statusContestacao;
  }
  public void setStatusContestacao(String statusContestacao) {
    this.statusContestacao = statusContestacao;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse texto2Reapresentacao(String texto2Reapresentacao) {
    this.texto2Reapresentacao = texto2Reapresentacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("texto2Reapresentacao")
  public String getTexto2Reapresentacao() {
    return texto2Reapresentacao;
  }
  public void setTexto2Reapresentacao(String texto2Reapresentacao) {
    this.texto2Reapresentacao = texto2Reapresentacao;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse tipoTransacao(String tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tipoTransacao")
  public String getTipoTransacao() {
    return tipoTransacao;
  }
  public void setTipoTransacao(String tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse transacaoSegura(String transacaoSegura) {
    this.transacaoSegura = transacaoSegura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("transacaoSegura")
  public String getTransacaoSegura() {
    return transacaoSegura;
  }
  public void setTransacaoSegura(String transacaoSegura) {
    this.transacaoSegura = transacaoSegura;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse valorCompra(Double valorCompra) {
    this.valorCompra = valorCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorCompra")
  public Double getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(Double valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse valorContrato(Double valorContrato) {
    this.valorContrato = valorContrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorContrato")
  public Double getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(Double valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   **/
  public CompraContestadaTransacaoResponse valorDestino(Double valorDestino) {
    this.valorDestino = valorDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorDestino")
  public Double getValorDestino() {
    return valorDestino;
  }
  public void setValorDestino(Double valorDestino) {
    this.valorDestino = valorDestino;
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
    return Objects.equals(this.agingCompras, compraContestadaTransacaoResponse.agingCompras) &&
        Objects.equals(this.agingContestacao, compraContestadaTransacaoResponse.agingContestacao) &&
        Objects.equals(this.bandeira, compraContestadaTransacaoResponse.bandeira) &&
        Objects.equals(this.codigoAutorizacao, compraContestadaTransacaoResponse.codigoAutorizacao) &&
        Objects.equals(this.codigoContestacao, compraContestadaTransacaoResponse.codigoContestacao) &&
        Objects.equals(this.codigoEventoCompra, compraContestadaTransacaoResponse.codigoEventoCompra) &&
        Objects.equals(this.codigoMoedaDestino, compraContestadaTransacaoResponse.codigoMoedaDestino) &&
        Objects.equals(this.data2Reapresentacao, compraContestadaTransacaoResponse.data2Reapresentacao) &&
        Objects.equals(this.dataAlteracao, compraContestadaTransacaoResponse.dataAlteracao) &&
        Objects.equals(this.dataContestacao, compraContestadaTransacaoResponse.dataContestacao) &&
        Objects.equals(this.dataEnvioCB, compraContestadaTransacaoResponse.dataEnvioCB) &&
        Objects.equals(this.dataTransacao, compraContestadaTransacaoResponse.dataTransacao) &&
        Objects.equals(this.idCompraContestada, compraContestadaTransacaoResponse.idCompraContestada) &&
        Objects.equals(this.internacional, compraContestadaTransacaoResponse.internacional) &&
        Objects.equals(this.mcc, compraContestadaTransacaoResponse.mcc) &&
        Objects.equals(this.modoDeEntradaDescricao, compraContestadaTransacaoResponse.modoDeEntradaDescricao) &&
        Objects.equals(this.modoEntrada, compraContestadaTransacaoResponse.modoEntrada) &&
        Objects.equals(this.motivo2Reapresentacao, compraContestadaTransacaoResponse.motivo2Reapresentacao) &&
        Objects.equals(this.nomeEstabelecimento, compraContestadaTransacaoResponse.nomeEstabelecimento) &&
        Objects.equals(this.numeroControle, compraContestadaTransacaoResponse.numeroControle) &&
        Objects.equals(this.razaoCB, compraContestadaTransacaoResponse.razaoCB) &&
        Objects.equals(this.referenceNumber, compraContestadaTransacaoResponse.referenceNumber) &&
        Objects.equals(this.reporteBandeira, compraContestadaTransacaoResponse.reporteBandeira) &&
        Objects.equals(this.responsavelAbertuda, compraContestadaTransacaoResponse.responsavelAbertuda) &&
        Objects.equals(this.responsavelAlteracao, compraContestadaTransacaoResponse.responsavelAlteracao) &&
        Objects.equals(this.statusContestacao, compraContestadaTransacaoResponse.statusContestacao) &&
        Objects.equals(this.texto2Reapresentacao, compraContestadaTransacaoResponse.texto2Reapresentacao) &&
        Objects.equals(this.tipoTransacao, compraContestadaTransacaoResponse.tipoTransacao) &&
        Objects.equals(this.transacaoSegura, compraContestadaTransacaoResponse.transacaoSegura) &&
        Objects.equals(this.valorCompra, compraContestadaTransacaoResponse.valorCompra) &&
        Objects.equals(this.valorContrato, compraContestadaTransacaoResponse.valorContrato) &&
        Objects.equals(this.valorDestino, compraContestadaTransacaoResponse.valorDestino);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agingCompras, agingContestacao, bandeira, codigoAutorizacao, codigoContestacao, codigoEventoCompra, codigoMoedaDestino, data2Reapresentacao, dataAlteracao, dataContestacao, dataEnvioCB, dataTransacao, idCompraContestada, internacional, mcc, modoDeEntradaDescricao, modoEntrada, motivo2Reapresentacao, nomeEstabelecimento, numeroControle, razaoCB, referenceNumber, reporteBandeira, responsavelAbertuda, responsavelAlteracao, statusContestacao, texto2Reapresentacao, tipoTransacao, transacaoSegura, valorCompra, valorContrato, valorDestino);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompraContestadaTransacaoResponse {\n");
    
    sb.append("    agingCompras: ").append(toIndentedString(agingCompras)).append("\n");
    sb.append("    agingContestacao: ").append(toIndentedString(agingContestacao)).append("\n");
    sb.append("    bandeira: ").append(toIndentedString(bandeira)).append("\n");
    sb.append("    codigoAutorizacao: ").append(toIndentedString(codigoAutorizacao)).append("\n");
    sb.append("    codigoContestacao: ").append(toIndentedString(codigoContestacao)).append("\n");
    sb.append("    codigoEventoCompra: ").append(toIndentedString(codigoEventoCompra)).append("\n");
    sb.append("    codigoMoedaDestino: ").append(toIndentedString(codigoMoedaDestino)).append("\n");
    sb.append("    data2Reapresentacao: ").append(toIndentedString(data2Reapresentacao)).append("\n");
    sb.append("    dataAlteracao: ").append(toIndentedString(dataAlteracao)).append("\n");
    sb.append("    dataContestacao: ").append(toIndentedString(dataContestacao)).append("\n");
    sb.append("    dataEnvioCB: ").append(toIndentedString(dataEnvioCB)).append("\n");
    sb.append("    dataTransacao: ").append(toIndentedString(dataTransacao)).append("\n");
    sb.append("    idCompraContestada: ").append(toIndentedString(idCompraContestada)).append("\n");
    sb.append("    internacional: ").append(toIndentedString(internacional)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    modoDeEntradaDescricao: ").append(toIndentedString(modoDeEntradaDescricao)).append("\n");
    sb.append("    modoEntrada: ").append(toIndentedString(modoEntrada)).append("\n");
    sb.append("    motivo2Reapresentacao: ").append(toIndentedString(motivo2Reapresentacao)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
    sb.append("    numeroControle: ").append(toIndentedString(numeroControle)).append("\n");
    sb.append("    razaoCB: ").append(toIndentedString(razaoCB)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    reporteBandeira: ").append(toIndentedString(reporteBandeira)).append("\n");
    sb.append("    responsavelAbertuda: ").append(toIndentedString(responsavelAbertuda)).append("\n");
    sb.append("    responsavelAlteracao: ").append(toIndentedString(responsavelAlteracao)).append("\n");
    sb.append("    statusContestacao: ").append(toIndentedString(statusContestacao)).append("\n");
    sb.append("    texto2Reapresentacao: ").append(toIndentedString(texto2Reapresentacao)).append("\n");
    sb.append("    tipoTransacao: ").append(toIndentedString(tipoTransacao)).append("\n");
    sb.append("    transacaoSegura: ").append(toIndentedString(transacaoSegura)).append("\n");
    sb.append("    valorCompra: ").append(toIndentedString(valorCompra)).append("\n");
    sb.append("    valorContrato: ").append(toIndentedString(valorContrato)).append("\n");
    sb.append("    valorDestino: ").append(toIndentedString(valorDestino)).append("\n");
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



