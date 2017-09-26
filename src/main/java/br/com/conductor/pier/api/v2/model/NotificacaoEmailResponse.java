package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Notifica\u00C3\u00A7\u00C3\u00A3o do envio do email
 **/

@ApiModel(description = "Notifica\u00C3\u00A7\u00C3\u00A3o do envio do email")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class NotificacaoEmailResponse   {
  
  private Long id = null;
  private Long idTemplateNotificacao = null;
  private Long idDocumento = null;
  private String destinatario = null;
  private String remetente = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da notifica\u00C3\u00A7\u00C3\u00A3o gerada.
   **/
  public NotificacaoEmailResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da notifica\u00C3\u00A7\u00C3\u00A3o gerada.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do template da notifica\u00C3\u00A7\u00C3\u00A3o.
   **/
  public NotificacaoEmailResponse idTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do template da notifica\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("idTemplateNotificacao")
  public Long getIdTemplateNotificacao() {
    return idTemplateNotificacao;
  }
  public void setIdTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do Documento.
   **/
  public NotificacaoEmailResponse idDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador do Documento.")
  @JsonProperty("idDocumento")
  public Long getIdDocumento() {
    return idDocumento;
  }
  public void setIdDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
  }

  
  /**
   * Email do destinat\u00C3\u00A1rio da notifica\u00C3\u00A7\u00C3\u00A3o.
   **/
  public NotificacaoEmailResponse destinatario(String destinatario) {
    this.destinatario = destinatario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email do destinat\u00C3\u00A1rio da notifica\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("destinatario")
  public String getDestinatario() {
    return destinatario;
  }
  public void setDestinatario(String destinatario) {
    this.destinatario = destinatario;
  }

  
  /**
   * Email do remetente da notifica\u00C3\u00A7\u00C3\u00A3o.
   **/
  public NotificacaoEmailResponse remetente(String remetente) {
    this.remetente = remetente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email do remetente da notifica\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("remetente")
  public String getRemetente() {
    return remetente;
  }
  public void setRemetente(String remetente) {
    this.remetente = remetente;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificacaoEmailResponse notificacaoEmailResponse = (NotificacaoEmailResponse) o;
    return Objects.equals(this.id, notificacaoEmailResponse.id) &&
        Objects.equals(this.idTemplateNotificacao, notificacaoEmailResponse.idTemplateNotificacao) &&
        Objects.equals(this.idDocumento, notificacaoEmailResponse.idDocumento) &&
        Objects.equals(this.destinatario, notificacaoEmailResponse.destinatario) &&
        Objects.equals(this.remetente, notificacaoEmailResponse.remetente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTemplateNotificacao, idDocumento, destinatario, remetente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoEmailResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTemplateNotificacao: ").append(toIndentedString(idTemplateNotificacao)).append("\n");
    sb.append("    idDocumento: ").append(toIndentedString(idDocumento)).append("\n");
    sb.append("    destinatario: ").append(toIndentedString(destinatario)).append("\n");
    sb.append("    remetente: ").append(toIndentedString(remetente)).append("\n");
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



