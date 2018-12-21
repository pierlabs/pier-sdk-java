package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Response Representation of the collection register configuration resource
 **/

@ApiModel(description = "Response Representation of the collection register configuration resource")
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


  public enum SecretEnum {
    INATIVO("INATIVO"),
    ATIVO("ATIVO");

    private String value;

    SecretEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SecretEnum secret = null;


  public enum ClientIDEnum {
    INATIVO("INATIVO"),
    ATIVO("ATIVO");

    private String value;

    ClientIDEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ClientIDEnum clientID = null;
  private String chave = null;

  
  /**
   * Identifier Code of the Configuration
   **/
  public ConfiguracaoRegistroCobrancaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier Code of the Configuration")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Code of the issuer
   **/
  public ConfiguracaoRegistroCobrancaResponse idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Code of the issuer")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * Code of the Bank
   **/
  public ConfiguracaoRegistroCobrancaResponse codigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Code of the Bank")
  @JsonProperty("codigoBanco")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * URL of access to the bank
   **/
  public ConfiguracaoRegistroCobrancaResponse uri(String uri) {
    this.uri = uri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of access to the bank")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * Way to the digital certificate of the issuer
   **/
  public ConfiguracaoRegistroCobrancaResponse keyStoreName(String keyStoreName) {
    this.keyStoreName = keyStoreName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Way to the digital certificate of the issuer")
  @JsonProperty("keyStoreName")
  public String getKeyStoreName() {
    return keyStoreName;
  }
  public void setKeyStoreName(String keyStoreName) {
    this.keyStoreName = keyStoreName;
  }

  
  /**
   * Password of the digital certificate of the issuer
   **/
  public ConfiguracaoRegistroCobrancaResponse keyStorePassword(String keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Password of the digital certificate of the issuer")
  @JsonProperty("keyStorePassword")
  public String getKeyStorePassword() {
    return keyStorePassword;
  }
  public void setKeyStorePassword(String keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  
  /**
   * Alias of digital certificate of the issuer
   **/
  public ConfiguracaoRegistroCobrancaResponse keystoreAlias(String keystoreAlias) {
    this.keystoreAlias = keystoreAlias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Alias of digital certificate of the issuer")
  @JsonProperty("keystoreAlias")
  public String getKeystoreAlias() {
    return keystoreAlias;
  }
  public void setKeystoreAlias(String keystoreAlias) {
    this.keystoreAlias = keystoreAlias;
  }

  
  /**
   * Key password of the digital certificate of the issuer
   **/
  public ConfiguracaoRegistroCobrancaResponse keyStorePrivateKeyPassword(String keyStorePrivateKeyPassword) {
    this.keyStorePrivateKeyPassword = keyStorePrivateKeyPassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Key password of the digital certificate of the issuer")
  @JsonProperty("keyStorePrivateKeyPassword")
  public String getKeyStorePrivateKeyPassword() {
    return keyStorePrivateKeyPassword;
  }
  public void setKeyStorePrivateKeyPassword(String keyStorePrivateKeyPassword) {
    this.keyStorePrivateKeyPassword = keyStorePrivateKeyPassword;
  }

  
  /**
   * Type of digital certificate of the issuer
   **/
  public ConfiguracaoRegistroCobrancaResponse typeKeystore(String typeKeystore) {
    this.typeKeystore = typeKeystore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of digital certificate of the issuer")
  @JsonProperty("typeKeystore")
  public String getTypeKeystore() {
    return typeKeystore;
  }
  public void setTypeKeystore(String typeKeystore) {
    this.typeKeystore = typeKeystore;
  }

  
  /**
   * Way of the digital certificate of the bank
   **/
  public ConfiguracaoRegistroCobrancaResponse trustStoreName(String trustStoreName) {
    this.trustStoreName = trustStoreName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Way of the digital certificate of the bank")
  @JsonProperty("trustStoreName")
  public String getTrustStoreName() {
    return trustStoreName;
  }
  public void setTrustStoreName(String trustStoreName) {
    this.trustStoreName = trustStoreName;
  }

  
  /**
   * Password of the digital certificate of the bank
   **/
  public ConfiguracaoRegistroCobrancaResponse trustStorePassword(String trustStorePassword) {
    this.trustStorePassword = trustStorePassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Password of the digital certificate of the bank")
  @JsonProperty("trustStorePassword")
  public String getTrustStorePassword() {
    return trustStorePassword;
  }
  public void setTrustStorePassword(String trustStorePassword) {
    this.trustStorePassword = trustStorePassword;
  }

  
  /**
   * Alias of digital certificate of the bank
   **/
  public ConfiguracaoRegistroCobrancaResponse truststoreAlias(String truststoreAlias) {
    this.truststoreAlias = truststoreAlias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Alias of digital certificate of the bank")
  @JsonProperty("truststoreAlias")
  public String getTruststoreAlias() {
    return truststoreAlias;
  }
  public void setTruststoreAlias(String truststoreAlias) {
    this.truststoreAlias = truststoreAlias;
  }

  
  /**
   * Type of the digital certificate of the bank
   **/
  public ConfiguracaoRegistroCobrancaResponse typeTruststore(String typeTruststore) {
    this.typeTruststore = typeTruststore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the digital certificate of the bank")
  @JsonProperty("typeTruststore")
  public String getTypeTruststore() {
    return typeTruststore;
  }
  public void setTypeTruststore(String typeTruststore) {
    this.typeTruststore = typeTruststore;
  }

  
  /**
   * Additional URL of access to the bank
   **/
  public ConfiguracaoRegistroCobrancaResponse uriAdicional(String uriAdicional) {
    this.uriAdicional = uriAdicional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional URL of access to the bank")
  @JsonProperty("uriAdicional")
  public String getUriAdicional() {
    return uriAdicional;
  }
  public void setUriAdicional(String uriAdicional) {
    this.uriAdicional = uriAdicional;
  }

  
  /**
   * Status indicator if the configuration is active
   **/
  public ConfiguracaoRegistroCobrancaResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status indicator if the configuration is active")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Secret needed for retrieving the Access Token. Used for communication with Banco do Brasil
   **/
  public ConfiguracaoRegistroCobrancaResponse secret(SecretEnum secret) {
    this.secret = secret;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Secret needed for retrieving the Access Token. Used for communication with Banco do Brasil")
  @JsonProperty("secret")
  public SecretEnum getSecret() {
    return secret;
  }
  public void setSecret(SecretEnum secret) {
    this.secret = secret;
  }

  
  /**
   * ClientID needed for retrieving the Access Token. Used for communication with Banco do Brasil
   **/
  public ConfiguracaoRegistroCobrancaResponse clientID(ClientIDEnum clientID) {
    this.clientID = clientID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ClientID needed for retrieving the Access Token. Used for communication with Banco do Brasil")
  @JsonProperty("clientID")
  public ClientIDEnum getClientID() {
    return clientID;
  }
  public void setClientID(ClientIDEnum clientID) {
    this.clientID = clientID;
  }

  
  /**
   * Key needed for retrieving the Access Token. Used for communication with Itau Bank
   **/
  public ConfiguracaoRegistroCobrancaResponse chave(String chave) {
    this.chave = chave;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Key needed for retrieving the Access Token. Used for communication with Itau Bank")
  @JsonProperty("chave")
  public String getChave() {
    return chave;
  }
  public void setChave(String chave) {
    this.chave = chave;
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
        Objects.equals(this.status, configuracaoRegistroCobrancaResponse.status) &&
        Objects.equals(this.secret, configuracaoRegistroCobrancaResponse.secret) &&
        Objects.equals(this.clientID, configuracaoRegistroCobrancaResponse.clientID) &&
        Objects.equals(this.chave, configuracaoRegistroCobrancaResponse.chave);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idEmissor, codigoBanco, uri, keyStoreName, keyStorePassword, keystoreAlias, keyStorePrivateKeyPassword, typeKeystore, trustStoreName, trustStorePassword, truststoreAlias, typeTruststore, uriAdicional, status, secret, clientID, chave);
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
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    clientID: ").append(toIndentedString(clientID)).append("\n");
    sb.append("    chave: ").append(toIndentedString(chave)).append("\n");
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

