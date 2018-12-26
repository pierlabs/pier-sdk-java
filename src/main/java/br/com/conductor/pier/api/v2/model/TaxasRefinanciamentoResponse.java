package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de resposta para a valida\u00E7\u00E3o das Taxas de Refinanciamento
 **/

@ApiModel(description = "Objeto de resposta para a valida\u00E7\u00E3o das Taxas de Refinanciamento")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TaxasRefinanciamentoResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Long idProduto = null;
  private Long idPlanoConta = null;
  private Long idPlanoPct = null;
  private Long idPlanoCreditoTaxa = null;
  private String dataEntrada = null;
  private String vencimento = null;
  private BigDecimal recuperacaoEncargosFinanceiros = null;
  private BigDecimal comissaoGarantia = null;
  private BigDecimal agenciamento = null;
  private BigDecimal taxaMaximaProximoPeriodo = null;
  private BigDecimal taxaEncargosFinanciamento = null;
  private BigDecimal taxaMaximaSaque = null;
  private BigDecimal taxaSaque = null;
  private BigDecimal taxaMaximaCompraJuros = null;
  private BigDecimal taxaCompraJuros = null;
  private BigDecimal taxaPermanencia = null;
  private BigDecimal taxaRefinanciamento = null;
  private BigDecimal taxaRecuperacaoRefinanciamento = null;
  private BigDecimal taxaPercCalcPagamentoMinimo = null;
  private Integer planoTaxaDefault = null;

  
  /**
   * ID das taxas
   **/
  public TaxasRefinanciamentoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID das taxas")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * ID da conta
   **/
  public TaxasRefinanciamentoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * ID do produto
   **/
  public TaxasRefinanciamentoResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID do produto")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * ID do plano de contas
   **/
  public TaxasRefinanciamentoResponse idPlanoConta(Long idPlanoConta) {
    this.idPlanoConta = idPlanoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID do plano de contas")
  @JsonProperty("idPlanoConta")
  public Long getIdPlanoConta() {
    return idPlanoConta;
  }
  public void setIdPlanoConta(Long idPlanoConta) {
    this.idPlanoConta = idPlanoConta;
  }

  
  /**
   * ID do plano PCT
   **/
  public TaxasRefinanciamentoResponse idPlanoPct(Long idPlanoPct) {
    this.idPlanoPct = idPlanoPct;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID do plano PCT")
  @JsonProperty("idPlanoPct")
  public Long getIdPlanoPct() {
    return idPlanoPct;
  }
  public void setIdPlanoPct(Long idPlanoPct) {
    this.idPlanoPct = idPlanoPct;
  }

  
  /**
   * ID do plano credito taxa
   **/
  public TaxasRefinanciamentoResponse idPlanoCreditoTaxa(Long idPlanoCreditoTaxa) {
    this.idPlanoCreditoTaxa = idPlanoCreditoTaxa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID do plano credito taxa")
  @JsonProperty("idPlanoCreditoTaxa")
  public Long getIdPlanoCreditoTaxa() {
    return idPlanoCreditoTaxa;
  }
  public void setIdPlanoCreditoTaxa(Long idPlanoCreditoTaxa) {
    this.idPlanoCreditoTaxa = idPlanoCreditoTaxa;
  }

  
  /**
   * Data de entrada
   **/
  public TaxasRefinanciamentoResponse dataEntrada(String dataEntrada) {
    this.dataEntrada = dataEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de entrada")
  @JsonProperty("dataEntrada")
  public String getDataEntrada() {
    return dataEntrada;
  }
  public void setDataEntrada(String dataEntrada) {
    this.dataEntrada = dataEntrada;
  }

  
  /**
   * Vencimento das taxas
   **/
  public TaxasRefinanciamentoResponse vencimento(String vencimento) {
    this.vencimento = vencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Vencimento das taxas")
  @JsonProperty("vencimento")
  public String getVencimento() {
    return vencimento;
  }
  public void setVencimento(String vencimento) {
    this.vencimento = vencimento;
  }

  
  /**
   * Recupera\u00E7\u00E3o de encargos financeiro
   **/
  public TaxasRefinanciamentoResponse recuperacaoEncargosFinanceiros(BigDecimal recuperacaoEncargosFinanceiros) {
    this.recuperacaoEncargosFinanceiros = recuperacaoEncargosFinanceiros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Recupera\u00E7\u00E3o de encargos financeiro")
  @JsonProperty("recuperacaoEncargosFinanceiros")
  public BigDecimal getRecuperacaoEncargosFinanceiros() {
    return recuperacaoEncargosFinanceiros;
  }
  public void setRecuperacaoEncargosFinanceiros(BigDecimal recuperacaoEncargosFinanceiros) {
    this.recuperacaoEncargosFinanceiros = recuperacaoEncargosFinanceiros;
  }

  
  /**
   * Descri\u00E7\u00E3o da comiss\u00E3o de garantia
   **/
  public TaxasRefinanciamentoResponse comissaoGarantia(BigDecimal comissaoGarantia) {
    this.comissaoGarantia = comissaoGarantia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o da comiss\u00E3o de garantia")
  @JsonProperty("comissaoGarantia")
  public BigDecimal getComissaoGarantia() {
    return comissaoGarantia;
  }
  public void setComissaoGarantia(BigDecimal comissaoGarantia) {
    this.comissaoGarantia = comissaoGarantia;
  }

  
  /**
   * Descri\u00E7\u00E3o do agenciamento
   **/
  public TaxasRefinanciamentoResponse agenciamento(BigDecimal agenciamento) {
    this.agenciamento = agenciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do agenciamento")
  @JsonProperty("agenciamento")
  public BigDecimal getAgenciamento() {
    return agenciamento;
  }
  public void setAgenciamento(BigDecimal agenciamento) {
    this.agenciamento = agenciamento;
  }

  
  /**
   * Taxa m\u00E1xima do proximo per\u00EDodo
   **/
  public TaxasRefinanciamentoResponse taxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa m\u00E1xima do proximo per\u00EDodo")
  @JsonProperty("taxaMaximaProximoPeriodo")
  public BigDecimal getTaxaMaximaProximoPeriodo() {
    return taxaMaximaProximoPeriodo;
  }
  public void setTaxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
  }

  
  /**
   * Taxa de encargos do financiamento
   **/
  public TaxasRefinanciamentoResponse taxaEncargosFinanciamento(BigDecimal taxaEncargosFinanciamento) {
    this.taxaEncargosFinanciamento = taxaEncargosFinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa de encargos do financiamento")
  @JsonProperty("taxaEncargosFinanciamento")
  public BigDecimal getTaxaEncargosFinanciamento() {
    return taxaEncargosFinanciamento;
  }
  public void setTaxaEncargosFinanciamento(BigDecimal taxaEncargosFinanciamento) {
    this.taxaEncargosFinanciamento = taxaEncargosFinanciamento;
  }

  
  /**
   * Taxa m\u00E1xima de saque
   **/
  public TaxasRefinanciamentoResponse taxaMaximaSaque(BigDecimal taxaMaximaSaque) {
    this.taxaMaximaSaque = taxaMaximaSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa m\u00E1xima de saque")
  @JsonProperty("taxaMaximaSaque")
  public BigDecimal getTaxaMaximaSaque() {
    return taxaMaximaSaque;
  }
  public void setTaxaMaximaSaque(BigDecimal taxaMaximaSaque) {
    this.taxaMaximaSaque = taxaMaximaSaque;
  }

  
  /**
   * Taxa de saque
   **/
  public TaxasRefinanciamentoResponse taxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa de saque")
  @JsonProperty("taxaSaque")
  public BigDecimal getTaxaSaque() {
    return taxaSaque;
  }
  public void setTaxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
  }

  
  /**
   * Taxa m\u00E1xima de compras juros
   **/
  public TaxasRefinanciamentoResponse taxaMaximaCompraJuros(BigDecimal taxaMaximaCompraJuros) {
    this.taxaMaximaCompraJuros = taxaMaximaCompraJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa m\u00E1xima de compras juros")
  @JsonProperty("taxaMaximaCompraJuros")
  public BigDecimal getTaxaMaximaCompraJuros() {
    return taxaMaximaCompraJuros;
  }
  public void setTaxaMaximaCompraJuros(BigDecimal taxaMaximaCompraJuros) {
    this.taxaMaximaCompraJuros = taxaMaximaCompraJuros;
  }

  
  /**
   * Taxa de juros compra
   **/
  public TaxasRefinanciamentoResponse taxaCompraJuros(BigDecimal taxaCompraJuros) {
    this.taxaCompraJuros = taxaCompraJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa de juros compra")
  @JsonProperty("taxaCompraJuros")
  public BigDecimal getTaxaCompraJuros() {
    return taxaCompraJuros;
  }
  public void setTaxaCompraJuros(BigDecimal taxaCompraJuros) {
    this.taxaCompraJuros = taxaCompraJuros;
  }

  
  /**
   * Taxa de permanencia
   **/
  public TaxasRefinanciamentoResponse taxaPermanencia(BigDecimal taxaPermanencia) {
    this.taxaPermanencia = taxaPermanencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa de permanencia")
  @JsonProperty("taxaPermanencia")
  public BigDecimal getTaxaPermanencia() {
    return taxaPermanencia;
  }
  public void setTaxaPermanencia(BigDecimal taxaPermanencia) {
    this.taxaPermanencia = taxaPermanencia;
  }

  
  /**
   * Taxa de permanencia
   **/
  public TaxasRefinanciamentoResponse taxaRefinanciamento(BigDecimal taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa de permanencia")
  @JsonProperty("taxaRefinanciamento")
  public BigDecimal getTaxaRefinanciamento() {
    return taxaRefinanciamento;
  }
  public void setTaxaRefinanciamento(BigDecimal taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
  }

  
  /**
   * Taxa de permanencia
   **/
  public TaxasRefinanciamentoResponse taxaRecuperacaoRefinanciamento(BigDecimal taxaRecuperacaoRefinanciamento) {
    this.taxaRecuperacaoRefinanciamento = taxaRecuperacaoRefinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa de permanencia")
  @JsonProperty("taxaRecuperacaoRefinanciamento")
  public BigDecimal getTaxaRecuperacaoRefinanciamento() {
    return taxaRecuperacaoRefinanciamento;
  }
  public void setTaxaRecuperacaoRefinanciamento(BigDecimal taxaRecuperacaoRefinanciamento) {
    this.taxaRecuperacaoRefinanciamento = taxaRecuperacaoRefinanciamento;
  }

  
  /**
   * Taxa Percelamento pagamento minimo
   **/
  public TaxasRefinanciamentoResponse taxaPercCalcPagamentoMinimo(BigDecimal taxaPercCalcPagamentoMinimo) {
    this.taxaPercCalcPagamentoMinimo = taxaPercCalcPagamentoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa Percelamento pagamento minimo")
  @JsonProperty("taxaPercCalcPagamentoMinimo")
  public BigDecimal getTaxaPercCalcPagamentoMinimo() {
    return taxaPercCalcPagamentoMinimo;
  }
  public void setTaxaPercCalcPagamentoMinimo(BigDecimal taxaPercCalcPagamentoMinimo) {
    this.taxaPercCalcPagamentoMinimo = taxaPercCalcPagamentoMinimo;
  }

  
  /**
   * Plano de taxa padr\u00E3o
   **/
  public TaxasRefinanciamentoResponse planoTaxaDefault(Integer planoTaxaDefault) {
    this.planoTaxaDefault = planoTaxaDefault;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Plano de taxa padr\u00E3o")
  @JsonProperty("planoTaxaDefault")
  public Integer getPlanoTaxaDefault() {
    return planoTaxaDefault;
  }
  public void setPlanoTaxaDefault(Integer planoTaxaDefault) {
    this.planoTaxaDefault = planoTaxaDefault;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxasRefinanciamentoResponse taxasRefinanciamentoResponse = (TaxasRefinanciamentoResponse) o;
    return Objects.equals(this.id, taxasRefinanciamentoResponse.id) &&
        Objects.equals(this.idConta, taxasRefinanciamentoResponse.idConta) &&
        Objects.equals(this.idProduto, taxasRefinanciamentoResponse.idProduto) &&
        Objects.equals(this.idPlanoConta, taxasRefinanciamentoResponse.idPlanoConta) &&
        Objects.equals(this.idPlanoPct, taxasRefinanciamentoResponse.idPlanoPct) &&
        Objects.equals(this.idPlanoCreditoTaxa, taxasRefinanciamentoResponse.idPlanoCreditoTaxa) &&
        Objects.equals(this.dataEntrada, taxasRefinanciamentoResponse.dataEntrada) &&
        Objects.equals(this.vencimento, taxasRefinanciamentoResponse.vencimento) &&
        Objects.equals(this.recuperacaoEncargosFinanceiros, taxasRefinanciamentoResponse.recuperacaoEncargosFinanceiros) &&
        Objects.equals(this.comissaoGarantia, taxasRefinanciamentoResponse.comissaoGarantia) &&
        Objects.equals(this.agenciamento, taxasRefinanciamentoResponse.agenciamento) &&
        Objects.equals(this.taxaMaximaProximoPeriodo, taxasRefinanciamentoResponse.taxaMaximaProximoPeriodo) &&
        Objects.equals(this.taxaEncargosFinanciamento, taxasRefinanciamentoResponse.taxaEncargosFinanciamento) &&
        Objects.equals(this.taxaMaximaSaque, taxasRefinanciamentoResponse.taxaMaximaSaque) &&
        Objects.equals(this.taxaSaque, taxasRefinanciamentoResponse.taxaSaque) &&
        Objects.equals(this.taxaMaximaCompraJuros, taxasRefinanciamentoResponse.taxaMaximaCompraJuros) &&
        Objects.equals(this.taxaCompraJuros, taxasRefinanciamentoResponse.taxaCompraJuros) &&
        Objects.equals(this.taxaPermanencia, taxasRefinanciamentoResponse.taxaPermanencia) &&
        Objects.equals(this.taxaRefinanciamento, taxasRefinanciamentoResponse.taxaRefinanciamento) &&
        Objects.equals(this.taxaRecuperacaoRefinanciamento, taxasRefinanciamentoResponse.taxaRecuperacaoRefinanciamento) &&
        Objects.equals(this.taxaPercCalcPagamentoMinimo, taxasRefinanciamentoResponse.taxaPercCalcPagamentoMinimo) &&
        Objects.equals(this.planoTaxaDefault, taxasRefinanciamentoResponse.planoTaxaDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, idProduto, idPlanoConta, idPlanoPct, idPlanoCreditoTaxa, dataEntrada, vencimento, recuperacaoEncargosFinanceiros, comissaoGarantia, agenciamento, taxaMaximaProximoPeriodo, taxaEncargosFinanciamento, taxaMaximaSaque, taxaSaque, taxaMaximaCompraJuros, taxaCompraJuros, taxaPermanencia, taxaRefinanciamento, taxaRecuperacaoRefinanciamento, taxaPercCalcPagamentoMinimo, planoTaxaDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxasRefinanciamentoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idPlanoConta: ").append(toIndentedString(idPlanoConta)).append("\n");
    sb.append("    idPlanoPct: ").append(toIndentedString(idPlanoPct)).append("\n");
    sb.append("    idPlanoCreditoTaxa: ").append(toIndentedString(idPlanoCreditoTaxa)).append("\n");
    sb.append("    dataEntrada: ").append(toIndentedString(dataEntrada)).append("\n");
    sb.append("    vencimento: ").append(toIndentedString(vencimento)).append("\n");
    sb.append("    recuperacaoEncargosFinanceiros: ").append(toIndentedString(recuperacaoEncargosFinanceiros)).append("\n");
    sb.append("    comissaoGarantia: ").append(toIndentedString(comissaoGarantia)).append("\n");
    sb.append("    agenciamento: ").append(toIndentedString(agenciamento)).append("\n");
    sb.append("    taxaMaximaProximoPeriodo: ").append(toIndentedString(taxaMaximaProximoPeriodo)).append("\n");
    sb.append("    taxaEncargosFinanciamento: ").append(toIndentedString(taxaEncargosFinanciamento)).append("\n");
    sb.append("    taxaMaximaSaque: ").append(toIndentedString(taxaMaximaSaque)).append("\n");
    sb.append("    taxaSaque: ").append(toIndentedString(taxaSaque)).append("\n");
    sb.append("    taxaMaximaCompraJuros: ").append(toIndentedString(taxaMaximaCompraJuros)).append("\n");
    sb.append("    taxaCompraJuros: ").append(toIndentedString(taxaCompraJuros)).append("\n");
    sb.append("    taxaPermanencia: ").append(toIndentedString(taxaPermanencia)).append("\n");
    sb.append("    taxaRefinanciamento: ").append(toIndentedString(taxaRefinanciamento)).append("\n");
    sb.append("    taxaRecuperacaoRefinanciamento: ").append(toIndentedString(taxaRecuperacaoRefinanciamento)).append("\n");
    sb.append("    taxaPercCalcPagamentoMinimo: ").append(toIndentedString(taxaPercCalcPagamentoMinimo)).append("\n");
    sb.append("    planoTaxaDefault: ").append(toIndentedString(planoTaxaDefault)).append("\n");
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

