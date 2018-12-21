package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Request Parameters of a Bank Slip
 **/

@ApiModel(description = "Request Parameters of a Bank Slip")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BoletoRequest   {
  
  private Long idConta = null;
  private Long tipoBoleto = null;
  private BigDecimal valor = null;
  private String dataVencimento = null;
  private Long idConvenio = null;

  
  /**
   * Account ID code (id)
   **/
  public BoletoRequest idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Account ID code (id)")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the type of BAnk slip (id)
   **/
  public BoletoRequest tipoBoleto(Long tipoBoleto) {
    this.tipoBoleto = tipoBoleto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identification Code of the type of BAnk slip (id)")
  @JsonProperty("tipoBoleto")
  public Long getTipoBoleto() {
    return tipoBoleto;
  }
  public void setTipoBoleto(Long tipoBoleto) {
    this.tipoBoleto = tipoBoleto;
  }

  
  /**
   * Value of Ticket
   **/
  public BoletoRequest valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value of Ticket")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Due Date
   **/
  public BoletoRequest dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Due Date")
  @JsonProperty("dataVencimento")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Covenant Code from the Charging
   **/
  public BoletoRequest idConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Covenant Code from the Charging")
  @JsonProperty("idConvenio")
  public Long getIdConvenio() {
    return idConvenio;
  }
  public void setIdConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoletoRequest boletoRequest = (BoletoRequest) o;
    return Objects.equals(this.idConta, boletoRequest.idConta) &&
        Objects.equals(this.tipoBoleto, boletoRequest.tipoBoleto) &&
        Objects.equals(this.valor, boletoRequest.valor) &&
        Objects.equals(this.dataVencimento, boletoRequest.dataVencimento) &&
        Objects.equals(this.idConvenio, boletoRequest.idConvenio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, tipoBoleto, valor, dataVencimento, idConvenio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletoRequest {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    tipoBoleto: ").append(toIndentedString(tipoBoleto)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    idConvenio: ").append(toIndentedString(idConvenio)).append("\n");
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

