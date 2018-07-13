package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{risco_fraude_response_description}}}
 **/

@ApiModel(description = "{{{risco_fraude_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class RiscoFraudeResponseValue   {
  
  private Long id = null;
  private Long idTipoResolucao = null;
  private String descricaoTipoResolucao = null;
  private Boolean flagAltoRisco = null;
  private Long idConta = null;
  private Long idCartao = null;
  private Long idTransacao = null;
  private String dataTransacao = null;
  private BigDecimal valorTransacao = null;
  private String nomeEstabelecimento = null;

  
  /**
   * {{{risco_fraude_response_id_value}}}
   **/
  public RiscoFraudeResponseValue id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{risco_fraude_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{risco_fraude_response_id_tipo_resolucao_value}}}
   **/
  public RiscoFraudeResponseValue idTipoResolucao(Long idTipoResolucao) {
    this.idTipoResolucao = idTipoResolucao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{risco_fraude_response_id_tipo_resolucao_value}}}")
  @JsonProperty("idTipoResolucao")
  public Long getIdTipoResolucao() {
    return idTipoResolucao;
  }
  public void setIdTipoResolucao(Long idTipoResolucao) {
    this.idTipoResolucao = idTipoResolucao;
  }

  
  /**
   * {{{risco_fraude_response_descricao_tipo_resolucao_value}}}
   **/
  public RiscoFraudeResponseValue descricaoTipoResolucao(String descricaoTipoResolucao) {
    this.descricaoTipoResolucao = descricaoTipoResolucao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{risco_fraude_response_descricao_tipo_resolucao_value}}}")
  @JsonProperty("descricaoTipoResolucao")
  public String getDescricaoTipoResolucao() {
    return descricaoTipoResolucao;
  }
  public void setDescricaoTipoResolucao(String descricaoTipoResolucao) {
    this.descricaoTipoResolucao = descricaoTipoResolucao;
  }

  
  /**
   * {{{risco_fraude_response_flag_alto_risco_value}}}
   **/
  public RiscoFraudeResponseValue flagAltoRisco(Boolean flagAltoRisco) {
    this.flagAltoRisco = flagAltoRisco;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{risco_fraude_response_flag_alto_risco_value}}}")
  @JsonProperty("flagAltoRisco")
  public Boolean getFlagAltoRisco() {
    return flagAltoRisco;
  }
  public void setFlagAltoRisco(Boolean flagAltoRisco) {
    this.flagAltoRisco = flagAltoRisco;
  }

  
  /**
   * {{{risco_fraude_response_id_conta_value}}}
   **/
  public RiscoFraudeResponseValue idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{risco_fraude_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{risco_fraude_response_id_cartao_value}}}
   **/
  public RiscoFraudeResponseValue idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{risco_fraude_response_id_cartao_value}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{risco_fraude_response_id_transacao_value}}}
   **/
  public RiscoFraudeResponseValue idTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{risco_fraude_response_id_transacao_value}}}")
  @JsonProperty("idTransacao")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * {{{risco_fraude_response_data_transacao_value}}}
   **/
  public RiscoFraudeResponseValue dataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{risco_fraude_response_data_transacao_value}}}")
  @JsonProperty("dataTransacao")
  public String getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * {{{risco_fraude_response_valor_transacao_value}}}
   **/
  public RiscoFraudeResponseValue valorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{risco_fraude_response_valor_transacao_value}}}")
  @JsonProperty("valorTransacao")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * {{{risco_fraude_response_nome_estabelecimento_value}}}
   **/
  public RiscoFraudeResponseValue nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{risco_fraude_response_nome_estabelecimento_value}}}")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiscoFraudeResponseValue riscoFraudeResponseValue = (RiscoFraudeResponseValue) o;
    return Objects.equals(this.id, riscoFraudeResponseValue.id) &&
        Objects.equals(this.idTipoResolucao, riscoFraudeResponseValue.idTipoResolucao) &&
        Objects.equals(this.descricaoTipoResolucao, riscoFraudeResponseValue.descricaoTipoResolucao) &&
        Objects.equals(this.flagAltoRisco, riscoFraudeResponseValue.flagAltoRisco) &&
        Objects.equals(this.idConta, riscoFraudeResponseValue.idConta) &&
        Objects.equals(this.idCartao, riscoFraudeResponseValue.idCartao) &&
        Objects.equals(this.idTransacao, riscoFraudeResponseValue.idTransacao) &&
        Objects.equals(this.dataTransacao, riscoFraudeResponseValue.dataTransacao) &&
        Objects.equals(this.valorTransacao, riscoFraudeResponseValue.valorTransacao) &&
        Objects.equals(this.nomeEstabelecimento, riscoFraudeResponseValue.nomeEstabelecimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoResolucao, descricaoTipoResolucao, flagAltoRisco, idConta, idCartao, idTransacao, dataTransacao, valorTransacao, nomeEstabelecimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiscoFraudeResponseValue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoResolucao: ").append(toIndentedString(idTipoResolucao)).append("\n");
    sb.append("    descricaoTipoResolucao: ").append(toIndentedString(descricaoTipoResolucao)).append("\n");
    sb.append("    flagAltoRisco: ").append(toIndentedString(flagAltoRisco)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idTransacao: ").append(toIndentedString(idTransacao)).append("\n");
    sb.append("    dataTransacao: ").append(toIndentedString(dataTransacao)).append("\n");
    sb.append("    valorTransacao: ").append(toIndentedString(valorTransacao)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
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



