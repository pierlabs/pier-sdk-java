package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{usuario_persistencia_descricao}}}
 **/

@ApiModel(description = "{{{usuario_persistencia_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UsuarioPersistencia   {
  
  private String nome = null;
  private String login = null;
  private String cpf = null;
  private String email = null;
  private String senha = null;
  private String dataValidade = null;
  private Long idPlataforma = null;

  
  /**
   * {{{usuario_persistencia_nome_descricao}}}
   **/
  public UsuarioPersistencia nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_persistencia_nome_descricao}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{usuario_persistencia_login_descricao}}}
   **/
  public UsuarioPersistencia login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{usuario_persistencia_login_descricao}}}")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * {{{usuario_persistencia_cpf_descricao}}}
   **/
  public UsuarioPersistencia cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_persistencia_cpf_descricao}}}")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{usuario_persistencia_email_descricao}}}
   **/
  public UsuarioPersistencia email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{usuario_persistencia_email_descricao}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{usuario_persistencia_senha_descricao}}}
   **/
  public UsuarioPersistencia senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{usuario_persistencia_senha_descricao}}}")
  @JsonProperty("senha")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * {{{usuario_persistencia_data_validade_descricao}}}
   **/
  public UsuarioPersistencia dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd", value = "{{{usuario_persistencia_data_validade_descricao}}}")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{usuario_persistencia_id_plataforma_descricao}}}
   **/
  public UsuarioPersistencia idPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_persistencia_id_plataforma_descricao}}}")
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
    UsuarioPersistencia usuarioPersistencia = (UsuarioPersistencia) o;
    return Objects.equals(this.nome, usuarioPersistencia.nome) &&
        Objects.equals(this.login, usuarioPersistencia.login) &&
        Objects.equals(this.cpf, usuarioPersistencia.cpf) &&
        Objects.equals(this.email, usuarioPersistencia.email) &&
        Objects.equals(this.senha, usuarioPersistencia.senha) &&
        Objects.equals(this.dataValidade, usuarioPersistencia.dataValidade) &&
        Objects.equals(this.idPlataforma, usuarioPersistencia.idPlataforma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, login, cpf, email, senha, dataValidade, idPlataforma);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioPersistencia {\n");
    
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

