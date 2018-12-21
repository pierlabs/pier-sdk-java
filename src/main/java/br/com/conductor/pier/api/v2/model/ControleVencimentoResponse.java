package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object of the response of the Expirations
 **/

@ApiModel(description = "Object of the response of the Expirations")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ControleVencimentoResponse   {
  
  private String dataVencimento = null;
  private String dataPrevistaCorte = null;
  private String dataHoraRealizacaoCorte = null;
  private String dataPrevistaFaturamento = null;
  private String dataHoraRealizacaoFaturamento = null;
  private String dataRealVencimento = null;

  
  /**
   * Indicate the date of expiration of the invoices
   **/
  public ControleVencimentoResponse dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicate the date of expiration of the invoices")
  @JsonProperty("dataVencimento")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Indicate the date previewed to make the cut of the invoices
   **/
  public ControleVencimentoResponse dataPrevistaCorte(String dataPrevistaCorte) {
    this.dataPrevistaCorte = dataPrevistaCorte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicate the date previewed to make the cut of the invoices")
  @JsonProperty("dataPrevistaCorte")
  public String getDataPrevistaCorte() {
    return dataPrevistaCorte;
  }
  public void setDataPrevistaCorte(String dataPrevistaCorte) {
    this.dataPrevistaCorte = dataPrevistaCorte;
  }

  
  /**
   * Indicate the date and the time that was made the Cut of the invoices
   **/
  public ControleVencimentoResponse dataHoraRealizacaoCorte(String dataHoraRealizacaoCorte) {
    this.dataHoraRealizacaoCorte = dataHoraRealizacaoCorte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicate the date and the time that was made the Cut of the invoices")
  @JsonProperty("dataHoraRealizacaoCorte")
  public String getDataHoraRealizacaoCorte() {
    return dataHoraRealizacaoCorte;
  }
  public void setDataHoraRealizacaoCorte(String dataHoraRealizacaoCorte) {
    this.dataHoraRealizacaoCorte = dataHoraRealizacaoCorte;
  }

  
  /**
   * Indicate the date previewed to make the billing
   **/
  public ControleVencimentoResponse dataPrevistaFaturamento(String dataPrevistaFaturamento) {
    this.dataPrevistaFaturamento = dataPrevistaFaturamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicate the date previewed to make the billing")
  @JsonProperty("dataPrevistaFaturamento")
  public String getDataPrevistaFaturamento() {
    return dataPrevistaFaturamento;
  }
  public void setDataPrevistaFaturamento(String dataPrevistaFaturamento) {
    this.dataPrevistaFaturamento = dataPrevistaFaturamento;
  }

  
  /**
   * Indicate the date and the time that was made the billing
   **/
  public ControleVencimentoResponse dataHoraRealizacaoFaturamento(String dataHoraRealizacaoFaturamento) {
    this.dataHoraRealizacaoFaturamento = dataHoraRealizacaoFaturamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicate the date and the time that was made the billing")
  @JsonProperty("dataHoraRealizacaoFaturamento")
  public String getDataHoraRealizacaoFaturamento() {
    return dataHoraRealizacaoFaturamento;
  }
  public void setDataHoraRealizacaoFaturamento(String dataHoraRealizacaoFaturamento) {
    this.dataHoraRealizacaoFaturamento = dataHoraRealizacaoFaturamento;
  }

  
  /**
   * Indicate the useful day that will be considered as the expiration date
   **/
  public ControleVencimentoResponse dataRealVencimento(String dataRealVencimento) {
    this.dataRealVencimento = dataRealVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicate the useful day that will be considered as the expiration date")
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

