package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso Base
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso Base")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BaseResponse   {
  
  private Long id = null;
  private String servidor = null;
  private String usuario = null;
  private String senha = null;
  private String nomeBase = null;
  private Boolean senhaCriptografada = null;
  private String domain = null;
  private String nomeBaseControleAcesso = null;
  private Long idEmissor = null;
  private String servidorControleAcesso = null;

  
  /**
   * C\u00C3\u00B3digo identificador da base
   **/
  public BaseResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo identificador da base")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * IP do servidor
   **/
  public BaseResponse servidor(String servidor) {
    this.servidor = servidor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "IP do servidor")
  @JsonProperty("servidor")
  public String getServidor() {
    return servidor;
  }
  public void setServidor(String servidor) {
    this.servidor = servidor;
  }

  
  /**
   * Nome do usu\u00C3\u00A1rio
   **/
  public BaseResponse usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome do usu\u00C3\u00A1rio")
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * Senha
   **/
  public BaseResponse senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Senha")
  @JsonProperty("senha")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * Nome da base
   **/
  public BaseResponse nomeBase(String nomeBase) {
    this.nomeBase = nomeBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome da base")
  @JsonProperty("nomeBase")
  public String getNomeBase() {
    return nomeBase;
  }
  public void setNomeBase(String nomeBase) {
    this.nomeBase = nomeBase;
  }

  
  /**
   * senha Criptografada
   **/
  public BaseResponse senhaCriptografada(Boolean senhaCriptografada) {
    this.senhaCriptografada = senhaCriptografada;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "senha Criptografada")
  @JsonProperty("senhaCriptografada")
  public Boolean getSenhaCriptografada() {
    return senhaCriptografada;
  }
  public void setSenhaCriptografada(Boolean senhaCriptografada) {
    this.senhaCriptografada = senhaCriptografada;
  }

  
  /**
   * Dom\u00C3\u00ADnio da base
   **/
  public BaseResponse domain(String domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Dom\u00C3\u00ADnio da base")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  
  /**
   * Nome da base de controle acesso
   **/
  public BaseResponse nomeBaseControleAcesso(String nomeBaseControleAcesso) {
    this.nomeBaseControleAcesso = nomeBaseControleAcesso;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome da base de controle acesso")
  @JsonProperty("nomeBaseControleAcesso")
  public String getNomeBaseControleAcesso() {
    return nomeBaseControleAcesso;
  }
  public void setNomeBaseControleAcesso(String nomeBaseControleAcesso) {
    this.nomeBaseControleAcesso = nomeBaseControleAcesso;
  }

  
  /**
   * C\u00C3\u00B3digo do identificador do emissor
   **/
  public BaseResponse idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo do identificador do emissor")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * Servidor do controle de acesso
   **/
  public BaseResponse servidorControleAcesso(String servidorControleAcesso) {
    this.servidorControleAcesso = servidorControleAcesso;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Servidor do controle de acesso")
  @JsonProperty("servidorControleAcesso")
  public String getServidorControleAcesso() {
    return servidorControleAcesso;
  }
  public void setServidorControleAcesso(String servidorControleAcesso) {
    this.servidorControleAcesso = servidorControleAcesso;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseResponse baseResponse = (BaseResponse) o;
    return Objects.equals(this.id, baseResponse.id) &&
        Objects.equals(this.servidor, baseResponse.servidor) &&
        Objects.equals(this.usuario, baseResponse.usuario) &&
        Objects.equals(this.senha, baseResponse.senha) &&
        Objects.equals(this.nomeBase, baseResponse.nomeBase) &&
        Objects.equals(this.senhaCriptografada, baseResponse.senhaCriptografada) &&
        Objects.equals(this.domain, baseResponse.domain) &&
        Objects.equals(this.nomeBaseControleAcesso, baseResponse.nomeBaseControleAcesso) &&
        Objects.equals(this.idEmissor, baseResponse.idEmissor) &&
        Objects.equals(this.servidorControleAcesso, baseResponse.servidorControleAcesso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, servidor, usuario, senha, nomeBase, senhaCriptografada, domain, nomeBaseControleAcesso, idEmissor, servidorControleAcesso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    servidor: ").append(toIndentedString(servidor)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
    sb.append("    nomeBase: ").append(toIndentedString(nomeBase)).append("\n");
    sb.append("    senhaCriptografada: ").append(toIndentedString(senhaCriptografada)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    nomeBaseControleAcesso: ").append(toIndentedString(nomeBaseControleAcesso)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    servidorControleAcesso: ").append(toIndentedString(servidorControleAcesso)).append("\n");
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

