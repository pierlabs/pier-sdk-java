package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de Resposta Par\u00C3\u00A2metro Produto
 **/

@ApiModel(description = "Objeto de Resposta Par\u00C3\u00A2metro Produto")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ParametroProdutoResponse   {
  
  private Long idProduto = null;


  public enum TipoOrigemTransacaoEnum {
    ON_US("ON_US"),
    OFF_US("OFF_US");

    private String value;

    TipoOrigemTransacaoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TipoOrigemTransacaoEnum tipoOrigemTransacao = null;
  private String descricao = null;
  private BigDecimal valorParametro = null;
  private String dataValidade = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).
   **/
  public ParametroProdutoResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Tipo da Transa\u00C3\u00A7\u00C3\u00A3o (ON_US ou OFF_US).
   **/
  public ParametroProdutoResponse tipoOrigemTransacao(TipoOrigemTransacaoEnum tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Tipo da Transa\u00C3\u00A7\u00C3\u00A3o (ON_US ou OFF_US).")
  @JsonProperty("tipoOrigemTransacao")
  public TipoOrigemTransacaoEnum getTipoOrigemTransacao() {
    return tipoOrigemTransacao;
  }
  public void setTipoOrigemTransacao(TipoOrigemTransacaoEnum tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do Tipo da Transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  public ParametroProdutoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Descri\u00C3\u00A7\u00C3\u00A3o do Tipo da Transa\u00C3\u00A7\u00C3\u00A3o.")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Valor do Par\u00C3\u00A2metro.
   **/
  public ParametroProdutoResponse valorParametro(BigDecimal valorParametro) {
    this.valorParametro = valorParametro;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor do Par\u00C3\u00A2metro.")
  @JsonProperty("valorParametro")
  public BigDecimal getValorParametro() {
    return valorParametro;
  }
  public void setValorParametro(BigDecimal valorParametro) {
    this.valorParametro = valorParametro;
  }

  
  /**
   * Data de Validade do Par\u00C3\u00A2metro do Produto.
   **/
  public ParametroProdutoResponse dataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", required = true, value = "Data de Validade do Par\u00C3\u00A2metro do Produto.")
  @JsonProperty("dataValidade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParametroProdutoResponse parametroProdutoResponse = (ParametroProdutoResponse) o;
    return Objects.equals(this.idProduto, parametroProdutoResponse.idProduto) &&
        Objects.equals(this.tipoOrigemTransacao, parametroProdutoResponse.tipoOrigemTransacao) &&
        Objects.equals(this.descricao, parametroProdutoResponse.descricao) &&
        Objects.equals(this.valorParametro, parametroProdutoResponse.valorParametro) &&
        Objects.equals(this.dataValidade, parametroProdutoResponse.dataValidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduto, tipoOrigemTransacao, descricao, valorParametro, dataValidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametroProdutoResponse {\n");
    
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    tipoOrigemTransacao: ").append(toIndentedString(tipoOrigemTransacao)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    valorParametro: ").append(toIndentedString(valorParametro)).append("\n");
    sb.append("    dataValidade: ").append(toIndentedString(dataValidade)).append("\n");
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

