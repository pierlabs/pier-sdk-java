package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto AplicacaoMobile
 **/

@ApiModel(description = "Objeto AplicacaoMobile")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AplicacaoMobilePersist   {
  
  private Long idPlataformaMobile = null;
  private String token = null;
  private String cor = null;
  private String som = null;
  private String icone = null;
  private String certificadoBase64 = null;
  private String senha = null;

  
  /**
   * Apresenta o identificador da plataforma.
   **/
  public AplicacaoMobilePersist idPlataformaMobile(Long idPlataformaMobile) {
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
  public AplicacaoMobilePersist token(String token) {
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
  public AplicacaoMobilePersist cor(String cor) {
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
  public AplicacaoMobilePersist som(String som) {
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
   * Apresenta o icone da mensagem da aplica\u00E7\u00E3o.
   **/
  public AplicacaoMobilePersist icone(String icone) {
    this.icone = icone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o icone da mensagem da aplica\u00E7\u00E3o.")
  @JsonProperty("icone")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * Apresenta o certificado da aplica\u00E7\u00E3o.
   **/
  public AplicacaoMobilePersist certificadoBase64(String certificadoBase64) {
    this.certificadoBase64 = certificadoBase64;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o certificado da aplica\u00E7\u00E3o.")
  @JsonProperty("certificadoBase64")
  public String getCertificadoBase64() {
    return certificadoBase64;
  }
  public void setCertificadoBase64(String certificadoBase64) {
    this.certificadoBase64 = certificadoBase64;
  }

  
  /**
   * Apresenta a senha da aplica\u00E7\u00E3o.
   **/
  public AplicacaoMobilePersist senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a senha da aplica\u00E7\u00E3o.")
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
    AplicacaoMobilePersist aplicacaoMobilePersist = (AplicacaoMobilePersist) o;
    return Objects.equals(this.idPlataformaMobile, aplicacaoMobilePersist.idPlataformaMobile) &&
        Objects.equals(this.token, aplicacaoMobilePersist.token) &&
        Objects.equals(this.cor, aplicacaoMobilePersist.cor) &&
        Objects.equals(this.som, aplicacaoMobilePersist.som) &&
        Objects.equals(this.icone, aplicacaoMobilePersist.icone) &&
        Objects.equals(this.certificadoBase64, aplicacaoMobilePersist.certificadoBase64) &&
        Objects.equals(this.senha, aplicacaoMobilePersist.senha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPlataformaMobile, token, cor, som, icone, certificadoBase64, senha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoMobilePersist {\n");
    
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

