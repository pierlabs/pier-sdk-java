package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Fatura Futura
 **/

@ApiModel(description = "Fatura Futura")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class FaturaFuturaResponse   {
  
  private Long idConta = null;
  private String dataVencimentoFatura = null;
  private String dataVencimentoReal = null;
  private String dataFechamento = null;
  private BigDecimal valorTotal = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta
   **/
  public FaturaFuturaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Data de vencimento da fatura
   **/
  public FaturaFuturaResponse dataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento da fatura")
  @JsonProperty("dataVencimentoFatura")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * Data de vencimento real da fatura
   **/
  public FaturaFuturaResponse dataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento real da fatura")
  @JsonProperty("dataVencimentoReal")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Data de fechamento da fatura
   **/
  public FaturaFuturaResponse dataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de fechamento da fatura")
  @JsonProperty("dataFechamento")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * Valor total da fatura
   **/
  public FaturaFuturaResponse valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total da fatura")
  @JsonProperty("valorTotal")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaturaFuturaResponse faturaFuturaResponse = (FaturaFuturaResponse) o;
    return Objects.equals(this.idConta, faturaFuturaResponse.idConta) &&
        Objects.equals(this.dataVencimentoFatura, faturaFuturaResponse.dataVencimentoFatura) &&
        Objects.equals(this.dataVencimentoReal, faturaFuturaResponse.dataVencimentoReal) &&
        Objects.equals(this.dataFechamento, faturaFuturaResponse.dataFechamento) &&
        Objects.equals(this.valorTotal, faturaFuturaResponse.valorTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, dataVencimentoFatura, dataVencimentoReal, dataFechamento, valorTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaFuturaResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    dataVencimentoFatura: ").append(toIndentedString(dataVencimentoFatura)).append("\n");
    sb.append("    dataVencimentoReal: ").append(toIndentedString(dataVencimentoReal)).append("\n");
    sb.append("    dataFechamento: ").append(toIndentedString(dataFechamento)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
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

