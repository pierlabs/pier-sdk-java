package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Objeto de resposta para a valida\u00C3\u00A7\u00C3\u00A3o de cart\u00C3\u00A3o
 **/

@ApiModel(description = "Objeto de resposta para a valida\u00C3\u00A7\u00C3\u00A3o de cart\u00C3\u00A3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ValidaCartao   {
  
  private String statusCartao = null;
  private String statusConta = null;
  private String criptogramaResposta = null;

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status do cart\u00C3\u00A3o
   **/
  public ValidaCartao statusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do status do cart\u00C3\u00A3o")
  @JsonProperty("statusCartao")
  public String getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status da conta
   **/
  public ValidaCartao statusConta(String statusConta) {
    this.statusConta = statusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do status da conta")
  @JsonProperty("statusConta")
  public String getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * Criptograma de resposta
   **/
  public ValidaCartao criptogramaResposta(String criptogramaResposta) {
    this.criptogramaResposta = criptogramaResposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Criptograma de resposta")
  @JsonProperty("criptogramaResposta")
  public String getCriptogramaResposta() {
    return criptogramaResposta;
  }
  public void setCriptogramaResposta(String criptogramaResposta) {
    this.criptogramaResposta = criptogramaResposta;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidaCartao validaCartao = (ValidaCartao) o;
    return Objects.equals(this.statusCartao, validaCartao.statusCartao) &&
        Objects.equals(this.statusConta, validaCartao.statusConta) &&
        Objects.equals(this.criptogramaResposta, validaCartao.criptogramaResposta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCartao, statusConta, criptogramaResposta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidaCartao {\n");
    
    sb.append("    statusCartao: ").append(toIndentedString(statusCartao)).append("\n");
    sb.append("    statusConta: ").append(toIndentedString(statusConta)).append("\n");
    sb.append("    criptogramaResposta: ").append(toIndentedString(criptogramaResposta)).append("\n");
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



