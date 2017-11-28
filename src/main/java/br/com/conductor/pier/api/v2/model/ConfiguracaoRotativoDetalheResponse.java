package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * Objeto conta
 **/

@ApiModel(description = "Objeto conta")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConfiguracaoRotativoDetalheResponse   {
  
  private Long id = null;
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
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o de ConfiguracaoRotativo (id).
   **/
  public ConfiguracaoRotativoDetalheResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o de ConfiguracaoRotativo (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (idProduto).
   **/
  public ConfiguracaoRotativoDetalheResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (idProduto).")
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
  public ConfiguracaoRotativoDetalheResponse compoeOfertaValorRotativo(Boolean compoeOfertaValorRotativo) {
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
   * Quando verdadeiro, indica que o valor n\u00C3\u00A3o financi\u00C3\u00A1vel deve compor a oferta de parcelamento.
   **/
  public ConfiguracaoRotativoDetalheResponse compoeOfertaValorNaoFinanciavel(Boolean compoeOfertaValorNaoFinanciavel) {
    this.compoeOfertaValorNaoFinanciavel = compoeOfertaValorNaoFinanciavel;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Quando verdadeiro, indica que o valor n\u00C3\u00A3o financi\u00C3\u00A1vel deve compor a oferta de parcelamento.")
  @JsonProperty("compoeOfertaValorNaoFinanciavel")
  public Boolean getCompoeOfertaValorNaoFinanciavel() {
    return compoeOfertaValorNaoFinanciavel;
  }
  public void setCompoeOfertaValorNaoFinanciavel(Boolean compoeOfertaValorNaoFinanciavel) {
    this.compoeOfertaValorNaoFinanciavel = compoeOfertaValorNaoFinanciavel;
  }

  
  /**
   * Quando verdadeiro, indica que o valor de novos lan\u00C3\u00A7amentos deve compor a oferta de parcelamento
   **/
  public ConfiguracaoRotativoDetalheResponse compoeOfertaValorNovosLancamentos(Boolean compoeOfertaValorNovosLancamentos) {
    this.compoeOfertaValorNovosLancamentos = compoeOfertaValorNovosLancamentos;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Quando verdadeiro, indica que o valor de novos lan\u00C3\u00A7amentos deve compor a oferta de parcelamento")
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
  public ConfiguracaoRotativoDetalheResponse recalculaParcelamentoParaEntradaMaior(Boolean recalculaParcelamentoParaEntradaMaior) {
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
   * Indica o m\u00C3\u00ADnimo de parcelas que ser\u00C3\u00A1 acatado no rec\u00C3\u00A1lculo do parcelamento.
   **/
  public ConfiguracaoRotativoDetalheResponse minimoParcelasRecalculoParcelamento(Boolean minimoParcelasRecalculoParcelamento) {
    this.minimoParcelasRecalculoParcelamento = minimoParcelasRecalculoParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica o m\u00C3\u00ADnimo de parcelas que ser\u00C3\u00A1 acatado no rec\u00C3\u00A1lculo do parcelamento.")
  @JsonProperty("minimoParcelasRecalculoParcelamento")
  public Boolean getMinimoParcelasRecalculoParcelamento() {
    return minimoParcelasRecalculoParcelamento;
  }
  public void setMinimoParcelasRecalculoParcelamento(Boolean minimoParcelasRecalculoParcelamento) {
    this.minimoParcelasRecalculoParcelamento = minimoParcelasRecalculoParcelamento;
  }

  
  /**
   * Quando verdadeiro, indica que o parcelamento deve ser recalculado caso o valor calculado da oferta seja inferior ao valor configurado m\u00C3\u00ADnimo da parcela (valorMinimoParcela) e de percentual aberto
   **/
  public ConfiguracaoRotativoDetalheResponse recalculaParcelamento(Boolean recalculaParcelamento) {
    this.recalculaParcelamento = recalculaParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Quando verdadeiro, indica que o parcelamento deve ser recalculado caso o valor calculado da oferta seja inferior ao valor configurado m\u00C3\u00ADnimo da parcela (valorMinimoParcela) e de percentual aberto")
  @JsonProperty("recalculaParcelamento")
  public Boolean getRecalculaParcelamento() {
    return recalculaParcelamento;
  }
  public void setRecalculaParcelamento(Boolean recalculaParcelamento) {
    this.recalculaParcelamento = recalculaParcelamento;
  }

  
  /**
   * N\u00C3\u00BAmero m\u00C3\u00ADnimo de parcelas que ser\u00C3\u00A1 acatado no recalculo da oferta.
   **/
  public ConfiguracaoRotativoDetalheResponse numeroMinimoOfertas(Boolean numeroMinimoOfertas) {
    this.numeroMinimoOfertas = numeroMinimoOfertas;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "N\u00C3\u00BAmero m\u00C3\u00ADnimo de parcelas que ser\u00C3\u00A1 acatado no recalculo da oferta.")
  @JsonProperty("numeroMinimoOfertas")
  public Boolean getNumeroMinimoOfertas() {
    return numeroMinimoOfertas;
  }
  public void setNumeroMinimoOfertas(Boolean numeroMinimoOfertas) {
    this.numeroMinimoOfertas = numeroMinimoOfertas;
  }

  
  /**
   * Quando verdadeiro, indica que valores pagos entre o valor da entrada e o m\u00C3\u00ADnimo da fatura ser\u00C3\u00A3o acatados para a ades\u00C3\u00A3o ao parcelamento
   **/
  public ConfiguracaoRotativoDetalheResponse aceitaPagamentoMaiorQueEntrada(Boolean aceitaPagamentoMaiorQueEntrada) {
    this.aceitaPagamentoMaiorQueEntrada = aceitaPagamentoMaiorQueEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Quando verdadeiro, indica que valores pagos entre o valor da entrada e o m\u00C3\u00ADnimo da fatura ser\u00C3\u00A3o acatados para a ades\u00C3\u00A3o ao parcelamento")
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
  public ConfiguracaoRotativoDetalheResponse antecipaParcelamentosAbertos(Boolean antecipaParcelamentosAbertos) {
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
   * Valor m\u00C3\u00ADnimo da parcela que deve ser aceito na oferta.
   **/
  public ConfiguracaoRotativoDetalheResponse valorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00C3\u00ADnimo da parcela que deve ser aceito na oferta.")
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
  public ConfiguracaoRotativoDetalheResponse percentualLimitarValorMinimoParcela(BigDecimal percentualLimitarValorMinimoParcela) {
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
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da regra de campanha.
   **/
  public ConfiguracaoRotativoDetalheResponse idRegraCampanha(Long idRegraCampanha) {
    this.idRegraCampanha = idRegraCampanha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da regra de campanha.")
  @JsonProperty("idRegraCampanha")
  public Long getIdRegraCampanha() {
    return idRegraCampanha;
  }
  public void setIdRegraCampanha(Long idRegraCampanha) {
    this.idRegraCampanha = idRegraCampanha;
  }

  
  /**
   * Quando verdadeiro, indica que parcelamento ofertado ter\u00C3\u00A1 como valor base o valor m\u00C3\u00ADnimo das transa\u00C3\u00A7\u00C3\u00B5es.
   **/
  public ConfiguracaoRotativoDetalheResponse parcelarApenasMinimo(Boolean parcelarApenasMinimo) {
    this.parcelarApenasMinimo = parcelarApenasMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Quando verdadeiro, indica que parcelamento ofertado ter\u00C3\u00A1 como valor base o valor m\u00C3\u00ADnimo das transa\u00C3\u00A7\u00C3\u00B5es.")
  @JsonProperty("parcelarApenasMinimo")
  public Boolean getParcelarApenasMinimo() {
    return parcelarApenasMinimo;
  }
  public void setParcelarApenasMinimo(Boolean parcelarApenasMinimo) {
    this.parcelarApenasMinimo = parcelarApenasMinimo;
  }

  
  /**
   * Nome do usu\u00C3\u00A1rio.
   **/
  public ConfiguracaoRotativoDetalheResponse usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do usu\u00C3\u00A1rio.")
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
    ConfiguracaoRotativoDetalheResponse configuracaoRotativoDetalheResponse = (ConfiguracaoRotativoDetalheResponse) o;
    return Objects.equals(this.id, configuracaoRotativoDetalheResponse.id) &&
        Objects.equals(this.idProduto, configuracaoRotativoDetalheResponse.idProduto) &&
        Objects.equals(this.compoeOfertaValorRotativo, configuracaoRotativoDetalheResponse.compoeOfertaValorRotativo) &&
        Objects.equals(this.compoeOfertaValorNaoFinanciavel, configuracaoRotativoDetalheResponse.compoeOfertaValorNaoFinanciavel) &&
        Objects.equals(this.compoeOfertaValorNovosLancamentos, configuracaoRotativoDetalheResponse.compoeOfertaValorNovosLancamentos) &&
        Objects.equals(this.recalculaParcelamentoParaEntradaMaior, configuracaoRotativoDetalheResponse.recalculaParcelamentoParaEntradaMaior) &&
        Objects.equals(this.minimoParcelasRecalculoParcelamento, configuracaoRotativoDetalheResponse.minimoParcelasRecalculoParcelamento) &&
        Objects.equals(this.recalculaParcelamento, configuracaoRotativoDetalheResponse.recalculaParcelamento) &&
        Objects.equals(this.numeroMinimoOfertas, configuracaoRotativoDetalheResponse.numeroMinimoOfertas) &&
        Objects.equals(this.aceitaPagamentoMaiorQueEntrada, configuracaoRotativoDetalheResponse.aceitaPagamentoMaiorQueEntrada) &&
        Objects.equals(this.antecipaParcelamentosAbertos, configuracaoRotativoDetalheResponse.antecipaParcelamentosAbertos) &&
        Objects.equals(this.valorMinimoParcela, configuracaoRotativoDetalheResponse.valorMinimoParcela) &&
        Objects.equals(this.percentualLimitarValorMinimoParcela, configuracaoRotativoDetalheResponse.percentualLimitarValorMinimoParcela) &&
        Objects.equals(this.idRegraCampanha, configuracaoRotativoDetalheResponse.idRegraCampanha) &&
        Objects.equals(this.parcelarApenasMinimo, configuracaoRotativoDetalheResponse.parcelarApenasMinimo) &&
        Objects.equals(this.usuario, configuracaoRotativoDetalheResponse.usuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idProduto, compoeOfertaValorRotativo, compoeOfertaValorNaoFinanciavel, compoeOfertaValorNovosLancamentos, recalculaParcelamentoParaEntradaMaior, minimoParcelasRecalculoParcelamento, recalculaParcelamento, numeroMinimoOfertas, aceitaPagamentoMaiorQueEntrada, antecipaParcelamentosAbertos, valorMinimoParcela, percentualLimitarValorMinimoParcela, idRegraCampanha, parcelarApenasMinimo, usuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoRotativoDetalheResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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



