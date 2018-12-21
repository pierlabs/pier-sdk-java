package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Response Representation of the Operation resource
 **/

@ApiModel(description = "Response Representation of the Operation resource")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DetalheOperacaoResponse   {
  
  private Long idOperacao = null;
  private String codigoProcessamento = null;
  private String codigoProcessamentoCancelamento = null;
  private String nomeOperacao = null;
  private String descricaoOperacao = null;
  private Integer planoMinimo = null;
  private Integer planoMaximo = null;
  private BigDecimal valorMinimo = null;
  private BigDecimal valorMaximo = null;
  private Boolean flagCobraJuros = null;
  private BigDecimal taxaJuros = null;
  private Boolean flagCobraTarifa = null;
  private BigDecimal taxaTarifa = null;
  private BigDecimal valorTac = null;
  private BigDecimal percentualTac = null;
  private BigDecimal valorOperacao = null;
  private Integer carencia = null;
  private BigDecimal excedentePermitido = null;
  private Boolean flagPermitirParcelamento = null;
  private Boolean flagManterTaxaJurosNoRotativo = null;

  
  /**
   * Code that identifies the operation
   **/
  public DetalheOperacaoResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Code that identifies the operation")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Processing Code used in transactions with the authorizer
   **/
  public DetalheOperacaoResponse codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Processing Code used in transactions with the authorizer")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * Processing Code used to cancel the transactions in the authorizer
   **/
  public DetalheOperacaoResponse codigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Processing Code used to cancel the transactions in the authorizer")
  @JsonProperty("codigoProcessamentoCancelamento")
  public String getCodigoProcessamentoCancelamento() {
    return codigoProcessamentoCancelamento;
  }
  public void setCodigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
  }

  
  /**
   * Name of the operation
   **/
  public DetalheOperacaoResponse nomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the operation")
  @JsonProperty("nomeOperacao")
  public String getNomeOperacao() {
    return nomeOperacao;
  }
  public void setNomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
  }

  
  /**
   * Description of the operation
   **/
  public DetalheOperacaoResponse descricaoOperacao(String descricaoOperacao) {
    this.descricaoOperacao = descricaoOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the operation")
  @JsonProperty("descricaoOperacao")
  public String getDescricaoOperacao() {
    return descricaoOperacao;
  }
  public void setDescricaoOperacao(String descricaoOperacao) {
    this.descricaoOperacao = descricaoOperacao;
  }

  
  /**
   * Minimum quantity of the months allowed to the operation
   **/
  public DetalheOperacaoResponse planoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum quantity of the months allowed to the operation")
  @JsonProperty("planoMinimo")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * Maximum quantity of months allowed to the operation
   **/
  public DetalheOperacaoResponse planoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum quantity of months allowed to the operation")
  @JsonProperty("planoMaximo")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   * Valor m?nimo allowed to the operation
   **/
  public DetalheOperacaoResponse valorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m?nimo allowed to the operation")
  @JsonProperty("valorMinimo")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   * Maximum value allowed to the operation
   **/
  public DetalheOperacaoResponse valorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum value allowed to the operation")
  @JsonProperty("valorMaximo")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  
  /**
   * Indicative flag to charge the interest
   **/
  public DetalheOperacaoResponse flagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indicative flag to charge the interest")
  @JsonProperty("flagCobraJuros")
  public Boolean getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   * Value of the interest to be charged, in case of charging interest
   **/
  public DetalheOperacaoResponse taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the interest to be charged, in case of charging interest")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Flag indicative for the charginf of fees
   **/
  public DetalheOperacaoResponse flagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicative for the charginf of fees")
  @JsonProperty("flagCobraTarifa")
  public Boolean getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * Value of the fee to be charged, in case of the operation charges the fees
   **/
  public DetalheOperacaoResponse taxaTarifa(BigDecimal taxaTarifa) {
    this.taxaTarifa = taxaTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the fee to be charged, in case of the operation charges the fees")
  @JsonProperty("taxaTarifa")
  public BigDecimal getTaxaTarifa() {
    return taxaTarifa;
  }
  public void setTaxaTarifa(BigDecimal taxaTarifa) {
    this.taxaTarifa = taxaTarifa;
  }

  
  /**
   * taxe value of the openning account
   **/
  public DetalheOperacaoResponse valorTac(BigDecimal valorTac) {
    this.valorTac = valorTac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "taxe value of the openning account")
  @JsonProperty("valorTac")
  public BigDecimal getValorTac() {
    return valorTac;
  }
  public void setValorTac(BigDecimal valorTac) {
    this.valorTac = valorTac;
  }

  
  /**
   * Taxe percentage of the openning account
   **/
  public DetalheOperacaoResponse percentualTac(BigDecimal percentualTac) {
    this.percentualTac = percentualTac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxe percentage of the openning account")
  @JsonProperty("percentualTac")
  public BigDecimal getPercentualTac() {
    return percentualTac;
  }
  public void setPercentualTac(BigDecimal percentualTac) {
    this.percentualTac = percentualTac;
  }

  
  /**
   * Value of the operation
   **/
  public DetalheOperacaoResponse valorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the operation")
  @JsonProperty("valorOperacao")
  public BigDecimal getValorOperacao() {
    return valorOperacao;
  }
  public void setValorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
  }

  
  /**
   * Quantity of months for the lack
   **/
  public DetalheOperacaoResponse carencia(Integer carencia) {
    this.carencia = carencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantity of months for the lack")
  @JsonProperty("carencia")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   * Exceed allowed to the operation
   **/
  public DetalheOperacaoResponse excedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Exceed allowed to the operation")
  @JsonProperty("excedentePermitido")
  public BigDecimal getExcedentePermitido() {
    return excedentePermitido;
  }
  public void setExcedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
  }

  
  /**
   * Allow parceled transactions
   **/
  public DetalheOperacaoResponse flagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Allow parceled transactions")
  @JsonProperty("flagPermitirParcelamento")
  public Boolean getFlagPermitirParcelamento() {
    return flagPermitirParcelamento;
  }
  public void setFlagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
  }

  
  /**
   * Boolean that signals to all transactions of this operation type must use the purchase interest rate as the due balance interest rate
   **/
  public DetalheOperacaoResponse flagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Boolean that signals to all transactions of this operation type must use the purchase interest rate as the due balance interest rate")
  @JsonProperty("flagManterTaxaJurosNoRotativo")
  public Boolean getFlagManterTaxaJurosNoRotativo() {
    return flagManterTaxaJurosNoRotativo;
  }
  public void setFlagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalheOperacaoResponse detalheOperacaoResponse = (DetalheOperacaoResponse) o;
    return Objects.equals(this.idOperacao, detalheOperacaoResponse.idOperacao) &&
        Objects.equals(this.codigoProcessamento, detalheOperacaoResponse.codigoProcessamento) &&
        Objects.equals(this.codigoProcessamentoCancelamento, detalheOperacaoResponse.codigoProcessamentoCancelamento) &&
        Objects.equals(this.nomeOperacao, detalheOperacaoResponse.nomeOperacao) &&
        Objects.equals(this.descricaoOperacao, detalheOperacaoResponse.descricaoOperacao) &&
        Objects.equals(this.planoMinimo, detalheOperacaoResponse.planoMinimo) &&
        Objects.equals(this.planoMaximo, detalheOperacaoResponse.planoMaximo) &&
        Objects.equals(this.valorMinimo, detalheOperacaoResponse.valorMinimo) &&
        Objects.equals(this.valorMaximo, detalheOperacaoResponse.valorMaximo) &&
        Objects.equals(this.flagCobraJuros, detalheOperacaoResponse.flagCobraJuros) &&
        Objects.equals(this.taxaJuros, detalheOperacaoResponse.taxaJuros) &&
        Objects.equals(this.flagCobraTarifa, detalheOperacaoResponse.flagCobraTarifa) &&
        Objects.equals(this.taxaTarifa, detalheOperacaoResponse.taxaTarifa) &&
        Objects.equals(this.valorTac, detalheOperacaoResponse.valorTac) &&
        Objects.equals(this.percentualTac, detalheOperacaoResponse.percentualTac) &&
        Objects.equals(this.valorOperacao, detalheOperacaoResponse.valorOperacao) &&
        Objects.equals(this.carencia, detalheOperacaoResponse.carencia) &&
        Objects.equals(this.excedentePermitido, detalheOperacaoResponse.excedentePermitido) &&
        Objects.equals(this.flagPermitirParcelamento, detalheOperacaoResponse.flagPermitirParcelamento) &&
        Objects.equals(this.flagManterTaxaJurosNoRotativo, detalheOperacaoResponse.flagManterTaxaJurosNoRotativo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOperacao, codigoProcessamento, codigoProcessamentoCancelamento, nomeOperacao, descricaoOperacao, planoMinimo, planoMaximo, valorMinimo, valorMaximo, flagCobraJuros, taxaJuros, flagCobraTarifa, taxaTarifa, valorTac, percentualTac, valorOperacao, carencia, excedentePermitido, flagPermitirParcelamento, flagManterTaxaJurosNoRotativo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalheOperacaoResponse {\n");
    
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
    sb.append("    codigoProcessamento: ").append(toIndentedString(codigoProcessamento)).append("\n");
    sb.append("    codigoProcessamentoCancelamento: ").append(toIndentedString(codigoProcessamentoCancelamento)).append("\n");
    sb.append("    nomeOperacao: ").append(toIndentedString(nomeOperacao)).append("\n");
    sb.append("    descricaoOperacao: ").append(toIndentedString(descricaoOperacao)).append("\n");
    sb.append("    planoMinimo: ").append(toIndentedString(planoMinimo)).append("\n");
    sb.append("    planoMaximo: ").append(toIndentedString(planoMaximo)).append("\n");
    sb.append("    valorMinimo: ").append(toIndentedString(valorMinimo)).append("\n");
    sb.append("    valorMaximo: ").append(toIndentedString(valorMaximo)).append("\n");
    sb.append("    flagCobraJuros: ").append(toIndentedString(flagCobraJuros)).append("\n");
    sb.append("    taxaJuros: ").append(toIndentedString(taxaJuros)).append("\n");
    sb.append("    flagCobraTarifa: ").append(toIndentedString(flagCobraTarifa)).append("\n");
    sb.append("    taxaTarifa: ").append(toIndentedString(taxaTarifa)).append("\n");
    sb.append("    valorTac: ").append(toIndentedString(valorTac)).append("\n");
    sb.append("    percentualTac: ").append(toIndentedString(percentualTac)).append("\n");
    sb.append("    valorOperacao: ").append(toIndentedString(valorOperacao)).append("\n");
    sb.append("    carencia: ").append(toIndentedString(carencia)).append("\n");
    sb.append("    excedentePermitido: ").append(toIndentedString(excedentePermitido)).append("\n");
    sb.append("    flagPermitirParcelamento: ").append(toIndentedString(flagPermitirParcelamento)).append("\n");
    sb.append("    flagManterTaxaJurosNoRotativo: ").append(toIndentedString(flagManterTaxaJurosNoRotativo)).append("\n");
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

