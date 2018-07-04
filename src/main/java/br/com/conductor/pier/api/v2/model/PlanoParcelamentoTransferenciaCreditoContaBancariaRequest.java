package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{plano_parcelamento_transferencia_credito_conta_bancaria_request_description}}}
 **/

@ApiModel(description = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_request_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoParcelamentoTransferenciaCreditoContaBancariaRequest   {
  
  private Long idCartao = null;
  private BigDecimal valorTransacao = null;
  private Integer numeroMesesCarencia = null;

  
  /**
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_request_id_cartao_value}}}
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaRequest idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_request_id_cartao_value}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_request_valor_transacao_value}}}
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaRequest valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "0.0", required = true, value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_request_valor_transacao_value}}}")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_request_numero_meses_carencia_value}}}
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaRequest numeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_request_numero_meses_carencia_value}}}")
  @JsonProperty("numeroMesesCarencia")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanoParcelamentoTransferenciaCreditoContaBancariaRequest planoParcelamentoTransferenciaCreditoContaBancariaRequest = (PlanoParcelamentoTransferenciaCreditoContaBancariaRequest) o;
    return Objects.equals(this.idCartao, planoParcelamentoTransferenciaCreditoContaBancariaRequest.idCartao) &&
        Objects.equals(this.valorTransacao, planoParcelamentoTransferenciaCreditoContaBancariaRequest.valorTransacao) &&
        Objects.equals(this.numeroMesesCarencia, planoParcelamentoTransferenciaCreditoContaBancariaRequest.numeroMesesCarencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCartao, valorTransacao, numeroMesesCarencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoTransferenciaCreditoContaBancariaRequest {\n");
    
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    valorTransacao: ").append(toIndentedString(valorTransacao)).append("\n");
    sb.append("    numeroMesesCarencia: ").append(toIndentedString(numeroMesesCarencia)).append("\n");
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



