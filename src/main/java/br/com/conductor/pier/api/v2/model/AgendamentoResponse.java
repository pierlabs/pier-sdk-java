package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Classe AgendamentoResponse
 **/

@ApiModel(description = "Classe AgendamentoResponse")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AgendamentoResponse   {
  
  private Long idAgendamento = null;
  private String dataCriacao = null;
  private Integer idConta = null;
  private Integer tipoOperacao = null;
  private Integer tipoRecorrencia = null;
  private Integer quantidadeAgendamento = null;
  private Integer diaRecorrencia = null;
  private BigDecimal valor = null;
  private Integer status = null;

  
  /**
   * ID do Agendamento criado
   **/
  public AgendamentoResponse idAgendamento(Long idAgendamento) {
    this.idAgendamento = idAgendamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID do Agendamento criado")
  @JsonProperty("idAgendamento")
  public Long getIdAgendamento() {
    return idAgendamento;
  }
  public void setIdAgendamento(Long idAgendamento) {
    this.idAgendamento = idAgendamento;
  }

  
  /**
   * Data de Cria\u00E7\u00E3o do Agendamento
   **/
  public AgendamentoResponse dataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de Cria\u00E7\u00E3o do Agendamento")
  @JsonProperty("dataCriacao")
  public String getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  
  /**
   * ID da Conta do Portador
   **/
  public AgendamentoResponse idConta(Integer idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID da Conta do Portador")
  @JsonProperty("idConta")
  public Integer getIdConta() {
    return idConta;
  }
  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  
  /**
   * ID da Conta do Portador
   **/
  public AgendamentoResponse tipoOperacao(Integer tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID da Conta do Portador")
  @JsonProperty("tipoOperacao")
  public Integer getTipoOperacao() {
    return tipoOperacao;
  }
  public void setTipoOperacao(Integer tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  
  /**
   * Tipo de Recorrencia da Recarga (Mensal, Diaria, etc)
   **/
  public AgendamentoResponse tipoRecorrencia(Integer tipoRecorrencia) {
    this.tipoRecorrencia = tipoRecorrencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo de Recorrencia da Recarga (Mensal, Diaria, etc)")
  @JsonProperty("tipoRecorrencia")
  public Integer getTipoRecorrencia() {
    return tipoRecorrencia;
  }
  public void setTipoRecorrencia(Integer tipoRecorrencia) {
    this.tipoRecorrencia = tipoRecorrencia;
  }

  
  /**
   * Quantidade que este agendamento ser\u00E1 repetido
   **/
  public AgendamentoResponse quantidadeAgendamento(Integer quantidadeAgendamento) {
    this.quantidadeAgendamento = quantidadeAgendamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade que este agendamento ser\u00E1 repetido")
  @JsonProperty("quantidadeAgendamento")
  public Integer getQuantidadeAgendamento() {
    return quantidadeAgendamento;
  }
  public void setQuantidadeAgendamento(Integer quantidadeAgendamento) {
    this.quantidadeAgendamento = quantidadeAgendamento;
  }

  
  /**
   * Dia de recorrencia deste agendamento
   **/
  public AgendamentoResponse diaRecorrencia(Integer diaRecorrencia) {
    this.diaRecorrencia = diaRecorrencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dia de recorrencia deste agendamento")
  @JsonProperty("diaRecorrencia")
  public Integer getDiaRecorrencia() {
    return diaRecorrencia;
  }
  public void setDiaRecorrencia(Integer diaRecorrencia) {
    this.diaRecorrencia = diaRecorrencia;
  }

  
  /**
   * Valor do agendamento
   **/
  public AgendamentoResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do agendamento")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Status atual do Agendamento
   **/
  public AgendamentoResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status atual do Agendamento")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgendamentoResponse agendamentoResponse = (AgendamentoResponse) o;
    return Objects.equals(this.idAgendamento, agendamentoResponse.idAgendamento) &&
        Objects.equals(this.dataCriacao, agendamentoResponse.dataCriacao) &&
        Objects.equals(this.idConta, agendamentoResponse.idConta) &&
        Objects.equals(this.tipoOperacao, agendamentoResponse.tipoOperacao) &&
        Objects.equals(this.tipoRecorrencia, agendamentoResponse.tipoRecorrencia) &&
        Objects.equals(this.quantidadeAgendamento, agendamentoResponse.quantidadeAgendamento) &&
        Objects.equals(this.diaRecorrencia, agendamentoResponse.diaRecorrencia) &&
        Objects.equals(this.valor, agendamentoResponse.valor) &&
        Objects.equals(this.status, agendamentoResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAgendamento, dataCriacao, idConta, tipoOperacao, tipoRecorrencia, quantidadeAgendamento, diaRecorrencia, valor, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgendamentoResponse {\n");
    
    sb.append("    idAgendamento: ").append(toIndentedString(idAgendamento)).append("\n");
    sb.append("    dataCriacao: ").append(toIndentedString(dataCriacao)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    tipoRecorrencia: ").append(toIndentedString(tipoRecorrencia)).append("\n");
    sb.append("    quantidadeAgendamento: ").append(toIndentedString(quantidadeAgendamento)).append("\n");
    sb.append("    diaRecorrencia: ").append(toIndentedString(diaRecorrencia)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

