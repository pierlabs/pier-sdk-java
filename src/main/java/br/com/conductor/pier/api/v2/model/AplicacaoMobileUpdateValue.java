package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{aplicacao_mobile_update_description}}}
 **/

@ApiModel(description = "{{{aplicacao_mobile_update_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AplicacaoMobileUpdateValue   {
  
  private String token = null;
  private String cor = null;
  private String som = null;
  private String icone = null;
  private String certificado = null;
  private String senha = null;

  
  /**
   * {{{aplicacao_mobile_update_token_value}}}
   **/
  public AplicacaoMobileUpdateValue token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aplicacao_mobile_update_token_value}}}")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * {{{aplicacao_mobile_update_cor_value}}}
   **/
  public AplicacaoMobileUpdateValue cor(String cor) {
    this.cor = cor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aplicacao_mobile_update_cor_value}}}")
  @JsonProperty("cor")
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  
  /**
   * {{{aplicacao_mobile_update_som_value}}}
   **/
  public AplicacaoMobileUpdateValue som(String som) {
    this.som = som;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aplicacao_mobile_update_som_value}}}")
  @JsonProperty("som")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  
  /**
   * {{{aplicacao_mobile_update_icone_value}}}
   **/
  public AplicacaoMobileUpdateValue icone(String icone) {
    this.icone = icone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aplicacao_mobile_update_icone_value}}}")
  @JsonProperty("icone")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * {{{aplicacao_mobile_update_certificado_value}}}
   **/
  public AplicacaoMobileUpdateValue certificado(String certificado) {
    this.certificado = certificado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aplicacao_mobile_update_certificado_value}}}")
  @JsonProperty("certificado")
  public String getCertificado() {
    return certificado;
  }
  public void setCertificado(String certificado) {
    this.certificado = certificado;
  }

  
  /**
   * {{{aplicacao_mobile_update_senha_value}}}
   **/
  public AplicacaoMobileUpdateValue senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aplicacao_mobile_update_senha_value}}}")
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
    AplicacaoMobileUpdateValue aplicacaoMobileUpdateValue = (AplicacaoMobileUpdateValue) o;
    return Objects.equals(this.token, aplicacaoMobileUpdateValue.token) &&
        Objects.equals(this.cor, aplicacaoMobileUpdateValue.cor) &&
        Objects.equals(this.som, aplicacaoMobileUpdateValue.som) &&
        Objects.equals(this.icone, aplicacaoMobileUpdateValue.icone) &&
        Objects.equals(this.certificado, aplicacaoMobileUpdateValue.certificado) &&
        Objects.equals(this.senha, aplicacaoMobileUpdateValue.senha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, cor, som, icone, certificado, senha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoMobileUpdateValue {\n");
    
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



