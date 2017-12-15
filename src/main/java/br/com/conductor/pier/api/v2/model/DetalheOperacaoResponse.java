package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Operacao
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Operacao")
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

  
  /**
   * C\u00C3\u00B3digo que identifica a opera\u00C3\u00A7\u00C3\u00A3o
   **/
  public DetalheOperacaoResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo que identifica a opera\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * C\u00C3\u00B3digo de processamento usado em transa\u00C3\u00A7\u00C3\u00B5es com o autorizador
   **/
  public DetalheOperacaoResponse codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de processamento usado em transa\u00C3\u00A7\u00C3\u00B5es com o autorizador")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * C\u00C3\u00B3digo de processamento usado para cancelar transa\u00C3\u00A7\u00C3\u00B5es no autorizador
   **/
  public DetalheOperacaoResponse codigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de processamento usado para cancelar transa\u00C3\u00A7\u00C3\u00B5es no autorizador")
  @JsonProperty("codigoProcessamentoCancelamento")
  public String getCodigoProcessamentoCancelamento() {
    return codigoProcessamentoCancelamento;
  }
  public void setCodigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
  }

  
  /**
   * Nome da opera\u00C3\u00A7\u00C3\u00A3o
   **/
  public DetalheOperacaoResponse nomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da opera\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("nomeOperacao")
  public String getNomeOperacao() {
    return nomeOperacao;
  }
  public void setNomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o da opera\u00C3\u00A7\u00C3\u00A3o
   **/
  public DetalheOperacaoResponse descricaoOperacao(String descricaoOperacao) {
    this.descricaoOperacao = descricaoOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o da opera\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("descricaoOperacao")
  public String getDescricaoOperacao() {
    return descricaoOperacao;
  }
  public void setDescricaoOperacao(String descricaoOperacao) {
    this.descricaoOperacao = descricaoOperacao;
  }

  
  /**
   * Quantidade m\u00C3\u00ADnima de meses permitido para opera\u00C3\u00A7\u00C3\u00A3o
   **/
  public DetalheOperacaoResponse planoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade m\u00C3\u00ADnima de meses permitido para opera\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("planoMinimo")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * Quantidade M\u00C3\u00A1ximo de meses permitido para opera\u00C3\u00A7\u00C3\u00A3o
   **/
  public DetalheOperacaoResponse planoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade M\u00C3\u00A1ximo de meses permitido para opera\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("planoMaximo")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   *  Valor m\u00C3\u00ADnimo permitido permitido para opera\u00C3\u00A7\u00C3\u00A3o
   **/
  public DetalheOperacaoResponse valorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = " Valor m\u00C3\u00ADnimo permitido permitido para opera\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("valorMinimo")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   *  Valor m\u00C3\u00A1ximo permitido permitido para opera\u00C3\u00A7\u00C3\u00A3o
   **/
  public DetalheOperacaoResponse valorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = " Valor m\u00C3\u00A1ximo permitido permitido para opera\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("valorMaximo")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  
  /**
   * Flag indicativa para crobran\u00C3\u00A7a de juros
   **/
  public DetalheOperacaoResponse flagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicativa para crobran\u00C3\u00A7a de juros")
  @JsonProperty("flagCobraJuros")
  public Boolean getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   * Valor do juros a ser cobrado, caso opera\u00C3\u00A7\u00C3\u00A3o cobre juros
   **/
  public DetalheOperacaoResponse taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do juros a ser cobrado, caso opera\u00C3\u00A7\u00C3\u00A3o cobre juros")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Flag indicativa para crobran\u00C3\u00A7a de tarifas
   **/
  public DetalheOperacaoResponse flagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicativa para crobran\u00C3\u00A7a de tarifas")
  @JsonProperty("flagCobraTarifa")
  public Boolean getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * Valor da tarifa a ser cobrado, caso opera\u00C3\u00A7\u00C3\u00A3o cobre tarifas
   **/
  public DetalheOperacaoResponse taxaTarifa(BigDecimal taxaTarifa) {
    this.taxaTarifa = taxaTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da tarifa a ser cobrado, caso opera\u00C3\u00A7\u00C3\u00A3o cobre tarifas")
  @JsonProperty("taxaTarifa")
  public BigDecimal getTaxaTarifa() {
    return taxaTarifa;
  }
  public void setTaxaTarifa(BigDecimal taxaTarifa) {
    this.taxaTarifa = taxaTarifa;
  }

  
  /**
   * Valor da taxa de abertura de conta
   **/
  public DetalheOperacaoResponse valorTac(BigDecimal valorTac) {
    this.valorTac = valorTac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da taxa de abertura de conta")
  @JsonProperty("valorTac")
  public BigDecimal getValorTac() {
    return valorTac;
  }
  public void setValorTac(BigDecimal valorTac) {
    this.valorTac = valorTac;
  }

  
  /**
   * Percentual da taxa de abertura de conta
   **/
  public DetalheOperacaoResponse percentualTac(BigDecimal percentualTac) {
    this.percentualTac = percentualTac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentual da taxa de abertura de conta")
  @JsonProperty("percentualTac")
  public BigDecimal getPercentualTac() {
    return percentualTac;
  }
  public void setPercentualTac(BigDecimal percentualTac) {
    this.percentualTac = percentualTac;
  }

  
  /**
   * Valor da opera\u00C3\u00A7\u00C3\u00A3o
   **/
  public DetalheOperacaoResponse valorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da opera\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("valorOperacao")
  public BigDecimal getValorOperacao() {
    return valorOperacao;
  }
  public void setValorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
  }

  
  /**
   * Quantidade de meses para car\u00C3\u00AAncia
   **/
  public DetalheOperacaoResponse carencia(Integer carencia) {
    this.carencia = carencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de meses para car\u00C3\u00AAncia")
  @JsonProperty("carencia")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   * Valor excedente permitido para opera\u00C3\u00A7\u00C3\u00A3o
   **/
  public DetalheOperacaoResponse excedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor excedente permitido para opera\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("excedentePermitido")
  public BigDecimal getExcedentePermitido() {
    return excedentePermitido;
  }
  public void setExcedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
  }

  
  /**
   * Permitir transa\u00C3\u00A7\u00C3\u00B5es parceladas
   **/
  public DetalheOperacaoResponse flagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Permitir transa\u00C3\u00A7\u00C3\u00B5es parceladas")
  @JsonProperty("flagPermitirParcelamento")
  public Boolean getFlagPermitirParcelamento() {
    return flagPermitirParcelamento;
  }
  public void setFlagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
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
        Objects.equals(this.flagPermitirParcelamento, detalheOperacaoResponse.flagPermitirParcelamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOperacao, codigoProcessamento, codigoProcessamentoCancelamento, nomeOperacao, descricaoOperacao, planoMinimo, planoMaximo, valorMinimo, valorMaximo, flagCobraJuros, taxaJuros, flagCobraTarifa, taxaTarifa, valorTac, percentualTac, valorOperacao, carencia, excedentePermitido, flagPermitirParcelamento);
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



