package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido   {
  
  private Long idConta = null;
  private Long idPagamento = null;
  private Long idPagamentoRejeitado = null;
  private BigDecimal nossoNumero = null;
  private BigDecimal valorPago = null;

  
  /**
   * Identificador da conta de um pagamento inv\u00E1lido regularizado
   **/
  public RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da conta de um pagamento inv\u00E1lido regularizado")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Id do pagamento inv\u00E1lido
   **/
  public RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido idPagamento(Long idPagamento) {
    this.idPagamento = idPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do pagamento inv\u00E1lido")
  @JsonProperty("idPagamento")
  public Long getIdPagamento() {
    return idPagamento;
  }
  public void setIdPagamento(Long idPagamento) {
    this.idPagamento = idPagamento;
  }

  
  /**
   * Identificador do pagamento inv\u00E1lido regularizado
   **/
  public RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido idPagamentoRejeitado(Long idPagamentoRejeitado) {
    this.idPagamentoRejeitado = idPagamentoRejeitado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do pagamento inv\u00E1lido regularizado")
  @JsonProperty("idPagamentoRejeitado")
  public Long getIdPagamentoRejeitado() {
    return idPagamentoRejeitado;
  }
  public void setIdPagamentoRejeitado(Long idPagamentoRejeitado) {
    this.idPagamentoRejeitado = idPagamentoRejeitado;
  }

  
  /**
   * N\u00FAmero do boleto de um pagamento inv\u00E1lido regularizado
   **/
  public RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido nossoNumero(BigDecimal nossoNumero) {
    this.nossoNumero = nossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do boleto de um pagamento inv\u00E1lido regularizado")
  @JsonProperty("nossoNumero")
  public BigDecimal getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(BigDecimal nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * Valor pago de um boleto regularizado
   **/
  public RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido valorPago(BigDecimal valorPago) {
    this.valorPago = valorPago;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor pago de um boleto regularizado")
  @JsonProperty("valorPago")
  public BigDecimal getValorPago() {
    return valorPago;
  }
  public void setValorPago(BigDecimal valorPago) {
    this.valorPago = valorPago;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido representaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido = (RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido) o;
    return Objects.equals(this.idConta, representaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido.idConta) &&
        Objects.equals(this.idPagamento, representaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido.idPagamento) &&
        Objects.equals(this.idPagamentoRejeitado, representaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido.idPagamentoRejeitado) &&
        Objects.equals(this.nossoNumero, representaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido.nossoNumero) &&
        Objects.equals(this.valorPago, representaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido.valorPago);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idPagamento, idPagamentoRejeitado, nossoNumero, valorPago);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPagamento: ").append(toIndentedString(idPagamento)).append("\n");
    sb.append("    idPagamentoRejeitado: ").append(toIndentedString(idPagamentoRejeitado)).append("\n");
    sb.append("    nossoNumero: ").append(toIndentedString(nossoNumero)).append("\n");
    sb.append("    valorPago: ").append(toIndentedString(valorPago)).append("\n");
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

