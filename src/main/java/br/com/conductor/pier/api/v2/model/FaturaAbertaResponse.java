package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Fatura
 **/

@ApiModel(description = "Fatura")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class FaturaAbertaResponse   {
  
  private Long idConta = null;
  private String dataVencimentoFatura = null;
  private String dataVencimentoReal = null;
  private String dataFechamento = null;
  private BigDecimal valorTotal = null;
  private BigDecimal saldoAnterior = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Conta
   **/
  public FaturaAbertaResponse idConta(Long idConta) {
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
   * Apresenta a data de vencimento da fatura em formato AAAA-MM-DD
   **/
  public FaturaAbertaResponse dataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data de vencimento da fatura em formato AAAA-MM-DD")
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
  public FaturaAbertaResponse dataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando a data de vencimento da fatura n\u00E3o for em um dia \u00FAtil, este campo apresentar\u00E1 o pr\u00F3ximo dia \u00FAtil ap\u00F3s o vencimento em formato AAAA-MM-DD")
  @JsonProperty("dataVencimentoReal")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Data de corte da fatura
   **/
  public FaturaAbertaResponse dataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de corte da fatura")
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
  public FaturaAbertaResponse valorTotal(BigDecimal valorTotal) {
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
   * Apresenta o valor da fatura anterior
   **/
  public FaturaAbertaResponse saldoAnterior(BigDecimal saldoAnterior) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaturaAbertaResponse faturaAbertaResponse = (FaturaAbertaResponse) o;
    return Objects.equals(this.idConta, faturaAbertaResponse.idConta) &&
        Objects.equals(this.dataVencimentoFatura, faturaAbertaResponse.dataVencimentoFatura) &&
        Objects.equals(this.dataVencimentoReal, faturaAbertaResponse.dataVencimentoReal) &&
        Objects.equals(this.dataFechamento, faturaAbertaResponse.dataFechamento) &&
        Objects.equals(this.valorTotal, faturaAbertaResponse.valorTotal) &&
        Objects.equals(this.saldoAnterior, faturaAbertaResponse.saldoAnterior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, dataVencimentoFatura, dataVencimentoReal, dataFechamento, valorTotal, saldoAnterior);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaAbertaResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    dataVencimentoFatura: ").append(toIndentedString(dataVencimentoFatura)).append("\n");
    sb.append("    dataVencimentoReal: ").append(toIndentedString(dataVencimentoReal)).append("\n");
    sb.append("    dataFechamento: ").append(toIndentedString(dataFechamento)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    saldoAnterior: ").append(toIndentedString(saldoAnterior)).append("\n");
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

