package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de atualiza\u00E7\u00E3o para ades\u00E3o servi\u00E7os
 **/

@ApiModel(description = "Objeto de atualiza\u00E7\u00E3o para ades\u00E3o servi\u00E7os")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AdesaoServicoPartialUpdate   {
  
  private String canal = null;
  private Integer estabelecimento = null;
  private Integer tipoEnvioFatura = null;


  public enum TipoSmsEnum {
    CONTROLE("CONTROLE"),
    NOTIFICACAO("NOTIFICACAO"),
    ALERTA("ALERTA");

    private String value;

    TipoSmsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TipoSmsEnum tipoSms = null;
  private Boolean cobrancaLimiteCredito = null;
  private Boolean flagPromocoes = null;
  private String responsavel = null;
  private Boolean flagTipoEnvioFatura = null;
  private Boolean flagTipoSms = null;
  private Boolean flagCobrancaLimiteCredito = null;
  private Boolean flagOfertasPromocoes = null;
  private Boolean flagAdesaoInvestimento = null;
  private Boolean flagAdesaoCompraProgramada = null;

  
  /**
   * Canal de entrada
   **/
  public AdesaoServicoPartialUpdate canal(String canal) {
    this.canal = canal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Canal de entrada")
  @JsonProperty("canal")
  public String getCanal() {
    return canal;
  }
  public void setCanal(String canal) {
    this.canal = canal;
  }

  
  /**
   * Estabelecimento
   **/
  public AdesaoServicoPartialUpdate estabelecimento(Integer estabelecimento) {
    this.estabelecimento = estabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Estabelecimento")
  @JsonProperty("estabelecimento")
  public Integer getEstabelecimento() {
    return estabelecimento;
  }
  public void setEstabelecimento(Integer estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  
  /**
   * Tipo do envio da fatura
   **/
  public AdesaoServicoPartialUpdate tipoEnvioFatura(Integer tipoEnvioFatura) {
    this.tipoEnvioFatura = tipoEnvioFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo do envio da fatura")
  @JsonProperty("tipoEnvioFatura")
  public Integer getTipoEnvioFatura() {
    return tipoEnvioFatura;
  }
  public void setTipoEnvioFatura(Integer tipoEnvioFatura) {
    this.tipoEnvioFatura = tipoEnvioFatura;
  }

  
  /**
   * Tipo do sms
   **/
  public AdesaoServicoPartialUpdate tipoSms(TipoSmsEnum tipoSms) {
    this.tipoSms = tipoSms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo do sms")
  @JsonProperty("tipoSms")
  public TipoSmsEnum getTipoSms() {
    return tipoSms;
  }
  public void setTipoSms(TipoSmsEnum tipoSms) {
    this.tipoSms = tipoSms;
  }

  
  /**
   * Cobran\u00E7a do limite de cr\u00E9dito
   **/
  public AdesaoServicoPartialUpdate cobrancaLimiteCredito(Boolean cobrancaLimiteCredito) {
    this.cobrancaLimiteCredito = cobrancaLimiteCredito;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Cobran\u00E7a do limite de cr\u00E9dito")
  @JsonProperty("cobrancaLimiteCredito")
  public Boolean getCobrancaLimiteCredito() {
    return cobrancaLimiteCredito;
  }
  public void setCobrancaLimiteCredito(Boolean cobrancaLimiteCredito) {
    this.cobrancaLimiteCredito = cobrancaLimiteCredito;
  }

  
  /**
   * Ofertar promo\u00E7\u00F5es
   **/
  public AdesaoServicoPartialUpdate flagPromocoes(Boolean flagPromocoes) {
    this.flagPromocoes = flagPromocoes;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Ofertar promo\u00E7\u00F5es")
  @JsonProperty("flagPromocoes")
  public Boolean getFlagPromocoes() {
    return flagPromocoes;
  }
  public void setFlagPromocoes(Boolean flagPromocoes) {
    this.flagPromocoes = flagPromocoes;
  }

  
  /**
   * Respons\u00E1vel
   **/
  public AdesaoServicoPartialUpdate responsavel(String responsavel) {
    this.responsavel = responsavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Respons\u00E1vel")
  @JsonProperty("responsavel")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * Oferece a op\u00E7\u00E3o do tipo de envio da fatura
   **/
  public AdesaoServicoPartialUpdate flagTipoEnvioFatura(Boolean flagTipoEnvioFatura) {
    this.flagTipoEnvioFatura = flagTipoEnvioFatura;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Oferece a op\u00E7\u00E3o do tipo de envio da fatura")
  @JsonProperty("flagTipoEnvioFatura")
  public Boolean getFlagTipoEnvioFatura() {
    return flagTipoEnvioFatura;
  }
  public void setFlagTipoEnvioFatura(Boolean flagTipoEnvioFatura) {
    this.flagTipoEnvioFatura = flagTipoEnvioFatura;
  }

  
  /**
   * Oferece a op\u00E7\u00E3o do tipo do sms
   **/
  public AdesaoServicoPartialUpdate flagTipoSms(Boolean flagTipoSms) {
    this.flagTipoSms = flagTipoSms;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Oferece a op\u00E7\u00E3o do tipo do sms")
  @JsonProperty("flagTipoSms")
  public Boolean getFlagTipoSms() {
    return flagTipoSms;
  }
  public void setFlagTipoSms(Boolean flagTipoSms) {
    this.flagTipoSms = flagTipoSms;
  }

  
  /**
   * Oferece cobran\u00E7a no limite de cr\u00E9dito
   **/
  public AdesaoServicoPartialUpdate flagCobrancaLimiteCredito(Boolean flagCobrancaLimiteCredito) {
    this.flagCobrancaLimiteCredito = flagCobrancaLimiteCredito;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Oferece cobran\u00E7a no limite de cr\u00E9dito")
  @JsonProperty("flagCobrancaLimiteCredito")
  public Boolean getFlagCobrancaLimiteCredito() {
    return flagCobrancaLimiteCredito;
  }
  public void setFlagCobrancaLimiteCredito(Boolean flagCobrancaLimiteCredito) {
    this.flagCobrancaLimiteCredito = flagCobrancaLimiteCredito;
  }

  
  /**
   * Oferece a op\u00E7\u00E3o de promo\u00E7\u00F5es disponiveis
   **/
  public AdesaoServicoPartialUpdate flagOfertasPromocoes(Boolean flagOfertasPromocoes) {
    this.flagOfertasPromocoes = flagOfertasPromocoes;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Oferece a op\u00E7\u00E3o de promo\u00E7\u00F5es disponiveis")
  @JsonProperty("flagOfertasPromocoes")
  public Boolean getFlagOfertasPromocoes() {
    return flagOfertasPromocoes;
  }
  public void setFlagOfertasPromocoes(Boolean flagOfertasPromocoes) {
    this.flagOfertasPromocoes = flagOfertasPromocoes;
  }

  
  /**
   * Permite a op\u00E7\u00E3o da ades\u00E3o de investimentos 
   **/
  public AdesaoServicoPartialUpdate flagAdesaoInvestimento(Boolean flagAdesaoInvestimento) {
    this.flagAdesaoInvestimento = flagAdesaoInvestimento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Permite a op\u00E7\u00E3o da ades\u00E3o de investimentos ")
  @JsonProperty("flagAdesaoInvestimento")
  public Boolean getFlagAdesaoInvestimento() {
    return flagAdesaoInvestimento;
  }
  public void setFlagAdesaoInvestimento(Boolean flagAdesaoInvestimento) {
    this.flagAdesaoInvestimento = flagAdesaoInvestimento;
  }

  
  /**
   * Permite a op\u00E7\u00E3o da ades\u00E3o compra programada
   **/
  public AdesaoServicoPartialUpdate flagAdesaoCompraProgramada(Boolean flagAdesaoCompraProgramada) {
    this.flagAdesaoCompraProgramada = flagAdesaoCompraProgramada;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Permite a op\u00E7\u00E3o da ades\u00E3o compra programada")
  @JsonProperty("flagAdesaoCompraProgramada")
  public Boolean getFlagAdesaoCompraProgramada() {
    return flagAdesaoCompraProgramada;
  }
  public void setFlagAdesaoCompraProgramada(Boolean flagAdesaoCompraProgramada) {
    this.flagAdesaoCompraProgramada = flagAdesaoCompraProgramada;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdesaoServicoPartialUpdate adesaoServicoPartialUpdate = (AdesaoServicoPartialUpdate) o;
    return Objects.equals(this.canal, adesaoServicoPartialUpdate.canal) &&
        Objects.equals(this.estabelecimento, adesaoServicoPartialUpdate.estabelecimento) &&
        Objects.equals(this.tipoEnvioFatura, adesaoServicoPartialUpdate.tipoEnvioFatura) &&
        Objects.equals(this.tipoSms, adesaoServicoPartialUpdate.tipoSms) &&
        Objects.equals(this.cobrancaLimiteCredito, adesaoServicoPartialUpdate.cobrancaLimiteCredito) &&
        Objects.equals(this.flagPromocoes, adesaoServicoPartialUpdate.flagPromocoes) &&
        Objects.equals(this.responsavel, adesaoServicoPartialUpdate.responsavel) &&
        Objects.equals(this.flagTipoEnvioFatura, adesaoServicoPartialUpdate.flagTipoEnvioFatura) &&
        Objects.equals(this.flagTipoSms, adesaoServicoPartialUpdate.flagTipoSms) &&
        Objects.equals(this.flagCobrancaLimiteCredito, adesaoServicoPartialUpdate.flagCobrancaLimiteCredito) &&
        Objects.equals(this.flagOfertasPromocoes, adesaoServicoPartialUpdate.flagOfertasPromocoes) &&
        Objects.equals(this.flagAdesaoInvestimento, adesaoServicoPartialUpdate.flagAdesaoInvestimento) &&
        Objects.equals(this.flagAdesaoCompraProgramada, adesaoServicoPartialUpdate.flagAdesaoCompraProgramada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canal, estabelecimento, tipoEnvioFatura, tipoSms, cobrancaLimiteCredito, flagPromocoes, responsavel, flagTipoEnvioFatura, flagTipoSms, flagCobrancaLimiteCredito, flagOfertasPromocoes, flagAdesaoInvestimento, flagAdesaoCompraProgramada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoServicoPartialUpdate {\n");
    
    sb.append("    canal: ").append(toIndentedString(canal)).append("\n");
    sb.append("    estabelecimento: ").append(toIndentedString(estabelecimento)).append("\n");
    sb.append("    tipoEnvioFatura: ").append(toIndentedString(tipoEnvioFatura)).append("\n");
    sb.append("    tipoSms: ").append(toIndentedString(tipoSms)).append("\n");
    sb.append("    cobrancaLimiteCredito: ").append(toIndentedString(cobrancaLimiteCredito)).append("\n");
    sb.append("    flagPromocoes: ").append(toIndentedString(flagPromocoes)).append("\n");
    sb.append("    responsavel: ").append(toIndentedString(responsavel)).append("\n");
    sb.append("    flagTipoEnvioFatura: ").append(toIndentedString(flagTipoEnvioFatura)).append("\n");
    sb.append("    flagTipoSms: ").append(toIndentedString(flagTipoSms)).append("\n");
    sb.append("    flagCobrancaLimiteCredito: ").append(toIndentedString(flagCobrancaLimiteCredito)).append("\n");
    sb.append("    flagOfertasPromocoes: ").append(toIndentedString(flagOfertasPromocoes)).append("\n");
    sb.append("    flagAdesaoInvestimento: ").append(toIndentedString(flagAdesaoInvestimento)).append("\n");
    sb.append("    flagAdesaoCompraProgramada: ").append(toIndentedString(flagAdesaoCompraProgramada)).append("\n");
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

