package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{base_response_description}}}
 **/

@ApiModel(description = "{{{base_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BaseResponse   {
  
  private Long id = null;
  private String servidor = null;
  private String usuario = null;
  private String nomeBase = null;
  private String domain = null;
  private Boolean senhaCriptografada = null;
  private String nomeBaseControleAcesso = null;
  private Long idEmissor = null;
  private String servidorControleAcesso = null;
  private String nomeBaseUsuarios = null;
  private String servidorUsuarios = null;
  private Boolean flagCluster = null;

  
  /**
   * {{{base_dto_id_value}}}
   **/
  public BaseResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "{{{base_dto_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{base_dto_servidor_value}}}
   **/
  public BaseResponse servidor(String servidor) {
    this.servidor = servidor;
    return this;
  }
  
  @ApiModelProperty(example = "abc-xyz-99.exemplo.com", value = "{{{base_dto_servidor_value}}}")
  @JsonProperty("servidor")
  public String getServidor() {
    return servidor;
  }
  public void setServidor(String servidor) {
    this.servidor = servidor;
  }

  
  /**
   * {{{base_dto_usuario_value}}}
   **/
  public BaseResponse usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "pier", value = "{{{base_dto_usuario_value}}}")
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * {{{base_dto_nome_base_value}}}
   **/
  public BaseResponse nomeBase(String nomeBase) {
    this.nomeBase = nomeBase;
    return this;
  }
  
  @ApiModelProperty(example = "emissor", value = "{{{base_dto_nome_base_value}}}")
  @JsonProperty("nomeBase")
  public String getNomeBase() {
    return nomeBase;
  }
  public void setNomeBase(String nomeBase) {
    this.nomeBase = nomeBase;
  }

  
  /**
   * {{{base_dto_domain_value}}}
   **/
  public BaseResponse domain(String domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "dominio", value = "{{{base_dto_domain_value}}}")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  
  /**
   * {{{base_dto_senha_criptografada_value}}}
   **/
  public BaseResponse senhaCriptografada(Boolean senhaCriptografada) {
    this.senhaCriptografada = senhaCriptografada;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "{{{base_dto_senha_criptografada_value}}}")
  @JsonProperty("senhaCriptografada")
  public Boolean getSenhaCriptografada() {
    return senhaCriptografada;
  }
  public void setSenhaCriptografada(Boolean senhaCriptografada) {
    this.senhaCriptografada = senhaCriptografada;
  }

  
  /**
   * {{{base_dto_nome_base_controle_acesso_value}}}
   **/
  public BaseResponse nomeBaseControleAcesso(String nomeBaseControleAcesso) {
    this.nomeBaseControleAcesso = nomeBaseControleAcesso;
    return this;
  }
  
  @ApiModelProperty(example = "AccessControl_Novo_Des", value = "{{{base_dto_nome_base_controle_acesso_value}}}")
  @JsonProperty("nomeBaseControleAcesso")
  public String getNomeBaseControleAcesso() {
    return nomeBaseControleAcesso;
  }
  public void setNomeBaseControleAcesso(String nomeBaseControleAcesso) {
    this.nomeBaseControleAcesso = nomeBaseControleAcesso;
  }

  
  /**
   * {{{base_dto_id_emissor_value}}}
   **/
  public BaseResponse idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "99", value = "{{{base_dto_id_emissor_value}}}")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * {{{base_dto_servidor_controle_acesso_value}}}
   **/
  public BaseResponse servidorControleAcesso(String servidorControleAcesso) {
    this.servidorControleAcesso = servidorControleAcesso;
    return this;
  }
  
  @ApiModelProperty(example = "10.10.10.10", value = "{{{base_dto_servidor_controle_acesso_value}}}")
  @JsonProperty("servidorControleAcesso")
  public String getServidorControleAcesso() {
    return servidorControleAcesso;
  }
  public void setServidorControleAcesso(String servidorControleAcesso) {
    this.servidorControleAcesso = servidorControleAcesso;
  }

  
  /**
   * {{{base_dto_nome_base_usuarios_value}}}
   **/
  public BaseResponse nomeBaseUsuarios(String nomeBaseUsuarios) {
    this.nomeBaseUsuarios = nomeBaseUsuarios;
    return this;
  }
  
  @ApiModelProperty(example = "USUARIOS_EMISSOR", value = "{{{base_dto_nome_base_usuarios_value}}}")
  @JsonProperty("nomeBaseUsuarios")
  public String getNomeBaseUsuarios() {
    return nomeBaseUsuarios;
  }
  public void setNomeBaseUsuarios(String nomeBaseUsuarios) {
    this.nomeBaseUsuarios = nomeBaseUsuarios;
  }

  
  /**
   * {{{base_dto_servidor_usuarios_value}}}
   **/
  public BaseResponse servidorUsuarios(String servidorUsuarios) {
    this.servidorUsuarios = servidorUsuarios;
    return this;
  }
  
  @ApiModelProperty(example = "10.10.10.10", value = "{{{base_dto_servidor_usuarios_value}}}")
  @JsonProperty("servidorUsuarios")
  public String getServidorUsuarios() {
    return servidorUsuarios;
  }
  public void setServidorUsuarios(String servidorUsuarios) {
    this.servidorUsuarios = servidorUsuarios;
  }

  
  /**
   * {{{base_dto_flag_cluster_value}}}
   **/
  public BaseResponse flagCluster(Boolean flagCluster) {
    this.flagCluster = flagCluster;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{base_dto_flag_cluster_value}}}")
  @JsonProperty("flagCluster")
  public Boolean getFlagCluster() {
    return flagCluster;
  }
  public void setFlagCluster(Boolean flagCluster) {
    this.flagCluster = flagCluster;
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
        Objects.equals(this.nomeBase, baseResponse.nomeBase) &&
        Objects.equals(this.domain, baseResponse.domain) &&
        Objects.equals(this.senhaCriptografada, baseResponse.senhaCriptografada) &&
        Objects.equals(this.nomeBaseControleAcesso, baseResponse.nomeBaseControleAcesso) &&
        Objects.equals(this.idEmissor, baseResponse.idEmissor) &&
        Objects.equals(this.servidorControleAcesso, baseResponse.servidorControleAcesso) &&
        Objects.equals(this.nomeBaseUsuarios, baseResponse.nomeBaseUsuarios) &&
        Objects.equals(this.servidorUsuarios, baseResponse.servidorUsuarios) &&
        Objects.equals(this.flagCluster, baseResponse.flagCluster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, servidor, usuario, nomeBase, domain, senhaCriptografada, nomeBaseControleAcesso, idEmissor, servidorControleAcesso, nomeBaseUsuarios, servidorUsuarios, flagCluster);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    servidor: ").append(toIndentedString(servidor)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    nomeBase: ").append(toIndentedString(nomeBase)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    senhaCriptografada: ").append(toIndentedString(senhaCriptografada)).append("\n");
    sb.append("    nomeBaseControleAcesso: ").append(toIndentedString(nomeBaseControleAcesso)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    servidorControleAcesso: ").append(toIndentedString(servidorControleAcesso)).append("\n");
    sb.append("    nomeBaseUsuarios: ").append(toIndentedString(nomeBaseUsuarios)).append("\n");
    sb.append("    servidorUsuarios: ").append(toIndentedString(servidorUsuarios)).append("\n");
    sb.append("    flagCluster: ").append(toIndentedString(flagCluster)).append("\n");
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



