package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Fatura futura
 **/

@ApiModel(description = "Fatura futura")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LancamentoFaturaResponse   {
  
  private Long idTransacao = null;
  private String descricaoTipoTransacao = null;
  private Long idTipoEvento = null;
  private String descricaoTipoEvento = null;
  private Long idEvento = null;
  private Long idConta = null;
  private String complemento = null;
  private BigDecimal valorBRL = null;
  private BigDecimal valorUSD = null;
  private Integer numeroParcela = null;
  private Integer quantidadeParcelas = null;
  private String dataHoraTransacao = null;
  private String nomeEstabelecimento = null;
  private String descricaoEstabelecimento = null;
  private String nomeFantasiaEstabelecimento = null;
  private Boolean flagCredito = null;
  private Long idMCC = null;
  private Long idGrupoMCC = null;
  private String descricaoGrupoMCC = null;
  private Boolean titular = null;
  private String nomePortador = null;
  private String numeroCartaoMascarado = null;
  private Boolean flagSolicitouContestacao = null;
  private BigDecimal valorTaxaEmbarque = null;
  private String descricaoAbreviada = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transa\u00C3\u00A7\u00C3\u00A3o
   **/
  public LancamentoFaturaResponse idTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transa\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("idTransacao")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do tipo da transa\u00C3\u00A7\u00C3\u00A3o
   **/
  public LancamentoFaturaResponse descricaoTipoTransacao(String descricaoTipoTransacao) {
    this.descricaoTipoTransacao = descricaoTipoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do tipo da transa\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("descricaoTipoTransacao")
  public String getDescricaoTipoTransacao() {
    return descricaoTipoTransacao;
  }
  public void setDescricaoTipoTransacao(String descricaoTipoTransacao) {
    this.descricaoTipoTransacao = descricaoTipoTransacao;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do tipo do evento
   **/
  public LancamentoFaturaResponse idTipoEvento(Long idTipoEvento) {
    this.idTipoEvento = idTipoEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do tipo do evento")
  @JsonProperty("idTipoEvento")
  public Long getIdTipoEvento() {
    return idTipoEvento;
  }
  public void setIdTipoEvento(Long idTipoEvento) {
    this.idTipoEvento = idTipoEvento;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do tipo do evento
   **/
  public LancamentoFaturaResponse descricaoTipoEvento(String descricaoTipoEvento) {
    this.descricaoTipoEvento = descricaoTipoEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do tipo do evento")
  @JsonProperty("descricaoTipoEvento")
  public String getDescricaoTipoEvento() {
    return descricaoTipoEvento;
  }
  public void setDescricaoTipoEvento(String descricaoTipoEvento) {
    this.descricaoTipoEvento = descricaoTipoEvento;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do evento
   **/
  public LancamentoFaturaResponse idEvento(Long idEvento) {
    this.idEvento = idEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do evento")
  @JsonProperty("idEvento")
  public Long getIdEvento() {
    return idEvento;
  }
  public void setIdEvento(Long idEvento) {
    this.idEvento = idEvento;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta.
   **/
  public LancamentoFaturaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta.")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o complementar do evento
   **/
  public LancamentoFaturaResponse complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o complementar do evento")
  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Valor em reais
   **/
  public LancamentoFaturaResponse valorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor em reais")
  @JsonProperty("valorBRL")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }
  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  
  /**
   * Valor em dolar
   **/
  public LancamentoFaturaResponse valorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor em dolar")
  @JsonProperty("valorUSD")
  public BigDecimal getValorUSD() {
    return valorUSD;
  }
  public void setValorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
  }

  
  /**
   * N\u00C3\u00BAmero da parcela
   **/
  public LancamentoFaturaResponse numeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero da parcela")
  @JsonProperty("numeroParcela")
  public Integer getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * Quantidade de parcelas
   **/
  public LancamentoFaturaResponse quantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de parcelas")
  @JsonProperty("quantidadeParcelas")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Data da transa\u00C3\u00A7\u00C3\u00A3o
   **/
  public LancamentoFaturaResponse dataHoraTransacao(String dataHoraTransacao) {
    this.dataHoraTransacao = dataHoraTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da transa\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("dataHoraTransacao")
  public String getDataHoraTransacao() {
    return dataHoraTransacao;
  }
  public void setDataHoraTransacao(String dataHoraTransacao) {
    this.dataHoraTransacao = dataHoraTransacao;
  }

  
  /**
   * Nome do estabelecimento
   **/
  public LancamentoFaturaResponse nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do estabelecimento")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do estabelecimento
   **/
  public LancamentoFaturaResponse descricaoEstabelecimento(String descricaoEstabelecimento) {
    this.descricaoEstabelecimento = descricaoEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do estabelecimento")
  @JsonProperty("descricaoEstabelecimento")
  public String getDescricaoEstabelecimento() {
    return descricaoEstabelecimento;
  }
  public void setDescricaoEstabelecimento(String descricaoEstabelecimento) {
    this.descricaoEstabelecimento = descricaoEstabelecimento;
  }

  
  /**
   * Nome fantasia do estabelecimento
   **/
  public LancamentoFaturaResponse nomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome fantasia do estabelecimento")
  @JsonProperty("nomeFantasiaEstabelecimento")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * Flag que indica se o lan\u00C3\u00A7amento \u00C3\u00A9 de cr\u00C3\u00A9dito
   **/
  public LancamentoFaturaResponse flagCredito(Boolean flagCredito) {
    this.flagCredito = flagCredito;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se o lan\u00C3\u00A7amento \u00C3\u00A9 de cr\u00C3\u00A9dito")
  @JsonProperty("flagCredito")
  public Boolean getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Boolean flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do MCC (Merchant Category Codes)
   **/
  public LancamentoFaturaResponse idMCC(Long idMCC) {
    this.idMCC = idMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do MCC (Merchant Category Codes)")
  @JsonProperty("idMCC")
  public Long getIdMCC() {
    return idMCC;
  }
  public void setIdMCC(Long idMCC) {
    this.idMCC = idMCC;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do grupo MCC
   **/
  public LancamentoFaturaResponse idGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do grupo MCC")
  @JsonProperty("idGrupoMCC")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do grupo MCC
   **/
  public LancamentoFaturaResponse descricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do grupo MCC")
  @JsonProperty("descricaoGrupoMCC")
  public String getDescricaoGrupoMCC() {
    return descricaoGrupoMCC;
  }
  public void setDescricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
  }

  
  /**
   * Indica se o portador do cart\u00C3\u00A3o \u00C3\u00A9 o titular da conta
   **/
  public LancamentoFaturaResponse titular(Boolean titular) {
    this.titular = titular;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se o portador do cart\u00C3\u00A3o \u00C3\u00A9 o titular da conta")
  @JsonProperty("titular")
  public Boolean getTitular() {
    return titular;
  }
  public void setTitular(Boolean titular) {
    this.titular = titular;
  }

  
  /**
   * Nome impresso no cart\u00C3\u00A3o
   **/
  public LancamentoFaturaResponse nomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome impresso no cart\u00C3\u00A3o")
  @JsonProperty("nomePortador")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * N\u00C3\u00BAmero do cart\u00C3\u00A3o mascarado
   **/
  public LancamentoFaturaResponse numeroCartaoMascarado(String numeroCartaoMascarado) {
    this.numeroCartaoMascarado = numeroCartaoMascarado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do cart\u00C3\u00A3o mascarado")
  @JsonProperty("numeroCartaoMascarado")
  public String getNumeroCartaoMascarado() {
    return numeroCartaoMascarado;
  }
  public void setNumeroCartaoMascarado(String numeroCartaoMascarado) {
    this.numeroCartaoMascarado = numeroCartaoMascarado;
  }

  
  /**
   * Flag que indica se o cliente solicitou contesta\u00C3\u00A7\u00C3\u00A3o da transa\u00C3\u00A7\u00C3\u00A3o
   **/
  public LancamentoFaturaResponse flagSolicitouContestacao(Boolean flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se o cliente solicitou contesta\u00C3\u00A7\u00C3\u00A3o da transa\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("flagSolicitouContestacao")
  public Boolean getFlagSolicitouContestacao() {
    return flagSolicitouContestacao;
  }
  public void setFlagSolicitouContestacao(Boolean flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
  }

  
  /**
   * Valor da taxa de embarque
   **/
  public LancamentoFaturaResponse valorTaxaEmbarque(BigDecimal valorTaxaEmbarque) {
    this.valorTaxaEmbarque = valorTaxaEmbarque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da taxa de embarque")
  @JsonProperty("valorTaxaEmbarque")
  public BigDecimal getValorTaxaEmbarque() {
    return valorTaxaEmbarque;
  }
  public void setValorTaxaEmbarque(BigDecimal valorTaxaEmbarque) {
    this.valorTaxaEmbarque = valorTaxaEmbarque;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o abreviada da transa\u00C3\u00A7\u00C3\u00A3o
   **/
  public LancamentoFaturaResponse descricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o abreviada da transa\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("descricaoAbreviada")
  public String getDescricaoAbreviada() {
    return descricaoAbreviada;
  }
  public void setDescricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LancamentoFaturaResponse lancamentoFaturaResponse = (LancamentoFaturaResponse) o;
    return Objects.equals(this.idTransacao, lancamentoFaturaResponse.idTransacao) &&
        Objects.equals(this.descricaoTipoTransacao, lancamentoFaturaResponse.descricaoTipoTransacao) &&
        Objects.equals(this.idTipoEvento, lancamentoFaturaResponse.idTipoEvento) &&
        Objects.equals(this.descricaoTipoEvento, lancamentoFaturaResponse.descricaoTipoEvento) &&
        Objects.equals(this.idEvento, lancamentoFaturaResponse.idEvento) &&
        Objects.equals(this.idConta, lancamentoFaturaResponse.idConta) &&
        Objects.equals(this.complemento, lancamentoFaturaResponse.complemento) &&
        Objects.equals(this.valorBRL, lancamentoFaturaResponse.valorBRL) &&
        Objects.equals(this.valorUSD, lancamentoFaturaResponse.valorUSD) &&
        Objects.equals(this.numeroParcela, lancamentoFaturaResponse.numeroParcela) &&
        Objects.equals(this.quantidadeParcelas, lancamentoFaturaResponse.quantidadeParcelas) &&
        Objects.equals(this.dataHoraTransacao, lancamentoFaturaResponse.dataHoraTransacao) &&
        Objects.equals(this.nomeEstabelecimento, lancamentoFaturaResponse.nomeEstabelecimento) &&
        Objects.equals(this.descricaoEstabelecimento, lancamentoFaturaResponse.descricaoEstabelecimento) &&
        Objects.equals(this.nomeFantasiaEstabelecimento, lancamentoFaturaResponse.nomeFantasiaEstabelecimento) &&
        Objects.equals(this.flagCredito, lancamentoFaturaResponse.flagCredito) &&
        Objects.equals(this.idMCC, lancamentoFaturaResponse.idMCC) &&
        Objects.equals(this.idGrupoMCC, lancamentoFaturaResponse.idGrupoMCC) &&
        Objects.equals(this.descricaoGrupoMCC, lancamentoFaturaResponse.descricaoGrupoMCC) &&
        Objects.equals(this.titular, lancamentoFaturaResponse.titular) &&
        Objects.equals(this.nomePortador, lancamentoFaturaResponse.nomePortador) &&
        Objects.equals(this.numeroCartaoMascarado, lancamentoFaturaResponse.numeroCartaoMascarado) &&
        Objects.equals(this.flagSolicitouContestacao, lancamentoFaturaResponse.flagSolicitouContestacao) &&
        Objects.equals(this.valorTaxaEmbarque, lancamentoFaturaResponse.valorTaxaEmbarque) &&
        Objects.equals(this.descricaoAbreviada, lancamentoFaturaResponse.descricaoAbreviada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTransacao, descricaoTipoTransacao, idTipoEvento, descricaoTipoEvento, idEvento, idConta, complemento, valorBRL, valorUSD, numeroParcela, quantidadeParcelas, dataHoraTransacao, nomeEstabelecimento, descricaoEstabelecimento, nomeFantasiaEstabelecimento, flagCredito, idMCC, idGrupoMCC, descricaoGrupoMCC, titular, nomePortador, numeroCartaoMascarado, flagSolicitouContestacao, valorTaxaEmbarque, descricaoAbreviada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LancamentoFaturaResponse {\n");
    
    sb.append("    idTransacao: ").append(toIndentedString(idTransacao)).append("\n");
    sb.append("    descricaoTipoTransacao: ").append(toIndentedString(descricaoTipoTransacao)).append("\n");
    sb.append("    idTipoEvento: ").append(toIndentedString(idTipoEvento)).append("\n");
    sb.append("    descricaoTipoEvento: ").append(toIndentedString(descricaoTipoEvento)).append("\n");
    sb.append("    idEvento: ").append(toIndentedString(idEvento)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    valorBRL: ").append(toIndentedString(valorBRL)).append("\n");
    sb.append("    valorUSD: ").append(toIndentedString(valorUSD)).append("\n");
    sb.append("    numeroParcela: ").append(toIndentedString(numeroParcela)).append("\n");
    sb.append("    quantidadeParcelas: ").append(toIndentedString(quantidadeParcelas)).append("\n");
    sb.append("    dataHoraTransacao: ").append(toIndentedString(dataHoraTransacao)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
    sb.append("    descricaoEstabelecimento: ").append(toIndentedString(descricaoEstabelecimento)).append("\n");
    sb.append("    nomeFantasiaEstabelecimento: ").append(toIndentedString(nomeFantasiaEstabelecimento)).append("\n");
    sb.append("    flagCredito: ").append(toIndentedString(flagCredito)).append("\n");
    sb.append("    idMCC: ").append(toIndentedString(idMCC)).append("\n");
    sb.append("    idGrupoMCC: ").append(toIndentedString(idGrupoMCC)).append("\n");
    sb.append("    descricaoGrupoMCC: ").append(toIndentedString(descricaoGrupoMCC)).append("\n");
    sb.append("    titular: ").append(toIndentedString(titular)).append("\n");
    sb.append("    nomePortador: ").append(toIndentedString(nomePortador)).append("\n");
    sb.append("    numeroCartaoMascarado: ").append(toIndentedString(numeroCartaoMascarado)).append("\n");
    sb.append("    flagSolicitouContestacao: ").append(toIndentedString(flagSolicitouContestacao)).append("\n");
    sb.append("    valorTaxaEmbarque: ").append(toIndentedString(valorTaxaEmbarque)).append("\n");
    sb.append("    descricaoAbreviada: ").append(toIndentedString(descricaoAbreviada)).append("\n");
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

