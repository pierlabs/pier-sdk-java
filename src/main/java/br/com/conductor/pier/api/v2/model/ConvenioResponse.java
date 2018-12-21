package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{convenio_response_description}}}
 **/

@ApiModel(description = "{{{convenio_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ConvenioResponse   {
  
  private Long id = null;
  private Long banco = null;
  private Long agencia = null;
  private String contaCorrente = null;
  private String especie = null;
  private BigDecimal numeroConvenio = null;
  private Long carteira = null;
  private String codigoCedente = null;
  private String especieTipo = null;
  private String especieDocumento = null;
  private String aceite = null;
  private String instrucoes = null;
  private String localPagamento1 = null;
  private String localPagamento2 = null;
  private String enderecoCobrancaEmissor = null;
  private String nomeBeneficiario = null;
  private String cnpjBeneficiario = null;
  private String operador = null;
  private String data = null;
  private String maquina = null;

  
  /**
   * {{{convenio_response_id_convenio}}}
   **/
  public ConvenioResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_id_convenio}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{convenio_response_banco_value}}}
   **/
  public ConvenioResponse banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_banco_value}}}")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * {{{convenio_response_agencia_value}}}
   **/
  public ConvenioResponse agencia(Long agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_agencia_value}}}")
  @JsonProperty("agencia")
  public Long getAgencia() {
    return agencia;
  }
  public void setAgencia(Long agencia) {
    this.agencia = agencia;
  }

  
  /**
   * {{{convenio_response_conta_corrente_value}}}
   **/
  public ConvenioResponse contaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_conta_corrente_value}}}")
  @JsonProperty("contaCorrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * {{{convenio_response_especie_value}}}
   **/
  public ConvenioResponse especie(String especie) {
    this.especie = especie;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_especie_value}}}")
  @JsonProperty("especie")
  public String getEspecie() {
    return especie;
  }
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  
  /**
   * {{{convenio_response_numero_convenio_value}}}
   **/
  public ConvenioResponse numeroConvenio(BigDecimal numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_numero_convenio_value}}}")
  @JsonProperty("numeroConvenio")
  public BigDecimal getNumeroConvenio() {
    return numeroConvenio;
  }
  public void setNumeroConvenio(BigDecimal numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  
  /**
   * {{{convenio_response_carteira_value}}}
   **/
  public ConvenioResponse carteira(Long carteira) {
    this.carteira = carteira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_carteira_value}}}")
  @JsonProperty("carteira")
  public Long getCarteira() {
    return carteira;
  }
  public void setCarteira(Long carteira) {
    this.carteira = carteira;
  }

  
  /**
   * {{{convenio_response_codigo_cedente_value}}}
   **/
  public ConvenioResponse codigoCedente(String codigoCedente) {
    this.codigoCedente = codigoCedente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_codigo_cedente_value}}}")
  @JsonProperty("codigoCedente")
  public String getCodigoCedente() {
    return codigoCedente;
  }
  public void setCodigoCedente(String codigoCedente) {
    this.codigoCedente = codigoCedente;
  }

  
  /**
   * {{{convenio_response_especie_tipo_value}}}
   **/
  public ConvenioResponse especieTipo(String especieTipo) {
    this.especieTipo = especieTipo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_especie_tipo_value}}}")
  @JsonProperty("especieTipo")
  public String getEspecieTipo() {
    return especieTipo;
  }
  public void setEspecieTipo(String especieTipo) {
    this.especieTipo = especieTipo;
  }

  
  /**
   * {{{convenio_response_especie_documento_value}}}
   **/
  public ConvenioResponse especieDocumento(String especieDocumento) {
    this.especieDocumento = especieDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_especie_documento_value}}}")
  @JsonProperty("especieDocumento")
  public String getEspecieDocumento() {
    return especieDocumento;
  }
  public void setEspecieDocumento(String especieDocumento) {
    this.especieDocumento = especieDocumento;
  }

  
  /**
   * {{{convenio_response_aceite_value}}}
   **/
  public ConvenioResponse aceite(String aceite) {
    this.aceite = aceite;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_aceite_value}}}")
  @JsonProperty("aceite")
  public String getAceite() {
    return aceite;
  }
  public void setAceite(String aceite) {
    this.aceite = aceite;
  }

  
  /**
   * {{{convenio_response_instrucoes_value}}}
   **/
  public ConvenioResponse instrucoes(String instrucoes) {
    this.instrucoes = instrucoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_instrucoes_value}}}")
  @JsonProperty("instrucoes")
  public String getInstrucoes() {
    return instrucoes;
  }
  public void setInstrucoes(String instrucoes) {
    this.instrucoes = instrucoes;
  }

  
  /**
   * {{{convenio_response_local_pagamento1_value}}}
   **/
  public ConvenioResponse localPagamento1(String localPagamento1) {
    this.localPagamento1 = localPagamento1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_local_pagamento1_value}}}")
  @JsonProperty("localPagamento1")
  public String getLocalPagamento1() {
    return localPagamento1;
  }
  public void setLocalPagamento1(String localPagamento1) {
    this.localPagamento1 = localPagamento1;
  }

  
  /**
   * {{{convenio_response_local_pagamento2_value}}}
   **/
  public ConvenioResponse localPagamento2(String localPagamento2) {
    this.localPagamento2 = localPagamento2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_local_pagamento2_value}}}")
  @JsonProperty("localPagamento2")
  public String getLocalPagamento2() {
    return localPagamento2;
  }
  public void setLocalPagamento2(String localPagamento2) {
    this.localPagamento2 = localPagamento2;
  }

  
  /**
   * {{{convenio_response_endereco_cobranca_emissor_value}}}
   **/
  public ConvenioResponse enderecoCobrancaEmissor(String enderecoCobrancaEmissor) {
    this.enderecoCobrancaEmissor = enderecoCobrancaEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_endereco_cobranca_emissor_value}}}")
  @JsonProperty("enderecoCobrancaEmissor")
  public String getEnderecoCobrancaEmissor() {
    return enderecoCobrancaEmissor;
  }
  public void setEnderecoCobrancaEmissor(String enderecoCobrancaEmissor) {
    this.enderecoCobrancaEmissor = enderecoCobrancaEmissor;
  }

  
  /**
   * {{{convenio_response_nome_beneficiario_emissor_value}}}
   **/
  public ConvenioResponse nomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_nome_beneficiario_emissor_value}}}")
  @JsonProperty("nomeBeneficiario")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * {{{convenio_response_cnpj_beneficiario_emissor_value}}}
   **/
  public ConvenioResponse cnpjBeneficiario(String cnpjBeneficiario) {
    this.cnpjBeneficiario = cnpjBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_cnpj_beneficiario_emissor_value}}}")
  @JsonProperty("cnpjBeneficiario")
  public String getCnpjBeneficiario() {
    return cnpjBeneficiario;
  }
  public void setCnpjBeneficiario(String cnpjBeneficiario) {
    this.cnpjBeneficiario = cnpjBeneficiario;
  }

  
  /**
   * {{{convenio_response_operador_value}}}
   **/
  public ConvenioResponse operador(String operador) {
    this.operador = operador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_operador_value}}}")
  @JsonProperty("operador")
  public String getOperador() {
    return operador;
  }
  public void setOperador(String operador) {
    this.operador = operador;
  }

  
  /**
   * {{{convenio_response_data_value}}}
   **/
  public ConvenioResponse data(String data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_data_value}}}")
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  
  /**
   * {{{convenio_response_maquina_value}}}
   **/
  public ConvenioResponse maquina(String maquina) {
    this.maquina = maquina;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{convenio_response_maquina_value}}}")
  @JsonProperty("maquina")
  public String getMaquina() {
    return maquina;
  }
  public void setMaquina(String maquina) {
    this.maquina = maquina;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvenioResponse convenioResponse = (ConvenioResponse) o;
    return Objects.equals(this.id, convenioResponse.id) &&
        Objects.equals(this.banco, convenioResponse.banco) &&
        Objects.equals(this.agencia, convenioResponse.agencia) &&
        Objects.equals(this.contaCorrente, convenioResponse.contaCorrente) &&
        Objects.equals(this.especie, convenioResponse.especie) &&
        Objects.equals(this.numeroConvenio, convenioResponse.numeroConvenio) &&
        Objects.equals(this.carteira, convenioResponse.carteira) &&
        Objects.equals(this.codigoCedente, convenioResponse.codigoCedente) &&
        Objects.equals(this.especieTipo, convenioResponse.especieTipo) &&
        Objects.equals(this.especieDocumento, convenioResponse.especieDocumento) &&
        Objects.equals(this.aceite, convenioResponse.aceite) &&
        Objects.equals(this.instrucoes, convenioResponse.instrucoes) &&
        Objects.equals(this.localPagamento1, convenioResponse.localPagamento1) &&
        Objects.equals(this.localPagamento2, convenioResponse.localPagamento2) &&
        Objects.equals(this.enderecoCobrancaEmissor, convenioResponse.enderecoCobrancaEmissor) &&
        Objects.equals(this.nomeBeneficiario, convenioResponse.nomeBeneficiario) &&
        Objects.equals(this.cnpjBeneficiario, convenioResponse.cnpjBeneficiario) &&
        Objects.equals(this.operador, convenioResponse.operador) &&
        Objects.equals(this.data, convenioResponse.data) &&
        Objects.equals(this.maquina, convenioResponse.maquina);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, banco, agencia, contaCorrente, especie, numeroConvenio, carteira, codigoCedente, especieTipo, especieDocumento, aceite, instrucoes, localPagamento1, localPagamento2, enderecoCobrancaEmissor, nomeBeneficiario, cnpjBeneficiario, operador, data, maquina);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvenioResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    sb.append("    operador: ").append(toIndentedString(operador)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    maquina: ").append(toIndentedString(maquina)).append("\n");
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

