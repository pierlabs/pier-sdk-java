package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{conta_multi_app_persist_description}}}
 **/

@ApiModel(description = "{{{conta_multi_app_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaMultiAppPersistValue   {
  
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
   * {{{conta_multi_app_persist_id_pessoa_value}}}
   **/
  public ContaMultiAppPersistValue idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_multi_app_persist_id_pessoa_value}}}")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{conta_multi_app_persist_id_origem_comercial_value}}}
   **/
  public ContaMultiAppPersistValue idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_multi_app_persist_id_origem_comercial_value}}}")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{conta_multi_app_persist_id_produto_value}}}
   **/
  public ContaMultiAppPersistValue idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_multi_app_persist_id_produto_value}}}")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{conta_multi_app_persist_dia_vencimento_value}}}
   **/
  public ContaMultiAppPersistValue diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_multi_app_persist_dia_vencimento_value}}}")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * {{{conta_multi_app_persist_valor_renda_value}}}
   **/
  public ContaMultiAppPersistValue valorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_multi_app_persist_valor_renda_value}}}")
  @JsonProperty("valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * {{{conta_multi_app_persist_valor_pontuacao_value}}}
   **/
  public ContaMultiAppPersistValue valorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_multi_app_persist_valor_pontuacao_value}}}")
  @JsonProperty("valorPontuacao")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * {{{conta_multi_app_persist_id_endereco_correspondencia_value}}}
   **/
  public ContaMultiAppPersistValue idEnderecoCorrespondencia(Long idEnderecoCorrespondencia) {
    this.idEnderecoCorrespondencia = idEnderecoCorrespondencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_multi_app_persist_id_endereco_correspondencia_value}}}")
  @JsonProperty("idEnderecoCorrespondencia")
  public Long getIdEnderecoCorrespondencia() {
    return idEnderecoCorrespondencia;
  }
  public void setIdEnderecoCorrespondencia(Long idEnderecoCorrespondencia) {
    this.idEnderecoCorrespondencia = idEnderecoCorrespondencia;
  }

  
  /**
   * {{{conta_multi_app_persist_limite_global_value}}}
   **/
  public ContaMultiAppPersistValue limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_multi_app_persist_limite_global_value}}}")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * {{{conta_multi_app_persist_limite_maximo_value}}}
   **/
  public ContaMultiAppPersistValue limiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_multi_app_persist_limite_maximo_value}}}")
  @JsonProperty("limiteMaximo")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * {{{conta_multi_app_persist_limite_parcelas_value}}}
   **/
  public ContaMultiAppPersistValue limiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_multi_app_persist_limite_parcelas_value}}}")
  @JsonProperty("limiteParcelas")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * {{{conta_multi_app_persist_limite_consignado_value}}}
   **/
  public ContaMultiAppPersistValue limiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_multi_app_persist_limite_consignado_value}}}")
  @JsonProperty("limiteConsignado")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * {{{conta_multi_app_persist_flag_fatura_por_email_value}}}
   **/
  public ContaMultiAppPersistValue flagFaturaDigital(Integer flagFaturaDigital) {
    this.flagFaturaDigital = flagFaturaDigital;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{conta_multi_app_persist_flag_fatura_por_email_value}}}")
  @JsonProperty("flagFaturaDigital")
  public Integer getFlagFaturaDigital() {
    return flagFaturaDigital;
  }
  public void setFlagFaturaDigital(Integer flagFaturaDigital) {
    this.flagFaturaDigital = flagFaturaDigital;
  }

  
  /**
   * {{{conta_multi_app_persist_canal_entrada_value}}}
   **/
  public ContaMultiAppPersistValue canalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{conta_multi_app_persist_canal_entrada_value}}}")
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
    ContaMultiAppPersistValue contaMultiAppPersistValue = (ContaMultiAppPersistValue) o;
    return Objects.equals(this.idPessoa, contaMultiAppPersistValue.idPessoa) &&
        Objects.equals(this.idOrigemComercial, contaMultiAppPersistValue.idOrigemComercial) &&
        Objects.equals(this.idProduto, contaMultiAppPersistValue.idProduto) &&
        Objects.equals(this.diaVencimento, contaMultiAppPersistValue.diaVencimento) &&
        Objects.equals(this.valorRenda, contaMultiAppPersistValue.valorRenda) &&
        Objects.equals(this.valorPontuacao, contaMultiAppPersistValue.valorPontuacao) &&
        Objects.equals(this.idEnderecoCorrespondencia, contaMultiAppPersistValue.idEnderecoCorrespondencia) &&
        Objects.equals(this.limiteGlobal, contaMultiAppPersistValue.limiteGlobal) &&
        Objects.equals(this.limiteMaximo, contaMultiAppPersistValue.limiteMaximo) &&
        Objects.equals(this.limiteParcelas, contaMultiAppPersistValue.limiteParcelas) &&
        Objects.equals(this.limiteConsignado, contaMultiAppPersistValue.limiteConsignado) &&
        Objects.equals(this.flagFaturaDigital, contaMultiAppPersistValue.flagFaturaDigital) &&
        Objects.equals(this.canalEntrada, contaMultiAppPersistValue.canalEntrada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPessoa, idOrigemComercial, idProduto, diaVencimento, valorRenda, valorPontuacao, idEnderecoCorrespondencia, limiteGlobal, limiteMaximo, limiteParcelas, limiteConsignado, flagFaturaDigital, canalEntrada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaMultiAppPersistValue {\n");
    
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

