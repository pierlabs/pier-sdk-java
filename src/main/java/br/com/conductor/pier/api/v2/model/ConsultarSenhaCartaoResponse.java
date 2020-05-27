package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa o objeto de resposta da consulta da senha do cart\u00E3o
 **/

@ApiModel(description = "Representa o objeto de resposta da consulta da senha do cart\u00E3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConsultarSenhaCartaoResponse   {
  
  private String senha = null;

  
  /**
   * Senha
   **/
  public ConsultarSenhaCartaoResponse senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Senha")
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
    ConsultarSenhaCartaoResponse consultarSenhaCartaoResponse = (ConsultarSenhaCartaoResponse) o;
    return Objects.equals(this.senha, consultarSenhaCartaoResponse.senha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(senha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarSenhaCartaoResponse {\n");
    
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

