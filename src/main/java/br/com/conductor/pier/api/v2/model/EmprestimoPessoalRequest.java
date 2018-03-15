package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o da requisi\u00E7\u00E3o do  recurso Dispositivo
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da requisi\u00E7\u00E3o do  recurso Dispositivo")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EmprestimoPessoalRequest   {
  
  private BigDecimal valorSolicitado = null;
  private Integer numeroParcelas = null;
  private BigDecimal taxaJuros = null;
  private String periodoTaxa = null;
  private String sistemaAmortizacao = null;
  private Integer numeroMesesCarencia = null;

  
  /**
   * Valor do empr\u00E9stimo/financiamento
   **/
  public EmprestimoPessoalRequest valorSolicitado(BigDecimal valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor do empr\u00E9stimo/financiamento")
  @JsonProperty("valorSolicitado")
  public BigDecimal getValorSolicitado() {
    return valorSolicitado;
  }
  public void setValorSolicitado(BigDecimal valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
  }

  
  /**
   * N\u00FAmero total de parcelas do empr\u00E9stimo/financiamento
   **/
  public EmprestimoPessoalRequest numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero total de parcelas do empr\u00E9stimo/financiamento")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Valor percentual da taxa de juros a ser aplicada
   **/
  public EmprestimoPessoalRequest taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor percentual da taxa de juros a ser aplicada")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Per\u00EDodo de aplica da taxa de juros
   **/
  public EmprestimoPessoalRequest periodoTaxa(String periodoTaxa) {
    this.periodoTaxa = periodoTaxa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Per\u00EDodo de aplica da taxa de juros")
  @JsonProperty("periodoTaxa")
  public String getPeriodoTaxa() {
    return periodoTaxa;
  }
  public void setPeriodoTaxa(String periodoTaxa) {
    this.periodoTaxa = periodoTaxa;
  }

  
  /**
   * Sistema para amortiza\u00E7\u00E3o do valor das parcelas
   **/
  public EmprestimoPessoalRequest sistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sistema para amortiza\u00E7\u00E3o do valor das parcelas")
  @JsonProperty("sistemaAmortizacao")
  public String getSistemaAmortizacao() {
    return sistemaAmortizacao;
  }
  public void setSistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
  }

  
  /**
   * N\u00FAmero de meses para cobran\u00E7a da primeira parcela
   **/
  public EmprestimoPessoalRequest numeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero de meses para cobran\u00E7a da primeira parcela")
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

