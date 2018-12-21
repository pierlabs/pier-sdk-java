package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Request Representation of the Device resource
 **/

@ApiModel(description = "Request Representation of the Device resource")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EmprestimoPessoalRequest   {
  
  private BigDecimal valorSolicitado = null;
  private Integer numeroParcelas = null;
  private BigDecimal taxaJuros = null;
  private String periodoTaxa = null;
  private String sistemaAmortizacao = null;
  private Integer numeroMesesCarencia = null;

  
  /**
   * Value of the Loan/financing
   **/
  public EmprestimoPessoalRequest valorSolicitado(BigDecimal valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value of the Loan/financing")
  @JsonProperty("valorSolicitado")
  public BigDecimal getValorSolicitado() {
    return valorSolicitado;
  }
  public void setValorSolicitado(BigDecimal valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
  }

  
  /**
   * Total Number of the portions of the loan/financing
   **/
  public EmprestimoPessoalRequest numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total Number of the portions of the loan/financing")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Percent value of the taxes of interest to be applied
   **/
  public EmprestimoPessoalRequest taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Percent value of the taxes of interest to be applied")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Period of application of the taxes of interest
   **/
  public EmprestimoPessoalRequest periodoTaxa(String periodoTaxa) {
    this.periodoTaxa = periodoTaxa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Period of application of the taxes of interest")
  @JsonProperty("periodoTaxa")
  public String getPeriodoTaxa() {
    return periodoTaxa;
  }
  public void setPeriodoTaxa(String periodoTaxa) {
    this.periodoTaxa = periodoTaxa;
  }

  
  /**
   * System to diminish the value of the portions
   **/
  public EmprestimoPessoalRequest sistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "System to diminish the value of the portions")
  @JsonProperty("sistemaAmortizacao")
  public String getSistemaAmortizacao() {
    return sistemaAmortizacao;
  }
  public void setSistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
  }

  
  /**
   * Number of months to the collection of the first portion
   **/
  public EmprestimoPessoalRequest numeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of months to the collection of the first portion")
  @JsonProperty("numeroMesesCarencia")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmprestimoPessoalRequest emprestimoPessoalRequest = (EmprestimoPessoalRequest) o;
    return Objects.equals(this.valorSolicitado, emprestimoPessoalRequest.valorSolicitado) &&
        Objects.equals(this.numeroParcelas, emprestimoPessoalRequest.numeroParcelas) &&
        Objects.equals(this.taxaJuros, emprestimoPessoalRequest.taxaJuros) &&
        Objects.equals(this.periodoTaxa, emprestimoPessoalRequest.periodoTaxa) &&
        Objects.equals(this.sistemaAmortizacao, emprestimoPessoalRequest.sistemaAmortizacao) &&
        Objects.equals(this.numeroMesesCarencia, emprestimoPessoalRequest.numeroMesesCarencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valorSolicitado, numeroParcelas, taxaJuros, periodoTaxa, sistemaAmortizacao, numeroMesesCarencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmprestimoPessoalRequest {\n");
    
    sb.append("    valorSolicitado: ").append(toIndentedString(valorSolicitado)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    taxaJuros: ").append(toIndentedString(taxaJuros)).append("\n");
    sb.append("    periodoTaxa: ").append(toIndentedString(periodoTaxa)).append("\n");
    sb.append("    sistemaAmortizacao: ").append(toIndentedString(sistemaAmortizacao)).append("\n");
    sb.append("    numeroMesesCarencia: ").append(toIndentedString(numeroMesesCarencia)).append("\n");
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

