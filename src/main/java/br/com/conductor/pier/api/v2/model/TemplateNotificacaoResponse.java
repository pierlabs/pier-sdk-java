package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de Notifica\u00E7\u00E3o EMAIL
 **/

@ApiModel(description = "Objeto de Notifica\u00E7\u00E3o EMAIL")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TemplateNotificacaoResponse   {
  
  private Long id = null;
  private Long idConfiguracaoEmail = null;


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


  public enum TipoNotificacaoEnum {
    SMS("SMS"),
    PUSH_APNS("PUSH_APNS"),
    PUSH_FCM("PUSH_FCM"),
    PUSH_GCM("PUSH_GCM"),
    EMAIL("EMAIL");

    private String value;

    TipoNotificacaoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TipoNotificacaoEnum tipoNotificacao = null;
  private String templatePadrao = null;
  private String remetente = null;
  private String assunto = null;
  private String dataInclusao = null;
  private String dataAlteracao = null;

  
  /**
   * C\u00F3digo Identificador.
   **/
  public TemplateNotificacaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo Identificador.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da configra\u00E7\u00E3o de e-mail.
   **/
  public TemplateNotificacaoResponse idConfiguracaoEmail(Long idConfiguracaoEmail) {
    this.idConfiguracaoEmail = idConfiguracaoEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da configra\u00E7\u00E3o de e-mail.")
  @JsonProperty("idConfiguracaoEmail")
  public Long getIdConfiguracaoEmail() {
    return idConfiguracaoEmail;
  }
  public void setIdConfiguracaoEmail(Long idConfiguracaoEmail) {
    this.idConfiguracaoEmail = idConfiguracaoEmail;
  }

  
  /**
   * Tipo do layout de e-mail.
   **/
  public TemplateNotificacaoResponse tipoLayout(TipoLayoutEnum tipoLayout) {
    this.tipoLayout = tipoLayout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo do layout de e-mail.")
  @JsonProperty("tipoLayout")
  public TipoLayoutEnum getTipoLayout() {
    return tipoLayout;
  }
  public void setTipoLayout(TipoLayoutEnum tipoLayout) {
    this.tipoLayout = tipoLayout;
  }

  
  /**
   * Tipo da notifica\u00E7\u00E3o.
   **/
  public TemplateNotificacaoResponse tipoNotificacao(TipoNotificacaoEnum tipoNotificacao) {
    this.tipoNotificacao = tipoNotificacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo da notifica\u00E7\u00E3o.")
  @JsonProperty("tipoNotificacao")
  public TipoNotificacaoEnum getTipoNotificacao() {
    return tipoNotificacao;
  }
  public void setTipoNotificacao(TipoNotificacaoEnum tipoNotificacao) {
    this.tipoNotificacao = tipoNotificacao;
  }

  
  /**
   * Template padr\u00E3o.
   **/
  public TemplateNotificacaoResponse templatePadrao(String templatePadrao) {
    this.templatePadrao = templatePadrao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template padr\u00E3o.")
  @JsonProperty("templatePadrao")
  public String getTemplatePadrao() {
    return templatePadrao;
  }
  public void setTemplatePadrao(String templatePadrao) {
    this.templatePadrao = templatePadrao;
  }

  
  /**
   * Remetente.
   **/
  public TemplateNotificacaoResponse remetente(String remetente) {
    this.remetente = remetente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Remetente.")
  @JsonProperty("remetente")
  public String getRemetente() {
    return remetente;
  }
  public void setRemetente(String remetente) {
    this.remetente = remetente;
  }

  
  /**
   * Assunto do e-mail.
   **/
  public TemplateNotificacaoResponse assunto(String assunto) {
    this.assunto = assunto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Assunto do e-mail.")
  @JsonProperty("assunto")
  public String getAssunto() {
    return assunto;
  }
  public void setAssunto(String assunto) {
    this.assunto = assunto;
  }

  
  /**
   * Data da inclus\u00E3o.
   **/
  public TemplateNotificacaoResponse dataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data da inclus\u00E3o.")
  @JsonProperty("dataInclusao")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Data altera\u00E7\u00E3o.
   **/
  public TemplateNotificacaoResponse dataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data altera\u00E7\u00E3o.")
  @JsonProperty("dataAlteracao")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateNotificacaoResponse templateNotificacaoResponse = (TemplateNotificacaoResponse) o;
    return Objects.equals(this.id, templateNotificacaoResponse.id) &&
        Objects.equals(this.idConfiguracaoEmail, templateNotificacaoResponse.idConfiguracaoEmail) &&
        Objects.equals(this.tipoLayout, templateNotificacaoResponse.tipoLayout) &&
        Objects.equals(this.tipoNotificacao, templateNotificacaoResponse.tipoNotificacao) &&
        Objects.equals(this.templatePadrao, templateNotificacaoResponse.templatePadrao) &&
        Objects.equals(this.remetente, templateNotificacaoResponse.remetente) &&
        Objects.equals(this.assunto, templateNotificacaoResponse.assunto) &&
        Objects.equals(this.dataInclusao, templateNotificacaoResponse.dataInclusao) &&
        Objects.equals(this.dataAlteracao, templateNotificacaoResponse.dataAlteracao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConfiguracaoEmail, tipoLayout, tipoNotificacao, templatePadrao, remetente, assunto, dataInclusao, dataAlteracao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateNotificacaoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConfiguracaoEmail: ").append(toIndentedString(idConfiguracaoEmail)).append("\n");
    sb.append("    tipoLayout: ").append(toIndentedString(tipoLayout)).append("\n");
    sb.append("    tipoNotificacao: ").append(toIndentedString(tipoNotificacao)).append("\n");
    sb.append("    templatePadrao: ").append(toIndentedString(templatePadrao)).append("\n");
    sb.append("    remetente: ").append(toIndentedString(remetente)).append("\n");
    sb.append("    assunto: ").append(toIndentedString(assunto)).append("\n");
    sb.append("    dataInclusao: ").append(toIndentedString(dataInclusao)).append("\n");
    sb.append("    dataAlteracao: ").append(toIndentedString(dataAlteracao)).append("\n");
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

