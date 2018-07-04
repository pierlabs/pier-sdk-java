package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{notificacao_push_response_description}}}
 **/

@ApiModel(description = "{{{notificacao_push_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class NotificacaoPushResponseValue   {
  
  private String dataEnvio = null;
  private Long idEmissor = null;


  public enum TipoEventoEnum {
    RISCO_FRAUDE("RISCO_FRAUDE"),
    CODIGO_SEGURANCA("CODIGO_SEGURANCA"),
    OUTROS("OUTROS");

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
  private Long idPessoa = null;
  private Long idConta = null;
  private String tokenDispositivo = null;
  private String titulo = null;
  private String conteudo = null;


  public enum PlataformaEnum {
    APNS("APNS"),
    FCM("FCM"),
    GCM("GCM");

    private String value;

    PlataformaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PlataformaEnum plataforma = null;
  private String protocolo = null;

  
  /**
   * {{{notificacao_push_response_data_envio_value}}}
   **/
  public NotificacaoPushResponseValue dataEnvio(String dataEnvio) {
    this.dataEnvio = dataEnvio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{notificacao_push_response_data_envio_value}}}")
  @JsonProperty("dataEnvio")
  public String getDataEnvio() {
    return dataEnvio;
  }
  public void setDataEnvio(String dataEnvio) {
    this.dataEnvio = dataEnvio;
  }

  
  /**
   * {{{notificacao_push_response_id_emissor_value}}}
   **/
  public NotificacaoPushResponseValue idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{notificacao_push_response_id_emissor_value}}}")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * {{{notificacao_push_response_tipo_evento_value}}}
   **/
  public NotificacaoPushResponseValue tipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{notificacao_push_response_tipo_evento_value}}}")
  @JsonProperty("tipoEvento")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * {{{notificacao_push_response_status_value}}}
   **/
  public NotificacaoPushResponseValue status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{notificacao_push_response_status_value}}}")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * {{{notificacao_push_response_id_pessoa_value}}}
   **/
  public NotificacaoPushResponseValue idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_push_response_id_pessoa_value}}}")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{notificacao_push_response_id_conta_value}}}
   **/
  public NotificacaoPushResponseValue idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_push_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{notificacao_push_response_token_dispositivo_value}}}
   **/
  public NotificacaoPushResponseValue tokenDispositivo(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_push_response_token_dispositivo_value}}}")
  @JsonProperty("tokenDispositivo")
  public String getTokenDispositivo() {
    return tokenDispositivo;
  }
  public void setTokenDispositivo(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
  }

  
  /**
   * {{{notificacao_push_response_titulo_value}}}
   **/
  public NotificacaoPushResponseValue titulo(String titulo) {
    this.titulo = titulo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_push_response_titulo_value}}}")
  @JsonProperty("titulo")
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  
  /**
   * {{{notificacao_push_response_conteudo_value}}}
   **/
  public NotificacaoPushResponseValue conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{notificacao_push_response_conteudo_value}}}")
  @JsonProperty("conteudo")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * {{{notificacao_push_response_plataforma_value}}}
   **/
  public NotificacaoPushResponseValue plataforma(PlataformaEnum plataforma) {
    this.plataforma = plataforma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{notificacao_push_response_plataforma_value}}}")
  @JsonProperty("plataforma")
  public PlataformaEnum getPlataforma() {
    return plataforma;
  }
  public void setPlataforma(PlataformaEnum plataforma) {
    this.plataforma = plataforma;
  }

  
  /**
   * {{{notificacao_push_response_protocolo_value}}}
   **/
  public NotificacaoPushResponseValue protocolo(String protocolo) {
    this.protocolo = protocolo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{notificacao_push_response_protocolo_value}}}")
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
    NotificacaoPushResponseValue notificacaoPushResponseValue = (NotificacaoPushResponseValue) o;
    return Objects.equals(this.dataEnvio, notificacaoPushResponseValue.dataEnvio) &&
        Objects.equals(this.idEmissor, notificacaoPushResponseValue.idEmissor) &&
        Objects.equals(this.tipoEvento, notificacaoPushResponseValue.tipoEvento) &&
        Objects.equals(this.status, notificacaoPushResponseValue.status) &&
        Objects.equals(this.idPessoa, notificacaoPushResponseValue.idPessoa) &&
        Objects.equals(this.idConta, notificacaoPushResponseValue.idConta) &&
        Objects.equals(this.tokenDispositivo, notificacaoPushResponseValue.tokenDispositivo) &&
        Objects.equals(this.titulo, notificacaoPushResponseValue.titulo) &&
        Objects.equals(this.conteudo, notificacaoPushResponseValue.conteudo) &&
        Objects.equals(this.plataforma, notificacaoPushResponseValue.plataforma) &&
        Objects.equals(this.protocolo, notificacaoPushResponseValue.protocolo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataEnvio, idEmissor, tipoEvento, status, idPessoa, idConta, tokenDispositivo, titulo, conteudo, plataforma, protocolo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoPushResponseValue {\n");
    
    sb.append("    dataEnvio: ").append(toIndentedString(dataEnvio)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    tokenDispositivo: ").append(toIndentedString(tokenDispositivo)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
    sb.append("    plataforma: ").append(toIndentedString(plataforma)).append("\n");
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



