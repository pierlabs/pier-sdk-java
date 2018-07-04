package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{plano_parcelamento_response_description}}}
 **/

@ApiModel(description = "{{{plano_parcelamento_response_description}}}")
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
  private Long idServicoTipo = null;
  private String descricaoServicoTipo = null;
  private Boolean comEntrada = null;
  private String nomeCampanha = null;

  
  /**
   * {{{plano_parcelamento_response_id_value}}}
   **/
  public PlanoParcelamentoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{plano_parcelamento_response_data_fechamento_fatura_value}}}
   **/
  public PlanoParcelamentoResponse dataFechamentoFatura(String dataFechamentoFatura) {
    this.dataFechamentoFatura = dataFechamentoFatura;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{plano_parcelamento_response_data_fechamento_fatura_value}}}")
  @JsonProperty("dataFechamentoFatura")
  public String getDataFechamentoFatura() {
    return dataFechamentoFatura;
  }
  public void setDataFechamentoFatura(String dataFechamentoFatura) {
    this.dataFechamentoFatura = dataFechamentoFatura;
  }

  
  /**
   * {{{plano_parcelamento_response_data_vencimento_padrao_value}}}
   **/
  public PlanoParcelamentoResponse dataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "{{{plano_parcelamento_response_data_vencimento_padrao_value}}}")
  @JsonProperty("dataVencimentoPadrao")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * {{{plano_parcelamento_response_valor_total_fatura_value}}}
   **/
  public PlanoParcelamentoResponse valorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_response_valor_total_fatura_value}}}")
  @JsonProperty("valorTotalFatura")
  public BigDecimal getValorTotalFatura() {
    return valorTotalFatura;
  }
  public void setValorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
  }

  
  /**
   * {{{plano_parcelamento_response_quantidade_parcelas_value}}}
   **/
  public PlanoParcelamentoResponse quantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_response_quantidade_parcelas_value}}}")
  @JsonProperty("quantidadeParcelas")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * {{{plano_parcelamento_response_valor_parcela_value}}}
   **/
  public PlanoParcelamentoResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_response_valor_parcela_value}}}")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * {{{plano_parcelamento_response_valor_entrada_value}}}
   **/
  public PlanoParcelamentoResponse valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_response_valor_entrada_value}}}")
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * {{{plano_parcelamento_response_taxa_refinanciamento_value}}}
   **/
  public PlanoParcelamentoResponse taxaRefinanciamento(BigDecimal taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_response_taxa_refinanciamento_value}}}")
  @JsonProperty("taxaRefinanciamento")
  public BigDecimal getTaxaRefinanciamento() {
    return taxaRefinanciamento;
  }
  public void setTaxaRefinanciamento(BigDecimal taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
  }

  
  /**
   * {{{plano_parcelamento_response_custo_efetivo_total_value}}}
   **/
  public PlanoParcelamentoResponse custoEfetivoTotal(BigDecimal custoEfetivoTotal) {
    this.custoEfetivoTotal = custoEfetivoTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_response_custo_efetivo_total_value}}}")
  @JsonProperty("custoEfetivoTotal")
  public BigDecimal getCustoEfetivoTotal() {
    return custoEfetivoTotal;
  }
  public void setCustoEfetivoTotal(BigDecimal custoEfetivoTotal) {
    this.custoEfetivoTotal = custoEfetivoTotal;
  }

  
  /**
   * {{{plano_parcelamento_response_valor_total_refinanciamento_value}}}
   **/
  public PlanoParcelamentoResponse valorTotalRefinanciamento(BigDecimal valorTotalRefinanciamento) {
    this.valorTotalRefinanciamento = valorTotalRefinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_response_valor_total_refinanciamento_value}}}")
  @JsonProperty("valorTotalRefinanciamento")
  public BigDecimal getValorTotalRefinanciamento() {
    return valorTotalRefinanciamento;
  }
  public void setValorTotalRefinanciamento(BigDecimal valorTotalRefinanciamento) {
    this.valorTotalRefinanciamento = valorTotalRefinanciamento;
  }

  
  /**
   * {{{plano_parcelamento_response_valor_i_o_f_value}}}
   **/
  public PlanoParcelamentoResponse valorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_response_valor_i_o_f_value}}}")
  @JsonProperty("valorIOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * {{{plano_parcelamento_response_valor_t_a_c_value}}}
   **/
  public PlanoParcelamentoResponse valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_response_valor_t_a_c_value}}}")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * {{{plano_parcelamento_response_status_adesao_value}}}
   **/
  public PlanoParcelamentoResponse statusAdesao(Integer statusAdesao) {
    this.statusAdesao = statusAdesao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_response_status_adesao_value}}}")
  @JsonProperty("statusAdesao")
  public Integer getStatusAdesao() {
    return statusAdesao;
  }
  public void setStatusAdesao(Integer statusAdesao) {
    this.statusAdesao = statusAdesao;
  }

  
  /**
   * {{{plano_parcelamento_response_data_inclusao_value}}}
   **/
  public PlanoParcelamentoResponse dataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{plano_parcelamento_response_data_inclusao_value}}}")
  @JsonProperty("dataInclusao")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * {{{plano_parcelamento_response_data_processamento_adesao_value}}}
   **/
  public PlanoParcelamentoResponse dataProcessamentoAdesao(String dataProcessamentoAdesao) {
    this.dataProcessamentoAdesao = dataProcessamentoAdesao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{plano_parcelamento_response_data_processamento_adesao_value}}}")
  @JsonProperty("dataProcessamentoAdesao")
  public String getDataProcessamentoAdesao() {
    return dataProcessamentoAdesao;
  }
  public void setDataProcessamentoAdesao(String dataProcessamentoAdesao) {
    this.dataProcessamentoAdesao = dataProcessamentoAdesao;
  }

  
  /**
   * {{{plano_parcelamento_response_id_conta_value}}}
   **/
  public PlanoParcelamentoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{plano_parcelamento_response_id_servico_tipo_value}}}
   **/
  public PlanoParcelamentoResponse idServicoTipo(Long idServicoTipo) {
    this.idServicoTipo = idServicoTipo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_response_id_servico_tipo_value}}}")
  @JsonProperty("idServicoTipo")
  public Long getIdServicoTipo() {
    return idServicoTipo;
  }
  public void setIdServicoTipo(Long idServicoTipo) {
    this.idServicoTipo = idServicoTipo;
  }

  
  /**
   * {{{plano_parcelamento_response_descricao_servico_tipo_value}}}
   **/
  public PlanoParcelamentoResponse descricaoServicoTipo(String descricaoServicoTipo) {
    this.descricaoServicoTipo = descricaoServicoTipo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_response_descricao_servico_tipo_value}}}")
  @JsonProperty("descricaoServicoTipo")
  public String getDescricaoServicoTipo() {
    return descricaoServicoTipo;
  }
  public void setDescricaoServicoTipo(String descricaoServicoTipo) {
    this.descricaoServicoTipo = descricaoServicoTipo;
  }

  
  /**
   * {{{plano_parcelamento_response_com_entrada_value}}}
   **/
  public PlanoParcelamentoResponse comEntrada(Boolean comEntrada) {
    this.comEntrada = comEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{plano_parcelamento_response_com_entrada_value}}}")
  @JsonProperty("comEntrada")
  public Boolean getComEntrada() {
    return comEntrada;
  }
  public void setComEntrada(Boolean comEntrada) {
    this.comEntrada = comEntrada;
  }

  
  /**
   * {{{plano_parcelamento_response_nome_campanha_value}}}
   **/
  public PlanoParcelamentoResponse nomeCampanha(String nomeCampanha) {
    this.nomeCampanha = nomeCampanha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_parcelamento_response_nome_campanha_value}}}")
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
        Objects.equals(this.idServicoTipo, planoParcelamentoResponse.idServicoTipo) &&
        Objects.equals(this.descricaoServicoTipo, planoParcelamentoResponse.descricaoServicoTipo) &&
        Objects.equals(this.comEntrada, planoParcelamentoResponse.comEntrada) &&
        Objects.equals(this.nomeCampanha, planoParcelamentoResponse.nomeCampanha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dataFechamentoFatura, dataVencimentoPadrao, valorTotalFatura, quantidadeParcelas, valorParcela, valorEntrada, taxaRefinanciamento, custoEfetivoTotal, valorTotalRefinanciamento, valorIOF, valorTAC, statusAdesao, dataInclusao, dataProcessamentoAdesao, idConta, idServicoTipo, descricaoServicoTipo, comEntrada, nomeCampanha);
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
    sb.append("    idServicoTipo: ").append(toIndentedString(idServicoTipo)).append("\n");
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



