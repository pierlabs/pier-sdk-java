package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{adesao_pacote_tarifa_persistencia_descricao}}}
 **/

@ApiModel(description = "{{{adesao_pacote_tarifa_persistencia_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AdesaoPacoteTarifaPersistencia   {
  
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
   * {{{adesao_pacote_tarifa_persistencia_id_pacote_tarefa_descricao}}}
   **/
  public AdesaoPacoteTarifaPersistencia idPacoteTarifa(Long idPacoteTarifa) {
    this.idPacoteTarifa = idPacoteTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{adesao_pacote_tarifa_persistencia_id_pacote_tarefa_descricao}}}")
  @JsonProperty("idPacoteTarifa")
  public Long getIdPacoteTarifa() {
    return idPacoteTarifa;
  }
  public void setIdPacoteTarifa(Long idPacoteTarifa) {
    this.idPacoteTarifa = idPacoteTarifa;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_ciclo_descricao}}}
   **/
  public AdesaoPacoteTarifaPersistencia ciclo(Integer ciclo) {
    this.ciclo = ciclo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_persistencia_ciclo_descricao}}}")
  @JsonProperty("ciclo")
  public Integer getCiclo() {
    return ciclo;
  }
  public void setCiclo(Integer ciclo) {
    this.ciclo = ciclo;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_data_hora_ativacao_descricao}}}
   **/
  public AdesaoPacoteTarifaPersistencia dataHoraAtivacao(String dataHoraAtivacao) {
    this.dataHoraAtivacao = dataHoraAtivacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_persistencia_data_hora_ativacao_descricao}}}")
  @JsonProperty("dataHoraAtivacao")
  public String getDataHoraAtivacao() {
    return dataHoraAtivacao;
  }
  public void setDataHoraAtivacao(String dataHoraAtivacao) {
    this.dataHoraAtivacao = dataHoraAtivacao;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_data_hora_desativacao_descricao}}}
   **/
  public AdesaoPacoteTarifaPersistencia dataHoraDesativacao(String dataHoraDesativacao) {
    this.dataHoraDesativacao = dataHoraDesativacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_persistencia_data_hora_desativacao_descricao}}}")
  @JsonProperty("dataHoraDesativacao")
  public String getDataHoraDesativacao() {
    return dataHoraDesativacao;
  }
  public void setDataHoraDesativacao(String dataHoraDesativacao) {
    this.dataHoraDesativacao = dataHoraDesativacao;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_data_fim_ciclo_descricao}}}
   **/
  public AdesaoPacoteTarifaPersistencia dataFimCiclo(String dataFimCiclo) {
    this.dataFimCiclo = dataFimCiclo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_persistencia_data_fim_ciclo_descricao}}}")
  @JsonProperty("dataFimCiclo")
  public String getDataFimCiclo() {
    return dataFimCiclo;
  }
  public void setDataFimCiclo(String dataFimCiclo) {
    this.dataFimCiclo = dataFimCiclo;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_recarga_celular_utilizado_descricao}}}
   **/
  public AdesaoPacoteTarifaPersistencia recargaCelularUtilizado(Integer recargaCelularUtilizado) {
    this.recargaCelularUtilizado = recargaCelularUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{adesao_pacote_tarifa_persistencia_recarga_celular_utilizado_descricao}}}")
  @JsonProperty("recargaCelularUtilizado")
  public Integer getRecargaCelularUtilizado() {
    return recargaCelularUtilizado;
  }
  public void setRecargaCelularUtilizado(Integer recargaCelularUtilizado) {
    this.recargaCelularUtilizado = recargaCelularUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_bilhete_unico_utilizado_descricao}}}
   **/
  public AdesaoPacoteTarifaPersistencia bilheteUnicoUtilizado(Integer bilheteUnicoUtilizado) {
    this.bilheteUnicoUtilizado = bilheteUnicoUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{adesao_pacote_tarifa_persistencia_bilhete_unico_utilizado_descricao}}}")
  @JsonProperty("bilheteUnicoUtilizado")
  public Integer getBilheteUnicoUtilizado() {
    return bilheteUnicoUtilizado;
  }
  public void setBilheteUnicoUtilizado(Integer bilheteUnicoUtilizado) {
    this.bilheteUnicoUtilizado = bilheteUnicoUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_pagamento_conta_utilizado_descricao}}}
   **/
  public AdesaoPacoteTarifaPersistencia pagamentoContaUtilizado(Integer pagamentoContaUtilizado) {
    this.pagamentoContaUtilizado = pagamentoContaUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{adesao_pacote_tarifa_persistencia_pagamento_conta_utilizado_descricao}}}")
  @JsonProperty("pagamentoContaUtilizado")
  public Integer getPagamentoContaUtilizado() {
    return pagamentoContaUtilizado;
  }
  public void setPagamentoContaUtilizado(Integer pagamentoContaUtilizado) {
    this.pagamentoContaUtilizado = pagamentoContaUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_saque_utilizado_descricao}}}
   **/
  public AdesaoPacoteTarifaPersistencia saqueUtilizado(Integer saqueUtilizado) {
    this.saqueUtilizado = saqueUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{adesao_pacote_tarifa_persistencia_saque_utilizado_descricao}}}")
  @JsonProperty("saqueUtilizado")
  public Integer getSaqueUtilizado() {
    return saqueUtilizado;
  }
  public void setSaqueUtilizado(Integer saqueUtilizado) {
    this.saqueUtilizado = saqueUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_transferencia_utilizado_descricao}}}
   **/
  public AdesaoPacoteTarifaPersistencia transferenciaUtilizado(Integer transferenciaUtilizado) {
    this.transferenciaUtilizado = transferenciaUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{adesao_pacote_tarifa_persistencia_transferencia_utilizado_descricao}}}")
  @JsonProperty("transferenciaUtilizado")
  public Integer getTransferenciaUtilizado() {
    return transferenciaUtilizado;
  }
  public void setTransferenciaUtilizado(Integer transferenciaUtilizado) {
    this.transferenciaUtilizado = transferenciaUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_boleto_utilizado_descricao}}}
   **/
  public AdesaoPacoteTarifaPersistencia boletoUtilizado(Integer boletoUtilizado) {
    this.boletoUtilizado = boletoUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{adesao_pacote_tarifa_persistencia_boleto_utilizado_descricao}}}")
  @JsonProperty("boletoUtilizado")
  public Integer getBoletoUtilizado() {
    return boletoUtilizado;
  }
  public void setBoletoUtilizado(Integer boletoUtilizado) {
    this.boletoUtilizado = boletoUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_aplicacao_utilizado_descricao}}}
   **/
  public AdesaoPacoteTarifaPersistencia aplicacaoUtilizado(Integer aplicacaoUtilizado) {
    this.aplicacaoUtilizado = aplicacaoUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{adesao_pacote_tarifa_persistencia_aplicacao_utilizado_descricao}}}")
  @JsonProperty("aplicacaoUtilizado")
  public Integer getAplicacaoUtilizado() {
    return aplicacaoUtilizado;
  }
  public void setAplicacaoUtilizado(Integer aplicacaoUtilizado) {
    this.aplicacaoUtilizado = aplicacaoUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_tarifa_manutencao_cobrada_descricao}}}
   **/
  public AdesaoPacoteTarifaPersistencia tarifaManutencaoCobrada(Boolean tarifaManutencaoCobrada) {
    this.tarifaManutencaoCobrada = tarifaManutencaoCobrada;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_pacote_tarifa_persistencia_tarifa_manutencao_cobrada_descricao}}}")
  @JsonProperty("tarifaManutencaoCobrada")
  public Boolean getTarifaManutencaoCobrada() {
    return tarifaManutencaoCobrada;
  }
  public void setTarifaManutencaoCobrada(Boolean tarifaManutencaoCobrada) {
    this.tarifaManutencaoCobrada = tarifaManutencaoCobrada;
  }

  
  /**
   * {{{adesao_pacote_tarifa_persistencia_cobra_tarifa_descricao}}}
   **/
  public AdesaoPacoteTarifaPersistencia cobraTarifa(Boolean cobraTarifa) {
    this.cobraTarifa = cobraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_pacote_tarifa_persistencia_cobra_tarifa_descricao}}}")
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
    AdesaoPacoteTarifaPersistencia adesaoPacoteTarifaPersistencia = (AdesaoPacoteTarifaPersistencia) o;
    return Objects.equals(this.idPacoteTarifa, adesaoPacoteTarifaPersistencia.idPacoteTarifa) &&
        Objects.equals(this.ciclo, adesaoPacoteTarifaPersistencia.ciclo) &&
        Objects.equals(this.dataHoraAtivacao, adesaoPacoteTarifaPersistencia.dataHoraAtivacao) &&
        Objects.equals(this.dataHoraDesativacao, adesaoPacoteTarifaPersistencia.dataHoraDesativacao) &&
        Objects.equals(this.dataFimCiclo, adesaoPacoteTarifaPersistencia.dataFimCiclo) &&
        Objects.equals(this.recargaCelularUtilizado, adesaoPacoteTarifaPersistencia.recargaCelularUtilizado) &&
        Objects.equals(this.bilheteUnicoUtilizado, adesaoPacoteTarifaPersistencia.bilheteUnicoUtilizado) &&
        Objects.equals(this.pagamentoContaUtilizado, adesaoPacoteTarifaPersistencia.pagamentoContaUtilizado) &&
        Objects.equals(this.saqueUtilizado, adesaoPacoteTarifaPersistencia.saqueUtilizado) &&
        Objects.equals(this.transferenciaUtilizado, adesaoPacoteTarifaPersistencia.transferenciaUtilizado) &&
        Objects.equals(this.boletoUtilizado, adesaoPacoteTarifaPersistencia.boletoUtilizado) &&
        Objects.equals(this.aplicacaoUtilizado, adesaoPacoteTarifaPersistencia.aplicacaoUtilizado) &&
        Objects.equals(this.tarifaManutencaoCobrada, adesaoPacoteTarifaPersistencia.tarifaManutencaoCobrada) &&
        Objects.equals(this.cobraTarifa, adesaoPacoteTarifaPersistencia.cobraTarifa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPacoteTarifa, ciclo, dataHoraAtivacao, dataHoraDesativacao, dataFimCiclo, recargaCelularUtilizado, bilheteUnicoUtilizado, pagamentoContaUtilizado, saqueUtilizado, transferenciaUtilizado, boletoUtilizado, aplicacaoUtilizado, tarifaManutencaoCobrada, cobraTarifa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoPacoteTarifaPersistencia {\n");
    
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

