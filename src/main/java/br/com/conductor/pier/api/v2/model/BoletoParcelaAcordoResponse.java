package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{boleto_parcela_acordo_response_description}}}
 **/

@ApiModel(description = "{{{boleto_parcela_acordo_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class BoletoParcelaAcordoResponse   {
  
  private String numeroDocumento = null;
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
  private String especieDocumento = null;
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
   * {{{boleto_parcela_acordo_response_numero_documento_value}}}
   **/
  public BoletoParcelaAcordoResponse numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_numero_documento_value}}}")
  @JsonProperty("numeroDocumento")
  public String getNumeroDocumento() {
    return numeroDocumento;
  }
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_data_processamento_value}}}
   **/
  public BoletoParcelaAcordoResponse dataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_data_processamento_value}}}")
  @JsonProperty("dataProcessamento")
  public String getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_data_documento_value}}}
   **/
  public BoletoParcelaAcordoResponse dataDocumento(String dataDocumento) {
    this.dataDocumento = dataDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_data_documento_value}}}")
  @JsonProperty("dataDocumento")
  public String getDataDocumento() {
    return dataDocumento;
  }
  public void setDataDocumento(String dataDocumento) {
    this.dataDocumento = dataDocumento;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_data_vencimento_value}}}
   **/
  public BoletoParcelaAcordoResponse dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_data_vencimento_value}}}")
  @JsonProperty("dataVencimento")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_data_fechamento_value}}}
   **/
  public BoletoParcelaAcordoResponse dataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_data_fechamento_value}}}")
  @JsonProperty("dataFechamento")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_valor_boleto_value}}}
   **/
  public BoletoParcelaAcordoResponse valorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_valor_boleto_value}}}")
  @JsonProperty("valorBoleto")
  public BigDecimal getValorBoleto() {
    return valorBoleto;
  }
  public void setValorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_nome_beneficiario_value}}}
   **/
  public BoletoParcelaAcordoResponse nomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_nome_beneficiario_value}}}")
  @JsonProperty("nomeBeneficiario")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_documento_beneficiario_value}}}
   **/
  public BoletoParcelaAcordoResponse documentoBeneficiario(String documentoBeneficiario) {
    this.documentoBeneficiario = documentoBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_documento_beneficiario_value}}}")
  @JsonProperty("documentoBeneficiario")
  public String getDocumentoBeneficiario() {
    return documentoBeneficiario;
  }
  public void setDocumentoBeneficiario(String documentoBeneficiario) {
    this.documentoBeneficiario = documentoBeneficiario;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_agencia_value}}}
   **/
  public BoletoParcelaAcordoResponse agencia(String agencia) {
    this.agencia = agencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_agencia_value}}}")
  @JsonProperty("agencia")
  public String getAgencia() {
    return agencia;
  }
  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_codigo_beneficiario_value}}}
   **/
  public BoletoParcelaAcordoResponse codigoBeneficiario(String codigoBeneficiario) {
    this.codigoBeneficiario = codigoBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_codigo_beneficiario_value}}}")
  @JsonProperty("codigoBeneficiario")
  public String getCodigoBeneficiario() {
    return codigoBeneficiario;
  }
  public void setCodigoBeneficiario(String codigoBeneficiario) {
    this.codigoBeneficiario = codigoBeneficiario;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_numero_convenio_value}}}
   **/
  public BoletoParcelaAcordoResponse numeroConvenio(String numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_numero_convenio_value}}}")
  @JsonProperty("numeroConvenio")
  public String getNumeroConvenio() {
    return numeroConvenio;
  }
  public void setNumeroConvenio(String numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_digito_codigo_beneficiario_value}}}
   **/
  public BoletoParcelaAcordoResponse digitoCodigoBeneficiario(String digitoCodigoBeneficiario) {
    this.digitoCodigoBeneficiario = digitoCodigoBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_digito_codigo_beneficiario_value}}}")
  @JsonProperty("digitoCodigoBeneficiario")
  public String getDigitoCodigoBeneficiario() {
    return digitoCodigoBeneficiario;
  }
  public void setDigitoCodigoBeneficiario(String digitoCodigoBeneficiario) {
    this.digitoCodigoBeneficiario = digitoCodigoBeneficiario;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_carteira_value}}}
   **/
  public BoletoParcelaAcordoResponse carteira(String carteira) {
    this.carteira = carteira;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_carteira_value}}}")
  @JsonProperty("carteira")
  public String getCarteira() {
    return carteira;
  }
  public void setCarteira(String carteira) {
    this.carteira = carteira;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_nosso_numero_value}}}
   **/
  public BoletoParcelaAcordoResponse nossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_nosso_numero_value}}}")
  @JsonProperty("nossoNumero")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_digito_nosso_numero_value}}}
   **/
  public BoletoParcelaAcordoResponse digitoNossoNumero(String digitoNossoNumero) {
    this.digitoNossoNumero = digitoNossoNumero;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_digito_nosso_numero_value}}}")
  @JsonProperty("digitoNossoNumero")
  public String getDigitoNossoNumero() {
    return digitoNossoNumero;
  }
  public void setDigitoNossoNumero(String digitoNossoNumero) {
    this.digitoNossoNumero = digitoNossoNumero;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_banco_value}}}
   **/
  public BoletoParcelaAcordoResponse banco(String banco) {
    this.banco = banco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_banco_value}}}")
  @JsonProperty("banco")
  public String getBanco() {
    return banco;
  }
  public void setBanco(String banco) {
    this.banco = banco;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_aceite_value}}}
   **/
  public BoletoParcelaAcordoResponse aceite(Boolean aceite) {
    this.aceite = aceite;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{boleto_parcela_acordo_response_aceite_value}}}")
  @JsonProperty("aceite")
  public Boolean getAceite() {
    return aceite;
  }
  public void setAceite(Boolean aceite) {
    this.aceite = aceite;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_especie_documento_value}}}
   **/
  public BoletoParcelaAcordoResponse especieDocumento(String especieDocumento) {
    this.especieDocumento = especieDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_especie_documento_value}}}")
  @JsonProperty("especieDocumento")
  public String getEspecieDocumento() {
    return especieDocumento;
  }
  public void setEspecieDocumento(String especieDocumento) {
    this.especieDocumento = especieDocumento;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_especie_value}}}
   **/
  public BoletoParcelaAcordoResponse especie(String especie) {
    this.especie = especie;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_especie_value}}}")
  @JsonProperty("especie")
  public String getEspecie() {
    return especie;
  }
  public void setEspecie(String especie) {
    this.especie = especie;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_instrucoes_value}}}
   **/
  public BoletoParcelaAcordoResponse instrucoes(List<String> instrucoes) {
    this.instrucoes = instrucoes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_instrucoes_value}}}")
  @JsonProperty("instrucoes")
  public List<String> getInstrucoes() {
    return instrucoes;
  }
  public void setInstrucoes(List<String> instrucoes) {
    this.instrucoes = instrucoes;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_locais_de_pagamento_value}}}
   **/
  public BoletoParcelaAcordoResponse locaisDePagamento(List<String> locaisDePagamento) {
    this.locaisDePagamento = locaisDePagamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_locais_de_pagamento_value}}}")
  @JsonProperty("locaisDePagamento")
  public List<String> getLocaisDePagamento() {
    return locaisDePagamento;
  }
  public void setLocaisDePagamento(List<String> locaisDePagamento) {
    this.locaisDePagamento = locaisDePagamento;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_nome_pagador_value}}}
   **/
  public BoletoParcelaAcordoResponse nomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_nome_pagador_value}}}")
  @JsonProperty("nomePagador")
  public String getNomePagador() {
    return nomePagador;
  }
  public void setNomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_documento_pagador_value}}}
   **/
  public BoletoParcelaAcordoResponse documentoPagador(String documentoPagador) {
    this.documentoPagador = documentoPagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_documento_pagador_value}}}")
  @JsonProperty("documentoPagador")
  public String getDocumentoPagador() {
    return documentoPagador;
  }
  public void setDocumentoPagador(String documentoPagador) {
    this.documentoPagador = documentoPagador;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_logradouro_pagador_value}}}
   **/
  public BoletoParcelaAcordoResponse logradouroPagador(String logradouroPagador) {
    this.logradouroPagador = logradouroPagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_logradouro_pagador_value}}}")
  @JsonProperty("logradouroPagador")
  public String getLogradouroPagador() {
    return logradouroPagador;
  }
  public void setLogradouroPagador(String logradouroPagador) {
    this.logradouroPagador = logradouroPagador;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_bairro_pagador_value}}}
   **/
  public BoletoParcelaAcordoResponse bairroPagador(String bairroPagador) {
    this.bairroPagador = bairroPagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_bairro_pagador_value}}}")
  @JsonProperty("bairroPagador")
  public String getBairroPagador() {
    return bairroPagador;
  }
  public void setBairroPagador(String bairroPagador) {
    this.bairroPagador = bairroPagador;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_cep_pagador_value}}}
   **/
  public BoletoParcelaAcordoResponse cepPagador(String cepPagador) {
    this.cepPagador = cepPagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_cep_pagador_value}}}")
  @JsonProperty("cepPagador")
  public String getCepPagador() {
    return cepPagador;
  }
  public void setCepPagador(String cepPagador) {
    this.cepPagador = cepPagador;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_cidade_pagador_value}}}
   **/
  public BoletoParcelaAcordoResponse cidadePagador(String cidadePagador) {
    this.cidadePagador = cidadePagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_cidade_pagador_value}}}")
  @JsonProperty("cidadePagador")
  public String getCidadePagador() {
    return cidadePagador;
  }
  public void setCidadePagador(String cidadePagador) {
    this.cidadePagador = cidadePagador;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_uf_pagador_value}}}
   **/
  public BoletoParcelaAcordoResponse ufPagador(String ufPagador) {
    this.ufPagador = ufPagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_uf_pagador_value}}}")
  @JsonProperty("ufPagador")
  public String getUfPagador() {
    return ufPagador;
  }
  public void setUfPagador(String ufPagador) {
    this.ufPagador = ufPagador;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_codigo_de_barras_value}}}
   **/
  public BoletoParcelaAcordoResponse codigoDeBarras(String codigoDeBarras) {
    this.codigoDeBarras = codigoDeBarras;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_codigo_de_barras_value}}}")
  @JsonProperty("codigoDeBarras")
  public String getCodigoDeBarras() {
    return codigoDeBarras;
  }
  public void setCodigoDeBarras(String codigoDeBarras) {
    this.codigoDeBarras = codigoDeBarras;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_linha_digitavel_value}}}
   **/
  public BoletoParcelaAcordoResponse linhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_linha_digitavel_value}}}")
  @JsonProperty("linhaDigitavel")
  public String getLinhaDigitavel() {
    return linhaDigitavel;
  }
  public void setLinhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_id_value}}}
   **/
  public BoletoParcelaAcordoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_id_conta_value}}}
   **/
  public BoletoParcelaAcordoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_endereco_cobranca_beneficiario_value}}}
   **/
  public BoletoParcelaAcordoResponse enderecoCobrancaBeneficiario(String enderecoCobrancaBeneficiario) {
    this.enderecoCobrancaBeneficiario = enderecoCobrancaBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_endereco_cobranca_beneficiario_value}}}")
  @JsonProperty("enderecoCobrancaBeneficiario")
  public String getEnderecoCobrancaBeneficiario() {
    return enderecoCobrancaBeneficiario;
  }
  public void setEnderecoCobrancaBeneficiario(String enderecoCobrancaBeneficiario) {
    this.enderecoCobrancaBeneficiario = enderecoCobrancaBeneficiario;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_status_value}}}
   **/
  public BoletoParcelaAcordoResponse status(Long status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{boleto_parcela_acordo_response_status_value}}}")
  @JsonProperty("status")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  
  /**
   * {{{boleto_parcela_acordo_response_registrado_value}}}
   **/
  public BoletoParcelaAcordoResponse boletoRegistrado(Boolean boletoRegistrado) {
    this.boletoRegistrado = boletoRegistrado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{boleto_parcela_acordo_response_registrado_value}}}")
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
    BoletoParcelaAcordoResponse boletoParcelaAcordoResponse = (BoletoParcelaAcordoResponse) o;
    return Objects.equals(this.numeroDocumento, boletoParcelaAcordoResponse.numeroDocumento) &&
        Objects.equals(this.dataProcessamento, boletoParcelaAcordoResponse.dataProcessamento) &&
        Objects.equals(this.dataDocumento, boletoParcelaAcordoResponse.dataDocumento) &&
        Objects.equals(this.dataVencimento, boletoParcelaAcordoResponse.dataVencimento) &&
        Objects.equals(this.dataFechamento, boletoParcelaAcordoResponse.dataFechamento) &&
        Objects.equals(this.valorBoleto, boletoParcelaAcordoResponse.valorBoleto) &&
        Objects.equals(this.nomeBeneficiario, boletoParcelaAcordoResponse.nomeBeneficiario) &&
        Objects.equals(this.documentoBeneficiario, boletoParcelaAcordoResponse.documentoBeneficiario) &&
        Objects.equals(this.agencia, boletoParcelaAcordoResponse.agencia) &&
        Objects.equals(this.codigoBeneficiario, boletoParcelaAcordoResponse.codigoBeneficiario) &&
        Objects.equals(this.numeroConvenio, boletoParcelaAcordoResponse.numeroConvenio) &&
        Objects.equals(this.digitoCodigoBeneficiario, boletoParcelaAcordoResponse.digitoCodigoBeneficiario) &&
        Objects.equals(this.carteira, boletoParcelaAcordoResponse.carteira) &&
        Objects.equals(this.nossoNumero, boletoParcelaAcordoResponse.nossoNumero) &&
        Objects.equals(this.digitoNossoNumero, boletoParcelaAcordoResponse.digitoNossoNumero) &&
        Objects.equals(this.banco, boletoParcelaAcordoResponse.banco) &&
        Objects.equals(this.aceite, boletoParcelaAcordoResponse.aceite) &&
        Objects.equals(this.especieDocumento, boletoParcelaAcordoResponse.especieDocumento) &&
        Objects.equals(this.especie, boletoParcelaAcordoResponse.especie) &&
        Objects.equals(this.instrucoes, boletoParcelaAcordoResponse.instrucoes) &&
        Objects.equals(this.locaisDePagamento, boletoParcelaAcordoResponse.locaisDePagamento) &&
        Objects.equals(this.nomePagador, boletoParcelaAcordoResponse.nomePagador) &&
        Objects.equals(this.documentoPagador, boletoParcelaAcordoResponse.documentoPagador) &&
        Objects.equals(this.logradouroPagador, boletoParcelaAcordoResponse.logradouroPagador) &&
        Objects.equals(this.bairroPagador, boletoParcelaAcordoResponse.bairroPagador) &&
        Objects.equals(this.cepPagador, boletoParcelaAcordoResponse.cepPagador) &&
        Objects.equals(this.cidadePagador, boletoParcelaAcordoResponse.cidadePagador) &&
        Objects.equals(this.ufPagador, boletoParcelaAcordoResponse.ufPagador) &&
        Objects.equals(this.codigoDeBarras, boletoParcelaAcordoResponse.codigoDeBarras) &&
        Objects.equals(this.linhaDigitavel, boletoParcelaAcordoResponse.linhaDigitavel) &&
        Objects.equals(this.id, boletoParcelaAcordoResponse.id) &&
        Objects.equals(this.idConta, boletoParcelaAcordoResponse.idConta) &&
        Objects.equals(this.enderecoCobrancaBeneficiario, boletoParcelaAcordoResponse.enderecoCobrancaBeneficiario) &&
        Objects.equals(this.status, boletoParcelaAcordoResponse.status) &&
        Objects.equals(this.boletoRegistrado, boletoParcelaAcordoResponse.boletoRegistrado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroDocumento, dataProcessamento, dataDocumento, dataVencimento, dataFechamento, valorBoleto, nomeBeneficiario, documentoBeneficiario, agencia, codigoBeneficiario, numeroConvenio, digitoCodigoBeneficiario, carteira, nossoNumero, digitoNossoNumero, banco, aceite, especieDocumento, especie, instrucoes, locaisDePagamento, nomePagador, documentoPagador, logradouroPagador, bairroPagador, cepPagador, cidadePagador, ufPagador, codigoDeBarras, linhaDigitavel, id, idConta, enderecoCobrancaBeneficiario, status, boletoRegistrado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletoParcelaAcordoResponse {\n");
    
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
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
    sb.append("    especieDocumento: ").append(toIndentedString(especieDocumento)).append("\n");
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

