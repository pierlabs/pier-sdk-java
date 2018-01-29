package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Aplicacao Mobile
 **/

@ApiModel(description = "Aplicacao Mobile")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AplicacaoMobileResponse   {
  
  private Long id = null;
  private Long idPlataformaMobile = null;
  private String token = null;
  private String cor = null;
  private String som = null;
  private String icone = null;
  private String certificadoBase64 = null;
  private String senha = null;

  
  /**
   * Apresenta o identificador da aplicacao.
   **/
  public AplicacaoMobileResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o identificador da aplicacao.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o identificador da plataforma.
   **/
  public AplicacaoMobileResponse idPlataformaMobile(Long idPlataformaMobile) {
    this.idPlataformaMobile = idPlataformaMobile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o identificador da plataforma.")
  @JsonProperty("idPlataformaMobile")
  public Long getIdPlataformaMobile() {
    return idPlataformaMobile;
  }
  public void setIdPlataformaMobile(Long idPlataformaMobile) {
    this.idPlataformaMobile = idPlataformaMobile;
  }

  
  /**
   * Apresenta o token da aplicacao.
   **/
  public AplicacaoMobileResponse token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o token da aplicacao.")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Apresenta a cor da mensagem da aplicacao.
   **/
  public AplicacaoMobileResponse cor(String cor) {
    this.cor = cor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a cor da mensagem da aplicacao.")
  @JsonProperty("cor")
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  
  /**
   * Apresenta o som da mensagem da aplicacao
   **/
  public AplicacaoMobileResponse som(String som) {
    this.som = som;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o som da mensagem da aplicacao")
  @JsonProperty("som")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  
  /**
   * Apresenta o icone da mensagem da aplica\u00C3\u00A7\u00C3\u00A3o.
   **/
  public AplicacaoMobileResponse icone(String icone) {
    this.icone = icone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o icone da mensagem da aplica\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("icone")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * Apresenta o certificado da aplica\u00C3\u00A7\u00C3\u00A3o.
   **/
  public AplicacaoMobileResponse certificadoBase64(String certificadoBase64) {
    this.certificadoBase64 = certificadoBase64;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o certificado da aplica\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("certificadoBase64")
  public String getCertificadoBase64() {
    return certificadoBase64;
  }
  public void setCertificadoBase64(String certificadoBase64) {
    this.certificadoBase64 = certificadoBase64;
  }

  
  /**
   * Apresenta a senha da aplica\u00C3\u00A7\u00C3\u00A3o.
   **/
  public AplicacaoMobileResponse senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a senha da aplica\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("senha")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AplicacaoMobileResponse aplicacaoMobileResponse = (AplicacaoMobileResponse) o;
    return Objects.equals(this.id, aplicacaoMobileResponse.id) &&
        Objects.equals(this.idPlataformaMobile, aplicacaoMobileResponse.idPlataformaMobile) &&
        Objects.equals(this.token, aplicacaoMobileResponse.token) &&
        Objects.equals(this.cor, aplicacaoMobileResponse.cor) &&
        Objects.equals(this.som, aplicacaoMobileResponse.som) &&
        Objects.equals(this.icone, aplicacaoMobileResponse.icone) &&
        Objects.equals(this.certificadoBase64, aplicacaoMobileResponse.certificadoBase64) &&
        Objects.equals(this.senha, aplicacaoMobileResponse.senha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idPlataformaMobile, token, cor, som, icone, certificadoBase64, senha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoMobileResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idPlataformaMobile: ").append(toIndentedString(idPlataformaMobile)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    cor: ").append(toIndentedString(cor)).append("\n");
    sb.append("    som: ").append(toIndentedString(som)).append("\n");
    sb.append("    icone: ").append(toIndentedString(icone)).append("\n");
    sb.append("    certificadoBase64: ").append(toIndentedString(certificadoBase64)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
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

