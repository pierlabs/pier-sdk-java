package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.PacoteTarifaResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{adesao_pacote_tarifa_resposta_descricao}}}
 **/

@ApiModel(description = "{{{adesao_pacote_tarifa_resposta_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AdesaoPacoteTarifaResponse   {
  
  private Integer aplicacaoUtilizado = null;
  private Integer bilheteUnicoUtilizado = null;
  private Integer boletoUtilizado = null;
  private Integer ciclo = null;
  private Boolean cobraTarifa = null;
  private String dataFimCiclo = null;
  private String dataHoraAtivacao = null;
  private String dataHoraDesativacao = null;
  private Long id = null;
  private Long idConta = null;
  private PacoteTarifaResponse pacoteTarifa = null;
  private Integer pagamentoContaUtilizado = null;
  private Integer recargaCelularUtilizado = null;
  private Integer saqueUtilizado = null;
  private Boolean tarifaManutencaoCobrada = null;
  private Integer transferenciaUtilizado = null;

  
  /**
   * {{{adesao_pacote_tarifa_resposta_aplicacao_utilizado_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse aplicacaoUtilizado(Integer aplicacaoUtilizado) {
    this.aplicacaoUtilizado = aplicacaoUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_resposta_aplicacao_utilizado_descricao}}}")
  @JsonProperty("aplicacaoUtilizado")
  public Integer getAplicacaoUtilizado() {
    return aplicacaoUtilizado;
  }
  public void setAplicacaoUtilizado(Integer aplicacaoUtilizado) {
    this.aplicacaoUtilizado = aplicacaoUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_bilhete_unico_utilizado_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse bilheteUnicoUtilizado(Integer bilheteUnicoUtilizado) {
    this.bilheteUnicoUtilizado = bilheteUnicoUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_resposta_bilhete_unico_utilizado_descricao}}}")
  @JsonProperty("bilheteUnicoUtilizado")
  public Integer getBilheteUnicoUtilizado() {
    return bilheteUnicoUtilizado;
  }
  public void setBilheteUnicoUtilizado(Integer bilheteUnicoUtilizado) {
    this.bilheteUnicoUtilizado = bilheteUnicoUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_boleto_utilizado_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse boletoUtilizado(Integer boletoUtilizado) {
    this.boletoUtilizado = boletoUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_resposta_boleto_utilizado_descricao}}}")
  @JsonProperty("boletoUtilizado")
  public Integer getBoletoUtilizado() {
    return boletoUtilizado;
  }
  public void setBoletoUtilizado(Integer boletoUtilizado) {
    this.boletoUtilizado = boletoUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_ciclo_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse ciclo(Integer ciclo) {
    this.ciclo = ciclo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_resposta_ciclo_descricao}}}")
  @JsonProperty("ciclo")
  public Integer getCiclo() {
    return ciclo;
  }
  public void setCiclo(Integer ciclo) {
    this.ciclo = ciclo;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_cobra_tarifa_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse cobraTarifa(Boolean cobraTarifa) {
    this.cobraTarifa = cobraTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_pacote_tarifa_resposta_cobra_tarifa_descricao}}}")
  @JsonProperty("cobraTarifa")
  public Boolean getCobraTarifa() {
    return cobraTarifa;
  }
  public void setCobraTarifa(Boolean cobraTarifa) {
    this.cobraTarifa = cobraTarifa;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_data_fim_ciclo_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse dataFimCiclo(String dataFimCiclo) {
    this.dataFimCiclo = dataFimCiclo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_resposta_data_fim_ciclo_descricao}}}")
  @JsonProperty("dataFimCiclo")
  public String getDataFimCiclo() {
    return dataFimCiclo;
  }
  public void setDataFimCiclo(String dataFimCiclo) {
    this.dataFimCiclo = dataFimCiclo;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_data_hora_ativacao_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse dataHoraAtivacao(String dataHoraAtivacao) {
    this.dataHoraAtivacao = dataHoraAtivacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_resposta_data_hora_ativacao_descricao}}}")
  @JsonProperty("dataHoraAtivacao")
  public String getDataHoraAtivacao() {
    return dataHoraAtivacao;
  }
  public void setDataHoraAtivacao(String dataHoraAtivacao) {
    this.dataHoraAtivacao = dataHoraAtivacao;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_data_hora_desativacao_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse dataHoraDesativacao(String dataHoraDesativacao) {
    this.dataHoraDesativacao = dataHoraDesativacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_resposta_data_hora_desativacao_descricao}}}")
  @JsonProperty("dataHoraDesativacao")
  public String getDataHoraDesativacao() {
    return dataHoraDesativacao;
  }
  public void setDataHoraDesativacao(String dataHoraDesativacao) {
    this.dataHoraDesativacao = dataHoraDesativacao;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_id_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_resposta_id_descricao}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_id_conta_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_resposta_id_conta_descricao}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_pacote_tarifa_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse pacoteTarifa(PacoteTarifaResponse pacoteTarifa) {
    this.pacoteTarifa = pacoteTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_resposta_pacote_tarifa_descricao}}}")
  @JsonProperty("pacoteTarifa")
  public PacoteTarifaResponse getPacoteTarifa() {
    return pacoteTarifa;
  }
  public void setPacoteTarifa(PacoteTarifaResponse pacoteTarifa) {
    this.pacoteTarifa = pacoteTarifa;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_pagamento_conta_utilizado_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse pagamentoContaUtilizado(Integer pagamentoContaUtilizado) {
    this.pagamentoContaUtilizado = pagamentoContaUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_resposta_pagamento_conta_utilizado_descricao}}}")
  @JsonProperty("pagamentoContaUtilizado")
  public Integer getPagamentoContaUtilizado() {
    return pagamentoContaUtilizado;
  }
  public void setPagamentoContaUtilizado(Integer pagamentoContaUtilizado) {
    this.pagamentoContaUtilizado = pagamentoContaUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_recarga_celular_utilizado_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse recargaCelularUtilizado(Integer recargaCelularUtilizado) {
    this.recargaCelularUtilizado = recargaCelularUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_resposta_recarga_celular_utilizado_descricao}}}")
  @JsonProperty("recargaCelularUtilizado")
  public Integer getRecargaCelularUtilizado() {
    return recargaCelularUtilizado;
  }
  public void setRecargaCelularUtilizado(Integer recargaCelularUtilizado) {
    this.recargaCelularUtilizado = recargaCelularUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_saque_utilizado_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse saqueUtilizado(Integer saqueUtilizado) {
    this.saqueUtilizado = saqueUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_resposta_saque_utilizado_descricao}}}")
  @JsonProperty("saqueUtilizado")
  public Integer getSaqueUtilizado() {
    return saqueUtilizado;
  }
  public void setSaqueUtilizado(Integer saqueUtilizado) {
    this.saqueUtilizado = saqueUtilizado;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_tarifa_manutencao_cobrada_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse tarifaManutencaoCobrada(Boolean tarifaManutencaoCobrada) {
    this.tarifaManutencaoCobrada = tarifaManutencaoCobrada;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_pacote_tarifa_resposta_tarifa_manutencao_cobrada_descricao}}}")
  @JsonProperty("tarifaManutencaoCobrada")
  public Boolean getTarifaManutencaoCobrada() {
    return tarifaManutencaoCobrada;
  }
  public void setTarifaManutencaoCobrada(Boolean tarifaManutencaoCobrada) {
    this.tarifaManutencaoCobrada = tarifaManutencaoCobrada;
  }

  
  /**
   * {{{adesao_pacote_tarifa_resposta_transferencia_utilizado_descricao}}}
   **/
  public AdesaoPacoteTarifaResponse transferenciaUtilizado(Integer transferenciaUtilizado) {
    this.transferenciaUtilizado = transferenciaUtilizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_pacote_tarifa_resposta_transferencia_utilizado_descricao}}}")
  @JsonProperty("transferenciaUtilizado")
  public Integer getTransferenciaUtilizado() {
    return transferenciaUtilizado;
  }
  public void setTransferenciaUtilizado(Integer transferenciaUtilizado) {
    this.transferenciaUtilizado = transferenciaUtilizado;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdesaoPacoteTarifaResponse adesaoPacoteTarifaResponse = (AdesaoPacoteTarifaResponse) o;
    return Objects.equals(this.aplicacaoUtilizado, adesaoPacoteTarifaResponse.aplicacaoUtilizado) &&
        Objects.equals(this.bilheteUnicoUtilizado, adesaoPacoteTarifaResponse.bilheteUnicoUtilizado) &&
        Objects.equals(this.boletoUtilizado, adesaoPacoteTarifaResponse.boletoUtilizado) &&
        Objects.equals(this.ciclo, adesaoPacoteTarifaResponse.ciclo) &&
        Objects.equals(this.cobraTarifa, adesaoPacoteTarifaResponse.cobraTarifa) &&
        Objects.equals(this.dataFimCiclo, adesaoPacoteTarifaResponse.dataFimCiclo) &&
        Objects.equals(this.dataHoraAtivacao, adesaoPacoteTarifaResponse.dataHoraAtivacao) &&
        Objects.equals(this.dataHoraDesativacao, adesaoPacoteTarifaResponse.dataHoraDesativacao) &&
        Objects.equals(this.id, adesaoPacoteTarifaResponse.id) &&
        Objects.equals(this.idConta, adesaoPacoteTarifaResponse.idConta) &&
        Objects.equals(this.pacoteTarifa, adesaoPacoteTarifaResponse.pacoteTarifa) &&
        Objects.equals(this.pagamentoContaUtilizado, adesaoPacoteTarifaResponse.pagamentoContaUtilizado) &&
        Objects.equals(this.recargaCelularUtilizado, adesaoPacoteTarifaResponse.recargaCelularUtilizado) &&
        Objects.equals(this.saqueUtilizado, adesaoPacoteTarifaResponse.saqueUtilizado) &&
        Objects.equals(this.tarifaManutencaoCobrada, adesaoPacoteTarifaResponse.tarifaManutencaoCobrada) &&
        Objects.equals(this.transferenciaUtilizado, adesaoPacoteTarifaResponse.transferenciaUtilizado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aplicacaoUtilizado, bilheteUnicoUtilizado, boletoUtilizado, ciclo, cobraTarifa, dataFimCiclo, dataHoraAtivacao, dataHoraDesativacao, id, idConta, pacoteTarifa, pagamentoContaUtilizado, recargaCelularUtilizado, saqueUtilizado, tarifaManutencaoCobrada, transferenciaUtilizado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoPacoteTarifaResponse {\n");
    
    sb.append("    aplicacaoUtilizado: ").append(toIndentedString(aplicacaoUtilizado)).append("\n");
    sb.append("    bilheteUnicoUtilizado: ").append(toIndentedString(bilheteUnicoUtilizado)).append("\n");
    sb.append("    boletoUtilizado: ").append(toIndentedString(boletoUtilizado)).append("\n");
    sb.append("    ciclo: ").append(toIndentedString(ciclo)).append("\n");
    sb.append("    cobraTarifa: ").append(toIndentedString(cobraTarifa)).append("\n");
    sb.append("    dataFimCiclo: ").append(toIndentedString(dataFimCiclo)).append("\n");
    sb.append("    dataHoraAtivacao: ").append(toIndentedString(dataHoraAtivacao)).append("\n");
    sb.append("    dataHoraDesativacao: ").append(toIndentedString(dataHoraDesativacao)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    pacoteTarifa: ").append(toIndentedString(pacoteTarifa)).append("\n");
    sb.append("    pagamentoContaUtilizado: ").append(toIndentedString(pagamentoContaUtilizado)).append("\n");
    sb.append("    recargaCelularUtilizado: ").append(toIndentedString(recargaCelularUtilizado)).append("\n");
    sb.append("    saqueUtilizado: ").append(toIndentedString(saqueUtilizado)).append("\n");
    sb.append("    tarifaManutencaoCobrada: ").append(toIndentedString(tarifaManutencaoCobrada)).append("\n");
    sb.append("    transferenciaUtilizado: ").append(toIndentedString(transferenciaUtilizado)).append("\n");
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

