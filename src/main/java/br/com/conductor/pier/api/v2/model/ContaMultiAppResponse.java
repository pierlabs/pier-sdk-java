package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ContaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{conta_multi_response_description}}}
 **/

@ApiModel(description = "{{{conta_multi_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaMultiAppResponse   {
  
  private List<ContaResponse> contas = new ArrayList<ContaResponse>();

  
  /**
   * {{{conta_multi_response_contas_value}}}
   **/
  public ContaMultiAppResponse contas(List<ContaResponse> contas) {
    this.contas = contas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_multi_response_contas_value}}}")
  @JsonProperty("contas")
  public List<ContaResponse> getContas() {
    return contas;
  }
  public void setContas(List<ContaResponse> contas) {
    this.contas = contas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaMultiAppResponse contaMultiAppResponse = (ContaMultiAppResponse) o;
    return Objects.equals(this.contas, contaMultiAppResponse.contas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaMultiAppResponse {\n");
    
    sb.append("    contas: ").append(toIndentedString(contas)).append("\n");
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

