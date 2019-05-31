package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa o objeto de resposta de uma indica\u00E7\u00E3o
 **/

@ApiModel(description = "Representa o objeto de resposta de uma indica\u00E7\u00E3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class IndicacaoAmigoResponse   {
  
  private Long codigoIndicacao = null;
  private String cpfIndicado = null;
  private String dataIndicacao = null;
  private String dataUtilizacao = null;
  private String dataValidade = null;
  private String emailIndicado = null;
  private Long id = null;
  private Long idPessoa = null;
  private Integer status = null;

  
  /**
   * C\u00F3digo da indica\u00E7\u00E3o
   **/
  public IndicacaoAmigoResponse codigoIndicacao(Long codigoIndicacao) {
    this.codigoIndicacao = codigoIndicacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo da indica\u00E7\u00E3o")
  @JsonProperty("codigoIndicacao")
  public Long getCodigoIndicacao() {
    return codigoIndicacao;
  }
  public void setCodigoIndicacao(Long codigoIndicacao) {
    this.codigoIndicacao = codigoIndicacao;
  }

  
  /**
   * N\u00FAmero do CPF do amigo indicado
   **/
  public IndicacaoAmigoResponse cpfIndicado(String cpfIndicado) {
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
   * Data da indica\u00E7\u00E3o
   **/
  public IndicacaoAmigoResponse dataIndicacao(String dataIndicacao) {
    this.dataIndicacao = dataIndicacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da indica\u00E7\u00E3o")
  @JsonProperty("dataIndicacao")
  public String getDataIndicacao() {
    return dataIndicacao;
  }
  public void setDataIndicacao(String dataIndicacao) {
    this.dataIndicacao = dataIndicacao;
  }

  
  /**
   * Data da utiliza\u00E7\u00E3o
   **/
  public IndicacaoAmigoResponse dataUtilizacao(String dataUtilizacao) {
    this.dataUtilizacao = dataUtilizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da utiliza\u00E7\u00E3o")
  @JsonProperty("dataUtilizacao")
  public String getDataUtilizacao() {
    return dataUtilizacao;
  }
  public void setDataUtilizacao(String dataUtilizacao) {
    this.dataUtilizacao = dataUtilizacao;
  }

  
  /**
   * Data de validade da indica\u00E7\u00E3o
   **/
  public IndicacaoAmigoResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de validade da indica\u00E7\u00E3o")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Email do amigo indicado
   **/
  public IndicacaoAmigoResponse emailIndicado(String emailIndicado) {
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
   * C\u00F3digo identificador da indica\u00E7\u00E3o
   **/
  public IndicacaoAmigoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da indica\u00E7\u00E3o")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador da pessoa
   **/
  public IndicacaoAmigoResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da pessoa")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Status da indica\u00E7\u00E3o (1 - CRIADO, 2 - UTILIZADO, 3 - PAGO)
   **/
  public IndicacaoAmigoResponse status(Integer status) {
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
    IndicacaoAmigoResponse indicacaoAmigoResponse = (IndicacaoAmigoResponse) o;
    return Objects.equals(this.codigoIndicacao, indicacaoAmigoResponse.codigoIndicacao) &&
        Objects.equals(this.cpfIndicado, indicacaoAmigoResponse.cpfIndicado) &&
        Objects.equals(this.dataIndicacao, indicacaoAmigoResponse.dataIndicacao) &&
        Objects.equals(this.dataUtilizacao, indicacaoAmigoResponse.dataUtilizacao) &&
        Objects.equals(this.dataValidade, indicacaoAmigoResponse.dataValidade) &&
        Objects.equals(this.emailIndicado, indicacaoAmigoResponse.emailIndicado) &&
        Objects.equals(this.id, indicacaoAmigoResponse.id) &&
        Objects.equals(this.idPessoa, indicacaoAmigoResponse.idPessoa) &&
        Objects.equals(this.status, indicacaoAmigoResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoIndicacao, cpfIndicado, dataIndicacao, dataUtilizacao, dataValidade, emailIndicado, id, idPessoa, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicacaoAmigoResponse {\n");
    
    sb.append("    codigoIndicacao: ").append(toIndentedString(codigoIndicacao)).append("\n");
    sb.append("    cpfIndicado: ").append(toIndentedString(cpfIndicado)).append("\n");
    sb.append("    dataIndicacao: ").append(toIndentedString(dataIndicacao)).append("\n");
    sb.append("    dataUtilizacao: ").append(toIndentedString(dataUtilizacao)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    emailIndicado: ").append(toIndentedString(emailIndicado)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
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

