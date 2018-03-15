package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto ContaHistoricoPagamentoResponse
 **/

@ApiModel(description = "Objeto ContaHistoricoPagamentoResponse")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaHistoricoPagamentoResponse   {
  
  private Long idPagamento = null;
  private Long idEstabelecimento = null;
  private Long idBanco = null;
  private Long idCartao = null;
  private BigDecimal valorPagamento = null;
  private String dataHoraPagamento = null;
  private String dataHoraEntradaPagamento = null;
  private Long status = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Pagamento
   **/
  public ContaHistoricoPagamentoResponse idPagamento(Long idPagamento) {
    this.idPagamento = idPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Pagamento")
  @JsonProperty("idPagamento")
  public Long getIdPagamento() {
    return idPagamento;
  }
  public void setIdPagamento(Long idPagamento) {
    this.idPagamento = idPagamento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento onde o Pagamento foi realizado, quando este for o local de pagamento.
   **/
  public ContaHistoricoPagamentoResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento onde o Pagamento foi realizado, quando este for o local de pagamento.")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Institui\u00E7\u00E3o Banc\u00E1ria onde o Pagamento foi realizado, quando este for o local de pagamento
   **/
  public ContaHistoricoPagamentoResponse idBanco(Long idBanco) {
    this.idBanco = idBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Institui\u00E7\u00E3o Banc\u00E1ria onde o Pagamento foi realizado, quando este for o local de pagamento")
  @JsonProperty("idBanco")
  public Long getIdBanco() {
    return idBanco;
  }
  public void setIdBanco(Long idBanco) {
    this.idBanco = idBanco;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o
   **/
  public ContaHistoricoPagamentoResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Valor do Pagamento
   **/
  public ContaHistoricoPagamentoResponse valorPagamento(BigDecimal valorPagamento) {
    this.valorPagamento = valorPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do Pagamento")
  @JsonProperty("valorPagamento")
  public BigDecimal getValorPagamento() {
    return valorPagamento;
  }
  public void setValorPagamento(BigDecimal valorPagamento) {
    this.valorPagamento = valorPagamento;
  }

  
  /**
   * Data e Hora da realiza\u00E7\u00E3o do Pagamento. Quando feito em Institui\u00E7\u00E3o Banc\u00E1ria, o hor\u00E1rio do pagamento \u00E9 exibido com valor zero
   **/
  public ContaHistoricoPagamentoResponse dataHoraPagamento(String dataHoraPagamento) {
    this.dataHoraPagamento = dataHoraPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e Hora da realiza\u00E7\u00E3o do Pagamento. Quando feito em Institui\u00E7\u00E3o Banc\u00E1ria, o hor\u00E1rio do pagamento \u00E9 exibido com valor zero")
  @JsonProperty("dataHoraPagamento")
  public String getDataHoraPagamento() {
    return dataHoraPagamento;
  }
  public void setDataHoraPagamento(String dataHoraPagamento) {
    this.dataHoraPagamento = dataHoraPagamento;
  }

  
  /**
   * Data e Hora em que o registro do Pagamento foi cadastrado
   **/
  public ContaHistoricoPagamentoResponse dataHoraEntradaPagamento(String dataHoraEntradaPagamento) {
    this.dataHoraEntradaPagamento = dataHoraEntradaPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e Hora em que o registro do Pagamento foi cadastrado")
  @JsonProperty("dataHoraEntradaPagamento")
  public String getDataHoraEntradaPagamento() {
    return dataHoraEntradaPagamento;
  }
  public void setDataHoraEntradaPagamento(String dataHoraEntradaPagamento) {
    this.dataHoraEntradaPagamento = dataHoraEntradaPagamento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Status do Pagamento
   **/
  public ContaHistoricoPagamentoResponse status(Long status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Status do Pagamento")
  @JsonProperty("status")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaHistoricoPagamentoResponse contaHistoricoPagamentoResponse = (ContaHistoricoPagamentoResponse) o;
    return Objects.equals(this.idPagamento, contaHistoricoPagamentoResponse.idPagamento) &&
        Objects.equals(this.idEstabelecimento, contaHistoricoPagamentoResponse.idEstabelecimento) &&
        Objects.equals(this.idBanco, contaHistoricoPagamentoResponse.idBanco) &&
        Objects.equals(this.idCartao, contaHistoricoPagamentoResponse.idCartao) &&
        Objects.equals(this.valorPagamento, contaHistoricoPagamentoResponse.valorPagamento) &&
        Objects.equals(this.dataHoraPagamento, contaHistoricoPagamentoResponse.dataHoraPagamento) &&
        Objects.equals(this.dataHoraEntradaPagamento, contaHistoricoPagamentoResponse.dataHoraEntradaPagamento) &&
        Objects.equals(this.status, contaHistoricoPagamentoResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPagamento, idEstabelecimento, idBanco, idCartao, valorPagamento, dataHoraPagamento, dataHoraEntradaPagamento, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaHistoricoPagamentoResponse {\n");
    
    sb.append("    idPagamento: ").append(toIndentedString(idPagamento)).append("\n");
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
    sb.append("    idBanco: ").append(toIndentedString(idBanco)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    valorPagamento: ").append(toIndentedString(valorPagamento)).append("\n");
    sb.append("    dataHoraPagamento: ").append(toIndentedString(dataHoraPagamento)).append("\n");
    sb.append("    dataHoraEntradaPagamento: ").append(toIndentedString(dataHoraEntradaPagamento)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

