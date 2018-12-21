package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representation of an fee package tariff
 **/

@ApiModel(description = "Representation of an fee package tariff")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PacoteTarifaResponse   {
  
  private String descricao = null;
  private Long id = null;
  private Integer quantidadeAplicacoes = null;
  private Integer quantidadeBilheteUnico = null;
  private Integer quantidadeBoleto = null;
  private Integer quantidadeRecargaCelular = null;
  private Integer quantidadeSaque = null;
  private Integer quantidadeTaxaPagamentoConta = null;
  private Integer quantidadeTransferencia = null;
  private BigDecimal valorTarifa = null;

  
  /**
   * The description of the fee
   **/
  public PacoteTarifaResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the fee")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Fee package id
   **/
  public PacoteTarifaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fee package id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Application amount
   **/
  public PacoteTarifaResponse quantidadeAplicacoes(Integer quantidadeAplicacoes) {
    this.quantidadeAplicacoes = quantidadeAplicacoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Application amount")
  @JsonProperty("quantidadeAplicacoes")
  public Integer getQuantidadeAplicacoes() {
    return quantidadeAplicacoes;
  }
  public void setQuantidadeAplicacoes(Integer quantidadeAplicacoes) {
    this.quantidadeAplicacoes = quantidadeAplicacoes;
  }

  
  /**
   * Unique ticket amount
   **/
  public PacoteTarifaResponse quantidadeBilheteUnico(Integer quantidadeBilheteUnico) {
    this.quantidadeBilheteUnico = quantidadeBilheteUnico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ticket amount")
  @JsonProperty("quantidadeBilheteUnico")
  public Integer getQuantidadeBilheteUnico() {
    return quantidadeBilheteUnico;
  }
  public void setQuantidadeBilheteUnico(Integer quantidadeBilheteUnico) {
    this.quantidadeBilheteUnico = quantidadeBilheteUnico;
  }

  
  /**
   * Chage ticket amount
   **/
  public PacoteTarifaResponse quantidadeBoleto(Integer quantidadeBoleto) {
    this.quantidadeBoleto = quantidadeBoleto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Chage ticket amount")
  @JsonProperty("quantidadeBoleto")
  public Integer getQuantidadeBoleto() {
    return quantidadeBoleto;
  }
  public void setQuantidadeBoleto(Integer quantidadeBoleto) {
    this.quantidadeBoleto = quantidadeBoleto;
  }

  
  /**
   * Cellphone recharge amount
   **/
  public PacoteTarifaResponse quantidadeRecargaCelular(Integer quantidadeRecargaCelular) {
    this.quantidadeRecargaCelular = quantidadeRecargaCelular;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cellphone recharge amount")
  @JsonProperty("quantidadeRecargaCelular")
  public Integer getQuantidadeRecargaCelular() {
    return quantidadeRecargaCelular;
  }
  public void setQuantidadeRecargaCelular(Integer quantidadeRecargaCelular) {
    this.quantidadeRecargaCelular = quantidadeRecargaCelular;
  }

  
  /**
   * Cash out amount
   **/
  public PacoteTarifaResponse quantidadeSaque(Integer quantidadeSaque) {
    this.quantidadeSaque = quantidadeSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cash out amount")
  @JsonProperty("quantidadeSaque")
  public Integer getQuantidadeSaque() {
    return quantidadeSaque;
  }
  public void setQuantidadeSaque(Integer quantidadeSaque) {
    this.quantidadeSaque = quantidadeSaque;
  }

  
  /**
   * Payment tax account amount
   **/
  public PacoteTarifaResponse quantidadeTaxaPagamentoConta(Integer quantidadeTaxaPagamentoConta) {
    this.quantidadeTaxaPagamentoConta = quantidadeTaxaPagamentoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Payment tax account amount")
  @JsonProperty("quantidadeTaxaPagamentoConta")
  public Integer getQuantidadeTaxaPagamentoConta() {
    return quantidadeTaxaPagamentoConta;
  }
  public void setQuantidadeTaxaPagamentoConta(Integer quantidadeTaxaPagamentoConta) {
    this.quantidadeTaxaPagamentoConta = quantidadeTaxaPagamentoConta;
  }

  
  /**
   * Transfer amount
   **/
  public PacoteTarifaResponse quantidadeTransferencia(Integer quantidadeTransferencia) {
    this.quantidadeTransferencia = quantidadeTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Transfer amount")
  @JsonProperty("quantidadeTransferencia")
  public Integer getQuantidadeTransferencia() {
    return quantidadeTransferencia;
  }
  public void setQuantidadeTransferencia(Integer quantidadeTransferencia) {
    this.quantidadeTransferencia = quantidadeTransferencia;
  }

  
  /**
   * Tax value
   **/
  public PacoteTarifaResponse valorTarifa(BigDecimal valorTarifa) {
    this.valorTarifa = valorTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tax value")
  @JsonProperty("valorTarifa")
  public BigDecimal getValorTarifa() {
    return valorTarifa;
  }
  public void setValorTarifa(BigDecimal valorTarifa) {
    this.valorTarifa = valorTarifa;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PacoteTarifaResponse pacoteTarifaResponse = (PacoteTarifaResponse) o;
    return Objects.equals(this.descricao, pacoteTarifaResponse.descricao) &&
        Objects.equals(this.id, pacoteTarifaResponse.id) &&
        Objects.equals(this.quantidadeAplicacoes, pacoteTarifaResponse.quantidadeAplicacoes) &&
        Objects.equals(this.quantidadeBilheteUnico, pacoteTarifaResponse.quantidadeBilheteUnico) &&
        Objects.equals(this.quantidadeBoleto, pacoteTarifaResponse.quantidadeBoleto) &&
        Objects.equals(this.quantidadeRecargaCelular, pacoteTarifaResponse.quantidadeRecargaCelular) &&
        Objects.equals(this.quantidadeSaque, pacoteTarifaResponse.quantidadeSaque) &&
        Objects.equals(this.quantidadeTaxaPagamentoConta, pacoteTarifaResponse.quantidadeTaxaPagamentoConta) &&
        Objects.equals(this.quantidadeTransferencia, pacoteTarifaResponse.quantidadeTransferencia) &&
        Objects.equals(this.valorTarifa, pacoteTarifaResponse.valorTarifa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao, id, quantidadeAplicacoes, quantidadeBilheteUnico, quantidadeBoleto, quantidadeRecargaCelular, quantidadeSaque, quantidadeTaxaPagamentoConta, quantidadeTransferencia, valorTarifa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PacoteTarifaResponse {\n");
    
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantidadeAplicacoes: ").append(toIndentedString(quantidadeAplicacoes)).append("\n");
    sb.append("    quantidadeBilheteUnico: ").append(toIndentedString(quantidadeBilheteUnico)).append("\n");
    sb.append("    quantidadeBoleto: ").append(toIndentedString(quantidadeBoleto)).append("\n");
    sb.append("    quantidadeRecargaCelular: ").append(toIndentedString(quantidadeRecargaCelular)).append("\n");
    sb.append("    quantidadeSaque: ").append(toIndentedString(quantidadeSaque)).append("\n");
    sb.append("    quantidadeTaxaPagamentoConta: ").append(toIndentedString(quantidadeTaxaPagamentoConta)).append("\n");
    sb.append("    quantidadeTransferencia: ").append(toIndentedString(quantidadeTransferencia)).append("\n");
    sb.append("    valorTarifa: ").append(toIndentedString(valorTarifa)).append("\n");
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

