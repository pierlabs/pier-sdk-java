package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Object account
 **/

@ApiModel(description = "Object account")
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
   * Identification Code of the ConfigurationRevolving (id)
   **/
  public ConfiguracaoRotativoDetalheResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the ConfigurationRevolving (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Product (idProduct)
   **/
  public ConfiguracaoRotativoDetalheResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Product (idProduct)")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * When it is true, indicate that the value of the revolving must have the offer of the installment
   **/
  public ConfiguracaoRotativoDetalheResponse compoeOfertaValorRotativo(Boolean compoeOfertaValorRotativo) {
    this.compoeOfertaValorRotativo = compoeOfertaValorRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "When it is true, indicate that the value of the revolving must have the offer of the installment")
  @JsonProperty("compoeOfertaValorRotativo")
  public Boolean getCompoeOfertaValorRotativo() {
    return compoeOfertaValorRotativo;
  }
  public void setCompoeOfertaValorRotativo(Boolean compoeOfertaValorRotativo) {
    this.compoeOfertaValorRotativo = compoeOfertaValorRotativo;
  }

  
  /**
   * when it is true, indicate that the value not financigable must have the offer of installment
   **/
  public ConfiguracaoRotativoDetalheResponse compoeOfertaValorNaoFinanciavel(Boolean compoeOfertaValorNaoFinanciavel) {
    this.compoeOfertaValorNaoFinanciavel = compoeOfertaValorNaoFinanciavel;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "when it is true, indicate that the value not financigable must have the offer of installment")
  @JsonProperty("compoeOfertaValorNaoFinanciavel")
  public Boolean getCompoeOfertaValorNaoFinanciavel() {
    return compoeOfertaValorNaoFinanciavel;
  }
  public void setCompoeOfertaValorNaoFinanciavel(Boolean compoeOfertaValorNaoFinanciavel) {
    this.compoeOfertaValorNaoFinanciavel = compoeOfertaValorNaoFinanciavel;
  }

  
  /**
   * when it is true, indicate that the value of new postings must have the offer of installment
   **/
  public ConfiguracaoRotativoDetalheResponse compoeOfertaValorNovosLancamentos(Boolean compoeOfertaValorNovosLancamentos) {
    this.compoeOfertaValorNovosLancamentos = compoeOfertaValorNovosLancamentos;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "when it is true, indicate that the value of new postings must have the offer of installment")
  @JsonProperty("compoeOfertaValorNovosLancamentos")
  public Boolean getCompoeOfertaValorNovosLancamentos() {
    return compoeOfertaValorNovosLancamentos;
  }
  public void setCompoeOfertaValorNovosLancamentos(Boolean compoeOfertaValorNovosLancamentos) {
    this.compoeOfertaValorNovosLancamentos = compoeOfertaValorNovosLancamentos;
  }

  
  /**
   * When it is true, indicate that it must recalculate the installment in case of the value paid of entrance be bigger than the value awaited
   **/
  public ConfiguracaoRotativoDetalheResponse recalculaParcelamentoParaEntradaMaior(Boolean recalculaParcelamentoParaEntradaMaior) {
    this.recalculaParcelamentoParaEntradaMaior = recalculaParcelamentoParaEntradaMaior;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "When it is true, indicate that it must recalculate the installment in case of the value paid of entrance be bigger than the value awaited")
  @JsonProperty("recalculaParcelamentoParaEntradaMaior")
  public Boolean getRecalculaParcelamentoParaEntradaMaior() {
    return recalculaParcelamentoParaEntradaMaior;
  }
  public void setRecalculaParcelamentoParaEntradaMaior(Boolean recalculaParcelamentoParaEntradaMaior) {
    this.recalculaParcelamentoParaEntradaMaior = recalculaParcelamentoParaEntradaMaior;
  }

  
  /**
   * Indicate the minimum of the parcels that will be obeyed in the recalculation of the installment
   **/
  public ConfiguracaoRotativoDetalheResponse minimoParcelasRecalculoParcelamento(Boolean minimoParcelasRecalculoParcelamento) {
    this.minimoParcelasRecalculoParcelamento = minimoParcelasRecalculoParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indicate the minimum of the parcels that will be obeyed in the recalculation of the installment")
  @JsonProperty("minimoParcelasRecalculoParcelamento")
  public Boolean getMinimoParcelasRecalculoParcelamento() {
    return minimoParcelasRecalculoParcelamento;
  }
  public void setMinimoParcelasRecalculoParcelamento(Boolean minimoParcelasRecalculoParcelamento) {
    this.minimoParcelasRecalculoParcelamento = minimoParcelasRecalculoParcelamento;
  }

  
  /**
   * When it is true, indicate that the installment must be recalculated in case of the value calculated of the offer be less than the value configurated minimum of the invoioce (valueMinimumParcel) and the percentage opened
   **/
  public ConfiguracaoRotativoDetalheResponse recalculaParcelamento(Boolean recalculaParcelamento) {
    this.recalculaParcelamento = recalculaParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "When it is true, indicate that the installment must be recalculated in case of the value calculated of the offer be less than the value configurated minimum of the invoioce (valueMinimumParcel) and the percentage opened")
  @JsonProperty("recalculaParcelamento")
  public Boolean getRecalculaParcelamento() {
    return recalculaParcelamento;
  }
  public void setRecalculaParcelamento(Boolean recalculaParcelamento) {
    this.recalculaParcelamento = recalculaParcelamento;
  }

  
  /**
   * Minimum number of parcels that will be obeyed in the recalculation of the offer
   **/
  public ConfiguracaoRotativoDetalheResponse numeroMinimoOfertas(Boolean numeroMinimoOfertas) {
    this.numeroMinimoOfertas = numeroMinimoOfertas;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Minimum number of parcels that will be obeyed in the recalculation of the offer")
  @JsonProperty("numeroMinimoOfertas")
  public Boolean getNumeroMinimoOfertas() {
    return numeroMinimoOfertas;
  }
  public void setNumeroMinimoOfertas(Boolean numeroMinimoOfertas) {
    this.numeroMinimoOfertas = numeroMinimoOfertas;
  }

  
  /**
   * when it is true, indicate the paid values between the entrance value and the invoice minimum will be obeyed for the accession to the installment
   **/
  public ConfiguracaoRotativoDetalheResponse aceitaPagamentoMaiorQueEntrada(Boolean aceitaPagamentoMaiorQueEntrada) {
    this.aceitaPagamentoMaiorQueEntrada = aceitaPagamentoMaiorQueEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "when it is true, indicate the paid values between the entrance value and the invoice minimum will be obeyed for the accession to the installment")
  @JsonProperty("aceitaPagamentoMaiorQueEntrada")
  public Boolean getAceitaPagamentoMaiorQueEntrada() {
    return aceitaPagamentoMaiorQueEntrada;
  }
  public void setAceitaPagamentoMaiorQueEntrada(Boolean aceitaPagamentoMaiorQueEntrada) {
    this.aceitaPagamentoMaiorQueEntrada = aceitaPagamentoMaiorQueEntrada;
  }

  
  /**
   * When it is true, indicate that it must include the current values of the opened installment
   **/
  public ConfiguracaoRotativoDetalheResponse antecipaParcelamentosAbertos(Boolean antecipaParcelamentosAbertos) {
    this.antecipaParcelamentosAbertos = antecipaParcelamentosAbertos;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "When it is true, indicate that it must include the current values of the opened installment")
  @JsonProperty("antecipaParcelamentosAbertos")
  public Boolean getAntecipaParcelamentosAbertos() {
    return antecipaParcelamentosAbertos;
  }
  public void setAntecipaParcelamentosAbertos(Boolean antecipaParcelamentosAbertos) {
    this.antecipaParcelamentosAbertos = antecipaParcelamentosAbertos;
  }

  
  /**
   * Minimum value of the parcel that must be accepted in the offer
   **/
  public ConfiguracaoRotativoDetalheResponse valorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum value of the parcel that must be accepted in the offer")
  @JsonProperty("valorMinimoParcela")
  public BigDecimal getValorMinimoParcela() {
    return valorMinimoParcela;
  }
  public void setValorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
  }

  
  /**
   * Percentage on the values of previous installment opened that must be considered to limit valueMinimumParcel
   **/
  public ConfiguracaoRotativoDetalheResponse percentualLimitarValorMinimoParcela(BigDecimal percentualLimitarValorMinimoParcela) {
    this.percentualLimitarValorMinimoParcela = percentualLimitarValorMinimoParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage on the values of previous installment opened that must be considered to limit valueMinimumParcel")
  @JsonProperty("percentualLimitarValorMinimoParcela")
  public BigDecimal getPercentualLimitarValorMinimoParcela() {
    return percentualLimitarValorMinimoParcela;
  }
  public void setPercentualLimitarValorMinimoParcela(BigDecimal percentualLimitarValorMinimoParcela) {
    this.percentualLimitarValorMinimoParcela = percentualLimitarValorMinimoParcela;
  }

  
  /**
   * Identification Code of the Campaign Rule
   **/
  public ConfiguracaoRotativoDetalheResponse idRegraCampanha(Long idRegraCampanha) {
    this.idRegraCampanha = idRegraCampanha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Campaign Rule")
  @JsonProperty("idRegraCampanha")
  public Long getIdRegraCampanha() {
    return idRegraCampanha;
  }
  public void setIdRegraCampanha(Long idRegraCampanha) {
    this.idRegraCampanha = idRegraCampanha;
  }

  
  /**
   * When it is true, indicate the installment offered will have the minimum value of the transactions
   **/
  public ConfiguracaoRotativoDetalheResponse parcelarApenasMinimo(Boolean parcelarApenasMinimo) {
    this.parcelarApenasMinimo = parcelarApenasMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "When it is true, indicate the installment offered will have the minimum value of the transactions")
  @JsonProperty("parcelarApenasMinimo")
  public Boolean getParcelarApenasMinimo() {
    return parcelarApenasMinimo;
  }
  public void setParcelarApenasMinimo(Boolean parcelarApenasMinimo) {
    this.parcelarApenasMinimo = parcelarApenasMinimo;
  }

  
  /**
   * Username
   **/
  public ConfiguracaoRotativoDetalheResponse usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Username")
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

