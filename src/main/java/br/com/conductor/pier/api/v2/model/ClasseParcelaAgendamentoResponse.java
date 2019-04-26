package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * ParcelaAgendamentoResponse
 **/

@ApiModel(description = "ParcelaAgendamentoResponse")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ClasseParcelaAgendamentoResponse   {
  
  private Long idParcela = null;
  private Integer idAgendamento = null;
  private String dataAgendada = null;
  private String dataEfetivacao = null;
  private Integer status = null;
  private String observacao = null;

  
  /**
   * ID da Parcela agendada
   **/
  public ClasseParcelaAgendamentoResponse idParcela(Long idParcela) {
    this.idParcela = idParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID da Parcela agendada")
  @JsonProperty("idParcela")
  public Long getIdParcela() {
    return idParcela;
  }
  public void setIdParcela(Long idParcela) {
    this.idParcela = idParcela;
  }

  
  /**
   * ID do Agendamento que a parcela pertence
   **/
  public ClasseParcelaAgendamentoResponse idAgendamento(Integer idAgendamento) {
    this.idAgendamento = idAgendamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID do Agendamento que a parcela pertence")
  @JsonProperty("idAgendamento")
  public Integer getIdAgendamento() {
    return idAgendamento;
  }
  public void setIdAgendamento(Integer idAgendamento) {
    this.idAgendamento = idAgendamento;
  }

  
  /**
   * Data que ser\u00E1 realizada a recarga
   **/
  public ClasseParcelaAgendamentoResponse dataAgendada(String dataAgendada) {
    this.dataAgendada = dataAgendada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data que ser\u00E1 realizada a recarga")
  @JsonProperty("dataAgendada")
  public String getDataAgendada() {
    return dataAgendada;
  }
  public void setDataAgendada(String dataAgendada) {
    this.dataAgendada = dataAgendada;
  }

  
  /**
   * Data que foi realizada a recarga
   **/
  public ClasseParcelaAgendamentoResponse dataEfetivacao(String dataEfetivacao) {
    this.dataEfetivacao = dataEfetivacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data que foi realizada a recarga")
  @JsonProperty("dataEfetivacao")
  public String getDataEfetivacao() {
    return dataEfetivacao;
  }
  public void setDataEfetivacao(String dataEfetivacao) {
    this.dataEfetivacao = dataEfetivacao;
  }

  
  /**
   * Status da parcela 
   **/
  public ClasseParcelaAgendamentoResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status da parcela ")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Observacoes caso ocorra alteracao do status
   **/
  public ClasseParcelaAgendamentoResponse observacao(String observacao) {
    this.observacao = observacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Observacoes caso ocorra alteracao do status")
  @JsonProperty("observacao")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClasseParcelaAgendamentoResponse classeParcelaAgendamentoResponse = (ClasseParcelaAgendamentoResponse) o;
    return Objects.equals(this.idParcela, classeParcelaAgendamentoResponse.idParcela) &&
        Objects.equals(this.idAgendamento, classeParcelaAgendamentoResponse.idAgendamento) &&
        Objects.equals(this.dataAgendada, classeParcelaAgendamentoResponse.dataAgendada) &&
        Objects.equals(this.dataEfetivacao, classeParcelaAgendamentoResponse.dataEfetivacao) &&
        Objects.equals(this.status, classeParcelaAgendamentoResponse.status) &&
        Objects.equals(this.observacao, classeParcelaAgendamentoResponse.observacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idParcela, idAgendamento, dataAgendada, dataEfetivacao, status, observacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClasseParcelaAgendamentoResponse {\n");
    
    sb.append("    idParcela: ").append(toIndentedString(idParcela)).append("\n");
    sb.append("    idAgendamento: ").append(toIndentedString(idAgendamento)).append("\n");
    sb.append("    dataAgendada: ").append(toIndentedString(dataAgendada)).append("\n");
    sb.append("    dataEfetivacao: ").append(toIndentedString(dataEfetivacao)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    observacao: ").append(toIndentedString(observacao)).append("\n");
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

