package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{boleto_listar_response_description}}}
 **/

@ApiModel(description = "{{{boleto_listar_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BoletoListarResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private String nossoNumero = null;
  private String dataVencimento = null;
  private BigDecimal valorBoleto = null;
  private Long idTipoBoleto = null;

  
  /**
   * {{{boleto_response_id_value}}}
   **/
  public BoletoListarResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{boleto_response_id_conta_value}}}
   **/
  public BoletoListarResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{boleto_response_nosso_numero_value}}}
   **/
  public BoletoListarResponse nossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_nosso_numero_value}}}")
  @JsonProperty("nossoNumero")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * {{{boleto_response_data_vencimento_value}}}
   **/
  public BoletoListarResponse dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_data_vencimento_value}}}")
  @JsonProperty("dataVencimento")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * {{{boleto_response_valor_boleto_value}}}
   **/
  public BoletoListarResponse valorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_valor_boleto_value}}}")
  @JsonProperty("valorBoleto")
  public BigDecimal getValorBoleto() {
    return valorBoleto;
  }
  public void setValorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
  }

  
  /**
   * {{{boleto_response_id_tipo_boleto_value}}}
   **/
  public BoletoListarResponse idTipoBoleto(Long idTipoBoleto) {
    this.idTipoBoleto = idTipoBoleto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_id_tipo_boleto_value}}}")
  @JsonProperty("idTipoBoleto")
  public Long getIdTipoBoleto() {
    return idTipoBoleto;
  }
  public void setIdTipoBoleto(Long idTipoBoleto) {
    this.idTipoBoleto = idTipoBoleto;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoletoListarResponse boletoListarResponse = (BoletoListarResponse) o;
    return Objects.equals(this.id, boletoListarResponse.id) &&
        Objects.equals(this.idConta, boletoListarResponse.idConta) &&
        Objects.equals(this.nossoNumero, boletoListarResponse.nossoNumero) &&
        Objects.equals(this.dataVencimento, boletoListarResponse.dataVencimento) &&
        Objects.equals(this.valorBoleto, boletoListarResponse.valorBoleto) &&
        Objects.equals(this.idTipoBoleto, boletoListarResponse.idTipoBoleto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, nossoNumero, dataVencimento, valorBoleto, idTipoBoleto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletoListarResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    nossoNumero: ").append(toIndentedString(nossoNumero)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    valorBoleto: ").append(toIndentedString(valorBoleto)).append("\n");
    sb.append("    idTipoBoleto: ").append(toIndentedString(idTipoBoleto)).append("\n");
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

