package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * ControleSubcontaPersist
 **/

@ApiModel(description = "ControleSubcontaPersist")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ControleSubcontaPersist   {
  
  private String nome = null;
  private String finalidade = null;
  private Boolean autoGerenciavel = null;

  
  /**
   * Nome/apelido dado para a subconta
   **/
  public ControleSubcontaPersist nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome/apelido dado para a subconta")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Finalidade da cria\u00E7\u00E3o da subconta
   **/
  public ControleSubcontaPersist finalidade(String finalidade) {
    this.finalidade = finalidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Finalidade da cria\u00E7\u00E3o da subconta")
  @JsonProperty("finalidade")
  public String getFinalidade() {
    return finalidade;
  }
  public void setFinalidade(String finalidade) {
    this.finalidade = finalidade;
  }

  
  /**
   * Indica se a subconta \u00E9 auto gerenci\u00E1vel ou se apenas a conta pai poder\u00E1 gerir
   **/
  public ControleSubcontaPersist autoGerenciavel(Boolean autoGerenciavel) {
    this.autoGerenciavel = autoGerenciavel;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se a subconta \u00E9 auto gerenci\u00E1vel ou se apenas a conta pai poder\u00E1 gerir")
  @JsonProperty("autoGerenciavel")
  public Boolean getAutoGerenciavel() {
    return autoGerenciavel;
  }
  public void setAutoGerenciavel(Boolean autoGerenciavel) {
    this.autoGerenciavel = autoGerenciavel;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControleSubcontaPersist controleSubcontaPersist = (ControleSubcontaPersist) o;
    return Objects.equals(this.nome, controleSubcontaPersist.nome) &&
        Objects.equals(this.finalidade, controleSubcontaPersist.finalidade) &&
        Objects.equals(this.autoGerenciavel, controleSubcontaPersist.autoGerenciavel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, finalidade, autoGerenciavel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleSubcontaPersist {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    finalidade: ").append(toIndentedString(finalidade)).append("\n");
    sb.append("    autoGerenciavel: ").append(toIndentedString(autoGerenciavel)).append("\n");
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

