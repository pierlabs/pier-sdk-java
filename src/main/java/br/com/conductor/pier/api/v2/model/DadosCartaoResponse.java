package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{dados_cartao_response_description}}}
 **/

@ApiModel(description = "{{{dados_cartao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DadosCartaoResponse   {
  
  private Integer flagVirtual = null;
  private String numeroCartao = null;
  private String dataValidade = null;
  private String cvv2 = null;
  private String nomePlastico = null;
  private Long idConta = null;
  private Long idCartao = null;
  private Integer numeroAgencia = null;
  private String numeroContaCorente = null;
  private Long idStatusConta = null;
  private String statusConta = null;
  private Long idStatusCartao = null;
  private String statusCartao = null;

  
  /**
   **/
  public DadosCartaoResponse flagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagVirtual")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * {{{dados_cartao_response_numero_cartao_value}}}
   **/
  public DadosCartaoResponse numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_response_numero_cartao_value}}}")
  @JsonProperty("numeroCartao")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{dados_cartao_response_data_validade_value}}}
   **/
  public DadosCartaoResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_response_data_validade_value}}}")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{dados_cartao_response_cvv2_value}}}
   **/
  public DadosCartaoResponse cvv2(String cvv2) {
    this.cvv2 = cvv2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_response_cvv2_value}}}")
  @JsonProperty("cvv2")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   * {{{dados_cartao_response_nome_plastico_value}}}
   **/
  public DadosCartaoResponse nomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_response_nome_plastico_value}}}")
  @JsonProperty("nomePlastico")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * {{{dados_cartao_response_id_conta_value}}}
   **/
  public DadosCartaoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{dados_cartao_response_id_cartao_value}}}
   **/
  public DadosCartaoResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_response_id_cartao_value}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{dados_cartao_response_numero_agencia_value}}}
   **/
  public DadosCartaoResponse numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_response_numero_agencia_value}}}")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{dados_cartao_response_numero_conta_corente_value}}}
   **/
  public DadosCartaoResponse numeroContaCorente(String numeroContaCorente) {
    this.numeroContaCorente = numeroContaCorente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_response_numero_conta_corente_value}}}")
  @JsonProperty("numeroContaCorente")
  public String getNumeroContaCorente() {
    return numeroContaCorente;
  }
  public void setNumeroContaCorente(String numeroContaCorente) {
    this.numeroContaCorente = numeroContaCorente;
  }

  
  /**
   * {{{dados_cartao_response_id_status_conta_value}}}
   **/
  public DadosCartaoResponse idStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_response_id_status_conta_value}}}")
  @JsonProperty("idStatusConta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * {{{dados_cartao_response_status_conta_value}}}
   **/
  public DadosCartaoResponse statusConta(String statusConta) {
    this.statusConta = statusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_response_status_conta_value}}}")
  @JsonProperty("statusConta")
  public String getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * {{{dados_cartao_response_id_status_cartao_value}}}
   **/
  public DadosCartaoResponse idStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_response_id_status_cartao_value}}}")
  @JsonProperty("idStatusCartao")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * {{{dados_cartao_response_status_cartao_value}}}
   **/
  public DadosCartaoResponse statusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{dados_cartao_response_status_cartao_value}}}")
  @JsonProperty("statusCartao")
  public String getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DadosCartaoResponse dadosCartaoResponse = (DadosCartaoResponse) o;
    return Objects.equals(this.flagVirtual, dadosCartaoResponse.flagVirtual) &&
        Objects.equals(this.numeroCartao, dadosCartaoResponse.numeroCartao) &&
        Objects.equals(this.dataValidade, dadosCartaoResponse.dataValidade) &&
        Objects.equals(this.cvv2, dadosCartaoResponse.cvv2) &&
        Objects.equals(this.nomePlastico, dadosCartaoResponse.nomePlastico) &&
        Objects.equals(this.idConta, dadosCartaoResponse.idConta) &&
        Objects.equals(this.idCartao, dadosCartaoResponse.idCartao) &&
        Objects.equals(this.numeroAgencia, dadosCartaoResponse.numeroAgencia) &&
        Objects.equals(this.numeroContaCorente, dadosCartaoResponse.numeroContaCorente) &&
        Objects.equals(this.idStatusConta, dadosCartaoResponse.idStatusConta) &&
        Objects.equals(this.statusConta, dadosCartaoResponse.statusConta) &&
        Objects.equals(this.idStatusCartao, dadosCartaoResponse.idStatusCartao) &&
        Objects.equals(this.statusCartao, dadosCartaoResponse.statusCartao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagVirtual, numeroCartao, dataValidade, cvv2, nomePlastico, idConta, idCartao, numeroAgencia, numeroContaCorente, idStatusConta, statusConta, idStatusCartao, statusCartao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCartaoResponse {\n");
    
    sb.append("    flagVirtual: ").append(toIndentedString(flagVirtual)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    cvv2: ").append(toIndentedString(cvv2)).append("\n");
    sb.append("    nomePlastico: ").append(toIndentedString(nomePlastico)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorente: ").append(toIndentedString(numeroContaCorente)).append("\n");
    sb.append("    idStatusConta: ").append(toIndentedString(idStatusConta)).append("\n");
    sb.append("    statusConta: ").append(toIndentedString(statusConta)).append("\n");
    sb.append("    idStatusCartao: ").append(toIndentedString(idStatusCartao)).append("\n");
    sb.append("    statusCartao: ").append(toIndentedString(statusCartao)).append("\n");
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

