package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.PlanoParcelamentoTransferenciaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * Plano de Parcelamentos para Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias
 **/

@ApiModel(description = "Plano de Parcelamentos para Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoParcelamentoTransferenciaCreditoContaBancariaResponse   {
  
  private String nsuOrigem = null;
  private String numeroMascaradoCartao = null;
  private String terminalRequisitante = null;
  private List<PlanoParcelamentoTransferenciaResponse> planoParcelamentos = new ArrayList<PlanoParcelamentoTransferenciaResponse>();

  
  /**
   * N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema que a originou.
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse nsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema que a originou.")
  @JsonProperty("nsuOrigem")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * N\u00C3\u00BAmero do Cart\u00C3\u00A3o que originou a transa\u00C3\u00A7\u00C3\u00A3o em formato mascarado.
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse numeroMascaradoCartao(String numeroMascaradoCartao) {
    this.numeroMascaradoCartao = numeroMascaradoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do Cart\u00C3\u00A3o que originou a transa\u00C3\u00A7\u00C3\u00A3o em formato mascarado.")
  @JsonProperty("numeroMascaradoCartao")
  public String getNumeroMascaradoCartao() {
    return numeroMascaradoCartao;
  }
  public void setNumeroMascaradoCartao(String numeroMascaradoCartao) {
    this.numeroMascaradoCartao = numeroMascaradoCartao;
  }

  
  /**
   * Apresenta a identifica\u00C3\u00A7\u00C3\u00A3o do terminal requisitante
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse terminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a identifica\u00C3\u00A7\u00C3\u00A3o do terminal requisitante")
  @JsonProperty("terminalRequisitante")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * Lista os planos de parcelamentos
   **/
  public PlanoParcelamentoTransferenciaCreditoContaBancariaResponse planoParcelamentos(List<PlanoParcelamentoTransferenciaResponse> planoParcelamentos) {
    this.planoParcelamentos = planoParcelamentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista os planos de parcelamentos")
  @JsonProperty("planoParcelamentos")
  public List<PlanoParcelamentoTransferenciaResponse> getPlanoParcelamentos() {
    return planoParcelamentos;
  }
  public void setPlanoParcelamentos(List<PlanoParcelamentoTransferenciaResponse> planoParcelamentos) {
    this.planoParcelamentos = planoParcelamentos;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanoParcelamentoTransferenciaCreditoContaBancariaResponse planoParcelamentoTransferenciaCreditoContaBancariaResponse = (PlanoParcelamentoTransferenciaCreditoContaBancariaResponse) o;
    return Objects.equals(this.nsuOrigem, planoParcelamentoTransferenciaCreditoContaBancariaResponse.nsuOrigem) &&
        Objects.equals(this.numeroMascaradoCartao, planoParcelamentoTransferenciaCreditoContaBancariaResponse.numeroMascaradoCartao) &&
        Objects.equals(this.terminalRequisitante, planoParcelamentoTransferenciaCreditoContaBancariaResponse.terminalRequisitante) &&
        Objects.equals(this.planoParcelamentos, planoParcelamentoTransferenciaCreditoContaBancariaResponse.planoParcelamentos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuOrigem, numeroMascaradoCartao, terminalRequisitante, planoParcelamentos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoTransferenciaCreditoContaBancariaResponse {\n");
    
    sb.append("    nsuOrigem: ").append(toIndentedString(nsuOrigem)).append("\n");
    sb.append("    numeroMascaradoCartao: ").append(toIndentedString(numeroMascaradoCartao)).append("\n");
    sb.append("    terminalRequisitante: ").append(toIndentedString(terminalRequisitante)).append("\n");
    sb.append("    planoParcelamentos: ").append(toIndentedString(planoParcelamentos)).append("\n");
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



