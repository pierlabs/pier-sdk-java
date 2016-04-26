package br.com.conductor.caas.api.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConsultarCartaoResponse   {
  
  private Integer codigoRetorno = null;
  private String cvv2 = null;
  private String dataValidade = null;
  private String descricaoRetorno = null;
  private Integer idCartao = null;
  private Integer idConta = null;
  private String nomePortador = null;
  private String numCartao = null;
  private Double saldoDisponivel = null;
  private Integer statusCartao = null;
  private Integer statusConta = null;

  
  /**
   **/
  public ConsultarCartaoResponse codigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("codigoRetorno")
  public Integer getCodigoRetorno() {
    return codigoRetorno;
  }
  public void setCodigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
  }

  
  /**
   **/
  public ConsultarCartaoResponse cvv2(String cvv2) {
    this.cvv2 = cvv2;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("cvv2")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   **/
  public ConsultarCartaoResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   **/
  public ConsultarCartaoResponse descricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("descricaoRetorno")
  public String getDescricaoRetorno() {
    return descricaoRetorno;
  }
  public void setDescricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
  }

  
  /**
   **/
  public ConsultarCartaoResponse idCartao(Integer idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("idCartao")
  public Integer getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Integer idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   **/
  public ConsultarCartaoResponse idConta(Integer idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("idConta")
  public Integer getIdConta() {
    return idConta;
  }
  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  
  /**
   **/
  public ConsultarCartaoResponse nomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("nomePortador")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   **/
  public ConsultarCartaoResponse numCartao(String numCartao) {
    this.numCartao = numCartao;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("numCartao")
  public String getNumCartao() {
    return numCartao;
  }
  public void setNumCartao(String numCartao) {
    this.numCartao = numCartao;
  }

  
  /**
   **/
  public ConsultarCartaoResponse saldoDisponivel(Double saldoDisponivel) {
    this.saldoDisponivel = saldoDisponivel;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("saldoDisponivel")
  public Double getSaldoDisponivel() {
    return saldoDisponivel;
  }
  public void setSaldoDisponivel(Double saldoDisponivel) {
    this.saldoDisponivel = saldoDisponivel;
  }

  
  /**
   **/
  public ConsultarCartaoResponse statusCartao(Integer statusCartao) {
    this.statusCartao = statusCartao;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("statusCartao")
  public Integer getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(Integer statusCartao) {
    this.statusCartao = statusCartao;
  }

  
  /**
   **/
  public ConsultarCartaoResponse statusConta(Integer statusConta) {
    this.statusConta = statusConta;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("statusConta")
  public Integer getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(Integer statusConta) {
    this.statusConta = statusConta;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultarCartaoResponse consultarCartaoResponse = (ConsultarCartaoResponse) o;
    return Objects.equals(this.codigoRetorno, consultarCartaoResponse.codigoRetorno) &&
        Objects.equals(this.cvv2, consultarCartaoResponse.cvv2) &&
        Objects.equals(this.dataValidade, consultarCartaoResponse.dataValidade) &&
        Objects.equals(this.descricaoRetorno, consultarCartaoResponse.descricaoRetorno) &&
        Objects.equals(this.idCartao, consultarCartaoResponse.idCartao) &&
        Objects.equals(this.idConta, consultarCartaoResponse.idConta) &&
        Objects.equals(this.nomePortador, consultarCartaoResponse.nomePortador) &&
        Objects.equals(this.numCartao, consultarCartaoResponse.numCartao) &&
        Objects.equals(this.saldoDisponivel, consultarCartaoResponse.saldoDisponivel) &&
        Objects.equals(this.statusCartao, consultarCartaoResponse.statusCartao) &&
        Objects.equals(this.statusConta, consultarCartaoResponse.statusConta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoRetorno, cvv2, dataValidade, descricaoRetorno, idCartao, idConta, nomePortador, numCartao, saldoDisponivel, statusCartao, statusConta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarCartaoResponse {\n");
    
    sb.append("    codigoRetorno: ").append(toIndentedString(codigoRetorno)).append("\n");
    sb.append("    cvv2: ").append(toIndentedString(cvv2)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    descricaoRetorno: ").append(toIndentedString(descricaoRetorno)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    nomePortador: ").append(toIndentedString(nomePortador)).append("\n");
    sb.append("    numCartao: ").append(toIndentedString(numCartao)).append("\n");
    sb.append("    saldoDisponivel: ").append(toIndentedString(saldoDisponivel)).append("\n");
    sb.append("    statusCartao: ").append(toIndentedString(statusCartao)).append("\n");
    sb.append("    statusConta: ").append(toIndentedString(statusConta)).append("\n");
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



