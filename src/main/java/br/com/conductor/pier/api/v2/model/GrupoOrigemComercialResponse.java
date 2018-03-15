package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de resposta do grupo de origem comercial
 **/

@ApiModel(description = "Objeto de resposta do grupo de origem comercial")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GrupoOrigemComercialResponse   {
  
  private Long id = null;
  private String nome = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do grupo de origem comercial.
   **/
  public GrupoOrigemComercialResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do grupo de origem comercial.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do grupo da origem comercial
   **/
  public GrupoOrigemComercialResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do grupo da origem comercial")
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
    GrupoOrigemComercialResponse grupoOrigemComercialResponse = (GrupoOrigemComercialResponse) o;
    return Objects.equals(this.id, grupoOrigemComercialResponse.id) &&
        Objects.equals(this.nome, grupoOrigemComercialResponse.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoOrigemComercialResponse {\n");
    
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

