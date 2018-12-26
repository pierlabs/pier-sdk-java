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
  private String dataValidade = null;
  private Long idPlataforma = null;

  
  /**
   * Apresenta o nome do usu\u00E1rio
   **/
  public UsuarioPersist nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome do usu\u00E1rio")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Apresenta o login do usu\u00E1rio
   **/
  public UsuarioPersist login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o login do usu\u00E1rio")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * Cpf do usu\u00E1rio
   **/
  public UsuarioPersist cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cpf do usu\u00E1rio")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Apresenta o email do usu\u00E1rio
   **/
  public UsuarioPersist email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta o email do usu\u00E1rio")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Apresenta a senha do usu\u00E1rio
   **/
  public UsuarioPersist senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Apresenta a senha do usu\u00E1rio")
  @JsonProperty("senha")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * Data de Validade
   **/
  public UsuarioPersist dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "Data de Validade")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * C\u00F3d. de identifica\u00E7a\u00F5 da plataforma
   **/
  public UsuarioPersist idPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3d. de identifica\u00E7a\u00F5 da plataforma")
  @JsonProperty("idPlataforma")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
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
        Objects.equals(this.senha, usuarioPersist.senha) &&
        Objects.equals(this.dataValidade, usuarioPersist.dataValidade) &&
        Objects.equals(this.idPlataforma, usuarioPersist.idPlataforma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, login, cpf, email, senha, dataValidade, idPlataforma);
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
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    idPlataforma: ").append(toIndentedString(idPlataforma)).append("\n");
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

