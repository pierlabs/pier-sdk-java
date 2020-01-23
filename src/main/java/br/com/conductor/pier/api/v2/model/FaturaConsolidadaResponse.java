package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o da fatura consolidada
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da fatura consolidada")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class FaturaConsolidadaResponse   {
  
  private Long idConta = null;
  private Boolean pagamentoEfetuado = null;
  private String dataVencimentoFatura = null;
  private String dataVencimentoReal = null;
  private String dataFechamento = null;
  private BigDecimal valorTotal = null;
  private BigDecimal valorPagamentoMinimo = null;
  private BigDecimal saldoAnterior = null;
  private Long idBoleto = null;
  private String linhaDigitavel = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Conta
   **/
  public FaturaConsolidadaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da Conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Indica se a fatura foi paga
   **/
  public FaturaConsolidadaResponse pagamentoEfetuado(Boolean pagamentoEfetuado) {
    this.pagamentoEfetuado = pagamentoEfetuado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se a fatura foi paga")
  @JsonProperty("pagamentoEfetuado")
  public Boolean getPagamentoEfetuado() {
    return pagamentoEfetuado;
  }
  public void setPagamentoEfetuado(Boolean pagamentoEfetuado) {
    this.pagamentoEfetuado = pagamentoEfetuado;
  }

  
  /**
   * Apresenta a data de vencimento da fatura em formato AAAA-MM-DD
   **/
  public FaturaConsolidadaResponse dataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Apresenta a data de vencimento da fatura em formato AAAA-MM-DD")
  @JsonProperty("dataVencimentoFatura")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * Quando a data de vencimento da fatura n\u00E3o for em um dia \u00FAtil, este campo apresentar\u00E1 o pr\u00F3ximo dia \u00FAtil ap\u00F3s o vencimento em formato AAAA-MM-DD
   **/
  public FaturaConsolidadaResponse dataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Quando a data de vencimento da fatura n\u00E3o for em um dia \u00FAtil, este campo apresentar\u00E1 o pr\u00F3ximo dia \u00FAtil ap\u00F3s o vencimento em formato AAAA-MM-DD")
  @JsonProperty("dataVencimentoReal")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Apresenta a data de fechamento da fatura em formato AAAA-MM-DD
   **/
  public FaturaConsolidadaResponse dataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Apresenta a data de fechamento da fatura em formato AAAA-MM-DD")
  @JsonProperty("dataFechamento")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * Apresenta o valor total da fatura no momento da consulta
   **/
  public FaturaConsolidadaResponse valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o valor total da fatura no momento da consulta")
  @JsonProperty("valorTotal")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * Apresenta o valor para pagamento m\u00EDnimo da fatura quando esta estiver com a situa\u00E7\u00E3o
   **/
  public FaturaConsolidadaResponse valorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o valor para pagamento m\u00EDnimo da fatura quando esta estiver com a situa\u00E7\u00E3o")
  @JsonProperty("valorPagamentoMinimo")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * Apresenta o valor da fatura anterior
   **/
  public FaturaConsolidadaResponse saldoAnterior(BigDecimal saldoAnterior) {
    this.saldoAnterior = saldoAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o valor da fatura anterior")
  @JsonProperty("saldoAnterior")
  public BigDecimal getSaldoAnterior() {
    return saldoAnterior;
  }
  public void setSaldoAnterior(BigDecimal saldoAnterior) {
    this.saldoAnterior = saldoAnterior;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do boleto
   **/
  public FaturaConsolidadaResponse idBoleto(Long idBoleto) {
    this.idBoleto = idBoleto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do boleto")
  @JsonProperty("idBoleto")
  public Long getIdBoleto() {
    return idBoleto;
  }
  public void setIdBoleto(Long idBoleto) {
    this.idBoleto = idBoleto;
  }

  
  /**
   * Linha digit\u00E1vel da fatura
   **/
  public FaturaConsolidadaResponse linhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Linha digit\u00E1vel da fatura")
  @JsonProperty("linhaDigitavel")
  public String getLinhaDigitavel() {
    return linhaDigitavel;
  }
  public void setLinhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaturaConsolidadaResponse faturaConsolidadaResponse = (FaturaConsolidadaResponse) o;
    return Objects.equals(this.idConta, faturaConsolidadaResponse.idConta) &&
        Objects.equals(this.pagamentoEfetuado, faturaConsolidadaResponse.pagamentoEfetuado) &&
        Objects.equals(this.dataVencimentoFatura, faturaConsolidadaResponse.dataVencimentoFatura) &&
        Objects.equals(this.dataVencimentoReal, faturaConsolidadaResponse.dataVencimentoReal) &&
        Objects.equals(this.dataFechamento, faturaConsolidadaResponse.dataFechamento) &&
        Objects.equals(this.valorTotal, faturaConsolidadaResponse.valorTotal) &&
        Objects.equals(this.valorPagamentoMinimo, faturaConsolidadaResponse.valorPagamentoMinimo) &&
        Objects.equals(this.saldoAnterior, faturaConsolidadaResponse.saldoAnterior) &&
        Objects.equals(this.idBoleto, faturaConsolidadaResponse.idBoleto) &&
        Objects.equals(this.linhaDigitavel, faturaConsolidadaResponse.linhaDigitavel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, pagamentoEfetuado, dataVencimentoFatura, dataVencimentoReal, dataFechamento, valorTotal, valorPagamentoMinimo, saldoAnterior, idBoleto, linhaDigitavel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaConsolidadaResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    pagamentoEfetuado: ").append(toIndentedString(pagamentoEfetuado)).append("\n");
    sb.append("    dataVencimentoFatura: ").append(toIndentedString(dataVencimentoFatura)).append("\n");
    sb.append("    dataVencimentoReal: ").append(toIndentedString(dataVencimentoReal)).append("\n");
    sb.append("    dataFechamento: ").append(toIndentedString(dataFechamento)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    valorPagamentoMinimo: ").append(toIndentedString(valorPagamentoMinimo)).append("\n");
    sb.append("    saldoAnterior: ").append(toIndentedString(saldoAnterior)).append("\n");
    sb.append("    idBoleto: ").append(toIndentedString(idBoleto)).append("\n");
    sb.append("    linhaDigitavel: ").append(toIndentedString(linhaDigitavel)).append("\n");
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

