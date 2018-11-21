package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{web_hook_response_description}}}
 **/

@ApiModel(description = "{{{web_hook_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class WebHookResponse   {
  
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

  
  /**
   * {{{web_hook_response_id_value}}}
   **/
  public WebHookResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{web_hook_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{web_hook_response_tipo_evento_value}}}
   **/
  public WebHookResponse tipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{web_hook_response_tipo_evento_value}}}")
  @JsonProperty("tipoEvento")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * {{{web_hook_response_metodo_value}}}
   **/
  public WebHookResponse metodo(MetodoEnum metodo) {
    this.metodo = metodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{web_hook_response_metodo_value}}}")
  @JsonProperty("metodo")
  public MetodoEnum getMetodo() {
    return metodo;
  }
  public void setMetodo(MetodoEnum metodo) {
    this.metodo = metodo;
  }

  
  /**
   * {{{web_hook_response_url_value}}}
   **/
  public WebHookResponse url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{web_hook_response_url_value}}}")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * {{{web_hook_response_status_value}}}
   **/
  public WebHookResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{web_hook_response_status_value}}}")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebHookResponse webHookResponse = (WebHookResponse) o;
    return Objects.equals(this.id, webHookResponse.id) &&
        Objects.equals(this.tipoEvento, webHookResponse.tipoEvento) &&
        Objects.equals(this.metodo, webHookResponse.metodo) &&
        Objects.equals(this.url, webHookResponse.url) &&
        Objects.equals(this.status, webHookResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tipoEvento, metodo, url, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHookResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    metodo: ").append(toIndentedString(metodo)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

