package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso WebHook
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso WebHook")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class WebHook   {
  
  private Long id = null;


  public enum TipoEventoEnum {
    RISCO_FRAUDE("RISCO_FRAUDE"),
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

  
  /**
   * Id do WebHook
   **/
  public WebHook id(Long id) {
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
  public WebHook tipoEvento(TipoEventoEnum tipoEvento) {
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
   * M\u00C3\u00A9todo que a ser chamado pelo WebHook
   **/
  public WebHook metodo(MetodoEnum metodo) {
    this.metodo = metodo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "M\u00C3\u00A9todo que a ser chamado pelo WebHook")
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
  public WebHook url(String url) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebHook webHook = (WebHook) o;
    return Objects.equals(this.id, webHook.id) &&
        Objects.equals(this.tipoEvento, webHook.tipoEvento) &&
        Objects.equals(this.metodo, webHook.metodo) &&
        Objects.equals(this.url, webHook.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tipoEvento, metodo, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHook {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    metodo: ").append(toIndentedString(metodo)).append("\n");
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



