package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o do response da proje\u00E7\u00E3o de compras n\u00E3o processadas
 **/

@ApiModel(description = "Representa\u00E7\u00E3o do response da proje\u00E7\u00E3o de compras n\u00E3o processadas")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ProjecaoCompraNaoProcessadaResponse   {
  
  private Long idConta = null;
  private String dataVencimentoFatura = null;
  private BigDecimal valorTotal = null;
  private String dataVencimentoReal = null;
  private String dataCorte = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta
   **/
  public ProjecaoCompraNaoProcessadaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Data de vencimento padr\u00E3o da proje\u00E7\u00E3o em formato AAAA-MM-DD
   **/
  public ProjecaoCompraNaoProcessadaResponse dataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento padr\u00E3o da proje\u00E7\u00E3o em formato AAAA-MM-DD")
  @JsonProperty("dataVencimentoFatura")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * Valor total da proje\u00E7\u00E3o
   **/
  public ProjecaoCompraNaoProcessadaResponse valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor total da proje\u00E7\u00E3o")
  @JsonProperty("valorTotal")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * Data de vencimento real da proje\u00E7\u00E3o em formato AAAA-MM-DD
   **/
  public ProjecaoCompraNaoProcessadaResponse dataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento real da proje\u00E7\u00E3o em formato AAAA-MM-DD")
  @JsonProperty("dataVencimentoReal")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Data de corte da proje\u00E7\u00E3o em formato AAAA-MM-DD
   **/
  public ProjecaoCompraNaoProcessadaResponse dataCorte(String dataCorte) {
    this.dataCorte = dataCorte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de corte da proje\u00E7\u00E3o em formato AAAA-MM-DD")
  @JsonProperty("dataCorte")
  public String getDataCorte() {
    return dataCorte;
  }
  public void setDataCorte(String dataCorte) {
    this.dataCorte = dataCorte;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjecaoCompraNaoProcessadaResponse projecaoCompraNaoProcessadaResponse = (ProjecaoCompraNaoProcessadaResponse) o;
    return Objects.equals(this.idConta, projecaoCompraNaoProcessadaResponse.idConta) &&
        Objects.equals(this.dataVencimentoFatura, projecaoCompraNaoProcessadaResponse.dataVencimentoFatura) &&
        Objects.equals(this.valorTotal, projecaoCompraNaoProcessadaResponse.valorTotal) &&
        Objects.equals(this.dataVencimentoReal, projecaoCompraNaoProcessadaResponse.dataVencimentoReal) &&
        Objects.equals(this.dataCorte, projecaoCompraNaoProcessadaResponse.dataCorte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, dataVencimentoFatura, valorTotal, dataVencimentoReal, dataCorte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjecaoCompraNaoProcessadaResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    dataVencimentoFatura: ").append(toIndentedString(dataVencimentoFatura)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    dataVencimentoReal: ").append(toIndentedString(dataVencimentoReal)).append("\n");
    sb.append("    dataCorte: ").append(toIndentedString(dataCorte)).append("\n");
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

