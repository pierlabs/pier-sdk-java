package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import br.com.conductor.pier.api.v1_1.model.EstagioCartao;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * Lista de Est\u00C3\u00A1gios Cart\u00C3\u00B5es
 **/

@ApiModel(description = "Lista de Est\u00C3\u00A1gios Cart\u00C3\u00B5es")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ListaEstagiosCartoes   {
  
  private List<EstagioCartao> estagiosCartoes = new ArrayList<EstagioCartao>();

  
  /**
   * Lista de est\u00C3\u00A1gios cart\u00C3\u00B5es
   **/
  public ListaEstagiosCartoes estagiosCartoes(List<EstagioCartao> estagiosCartoes) {
    this.estagiosCartoes = estagiosCartoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de est\u00C3\u00A1gios cart\u00C3\u00B5es")
  @JsonProperty("estagiosCartoes")
  public List<EstagioCartao> getEstagiosCartoes() {
    return estagiosCartoes;
  }
  public void setEstagiosCartoes(List<EstagioCartao> estagiosCartoes) {
    this.estagiosCartoes = estagiosCartoes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListaEstagiosCartoes listaEstagiosCartoes = (ListaEstagiosCartoes) o;
    return Objects.equals(this.estagiosCartoes, listaEstagiosCartoes.estagiosCartoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estagiosCartoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaEstagiosCartoes {\n");
    
    sb.append("    estagiosCartoes: ").append(toIndentedString(estagiosCartoes)).append("\n");
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



