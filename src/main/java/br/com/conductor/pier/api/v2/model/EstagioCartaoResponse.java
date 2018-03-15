package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o do recurso Est\u00E1gio Cart\u00E3o
 **/

@ApiModel(description = "Representa\u00E7\u00E3o do recurso Est\u00E1gio Cart\u00E3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EstagioCartaoResponse   {
  
  private Long id = null;
  private String nome = null;

  
  /**
   * Id do est\u00E1gio cart\u00E3o
   **/
  public EstagioCartaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id do est\u00E1gio cart\u00E3o")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do est\u00E1gio cart\u00E3o
   **/
  public EstagioCartaoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome do est\u00E1gio cart\u00E3o")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstagioCartaoResponse estagioCartaoResponse = (EstagioCartaoResponse) o;
    return Objects.equals(this.id, estagioCartaoResponse.id) &&
        Objects.equals(this.nome, estagioCartaoResponse.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstagioCartaoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
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

