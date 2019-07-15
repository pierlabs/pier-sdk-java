package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de resposta de uma tarifa de d\u00E9bito da conta
 **/

@ApiModel(description = "Objeto de resposta de uma tarifa de d\u00E9bito da conta")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaDebitoTarifaResponse   {
  
  private String dataHoraExpiracao = null;
  private String dataHoraFimCobranca = null;
  private Long id = null;
  private Long idConta = null;
  private BigDecimal percentualDesconto = null;
  private BigDecimal valor = null;
  private BigDecimal valorOriginal = null;

  
  /**
   * Data e hora de expira\u00E7\u00E3o do registro de cobran\u00E7a
   **/
  public ContaDebitoTarifaResponse dataHoraExpiracao(String dataHoraExpiracao) {
    this.dataHoraExpiracao = dataHoraExpiracao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data e hora de expira\u00E7\u00E3o do registro de cobran\u00E7a")
  @JsonProperty("dataHoraExpiracao")
  public String getDataHoraExpiracao() {
    return dataHoraExpiracao;
  }
  public void setDataHoraExpiracao(String dataHoraExpiracao) {
    this.dataHoraExpiracao = dataHoraExpiracao;
  }

  
  /**
   * Data e hora do fim da cobran\u00E7a
   **/
  public ContaDebitoTarifaResponse dataHoraFimCobranca(String dataHoraFimCobranca) {
    this.dataHoraFimCobranca = dataHoraFimCobranca;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data e hora do fim da cobran\u00E7a")
  @JsonProperty("dataHoraFimCobranca")
  public String getDataHoraFimCobranca() {
    return dataHoraFimCobranca;
  }
  public void setDataHoraFimCobranca(String dataHoraFimCobranca) {
    this.dataHoraFimCobranca = dataHoraFimCobranca;
  }

  
  /**
   * Identificador do registro
   **/
  public ContaDebitoTarifaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do registro")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador da conta
   **/
  public ContaDebitoTarifaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Percentual de desconto
   **/
  public ContaDebitoTarifaResponse percentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentual de desconto")
  @JsonProperty("percentualDesconto")
  public BigDecimal getPercentualDesconto() {
    return percentualDesconto;
  }
  public void setPercentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
  }

  
  /**
   * Valor da tarifa com desconto
   **/
  public ContaDebitoTarifaResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da tarifa com desconto")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Valor original da tarifa
   **/
  public ContaDebitoTarifaResponse valorOriginal(BigDecimal valorOriginal) {
    this.valorOriginal = valorOriginal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor original da tarifa")
  @JsonProperty("valorOriginal")
  public BigDecimal getValorOriginal() {
    return valorOriginal;
  }
  public void setValorOriginal(BigDecimal valorOriginal) {
    this.valorOriginal = valorOriginal;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaDebitoTarifaResponse contaDebitoTarifaResponse = (ContaDebitoTarifaResponse) o;
    return Objects.equals(this.dataHoraExpiracao, contaDebitoTarifaResponse.dataHoraExpiracao) &&
        Objects.equals(this.dataHoraFimCobranca, contaDebitoTarifaResponse.dataHoraFimCobranca) &&
        Objects.equals(this.id, contaDebitoTarifaResponse.id) &&
        Objects.equals(this.idConta, contaDebitoTarifaResponse.idConta) &&
        Objects.equals(this.percentualDesconto, contaDebitoTarifaResponse.percentualDesconto) &&
        Objects.equals(this.valor, contaDebitoTarifaResponse.valor) &&
        Objects.equals(this.valorOriginal, contaDebitoTarifaResponse.valorOriginal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataHoraExpiracao, dataHoraFimCobranca, id, idConta, percentualDesconto, valor, valorOriginal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDebitoTarifaResponse {\n");
    
    sb.append("    dataHoraExpiracao: ").append(toIndentedString(dataHoraExpiracao)).append("\n");
    sb.append("    dataHoraFimCobranca: ").append(toIndentedString(dataHoraFimCobranca)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    percentualDesconto: ").append(toIndentedString(percentualDesconto)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    valorOriginal: ").append(toIndentedString(valorOriginal)).append("\n");
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

