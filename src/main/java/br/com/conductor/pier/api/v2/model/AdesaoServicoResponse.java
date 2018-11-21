package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{adesao_servico_resposta_descricao}}}
 **/

@ApiModel(description = "{{{adesao_servico_resposta_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AdesaoServicoResponse   {
  
  private String canal = null;
  private Boolean cobrancaLimiteCredito = null;
  private Integer estabelecimento = null;
  private Boolean flagCobrancaLimiteCredito = null;
  private Boolean flagOfertasPromocoes = null;
  private Boolean flagPromocoes = null;
  private Boolean flagTipoEnvioFatura = null;
  private Boolean flagTipoSms = null;
  private Long id = null;
  private String responsavel = null;
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

  
  /**
   * {{{adesao_servico_resposta_canal_descricao}}}
   **/
  public AdesaoServicoResponse canal(String canal) {
    this.canal = canal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_servico_resposta_canal_descricao}}}")
  @JsonProperty("canal")
  public String getCanal() {
    return canal;
  }
  public void setCanal(String canal) {
    this.canal = canal;
  }

  
  /**
   * {{{adesao_servico_resposta_cobranca_limite_credito_descricao}}}
   **/
  public AdesaoServicoResponse cobrancaLimiteCredito(Boolean cobrancaLimiteCredito) {
    this.cobrancaLimiteCredito = cobrancaLimiteCredito;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_servico_resposta_cobranca_limite_credito_descricao}}}")
  @JsonProperty("cobrancaLimiteCredito")
  public Boolean getCobrancaLimiteCredito() {
    return cobrancaLimiteCredito;
  }
  public void setCobrancaLimiteCredito(Boolean cobrancaLimiteCredito) {
    this.cobrancaLimiteCredito = cobrancaLimiteCredito;
  }

  
  /**
   * {{{adesao_servico_resposta_estabelecimento_descricao}}}
   **/
  public AdesaoServicoResponse estabelecimento(Integer estabelecimento) {
    this.estabelecimento = estabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_servico_resposta_estabelecimento_descricao}}}")
  @JsonProperty("estabelecimento")
  public Integer getEstabelecimento() {
    return estabelecimento;
  }
  public void setEstabelecimento(Integer estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  
  /**
   * {{{adesao_servico_resposta_ofertar_cobranca_limite_credito_descricao}}}
   **/
  public AdesaoServicoResponse flagCobrancaLimiteCredito(Boolean flagCobrancaLimiteCredito) {
    this.flagCobrancaLimiteCredito = flagCobrancaLimiteCredito;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_servico_resposta_ofertar_cobranca_limite_credito_descricao}}}")
  @JsonProperty("flagCobrancaLimiteCredito")
  public Boolean getFlagCobrancaLimiteCredito() {
    return flagCobrancaLimiteCredito;
  }
  public void setFlagCobrancaLimiteCredito(Boolean flagCobrancaLimiteCredito) {
    this.flagCobrancaLimiteCredito = flagCobrancaLimiteCredito;
  }

  
  /**
   * {{{adesao_servico_resposta_ofertar_ofertas_promocoes_descricao}}}
   **/
  public AdesaoServicoResponse flagOfertasPromocoes(Boolean flagOfertasPromocoes) {
    this.flagOfertasPromocoes = flagOfertasPromocoes;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_servico_resposta_ofertar_ofertas_promocoes_descricao}}}")
  @JsonProperty("flagOfertasPromocoes")
  public Boolean getFlagOfertasPromocoes() {
    return flagOfertasPromocoes;
  }
  public void setFlagOfertasPromocoes(Boolean flagOfertasPromocoes) {
    this.flagOfertasPromocoes = flagOfertasPromocoes;
  }

  
  /**
   * {{{adesao_servico_resposta_ofertas_promocoes_descricao}}}
   **/
  public AdesaoServicoResponse flagPromocoes(Boolean flagPromocoes) {
    this.flagPromocoes = flagPromocoes;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_servico_resposta_ofertas_promocoes_descricao}}}")
  @JsonProperty("flagPromocoes")
  public Boolean getFlagPromocoes() {
    return flagPromocoes;
  }
  public void setFlagPromocoes(Boolean flagPromocoes) {
    this.flagPromocoes = flagPromocoes;
  }

  
  /**
   * {{{adesao_servico_resposta_ofertar_tipo_envio_fatura_descricao}}}
   **/
  public AdesaoServicoResponse flagTipoEnvioFatura(Boolean flagTipoEnvioFatura) {
    this.flagTipoEnvioFatura = flagTipoEnvioFatura;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_servico_resposta_ofertar_tipo_envio_fatura_descricao}}}")
  @JsonProperty("flagTipoEnvioFatura")
  public Boolean getFlagTipoEnvioFatura() {
    return flagTipoEnvioFatura;
  }
  public void setFlagTipoEnvioFatura(Boolean flagTipoEnvioFatura) {
    this.flagTipoEnvioFatura = flagTipoEnvioFatura;
  }

  
  /**
   * {{{adesao_servico_resposta_ofertar_tipo_sms_descricao}}}
   **/
  public AdesaoServicoResponse flagTipoSms(Boolean flagTipoSms) {
    this.flagTipoSms = flagTipoSms;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{adesao_servico_resposta_ofertar_tipo_sms_descricao}}}")
  @JsonProperty("flagTipoSms")
  public Boolean getFlagTipoSms() {
    return flagTipoSms;
  }
  public void setFlagTipoSms(Boolean flagTipoSms) {
    this.flagTipoSms = flagTipoSms;
  }

  
  /**
   * {{{adesao_servico_resposta_id_descricao}}}
   **/
  public AdesaoServicoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_servico_resposta_id_descricao}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{adesao_servico_resposta_responsavel_descricao}}}
   **/
  public AdesaoServicoResponse responsavel(String responsavel) {
    this.responsavel = responsavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_servico_resposta_responsavel_descricao}}}")
  @JsonProperty("responsavel")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * {{{adesao_servico_resposta_tipo_envio_fatura_descricao}}}
   **/
  public AdesaoServicoResponse tipoEnvioFatura(Integer tipoEnvioFatura) {
    this.tipoEnvioFatura = tipoEnvioFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_servico_resposta_tipo_envio_fatura_descricao}}}")
  @JsonProperty("tipoEnvioFatura")
  public Integer getTipoEnvioFatura() {
    return tipoEnvioFatura;
  }
  public void setTipoEnvioFatura(Integer tipoEnvioFatura) {
    this.tipoEnvioFatura = tipoEnvioFatura;
  }

  
  /**
   * {{{adesao_servico_resposta_tipo_sms_descricao}}}
   **/
  public AdesaoServicoResponse tipoSms(TipoSmsEnum tipoSms) {
    this.tipoSms = tipoSms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{adesao_servico_resposta_tipo_sms_descricao}}}")
  @JsonProperty("tipoSms")
  public TipoSmsEnum getTipoSms() {
    return tipoSms;
  }
  public void setTipoSms(TipoSmsEnum tipoSms) {
    this.tipoSms = tipoSms;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdesaoServicoResponse adesaoServicoResponse = (AdesaoServicoResponse) o;
    return Objects.equals(this.canal, adesaoServicoResponse.canal) &&
        Objects.equals(this.cobrancaLimiteCredito, adesaoServicoResponse.cobrancaLimiteCredito) &&
        Objects.equals(this.estabelecimento, adesaoServicoResponse.estabelecimento) &&
        Objects.equals(this.flagCobrancaLimiteCredito, adesaoServicoResponse.flagCobrancaLimiteCredito) &&
        Objects.equals(this.flagOfertasPromocoes, adesaoServicoResponse.flagOfertasPromocoes) &&
        Objects.equals(this.flagPromocoes, adesaoServicoResponse.flagPromocoes) &&
        Objects.equals(this.flagTipoEnvioFatura, adesaoServicoResponse.flagTipoEnvioFatura) &&
        Objects.equals(this.flagTipoSms, adesaoServicoResponse.flagTipoSms) &&
        Objects.equals(this.id, adesaoServicoResponse.id) &&
        Objects.equals(this.responsavel, adesaoServicoResponse.responsavel) &&
        Objects.equals(this.tipoEnvioFatura, adesaoServicoResponse.tipoEnvioFatura) &&
        Objects.equals(this.tipoSms, adesaoServicoResponse.tipoSms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canal, cobrancaLimiteCredito, estabelecimento, flagCobrancaLimiteCredito, flagOfertasPromocoes, flagPromocoes, flagTipoEnvioFatura, flagTipoSms, id, responsavel, tipoEnvioFatura, tipoSms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoServicoResponse {\n");
    
    sb.append("    canal: ").append(toIndentedString(canal)).append("\n");
    sb.append("    cobrancaLimiteCredito: ").append(toIndentedString(cobrancaLimiteCredito)).append("\n");
    sb.append("    estabelecimento: ").append(toIndentedString(estabelecimento)).append("\n");
    sb.append("    flagCobrancaLimiteCredito: ").append(toIndentedString(flagCobrancaLimiteCredito)).append("\n");
    sb.append("    flagOfertasPromocoes: ").append(toIndentedString(flagOfertasPromocoes)).append("\n");
    sb.append("    flagPromocoes: ").append(toIndentedString(flagPromocoes)).append("\n");
    sb.append("    flagTipoEnvioFatura: ").append(toIndentedString(flagTipoEnvioFatura)).append("\n");
    sb.append("    flagTipoSms: ").append(toIndentedString(flagTipoSms)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    responsavel: ").append(toIndentedString(responsavel)).append("\n");
    sb.append("    tipoEnvioFatura: ").append(toIndentedString(tipoEnvioFatura)).append("\n");
    sb.append("    tipoSms: ").append(toIndentedString(tipoSms)).append("\n");
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

