package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso Usuario
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso Usuario")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UsuarioResponse   {
  
  private Long id = null;
  private String nome = null;
  private String login = null;
  private Long idEmissor = null;
  private String cpf = null;
  private String email = null;


  public enum StatusEnum {
    INATIVO("INATIVO"),
    ATIVO("ATIVO");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;
  private String dataCriacao = null;
  private String dataModificacao = null;
  private Long tentativasIncorretas = null;

  
  /**
   * Id do Usu\u00C3\u00A1rio
   **/
  public UsuarioResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do Usu\u00C3\u00A1rio")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do Usu\u00C3\u00A1rio
   **/
  public UsuarioResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do Usu\u00C3\u00A1rio")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Login do Usu\u00C3\u00A1rio
   **/
  public UsuarioResponse login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Login do Usu\u00C3\u00A1rio")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * Id do emissor do usu\u00C3\u00A1rio
   **/
  public UsuarioResponse idEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do emissor do usu\u00C3\u00A1rio")
  @JsonProperty("idEmissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * CPF do Usu\u00C3\u00A1rio
   **/
  public UsuarioResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CPF do Usu\u00C3\u00A1rio")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Email do Usu\u00C3\u00A1rio
   **/
  public UsuarioResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Email do Usu\u00C3\u00A1rio")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Status do Usu\u00C3\u00A1rio
   **/
  public UsuarioResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status do Usu\u00C3\u00A1rio")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Data de cria\u00C3\u00A7\u00C3\u00A3o do Usu\u00C3\u00A1rio
   **/
  public UsuarioResponse dataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de cria\u00C3\u00A7\u00C3\u00A3o do Usu\u00C3\u00A1rio")
  @JsonProperty("dataCriacao")
  public String getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  
  /**
   * Data de modifica\u00C3\u00A7\u00C3\u00A3o do Usu\u00C3\u00A1rio
   **/
  public UsuarioResponse dataModificacao(String dataModificacao) {
    this.dataModificacao = dataModificacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de modifica\u00C3\u00A7\u00C3\u00A3o do Usu\u00C3\u00A1rio")
  @JsonProperty("dataModificacao")
  public String getDataModificacao() {
    return dataModificacao;
  }
  public void setDataModificacao(String dataModificacao) {
    this.dataModificacao = dataModificacao;
  }

  
  /**
   * N\u00C3\u00BAmero de tentativas de valida\u00C3\u00A7\u00C3\u00A3o incorretas
   **/
  public UsuarioResponse tentativasIncorretas(Long tentativasIncorretas) {
    this.tentativasIncorretas = tentativasIncorretas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00C3\u00BAmero de tentativas de valida\u00C3\u00A7\u00C3\u00A3o incorretas")
  @JsonProperty("tentativasIncorretas")
  public Long getTentativasIncorretas() {
    return tentativasIncorretas;
  }
  public void setTentativasIncorretas(Long tentativasIncorretas) {
    this.tentativasIncorretas = tentativasIncorretas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsuarioResponse usuarioResponse = (UsuarioResponse) o;
    return Objects.equals(this.id, usuarioResponse.id) &&
        Objects.equals(this.nome, usuarioResponse.nome) &&
        Objects.equals(this.login, usuarioResponse.login) &&
        Objects.equals(this.idEmissor, usuarioResponse.idEmissor) &&
        Objects.equals(this.cpf, usuarioResponse.cpf) &&
        Objects.equals(this.email, usuarioResponse.email) &&
        Objects.equals(this.status, usuarioResponse.status) &&
        Objects.equals(this.dataCriacao, usuarioResponse.dataCriacao) &&
        Objects.equals(this.dataModificacao, usuarioResponse.dataModificacao) &&
        Objects.equals(this.tentativasIncorretas, usuarioResponse.tentativasIncorretas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, login, idEmissor, cpf, email, status, dataCriacao, dataModificacao, tentativasIncorretas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    idEmissor: ").append(toIndentedString(idEmissor)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataCriacao: ").append(toIndentedString(dataCriacao)).append("\n");
    sb.append("    dataModificacao: ").append(toIndentedString(dataModificacao)).append("\n");
    sb.append("    tentativasIncorretas: ").append(toIndentedString(tentativasIncorretas)).append("\n");
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

