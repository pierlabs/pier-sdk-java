package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o da resposta do recurso Operacao
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso Operacao")
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
  private Integer idEmissor = null;
  private Long idTabela = null;
  private Long valorParcela = null;
  private Boolean flagCobraProRata = null;
  private Long idTabelaJuros = null;
  private String tipoExcedentePermitido = null;
  private Boolean flagIOFApartado = null;

  
  /**
   * C\u00F3digo que identifica a opera\u00E7\u00E3o
   **/
  public DetalheOperacaoResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo que identifica a opera\u00E7\u00E3o")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * C\u00F3digo de processamento usado em transa\u00E7\u00F5es com o autorizador
   **/
  public DetalheOperacaoResponse codigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de processamento usado em transa\u00E7\u00F5es com o autorizador")
  @JsonProperty("codigoProcessamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * C\u00F3digo de processamento usado para cancelar transa\u00E7\u00F5es no autorizador
   **/
  public DetalheOperacaoResponse codigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de processamento usado para cancelar transa\u00E7\u00F5es no autorizador")
  @JsonProperty("codigoProcessamentoCancelamento")
  public String getCodigoProcessamentoCancelamento() {
    return codigoProcessamentoCancelamento;
  }
  public void setCodigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
  }

  
  /**
   * Nome da opera\u00E7\u00E3o
   **/
  public DetalheOperacaoResponse nomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da opera\u00E7\u00E3o")
  @JsonProperty("nomeOperacao")
  public String getNomeOperacao() {
    return nomeOperacao;
  }
  public void setNomeOperacao(String nomeOperacao) {
    this.nomeOperacao = nomeOperacao;
  }

  
  /**
   * Descri\u00E7\u00E3o da opera\u00E7\u00E3o
   **/
  public DetalheOperacaoResponse descricaoOperacao(String descricaoOperacao) {
    this.descricaoOperacao = descricaoOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o da opera\u00E7\u00E3o")
  @JsonProperty("descricaoOperacao")
  public String getDescricaoOperacao() {
    return descricaoOperacao;
  }
  public void setDescricaoOperacao(String descricaoOperacao) {
    this.descricaoOperacao = descricaoOperacao;
  }

  
  /**
   * Quantidade m\u00EDnima de meses permitido para opera\u00E7\u00E3o
   **/
  public DetalheOperacaoResponse planoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade m\u00EDnima de meses permitido para opera\u00E7\u00E3o")
  @JsonProperty("planoMinimo")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * Quantidade M\u00E1ximo de meses permitido para opera\u00E7\u00E3o
   **/
  public DetalheOperacaoResponse planoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade M\u00E1ximo de meses permitido para opera\u00E7\u00E3o")
  @JsonProperty("planoMaximo")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   * Valor m\u00EDnimo permitido permitido para opera\u00E7\u00E3o
   **/
  public DetalheOperacaoResponse valorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00EDnimo permitido permitido para opera\u00E7\u00E3o")
  @JsonProperty("valorMinimo")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   * Valor m\u00E1ximo permitido permitido para opera\u00E7\u00E3o
   **/
  public DetalheOperacaoResponse valorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00E1ximo permitido permitido para opera\u00E7\u00E3o")
  @JsonProperty("valorMaximo")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  
  /**
   * Flag indicativa para crobran\u00E7a de juros
   **/
  public DetalheOperacaoResponse flagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicativa para crobran\u00E7a de juros")
  @JsonProperty("flagCobraJuros")
  public Boolean getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   * Valor do juros a ser cobrado, caso opera\u00E7\u00E3o cobre juros
   **/
  public DetalheOperacaoResponse taxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do juros a ser cobrado, caso opera\u00E7\u00E3o cobre juros")
  @JsonProperty("taxaJuros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Flag indicativa para crobran\u00E7a de tarifas
   **/
  public DetalheOperacaoResponse flagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicativa para crobran\u00E7a de tarifas")
  @JsonProperty("flagCobraTarifa")
  public Boolean getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   * Valor da tarifa a ser cobrado, caso opera\u00E7\u00E3o cobre tarifas
   **/
  public DetalheOperacaoResponse taxaTarifa(BigDecimal taxaTarifa) {
    this.taxaTarifa = taxaTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da tarifa a ser cobrado, caso opera\u00E7\u00E3o cobre tarifas")
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
   * Valor da opera\u00E7\u00E3o
   **/
  public DetalheOperacaoResponse valorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da opera\u00E7\u00E3o")
  @JsonProperty("valorOperacao")
  public BigDecimal getValorOperacao() {
    return valorOperacao;
  }
  public void setValorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
  }

  
  /**
   * Quantidade de meses para car\u00EAncia
   **/
  public DetalheOperacaoResponse carencia(Integer carencia) {
    this.carencia = carencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de meses para car\u00EAncia")
  @JsonProperty("carencia")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   * Valor excedente permitido para opera\u00E7\u00E3o
   **/
  public DetalheOperacaoResponse excedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor excedente permitido para opera\u00E7\u00E3o")
  @JsonProperty("excedentePermitido")
  public BigDecimal getExcedentePermitido() {
    return excedentePermitido;
  }
  public void setExcedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
  }

  
  /**
   * Permitir transa\u00E7\u00F5es parceladas
   **/
  public DetalheOperacaoResponse flagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Permitir transa\u00E7\u00F5es parceladas")
  @JsonProperty("flagPermitirParcelamento")
  public Boolean getFlagPermitirParcelamento() {
    return flagPermitirParcelamento;
  }
  public void setFlagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
  }

  
  /**
   * Flag que indica que a opera\u00E7\u00E3o deve utilizar a taxa da compra como taxa do rotativo para transa\u00E7\u00F5es desse tipo opera\u00E7\u00E3o
   **/
  public DetalheOperacaoResponse flagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica que a opera\u00E7\u00E3o deve utilizar a taxa da compra como taxa do rotativo para transa\u00E7\u00F5es desse tipo opera\u00E7\u00E3o")
  @JsonProperty("flagManterTaxaJurosNoRotativo")
  public Boolean getFlagManterTaxaJurosNoRotativo() {
    return flagManterTaxaJurosNoRotativo;
  }
  public void setFlagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
  }

  
  /**
   * C\u00F3digo identificador do emissor
   **/
  public DetalheOperacaoResponse idEmissor(Integer idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do emissor")
  @JsonProperty("idEmissor")
  public Integer getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Integer idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * C\u00F3digo identificador da tabela
   **/
  public DetalheOperacaoResponse idTabela(Long idTabela) {
    this.idTabela = idTabela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da tabela")
  @JsonProperty("idTabela")
  public Long getIdTabela() {
    return idTabela;
  }
  public void setIdTabela(Long idTabela) {
    this.idTabela = idTabela;
  }

  
  /**
   * Valor da parcela
   **/
  public DetalheOperacaoResponse valorParcela(Long valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da parcela")
  @JsonProperty("valorParcela")
  public Long getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(Long valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Flag indicativa de cobrar juros
   **/
  public DetalheOperacaoResponse flagCobraProRata(Boolean flagCobraProRata) {
    this.flagCobraProRata = flagCobraProRata;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicativa de cobrar juros")
  @JsonProperty("flagCobraProRata")
  public Boolean getFlagCobraProRata() {
    return flagCobraProRata;
  }
  public void setFlagCobraProRata(Boolean flagCobraProRata) {
    this.flagCobraProRata = flagCobraProRata;
  }

  
  /**
   * C\u00F3digo identificador da tabela de juros
   **/
  public DetalheOperacaoResponse idTabelaJuros(Long idTabelaJuros) {
    this.idTabelaJuros = idTabelaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da tabela de juros")
  @JsonProperty("idTabelaJuros")
  public Long getIdTabelaJuros() {
    return idTabelaJuros;
  }
  public void setIdTabelaJuros(Long idTabelaJuros) {
    this.idTabelaJuros = idTabelaJuros;
  }

  
  /**
   * Tipo excedente permitido
   **/
  public DetalheOperacaoResponse tipoExcedentePermitido(String tipoExcedentePermitido) {
    this.tipoExcedentePermitido = tipoExcedentePermitido;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo excedente permitido")
  @JsonProperty("tipoExcedentePermitido")
  public String getTipoExcedentePermitido() {
    return tipoExcedentePermitido;
  }
  public void setTipoExcedentePermitido(String tipoExcedentePermitido) {
    this.tipoExcedentePermitido = tipoExcedentePermitido;
  }

  
  /**
   * Flag que indica se o IOF \u00E9 apartado
   **/
  public DetalheOperacaoResponse flagIOFApartado(Boolean flagIOFApartado) {
    this.flagIOFApartado = flagIOFApartado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se o IOF \u00E9 apartado")
  @JsonProperty("flagIOFApartado")
  public Boolean getFlagIOFApartado() {
    return flagIOFApartado;
  }
  public void setFlagIOFApartado(Boolean flagIOFApartado) {
    this.flagIOFApartado = flagIOFApartado;
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
        Objects.equals(this.flagManterTaxaJurosNoRotativo, detalheOperacaoResponse.flagManterTaxaJurosNoRotativo) &&
        Objects.equals(this.idEmissor, detalheOperacaoResponse.idEmissor) &&
        Objects.equals(this.idTabela, detalheOperacaoResponse.idTabela) &&
        Objects.equals(this.valorParcela, detalheOperacaoResponse.valorParcela) &&
        Objects.equals(this.flagCobraProRata, detalheOperacaoResponse.flagCobraProRata) &&
        Objects.equals(this.idTabelaJuros, detalheOperacaoResponse.idTabelaJuros) &&
        Objects.equals(this.tipoExcedentePermitido, detalheOperacaoResponse.tipoExcedentePermitido) &&
        Objects.equals(this.flagIOFApartado, detalheOperacaoResponse.flagIOFApartado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOperacao, codigoProcessamento, codigoProcessamentoCancelamento, nomeOperacao, descricaoOperacao, planoMinimo, planoMaximo, valorMinimo, valorMaximo, flagCobraJuros, taxaJuros, flagCobraTarifa, taxaTarifa, valorTac, percentualTac, valorOperacao, carencia, excedentePermitido, flagPermitirParcelamento, flagManterTaxaJurosNoRotativo, idEmissor, idTabela, valorParcela, flagCobraProRata, idTabelaJuros, tipoExcedentePermitido, flagIOFApartado);
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
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    idTabela: ").append(toIndentedString(idTabela)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    flagCobraProRata: ").append(toIndentedString(flagCobraProRata)).append("\n");
    sb.append("    idTabelaJuros: ").append(toIndentedString(idTabelaJuros)).append("\n");
    sb.append("    tipoExcedentePermitido: ").append(toIndentedString(tipoExcedentePermitido)).append("\n");
    sb.append("    flagIOFApartado: ").append(toIndentedString(flagIOFApartado)).append("\n");
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

