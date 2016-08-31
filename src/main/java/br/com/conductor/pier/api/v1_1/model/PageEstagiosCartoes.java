package br.com.conductor.pier.api.v1_1.model;

import java.util.Objects;
import br.com.conductor.pier.api.v1_1.model.PageImplOfEstagioCartao;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Page de Est\u00C3\u00A1gios Cart\u00C3\u00B5es
 **/

@ApiModel(description = "Page de Est\u00C3\u00A1gios Cart\u00C3\u00B5es")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PageEstagiosCartoes   {
  
  private PageImplOfEstagioCartao estagioCartoes = null;

  
  /**
   **/
  public PageEstagiosCartoes estagioCartoes(PageImplOfEstagioCartao estagioCartoes) {
    this.estagioCartoes = estagioCartoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("estagioCartoes")
  public PageImplOfEstagioCartao getEstagioCartoes() {
    return estagioCartoes;
  }
  public void setEstagioCartoes(PageImplOfEstagioCartao estagioCartoes) {
    this.estagioCartoes = estagioCartoes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageEstagiosCartoes pageEstagiosCartoes = (PageEstagiosCartoes) o;
    return Objects.equals(this.estagioCartoes, pageEstagiosCartoes.estagioCartoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estagioCartoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageEstagiosCartoes {\n");
    
    sb.append("    estagioCartoes: ").append(toIndentedString(estagioCartoes)).append("\n");
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



