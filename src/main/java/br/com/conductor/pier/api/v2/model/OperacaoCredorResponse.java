package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{operacao_credor_response_description}}}
 **/

@ApiModel(description = "{{{operacao_credor_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OperacaoCredorResponse   {
  
  private Long id = null;
  private Long idOperacao = null;
  private Long idGrupoEconomico = null;
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
   * {{{operacao_credor_response_id_value}}}
   **/
  public OperacaoCredorResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "2", value = "{{{operacao_credor_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{operacao_credor_response_id_operacao_value}}}
   **/
  public OperacaoCredorResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "2", value = "{{{operacao_credor_response_id_operacao_value}}}")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * {{{operacao_credor_response_id_grupo_economico_value}}}
   **/
  public OperacaoCredorResponse idGrupoEconomico(Long idGrupoEconomico) {
    this.idGrupoEconomico = idGrupoEconomico;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "{{{operacao_credor_response_id_grupo_economico_value}}}")
  @JsonProperty("idGrupoEconomico")
  public Long getIdGrupoEconomico() {
    return idGrupoEconomico;
  }
  public void setIdGrupoEconomico(Long idGrupoEconomico) {
    this.idGrupoEconomico = idGrupoEconomico;
  }

  
  /**
   * {{{operacao_credor_response_id_produto_value}}}
   **/
  public OperacaoCredorResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "{{{operacao_credor_response_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{operacao_credor_response_remuneracao_percentual_value}}}
   **/
  public OperacaoCredorResponse remuneracaoPercentual(BigDecimal remuneracaoPercentual) {
    this.remuneracaoPercentual = remuneracaoPercentual;
    return this;
  }
  
  @ApiModelProperty(example = "0.04", value = "{{{operacao_credor_response_remuneracao_percentual_value}}}")
  @JsonProperty("remuneracaoPercentual")
  public BigDecimal getRemuneracaoPercentual() {
    return remuneracaoPercentual;
  }
  public void setRemuneracaoPercentual(BigDecimal remuneracaoPercentual) {
    this.remuneracaoPercentual = remuneracaoPercentual;
  }

  
  /**
   * {{{operacao_credor_response_remuneracao_fixa_value}}}
   **/
  public OperacaoCredorResponse remuneracaoFixa(BigDecimal remuneracaoFixa) {
    this.remuneracaoFixa = remuneracaoFixa;
    return this;
  }
  
  @ApiModelProperty(example = "0.0", value = "{{{operacao_credor_response_remuneracao_fixa_value}}}")
  @JsonProperty("remuneracaoFixa")
  public BigDecimal getRemuneracaoFixa() {
    return remuneracaoFixa;
  }
  public void setRemuneracaoFixa(BigDecimal remuneracaoFixa) {
    this.remuneracaoFixa = remuneracaoFixa;
  }

  
  /**
   * {{{operacao_credor_response_periodicidade_value}}}
   **/
  public OperacaoCredorResponse periodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
    return this;
  }
  
  @ApiModelProperty(example = "MENSAL", value = "{{{operacao_credor_response_periodicidade_value}}}")
  @JsonProperty("periodicidade")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * {{{operacao_credor_response_vencimento_primeira_parcela_value}}}
   **/
  public OperacaoCredorResponse vencimentoPrimeiraParcela(Integer vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
    return this;
  }
  
  @ApiModelProperty(example = "29", value = "{{{operacao_credor_response_vencimento_primeira_parcela_value}}}")
  @JsonProperty("vencimentoPrimeiraParcela")
  public Integer getVencimentoPrimeiraParcela() {
    return vencimentoPrimeiraParcela;
  }
  public void setVencimentoPrimeiraParcela(Integer vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
  }

  
  /**
   * {{{operacao_credor_response_dias_afastamento_value}}}
   **/
  public OperacaoCredorResponse diasAfastamento(Integer diasAfastamento) {
    this.diasAfastamento = diasAfastamento;
    return this;
  }
  
  @ApiModelProperty(example = "29", value = "{{{operacao_credor_response_dias_afastamento_value}}}")
  @JsonProperty("diasAfastamento")
  public Integer getDiasAfastamento() {
    return diasAfastamento;
  }
  public void setDiasAfastamento(Integer diasAfastamento) {
    this.diasAfastamento = diasAfastamento;
  }

  
  /**
   * {{{operacao_credor_response_fator_multiplicador_value}}}
   **/
  public OperacaoCredorResponse fatorMultiplicador(FatorMultiplicadorEnum fatorMultiplicador) {
    this.fatorMultiplicador = fatorMultiplicador;
    return this;
  }
  
  @ApiModelProperty(example = "AGENDA", value = "{{{operacao_credor_response_fator_multiplicador_value}}}")
  @JsonProperty("fatorMultiplicador")
  public FatorMultiplicadorEnum getFatorMultiplicador() {
    return fatorMultiplicador;
  }
  public void setFatorMultiplicador(FatorMultiplicadorEnum fatorMultiplicador) {
    this.fatorMultiplicador = fatorMultiplicador;
  }

  
  /**
   * {{{operacao_credor_response_flag_taxa_fixada_value}}}
   **/
  public OperacaoCredorResponse flagTaxaFixada(Boolean flagTaxaFixada) {
    this.flagTaxaFixada = flagTaxaFixada;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{operacao_credor_response_flag_taxa_fixada_value}}}")
  @JsonProperty("flagTaxaFixada")
  public Boolean getFlagTaxaFixada() {
    return flagTaxaFixada;
  }
  public void setFlagTaxaFixada(Boolean flagTaxaFixada) {
    this.flagTaxaFixada = flagTaxaFixada;
  }

  
  /**
   * {{{operacao_credor_response_plano_minimo_value}}}
   **/
  public OperacaoCredorResponse planoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "{{{operacao_credor_response_plano_minimo_value}}}")
  @JsonProperty("planoMinimo")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * {{{operacao_credor_response_plano_maximo_value}}}
   **/
  public OperacaoCredorResponse planoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "5", value = "{{{operacao_credor_response_plano_maximo_value}}}")
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
        Objects.equals(this.idGrupoEconomico, operacaoCredorResponse.idGrupoEconomico) &&
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
    return Objects.hash(id, idOperacao, idGrupoEconomico, idProduto, remuneracaoPercentual, remuneracaoFixa, periodicidade, vencimentoPrimeiraParcela, diasAfastamento, fatorMultiplicador, flagTaxaFixada, planoMinimo, planoMaximo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoCredorResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
    sb.append("    idGrupoEconomico: ").append(toIndentedString(idGrupoEconomico)).append("\n");
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

