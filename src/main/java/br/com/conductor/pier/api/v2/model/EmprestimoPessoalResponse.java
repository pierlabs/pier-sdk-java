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
 * Resposta do recurso de simular empr\u00C3\u00A9stimos/financiamentos
 **/

@ApiModel(description = "Resposta do recurso de simular empr\u00C3\u00A9stimos/financiamentos")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EmprestimoPessoalResponse   {
  
  private List<PlanoParcelamentoEmprestimoResponse> planosParcelamentos = new ArrayList<PlanoParcelamentoEmprestimoResponse>();
  private BigDecimal valorSolicitado = null;
  private BigDecimal valorTotal = null;
  private String sistemaAmortizacao = null;
  private String periodoTaxa = null;
  private String dataPrimeiraParcela = null;

  
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
   * Valor solicitado do empr\u00C3\u00A9stimo/financiamento
   **/
  public EmprestimoPessoalResponse valorSolicitado(BigDecimal valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor solicitado do empr\u00C3\u00A9stimo/financiamento")
  @JsonProperty("valorSolicitado")
  public BigDecimal getValorSolicitado() {
    return valorSolicitado;
  }
  public void setValorSolicitado(BigDecimal valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
  }

  
  /**
   * Valor total do empr\u00C3\u00A9stimo/financiamento
   **/
  public EmprestimoPessoalResponse valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total do empr\u00C3\u00A9stimo/financiamento")
  @JsonProperty("valorTotal")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * Sistema para amortiza\u00C3\u00A7\u00C3\u00A3o do valor das parcelas
   **/
  public EmprestimoPessoalResponse sistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sistema para amortiza\u00C3\u00A7\u00C3\u00A3o do valor das parcelas")
  @JsonProperty("sistemaAmortizacao")
  public String getSistemaAmortizacao() {
    return sistemaAmortizacao;
  }
  public void setSistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
  }

  
  /**
   * Per\u00C3\u00ADodo de aplica da taxa de juros
   **/
  public EmprestimoPessoalResponse periodoTaxa(String periodoTaxa) {
    this.periodoTaxa = periodoTaxa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Per\u00C3\u00ADodo de aplica da taxa de juros")
  @JsonProperty("periodoTaxa")
  public String getPeriodoTaxa() {
    return periodoTaxa;
  }
  public void setPeriodoTaxa(String periodoTaxa) {
    this.periodoTaxa = periodoTaxa;
  }

  
  /**
   * Data da primeira parcela do empr\u00C3\u00A9stimo/financiamento
   **/
  public EmprestimoPessoalResponse dataPrimeiraParcela(String dataPrimeiraParcela) {
    this.dataPrimeiraParcela = dataPrimeiraParcela;
    return this;
  }
  
  @ApiModelProperty(example = "2017-10-20", value = "Data da primeira parcela do empr\u00C3\u00A9stimo/financiamento")
  @JsonProperty("dataPrimeiraParcela")
  public String getDataPrimeiraParcela() {
    return dataPrimeiraParcela;
  }
  public void setDataPrimeiraParcela(String dataPrimeiraParcela) {
    this.dataPrimeiraParcela = dataPrimeiraParcela;
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
        Objects.equals(this.valorTotal, emprestimoPessoalResponse.valorTotal) &&
        Objects.equals(this.sistemaAmortizacao, emprestimoPessoalResponse.sistemaAmortizacao) &&
        Objects.equals(this.periodoTaxa, emprestimoPessoalResponse.periodoTaxa) &&
        Objects.equals(this.dataPrimeiraParcela, emprestimoPessoalResponse.dataPrimeiraParcela);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planosParcelamentos, valorSolicitado, valorTotal, sistemaAmortizacao, periodoTaxa, dataPrimeiraParcela);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmprestimoPessoalResponse {\n");
    
    sb.append("    planosParcelamentos: ").append(toIndentedString(planosParcelamentos)).append("\n");
    sb.append("    valorSolicitado: ").append(toIndentedString(valorSolicitado)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    sistemaAmortizacao: ").append(toIndentedString(sistemaAmortizacao)).append("\n");
    sb.append("    periodoTaxa: ").append(toIndentedString(periodoTaxa)).append("\n");
    sb.append("    dataPrimeiraParcela: ").append(toIndentedString(dataPrimeiraParcela)).append("\n");
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



