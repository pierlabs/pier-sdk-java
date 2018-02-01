package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * Objeto OperacaoCredor
 **/

@ApiModel(description = "Objeto OperacaoCredor")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OperacaoCredorPersist   {
  
  private Long idOperacao = null;
  private Long idCredor = null;
  private List<Long> idsProduto = new ArrayList<Long>();
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
   * Apresenta o id da Opera\u00C3\u00A7\u00C3\u00A3o.
   **/
  public OperacaoCredorPersist idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "2", value = "Apresenta o id da Opera\u00C3\u00A7\u00C3\u00A3o.")
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
  public OperacaoCredorPersist idCredor(Long idCredor) {
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
   * Apresenta a lista de ids produtos que v\u00C3\u00A3o ter regras cadastradas.
   **/
  public OperacaoCredorPersist idsProduto(List<Long> idsProduto) {
    this.idsProduto = idsProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a lista de ids produtos que v\u00C3\u00A3o ter regras cadastradas.")
  @JsonProperty("idsProduto")
  public List<Long> getIdsProduto() {
    return idsProduto;
  }
  public void setIdsProduto(List<Long> idsProduto) {
    this.idsProduto = idsProduto;
  }

  
  /**
   * Remunera\u00C3\u00A7\u00C3\u00A3o Percentual.
   **/
  public OperacaoCredorPersist remuneracaoPercentual(BigDecimal remuneracaoPercentual) {
    this.remuneracaoPercentual = remuneracaoPercentual;
    return this;
  }
  
  @ApiModelProperty(example = "0.04", value = "Remunera\u00C3\u00A7\u00C3\u00A3o Percentual.")
  @JsonProperty("remuneracaoPercentual")
  public BigDecimal getRemuneracaoPercentual() {
    return remuneracaoPercentual;
  }
  public void setRemuneracaoPercentual(BigDecimal remuneracaoPercentual) {
    this.remuneracaoPercentual = remuneracaoPercentual;
  }

  
  /**
   * Remunera\u00C3\u00A7\u00C3\u00A3o Fixa.
   **/
  public OperacaoCredorPersist remuneracaoFixa(BigDecimal remuneracaoFixa) {
    this.remuneracaoFixa = remuneracaoFixa;
    return this;
  }
  
  @ApiModelProperty(example = "0.0", value = "Remunera\u00C3\u00A7\u00C3\u00A3o Fixa.")
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
  public OperacaoCredorPersist periodicidade(PeriodicidadeEnum periodicidade) {
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
  public OperacaoCredorPersist vencimentoPrimeiraParcela(Integer vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
    return this;
  }
  
  @ApiModelProperty(example = "28", value = "Vencimento da primeira parcela.")
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
  public OperacaoCredorPersist diasAfastamento(Integer diasAfastamento) {
    this.diasAfastamento = diasAfastamento;
    return this;
  }
  
  @ApiModelProperty(example = "28", value = "Dias afastamento.")
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
  public OperacaoCredorPersist fatorMultiplicador(FatorMultiplicadorEnum fatorMultiplicador) {
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
  public OperacaoCredorPersist flagTaxaFixada(Boolean flagTaxaFixada) {
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
   * Plano m\u00C3\u00ADnimo da regra.
   **/
  public OperacaoCredorPersist planoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "Plano m\u00C3\u00ADnimo da regra.")
  @JsonProperty("planoMinimo")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * Plano m\u00C3\u00A1ximo da regra.
   **/
  public OperacaoCredorPersist planoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "5", value = "Plano m\u00C3\u00A1ximo da regra.")
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
    OperacaoCredorPersist operacaoCredorPersist = (OperacaoCredorPersist) o;
    return Objects.equals(this.idOperacao, operacaoCredorPersist.idOperacao) &&
        Objects.equals(this.idCredor, operacaoCredorPersist.idCredor) &&
        Objects.equals(this.idsProduto, operacaoCredorPersist.idsProduto) &&
        Objects.equals(this.remuneracaoPercentual, operacaoCredorPersist.remuneracaoPercentual) &&
        Objects.equals(this.remuneracaoFixa, operacaoCredorPersist.remuneracaoFixa) &&
        Objects.equals(this.periodicidade, operacaoCredorPersist.periodicidade) &&
        Objects.equals(this.vencimentoPrimeiraParcela, operacaoCredorPersist.vencimentoPrimeiraParcela) &&
        Objects.equals(this.diasAfastamento, operacaoCredorPersist.diasAfastamento) &&
        Objects.equals(this.fatorMultiplicador, operacaoCredorPersist.fatorMultiplicador) &&
        Objects.equals(this.flagTaxaFixada, operacaoCredorPersist.flagTaxaFixada) &&
        Objects.equals(this.planoMinimo, operacaoCredorPersist.planoMinimo) &&
        Objects.equals(this.planoMaximo, operacaoCredorPersist.planoMaximo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOperacao, idCredor, idsProduto, remuneracaoPercentual, remuneracaoFixa, periodicidade, vencimentoPrimeiraParcela, diasAfastamento, fatorMultiplicador, flagTaxaFixada, planoMinimo, planoMaximo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoCredorPersist {\n");
    
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
    sb.append("    idCredor: ").append(toIndentedString(idCredor)).append("\n");
    sb.append("    idsProduto: ").append(toIndentedString(idsProduto)).append("\n");
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

