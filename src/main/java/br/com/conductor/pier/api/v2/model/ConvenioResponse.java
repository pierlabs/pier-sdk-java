package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto Conv\u00EAnio
 **/

@ApiModel(description = "Objeto Conv\u00EAnio")
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
   * Id do conv\u00EAnio.
   **/
  public ConvenioResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do conv\u00EAnio.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identifica\u00E7\u00E3o do banco.
   **/
  public ConvenioResponse banco(Long banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifica\u00E7\u00E3o do banco.")
  @JsonProperty("banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * N\u00FAmero da ag\u00EAncia.
   **/
  public ConvenioResponse agencia(Long agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da ag\u00EAncia.")
  @JsonProperty("agencia")
  public Long getAgencia() {
    return agencia;
  }
  public void setAgencia(Long agencia) {
    this.agencia = agencia;
  }

  
  /**
   * Conta corrente.
   **/
  public ConvenioResponse contaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conta corrente.")
  @JsonProperty("contaCorrente")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * C\u00F3digo do tipo de esp\u00E9cie do documento.
   **/
  public ConvenioResponse especie(String especie) {
    this.especie = especie;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo do tipo de esp\u00E9cie do documento.")
  @JsonProperty("especie")
  public String getEspecie() {
    return especie;
  }
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do conv\u00EAnio.
   **/
  public ConvenioResponse numeroConvenio(BigDecimal numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do conv\u00EAnio.")
  @JsonProperty("numeroConvenio")
  public BigDecimal getNumeroConvenio() {
    return numeroConvenio;
  }
  public void setNumeroConvenio(BigDecimal numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  
  /**
   * C\u00F3digo da carteira de cobran\u00E7a.
   **/
  public ConvenioResponse carteira(Long carteira) {
    this.carteira = carteira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo da carteira de cobran\u00E7a.")
  @JsonProperty("carteira")
  public Long getCarteira() {
    return carteira;
  }
  public void setCarteira(Long carteira) {
    this.carteira = carteira;
  }

  
  /**
   * C\u00F3digo do cedente.
   **/
  public ConvenioResponse codigoCedente(String codigoCedente) {
    this.codigoCedente = codigoCedente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo do cedente.")
  @JsonProperty("codigoCedente")
  public String getCodigoCedente() {
    return codigoCedente;
  }
  public void setCodigoCedente(String codigoCedente) {
    this.codigoCedente = codigoCedente;
  }

  
  /**
   * Tipo de esp\u00E9cie de t\u00EDtulo de cr\u00E9dito.
   **/
  public ConvenioResponse especieTipo(String especieTipo) {
    this.especieTipo = especieTipo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo de esp\u00E9cie de t\u00EDtulo de cr\u00E9dito.")
  @JsonProperty("especieTipo")
  public String getEspecieTipo() {
    return especieTipo;
  }
  public void setEspecieTipo(String especieTipo) {
    this.especieTipo = especieTipo;
  }

  
  /**
   * Esp\u00E9cie do documento.
   **/
  public ConvenioResponse especieDocumento(String especieDocumento) {
    this.especieDocumento = especieDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Esp\u00E9cie do documento.")
  @JsonProperty("especieDocumento")
  public String getEspecieDocumento() {
    return especieDocumento;
  }
  public void setEspecieDocumento(String especieDocumento) {
    this.especieDocumento = especieDocumento;
  }

  
  /**
   * Indica se o pagador assinou o documento de cobran\u00E7a que originou o boleto. O padr\u00E3o \u00E9 usar \"N\".
   **/
  public ConvenioResponse aceite(String aceite) {
    this.aceite = aceite;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indica se o pagador assinou o documento de cobran\u00E7a que originou o boleto. O padr\u00E3o \u00E9 usar \"N\".")
  @JsonProperty("aceite")
  public String getAceite() {
    return aceite;
  }
  public void setAceite(String aceite) {
    this.aceite = aceite;
  }

  
  /**
   * Instru\u00E7\u00F5es para pagamento.
   **/
  public ConvenioResponse instrucoes(String instrucoes) {
    this.instrucoes = instrucoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Instru\u00E7\u00F5es para pagamento.")
  @JsonProperty("instrucoes")
  public String getInstrucoes() {
    return instrucoes;
  }
  public void setInstrucoes(String instrucoes) {
    this.instrucoes = instrucoes;
  }

  
  /**
   * Local preferencial onde pode ser efetuado o pagamento.
   **/
  public ConvenioResponse localPagamento1(String localPagamento1) {
    this.localPagamento1 = localPagamento1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Local preferencial onde pode ser efetuado o pagamento.")
  @JsonProperty("localPagamento1")
  public String getLocalPagamento1() {
    return localPagamento1;
  }
  public void setLocalPagamento1(String localPagamento1) {
    this.localPagamento1 = localPagamento1;
  }

  
  /**
   * Local para pagamento (campo adicional).
   **/
  public ConvenioResponse localPagamento2(String localPagamento2) {
    this.localPagamento2 = localPagamento2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Local para pagamento (campo adicional).")
  @JsonProperty("localPagamento2")
  public String getLocalPagamento2() {
    return localPagamento2;
  }
  public void setLocalPagamento2(String localPagamento2) {
    this.localPagamento2 = localPagamento2;
  }

  
  /**
   * Endere\u00E7o de cobran\u00E7a do emissor.
   **/
  public ConvenioResponse enderecoCobrancaEmissor(String enderecoCobrancaEmissor) {
    this.enderecoCobrancaEmissor = enderecoCobrancaEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Endere\u00E7o de cobran\u00E7a do emissor.")
  @JsonProperty("enderecoCobrancaEmissor")
  public String getEnderecoCobrancaEmissor() {
    return enderecoCobrancaEmissor;
  }
  public void setEnderecoCobrancaEmissor(String enderecoCobrancaEmissor) {
    this.enderecoCobrancaEmissor = enderecoCobrancaEmissor;
  }

  
  /**
   * Nome do benefici\u00E1rio/cedente da cobran\u00E7a.
   **/
  public ConvenioResponse nomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do benefici\u00E1rio/cedente da cobran\u00E7a.")
  @JsonProperty("nomeBeneficiario")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * CNPJ do benefici\u00E1rio/cedente da cobran\u00E7a.
   **/
  public ConvenioResponse cnpjBeneficiario(String cnpjBeneficiario) {
    this.cnpjBeneficiario = cnpjBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CNPJ do benefici\u00E1rio/cedente da cobran\u00E7a.")
  @JsonProperty("cnpjBeneficiario")
  public String getCnpjBeneficiario() {
    return cnpjBeneficiario;
  }
  public void setCnpjBeneficiario(String cnpjBeneficiario) {
    this.cnpjBeneficiario = cnpjBeneficiario;
  }

  
  /**
   * Usu\u00E1rio responsavel pelo cadastro e/ou altera\u00E7\u00E3o do conv\u00EAnio.
   **/
  public ConvenioResponse operador(String operador) {
    this.operador = operador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Usu\u00E1rio responsavel pelo cadastro e/ou altera\u00E7\u00E3o do conv\u00EAnio.")
  @JsonProperty("operador")
  public String getOperador() {
    return operador;
  }
  public void setOperador(String operador) {
    this.operador = operador;
  }

  
  /**
   * Data de cadastro/altera\u00E7\u00E3o do conv\u00EAnio.
   **/
  public ConvenioResponse data(String data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de cadastro/altera\u00E7\u00E3o do conv\u00EAnio.")
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  
  /**
   * M\u00E1quina pela qual foi realizado o cadastro ou altera\u00E7\u00E3o.
   **/
  public ConvenioResponse maquina(String maquina) {
    this.maquina = maquina;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "M\u00E1quina pela qual foi realizado o cadastro ou altera\u00E7\u00E3o.")
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

