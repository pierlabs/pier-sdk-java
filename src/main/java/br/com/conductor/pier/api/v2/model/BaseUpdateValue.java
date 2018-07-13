package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{base_update_description}}}
 **/

@ApiModel(description = "{{{base_update_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BaseUpdateValue   {
  
  private String servidor = null;
  private String usuario = null;
  private String senha = null;
  private String nomeBase = null;
  private String alteradoPor = null;
  private String domain = null;
  private Boolean senhaCriptografada = null;
  private String nomeBaseControleAcesso = null;
  private Long idEmissor = null;
  private String servidorControleAcesso = null;
  private String nomeBaseUsuarios = null;
  private String servidorUsuarios = null;
  private Boolean flagCluster = null;

  
  /**
   * {{{base_update_servidor_value}}}
   **/
  public BaseUpdateValue servidor(String servidor) {
    this.servidor = servidor;
    return this;
  }
  
  @ApiModelProperty(example = "abc-xyz-99.exemplo.com", required = true, value = "{{{base_update_servidor_value}}}")
  @JsonProperty("servidor")
  public String getServidor() {
    return servidor;
  }
  public void setServidor(String servidor) {
    this.servidor = servidor;
  }

  
  /**
   * {{{base_update_usuario_value}}}
   **/
  public BaseUpdateValue usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "pier", required = true, value = "{{{base_update_usuario_value}}}")
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * {{{base_update_senha_value}}}
   **/
  public BaseUpdateValue senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "abcd1234", required = true, value = "{{{base_update_senha_value}}}")
  @JsonProperty("senha")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * {{{base_update_nome_base_value}}}
   **/
  public BaseUpdateValue nomeBase(String nomeBase) {
    this.nomeBase = nomeBase;
    return this;
  }
  
  @ApiModelProperty(example = "emissor", required = true, value = "{{{base_update_nome_base_value}}}")
  @JsonProperty("nomeBase")
  public String getNomeBase() {
    return nomeBase;
  }
  public void setNomeBase(String nomeBase) {
    this.nomeBase = nomeBase;
  }

  
  /**
   * {{{base_update_alterado_por_value}}}
   **/
  public BaseUpdateValue alteradoPor(String alteradoPor) {
    this.alteradoPor = alteradoPor;
    return this;
  }
  
  @ApiModelProperty(example = "sicrano.detal", required = true, value = "{{{base_update_alterado_por_value}}}")
  @JsonProperty("alteradoPor")
  public String getAlteradoPor() {
    return alteradoPor;
  }
  public void setAlteradoPor(String alteradoPor) {
    this.alteradoPor = alteradoPor;
  }

  
  /**
   * {{{base_update_domain_value}}}
   **/
  public BaseUpdateValue domain(String domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "dominio", value = "{{{base_update_domain_value}}}")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  
  /**
   * {{{base_update_senha_criptografada_value}}}
   **/
  public BaseUpdateValue senhaCriptografada(Boolean senhaCriptografada) {
    this.senhaCriptografada = senhaCriptografada;
    return this;
  }
  
  @ApiModelProperty(example = "true", required = true, value = "{{{base_update_senha_criptografada_value}}}")
  @JsonProperty("senhaCriptografada")
  public Boolean getSenhaCriptografada() {
    return senhaCriptografada;
  }
  public void setSenhaCriptografada(Boolean senhaCriptografada) {
    this.senhaCriptografada = senhaCriptografada;
  }

  
  /**
   * {{{base_update_nome_base_controle_acesso_value}}}
   **/
  public BaseUpdateValue nomeBaseControleAcesso(String nomeBaseControleAcesso) {
    this.nomeBaseControleAcesso = nomeBaseControleAcesso;
    return this;
  }
  
  @ApiModelProperty(example = "AccessControl_Novo_Des", required = true, value = "{{{base_update_nome_base_controle_acesso_value}}}")
  @JsonProperty("nomeBaseControleAcesso")
  public String getNomeBaseControleAcesso() {
    return nomeBaseControleAcesso;
  }
  public void setNomeBaseControleAcesso(String nomeBaseControleAcesso) {
    this.nomeBaseControleAcesso = nomeBaseControleAcesso;
  }

  
  /**
   * {{{base_update_id_emissor_value}}}
   **/
  public BaseUpdateValue idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "99", value = "{{{base_update_id_emissor_value}}}")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * {{{base_update_servidor_controle_acesso_value}}}
   **/
  public BaseUpdateValue servidorControleAcesso(String servidorControleAcesso) {
    this.servidorControleAcesso = servidorControleAcesso;
    return this;
  }
  
  @ApiModelProperty(example = "10.10.10.10", required = true, value = "{{{base_update_servidor_controle_acesso_value}}}")
  @JsonProperty("servidorControleAcesso")
  public String getServidorControleAcesso() {
    return servidorControleAcesso;
  }
  public void setServidorControleAcesso(String servidorControleAcesso) {
    this.servidorControleAcesso = servidorControleAcesso;
  }

  
  /**
   * {{{base_update_nome_base_usuarios_value}}}
   **/
  public BaseUpdateValue nomeBaseUsuarios(String nomeBaseUsuarios) {
    this.nomeBaseUsuarios = nomeBaseUsuarios;
    return this;
  }
  
  @ApiModelProperty(example = "USUARIOS_EMISSOR", required = true, value = "{{{base_update_nome_base_usuarios_value}}}")
  @JsonProperty("nomeBaseUsuarios")
  public String getNomeBaseUsuarios() {
    return nomeBaseUsuarios;
  }
  public void setNomeBaseUsuarios(String nomeBaseUsuarios) {
    this.nomeBaseUsuarios = nomeBaseUsuarios;
  }

  
  /**
   * {{{base_update_servidor_usuarios_value}}}
   **/
  public BaseUpdateValue servidorUsuarios(String servidorUsuarios) {
    this.servidorUsuarios = servidorUsuarios;
    return this;
  }
  
  @ApiModelProperty(example = "10.10.10.10", required = true, value = "{{{base_update_servidor_usuarios_value}}}")
  @JsonProperty("servidorUsuarios")
  public String getServidorUsuarios() {
    return servidorUsuarios;
  }
  public void setServidorUsuarios(String servidorUsuarios) {
    this.servidorUsuarios = servidorUsuarios;
  }

  
  /**
   * {{{base_update_flag_cluster_value}}}
   **/
  public BaseUpdateValue flagCluster(Boolean flagCluster) {
    this.flagCluster = flagCluster;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "{{{base_update_flag_cluster_value}}}")
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
    BaseUpdateValue baseUpdateValue = (BaseUpdateValue) o;
    return Objects.equals(this.servidor, baseUpdateValue.servidor) &&
        Objects.equals(this.usuario, baseUpdateValue.usuario) &&
        Objects.equals(this.senha, baseUpdateValue.senha) &&
        Objects.equals(this.nomeBase, baseUpdateValue.nomeBase) &&
        Objects.equals(this.alteradoPor, baseUpdateValue.alteradoPor) &&
        Objects.equals(this.domain, baseUpdateValue.domain) &&
        Objects.equals(this.senhaCriptografada, baseUpdateValue.senhaCriptografada) &&
        Objects.equals(this.nomeBaseControleAcesso, baseUpdateValue.nomeBaseControleAcesso) &&
        Objects.equals(this.idEmissor, baseUpdateValue.idEmissor) &&
        Objects.equals(this.servidorControleAcesso, baseUpdateValue.servidorControleAcesso) &&
        Objects.equals(this.nomeBaseUsuarios, baseUpdateValue.nomeBaseUsuarios) &&
        Objects.equals(this.servidorUsuarios, baseUpdateValue.servidorUsuarios) &&
        Objects.equals(this.flagCluster, baseUpdateValue.flagCluster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servidor, usuario, senha, nomeBase, alteradoPor, domain, senhaCriptografada, nomeBaseControleAcesso, idEmissor, servidorControleAcesso, nomeBaseUsuarios, servidorUsuarios, flagCluster);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseUpdateValue {\n");
    
    sb.append("    servidor: ").append(toIndentedString(servidor)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
    sb.append("    nomeBase: ").append(toIndentedString(nomeBase)).append("\n");
    sb.append("    alteradoPor: ").append(toIndentedString(alteradoPor)).append("\n");
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



