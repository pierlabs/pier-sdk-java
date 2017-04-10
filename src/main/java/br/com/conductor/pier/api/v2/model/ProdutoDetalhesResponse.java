package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * ProdutoDetalhes
 **/

@ApiModel(description = "ProdutoDetalhes")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ProdutoDetalhesResponse   {
  
  private Long id = null;
  private String nome = null;
  private Integer status = null;
  private Long idFantasiaBasica = null;
  private String fantasiaBasica = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).
   **/
  public ProdutoDetalhesResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do Nome do Produto.
   **/
  public ProdutoDetalhesResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Descri\u00C3\u00A7\u00C3\u00A3o do Nome do Produto.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Representa o Status do Produto, onde: (\"0\": Inativo), (\"1\": Ativo).
   **/
  public ProdutoDetalhesResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Representa o Status do Produto, onde: (\"0\": Inativo), (\"1\": Ativo).")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Fantasia B\u00C3\u00A1sica (id) a qual o produto pertence.
   **/
  public ProdutoDetalhesResponse idFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Fantasia B\u00C3\u00A1sica (id) a qual o produto pertence.")
  @JsonProperty("idFantasiaBasica")
  public Long getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o da Fantasia B\u00C3\u00A1sica a qual o produto pertence.
   **/
  public ProdutoDetalhesResponse fantasiaBasica(String fantasiaBasica) {
    this.fantasiaBasica = fantasiaBasica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o da Fantasia B\u00C3\u00A1sica a qual o produto pertence.")
  @JsonProperty("fantasiaBasica")
  public String getFantasiaBasica() {
    return fantasiaBasica;
  }
  public void setFantasiaBasica(String fantasiaBasica) {
    this.fantasiaBasica = fantasiaBasica;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProdutoDetalhesResponse produtoDetalhesResponse = (ProdutoDetalhesResponse) o;
    return Objects.equals(this.id, produtoDetalhesResponse.id) &&
        Objects.equals(this.nome, produtoDetalhesResponse.nome) &&
        Objects.equals(this.status, produtoDetalhesResponse.status) &&
        Objects.equals(this.idFantasiaBasica, produtoDetalhesResponse.idFantasiaBasica) &&
        Objects.equals(this.fantasiaBasica, produtoDetalhesResponse.fantasiaBasica);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, status, idFantasiaBasica, fantasiaBasica);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProdutoDetalhesResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    idFantasiaBasica: ").append(toIndentedString(idFantasiaBasica)).append("\n");
    sb.append("    fantasiaBasica: ").append(toIndentedString(fantasiaBasica)).append("\n");
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



