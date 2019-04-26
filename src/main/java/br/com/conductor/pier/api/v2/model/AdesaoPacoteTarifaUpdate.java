package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto que representa uma ades\u00E3o de pacote de tarifa
 **/

@ApiModel(description = "Objeto que representa uma ades\u00E3o de pacote de tarifa")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AdesaoPacoteTarifaUpdate   {
  
  private Long idPacoteTarifa = null;
  private String dataDesativacao = null;
  private Integer recargaCelularUtilizado = null;
  private Integer bilheteUnicoUtilizado = null;
  private Integer pagamentoContaUtilizado = null;
  private Integer saqueUtilizado = null;
  private Integer transferenciaUtilizado = null;
  private Integer boletoUtilizado = null;
  private Integer aplicacaoUtilizado = null;
  private Boolean tarifaManutencaoCobrada = null;
  private Boolean cobraTarifa = null;

  
  /**
   * Identificador do pacote de tarifa
   **/
  public AdesaoPacoteTarifaUpdate idPacoteTarifa(Long idPacoteTarifa) {
    this.idPacoteTarifa = idPacoteTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identificador do pacote de tarifa")
  @JsonProperty("idPacoteTarifa")
  public Long getIdPacoteTarifa() {
    return idPacoteTarifa;
  }
  public void setIdPacoteTarifa(Long idPacoteTarifa) {
    this.idPacoteTarifa = idPacoteTarifa;
  }

  
  /**
   * Data de desativa\u00E7\u00E3o
   **/
  public AdesaoPacoteTarifaUpdate dataDesativacao(String dataDesativacao) {
    this.dataDesativacao = dataDesativacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss", value = "Data de desativa\u00E7\u00E3o")
  @JsonProperty("dataDesativacao")
  public String getDataDesativacao() {
    return dataDesativacao;
  }
  public void setDataDesativacao(String dataDesativacao) {
    this.dataDesativacao = dataDesativacao;
  }

  
  /**
   * Recarga de celular utilizado
   **/
  public AdesaoPacoteTarifaUpdate recargaCelularUtilizado(Integer recargaCelularUtilizado) {
    this.recargaCelularUtilizado = recargaCelularUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Recarga de celular utilizado")
  @JsonProperty("recargaCelularUtilizado")
  public Integer getRecargaCelularUtilizado() {
    return recargaCelularUtilizado;
  }
  public void setRecargaCelularUtilizado(Integer recargaCelularUtilizado) {
    this.recargaCelularUtilizado = recargaCelularUtilizado;
  }

  
  /**
   * Bilhete \u00FAnico utilizado
   **/
  public AdesaoPacoteTarifaUpdate bilheteUnicoUtilizado(Integer bilheteUnicoUtilizado) {
    this.bilheteUnicoUtilizado = bilheteUnicoUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bilhete \u00FAnico utilizado")
  @JsonProperty("bilheteUnicoUtilizado")
  public Integer getBilheteUnicoUtilizado() {
    return bilheteUnicoUtilizado;
  }
  public void setBilheteUnicoUtilizado(Integer bilheteUnicoUtilizado) {
    this.bilheteUnicoUtilizado = bilheteUnicoUtilizado;
  }

  
  /**
   * Pagamento conta utilizado
   **/
  public AdesaoPacoteTarifaUpdate pagamentoContaUtilizado(Integer pagamentoContaUtilizado) {
    this.pagamentoContaUtilizado = pagamentoContaUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Pagamento conta utilizado")
  @JsonProperty("pagamentoContaUtilizado")
  public Integer getPagamentoContaUtilizado() {
    return pagamentoContaUtilizado;
  }
  public void setPagamentoContaUtilizado(Integer pagamentoContaUtilizado) {
    this.pagamentoContaUtilizado = pagamentoContaUtilizado;
  }

  
  /**
   * Saque utilizado
   **/
  public AdesaoPacoteTarifaUpdate saqueUtilizado(Integer saqueUtilizado) {
    this.saqueUtilizado = saqueUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Saque utilizado")
  @JsonProperty("saqueUtilizado")
  public Integer getSaqueUtilizado() {
    return saqueUtilizado;
  }
  public void setSaqueUtilizado(Integer saqueUtilizado) {
    this.saqueUtilizado = saqueUtilizado;
  }

  
  /**
   * Transfer\u00EAncia utilizada
   **/
  public AdesaoPacoteTarifaUpdate transferenciaUtilizado(Integer transferenciaUtilizado) {
    this.transferenciaUtilizado = transferenciaUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Transfer\u00EAncia utilizada")
  @JsonProperty("transferenciaUtilizado")
  public Integer getTransferenciaUtilizado() {
    return transferenciaUtilizado;
  }
  public void setTransferenciaUtilizado(Integer transferenciaUtilizado) {
    this.transferenciaUtilizado = transferenciaUtilizado;
  }

  
  /**
   * Boleto utilizado
   **/
  public AdesaoPacoteTarifaUpdate boletoUtilizado(Integer boletoUtilizado) {
    this.boletoUtilizado = boletoUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Boleto utilizado")
  @JsonProperty("boletoUtilizado")
  public Integer getBoletoUtilizado() {
    return boletoUtilizado;
  }
  public void setBoletoUtilizado(Integer boletoUtilizado) {
    this.boletoUtilizado = boletoUtilizado;
  }

  
  /**
   * Aplica\u00E7\u00E3o utilizada
   **/
  public AdesaoPacoteTarifaUpdate aplicacaoUtilizado(Integer aplicacaoUtilizado) {
    this.aplicacaoUtilizado = aplicacaoUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Aplica\u00E7\u00E3o utilizada")
  @JsonProperty("aplicacaoUtilizado")
  public Integer getAplicacaoUtilizado() {
    return aplicacaoUtilizado;
  }
  public void setAplicacaoUtilizado(Integer aplicacaoUtilizado) {
    this.aplicacaoUtilizado = aplicacaoUtilizado;
  }

  
  /**
   * Tarifa manuten\u00E7\u00E3o cobrada
   **/
  public AdesaoPacoteTarifaUpdate tarifaManutencaoCobrada(Boolean tarifaManutencaoCobrada) {
    this.tarifaManutencaoCobrada = tarifaManutencaoCobrada;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "Tarifa manuten\u00E7\u00E3o cobrada")
  @JsonProperty("tarifaManutencaoCobrada")
  public Boolean getTarifaManutencaoCobrada() {
    return tarifaManutencaoCobrada;
  }
  public void setTarifaManutencaoCobrada(Boolean tarifaManutencaoCobrada) {
    this.tarifaManutencaoCobrada = tarifaManutencaoCobrada;
  }

  
  /**
   * Tarifa cobrada
   **/
  public AdesaoPacoteTarifaUpdate cobraTarifa(Boolean cobraTarifa) {
    this.cobraTarifa = cobraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "Tarifa cobrada")
  @JsonProperty("cobraTarifa")
  public Boolean getCobraTarifa() {
    return cobraTarifa;
  }
  public void setCobraTarifa(Boolean cobraTarifa) {
    this.cobraTarifa = cobraTarifa;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdesaoPacoteTarifaUpdate adesaoPacoteTarifaUpdate = (AdesaoPacoteTarifaUpdate) o;
    return Objects.equals(this.idPacoteTarifa, adesaoPacoteTarifaUpdate.idPacoteTarifa) &&
        Objects.equals(this.dataDesativacao, adesaoPacoteTarifaUpdate.dataDesativacao) &&
        Objects.equals(this.recargaCelularUtilizado, adesaoPacoteTarifaUpdate.recargaCelularUtilizado) &&
        Objects.equals(this.bilheteUnicoUtilizado, adesaoPacoteTarifaUpdate.bilheteUnicoUtilizado) &&
        Objects.equals(this.pagamentoContaUtilizado, adesaoPacoteTarifaUpdate.pagamentoContaUtilizado) &&
        Objects.equals(this.saqueUtilizado, adesaoPacoteTarifaUpdate.saqueUtilizado) &&
        Objects.equals(this.transferenciaUtilizado, adesaoPacoteTarifaUpdate.transferenciaUtilizado) &&
        Objects.equals(this.boletoUtilizado, adesaoPacoteTarifaUpdate.boletoUtilizado) &&
        Objects.equals(this.aplicacaoUtilizado, adesaoPacoteTarifaUpdate.aplicacaoUtilizado) &&
        Objects.equals(this.tarifaManutencaoCobrada, adesaoPacoteTarifaUpdate.tarifaManutencaoCobrada) &&
        Objects.equals(this.cobraTarifa, adesaoPacoteTarifaUpdate.cobraTarifa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPacoteTarifa, dataDesativacao, recargaCelularUtilizado, bilheteUnicoUtilizado, pagamentoContaUtilizado, saqueUtilizado, transferenciaUtilizado, boletoUtilizado, aplicacaoUtilizado, tarifaManutencaoCobrada, cobraTarifa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoPacoteTarifaUpdate {\n");
    
    sb.append("    idPacoteTarifa: ").append(toIndentedString(idPacoteTarifa)).append("\n");
    sb.append("    dataDesativacao: ").append(toIndentedString(dataDesativacao)).append("\n");
    sb.append("    recargaCelularUtilizado: ").append(toIndentedString(recargaCelularUtilizado)).append("\n");
    sb.append("    bilheteUnicoUtilizado: ").append(toIndentedString(bilheteUnicoUtilizado)).append("\n");
    sb.append("    pagamentoContaUtilizado: ").append(toIndentedString(pagamentoContaUtilizado)).append("\n");
    sb.append("    saqueUtilizado: ").append(toIndentedString(saqueUtilizado)).append("\n");
    sb.append("    transferenciaUtilizado: ").append(toIndentedString(transferenciaUtilizado)).append("\n");
    sb.append("    boletoUtilizado: ").append(toIndentedString(boletoUtilizado)).append("\n");
    sb.append("    aplicacaoUtilizado: ").append(toIndentedString(aplicacaoUtilizado)).append("\n");
    sb.append("    tarifaManutencaoCobrada: ").append(toIndentedString(tarifaManutencaoCobrada)).append("\n");
    sb.append("    cobraTarifa: ").append(toIndentedString(cobraTarifa)).append("\n");
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

