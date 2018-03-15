package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BeneficioPagamentoAtrasoResponse   {
  
  private String dataBeneficio = null;

  
  /**
   * Data m\u00E1xima para pagamento da fatura em atraso para receber o benef\u00EDcio de isen\u00E7\u00E3o total no pagamento de multa, encargos, mora e IOF.
   **/
  public BeneficioPagamentoAtrasoResponse dataBeneficio(String dataBeneficio) {
    this.dataBeneficio = dataBeneficio;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data m\u00E1xima para pagamento da fatura em atraso para receber o benef\u00EDcio de isen\u00E7\u00E3o total no pagamento de multa, encargos, mora e IOF.")
  @JsonProperty("dataBeneficio")
  public String getDataBeneficio() {
    return dataBeneficio;
  }
  public void setDataBeneficio(String dataBeneficio) {
    this.dataBeneficio = dataBeneficio;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeneficioPagamentoAtrasoResponse beneficioPagamentoAtrasoResponse = (BeneficioPagamentoAtrasoResponse) o;
    return Objects.equals(this.dataBeneficio, beneficioPagamentoAtrasoResponse.dataBeneficio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataBeneficio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeneficioPagamentoAtrasoResponse {\n");
    
    sb.append("    dataBeneficio: ").append(toIndentedString(dataBeneficio)).append("\n");
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

