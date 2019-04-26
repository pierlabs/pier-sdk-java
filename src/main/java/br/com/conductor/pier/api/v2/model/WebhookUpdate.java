package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * web_hook_update_description
 **/

@ApiModel(description = "web_hook_update_description")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class WebhookUpdate   {
  


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
  private String url = null;

  
  /**
   * TipoEvento a ser chamado pelo WebHook
   **/
  public WebhookUpdate tipoEvento(TipoEventoEnum tipoEvento) {
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
   * Url a ser consumida pelo WebHook
   **/
  public WebhookUpdate url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Url a ser consumida pelo WebHook")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookUpdate webhookUpdate = (WebhookUpdate) o;
    return Objects.equals(this.tipoEvento, webhookUpdate.tipoEvento) &&
        Objects.equals(this.url, webhookUpdate.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoEvento, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookUpdate {\n");
    
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

