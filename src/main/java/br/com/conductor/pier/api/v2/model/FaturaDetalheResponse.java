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
 * Detalhes da fatura
 **/

@ApiModel(description = "Detalhes da fatura")
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

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta.
   **/
  public FaturaDetalheResponse idConta(Long idConta) {
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
   * Situa\u00C3\u00A7\u00C3\u00A3o de Processamento da fatura.
   **/
  public FaturaDetalheResponse situacaoProcessamento(SituacaoProcessamentoEnum situacaoProcessamento) {
    this.situacaoProcessamento = situacaoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Situa\u00C3\u00A7\u00C3\u00A3o de Processamento da fatura.")
  @JsonProperty("situacaoProcessamento")
  public SituacaoProcessamentoEnum getSituacaoProcessamento() {
    return situacaoProcessamento;
  }
  public void setSituacaoProcessamento(SituacaoProcessamentoEnum situacaoProcessamento) {
    this.situacaoProcessamento = situacaoProcessamento;
  }

  
  /**
   * Status de pagamento efetuado.
   **/
  public FaturaDetalheResponse pagamentoEfetuado(Boolean pagamentoEfetuado) {
    this.pagamentoEfetuado = pagamentoEfetuado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Status de pagamento efetuado.")
  @JsonProperty("pagamentoEfetuado")
  public Boolean getPagamentoEfetuado() {
    return pagamentoEfetuado;
  }
  public void setPagamentoEfetuado(Boolean pagamentoEfetuado) {
    this.pagamentoEfetuado = pagamentoEfetuado;
  }

  
  /**
   * Data de vencimento da fatura.
   **/
  public FaturaDetalheResponse dataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data de vencimento da fatura.")
  @JsonProperty("dataVencimentoFatura")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * Data de vencimento real da fatura.
   **/
  public FaturaDetalheResponse dataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data de vencimento real da fatura.")
  @JsonProperty("dataVencimentoReal")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Data de fechamento da fatura.
   **/
  public FaturaDetalheResponse dataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data de fechamento da fatura.")
  @JsonProperty("dataFechamento")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * Valor total da fatura.
   **/
  public FaturaDetalheResponse valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total da fatura.")
  @JsonProperty("valorTotal")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * Valor do pagamento m\u00C3\u00ADnimo.
   **/
  public FaturaDetalheResponse valorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do pagamento m\u00C3\u00ADnimo.")
  @JsonProperty("valorPagamentoMinimo")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * Lista de lan\u00C3\u00A7amentos da fatura.
   **/
  public FaturaDetalheResponse lancamentosFaturaResponse(List<LancamentoFaturaResponse> lancamentosFaturaResponse) {
    this.lancamentosFaturaResponse = lancamentosFaturaResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de lan\u00C3\u00A7amentos da fatura.")
  @JsonProperty("lancamentosFaturaResponse")
  public List<LancamentoFaturaResponse> getLancamentosFaturaResponse() {
    return lancamentosFaturaResponse;
  }
  public void setLancamentosFaturaResponse(List<LancamentoFaturaResponse> lancamentosFaturaResponse) {
    this.lancamentosFaturaResponse = lancamentosFaturaResponse;
  }

  
  /**
   * Valor do saldo anterior.
   **/
  public FaturaDetalheResponse saldoAnterior(BigDecimal saldoAnterior) {
    this.saldoAnterior = saldoAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do saldo anterior.")
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
        Objects.equals(this.saldoAnterior, faturaDetalheResponse.saldoAnterior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, situacaoProcessamento, pagamentoEfetuado, dataVencimentoFatura, dataVencimentoReal, dataFechamento, valorTotal, valorPagamentoMinimo, lancamentosFaturaResponse, saldoAnterior);
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

