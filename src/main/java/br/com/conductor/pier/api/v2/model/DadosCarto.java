package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





/**
 * Objeto Dados Cart\u00C3\u00A3o
 **/

@ApiModel(description = "Objeto Dados Cart\u00C3\u00A3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DadosCarto   {
  
  private String numeroCartao = null;
  private Date dataValidade = null;
  private String cvv2 = null;
  private String nomePlastico = null;
  private Long idConta = null;
  private Long idCartao = null;
  private Long status = null;
  private String statusDescricao = null;
  private Integer flagProvisorio = null;

  
  /**
   * N\u00C3\u00BAmero do cart\u00C3\u00A3o.
   **/
  public DadosCarto numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do cart\u00C3\u00A3o.")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Data de validade.
   **/
  public DadosCarto dataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de validade.")
  @JsonProperty("dataValidade")
  public Date getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * CVV2 do cart\u00C3\u00A3o.
   **/
  public DadosCarto cvv2(String cvv2) {
    this.cvv2 = cvv2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CVV2 do cart\u00C3\u00A3o.")
  @JsonProperty("cvv2")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   * Nome do portador.
   **/
  public DadosCarto nomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do portador.")
  @JsonProperty("nomePlastico")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * Identificador da conta do portador.
   **/
  public DadosCarto idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da conta do portador.")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identificador da cart\u00C3\u00A3o do portador.
   **/
  public DadosCarto idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da cart\u00C3\u00A3o do portador.")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Status da conta do portador.
   **/
  public DadosCarto status(Long status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status da conta do portador.")
  @JsonProperty("status")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status da conta do portador.
   **/
  public DadosCarto statusDescricao(String statusDescricao) {
    this.statusDescricao = statusDescricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do status da conta do portador.")
  @JsonProperty("statusDescricao")
  public String getStatusDescricao() {
    return statusDescricao;
  }
  public void setStatusDescricao(String statusDescricao) {
    this.statusDescricao = statusDescricao;
  }

  
  /**
   * Flag de verifica\u00C3\u00A7\u00C3\u00A3o se o cart\u00C3\u00A3o \u00C3\u00A9 provis\u00C3\u00B3rio.
   **/
  public DadosCarto flagProvisorio(Integer flagProvisorio) {
    this.flagProvisorio = flagProvisorio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag de verifica\u00C3\u00A7\u00C3\u00A3o se o cart\u00C3\u00A3o \u00C3\u00A9 provis\u00C3\u00B3rio.")
  @JsonProperty("flagProvisorio")
  public Integer getFlagProvisorio() {
    return flagProvisorio;
  }
  public void setFlagProvisorio(Integer flagProvisorio) {
    this.flagProvisorio = flagProvisorio;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadosCarto dadosCarto = (DadosCarto) o;
    return Objects.equals(this.numeroCartao, dadosCarto.numeroCartao) &&
        Objects.equals(this.dataValidade, dadosCarto.dataValidade) &&
        Objects.equals(this.cvv2, dadosCarto.cvv2) &&
        Objects.equals(this.nomePlastico, dadosCarto.nomePlastico) &&
        Objects.equals(this.idConta, dadosCarto.idConta) &&
        Objects.equals(this.idCartao, dadosCarto.idCartao) &&
        Objects.equals(this.status, dadosCarto.status) &&
        Objects.equals(this.statusDescricao, dadosCarto.statusDescricao) &&
        Objects.equals(this.flagProvisorio, dadosCarto.flagProvisorio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroCartao, dataValidade, cvv2, nomePlastico, idConta, idCartao, status, statusDescricao, flagProvisorio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCarto {\n");
    
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    cvv2: ").append(toIndentedString(cvv2)).append("\n");
    sb.append("    nomePlastico: ").append(toIndentedString(nomePlastico)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescricao: ").append(toIndentedString(statusDescricao)).append("\n");
    sb.append("    flagProvisorio: ").append(toIndentedString(flagProvisorio)).append("\n");
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



