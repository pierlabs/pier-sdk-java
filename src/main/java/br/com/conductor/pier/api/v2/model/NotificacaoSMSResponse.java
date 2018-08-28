package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{notificacao_s_m_s_response_description}}}
 **/

@ApiModel(description = "{{{notificacao_s_m_s_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class NotificacaoSMSResponse   {
  
  private Long id = null;
  private Long nsu = null;
  private Long idEmissor = null;


  public enum TipoEventoEnum {
    RISCO_FRAUDE("RISCO_FRAUDE"),
    CODIGO_SEGURANCA("CODIGO_SEGURANCA"),
    OUTROS("OUTROS"),
    OTP_3D_SECURE("OTP_3D_SECURE");

    private String value;

    TipoEventoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TipoEventoEnum tipoEvento = null;


  public enum StatusEnum {
    PENDENTE("PENDENTE"),
    ENCAMINHADO("ENCAMINHADO"),
    ENVIADO("ENVIADO"),
    RESPONDIDO("RESPONDIDO"),
    ERRO("ERRO"),
    ERRO_RESPOSTA("ERRO_RESPOSTA"),
    SUCESSO_RESPOSTA("SUCESSO_RESPOSTA");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;
  private String descricaoStatus = null;
  private Long idPessoa = null;
  private Long idConta = null;
  private String celular = null;
  private String operadora = null;
  private String conteudo = null;
  private String resposta = null;
  private String dataAgendamento = null;
  private Integer quantidadeTentativasEnvio = null;
  private String dataInclusao = null;
  private String dataAlteracaoStatus = null;
  private String protocolo = null;

  
  /**
   * {{{notificacao_s_m_s_response_id_value}}}
   **/
  public NotificacaoSMSResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{notificacao_s_m_s_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{notificacao_s_m_s_response_nsu_value}}}
   **/
  public NotificacaoSMSResponse nsu(Long nsu) {
    this.nsu = nsu;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{notificacao_s_m_s_response_nsu_value}}}")
  @JsonProperty("nsu")
  public Long getNsu() {
    return nsu;
  }
  public void setNsu(Long nsu) {
    this.nsu = nsu;
  }

  
  /**
   * {{{notificacao_s_m_s_response_id_emissor_value}}}
   **/
  public NotificacaoSMSResponse idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{notificacao_s_m_s_response_id_emissor_value}}}")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * {{{notificacao_s_m_s_response_tipo_evento_value}}}
   **/
  public NotificacaoSMSResponse tipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{notificacao_s_m_s_response_tipo_evento_value}}}")
  @JsonProperty("tipoEvento")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * {{{notificacao_s_m_s_response_status_value}}}
   **/
  public NotificacaoSMSResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_s_m_s_response_status_value}}}")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * {{{notificacao_s_m_s_response_descricao_status_value}}}
   **/
  public NotificacaoSMSResponse descricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_s_m_s_response_descricao_status_value}}}")
  @JsonProperty("descricaoStatus")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   * {{{notificacao_s_m_s_response_id_pessoa_value}}}
   **/
  public NotificacaoSMSResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_s_m_s_response_id_pessoa_value}}}")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{notificacao_s_m_s_response_id_conta_value}}}
   **/
  public NotificacaoSMSResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_s_m_s_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{notificacao_s_m_s_response_celular_value}}}
   **/
  public NotificacaoSMSResponse celular(String celular) {
    this.celular = celular;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_s_m_s_response_celular_value}}}")
  @JsonProperty("celular")
  public String getCelular() {
    return celular;
  }
  public void setCelular(String celular) {
    this.celular = celular;
  }

  
  /**
   * {{{notificacao_s_m_s_response_operadora_value}}}
   **/
  public NotificacaoSMSResponse operadora(String operadora) {
    this.operadora = operadora;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_s_m_s_response_operadora_value}}}")
  @JsonProperty("operadora")
  public String getOperadora() {
    return operadora;
  }
  public void setOperadora(String operadora) {
    this.operadora = operadora;
  }

  
  /**
   * {{{notificacao_s_m_s_response_conteudo_value}}}
   **/
  public NotificacaoSMSResponse conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_s_m_s_response_conteudo_value}}}")
  @JsonProperty("conteudo")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * {{{notificacao_s_m_s_response_resposta_value}}}
   **/
  public NotificacaoSMSResponse resposta(String resposta) {
    this.resposta = resposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_s_m_s_response_resposta_value}}}")
  @JsonProperty("resposta")
  public String getResposta() {
    return resposta;
  }
  public void setResposta(String resposta) {
    this.resposta = resposta;
  }

  
  /**
   * {{{notificacao_s_m_s_response_data_agendamento_value}}}
   **/
  public NotificacaoSMSResponse dataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_s_m_s_response_data_agendamento_value}}}")
  @JsonProperty("dataAgendamento")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * {{{notificacao_s_m_s_response_quantidade_tentativas_envio_value}}}
   **/
  public NotificacaoSMSResponse quantidadeTentativasEnvio(Integer quantidadeTentativasEnvio) {
    this.quantidadeTentativasEnvio = quantidadeTentativasEnvio;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_s_m_s_response_quantidade_tentativas_envio_value}}}")
  @JsonProperty("quantidadeTentativasEnvio")
  public Integer getQuantidadeTentativasEnvio() {
    return quantidadeTentativasEnvio;
  }
  public void setQuantidadeTentativasEnvio(Integer quantidadeTentativasEnvio) {
    this.quantidadeTentativasEnvio = quantidadeTentativasEnvio;
  }

  
  /**
   * {{{notificacao_s_m_s_response_data_inclusao_value}}}
   **/
  public NotificacaoSMSResponse dataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_s_m_s_response_data_inclusao_value}}}")
  @JsonProperty("dataInclusao")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * {{{notificacao_s_m_s_response_data_alteracao_status_value}}}
   **/
  public NotificacaoSMSResponse dataAlteracaoStatus(String dataAlteracaoStatus) {
    this.dataAlteracaoStatus = dataAlteracaoStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_s_m_s_response_data_alteracao_status_value}}}")
  @JsonProperty("dataAlteracaoStatus")
  public String getDataAlteracaoStatus() {
    return dataAlteracaoStatus;
  }
  public void setDataAlteracaoStatus(String dataAlteracaoStatus) {
    this.dataAlteracaoStatus = dataAlteracaoStatus;
  }

  
  /**
   * {{{notificacao_s_m_s_response_protocolo_value}}}
   **/
  public NotificacaoSMSResponse protocolo(String protocolo) {
    this.protocolo = protocolo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{notificacao_s_m_s_response_protocolo_value}}}")
  @JsonProperty("protocolo")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificacaoSMSResponse notificacaoSMSResponse = (NotificacaoSMSResponse) o;
    return Objects.equals(this.id, notificacaoSMSResponse.id) &&
        Objects.equals(this.nsu, notificacaoSMSResponse.nsu) &&
        Objects.equals(this.idEmissor, notificacaoSMSResponse.idEmissor) &&
        Objects.equals(this.tipoEvento, notificacaoSMSResponse.tipoEvento) &&
        Objects.equals(this.status, notificacaoSMSResponse.status) &&
        Objects.equals(this.descricaoStatus, notificacaoSMSResponse.descricaoStatus) &&
        Objects.equals(this.idPessoa, notificacaoSMSResponse.idPessoa) &&
        Objects.equals(this.idConta, notificacaoSMSResponse.idConta) &&
        Objects.equals(this.celular, notificacaoSMSResponse.celular) &&
        Objects.equals(this.operadora, notificacaoSMSResponse.operadora) &&
        Objects.equals(this.conteudo, notificacaoSMSResponse.conteudo) &&
        Objects.equals(this.resposta, notificacaoSMSResponse.resposta) &&
        Objects.equals(this.dataAgendamento, notificacaoSMSResponse.dataAgendamento) &&
        Objects.equals(this.quantidadeTentativasEnvio, notificacaoSMSResponse.quantidadeTentativasEnvio) &&
        Objects.equals(this.dataInclusao, notificacaoSMSResponse.dataInclusao) &&
        Objects.equals(this.dataAlteracaoStatus, notificacaoSMSResponse.dataAlteracaoStatus) &&
        Objects.equals(this.protocolo, notificacaoSMSResponse.protocolo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nsu, idEmissor, tipoEvento, status, descricaoStatus, idPessoa, idConta, celular, operadora, conteudo, resposta, dataAgendamento, quantidadeTentativasEnvio, dataInclusao, dataAlteracaoStatus, protocolo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoSMSResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nsu: ").append(toIndentedString(nsu)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    descricaoStatus: ").append(toIndentedString(descricaoStatus)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    celular: ").append(toIndentedString(celular)).append("\n");
    sb.append("    operadora: ").append(toIndentedString(operadora)).append("\n");
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
    sb.append("    resposta: ").append(toIndentedString(resposta)).append("\n");
    sb.append("    dataAgendamento: ").append(toIndentedString(dataAgendamento)).append("\n");
    sb.append("    quantidadeTentativasEnvio: ").append(toIndentedString(quantidadeTentativasEnvio)).append("\n");
    sb.append("    dataInclusao: ").append(toIndentedString(dataInclusao)).append("\n");
    sb.append("    dataAlteracaoStatus: ").append(toIndentedString(dataAlteracaoStatus)).append("\n");
    sb.append("    protocolo: ").append(toIndentedString(protocolo)).append("\n");
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

