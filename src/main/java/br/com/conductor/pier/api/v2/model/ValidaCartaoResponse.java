package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{valida_cartao_response_description}}}
 **/

@ApiModel(description = "{{{valida_cartao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ValidaCartaoResponse   {
  
  private Long idStatusCartao = null;
  private String statusCartao = null;
  private Long idStatusConta = null;
  private String statusConta = null;
  private Long idConta = null;
  private Integer numeroAgencia = null;
  private String numeroContaCorrente = null;
  private String criptogramaResposta = null;

  
  /**
   * {{{valida_cartao_response_id_status_cartao_value}}}
   **/
  public ValidaCartaoResponse idStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{valida_cartao_response_id_status_cartao_value}}}")
  @JsonProperty("idStatusCartao")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * {{{valida_cartao_response_status_cartao_value}}}
   **/
  public ValidaCartaoResponse statusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{valida_cartao_response_status_cartao_value}}}")
  @JsonProperty("statusCartao")
  public String getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
  }

  
  /**
   * {{{valida_cartao_response_id_status_conta_value}}}
   **/
  public ValidaCartaoResponse idStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{valida_cartao_response_id_status_conta_value}}}")
  @JsonProperty("idStatusConta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * {{{valida_cartao_response_status_conta_value}}}
   **/
  public ValidaCartaoResponse statusConta(String statusConta) {
    this.statusConta = statusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{valida_cartao_response_status_conta_value}}}")
  @JsonProperty("statusConta")
  public String getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * {{{valida_cartao_response_id_conta_value}}}
   **/
  public ValidaCartaoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{valida_cartao_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{valida_cartao_response_numero_agencia_value}}}
   **/
  public ValidaCartaoResponse numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{valida_cartao_response_numero_agencia_value}}}")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{valida_cartao_response_numero_conta_corrente_value}}}
   **/
  public ValidaCartaoResponse numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{valida_cartao_response_numero_conta_corrente_value}}}")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{valida_cartao_response_criptograma_resposta_value}}}
   **/
  public ValidaCartaoResponse criptogramaResposta(String criptogramaResposta) {
    this.criptogramaResposta = criptogramaResposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{valida_cartao_response_criptograma_resposta_value}}}")
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
    ValidaCartaoResponse validaCartaoResponse = (ValidaCartaoResponse) o;
    return Objects.equals(this.idStatusCartao, validaCartaoResponse.idStatusCartao) &&
        Objects.equals(this.statusCartao, validaCartaoResponse.statusCartao) &&
        Objects.equals(this.idStatusConta, validaCartaoResponse.idStatusConta) &&
        Objects.equals(this.statusConta, validaCartaoResponse.statusConta) &&
        Objects.equals(this.idConta, validaCartaoResponse.idConta) &&
        Objects.equals(this.numeroAgencia, validaCartaoResponse.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, validaCartaoResponse.numeroContaCorrente) &&
        Objects.equals(this.criptogramaResposta, validaCartaoResponse.criptogramaResposta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idStatusCartao, statusCartao, idStatusConta, statusConta, idConta, numeroAgencia, numeroContaCorrente, criptogramaResposta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidaCartaoResponse {\n");
    
    sb.append("    idStatusCartao: ").append(toIndentedString(idStatusCartao)).append("\n");
    sb.append("    statusCartao: ").append(toIndentedString(statusCartao)).append("\n");
    sb.append("    idStatusConta: ").append(toIndentedString(idStatusConta)).append("\n");
    sb.append("    statusConta: ").append(toIndentedString(statusConta)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorrente: ").append(toIndentedString(numeroContaCorrente)).append("\n");
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



