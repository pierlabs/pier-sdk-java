package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o da resposta do recurso de consultar cart\u00E3o
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de consultar cart\u00E3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransacaoPayQueryResponse   {
  
  private String codigo = null;
  private String descricao = null;

  
  /**
   * Resultado de consulta de conta
   **/
  public TransacaoPayQueryResponse codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Resultado de consulta de conta")
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Mensagem descrevendo resposta.
   **/
  public TransacaoPayQueryResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mensagem descrevendo resposta.")
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
    TransacaoPayQueryResponse transacaoPayQueryResponse = (TransacaoPayQueryResponse) o;
    return Objects.equals(this.codigo, transacaoPayQueryResponse.codigo) &&
        Objects.equals(this.descricao, transacaoPayQueryResponse.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoPayQueryResponse {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
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

