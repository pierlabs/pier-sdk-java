package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Push Notifica\u00E7\u00E3o APNS
 **/

@ApiModel(description = "Objeto Push Notifica\u00E7\u00E3o APNS")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PushAPNS   {
  
  private Long idPessoa = null;
  private Long idConta = null;
  private String tokenDispositivo = null;
  private String certificado = null;
  private String senha = null;
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

  
  /**
   * C\u00F3digo identificado da pessoa
   **/
  public PushAPNS idPessoa(Long idPessoa) {
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
  public PushAPNS idConta(Long idConta) {
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
  public PushAPNS tokenDispositivo(String tokenDispositivo) {
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
   * Apresenta o certificado APNs que est\u00E1 cadastrado para o aplicativo na loja da Apple. Esse certificado dever\u00E1 ser enviado no formado Base64.
   **/
  public PushAPNS certificado(String certificado) {
    this.certificado = certificado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o certificado APNs que est\u00E1 cadastrado para o aplicativo na loja da Apple. Esse certificado dever\u00E1 ser enviado no formado Base64.")
  @JsonProperty("certificado")
  public String getCertificado() {
    return certificado;
  }
  public void setCertificado(String certificado) {
    this.certificado = certificado;
  }

  
  /**
   * Apresenta a senha para o certificado APNs que est\u00E1 cadastrado para o aplicativo na loja da Apple.
   **/
  public PushAPNS senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a senha para o certificado APNs que est\u00E1 cadastrado para o aplicativo na loja da Apple.")
  @JsonProperty("senha")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * Apresenta o t\u00EDtulo da notifica\u00E7\u00E3o.
   **/
  public PushAPNS titulo(String titulo) {
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
  public PushAPNS conteudo(String conteudo) {
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
  public PushAPNS tipoEvento(TipoEventoEnum tipoEvento) {
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
  public PushAPNS icone(String icone) {
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
  public PushAPNS som(String som) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushAPNS pushAPNS = (PushAPNS) o;
    return Objects.equals(this.idPessoa, pushAPNS.idPessoa) &&
        Objects.equals(this.idConta, pushAPNS.idConta) &&
        Objects.equals(this.tokenDispositivo, pushAPNS.tokenDispositivo) &&
        Objects.equals(this.certificado, pushAPNS.certificado) &&
        Objects.equals(this.senha, pushAPNS.senha) &&
        Objects.equals(this.titulo, pushAPNS.titulo) &&
        Objects.equals(this.conteudo, pushAPNS.conteudo) &&
        Objects.equals(this.tipoEvento, pushAPNS.tipoEvento) &&
        Objects.equals(this.icone, pushAPNS.icone) &&
        Objects.equals(this.som, pushAPNS.som);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPessoa, idConta, tokenDispositivo, certificado, senha, titulo, conteudo, tipoEvento, icone, som);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushAPNS {\n");
    
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    tokenDispositivo: ").append(toIndentedString(tokenDispositivo)).append("\n");
    sb.append("    certificado: ").append(toIndentedString(certificado)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    icone: ").append(toIndentedString(icone)).append("\n");
    sb.append("    som: ").append(toIndentedString(som)).append("\n");
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

