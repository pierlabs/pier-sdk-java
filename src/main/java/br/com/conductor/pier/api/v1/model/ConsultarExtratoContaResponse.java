package br.com.conductor.pier.api.v1.model;

import java.util.Objects;
import br.com.conductor.pier.api.v1.model.ExtratoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConsultarExtratoContaResponse   {
  
  private Integer codigoRetorno = null;
  private Double comprasNacionais = null;
  private String cpf = null;
  private Double creditosNacionais = null;
  private String dataVencimento = null;
  private Double debitosNacionais = null;
  private String descricaoRetorno = null;
  private List<ExtratoResponse> extrato = new ArrayList<ExtratoResponse>();
  private Integer idCartao = null;
  private Integer idConta = null;
  private Double multa = null;
  private Double pagamentos = null;
  private Double saldoAtualFinal = null;
  private Double saldoExtratoAnterior = null;
  private Double tarifasNacionais = null;
  private Double valorMinimoExtrato = null;

  
  /**
   **/
  public ConsultarExtratoContaResponse codigoRetorno(Integer codigoRetorno) {
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
  public ConsultarExtratoContaResponse comprasNacionais(Double comprasNacionais) {
    this.comprasNacionais = comprasNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("comprasNacionais")
  public Double getComprasNacionais() {
    return comprasNacionais;
  }
  public void setComprasNacionais(Double comprasNacionais) {
    this.comprasNacionais = comprasNacionais;
  }

  
  /**
   **/
  public ConsultarExtratoContaResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   **/
  public ConsultarExtratoContaResponse creditosNacionais(Double creditosNacionais) {
    this.creditosNacionais = creditosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("creditosNacionais")
  public Double getCreditosNacionais() {
    return creditosNacionais;
  }
  public void setCreditosNacionais(Double creditosNacionais) {
    this.creditosNacionais = creditosNacionais;
  }

  
  /**
   **/
  public ConsultarExtratoContaResponse dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataVencimento")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   **/
  public ConsultarExtratoContaResponse debitosNacionais(Double debitosNacionais) {
    this.debitosNacionais = debitosNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("debitosNacionais")
  public Double getDebitosNacionais() {
    return debitosNacionais;
  }
  public void setDebitosNacionais(Double debitosNacionais) {
    this.debitosNacionais = debitosNacionais;
  }

  
  /**
   **/
  public ConsultarExtratoContaResponse descricaoRetorno(String descricaoRetorno) {
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

  
  /**
   **/
  public ConsultarExtratoContaResponse extrato(List<ExtratoResponse> extrato) {
    this.extrato = extrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("extrato")
  public List<ExtratoResponse> getExtrato() {
    return extrato;
  }
  public void setExtrato(List<ExtratoResponse> extrato) {
    this.extrato = extrato;
  }

  
  /**
   **/
  public ConsultarExtratoContaResponse idCartao(Integer idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idCartao")
  public Integer getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Integer idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   **/
  public ConsultarExtratoContaResponse idConta(Integer idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idConta")
  public Integer getIdConta() {
    return idConta;
  }
  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  
  /**
   **/
  public ConsultarExtratoContaResponse multa(Double multa) {
    this.multa = multa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("multa")
  public Double getMulta() {
    return multa;
  }
  public void setMulta(Double multa) {
    this.multa = multa;
  }

  
  /**
   **/
  public ConsultarExtratoContaResponse pagamentos(Double pagamentos) {
    this.pagamentos = pagamentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pagamentos")
  public Double getPagamentos() {
    return pagamentos;
  }
  public void setPagamentos(Double pagamentos) {
    this.pagamentos = pagamentos;
  }

  
  /**
   **/
  public ConsultarExtratoContaResponse saldoAtualFinal(Double saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("saldoAtualFinal")
  public Double getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(Double saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   **/
  public ConsultarExtratoContaResponse saldoExtratoAnterior(Double saldoExtratoAnterior) {
    this.saldoExtratoAnterior = saldoExtratoAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("saldoExtratoAnterior")
  public Double getSaldoExtratoAnterior() {
    return saldoExtratoAnterior;
  }
  public void setSaldoExtratoAnterior(Double saldoExtratoAnterior) {
    this.saldoExtratoAnterior = saldoExtratoAnterior;
  }

  
  /**
   **/
  public ConsultarExtratoContaResponse tarifasNacionais(Double tarifasNacionais) {
    this.tarifasNacionais = tarifasNacionais;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tarifasNacionais")
  public Double getTarifasNacionais() {
    return tarifasNacionais;
  }
  public void setTarifasNacionais(Double tarifasNacionais) {
    this.tarifasNacionais = tarifasNacionais;
  }

  
  /**
   **/
  public ConsultarExtratoContaResponse valorMinimoExtrato(Double valorMinimoExtrato) {
    this.valorMinimoExtrato = valorMinimoExtrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorMinimoExtrato")
  public Double getValorMinimoExtrato() {
    return valorMinimoExtrato;
  }
  public void setValorMinimoExtrato(Double valorMinimoExtrato) {
    this.valorMinimoExtrato = valorMinimoExtrato;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultarExtratoContaResponse consultarExtratoContaResponse = (ConsultarExtratoContaResponse) o;
    return Objects.equals(this.codigoRetorno, consultarExtratoContaResponse.codigoRetorno) &&
        Objects.equals(this.comprasNacionais, consultarExtratoContaResponse.comprasNacionais) &&
        Objects.equals(this.cpf, consultarExtratoContaResponse.cpf) &&
        Objects.equals(this.creditosNacionais, consultarExtratoContaResponse.creditosNacionais) &&
        Objects.equals(this.dataVencimento, consultarExtratoContaResponse.dataVencimento) &&
        Objects.equals(this.debitosNacionais, consultarExtratoContaResponse.debitosNacionais) &&
        Objects.equals(this.descricaoRetorno, consultarExtratoContaResponse.descricaoRetorno) &&
        Objects.equals(this.extrato, consultarExtratoContaResponse.extrato) &&
        Objects.equals(this.idCartao, consultarExtratoContaResponse.idCartao) &&
        Objects.equals(this.idConta, consultarExtratoContaResponse.idConta) &&
        Objects.equals(this.multa, consultarExtratoContaResponse.multa) &&
        Objects.equals(this.pagamentos, consultarExtratoContaResponse.pagamentos) &&
        Objects.equals(this.saldoAtualFinal, consultarExtratoContaResponse.saldoAtualFinal) &&
        Objects.equals(this.saldoExtratoAnterior, consultarExtratoContaResponse.saldoExtratoAnterior) &&
        Objects.equals(this.tarifasNacionais, consultarExtratoContaResponse.tarifasNacionais) &&
        Objects.equals(this.valorMinimoExtrato, consultarExtratoContaResponse.valorMinimoExtrato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoRetorno, comprasNacionais, cpf, creditosNacionais, dataVencimento, debitosNacionais, descricaoRetorno, extrato, idCartao, idConta, multa, pagamentos, saldoAtualFinal, saldoExtratoAnterior, tarifasNacionais, valorMinimoExtrato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarExtratoContaResponse {\n");
    
    sb.append("    codigoRetorno: ").append(toIndentedString(codigoRetorno)).append("\n");
    sb.append("    comprasNacionais: ").append(toIndentedString(comprasNacionais)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    creditosNacionais: ").append(toIndentedString(creditosNacionais)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    debitosNacionais: ").append(toIndentedString(debitosNacionais)).append("\n");
    sb.append("    descricaoRetorno: ").append(toIndentedString(descricaoRetorno)).append("\n");
    sb.append("    extrato: ").append(toIndentedString(extrato)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    multa: ").append(toIndentedString(multa)).append("\n");
    sb.append("    pagamentos: ").append(toIndentedString(pagamentos)).append("\n");
    sb.append("    saldoAtualFinal: ").append(toIndentedString(saldoAtualFinal)).append("\n");
    sb.append("    saldoExtratoAnterior: ").append(toIndentedString(saldoExtratoAnterior)).append("\n");
    sb.append("    tarifasNacionais: ").append(toIndentedString(tarifasNacionais)).append("\n");
    sb.append("    valorMinimoExtrato: ").append(toIndentedString(valorMinimoExtrato)).append("\n");
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



