package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Object for account persistence MultiApp
 **/

@ApiModel(description = "Object for account persistence MultiApp")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CountMultiAppPersist   {
  
  private Long idPessoa = null;
  private Long idOrigemComercial = null;
  private Long idProduto = null;
  private Integer diaVencimento = null;
  private BigDecimal valorRenda = null;
  private Integer valorPontuacao = null;
  private Long idEnderecoCorrespondencia = null;
  private BigDecimal limiteGlobal = null;
  private BigDecimal limiteMaximo = null;
  private BigDecimal limiteParcelas = null;
  private BigDecimal limiteConsignado = null;
  private Integer flagFaturaDigital = null;
  private String canalEntrada = null;

  
  /**
   * Identifier code of the person at the base (id)
   **/
  public CountMultiAppPersist idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier code of the person at the base (id)")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Identification code of the commercial origin at the base (id)
   **/
  public CountMultiAppPersist idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identification code of the commercial origin at the base (id)")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Identification code of the product at the base (id)
   **/
  public CountMultiAppPersist idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identification code of the product at the base (id)")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Account Due Date
   **/
  public CountMultiAppPersist diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Account Due Date")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Amount of the account holder's income
   **/
  public CountMultiAppPersist valorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Amount of the account holder's income")
  @JsonProperty("valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * score value of the acount
   **/
  public CountMultiAppPersist valorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "score value of the acount")
  @JsonProperty("valorPontuacao")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * ID code of the account's mailing address
   **/
  public CountMultiAppPersist idEnderecoCorrespondencia(Long idEnderecoCorrespondencia) {
    this.idEnderecoCorrespondencia = idEnderecoCorrespondencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID code of the account's mailing address")
  @JsonProperty("idEnderecoCorrespondencia")
  public Long getIdEnderecoCorrespondencia() {
    return idEnderecoCorrespondencia;
  }
  public void setIdEnderecoCorrespondencia(Long idEnderecoCorrespondencia) {
    this.idEnderecoCorrespondencia = idEnderecoCorrespondencia;
  }

  
  /**
   * global limit of the acount
   **/
  public CountMultiAppPersist limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "global limit of the acount")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * maximum limit of the acount
   **/
  public CountMultiAppPersist limiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "maximum limit of the acount")
  @JsonProperty("limiteMaximo")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * inform the Specific Monthly Limit for Parcel Transactions
   **/
  public CountMultiAppPersist limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "inform the Specific Monthly Limit for Parcel Transactions")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * inform the Consigned Limit margin
   **/
  public CountMultiAppPersist limiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "inform the Consigned Limit margin")
  @JsonProperty("limiteConsignado")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * On active, indicates that the customer has chosen the option to send Invoice by Email. Otherwise, invoices will be mailed
   **/
  public CountMultiAppPersist flagFaturaDigital(Integer flagFaturaDigital) {
    this.flagFaturaDigital = flagFaturaDigital;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "On active, indicates that the customer has chosen the option to send Invoice by Email. Otherwise, invoices will be mailed")
  @JsonProperty("flagFaturaDigital")
  public Integer getFlagFaturaDigital() {
    return flagFaturaDigital;
  }
  public void setFlagFaturaDigital(Integer flagFaturaDigital) {
    this.flagFaturaDigital = flagFaturaDigital;
  }

  
  /**
   * When used, it is used to indicate the capture channel of the customer's registration, such as Web, Site, App, etc
   **/
  public CountMultiAppPersist canalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When used, it is used to indicate the capture channel of the customer's registration, such as Web, Site, App, etc")
  @JsonProperty("canalEntrada")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountMultiAppPersist countMultiAppPersist = (CountMultiAppPersist) o;
    return Objects.equals(this.idPessoa, countMultiAppPersist.idPessoa) &&
        Objects.equals(this.idOrigemComercial, countMultiAppPersist.idOrigemComercial) &&
        Objects.equals(this.idProduto, countMultiAppPersist.idProduto) &&
        Objects.equals(this.diaVencimento, countMultiAppPersist.diaVencimento) &&
        Objects.equals(this.valorRenda, countMultiAppPersist.valorRenda) &&
        Objects.equals(this.valorPontuacao, countMultiAppPersist.valorPontuacao) &&
        Objects.equals(this.idEnderecoCorrespondencia, countMultiAppPersist.idEnderecoCorrespondencia) &&
        Objects.equals(this.limiteGlobal, countMultiAppPersist.limiteGlobal) &&
        Objects.equals(this.limiteMaximo, countMultiAppPersist.limiteMaximo) &&
        Objects.equals(this.limiteParcelas, countMultiAppPersist.limiteParcelas) &&
        Objects.equals(this.limiteConsignado, countMultiAppPersist.limiteConsignado) &&
        Objects.equals(this.flagFaturaDigital, countMultiAppPersist.flagFaturaDigital) &&
        Objects.equals(this.canalEntrada, countMultiAppPersist.canalEntrada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPessoa, idOrigemComercial, idProduto, diaVencimento, valorRenda, valorPontuacao, idEnderecoCorrespondencia, limiteGlobal, limiteMaximo, limiteParcelas, limiteConsignado, flagFaturaDigital, canalEntrada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountMultiAppPersist {\n");
    
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    diaVencimento: ").append(toIndentedString(diaVencimento)).append("\n");
    sb.append("    valorRenda: ").append(toIndentedString(valorRenda)).append("\n");
    sb.append("    valorPontuacao: ").append(toIndentedString(valorPontuacao)).append("\n");
    sb.append("    idEnderecoCorrespondencia: ").append(toIndentedString(idEnderecoCorrespondencia)).append("\n");
    sb.append("    limiteGlobal: ").append(toIndentedString(limiteGlobal)).append("\n");
    sb.append("    limiteMaximo: ").append(toIndentedString(limiteMaximo)).append("\n");
    sb.append("    limiteParcelas: ").append(toIndentedString(limiteParcelas)).append("\n");
    sb.append("    limiteConsignado: ").append(toIndentedString(limiteConsignado)).append("\n");
    sb.append("    flagFaturaDigital: ").append(toIndentedString(flagFaturaDigital)).append("\n");
    sb.append("    canalEntrada: ").append(toIndentedString(canalEntrada)).append("\n");
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

