package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Request Object for response Convenant
 **/

@ApiModel(description = "Request Object for response Convenant")
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
   * Convenant Id
   **/
  public ConvenioResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Convenant Id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Bank Id
   **/
  public ConvenioResponse banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Bank Id")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * agency Number
   **/
  public ConvenioResponse agencia(Long agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "agency Number")
  @JsonProperty("agencia")
  public Long getAgencia() {
    return agencia;
  }
  public void setAgencia(Long agencia) {
    this.agencia = agencia;
  }

  
  /**
   * Current Account
   **/
  public ConvenioResponse contaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current Account")
  @JsonProperty("contaCorrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * Species Code
   **/
  public ConvenioResponse especie(String especie) {
    this.especie = especie;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Species Code")
  @JsonProperty("especie")
  public String getEspecie() {
    return especie;
  }
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  
  /**
   * Covenant Number
   **/
  public ConvenioResponse numeroConvenio(BigDecimal numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Covenant Number")
  @JsonProperty("numeroConvenio")
  public BigDecimal getNumeroConvenio() {
    return numeroConvenio;
  }
  public void setNumeroConvenio(BigDecimal numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  
  /**
   * Wallet
   **/
  public ConvenioResponse carteira(Long carteira) {
    this.carteira = carteira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Wallet")
  @JsonProperty("carteira")
  public Long getCarteira() {
    return carteira;
  }
  public void setCarteira(Long carteira) {
    this.carteira = carteira;
  }

  
  /**
   * Assignor code
   **/
  public ConvenioResponse codigoCedente(String codigoCedente) {
    this.codigoCedente = codigoCedente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Assignor code")
  @JsonProperty("codigoCedente")
  public String getCodigoCedente() {
    return codigoCedente;
  }
  public void setCodigoCedente(String codigoCedente) {
    this.codigoCedente = codigoCedente;
  }

  
  /**
   * Species Type
   **/
  public ConvenioResponse especieTipo(String especieTipo) {
    this.especieTipo = especieTipo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Species Type")
  @JsonProperty("especieTipo")
  public String getEspecieTipo() {
    return especieTipo;
  }
  public void setEspecieTipo(String especieTipo) {
    this.especieTipo = especieTipo;
  }

  
  /**
   * Species Document
   **/
  public ConvenioResponse especieDocumento(String especieDocumento) {
    this.especieDocumento = especieDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Species Document")
  @JsonProperty("especieDocumento")
  public String getEspecieDocumento() {
    return especieDocumento;
  }
  public void setEspecieDocumento(String especieDocumento) {
    this.especieDocumento = especieDocumento;
  }

  
  /**
   * payer signed the billing document that originated the ticket. The default value is N
   **/
  public ConvenioResponse aceite(String aceite) {
    this.aceite = aceite;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "payer signed the billing document that originated the ticket. The default value is N")
  @JsonProperty("aceite")
  public String getAceite() {
    return aceite;
  }
  public void setAceite(String aceite) {
    this.aceite = aceite;
  }

  
  /**
   * Instructions for payment
   **/
  public ConvenioResponse instrucoes(String instrucoes) {
    this.instrucoes = instrucoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Instructions for payment")
  @JsonProperty("instrucoes")
  public String getInstrucoes() {
    return instrucoes;
  }
  public void setInstrucoes(String instrucoes) {
    this.instrucoes = instrucoes;
  }

  
  /**
   * Prefencial Place for payment
   **/
  public ConvenioResponse localPagamento1(String localPagamento1) {
    this.localPagamento1 = localPagamento1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Prefencial Place for payment")
  @JsonProperty("localPagamento1")
  public String getLocalPagamento1() {
    return localPagamento1;
  }
  public void setLocalPagamento1(String localPagamento1) {
    this.localPagamento1 = localPagamento1;
  }

  
  /**
   * Prefencial Place for payment
   **/
  public ConvenioResponse localPagamento2(String localPagamento2) {
    this.localPagamento2 = localPagamento2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Prefencial Place for payment")
  @JsonProperty("localPagamento2")
  public String getLocalPagamento2() {
    return localPagamento2;
  }
  public void setLocalPagamento2(String localPagamento2) {
    this.localPagamento2 = localPagamento2;
  }

  
  /**
   * Charge Address
   **/
  public ConvenioResponse enderecoCobrancaEmissor(String enderecoCobrancaEmissor) {
    this.enderecoCobrancaEmissor = enderecoCobrancaEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Charge Address")
  @JsonProperty("enderecoCobrancaEmissor")
  public String getEnderecoCobrancaEmissor() {
    return enderecoCobrancaEmissor;
  }
  public void setEnderecoCobrancaEmissor(String enderecoCobrancaEmissor) {
    this.enderecoCobrancaEmissor = enderecoCobrancaEmissor;
  }

  
  /**
   * Beneficiary Name
   **/
  public ConvenioResponse nomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Beneficiary Name")
  @JsonProperty("nomeBeneficiario")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * Beneficiary CNPJ
   **/
  public ConvenioResponse cnpjBeneficiario(String cnpjBeneficiario) {
    this.cnpjBeneficiario = cnpjBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Beneficiary CNPJ")
  @JsonProperty("cnpjBeneficiario")
  public String getCnpjBeneficiario() {
    return cnpjBeneficiario;
  }
  public void setCnpjBeneficiario(String cnpjBeneficiario) {
    this.cnpjBeneficiario = cnpjBeneficiario;
  }

  
  /**
   * Responsable User from Convenant register or update
   **/
  public ConvenioResponse operador(String operador) {
    this.operador = operador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Responsable User from Convenant register or update")
  @JsonProperty("operador")
  public String getOperador() {
    return operador;
  }
  public void setOperador(String operador) {
    this.operador = operador;
  }

  
  /**
   * Created/Update Date
   **/
  public ConvenioResponse data(String data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Created/Update Date")
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  
  /**
   * Used Machine
   **/
  public ConvenioResponse maquina(String maquina) {
    this.maquina = maquina;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Used Machine")
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

