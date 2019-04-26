package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto a ser persistido de pagamento inv\u00E1lido
 **/

@ApiModel(description = "Objeto a ser persistido de pagamento inv\u00E1lido")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class RegularizacaoPagamentoPersist   {
  
  private Long idConta = null;
  private BigDecimal nossoNumero = null;
  private BigDecimal valorPago = null;

  
  /**
   * Identificador da conta cadastrada na base ap\u00F3s regularizar um pagamento inv\u00E1lido
   **/
  public RegularizacaoPagamentoPersist idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da conta cadastrada na base ap\u00F3s regularizar um pagamento inv\u00E1lido")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * N\u00FAmero do boleto do pagamento inv\u00E1lido
   **/
  public RegularizacaoPagamentoPersist nossoNumero(BigDecimal nossoNumero) {
    this.nossoNumero = nossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do boleto do pagamento inv\u00E1lido")
  @JsonProperty("nossoNumero")
  public BigDecimal getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(BigDecimal nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * Valor do boleto do pagamento inv\u00E1lido
   **/
  public RegularizacaoPagamentoPersist valorPago(BigDecimal valorPago) {
    this.valorPago = valorPago;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do boleto do pagamento inv\u00E1lido")
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
    RegularizacaoPagamentoPersist regularizacaoPagamentoPersist = (RegularizacaoPagamentoPersist) o;
    return Objects.equals(this.idConta, regularizacaoPagamentoPersist.idConta) &&
        Objects.equals(this.nossoNumero, regularizacaoPagamentoPersist.nossoNumero) &&
        Objects.equals(this.valorPago, regularizacaoPagamentoPersist.valorPago);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, nossoNumero, valorPago);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegularizacaoPagamentoPersist {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
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

