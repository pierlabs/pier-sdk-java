package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{configuracao_email_persist_description}}}
 **/

@ApiModel(description = "{{{configuracao_email_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConfiguracaoEmailPersist   {
  
  private String host = null;
  private String port = null;
  private String portTLSSTARTTLS = null;
  private String portSSL = null;
  private String protocolo = null;
  private Boolean requerAutenticacao = null;
  private Boolean requerSSL = null;
  private Boolean requerTLS = null;
  private String usuario = null;
  private String senha = null;

  
  /**
   * {{{configuracao_email_persist_host_value}}}
   **/
  public ConfiguracaoEmailPersist host(String host) {
    this.host = host;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_persist_host_value}}}")
  @JsonProperty("host")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  
  /**
   * {{{configuracao_email_persist_port_value}}}
   **/
  public ConfiguracaoEmailPersist port(String port) {
    this.port = port;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_persist_port_value}}}")
  @JsonProperty("port")
  public String getPort() {
    return port;
  }
  public void setPort(String port) {
    this.port = port;
  }

  
  /**
   * {{{configuracao_email_persist_port_t_l_s_s_t_a_r_t_t_l_s_value}}}
   **/
  public ConfiguracaoEmailPersist portTLSSTARTTLS(String portTLSSTARTTLS) {
    this.portTLSSTARTTLS = portTLSSTARTTLS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_persist_port_t_l_s_s_t_a_r_t_t_l_s_value}}}")
  @JsonProperty("portTLSSTARTTLS")
  public String getPortTLSSTARTTLS() {
    return portTLSSTARTTLS;
  }
  public void setPortTLSSTARTTLS(String portTLSSTARTTLS) {
    this.portTLSSTARTTLS = portTLSSTARTTLS;
  }

  
  /**
   * {{{configuracao_email_persist_port_s_s_l_value}}}
   **/
  public ConfiguracaoEmailPersist portSSL(String portSSL) {
    this.portSSL = portSSL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_persist_port_s_s_l_value}}}")
  @JsonProperty("portSSL")
  public String getPortSSL() {
    return portSSL;
  }
  public void setPortSSL(String portSSL) {
    this.portSSL = portSSL;
  }

  
  /**
   * {{{configuracao_email_persist_protocolo_value}}}
   **/
  public ConfiguracaoEmailPersist protocolo(String protocolo) {
    this.protocolo = protocolo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_persist_protocolo_value}}}")
  @JsonProperty("protocolo")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  
  /**
   * {{{configuracao_email_persist_requer_autenticacao_value}}}
   **/
  public ConfiguracaoEmailPersist requerAutenticacao(Boolean requerAutenticacao) {
    this.requerAutenticacao = requerAutenticacao;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_email_persist_requer_autenticacao_value}}}")
  @JsonProperty("requerAutenticacao")
  public Boolean getRequerAutenticacao() {
    return requerAutenticacao;
  }
  public void setRequerAutenticacao(Boolean requerAutenticacao) {
    this.requerAutenticacao = requerAutenticacao;
  }

  
  /**
   * {{{configuracao_email_persist_requer_s_s_l_value}}}
   **/
  public ConfiguracaoEmailPersist requerSSL(Boolean requerSSL) {
    this.requerSSL = requerSSL;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_email_persist_requer_s_s_l_value}}}")
  @JsonProperty("requerSSL")
  public Boolean getRequerSSL() {
    return requerSSL;
  }
  public void setRequerSSL(Boolean requerSSL) {
    this.requerSSL = requerSSL;
  }

  
  /**
   * {{{configuracao_email_persist_requer_t_l_s_value}}}
   **/
  public ConfiguracaoEmailPersist requerTLS(Boolean requerTLS) {
    this.requerTLS = requerTLS;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_email_persist_requer_t_l_s_value}}}")
  @JsonProperty("requerTLS")
  public Boolean getRequerTLS() {
    return requerTLS;
  }
  public void setRequerTLS(Boolean requerTLS) {
    this.requerTLS = requerTLS;
  }

  
  /**
   * {{{configuracao_email_persist_usuario_value}}}
   **/
  public ConfiguracaoEmailPersist usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_persist_usuario_value}}}")
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * {{{configuracao_email_persist_senha_value}}}
   **/
  public ConfiguracaoEmailPersist senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_persist_senha_value}}}")
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
    ConfiguracaoEmailPersist configuracaoEmailPersist = (ConfiguracaoEmailPersist) o;
    return Objects.equals(this.host, configuracaoEmailPersist.host) &&
        Objects.equals(this.port, configuracaoEmailPersist.port) &&
        Objects.equals(this.portTLSSTARTTLS, configuracaoEmailPersist.portTLSSTARTTLS) &&
        Objects.equals(this.portSSL, configuracaoEmailPersist.portSSL) &&
        Objects.equals(this.protocolo, configuracaoEmailPersist.protocolo) &&
        Objects.equals(this.requerAutenticacao, configuracaoEmailPersist.requerAutenticacao) &&
        Objects.equals(this.requerSSL, configuracaoEmailPersist.requerSSL) &&
        Objects.equals(this.requerTLS, configuracaoEmailPersist.requerTLS) &&
        Objects.equals(this.usuario, configuracaoEmailPersist.usuario) &&
        Objects.equals(this.senha, configuracaoEmailPersist.senha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port, portTLSSTARTTLS, portSSL, protocolo, requerAutenticacao, requerSSL, requerTLS, usuario, senha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoEmailPersist {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    portTLSSTARTTLS: ").append(toIndentedString(portTLSSTARTTLS)).append("\n");
    sb.append("    portSSL: ").append(toIndentedString(portSSL)).append("\n");
    sb.append("    protocolo: ").append(toIndentedString(protocolo)).append("\n");
    sb.append("    requerAutenticacao: ").append(toIndentedString(requerAutenticacao)).append("\n");
    sb.append("    requerSSL: ").append(toIndentedString(requerSSL)).append("\n");
    sb.append("    requerTLS: ").append(toIndentedString(requerTLS)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
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

