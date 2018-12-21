package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{usuario_token_resposta_descricao}}}
 **/

@ApiModel(description = "{{{usuario_token_resposta_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class UsuarioTokenResponse   {
  
  private Boolean ativo = null;
  private String cpf = null;
  private String dataInclusao = null;
  private String dataNascimento = null;
  private String ddd = null;
  private String email = null;
  private String telefone = null;
  private String token = null;
  private String validade = null;

  
  /**
   * {{{usuario_token_resposta_ativo_descricao}}}
   **/
  public UsuarioTokenResponse ativo(Boolean ativo) {
    this.ativo = ativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{usuario_token_resposta_ativo_descricao}}}")
  @JsonProperty("ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * {{{usuario_token_resposta_cpf_descricao}}}
   **/
  public UsuarioTokenResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_token_resposta_cpf_descricao}}}")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{usuario_token_resposta_data_inclusao_descricao}}}
   **/
  public UsuarioTokenResponse dataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_token_resposta_data_inclusao_descricao}}}")
  @JsonProperty("dataInclusao")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * {{{usuario_token_resposta_data_nascimento_descricao}}}
   **/
  public UsuarioTokenResponse dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_token_resposta_data_nascimento_descricao}}}")
  @JsonProperty("dataNascimento")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * {{{usuario_token_resposta_ddd_descricao}}}
   **/
  public UsuarioTokenResponse ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_token_resposta_ddd_descricao}}}")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{usuario_token_resposta_email_descricao}}}
   **/
  public UsuarioTokenResponse email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_token_resposta_email_descricao}}}")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{usuario_token_resposta_telefone_descricao}}}
   **/
  public UsuarioTokenResponse telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_token_resposta_telefone_descricao}}}")
  @JsonProperty("telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{usuario_token_resposta_token_descricao}}}
   **/
  public UsuarioTokenResponse token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_token_resposta_token_descricao}}}")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * {{{usuario_token_resposta_validade_descricao}}}
   **/
  public UsuarioTokenResponse validade(String validade) {
    this.validade = validade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{usuario_token_resposta_validade_descricao}}}")
  @JsonProperty("validade")
  public String getValidade() {
    return validade;
  }
  public void setValidade(String validade) {
    this.validade = validade;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsuarioTokenResponse usuarioTokenResponse = (UsuarioTokenResponse) o;
    return Objects.equals(this.ativo, usuarioTokenResponse.ativo) &&
        Objects.equals(this.cpf, usuarioTokenResponse.cpf) &&
        Objects.equals(this.dataInclusao, usuarioTokenResponse.dataInclusao) &&
        Objects.equals(this.dataNascimento, usuarioTokenResponse.dataNascimento) &&
        Objects.equals(this.ddd, usuarioTokenResponse.ddd) &&
        Objects.equals(this.email, usuarioTokenResponse.email) &&
        Objects.equals(this.telefone, usuarioTokenResponse.telefone) &&
        Objects.equals(this.token, usuarioTokenResponse.token) &&
        Objects.equals(this.validade, usuarioTokenResponse.validade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ativo, cpf, dataInclusao, dataNascimento, ddd, email, telefone, token, validade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioTokenResponse {\n");
    
    sb.append("    ativo: ").append(toIndentedString(ativo)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    dataInclusao: ").append(toIndentedString(dataInclusao)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    validade: ").append(toIndentedString(validade)).append("\n");
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

