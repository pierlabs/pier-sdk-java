package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.LancamentoFaturaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{fatura_detalhe_response_description}}}
 **/

@ApiModel(description = "{{{fatura_detalhe_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class FaturaDetalheResponse   {
  
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
  private List<LancamentoFaturaResponse> lancamentosFaturaResponse = new ArrayList<LancamentoFaturaResponse>();
  private BigDecimal saldoAnterior = null;
  private Long idBoleto = null;

  
  /**
   * {{{fatura_response_id_conta_value}}}
   **/
  public FaturaDetalheResponse idConta(Long idConta) {
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
  public FaturaDetalheResponse situacaoProcessamento(SituacaoProcessamentoEnum situacaoProcessamento) {
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
  public FaturaDetalheResponse pagamentoEfetuado(Boolean pagamentoEfetuado) {
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
  public FaturaDetalheResponse dataVencimentoFatura(String dataVencimentoFatura) {
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
  public FaturaDetalheResponse dataVencimentoReal(String dataVencimentoReal) {
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
  public FaturaDetalheResponse dataFechamento(String dataFechamento) {
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
  public FaturaDetalheResponse valorTotal(BigDecimal valorTotal) {
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
  public FaturaDetalheResponse valorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
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
   * {{{fatura_detalhe_response_lancamentos_fatura_response_value}}}
   **/
  public FaturaDetalheResponse lancamentosFaturaResponse(List<LancamentoFaturaResponse> lancamentosFaturaResponse) {
    this.lancamentosFaturaResponse = lancamentosFaturaResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{fatura_detalhe_response_lancamentos_fatura_response_value}}}")
  @JsonProperty("lancamentosFaturaResponse")
  public List<LancamentoFaturaResponse> getLancamentosFaturaResponse() {
    return lancamentosFaturaResponse;
  }
  public void setLancamentosFaturaResponse(List<LancamentoFaturaResponse> lancamentosFaturaResponse) {
    this.lancamentosFaturaResponse = lancamentosFaturaResponse;
  }

  
  /**
   * {{{fatura_response_saldo_anterior_value}}}
   **/
  public FaturaDetalheResponse saldoAnterior(BigDecimal saldoAnterior) {
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
  public FaturaDetalheResponse idBoleto(Long idBoleto) {
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
    FaturaDetalheResponse faturaDetalheResponse = (FaturaDetalheResponse) o;
    return Objects.equals(this.idConta, faturaDetalheResponse.idConta) &&
        Objects.equals(this.situacaoProcessamento, faturaDetalheResponse.situacaoProcessamento) &&
        Objects.equals(this.pagamentoEfetuado, faturaDetalheResponse.pagamentoEfetuado) &&
        Objects.equals(this.dataVencimentoFatura, faturaDetalheResponse.dataVencimentoFatura) &&
        Objects.equals(this.dataVencimentoReal, faturaDetalheResponse.dataVencimentoReal) &&
        Objects.equals(this.dataFechamento, faturaDetalheResponse.dataFechamento) &&
        Objects.equals(this.valorTotal, faturaDetalheResponse.valorTotal) &&
        Objects.equals(this.valorPagamentoMinimo, faturaDetalheResponse.valorPagamentoMinimo) &&
        Objects.equals(this.lancamentosFaturaResponse, faturaDetalheResponse.lancamentosFaturaResponse) &&
        Objects.equals(this.saldoAnterior, faturaDetalheResponse.saldoAnterior) &&
        Objects.equals(this.idBoleto, faturaDetalheResponse.idBoleto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, situacaoProcessamento, pagamentoEfetuado, dataVencimentoFatura, dataVencimentoReal, dataFechamento, valorTotal, valorPagamentoMinimo, lancamentosFaturaResponse, saldoAnterior, idBoleto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaDetalheResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    situacaoProcessamento: ").append(toIndentedString(situacaoProcessamento)).append("\n");
    sb.append("    pagamentoEfetuado: ").append(toIndentedString(pagamentoEfetuado)).append("\n");
    sb.append("    dataVencimentoFatura: ").append(toIndentedString(dataVencimentoFatura)).append("\n");
    sb.append("    dataVencimentoReal: ").append(toIndentedString(dataVencimentoReal)).append("\n");
    sb.append("    dataFechamento: ").append(toIndentedString(dataFechamento)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    valorPagamentoMinimo: ").append(toIndentedString(valorPagamentoMinimo)).append("\n");
    sb.append("    lancamentosFaturaResponse: ").append(toIndentedString(lancamentosFaturaResponse)).append("\n");
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

