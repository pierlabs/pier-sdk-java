package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class NotificacaoPushResponse   {
  
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
   * Apresenta a data e em que o registro foi enviado para o dispositivo.
   **/
  public NotificacaoPushResponse dataEnvio(String dataEnvio) {
    this.dataEnvio = dataEnvio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data e em que o registro foi enviado para o dispositivo.")
  @JsonProperty("dataEnvio")
  public String getDataEnvio() {
    return dataEnvio;
  }
  public void setDataEnvio(String dataEnvio) {
    this.dataEnvio = dataEnvio;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do emissor (id).
   **/
  public NotificacaoPushResponse idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do emissor (id).")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * Nome do tipoEvento da notifica\u00C3\u00A7\u00C3\u00A3o
   **/
  public NotificacaoPushResponse tipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do tipoEvento da notifica\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("tipoEvento")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * Status de envio da notifica\u00C3\u00A7\u00C3\u00A3o
   **/
  public NotificacaoPushResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status de envio da notifica\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * C\u00C3\u00B3digo identificado da pessoa
   **/
  public NotificacaoPushResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo identificado da pessoa")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da conta
   **/
  public NotificacaoPushResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Token do dispositivo a qual foi destinado a notifica\u00C3\u00A7\u00C3\u00A3o (device_token)
   **/
  public NotificacaoPushResponse tokenDispositivo(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Token do dispositivo a qual foi destinado a notifica\u00C3\u00A7\u00C3\u00A3o (device_token)")
  @JsonProperty("tokenDispositivo")
  public String getTokenDispositivo() {
    return tokenDispositivo;
  }
  public void setTokenDispositivo(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
  }

  
  /**
   * T\u00C3\u00ADtulo da notifica\u00C3\u00A7\u00C3\u00A3o enviada.
   **/
  public NotificacaoPushResponse titulo(String titulo) {
    this.titulo = titulo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "T\u00C3\u00ADtulo da notifica\u00C3\u00A7\u00C3\u00A3o enviada.")
  @JsonProperty("titulo")
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  
  /**
   * Conte\u00C3\u00BAdo da notifica\u00C3\u00A7\u00C3\u00A3o enviada.
   **/
  public NotificacaoPushResponse conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Conte\u00C3\u00BAdo da notifica\u00C3\u00A7\u00C3\u00A3o enviada.")
  @JsonProperty("conteudo")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * Nome do Sistema Operacional a qual foi enviado o Push.
   **/
  public NotificacaoPushResponse plataforma(PlataformaEnum plataforma) {
    this.plataforma = plataforma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Sistema Operacional a qual foi enviado o Push.")
  @JsonProperty("plataforma")
  public PlataformaEnum getPlataforma() {
    return plataforma;
  }
  public void setPlataforma(PlataformaEnum plataforma) {
    this.plataforma = plataforma;
  }

  
  /**
   * N\u00C3\u00BAmero do protocolo de envio de notifica\u00C3\u00A7\u00C3\u00B5es
   **/
  public NotificacaoPushResponse protocolo(String protocolo) {
    this.protocolo = protocolo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do protocolo de envio de notifica\u00C3\u00A7\u00C3\u00B5es")
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
    NotificacaoPushResponse notificacaoPushResponse = (NotificacaoPushResponse) o;
    return Objects.equals(this.dataEnvio, notificacaoPushResponse.dataEnvio) &&
        Objects.equals(this.idEmissor, notificacaoPushResponse.idEmissor) &&
        Objects.equals(this.tipoEvento, notificacaoPushResponse.tipoEvento) &&
        Objects.equals(this.status, notificacaoPushResponse.status) &&
        Objects.equals(this.idPessoa, notificacaoPushResponse.idPessoa) &&
        Objects.equals(this.idConta, notificacaoPushResponse.idConta) &&
        Objects.equals(this.tokenDispositivo, notificacaoPushResponse.tokenDispositivo) &&
        Objects.equals(this.titulo, notificacaoPushResponse.titulo) &&
        Objects.equals(this.conteudo, notificacaoPushResponse.conteudo) &&
        Objects.equals(this.plataforma, notificacaoPushResponse.plataforma) &&
        Objects.equals(this.protocolo, notificacaoPushResponse.protocolo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataEnvio, idEmissor, tipoEvento, status, idPessoa, idConta, tokenDispositivo, titulo, conteudo, plataforma, protocolo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoPushResponse {\n");
    
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

