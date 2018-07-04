package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{produto_detalhes_response_description}}}
 **/

@ApiModel(description = "{{{produto_detalhes_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ProdutoDetalhesResponse   {
  
  private Long id = null;
  private String nome = null;
  private Integer status = null;
  private Long idFantasiaBasica = null;
  private String fantasiaBasica = null;
  private Boolean usoExterior = null;

  
  /**
   * {{{produto_response_id_value}}}
   **/
  public ProdutoDetalhesResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{produto_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{produto_response_nome_value}}}
   **/
  public ProdutoDetalhesResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{produto_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{produto_response_status_value}}}
   **/
  public ProdutoDetalhesResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{produto_response_status_value}}}")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {{{produto_response_id_fantasia_basica_value}}}
   **/
  public ProdutoDetalhesResponse idFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{produto_response_id_fantasia_basica_value}}}")
  @JsonProperty("idFantasiaBasica")
  public Long getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  
  /**
   * {{{produto_detalhes_response_fantasia_basica_value}}}
   **/
  public ProdutoDetalhesResponse fantasiaBasica(String fantasiaBasica) {
    this.fantasiaBasica = fantasiaBasica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{produto_detalhes_response_fantasia_basica_value}}}")
  @JsonProperty("fantasiaBasica")
  public String getFantasiaBasica() {
    return fantasiaBasica;
  }
  public void setFantasiaBasica(String fantasiaBasica) {
    this.fantasiaBasica = fantasiaBasica;
  }

  
  /**
   * {{{produto_detalhes_response_uso_exterior_value}}}
   **/
  public ProdutoDetalhesResponse usoExterior(Boolean usoExterior) {
    this.usoExterior = usoExterior;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{produto_detalhes_response_uso_exterior_value}}}")
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



