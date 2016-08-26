package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import br.com.conductor.pier.api.v1_1.model.Pessoa;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * Lista de Pessoas
 **/

@ApiModel(description = "Lista de Pessoas")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ListaDePessoas   {
  
  private List<Pessoa> pessoas = new ArrayList<Pessoa>();

  
  /**
   * Lista de pessoas
   **/
  public ListaDePessoas pessoas(List<Pessoa> pessoas) {
    this.pessoas = pessoas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de pessoas")
  @JsonProperty("pessoas")
  public List<Pessoa> getPessoas() {
    return pessoas;
  }
  public void setPessoas(List<Pessoa> pessoas) {
    this.pessoas = pessoas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListaDePessoas listaDePessoas = (ListaDePessoas) o;
    return Objects.equals(this.pessoas, listaDePessoas.pessoas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pessoas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaDePessoas {\n");
    
    sb.append("    pessoas: ").append(toIndentedString(pessoas)).append("\n");
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



