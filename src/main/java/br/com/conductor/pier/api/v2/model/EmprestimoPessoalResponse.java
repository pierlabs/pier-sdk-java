package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoEmprestimoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;





/**
 * {{{emprestimo_pessoal_response_description}}}
 **/

@ApiModel(description = "{{{emprestimo_pessoal_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EmprestimoPessoalResponse   {
  
  private List<PlanoParcelamentoEmprestimoResponse> planosParcelamentos = new ArrayList<PlanoParcelamentoEmprestimoResponse>();
  private BigDecimal valorSolicitado = null;
  private BigDecimal valorMaximoSolicitacao = null;
  private Integer numeroParcelas = null;
  private BigDecimal valorMaximoParcela = null;
  private String dataPrimeiraParcela = null;
  private String periodoTaxa = null;
  private String sistemaAmortizacao = null;
  private BigDecimal taxaJuros = null;

  
  /**
   **/
  public EmprestimoPessoalResponse planosParcelamentos(List<PlanoParcelamentoEmprestimoResponse> planosParcelamentos) {
    this.planosParcelamentos = planosParcelamentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("planosParcelamentos")
  public List<PlanoParcelamentoEmprestimoResponse> getPlanosParcelamentos() {
    return planosParcelamentos;
  }
  public void setPlanosParcelamentos(List<PlanoParcelamentoEmprestimoResponse> planosParcelamentos) {
    this.planosParcelamentos = planosParcelamentos;
  }

  
  /**
   * {{{emprestimo_pessoal_response_valor_solicitado_value}}}
   **/
  public EmprestimoPessoalResponse valorSolicitado(BigDecimal valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{emprestimo_pessoal_response_valor_solicitado_value}}}")
  @JsonProperty("valorSolicitado")
  public BigDecimal getValorSolicitado() {
    return valorSolicitado;
  }
  public void setValorSolicitado(BigDecimal valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
  }

  
  /**
   * {{{emprestimo_pessoal_response_valor_maximo_solicitacao_value}}}
   **/
  public EmprestimoPessoalResponse valorMaximoSolicitacao(BigDecimal valorMaximoSolicitacao) {
    this.valorMaximoSolicitacao = valorMaximoSolicitacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{emprestimo_pessoal_response_valor_maximo_solicitacao_value}}}")
  @JsonProperty("valorMaximoSolicitacao")
  public BigDecimal getValorMaximoSolicitacao() {
    return valorMaximoSolicitacao;
  }
  public void setValorMaximoSolicitacao(BigDecimal valorMaximoSolicitacao) {
    this.valorMaximoSolicitacao = valorMaximoSolicitacao;
  }

  
  /**
   * {{{emprestimo_pessoal_response_numero_parcelas_value}}}
   **/
  public EmprestimoPessoalResponse numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{emprestimo_pessoal_response_numero_parcelas_value}}}")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{emprestimo_pessoal_response_valor_maximo_parcela_value}}}
   **/
  public EmprestimoPessoalResponse valorMaximoParcela(BigDecimal valorMaximoParcela) {
    this.valorMaximoParcela = valorMaximoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{emprestimo_pessoal_response_valor_maximo_parcela_value}}}")
  @JsonProperty("valorMaximoParcela")
  public BigDecimal getValorMaximoParcela() {
    return valorMaximoParcela;
  }
  public void setValorMaximoParcela(BigDecimal valorMaximoParcela) {
    this.valorMaximoParcela = valorMaximoParcela;
  }

  
  /**
   * {{{emprestimo_pessoal_response_data_primeira_parcela_value}}}
   **/
  public EmprestimoPessoalResponse dataPrimeiraParcela(String dataPrimeiraParcela) {
    this.dataPrimeiraParcela = dataPrimeiraParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{emprestimo_pessoal_response_data_primeira_parcela_value}}}")
  @JsonProperty("dataPrimeiraParcela")
  public String getDataPrimeiraParcela() {
    return dataPrimeiraParcela;
  }
  public void setDataPrimeiraParcela(String dataPrimeiraParcela) {
    this.dataPrimeiraParcela = dataPrimeiraParcela;
  }

  
  /**
   * {{{emprestimo_pessoal_response_periodo_taxa_value}}}
   **/
  public EmprestimoPessoalResponse periodoTaxa(String periodoTaxa) {
    this.periodoTaxa = periodoTaxa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{emprestimo_pessoal_response_periodo_taxa_value}}}")
  @JsonProperty("periodoTaxa")
  public String getPeriodoTaxa() {
    return periodoTaxa;
  }
  public void setPeriodoTaxa(String periodoTaxa) {
    this.periodoTaxa = periodoTaxa;
  }

  
  /**
   * {{{emprestimo_pessoal_response_sistema_amortizacao_value}}}
   **/
  public EmprestimoPessoalResponse sistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{emprestimo_pessoal_response_sistema_amortizacao_value}}}")
  @JsonProperty("sistemaAmortizacao")
  public String getSistemaAmortizacao() {
    return sistemaAmortizacao;
  }
  public void setSistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
  }

  
  /**
   * {{{emprestimo_pessoal_response_taxa_juros_value}}}
   **/
  public EmprestimoPessoalResponse taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{emprestimo_pessoal_response_taxa_juros_value}}}")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmprestimoPessoalResponse emprestimoPessoalResponse = (EmprestimoPessoalResponse) o;
    return Objects.equals(this.planosParcelamentos, emprestimoPessoalResponse.planosParcelamentos) &&
        Objects.equals(this.valorSolicitado, emprestimoPessoalResponse.valorSolicitado) &&
        Objects.equals(this.valorMaximoSolicitacao, emprestimoPessoalResponse.valorMaximoSolicitacao) &&
        Objects.equals(this.numeroParcelas, emprestimoPessoalResponse.numeroParcelas) &&
        Objects.equals(this.valorMaximoParcela, emprestimoPessoalResponse.valorMaximoParcela) &&
        Objects.equals(this.dataPrimeiraParcela, emprestimoPessoalResponse.dataPrimeiraParcela) &&
        Objects.equals(this.periodoTaxa, emprestimoPessoalResponse.periodoTaxa) &&
        Objects.equals(this.sistemaAmortizacao, emprestimoPessoalResponse.sistemaAmortizacao) &&
        Objects.equals(this.taxaJuros, emprestimoPessoalResponse.taxaJuros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planosParcelamentos, valorSolicitado, valorMaximoSolicitacao, numeroParcelas, valorMaximoParcela, dataPrimeiraParcela, periodoTaxa, sistemaAmortizacao, taxaJuros);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmprestimoPessoalResponse {\n");
    
    sb.append("    planosParcelamentos: ").append(toIndentedString(planosParcelamentos)).append("\n");
    sb.append("    valorSolicitado: ").append(toIndentedString(valorSolicitado)).append("\n");
    sb.append("    valorMaximoSolicitacao: ").append(toIndentedString(valorMaximoSolicitacao)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    valorMaximoParcela: ").append(toIndentedString(valorMaximoParcela)).append("\n");
    sb.append("    dataPrimeiraParcela: ").append(toIndentedString(dataPrimeiraParcela)).append("\n");
    sb.append("    periodoTaxa: ").append(toIndentedString(periodoTaxa)).append("\n");
    sb.append("    sistemaAmortizacao: ").append(toIndentedString(sistemaAmortizacao)).append("\n");
    sb.append("    taxaJuros: ").append(toIndentedString(taxaJuros)).append("\n");
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



