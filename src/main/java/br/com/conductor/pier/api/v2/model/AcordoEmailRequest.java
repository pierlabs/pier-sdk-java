package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Par\u00E2metros para envio do termo por e-mail
 **/

@ApiModel(description = "Par\u00E2metros para envio do termo por e-mail")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AcordoEmailRequest   {
  
  private String email = null;
  private Long idTemplateNotificacao = null;
  private Object parametros = null;

  
  /**
   * Email do destinat\u00E1rio
   **/
  public AcordoEmailRequest email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email do destinat\u00E1rio")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Identificador do modelo de e-email
   **/
  public AcordoEmailRequest idTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do modelo de e-email")
  @JsonProperty("idTemplateNotificacao")
  public Long getIdTemplateNotificacao() {
    return idTemplateNotificacao;
  }
  public void setIdTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
  }

  
  /**
   * Par\u00E2metros para substitui\u00E7\u00E3o no modelo do e-mail.
   **/
  public AcordoEmailRequest parametros(Object parametros) {
    this.parametros = parametros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Par\u00E2metros para substitui\u00E7\u00E3o no modelo do e-mail.")
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
    AcordoEmailRequest acordoEmailRequest = (AcordoEmailRequest) o;
    return Objects.equals(this.email, acordoEmailRequest.email) &&
        Objects.equals(this.idTemplateNotificacao, acordoEmailRequest.idTemplateNotificacao) &&
        Objects.equals(this.parametros, acordoEmailRequest.parametros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, idTemplateNotificacao, parametros);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoEmailRequest {\n");
    
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

