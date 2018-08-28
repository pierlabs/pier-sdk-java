package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ReferenciaIdPersist;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UsuarioLdapUpdate   {
  
  private String cpf = null;
  private String email = null;
  private Long idEmissor = null;
  private String login = null;
  private String nome = null;
  private List<ReferenciaIdPersist> perfis = new ArrayList<ReferenciaIdPersist>();
  private String status = null;

  
  /**
   **/
  public UsuarioLdapUpdate cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   **/
  public UsuarioLdapUpdate email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  public UsuarioLdapUpdate idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   **/
  public UsuarioLdapUpdate login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   **/
  public UsuarioLdapUpdate nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   **/
  public UsuarioLdapUpdate perfis(List<ReferenciaIdPersist> perfis) {
    this.perfis = perfis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("perfis")
  public List<ReferenciaIdPersist> getPerfis() {
    return perfis;
  }
  public void setPerfis(List<ReferenciaIdPersist> perfis) {
    this.perfis = perfis;
  }

  
  /**
   **/
  public UsuarioLdapUpdate status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
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
    UsuarioLdapUpdate usuarioLdapUpdate = (UsuarioLdapUpdate) o;
    return Objects.equals(this.cpf, usuarioLdapUpdate.cpf) &&
        Objects.equals(this.email, usuarioLdapUpdate.email) &&
        Objects.equals(this.idEmissor, usuarioLdapUpdate.idEmissor) &&
        Objects.equals(this.login, usuarioLdapUpdate.login) &&
        Objects.equals(this.nome, usuarioLdapUpdate.nome) &&
        Objects.equals(this.perfis, usuarioLdapUpdate.perfis) &&
        Objects.equals(this.status, usuarioLdapUpdate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, email, idEmissor, login, nome, perfis, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioLdapUpdate {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    perfis: ").append(toIndentedString(perfis)).append("\n");
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

