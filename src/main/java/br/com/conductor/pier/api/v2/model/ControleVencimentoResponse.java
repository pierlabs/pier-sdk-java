package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de Resposta dos Vencimentos
 **/

@ApiModel(description = "Objeto de Resposta dos Vencimentos")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ControleVencimentoResponse   {
  
  private String dataVencimento = null;
  private String dataPrevistaCorte = null;
  private String dataHoraRealizacaoCorte = null;
  private String dataPrevistaFaturamento = null;
  private String dataHoraRealizacaoFaturamento = null;
  private String dataRealVencimento = null;

  
  /**
   *  Indica a data de vencimento das faturas
   **/
  public ControleVencimentoResponse dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = " Indica a data de vencimento das faturas")
  @JsonProperty("dataVencimento")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   *  Indica a data prevista para a realiza\u00C3\u00A7\u00C3\u00A3o do Corte das faturas
   **/
  public ControleVencimentoResponse dataPrevistaCorte(String dataPrevistaCorte) {
    this.dataPrevistaCorte = dataPrevistaCorte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = " Indica a data prevista para a realiza\u00C3\u00A7\u00C3\u00A3o do Corte das faturas")
  @JsonProperty("dataPrevistaCorte")
  public String getDataPrevistaCorte() {
    return dataPrevistaCorte;
  }
  public void setDataPrevistaCorte(String dataPrevistaCorte) {
    this.dataPrevistaCorte = dataPrevistaCorte;
  }

  
  /**
   * Indica a data e a hora que fora realizada a realiza\u00C3\u00A7\u00C3\u00A3o do Corte das faturas
   **/
  public ControleVencimentoResponse dataHoraRealizacaoCorte(String dataHoraRealizacaoCorte) {
    this.dataHoraRealizacaoCorte = dataHoraRealizacaoCorte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica a data e a hora que fora realizada a realiza\u00C3\u00A7\u00C3\u00A3o do Corte das faturas")
  @JsonProperty("dataHoraRealizacaoCorte")
  public String getDataHoraRealizacaoCorte() {
    return dataHoraRealizacaoCorte;
  }
  public void setDataHoraRealizacaoCorte(String dataHoraRealizacaoCorte) {
    this.dataHoraRealizacaoCorte = dataHoraRealizacaoCorte;
  }

  
  /**
   * Indica a data prevista para a realiza\u00C3\u00A7\u00C3\u00A3o do faturamento
   **/
  public ControleVencimentoResponse dataPrevistaFaturamento(String dataPrevistaFaturamento) {
    this.dataPrevistaFaturamento = dataPrevistaFaturamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica a data prevista para a realiza\u00C3\u00A7\u00C3\u00A3o do faturamento")
  @JsonProperty("dataPrevistaFaturamento")
  public String getDataPrevistaFaturamento() {
    return dataPrevistaFaturamento;
  }
  public void setDataPrevistaFaturamento(String dataPrevistaFaturamento) {
    this.dataPrevistaFaturamento = dataPrevistaFaturamento;
  }

  
  /**
   * Indica a data e a hora que fora realizado o faturamento
   **/
  public ControleVencimentoResponse dataHoraRealizacaoFaturamento(String dataHoraRealizacaoFaturamento) {
    this.dataHoraRealizacaoFaturamento = dataHoraRealizacaoFaturamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica a data e a hora que fora realizado o faturamento")
  @JsonProperty("dataHoraRealizacaoFaturamento")
  public String getDataHoraRealizacaoFaturamento() {
    return dataHoraRealizacaoFaturamento;
  }
  public void setDataHoraRealizacaoFaturamento(String dataHoraRealizacaoFaturamento) {
    this.dataHoraRealizacaoFaturamento = dataHoraRealizacaoFaturamento;
  }

  
  /**
   * Indica o dia \u00C3\u00BAtil que ser\u00C3\u00A1 considerado como a data de vencimento
   **/
  public ControleVencimentoResponse dataRealVencimento(String dataRealVencimento) {
    this.dataRealVencimento = dataRealVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica o dia \u00C3\u00BAtil que ser\u00C3\u00A1 considerado como a data de vencimento")
  @JsonProperty("dataRealVencimento")
  public String getDataRealVencimento() {
    return dataRealVencimento;
  }
  public void setDataRealVencimento(String dataRealVencimento) {
    this.dataRealVencimento = dataRealVencimento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControleVencimentoResponse controleVencimentoResponse = (ControleVencimentoResponse) o;
    return Objects.equals(this.dataVencimento, controleVencimentoResponse.dataVencimento) &&
        Objects.equals(this.dataPrevistaCorte, controleVencimentoResponse.dataPrevistaCorte) &&
        Objects.equals(this.dataHoraRealizacaoCorte, controleVencimentoResponse.dataHoraRealizacaoCorte) &&
        Objects.equals(this.dataPrevistaFaturamento, controleVencimentoResponse.dataPrevistaFaturamento) &&
        Objects.equals(this.dataHoraRealizacaoFaturamento, controleVencimentoResponse.dataHoraRealizacaoFaturamento) &&
        Objects.equals(this.dataRealVencimento, controleVencimentoResponse.dataRealVencimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataVencimento, dataPrevistaCorte, dataHoraRealizacaoCorte, dataPrevistaFaturamento, dataHoraRealizacaoFaturamento, dataRealVencimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleVencimentoResponse {\n");
    
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    dataPrevistaCorte: ").append(toIndentedString(dataPrevistaCorte)).append("\n");
    sb.append("    dataHoraRealizacaoCorte: ").append(toIndentedString(dataHoraRealizacaoCorte)).append("\n");
    sb.append("    dataPrevistaFaturamento: ").append(toIndentedString(dataPrevistaFaturamento)).append("\n");
    sb.append("    dataHoraRealizacaoFaturamento: ").append(toIndentedString(dataHoraRealizacaoFaturamento)).append("\n");
    sb.append("    dataRealVencimento: ").append(toIndentedString(dataRealVencimento)).append("\n");
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

