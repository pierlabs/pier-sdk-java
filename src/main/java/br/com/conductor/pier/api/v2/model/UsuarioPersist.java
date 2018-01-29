package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Usuario
 **/

@ApiModel(description = "Objeto Usuario")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UsuarioPersist   {
  
  private String nome = null;
  private String login = null;
  private String cpf = null;
  private String email = null;
  private String senha = null;

  
  /**
   * Apresenta o nome do usu\u00C3\u00A1rio.
   **/
  public UsuarioPersist nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome do usu\u00C3\u00A1rio.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Apresenta o login do usu\u00C3\u00A1rio.
   **/
  public UsuarioPersist login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o login do usu\u00C3\u00A1rio.")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * N\u00C3\u00BAmero do CPF.
   **/
  public UsuarioPersist cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero do CPF.")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Apresenta o email do usu\u00C3\u00A1rio.
   **/
  public UsuarioPersist email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o email do usu\u00C3\u00A1rio.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Apresenta a senha do usu\u00C3\u00A1rio.
   **/
  public UsuarioPersist senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a senha do usu\u00C3\u00A1rio.")
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
    UsuarioPersist usuarioPersist = (UsuarioPersist) o;
    return Objects.equals(this.nome, usuarioPersist.nome) &&
        Objects.equals(this.login, usuarioPersist.login) &&
        Objects.equals(this.cpf, usuarioPersist.cpf) &&
        Objects.equals(this.email, usuarioPersist.email) &&
        Objects.equals(this.senha, usuarioPersist.senha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, login, cpf, email, senha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioPersist {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

