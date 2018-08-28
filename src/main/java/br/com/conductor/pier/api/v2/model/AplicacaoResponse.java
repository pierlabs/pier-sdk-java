package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{aplicacao_response_description}}}
 **/

@ApiModel(description = "{{{aplicacao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AplicacaoResponse   {
  
  private Long id = null;
  private String nome = null;
  private Long tokenId = null;

  
  /**
   **/
  public AplicacaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{aplicacao_dto_nome_value}}}
   **/
  public AplicacaoResponse nome(String nome) {
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
  public AplicacaoResponse tokenId(Long tokenId) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AplicacaoResponse aplicacaoResponse = (AplicacaoResponse) o;
    return Objects.equals(this.id, aplicacaoResponse.id) &&
        Objects.equals(this.nome, aplicacaoResponse.nome) &&
        Objects.equals(this.tokenId, aplicacaoResponse.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, tokenId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
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

