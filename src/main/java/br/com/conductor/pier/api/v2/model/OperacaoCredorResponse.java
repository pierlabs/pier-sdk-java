package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * ObjetoOperacaoCredor
 **/

@ApiModel(description = "ObjetoOperacaoCredor")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OperacaoCredorResponse   {
  
  private Long id = null;
  private Long idOperacao = null;
  private Long idCredor = null;
  private Long idProduto = null;
  private BigDecimal remuneracaoPercentual = null;
  private BigDecimal remuneracaoFixa = null;


  public enum PeriodicidadeEnum {
    DIARIO("DIARIO"),
    SEMANAL("SEMANAL"),
    MENSAL("MENSAL"),
    DECENDIAL("DECENDIAL"),
    QUINZENAL("QUINZENAL");

    private String value;

    PeriodicidadeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PeriodicidadeEnum periodicidade = null;
  private Integer vencimentoPrimeiraParcela = null;
  private Integer diasAfastamento = null;


  public enum FatorMultiplicadorEnum {
    FORA_AGENDA("FORA_AGENDA"),
    AGENDA("AGENDA"),
    AGENDA_NEGATIVA("AGENDA_NEGATIVA");

    private String value;

    FatorMultiplicadorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private FatorMultiplicadorEnum fatorMultiplicador = null;
  private Boolean flagTaxaFixada = null;
  private Integer planoMinimo = null;
  private Integer planoMaximo = null;

  
  /**
   * Apresenta o id da OperacaoCredor.
   **/
  public OperacaoCredorResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "2", value = "Apresenta o id da OperacaoCredor.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o id da Opera\u00E7\u00E3o.
   **/
  public OperacaoCredorResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "2", value = "Apresenta o id da Opera\u00E7\u00E3o.")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Apresenta o id do Credor.
   **/
  public OperacaoCredorResponse idCredor(Long idCredor) {
    this.idCredor = idCredor;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "Apresenta o id do Credor.")
  @JsonProperty("idCredor")
  public Long getIdCredor() {
    return idCredor;
  }
  public void setIdCredor(Long idCredor) {
    this.idCredor = idCredor;
  }

  
  /**
   * Apresenta o id do produto.
   **/
  public OperacaoCredorResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "Apresenta o id do produto.")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Remunera\u00E7\u00E3o Percentual.
   **/
  public OperacaoCredorResponse remuneracaoPercentual(BigDecimal remuneracaoPercentual) {
    this.remuneracaoPercentual = remuneracaoPercentual;
    return this;
  }
  
  @ApiModelProperty(example = "0.04", value = "Remunera\u00E7\u00E3o Percentual.")
  @JsonProperty("remuneracaoPercentual")
  public BigDecimal getRemuneracaoPercentual() {
    return remuneracaoPercentual;
  }
  public void setRemuneracaoPercentual(BigDecimal remuneracaoPercentual) {
    this.remuneracaoPercentual = remuneracaoPercentual;
  }

  
  /**
   * Remunera\u00E7\u00E3o Fixa.
   **/
  public OperacaoCredorResponse remuneracaoFixa(BigDecimal remuneracaoFixa) {
    this.remuneracaoFixa = remuneracaoFixa;
    return this;
  }
  
  @ApiModelProperty(example = "0.0", value = "Remunera\u00E7\u00E3o Fixa.")
  @JsonProperty("remuneracaoFixa")
  public BigDecimal getRemuneracaoFixa() {
    return remuneracaoFixa;
  }
  public void setRemuneracaoFixa(BigDecimal remuneracaoFixa) {
    this.remuneracaoFixa = remuneracaoFixa;
  }

  
  /**
   * Periodicidade (DIARIO(1), SEMANAL(2), MENSAL(3), DECENDIAL(4), QUINZENAL(5)).
   **/
  public OperacaoCredorResponse periodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
    return this;
  }
  
  @ApiModelProperty(example = "MENSAL", value = "Periodicidade (DIARIO(1), SEMANAL(2), MENSAL(3), DECENDIAL(4), QUINZENAL(5)).")
  @JsonProperty("periodicidade")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * Vencimento da primeira parcela.
   **/
  public OperacaoCredorResponse vencimentoPrimeiraParcela(Integer vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
    return this;
  }
  
  @ApiModelProperty(example = "29", value = "Vencimento da primeira parcela.")
  @JsonProperty("vencimentoPrimeiraParcela")
  public Integer getVencimentoPrimeiraParcela() {
    return vencimentoPrimeiraParcela;
  }
  public void setVencimentoPrimeiraParcela(Integer vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
  }

  
  /**
   * Dias afastamento.
   **/
  public OperacaoCredorResponse diasAfastamento(Integer diasAfastamento) {
    this.diasAfastamento = diasAfastamento;
    return this;
  }
  
  @ApiModelProperty(example = "29", value = "Dias afastamento.")
  @JsonProperty("diasAfastamento")
  public Integer getDiasAfastamento() {
    return diasAfastamento;
  }
  public void setDiasAfastamento(Integer diasAfastamento) {
    this.diasAfastamento = diasAfastamento;
  }

  
  /**
   * Fator multiplicador (FORA_AGENDA(0), AGENDA(1)).
   **/
  public OperacaoCredorResponse fatorMultiplicador(FatorMultiplicadorEnum fatorMultiplicador) {
    this.fatorMultiplicador = fatorMultiplicador;
    return this;
  }
  
  @ApiModelProperty(example = "AGENDA", value = "Fator multiplicador (FORA_AGENDA(0), AGENDA(1)).")
  @JsonProperty("fatorMultiplicador")
  public FatorMultiplicadorEnum getFatorMultiplicador() {
    return fatorMultiplicador;
  }
  public void setFatorMultiplicador(FatorMultiplicadorEnum fatorMultiplicador) {
    this.fatorMultiplicador = fatorMultiplicador;
  }

  
  /**
   * Flag taxa fixada.
   **/
  public OperacaoCredorResponse flagTaxaFixada(Boolean flagTaxaFixada) {
    this.flagTaxaFixada = flagTaxaFixada;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Flag taxa fixada.")
  @JsonProperty("flagTaxaFixada")
  public Boolean getFlagTaxaFixada() {
    return flagTaxaFixada;
  }
  public void setFlagTaxaFixada(Boolean flagTaxaFixada) {
    this.flagTaxaFixada = flagTaxaFixada;
  }

  
  /**
   * Plano m\u00EDnimo da regra.
   **/
  public OperacaoCredorResponse planoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "Plano m\u00EDnimo da regra.")
  @JsonProperty("planoMinimo")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * Plano m\u00E1ximo da regra.
   **/
  public OperacaoCredorResponse planoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "5", value = "Plano m\u00E1ximo da regra.")
  @JsonProperty("planoMaximo")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperacaoCredorResponse operacaoCredorResponse = (OperacaoCredorResponse) o;
    return Objects.equals(this.id, operacaoCredorResponse.id) &&
        Objects.equals(this.idOperacao, operacaoCredorResponse.idOperacao) &&
        Objects.equals(this.idCredor, operacaoCredorResponse.idCredor) &&
        Objects.equals(this.idProduto, operacaoCredorResponse.idProduto) &&
        Objects.equals(this.remuneracaoPercentual, operacaoCredorResponse.remuneracaoPercentual) &&
        Objects.equals(this.remuneracaoFixa, operacaoCredorResponse.remuneracaoFixa) &&
        Objects.equals(this.periodicidade, operacaoCredorResponse.periodicidade) &&
        Objects.equals(this.vencimentoPrimeiraParcela, operacaoCredorResponse.vencimentoPrimeiraParcela) &&
        Objects.equals(this.diasAfastamento, operacaoCredorResponse.diasAfastamento) &&
        Objects.equals(this.fatorMultiplicador, operacaoCredorResponse.fatorMultiplicador) &&
        Objects.equals(this.flagTaxaFixada, operacaoCredorResponse.flagTaxaFixada) &&
        Objects.equals(this.planoMinimo, operacaoCredorResponse.planoMinimo) &&
        Objects.equals(this.planoMaximo, operacaoCredorResponse.planoMaximo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idOperacao, idCredor, idProduto, remuneracaoPercentual, remuneracaoFixa, periodicidade, vencimentoPrimeiraParcela, diasAfastamento, fatorMultiplicador, flagTaxaFixada, planoMinimo, planoMaximo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoCredorResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
    sb.append("    idCredor: ").append(toIndentedString(idCredor)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    remuneracaoPercentual: ").append(toIndentedString(remuneracaoPercentual)).append("\n");
    sb.append("    remuneracaoFixa: ").append(toIndentedString(remuneracaoFixa)).append("\n");
    sb.append("    periodicidade: ").append(toIndentedString(periodicidade)).append("\n");
    sb.append("    vencimentoPrimeiraParcela: ").append(toIndentedString(vencimentoPrimeiraParcela)).append("\n");
    sb.append("    diasAfastamento: ").append(toIndentedString(diasAfastamento)).append("\n");
    sb.append("    fatorMultiplicador: ").append(toIndentedString(fatorMultiplicador)).append("\n");
    sb.append("    flagTaxaFixada: ").append(toIndentedString(flagTaxaFixada)).append("\n");
    sb.append("    planoMinimo: ").append(toIndentedString(planoMinimo)).append("\n");
    sb.append("    planoMaximo: ").append(toIndentedString(planoMaximo)).append("\n");
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

