package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.AnexoNotificacaoEmailRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * Representation of the resource of sending a notification by email.??o do recurso para envio de uma notifica??o por email
 **/

@ApiModel(description = "Representation of the resource of sending a notification by email.??o do recurso para envio de uma notifica??o por email")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class NotificacaoEmailRequest   {
  
  private Long idTemplateNotificacao = null;
  private List<String> destinatarios = new ArrayList<String>();
  private List<AnexoNotificacaoEmailRequest> anexos = new ArrayList<AnexoNotificacaoEmailRequest>();
  private Map<String, Object> parametrosConteudo = new HashMap<String, Object>();

  
  /**
   * ID for the template of the notification
   **/
  public NotificacaoEmailRequest idTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID for the template of the notification")
  @JsonProperty("idTemplateNotificacao")
  public Long getIdTemplateNotificacao() {
    return idTemplateNotificacao;
  }
  public void setIdTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
  }

  
  /**
   * List of email(s) of the addressee
   **/
  public NotificacaoEmailRequest destinatarios(List<String> destinatarios) {
    this.destinatarios = destinatarios;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of email(s) of the addressee")
  @JsonProperty("destinatarios")
  public List<String> getDestinatarios() {
    return destinatarios;
  }
  public void setDestinatarios(List<String> destinatarios) {
    this.destinatarios = destinatarios;
  }

  
  /**
   * List of ids of the attaches to be sent
   **/
  public NotificacaoEmailRequest anexos(List<AnexoNotificacaoEmailRequest> anexos) {
    this.anexos = anexos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of ids of the attaches to be sent")
  @JsonProperty("anexos")
  public List<AnexoNotificacaoEmailRequest> getAnexos() {
    return anexos;
  }
  public void setAnexos(List<AnexoNotificacaoEmailRequest> anexos) {
    this.anexos = anexos;
  }

  
  /**
   * Map of parameter for the montage of the notification
   **/
  public NotificacaoEmailRequest parametrosConteudo(Map<String, Object> parametrosConteudo) {
    this.parametrosConteudo = parametrosConteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of parameter for the montage of the notification")
  @JsonProperty("parametrosConteudo")
  public Map<String, Object> getParametrosConteudo() {
    return parametrosConteudo;
  }
  public void setParametrosConteudo(Map<String, Object> parametrosConteudo) {
    this.parametrosConteudo = parametrosConteudo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificacaoEmailRequest notificacaoEmailRequest = (NotificacaoEmailRequest) o;
    return Objects.equals(this.idTemplateNotificacao, notificacaoEmailRequest.idTemplateNotificacao) &&
        Objects.equals(this.destinatarios, notificacaoEmailRequest.destinatarios) &&
        Objects.equals(this.anexos, notificacaoEmailRequest.anexos) &&
        Objects.equals(this.parametrosConteudo, notificacaoEmailRequest.parametrosConteudo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTemplateNotificacao, destinatarios, anexos, parametrosConteudo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoEmailRequest {\n");
    
    sb.append("    idTemplateNotificacao: ").append(toIndentedString(idTemplateNotificacao)).append("\n");
    sb.append("    destinatarios: ").append(toIndentedString(destinatarios)).append("\n");
    sb.append("    anexos: ").append(toIndentedString(anexos)).append("\n");
    sb.append("    parametrosConteudo: ").append(toIndentedString(parametrosConteudo)).append("\n");
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

