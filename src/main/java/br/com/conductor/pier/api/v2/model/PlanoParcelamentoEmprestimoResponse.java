package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{plano_parcelamento_emprestimo_response_description}}}
 **/

@ApiModel(description = "{{{plano_parcelamento_emprestimo_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoParcelamentoEmprestimoResponse   {
  
  private Integer numeroParcelas = null;
  private BigDecimal valorParcelas = null;
  private BigDecimal taxaJuros = null;
  private BigDecimal valorTributosIOF = null;
  private BigDecimal valorPercentualCET = null;

  
  /**
   * {{{plano_parcelamento_emprestimo_response_numero_parcelas_value}}}
   **/
  public PlanoParcelamentoEmprestimoResponse numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_emprestimo_response_numero_parcelas_value}}}")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{plano_parcelamento_emprestimo_response_valor_parcelas_value}}}
   **/
  public PlanoParcelamentoEmprestimoResponse valorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_emprestimo_response_valor_parcelas_value}}}")
  @JsonProperty("valorParcelas")
  public BigDecimal getValorParcelas() {
    return valorParcelas;
  }
  public void setValorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
  }

  
  /**
   * {{{plano_parcelamento_emprestimo_response_taxa_juros_value}}}
   **/
  public PlanoParcelamentoEmprestimoResponse taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_emprestimo_response_taxa_juros_value}}}")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * {{{plano_parcelamento_emprestimo_response_valor_tributos_i_o_f_value}}}
   **/
  public PlanoParcelamentoEmprestimoResponse valorTributosIOF(BigDecimal valorTributosIOF) {
    this.valorTributosIOF = valorTributosIOF;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_emprestimo_response_valor_tributos_i_o_f_value}}}")
  @JsonProperty("valorTributosIOF")
  public BigDecimal getValorTributosIOF() {
    return valorTributosIOF;
  }
  public void setValorTributosIOF(BigDecimal valorTributosIOF) {
    this.valorTributosIOF = valorTributosIOF;
  }

  
  /**
   * {{{plano_parcelamento_emprestimo_response_valor_percentual_c_e_t_value}}}
   **/
  public PlanoParcelamentoEmprestimoResponse valorPercentualCET(BigDecimal valorPercentualCET) {
    this.valorPercentualCET = valorPercentualCET;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_emprestimo_response_valor_percentual_c_e_t_value}}}")
  @JsonProperty("valorPercentualCET")
  public BigDecimal getValorPercentualCET() {
    return valorPercentualCET;
  }
  public void setValorPercentualCET(BigDecimal valorPercentualCET) {
    this.valorPercentualCET = valorPercentualCET;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanoParcelamentoEmprestimoResponse planoParcelamentoEmprestimoResponse = (PlanoParcelamentoEmprestimoResponse) o;
    return Objects.equals(this.numeroParcelas, planoParcelamentoEmprestimoResponse.numeroParcelas) &&
        Objects.equals(this.valorParcelas, planoParcelamentoEmprestimoResponse.valorParcelas) &&
        Objects.equals(this.taxaJuros, planoParcelamentoEmprestimoResponse.taxaJuros) &&
        Objects.equals(this.valorTributosIOF, planoParcelamentoEmprestimoResponse.valorTributosIOF) &&
        Objects.equals(this.valorPercentualCET, planoParcelamentoEmprestimoResponse.valorPercentualCET);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroParcelas, valorParcelas, taxaJuros, valorTributosIOF, valorPercentualCET);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoEmprestimoResponse {\n");
    
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
    sb.append("    valorParcelas: ").append(toIndentedString(valorParcelas)).append("\n");
    sb.append("    taxaJuros: ").append(toIndentedString(taxaJuros)).append("\n");
    sb.append("    valorTributosIOF: ").append(toIndentedString(valorTributosIOF)).append("\n");
    sb.append("    valorPercentualCET: ").append(toIndentedString(valorPercentualCET)).append("\n");
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



