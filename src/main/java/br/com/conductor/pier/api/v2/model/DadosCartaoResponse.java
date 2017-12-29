package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Dados Cart\u00C3\u00A3o
 **/

@ApiModel(description = "Objeto Dados Cart\u00C3\u00A3o")
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
   * N\u00C3\u00BAmero do cart\u00C3\u00A3o.
   **/
  public DadosCartaoResponse numeroCartao(String numeroCartao) {
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
  public DadosCartaoResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de validade.")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * CVV2 do cart\u00C3\u00A3o.
   **/
  public DadosCartaoResponse cvv2(String cvv2) {
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
  public DadosCartaoResponse nomePlastico(String nomePlastico) {
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
  public DadosCartaoResponse idConta(Long idConta) {
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
  public DadosCartaoResponse idCartao(Long idCartao) {
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
   * Apresenta o n\u00C3\u00BAmero da Ag\u00C3\u00AAncia a ser impresso no Cart\u00C3\u00A3o, quando aplic\u00C3\u00A1vel.
   **/
  public DadosCartaoResponse numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00C3\u00BAmero da Ag\u00C3\u00AAncia a ser impresso no Cart\u00C3\u00A3o, quando aplic\u00C3\u00A1vel.")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Apresenta o n\u00C3\u00BAmero da Conta Corrente a ser impresso no Cart\u00C3\u00A3o, quando aplic\u00C3\u00A1vel.
   **/
  public DadosCartaoResponse numeroContaCorente(String numeroContaCorente) {
    this.numeroContaCorente = numeroContaCorente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o n\u00C3\u00BAmero da Conta Corrente a ser impresso no Cart\u00C3\u00A3o, quando aplic\u00C3\u00A1vel.")
  @JsonProperty("numeroContaCorente")
  public String getNumeroContaCorente() {
    return numeroContaCorente;
  }
  public void setNumeroContaCorente(String numeroContaCorente) {
    this.numeroContaCorente = numeroContaCorente;
  }

  
  /**
   * Status da conta do portador.
   **/
  public DadosCartaoResponse idStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status da conta do portador.")
  @JsonProperty("idStatusConta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status da conta do portador.
   **/
  public DadosCartaoResponse statusConta(String statusConta) {
    this.statusConta = statusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do status da conta do portador.")
  @JsonProperty("statusConta")
  public String getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * Status do cart\u00C3\u00A3o.
   **/
  public DadosCartaoResponse idStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status do cart\u00C3\u00A3o.")
  @JsonProperty("idStatusCartao")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status do cart\u00C3\u00A3o.
   **/
  public DadosCartaoResponse statusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do status do cart\u00C3\u00A3o.")
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

