package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{boleto_response_description}}}
 **/

@ApiModel(description = "{{{boleto_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BoletoResponse   {
  
  private String numeroDoDocumento = null;
  private String dataProcessamento = null;
  private String dataDocumento = null;
  private String dataVencimento = null;
  private String dataFechamento = null;
  private BigDecimal valorBoleto = null;
  private String nomeBeneficiario = null;
  private String documentoBeneficiario = null;
  private String agencia = null;
  private String codigoBeneficiario = null;
  private String numeroConvenio = null;
  private String digitoCodigoBeneficiario = null;
  private String carteira = null;
  private String nossoNumero = null;
  private String digitoNossoNumero = null;
  private String banco = null;
  private Boolean aceite = null;
  private String especieDoDocumento = null;
  private String especie = null;
  private List<String> instrucoes = new ArrayList<String>();
  private List<String> locaisDePagamento = new ArrayList<String>();
  private String nomePagador = null;
  private String documentoPagador = null;
  private String logradouroPagador = null;
  private String bairroPagador = null;
  private String cepPagador = null;
  private String cidadePagador = null;
  private String ufPagador = null;
  private String codigoDeBarras = null;
  private String linhaDigitavel = null;
  private Long id = null;
  private Long idConta = null;
  private String enderecoCobrancaBeneficiario = null;
  private Long status = null;
  private Boolean boletoRegistrado = null;

  
  /**
   * {{{boleto_response_numero_do_documento_value}}}
   **/
  public BoletoResponse numeroDoDocumento(String numeroDoDocumento) {
    this.numeroDoDocumento = numeroDoDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_numero_do_documento_value}}}")
  @JsonProperty("numeroDoDocumento")
  public String getNumeroDoDocumento() {
    return numeroDoDocumento;
  }
  public void setNumeroDoDocumento(String numeroDoDocumento) {
    this.numeroDoDocumento = numeroDoDocumento;
  }

  
  /**
   * {{{boleto_response_data_processamento_value}}}
   **/
  public BoletoResponse dataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_data_processamento_value}}}")
  @JsonProperty("dataProcessamento")
  public String getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * {{{boleto_response_data_documento_value}}}
   **/
  public BoletoResponse dataDocumento(String dataDocumento) {
    this.dataDocumento = dataDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_data_documento_value}}}")
  @JsonProperty("dataDocumento")
  public String getDataDocumento() {
    return dataDocumento;
  }
  public void setDataDocumento(String dataDocumento) {
    this.dataDocumento = dataDocumento;
  }

  
  /**
   * {{{boleto_response_data_vencimento_value}}}
   **/
  public BoletoResponse dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_data_vencimento_value}}}")
  @JsonProperty("dataVencimento")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * {{{boleto_response_data_fechamento_value}}}
   **/
  public BoletoResponse dataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_data_fechamento_value}}}")
  @JsonProperty("dataFechamento")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * {{{boleto_response_valor_boleto_value}}}
   **/
  public BoletoResponse valorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_valor_boleto_value}}}")
  @JsonProperty("valorBoleto")
  public BigDecimal getValorBoleto() {
    return valorBoleto;
  }
  public void setValorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
  }

  
  /**
   * {{{boleto_response_nome_beneficiario_value}}}
   **/
  public BoletoResponse nomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_nome_beneficiario_value}}}")
  @JsonProperty("nomeBeneficiario")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * {{{boleto_response_documento_beneficiario_value}}}
   **/
  public BoletoResponse documentoBeneficiario(String documentoBeneficiario) {
    this.documentoBeneficiario = documentoBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_documento_beneficiario_value}}}")
  @JsonProperty("documentoBeneficiario")
  public String getDocumentoBeneficiario() {
    return documentoBeneficiario;
  }
  public void setDocumentoBeneficiario(String documentoBeneficiario) {
    this.documentoBeneficiario = documentoBeneficiario;
  }

  
  /**
   * {{{boleto_response_agencia_value}}}
   **/
  public BoletoResponse agencia(String agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_agencia_value}}}")
  @JsonProperty("agencia")
  public String getAgencia() {
    return agencia;
  }
  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  
  /**
   * {{{boleto_response_codigo_beneficiario_value}}}
   **/
  public BoletoResponse codigoBeneficiario(String codigoBeneficiario) {
    this.codigoBeneficiario = codigoBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_codigo_beneficiario_value}}}")
  @JsonProperty("codigoBeneficiario")
  public String getCodigoBeneficiario() {
    return codigoBeneficiario;
  }
  public void setCodigoBeneficiario(String codigoBeneficiario) {
    this.codigoBeneficiario = codigoBeneficiario;
  }

  
  /**
   * {{{boleto_response_numero_convenio_value}}}
   **/
  public BoletoResponse numeroConvenio(String numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_numero_convenio_value}}}")
  @JsonProperty("numeroConvenio")
  public String getNumeroConvenio() {
    return numeroConvenio;
  }
  public void setNumeroConvenio(String numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  
  /**
   * {{{boleto_response_digito_codigo_beneficiario_value}}}
   **/
  public BoletoResponse digitoCodigoBeneficiario(String digitoCodigoBeneficiario) {
    this.digitoCodigoBeneficiario = digitoCodigoBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_digito_codigo_beneficiario_value}}}")
  @JsonProperty("digitoCodigoBeneficiario")
  public String getDigitoCodigoBeneficiario() {
    return digitoCodigoBeneficiario;
  }
  public void setDigitoCodigoBeneficiario(String digitoCodigoBeneficiario) {
    this.digitoCodigoBeneficiario = digitoCodigoBeneficiario;
  }

  
  /**
   * {{{boleto_response_carteira_value}}}
   **/
  public BoletoResponse carteira(String carteira) {
    this.carteira = carteira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_carteira_value}}}")
  @JsonProperty("carteira")
  public String getCarteira() {
    return carteira;
  }
  public void setCarteira(String carteira) {
    this.carteira = carteira;
  }

  
  /**
   * {{{boleto_response_nosso_numero_value}}}
   **/
  public BoletoResponse nossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_nosso_numero_value}}}")
  @JsonProperty("nossoNumero")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * {{{boleto_response_digito_nosso_numero_value}}}
   **/
  public BoletoResponse digitoNossoNumero(String digitoNossoNumero) {
    this.digitoNossoNumero = digitoNossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_digito_nosso_numero_value}}}")
  @JsonProperty("digitoNossoNumero")
  public String getDigitoNossoNumero() {
    return digitoNossoNumero;
  }
  public void setDigitoNossoNumero(String digitoNossoNumero) {
    this.digitoNossoNumero = digitoNossoNumero;
  }

  
  /**
   * {{{boleto_response_banco_value}}}
   **/
  public BoletoResponse banco(String banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_banco_value}}}")
  @JsonProperty("banco")
  public String getBanco() {
    return banco;
  }
  public void setBanco(String banco) {
    this.banco = banco;
  }

  
  /**
   * {{{boleto_response_aceite_value}}}
   **/
  public BoletoResponse aceite(Boolean aceite) {
    this.aceite = aceite;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{boleto_response_aceite_value}}}")
  @JsonProperty("aceite")
  public Boolean getAceite() {
    return aceite;
  }
  public void setAceite(Boolean aceite) {
    this.aceite = aceite;
  }

  
  /**
   * {{{boleto_response_especie_do_documento_value}}}
   **/
  public BoletoResponse especieDoDocumento(String especieDoDocumento) {
    this.especieDoDocumento = especieDoDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_especie_do_documento_value}}}")
  @JsonProperty("especieDoDocumento")
  public String getEspecieDoDocumento() {
    return especieDoDocumento;
  }
  public void setEspecieDoDocumento(String especieDoDocumento) {
    this.especieDoDocumento = especieDoDocumento;
  }

  
  /**
   * {{{boleto_response_especie_value}}}
   **/
  public BoletoResponse especie(String especie) {
    this.especie = especie;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_especie_value}}}")
  @JsonProperty("especie")
  public String getEspecie() {
    return especie;
  }
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  
  /**
   * {{{boleto_response_instrucoes_value}}}
   **/
  public BoletoResponse instrucoes(List<String> instrucoes) {
    this.instrucoes = instrucoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_instrucoes_value}}}")
  @JsonProperty("instrucoes")
  public List<String> getInstrucoes() {
    return instrucoes;
  }
  public void setInstrucoes(List<String> instrucoes) {
    this.instrucoes = instrucoes;
  }

  
  /**
   * {{{boleto_response_locais_de_pagamento_value}}}
   **/
  public BoletoResponse locaisDePagamento(List<String> locaisDePagamento) {
    this.locaisDePagamento = locaisDePagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_locais_de_pagamento_value}}}")
  @JsonProperty("locaisDePagamento")
  public List<String> getLocaisDePagamento() {
    return locaisDePagamento;
  }
  public void setLocaisDePagamento(List<String> locaisDePagamento) {
    this.locaisDePagamento = locaisDePagamento;
  }

  
  /**
   * {{{boleto_response_nome_pagador_value}}}
   **/
  public BoletoResponse nomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_nome_pagador_value}}}")
  @JsonProperty("nomePagador")
  public String getNomePagador() {
    return nomePagador;
  }
  public void setNomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
  }

  
  /**
   * {{{boleto_response_documento_pagador_value}}}
   **/
  public BoletoResponse documentoPagador(String documentoPagador) {
    this.documentoPagador = documentoPagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_documento_pagador_value}}}")
  @JsonProperty("documentoPagador")
  public String getDocumentoPagador() {
    return documentoPagador;
  }
  public void setDocumentoPagador(String documentoPagador) {
    this.documentoPagador = documentoPagador;
  }

  
  /**
   * {{{boleto_response_logradouro_pagador_value}}}
   **/
  public BoletoResponse logradouroPagador(String logradouroPagador) {
    this.logradouroPagador = logradouroPagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_logradouro_pagador_value}}}")
  @JsonProperty("logradouroPagador")
  public String getLogradouroPagador() {
    return logradouroPagador;
  }
  public void setLogradouroPagador(String logradouroPagador) {
    this.logradouroPagador = logradouroPagador;
  }

  
  /**
   * {{{boleto_response_bairro_pagador_value}}}
   **/
  public BoletoResponse bairroPagador(String bairroPagador) {
    this.bairroPagador = bairroPagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_bairro_pagador_value}}}")
  @JsonProperty("bairroPagador")
  public String getBairroPagador() {
    return bairroPagador;
  }
  public void setBairroPagador(String bairroPagador) {
    this.bairroPagador = bairroPagador;
  }

  
  /**
   * {{{boleto_response_cep_pagador_value}}}
   **/
  public BoletoResponse cepPagador(String cepPagador) {
    this.cepPagador = cepPagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_cep_pagador_value}}}")
  @JsonProperty("cepPagador")
  public String getCepPagador() {
    return cepPagador;
  }
  public void setCepPagador(String cepPagador) {
    this.cepPagador = cepPagador;
  }

  
  /**
   * {{{boleto_response_cidade_pagador_value}}}
   **/
  public BoletoResponse cidadePagador(String cidadePagador) {
    this.cidadePagador = cidadePagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_cidade_pagador_value}}}")
  @JsonProperty("cidadePagador")
  public String getCidadePagador() {
    return cidadePagador;
  }
  public void setCidadePagador(String cidadePagador) {
    this.cidadePagador = cidadePagador;
  }

  
  /**
   * {{{boleto_response_uf_pagador_value}}}
   **/
  public BoletoResponse ufPagador(String ufPagador) {
    this.ufPagador = ufPagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_uf_pagador_value}}}")
  @JsonProperty("ufPagador")
  public String getUfPagador() {
    return ufPagador;
  }
  public void setUfPagador(String ufPagador) {
    this.ufPagador = ufPagador;
  }

  
  /**
   * {{{boleto_response_codigo_de_barras_value}}}
   **/
  public BoletoResponse codigoDeBarras(String codigoDeBarras) {
    this.codigoDeBarras = codigoDeBarras;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_codigo_de_barras_value}}}")
  @JsonProperty("codigoDeBarras")
  public String getCodigoDeBarras() {
    return codigoDeBarras;
  }
  public void setCodigoDeBarras(String codigoDeBarras) {
    this.codigoDeBarras = codigoDeBarras;
  }

  
  /**
   * {{{boleto_response_linha_digitavel_value}}}
   **/
  public BoletoResponse linhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_linha_digitavel_value}}}")
  @JsonProperty("linhaDigitavel")
  public String getLinhaDigitavel() {
    return linhaDigitavel;
  }
  public void setLinhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
  }

  
  /**
   * {{{boleto_response_id_value}}}
   **/
  public BoletoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{boleto_response_id_conta_value}}}
   **/
  public BoletoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{boleto_response_endereco_cobranca_beneficiario_value}}}
   **/
  public BoletoResponse enderecoCobrancaBeneficiario(String enderecoCobrancaBeneficiario) {
    this.enderecoCobrancaBeneficiario = enderecoCobrancaBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_endereco_cobranca_beneficiario_value}}}")
  @JsonProperty("enderecoCobrancaBeneficiario")
  public String getEnderecoCobrancaBeneficiario() {
    return enderecoCobrancaBeneficiario;
  }
  public void setEnderecoCobrancaBeneficiario(String enderecoCobrancaBeneficiario) {
    this.enderecoCobrancaBeneficiario = enderecoCobrancaBeneficiario;
  }

  
  /**
   * {{{boleto_response_status_value}}}
   **/
  public BoletoResponse status(Long status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_response_status_value}}}")
  @JsonProperty("status")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  
  /**
   * {{{boleto_response_registrado_value}}}
   **/
  public BoletoResponse boletoRegistrado(Boolean boletoRegistrado) {
    this.boletoRegistrado = boletoRegistrado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{boleto_response_registrado_value}}}")
  @JsonProperty("boletoRegistrado")
  public Boolean getBoletoRegistrado() {
    return boletoRegistrado;
  }
  public void setBoletoRegistrado(Boolean boletoRegistrado) {
    this.boletoRegistrado = boletoRegistrado;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoletoResponse boletoResponse = (BoletoResponse) o;
    return Objects.equals(this.numeroDoDocumento, boletoResponse.numeroDoDocumento) &&
        Objects.equals(this.dataProcessamento, boletoResponse.dataProcessamento) &&
        Objects.equals(this.dataDocumento, boletoResponse.dataDocumento) &&
        Objects.equals(this.dataVencimento, boletoResponse.dataVencimento) &&
        Objects.equals(this.dataFechamento, boletoResponse.dataFechamento) &&
        Objects.equals(this.valorBoleto, boletoResponse.valorBoleto) &&
        Objects.equals(this.nomeBeneficiario, boletoResponse.nomeBeneficiario) &&
        Objects.equals(this.documentoBeneficiario, boletoResponse.documentoBeneficiario) &&
        Objects.equals(this.agencia, boletoResponse.agencia) &&
        Objects.equals(this.codigoBeneficiario, boletoResponse.codigoBeneficiario) &&
        Objects.equals(this.numeroConvenio, boletoResponse.numeroConvenio) &&
        Objects.equals(this.digitoCodigoBeneficiario, boletoResponse.digitoCodigoBeneficiario) &&
        Objects.equals(this.carteira, boletoResponse.carteira) &&
        Objects.equals(this.nossoNumero, boletoResponse.nossoNumero) &&
        Objects.equals(this.digitoNossoNumero, boletoResponse.digitoNossoNumero) &&
        Objects.equals(this.banco, boletoResponse.banco) &&
        Objects.equals(this.aceite, boletoResponse.aceite) &&
        Objects.equals(this.especieDoDocumento, boletoResponse.especieDoDocumento) &&
        Objects.equals(this.especie, boletoResponse.especie) &&
        Objects.equals(this.instrucoes, boletoResponse.instrucoes) &&
        Objects.equals(this.locaisDePagamento, boletoResponse.locaisDePagamento) &&
        Objects.equals(this.nomePagador, boletoResponse.nomePagador) &&
        Objects.equals(this.documentoPagador, boletoResponse.documentoPagador) &&
        Objects.equals(this.logradouroPagador, boletoResponse.logradouroPagador) &&
        Objects.equals(this.bairroPagador, boletoResponse.bairroPagador) &&
        Objects.equals(this.cepPagador, boletoResponse.cepPagador) &&
        Objects.equals(this.cidadePagador, boletoResponse.cidadePagador) &&
        Objects.equals(this.ufPagador, boletoResponse.ufPagador) &&
        Objects.equals(this.codigoDeBarras, boletoResponse.codigoDeBarras) &&
        Objects.equals(this.linhaDigitavel, boletoResponse.linhaDigitavel) &&
        Objects.equals(this.id, boletoResponse.id) &&
        Objects.equals(this.idConta, boletoResponse.idConta) &&
        Objects.equals(this.enderecoCobrancaBeneficiario, boletoResponse.enderecoCobrancaBeneficiario) &&
        Objects.equals(this.status, boletoResponse.status) &&
        Objects.equals(this.boletoRegistrado, boletoResponse.boletoRegistrado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroDoDocumento, dataProcessamento, dataDocumento, dataVencimento, dataFechamento, valorBoleto, nomeBeneficiario, documentoBeneficiario, agencia, codigoBeneficiario, numeroConvenio, digitoCodigoBeneficiario, carteira, nossoNumero, digitoNossoNumero, banco, aceite, especieDoDocumento, especie, instrucoes, locaisDePagamento, nomePagador, documentoPagador, logradouroPagador, bairroPagador, cepPagador, cidadePagador, ufPagador, codigoDeBarras, linhaDigitavel, id, idConta, enderecoCobrancaBeneficiario, status, boletoRegistrado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletoResponse {\n");
    
    sb.append("    numeroDoDocumento: ").append(toIndentedString(numeroDoDocumento)).append("\n");
    sb.append("    dataProcessamento: ").append(toIndentedString(dataProcessamento)).append("\n");
    sb.append("    dataDocumento: ").append(toIndentedString(dataDocumento)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    dataFechamento: ").append(toIndentedString(dataFechamento)).append("\n");
    sb.append("    valorBoleto: ").append(toIndentedString(valorBoleto)).append("\n");
    sb.append("    nomeBeneficiario: ").append(toIndentedString(nomeBeneficiario)).append("\n");
    sb.append("    documentoBeneficiario: ").append(toIndentedString(documentoBeneficiario)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    codigoBeneficiario: ").append(toIndentedString(codigoBeneficiario)).append("\n");
    sb.append("    numeroConvenio: ").append(toIndentedString(numeroConvenio)).append("\n");
    sb.append("    digitoCodigoBeneficiario: ").append(toIndentedString(digitoCodigoBeneficiario)).append("\n");
    sb.append("    carteira: ").append(toIndentedString(carteira)).append("\n");
    sb.append("    nossoNumero: ").append(toIndentedString(nossoNumero)).append("\n");
    sb.append("    digitoNossoNumero: ").append(toIndentedString(digitoNossoNumero)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    aceite: ").append(toIndentedString(aceite)).append("\n");
    sb.append("    especieDoDocumento: ").append(toIndentedString(especieDoDocumento)).append("\n");
    sb.append("    especie: ").append(toIndentedString(especie)).append("\n");
    sb.append("    instrucoes: ").append(toIndentedString(instrucoes)).append("\n");
    sb.append("    locaisDePagamento: ").append(toIndentedString(locaisDePagamento)).append("\n");
    sb.append("    nomePagador: ").append(toIndentedString(nomePagador)).append("\n");
    sb.append("    documentoPagador: ").append(toIndentedString(documentoPagador)).append("\n");
    sb.append("    logradouroPagador: ").append(toIndentedString(logradouroPagador)).append("\n");
    sb.append("    bairroPagador: ").append(toIndentedString(bairroPagador)).append("\n");
    sb.append("    cepPagador: ").append(toIndentedString(cepPagador)).append("\n");
    sb.append("    cidadePagador: ").append(toIndentedString(cidadePagador)).append("\n");
    sb.append("    ufPagador: ").append(toIndentedString(ufPagador)).append("\n");
    sb.append("    codigoDeBarras: ").append(toIndentedString(codigoDeBarras)).append("\n");
    sb.append("    linhaDigitavel: ").append(toIndentedString(linhaDigitavel)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    enderecoCobrancaBeneficiario: ").append(toIndentedString(enderecoCobrancaBeneficiario)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    boletoRegistrado: ").append(toIndentedString(boletoRegistrado)).append("\n");
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

