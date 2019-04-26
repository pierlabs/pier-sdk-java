package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o do recurso Par\u00E2metro Emissor
 **/

@ApiModel(description = "Representa\u00E7\u00E3o do recurso Par\u00E2metro Emissor")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ParametroEmissorResponse   {
  
  private String codigo = null;
  private String dataValidade = null;
  private String descricao = null;
  private String tipo = null;
  private String valorParametro = null;

  
  /**
   * C\u00F3digo do par\u00E2metro
   **/
  public ParametroEmissorResponse codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo do par\u00E2metro")
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Data da validade do par\u00E2metro
   **/
  public ParametroEmissorResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data da validade do par\u00E2metro")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Descri\u00E7\u00E3o do par\u00E2metro
   **/
  public ParametroEmissorResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do par\u00E2metro")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Tipo do par\u00E2metro
   **/
  public ParametroEmissorResponse tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo do par\u00E2metro")
  @JsonProperty("tipo")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  /**
   * Valor do par\u00E2metro
   **/
  public ParametroEmissorResponse valorParametro(String valorParametro) {
    this.valorParametro = valorParametro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do par\u00E2metro")
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

