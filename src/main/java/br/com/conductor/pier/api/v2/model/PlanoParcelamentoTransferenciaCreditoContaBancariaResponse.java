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
 * Plano de Parcelamentos para Transfer\u00EAncia de cr\u00E9dito para contas banc\u00E1rias
 **/

@ApiModel(description = "Plano de Parcelamentos para Transfer\u00EAncia de cr\u00E9dito para contas banc\u00E1rias")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoParcelamentoTransferenciaCreditoContaBancariaResponse   {
  
  private String numeroMascaradoCartao = null;
  private String vencimentoPrimeiraParcela = null;
  private BigDecimal valorTransacao = null;
  private Integer numeroMesesCarencia = null;
  private List<ParcelamentoTransferenciaResponse> parcelas = new ArrayList<ParcelamentoTransferenciaResponse>();

  
  /**
   * N\u00FAmero do Cart\u00E3o que originou a transa\u00E7\u00E3o em formato mascarado.
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse numeroMascaradoCartao(String numeroMascaradoCartao) {
    this.numeroMascaradoCartao = numeroMascaradoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do Cart\u00E3o que originou a transa\u00E7\u00E3o em formato mascarado.")
  @JsonProperty("numeroMascaradoCartao")
  public String getNumeroMascaradoCartao() {
    return numeroMascaradoCartao;
  }
  public void setNumeroMascaradoCartao(String numeroMascaradoCartao) {
    this.numeroMascaradoCartao = numeroMascaradoCartao;
  }

  
  /**
   * Data de vencimento da primeira parcela.
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse vencimentoPrimeiraParcela(String vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento da primeira parcela.")
  @JsonProperty("vencimentoPrimeiraParcela")
  public String getVencimentoPrimeiraParcela() {
    return vencimentoPrimeiraParcela;
  }
  public void setVencimentoPrimeiraParcela(String vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
  }

  
  /**
   * Valor da solicita\u00E7\u00E3o de saque.
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da solicita\u00E7\u00E3o de saque.")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * N\u00FAmero de meses para car\u00EAncia.
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse numeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero de meses para car\u00EAncia.")
  @JsonProperty("numeroMesesCarencia")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * Lista com os planos de parcelamento.
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse parcelas(List<ParcelamentoTransferenciaResponse> parcelas) {
    this.parcelas = parcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista com os planos de parcelamento.")
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

