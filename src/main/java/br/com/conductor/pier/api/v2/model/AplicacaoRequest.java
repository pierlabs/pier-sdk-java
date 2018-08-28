package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{aplicacao_request_description}}}
 **/

@ApiModel(description = "{{{aplicacao_request_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AplicacaoRequest   {
  
  private String nome = null;
  private Long tokenId = null;
  private List<String> sort = new ArrayList<String>();

  
  /**
   * {{{aplicacao_dto_nome_value}}}
   **/
  public AplicacaoRequest nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "Nome da aplicação", value = "{{{aplicacao_dto_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{aplicacao_dto_token_value}}}
   **/
  public AplicacaoRequest tokenId(Long tokenId) {
    this.tokenId = tokenId;
    return this;
  }
  
  @ApiModelProperty(example = "1", value = "{{{aplicacao_dto_token_value}}}")
  @JsonProperty("tokenId")
  public Long getTokenId() {
    return tokenId;
  }
  public void setTokenId(Long tokenId) {
    this.tokenId = tokenId;
  }

  
  /**
   * {{{global_menssagem_sort_sort}}}
   **/
  public AplicacaoRequest sort(List<String> sort) {
    this.sort = sort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{global_menssagem_sort_sort}}}")
  @JsonProperty("sort")
  public List<String> getSort() {
    return sort;
  }
  public void setSort(List<String> sort) {
    this.sort = sort;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AplicacaoRequest aplicacaoRequest = (AplicacaoRequest) o;
    return Objects.equals(this.nome, aplicacaoRequest.nome) &&
        Objects.equals(this.tokenId, aplicacaoRequest.tokenId) &&
        Objects.equals(this.sort, aplicacaoRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, tokenId, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoRequest {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

