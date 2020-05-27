package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de retorno de autoriza\u00E7\u00E3o
 **/

@ApiModel(description = "Objeto de retorno de autoriza\u00E7\u00E3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AutorizacaoResponse   {
  
  private Long id = null;
  private String codigoAutorizacao = null;
  private Long nsuOrigem = null;
  private String cartao = null;
  private Long numeroEstabelecimento = null;
  private String dataAutorizacao = null;
  private String origem = null;
  private BigDecimal valor = null;
  private Integer numeroParcelas = null;
  private Long idOperacao = null;
  private String terminal = null;
  private Integer status = null;
  private Long idEmissor = null;
  private Integer flagParticipaPromocao = null;
  private String referenceNumber = null;
  private Long identificacaoTransacao = null;
  private String modoEntrada = null;
  private String codCondicaoPOS = null;
  private String idCapacidadeDevice = null;
  private String idTipoEstabelecimentoPreAutorizacao = null;
  private Long idCartao = null;
  private String dataLocal = null;
  private String horaLocal = null;
  private Integer estabelecimentoAutenticado = null;

  
  /**
   * Identificador da autoriza\u00E7\u00E3o
   **/
  public AutorizacaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da autoriza\u00E7\u00E3o")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de autoriza\u00E7\u00E3o
   **/
  public AutorizacaoResponse codigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de autoriza\u00E7\u00E3o")
  @JsonProperty("codigoAutorizacao")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * NSU de origem
   **/
  public AutorizacaoResponse nsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "NSU de origem")
  @JsonProperty("nsuOrigem")
  public Long getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * N\u00FAmero do cart\u00E3o
   **/
  public AutorizacaoResponse cartao(String cartao) {
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
   * N\u00FAmero do estabelecimento
   **/
  public AutorizacaoResponse numeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do estabelecimento")
  @JsonProperty("numeroEstabelecimento")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * Data de autoriza\u00E7\u00E3o
   **/
  public AutorizacaoResponse dataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de autoriza\u00E7\u00E3o")
  @JsonProperty("dataAutorizacao")
  public String getDataAutorizacao() {
    return dataAutorizacao;
  }
  public void setDataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
  }

  
  /**
   * Origem da autoriza\u00E7\u00E3o
   **/
  public AutorizacaoResponse origem(String origem) {
    this.origem = origem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Origem da autoriza\u00E7\u00E3o")
  @JsonProperty("origem")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * Valor da autoriza\u00E7\u00E3o
   **/
  public AutorizacaoResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da autoriza\u00E7\u00E3o")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * N\u00FAmero de parcelas
   **/
  public AutorizacaoResponse numeroParcelas(Integer numeroParcelas) {
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
   * C\u00F3digo da opera\u00E7\u00E3o
   **/
  public AutorizacaoResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo da opera\u00E7\u00E3o")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Terminal de autoriza\u00E7\u00E3o
   **/
  public AutorizacaoResponse terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Terminal de autoriza\u00E7\u00E3o")
  @JsonProperty("terminal")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * Status da autoriza\u00E7\u00E3o
   **/
  public AutorizacaoResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status da autoriza\u00E7\u00E3o")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * C\u00F3digo do emissor
   **/
  public AutorizacaoResponse idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo do emissor")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * Flag de participa\u00E7\u00E3o em promo\u00E7\u00E3o
   **/
  public AutorizacaoResponse flagParticipaPromocao(Integer flagParticipaPromocao) {
    this.flagParticipaPromocao = flagParticipaPromocao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag de participa\u00E7\u00E3o em promo\u00E7\u00E3o")
  @JsonProperty("flagParticipaPromocao")
  public Integer getFlagParticipaPromocao() {
    return flagParticipaPromocao;
  }
  public void setFlagParticipaPromocao(Integer flagParticipaPromocao) {
    this.flagParticipaPromocao = flagParticipaPromocao;
  }

  
  /**
   * N\u00FAmero de refer\u00EAncia
   **/
  public AutorizacaoResponse referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero de refer\u00EAncia")
  @JsonProperty("referenceNumber")
  public String getReferenceNumber() {
    return referenceNumber;
  }
  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  
  /**
   * Identifica\u00E7\u00E3o de transa\u00E7\u00E3o
   **/
  public AutorizacaoResponse identificacaoTransacao(Long identificacaoTransacao) {
    this.identificacaoTransacao = identificacaoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifica\u00E7\u00E3o de transa\u00E7\u00E3o")
  @JsonProperty("identificacaoTransacao")
  public Long getIdentificacaoTransacao() {
    return identificacaoTransacao;
  }
  public void setIdentificacaoTransacao(Long identificacaoTransacao) {
    this.identificacaoTransacao = identificacaoTransacao;
  }

  
  /**
   * Modo de entrada
   **/
  public AutorizacaoResponse modoEntrada(String modoEntrada) {
    this.modoEntrada = modoEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Modo de entrada")
  @JsonProperty("modoEntrada")
  public String getModoEntrada() {
    return modoEntrada;
  }
  public void setModoEntrada(String modoEntrada) {
    this.modoEntrada = modoEntrada;
  }

  
  /**
   * C\u00F3digo de condi\u00E7\u00E3o POD
   **/
  public AutorizacaoResponse codCondicaoPOS(String codCondicaoPOS) {
    this.codCondicaoPOS = codCondicaoPOS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de condi\u00E7\u00E3o POD")
  @JsonProperty("codCondicaoPOS")
  public String getCodCondicaoPOS() {
    return codCondicaoPOS;
  }
  public void setCodCondicaoPOS(String codCondicaoPOS) {
    this.codCondicaoPOS = codCondicaoPOS;
  }

  
  /**
   * C\u00F3digo de capacidade de dispositivo
   **/
  public AutorizacaoResponse idCapacidadeDevice(String idCapacidadeDevice) {
    this.idCapacidadeDevice = idCapacidadeDevice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de capacidade de dispositivo")
  @JsonProperty("idCapacidadeDevice")
  public String getIdCapacidadeDevice() {
    return idCapacidadeDevice;
  }
  public void setIdCapacidadeDevice(String idCapacidadeDevice) {
    this.idCapacidadeDevice = idCapacidadeDevice;
  }

  
  /**
   * C\u00F3digo do estabelecimento de pr\u00E9 autoriza\u00E7\u00E3o
   **/
  public AutorizacaoResponse idTipoEstabelecimentoPreAutorizacao(String idTipoEstabelecimentoPreAutorizacao) {
    this.idTipoEstabelecimentoPreAutorizacao = idTipoEstabelecimentoPreAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo do estabelecimento de pr\u00E9 autoriza\u00E7\u00E3o")
  @JsonProperty("idTipoEstabelecimentoPreAutorizacao")
  public String getIdTipoEstabelecimentoPreAutorizacao() {
    return idTipoEstabelecimentoPreAutorizacao;
  }
  public void setIdTipoEstabelecimentoPreAutorizacao(String idTipoEstabelecimentoPreAutorizacao) {
    this.idTipoEstabelecimentoPreAutorizacao = idTipoEstabelecimentoPreAutorizacao;
  }

  
  /**
   * C\u00F3digo de cart\u00E3o
   **/
  public AutorizacaoResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de cart\u00E3o")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Data/Local de autoriza\u00E7\u00E3o
   **/
  public AutorizacaoResponse dataLocal(String dataLocal) {
    this.dataLocal = dataLocal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data/Local de autoriza\u00E7\u00E3o")
  @JsonProperty("dataLocal")
  public String getDataLocal() {
    return dataLocal;
  }
  public void setDataLocal(String dataLocal) {
    this.dataLocal = dataLocal;
  }

  
  /**
   * Hora/Local de autoriza\u00E7\u00E3o
   **/
  public AutorizacaoResponse horaLocal(String horaLocal) {
    this.horaLocal = horaLocal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Hora/Local de autoriza\u00E7\u00E3o")
  @JsonProperty("horaLocal")
  public String getHoraLocal() {
    return horaLocal;
  }
  public void setHoraLocal(String horaLocal) {
    this.horaLocal = horaLocal;
  }

  
  /**
   * Estabelecimento autenticado
   **/
  public AutorizacaoResponse estabelecimentoAutenticado(Integer estabelecimentoAutenticado) {
    this.estabelecimentoAutenticado = estabelecimentoAutenticado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Estabelecimento autenticado")
  @JsonProperty("estabelecimentoAutenticado")
  public Integer getEstabelecimentoAutenticado() {
    return estabelecimentoAutenticado;
  }
  public void setEstabelecimentoAutenticado(Integer estabelecimentoAutenticado) {
    this.estabelecimentoAutenticado = estabelecimentoAutenticado;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutorizacaoResponse autorizacaoResponse = (AutorizacaoResponse) o;
    return Objects.equals(this.id, autorizacaoResponse.id) &&
        Objects.equals(this.codigoAutorizacao, autorizacaoResponse.codigoAutorizacao) &&
        Objects.equals(this.nsuOrigem, autorizacaoResponse.nsuOrigem) &&
        Objects.equals(this.cartao, autorizacaoResponse.cartao) &&
        Objects.equals(this.numeroEstabelecimento, autorizacaoResponse.numeroEstabelecimento) &&
        Objects.equals(this.dataAutorizacao, autorizacaoResponse.dataAutorizacao) &&
        Objects.equals(this.origem, autorizacaoResponse.origem) &&
        Objects.equals(this.valor, autorizacaoResponse.valor) &&
        Objects.equals(this.numeroParcelas, autorizacaoResponse.numeroParcelas) &&
        Objects.equals(this.idOperacao, autorizacaoResponse.idOperacao) &&
        Objects.equals(this.terminal, autorizacaoResponse.terminal) &&
        Objects.equals(this.status, autorizacaoResponse.status) &&
        Objects.equals(this.idEmissor, autorizacaoResponse.idEmissor) &&
        Objects.equals(this.flagParticipaPromocao, autorizacaoResponse.flagParticipaPromocao) &&
        Objects.equals(this.referenceNumber, autorizacaoResponse.referenceNumber) &&
        Objects.equals(this.identificacaoTransacao, autorizacaoResponse.identificacaoTransacao) &&
        Objects.equals(this.modoEntrada, autorizacaoResponse.modoEntrada) &&
        Objects.equals(this.codCondicaoPOS, autorizacaoResponse.codCondicaoPOS) &&
        Objects.equals(this.idCapacidadeDevice, autorizacaoResponse.idCapacidadeDevice) &&
        Objects.equals(this.idTipoEstabelecimentoPreAutorizacao, autorizacaoResponse.idTipoEstabelecimentoPreAutorizacao) &&
        Objects.equals(this.idCartao, autorizacaoResponse.idCartao) &&
        Objects.equals(this.dataLocal, autorizacaoResponse.dataLocal) &&
        Objects.equals(this.horaLocal, autorizacaoResponse.horaLocal) &&
        Objects.equals(this.estabelecimentoAutenticado, autorizacaoResponse.estabelecimentoAutenticado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codigoAutorizacao, nsuOrigem, cartao, numeroEstabelecimento, dataAutorizacao, origem, valor, numeroParcelas, idOperacao, terminal, status, idEmissor, flagParticipaPromocao, referenceNumber, identificacaoTransacao, modoEntrada, codCondicaoPOS, idCapacidadeDevice, idTipoEstabelecimentoPreAutorizacao, idCartao, dataLocal, horaLocal, estabelecimentoAutenticado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutorizacaoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    codigoAutorizacao: ").append(toIndentedString(codigoAutorizacao)).append("\n");
    sb.append("    nsuOrigem: ").append(toIndentedString(nsuOrigem)).append("\n");
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
    sb.append("    dataAutorizacao: ").append(toIndentedString(dataAutorizacao)).append("\n");
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    flagParticipaPromocao: ").append(toIndentedString(flagParticipaPromocao)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    identificacaoTransacao: ").append(toIndentedString(identificacaoTransacao)).append("\n");
    sb.append("    modoEntrada: ").append(toIndentedString(modoEntrada)).append("\n");
    sb.append("    codCondicaoPOS: ").append(toIndentedString(codCondicaoPOS)).append("\n");
    sb.append("    idCapacidadeDevice: ").append(toIndentedString(idCapacidadeDevice)).append("\n");
    sb.append("    idTipoEstabelecimentoPreAutorizacao: ").append(toIndentedString(idTipoEstabelecimentoPreAutorizacao)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    dataLocal: ").append(toIndentedString(dataLocal)).append("\n");
    sb.append("    horaLocal: ").append(toIndentedString(horaLocal)).append("\n");
    sb.append("    estabelecimentoAutenticado: ").append(toIndentedString(estabelecimentoAutenticado)).append("\n");
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

