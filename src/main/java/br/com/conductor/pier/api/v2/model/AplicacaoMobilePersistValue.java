package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{aplicacao_mobile_persist_description}}}
 **/

@ApiModel(description = "{{{aplicacao_mobile_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AplicacaoMobilePersistValue   {
  
  private Long idPlataformaMobile = null;
  private String token = null;
  private String cor = null;
  private String som = null;
  private String icone = null;
  private String certificadoBase64 = null;
  private String senha = null;

  
  /**
   * {{{aplicacao_mobile_persist_id_plataforma_mobile_value}}}
   **/
  public AplicacaoMobilePersistValue idPlataformaMobile(Long idPlataformaMobile) {
    this.idPlataformaMobile = idPlataformaMobile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aplicacao_mobile_persist_id_plataforma_mobile_value}}}")
  @JsonProperty("idPlataformaMobile")
  public Long getIdPlataformaMobile() {
    return idPlataformaMobile;
  }
  public void setIdPlataformaMobile(Long idPlataformaMobile) {
    this.idPlataformaMobile = idPlataformaMobile;
  }

  
  /**
   * {{{aplicacao_mobile_persist_token_value}}}
   **/
  public AplicacaoMobilePersistValue token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aplicacao_mobile_persist_token_value}}}")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * {{{aplicacao_mobile_persist_cor_value}}}
   **/
  public AplicacaoMobilePersistValue cor(String cor) {
    this.cor = cor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aplicacao_mobile_persist_cor_value}}}")
  @JsonProperty("cor")
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  
  /**
   * {{{aplicacao_mobile_persist_som_value}}}
   **/
  public AplicacaoMobilePersistValue som(String som) {
    this.som = som;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aplicacao_mobile_persist_som_value}}}")
  @JsonProperty("som")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  
  /**
   * {{{aplicacao_mobile_persist_icone_value}}}
   **/
  public AplicacaoMobilePersistValue icone(String icone) {
    this.icone = icone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aplicacao_mobile_persist_icone_value}}}")
  @JsonProperty("icone")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * {{{aplicacao_mobile_persist_certificado_base64_value}}}
   **/
  public AplicacaoMobilePersistValue certificadoBase64(String certificadoBase64) {
    this.certificadoBase64 = certificadoBase64;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aplicacao_mobile_persist_certificado_base64_value}}}")
  @JsonProperty("certificadoBase64")
  public String getCertificadoBase64() {
    return certificadoBase64;
  }
  public void setCertificadoBase64(String certificadoBase64) {
    this.certificadoBase64 = certificadoBase64;
  }

  
  /**
   * {{{aplicacao_mobile_persist_senha_value}}}
   **/
  public AplicacaoMobilePersistValue senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{aplicacao_mobile_persist_senha_value}}}")
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
    AplicacaoMobilePersistValue aplicacaoMobilePersistValue = (AplicacaoMobilePersistValue) o;
    return Objects.equals(this.idPlataformaMobile, aplicacaoMobilePersistValue.idPlataformaMobile) &&
        Objects.equals(this.token, aplicacaoMobilePersistValue.token) &&
        Objects.equals(this.cor, aplicacaoMobilePersistValue.cor) &&
        Objects.equals(this.som, aplicacaoMobilePersistValue.som) &&
        Objects.equals(this.icone, aplicacaoMobilePersistValue.icone) &&
        Objects.equals(this.certificadoBase64, aplicacaoMobilePersistValue.certificadoBase64) &&
        Objects.equals(this.senha, aplicacaoMobilePersistValue.senha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPlataformaMobile, token, cor, som, icone, certificadoBase64, senha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoMobilePersistValue {\n");
    
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

