package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * Representa\u00E7\u00E3o da requisi\u00E7\u00E3o do recurso de transa\u00E7\u00E3o segura conductorPay
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da requisi\u00E7\u00E3o do recurso de transa\u00E7\u00E3o segura conductorPay")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransacaoPaySecureRequest   {
  
  private String dataHoraTransacao = null;
  private String numeroCartao = null;
  private Long idCartao = null;
  private BigDecimal valor = null;
  private String nsuOrigem = null;
  private String nomePortadorCartao = null;
  private String origem = null;
  private String terminalRequisitante = null;
  private String codigoProcessamento = null;
  private String dataValidadeCartao = null;
  private String numeroEstabelecimento = null;
  private Long numeroParcelas = null;
  private String codigoSegurancaCartao = null;
  private List<String> sort = new ArrayList<String>();

  
  /**
   * Data e hora utilizado na gera\u00E7\u00E3o do criptograma em GMT - 0
   **/
  public TransacaoPaySecureRequest dataHoraTransacao(String dataHoraTransacao) {
    this.dataHoraTransacao = dataHoraTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data e hora utilizado na gera\u00E7\u00E3o do criptograma em GMT - 0")
  @JsonProperty("dataHoraTransacao")
  public String getDataHoraTransacao() {
    return dataHoraTransacao;
  }
  public void setDataHoraTransacao(String dataHoraTransacao) {
    this.dataHoraTransacao = dataHoraTransacao;
  }

  
  /**
   * Numero do cartao (criptografado)
   **/
  public TransacaoPaySecureRequest numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Numero do cartao (criptografado)")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Id do cart\u00E3o
   **/
  public TransacaoPaySecureRequest idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do cart\u00E3o")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o em moeda local
   **/
  public TransacaoPaySecureRequest valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da transa\u00E7\u00E3o em moeda local")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * N\u00FAmero Sequencial \u00DAnico que identifica a transa\u00E7\u00E3o no sistema que a originou (critografado).
   **/
  public TransacaoPaySecureRequest nsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero Sequencial \u00DAnico que identifica a transa\u00E7\u00E3o no sistema que a originou (critografado).")
  @JsonProperty("nsuOrigem")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * Nome do Portador do Cart\u00E3o que originou a transa\u00E7\u00E3o (criptografado).
   **/
  public TransacaoPaySecureRequest nomePortadorCartao(String nomePortadorCartao) {
    this.nomePortadorCartao = nomePortadorCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Portador do Cart\u00E3o que originou a transa\u00E7\u00E3o (criptografado).")
  @JsonProperty("nomePortadorCartao")
  public String getNomePortadorCartao() {
    return nomePortadorCartao;
  }
  public void setNomePortadorCartao(String nomePortadorCartao) {
    this.nomePortadorCartao = nomePortadorCartao;
  }

  
  /**
   * Origem da transa\u00E7\u00E3o
   **/
  public TransacaoPaySecureRequest origem(String origem) {
    this.origem = origem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Origem da transa\u00E7\u00E3o")
  @JsonProperty("origem")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * Apresenta a identifica\u00E7\u00E3o do terminal requisitante
   **/
  public TransacaoPaySecureRequest terminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a identifica\u00E7\u00E3o do terminal requisitante")
  @JsonProperty("terminalRequisitante")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * C\u00F3digo de Processamento que identifica o Tipo da Transa\u00E7\u00E3o.
   **/
  public TransacaoPaySecureRequest codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de Processamento que identifica o Tipo da Transa\u00E7\u00E3o.")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * Data de Validade do Cart\u00E3o. Ex: AAMM
   **/
  public TransacaoPaySecureRequest dataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
    return this;
  }
  
  @ApiModelProperty(example = "YYMM", required = true, value = "Data de Validade do Cart\u00E3o. Ex: AAMM")
  @JsonProperty("dataValidadeCartao")
  public String getDataValidadeCartao() {
    return dataValidadeCartao;
  }
  public void setDataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
  }

  
  /**
   * N\u00FAmero do Estabelecimento (N\u00FAmero+DV).
   **/
  public TransacaoPaySecureRequest numeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero do Estabelecimento (N\u00FAmero+DV).")
  @JsonProperty("numeroEstabelecimento")
  public String getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * N\u00FAmero de Parcelas.
   **/
  public TransacaoPaySecureRequest numeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero de Parcelas.")
  @JsonProperty("numeroParcelas")
  public Long getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * C\u00F3digo de Seguran\u00E7a do Cart\u00E3o (criptografado).
   **/
  public TransacaoPaySecureRequest codigoSegurancaCartao(String codigoSegurancaCartao) {
    this.codigoSegurancaCartao = codigoSegurancaCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de Seguran\u00E7a do Cart\u00E3o (criptografado).")
  @JsonProperty("codigoSegurancaCartao")
  public String getCodigoSegurancaCartao() {
    return codigoSegurancaCartao;
  }
  public void setCodigoSegurancaCartao(String codigoSegurancaCartao) {
    this.codigoSegurancaCartao = codigoSegurancaCartao;
  }

  
  /**
   * Tipo de ordena\u00E7\u00E3o dos registros.
   **/
  public TransacaoPaySecureRequest sort(List<String> sort) {
    this.sort = sort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo de ordena\u00E7\u00E3o dos registros.")
  @JsonProperty("sort")
  public List<String> getSort() {
    return sort;
  }
  public void setSort(List<String> sort) {
    this.sort = sort;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransacaoPaySecureRequest transacaoPaySecureRequest = (TransacaoPaySecureRequest) o;
    return Objects.equals(this.dataHoraTransacao, transacaoPaySecureRequest.dataHoraTransacao) &&
        Objects.equals(this.numeroCartao, transacaoPaySecureRequest.numeroCartao) &&
        Objects.equals(this.idCartao, transacaoPaySecureRequest.idCartao) &&
        Objects.equals(this.valor, transacaoPaySecureRequest.valor) &&
        Objects.equals(this.nsuOrigem, transacaoPaySecureRequest.nsuOrigem) &&
        Objects.equals(this.nomePortadorCartao, transacaoPaySecureRequest.nomePortadorCartao) &&
        Objects.equals(this.origem, transacaoPaySecureRequest.origem) &&
        Objects.equals(this.terminalRequisitante, transacaoPaySecureRequest.terminalRequisitante) &&
        Objects.equals(this.codigoProcessamento, transacaoPaySecureRequest.codigoProcessamento) &&
        Objects.equals(this.dataValidadeCartao, transacaoPaySecureRequest.dataValidadeCartao) &&
        Objects.equals(this.numeroEstabelecimento, transacaoPaySecureRequest.numeroEstabelecimento) &&
        Objects.equals(this.numeroParcelas, transacaoPaySecureRequest.numeroParcelas) &&
        Objects.equals(this.codigoSegurancaCartao, transacaoPaySecureRequest.codigoSegurancaCartao) &&
        Objects.equals(this.sort, transacaoPaySecureRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataHoraTransacao, numeroCartao, idCartao, valor, nsuOrigem, nomePortadorCartao, origem, terminalRequisitante, codigoProcessamento, dataValidadeCartao, numeroEstabelecimento, numeroParcelas, codigoSegurancaCartao, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoPaySecureRequest {\n");
    
    sb.append("    dataHoraTransacao: ").append(toIndentedString(dataHoraTransacao)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    nsuOrigem: ").append(toIndentedString(nsuOrigem)).append("\n");
    sb.append("    nomePortadorCartao: ").append(toIndentedString(nomePortadorCartao)).append("\n");
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
    sb.append("    terminalRequisitante: ").append(toIndentedString(terminalRequisitante)).append("\n");
    sb.append("    codigoProcessamento: ").append(toIndentedString(codigoProcessamento)).append("\n");
    sb.append("    dataValidadeCartao: ").append(toIndentedString(dataValidadeCartao)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    codigoSegurancaCartao: ").append(toIndentedString(codigoSegurancaCartao)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

