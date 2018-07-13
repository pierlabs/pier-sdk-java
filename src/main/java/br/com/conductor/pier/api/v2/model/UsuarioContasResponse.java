package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{usuario_conta_resposta_descricao}}}
 **/

@ApiModel(description = "{{{usuario_conta_resposta_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UsuarioContasResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Long idPessoa = null;
  private Long idUsuario = null;
  private Integer nivelAcesso = null;

  
  /**
   * {{{usuario_conta_resposta_id_descricao}}}
   **/
  public UsuarioContasResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_conta_resposta_id_descricao}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{usuario_conta_resposta_id_conta_descricao}}}
   **/
  public UsuarioContasResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_conta_resposta_id_conta_descricao}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{usuario_conta_resposta_id_pessoa_descricao}}}
   **/
  public UsuarioContasResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_conta_resposta_id_pessoa_descricao}}}")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{usuario_conta_resposta_id_usuario_descricao}}}
   **/
  public UsuarioContasResponse idUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_conta_resposta_id_usuario_descricao}}}")
  @JsonProperty("idUsuario")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * {{{usuario_conta_resposta_nivel_acesso_descricao}}}
   **/
  public UsuarioContasResponse nivelAcesso(Integer nivelAcesso) {
    this.nivelAcesso = nivelAcesso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_conta_resposta_nivel_acesso_descricao}}}")
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



