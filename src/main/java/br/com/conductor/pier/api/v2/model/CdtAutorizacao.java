package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CdtAutorizacao   {
  
  private String cartao = null;
  private String codCondicaoPOS = null;
  private String codigoAutorizacao = null;
  private String dataAutorizacao = null;
  private String dataLocal = null;
  private Integer estabelecimentoAutenticado = null;
  private Integer flagParticipaPromocao = null;
  private String horaLocal = null;
  private Long id = null;
  private String idCapacidadeDevice = null;
  private Long idCartao = null;
  private Long idEmissor = null;
  private Long idOperacao = null;
  private String idTipoEstabelecimentoPreAutorizacao = null;
  private Long identificacaoTransacao = null;
  private String modoEntrada = null;
  private Long nsuOrigem = null;
  private Long numeroEstabelecimento = null;
  private Integer numeroParcelas = null;
  private String origem = null;
  private String referenceNumber = null;
  private Integer status = null;
  private String terminal = null;
  private BigDecimal valor = null;

  
  /**
   **/
  public CdtAutorizacao cartao(String cartao) {
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
  public CdtAutorizacao codCondicaoPOS(String codCondicaoPOS) {
    this.codCondicaoPOS = codCondicaoPOS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codCondicaoPOS")
  public String getCodCondicaoPOS() {
    return codCondicaoPOS;
  }
  public void setCodCondicaoPOS(String codCondicaoPOS) {
    this.codCondicaoPOS = codCondicaoPOS;
  }

  
  /**
   **/
  public CdtAutorizacao codigoAutorizacao(String codigoAutorizacao) {
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
  public CdtAutorizacao dataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataAutorizacao")
  public String getDataAutorizacao() {
    return dataAutorizacao;
  }
  public void setDataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
  }

  
  /**
   **/
  public CdtAutorizacao dataLocal(String dataLocal) {
    this.dataLocal = dataLocal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataLocal")
  public String getDataLocal() {
    return dataLocal;
  }
  public void setDataLocal(String dataLocal) {
    this.dataLocal = dataLocal;
  }

  
  /**
   **/
  public CdtAutorizacao estabelecimentoAutenticado(Integer estabelecimentoAutenticado) {
    this.estabelecimentoAutenticado = estabelecimentoAutenticado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("estabelecimentoAutenticado")
  public Integer getEstabelecimentoAutenticado() {
    return estabelecimentoAutenticado;
  }
  public void setEstabelecimentoAutenticado(Integer estabelecimentoAutenticado) {
    this.estabelecimentoAutenticado = estabelecimentoAutenticado;
  }

  
  /**
   **/
  public CdtAutorizacao flagParticipaPromocao(Integer flagParticipaPromocao) {
    this.flagParticipaPromocao = flagParticipaPromocao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagParticipaPromocao")
  public Integer getFlagParticipaPromocao() {
    return flagParticipaPromocao;
  }
  public void setFlagParticipaPromocao(Integer flagParticipaPromocao) {
    this.flagParticipaPromocao = flagParticipaPromocao;
  }

  
  /**
   **/
  public CdtAutorizacao horaLocal(String horaLocal) {
    this.horaLocal = horaLocal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("horaLocal")
  public String getHoraLocal() {
    return horaLocal;
  }
  public void setHoraLocal(String horaLocal) {
    this.horaLocal = horaLocal;
  }

  
  /**
   **/
  public CdtAutorizacao id(Long id) {
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
  public CdtAutorizacao idCapacidadeDevice(String idCapacidadeDevice) {
    this.idCapacidadeDevice = idCapacidadeDevice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idCapacidadeDevice")
  public String getIdCapacidadeDevice() {
    return idCapacidadeDevice;
  }
  public void setIdCapacidadeDevice(String idCapacidadeDevice) {
    this.idCapacidadeDevice = idCapacidadeDevice;
  }

  
  /**
   **/
  public CdtAutorizacao idCartao(Long idCartao) {
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
  public CdtAutorizacao idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   **/
  public CdtAutorizacao idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   **/
  public CdtAutorizacao idTipoEstabelecimentoPreAutorizacao(String idTipoEstabelecimentoPreAutorizacao) {
    this.idTipoEstabelecimentoPreAutorizacao = idTipoEstabelecimentoPreAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idTipoEstabelecimentoPreAutorizacao")
  public String getIdTipoEstabelecimentoPreAutorizacao() {
    return idTipoEstabelecimentoPreAutorizacao;
  }
  public void setIdTipoEstabelecimentoPreAutorizacao(String idTipoEstabelecimentoPreAutorizacao) {
    this.idTipoEstabelecimentoPreAutorizacao = idTipoEstabelecimentoPreAutorizacao;
  }

  
  /**
   **/
  public CdtAutorizacao identificacaoTransacao(Long identificacaoTransacao) {
    this.identificacaoTransacao = identificacaoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("identificacaoTransacao")
  public Long getIdentificacaoTransacao() {
    return identificacaoTransacao;
  }
  public void setIdentificacaoTransacao(Long identificacaoTransacao) {
    this.identificacaoTransacao = identificacaoTransacao;
  }

  
  /**
   **/
  public CdtAutorizacao modoEntrada(String modoEntrada) {
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
  public CdtAutorizacao nsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nsuOrigem")
  public Long getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   **/
  public CdtAutorizacao numeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroEstabelecimento")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   **/
  public CdtAutorizacao numeroParcelas(Integer numeroParcelas) {
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
  public CdtAutorizacao origem(String origem) {
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
  public CdtAutorizacao referenceNumber(String referenceNumber) {
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
  public CdtAutorizacao status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   **/
  public CdtAutorizacao terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("terminal")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   **/
  public CdtAutorizacao valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdtAutorizacao cdtAutorizacao = (CdtAutorizacao) o;
    return Objects.equals(this.cartao, cdtAutorizacao.cartao) &&
        Objects.equals(this.codCondicaoPOS, cdtAutorizacao.codCondicaoPOS) &&
        Objects.equals(this.codigoAutorizacao, cdtAutorizacao.codigoAutorizacao) &&
        Objects.equals(this.dataAutorizacao, cdtAutorizacao.dataAutorizacao) &&
        Objects.equals(this.dataLocal, cdtAutorizacao.dataLocal) &&
        Objects.equals(this.estabelecimentoAutenticado, cdtAutorizacao.estabelecimentoAutenticado) &&
        Objects.equals(this.flagParticipaPromocao, cdtAutorizacao.flagParticipaPromocao) &&
        Objects.equals(this.horaLocal, cdtAutorizacao.horaLocal) &&
        Objects.equals(this.id, cdtAutorizacao.id) &&
        Objects.equals(this.idCapacidadeDevice, cdtAutorizacao.idCapacidadeDevice) &&
        Objects.equals(this.idCartao, cdtAutorizacao.idCartao) &&
        Objects.equals(this.idEmissor, cdtAutorizacao.idEmissor) &&
        Objects.equals(this.idOperacao, cdtAutorizacao.idOperacao) &&
        Objects.equals(this.idTipoEstabelecimentoPreAutorizacao, cdtAutorizacao.idTipoEstabelecimentoPreAutorizacao) &&
        Objects.equals(this.identificacaoTransacao, cdtAutorizacao.identificacaoTransacao) &&
        Objects.equals(this.modoEntrada, cdtAutorizacao.modoEntrada) &&
        Objects.equals(this.nsuOrigem, cdtAutorizacao.nsuOrigem) &&
        Objects.equals(this.numeroEstabelecimento, cdtAutorizacao.numeroEstabelecimento) &&
        Objects.equals(this.numeroParcelas, cdtAutorizacao.numeroParcelas) &&
        Objects.equals(this.origem, cdtAutorizacao.origem) &&
        Objects.equals(this.referenceNumber, cdtAutorizacao.referenceNumber) &&
        Objects.equals(this.status, cdtAutorizacao.status) &&
        Objects.equals(this.terminal, cdtAutorizacao.terminal) &&
        Objects.equals(this.valor, cdtAutorizacao.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartao, codCondicaoPOS, codigoAutorizacao, dataAutorizacao, dataLocal, estabelecimentoAutenticado, flagParticipaPromocao, horaLocal, id, idCapacidadeDevice, idCartao, idEmissor, idOperacao, idTipoEstabelecimentoPreAutorizacao, identificacaoTransacao, modoEntrada, nsuOrigem, numeroEstabelecimento, numeroParcelas, origem, referenceNumber, status, terminal, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdtAutorizacao {\n");
    
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    codCondicaoPOS: ").append(toIndentedString(codCondicaoPOS)).append("\n");
    sb.append("    codigoAutorizacao: ").append(toIndentedString(codigoAutorizacao)).append("\n");
    sb.append("    dataAutorizacao: ").append(toIndentedString(dataAutorizacao)).append("\n");
    sb.append("    dataLocal: ").append(toIndentedString(dataLocal)).append("\n");
    sb.append("    estabelecimentoAutenticado: ").append(toIndentedString(estabelecimentoAutenticado)).append("\n");
    sb.append("    flagParticipaPromocao: ").append(toIndentedString(flagParticipaPromocao)).append("\n");
    sb.append("    horaLocal: ").append(toIndentedString(horaLocal)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCapacidadeDevice: ").append(toIndentedString(idCapacidadeDevice)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
    sb.append("    idTipoEstabelecimentoPreAutorizacao: ").append(toIndentedString(idTipoEstabelecimentoPreAutorizacao)).append("\n");
    sb.append("    identificacaoTransacao: ").append(toIndentedString(identificacaoTransacao)).append("\n");
    sb.append("    modoEntrada: ").append(toIndentedString(modoEntrada)).append("\n");
    sb.append("    nsuOrigem: ").append(toIndentedString(nsuOrigem)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

