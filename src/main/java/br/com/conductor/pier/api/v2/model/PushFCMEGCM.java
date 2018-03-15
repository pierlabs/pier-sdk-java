package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Notifica\u00E7\u00E3o Push FCM e GCM
 **/

@ApiModel(description = "Objeto Notifica\u00E7\u00E3o Push FCM e GCM")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PushFCMEGCM   {
  
  private Long idPessoa = null;
  private Long idConta = null;
  private String tokenDispositivo = null;
  private String tokenServidor = null;
  private String titulo = null;
  private String conteudo = null;


  public enum TipoEventoEnum {
    RISCO_FRAUDE("RISCO_FRAUDE"),
    CODIGO_SEGURANCA("CODIGO_SEGURANCA"),
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
  private String icone = null;
  private String som = null;
  private String cor = null;

  
  /**
   * C\u00F3digo identificado da pessoa
   **/
  public PushFCMEGCM idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificado da pessoa")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00F3digo identificador da conta
   **/
  public PushFCMEGCM idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Apresenta o token do dispositivo que dever\u00E1 receber o push.
   **/
  public PushFCMEGCM tokenDispositivo(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o token do dispositivo que dever\u00E1 receber o push.")
  @JsonProperty("tokenDispositivo")
  public String getTokenDispositivo() {
    return tokenDispositivo;
  }
  public void setTokenDispositivo(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
  }

  
  /**
   * Apresenta o token da sua aplica\u00E7\u00E3o Android gerada pela Google.
   **/
  public PushFCMEGCM tokenServidor(String tokenServidor) {
    this.tokenServidor = tokenServidor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o token da sua aplica\u00E7\u00E3o Android gerada pela Google.")
  @JsonProperty("tokenServidor")
  public String getTokenServidor() {
    return tokenServidor;
  }
  public void setTokenServidor(String tokenServidor) {
    this.tokenServidor = tokenServidor;
  }

  
  /**
   * Apresenta o t\u00EDtulo da notifica\u00E7\u00E3o.
   **/
  public PushFCMEGCM titulo(String titulo) {
    this.titulo = titulo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o t\u00EDtulo da notifica\u00E7\u00E3o.")
  @JsonProperty("titulo")
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  
  /**
   * Apresenta o texto da notifica\u00E7\u00E3o a ser enviado.
   **/
  public PushFCMEGCM conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o texto da notifica\u00E7\u00E3o a ser enviado.")
  @JsonProperty("conteudo")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * Apresenta o tipoEvento a qual pertence a notifica\u00E7\u00E3o
   **/
  public PushFCMEGCM tipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o tipoEvento a qual pertence a notifica\u00E7\u00E3o")
  @JsonProperty("tipoEvento")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * Apresenta o nome do icone a ser apresentado no push.
   **/
  public PushFCMEGCM icone(String icone) {
    this.icone = icone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome do icone a ser apresentado no push.")
  @JsonProperty("icone")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * Apresenta o cor do icone a ser apresentado no push
   **/
  public PushFCMEGCM som(String som) {
    this.som = som;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o cor do icone a ser apresentado no push")
  @JsonProperty("som")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  
  /**
   * Apresenta a cor do icone da notifica\u00E7\u00E3o. Essa cor dever\u00E1 ser informada no formato RGB Ex. #000000.
   **/
  public PushFCMEGCM cor(String cor) {
    this.cor = cor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a cor do icone da notifica\u00E7\u00E3o. Essa cor dever\u00E1 ser informada no formato RGB Ex. #000000.")
  @JsonProperty("cor")
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushFCMEGCM pushFCMEGCM = (PushFCMEGCM) o;
    return Objects.equals(this.idPessoa, pushFCMEGCM.idPessoa) &&
        Objects.equals(this.idConta, pushFCMEGCM.idConta) &&
        Objects.equals(this.tokenDispositivo, pushFCMEGCM.tokenDispositivo) &&
        Objects.equals(this.tokenServidor, pushFCMEGCM.tokenServidor) &&
        Objects.equals(this.titulo, pushFCMEGCM.titulo) &&
        Objects.equals(this.conteudo, pushFCMEGCM.conteudo) &&
        Objects.equals(this.tipoEvento, pushFCMEGCM.tipoEvento) &&
        Objects.equals(this.icone, pushFCMEGCM.icone) &&
        Objects.equals(this.som, pushFCMEGCM.som) &&
        Objects.equals(this.cor, pushFCMEGCM.cor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPessoa, idConta, tokenDispositivo, tokenServidor, titulo, conteudo, tipoEvento, icone, som, cor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushFCMEGCM {\n");
    
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    tokenDispositivo: ").append(toIndentedString(tokenDispositivo)).append("\n");
    sb.append("    tokenServidor: ").append(toIndentedString(tokenServidor)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    icone: ").append(toIndentedString(icone)).append("\n");
    sb.append("    som: ").append(toIndentedString(som)).append("\n");
    sb.append("    cor: ").append(toIndentedString(cor)).append("\n");
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

