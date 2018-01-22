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
public class AplicacaoMobileUpdate   {
  
  private String token = null;
  private String cor = null;
  private String som = null;
  private String icone = null;
  private String certificado = null;
  private String senha = null;

  
  /**
   * Token da Aplicacao Mobile
   **/
  public AplicacaoMobileUpdate token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Token da Aplicacao Mobile")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Cor da Mensagem da Aplicacao Mobile
   **/
  public AplicacaoMobileUpdate cor(String cor) {
    this.cor = cor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cor da Mensagem da Aplicacao Mobile")
  @JsonProperty("cor")
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  
  /**
   * Som da Mensagem da Aplicacao Mobile
   **/
  public AplicacaoMobileUpdate som(String som) {
    this.som = som;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Som da Mensagem da Aplicacao Mobile")
  @JsonProperty("som")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  
  /**
   * Icone da Mensagem da Aplicacao Mobile
   **/
  public AplicacaoMobileUpdate icone(String icone) {
    this.icone = icone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Icone da Mensagem da Aplicacao Mobile")
  @JsonProperty("icone")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * Certificado da Aplicacao Mobile
   **/
  public AplicacaoMobileUpdate certificado(String certificado) {
    this.certificado = certificado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Certificado da Aplicacao Mobile")
  @JsonProperty("certificado")
  public String getCertificado() {
    return certificado;
  }
  public void setCertificado(String certificado) {
    this.certificado = certificado;
  }

  
  /**
   * Senha da Aplicacao Mobile
   **/
  public AplicacaoMobileUpdate senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Senha da Aplicacao Mobile")
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
    AplicacaoMobileUpdate aplicacaoMobileUpdate = (AplicacaoMobileUpdate) o;
    return Objects.equals(this.token, aplicacaoMobileUpdate.token) &&
        Objects.equals(this.cor, aplicacaoMobileUpdate.cor) &&
        Objects.equals(this.som, aplicacaoMobileUpdate.som) &&
        Objects.equals(this.icone, aplicacaoMobileUpdate.icone) &&
        Objects.equals(this.certificado, aplicacaoMobileUpdate.certificado) &&
        Objects.equals(this.senha, aplicacaoMobileUpdate.senha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, cor, som, icone, certificado, senha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoMobileUpdate {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    cor: ").append(toIndentedString(cor)).append("\n");
    sb.append("    som: ").append(toIndentedString(som)).append("\n");
    sb.append("    icone: ").append(toIndentedString(icone)).append("\n");
    sb.append("    certificado: ").append(toIndentedString(certificado)).append("\n");
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

