package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{emprestimo_pessoal_request_description}}}
 **/

@ApiModel(description = "{{{emprestimo_pessoal_request_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EmprestimoPessoalRequest   {
  
  private BigDecimal valorSolicitado = null;
  private Integer numeroParcelas = null;
  private BigDecimal taxaJuros = null;
  private String periodoTaxa = null;
  private String sistemaAmortizacao = null;
  private Integer numeroMesesCarencia = null;

  
  /**
   * {{{emprestimo_pessoal_request_valor_solicitado_value}}}
   **/
  public EmprestimoPessoalRequest valorSolicitado(BigDecimal valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{emprestimo_pessoal_request_valor_solicitado_value}}}")
  @JsonProperty("valorSolicitado")
  public BigDecimal getValorSolicitado() {
    return valorSolicitado;
  }
  public void setValorSolicitado(BigDecimal valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
  }

  
  /**
   * {{{emprestimo_pessoal_request_numero_parcelas_value}}}
   **/
  public EmprestimoPessoalRequest numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{emprestimo_pessoal_request_numero_parcelas_value}}}")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{emprestimo_pessoal_request_taxa_juros_value}}}
   **/
  public EmprestimoPessoalRequest taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{emprestimo_pessoal_request_taxa_juros_value}}}")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * {{{emprestimo_pessoal_request_periodo_taxa_value}}}
   **/
  public EmprestimoPessoalRequest periodoTaxa(String periodoTaxa) {
    this.periodoTaxa = periodoTaxa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{emprestimo_pessoal_request_periodo_taxa_value}}}")
  @JsonProperty("periodoTaxa")
  public String getPeriodoTaxa() {
    return periodoTaxa;
  }
  public void setPeriodoTaxa(String periodoTaxa) {
    this.periodoTaxa = periodoTaxa;
  }

  
  /**
   * {{{emprestimo_pessoal_request_sistema_amortizacao_value}}}
   **/
  public EmprestimoPessoalRequest sistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{emprestimo_pessoal_request_sistema_amortizacao_value}}}")
  @JsonProperty("sistemaAmortizacao")
  public String getSistemaAmortizacao() {
    return sistemaAmortizacao;
  }
  public void setSistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
  }

  
  /**
   * {{{emprestimo_pessoal_request_numero_meses_carencia_value}}}
   **/
  public EmprestimoPessoalRequest numeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{emprestimo_pessoal_request_numero_meses_carencia_value}}}")
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



