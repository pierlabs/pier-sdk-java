package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Configura\u00E7\u00E3o Rotativo
 **/

@ApiModel(description = "Configura\u00E7\u00E3o Rotativo")
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
   * C\u00F3digo de Identifica\u00E7\u00E3o do Produto (idProduto).
   **/
  public ConfiguracaoRotativoPersist idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Produto (idProduto).")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Quando verdadeiro, indica que o valor do rotativo deve compor a oferta de parcelamento.
   **/
  public ConfiguracaoRotativoPersist compoeOfertaValorRotativo(Boolean compoeOfertaValorRotativo) {
    this.compoeOfertaValorRotativo = compoeOfertaValorRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Quando verdadeiro, indica que o valor do rotativo deve compor a oferta de parcelamento.")
  @JsonProperty("compoeOfertaValorRotativo")
  public Boolean getCompoeOfertaValorRotativo() {
    return compoeOfertaValorRotativo;
  }
  public void setCompoeOfertaValorRotativo(Boolean compoeOfertaValorRotativo) {
    this.compoeOfertaValorRotativo = compoeOfertaValorRotativo;
  }

  
  /**
   * Quando verdadeiro, indica que o valor n\u00E3o financi\u00E1vel deve compor a oferta de parcelamento.
   **/
  public ConfiguracaoRotativoPersist compoeOfertaValorNaoFinanciavel(Boolean compoeOfertaValorNaoFinanciavel) {
    this.compoeOfertaValorNaoFinanciavel = compoeOfertaValorNaoFinanciavel;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Quando verdadeiro, indica que o valor n\u00E3o financi\u00E1vel deve compor a oferta de parcelamento.")
  @JsonProperty("compoeOfertaValorNaoFinanciavel")
  public Boolean getCompoeOfertaValorNaoFinanciavel() {
    return compoeOfertaValorNaoFinanciavel;
  }
  public void setCompoeOfertaValorNaoFinanciavel(Boolean compoeOfertaValorNaoFinanciavel) {
    this.compoeOfertaValorNaoFinanciavel = compoeOfertaValorNaoFinanciavel;
  }

  
  /**
   * Quando verdadeiro, indica que o valor de novos lan\u00E7amentos deve compor a oferta de parcelamento
   **/
  public ConfiguracaoRotativoPersist compoeOfertaValorNovosLancamentos(Boolean compoeOfertaValorNovosLancamentos) {
    this.compoeOfertaValorNovosLancamentos = compoeOfertaValorNovosLancamentos;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Quando verdadeiro, indica que o valor de novos lan\u00E7amentos deve compor a oferta de parcelamento")
  @JsonProperty("compoeOfertaValorNovosLancamentos")
  public Boolean getCompoeOfertaValorNovosLancamentos() {
    return compoeOfertaValorNovosLancamentos;
  }
  public void setCompoeOfertaValorNovosLancamentos(Boolean compoeOfertaValorNovosLancamentos) {
    this.compoeOfertaValorNovosLancamentos = compoeOfertaValorNovosLancamentos;
  }

  
  /**
   * Quando verdadeiro, indica que deve recalcular o parcelamento caso o valor pago de entrada seja maior que o valor esperado
   **/
  public ConfiguracaoRotativoPersist recalculaParcelamentoParaEntradaMaior(Boolean recalculaParcelamentoParaEntradaMaior) {
    this.recalculaParcelamentoParaEntradaMaior = recalculaParcelamentoParaEntradaMaior;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Quando verdadeiro, indica que deve recalcular o parcelamento caso o valor pago de entrada seja maior que o valor esperado")
  @JsonProperty("recalculaParcelamentoParaEntradaMaior")
  public Boolean getRecalculaParcelamentoParaEntradaMaior() {
    return recalculaParcelamentoParaEntradaMaior;
  }
  public void setRecalculaParcelamentoParaEntradaMaior(Boolean recalculaParcelamentoParaEntradaMaior) {
    this.recalculaParcelamentoParaEntradaMaior = recalculaParcelamentoParaEntradaMaior;
  }

  
  /**
   * Indica o m\u00EDnimo de parcelas que ser\u00E1 acatado no rec\u00E1lculo do parcelamento.
   **/
  public ConfiguracaoRotativoPersist minimoParcelasRecalculoParcelamento(Boolean minimoParcelasRecalculoParcelamento) {
    this.minimoParcelasRecalculoParcelamento = minimoParcelasRecalculoParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica o m\u00EDnimo de parcelas que ser\u00E1 acatado no rec\u00E1lculo do parcelamento.")
  @JsonProperty("minimoParcelasRecalculoParcelamento")
  public Boolean getMinimoParcelasRecalculoParcelamento() {
    return minimoParcelasRecalculoParcelamento;
  }
  public void setMinimoParcelasRecalculoParcelamento(Boolean minimoParcelasRecalculoParcelamento) {
    this.minimoParcelasRecalculoParcelamento = minimoParcelasRecalculoParcelamento;
  }

  
  /**
   * Quando verdadeiro, indica que o parcelamento deve ser recalculado caso o valor calculado da oferta seja inferior ao valor configurado m\u00EDnimo da parcela (valorMinimoParcela) e de percentual aberto
   **/
  public ConfiguracaoRotativoPersist recalculaParcelamento(Boolean recalculaParcelamento) {
    this.recalculaParcelamento = recalculaParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Quando verdadeiro, indica que o parcelamento deve ser recalculado caso o valor calculado da oferta seja inferior ao valor configurado m\u00EDnimo da parcela (valorMinimoParcela) e de percentual aberto")
  @JsonProperty("recalculaParcelamento")
  public Boolean getRecalculaParcelamento() {
    return recalculaParcelamento;
  }
  public void setRecalculaParcelamento(Boolean recalculaParcelamento) {
    this.recalculaParcelamento = recalculaParcelamento;
  }

  
  /**
   * N\u00FAmero m\u00EDnimo de parcelas que ser\u00E1 acatado no recalculo da oferta.
   **/
  public ConfiguracaoRotativoPersist numeroMinimoOfertas(Boolean numeroMinimoOfertas) {
    this.numeroMinimoOfertas = numeroMinimoOfertas;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "N\u00FAmero m\u00EDnimo de parcelas que ser\u00E1 acatado no recalculo da oferta.")
  @JsonProperty("numeroMinimoOfertas")
  public Boolean getNumeroMinimoOfertas() {
    return numeroMinimoOfertas;
  }
  public void setNumeroMinimoOfertas(Boolean numeroMinimoOfertas) {
    this.numeroMinimoOfertas = numeroMinimoOfertas;
  }

  
  /**
   * Quando verdadeiro, indica que valores pagos entre o valor da entrada e o m\u00EDnimo da fatura ser\u00E3o acatados para a ades\u00E3o ao parcelamento
   **/
  public ConfiguracaoRotativoPersist aceitaPagamentoMaiorQueEntrada(Boolean aceitaPagamentoMaiorQueEntrada) {
    this.aceitaPagamentoMaiorQueEntrada = aceitaPagamentoMaiorQueEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Quando verdadeiro, indica que valores pagos entre o valor da entrada e o m\u00EDnimo da fatura ser\u00E3o acatados para a ades\u00E3o ao parcelamento")
  @JsonProperty("aceitaPagamentoMaiorQueEntrada")
  public Boolean getAceitaPagamentoMaiorQueEntrada() {
    return aceitaPagamentoMaiorQueEntrada;
  }
  public void setAceitaPagamentoMaiorQueEntrada(Boolean aceitaPagamentoMaiorQueEntrada) {
    this.aceitaPagamentoMaiorQueEntrada = aceitaPagamentoMaiorQueEntrada;
  }

  
  /**
   * Quando verdadeiro, indica que deve-se incluir o valor presente dos parcelamentos em aberto.
   **/
  public ConfiguracaoRotativoPersist antecipaParcelamentosAbertos(Boolean antecipaParcelamentosAbertos) {
    this.antecipaParcelamentosAbertos = antecipaParcelamentosAbertos;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Quando verdadeiro, indica que deve-se incluir o valor presente dos parcelamentos em aberto.")
  @JsonProperty("antecipaParcelamentosAbertos")
  public Boolean getAntecipaParcelamentosAbertos() {
    return antecipaParcelamentosAbertos;
  }
  public void setAntecipaParcelamentosAbertos(Boolean antecipaParcelamentosAbertos) {
    this.antecipaParcelamentosAbertos = antecipaParcelamentosAbertos;
  }

  
  /**
   * Valor m\u00EDnimo da parcela que deve ser aceito na oferta.
   **/
  public ConfiguracaoRotativoPersist valorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00EDnimo da parcela que deve ser aceito na oferta.")
  @JsonProperty("valorMinimoParcela")
  public BigDecimal getValorMinimoParcela() {
    return valorMinimoParcela;
  }
  public void setValorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
  }

  
  /**
   * Percentual sobre os valores de parcelamento anteriores em aberto que deve ser considerado para limitar valorMinimoParcela.
   **/
  public ConfiguracaoRotativoPersist percentualLimitarValorMinimoParcela(BigDecimal percentualLimitarValorMinimoParcela) {
    this.percentualLimitarValorMinimoParcela = percentualLimitarValorMinimoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentual sobre os valores de parcelamento anteriores em aberto que deve ser considerado para limitar valorMinimoParcela.")
  @JsonProperty("percentualLimitarValorMinimoParcela")
  public BigDecimal getPercentualLimitarValorMinimoParcela() {
    return percentualLimitarValorMinimoParcela;
  }
  public void setPercentualLimitarValorMinimoParcela(BigDecimal percentualLimitarValorMinimoParcela) {
    this.percentualLimitarValorMinimoParcela = percentualLimitarValorMinimoParcela;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da regra de campanha.
   **/
  public ConfiguracaoRotativoPersist idRegraCampanha(Long idRegraCampanha) {
    this.idRegraCampanha = idRegraCampanha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da regra de campanha.")
  @JsonProperty("idRegraCampanha")
  public Long getIdRegraCampanha() {
    return idRegraCampanha;
  }
  public void setIdRegraCampanha(Long idRegraCampanha) {
    this.idRegraCampanha = idRegraCampanha;
  }

  
  /**
   * Quando verdadeiro, indica que parcelamento ofertado ter\u00E1 como valor base o valor m\u00EDnimo das transa\u00E7\u00F5es.
   **/
  public ConfiguracaoRotativoPersist parcelarApenasMinimo(Boolean parcelarApenasMinimo) {
    this.parcelarApenasMinimo = parcelarApenasMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Quando verdadeiro, indica que parcelamento ofertado ter\u00E1 como valor base o valor m\u00EDnimo das transa\u00E7\u00F5es.")
  @JsonProperty("parcelarApenasMinimo")
  public Boolean getParcelarApenasMinimo() {
    return parcelarApenasMinimo;
  }
  public void setParcelarApenasMinimo(Boolean parcelarApenasMinimo) {
    this.parcelarApenasMinimo = parcelarApenasMinimo;
  }

  
  /**
   * Nome do usu\u00E1rio
   **/
  public ConfiguracaoRotativoPersist usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do usu\u00E1rio")
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

