package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de resposta de um log de limite disponibilidade
 **/

@ApiModel(description = "Objeto de resposta de um log de limite disponibilidade")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LimiteDisponibilidadeLogResponse   {
  
  private String dataAlteracao = null;
  private BigDecimal disponibilidadeCompraInternacional = null;
  private BigDecimal disponibilidadeCompraNacional = null;
  private BigDecimal disponibilidadeGlobalCredito = null;
  private BigDecimal disponibilidadeParceladoNacional = null;
  private BigDecimal disponibilidadeParcelasNacional = null;
  private BigDecimal disponibilidadeSaqueInternacionalGlobal = null;
  private BigDecimal disponibilidadeSaqueNacionalGlobal = null;
  private Long id = null;
  private Long idConta = null;
  private Long idEmissor = null;
  private BigDecimal limiteCompraInternacional = null;
  private BigDecimal limiteCompraNacional = null;
  private BigDecimal limiteGlobalCredito = null;
  private BigDecimal limiteMaximo = null;
  private BigDecimal limiteParceladoInternacional = null;
  private BigDecimal limiteParceladoNacional = null;
  private BigDecimal limiteParcelasInternacional = null;
  private BigDecimal limiteParcelasNacional = null;
  private BigDecimal limitePontuacao = null;
  private BigDecimal limiteSaqueInternacionalGlobal = null;
  private BigDecimal limiteSaqueInternacionalPeriodo = null;
  private BigDecimal limiteSaqueNacionalGlobal = null;
  private BigDecimal limiteSaqueNacionalPeriodo = null;
  private String maquina = null;
  private BigDecimal margemConsignada = null;
  private String ordemAtualizacao = null;
  private String tipoAlteracao = null;

  
  /**
   * Data de altera\u00E7\u00E3o do limite
   **/
  public LimiteDisponibilidadeLogResponse dataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de altera\u00E7\u00E3o do limite")
  @JsonProperty("dataAlteracao")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  
  /**
   * Disponibilidade compra internacional
   **/
  public LimiteDisponibilidadeLogResponse disponibilidadeCompraInternacional(BigDecimal disponibilidadeCompraInternacional) {
    this.disponibilidadeCompraInternacional = disponibilidadeCompraInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Disponibilidade compra internacional")
  @JsonProperty("disponibilidadeCompraInternacional")
  public BigDecimal getDisponibilidadeCompraInternacional() {
    return disponibilidadeCompraInternacional;
  }
  public void setDisponibilidadeCompraInternacional(BigDecimal disponibilidadeCompraInternacional) {
    this.disponibilidadeCompraInternacional = disponibilidadeCompraInternacional;
  }

  
  /**
   * Disponibilidade compra nacional
   **/
  public LimiteDisponibilidadeLogResponse disponibilidadeCompraNacional(BigDecimal disponibilidadeCompraNacional) {
    this.disponibilidadeCompraNacional = disponibilidadeCompraNacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Disponibilidade compra nacional")
  @JsonProperty("disponibilidadeCompraNacional")
  public BigDecimal getDisponibilidadeCompraNacional() {
    return disponibilidadeCompraNacional;
  }
  public void setDisponibilidadeCompraNacional(BigDecimal disponibilidadeCompraNacional) {
    this.disponibilidadeCompraNacional = disponibilidadeCompraNacional;
  }

  
  /**
   * Disponibilidade global cr\u00E9dito
   **/
  public LimiteDisponibilidadeLogResponse disponibilidadeGlobalCredito(BigDecimal disponibilidadeGlobalCredito) {
    this.disponibilidadeGlobalCredito = disponibilidadeGlobalCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Disponibilidade global cr\u00E9dito")
  @JsonProperty("disponibilidadeGlobalCredito")
  public BigDecimal getDisponibilidadeGlobalCredito() {
    return disponibilidadeGlobalCredito;
  }
  public void setDisponibilidadeGlobalCredito(BigDecimal disponibilidadeGlobalCredito) {
    this.disponibilidadeGlobalCredito = disponibilidadeGlobalCredito;
  }

  
  /**
   * Disponibilidade parcelado nacional
   **/
  public LimiteDisponibilidadeLogResponse disponibilidadeParceladoNacional(BigDecimal disponibilidadeParceladoNacional) {
    this.disponibilidadeParceladoNacional = disponibilidadeParceladoNacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Disponibilidade parcelado nacional")
  @JsonProperty("disponibilidadeParceladoNacional")
  public BigDecimal getDisponibilidadeParceladoNacional() {
    return disponibilidadeParceladoNacional;
  }
  public void setDisponibilidadeParceladoNacional(BigDecimal disponibilidadeParceladoNacional) {
    this.disponibilidadeParceladoNacional = disponibilidadeParceladoNacional;
  }

  
  /**
   * Disponibilidade parcelas nacional
   **/
  public LimiteDisponibilidadeLogResponse disponibilidadeParcelasNacional(BigDecimal disponibilidadeParcelasNacional) {
    this.disponibilidadeParcelasNacional = disponibilidadeParcelasNacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Disponibilidade parcelas nacional")
  @JsonProperty("disponibilidadeParcelasNacional")
  public BigDecimal getDisponibilidadeParcelasNacional() {
    return disponibilidadeParcelasNacional;
  }
  public void setDisponibilidadeParcelasNacional(BigDecimal disponibilidadeParcelasNacional) {
    this.disponibilidadeParcelasNacional = disponibilidadeParcelasNacional;
  }

  
  /**
   * Disponibilidade saque internacional global
   **/
  public LimiteDisponibilidadeLogResponse disponibilidadeSaqueInternacionalGlobal(BigDecimal disponibilidadeSaqueInternacionalGlobal) {
    this.disponibilidadeSaqueInternacionalGlobal = disponibilidadeSaqueInternacionalGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Disponibilidade saque internacional global")
  @JsonProperty("disponibilidadeSaqueInternacionalGlobal")
  public BigDecimal getDisponibilidadeSaqueInternacionalGlobal() {
    return disponibilidadeSaqueInternacionalGlobal;
  }
  public void setDisponibilidadeSaqueInternacionalGlobal(BigDecimal disponibilidadeSaqueInternacionalGlobal) {
    this.disponibilidadeSaqueInternacionalGlobal = disponibilidadeSaqueInternacionalGlobal;
  }

  
  /**
   * Disponibilidade saque nacional global
   **/
  public LimiteDisponibilidadeLogResponse disponibilidadeSaqueNacionalGlobal(BigDecimal disponibilidadeSaqueNacionalGlobal) {
    this.disponibilidadeSaqueNacionalGlobal = disponibilidadeSaqueNacionalGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Disponibilidade saque nacional global")
  @JsonProperty("disponibilidadeSaqueNacionalGlobal")
  public BigDecimal getDisponibilidadeSaqueNacionalGlobal() {
    return disponibilidadeSaqueNacionalGlobal;
  }
  public void setDisponibilidadeSaqueNacionalGlobal(BigDecimal disponibilidadeSaqueNacionalGlobal) {
    this.disponibilidadeSaqueNacionalGlobal = disponibilidadeSaqueNacionalGlobal;
  }

  
  /**
   * C\u00F3digo identificador do limite disponibilidade log
   **/
  public LimiteDisponibilidadeLogResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do limite disponibilidade log")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador da conta
   **/
  public LimiteDisponibilidadeLogResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo identificador do emissor
   **/
  public LimiteDisponibilidadeLogResponse idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do emissor")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * Limite de compra internacional
   **/
  public LimiteDisponibilidadeLogResponse limiteCompraInternacional(BigDecimal limiteCompraInternacional) {
    this.limiteCompraInternacional = limiteCompraInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Limite de compra internacional")
  @JsonProperty("limiteCompraInternacional")
  public BigDecimal getLimiteCompraInternacional() {
    return limiteCompraInternacional;
  }
  public void setLimiteCompraInternacional(BigDecimal limiteCompraInternacional) {
    this.limiteCompraInternacional = limiteCompraInternacional;
  }

  
  /**
   * Limite de compra nacional
   **/
  public LimiteDisponibilidadeLogResponse limiteCompraNacional(BigDecimal limiteCompraNacional) {
    this.limiteCompraNacional = limiteCompraNacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Limite de compra nacional")
  @JsonProperty("limiteCompraNacional")
  public BigDecimal getLimiteCompraNacional() {
    return limiteCompraNacional;
  }
  public void setLimiteCompraNacional(BigDecimal limiteCompraNacional) {
    this.limiteCompraNacional = limiteCompraNacional;
  }

  
  /**
   * Limite global de credito do cliente
   **/
  public LimiteDisponibilidadeLogResponse limiteGlobalCredito(BigDecimal limiteGlobalCredito) {
    this.limiteGlobalCredito = limiteGlobalCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Limite global de credito do cliente")
  @JsonProperty("limiteGlobalCredito")
  public BigDecimal getLimiteGlobalCredito() {
    return limiteGlobalCredito;
  }
  public void setLimiteGlobalCredito(BigDecimal limiteGlobalCredito) {
    this.limiteGlobalCredito = limiteGlobalCredito;
  }

  
  /**
   * Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es
   **/
  public LimiteDisponibilidadeLogResponse limiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es")
  @JsonProperty("limiteMaximo")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * Limite parcelado internacional
   **/
  public LimiteDisponibilidadeLogResponse limiteParceladoInternacional(BigDecimal limiteParceladoInternacional) {
    this.limiteParceladoInternacional = limiteParceladoInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Limite parcelado internacional")
  @JsonProperty("limiteParceladoInternacional")
  public BigDecimal getLimiteParceladoInternacional() {
    return limiteParceladoInternacional;
  }
  public void setLimiteParceladoInternacional(BigDecimal limiteParceladoInternacional) {
    this.limiteParceladoInternacional = limiteParceladoInternacional;
  }

  
  /**
   * Limite parcelado nacional (valor contrato)
   **/
  public LimiteDisponibilidadeLogResponse limiteParceladoNacional(BigDecimal limiteParceladoNacional) {
    this.limiteParceladoNacional = limiteParceladoNacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Limite parcelado nacional (valor contrato)")
  @JsonProperty("limiteParceladoNacional")
  public BigDecimal getLimiteParceladoNacional() {
    return limiteParceladoNacional;
  }
  public void setLimiteParceladoNacional(BigDecimal limiteParceladoNacional) {
    this.limiteParceladoNacional = limiteParceladoNacional;
  }

  
  /**
   * Limite parcelas internacional
   **/
  public LimiteDisponibilidadeLogResponse limiteParcelasInternacional(BigDecimal limiteParcelasInternacional) {
    this.limiteParcelasInternacional = limiteParcelasInternacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Limite parcelas internacional")
  @JsonProperty("limiteParcelasInternacional")
  public BigDecimal getLimiteParcelasInternacional() {
    return limiteParcelasInternacional;
  }
  public void setLimiteParcelasInternacional(BigDecimal limiteParcelasInternacional) {
    this.limiteParcelasInternacional = limiteParcelasInternacional;
  }

  
  /**
   * Limite parcelas nacional
   **/
  public LimiteDisponibilidadeLogResponse limiteParcelasNacional(BigDecimal limiteParcelasNacional) {
    this.limiteParcelasNacional = limiteParcelasNacional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Limite parcelas nacional")
  @JsonProperty("limiteParcelasNacional")
  public BigDecimal getLimiteParcelasNacional() {
    return limiteParcelasNacional;
  }
  public void setLimiteParcelasNacional(BigDecimal limiteParcelasNacional) {
    this.limiteParcelasNacional = limiteParcelasNacional;
  }

  
  /**
   * Pontua\u00E7\u00E3o da conta
   **/
  public LimiteDisponibilidadeLogResponse limitePontuacao(BigDecimal limitePontuacao) {
    this.limitePontuacao = limitePontuacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Pontua\u00E7\u00E3o da conta")
  @JsonProperty("limitePontuacao")
  public BigDecimal getLimitePontuacao() {
    return limitePontuacao;
  }
  public void setLimitePontuacao(BigDecimal limitePontuacao) {
    this.limitePontuacao = limitePontuacao;
  }

  
  /**
   * Limite de saque internacional global
   **/
  public LimiteDisponibilidadeLogResponse limiteSaqueInternacionalGlobal(BigDecimal limiteSaqueInternacionalGlobal) {
    this.limiteSaqueInternacionalGlobal = limiteSaqueInternacionalGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Limite de saque internacional global")
  @JsonProperty("limiteSaqueInternacionalGlobal")
  public BigDecimal getLimiteSaqueInternacionalGlobal() {
    return limiteSaqueInternacionalGlobal;
  }
  public void setLimiteSaqueInternacionalGlobal(BigDecimal limiteSaqueInternacionalGlobal) {
    this.limiteSaqueInternacionalGlobal = limiteSaqueInternacionalGlobal;
  }

  
  /**
   * Limite de saque internacional por per\u00EDodo
   **/
  public LimiteDisponibilidadeLogResponse limiteSaqueInternacionalPeriodo(BigDecimal limiteSaqueInternacionalPeriodo) {
    this.limiteSaqueInternacionalPeriodo = limiteSaqueInternacionalPeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Limite de saque internacional por per\u00EDodo")
  @JsonProperty("limiteSaqueInternacionalPeriodo")
  public BigDecimal getLimiteSaqueInternacionalPeriodo() {
    return limiteSaqueInternacionalPeriodo;
  }
  public void setLimiteSaqueInternacionalPeriodo(BigDecimal limiteSaqueInternacionalPeriodo) {
    this.limiteSaqueInternacionalPeriodo = limiteSaqueInternacionalPeriodo;
  }

  
  /**
   * Limite de saque nacional global
   **/
  public LimiteDisponibilidadeLogResponse limiteSaqueNacionalGlobal(BigDecimal limiteSaqueNacionalGlobal) {
    this.limiteSaqueNacionalGlobal = limiteSaqueNacionalGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Limite de saque nacional global")
  @JsonProperty("limiteSaqueNacionalGlobal")
  public BigDecimal getLimiteSaqueNacionalGlobal() {
    return limiteSaqueNacionalGlobal;
  }
  public void setLimiteSaqueNacionalGlobal(BigDecimal limiteSaqueNacionalGlobal) {
    this.limiteSaqueNacionalGlobal = limiteSaqueNacionalGlobal;
  }

  
  /**
   * Limite de saque nacional por per\u00EDodo
   **/
  public LimiteDisponibilidadeLogResponse limiteSaqueNacionalPeriodo(BigDecimal limiteSaqueNacionalPeriodo) {
    this.limiteSaqueNacionalPeriodo = limiteSaqueNacionalPeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Limite de saque nacional por per\u00EDodo")
  @JsonProperty("limiteSaqueNacionalPeriodo")
  public BigDecimal getLimiteSaqueNacionalPeriodo() {
    return limiteSaqueNacionalPeriodo;
  }
  public void setLimiteSaqueNacionalPeriodo(BigDecimal limiteSaqueNacionalPeriodo) {
    this.limiteSaqueNacionalPeriodo = limiteSaqueNacionalPeriodo;
  }

  
  /**
   * Nome da m\u00E1quina da altera\u00E7\u00E3o do limite
   **/
  public LimiteDisponibilidadeLogResponse maquina(String maquina) {
    this.maquina = maquina;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da m\u00E1quina da altera\u00E7\u00E3o do limite")
  @JsonProperty("maquina")
  public String getMaquina() {
    return maquina;
  }
  public void setMaquina(String maquina) {
    this.maquina = maquina;
  }

  
  /**
   * Margem para emprestimos consignados
   **/
  public LimiteDisponibilidadeLogResponse margemConsignada(BigDecimal margemConsignada) {
    this.margemConsignada = margemConsignada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Margem para emprestimos consignados")
  @JsonProperty("margemConsignada")
  public BigDecimal getMargemConsignada() {
    return margemConsignada;
  }
  public void setMargemConsignada(BigDecimal margemConsignada) {
    this.margemConsignada = margemConsignada;
  }

  
  /**
   * Ordem da altera\u00E7\u00E3o do limite (I - insert, U - update, D - delete)
   **/
  public LimiteDisponibilidadeLogResponse ordemAtualizacao(String ordemAtualizacao) {
    this.ordemAtualizacao = ordemAtualizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ordem da altera\u00E7\u00E3o do limite (I - insert, U - update, D - delete)")
  @JsonProperty("ordemAtualizacao")
  public String getOrdemAtualizacao() {
    return ordemAtualizacao;
  }
  public void setOrdemAtualizacao(String ordemAtualizacao) {
    this.ordemAtualizacao = ordemAtualizacao;
  }

  
  /**
   * Tipo da altera\u00E7\u00E3o do limite (I - insert, U - update, D - delete
   **/
  public LimiteDisponibilidadeLogResponse tipoAlteracao(String tipoAlteracao) {
    this.tipoAlteracao = tipoAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo da altera\u00E7\u00E3o do limite (I - insert, U - update, D - delete")
  @JsonProperty("tipoAlteracao")
  public String getTipoAlteracao() {
    return tipoAlteracao;
  }
  public void setTipoAlteracao(String tipoAlteracao) {
    this.tipoAlteracao = tipoAlteracao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimiteDisponibilidadeLogResponse limiteDisponibilidadeLogResponse = (LimiteDisponibilidadeLogResponse) o;
    return Objects.equals(this.dataAlteracao, limiteDisponibilidadeLogResponse.dataAlteracao) &&
        Objects.equals(this.disponibilidadeCompraInternacional, limiteDisponibilidadeLogResponse.disponibilidadeCompraInternacional) &&
        Objects.equals(this.disponibilidadeCompraNacional, limiteDisponibilidadeLogResponse.disponibilidadeCompraNacional) &&
        Objects.equals(this.disponibilidadeGlobalCredito, limiteDisponibilidadeLogResponse.disponibilidadeGlobalCredito) &&
        Objects.equals(this.disponibilidadeParceladoNacional, limiteDisponibilidadeLogResponse.disponibilidadeParceladoNacional) &&
        Objects.equals(this.disponibilidadeParcelasNacional, limiteDisponibilidadeLogResponse.disponibilidadeParcelasNacional) &&
        Objects.equals(this.disponibilidadeSaqueInternacionalGlobal, limiteDisponibilidadeLogResponse.disponibilidadeSaqueInternacionalGlobal) &&
        Objects.equals(this.disponibilidadeSaqueNacionalGlobal, limiteDisponibilidadeLogResponse.disponibilidadeSaqueNacionalGlobal) &&
        Objects.equals(this.id, limiteDisponibilidadeLogResponse.id) &&
        Objects.equals(this.idConta, limiteDisponibilidadeLogResponse.idConta) &&
        Objects.equals(this.idEmissor, limiteDisponibilidadeLogResponse.idEmissor) &&
        Objects.equals(this.limiteCompraInternacional, limiteDisponibilidadeLogResponse.limiteCompraInternacional) &&
        Objects.equals(this.limiteCompraNacional, limiteDisponibilidadeLogResponse.limiteCompraNacional) &&
        Objects.equals(this.limiteGlobalCredito, limiteDisponibilidadeLogResponse.limiteGlobalCredito) &&
        Objects.equals(this.limiteMaximo, limiteDisponibilidadeLogResponse.limiteMaximo) &&
        Objects.equals(this.limiteParceladoInternacional, limiteDisponibilidadeLogResponse.limiteParceladoInternacional) &&
        Objects.equals(this.limiteParceladoNacional, limiteDisponibilidadeLogResponse.limiteParceladoNacional) &&
        Objects.equals(this.limiteParcelasInternacional, limiteDisponibilidadeLogResponse.limiteParcelasInternacional) &&
        Objects.equals(this.limiteParcelasNacional, limiteDisponibilidadeLogResponse.limiteParcelasNacional) &&
        Objects.equals(this.limitePontuacao, limiteDisponibilidadeLogResponse.limitePontuacao) &&
        Objects.equals(this.limiteSaqueInternacionalGlobal, limiteDisponibilidadeLogResponse.limiteSaqueInternacionalGlobal) &&
        Objects.equals(this.limiteSaqueInternacionalPeriodo, limiteDisponibilidadeLogResponse.limiteSaqueInternacionalPeriodo) &&
        Objects.equals(this.limiteSaqueNacionalGlobal, limiteDisponibilidadeLogResponse.limiteSaqueNacionalGlobal) &&
        Objects.equals(this.limiteSaqueNacionalPeriodo, limiteDisponibilidadeLogResponse.limiteSaqueNacionalPeriodo) &&
        Objects.equals(this.maquina, limiteDisponibilidadeLogResponse.maquina) &&
        Objects.equals(this.margemConsignada, limiteDisponibilidadeLogResponse.margemConsignada) &&
        Objects.equals(this.ordemAtualizacao, limiteDisponibilidadeLogResponse.ordemAtualizacao) &&
        Objects.equals(this.tipoAlteracao, limiteDisponibilidadeLogResponse.tipoAlteracao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataAlteracao, disponibilidadeCompraInternacional, disponibilidadeCompraNacional, disponibilidadeGlobalCredito, disponibilidadeParceladoNacional, disponibilidadeParcelasNacional, disponibilidadeSaqueInternacionalGlobal, disponibilidadeSaqueNacionalGlobal, id, idConta, idEmissor, limiteCompraInternacional, limiteCompraNacional, limiteGlobalCredito, limiteMaximo, limiteParceladoInternacional, limiteParceladoNacional, limiteParcelasInternacional, limiteParcelasNacional, limitePontuacao, limiteSaqueInternacionalGlobal, limiteSaqueInternacionalPeriodo, limiteSaqueNacionalGlobal, limiteSaqueNacionalPeriodo, maquina, margemConsignada, ordemAtualizacao, tipoAlteracao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimiteDisponibilidadeLogResponse {\n");
    
    sb.append("    dataAlteracao: ").append(toIndentedString(dataAlteracao)).append("\n");
    sb.append("    disponibilidadeCompraInternacional: ").append(toIndentedString(disponibilidadeCompraInternacional)).append("\n");
    sb.append("    disponibilidadeCompraNacional: ").append(toIndentedString(disponibilidadeCompraNacional)).append("\n");
    sb.append("    disponibilidadeGlobalCredito: ").append(toIndentedString(disponibilidadeGlobalCredito)).append("\n");
    sb.append("    disponibilidadeParceladoNacional: ").append(toIndentedString(disponibilidadeParceladoNacional)).append("\n");
    sb.append("    disponibilidadeParcelasNacional: ").append(toIndentedString(disponibilidadeParcelasNacional)).append("\n");
    sb.append("    disponibilidadeSaqueInternacionalGlobal: ").append(toIndentedString(disponibilidadeSaqueInternacionalGlobal)).append("\n");
    sb.append("    disponibilidadeSaqueNacionalGlobal: ").append(toIndentedString(disponibilidadeSaqueNacionalGlobal)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    limiteCompraInternacional: ").append(toIndentedString(limiteCompraInternacional)).append("\n");
    sb.append("    limiteCompraNacional: ").append(toIndentedString(limiteCompraNacional)).append("\n");
    sb.append("    limiteGlobalCredito: ").append(toIndentedString(limiteGlobalCredito)).append("\n");
    sb.append("    limiteMaximo: ").append(toIndentedString(limiteMaximo)).append("\n");
    sb.append("    limiteParceladoInternacional: ").append(toIndentedString(limiteParceladoInternacional)).append("\n");
    sb.append("    limiteParceladoNacional: ").append(toIndentedString(limiteParceladoNacional)).append("\n");
    sb.append("    limiteParcelasInternacional: ").append(toIndentedString(limiteParcelasInternacional)).append("\n");
    sb.append("    limiteParcelasNacional: ").append(toIndentedString(limiteParcelasNacional)).append("\n");
    sb.append("    limitePontuacao: ").append(toIndentedString(limitePontuacao)).append("\n");
    sb.append("    limiteSaqueInternacionalGlobal: ").append(toIndentedString(limiteSaqueInternacionalGlobal)).append("\n");
    sb.append("    limiteSaqueInternacionalPeriodo: ").append(toIndentedString(limiteSaqueInternacionalPeriodo)).append("\n");
    sb.append("    limiteSaqueNacionalGlobal: ").append(toIndentedString(limiteSaqueNacionalGlobal)).append("\n");
    sb.append("    limiteSaqueNacionalPeriodo: ").append(toIndentedString(limiteSaqueNacionalPeriodo)).append("\n");
    sb.append("    maquina: ").append(toIndentedString(maquina)).append("\n");
    sb.append("    margemConsignada: ").append(toIndentedString(margemConsignada)).append("\n");
    sb.append("    ordemAtualizacao: ").append(toIndentedString(ordemAtualizacao)).append("\n");
    sb.append("    tipoAlteracao: ").append(toIndentedString(tipoAlteracao)).append("\n");
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

