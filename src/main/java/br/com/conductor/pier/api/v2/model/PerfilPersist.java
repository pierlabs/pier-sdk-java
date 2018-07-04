package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ReferenciaIdPersist;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





/**
 * {{{perfil_persist_object_description}}}
 **/

@ApiModel(description = "{{{perfil_persist_object_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PerfilPersist   {
  
  private String nome = null;
  private List<ReferenciaIdPersist> permissoes = new ArrayList<ReferenciaIdPersist>();

  
  /**
   * {{{perfil_persist_nome_value}}}
   **/
  public PerfilPersist nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{perfil_persist_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{perfil_persist_permissoes_value}}}
   **/
  public PerfilPersist permissoes(List<ReferenciaIdPersist> permissoes) {
    this.permissoes = permissoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{perfil_persist_permissoes_value}}}")
  @JsonProperty("permissoes")
  public List<ReferenciaIdPersist> getPermissoes() {
    return permissoes;
  }
  public void setPermissoes(List<ReferenciaIdPersist> permissoes) {
    this.permissoes = permissoes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerfilPersist perfilPersist = (PerfilPersist) o;
    return Objects.equals(this.nome, perfilPersist.nome) &&
        Objects.equals(this.permissoes, perfilPersist.permissoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, permissoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerfilPersist {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    permissoes: ").append(toIndentedString(permissoes)).append("\n");
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



