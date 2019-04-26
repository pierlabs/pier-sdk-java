package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Header do Webhook
 **/

@ApiModel(description = "Objeto Header do Webhook")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class WebhookHeaderResponse   {
  
  private Long id = null;
  private String nome = null;


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
  private String valor = null;

  
  /**
   * Id do header do Webhook
   **/
  public WebhookHeaderResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do header do Webhook")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do header
   **/
  public WebhookHeaderResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do header")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Status do header
   **/
  public WebhookHeaderResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status do header")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Valor do header
   **/
  public WebhookHeaderResponse valor(String valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do header")
  @JsonProperty("valor")
  public String getValor() {
    return valor;
  }
  public void setValor(String valor) {
    this.valor = valor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookHeaderResponse webhookHeaderResponse = (WebhookHeaderResponse) o;
    return Objects.equals(this.id, webhookHeaderResponse.id) &&
        Objects.equals(this.nome, webhookHeaderResponse.nome) &&
        Objects.equals(this.status, webhookHeaderResponse.status) &&
        Objects.equals(this.valor, webhookHeaderResponse.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, status, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookHeaderResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

