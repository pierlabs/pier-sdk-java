package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso para envio de uma notifica\u00C3\u00A7\u00C3\u00A3o por email.
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso para envio de uma notifica\u00C3\u00A7\u00C3\u00A3o por email.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class NotificacaoEmailRequest   {
  
  private Long idDocumento = null;
  private Long idTemplateNotificacao = null;
  private String destinatario = null;


  public enum TipoLayoutEnum {
    RECUPERAR_SENHA("RECUPERAR_SENHA"),
    FATURA_POR_EMAIL("FATURA_POR_EMAIL"),
    VALIDAR_DISPOSITIVO("VALIDAR_DISPOSITIVO"),
    NOTIFICACAO_EMAIL("NOTIFICACAO_EMAIL");

    private String value;

    TipoLayoutEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TipoLayoutEnum tipoLayout = null;
  private Map<String, Object> parametrosConteudo = new HashMap<String, Object>();

  
  /**
   * ID para o documento a ser enviado.
   **/
  public NotificacaoEmailRequest idDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID para o documento a ser enviado.")
  @JsonProperty("idDocumento")
  public Long getIdDocumento() {
    return idDocumento;
  }
  public void setIdDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
  }

  
  /**
   * ID para o template da notifica\u00C3\u00A7\u00C3\u00A3o.
   **/
  public NotificacaoEmailRequest idTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID para o template da notifica\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("idTemplateNotificacao")
  public Long getIdTemplateNotificacao() {
    return idTemplateNotificacao;
  }
  public void setIdTemplateNotificacao(Long idTemplateNotificacao) {
    this.idTemplateNotificacao = idTemplateNotificacao;
  }

  
  /**
   * Email do destinat\u00C3\u00A1rio.
   **/
  public NotificacaoEmailRequest destinatario(String destinatario) {
    this.destinatario = destinatario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email do destinat\u00C3\u00A1rio.")
  @JsonProperty("destinatario")
  public String getDestinatario() {
    return destinatario;
  }
  public void setDestinatario(String destinatario) {
    this.destinatario = destinatario;
  }

  
  /**
   * Tipo de layout para o template da notifica\u00C3\u00A7\u00C3\u00A3o.
   **/
  public NotificacaoEmailRequest tipoLayout(TipoLayoutEnum tipoLayout) {
    this.tipoLayout = tipoLayout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo de layout para o template da notifica\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("tipoLayout")
  public TipoLayoutEnum getTipoLayout() {
    return tipoLayout;
  }
  public void setTipoLayout(TipoLayoutEnum tipoLayout) {
    this.tipoLayout = tipoLayout;
  }

  
  /**
   * Mapa de par\u00C3\u00A2metros para montagem da notifica\u00C3\u00A7\u00C3\u00A3o.
   **/
  public NotificacaoEmailRequest parametrosConteudo(Map<String, Object> parametrosConteudo) {
    this.parametrosConteudo = parametrosConteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mapa de par\u00C3\u00A2metros para montagem da notifica\u00C3\u00A7\u00C3\u00A3o.")
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
    return Objects.equals(this.idDocumento, notificacaoEmailRequest.idDocumento) &&
        Objects.equals(this.idTemplateNotificacao, notificacaoEmailRequest.idTemplateNotificacao) &&
        Objects.equals(this.destinatario, notificacaoEmailRequest.destinatario) &&
        Objects.equals(this.tipoLayout, notificacaoEmailRequest.tipoLayout) &&
        Objects.equals(this.parametrosConteudo, notificacaoEmailRequest.parametrosConteudo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDocumento, idTemplateNotificacao, destinatario, tipoLayout, parametrosConteudo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoEmailRequest {\n");
    
    sb.append("    idDocumento: ").append(toIndentedString(idDocumento)).append("\n");
    sb.append("    idTemplateNotificacao: ").append(toIndentedString(idTemplateNotificacao)).append("\n");
    sb.append("    destinatario: ").append(toIndentedString(destinatario)).append("\n");
    sb.append("    tipoLayout: ").append(toIndentedString(tipoLayout)).append("\n");
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



