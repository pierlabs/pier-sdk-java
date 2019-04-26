package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa um objeto de resposta para pagamentos inv\u00E1lidos
 **/

@ApiModel(description = "Representa um objeto de resposta para pagamentos inv\u00E1lidos")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PagamentosInvalidosResponse   {
  
  private Long id = null;
  private Long banco = null;
  private String dataPagamento = null;
  private BigDecimal valorPago = null;
  private String descricao = null;

  
  /**
   * C\u00F3digo identificador do pagamento inv\u00E1lido
   **/
  public PagamentosInvalidosResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do pagamento inv\u00E1lido")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do banco
   **/
  public PagamentosInvalidosResponse banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do banco")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * Data de pagamento do boleto
   **/
  public PagamentosInvalidosResponse dataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de pagamento do boleto")
  @JsonProperty("dataPagamento")
  public String getDataPagamento() {
    return dataPagamento;
  }
  public void setDataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  
  /**
   * Valor pago da fatura
   **/
  public PagamentosInvalidosResponse valorPago(BigDecimal valorPago) {
    this.valorPago = valorPago;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor pago da fatura")
  @JsonProperty("valorPago")
  public BigDecimal getValorPago() {
    return valorPago;
  }
  public void setValorPago(BigDecimal valorPago) {
    this.valorPago = valorPago;
  }

  
  /**
   * Descri\u00E7\u00E3o do erro ocorrido durante a importa\u00E7\u00E3o do pagamento
   **/
  public PagamentosInvalidosResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do erro ocorrido durante a importa\u00E7\u00E3o do pagamento")
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
    PagamentosInvalidosResponse pagamentosInvalidosResponse = (PagamentosInvalidosResponse) o;
    return Objects.equals(this.id, pagamentosInvalidosResponse.id) &&
        Objects.equals(this.banco, pagamentosInvalidosResponse.banco) &&
        Objects.equals(this.dataPagamento, pagamentosInvalidosResponse.dataPagamento) &&
        Objects.equals(this.valorPago, pagamentosInvalidosResponse.valorPago) &&
        Objects.equals(this.descricao, pagamentosInvalidosResponse.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, banco, dataPagamento, valorPago, descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagamentosInvalidosResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
    sb.append("    valorPago: ").append(toIndentedString(valorPago)).append("\n");
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

