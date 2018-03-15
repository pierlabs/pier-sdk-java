package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Produto
 **/

@ApiModel(description = "Produto")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ProdutoResponse   {
  
  private Long id = null;
  private String nome = null;
  private Integer status = null;
  private Long idFantasiaBasica = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Produto (id).
   **/
  public ProdutoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Produto (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do Nome do Produto.
   **/
  public ProdutoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Descri\u00E7\u00E3o do Nome do Produto.")
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
  public ProdutoResponse status(Integer status) {
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
   * C\u00F3digo de Identifica\u00E7\u00E3o da Fantasia B\u00E1sica (id) a qual o produto pertence.
   **/
  public ProdutoResponse idFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Fantasia B\u00E1sica (id) a qual o produto pertence.")
  @JsonProperty("idFantasiaBasica")
  public Long getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProdutoResponse produtoResponse = (ProdutoResponse) o;
    return Objects.equals(this.id, produtoResponse.id) &&
        Objects.equals(this.nome, produtoResponse.nome) &&
        Objects.equals(this.status, produtoResponse.status) &&
        Objects.equals(this.idFantasiaBasica, produtoResponse.idFantasiaBasica);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, status, idFantasiaBasica);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProdutoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    idFantasiaBasica: ").append(toIndentedString(idFantasiaBasica)).append("\n");
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

