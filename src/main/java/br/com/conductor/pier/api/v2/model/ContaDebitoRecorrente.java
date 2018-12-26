package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contas D\u00E9bitos Recorrentes
 **/

@ApiModel(description = "Contas D\u00E9bitos Recorrentes")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaDebitoRecorrente   {
  
  private Long idConta = null;
  private Long idTipoDebitoRecorrente = null;
  private Long idUsuario = null;
  private String login = null;
  private Integer numeroParcelas = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   **/
  public ContaDebitoRecorrente idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da conta (id)")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id)
   **/
  public ContaDebitoRecorrente idTipoDebitoRecorrente(Long idTipoDebitoRecorrente) {
    this.idTipoDebitoRecorrente = idTipoDebitoRecorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id)")
  @JsonProperty("idTipoDebitoRecorrente")
  public Long getIdTipoDebitoRecorrente() {
    return idTipoDebitoRecorrente;
  }
  public void setIdTipoDebitoRecorrente(Long idTipoDebitoRecorrente) {
    this.idTipoDebitoRecorrente = idTipoDebitoRecorrente;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do usu\u00E1rio logado do sistema (id)
   **/
  public ContaDebitoRecorrente idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do usu\u00E1rio logado do sistema (id)")
  @JsonProperty("idUsuario")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * Login logado do sistema
   **/
  public ContaDebitoRecorrente login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Login logado do sistema")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * Quantidade de parcelas para o d\u00E9bito recorrente
   **/
  public ContaDebitoRecorrente numeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de parcelas para o d\u00E9bito recorrente")
  @JsonProperty("numeroParcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaDebitoRecorrente contaDebitoRecorrente = (ContaDebitoRecorrente) o;
    return Objects.equals(this.idConta, contaDebitoRecorrente.idConta) &&
        Objects.equals(this.idTipoDebitoRecorrente, contaDebitoRecorrente.idTipoDebitoRecorrente) &&
        Objects.equals(this.idUsuario, contaDebitoRecorrente.idUsuario) &&
        Objects.equals(this.login, contaDebitoRecorrente.login) &&
        Objects.equals(this.numeroParcelas, contaDebitoRecorrente.numeroParcelas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idTipoDebitoRecorrente, idUsuario, login, numeroParcelas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDebitoRecorrente {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idTipoDebitoRecorrente: ").append(toIndentedString(idTipoDebitoRecorrente)).append("\n");
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    numeroParcelas: ").append(toIndentedString(numeroParcelas)).append("\n");
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

