package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.WebhookHeaderResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Representa\u00E7\u00E3o do recurso WebHook
 **/

@ApiModel(description = "Representa\u00E7\u00E3o do recurso WebHook")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class WebhookResponse   {
  
  private Long id = null;


  public enum TipoEventoEnum {
    RISCO_FRAUDE("RISCO_FRAUDE"),
    CODIGO_SEGURANCA("CODIGO_SEGURANCA"),
    OUTROS("OUTROS"),
    OTP_3D_SECURE("OTP_3D_SECURE"),
    PAGAMENTO("PAGAMENTO"),
    TRANSACAO_COMPRA_AUTORIZADO("TRANSACAO_COMPRA_AUTORIZADO"),
    TRANSACAO_COMPRA_NAO_AUTORIZADO("TRANSACAO_COMPRA_NAO_AUTORIZADO"),
    TRANSACAO_SAQUE_AUTORIZADO("TRANSACAO_SAQUE_AUTORIZADO"),
    TRANSACAO_SAQUE_NAO_AUTORIZADO("TRANSACAO_SAQUE_NAO_AUTORIZADO"),
    TRANSACAO_PAGAMENTO_AUTORIZADO("TRANSACAO_PAGAMENTO_AUTORIZADO"),
    TRANSACAO_PAGAMENTO_NAO_AUTORIZADO("TRANSACAO_PAGAMENTO_NAO_AUTORIZADO"),
    TRANSACAO_ADVICE("TRANSACAO_ADVICE"),
    TRANSACAO_ERRO("TRANSACAO_ERRO"),
    TRANSACAO_SIMULACAO("TRANSACAO_SIMULACAO"),
    TRANSACAO_SENHA_CHIP("TRANSACAO_SENHA_CHIP"),
    TRANSACAO_CONSULTA_SALDO("TRANSACAO_CONSULTA_SALDO"),
    TRANSACAO_CONSULTA_STATUS_CONTA("TRANSACAO_CONSULTA_STATUS_CONTA"),
    TRANSACAO_DESFAZIMENTO("TRANSACAO_DESFAZIMENTO"),
    TRANSACAO_CANCELAMENTO("TRANSACAO_CANCELAMENTO"),
    TRANSACAO_RESPOSTA_SONDA("TRANSACAO_RESPOSTA_SONDA"),
    TRANSACAO_TOKEN("TRANSACAO_TOKEN");

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


  public enum MetodoEnum {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    PATCH("PATCH"),
    DELETE("DELETE");

    private String value;

    MetodoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private MetodoEnum metodo = null;
  private String url = null;


  public enum StatusEnum {
    INATIVO("INATIVO"),
    ATIVO("ATIVO");

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
  private List<WebhookHeaderResponse> headers = new ArrayList<WebhookHeaderResponse>();

  
  /**
   * Id do WebHook
   **/
  public WebhookResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do WebHook")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * TipoEvento a ser chamado pelo WebHook
   **/
  public WebhookResponse tipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "TipoEvento a ser chamado pelo WebHook")
  @JsonProperty("tipoEvento")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * M\u00E9todo que a ser chamado pelo WebHook
   **/
  public WebhookResponse metodo(MetodoEnum metodo) {
    this.metodo = metodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "M\u00E9todo que a ser chamado pelo WebHook")
  @JsonProperty("metodo")
  public MetodoEnum getMetodo() {
    return metodo;
  }
  public void setMetodo(MetodoEnum metodo) {
    this.metodo = metodo;
  }

  
  /**
   * URL que a ser consumida pelo WebHook
   **/
  public WebhookResponse url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL que a ser consumida pelo WebHook")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Status do WebHook
   **/
  public WebhookResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status do WebHook")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Headers do Webhook
   **/
  public WebhookResponse headers(List<WebhookHeaderResponse> headers) {
    this.headers = headers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Headers do Webhook")
  @JsonProperty("headers")
  public List<WebhookHeaderResponse> getHeaders() {
    return headers;
  }
  public void setHeaders(List<WebhookHeaderResponse> headers) {
    this.headers = headers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookResponse webhookResponse = (WebhookResponse) o;
    return Objects.equals(this.id, webhookResponse.id) &&
        Objects.equals(this.tipoEvento, webhookResponse.tipoEvento) &&
        Objects.equals(this.metodo, webhookResponse.metodo) &&
        Objects.equals(this.url, webhookResponse.url) &&
        Objects.equals(this.status, webhookResponse.status) &&
        Objects.equals(this.headers, webhookResponse.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tipoEvento, metodo, url, status, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    metodo: ").append(toIndentedString(metodo)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

