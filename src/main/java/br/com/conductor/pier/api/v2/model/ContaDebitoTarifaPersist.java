package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de persistencia de tarifas de d\u00E9bito da conta
 **/

@ApiModel(description = "Objeto de persistencia de tarifas de d\u00E9bito da conta")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaDebitoTarifaPersist   {
  
  private BigDecimal valor = null;
  private BigDecimal valorOriginal = null;
  private BigDecimal percentualDesconto = null;
  private String dataHoraFimCobranca = null;
  private String dataHoraExpiracao = null;

  
  /**
   * Valor da tarifa com desconto
   **/
  public ContaDebitoTarifaPersist valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da tarifa com desconto")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Valor original da tarifa
   **/
  public ContaDebitoTarifaPersist valorOriginal(BigDecimal valorOriginal) {
    this.valorOriginal = valorOriginal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor original da tarifa")
  @JsonProperty("valorOriginal")
  public BigDecimal getValorOriginal() {
    return valorOriginal;
  }
  public void setValorOriginal(BigDecimal valorOriginal) {
    this.valorOriginal = valorOriginal;
  }

  
  /**
   * Percentual de desconto
   **/
  public ContaDebitoTarifaPersist percentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentual de desconto")
  @JsonProperty("percentualDesconto")
  public BigDecimal getPercentualDesconto() {
    return percentualDesconto;
  }
  public void setPercentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
  }

  
  /**
   * Data e hora do fim da cobran\u00E7a
   **/
  public ContaDebitoTarifaPersist dataHoraFimCobranca(String dataHoraFimCobranca) {
    this.dataHoraFimCobranca = dataHoraFimCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e hora do fim da cobran\u00E7a")
  @JsonProperty("dataHoraFimCobranca")
  public String getDataHoraFimCobranca() {
    return dataHoraFimCobranca;
  }
  public void setDataHoraFimCobranca(String dataHoraFimCobranca) {
    this.dataHoraFimCobranca = dataHoraFimCobranca;
  }

  
  /**
   * Data e hora de expira\u00E7\u00E3o do registro de cobran\u00E7a
   **/
  public ContaDebitoTarifaPersist dataHoraExpiracao(String dataHoraExpiracao) {
    this.dataHoraExpiracao = dataHoraExpiracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e hora de expira\u00E7\u00E3o do registro de cobran\u00E7a")
  @JsonProperty("dataHoraExpiracao")
  public String getDataHoraExpiracao() {
    return dataHoraExpiracao;
  }
  public void setDataHoraExpiracao(String dataHoraExpiracao) {
    this.dataHoraExpiracao = dataHoraExpiracao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaDebitoTarifaPersist contaDebitoTarifaPersist = (ContaDebitoTarifaPersist) o;
    return Objects.equals(this.valor, contaDebitoTarifaPersist.valor) &&
        Objects.equals(this.valorOriginal, contaDebitoTarifaPersist.valorOriginal) &&
        Objects.equals(this.percentualDesconto, contaDebitoTarifaPersist.percentualDesconto) &&
        Objects.equals(this.dataHoraFimCobranca, contaDebitoTarifaPersist.dataHoraFimCobranca) &&
        Objects.equals(this.dataHoraExpiracao, contaDebitoTarifaPersist.dataHoraExpiracao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valor, valorOriginal, percentualDesconto, dataHoraFimCobranca, dataHoraExpiracao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDebitoTarifaPersist {\n");
    
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    valorOriginal: ").append(toIndentedString(valorOriginal)).append("\n");
    sb.append("    percentualDesconto: ").append(toIndentedString(percentualDesconto)).append("\n");
    sb.append("    dataHoraFimCobranca: ").append(toIndentedString(dataHoraFimCobranca)).append("\n");
    sb.append("    dataHoraExpiracao: ").append(toIndentedString(dataHoraExpiracao)).append("\n");
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

