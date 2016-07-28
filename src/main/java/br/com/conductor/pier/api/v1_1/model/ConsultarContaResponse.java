package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import br.com.conductor.pier.api.v1_1.model.ContaCartaoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConsultarContaResponse   {
  
  private Integer codRetorno = null;
  private Integer codigoRetorno = null;
  private List<ContaCartaoResponse> contas = new ArrayList<ContaCartaoResponse>();
  private String descricaoRetorno = null;

  
  /**
   **/
  public ConsultarContaResponse codRetorno(Integer codRetorno) {
    this.codRetorno = codRetorno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codRetorno")
  public Integer getCodRetorno() {
    return codRetorno;
  }
  public void setCodRetorno(Integer codRetorno) {
    this.codRetorno = codRetorno;
  }

  
  /**
   **/
  public ConsultarContaResponse codigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codigoRetorno")
  public Integer getCodigoRetorno() {
    return codigoRetorno;
  }
  public void setCodigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
  }

  
  /**
   **/
  public ConsultarContaResponse contas(List<ContaCartaoResponse> contas) {
    this.contas = contas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contas")
  public List<ContaCartaoResponse> getContas() {
    return contas;
  }
  public void setContas(List<ContaCartaoResponse> contas) {
    this.contas = contas;
  }

  
  /**
   **/
  public ConsultarContaResponse descricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("descricaoRetorno")
  public String getDescricaoRetorno() {
    return descricaoRetorno;
  }
  public void setDescricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultarContaResponse consultarContaResponse = (ConsultarContaResponse) o;
    return Objects.equals(this.codRetorno, consultarContaResponse.codRetorno) &&
        Objects.equals(this.codigoRetorno, consultarContaResponse.codigoRetorno) &&
        Objects.equals(this.contas, consultarContaResponse.contas) &&
        Objects.equals(this.descricaoRetorno, consultarContaResponse.descricaoRetorno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codRetorno, codigoRetorno, contas, descricaoRetorno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarContaResponse {\n");
    
    sb.append("    codRetorno: ").append(toIndentedString(codRetorno)).append("\n");
    sb.append("    codigoRetorno: ").append(toIndentedString(codigoRetorno)).append("\n");
    sb.append("    contas: ").append(toIndentedString(contas)).append("\n");
    sb.append("    descricaoRetorno: ").append(toIndentedString(descricaoRetorno)).append("\n");
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



