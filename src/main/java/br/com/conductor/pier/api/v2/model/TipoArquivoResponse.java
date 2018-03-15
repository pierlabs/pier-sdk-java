package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Response do tipo arquivo.
 **/

@ApiModel(description = "Objeto Response do tipo arquivo.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoArquivoResponse   {
  
  private Long id = null;
  private String nome = null;
  private String descricao = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo arquivo
   **/
  public TipoArquivoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo arquivo")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do tipo do arquivo
   **/
  public TipoArquivoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do tipo do arquivo")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo do arquivo
   **/
  public TipoArquivoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do tipo do arquivo")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoArquivoResponse tipoArquivoResponse = (TipoArquivoResponse) o;
    return Objects.equals(this.id, tipoArquivoResponse.id) &&
        Objects.equals(this.nome, tipoArquivoResponse.nome) &&
        Objects.equals(this.descricao, tipoArquivoResponse.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoArquivoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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

