package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * Objeto de requisi\u00E7\u00E3o do agendamento 
 **/

@ApiModel(description = "Objeto de requisi\u00E7\u00E3o do agendamento ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AgendamentoPersist   {
  
  private Integer tipoOperacao = null;
  private Integer tipoRecorrencia = null;
  private Integer quantidadeAgendamento = null;
  private Integer diaRecorrencia = null;
  private BigDecimal valor = null;
  private List<String> sort = new ArrayList<String>();

  
  /**
   * Tipo opera\u00E7\u00E3o 
   **/
  public AgendamentoPersist tipoOperacao(Integer tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo opera\u00E7\u00E3o ")
  @JsonProperty("tipoOperacao")
  public Integer getTipoOperacao() {
    return tipoOperacao;
  }
  public void setTipoOperacao(Integer tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  
  /**
   * Tipo Recorr\u00EAncia
   **/
  public AgendamentoPersist tipoRecorrencia(Integer tipoRecorrencia) {
    this.tipoRecorrencia = tipoRecorrencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo Recorr\u00EAncia")
  @JsonProperty("tipoRecorrencia")
  public Integer getTipoRecorrencia() {
    return tipoRecorrencia;
  }
  public void setTipoRecorrencia(Integer tipoRecorrencia) {
    this.tipoRecorrencia = tipoRecorrencia;
  }

  
  /**
   * Quantidade agendamento 
   **/
  public AgendamentoPersist quantidadeAgendamento(Integer quantidadeAgendamento) {
    this.quantidadeAgendamento = quantidadeAgendamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade agendamento ")
  @JsonProperty("quantidadeAgendamento")
  public Integer getQuantidadeAgendamento() {
    return quantidadeAgendamento;
  }
  public void setQuantidadeAgendamento(Integer quantidadeAgendamento) {
    this.quantidadeAgendamento = quantidadeAgendamento;
  }

  
  /**
   * Dia recorr\u00EAncia
   **/
  public AgendamentoPersist diaRecorrencia(Integer diaRecorrencia) {
    this.diaRecorrencia = diaRecorrencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dia recorr\u00EAncia")
  @JsonProperty("diaRecorrencia")
  public Integer getDiaRecorrencia() {
    return diaRecorrencia;
  }
  public void setDiaRecorrencia(Integer diaRecorrencia) {
    this.diaRecorrencia = diaRecorrencia;
  }

  
  /**
   * Valor Agendamento
   **/
  public AgendamentoPersist valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor Agendamento")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Tipo de ordena\u00E7\u00E3o dos registros
   **/
  public AgendamentoPersist sort(List<String> sort) {
    this.sort = sort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo de ordena\u00E7\u00E3o dos registros")
  @JsonProperty("sort")
  public List<String> getSort() {
    return sort;
  }
  public void setSort(List<String> sort) {
    this.sort = sort;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgendamentoPersist agendamentoPersist = (AgendamentoPersist) o;
    return Objects.equals(this.tipoOperacao, agendamentoPersist.tipoOperacao) &&
        Objects.equals(this.tipoRecorrencia, agendamentoPersist.tipoRecorrencia) &&
        Objects.equals(this.quantidadeAgendamento, agendamentoPersist.quantidadeAgendamento) &&
        Objects.equals(this.diaRecorrencia, agendamentoPersist.diaRecorrencia) &&
        Objects.equals(this.valor, agendamentoPersist.valor) &&
        Objects.equals(this.sort, agendamentoPersist.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoOperacao, tipoRecorrencia, quantidadeAgendamento, diaRecorrencia, valor, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgendamentoPersist {\n");
    
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    tipoRecorrencia: ").append(toIndentedString(tipoRecorrencia)).append("\n");
    sb.append("    quantidadeAgendamento: ").append(toIndentedString(quantidadeAgendamento)).append("\n");
    sb.append("    diaRecorrencia: ").append(toIndentedString(diaRecorrencia)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

