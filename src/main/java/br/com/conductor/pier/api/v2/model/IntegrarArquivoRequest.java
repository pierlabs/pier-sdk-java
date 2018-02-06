package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de requisi\u00C3\u00A7\u00C3\u00A3o da integra\u00C3\u00A7\u00C3\u00A3o de Arquivos.
 **/

@ApiModel(description = "Objeto de requisi\u00C3\u00A7\u00C3\u00A3o da integra\u00C3\u00A7\u00C3\u00A3o de Arquivos.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class IntegrarArquivoRequest   {
  
  private String cpf = null;

  
  /**
   * CPF do cliente de Arquivos a serem integrados
   **/
  public IntegrarArquivoRequest cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CPF do cliente de Arquivos a serem integrados")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrarArquivoRequest integrarArquivoRequest = (IntegrarArquivoRequest) o;
    return Objects.equals(this.cpf, integrarArquivoRequest.cpf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrarArquivoRequest {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
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

