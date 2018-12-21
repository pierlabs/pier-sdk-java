package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Response Parameters of Fraud Risk
 **/

@ApiModel(description = "Response Parameters of Fraud Risk")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class RiskFraudResponse   {
  
  private Long id = null;
  private Long idTipoResolucao = null;
  private String descricaoTipoResolucao = null;
  private Boolean flagAltoRisco = null;
  private Long idConta = null;
  private Long idCartao = null;
  private Long idTransacao = null;
  private String dataTransacao = null;
  private BigDecimal valorTransacao = null;
  private String nomeEstabelecimento = null;

  
  /**
   * identification Code of the risk of Fraud
   **/
  public RiskFraudResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "identification Code of the risk of Fraud")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the type of resolution attributed to the register
   **/
  public RiskFraudResponse idTipoResolucao(Long idTipoResolucao) {
    this.idTipoResolucao = idTipoResolucao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the type of resolution attributed to the register")
  @JsonProperty("idTipoResolucao")
  public Long getIdTipoResolucao() {
    return idTipoResolucao;
  }
  public void setIdTipoResolucao(Long idTipoResolucao) {
    this.idTipoResolucao = idTipoResolucao;
  }

  
  /**
   * Description of the type of the resolution attributed to the register
   **/
  public RiskFraudResponse descricaoTipoResolucao(String descricaoTipoResolucao) {
    this.descricaoTipoResolucao = descricaoTipoResolucao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the type of the resolution attributed to the register")
  @JsonProperty("descricaoTipoResolucao")
  public String getDescricaoTipoResolucao() {
    return descricaoTipoResolucao;
  }
  public void setDescricaoTipoResolucao(String descricaoTipoResolucao) {
    this.descricaoTipoResolucao = descricaoTipoResolucao;
  }

  
  /**
   * When it is active, it indicates that a transaction has a great risk of fraud and all the following transactions will be denied until all the transactions ranked as a risk of fraud be analyzed
   **/
  public RiskFraudResponse flagAltoRisco(Boolean flagAltoRisco) {
    this.flagAltoRisco = flagAltoRisco;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "When it is active, it indicates that a transaction has a great risk of fraud and all the following transactions will be denied until all the transactions ranked as a risk of fraud be analyzed")
  @JsonProperty("flagAltoRisco")
  public Boolean getFlagAltoRisco() {
    return flagAltoRisco;
  }
  public void setFlagAltoRisco(Boolean flagAltoRisco) {
    this.flagAltoRisco = flagAltoRisco;
  }

  
  /**
   * Identification code of the account
   **/
  public RiskFraudResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification code of the account")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the Card
   **/
  public RiskFraudResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Card")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Identification Code of the transaction
   **/
  public RiskFraudResponse idTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the transaction")
  @JsonProperty("idTransacao")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * Date which the transaction ranked as a risk of fraud was made
   **/
  public RiskFraudResponse dataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date which the transaction ranked as a risk of fraud was made")
  @JsonProperty("dataTransacao")
  public String getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * Value of the transaction ranked as a risk of fraud
   **/
  public RiskFraudResponse valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the transaction ranked as a risk of fraud")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * Value of the transaction ranked as a risk of fraud
   **/
  public RiskFraudResponse nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the transaction ranked as a risk of fraud")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskFraudResponse riskFraudResponse = (RiskFraudResponse) o;
    return Objects.equals(this.id, riskFraudResponse.id) &&
        Objects.equals(this.idTipoResolucao, riskFraudResponse.idTipoResolucao) &&
        Objects.equals(this.descricaoTipoResolucao, riskFraudResponse.descricaoTipoResolucao) &&
        Objects.equals(this.flagAltoRisco, riskFraudResponse.flagAltoRisco) &&
        Objects.equals(this.idConta, riskFraudResponse.idConta) &&
        Objects.equals(this.idCartao, riskFraudResponse.idCartao) &&
        Objects.equals(this.idTransacao, riskFraudResponse.idTransacao) &&
        Objects.equals(this.dataTransacao, riskFraudResponse.dataTransacao) &&
        Objects.equals(this.valorTransacao, riskFraudResponse.valorTransacao) &&
        Objects.equals(this.nomeEstabelecimento, riskFraudResponse.nomeEstabelecimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoResolucao, descricaoTipoResolucao, flagAltoRisco, idConta, idCartao, idTransacao, dataTransacao, valorTransacao, nomeEstabelecimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskFraudResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoResolucao: ").append(toIndentedString(idTipoResolucao)).append("\n");
    sb.append("    descricaoTipoResolucao: ").append(toIndentedString(descricaoTipoResolucao)).append("\n");
    sb.append("    flagAltoRisco: ").append(toIndentedString(flagAltoRisco)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idTransacao: ").append(toIndentedString(idTransacao)).append("\n");
    sb.append("    dataTransacao: ").append(toIndentedString(dataTransacao)).append("\n");
    sb.append("    valorTransacao: ").append(toIndentedString(valorTransacao)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
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

