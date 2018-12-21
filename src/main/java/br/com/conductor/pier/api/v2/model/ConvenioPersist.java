package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{convenio_persist_description}}} 
 **/

@ApiModel(description = "{{{convenio_persist_description}}} ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConvenioPersist   {
  
  private Long banco = null;
  private Long agencia = null;
  private String contaCorrente = null;
  private String especie = null;
  private BigDecimal numeroConvenio = null;
  private Long carteira = null;
  private String codigoCedente = null;
  private String especieTipo = null;
  private String especieDocumento = null;
  private Boolean aceite = null;
  private String instrucoes = null;
  private String localPagamento1 = null;
  private String localPagamento2 = null;
  private String enderecoCobrancaEmissor = null;
  private String nomeBeneficiario = null;
  private String cnpjBeneficiario = null;

  
  /**
   * {{{convenio_persist_banco_value}}}
   **/
  public ConvenioPersist banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{convenio_persist_banco_value}}}")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * {{{convenio_persist_agencia_value}}}
   **/
  public ConvenioPersist agencia(Long agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{convenio_persist_agencia_value}}}")
  @JsonProperty("agencia")
  public Long getAgencia() {
    return agencia;
  }
  public void setAgencia(Long agencia) {
    this.agencia = agencia;
  }

  
  /**
   * {{{convenio_persist_conta_corrente_value}}}
   **/
  public ConvenioPersist contaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{convenio_persist_conta_corrente_value}}}")
  @JsonProperty("contaCorrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * {{{convenio_persist_especie_value}}}
   **/
  public ConvenioPersist especie(String especie) {
    this.especie = especie;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_persist_especie_value}}}")
  @JsonProperty("especie")
  public String getEspecie() {
    return especie;
  }
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  
  /**
   * {{{convenio_persist_numero_convenio_value}}}
   **/
  public ConvenioPersist numeroConvenio(BigDecimal numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_persist_numero_convenio_value}}}")
  @JsonProperty("numeroConvenio")
  public BigDecimal getNumeroConvenio() {
    return numeroConvenio;
  }
  public void setNumeroConvenio(BigDecimal numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  
  /**
   * {{{convenio_persist_carteira_value}}}
   **/
  public ConvenioPersist carteira(Long carteira) {
    this.carteira = carteira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_persist_carteira_value}}}")
  @JsonProperty("carteira")
  public Long getCarteira() {
    return carteira;
  }
  public void setCarteira(Long carteira) {
    this.carteira = carteira;
  }

  
  /**
   * {{{convenio_persist_codigo_cedente_value}}}
   **/
  public ConvenioPersist codigoCedente(String codigoCedente) {
    this.codigoCedente = codigoCedente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_persist_codigo_cedente_value}}}")
  @JsonProperty("codigoCedente")
  public String getCodigoCedente() {
    return codigoCedente;
  }
  public void setCodigoCedente(String codigoCedente) {
    this.codigoCedente = codigoCedente;
  }

  
  /**
   * {{{convenio_persist_especie_tipo_value}}}
   **/
  public ConvenioPersist especieTipo(String especieTipo) {
    this.especieTipo = especieTipo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_persist_especie_tipo_value}}}")
  @JsonProperty("especieTipo")
  public String getEspecieTipo() {
    return especieTipo;
  }
  public void setEspecieTipo(String especieTipo) {
    this.especieTipo = especieTipo;
  }

  
  /**
   * {{{convenio_persist_especie_documento_value}}}
   **/
  public ConvenioPersist especieDocumento(String especieDocumento) {
    this.especieDocumento = especieDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_persist_especie_documento_value}}}")
  @JsonProperty("especieDocumento")
  public String getEspecieDocumento() {
    return especieDocumento;
  }
  public void setEspecieDocumento(String especieDocumento) {
    this.especieDocumento = especieDocumento;
  }

  
  /**
   * {{{convenio_persist_aceite_value}}}
   **/
  public ConvenioPersist aceite(Boolean aceite) {
    this.aceite = aceite;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{convenio_persist_aceite_value}}}")
  @JsonProperty("aceite")
  public Boolean getAceite() {
    return aceite;
  }
  public void setAceite(Boolean aceite) {
    this.aceite = aceite;
  }

  
  /**
   * {{{convenio_persist_instrucoes_value}}}
   **/
  public ConvenioPersist instrucoes(String instrucoes) {
    this.instrucoes = instrucoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_persist_instrucoes_value}}}")
  @JsonProperty("instrucoes")
  public String getInstrucoes() {
    return instrucoes;
  }
  public void setInstrucoes(String instrucoes) {
    this.instrucoes = instrucoes;
  }

  
  /**
   * {{{convenio_persist_local_pagamento1_value}}}
   **/
  public ConvenioPersist localPagamento1(String localPagamento1) {
    this.localPagamento1 = localPagamento1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_persist_local_pagamento1_value}}}")
  @JsonProperty("localPagamento1")
  public String getLocalPagamento1() {
    return localPagamento1;
  }
  public void setLocalPagamento1(String localPagamento1) {
    this.localPagamento1 = localPagamento1;
  }

  
  /**
   * {{{convenio_persist_local_pagamento2_value}}}
   **/
  public ConvenioPersist localPagamento2(String localPagamento2) {
    this.localPagamento2 = localPagamento2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_persist_local_pagamento2_value}}}")
  @JsonProperty("localPagamento2")
  public String getLocalPagamento2() {
    return localPagamento2;
  }
  public void setLocalPagamento2(String localPagamento2) {
    this.localPagamento2 = localPagamento2;
  }

  
  /**
   * {{{convenio_persist_endereco_cobranca_emissor_value}}}
   **/
  public ConvenioPersist enderecoCobrancaEmissor(String enderecoCobrancaEmissor) {
    this.enderecoCobrancaEmissor = enderecoCobrancaEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_persist_endereco_cobranca_emissor_value}}}")
  @JsonProperty("enderecoCobrancaEmissor")
  public String getEnderecoCobrancaEmissor() {
    return enderecoCobrancaEmissor;
  }
  public void setEnderecoCobrancaEmissor(String enderecoCobrancaEmissor) {
    this.enderecoCobrancaEmissor = enderecoCobrancaEmissor;
  }

  
  /**
   * {{{convenio_persist_nome_beneficiario_emissor_value}}}
   **/
  public ConvenioPersist nomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_persist_nome_beneficiario_emissor_value}}}")
  @JsonProperty("nomeBeneficiario")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * {{{convenio_persist_cnpj_beneficiario_emissor_value}}}
   **/
  public ConvenioPersist cnpjBeneficiario(String cnpjBeneficiario) {
    this.cnpjBeneficiario = cnpjBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_persist_cnpj_beneficiario_emissor_value}}}")
  @JsonProperty("cnpjBeneficiario")
  public String getCnpjBeneficiario() {
    return cnpjBeneficiario;
  }
  public void setCnpjBeneficiario(String cnpjBeneficiario) {
    this.cnpjBeneficiario = cnpjBeneficiario;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvenioPersist convenioPersist = (ConvenioPersist) o;
    return Objects.equals(this.banco, convenioPersist.banco) &&
        Objects.equals(this.agencia, convenioPersist.agencia) &&
        Objects.equals(this.contaCorrente, convenioPersist.contaCorrente) &&
        Objects.equals(this.especie, convenioPersist.especie) &&
        Objects.equals(this.numeroConvenio, convenioPersist.numeroConvenio) &&
        Objects.equals(this.carteira, convenioPersist.carteira) &&
        Objects.equals(this.codigoCedente, convenioPersist.codigoCedente) &&
        Objects.equals(this.especieTipo, convenioPersist.especieTipo) &&
        Objects.equals(this.especieDocumento, convenioPersist.especieDocumento) &&
        Objects.equals(this.aceite, convenioPersist.aceite) &&
        Objects.equals(this.instrucoes, convenioPersist.instrucoes) &&
        Objects.equals(this.localPagamento1, convenioPersist.localPagamento1) &&
        Objects.equals(this.localPagamento2, convenioPersist.localPagamento2) &&
        Objects.equals(this.enderecoCobrancaEmissor, convenioPersist.enderecoCobrancaEmissor) &&
        Objects.equals(this.nomeBeneficiario, convenioPersist.nomeBeneficiario) &&
        Objects.equals(this.cnpjBeneficiario, convenioPersist.cnpjBeneficiario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(banco, agencia, contaCorrente, especie, numeroConvenio, carteira, codigoCedente, especieTipo, especieDocumento, aceite, instrucoes, localPagamento1, localPagamento2, enderecoCobrancaEmissor, nomeBeneficiario, cnpjBeneficiario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvenioPersist {\n");
    
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    contaCorrente: ").append(toIndentedString(contaCorrente)).append("\n");
    sb.append("    especie: ").append(toIndentedString(especie)).append("\n");
    sb.append("    numeroConvenio: ").append(toIndentedString(numeroConvenio)).append("\n");
    sb.append("    carteira: ").append(toIndentedString(carteira)).append("\n");
    sb.append("    codigoCedente: ").append(toIndentedString(codigoCedente)).append("\n");
    sb.append("    especieTipo: ").append(toIndentedString(especieTipo)).append("\n");
    sb.append("    especieDocumento: ").append(toIndentedString(especieDocumento)).append("\n");
    sb.append("    aceite: ").append(toIndentedString(aceite)).append("\n");
    sb.append("    instrucoes: ").append(toIndentedString(instrucoes)).append("\n");
    sb.append("    localPagamento1: ").append(toIndentedString(localPagamento1)).append("\n");
    sb.append("    localPagamento2: ").append(toIndentedString(localPagamento2)).append("\n");
    sb.append("    enderecoCobrancaEmissor: ").append(toIndentedString(enderecoCobrancaEmissor)).append("\n");
    sb.append("    nomeBeneficiario: ").append(toIndentedString(nomeBeneficiario)).append("\n");
    sb.append("    cnpjBeneficiario: ").append(toIndentedString(cnpjBeneficiario)).append("\n");
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

