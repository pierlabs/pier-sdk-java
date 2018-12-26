package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de persit\u00EAncia para Ades\u00E3o Pacote Tarifa
 **/

@ApiModel(description = "Objeto de persit\u00EAncia para Ades\u00E3o Pacote Tarifa")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AdesaoPacoteTarifaPersist   {
  
  private Long idPacoteTarifa = null;
  private Integer ciclo = null;
  private String dataHoraAtivacao = null;
  private String dataHoraDesativacao = null;
  private String dataFimCiclo = null;
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
   * Id do pacote de tarifa
   **/
  public AdesaoPacoteTarifaPersist idPacoteTarifa(Long idPacoteTarifa) {
    this.idPacoteTarifa = idPacoteTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id do pacote de tarifa")
  @JsonProperty("idPacoteTarifa")
  public Long getIdPacoteTarifa() {
    return idPacoteTarifa;
  }
  public void setIdPacoteTarifa(Long idPacoteTarifa) {
    this.idPacoteTarifa = idPacoteTarifa;
  }

  
  /**
   * Ciclo mensal de cobran\u00E7a
   **/
  public AdesaoPacoteTarifaPersist ciclo(Integer ciclo) {
    this.ciclo = ciclo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ciclo mensal de cobran\u00E7a")
  @JsonProperty("ciclo")
  public Integer getCiclo() {
    return ciclo;
  }
  public void setCiclo(Integer ciclo) {
    this.ciclo = ciclo;
  }

  
  /**
   * Data da ativa\u00E7\u00E3o
   **/
  public AdesaoPacoteTarifaPersist dataHoraAtivacao(String dataHoraAtivacao) {
    this.dataHoraAtivacao = dataHoraAtivacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da ativa\u00E7\u00E3o")
  @JsonProperty("dataHoraAtivacao")
  public String getDataHoraAtivacao() {
    return dataHoraAtivacao;
  }
  public void setDataHoraAtivacao(String dataHoraAtivacao) {
    this.dataHoraAtivacao = dataHoraAtivacao;
  }

  
  /**
   * Data da desativa\u00E7\u00E3o
   **/
  public AdesaoPacoteTarifaPersist dataHoraDesativacao(String dataHoraDesativacao) {
    this.dataHoraDesativacao = dataHoraDesativacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da desativa\u00E7\u00E3o")
  @JsonProperty("dataHoraDesativacao")
  public String getDataHoraDesativacao() {
    return dataHoraDesativacao;
  }
  public void setDataHoraDesativacao(String dataHoraDesativacao) {
    this.dataHoraDesativacao = dataHoraDesativacao;
  }

  
  /**
   * Data fim do ciclo
   **/
  public AdesaoPacoteTarifaPersist dataFimCiclo(String dataFimCiclo) {
    this.dataFimCiclo = dataFimCiclo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data fim do ciclo")
  @JsonProperty("dataFimCiclo")
  public String getDataFimCiclo() {
    return dataFimCiclo;
  }
  public void setDataFimCiclo(String dataFimCiclo) {
    this.dataFimCiclo = dataFimCiclo;
  }

  
  /**
   * Recarga de celular utilizado
   **/
  public AdesaoPacoteTarifaPersist recargaCelularUtilizado(Integer recargaCelularUtilizado) {
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
   * Bilhete \u00FAnico Utilizado
   **/
  public AdesaoPacoteTarifaPersist bilheteUnicoUtilizado(Integer bilheteUnicoUtilizado) {
    this.bilheteUnicoUtilizado = bilheteUnicoUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Bilhete \u00FAnico Utilizado")
  @JsonProperty("bilheteUnicoUtilizado")
  public Integer getBilheteUnicoUtilizado() {
    return bilheteUnicoUtilizado;
  }
  public void setBilheteUnicoUtilizado(Integer bilheteUnicoUtilizado) {
    this.bilheteUnicoUtilizado = bilheteUnicoUtilizado;
  }

  
  /**
   * Pagamento Conta Utilizado
   **/
  public AdesaoPacoteTarifaPersist pagamentoContaUtilizado(Integer pagamentoContaUtilizado) {
    this.pagamentoContaUtilizado = pagamentoContaUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Pagamento Conta Utilizado")
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
  public AdesaoPacoteTarifaPersist saqueUtilizado(Integer saqueUtilizado) {
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
   * Transfer\u00EAncia utilizado
   **/
  public AdesaoPacoteTarifaPersist transferenciaUtilizado(Integer transferenciaUtilizado) {
    this.transferenciaUtilizado = transferenciaUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Transfer\u00EAncia utilizado")
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
  public AdesaoPacoteTarifaPersist boletoUtilizado(Integer boletoUtilizado) {
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
   * Aplica\u00E7\u00E3o utilizado
   **/
  public AdesaoPacoteTarifaPersist aplicacaoUtilizado(Integer aplicacaoUtilizado) {
    this.aplicacaoUtilizado = aplicacaoUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Aplica\u00E7\u00E3o utilizado")
  @JsonProperty("aplicacaoUtilizado")
  public Integer getAplicacaoUtilizado() {
    return aplicacaoUtilizado;
  }
  public void setAplicacaoUtilizado(Integer aplicacaoUtilizado) {
    this.aplicacaoUtilizado = aplicacaoUtilizado;
  }

  
  /**
   * Tarifa de manuten\u00E7\u00E3o cobrada
   **/
  public AdesaoPacoteTarifaPersist tarifaManutencaoCobrada(Boolean tarifaManutencaoCobrada) {
    this.tarifaManutencaoCobrada = tarifaManutencaoCobrada;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Tarifa de manuten\u00E7\u00E3o cobrada")
  @JsonProperty("tarifaManutencaoCobrada")
  public Boolean getTarifaManutencaoCobrada() {
    return tarifaManutencaoCobrada;
  }
  public void setTarifaManutencaoCobrada(Boolean tarifaManutencaoCobrada) {
    this.tarifaManutencaoCobrada = tarifaManutencaoCobrada;
  }

  
  /**
   * Cobra tarifa
   **/
  public AdesaoPacoteTarifaPersist cobraTarifa(Boolean cobraTarifa) {
    this.cobraTarifa = cobraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Cobra tarifa")
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
    AdesaoPacoteTarifaPersist adesaoPacoteTarifaPersist = (AdesaoPacoteTarifaPersist) o;
    return Objects.equals(this.idPacoteTarifa, adesaoPacoteTarifaPersist.idPacoteTarifa) &&
        Objects.equals(this.ciclo, adesaoPacoteTarifaPersist.ciclo) &&
        Objects.equals(this.dataHoraAtivacao, adesaoPacoteTarifaPersist.dataHoraAtivacao) &&
        Objects.equals(this.dataHoraDesativacao, adesaoPacoteTarifaPersist.dataHoraDesativacao) &&
        Objects.equals(this.dataFimCiclo, adesaoPacoteTarifaPersist.dataFimCiclo) &&
        Objects.equals(this.recargaCelularUtilizado, adesaoPacoteTarifaPersist.recargaCelularUtilizado) &&
        Objects.equals(this.bilheteUnicoUtilizado, adesaoPacoteTarifaPersist.bilheteUnicoUtilizado) &&
        Objects.equals(this.pagamentoContaUtilizado, adesaoPacoteTarifaPersist.pagamentoContaUtilizado) &&
        Objects.equals(this.saqueUtilizado, adesaoPacoteTarifaPersist.saqueUtilizado) &&
        Objects.equals(this.transferenciaUtilizado, adesaoPacoteTarifaPersist.transferenciaUtilizado) &&
        Objects.equals(this.boletoUtilizado, adesaoPacoteTarifaPersist.boletoUtilizado) &&
        Objects.equals(this.aplicacaoUtilizado, adesaoPacoteTarifaPersist.aplicacaoUtilizado) &&
        Objects.equals(this.tarifaManutencaoCobrada, adesaoPacoteTarifaPersist.tarifaManutencaoCobrada) &&
        Objects.equals(this.cobraTarifa, adesaoPacoteTarifaPersist.cobraTarifa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPacoteTarifa, ciclo, dataHoraAtivacao, dataHoraDesativacao, dataFimCiclo, recargaCelularUtilizado, bilheteUnicoUtilizado, pagamentoContaUtilizado, saqueUtilizado, transferenciaUtilizado, boletoUtilizado, aplicacaoUtilizado, tarifaManutencaoCobrada, cobraTarifa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoPacoteTarifaPersist {\n");
    
    sb.append("    idPacoteTarifa: ").append(toIndentedString(idPacoteTarifa)).append("\n");
    sb.append("    ciclo: ").append(toIndentedString(ciclo)).append("\n");
    sb.append("    dataHoraAtivacao: ").append(toIndentedString(dataHoraAtivacao)).append("\n");
    sb.append("    dataHoraDesativacao: ").append(toIndentedString(dataHoraDesativacao)).append("\n");
    sb.append("    dataFimCiclo: ").append(toIndentedString(dataFimCiclo)).append("\n");
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

