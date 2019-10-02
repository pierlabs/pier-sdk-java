package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class FantasiaBasicaPersist   {
  
  private String descricao = null;
  private String descricaoArquivo = null;
  private String nome = null;
  private Integer quantidadeMaxProposta = null;

  
  /**
   **/
  public FantasiaBasicaPersist descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   **/
  public FantasiaBasicaPersist descricaoArquivo(String descricaoArquivo) {
    this.descricaoArquivo = descricaoArquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("descricaoArquivo")
  public String getDescricaoArquivo() {
    return descricaoArquivo;
  }
  public void setDescricaoArquivo(String descricaoArquivo) {
    this.descricaoArquivo = descricaoArquivo;
  }

  
  /**
   **/
  public FantasiaBasicaPersist nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   **/
  public FantasiaBasicaPersist quantidadeMaxProposta(Integer quantidadeMaxProposta) {
    this.quantidadeMaxProposta = quantidadeMaxProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quantidadeMaxProposta")
  public Integer getQuantidadeMaxProposta() {
    return quantidadeMaxProposta;
  }
  public void setQuantidadeMaxProposta(Integer quantidadeMaxProposta) {
    this.quantidadeMaxProposta = quantidadeMaxProposta;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FantasiaBasicaPersist fantasiaBasicaPersist = (FantasiaBasicaPersist) o;
    return Objects.equals(this.descricao, fantasiaBasicaPersist.descricao) &&
        Objects.equals(this.descricaoArquivo, fantasiaBasicaPersist.descricaoArquivo) &&
        Objects.equals(this.nome, fantasiaBasicaPersist.nome) &&
        Objects.equals(this.quantidadeMaxProposta, fantasiaBasicaPersist.quantidadeMaxProposta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao, descricaoArquivo, nome, quantidadeMaxProposta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FantasiaBasicaPersist {\n");
    
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    descricaoArquivo: ").append(toIndentedString(descricaoArquivo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    quantidadeMaxProposta: ").append(toIndentedString(quantidadeMaxProposta)).append("\n");
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

