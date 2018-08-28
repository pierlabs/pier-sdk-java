package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{parametro_emissor_resposta_descricao}}}
 **/

@ApiModel(description = "{{{parametro_emissor_resposta_descricao}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ParametroEmissorResponse   {
  
  private String codigo = null;
  private String dataValidade = null;
  private String descricao = null;
  private String tipo = null;
  private String valorParametro = null;

  
  /**
   * {{{parametro_emissor_resposta_codigo_descricao}}}
   **/
  public ParametroEmissorResponse codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parametro_emissor_resposta_codigo_descricao}}}")
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * {{{parametro_emissor_resposta_data_validade_descricao}}}
   **/
  public ParametroEmissorResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{parametro_emissor_resposta_data_validade_descricao}}}")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{parametro_emissor_resposta_descricao_descricao}}}
   **/
  public ParametroEmissorResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parametro_emissor_resposta_descricao_descricao}}}")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{parametro_emissor_resposta_tipo_descricao}}}
   **/
  public ParametroEmissorResponse tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parametro_emissor_resposta_tipo_descricao}}}")
  @JsonProperty("tipo")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  /**
   * {{{parametro_emissor_resposta_valor_parametro_descricao}}}
   **/
  public ParametroEmissorResponse valorParametro(String valorParametro) {
    this.valorParametro = valorParametro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{parametro_emissor_resposta_valor_parametro_descricao}}}")
  @JsonProperty("valorParametro")
  public String getValorParametro() {
    return valorParametro;
  }
  public void setValorParametro(String valorParametro) {
    this.valorParametro = valorParametro;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParametroEmissorResponse parametroEmissorResponse = (ParametroEmissorResponse) o;
    return Objects.equals(this.codigo, parametroEmissorResponse.codigo) &&
        Objects.equals(this.dataValidade, parametroEmissorResponse.dataValidade) &&
        Objects.equals(this.descricao, parametroEmissorResponse.descricao) &&
        Objects.equals(this.tipo, parametroEmissorResponse.tipo) &&
        Objects.equals(this.valorParametro, parametroEmissorResponse.valorParametro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, dataValidade, descricao, tipo, valorParametro);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametroEmissorResponse {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    valorParametro: ").append(toIndentedString(valorParametro)).append("\n");
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

