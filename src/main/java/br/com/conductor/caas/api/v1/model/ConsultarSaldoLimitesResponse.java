package br.com.conductor.caas.api.v1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConsultarSaldoLimitesResponse   {
  
  private Integer codigoRetorno = null;
  private String dataVencimento = null;
  private String descricaoRetorno = null;
  private Double disponibCompraNac = null;
  private Double disponibGlobalCredito = null;
  private Double disponibParceladoNac = null;
  private Double disponibParcelasNac = null;
  private Double disponibSaqueNacGlobal = null;
  private Double limiteCompraNac = null;
  private Double limiteGlobalCredito = null;
  private Double limiteParceladoNac = null;
  private Double limiteParcelasNac = null;
  private Double limiteSaqueNacGlobal = null;
  private Double saldoAtualFinal = null;
  private Double saldoDevedor = null;
  private Double saldoFuturo = null;

  
  /**
   **/
  public ConsultarSaldoLimitesResponse codigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("codigoRetorno")
  public Integer getCodigoRetorno() {
    return codigoRetorno;
  }
  public void setCodigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
  }

  
  /**
   **/
  public ConsultarSaldoLimitesResponse dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataVencimento")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   **/
  public ConsultarSaldoLimitesResponse descricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("descricaoRetorno")
  public String getDescricaoRetorno() {
    return descricaoRetorno;
  }
  public void setDescricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
  }

  
  /**
   **/
  public ConsultarSaldoLimitesResponse disponibCompraNac(Double disponibCompraNac) {
    this.disponibCompraNac = disponibCompraNac;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("disponibCompraNac")
  public Double getDisponibCompraNac() {
    return disponibCompraNac;
  }
  public void setDisponibCompraNac(Double disponibCompraNac) {
    this.disponibCompraNac = disponibCompraNac;
  }

  
  /**
   **/
  public ConsultarSaldoLimitesResponse disponibGlobalCredito(Double disponibGlobalCredito) {
    this.disponibGlobalCredito = disponibGlobalCredito;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("disponibGlobalCredito")
  public Double getDisponibGlobalCredito() {
    return disponibGlobalCredito;
  }
  public void setDisponibGlobalCredito(Double disponibGlobalCredito) {
    this.disponibGlobalCredito = disponibGlobalCredito;
  }

  
  /**
   **/
  public ConsultarSaldoLimitesResponse disponibParceladoNac(Double disponibParceladoNac) {
    this.disponibParceladoNac = disponibParceladoNac;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("disponibParceladoNac")
  public Double getDisponibParceladoNac() {
    return disponibParceladoNac;
  }
  public void setDisponibParceladoNac(Double disponibParceladoNac) {
    this.disponibParceladoNac = disponibParceladoNac;
  }

  
  /**
   **/
  public ConsultarSaldoLimitesResponse disponibParcelasNac(Double disponibParcelasNac) {
    this.disponibParcelasNac = disponibParcelasNac;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("disponibParcelasNac")
  public Double getDisponibParcelasNac() {
    return disponibParcelasNac;
  }
  public void setDisponibParcelasNac(Double disponibParcelasNac) {
    this.disponibParcelasNac = disponibParcelasNac;
  }

  
  /**
   **/
  public ConsultarSaldoLimitesResponse disponibSaqueNacGlobal(Double disponibSaqueNacGlobal) {
    this.disponibSaqueNacGlobal = disponibSaqueNacGlobal;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("disponibSaqueNacGlobal")
  public Double getDisponibSaqueNacGlobal() {
    return disponibSaqueNacGlobal;
  }
  public void setDisponibSaqueNacGlobal(Double disponibSaqueNacGlobal) {
    this.disponibSaqueNacGlobal = disponibSaqueNacGlobal;
  }

  
  /**
   **/
  public ConsultarSaldoLimitesResponse limiteCompraNac(Double limiteCompraNac) {
    this.limiteCompraNac = limiteCompraNac;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("limiteCompraNac")
  public Double getLimiteCompraNac() {
    return limiteCompraNac;
  }
  public void setLimiteCompraNac(Double limiteCompraNac) {
    this.limiteCompraNac = limiteCompraNac;
  }

  
  /**
   **/
  public ConsultarSaldoLimitesResponse limiteGlobalCredito(Double limiteGlobalCredito) {
    this.limiteGlobalCredito = limiteGlobalCredito;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("limiteGlobalCredito")
  public Double getLimiteGlobalCredito() {
    return limiteGlobalCredito;
  }
  public void setLimiteGlobalCredito(Double limiteGlobalCredito) {
    this.limiteGlobalCredito = limiteGlobalCredito;
  }

  
  /**
   **/
  public ConsultarSaldoLimitesResponse limiteParceladoNac(Double limiteParceladoNac) {
    this.limiteParceladoNac = limiteParceladoNac;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("limiteParceladoNac")
  public Double getLimiteParceladoNac() {
    return limiteParceladoNac;
  }
  public void setLimiteParceladoNac(Double limiteParceladoNac) {
    this.limiteParceladoNac = limiteParceladoNac;
  }

  
  /**
   **/
  public ConsultarSaldoLimitesResponse limiteParcelasNac(Double limiteParcelasNac) {
    this.limiteParcelasNac = limiteParcelasNac;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("limiteParcelasNac")
  public Double getLimiteParcelasNac() {
    return limiteParcelasNac;
  }
  public void setLimiteParcelasNac(Double limiteParcelasNac) {
    this.limiteParcelasNac = limiteParcelasNac;
  }

  
  /**
   **/
  public ConsultarSaldoLimitesResponse limiteSaqueNacGlobal(Double limiteSaqueNacGlobal) {
    this.limiteSaqueNacGlobal = limiteSaqueNacGlobal;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("limiteSaqueNacGlobal")
  public Double getLimiteSaqueNacGlobal() {
    return limiteSaqueNacGlobal;
  }
  public void setLimiteSaqueNacGlobal(Double limiteSaqueNacGlobal) {
    this.limiteSaqueNacGlobal = limiteSaqueNacGlobal;
  }

  
  /**
   **/
  public ConsultarSaldoLimitesResponse saldoAtualFinal(Double saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("saldoAtualFinal")
  public Double getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(Double saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   **/
  public ConsultarSaldoLimitesResponse saldoDevedor(Double saldoDevedor) {
    this.saldoDevedor = saldoDevedor;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("saldoDevedor")
  public Double getSaldoDevedor() {
    return saldoDevedor;
  }
  public void setSaldoDevedor(Double saldoDevedor) {
    this.saldoDevedor = saldoDevedor;
  }

  
  /**
   **/
  public ConsultarSaldoLimitesResponse saldoFuturo(Double saldoFuturo) {
    this.saldoFuturo = saldoFuturo;
    return this;
  }
  
  @ApiModelProperty(value = "")
  @JsonProperty("saldoFuturo")
  public Double getSaldoFuturo() {
    return saldoFuturo;
  }
  public void setSaldoFuturo(Double saldoFuturo) {
    this.saldoFuturo = saldoFuturo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultarSaldoLimitesResponse consultarSaldoLimitesResponse = (ConsultarSaldoLimitesResponse) o;
    return Objects.equals(this.codigoRetorno, consultarSaldoLimitesResponse.codigoRetorno) &&
        Objects.equals(this.dataVencimento, consultarSaldoLimitesResponse.dataVencimento) &&
        Objects.equals(this.descricaoRetorno, consultarSaldoLimitesResponse.descricaoRetorno) &&
        Objects.equals(this.disponibCompraNac, consultarSaldoLimitesResponse.disponibCompraNac) &&
        Objects.equals(this.disponibGlobalCredito, consultarSaldoLimitesResponse.disponibGlobalCredito) &&
        Objects.equals(this.disponibParceladoNac, consultarSaldoLimitesResponse.disponibParceladoNac) &&
        Objects.equals(this.disponibParcelasNac, consultarSaldoLimitesResponse.disponibParcelasNac) &&
        Objects.equals(this.disponibSaqueNacGlobal, consultarSaldoLimitesResponse.disponibSaqueNacGlobal) &&
        Objects.equals(this.limiteCompraNac, consultarSaldoLimitesResponse.limiteCompraNac) &&
        Objects.equals(this.limiteGlobalCredito, consultarSaldoLimitesResponse.limiteGlobalCredito) &&
        Objects.equals(this.limiteParceladoNac, consultarSaldoLimitesResponse.limiteParceladoNac) &&
        Objects.equals(this.limiteParcelasNac, consultarSaldoLimitesResponse.limiteParcelasNac) &&
        Objects.equals(this.limiteSaqueNacGlobal, consultarSaldoLimitesResponse.limiteSaqueNacGlobal) &&
        Objects.equals(this.saldoAtualFinal, consultarSaldoLimitesResponse.saldoAtualFinal) &&
        Objects.equals(this.saldoDevedor, consultarSaldoLimitesResponse.saldoDevedor) &&
        Objects.equals(this.saldoFuturo, consultarSaldoLimitesResponse.saldoFuturo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoRetorno, dataVencimento, descricaoRetorno, disponibCompraNac, disponibGlobalCredito, disponibParceladoNac, disponibParcelasNac, disponibSaqueNacGlobal, limiteCompraNac, limiteGlobalCredito, limiteParceladoNac, limiteParcelasNac, limiteSaqueNacGlobal, saldoAtualFinal, saldoDevedor, saldoFuturo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarSaldoLimitesResponse {\n");
    
    sb.append("    codigoRetorno: ").append(toIndentedString(codigoRetorno)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    descricaoRetorno: ").append(toIndentedString(descricaoRetorno)).append("\n");
    sb.append("    disponibCompraNac: ").append(toIndentedString(disponibCompraNac)).append("\n");
    sb.append("    disponibGlobalCredito: ").append(toIndentedString(disponibGlobalCredito)).append("\n");
    sb.append("    disponibParceladoNac: ").append(toIndentedString(disponibParceladoNac)).append("\n");
    sb.append("    disponibParcelasNac: ").append(toIndentedString(disponibParcelasNac)).append("\n");
    sb.append("    disponibSaqueNacGlobal: ").append(toIndentedString(disponibSaqueNacGlobal)).append("\n");
    sb.append("    limiteCompraNac: ").append(toIndentedString(limiteCompraNac)).append("\n");
    sb.append("    limiteGlobalCredito: ").append(toIndentedString(limiteGlobalCredito)).append("\n");
    sb.append("    limiteParceladoNac: ").append(toIndentedString(limiteParceladoNac)).append("\n");
    sb.append("    limiteParcelasNac: ").append(toIndentedString(limiteParcelasNac)).append("\n");
    sb.append("    limiteSaqueNacGlobal: ").append(toIndentedString(limiteSaqueNacGlobal)).append("\n");
    sb.append("    saldoAtualFinal: ").append(toIndentedString(saldoAtualFinal)).append("\n");
    sb.append("    saldoDevedor: ").append(toIndentedString(saldoDevedor)).append("\n");
    sb.append("    saldoFuturo: ").append(toIndentedString(saldoFuturo)).append("\n");
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



