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
 * Installment plan for the credit transfer to bank accounts
 **/

@ApiModel(description = "Installment plan for the credit transfer to bank accounts")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoParcelamentoTransferenciaCreditoContaBancariaResponse   {
  
  private String numeroMascaradoCartao = null;
  private String vencimentoPrimeiraParcela = null;
  private BigDecimal valorTransacao = null;
  private Integer numeroMesesCarencia = null;
  private List<ParcelamentoTransferenciaResponse> parcelas = new ArrayList<ParcelamentoTransferenciaResponse>();

  
  /**
   * Card Number that originated the transaction in the masked format
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse numeroMascaradoCartao(String numeroMascaradoCartao) {
    this.numeroMascaradoCartao = numeroMascaradoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Card Number that originated the transaction in the masked format")
  @JsonProperty("numeroMascaradoCartao")
  public String getNumeroMascaradoCartao() {
    return numeroMascaradoCartao;
  }
  public void setNumeroMascaradoCartao(String numeroMascaradoCartao) {
    this.numeroMascaradoCartao = numeroMascaradoCartao;
  }

  
  /**
   * Expiration date of the first parcel
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse vencimentoPrimeiraParcela(String vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expiration date of the first parcel")
  @JsonProperty("vencimentoPrimeiraParcela")
  public String getVencimentoPrimeiraParcela() {
    return vencimentoPrimeiraParcela;
  }
  public void setVencimentoPrimeiraParcela(String vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
  }

  
  /**
   * Value of teh withdrawal request
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of teh withdrawal request")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * Number of the Months for Lack
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse numeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of the Months for Lack")
  @JsonProperty("numeroMesesCarencia")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * List with the installment plans
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse parcelas(List<ParcelamentoTransferenciaResponse> parcelas) {
    this.parcelas = parcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List with the installment plans")
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

