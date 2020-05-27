package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto tipo opera\u00E7\u00E3o com campos pass\u00EDveis de altera\u00E7\u00E3o
 **/

@ApiModel(description = "Objeto tipo opera\u00E7\u00E3o com campos pass\u00EDveis de altera\u00E7\u00E3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoOperacaoParcialUpdate   {
  
  private Boolean flagManterTaxaJurosNoRotativo = null;
  private String nome = null;
  private String descricao = null;
  private Integer idEmissor = null;
  private Long idTabela = null;
  private Long valorParcela = null;
  private Boolean flagCobraProRata = null;
  private Boolean flagCobraJuros = null;
  private Integer planoMinimo = null;
  private Integer planoMaximo = null;
  private BigDecimal valorMinimo = null;
  private BigDecimal valorMaximo = null;
  private Long idTabelaJuros = null;
  private Integer flagPosProximoVencimento = null;
  private BigDecimal excedentePermitido = null;
  private String tipoExcedentePermitido = null;
  private BigDecimal valorTAC = null;
  private BigDecimal percentualTac = null;
  private Boolean flagIOFApartado = null;

  
  /**
   * Flag que indica que a opera\u00E7\u00E3o deve utilizar a taxa da compra como taxa do rotativo para transa\u00E7\u00F5es desse tipo opera\u00E7\u00E3o
   **/
  public TipoOperacaoParcialUpdate flagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
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
   * Nome do tipo de opera\u00E7\u00E3o
   **/
  public TipoOperacaoParcialUpdate nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do tipo de opera\u00E7\u00E3o")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de opera\u00E7\u00E3o
   **/
  public TipoOperacaoParcialUpdate descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do tipo de opera\u00E7\u00E3o")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * C\u00F3digo identificador do emissor
   **/
  public TipoOperacaoParcialUpdate idEmissor(Integer idEmissor) {
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
  public TipoOperacaoParcialUpdate idTabela(Long idTabela) {
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
  public TipoOperacaoParcialUpdate valorParcela(Long valorParcela) {
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
   * Flag que indica se cobra pr\u00F3-rata
   **/
  public TipoOperacaoParcialUpdate flagCobraProRata(Boolean flagCobraProRata) {
    this.flagCobraProRata = flagCobraProRata;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se cobra pr\u00F3-rata")
  @JsonProperty("flagCobraProRata")
  public Boolean getFlagCobraProRata() {
    return flagCobraProRata;
  }
  public void setFlagCobraProRata(Boolean flagCobraProRata) {
    this.flagCobraProRata = flagCobraProRata;
  }

  
  /**
   * Flag que indica se cobra juros
   **/
  public TipoOperacaoParcialUpdate flagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se cobra juros")
  @JsonProperty("flagCobraJuros")
  public Boolean getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   * Quantidade m\u00EDnima de meses permitida para a opera\u00E7\u00E3o
   **/
  public TipoOperacaoParcialUpdate planoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade m\u00EDnima de meses permitida para a opera\u00E7\u00E3o")
  @JsonProperty("planoMinimo")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * Quantidade m\u00E1xima de meses permitida para a opera\u00E7\u00E3o
   **/
  public TipoOperacaoParcialUpdate planoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade m\u00E1xima de meses permitida para a opera\u00E7\u00E3o")
  @JsonProperty("planoMaximo")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   * Valor m\u00EDnimo permitido para a opera\u00E7\u00E3o
   **/
  public TipoOperacaoParcialUpdate valorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00EDnimo permitido para a opera\u00E7\u00E3o")
  @JsonProperty("valorMinimo")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   * Valor m\u00E1ximo permitido para a opera\u00E7\u00E3o
   **/
  public TipoOperacaoParcialUpdate valorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00E1ximo permitido para a opera\u00E7\u00E3o")
  @JsonProperty("valorMaximo")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  
  /**
   * C\u00F3digo identificador da tabela de juros
   **/
  public TipoOperacaoParcialUpdate idTabelaJuros(Long idTabelaJuros) {
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
   * Flag p\u00F3s-pr\u00F3ximo vencimento
   **/
  public TipoOperacaoParcialUpdate flagPosProximoVencimento(Integer flagPosProximoVencimento) {
    this.flagPosProximoVencimento = flagPosProximoVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag p\u00F3s-pr\u00F3ximo vencimento")
  @JsonProperty("flagPosProximoVencimento")
  public Integer getFlagPosProximoVencimento() {
    return flagPosProximoVencimento;
  }
  public void setFlagPosProximoVencimento(Integer flagPosProximoVencimento) {
    this.flagPosProximoVencimento = flagPosProximoVencimento;
  }

  
  /**
   * Valor excedente permitido para opera\u00E7\u00E3o
   **/
  public TipoOperacaoParcialUpdate excedentePermitido(BigDecimal excedentePermitido) {
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
   * Tipo excedente permitido
   **/
  public TipoOperacaoParcialUpdate tipoExcedentePermitido(String tipoExcedentePermitido) {
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
   * Valor da TAC
   **/
  public TipoOperacaoParcialUpdate valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da TAC")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Percentual da TAC
   **/
  public TipoOperacaoParcialUpdate percentualTac(BigDecimal percentualTac) {
    this.percentualTac = percentualTac;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentual da TAC")
  @JsonProperty("percentualTac")
  public BigDecimal getPercentualTac() {
    return percentualTac;
  }
  public void setPercentualTac(BigDecimal percentualTac) {
    this.percentualTac = percentualTac;
  }

  
  /**
   * Flag que indica se o IOF \u00E9 apartado
   **/
  public TipoOperacaoParcialUpdate flagIOFApartado(Boolean flagIOFApartado) {
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
    TipoOperacaoParcialUpdate tipoOperacaoParcialUpdate = (TipoOperacaoParcialUpdate) o;
    return Objects.equals(this.flagManterTaxaJurosNoRotativo, tipoOperacaoParcialUpdate.flagManterTaxaJurosNoRotativo) &&
        Objects.equals(this.nome, tipoOperacaoParcialUpdate.nome) &&
        Objects.equals(this.descricao, tipoOperacaoParcialUpdate.descricao) &&
        Objects.equals(this.idEmissor, tipoOperacaoParcialUpdate.idEmissor) &&
        Objects.equals(this.idTabela, tipoOperacaoParcialUpdate.idTabela) &&
        Objects.equals(this.valorParcela, tipoOperacaoParcialUpdate.valorParcela) &&
        Objects.equals(this.flagCobraProRata, tipoOperacaoParcialUpdate.flagCobraProRata) &&
        Objects.equals(this.flagCobraJuros, tipoOperacaoParcialUpdate.flagCobraJuros) &&
        Objects.equals(this.planoMinimo, tipoOperacaoParcialUpdate.planoMinimo) &&
        Objects.equals(this.planoMaximo, tipoOperacaoParcialUpdate.planoMaximo) &&
        Objects.equals(this.valorMinimo, tipoOperacaoParcialUpdate.valorMinimo) &&
        Objects.equals(this.valorMaximo, tipoOperacaoParcialUpdate.valorMaximo) &&
        Objects.equals(this.idTabelaJuros, tipoOperacaoParcialUpdate.idTabelaJuros) &&
        Objects.equals(this.flagPosProximoVencimento, tipoOperacaoParcialUpdate.flagPosProximoVencimento) &&
        Objects.equals(this.excedentePermitido, tipoOperacaoParcialUpdate.excedentePermitido) &&
        Objects.equals(this.tipoExcedentePermitido, tipoOperacaoParcialUpdate.tipoExcedentePermitido) &&
        Objects.equals(this.valorTAC, tipoOperacaoParcialUpdate.valorTAC) &&
        Objects.equals(this.percentualTac, tipoOperacaoParcialUpdate.percentualTac) &&
        Objects.equals(this.flagIOFApartado, tipoOperacaoParcialUpdate.flagIOFApartado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagManterTaxaJurosNoRotativo, nome, descricao, idEmissor, idTabela, valorParcela, flagCobraProRata, flagCobraJuros, planoMinimo, planoMaximo, valorMinimo, valorMaximo, idTabelaJuros, flagPosProximoVencimento, excedentePermitido, tipoExcedentePermitido, valorTAC, percentualTac, flagIOFApartado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOperacaoParcialUpdate {\n");
    
    sb.append("    flagManterTaxaJurosNoRotativo: ").append(toIndentedString(flagManterTaxaJurosNoRotativo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    idTabela: ").append(toIndentedString(idTabela)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    flagCobraProRata: ").append(toIndentedString(flagCobraProRata)).append("\n");
    sb.append("    flagCobraJuros: ").append(toIndentedString(flagCobraJuros)).append("\n");
    sb.append("    planoMinimo: ").append(toIndentedString(planoMinimo)).append("\n");
    sb.append("    planoMaximo: ").append(toIndentedString(planoMaximo)).append("\n");
    sb.append("    valorMinimo: ").append(toIndentedString(valorMinimo)).append("\n");
    sb.append("    valorMaximo: ").append(toIndentedString(valorMaximo)).append("\n");
    sb.append("    idTabelaJuros: ").append(toIndentedString(idTabelaJuros)).append("\n");
    sb.append("    flagPosProximoVencimento: ").append(toIndentedString(flagPosProximoVencimento)).append("\n");
    sb.append("    excedentePermitido: ").append(toIndentedString(excedentePermitido)).append("\n");
    sb.append("    tipoExcedentePermitido: ").append(toIndentedString(tipoExcedentePermitido)).append("\n");
    sb.append("    valorTAC: ").append(toIndentedString(valorTAC)).append("\n");
    sb.append("    percentualTac: ").append(toIndentedString(percentualTac)).append("\n");
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

