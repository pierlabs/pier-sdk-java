package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de persist\u00EAncia de um pacote de tarifas
 **/

@ApiModel(description = "Objeto de persist\u00EAncia de um pacote de tarifas")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PacoteTarifaUpdate   {
  
  private String descricao = null;
  private Integer quantidadeRecargaCelular = null;
  private Integer quantidadeBilheteUnico = null;
  private Integer quantidadeTaxaPagamentoConta = null;
  private Integer quantidadeSaque = null;
  private Integer quantidadeTransferencia = null;
  private Integer quantidadeBoleto = null;
  private Integer quantidadeAplicacoes = null;
  private BigDecimal valorTarifa = null;

  
  /**
   * Descri\u00E7\u00E3o do pacote de tarifa
   **/
  public PacoteTarifaUpdate descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do pacote de tarifa")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Quantidade de recargas de celular inclusas no pacote de tarifas
   **/
  public PacoteTarifaUpdate quantidadeRecargaCelular(Integer quantidadeRecargaCelular) {
    this.quantidadeRecargaCelular = quantidadeRecargaCelular;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quantidade de recargas de celular inclusas no pacote de tarifas")
  @JsonProperty("quantidadeRecargaCelular")
  public Integer getQuantidadeRecargaCelular() {
    return quantidadeRecargaCelular;
  }
  public void setQuantidadeRecargaCelular(Integer quantidadeRecargaCelular) {
    this.quantidadeRecargaCelular = quantidadeRecargaCelular;
  }

  
  /**
   * Quantidade de recargas de bilhete \u00FAnico inclusas no pacote de tarifas
   **/
  public PacoteTarifaUpdate quantidadeBilheteUnico(Integer quantidadeBilheteUnico) {
    this.quantidadeBilheteUnico = quantidadeBilheteUnico;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quantidade de recargas de bilhete \u00FAnico inclusas no pacote de tarifas")
  @JsonProperty("quantidadeBilheteUnico")
  public Integer getQuantidadeBilheteUnico() {
    return quantidadeBilheteUnico;
  }
  public void setQuantidadeBilheteUnico(Integer quantidadeBilheteUnico) {
    this.quantidadeBilheteUnico = quantidadeBilheteUnico;
  }

  
  /**
   * Quantidade de pagamentos de contas inclusas no pacote de tarifas
   **/
  public PacoteTarifaUpdate quantidadeTaxaPagamentoConta(Integer quantidadeTaxaPagamentoConta) {
    this.quantidadeTaxaPagamentoConta = quantidadeTaxaPagamentoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quantidade de pagamentos de contas inclusas no pacote de tarifas")
  @JsonProperty("quantidadeTaxaPagamentoConta")
  public Integer getQuantidadeTaxaPagamentoConta() {
    return quantidadeTaxaPagamentoConta;
  }
  public void setQuantidadeTaxaPagamentoConta(Integer quantidadeTaxaPagamentoConta) {
    this.quantidadeTaxaPagamentoConta = quantidadeTaxaPagamentoConta;
  }

  
  /**
   * Quantidade de saques inclusos no pacote de tarifas
   **/
  public PacoteTarifaUpdate quantidadeSaque(Integer quantidadeSaque) {
    this.quantidadeSaque = quantidadeSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quantidade de saques inclusos no pacote de tarifas")
  @JsonProperty("quantidadeSaque")
  public Integer getQuantidadeSaque() {
    return quantidadeSaque;
  }
  public void setQuantidadeSaque(Integer quantidadeSaque) {
    this.quantidadeSaque = quantidadeSaque;
  }

  
  /**
   * Quantidade de transfer\u00EAncias inclusas no pacote de tarifas
   **/
  public PacoteTarifaUpdate quantidadeTransferencia(Integer quantidadeTransferencia) {
    this.quantidadeTransferencia = quantidadeTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quantidade de transfer\u00EAncias inclusas no pacote de tarifas")
  @JsonProperty("quantidadeTransferencia")
  public Integer getQuantidadeTransferencia() {
    return quantidadeTransferencia;
  }
  public void setQuantidadeTransferencia(Integer quantidadeTransferencia) {
    this.quantidadeTransferencia = quantidadeTransferencia;
  }

  
  /**
   * Quantidade de gera\u00E7\u00E3o de boletos inclusos no pacote de tarifas
   **/
  public PacoteTarifaUpdate quantidadeBoleto(Integer quantidadeBoleto) {
    this.quantidadeBoleto = quantidadeBoleto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quantidade de gera\u00E7\u00E3o de boletos inclusos no pacote de tarifas")
  @JsonProperty("quantidadeBoleto")
  public Integer getQuantidadeBoleto() {
    return quantidadeBoleto;
  }
  public void setQuantidadeBoleto(Integer quantidadeBoleto) {
    this.quantidadeBoleto = quantidadeBoleto;
  }

  
  /**
   * Quantidade de aplica\u00E7\u00F5es inclusas no pacote de tarifas
   **/
  public PacoteTarifaUpdate quantidadeAplicacoes(Integer quantidadeAplicacoes) {
    this.quantidadeAplicacoes = quantidadeAplicacoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quantidade de aplica\u00E7\u00F5es inclusas no pacote de tarifas")
  @JsonProperty("quantidadeAplicacoes")
  public Integer getQuantidadeAplicacoes() {
    return quantidadeAplicacoes;
  }
  public void setQuantidadeAplicacoes(Integer quantidadeAplicacoes) {
    this.quantidadeAplicacoes = quantidadeAplicacoes;
  }

  
  /**
   * Valor da tarifa do pacote
   **/
  public PacoteTarifaUpdate valorTarifa(BigDecimal valorTarifa) {
    this.valorTarifa = valorTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da tarifa do pacote")
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
    PacoteTarifaUpdate pacoteTarifaUpdate = (PacoteTarifaUpdate) o;
    return Objects.equals(this.descricao, pacoteTarifaUpdate.descricao) &&
        Objects.equals(this.quantidadeRecargaCelular, pacoteTarifaUpdate.quantidadeRecargaCelular) &&
        Objects.equals(this.quantidadeBilheteUnico, pacoteTarifaUpdate.quantidadeBilheteUnico) &&
        Objects.equals(this.quantidadeTaxaPagamentoConta, pacoteTarifaUpdate.quantidadeTaxaPagamentoConta) &&
        Objects.equals(this.quantidadeSaque, pacoteTarifaUpdate.quantidadeSaque) &&
        Objects.equals(this.quantidadeTransferencia, pacoteTarifaUpdate.quantidadeTransferencia) &&
        Objects.equals(this.quantidadeBoleto, pacoteTarifaUpdate.quantidadeBoleto) &&
        Objects.equals(this.quantidadeAplicacoes, pacoteTarifaUpdate.quantidadeAplicacoes) &&
        Objects.equals(this.valorTarifa, pacoteTarifaUpdate.valorTarifa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao, quantidadeRecargaCelular, quantidadeBilheteUnico, quantidadeTaxaPagamentoConta, quantidadeSaque, quantidadeTransferencia, quantidadeBoleto, quantidadeAplicacoes, valorTarifa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PacoteTarifaUpdate {\n");
    
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    quantidadeRecargaCelular: ").append(toIndentedString(quantidadeRecargaCelular)).append("\n");
    sb.append("    quantidadeBilheteUnico: ").append(toIndentedString(quantidadeBilheteUnico)).append("\n");
    sb.append("    quantidadeTaxaPagamentoConta: ").append(toIndentedString(quantidadeTaxaPagamentoConta)).append("\n");
    sb.append("    quantidadeSaque: ").append(toIndentedString(quantidadeSaque)).append("\n");
    sb.append("    quantidadeTransferencia: ").append(toIndentedString(quantidadeTransferencia)).append("\n");
    sb.append("    quantidadeBoleto: ").append(toIndentedString(quantidadeBoleto)).append("\n");
    sb.append("    quantidadeAplicacoes: ").append(toIndentedString(quantidadeAplicacoes)).append("\n");
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

