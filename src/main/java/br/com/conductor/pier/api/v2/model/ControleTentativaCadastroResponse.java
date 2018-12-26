package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{controle_tentativa_cadastro_resposta_descricao}}}
 **/

@ApiModel(description = "{{{controle_tentativa_cadastro_resposta_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ControleTentativaCadastroResponse   {
  
  private String cpf = null;
  private String login = null;
  private Integer tentativas = null;

  
  /**
   * {{{controle_tentativa_cadastro_resposta_cpf_descricao}}}
   **/
  public ControleTentativaCadastroResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{controle_tentativa_cadastro_resposta_cpf_descricao}}}")
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{controle_tentativa_cadastro_resposta_login_descricao}}}
   **/
  public ControleTentativaCadastroResponse login(String login) {
    this.login = login;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{controle_tentativa_cadastro_resposta_login_descricao}}}")
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * {{{controle_tentativa_cadastro_resposta_tentativas_descricao}}}
   **/
  public ControleTentativaCadastroResponse tentativas(Integer tentativas) {
    this.tentativas = tentativas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{controle_tentativa_cadastro_resposta_tentativas_descricao}}}")
  @JsonProperty("tentativas")
  public Integer getTentativas() {
    return tentativas;
  }
  public void setTentativas(Integer tentativas) {
    this.tentativas = tentativas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControleTentativaCadastroResponse controleTentativaCadastroResponse = (ControleTentativaCadastroResponse) o;
    return Objects.equals(this.cpf, controleTentativaCadastroResponse.cpf) &&
        Objects.equals(this.login, controleTentativaCadastroResponse.login) &&
        Objects.equals(this.tentativas, controleTentativaCadastroResponse.tentativas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, login, tentativas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleTentativaCadastroResponse {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    tentativas: ").append(toIndentedString(tentativas)).append("\n");
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

