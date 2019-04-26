package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto para persist\u00EAncia da conta MultiApp
 **/

@ApiModel(description = "Objeto para persist\u00EAncia da conta MultiApp")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaMultiAppPersist   {
  
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
  private Long idStatusConta = null;

  
  /**
   * C\u00F3digo identificador da pessoa na base (id)
   **/
  public ContaMultiAppPersist idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador da pessoa na base (id)")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00F3digo identificador da origem comercial na base (id)
   **/
  public ContaMultiAppPersist idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador da origem comercial na base (id)")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * C\u00F3digo identificador do produto na base (id)
   **/
  public ContaMultiAppPersist idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador do produto na base (id)")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Dia do vencimento da conta
   **/
  public ContaMultiAppPersist diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Dia do vencimento da conta")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Valor da renda do titular da conta
   **/
  public ContaMultiAppPersist valorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor da renda do titular da conta")
  @JsonProperty("valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Valor da pontua\u00E7\u00E3o da conta
   **/
  public ContaMultiAppPersist valorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor da pontua\u00E7\u00E3o da conta")
  @JsonProperty("valorPontuacao")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * C\u00F3digo identificador do endere\u00E7o de correspond\u00EAncia da conta
   **/
  public ContaMultiAppPersist idEnderecoCorrespondencia(Long idEnderecoCorrespondencia) {
    this.idEnderecoCorrespondencia = idEnderecoCorrespondencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador do endere\u00E7o de correspond\u00EAncia da conta")
  @JsonProperty("idEnderecoCorrespondencia")
  public Long getIdEnderecoCorrespondencia() {
    return idEnderecoCorrespondencia;
  }
  public void setIdEnderecoCorrespondencia(Long idEnderecoCorrespondencia) {
    this.idEnderecoCorrespondencia = idEnderecoCorrespondencia;
  }

  
  /**
   * Limite global da conta
   **/
  public ContaMultiAppPersist limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Limite global da conta")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Limite m\u00E1ximo da conta
   **/
  public ContaMultiAppPersist limiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Limite m\u00E1ximo da conta")
  @JsonProperty("limiteMaximo")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * informar o Limite Mensal espec\u00EDfico para Transa\u00E7\u00F5es Parceladas
   **/
  public ContaMultiAppPersist limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "informar o Limite Mensal espec\u00EDfico para Transa\u00E7\u00F5es Parceladas")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * informar a margem de Limite Consignado
   **/
  public ContaMultiAppPersist limiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "informar a margem de Limite Consignado")
  @JsonProperty("limiteConsignado")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Quanto ativa, indica que o cliente escolheu a op\u00E7\u00E3o de envio de Fatura por Email. Do contr\u00E1rio, as faturas ser\u00E3o enviadas por Correspond\u00EAncia
   **/
  public ContaMultiAppPersist flagFaturaDigital(Integer flagFaturaDigital) {
    this.flagFaturaDigital = flagFaturaDigital;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Quanto ativa, indica que o cliente escolheu a op\u00E7\u00E3o de envio de Fatura por Email. Do contr\u00E1rio, as faturas ser\u00E3o enviadas por Correspond\u00EAncia")
  @JsonProperty("flagFaturaDigital")
  public Integer getFlagFaturaDigital() {
    return flagFaturaDigital;
  }
  public void setFlagFaturaDigital(Integer flagFaturaDigital) {
    this.flagFaturaDigital = flagFaturaDigital;
  }

  
  /**
   * Quando utilizado, serve para indicar o canal de captura do cadastro do cliente, como Web, Site, App, etc
   **/
  public ContaMultiAppPersist canalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando utilizado, serve para indicar o canal de captura do cadastro do cliente, como Web, Site, App, etc")
  @JsonProperty("canalEntrada")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * Status da conta
   **/
  public ContaMultiAppPersist idStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status da conta")
  @JsonProperty("idStatusConta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaMultiAppPersist contaMultiAppPersist = (ContaMultiAppPersist) o;
    return Objects.equals(this.idPessoa, contaMultiAppPersist.idPessoa) &&
        Objects.equals(this.idOrigemComercial, contaMultiAppPersist.idOrigemComercial) &&
        Objects.equals(this.idProduto, contaMultiAppPersist.idProduto) &&
        Objects.equals(this.diaVencimento, contaMultiAppPersist.diaVencimento) &&
        Objects.equals(this.valorRenda, contaMultiAppPersist.valorRenda) &&
        Objects.equals(this.valorPontuacao, contaMultiAppPersist.valorPontuacao) &&
        Objects.equals(this.idEnderecoCorrespondencia, contaMultiAppPersist.idEnderecoCorrespondencia) &&
        Objects.equals(this.limiteGlobal, contaMultiAppPersist.limiteGlobal) &&
        Objects.equals(this.limiteMaximo, contaMultiAppPersist.limiteMaximo) &&
        Objects.equals(this.limiteParcelas, contaMultiAppPersist.limiteParcelas) &&
        Objects.equals(this.limiteConsignado, contaMultiAppPersist.limiteConsignado) &&
        Objects.equals(this.flagFaturaDigital, contaMultiAppPersist.flagFaturaDigital) &&
        Objects.equals(this.canalEntrada, contaMultiAppPersist.canalEntrada) &&
        Objects.equals(this.idStatusConta, contaMultiAppPersist.idStatusConta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPessoa, idOrigemComercial, idProduto, diaVencimento, valorRenda, valorPontuacao, idEnderecoCorrespondencia, limiteGlobal, limiteMaximo, limiteParcelas, limiteConsignado, flagFaturaDigital, canalEntrada, idStatusConta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaMultiAppPersist {\n");
    
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
    sb.append("    idStatusConta: ").append(toIndentedString(idStatusConta)).append("\n");
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

