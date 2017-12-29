package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Operacao
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Operacao")
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

  
  /**
   * C\u00C3\u00B3digo que identifica a opera\u00C3\u00A7\u00C3\u00A3o
   **/
  public OperacaoResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo que identifica a opera\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * C\u00C3\u00B3digo de processamento usado em transa\u00C3\u00A7\u00C3\u00B5es com o autorizador
   **/
  public OperacaoResponse codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de processamento usado em transa\u00C3\u00A7\u00C3\u00B5es com o autorizador")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * C\u00C3\u00B3digo de processamento usado para cancelar transa\u00C3\u00A7\u00C3\u00B5es no autorizador
   **/
  public OperacaoResponse codigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de processamento usado para cancelar transa\u00C3\u00A7\u00C3\u00B5es no autorizador")
  @JsonProperty("codigoProcessamentoCancelamento")
  public String getCodigoProcessamentoCancelamento() {
    return codigoProcessamentoCancelamento;
  }
  public void setCodigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
  }

  
  /**
   * Nome da opera\u00C3\u00A7\u00C3\u00A3o
   **/
  public OperacaoResponse nomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da opera\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("nomeOperacao")
  public String getNomeOperacao() {
    return nomeOperacao;
  }
  public void setNomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
  }

  
  /**
   * Flag indicativa para crobran\u00C3\u00A7a de juros
   **/
  public OperacaoResponse flagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicativa para crobran\u00C3\u00A7a de juros")
  @JsonProperty("flagCobraJuros")
  public Boolean getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   * Flag indicativa para crobran\u00C3\u00A7a de tarifas
   **/
  public OperacaoResponse flagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicativa para crobran\u00C3\u00A7a de tarifas")
  @JsonProperty("flagCobraTarifa")
  public Boolean getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * Quantidade de meses para car\u00C3\u00AAncia
   **/
  public OperacaoResponse carencia(Integer carencia) {
    this.carencia = carencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de meses para car\u00C3\u00AAncia")
  @JsonProperty("carencia")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   * Permitir transa\u00C3\u00A7\u00C3\u00B5es parceladas
   **/
  public OperacaoResponse flagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Permitir transa\u00C3\u00A7\u00C3\u00B5es parceladas")
  @JsonProperty("flagPermitirParcelamento")
  public Boolean getFlagPermitirParcelamento() {
    return flagPermitirParcelamento;
  }
  public void setFlagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
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
        Objects.equals(this.flagPermitirParcelamento, operacaoResponse.flagPermitirParcelamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOperacao, codigoProcessamento, codigoProcessamentoCancelamento, nomeOperacao, flagCobraJuros, flagCobraTarifa, carencia, flagPermitirParcelamento);
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

