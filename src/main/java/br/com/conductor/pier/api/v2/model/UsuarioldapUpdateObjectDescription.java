package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ReferenciaIdPersist;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * {{{usuarioldap_update_object_description}}}
 **/

@ApiModel(description = "{{{usuarioldap_update_object_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UsuarioldapUpdateObjectDescription   {
  
  private String nome = null;
  private String login = null;
  private String cpf = null;
  private String email = null;
  private List<ReferenciaIdPersist> perfis = new ArrayList<ReferenciaIdPersist>();
  private String status = null;

  
  /**
   * {{{usuario_update_nome_value}}}
   **/
  public UsuarioldapUpdateObjectDescription nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_update_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{usuario_update_login_value}}}
   **/
  public UsuarioldapUpdateObjectDescription login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_update_login_value}}}")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * {{{usuario_update_cpf_value}}}
   **/
  public UsuarioldapUpdateObjectDescription cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_update_cpf_value}}}")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{usuario_update_email_value}}}
   **/
  public UsuarioldapUpdateObjectDescription email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_update_email_value}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{usuario_persist_email_value}}}
   **/
  public UsuarioldapUpdateObjectDescription perfis(List<ReferenciaIdPersist> perfis) {
    this.perfis = perfis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_persist_email_value}}}")
  @JsonProperty("perfis")
  public List<ReferenciaIdPersist> getPerfis() {
    return perfis;
  }
  public void setPerfis(List<ReferenciaIdPersist> perfis) {
    this.perfis = perfis;
  }

  
  /**
   * {{{usuario_update_status_value}}}
   **/
  public UsuarioldapUpdateObjectDescription status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_update_status_value}}}")
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
    UsuarioldapUpdateObjectDescription usuarioldapUpdateObjectDescription = (UsuarioldapUpdateObjectDescription) o;
    return Objects.equals(this.nome, usuarioldapUpdateObjectDescription.nome) &&
        Objects.equals(this.login, usuarioldapUpdateObjectDescription.login) &&
        Objects.equals(this.cpf, usuarioldapUpdateObjectDescription.cpf) &&
        Objects.equals(this.email, usuarioldapUpdateObjectDescription.email) &&
        Objects.equals(this.perfis, usuarioldapUpdateObjectDescription.perfis) &&
        Objects.equals(this.status, usuarioldapUpdateObjectDescription.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, login, cpf, email, perfis, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioldapUpdateObjectDescription {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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



