package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de persist\u00EAncia para ades\u00E3o servi\u00E7os
 **/

@ApiModel(description = "Objeto de persist\u00EAncia para ades\u00E3o servi\u00E7os")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AdesaoServicoPersist   {
  
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
  public AdesaoServicoPersist canal(String canal) {
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
  public AdesaoServicoPersist estabelecimento(Integer estabelecimento) {
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
  public AdesaoServicoPersist tipoEnvioFatura(Integer tipoEnvioFatura) {
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
  public AdesaoServicoPersist tipoSms(TipoSmsEnum tipoSms) {
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
   * Cobranca do Limite de cr\u00E9dito
   **/
  public AdesaoServicoPersist cobrancaLimiteCredito(Boolean cobrancaLimiteCredito) {
    this.cobrancaLimiteCredito = cobrancaLimiteCredito;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Cobranca do Limite de cr\u00E9dito")
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
  public AdesaoServicoPersist flagPromocoes(Boolean flagPromocoes) {
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
  public AdesaoServicoPersist responsavel(String responsavel) {
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
   * Oferece tipo de envio da fatura
   **/
  public AdesaoServicoPersist flagTipoEnvioFatura(Boolean flagTipoEnvioFatura) {
    this.flagTipoEnvioFatura = flagTipoEnvioFatura;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Oferece tipo de envio da fatura")
  @JsonProperty("flagTipoEnvioFatura")
  public Boolean getFlagTipoEnvioFatura() {
    return flagTipoEnvioFatura;
  }
  public void setFlagTipoEnvioFatura(Boolean flagTipoEnvioFatura) {
    this.flagTipoEnvioFatura = flagTipoEnvioFatura;
  }

  
  /**
   * Oferece tipo do sms
   **/
  public AdesaoServicoPersist flagTipoSms(Boolean flagTipoSms) {
    this.flagTipoSms = flagTipoSms;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Oferece tipo do sms")
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
  public AdesaoServicoPersist flagCobrancaLimiteCredito(Boolean flagCobrancaLimiteCredito) {
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
   * Oferece promo\u00E7\u00F5es dispon\u00EDveis
   **/
  public AdesaoServicoPersist flagOfertasPromocoes(Boolean flagOfertasPromocoes) {
    this.flagOfertasPromocoes = flagOfertasPromocoes;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Oferece promo\u00E7\u00F5es dispon\u00EDveis")
  @JsonProperty("flagOfertasPromocoes")
  public Boolean getFlagOfertasPromocoes() {
    return flagOfertasPromocoes;
  }
  public void setFlagOfertasPromocoes(Boolean flagOfertasPromocoes) {
    this.flagOfertasPromocoes = flagOfertasPromocoes;
  }

  
  /**
   * Oferece ades\u00E3o de investimentos
   **/
  public AdesaoServicoPersist flagAdesaoInvestimento(Boolean flagAdesaoInvestimento) {
    this.flagAdesaoInvestimento = flagAdesaoInvestimento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Oferece ades\u00E3o de investimentos")
  @JsonProperty("flagAdesaoInvestimento")
  public Boolean getFlagAdesaoInvestimento() {
    return flagAdesaoInvestimento;
  }
  public void setFlagAdesaoInvestimento(Boolean flagAdesaoInvestimento) {
    this.flagAdesaoInvestimento = flagAdesaoInvestimento;
  }

  
  /**
   * Oferece ades\u00E3o da compra programada
   **/
  public AdesaoServicoPersist flagAdesaoCompraProgramada(Boolean flagAdesaoCompraProgramada) {
    this.flagAdesaoCompraProgramada = flagAdesaoCompraProgramada;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Oferece ades\u00E3o da compra programada")
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
    AdesaoServicoPersist adesaoServicoPersist = (AdesaoServicoPersist) o;
    return Objects.equals(this.canal, adesaoServicoPersist.canal) &&
        Objects.equals(this.estabelecimento, adesaoServicoPersist.estabelecimento) &&
        Objects.equals(this.tipoEnvioFatura, adesaoServicoPersist.tipoEnvioFatura) &&
        Objects.equals(this.tipoSms, adesaoServicoPersist.tipoSms) &&
        Objects.equals(this.cobrancaLimiteCredito, adesaoServicoPersist.cobrancaLimiteCredito) &&
        Objects.equals(this.flagPromocoes, adesaoServicoPersist.flagPromocoes) &&
        Objects.equals(this.responsavel, adesaoServicoPersist.responsavel) &&
        Objects.equals(this.flagTipoEnvioFatura, adesaoServicoPersist.flagTipoEnvioFatura) &&
        Objects.equals(this.flagTipoSms, adesaoServicoPersist.flagTipoSms) &&
        Objects.equals(this.flagCobrancaLimiteCredito, adesaoServicoPersist.flagCobrancaLimiteCredito) &&
        Objects.equals(this.flagOfertasPromocoes, adesaoServicoPersist.flagOfertasPromocoes) &&
        Objects.equals(this.flagAdesaoInvestimento, adesaoServicoPersist.flagAdesaoInvestimento) &&
        Objects.equals(this.flagAdesaoCompraProgramada, adesaoServicoPersist.flagAdesaoCompraProgramada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canal, estabelecimento, tipoEnvioFatura, tipoSms, cobrancaLimiteCredito, flagPromocoes, responsavel, flagTipoEnvioFatura, flagTipoSms, flagCobrancaLimiteCredito, flagOfertasPromocoes, flagAdesaoInvestimento, flagAdesaoCompraProgramada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoServicoPersist {\n");
    
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

