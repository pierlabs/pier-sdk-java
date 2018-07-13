package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.MapOfstringAndstring;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * {{{transacao_on_us_response_description}}}
 **/

@ApiModel(description = "{{{transacao_on_us_response_description}}}")
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
   * {{{transacao_on_us_response_nsu_origem_value}}}
   **/
  public TransacaoOnUsResponse nsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_on_us_response_nsu_origem_value}}}")
  @JsonProperty("nsuOrigem")
  public String getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(String nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * {{{transacao_on_us_response_nsu_autorizacao_value}}}
   **/
  public TransacaoOnUsResponse nsuAutorizacao(String nsuAutorizacao) {
    this.nsuAutorizacao = nsuAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_on_us_response_nsu_autorizacao_value}}}")
  @JsonProperty("nsuAutorizacao")
  public String getNsuAutorizacao() {
    return nsuAutorizacao;
  }
  public void setNsuAutorizacao(String nsuAutorizacao) {
    this.nsuAutorizacao = nsuAutorizacao;
  }

  
  /**
   * {{{transacao_on_us_response_plano_de_parcelamento_value}}}
   **/
  public TransacaoOnUsResponse planoDeParcelamento(List<MapOfstringAndstring> planoDeParcelamento) {
    this.planoDeParcelamento = planoDeParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_on_us_response_plano_de_parcelamento_value}}}")
  @JsonProperty("planoDeParcelamento")
  public List<MapOfstringAndstring> getPlanoDeParcelamento() {
    return planoDeParcelamento;
  }
  public void setPlanoDeParcelamento(List<MapOfstringAndstring> planoDeParcelamento) {
    this.planoDeParcelamento = planoDeParcelamento;
  }

  
  /**
   * {{{transacao_on_us_response_codigo_autorizacao_value}}}
   **/
  public TransacaoOnUsResponse codigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_on_us_response_codigo_autorizacao_value}}}")
  @JsonProperty("codigoAutorizacao")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * {{{transacao_on_us_response_numero_mascarado_cartao_value}}}
   **/
  public TransacaoOnUsResponse numeroMascaradoCartao(String numeroMascaradoCartao) {
    this.numeroMascaradoCartao = numeroMascaradoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_on_us_response_numero_mascarado_cartao_value}}}")
  @JsonProperty("numeroMascaradoCartao")
  public String getNumeroMascaradoCartao() {
    return numeroMascaradoCartao;
  }
  public void setNumeroMascaradoCartao(String numeroMascaradoCartao) {
    this.numeroMascaradoCartao = numeroMascaradoCartao;
  }

  
  /**
   * {{{transacao_on_us_response_nome_portador_cartao_value}}}
   **/
  public TransacaoOnUsResponse nomePortadorCartao(String nomePortadorCartao) {
    this.nomePortadorCartao = nomePortadorCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_on_us_response_nome_portador_cartao_value}}}")
  @JsonProperty("nomePortadorCartao")
  public String getNomePortadorCartao() {
    return nomePortadorCartao;
  }
  public void setNomePortadorCartao(String nomePortadorCartao) {
    this.nomePortadorCartao = nomePortadorCartao;
  }

  
  /**
   * {{{transacao_on_us_response_terminal_requisitante_value}}}
   **/
  public TransacaoOnUsResponse terminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{transacao_on_us_response_terminal_requisitante_value}}}")
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



