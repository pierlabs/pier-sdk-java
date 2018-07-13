package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ReferenciaIdPersist;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * {{{usuario_persist_object_description}}}
 **/

@ApiModel(description = "{{{usuario_persist_object_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UsuarioLdapPersist   {
  
  private String nome = null;
  private String login = null;
  private String cpf = null;
  private String email = null;
  private List<ReferenciaIdPersist> perfis = new ArrayList<ReferenciaIdPersist>();

  
  /**
   * {{{usuario_persist_nome_value}}}
   **/
  public UsuarioLdapPersist nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_persist_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{usuario_persist_login_value}}}
   **/
  public UsuarioLdapPersist login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_persist_login_value}}}")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * {{{usuario_persist_cpf_value}}}
   **/
  public UsuarioLdapPersist cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_persist_cpf_value}}}")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{usuario_persist_email_value}}}
   **/
  public UsuarioLdapPersist email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_persist_email_value}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{usuario_persist_perfis_value}}}
   **/
  public UsuarioLdapPersist perfis(List<ReferenciaIdPersist> perfis) {
    this.perfis = perfis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_persist_perfis_value}}}")
  @JsonProperty("perfis")
  public List<ReferenciaIdPersist> getPerfis() {
    return perfis;
  }
  public void setPerfis(List<ReferenciaIdPersist> perfis) {
    this.perfis = perfis;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsuarioLdapPersist usuarioLdapPersist = (UsuarioLdapPersist) o;
    return Objects.equals(this.nome, usuarioLdapPersist.nome) &&
        Objects.equals(this.login, usuarioLdapPersist.login) &&
        Objects.equals(this.cpf, usuarioLdapPersist.cpf) &&
        Objects.equals(this.email, usuarioLdapPersist.email) &&
        Objects.equals(this.perfis, usuarioLdapPersist.perfis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, login, cpf, email, perfis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioLdapPersist {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    perfis: ").append(toIndentedString(perfis)).append("\n");
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



