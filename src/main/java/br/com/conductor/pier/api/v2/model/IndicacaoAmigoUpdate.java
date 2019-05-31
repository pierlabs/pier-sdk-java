package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa um objeto para atualizar uma indica\u00E7\u00E3o
 **/

@ApiModel(description = "Representa um objeto para atualizar uma indica\u00E7\u00E3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class IndicacaoAmigoUpdate   {
  
  private String cpfIndicado = null;
  private String emailIndicado = null;
  private String dataUtilizacao = null;
  private Integer status = null;

  
  /**
   * N\u00FAmero do CPF do amigo indicado
   **/
  public IndicacaoAmigoUpdate cpfIndicado(String cpfIndicado) {
    this.cpfIndicado = cpfIndicado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "N\u00FAmero do CPF do amigo indicado")
  @JsonProperty("cpfIndicado")
  public String getCpfIndicado() {
    return cpfIndicado;
  }
  public void setCpfIndicado(String cpfIndicado) {
    this.cpfIndicado = cpfIndicado;
  }

  
  /**
   * Email do amigo indicado
   **/
  public IndicacaoAmigoUpdate emailIndicado(String emailIndicado) {
    this.emailIndicado = emailIndicado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Email do amigo indicado")
  @JsonProperty("emailIndicado")
  public String getEmailIndicado() {
    return emailIndicado;
  }
  public void setEmailIndicado(String emailIndicado) {
    this.emailIndicado = emailIndicado;
  }

  
  /**
   * Data da utiliza\u00E7\u00E3o
   **/
  public IndicacaoAmigoUpdate dataUtilizacao(String dataUtilizacao) {
    this.dataUtilizacao = dataUtilizacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data da utiliza\u00E7\u00E3o")
  @JsonProperty("dataUtilizacao")
  public String getDataUtilizacao() {
    return dataUtilizacao;
  }
  public void setDataUtilizacao(String dataUtilizacao) {
    this.dataUtilizacao = dataUtilizacao;
  }

  
  /**
   * Status da indica\u00E7\u00E3o (1 - CRIADO, 2 - UTILIZADO, 3 - PAGO)
   **/
  public IndicacaoAmigoUpdate status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status da indica\u00E7\u00E3o (1 - CRIADO, 2 - UTILIZADO, 3 - PAGO)")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndicacaoAmigoUpdate indicacaoAmigoUpdate = (IndicacaoAmigoUpdate) o;
    return Objects.equals(this.cpfIndicado, indicacaoAmigoUpdate.cpfIndicado) &&
        Objects.equals(this.emailIndicado, indicacaoAmigoUpdate.emailIndicado) &&
        Objects.equals(this.dataUtilizacao, indicacaoAmigoUpdate.dataUtilizacao) &&
        Objects.equals(this.status, indicacaoAmigoUpdate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpfIndicado, emailIndicado, dataUtilizacao, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicacaoAmigoUpdate {\n");
    
    sb.append("    cpfIndicado: ").append(toIndentedString(cpfIndicado)).append("\n");
    sb.append("    emailIndicado: ").append(toIndentedString(emailIndicado)).append("\n");
    sb.append("    dataUtilizacao: ").append(toIndentedString(dataUtilizacao)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

