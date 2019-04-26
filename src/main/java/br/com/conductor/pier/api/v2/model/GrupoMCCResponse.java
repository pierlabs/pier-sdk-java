package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de Resposta para o Grupo MCC
 **/

@ApiModel(description = "Objeto de Resposta para o Grupo MCC")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class GrupoMCCResponse   {
  
  private Long id = null;
  private String descricao = null;
  private String descricaoExtrato = null;

  
  /**
   * id
   **/
  public GrupoMCCResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * descricao
   **/
  public GrupoMCCResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "descricao")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * descricaoExtrato
   **/
  public GrupoMCCResponse descricaoExtrato(String descricaoExtrato) {
    this.descricaoExtrato = descricaoExtrato;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "descricaoExtrato")
  @JsonProperty("descricaoExtrato")
  public String getDescricaoExtrato() {
    return descricaoExtrato;
  }
  public void setDescricaoExtrato(String descricaoExtrato) {
    this.descricaoExtrato = descricaoExtrato;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrupoMCCResponse grupoMCCResponse = (GrupoMCCResponse) o;
    return Objects.equals(this.id, grupoMCCResponse.id) &&
        Objects.equals(this.descricao, grupoMCCResponse.descricao) &&
        Objects.equals(this.descricaoExtrato, grupoMCCResponse.descricaoExtrato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, descricaoExtrato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoMCCResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    descricaoExtrato: ").append(toIndentedString(descricaoExtrato)).append("\n");
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

