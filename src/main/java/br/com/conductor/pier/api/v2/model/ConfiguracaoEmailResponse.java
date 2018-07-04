package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{configuracao_email_response_description}}}
 **/

@ApiModel(description = "{{{configuracao_email_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConfiguracaoEmailResponse   {
  
  private Long id = null;
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
  private String dataInclusao = null;
  private String dataAlteracao = null;

  
  /**
   * {{{configuracao_email_response_id_value}}}
   **/
  public ConfiguracaoEmailResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{configuracao_email_response_host_value}}}
   **/
  public ConfiguracaoEmailResponse host(String host) {
    this.host = host;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_response_host_value}}}")
  @JsonProperty("host")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  
  /**
   * {{{configuracao_email_response_port_value}}}
   **/
  public ConfiguracaoEmailResponse port(String port) {
    this.port = port;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_response_port_value}}}")
  @JsonProperty("port")
  public String getPort() {
    return port;
  }
  public void setPort(String port) {
    this.port = port;
  }

  
  /**
   * {{{configuracao_email_response_port_t_l_s_s_t_a_r_t_t_l_s_value}}}
   **/
  public ConfiguracaoEmailResponse portTLSSTARTTLS(String portTLSSTARTTLS) {
    this.portTLSSTARTTLS = portTLSSTARTTLS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_response_port_t_l_s_s_t_a_r_t_t_l_s_value}}}")
  @JsonProperty("portTLSSTARTTLS")
  public String getPortTLSSTARTTLS() {
    return portTLSSTARTTLS;
  }
  public void setPortTLSSTARTTLS(String portTLSSTARTTLS) {
    this.portTLSSTARTTLS = portTLSSTARTTLS;
  }

  
  /**
   * {{{configuracao_email_response_port_s_s_l_value}}}
   **/
  public ConfiguracaoEmailResponse portSSL(String portSSL) {
    this.portSSL = portSSL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_response_port_s_s_l_value}}}")
  @JsonProperty("portSSL")
  public String getPortSSL() {
    return portSSL;
  }
  public void setPortSSL(String portSSL) {
    this.portSSL = portSSL;
  }

  
  /**
   * {{{configuracao_email_response_protocolo_value}}}
   **/
  public ConfiguracaoEmailResponse protocolo(String protocolo) {
    this.protocolo = protocolo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_response_protocolo_value}}}")
  @JsonProperty("protocolo")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  
  /**
   * {{{configuracao_email_response_requer_autenticacao_value}}}
   **/
  public ConfiguracaoEmailResponse requerAutenticacao(Boolean requerAutenticacao) {
    this.requerAutenticacao = requerAutenticacao;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_email_response_requer_autenticacao_value}}}")
  @JsonProperty("requerAutenticacao")
  public Boolean getRequerAutenticacao() {
    return requerAutenticacao;
  }
  public void setRequerAutenticacao(Boolean requerAutenticacao) {
    this.requerAutenticacao = requerAutenticacao;
  }

  
  /**
   * {{{configuracao_email_response_requer_s_s_l_value}}}
   **/
  public ConfiguracaoEmailResponse requerSSL(Boolean requerSSL) {
    this.requerSSL = requerSSL;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_email_response_requer_s_s_l_value}}}")
  @JsonProperty("requerSSL")
  public Boolean getRequerSSL() {
    return requerSSL;
  }
  public void setRequerSSL(Boolean requerSSL) {
    this.requerSSL = requerSSL;
  }

  
  /**
   * {{{configuracao_email_response_requer_t_l_s_value}}}
   **/
  public ConfiguracaoEmailResponse requerTLS(Boolean requerTLS) {
    this.requerTLS = requerTLS;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{configuracao_email_response_requer_t_l_s_value}}}")
  @JsonProperty("requerTLS")
  public Boolean getRequerTLS() {
    return requerTLS;
  }
  public void setRequerTLS(Boolean requerTLS) {
    this.requerTLS = requerTLS;
  }

  
  /**
   * {{{configuracao_email_response_usuario_value}}}
   **/
  public ConfiguracaoEmailResponse usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_response_usuario_value}}}")
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * {{{configuracao_email_response_senha_value}}}
   **/
  public ConfiguracaoEmailResponse senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_response_senha_value}}}")
  @JsonProperty("senha")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * {{{configuracao_email_response_data_inclusao_value}}}
   **/
  public ConfiguracaoEmailResponse dataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_response_data_inclusao_value}}}")
  @JsonProperty("dataInclusao")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * {{{configuracao_email_response_data_alteracao_value}}}
   **/
  public ConfiguracaoEmailResponse dataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{configuracao_email_response_data_alteracao_value}}}")
  @JsonProperty("dataAlteracao")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfiguracaoEmailResponse configuracaoEmailResponse = (ConfiguracaoEmailResponse) o;
    return Objects.equals(this.id, configuracaoEmailResponse.id) &&
        Objects.equals(this.host, configuracaoEmailResponse.host) &&
        Objects.equals(this.port, configuracaoEmailResponse.port) &&
        Objects.equals(this.portTLSSTARTTLS, configuracaoEmailResponse.portTLSSTARTTLS) &&
        Objects.equals(this.portSSL, configuracaoEmailResponse.portSSL) &&
        Objects.equals(this.protocolo, configuracaoEmailResponse.protocolo) &&
        Objects.equals(this.requerAutenticacao, configuracaoEmailResponse.requerAutenticacao) &&
        Objects.equals(this.requerSSL, configuracaoEmailResponse.requerSSL) &&
        Objects.equals(this.requerTLS, configuracaoEmailResponse.requerTLS) &&
        Objects.equals(this.usuario, configuracaoEmailResponse.usuario) &&
        Objects.equals(this.senha, configuracaoEmailResponse.senha) &&
        Objects.equals(this.dataInclusao, configuracaoEmailResponse.dataInclusao) &&
        Objects.equals(this.dataAlteracao, configuracaoEmailResponse.dataAlteracao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, host, port, portTLSSTARTTLS, portSSL, protocolo, requerAutenticacao, requerSSL, requerTLS, usuario, senha, dataInclusao, dataAlteracao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoEmailResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    sb.append("    dataInclusao: ").append(toIndentedString(dataInclusao)).append("\n");
    sb.append("    dataAlteracao: ").append(toIndentedString(dataAlteracao)).append("\n");
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



