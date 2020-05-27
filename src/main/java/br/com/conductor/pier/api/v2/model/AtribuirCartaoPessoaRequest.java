package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de requisi\u00E7\u00E3o de atribui\u00E7\u00E3o de um cart\u00E3o a uma conta
 **/

@ApiModel(description = "Objeto de requisi\u00E7\u00E3o de atribui\u00E7\u00E3o de um cart\u00E3o a uma conta")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AtribuirCartaoPessoaRequest   {
  
  private Long idPessoa = null;

  
  /**
   * Identificador da pessoa
   **/
  public AtribuirCartaoPessoaRequest idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da pessoa")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtribuirCartaoPessoaRequest atribuirCartaoPessoaRequest = (AtribuirCartaoPessoaRequest) o;
    return Objects.equals(this.idPessoa, atribuirCartaoPessoaRequest.idPessoa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPessoa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtribuirCartaoPessoaRequest {\n");
    
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
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

