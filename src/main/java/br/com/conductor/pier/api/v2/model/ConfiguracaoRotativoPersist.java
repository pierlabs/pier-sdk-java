package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{configuracao_rotativo_persist_description}}}
 **/

@ApiModel(description = "{{{configuracao_rotativo_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConfiguracaoRotativoPersist   {
  
  private Long idProduto = null;
  private Boolean compoeOfertaValorRotativo = null;
  private Boolean compoeOfertaValorNaoFinanciavel = null;
  private Boolean compoeOfertaValorNovosLancamentos = null;
  private Boolean recalculaParcelamentoParaEntradaMaior = null;
  private Boolean minimoParcelasRecalculoParcelamento = null;
  private Boolean recalculaParcelamento = null;
  private Boolean numeroMinimoOfertas = null;
  private Boolean aceitaPagamentoMaiorQueEntrada = null;
  private Boolean antecipaParcelamentosAbertos = null;
  private BigDecimal valorMinimoParcela = null;
  private BigDecimal percentualLimitarValorMinimoParcela = null;
  private Long idRegraCampanha = null;
  private Boolean parcelarApenasMinimo = null;
  private String usuario = null;

  
  /**
   * {{{configuracao_rotativo_persist_id_produto_value}}}
   **/
  public ConfiguracaoRotativoPersist idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_rotativo_persist_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{configuracao_rotativo_persist_compoe_oferta_valor_rotativo_value}}}
   **/
  public ConfiguracaoRotativoPersist compoeOfertaValorRotativo(Boolean compoeOfertaValorRotativo) {
    this.compoeOfertaValorRotativo = compoeOfertaValorRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_rotativo_persist_compoe_oferta_valor_rotativo_value}}}")
  @JsonProperty("compoeOfertaValorRotativo")
  public Boolean getCompoeOfertaValorRotativo() {
    return compoeOfertaValorRotativo;
  }
  public void setCompoeOfertaValorRotativo(Boolean compoeOfertaValorRotativo) {
    this.compoeOfertaValorRotativo = compoeOfertaValorRotativo;
  }

  
  /**
   * {{{configuracao_rotativo_persist_compoe_oferta_valor_nao_financiavel_value}}}
   **/
  public ConfiguracaoRotativoPersist compoeOfertaValorNaoFinanciavel(Boolean compoeOfertaValorNaoFinanciavel) {
    this.compoeOfertaValorNaoFinanciavel = compoeOfertaValorNaoFinanciavel;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_rotativo_persist_compoe_oferta_valor_nao_financiavel_value}}}")
  @JsonProperty("compoeOfertaValorNaoFinanciavel")
  public Boolean getCompoeOfertaValorNaoFinanciavel() {
    return compoeOfertaValorNaoFinanciavel;
  }
  public void setCompoeOfertaValorNaoFinanciavel(Boolean compoeOfertaValorNaoFinanciavel) {
    this.compoeOfertaValorNaoFinanciavel = compoeOfertaValorNaoFinanciavel;
  }

  
  /**
   * {{{configuracao_rotativo_persist_compoe_oferta_valor_novos_lancamentos_value}}}
   **/
  public ConfiguracaoRotativoPersist compoeOfertaValorNovosLancamentos(Boolean compoeOfertaValorNovosLancamentos) {
    this.compoeOfertaValorNovosLancamentos = compoeOfertaValorNovosLancamentos;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_rotativo_persist_compoe_oferta_valor_novos_lancamentos_value}}}")
  @JsonProperty("compoeOfertaValorNovosLancamentos")
  public Boolean getCompoeOfertaValorNovosLancamentos() {
    return compoeOfertaValorNovosLancamentos;
  }
  public void setCompoeOfertaValorNovosLancamentos(Boolean compoeOfertaValorNovosLancamentos) {
    this.compoeOfertaValorNovosLancamentos = compoeOfertaValorNovosLancamentos;
  }

  
  /**
   * {{{configuracao_rotativo_persist_recalcula_parcelamento_para_entrada_maior_value}}}
   **/
  public ConfiguracaoRotativoPersist recalculaParcelamentoParaEntradaMaior(Boolean recalculaParcelamentoParaEntradaMaior) {
    this.recalculaParcelamentoParaEntradaMaior = recalculaParcelamentoParaEntradaMaior;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_rotativo_persist_recalcula_parcelamento_para_entrada_maior_value}}}")
  @JsonProperty("recalculaParcelamentoParaEntradaMaior")
  public Boolean getRecalculaParcelamentoParaEntradaMaior() {
    return recalculaParcelamentoParaEntradaMaior;
  }
  public void setRecalculaParcelamentoParaEntradaMaior(Boolean recalculaParcelamentoParaEntradaMaior) {
    this.recalculaParcelamentoParaEntradaMaior = recalculaParcelamentoParaEntradaMaior;
  }

  
  /**
   * {{{configuracao_rotativo_persist_minimo_parcelas_recalculo_parcelamento_value}}}
   **/
  public ConfiguracaoRotativoPersist minimoParcelasRecalculoParcelamento(Boolean minimoParcelasRecalculoParcelamento) {
    this.minimoParcelasRecalculoParcelamento = minimoParcelasRecalculoParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_rotativo_persist_minimo_parcelas_recalculo_parcelamento_value}}}")
  @JsonProperty("minimoParcelasRecalculoParcelamento")
  public Boolean getMinimoParcelasRecalculoParcelamento() {
    return minimoParcelasRecalculoParcelamento;
  }
  public void setMinimoParcelasRecalculoParcelamento(Boolean minimoParcelasRecalculoParcelamento) {
    this.minimoParcelasRecalculoParcelamento = minimoParcelasRecalculoParcelamento;
  }

  
  /**
   * {{{configuracao_rotativo_persist_recalcula_parcelamento_value}}}
   **/
  public ConfiguracaoRotativoPersist recalculaParcelamento(Boolean recalculaParcelamento) {
    this.recalculaParcelamento = recalculaParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_rotativo_persist_recalcula_parcelamento_value}}}")
  @JsonProperty("recalculaParcelamento")
  public Boolean getRecalculaParcelamento() {
    return recalculaParcelamento;
  }
  public void setRecalculaParcelamento(Boolean recalculaParcelamento) {
    this.recalculaParcelamento = recalculaParcelamento;
  }

  
  /**
   * {{{configuracao_rotativo_persist_numero_minimo_ofertas_value}}}
   **/
  public ConfiguracaoRotativoPersist numeroMinimoOfertas(Boolean numeroMinimoOfertas) {
    this.numeroMinimoOfertas = numeroMinimoOfertas;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_rotativo_persist_numero_minimo_ofertas_value}}}")
  @JsonProperty("numeroMinimoOfertas")
  public Boolean getNumeroMinimoOfertas() {
    return numeroMinimoOfertas;
  }
  public void setNumeroMinimoOfertas(Boolean numeroMinimoOfertas) {
    this.numeroMinimoOfertas = numeroMinimoOfertas;
  }

  
  /**
   * {{{configuracao_rotativo_persist_aceita_pagamento_maior_que_entrada_value}}}
   **/
  public ConfiguracaoRotativoPersist aceitaPagamentoMaiorQueEntrada(Boolean aceitaPagamentoMaiorQueEntrada) {
    this.aceitaPagamentoMaiorQueEntrada = aceitaPagamentoMaiorQueEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_rotativo_persist_aceita_pagamento_maior_que_entrada_value}}}")
  @JsonProperty("aceitaPagamentoMaiorQueEntrada")
  public Boolean getAceitaPagamentoMaiorQueEntrada() {
    return aceitaPagamentoMaiorQueEntrada;
  }
  public void setAceitaPagamentoMaiorQueEntrada(Boolean aceitaPagamentoMaiorQueEntrada) {
    this.aceitaPagamentoMaiorQueEntrada = aceitaPagamentoMaiorQueEntrada;
  }

  
  /**
   * {{{configuracao_rotativo_persist_antecipa_parcelamentos_abertos_value}}}
   **/
  public ConfiguracaoRotativoPersist antecipaParcelamentosAbertos(Boolean antecipaParcelamentosAbertos) {
    this.antecipaParcelamentosAbertos = antecipaParcelamentosAbertos;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_rotativo_persist_antecipa_parcelamentos_abertos_value}}}")
  @JsonProperty("antecipaParcelamentosAbertos")
  public Boolean getAntecipaParcelamentosAbertos() {
    return antecipaParcelamentosAbertos;
  }
  public void setAntecipaParcelamentosAbertos(Boolean antecipaParcelamentosAbertos) {
    this.antecipaParcelamentosAbertos = antecipaParcelamentosAbertos;
  }

  
  /**
   * {{{configuracao_rotativo_persist_valor_minimo_parcela_value}}}
   **/
  public ConfiguracaoRotativoPersist valorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_rotativo_persist_valor_minimo_parcela_value}}}")
  @JsonProperty("valorMinimoParcela")
  public BigDecimal getValorMinimoParcela() {
    return valorMinimoParcela;
  }
  public void setValorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
  }

  
  /**
   * {{{configuracao_rotativo_persist_percentual_limitar_valor_minimo_parcela_value}}}
   **/
  public ConfiguracaoRotativoPersist percentualLimitarValorMinimoParcela(BigDecimal percentualLimitarValorMinimoParcela) {
    this.percentualLimitarValorMinimoParcela = percentualLimitarValorMinimoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_rotativo_persist_percentual_limitar_valor_minimo_parcela_value}}}")
  @JsonProperty("percentualLimitarValorMinimoParcela")
  public BigDecimal getPercentualLimitarValorMinimoParcela() {
    return percentualLimitarValorMinimoParcela;
  }
  public void setPercentualLimitarValorMinimoParcela(BigDecimal percentualLimitarValorMinimoParcela) {
    this.percentualLimitarValorMinimoParcela = percentualLimitarValorMinimoParcela;
  }

  
  /**
   * {{{configuracao_rotativo_persist_id_regra_campanha_value}}}
   **/
  public ConfiguracaoRotativoPersist idRegraCampanha(Long idRegraCampanha) {
    this.idRegraCampanha = idRegraCampanha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_rotativo_persist_id_regra_campanha_value}}}")
  @JsonProperty("idRegraCampanha")
  public Long getIdRegraCampanha() {
    return idRegraCampanha;
  }
  public void setIdRegraCampanha(Long idRegraCampanha) {
    this.idRegraCampanha = idRegraCampanha;
  }

  
  /**
   * {{{configuracao_rotativo_persist_parcelar_apenas_minimo_value}}}
   **/
  public ConfiguracaoRotativoPersist parcelarApenasMinimo(Boolean parcelarApenasMinimo) {
    this.parcelarApenasMinimo = parcelarApenasMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_rotativo_persist_parcelar_apenas_minimo_value}}}")
  @JsonProperty("parcelarApenasMinimo")
  public Boolean getParcelarApenasMinimo() {
    return parcelarApenasMinimo;
  }
  public void setParcelarApenasMinimo(Boolean parcelarApenasMinimo) {
    this.parcelarApenasMinimo = parcelarApenasMinimo;
  }

  
  /**
   * {{{configuracao_rotativo_persist_usuario_value}}}
   **/
  public ConfiguracaoRotativoPersist usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_rotativo_persist_usuario_value}}}")
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfiguracaoRotativoPersist configuracaoRotativoPersist = (ConfiguracaoRotativoPersist) o;
    return Objects.equals(this.idProduto, configuracaoRotativoPersist.idProduto) &&
        Objects.equals(this.compoeOfertaValorRotativo, configuracaoRotativoPersist.compoeOfertaValorRotativo) &&
        Objects.equals(this.compoeOfertaValorNaoFinanciavel, configuracaoRotativoPersist.compoeOfertaValorNaoFinanciavel) &&
        Objects.equals(this.compoeOfertaValorNovosLancamentos, configuracaoRotativoPersist.compoeOfertaValorNovosLancamentos) &&
        Objects.equals(this.recalculaParcelamentoParaEntradaMaior, configuracaoRotativoPersist.recalculaParcelamentoParaEntradaMaior) &&
        Objects.equals(this.minimoParcelasRecalculoParcelamento, configuracaoRotativoPersist.minimoParcelasRecalculoParcelamento) &&
        Objects.equals(this.recalculaParcelamento, configuracaoRotativoPersist.recalculaParcelamento) &&
        Objects.equals(this.numeroMinimoOfertas, configuracaoRotativoPersist.numeroMinimoOfertas) &&
        Objects.equals(this.aceitaPagamentoMaiorQueEntrada, configuracaoRotativoPersist.aceitaPagamentoMaiorQueEntrada) &&
        Objects.equals(this.antecipaParcelamentosAbertos, configuracaoRotativoPersist.antecipaParcelamentosAbertos) &&
        Objects.equals(this.valorMinimoParcela, configuracaoRotativoPersist.valorMinimoParcela) &&
        Objects.equals(this.percentualLimitarValorMinimoParcela, configuracaoRotativoPersist.percentualLimitarValorMinimoParcela) &&
        Objects.equals(this.idRegraCampanha, configuracaoRotativoPersist.idRegraCampanha) &&
        Objects.equals(this.parcelarApenasMinimo, configuracaoRotativoPersist.parcelarApenasMinimo) &&
        Objects.equals(this.usuario, configuracaoRotativoPersist.usuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduto, compoeOfertaValorRotativo, compoeOfertaValorNaoFinanciavel, compoeOfertaValorNovosLancamentos, recalculaParcelamentoParaEntradaMaior, minimoParcelasRecalculoParcelamento, recalculaParcelamento, numeroMinimoOfertas, aceitaPagamentoMaiorQueEntrada, antecipaParcelamentosAbertos, valorMinimoParcela, percentualLimitarValorMinimoParcela, idRegraCampanha, parcelarApenasMinimo, usuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoRotativoPersist {\n");
    
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    compoeOfertaValorRotativo: ").append(toIndentedString(compoeOfertaValorRotativo)).append("\n");
    sb.append("    compoeOfertaValorNaoFinanciavel: ").append(toIndentedString(compoeOfertaValorNaoFinanciavel)).append("\n");
    sb.append("    compoeOfertaValorNovosLancamentos: ").append(toIndentedString(compoeOfertaValorNovosLancamentos)).append("\n");
    sb.append("    recalculaParcelamentoParaEntradaMaior: ").append(toIndentedString(recalculaParcelamentoParaEntradaMaior)).append("\n");
    sb.append("    minimoParcelasRecalculoParcelamento: ").append(toIndentedString(minimoParcelasRecalculoParcelamento)).append("\n");
    sb.append("    recalculaParcelamento: ").append(toIndentedString(recalculaParcelamento)).append("\n");
    sb.append("    numeroMinimoOfertas: ").append(toIndentedString(numeroMinimoOfertas)).append("\n");
    sb.append("    aceitaPagamentoMaiorQueEntrada: ").append(toIndentedString(aceitaPagamentoMaiorQueEntrada)).append("\n");
    sb.append("    antecipaParcelamentosAbertos: ").append(toIndentedString(antecipaParcelamentosAbertos)).append("\n");
    sb.append("    valorMinimoParcela: ").append(toIndentedString(valorMinimoParcela)).append("\n");
    sb.append("    percentualLimitarValorMinimoParcela: ").append(toIndentedString(percentualLimitarValorMinimoParcela)).append("\n");
    sb.append("    idRegraCampanha: ").append(toIndentedString(idRegraCampanha)).append("\n");
    sb.append("    parcelarApenasMinimo: ").append(toIndentedString(parcelarApenasMinimo)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
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



