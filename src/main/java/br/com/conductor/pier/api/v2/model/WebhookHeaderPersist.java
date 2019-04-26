package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Header do Webhook
 **/

@ApiModel(description = "Objeto Header do Webhook")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class WebhookHeaderPersist   {
  
  private String nome = null;
  private String valor = null;

  
  /**
   * Nome do header
   **/
  public WebhookHeaderPersist nome(String nome) {
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
   * Valor do header
   **/
  public WebhookHeaderPersist valor(String valor) {
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
    WebhookHeaderPersist webhookHeaderPersist = (WebhookHeaderPersist) o;
    return Objects.equals(this.nome, webhookHeaderPersist.nome) &&
        Objects.equals(this.valor, webhookHeaderPersist.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookHeaderPersist {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
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

