package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o do recurso WebHook
 **/

@ApiModel(description = "Representa\u00E7\u00E3o do recurso WebHook")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class WebHookResponse   {
  
  private Long id = null;


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
   * Id do WebHook
   **/
  public WebHookResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id do WebHook")
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
  public WebHookResponse tipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "TipoEvento a ser chamado pelo WebHook")
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
  public WebHookResponse metodo(MetodoEnum metodo) {
    this.metodo = metodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "M\u00E9todo que a ser chamado pelo WebHook")
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
  public WebHookResponse url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "URL que a ser consumida pelo WebHook")
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
  public WebHookResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Status do WebHook")
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

