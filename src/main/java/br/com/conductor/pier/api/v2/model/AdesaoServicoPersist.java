package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{adesao_servico_persistencia_descricao}}}
 **/

@ApiModel(description = "{{{adesao_servico_persistencia_descricao}}}")
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

  
  /**
   * {{{adesao_servico_persistencia_canal_descricao}}}
   **/
  public AdesaoServicoPersist canal(String canal) {
    this.canal = canal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_servico_persistencia_canal_descricao}}}")
  @JsonProperty("canal")
  public String getCanal() {
    return canal;
  }
  public void setCanal(String canal) {
    this.canal = canal;
  }

  
  /**
   * {{{adesao_servico_persistencia_estabelecimento_descricao}}}
   **/
  public AdesaoServicoPersist estabelecimento(Integer estabelecimento) {
    this.estabelecimento = estabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_servico_persistencia_estabelecimento_descricao}}}")
  @JsonProperty("estabelecimento")
  public Integer getEstabelecimento() {
    return estabelecimento;
  }
  public void setEstabelecimento(Integer estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  
  /**
   * {{{adesao_servico_persistencia_tipo_envio_fatura_descricao}}}
   **/
  public AdesaoServicoPersist tipoEnvioFatura(Integer tipoEnvioFatura) {
    this.tipoEnvioFatura = tipoEnvioFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_servico_persistencia_tipo_envio_fatura_descricao}}}")
  @JsonProperty("tipoEnvioFatura")
  public Integer getTipoEnvioFatura() {
    return tipoEnvioFatura;
  }
  public void setTipoEnvioFatura(Integer tipoEnvioFatura) {
    this.tipoEnvioFatura = tipoEnvioFatura;
  }

  
  /**
   * {{{adesao_servico_persistencia_tipo_sms_descricao}}}
   **/
  public AdesaoServicoPersist tipoSms(TipoSmsEnum tipoSms) {
    this.tipoSms = tipoSms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_servico_persistencia_tipo_sms_descricao}}}")
  @JsonProperty("tipoSms")
  public TipoSmsEnum getTipoSms() {
    return tipoSms;
  }
  public void setTipoSms(TipoSmsEnum tipoSms) {
    this.tipoSms = tipoSms;
  }

  
  /**
   * {{{adesao_servico_persistencia_cobranca_limite_credito_descricao}}}
   **/
  public AdesaoServicoPersist cobrancaLimiteCredito(Boolean cobrancaLimiteCredito) {
    this.cobrancaLimiteCredito = cobrancaLimiteCredito;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_servico_persistencia_cobranca_limite_credito_descricao}}}")
  @JsonProperty("cobrancaLimiteCredito")
  public Boolean getCobrancaLimiteCredito() {
    return cobrancaLimiteCredito;
  }
  public void setCobrancaLimiteCredito(Boolean cobrancaLimiteCredito) {
    this.cobrancaLimiteCredito = cobrancaLimiteCredito;
  }

  
  /**
   * {{{adesao_servico_persistencia_ofertas_promocoes_descricao}}}
   **/
  public AdesaoServicoPersist flagPromocoes(Boolean flagPromocoes) {
    this.flagPromocoes = flagPromocoes;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_servico_persistencia_ofertas_promocoes_descricao}}}")
  @JsonProperty("flagPromocoes")
  public Boolean getFlagPromocoes() {
    return flagPromocoes;
  }
  public void setFlagPromocoes(Boolean flagPromocoes) {
    this.flagPromocoes = flagPromocoes;
  }

  
  /**
   * {{{adesao_servico_persistencia_responsavel_descricao}}}
   **/
  public AdesaoServicoPersist responsavel(String responsavel) {
    this.responsavel = responsavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_servico_persistencia_responsavel_descricao}}}")
  @JsonProperty("responsavel")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * {{{adesao_servico_persistencia_ofertar_tipo_envio_fatura_descricao}}}
   **/
  public AdesaoServicoPersist flagTipoEnvioFatura(Boolean flagTipoEnvioFatura) {
    this.flagTipoEnvioFatura = flagTipoEnvioFatura;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_servico_persistencia_ofertar_tipo_envio_fatura_descricao}}}")
  @JsonProperty("flagTipoEnvioFatura")
  public Boolean getFlagTipoEnvioFatura() {
    return flagTipoEnvioFatura;
  }
  public void setFlagTipoEnvioFatura(Boolean flagTipoEnvioFatura) {
    this.flagTipoEnvioFatura = flagTipoEnvioFatura;
  }

  
  /**
   * {{{adesao_servico_persistencia_ofertar_tipo_sms_descricao}}}
   **/
  public AdesaoServicoPersist flagTipoSms(Boolean flagTipoSms) {
    this.flagTipoSms = flagTipoSms;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_servico_persistencia_ofertar_tipo_sms_descricao}}}")
  @JsonProperty("flagTipoSms")
  public Boolean getFlagTipoSms() {
    return flagTipoSms;
  }
  public void setFlagTipoSms(Boolean flagTipoSms) {
    this.flagTipoSms = flagTipoSms;
  }

  
  /**
   * {{{adesao_servico_persistencia_ofertar_cobranca_limite_credito_descricao}}}
   **/
  public AdesaoServicoPersist flagCobrancaLimiteCredito(Boolean flagCobrancaLimiteCredito) {
    this.flagCobrancaLimiteCredito = flagCobrancaLimiteCredito;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_servico_persistencia_ofertar_cobranca_limite_credito_descricao}}}")
  @JsonProperty("flagCobrancaLimiteCredito")
  public Boolean getFlagCobrancaLimiteCredito() {
    return flagCobrancaLimiteCredito;
  }
  public void setFlagCobrancaLimiteCredito(Boolean flagCobrancaLimiteCredito) {
    this.flagCobrancaLimiteCredito = flagCobrancaLimiteCredito;
  }

  
  /**
   * {{{adesao_servico_persistencia_ofertar_ofertas_promocoes_descricao}}}
   **/
  public AdesaoServicoPersist flagOfertasPromocoes(Boolean flagOfertasPromocoes) {
    this.flagOfertasPromocoes = flagOfertasPromocoes;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_servico_persistencia_ofertar_ofertas_promocoes_descricao}}}")
  @JsonProperty("flagOfertasPromocoes")
  public Boolean getFlagOfertasPromocoes() {
    return flagOfertasPromocoes;
  }
  public void setFlagOfertasPromocoes(Boolean flagOfertasPromocoes) {
    this.flagOfertasPromocoes = flagOfertasPromocoes;
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
        Objects.equals(this.flagOfertasPromocoes, adesaoServicoPersist.flagOfertasPromocoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canal, estabelecimento, tipoEnvioFatura, tipoSms, cobrancaLimiteCredito, flagPromocoes, responsavel, flagTipoEnvioFatura, flagTipoSms, flagCobrancaLimiteCredito, flagOfertasPromocoes);
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

