package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objecto de atualiza\u00E7\u00E3o de um par\u00E2metro acumulador de produto/opera\u00E7\u00E3o
 **/

@ApiModel(description = "Objecto de atualiza\u00E7\u00E3o de um par\u00E2metro acumulador de produto/opera\u00E7\u00E3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ParametroAcumuladorProdutoOperacaoUpdate   {
  
  private Integer qtdMaxDia = null;
  private Integer qtdMaxSemana = null;
  private Integer qtdMaxMes = null;
  private BigDecimal valorMaxDia = null;
  private BigDecimal valorMaxSemana = null;
  private BigDecimal valorMaxMes = null;
  private Integer qtdOperacoesGratuitasDia = null;
  private Integer qtdOperacoesGratuitasSemana = null;
  private Integer qtdOperacoesGratuitasMes = null;
  private BigDecimal valorTAC = null;

  
  /**
   * Quantidade m\u00E1xima de opera\u00E7\u00F5es por dia
   **/
  public ParametroAcumuladorProdutoOperacaoUpdate qtdMaxDia(Integer qtdMaxDia) {
    this.qtdMaxDia = qtdMaxDia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade m\u00E1xima de opera\u00E7\u00F5es por dia")
  @JsonProperty("qtdMaxDia")
  public Integer getQtdMaxDia() {
    return qtdMaxDia;
  }
  public void setQtdMaxDia(Integer qtdMaxDia) {
    this.qtdMaxDia = qtdMaxDia;
  }

  
  /**
   * Quantidade m\u00E1xima de opera\u00E7\u00F5es por semana
   **/
  public ParametroAcumuladorProdutoOperacaoUpdate qtdMaxSemana(Integer qtdMaxSemana) {
    this.qtdMaxSemana = qtdMaxSemana;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade m\u00E1xima de opera\u00E7\u00F5es por semana")
  @JsonProperty("qtdMaxSemana")
  public Integer getQtdMaxSemana() {
    return qtdMaxSemana;
  }
  public void setQtdMaxSemana(Integer qtdMaxSemana) {
    this.qtdMaxSemana = qtdMaxSemana;
  }

  
  /**
   * Quantidade m\u00E1xima de opera\u00E7\u00F5es por m\u00EAs
   **/
  public ParametroAcumuladorProdutoOperacaoUpdate qtdMaxMes(Integer qtdMaxMes) {
    this.qtdMaxMes = qtdMaxMes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade m\u00E1xima de opera\u00E7\u00F5es por m\u00EAs")
  @JsonProperty("qtdMaxMes")
  public Integer getQtdMaxMes() {
    return qtdMaxMes;
  }
  public void setQtdMaxMes(Integer qtdMaxMes) {
    this.qtdMaxMes = qtdMaxMes;
  }

  
  /**
   * Valor m\u00E1ximo de opera\u00E7\u00F5es por dia
   **/
  public ParametroAcumuladorProdutoOperacaoUpdate valorMaxDia(BigDecimal valorMaxDia) {
    this.valorMaxDia = valorMaxDia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00E1ximo de opera\u00E7\u00F5es por dia")
  @JsonProperty("valorMaxDia")
  public BigDecimal getValorMaxDia() {
    return valorMaxDia;
  }
  public void setValorMaxDia(BigDecimal valorMaxDia) {
    this.valorMaxDia = valorMaxDia;
  }

  
  /**
   * Valor m\u00E1ximo de opera\u00E7\u00F5es por semana
   **/
  public ParametroAcumuladorProdutoOperacaoUpdate valorMaxSemana(BigDecimal valorMaxSemana) {
    this.valorMaxSemana = valorMaxSemana;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00E1ximo de opera\u00E7\u00F5es por semana")
  @JsonProperty("valorMaxSemana")
  public BigDecimal getValorMaxSemana() {
    return valorMaxSemana;
  }
  public void setValorMaxSemana(BigDecimal valorMaxSemana) {
    this.valorMaxSemana = valorMaxSemana;
  }

  
  /**
   * Valor m\u00E1ximo de opera\u00E7\u00F5es por m\u00EAs
   **/
  public ParametroAcumuladorProdutoOperacaoUpdate valorMaxMes(BigDecimal valorMaxMes) {
    this.valorMaxMes = valorMaxMes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor m\u00E1ximo de opera\u00E7\u00F5es por m\u00EAs")
  @JsonProperty("valorMaxMes")
  public BigDecimal getValorMaxMes() {
    return valorMaxMes;
  }
  public void setValorMaxMes(BigDecimal valorMaxMes) {
    this.valorMaxMes = valorMaxMes;
  }

  
  /**
   * Quantidade de opera\u00E7\u00F5es gratuitas permitidas por dia
   **/
  public ParametroAcumuladorProdutoOperacaoUpdate qtdOperacoesGratuitasDia(Integer qtdOperacoesGratuitasDia) {
    this.qtdOperacoesGratuitasDia = qtdOperacoesGratuitasDia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de opera\u00E7\u00F5es gratuitas permitidas por dia")
  @JsonProperty("qtdOperacoesGratuitasDia")
  public Integer getQtdOperacoesGratuitasDia() {
    return qtdOperacoesGratuitasDia;
  }
  public void setQtdOperacoesGratuitasDia(Integer qtdOperacoesGratuitasDia) {
    this.qtdOperacoesGratuitasDia = qtdOperacoesGratuitasDia;
  }

  
  /**
   * Quantidade de opera\u00E7\u00F5es gratuitas permitidas por semana
   **/
  public ParametroAcumuladorProdutoOperacaoUpdate qtdOperacoesGratuitasSemana(Integer qtdOperacoesGratuitasSemana) {
    this.qtdOperacoesGratuitasSemana = qtdOperacoesGratuitasSemana;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de opera\u00E7\u00F5es gratuitas permitidas por semana")
  @JsonProperty("qtdOperacoesGratuitasSemana")
  public Integer getQtdOperacoesGratuitasSemana() {
    return qtdOperacoesGratuitasSemana;
  }
  public void setQtdOperacoesGratuitasSemana(Integer qtdOperacoesGratuitasSemana) {
    this.qtdOperacoesGratuitasSemana = qtdOperacoesGratuitasSemana;
  }

  
  /**
   * Quantidade de opera\u00E7\u00F5es gratuitas permitidas por m\u00EAs
   **/
  public ParametroAcumuladorProdutoOperacaoUpdate qtdOperacoesGratuitasMes(Integer qtdOperacoesGratuitasMes) {
    this.qtdOperacoesGratuitasMes = qtdOperacoesGratuitasMes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de opera\u00E7\u00F5es gratuitas permitidas por m\u00EAs")
  @JsonProperty("qtdOperacoesGratuitasMes")
  public Integer getQtdOperacoesGratuitasMes() {
    return qtdOperacoesGratuitasMes;
  }
  public void setQtdOperacoesGratuitasMes(Integer qtdOperacoesGratuitasMes) {
    this.qtdOperacoesGratuitasMes = qtdOperacoesGratuitasMes;
  }

  
  /**
   * Valor da taxa de abertura de cr\u00E9dito (TAC)
   **/
  public ParametroAcumuladorProdutoOperacaoUpdate valorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da taxa de abertura de cr\u00E9dito (TAC)")
  @JsonProperty("valorTAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParametroAcumuladorProdutoOperacaoUpdate parametroAcumuladorProdutoOperacaoUpdate = (ParametroAcumuladorProdutoOperacaoUpdate) o;
    return Objects.equals(this.qtdMaxDia, parametroAcumuladorProdutoOperacaoUpdate.qtdMaxDia) &&
        Objects.equals(this.qtdMaxSemana, parametroAcumuladorProdutoOperacaoUpdate.qtdMaxSemana) &&
        Objects.equals(this.qtdMaxMes, parametroAcumuladorProdutoOperacaoUpdate.qtdMaxMes) &&
        Objects.equals(this.valorMaxDia, parametroAcumuladorProdutoOperacaoUpdate.valorMaxDia) &&
        Objects.equals(this.valorMaxSemana, parametroAcumuladorProdutoOperacaoUpdate.valorMaxSemana) &&
        Objects.equals(this.valorMaxMes, parametroAcumuladorProdutoOperacaoUpdate.valorMaxMes) &&
        Objects.equals(this.qtdOperacoesGratuitasDia, parametroAcumuladorProdutoOperacaoUpdate.qtdOperacoesGratuitasDia) &&
        Objects.equals(this.qtdOperacoesGratuitasSemana, parametroAcumuladorProdutoOperacaoUpdate.qtdOperacoesGratuitasSemana) &&
        Objects.equals(this.qtdOperacoesGratuitasMes, parametroAcumuladorProdutoOperacaoUpdate.qtdOperacoesGratuitasMes) &&
        Objects.equals(this.valorTAC, parametroAcumuladorProdutoOperacaoUpdate.valorTAC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qtdMaxDia, qtdMaxSemana, qtdMaxMes, valorMaxDia, valorMaxSemana, valorMaxMes, qtdOperacoesGratuitasDia, qtdOperacoesGratuitasSemana, qtdOperacoesGratuitasMes, valorTAC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametroAcumuladorProdutoOperacaoUpdate {\n");
    
    sb.append("    qtdMaxDia: ").append(toIndentedString(qtdMaxDia)).append("\n");
    sb.append("    qtdMaxSemana: ").append(toIndentedString(qtdMaxSemana)).append("\n");
    sb.append("    qtdMaxMes: ").append(toIndentedString(qtdMaxMes)).append("\n");
    sb.append("    valorMaxDia: ").append(toIndentedString(valorMaxDia)).append("\n");
    sb.append("    valorMaxSemana: ").append(toIndentedString(valorMaxSemana)).append("\n");
    sb.append("    valorMaxMes: ").append(toIndentedString(valorMaxMes)).append("\n");
    sb.append("    qtdOperacoesGratuitasDia: ").append(toIndentedString(qtdOperacoesGratuitasDia)).append("\n");
    sb.append("    qtdOperacoesGratuitasSemana: ").append(toIndentedString(qtdOperacoesGratuitasSemana)).append("\n");
    sb.append("    qtdOperacoesGratuitasMes: ").append(toIndentedString(qtdOperacoesGratuitasMes)).append("\n");
    sb.append("    valorTAC: ").append(toIndentedString(valorTAC)).append("\n");
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

