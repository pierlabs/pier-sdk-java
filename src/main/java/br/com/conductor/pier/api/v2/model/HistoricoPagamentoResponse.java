package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{historico_pagamento_response_description}}}
 **/

@ApiModel(description = "{{{historico_pagamento_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class HistoricoPagamentoResponse   {
  
  private Long idConta = null;
  private Long idPagamento = null;
  private Long idEstabelecimento = null;
  private Long idBanco = null;
  private Long idCartao = null;
  private BigDecimal valorPagamento = null;
  private String dataHoraPagamento = null;
  private String dataHoraEntradaPagamento = null;
  private Long status = null;

  
  /**
   * {{{historico_pagamento_response_id_conta_value}}}
   **/
  public HistoricoPagamentoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{historico_pagamento_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{historico_pagamento_response_id_pagamento_value}}}
   **/
  public HistoricoPagamentoResponse idPagamento(Long idPagamento) {
    this.idPagamento = idPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{historico_pagamento_response_id_pagamento_value}}}")
  @JsonProperty("idPagamento")
  public Long getIdPagamento() {
    return idPagamento;
  }
  public void setIdPagamento(Long idPagamento) {
    this.idPagamento = idPagamento;
  }

  
  /**
   * {{{historico_pagamento_response_id_estabelecimento_value}}}
   **/
  public HistoricoPagamentoResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{historico_pagamento_response_id_estabelecimento_value}}}")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{historico_pagamento_response_id_banco_value}}}
   **/
  public HistoricoPagamentoResponse idBanco(Long idBanco) {
    this.idBanco = idBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{historico_pagamento_response_id_banco_value}}}")
  @JsonProperty("idBanco")
  public Long getIdBanco() {
    return idBanco;
  }
  public void setIdBanco(Long idBanco) {
    this.idBanco = idBanco;
  }

  
  /**
   * {{{historico_pagamento_response_id_cartao_value}}}
   **/
  public HistoricoPagamentoResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{historico_pagamento_response_id_cartao_value}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{historico_pagamento_response_valor_pagamento_value}}}
   **/
  public HistoricoPagamentoResponse valorPagamento(BigDecimal valorPagamento) {
    this.valorPagamento = valorPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{historico_pagamento_response_valor_pagamento_value}}}")
  @JsonProperty("valorPagamento")
  public BigDecimal getValorPagamento() {
    return valorPagamento;
  }
  public void setValorPagamento(BigDecimal valorPagamento) {
    this.valorPagamento = valorPagamento;
  }

  
  /**
   * {{{historico_pagamento_response_data_hora_pagamento_value}}}
   **/
  public HistoricoPagamentoResponse dataHoraPagamento(String dataHoraPagamento) {
    this.dataHoraPagamento = dataHoraPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{historico_pagamento_response_data_hora_pagamento_value}}}")
  @JsonProperty("dataHoraPagamento")
  public String getDataHoraPagamento() {
    return dataHoraPagamento;
  }
  public void setDataHoraPagamento(String dataHoraPagamento) {
    this.dataHoraPagamento = dataHoraPagamento;
  }

  
  /**
   * {{{historico_pagamento_response_data_hora_entrada_pagamento_value}}}
   **/
  public HistoricoPagamentoResponse dataHoraEntradaPagamento(String dataHoraEntradaPagamento) {
    this.dataHoraEntradaPagamento = dataHoraEntradaPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{historico_pagamento_response_data_hora_entrada_pagamento_value}}}")
  @JsonProperty("dataHoraEntradaPagamento")
  public String getDataHoraEntradaPagamento() {
    return dataHoraEntradaPagamento;
  }
  public void setDataHoraEntradaPagamento(String dataHoraEntradaPagamento) {
    this.dataHoraEntradaPagamento = dataHoraEntradaPagamento;
  }

  
  /**
   * {{{historico_pagamento_response_status_value}}}
   **/
  public HistoricoPagamentoResponse status(Long status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{historico_pagamento_response_status_value}}}")
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
    HistoricoPagamentoResponse historicoPagamentoResponse = (HistoricoPagamentoResponse) o;
    return Objects.equals(this.idConta, historicoPagamentoResponse.idConta) &&
        Objects.equals(this.idPagamento, historicoPagamentoResponse.idPagamento) &&
        Objects.equals(this.idEstabelecimento, historicoPagamentoResponse.idEstabelecimento) &&
        Objects.equals(this.idBanco, historicoPagamentoResponse.idBanco) &&
        Objects.equals(this.idCartao, historicoPagamentoResponse.idCartao) &&
        Objects.equals(this.valorPagamento, historicoPagamentoResponse.valorPagamento) &&
        Objects.equals(this.dataHoraPagamento, historicoPagamentoResponse.dataHoraPagamento) &&
        Objects.equals(this.dataHoraEntradaPagamento, historicoPagamentoResponse.dataHoraEntradaPagamento) &&
        Objects.equals(this.status, historicoPagamentoResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idPagamento, idEstabelecimento, idBanco, idCartao, valorPagamento, dataHoraPagamento, dataHoraEntradaPagamento, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoPagamentoResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
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



