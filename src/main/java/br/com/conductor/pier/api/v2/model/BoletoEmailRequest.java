package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{boleto_email_request_description}}}
 **/

@ApiModel(description = "{{{boleto_email_request_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BoletoEmailRequest   {
  
  private String email = null;
  private Long idTemplateNotificacao = null;
  private Object parametros = null;

  
  /**
   * {{{boleto_email_request_value}}}
   **/
  public BoletoEmailRequest email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_email_request_value}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{boleto_email_request_id_template_notificacao_value}}}
   **/
  public BoletoEmailRequest idTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_email_request_id_template_notificacao_value}}}")
  @JsonProperty("idTemplateNotificacao")
  public Long getIdTemplateNotificacao() {
    return idTemplateNotificacao;
  }
  public void setIdTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
  }

  
  /**
   * {{{boleto_email_request_parametros_value}}}
   **/
  public BoletoEmailRequest parametros(Object parametros) {
    this.parametros = parametros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_email_request_parametros_value}}}")
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

