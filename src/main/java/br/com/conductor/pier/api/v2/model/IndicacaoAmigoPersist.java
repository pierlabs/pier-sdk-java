package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa um objeto para cadastrar uma nova indica\u00E7\u00E3o
 **/

@ApiModel(description = "Representa um objeto para cadastrar uma nova indica\u00E7\u00E3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class IndicacaoAmigoPersist   {
  
  private String dataValidade = null;
  private String cpfIndicado = null;
  private String emailIndicado = null;
  private Integer status = null;

  
  /**
   * Data de validade da indica\u00E7\u00E3o
   **/
  public IndicacaoAmigoPersist dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", required = true, value = "Data de validade da indica\u00E7\u00E3o")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * N\u00FAmero do CPF do amigo indicado
   **/
  public IndicacaoAmigoPersist cpfIndicado(String cpfIndicado) {
    this.cpfIndicado = cpfIndicado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do CPF do amigo indicado")
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
  public IndicacaoAmigoPersist emailIndicado(String emailIndicado) {
    this.emailIndicado = emailIndicado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email do amigo indicado")
  @JsonProperty("emailIndicado")
  public String getEmailIndicado() {
    return emailIndicado;
  }
  public void setEmailIndicado(String emailIndicado) {
    this.emailIndicado = emailIndicado;
  }

  
  /**
   * Status da indica\u00E7\u00E3o (1 - CRIADO, 2 - UTILIZADO, 3 - PAGO)
   **/
  public IndicacaoAmigoPersist status(Integer status) {
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
    IndicacaoAmigoPersist indicacaoAmigoPersist = (IndicacaoAmigoPersist) o;
    return Objects.equals(this.dataValidade, indicacaoAmigoPersist.dataValidade) &&
        Objects.equals(this.cpfIndicado, indicacaoAmigoPersist.cpfIndicado) &&
        Objects.equals(this.emailIndicado, indicacaoAmigoPersist.emailIndicado) &&
        Objects.equals(this.status, indicacaoAmigoPersist.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataValidade, cpfIndicado, emailIndicado, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicacaoAmigoPersist {\n");
    
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    cpfIndicado: ").append(toIndentedString(cpfIndicado)).append("\n");
    sb.append("    emailIndicado: ").append(toIndentedString(emailIndicado)).append("\n");
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

