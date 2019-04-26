package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o de resposta do recurso de controle de limites
 **/

@ApiModel(description = "Representa\u00E7\u00E3o de resposta do recurso de controle de limites")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ControleLimiteCartaoResponse   {
  
  private Long id = null;
  private Long idCartao = null;
  private BigDecimal limiteMensal = null;
  private BigDecimal saldoDisponivelMensal = null;
  private BigDecimal limiteSemanal = null;
  private BigDecimal saldoDisponivelSemanal = null;
  private BigDecimal limiteDiario = null;
  private BigDecimal saldoDisponivelDiario = null;
  private String dataHoraUltimaCompra = null;
  private Boolean ativo = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do controle de limites (id)
   **/
  public ControleLimiteCartaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do controle de limites (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Id do cart\u00E3o
   **/
  public ControleLimiteCartaoResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do cart\u00E3o")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Valor do limite mensal
   **/
  public ControleLimiteCartaoResponse limiteMensal(BigDecimal limiteMensal) {
    this.limiteMensal = limiteMensal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite mensal")
  @JsonProperty("limiteMensal")
  public BigDecimal getLimiteMensal() {
    return limiteMensal;
  }
  public void setLimiteMensal(BigDecimal limiteMensal) {
    this.limiteMensal = limiteMensal;
  }

  
  /**
   * Valor dispon\u00EDvel que o cart\u00E3o ainda pode gastar no m\u00EAs
   **/
  public ControleLimiteCartaoResponse saldoDisponivelMensal(BigDecimal saldoDisponivelMensal) {
    this.saldoDisponivelMensal = saldoDisponivelMensal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor dispon\u00EDvel que o cart\u00E3o ainda pode gastar no m\u00EAs")
  @JsonProperty("saldoDisponivelMensal")
  public BigDecimal getSaldoDisponivelMensal() {
    return saldoDisponivelMensal;
  }
  public void setSaldoDisponivelMensal(BigDecimal saldoDisponivelMensal) {
    this.saldoDisponivelMensal = saldoDisponivelMensal;
  }

  
  /**
   * Valor do limite semanal
   **/
  public ControleLimiteCartaoResponse limiteSemanal(BigDecimal limiteSemanal) {
    this.limiteSemanal = limiteSemanal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite semanal")
  @JsonProperty("limiteSemanal")
  public BigDecimal getLimiteSemanal() {
    return limiteSemanal;
  }
  public void setLimiteSemanal(BigDecimal limiteSemanal) {
    this.limiteSemanal = limiteSemanal;
  }

  
  /**
   * Valor dispon\u00EDvel que o cart\u00E3o ainda pode gastar na semana
   **/
  public ControleLimiteCartaoResponse saldoDisponivelSemanal(BigDecimal saldoDisponivelSemanal) {
    this.saldoDisponivelSemanal = saldoDisponivelSemanal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor dispon\u00EDvel que o cart\u00E3o ainda pode gastar na semana")
  @JsonProperty("saldoDisponivelSemanal")
  public BigDecimal getSaldoDisponivelSemanal() {
    return saldoDisponivelSemanal;
  }
  public void setSaldoDisponivelSemanal(BigDecimal saldoDisponivelSemanal) {
    this.saldoDisponivelSemanal = saldoDisponivelSemanal;
  }

  
  /**
   * Valor do limite di\u00E1rio
   **/
  public ControleLimiteCartaoResponse limiteDiario(BigDecimal limiteDiario) {
    this.limiteDiario = limiteDiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite di\u00E1rio")
  @JsonProperty("limiteDiario")
  public BigDecimal getLimiteDiario() {
    return limiteDiario;
  }
  public void setLimiteDiario(BigDecimal limiteDiario) {
    this.limiteDiario = limiteDiario;
  }

  
  /**
   * Valor dispon\u00EDvel que o cart\u00E3o ainda pode gastar no dia
   **/
  public ControleLimiteCartaoResponse saldoDisponivelDiario(BigDecimal saldoDisponivelDiario) {
    this.saldoDisponivelDiario = saldoDisponivelDiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor dispon\u00EDvel que o cart\u00E3o ainda pode gastar no dia")
  @JsonProperty("saldoDisponivelDiario")
  public BigDecimal getSaldoDisponivelDiario() {
    return saldoDisponivelDiario;
  }
  public void setSaldoDisponivelDiario(BigDecimal saldoDisponivelDiario) {
    this.saldoDisponivelDiario = saldoDisponivelDiario;
  }

  
  /**
   * Data e hora da \u00FAltima compra realizada pelo cart\u00E3o
   **/
  public ControleLimiteCartaoResponse dataHoraUltimaCompra(String dataHoraUltimaCompra) {
    this.dataHoraUltimaCompra = dataHoraUltimaCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e hora da \u00FAltima compra realizada pelo cart\u00E3o")
  @JsonProperty("dataHoraUltimaCompra")
  public String getDataHoraUltimaCompra() {
    return dataHoraUltimaCompra;
  }
  public void setDataHoraUltimaCompra(String dataHoraUltimaCompra) {
    this.dataHoraUltimaCompra = dataHoraUltimaCompra;
  }

  
  /**
   * Flag que mostra se a configura\u00E7\u00E3o est\u00E1 ativa
   **/
  public ControleLimiteCartaoResponse ativo(Boolean ativo) {
    this.ativo = ativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que mostra se a configura\u00E7\u00E3o est\u00E1 ativa")
  @JsonProperty("ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControleLimiteCartaoResponse controleLimiteCartaoResponse = (ControleLimiteCartaoResponse) o;
    return Objects.equals(this.id, controleLimiteCartaoResponse.id) &&
        Objects.equals(this.idCartao, controleLimiteCartaoResponse.idCartao) &&
        Objects.equals(this.limiteMensal, controleLimiteCartaoResponse.limiteMensal) &&
        Objects.equals(this.saldoDisponivelMensal, controleLimiteCartaoResponse.saldoDisponivelMensal) &&
        Objects.equals(this.limiteSemanal, controleLimiteCartaoResponse.limiteSemanal) &&
        Objects.equals(this.saldoDisponivelSemanal, controleLimiteCartaoResponse.saldoDisponivelSemanal) &&
        Objects.equals(this.limiteDiario, controleLimiteCartaoResponse.limiteDiario) &&
        Objects.equals(this.saldoDisponivelDiario, controleLimiteCartaoResponse.saldoDisponivelDiario) &&
        Objects.equals(this.dataHoraUltimaCompra, controleLimiteCartaoResponse.dataHoraUltimaCompra) &&
        Objects.equals(this.ativo, controleLimiteCartaoResponse.ativo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idCartao, limiteMensal, saldoDisponivelMensal, limiteSemanal, saldoDisponivelSemanal, limiteDiario, saldoDisponivelDiario, dataHoraUltimaCompra, ativo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleLimiteCartaoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    limiteMensal: ").append(toIndentedString(limiteMensal)).append("\n");
    sb.append("    saldoDisponivelMensal: ").append(toIndentedString(saldoDisponivelMensal)).append("\n");
    sb.append("    limiteSemanal: ").append(toIndentedString(limiteSemanal)).append("\n");
    sb.append("    saldoDisponivelSemanal: ").append(toIndentedString(saldoDisponivelSemanal)).append("\n");
    sb.append("    limiteDiario: ").append(toIndentedString(limiteDiario)).append("\n");
    sb.append("    saldoDisponivelDiario: ").append(toIndentedString(saldoDisponivelDiario)).append("\n");
    sb.append("    dataHoraUltimaCompra: ").append(toIndentedString(dataHoraUltimaCompra)).append("\n");
    sb.append("    ativo: ").append(toIndentedString(ativo)).append("\n");
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

