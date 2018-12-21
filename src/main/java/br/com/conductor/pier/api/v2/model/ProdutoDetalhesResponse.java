package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * ProductDetails
 **/

@ApiModel(description = "ProductDetails")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ProdutoDetalhesResponse   {
  
  private Long id = null;
  private String nome = null;
  private Integer status = null;
  private Long idFantasiaBasica = null;
  private String fantasiaBasica = null;
  private Boolean usoExterior = null;

  
  /**
   * Identification Code of the Product (id)
   **/
  public ProdutoDetalhesResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identification Code of the Product (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Name description of the product
   **/
  public ProdutoDetalhesResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name description of the product")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Represent the status of the product, where: ('0': Inactive), ('1': Active
   **/
  public ProdutoDetalhesResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Represent the status of the product, where: ('0': Inactive), ('1': Active")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Identification Code of the Basic Fantasy (id) which the product belongs
   **/
  public ProdutoDetalhesResponse idFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Basic Fantasy (id) which the product belongs")
  @JsonProperty("idFantasiaBasica")
  public Long getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  
  /**
   * Description of the Basic Fantasy which the product belongs
   **/
  public ProdutoDetalhesResponse fantasiaBasica(String fantasiaBasica) {
    this.fantasiaBasica = fantasiaBasica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the Basic Fantasy which the product belongs")
  @JsonProperty("fantasiaBasica")
  public String getFantasiaBasica() {
    return fantasiaBasica;
  }
  public void setFantasiaBasica(String fantasiaBasica) {
    this.fantasiaBasica = fantasiaBasica;
  }

  
  /**
   * Parameter that indicates if the product is enabled to shops abroad
   **/
  public ProdutoDetalhesResponse usoExterior(Boolean usoExterior) {
    this.usoExterior = usoExterior;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Parameter that indicates if the product is enabled to shops abroad")
  @JsonProperty("usoExterior")
  public Boolean getUsoExterior() {
    return usoExterior;
  }
  public void setUsoExterior(Boolean usoExterior) {
    this.usoExterior = usoExterior;
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
        Objects.equals(this.fantasiaBasica, produtoDetalhesResponse.fantasiaBasica) &&
        Objects.equals(this.usoExterior, produtoDetalhesResponse.usoExterior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, status, idFantasiaBasica, fantasiaBasica, usoExterior);
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
    sb.append("    usoExterior: ").append(toIndentedString(usoExterior)).append("\n");
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

