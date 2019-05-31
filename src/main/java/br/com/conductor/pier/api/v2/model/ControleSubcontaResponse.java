package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o de resposta do recurso de controle de subconta
 **/

@ApiModel(description = "Representa\u00E7\u00E3o de resposta do recurso de controle de subconta")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ControleSubcontaResponse   {
  
  private Long id = null;
  private Long idVinculoConta = null;
  private Long idConta = null;
  private String nome = null;
  private String finalidade = null;
  private Boolean autoGerenciavel = null;

  
  /**
   * C\u00F3digo identificador do controle da subconta (id)
   **/
  public ControleSubcontaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do controle da subconta (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Id referenciando o v\u00EDnculo da subconta na tabela VinculosContas
   **/
  public ControleSubcontaResponse idVinculoConta(Long idVinculoConta) {
    this.idVinculoConta = idVinculoConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id referenciando o v\u00EDnculo da subconta na tabela VinculosContas")
  @JsonProperty("idVinculoConta")
  public Long getIdVinculoConta() {
    return idVinculoConta;
  }
  public void setIdVinculoConta(Long idVinculoConta) {
    this.idVinculoConta = idVinculoConta;
  }

  
  /**
   * C\u00F3digo identificador da subconta (id)
   **/
  public ControleSubcontaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da subconta (id)")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Nome/apelido dado para a subconta
   **/
  public ControleSubcontaResponse nome(String nome) {
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
  public ControleSubcontaResponse finalidade(String finalidade) {
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
  public ControleSubcontaResponse autoGerenciavel(Boolean autoGerenciavel) {
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
    ControleSubcontaResponse controleSubcontaResponse = (ControleSubcontaResponse) o;
    return Objects.equals(this.id, controleSubcontaResponse.id) &&
        Objects.equals(this.idVinculoConta, controleSubcontaResponse.idVinculoConta) &&
        Objects.equals(this.idConta, controleSubcontaResponse.idConta) &&
        Objects.equals(this.nome, controleSubcontaResponse.nome) &&
        Objects.equals(this.finalidade, controleSubcontaResponse.finalidade) &&
        Objects.equals(this.autoGerenciavel, controleSubcontaResponse.autoGerenciavel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idVinculoConta, idConta, nome, finalidade, autoGerenciavel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleSubcontaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idVinculoConta: ").append(toIndentedString(idVinculoConta)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
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

