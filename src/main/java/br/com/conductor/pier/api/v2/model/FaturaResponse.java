package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{fatura_response_description}}}
 **/

@ApiModel(description = "{{{fatura_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class FaturaResponse   {
  
  private Long idConta = null;


  public enum SituacaoProcessamentoEnum {
    ABERTA("ABERTA"),
    FECHADA("FECHADA"),
    TODAS("TODAS");

    private String value;

    SituacaoProcessamentoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SituacaoProcessamentoEnum situacaoProcessamento = null;
  private Boolean pagamentoEfetuado = null;
  private String dataVencimentoFatura = null;
  private String dataVencimentoReal = null;
  private String dataFechamento = null;
  private BigDecimal valorTotal = null;
  private BigDecimal valorPagamentoMinimo = null;
  private BigDecimal saldoAnterior = null;
  private Long idBoleto = null;

  
  /**
   * {{{fatura_response_id_conta_value}}}
   **/
  public FaturaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{fatura_response_situacao_processamento_value}}}
   **/
  public FaturaResponse situacaoProcessamento(SituacaoProcessamentoEnum situacaoProcessamento) {
    this.situacaoProcessamento = situacaoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_response_situacao_processamento_value}}}")
  @JsonProperty("situacaoProcessamento")
  public SituacaoProcessamentoEnum getSituacaoProcessamento() {
    return situacaoProcessamento;
  }
  public void setSituacaoProcessamento(SituacaoProcessamentoEnum situacaoProcessamento) {
    this.situacaoProcessamento = situacaoProcessamento;
  }

  
  /**
   * {{{fatura_response_pagamento_efetuado_value}}}
   **/
  public FaturaResponse pagamentoEfetuado(Boolean pagamentoEfetuado) {
    this.pagamentoEfetuado = pagamentoEfetuado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{fatura_response_pagamento_efetuado_value}}}")
  @JsonProperty("pagamentoEfetuado")
  public Boolean getPagamentoEfetuado() {
    return pagamentoEfetuado;
  }
  public void setPagamentoEfetuado(Boolean pagamentoEfetuado) {
    this.pagamentoEfetuado = pagamentoEfetuado;
  }

  
  /**
   * {{{fatura_response_data_vencimento_fatura_value}}}
   **/
  public FaturaResponse dataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "{{{fatura_response_data_vencimento_fatura_value}}}")
  @JsonProperty("dataVencimentoFatura")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * {{{fatura_response_data_vencimento_real_value}}}
   **/
  public FaturaResponse dataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "{{{fatura_response_data_vencimento_real_value}}}")
  @JsonProperty("dataVencimentoReal")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * {{{fatura_response_data_fechamento_value}}}
   **/
  public FaturaResponse dataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "{{{fatura_response_data_fechamento_value}}}")
  @JsonProperty("dataFechamento")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * {{{fatura_response_valor_total_value}}}
   **/
  public FaturaResponse valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_response_valor_total_value}}}")
  @JsonProperty("valorTotal")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * {{{fatura_response_valor_pagamento_minimo_value}}}
   **/
  public FaturaResponse valorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_response_valor_pagamento_minimo_value}}}")
  @JsonProperty("valorPagamentoMinimo")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * {{{fatura_response_saldo_anterior_value}}}
   **/
  public FaturaResponse saldoAnterior(BigDecimal saldoAnterior) {
    this.saldoAnterior = saldoAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_response_saldo_anterior_value}}}")
  @JsonProperty("saldoAnterior")
  public BigDecimal getSaldoAnterior() {
    return saldoAnterior;
  }
  public void setSaldoAnterior(BigDecimal saldoAnterior) {
    this.saldoAnterior = saldoAnterior;
  }

  
  /**
   * {{{fatura_response_id_boleto_value}}}
   **/
  public FaturaResponse idBoleto(Long idBoleto) {
    this.idBoleto = idBoleto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_response_id_boleto_value}}}")
  @JsonProperty("idBoleto")
  public Long getIdBoleto() {
    return idBoleto;
  }
  public void setIdBoleto(Long idBoleto) {
    this.idBoleto = idBoleto;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaturaResponse faturaResponse = (FaturaResponse) o;
    return Objects.equals(this.idConta, faturaResponse.idConta) &&
        Objects.equals(this.situacaoProcessamento, faturaResponse.situacaoProcessamento) &&
        Objects.equals(this.pagamentoEfetuado, faturaResponse.pagamentoEfetuado) &&
        Objects.equals(this.dataVencimentoFatura, faturaResponse.dataVencimentoFatura) &&
        Objects.equals(this.dataVencimentoReal, faturaResponse.dataVencimentoReal) &&
        Objects.equals(this.dataFechamento, faturaResponse.dataFechamento) &&
        Objects.equals(this.valorTotal, faturaResponse.valorTotal) &&
        Objects.equals(this.valorPagamentoMinimo, faturaResponse.valorPagamentoMinimo) &&
        Objects.equals(this.saldoAnterior, faturaResponse.saldoAnterior) &&
        Objects.equals(this.idBoleto, faturaResponse.idBoleto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, situacaoProcessamento, pagamentoEfetuado, dataVencimentoFatura, dataVencimentoReal, dataFechamento, valorTotal, valorPagamentoMinimo, saldoAnterior, idBoleto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    situacaoProcessamento: ").append(toIndentedString(situacaoProcessamento)).append("\n");
    sb.append("    pagamentoEfetuado: ").append(toIndentedString(pagamentoEfetuado)).append("\n");
    sb.append("    dataVencimentoFatura: ").append(toIndentedString(dataVencimentoFatura)).append("\n");
    sb.append("    dataVencimentoReal: ").append(toIndentedString(dataVencimentoReal)).append("\n");
    sb.append("    dataFechamento: ").append(toIndentedString(dataFechamento)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    valorPagamentoMinimo: ").append(toIndentedString(valorPagamentoMinimo)).append("\n");
    sb.append("    saldoAnterior: ").append(toIndentedString(saldoAnterior)).append("\n");
    sb.append("    idBoleto: ").append(toIndentedString(idBoleto)).append("\n");
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

