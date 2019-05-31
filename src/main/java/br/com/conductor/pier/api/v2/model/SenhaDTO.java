package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa o DTO de senha para usu\u00E1rio
 **/

@ApiModel(description = "Representa o DTO de senha para usu\u00E1rio")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class SenhaDTO   {
  
  private String senha = null;

  
  /**
   * Senha que ser\u00E1 utilizada pelo usu\u00E1rio
   **/
  public SenhaDTO senha(String senha) {
    this.senha = senha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Senha que ser\u00E1 utilizada pelo usu\u00E1rio")
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
    SenhaDTO senhaDTO = (SenhaDTO) o;
    return Objects.equals(this.senha, senhaDTO.senha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(senha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenhaDTO {\n");
    
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

