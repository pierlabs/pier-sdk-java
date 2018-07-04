package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{usuario_update_description}}}
 **/

@ApiModel(description = "{{{usuario_update_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UsuarioUpdateValue   {
  
  private String nome = null;
  private String login = null;
  private String cpf = null;
  private String email = null;
  private String status = null;
  private Boolean bloquearAcesso = null;

  
  /**
   * {{{usuario_update_nome_value}}}
   **/
  public UsuarioUpdateValue nome(String nome) {
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
  public UsuarioUpdateValue login(String login) {
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
  public UsuarioUpdateValue cpf(String cpf) {
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
  public UsuarioUpdateValue email(String email) {
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
   * {{{usuario_update_status_value}}}
   **/
  public UsuarioUpdateValue status(String status) {
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

  
  /**
   * {{{usuario_update_bloquear_acesso_descricao}}}
   **/
  public UsuarioUpdateValue bloquearAcesso(Boolean bloquearAcesso) {
    this.bloquearAcesso = bloquearAcesso;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{usuario_update_bloquear_acesso_descricao}}}")
  @JsonProperty("bloquearAcesso")
  public Boolean getBloquearAcesso() {
    return bloquearAcesso;
  }
  public void setBloquearAcesso(Boolean bloquearAcesso) {
    this.bloquearAcesso = bloquearAcesso;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsuarioUpdateValue usuarioUpdateValue = (UsuarioUpdateValue) o;
    return Objects.equals(this.nome, usuarioUpdateValue.nome) &&
        Objects.equals(this.login, usuarioUpdateValue.login) &&
        Objects.equals(this.cpf, usuarioUpdateValue.cpf) &&
        Objects.equals(this.email, usuarioUpdateValue.email) &&
        Objects.equals(this.status, usuarioUpdateValue.status) &&
        Objects.equals(this.bloquearAcesso, usuarioUpdateValue.bloquearAcesso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, login, cpf, email, status, bloquearAcesso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioUpdateValue {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bloquearAcesso: ").append(toIndentedString(bloquearAcesso)).append("\n");
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



