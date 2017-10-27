package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de planos de parcelamento
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de planos de parcelamento")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoParcelamentoResponse   {
  
  private Long id = null;
  private String dataFechamentoFatura = null;
  private String dataVencimentoPadrao = null;
  private BigDecimal valorTotalFatura = null;
  private Integer quantidadeParcelas = null;
  private BigDecimal valorParcela = null;
  private BigDecimal valorEntrada = null;
  private BigDecimal taxaRefinanciamento = null;
  private BigDecimal custoEfetivoTotal = null;
  private BigDecimal valorTotalRefinanciamento = null;
  private BigDecimal valorIOF = null;
  private BigDecimal valorTAC = null;
  private Integer statusAdesao = null;
  private String dataInclusao = null;
  private String dataProcessamentoAdesao = null;
  private Long idConta = null;
  private String descricaoServicoTipo = null;
  private Boolean comEntrada = null;
  private String nomeCampanha = null;

  
  /**
   * Identificador do parcelamento
   **/
  public PlanoParcelamentoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do parcelamento")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Data de fechamento da fatura
   **/
  public PlanoParcelamentoResponse dataFechamentoFatura(String dataFechamentoFatura) {
    this.dataFechamentoFatura = dataFechamentoFatura;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de fechamento da fatura")
  @JsonProperty("dataFechamentoFatura")
  public String getDataFechamentoFatura() {
    return dataFechamentoFatura;
  }
  public void setDataFechamentoFatura(String dataFechamentoFatura) {
    this.dataFechamentoFatura = dataFechamentoFatura;
  }

  
  /**
   * Data de vencimento padr\u00C3\u00A3o
   **/
  public PlanoParcelamentoResponse dataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data de vencimento padr\u00C3\u00A3o")
  @JsonProperty("dataVencimentoPadrao")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * Valor total da fatura
   **/
  public PlanoParcelamentoResponse valorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total da fatura")
  @JsonProperty("valorTotalFatura")
  public BigDecimal getValorTotalFatura() {
    return valorTotalFatura;
  }
  public void setValorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
  }

  
  /**
   * Quantidade de parcelas
   **/
  public PlanoParcelamentoResponse quantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de parcelas")
  @JsonProperty("quantidadeParcelas")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Valor da parcela
   **/
  public PlanoParcelamentoResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da parcela")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Valor de entrada
   **/
  public PlanoParcelamentoResponse valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor de entrada")
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Taxa de refinanciamento
   **/
  public PlanoParcelamentoResponse taxaRefinanciamento(BigDecimal taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa de refinanciamento")
  @JsonProperty("taxaRefinanciamento")
  public BigDecimal getTaxaRefinanciamento() {
    return taxaRefinanciamento;
  }
  public void setTaxaRefinanciamento(BigDecimal taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
  }

  
  /**
   * Custo efetivo total
   **/
  public PlanoParcelamentoResponse custoEfetivoTotal(BigDecimal custoEfetivoTotal) {
    this.custoEfetivoTotal = custoEfetivoTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custo efetivo total")
  @JsonProperty("custoEfetivoTotal")
  public BigDecimal getCustoEfetivoTotal() {
    return custoEfetivoTotal;
  }
  public void setCustoEfetivoTotal(BigDecimal custoEfetivoTotal) {
    this.custoEfetivoTotal = custoEfetivoTotal;
  }

  
  /**
   * Valor total de refinanciamento
   **/
  public PlanoParcelamentoResponse valorTotalRefinanciamento(BigDecimal valorTotalRefinanciamento) {
    this.valorTotalRefinanciamento = valorTotalRefinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total de refinanciamento")
  @JsonProperty("valorTotalRefinanciamento")
  public BigDecimal getValorTotalRefinanciamento() {
    return valorTotalRefinanciamento;
  }
  public void setValorTotalRefinanciamento(BigDecimal valorTotalRefinanciamento) {
    this.valorTotalRefinanciamento = valorTotalRefinanciamento;
  }

  
  /**
   * Valor do IOF
   **/
  public PlanoParcelamentoResponse valorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do IOF")
  @JsonProperty("valorIOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Valor do TAC
   **/
  public PlanoParcelamentoResponse valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do TAC")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Status da ades\u00C3\u00A3o
   **/
  public PlanoParcelamentoResponse statusAdesao(Integer statusAdesao) {
    this.statusAdesao = statusAdesao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status da ades\u00C3\u00A3o")
  @JsonProperty("statusAdesao")
  public Integer getStatusAdesao() {
    return statusAdesao;
  }
  public void setStatusAdesao(Integer statusAdesao) {
    this.statusAdesao = statusAdesao;
  }

  
  /**
   * Data de inclus\u00C3\u00A3o
   **/
  public PlanoParcelamentoResponse dataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de inclus\u00C3\u00A3o")
  @JsonProperty("dataInclusao")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Data de processamento da ades\u00C3\u00A3o
   **/
  public PlanoParcelamentoResponse dataProcessamentoAdesao(String dataProcessamentoAdesao) {
    this.dataProcessamentoAdesao = dataProcessamentoAdesao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de processamento da ades\u00C3\u00A3o")
  @JsonProperty("dataProcessamentoAdesao")
  public String getDataProcessamentoAdesao() {
    return dataProcessamentoAdesao;
  }
  public void setDataProcessamentoAdesao(String dataProcessamentoAdesao) {
    this.dataProcessamentoAdesao = dataProcessamentoAdesao;
  }

  
  /**
   * Identificador da conta
   **/
  public PlanoParcelamentoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do tipo de servi\u00C3\u00A7o
   **/
  public PlanoParcelamentoResponse descricaoServicoTipo(String descricaoServicoTipo) {
    this.descricaoServicoTipo = descricaoServicoTipo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do tipo de servi\u00C3\u00A7o")
  @JsonProperty("descricaoServicoTipo")
  public String getDescricaoServicoTipo() {
    return descricaoServicoTipo;
  }
  public void setDescricaoServicoTipo(String descricaoServicoTipo) {
    this.descricaoServicoTipo = descricaoServicoTipo;
  }

  
  /**
   * Indica se a fatura foi com entrada
   **/
  public PlanoParcelamentoResponse comEntrada(Boolean comEntrada) {
    this.comEntrada = comEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se a fatura foi com entrada")
  @JsonProperty("comEntrada")
  public Boolean getComEntrada() {
    return comEntrada;
  }
  public void setComEntrada(Boolean comEntrada) {
    this.comEntrada = comEntrada;
  }

  
  /**
   * Nome da campanha
   **/
  public PlanoParcelamentoResponse nomeCampanha(String nomeCampanha) {
    this.nomeCampanha = nomeCampanha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da campanha")
  @JsonProperty("nomeCampanha")
  public String getNomeCampanha() {
    return nomeCampanha;
  }
  public void setNomeCampanha(String nomeCampanha) {
    this.nomeCampanha = nomeCampanha;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanoParcelamentoResponse planoParcelamentoResponse = (PlanoParcelamentoResponse) o;
    return Objects.equals(this.id, planoParcelamentoResponse.id) &&
        Objects.equals(this.dataFechamentoFatura, planoParcelamentoResponse.dataFechamentoFatura) &&
        Objects.equals(this.dataVencimentoPadrao, planoParcelamentoResponse.dataVencimentoPadrao) &&
        Objects.equals(this.valorTotalFatura, planoParcelamentoResponse.valorTotalFatura) &&
        Objects.equals(this.quantidadeParcelas, planoParcelamentoResponse.quantidadeParcelas) &&
        Objects.equals(this.valorParcela, planoParcelamentoResponse.valorParcela) &&
        Objects.equals(this.valorEntrada, planoParcelamentoResponse.valorEntrada) &&
        Objects.equals(this.taxaRefinanciamento, planoParcelamentoResponse.taxaRefinanciamento) &&
        Objects.equals(this.custoEfetivoTotal, planoParcelamentoResponse.custoEfetivoTotal) &&
        Objects.equals(this.valorTotalRefinanciamento, planoParcelamentoResponse.valorTotalRefinanciamento) &&
        Objects.equals(this.valorIOF, planoParcelamentoResponse.valorIOF) &&
        Objects.equals(this.valorTAC, planoParcelamentoResponse.valorTAC) &&
        Objects.equals(this.statusAdesao, planoParcelamentoResponse.statusAdesao) &&
        Objects.equals(this.dataInclusao, planoParcelamentoResponse.dataInclusao) &&
        Objects.equals(this.dataProcessamentoAdesao, planoParcelamentoResponse.dataProcessamentoAdesao) &&
        Objects.equals(this.idConta, planoParcelamentoResponse.idConta) &&
        Objects.equals(this.descricaoServicoTipo, planoParcelamentoResponse.descricaoServicoTipo) &&
        Objects.equals(this.comEntrada, planoParcelamentoResponse.comEntrada) &&
        Objects.equals(this.nomeCampanha, planoParcelamentoResponse.nomeCampanha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dataFechamentoFatura, dataVencimentoPadrao, valorTotalFatura, quantidadeParcelas, valorParcela, valorEntrada, taxaRefinanciamento, custoEfetivoTotal, valorTotalRefinanciamento, valorIOF, valorTAC, statusAdesao, dataInclusao, dataProcessamentoAdesao, idConta, descricaoServicoTipo, comEntrada, nomeCampanha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataFechamentoFatura: ").append(toIndentedString(dataFechamentoFatura)).append("\n");
    sb.append("    dataVencimentoPadrao: ").append(toIndentedString(dataVencimentoPadrao)).append("\n");
    sb.append("    valorTotalFatura: ").append(toIndentedString(valorTotalFatura)).append("\n");
    sb.append("    quantidadeParcelas: ").append(toIndentedString(quantidadeParcelas)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    valorEntrada: ").append(toIndentedString(valorEntrada)).append("\n");
    sb.append("    taxaRefinanciamento: ").append(toIndentedString(taxaRefinanciamento)).append("\n");
    sb.append("    custoEfetivoTotal: ").append(toIndentedString(custoEfetivoTotal)).append("\n");
    sb.append("    valorTotalRefinanciamento: ").append(toIndentedString(valorTotalRefinanciamento)).append("\n");
    sb.append("    valorIOF: ").append(toIndentedString(valorIOF)).append("\n");
    sb.append("    valorTAC: ").append(toIndentedString(valorTAC)).append("\n");
    sb.append("    statusAdesao: ").append(toIndentedString(statusAdesao)).append("\n");
    sb.append("    dataInclusao: ").append(toIndentedString(dataInclusao)).append("\n");
    sb.append("    dataProcessamentoAdesao: ").append(toIndentedString(dataProcessamentoAdesao)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    descricaoServicoTipo: ").append(toIndentedString(descricaoServicoTipo)).append("\n");
    sb.append("    comEntrada: ").append(toIndentedString(comEntrada)).append("\n");
    sb.append("    nomeCampanha: ").append(toIndentedString(nomeCampanha)).append("\n");
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



