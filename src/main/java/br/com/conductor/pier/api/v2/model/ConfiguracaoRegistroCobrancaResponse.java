package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de configura\u00C3\u00A7\u00C3\u00A3o de registro de cobran\u00C3\u00A7a.
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de configura\u00C3\u00A7\u00C3\u00A3o de registro de cobran\u00C3\u00A7a.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConfiguracaoRegistroCobrancaResponse   {
  
  private Long id = null;
  private Long idEmissor = null;
  private Long codigoBanco = null;
  private String uri = null;
  private String keyStoreName = null;
  private String keyStorePassword = null;
  private String keystoreAlias = null;
  private String keyStorePrivateKeyPassword = null;
  private String typeKeystore = null;
  private String trustStoreName = null;
  private String trustStorePassword = null;
  private String truststoreAlias = null;
  private String typeTruststore = null;
  private String uriAdicional = null;


  public enum StatusEnum {
    INATIVO("INATIVO"),
    ATIVO("ATIVO");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;

  
  /**
   * C\u00C3\u00B3digo identificador da configura\u00C3\u00A7\u00C3\u00A3o.
   **/
  public ConfiguracaoRegistroCobrancaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo identificador da configura\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo do emissor.
   **/
  public ConfiguracaoRegistroCobrancaResponse idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo do emissor.")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * C\u00C3\u00B3digo do Banco.
   **/
  public ConfiguracaoRegistroCobrancaResponse codigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo do Banco.")
  @JsonProperty("codigoBanco")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * URL de acesso ao banco.
   **/
  public ConfiguracaoRegistroCobrancaResponse uri(String uri) {
    this.uri = uri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL de acesso ao banco.")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * Caminho do certificado digital do emissor.
   **/
  public ConfiguracaoRegistroCobrancaResponse keyStoreName(String keyStoreName) {
    this.keyStoreName = keyStoreName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Caminho do certificado digital do emissor.")
  @JsonProperty("keyStoreName")
  public String getKeyStoreName() {
    return keyStoreName;
  }
  public void setKeyStoreName(String keyStoreName) {
    this.keyStoreName = keyStoreName;
  }

  
  /**
   * Senha do certificado digital do emissor.
   **/
  public ConfiguracaoRegistroCobrancaResponse keyStorePassword(String keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Senha do certificado digital do emissor.")
  @JsonProperty("keyStorePassword")
  public String getKeyStorePassword() {
    return keyStorePassword;
  }
  public void setKeyStorePassword(String keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  
  /**
   * Alias do certificado digital do emissor.
   **/
  public ConfiguracaoRegistroCobrancaResponse keystoreAlias(String keystoreAlias) {
    this.keystoreAlias = keystoreAlias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Alias do certificado digital do emissor.")
  @JsonProperty("keystoreAlias")
  public String getKeystoreAlias() {
    return keystoreAlias;
  }
  public void setKeystoreAlias(String keystoreAlias) {
    this.keystoreAlias = keystoreAlias;
  }

  
  /**
   * Senha da chave privada do certificado digital do emissor.
   **/
  public ConfiguracaoRegistroCobrancaResponse keyStorePrivateKeyPassword(String keyStorePrivateKeyPassword) {
    this.keyStorePrivateKeyPassword = keyStorePrivateKeyPassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Senha da chave privada do certificado digital do emissor.")
  @JsonProperty("keyStorePrivateKeyPassword")
  public String getKeyStorePrivateKeyPassword() {
    return keyStorePrivateKeyPassword;
  }
  public void setKeyStorePrivateKeyPassword(String keyStorePrivateKeyPassword) {
    this.keyStorePrivateKeyPassword = keyStorePrivateKeyPassword;
  }

  
  /**
   * Tipo do certificado digital do emissor.
   **/
  public ConfiguracaoRegistroCobrancaResponse typeKeystore(String typeKeystore) {
    this.typeKeystore = typeKeystore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo do certificado digital do emissor.")
  @JsonProperty("typeKeystore")
  public String getTypeKeystore() {
    return typeKeystore;
  }
  public void setTypeKeystore(String typeKeystore) {
    this.typeKeystore = typeKeystore;
  }

  
  /**
   * Caminho do certificado digital do banco.
   **/
  public ConfiguracaoRegistroCobrancaResponse trustStoreName(String trustStoreName) {
    this.trustStoreName = trustStoreName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Caminho do certificado digital do banco.")
  @JsonProperty("trustStoreName")
  public String getTrustStoreName() {
    return trustStoreName;
  }
  public void setTrustStoreName(String trustStoreName) {
    this.trustStoreName = trustStoreName;
  }

  
  /**
   * Senha do certificado digital do banco.
   **/
  public ConfiguracaoRegistroCobrancaResponse trustStorePassword(String trustStorePassword) {
    this.trustStorePassword = trustStorePassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Senha do certificado digital do banco.")
  @JsonProperty("trustStorePassword")
  public String getTrustStorePassword() {
    return trustStorePassword;
  }
  public void setTrustStorePassword(String trustStorePassword) {
    this.trustStorePassword = trustStorePassword;
  }

  
  /**
   * Alias do certificado digital do banco.
   **/
  public ConfiguracaoRegistroCobrancaResponse truststoreAlias(String truststoreAlias) {
    this.truststoreAlias = truststoreAlias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Alias do certificado digital do banco.")
  @JsonProperty("truststoreAlias")
  public String getTruststoreAlias() {
    return truststoreAlias;
  }
  public void setTruststoreAlias(String truststoreAlias) {
    this.truststoreAlias = truststoreAlias;
  }

  
  /**
   * Tipo do certificado digital do banco.
   **/
  public ConfiguracaoRegistroCobrancaResponse typeTruststore(String typeTruststore) {
    this.typeTruststore = typeTruststore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo do certificado digital do banco.")
  @JsonProperty("typeTruststore")
  public String getTypeTruststore() {
    return typeTruststore;
  }
  public void setTypeTruststore(String typeTruststore) {
    this.typeTruststore = typeTruststore;
  }

  
  /**
   * URL adicional de acesso ao banco.
   **/
  public ConfiguracaoRegistroCobrancaResponse uriAdicional(String uriAdicional) {
    this.uriAdicional = uriAdicional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL adicional de acesso ao banco.")
  @JsonProperty("uriAdicional")
  public String getUriAdicional() {
    return uriAdicional;
  }
  public void setUriAdicional(String uriAdicional) {
    this.uriAdicional = uriAdicional;
  }

  
  /**
   * Status indicador se a configura\u00C3\u00A7\u00C3\u00A3o est\u00C3\u00A1 ativa.
   **/
  public ConfiguracaoRegistroCobrancaResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status indicador se a configura\u00C3\u00A7\u00C3\u00A3o est\u00C3\u00A1 ativa.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfiguracaoRegistroCobrancaResponse configuracaoRegistroCobrancaResponse = (ConfiguracaoRegistroCobrancaResponse) o;
    return Objects.equals(this.id, configuracaoRegistroCobrancaResponse.id) &&
        Objects.equals(this.idEmissor, configuracaoRegistroCobrancaResponse.idEmissor) &&
        Objects.equals(this.codigoBanco, configuracaoRegistroCobrancaResponse.codigoBanco) &&
        Objects.equals(this.uri, configuracaoRegistroCobrancaResponse.uri) &&
        Objects.equals(this.keyStoreName, configuracaoRegistroCobrancaResponse.keyStoreName) &&
        Objects.equals(this.keyStorePassword, configuracaoRegistroCobrancaResponse.keyStorePassword) &&
        Objects.equals(this.keystoreAlias, configuracaoRegistroCobrancaResponse.keystoreAlias) &&
        Objects.equals(this.keyStorePrivateKeyPassword, configuracaoRegistroCobrancaResponse.keyStorePrivateKeyPassword) &&
        Objects.equals(this.typeKeystore, configuracaoRegistroCobrancaResponse.typeKeystore) &&
        Objects.equals(this.trustStoreName, configuracaoRegistroCobrancaResponse.trustStoreName) &&
        Objects.equals(this.trustStorePassword, configuracaoRegistroCobrancaResponse.trustStorePassword) &&
        Objects.equals(this.truststoreAlias, configuracaoRegistroCobrancaResponse.truststoreAlias) &&
        Objects.equals(this.typeTruststore, configuracaoRegistroCobrancaResponse.typeTruststore) &&
        Objects.equals(this.uriAdicional, configuracaoRegistroCobrancaResponse.uriAdicional) &&
        Objects.equals(this.status, configuracaoRegistroCobrancaResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idEmissor, codigoBanco, uri, keyStoreName, keyStorePassword, keystoreAlias, keyStorePrivateKeyPassword, typeKeystore, trustStoreName, trustStorePassword, truststoreAlias, typeTruststore, uriAdicional, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoRegistroCobrancaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    codigoBanco: ").append(toIndentedString(codigoBanco)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    keyStoreName: ").append(toIndentedString(keyStoreName)).append("\n");
    sb.append("    keyStorePassword: ").append(toIndentedString(keyStorePassword)).append("\n");
    sb.append("    keystoreAlias: ").append(toIndentedString(keystoreAlias)).append("\n");
    sb.append("    keyStorePrivateKeyPassword: ").append(toIndentedString(keyStorePrivateKeyPassword)).append("\n");
    sb.append("    typeKeystore: ").append(toIndentedString(typeKeystore)).append("\n");
    sb.append("    trustStoreName: ").append(toIndentedString(trustStoreName)).append("\n");
    sb.append("    trustStorePassword: ").append(toIndentedString(trustStorePassword)).append("\n");
    sb.append("    truststoreAlias: ").append(toIndentedString(truststoreAlias)).append("\n");
    sb.append("    typeTruststore: ").append(toIndentedString(typeTruststore)).append("\n");
    sb.append("    uriAdicional: ").append(toIndentedString(uriAdicional)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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



