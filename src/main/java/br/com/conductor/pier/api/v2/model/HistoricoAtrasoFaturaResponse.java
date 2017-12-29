package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Hist\u00C3\u00B3rico Pagamento Fatura Atraso
 **/

@ApiModel(description = "Hist\u00C3\u00B3rico Pagamento Fatura Atraso")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class HistoricoAtrasoFaturaResponse   {
  
  private String dataVencimento = null;
  private Long diasPagamentoAposVencimento = null;

  
  /**
   * Data vencimento fatura.
   **/
  public HistoricoAtrasoFaturaResponse dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data vencimento fatura.")
  @JsonProperty("dataVencimento")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Quantidade de dias em atraso.
   **/
  public HistoricoAtrasoFaturaResponse diasPagamentoAposVencimento(Long diasPagamentoAposVencimento) {
    this.diasPagamentoAposVencimento = diasPagamentoAposVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de dias em atraso.")
  @JsonProperty("diasPagamentoAposVencimento")
  public Long getDiasPagamentoAposVencimento() {
    return diasPagamentoAposVencimento;
  }
  public void setDiasPagamentoAposVencimento(Long diasPagamentoAposVencimento) {
    this.diasPagamentoAposVencimento = diasPagamentoAposVencimento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricoAtrasoFaturaResponse historicoAtrasoFaturaResponse = (HistoricoAtrasoFaturaResponse) o;
    return Objects.equals(this.dataVencimento, historicoAtrasoFaturaResponse.dataVencimento) &&
        Objects.equals(this.diasPagamentoAposVencimento, historicoAtrasoFaturaResponse.diasPagamentoAposVencimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataVencimento, diasPagamentoAposVencimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoAtrasoFaturaResponse {\n");
    
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    diasPagamentoAposVencimento: ").append(toIndentedString(diasPagamentoAposVencimento)).append("\n");
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

