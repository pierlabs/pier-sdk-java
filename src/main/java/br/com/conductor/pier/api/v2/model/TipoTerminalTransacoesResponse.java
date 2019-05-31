package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Transa\u00E7\u00F5es pelo tipo de terminal
 **/

@ApiModel(description = "Transa\u00E7\u00F5es pelo tipo de terminal")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoTerminalTransacoesResponse   {
  
  private String codigoProcessamento = null;
  private Long conta = null;
  private String cpf = null;
  private String dataTransacao = null;
  private Long idConta = null;
  private Long idCartao = null;
  private String nomePortador = null;
  private Integer nsuEmissor = null;
  private Integer nsuOrigem = null;
  private Integer statusConta = null;
  private BigDecimal valorTransacao = null;

  
  /**
   * C\u00F3digo de processamento
   **/
  public TipoTerminalTransacoesResponse codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de processamento")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * Conta
   **/
  public TipoTerminalTransacoesResponse conta(Long conta) {
    this.conta = conta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conta")
  @JsonProperty("conta")
  public Long getConta() {
    return conta;
  }
  public void setConta(Long conta) {
    this.conta = conta;
  }

  
  /**
   * CPF
   **/
  public TipoTerminalTransacoesResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CPF")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Data da transa\u00E7\u00E3o
   **/
  public TipoTerminalTransacoesResponse dataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da transa\u00E7\u00E3o")
  @JsonProperty("dataTransacao")
  public String getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * Identificador da conta
   **/
  public TipoTerminalTransacoesResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identificador do cart\u00E3o
   **/
  public TipoTerminalTransacoesResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do cart\u00E3o")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Nome do portador do cart\u00E3o
   **/
  public TipoTerminalTransacoesResponse nomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do portador do cart\u00E3o")
  @JsonProperty("nomePortador")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * NSU Emissor
   **/
  public TipoTerminalTransacoesResponse nsuEmissor(Integer nsuEmissor) {
    this.nsuEmissor = nsuEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "NSU Emissor")
  @JsonProperty("nsuEmissor")
  public Integer getNsuEmissor() {
    return nsuEmissor;
  }
  public void setNsuEmissor(Integer nsuEmissor) {
    this.nsuEmissor = nsuEmissor;
  }

  
  /**
   * NSU Origem
   **/
  public TipoTerminalTransacoesResponse nsuOrigem(Integer nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "NSU Origem")
  @JsonProperty("nsuOrigem")
  public Integer getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(Integer nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * Status da conta
   **/
  public TipoTerminalTransacoesResponse statusConta(Integer statusConta) {
    this.statusConta = statusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status da conta")
  @JsonProperty("statusConta")
  public Integer getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(Integer statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o
   **/
  public TipoTerminalTransacoesResponse valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da transa\u00E7\u00E3o")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoTerminalTransacoesResponse tipoTerminalTransacoesResponse = (TipoTerminalTransacoesResponse) o;
    return Objects.equals(this.codigoProcessamento, tipoTerminalTransacoesResponse.codigoProcessamento) &&
        Objects.equals(this.conta, tipoTerminalTransacoesResponse.conta) &&
        Objects.equals(this.cpf, tipoTerminalTransacoesResponse.cpf) &&
        Objects.equals(this.dataTransacao, tipoTerminalTransacoesResponse.dataTransacao) &&
        Objects.equals(this.idConta, tipoTerminalTransacoesResponse.idConta) &&
        Objects.equals(this.idCartao, tipoTerminalTransacoesResponse.idCartao) &&
        Objects.equals(this.nomePortador, tipoTerminalTransacoesResponse.nomePortador) &&
        Objects.equals(this.nsuEmissor, tipoTerminalTransacoesResponse.nsuEmissor) &&
        Objects.equals(this.nsuOrigem, tipoTerminalTransacoesResponse.nsuOrigem) &&
        Objects.equals(this.statusConta, tipoTerminalTransacoesResponse.statusConta) &&
        Objects.equals(this.valorTransacao, tipoTerminalTransacoesResponse.valorTransacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoProcessamento, conta, cpf, dataTransacao, idConta, idCartao, nomePortador, nsuEmissor, nsuOrigem, statusConta, valorTransacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoTerminalTransacoesResponse {\n");
    
    sb.append("    codigoProcessamento: ").append(toIndentedString(codigoProcessamento)).append("\n");
    sb.append("    conta: ").append(toIndentedString(conta)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    dataTransacao: ").append(toIndentedString(dataTransacao)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    nomePortador: ").append(toIndentedString(nomePortador)).append("\n");
    sb.append("    nsuEmissor: ").append(toIndentedString(nsuEmissor)).append("\n");
    sb.append("    nsuOrigem: ").append(toIndentedString(nsuOrigem)).append("\n");
    sb.append("    statusConta: ").append(toIndentedString(statusConta)).append("\n");
    sb.append("    valorTransacao: ").append(toIndentedString(valorTransacao)).append("\n");
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

