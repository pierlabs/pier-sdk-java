package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{relatorio_movimentos_controle_processos_response_description}}}
 **/

@ApiModel(description = "{{{relatorio_movimentos_controle_processos_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class RelatorioMovimentosControleProcessosResponse   {
  
  private String vencimento = null;
  private String dtCorteMov = null;
  private String dtCorteReal = null;
  private String dtFatMov = null;
  private String dtFatReal = null;
  private String proximoVencimentoReal = null;
  private Integer prazoEntradaFatVec = null;

  
  /**
   **/
  public RelatorioMovimentosControleProcessosResponse vencimento(String vencimento) {
    this.vencimento = vencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vencimento")
  public String getVencimento() {
    return vencimento;
  }
  public void setVencimento(String vencimento) {
    this.vencimento = vencimento;
  }

  
  /**
   **/
  public RelatorioMovimentosControleProcessosResponse dtCorteMov(String dtCorteMov) {
    this.dtCorteMov = dtCorteMov;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dtCorteMov")
  public String getDtCorteMov() {
    return dtCorteMov;
  }
  public void setDtCorteMov(String dtCorteMov) {
    this.dtCorteMov = dtCorteMov;
  }

  
  /**
   **/
  public RelatorioMovimentosControleProcessosResponse dtCorteReal(String dtCorteReal) {
    this.dtCorteReal = dtCorteReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dtCorteReal")
  public String getDtCorteReal() {
    return dtCorteReal;
  }
  public void setDtCorteReal(String dtCorteReal) {
    this.dtCorteReal = dtCorteReal;
  }

  
  /**
   **/
  public RelatorioMovimentosControleProcessosResponse dtFatMov(String dtFatMov) {
    this.dtFatMov = dtFatMov;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dtFatMov")
  public String getDtFatMov() {
    return dtFatMov;
  }
  public void setDtFatMov(String dtFatMov) {
    this.dtFatMov = dtFatMov;
  }

  
  /**
   **/
  public RelatorioMovimentosControleProcessosResponse dtFatReal(String dtFatReal) {
    this.dtFatReal = dtFatReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dtFatReal")
  public String getDtFatReal() {
    return dtFatReal;
  }
  public void setDtFatReal(String dtFatReal) {
    this.dtFatReal = dtFatReal;
  }

  
  /**
   **/
  public RelatorioMovimentosControleProcessosResponse proximoVencimentoReal(String proximoVencimentoReal) {
    this.proximoVencimentoReal = proximoVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("proximoVencimentoReal")
  public String getProximoVencimentoReal() {
    return proximoVencimentoReal;
  }
  public void setProximoVencimentoReal(String proximoVencimentoReal) {
    this.proximoVencimentoReal = proximoVencimentoReal;
  }

  
  /**
   **/
  public RelatorioMovimentosControleProcessosResponse prazoEntradaFatVec(Integer prazoEntradaFatVec) {
    this.prazoEntradaFatVec = prazoEntradaFatVec;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("prazoEntradaFatVec")
  public Integer getPrazoEntradaFatVec() {
    return prazoEntradaFatVec;
  }
  public void setPrazoEntradaFatVec(Integer prazoEntradaFatVec) {
    this.prazoEntradaFatVec = prazoEntradaFatVec;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatorioMovimentosControleProcessosResponse relatorioMovimentosControleProcessosResponse = (RelatorioMovimentosControleProcessosResponse) o;
    return Objects.equals(this.vencimento, relatorioMovimentosControleProcessosResponse.vencimento) &&
        Objects.equals(this.dtCorteMov, relatorioMovimentosControleProcessosResponse.dtCorteMov) &&
        Objects.equals(this.dtCorteReal, relatorioMovimentosControleProcessosResponse.dtCorteReal) &&
        Objects.equals(this.dtFatMov, relatorioMovimentosControleProcessosResponse.dtFatMov) &&
        Objects.equals(this.dtFatReal, relatorioMovimentosControleProcessosResponse.dtFatReal) &&
        Objects.equals(this.proximoVencimentoReal, relatorioMovimentosControleProcessosResponse.proximoVencimentoReal) &&
        Objects.equals(this.prazoEntradaFatVec, relatorioMovimentosControleProcessosResponse.prazoEntradaFatVec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vencimento, dtCorteMov, dtCorteReal, dtFatMov, dtFatReal, proximoVencimentoReal, prazoEntradaFatVec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatorioMovimentosControleProcessosResponse {\n");
    
    sb.append("    vencimento: ").append(toIndentedString(vencimento)).append("\n");
    sb.append("    dtCorteMov: ").append(toIndentedString(dtCorteMov)).append("\n");
    sb.append("    dtCorteReal: ").append(toIndentedString(dtCorteReal)).append("\n");
    sb.append("    dtFatMov: ").append(toIndentedString(dtFatMov)).append("\n");
    sb.append("    dtFatReal: ").append(toIndentedString(dtFatReal)).append("\n");
    sb.append("    proximoVencimentoReal: ").append(toIndentedString(proximoVencimentoReal)).append("\n");
    sb.append("    prazoEntradaFatVec: ").append(toIndentedString(prazoEntradaFatVec)).append("\n");
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

