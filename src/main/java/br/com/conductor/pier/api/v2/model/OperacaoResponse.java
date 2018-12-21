package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Response Representation of the operation resource
 **/

@ApiModel(description = "Response Representation of the operation resource")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OperacaoResponse   {
  
  private Long idOperacao = null;
  private String codigoProcessamento = null;
  private String codigoProcessamentoCancelamento = null;
  private String nomeOperacao = null;
  private Boolean flagCobraJuros = null;
  private Boolean flagCobraTarifa = null;
  private Integer carencia = null;
  private Boolean flagPermitirParcelamento = null;
  private Boolean flagManterTaxaJurosNoRotativo = null;

  
  /**
   * Code that identifies the operation
   **/
  public OperacaoResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Code that identifies the operation")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Processing Code used in transaction with the authorizer
   **/
  public OperacaoResponse codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Processing Code used in transaction with the authorizer")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * Processing Code used to cancel transactions in the authorizer
   **/
  public OperacaoResponse codigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Processing Code used to cancel transactions in the authorizer")
  @JsonProperty("codigoProcessamentoCancelamento")
  public String getCodigoProcessamentoCancelamento() {
    return codigoProcessamentoCancelamento;
  }
  public void setCodigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
  }

  
  /**
   * Operation name
   **/
  public OperacaoResponse nomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Operation name")
  @JsonProperty("nomeOperacao")
  public String getNomeOperacao() {
    return nomeOperacao;
  }
  public void setNomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
  }

  
  /**
   * Flag indicative for the charge of interest
   **/
  public OperacaoResponse flagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicative for the charge of interest")
  @JsonProperty("flagCobraJuros")
  public Boolean getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   * Flag indicative for the charge of taxes
   **/
  public OperacaoResponse flagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicative for the charge of taxes")
  @JsonProperty("flagCobraTarifa")
  public Boolean getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * Quantity of months for the Lack
   **/
  public OperacaoResponse carencia(Integer carencia) {
    this.carencia = carencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantity of months for the Lack")
  @JsonProperty("carencia")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   * Allow parceled transactions
   **/
  public OperacaoResponse flagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Allow parceled transactions")
  @JsonProperty("flagPermitirParcelamento")
  public Boolean getFlagPermitirParcelamento() {
    return flagPermitirParcelamento;
  }
  public void setFlagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
  }

  
  /**
   * Boolean that signals to all transactions of this operation type must use the purchase interest rate as the due balance interest rate
   **/
  public OperacaoResponse flagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Boolean that signals to all transactions of this operation type must use the purchase interest rate as the due balance interest rate")
  @JsonProperty("flagManterTaxaJurosNoRotativo")
  public Boolean getFlagManterTaxaJurosNoRotativo() {
    return flagManterTaxaJurosNoRotativo;
  }
  public void setFlagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperacaoResponse operacaoResponse = (OperacaoResponse) o;
    return Objects.equals(this.idOperacao, operacaoResponse.idOperacao) &&
        Objects.equals(this.codigoProcessamento, operacaoResponse.codigoProcessamento) &&
        Objects.equals(this.codigoProcessamentoCancelamento, operacaoResponse.codigoProcessamentoCancelamento) &&
        Objects.equals(this.nomeOperacao, operacaoResponse.nomeOperacao) &&
        Objects.equals(this.flagCobraJuros, operacaoResponse.flagCobraJuros) &&
        Objects.equals(this.flagCobraTarifa, operacaoResponse.flagCobraTarifa) &&
        Objects.equals(this.carencia, operacaoResponse.carencia) &&
        Objects.equals(this.flagPermitirParcelamento, operacaoResponse.flagPermitirParcelamento) &&
        Objects.equals(this.flagManterTaxaJurosNoRotativo, operacaoResponse.flagManterTaxaJurosNoRotativo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOperacao, codigoProcessamento, codigoProcessamentoCancelamento, nomeOperacao, flagCobraJuros, flagCobraTarifa, carencia, flagPermitirParcelamento, flagManterTaxaJurosNoRotativo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoResponse {\n");
    
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
    sb.append("    codigoProcessamento: ").append(toIndentedString(codigoProcessamento)).append("\n");
    sb.append("    codigoProcessamentoCancelamento: ").append(toIndentedString(codigoProcessamentoCancelamento)).append("\n");
    sb.append("    nomeOperacao: ").append(toIndentedString(nomeOperacao)).append("\n");
    sb.append("    flagCobraJuros: ").append(toIndentedString(flagCobraJuros)).append("\n");
    sb.append("    flagCobraTarifa: ").append(toIndentedString(flagCobraTarifa)).append("\n");
    sb.append("    carencia: ").append(toIndentedString(carencia)).append("\n");
    sb.append("    flagPermitirParcelamento: ").append(toIndentedString(flagPermitirParcelamento)).append("\n");
    sb.append("    flagManterTaxaJurosNoRotativo: ").append(toIndentedString(flagManterTaxaJurosNoRotativo)).append("\n");
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

