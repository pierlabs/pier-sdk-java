package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class SaldoLimiteResponse   {
  
  private Double disponibCompraNac = null;
  private Double disponibGlobalCredito = null;
  private Double disponibParceladoNac = null;
  private Double disponibParcelasNac = null;
  private Double disponibSaqueNacGlobal = null;
  private Boolean flagAntecipacao = null;
  private Double limiteCompraNac = null;
  private Double limiteCreditoConcedido = null;
  private Double limiteCreditoDisponivel = null;
  private Double limiteGlobalCredito = null;
  private Double limiteParceladoNac = null;
  private Double limiteParcelasNac = null;
  private Double limitePontuacao = null;
  private Double limiteSaqueNacGlobal = null;
  private Integer numeroCiclo = null;
  private Double pontosConcedidos = null;
  private Double pontosRemanescentes = null;
  private String proximoVencimentoPadrao = null;
  private String proximoVencimentoReal = null;
  private Double saldoAtualFinal = null;
  private Double saldoCredor = null;
  private Double saldoDevedor = null;
  private Double saldoDevedorOneroso = null;
  private Double saldoDevedorTotal = null;
  private Double saltaExtratoAnterior = null;
  private Double totalDisponivelUtilizacao = null;
  private Double totalFuturo = null;
  private Double valorMinimoExtrato = null;
  private Double valorMinimoExtratoOriginal = null;
  private String vencimentoPadraoAnterior = null;
  private String vencimentoPosProx = null;
  private String vencimentoRealAnterior = null;

  
  /**
   **/
  public SaldoLimiteResponse disponibCompraNac(Double disponibCompraNac) {
    this.disponibCompraNac = disponibCompraNac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disponibCompraNac")
  public Double getDisponibCompraNac() {
    return disponibCompraNac;
  }
  public void setDisponibCompraNac(Double disponibCompraNac) {
    this.disponibCompraNac = disponibCompraNac;
  }

  
  /**
   **/
  public SaldoLimiteResponse disponibGlobalCredito(Double disponibGlobalCredito) {
    this.disponibGlobalCredito = disponibGlobalCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disponibGlobalCredito")
  public Double getDisponibGlobalCredito() {
    return disponibGlobalCredito;
  }
  public void setDisponibGlobalCredito(Double disponibGlobalCredito) {
    this.disponibGlobalCredito = disponibGlobalCredito;
  }

  
  /**
   **/
  public SaldoLimiteResponse disponibParceladoNac(Double disponibParceladoNac) {
    this.disponibParceladoNac = disponibParceladoNac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disponibParceladoNac")
  public Double getDisponibParceladoNac() {
    return disponibParceladoNac;
  }
  public void setDisponibParceladoNac(Double disponibParceladoNac) {
    this.disponibParceladoNac = disponibParceladoNac;
  }

  
  /**
   **/
  public SaldoLimiteResponse disponibParcelasNac(Double disponibParcelasNac) {
    this.disponibParcelasNac = disponibParcelasNac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disponibParcelasNac")
  public Double getDisponibParcelasNac() {
    return disponibParcelasNac;
  }
  public void setDisponibParcelasNac(Double disponibParcelasNac) {
    this.disponibParcelasNac = disponibParcelasNac;
  }

  
  /**
   **/
  public SaldoLimiteResponse disponibSaqueNacGlobal(Double disponibSaqueNacGlobal) {
    this.disponibSaqueNacGlobal = disponibSaqueNacGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disponibSaqueNacGlobal")
  public Double getDisponibSaqueNacGlobal() {
    return disponibSaqueNacGlobal;
  }
  public void setDisponibSaqueNacGlobal(Double disponibSaqueNacGlobal) {
    this.disponibSaqueNacGlobal = disponibSaqueNacGlobal;
  }

  
  /**
   **/
  public SaldoLimiteResponse flagAntecipacao(Boolean flagAntecipacao) {
    this.flagAntecipacao = flagAntecipacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagAntecipacao")
  public Boolean getFlagAntecipacao() {
    return flagAntecipacao;
  }
  public void setFlagAntecipacao(Boolean flagAntecipacao) {
    this.flagAntecipacao = flagAntecipacao;
  }

  
  /**
   **/
  public SaldoLimiteResponse limiteCompraNac(Double limiteCompraNac) {
    this.limiteCompraNac = limiteCompraNac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("limiteCompraNac")
  public Double getLimiteCompraNac() {
    return limiteCompraNac;
  }
  public void setLimiteCompraNac(Double limiteCompraNac) {
    this.limiteCompraNac = limiteCompraNac;
  }

  
  /**
   **/
  public SaldoLimiteResponse limiteCreditoConcedido(Double limiteCreditoConcedido) {
    this.limiteCreditoConcedido = limiteCreditoConcedido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("limiteCreditoConcedido")
  public Double getLimiteCreditoConcedido() {
    return limiteCreditoConcedido;
  }
  public void setLimiteCreditoConcedido(Double limiteCreditoConcedido) {
    this.limiteCreditoConcedido = limiteCreditoConcedido;
  }

  
  /**
   **/
  public SaldoLimiteResponse limiteCreditoDisponivel(Double limiteCreditoDisponivel) {
    this.limiteCreditoDisponivel = limiteCreditoDisponivel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("limiteCreditoDisponivel")
  public Double getLimiteCreditoDisponivel() {
    return limiteCreditoDisponivel;
  }
  public void setLimiteCreditoDisponivel(Double limiteCreditoDisponivel) {
    this.limiteCreditoDisponivel = limiteCreditoDisponivel;
  }

  
  /**
   **/
  public SaldoLimiteResponse limiteGlobalCredito(Double limiteGlobalCredito) {
    this.limiteGlobalCredito = limiteGlobalCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("limiteGlobalCredito")
  public Double getLimiteGlobalCredito() {
    return limiteGlobalCredito;
  }
  public void setLimiteGlobalCredito(Double limiteGlobalCredito) {
    this.limiteGlobalCredito = limiteGlobalCredito;
  }

  
  /**
   **/
  public SaldoLimiteResponse limiteParceladoNac(Double limiteParceladoNac) {
    this.limiteParceladoNac = limiteParceladoNac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("limiteParceladoNac")
  public Double getLimiteParceladoNac() {
    return limiteParceladoNac;
  }
  public void setLimiteParceladoNac(Double limiteParceladoNac) {
    this.limiteParceladoNac = limiteParceladoNac;
  }

  
  /**
   **/
  public SaldoLimiteResponse limiteParcelasNac(Double limiteParcelasNac) {
    this.limiteParcelasNac = limiteParcelasNac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("limiteParcelasNac")
  public Double getLimiteParcelasNac() {
    return limiteParcelasNac;
  }
  public void setLimiteParcelasNac(Double limiteParcelasNac) {
    this.limiteParcelasNac = limiteParcelasNac;
  }

  
  /**
   **/
  public SaldoLimiteResponse limitePontuacao(Double limitePontuacao) {
    this.limitePontuacao = limitePontuacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("limitePontuacao")
  public Double getLimitePontuacao() {
    return limitePontuacao;
  }
  public void setLimitePontuacao(Double limitePontuacao) {
    this.limitePontuacao = limitePontuacao;
  }

  
  /**
   **/
  public SaldoLimiteResponse limiteSaqueNacGlobal(Double limiteSaqueNacGlobal) {
    this.limiteSaqueNacGlobal = limiteSaqueNacGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("limiteSaqueNacGlobal")
  public Double getLimiteSaqueNacGlobal() {
    return limiteSaqueNacGlobal;
  }
  public void setLimiteSaqueNacGlobal(Double limiteSaqueNacGlobal) {
    this.limiteSaqueNacGlobal = limiteSaqueNacGlobal;
  }

  
  /**
   **/
  public SaldoLimiteResponse numeroCiclo(Integer numeroCiclo) {
    this.numeroCiclo = numeroCiclo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numeroCiclo")
  public Integer getNumeroCiclo() {
    return numeroCiclo;
  }
  public void setNumeroCiclo(Integer numeroCiclo) {
    this.numeroCiclo = numeroCiclo;
  }

  
  /**
   **/
  public SaldoLimiteResponse pontosConcedidos(Double pontosConcedidos) {
    this.pontosConcedidos = pontosConcedidos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pontosConcedidos")
  public Double getPontosConcedidos() {
    return pontosConcedidos;
  }
  public void setPontosConcedidos(Double pontosConcedidos) {
    this.pontosConcedidos = pontosConcedidos;
  }

  
  /**
   **/
  public SaldoLimiteResponse pontosRemanescentes(Double pontosRemanescentes) {
    this.pontosRemanescentes = pontosRemanescentes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pontosRemanescentes")
  public Double getPontosRemanescentes() {
    return pontosRemanescentes;
  }
  public void setPontosRemanescentes(Double pontosRemanescentes) {
    this.pontosRemanescentes = pontosRemanescentes;
  }

  
  /**
   **/
  public SaldoLimiteResponse proximoVencimentoPadrao(String proximoVencimentoPadrao) {
    this.proximoVencimentoPadrao = proximoVencimentoPadrao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("proximoVencimentoPadrao")
  public String getProximoVencimentoPadrao() {
    return proximoVencimentoPadrao;
  }
  public void setProximoVencimentoPadrao(String proximoVencimentoPadrao) {
    this.proximoVencimentoPadrao = proximoVencimentoPadrao;
  }

  
  /**
   **/
  public SaldoLimiteResponse proximoVencimentoReal(String proximoVencimentoReal) {
    this.proximoVencimentoReal = proximoVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("proximoVencimentoReal")
  public String getProximoVencimentoReal() {
    return proximoVencimentoReal;
  }
  public void setProximoVencimentoReal(String proximoVencimentoReal) {
    this.proximoVencimentoReal = proximoVencimentoReal;
  }

  
  /**
   **/
  public SaldoLimiteResponse saldoAtualFinal(Double saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("saldoAtualFinal")
  public Double getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(Double saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   **/
  public SaldoLimiteResponse saldoCredor(Double saldoCredor) {
    this.saldoCredor = saldoCredor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("saldoCredor")
  public Double getSaldoCredor() {
    return saldoCredor;
  }
  public void setSaldoCredor(Double saldoCredor) {
    this.saldoCredor = saldoCredor;
  }

  
  /**
   **/
  public SaldoLimiteResponse saldoDevedor(Double saldoDevedor) {
    this.saldoDevedor = saldoDevedor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("saldoDevedor")
  public Double getSaldoDevedor() {
    return saldoDevedor;
  }
  public void setSaldoDevedor(Double saldoDevedor) {
    this.saldoDevedor = saldoDevedor;
  }

  
  /**
   **/
  public SaldoLimiteResponse saldoDevedorOneroso(Double saldoDevedorOneroso) {
    this.saldoDevedorOneroso = saldoDevedorOneroso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("saldoDevedorOneroso")
  public Double getSaldoDevedorOneroso() {
    return saldoDevedorOneroso;
  }
  public void setSaldoDevedorOneroso(Double saldoDevedorOneroso) {
    this.saldoDevedorOneroso = saldoDevedorOneroso;
  }

  
  /**
   **/
  public SaldoLimiteResponse saldoDevedorTotal(Double saldoDevedorTotal) {
    this.saldoDevedorTotal = saldoDevedorTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("saldoDevedorTotal")
  public Double getSaldoDevedorTotal() {
    return saldoDevedorTotal;
  }
  public void setSaldoDevedorTotal(Double saldoDevedorTotal) {
    this.saldoDevedorTotal = saldoDevedorTotal;
  }

  
  /**
   **/
  public SaldoLimiteResponse saltaExtratoAnterior(Double saltaExtratoAnterior) {
    this.saltaExtratoAnterior = saltaExtratoAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("saltaExtratoAnterior")
  public Double getSaltaExtratoAnterior() {
    return saltaExtratoAnterior;
  }
  public void setSaltaExtratoAnterior(Double saltaExtratoAnterior) {
    this.saltaExtratoAnterior = saltaExtratoAnterior;
  }

  
  /**
   **/
  public SaldoLimiteResponse totalDisponivelUtilizacao(Double totalDisponivelUtilizacao) {
    this.totalDisponivelUtilizacao = totalDisponivelUtilizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalDisponivelUtilizacao")
  public Double getTotalDisponivelUtilizacao() {
    return totalDisponivelUtilizacao;
  }
  public void setTotalDisponivelUtilizacao(Double totalDisponivelUtilizacao) {
    this.totalDisponivelUtilizacao = totalDisponivelUtilizacao;
  }

  
  /**
   **/
  public SaldoLimiteResponse totalFuturo(Double totalFuturo) {
    this.totalFuturo = totalFuturo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalFuturo")
  public Double getTotalFuturo() {
    return totalFuturo;
  }
  public void setTotalFuturo(Double totalFuturo) {
    this.totalFuturo = totalFuturo;
  }

  
  /**
   **/
  public SaldoLimiteResponse valorMinimoExtrato(Double valorMinimoExtrato) {
    this.valorMinimoExtrato = valorMinimoExtrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorMinimoExtrato")
  public Double getValorMinimoExtrato() {
    return valorMinimoExtrato;
  }
  public void setValorMinimoExtrato(Double valorMinimoExtrato) {
    this.valorMinimoExtrato = valorMinimoExtrato;
  }

  
  /**
   **/
  public SaldoLimiteResponse valorMinimoExtratoOriginal(Double valorMinimoExtratoOriginal) {
    this.valorMinimoExtratoOriginal = valorMinimoExtratoOriginal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorMinimoExtratoOriginal")
  public Double getValorMinimoExtratoOriginal() {
    return valorMinimoExtratoOriginal;
  }
  public void setValorMinimoExtratoOriginal(Double valorMinimoExtratoOriginal) {
    this.valorMinimoExtratoOriginal = valorMinimoExtratoOriginal;
  }

  
  /**
   **/
  public SaldoLimiteResponse vencimentoPadraoAnterior(String vencimentoPadraoAnterior) {
    this.vencimentoPadraoAnterior = vencimentoPadraoAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vencimentoPadraoAnterior")
  public String getVencimentoPadraoAnterior() {
    return vencimentoPadraoAnterior;
  }
  public void setVencimentoPadraoAnterior(String vencimentoPadraoAnterior) {
    this.vencimentoPadraoAnterior = vencimentoPadraoAnterior;
  }

  
  /**
   **/
  public SaldoLimiteResponse vencimentoPosProx(String vencimentoPosProx) {
    this.vencimentoPosProx = vencimentoPosProx;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vencimentoPosProx")
  public String getVencimentoPosProx() {
    return vencimentoPosProx;
  }
  public void setVencimentoPosProx(String vencimentoPosProx) {
    this.vencimentoPosProx = vencimentoPosProx;
  }

  
  /**
   **/
  public SaldoLimiteResponse vencimentoRealAnterior(String vencimentoRealAnterior) {
    this.vencimentoRealAnterior = vencimentoRealAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vencimentoRealAnterior")
  public String getVencimentoRealAnterior() {
    return vencimentoRealAnterior;
  }
  public void setVencimentoRealAnterior(String vencimentoRealAnterior) {
    this.vencimentoRealAnterior = vencimentoRealAnterior;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaldoLimiteResponse saldoLimiteResponse = (SaldoLimiteResponse) o;
    return Objects.equals(this.disponibCompraNac, saldoLimiteResponse.disponibCompraNac) &&
        Objects.equals(this.disponibGlobalCredito, saldoLimiteResponse.disponibGlobalCredito) &&
        Objects.equals(this.disponibParceladoNac, saldoLimiteResponse.disponibParceladoNac) &&
        Objects.equals(this.disponibParcelasNac, saldoLimiteResponse.disponibParcelasNac) &&
        Objects.equals(this.disponibSaqueNacGlobal, saldoLimiteResponse.disponibSaqueNacGlobal) &&
        Objects.equals(this.flagAntecipacao, saldoLimiteResponse.flagAntecipacao) &&
        Objects.equals(this.limiteCompraNac, saldoLimiteResponse.limiteCompraNac) &&
        Objects.equals(this.limiteCreditoConcedido, saldoLimiteResponse.limiteCreditoConcedido) &&
        Objects.equals(this.limiteCreditoDisponivel, saldoLimiteResponse.limiteCreditoDisponivel) &&
        Objects.equals(this.limiteGlobalCredito, saldoLimiteResponse.limiteGlobalCredito) &&
        Objects.equals(this.limiteParceladoNac, saldoLimiteResponse.limiteParceladoNac) &&
        Objects.equals(this.limiteParcelasNac, saldoLimiteResponse.limiteParcelasNac) &&
        Objects.equals(this.limitePontuacao, saldoLimiteResponse.limitePontuacao) &&
        Objects.equals(this.limiteSaqueNacGlobal, saldoLimiteResponse.limiteSaqueNacGlobal) &&
        Objects.equals(this.numeroCiclo, saldoLimiteResponse.numeroCiclo) &&
        Objects.equals(this.pontosConcedidos, saldoLimiteResponse.pontosConcedidos) &&
        Objects.equals(this.pontosRemanescentes, saldoLimiteResponse.pontosRemanescentes) &&
        Objects.equals(this.proximoVencimentoPadrao, saldoLimiteResponse.proximoVencimentoPadrao) &&
        Objects.equals(this.proximoVencimentoReal, saldoLimiteResponse.proximoVencimentoReal) &&
        Objects.equals(this.saldoAtualFinal, saldoLimiteResponse.saldoAtualFinal) &&
        Objects.equals(this.saldoCredor, saldoLimiteResponse.saldoCredor) &&
        Objects.equals(this.saldoDevedor, saldoLimiteResponse.saldoDevedor) &&
        Objects.equals(this.saldoDevedorOneroso, saldoLimiteResponse.saldoDevedorOneroso) &&
        Objects.equals(this.saldoDevedorTotal, saldoLimiteResponse.saldoDevedorTotal) &&
        Objects.equals(this.saltaExtratoAnterior, saldoLimiteResponse.saltaExtratoAnterior) &&
        Objects.equals(this.totalDisponivelUtilizacao, saldoLimiteResponse.totalDisponivelUtilizacao) &&
        Objects.equals(this.totalFuturo, saldoLimiteResponse.totalFuturo) &&
        Objects.equals(this.valorMinimoExtrato, saldoLimiteResponse.valorMinimoExtrato) &&
        Objects.equals(this.valorMinimoExtratoOriginal, saldoLimiteResponse.valorMinimoExtratoOriginal) &&
        Objects.equals(this.vencimentoPadraoAnterior, saldoLimiteResponse.vencimentoPadraoAnterior) &&
        Objects.equals(this.vencimentoPosProx, saldoLimiteResponse.vencimentoPosProx) &&
        Objects.equals(this.vencimentoRealAnterior, saldoLimiteResponse.vencimentoRealAnterior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disponibCompraNac, disponibGlobalCredito, disponibParceladoNac, disponibParcelasNac, disponibSaqueNacGlobal, flagAntecipacao, limiteCompraNac, limiteCreditoConcedido, limiteCreditoDisponivel, limiteGlobalCredito, limiteParceladoNac, limiteParcelasNac, limitePontuacao, limiteSaqueNacGlobal, numeroCiclo, pontosConcedidos, pontosRemanescentes, proximoVencimentoPadrao, proximoVencimentoReal, saldoAtualFinal, saldoCredor, saldoDevedor, saldoDevedorOneroso, saldoDevedorTotal, saltaExtratoAnterior, totalDisponivelUtilizacao, totalFuturo, valorMinimoExtrato, valorMinimoExtratoOriginal, vencimentoPadraoAnterior, vencimentoPosProx, vencimentoRealAnterior);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaldoLimiteResponse {\n");
    
    sb.append("    disponibCompraNac: ").append(toIndentedString(disponibCompraNac)).append("\n");
    sb.append("    disponibGlobalCredito: ").append(toIndentedString(disponibGlobalCredito)).append("\n");
    sb.append("    disponibParceladoNac: ").append(toIndentedString(disponibParceladoNac)).append("\n");
    sb.append("    disponibParcelasNac: ").append(toIndentedString(disponibParcelasNac)).append("\n");
    sb.append("    disponibSaqueNacGlobal: ").append(toIndentedString(disponibSaqueNacGlobal)).append("\n");
    sb.append("    flagAntecipacao: ").append(toIndentedString(flagAntecipacao)).append("\n");
    sb.append("    limiteCompraNac: ").append(toIndentedString(limiteCompraNac)).append("\n");
    sb.append("    limiteCreditoConcedido: ").append(toIndentedString(limiteCreditoConcedido)).append("\n");
    sb.append("    limiteCreditoDisponivel: ").append(toIndentedString(limiteCreditoDisponivel)).append("\n");
    sb.append("    limiteGlobalCredito: ").append(toIndentedString(limiteGlobalCredito)).append("\n");
    sb.append("    limiteParceladoNac: ").append(toIndentedString(limiteParceladoNac)).append("\n");
    sb.append("    limiteParcelasNac: ").append(toIndentedString(limiteParcelasNac)).append("\n");
    sb.append("    limitePontuacao: ").append(toIndentedString(limitePontuacao)).append("\n");
    sb.append("    limiteSaqueNacGlobal: ").append(toIndentedString(limiteSaqueNacGlobal)).append("\n");
    sb.append("    numeroCiclo: ").append(toIndentedString(numeroCiclo)).append("\n");
    sb.append("    pontosConcedidos: ").append(toIndentedString(pontosConcedidos)).append("\n");
    sb.append("    pontosRemanescentes: ").append(toIndentedString(pontosRemanescentes)).append("\n");
    sb.append("    proximoVencimentoPadrao: ").append(toIndentedString(proximoVencimentoPadrao)).append("\n");
    sb.append("    proximoVencimentoReal: ").append(toIndentedString(proximoVencimentoReal)).append("\n");
    sb.append("    saldoAtualFinal: ").append(toIndentedString(saldoAtualFinal)).append("\n");
    sb.append("    saldoCredor: ").append(toIndentedString(saldoCredor)).append("\n");
    sb.append("    saldoDevedor: ").append(toIndentedString(saldoDevedor)).append("\n");
    sb.append("    saldoDevedorOneroso: ").append(toIndentedString(saldoDevedorOneroso)).append("\n");
    sb.append("    saldoDevedorTotal: ").append(toIndentedString(saldoDevedorTotal)).append("\n");
    sb.append("    saltaExtratoAnterior: ").append(toIndentedString(saltaExtratoAnterior)).append("\n");
    sb.append("    totalDisponivelUtilizacao: ").append(toIndentedString(totalDisponivelUtilizacao)).append("\n");
    sb.append("    totalFuturo: ").append(toIndentedString(totalFuturo)).append("\n");
    sb.append("    valorMinimoExtrato: ").append(toIndentedString(valorMinimoExtrato)).append("\n");
    sb.append("    valorMinimoExtratoOriginal: ").append(toIndentedString(valorMinimoExtratoOriginal)).append("\n");
    sb.append("    vencimentoPadraoAnterior: ").append(toIndentedString(vencimentoPadraoAnterior)).append("\n");
    sb.append("    vencimentoPosProx: ").append(toIndentedString(vencimentoPosProx)).append("\n");
    sb.append("    vencimentoRealAnterior: ").append(toIndentedString(vencimentoRealAnterior)).append("\n");
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



