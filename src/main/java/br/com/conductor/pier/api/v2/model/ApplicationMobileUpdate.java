package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object ApplicationMobile
 **/

@ApiModel(description = "Object ApplicationMobile")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ApplicationMobileUpdate   {
  
  private String token = null;
  private String cor = null;
  private String som = null;
  private String icone = null;
  private String certificado = null;
  private String senha = null;

  
  /**
   * Token of the Mobile Application
   **/
  public ApplicationMobileUpdate token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Token of the Mobile Application")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Color of the Mobile App Message
   **/
  public ApplicationMobileUpdate cor(String cor) {
    this.cor = cor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Color of the Mobile App Message")
  @JsonProperty("cor")
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  
  /**
   * Message Sound of the Mobile Application
   **/
  public ApplicationMobileUpdate som(String som) {
    this.som = som;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message Sound of the Mobile Application")
  @JsonProperty("som")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  
  /**
   * Icon of the Message Mobile Application
   **/
  public ApplicationMobileUpdate icone(String icone) {
    this.icone = icone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Icon of the Message Mobile Application")
  @JsonProperty("icone")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * Certificate of the Mobile Application
   **/
  public ApplicationMobileUpdate certificado(String certificado) {
    this.certificado = certificado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Certificate of the Mobile Application")
  @JsonProperty("certificado")
  public String getCertificado() {
    return certificado;
  }
  public void setCertificado(String certificado) {
    this.certificado = certificado;
  }

  
  /**
   * Password of the Application Mobile
   **/
  public ApplicationMobileUpdate senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Password of the Application Mobile")
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
    ApplicationMobileUpdate applicationMobileUpdate = (ApplicationMobileUpdate) o;
    return Objects.equals(this.token, applicationMobileUpdate.token) &&
        Objects.equals(this.cor, applicationMobileUpdate.cor) &&
        Objects.equals(this.som, applicationMobileUpdate.som) &&
        Objects.equals(this.icone, applicationMobileUpdate.icone) &&
        Objects.equals(this.certificado, applicationMobileUpdate.certificado) &&
        Objects.equals(this.senha, applicationMobileUpdate.senha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, cor, som, icone, certificado, senha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationMobileUpdate {\n");
    
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

