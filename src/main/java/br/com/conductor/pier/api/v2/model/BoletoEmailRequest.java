package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o com os par\u00E2mentros necess\u00E1rios para envio de Boleto por email
 **/

@ApiModel(description = "Representa\u00E7\u00E3o com os par\u00E2mentros necess\u00E1rios para envio de Boleto por email")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BoletoEmailRequest   {
  
  private String email = null;
  private Long idTemplateNotificacao = null;
  private Object parametros = null;

  
  /**
   * Email para envio do boleto
   **/
  public BoletoEmailRequest email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email para envio do boleto")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Identifica\u00E7\u00E3o do template de notifica\u00E7\u00E3o
   **/
  public BoletoEmailRequest idTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifica\u00E7\u00E3o do template de notifica\u00E7\u00E3o")
  @JsonProperty("idTemplateNotificacao")
  public Long getIdTemplateNotificacao() {
    return idTemplateNotificacao;
  }
  public void setIdTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
  }

  
  /**
   * Mapa de par\u00E2metros utilizados na cria\u00E7\u00E3o do template do email
   **/
  public BoletoEmailRequest parametros(Object parametros) {
    this.parametros = parametros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mapa de par\u00E2metros utilizados na cria\u00E7\u00E3o do template do email")
  @JsonProperty("parametros")
  public Object getParametros() {
    return parametros;
  }
  public void setParametros(Object parametros) {
    this.parametros = parametros;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoletoEmailRequest boletoEmailRequest = (BoletoEmailRequest) o;
    return Objects.equals(this.email, boletoEmailRequest.email) &&
        Objects.equals(this.idTemplateNotificacao, boletoEmailRequest.idTemplateNotificacao) &&
        Objects.equals(this.parametros, boletoEmailRequest.parametros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, idTemplateNotificacao, parametros);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletoEmailRequest {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    idTemplateNotificacao: ").append(toIndentedString(idTemplateNotificacao)).append("\n");
    sb.append("    parametros: ").append(toIndentedString(parametros)).append("\n");
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

