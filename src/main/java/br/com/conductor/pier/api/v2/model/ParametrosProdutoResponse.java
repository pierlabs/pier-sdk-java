package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{parametros_produto_response_description}}}
 **/

@ApiModel(description = "{{{parametros_produto_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ParametrosProdutoResponse   {
  
  private String codigo = null;
  private String descricao = null;
  private String valorParametro = null;
  private String dataValidade = null;
  private String tipo = null;

  
  /**
   * {{{parametro_produto_resposta_codigo_value}}}
   **/
  public ParametrosProdutoResponse codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parametro_produto_resposta_codigo_value}}}")
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * {{{parametro_produto_resposta_descricao_value}}}
   **/
  public ParametrosProdutoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parametro_produto_resposta_descricao_value}}}")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{parametro_produto_resposta_valor_parametro_value}}}
   **/
  public ParametrosProdutoResponse valorParametro(String valorParametro) {
    this.valorParametro = valorParametro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parametro_produto_resposta_valor_parametro_value}}}")
  @JsonProperty("valorParametro")
  public String getValorParametro() {
    return valorParametro;
  }
  public void setValorParametro(String valorParametro) {
    this.valorParametro = valorParametro;
  }

  
  /**
   * {{{parametro_produto_resposta_data_validade_value}}}
   **/
  public ParametrosProdutoResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{parametro_produto_resposta_data_validade_value}}}")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{parametro_produto_resposta_tipo_value}}}
   **/
  public ParametrosProdutoResponse tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parametro_produto_resposta_tipo_value}}}")
  @JsonProperty("tipo")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParametrosProdutoResponse parametrosProdutoResponse = (ParametrosProdutoResponse) o;
    return Objects.equals(this.codigo, parametrosProdutoResponse.codigo) &&
        Objects.equals(this.descricao, parametrosProdutoResponse.descricao) &&
        Objects.equals(this.valorParametro, parametrosProdutoResponse.valorParametro) &&
        Objects.equals(this.dataValidade, parametrosProdutoResponse.dataValidade) &&
        Objects.equals(this.tipo, parametrosProdutoResponse.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, descricao, valorParametro, dataValidade, tipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametrosProdutoResponse {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    valorParametro: ").append(toIndentedString(valorParametro)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

