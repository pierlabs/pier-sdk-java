package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Resposta de par\u00E2metros de produto
 **/

@ApiModel(description = "Resposta de par\u00E2metros de produto")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ParametrosProdutoResponse   {
  
  private Long id = null;
  private String codigo = null;
  private String descricao = null;
  private String valorParametro = null;
  private String dataValidade = null;
  private String tipo = null;
  private Long idProduto = null;

  
  /**
   * Identificador do par\u00E2metro de produto
   **/
  public ParametrosProdutoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do par\u00E2metro de produto")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo do par\u00E2metro do produto
   **/
  public ParametrosProdutoResponse codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo do par\u00E2metro do produto")
  @JsonProperty("codigo")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Descri\u00E7\u00E3o do par\u00E2metro de produto
   **/
  public ParametrosProdutoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do par\u00E2metro de produto")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Valor dos par\u00E2metro do produto
   **/
  public ParametrosProdutoResponse valorParametro(String valorParametro) {
    this.valorParametro = valorParametro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor dos par\u00E2metro do produto")
  @JsonProperty("valorParametro")
  public String getValorParametro() {
    return valorParametro;
  }
  public void setValorParametro(String valorParametro) {
    this.valorParametro = valorParametro;
  }

  
  /**
   * Data de validade do par\u00E2metro de produto
   **/
  public ParametrosProdutoResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de validade do par\u00E2metro de produto")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Tipo do par\u00E2metro de produto
   **/
  public ParametrosProdutoResponse tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo do par\u00E2metro de produto")
  @JsonProperty("tipo")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  /**
   * Identificador do produto
   **/
  public ParametrosProdutoResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do produto")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
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
    return Objects.equals(this.id, parametrosProdutoResponse.id) &&
        Objects.equals(this.codigo, parametrosProdutoResponse.codigo) &&
        Objects.equals(this.descricao, parametrosProdutoResponse.descricao) &&
        Objects.equals(this.valorParametro, parametrosProdutoResponse.valorParametro) &&
        Objects.equals(this.dataValidade, parametrosProdutoResponse.dataValidade) &&
        Objects.equals(this.tipo, parametrosProdutoResponse.tipo) &&
        Objects.equals(this.idProduto, parametrosProdutoResponse.idProduto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codigo, descricao, valorParametro, dataValidade, tipo, idProduto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametrosProdutoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    valorParametro: ").append(toIndentedString(valorParametro)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
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

