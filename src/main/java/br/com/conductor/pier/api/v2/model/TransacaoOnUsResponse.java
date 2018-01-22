package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.MapOfstringAndstring;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Objeto de Resposta de Autoriza\u00C3\u00A7\u00C3\u00A3o
 **/

@ApiModel(description = "Objeto de Resposta de Autoriza\u00C3\u00A7\u00C3\u00A3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransacaoOnUsResponse   {
  
  private String nsuOrigem = null;
  private String nsuAutorizacao = null;
  private List<MapOfstringAndstring> planoDeParcelamento = new ArrayList<MapOfstringAndstring>();
  private String codigoAutorizacao = null;
  private String numeroMascaradoCartao = null;
  private String nomePortadorCartao = null;
  private String terminalRequisitante = null;

  
  /**
   * N\u00C3\u00BAmero Sequencial \u00C3\u009Anico que identifica a transa\u00C3\u00A7\u00C3\u00A3o no sistema que a originou.
   **/
  public TransacaoOnUsResponse nsuOrigem(String nsuOrigem) {
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
   * N\u00C3\u00BAmero Sequencial \u00C3\u009Anico gerado pelo Autorizador a cada Transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransacaoOnUsResponse nsuAutorizacao(String nsuAutorizacao) {
    this.nsuAutorizacao = nsuAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero Sequencial \u00C3\u009Anico gerado pelo Autorizador a cada Transa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("nsuAutorizacao")
  public String getNsuAutorizacao() {
    return nsuAutorizacao;
  }
  public void setNsuAutorizacao(String nsuAutorizacao) {
    this.nsuAutorizacao = nsuAutorizacao;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do Plano de Parcelamento atribu\u00C3\u00ADdo a Transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransacaoOnUsResponse planoDeParcelamento(List<MapOfstringAndstring> planoDeParcelamento) {
    this.planoDeParcelamento = planoDeParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do Plano de Parcelamento atribu\u00C3\u00ADdo a Transa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("planoDeParcelamento")
  public List<MapOfstringAndstring> getPlanoDeParcelamento() {
    return planoDeParcelamento;
  }
  public void setPlanoDeParcelamento(List<MapOfstringAndstring> planoDeParcelamento) {
    this.planoDeParcelamento = planoDeParcelamento;
  }

  
  /**
   * C\u00C3\u00B3digo de Autoriza\u00C3\u00A7\u00C3\u00A3o gerado pelo Autorizador.
   **/
  public TransacaoOnUsResponse codigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Autoriza\u00C3\u00A7\u00C3\u00A3o gerado pelo Autorizador.")
  @JsonProperty("codigoAutorizacao")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * N\u00C3\u00BAmero do Cart\u00C3\u00A3o que originou a transa\u00C3\u00A7\u00C3\u00A3o em formato mascarado.
   **/
  public TransacaoOnUsResponse numeroMascaradoCartao(String numeroMascaradoCartao) {
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
   * Nome do Portador do Cart\u00C3\u00A3o que originou a transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TransacaoOnUsResponse nomePortadorCartao(String nomePortadorCartao) {
    this.nomePortadorCartao = nomePortadorCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Portador do Cart\u00C3\u00A3o que originou a transa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("nomePortadorCartao")
  public String getNomePortadorCartao() {
    return nomePortadorCartao;
  }
  public void setNomePortadorCartao(String nomePortadorCartao) {
    this.nomePortadorCartao = nomePortadorCartao;
  }

  
  /**
   * Apresenta a identifica\u00C3\u00A7\u00C3\u00A3o do terminal requisitante
   **/
  public TransacaoOnUsResponse terminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a identifica\u00C3\u00A7\u00C3\u00A3o do terminal requisitante")
  @JsonProperty("terminalRequisitante")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransacaoOnUsResponse transacaoOnUsResponse = (TransacaoOnUsResponse) o;
    return Objects.equals(this.nsuOrigem, transacaoOnUsResponse.nsuOrigem) &&
        Objects.equals(this.nsuAutorizacao, transacaoOnUsResponse.nsuAutorizacao) &&
        Objects.equals(this.planoDeParcelamento, transacaoOnUsResponse.planoDeParcelamento) &&
        Objects.equals(this.codigoAutorizacao, transacaoOnUsResponse.codigoAutorizacao) &&
        Objects.equals(this.numeroMascaradoCartao, transacaoOnUsResponse.numeroMascaradoCartao) &&
        Objects.equals(this.nomePortadorCartao, transacaoOnUsResponse.nomePortadorCartao) &&
        Objects.equals(this.terminalRequisitante, transacaoOnUsResponse.terminalRequisitante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsuOrigem, nsuAutorizacao, planoDeParcelamento, codigoAutorizacao, numeroMascaradoCartao, nomePortadorCartao, terminalRequisitante);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoOnUsResponse {\n");
    
    sb.append("    nsuOrigem: ").append(toIndentedString(nsuOrigem)).append("\n");
    sb.append("    nsuAutorizacao: ").append(toIndentedString(nsuAutorizacao)).append("\n");
    sb.append("    planoDeParcelamento: ").append(toIndentedString(planoDeParcelamento)).append("\n");
    sb.append("    codigoAutorizacao: ").append(toIndentedString(codigoAutorizacao)).append("\n");
    sb.append("    numeroMascaradoCartao: ").append(toIndentedString(numeroMascaradoCartao)).append("\n");
    sb.append("    nomePortadorCartao: ").append(toIndentedString(nomePortadorCartao)).append("\n");
    sb.append("    terminalRequisitante: ").append(toIndentedString(terminalRequisitante)).append("\n");
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

