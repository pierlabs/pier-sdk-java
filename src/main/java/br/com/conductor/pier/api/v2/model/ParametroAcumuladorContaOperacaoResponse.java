package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objecto de resposta de um par\u00E2metro acumulador de conta/opera\u00E7\u00E3o
 **/

@ApiModel(description = "Objecto de resposta de um par\u00E2metro acumulador de conta/opera\u00E7\u00E3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ParametroAcumuladorContaOperacaoResponse   {
  
  private Long idConta = null;
  private Long idOperacao = null;
  private Integer qtdOperacoesGratuitasDia = null;
  private Integer qtdOperacoesGratuitasSemana = null;
  private Integer qtdOperacoesGratuitasMes = null;
  private BigDecimal valorTAC = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta
   **/
  public ParametroAcumuladorContaOperacaoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da opera\u00E7\u00E3o
   **/
  public ParametroAcumuladorContaOperacaoResponse idOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da opera\u00E7\u00E3o")
  @JsonProperty("idOperacao")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Quantidade de opera\u00E7\u00F5es gratuitas permitidas por dia
   **/
  public ParametroAcumuladorContaOperacaoResponse qtdOperacoesGratuitasDia(Integer qtdOperacoesGratuitasDia) {
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
  public ParametroAcumuladorContaOperacaoResponse qtdOperacoesGratuitasSemana(Integer qtdOperacoesGratuitasSemana) {
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
  public ParametroAcumuladorContaOperacaoResponse qtdOperacoesGratuitasMes(Integer qtdOperacoesGratuitasMes) {
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
  public ParametroAcumuladorContaOperacaoResponse valorTAC(BigDecimal valorTAC) {
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
    ParametroAcumuladorContaOperacaoResponse parametroAcumuladorContaOperacaoResponse = (ParametroAcumuladorContaOperacaoResponse) o;
    return Objects.equals(this.idConta, parametroAcumuladorContaOperacaoResponse.idConta) &&
        Objects.equals(this.idOperacao, parametroAcumuladorContaOperacaoResponse.idOperacao) &&
        Objects.equals(this.qtdOperacoesGratuitasDia, parametroAcumuladorContaOperacaoResponse.qtdOperacoesGratuitasDia) &&
        Objects.equals(this.qtdOperacoesGratuitasSemana, parametroAcumuladorContaOperacaoResponse.qtdOperacoesGratuitasSemana) &&
        Objects.equals(this.qtdOperacoesGratuitasMes, parametroAcumuladorContaOperacaoResponse.qtdOperacoesGratuitasMes) &&
        Objects.equals(this.valorTAC, parametroAcumuladorContaOperacaoResponse.valorTAC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idOperacao, qtdOperacoesGratuitasDia, qtdOperacoesGratuitasSemana, qtdOperacoesGratuitasMes, valorTAC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametroAcumuladorContaOperacaoResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idOperacao: ").append(toIndentedString(idOperacao)).append("\n");
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

