package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o do recurso Usuario Conta
 **/

@ApiModel(description = "Representa\u00E7\u00E3o do recurso Usuario Conta")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UsuarioContasResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Long idPessoa = null;
  private Long idUsuario = null;
  private Integer nivelAcesso = null;

  
  /**
   * Id do usu\u00E1rio conta
   **/
  public UsuarioContasResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do usu\u00E1rio conta")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Id da conta vinculada ao usu\u00E1rio
   **/
  public UsuarioContasResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id da conta vinculada ao usu\u00E1rio")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Id da pessoa
   **/
  public UsuarioContasResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id da pessoa")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Id do usu\u00E1rio vinculado a conta
   **/
  public UsuarioContasResponse idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do usu\u00E1rio vinculado a conta")
  @JsonProperty("idUsuario")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * N\u00EDvel de ACesso
   **/
  public UsuarioContasResponse nivelAcesso(Integer nivelAcesso) {
    this.nivelAcesso = nivelAcesso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00EDvel de ACesso")
  @JsonProperty("nivelAcesso")
  public Integer getNivelAcesso() {
    return nivelAcesso;
  }
  public void setNivelAcesso(Integer nivelAcesso) {
    this.nivelAcesso = nivelAcesso;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsuarioContasResponse usuarioContasResponse = (UsuarioContasResponse) o;
    return Objects.equals(this.id, usuarioContasResponse.id) &&
        Objects.equals(this.idConta, usuarioContasResponse.idConta) &&
        Objects.equals(this.idPessoa, usuarioContasResponse.idPessoa) &&
        Objects.equals(this.idUsuario, usuarioContasResponse.idUsuario) &&
        Objects.equals(this.nivelAcesso, usuarioContasResponse.nivelAcesso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, idPessoa, idUsuario, nivelAcesso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioContasResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    nivelAcesso: ").append(toIndentedString(nivelAcesso)).append("\n");
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

