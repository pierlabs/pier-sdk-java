package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{boleto_request_description}}}
 **/

@ApiModel(description = "{{{boleto_request_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BoletoRequest   {
  
  private Long idConta = null;
  private Long tipoBoleto = null;
  private BigDecimal valor = null;
  private String dataVencimento = null;

  
  /**
   * {{{boleto_request_id_conta_value}}}
   **/
  public BoletoRequest idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{boleto_request_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{boleto_request_tipo_boleto_value}}}
   **/
  public BoletoRequest tipoBoleto(Long tipoBoleto) {
    this.tipoBoleto = tipoBoleto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{boleto_request_tipo_boleto_value}}}")
  @JsonProperty("tipoBoleto")
  public Long getTipoBoleto() {
    return tipoBoleto;
  }
  public void setTipoBoleto(Long tipoBoleto) {
    this.tipoBoleto = tipoBoleto;
  }

  
  /**
   * {{{boleto_request_valor_value}}}
   **/
  public BoletoRequest valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{boleto_request_valor_value}}}")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{boleto_request_data_vencimento_value}}}
   **/
  public BoletoRequest dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{boleto_request_data_vencimento_value}}}")
  @JsonProperty("dataVencimento")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
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
        Objects.equals(this.dataVencimento, boletoRequest.dataVencimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, tipoBoleto, valor, dataVencimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletoRequest {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    tipoBoleto: ").append(toIndentedString(tipoBoleto)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
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



