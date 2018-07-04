package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ParcelamentoTransferenciaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;





/**
 * {{{plano_parcelamento_transferencia_credito_conta_bancaria_response_description}}}
 **/

@ApiModel(description = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoParcelamentoTransferenciaCreditoContaBancariaResponse   {
  
  private String numeroMascaradoCartao = null;
  private String vencimentoPrimeiraParcela = null;
  private BigDecimal valorTransacao = null;
  private Integer numeroMesesCarencia = null;
  private List<ParcelamentoTransferenciaResponse> parcelas = new ArrayList<ParcelamentoTransferenciaResponse>();

  
  /**
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_response_numero_mascarado_cartao_value}}}
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse numeroMascaradoCartao(String numeroMascaradoCartao) {
    this.numeroMascaradoCartao = numeroMascaradoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_response_numero_mascarado_cartao_value}}}")
  @JsonProperty("numeroMascaradoCartao")
  public String getNumeroMascaradoCartao() {
    return numeroMascaradoCartao;
  }
  public void setNumeroMascaradoCartao(String numeroMascaradoCartao) {
    this.numeroMascaradoCartao = numeroMascaradoCartao;
  }

  
  /**
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_response_vencimento_primeira_parcela_value}}}
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse vencimentoPrimeiraParcela(String vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_response_vencimento_primeira_parcela_value}}}")
  @JsonProperty("vencimentoPrimeiraParcela")
  public String getVencimentoPrimeiraParcela() {
    return vencimentoPrimeiraParcela;
  }
  public void setVencimentoPrimeiraParcela(String vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
  }

  
  /**
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_response_valor_transacao_value}}}
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_response_valor_transacao_value}}}")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_response_numero_meses_carencia_value}}}
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse numeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_response_numero_meses_carencia_value}}}")
  @JsonProperty("numeroMesesCarencia")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_response_parcelas_value}}}
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse parcelas(List<ParcelamentoTransferenciaResponse> parcelas) {
    this.parcelas = parcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_response_parcelas_value}}}")
  @JsonProperty("parcelas")
  public List<ParcelamentoTransferenciaResponse> getParcelas() {
    return parcelas;
  }
  public void setParcelas(List<ParcelamentoTransferenciaResponse> parcelas) {
    this.parcelas = parcelas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanoParcelamentoTransferenciaCreditoContaBancariaResponse planoParcelamentoTransferenciaCreditoContaBancariaResponse = (PlanoParcelamentoTransferenciaCreditoContaBancariaResponse) o;
    return Objects.equals(this.numeroMascaradoCartao, planoParcelamentoTransferenciaCreditoContaBancariaResponse.numeroMascaradoCartao) &&
        Objects.equals(this.vencimentoPrimeiraParcela, planoParcelamentoTransferenciaCreditoContaBancariaResponse.vencimentoPrimeiraParcela) &&
        Objects.equals(this.valorTransacao, planoParcelamentoTransferenciaCreditoContaBancariaResponse.valorTransacao) &&
        Objects.equals(this.numeroMesesCarencia, planoParcelamentoTransferenciaCreditoContaBancariaResponse.numeroMesesCarencia) &&
        Objects.equals(this.parcelas, planoParcelamentoTransferenciaCreditoContaBancariaResponse.parcelas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroMascaradoCartao, vencimentoPrimeiraParcela, valorTransacao, numeroMesesCarencia, parcelas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoTransferenciaCreditoContaBancariaResponse {\n");
    
    sb.append("    numeroMascaradoCartao: ").append(toIndentedString(numeroMascaradoCartao)).append("\n");
    sb.append("    vencimentoPrimeiraParcela: ").append(toIndentedString(vencimentoPrimeiraParcela)).append("\n");
    sb.append("    valorTransacao: ").append(toIndentedString(valorTransacao)).append("\n");
    sb.append("    numeroMesesCarencia: ").append(toIndentedString(numeroMesesCarencia)).append("\n");
    sb.append("    parcelas: ").append(toIndentedString(parcelas)).append("\n");
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



