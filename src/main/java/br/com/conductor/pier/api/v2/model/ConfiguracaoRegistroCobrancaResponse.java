package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{configuracao_registro_cobranca_response_description}}}
 **/

@ApiModel(description = "{{{configuracao_registro_cobranca_response_description}}}")
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

  
  /**
   * {{{configuracao_registro_cobranca_response_id_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_registro_cobranca_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_id_emissor_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_registro_cobranca_response_id_emissor_value}}}")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_codigo_banco_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse codigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_registro_cobranca_response_codigo_banco_value}}}")
  @JsonProperty("codigoBanco")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_uri_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse uri(String uri) {
    this.uri = uri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_registro_cobranca_response_uri_value}}}")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_key_store_name_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse keyStoreName(String keyStoreName) {
    this.keyStoreName = keyStoreName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_registro_cobranca_response_key_store_name_value}}}")
  @JsonProperty("keyStoreName")
  public String getKeyStoreName() {
    return keyStoreName;
  }
  public void setKeyStoreName(String keyStoreName) {
    this.keyStoreName = keyStoreName;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_key_store_password_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse keyStorePassword(String keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_registro_cobranca_response_key_store_password_value}}}")
  @JsonProperty("keyStorePassword")
  public String getKeyStorePassword() {
    return keyStorePassword;
  }
  public void setKeyStorePassword(String keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_keystore_alias_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse keystoreAlias(String keystoreAlias) {
    this.keystoreAlias = keystoreAlias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_registro_cobranca_response_keystore_alias_value}}}")
  @JsonProperty("keystoreAlias")
  public String getKeystoreAlias() {
    return keystoreAlias;
  }
  public void setKeystoreAlias(String keystoreAlias) {
    this.keystoreAlias = keystoreAlias;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_key_store_private_key_password_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse keyStorePrivateKeyPassword(String keyStorePrivateKeyPassword) {
    this.keyStorePrivateKeyPassword = keyStorePrivateKeyPassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_registro_cobranca_response_key_store_private_key_password_value}}}")
  @JsonProperty("keyStorePrivateKeyPassword")
  public String getKeyStorePrivateKeyPassword() {
    return keyStorePrivateKeyPassword;
  }
  public void setKeyStorePrivateKeyPassword(String keyStorePrivateKeyPassword) {
    this.keyStorePrivateKeyPassword = keyStorePrivateKeyPassword;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_type_keystore_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse typeKeystore(String typeKeystore) {
    this.typeKeystore = typeKeystore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_registro_cobranca_response_type_keystore_value}}}")
  @JsonProperty("typeKeystore")
  public String getTypeKeystore() {
    return typeKeystore;
  }
  public void setTypeKeystore(String typeKeystore) {
    this.typeKeystore = typeKeystore;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_trust_store_name_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse trustStoreName(String trustStoreName) {
    this.trustStoreName = trustStoreName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_registro_cobranca_response_trust_store_name_value}}}")
  @JsonProperty("trustStoreName")
  public String getTrustStoreName() {
    return trustStoreName;
  }
  public void setTrustStoreName(String trustStoreName) {
    this.trustStoreName = trustStoreName;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_trust_store_password_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse trustStorePassword(String trustStorePassword) {
    this.trustStorePassword = trustStorePassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_registro_cobranca_response_trust_store_password_value}}}")
  @JsonProperty("trustStorePassword")
  public String getTrustStorePassword() {
    return trustStorePassword;
  }
  public void setTrustStorePassword(String trustStorePassword) {
    this.trustStorePassword = trustStorePassword;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_truststore_alias_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse truststoreAlias(String truststoreAlias) {
    this.truststoreAlias = truststoreAlias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_registro_cobranca_response_truststore_alias_value}}}")
  @JsonProperty("truststoreAlias")
  public String getTruststoreAlias() {
    return truststoreAlias;
  }
  public void setTruststoreAlias(String truststoreAlias) {
    this.truststoreAlias = truststoreAlias;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_type_truststore_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse typeTruststore(String typeTruststore) {
    this.typeTruststore = typeTruststore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_registro_cobranca_response_type_truststore_value}}}")
  @JsonProperty("typeTruststore")
  public String getTypeTruststore() {
    return typeTruststore;
  }
  public void setTypeTruststore(String typeTruststore) {
    this.typeTruststore = typeTruststore;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_uri_adicional_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse uriAdicional(String uriAdicional) {
    this.uriAdicional = uriAdicional;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_registro_cobranca_response_uri_adicional_value}}}")
  @JsonProperty("uriAdicional")
  public String getUriAdicional() {
    return uriAdicional;
  }
  public void setUriAdicional(String uriAdicional) {
    this.uriAdicional = uriAdicional;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_status_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_registro_cobranca_response_status_value}}}")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * {{{configuracao_registro_cobranca_persist_secret_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse secret(SecretEnum secret) {
    this.secret = secret;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{configuracao_registro_cobranca_persist_secret_value}}}")
  @JsonProperty("secret")
  public SecretEnum getSecret() {
    return secret;
  }
  public void setSecret(SecretEnum secret) {
    this.secret = secret;
  }

  
  /**
   * {{{configuracao_registro_cobranca_persist_client_id_value}}}
   **/
  public ConfiguracaoRegistroCobrancaResponse clientID(ClientIDEnum clientID) {
    this.clientID = clientID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{configuracao_registro_cobranca_persist_client_id_value}}}")
  @JsonProperty("clientID")
  public ClientIDEnum getClientID() {
    return clientID;
  }
  public void setClientID(ClientIDEnum clientID) {
    this.clientID = clientID;
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
        Objects.equals(this.clientID, configuracaoRegistroCobrancaResponse.clientID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idEmissor, codigoBanco, uri, keyStoreName, keyStorePassword, keystoreAlias, keyStorePrivateKeyPassword, typeKeystore, trustStoreName, trustStorePassword, truststoreAlias, typeTruststore, uriAdicional, status, secret, clientID);
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



