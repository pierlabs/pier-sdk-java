package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto extrato da conta digital
 **/

@ApiModel(description = "Objeto extrato da conta digital")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ExtratoResponse   {
  
  private String agenciaBeneficiario = null;
  private String agenciaPagador = null;
  private String bancoBeneficiario = null;
  private String bancoPagador = null;
  private String complemento = null;
  private String contaBeneficiario = null;
  private String contaPagador = null;
  private Boolean credito = null;
  private String dataHoraTransacao = null;
  private String descricaoAbreviada = null;
  private String descricaoEstabelecimento = null;
  private String descricaoGrupoMCC = null;
  private String descricaoTipoEvento = null;
  private String descricaoTipoTransacao = null;
  private Long id = null;
  private Long idEvento = null;
  private Long idGrupoMCC = null;
  private Long idMCC = null;
  private Long idPessoaFisica = null;
  private Long idTipoEvento = null;
  private Long idTipoTransacao = null;
  private Long idTransacao = null;
  private String nomeBeneficiario = null;
  private String nomeConcessionaria = null;
  private String nomeEstabelecimento = null;
  private String nomeEstabelecimentoVisa = null;
  private String nomeFantasiaEstabelecimento = null;
  private String nomePagador = null;
  private String nomePortador = null;
  private String numeroCartaoMascarado = null;
  private Integer numeroParcela = null;
  private Integer quantidadeParcelas = null;
  private Boolean solicitouContestacao = null;
  private Boolean titular = null;
  private String transferenciaBancoAgenciaConta = null;
  private BigDecimal valorBRL = null;
  private BigDecimal valorTaxaEmbarque = null;
  private BigDecimal valorUSD = null;

  
  /**
   * Ag\u00EAncia do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1rias 
   **/
  public ExtratoResponse agenciaBeneficiario(String agenciaBeneficiario) {
    this.agenciaBeneficiario = agenciaBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ag\u00EAncia do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1rias ")
  @JsonProperty("agenciaBeneficiario")
  public String getAgenciaBeneficiario() {
    return agenciaBeneficiario;
  }
  public void setAgenciaBeneficiario(String agenciaBeneficiario) {
    this.agenciaBeneficiario = agenciaBeneficiario;
  }

  
  /**
   * Ag\u00EAncia pagador referente a opera\u00E7\u00E3o banc\u00E1ria
   **/
  public ExtratoResponse agenciaPagador(String agenciaPagador) {
    this.agenciaPagador = agenciaPagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ag\u00EAncia pagador referente a opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("agenciaPagador")
  public String getAgenciaPagador() {
    return agenciaPagador;
  }
  public void setAgenciaPagador(String agenciaPagador) {
    this.agenciaPagador = agenciaPagador;
  }

  
  /**
   * Banco do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1ria
   **/
  public ExtratoResponse bancoBeneficiario(String bancoBeneficiario) {
    this.bancoBeneficiario = bancoBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Banco do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("bancoBeneficiario")
  public String getBancoBeneficiario() {
    return bancoBeneficiario;
  }
  public void setBancoBeneficiario(String bancoBeneficiario) {
    this.bancoBeneficiario = bancoBeneficiario;
  }

  
  /**
   * Banco pagador referente a opera\u00E7\u00E3o banc\u00E1ria
   **/
  public ExtratoResponse bancoPagador(String bancoPagador) {
    this.bancoPagador = bancoPagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Banco pagador referente a opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("bancoPagador")
  public String getBancoPagador() {
    return bancoPagador;
  }
  public void setBancoPagador(String bancoPagador) {
    this.bancoPagador = bancoPagador;
  }

  
  /**
   * Complemento
   **/
  public ExtratoResponse complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Complemento")
  @JsonProperty("complemento")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Conta do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1ria
   **/
  public ExtratoResponse contaBeneficiario(String contaBeneficiario) {
    this.contaBeneficiario = contaBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conta do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("contaBeneficiario")
  public String getContaBeneficiario() {
    return contaBeneficiario;
  }
  public void setContaBeneficiario(String contaBeneficiario) {
    this.contaBeneficiario = contaBeneficiario;
  }

  
  /**
   * Conta pagadora referente a opera\u00E7\u00E3o banc\u00E1ria
   **/
  public ExtratoResponse contaPagador(String contaPagador) {
    this.contaPagador = contaPagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conta pagadora referente a opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("contaPagador")
  public String getContaPagador() {
    return contaPagador;
  }
  public void setContaPagador(String contaPagador) {
    this.contaPagador = contaPagador;
  }

  
  /**
   * \u00D3p\u00E7\u00E3o cr\u00E9dito
   **/
  public ExtratoResponse credito(Boolean credito) {
    this.credito = credito;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "\u00D3p\u00E7\u00E3o cr\u00E9dito")
  @JsonProperty("credito")
  public Boolean getCredito() {
    return credito;
  }
  public void setCredito(Boolean credito) {
    this.credito = credito;
  }

  
  /**
   * Data e hora da transa\u00E7\u00E3o
   **/
  public ExtratoResponse dataHoraTransacao(String dataHoraTransacao) {
    this.dataHoraTransacao = dataHoraTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e hora da transa\u00E7\u00E3o")
  @JsonProperty("dataHoraTransacao")
  public String getDataHoraTransacao() {
    return dataHoraTransacao;
  }
  public void setDataHoraTransacao(String dataHoraTransacao) {
    this.dataHoraTransacao = dataHoraTransacao;
  }

  
  /**
   * Breve descri\u00E7\u00E3o
   **/
  public ExtratoResponse descricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Breve descri\u00E7\u00E3o")
  @JsonProperty("descricaoAbreviada")
  public String getDescricaoAbreviada() {
    return descricaoAbreviada;
  }
  public void setDescricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
  }

  
  /**
   * Descri\u00E7\u00E3o do estabelecimento
   **/
  public ExtratoResponse descricaoEstabelecimento(String descricaoEstabelecimento) {
    this.descricaoEstabelecimento = descricaoEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do estabelecimento")
  @JsonProperty("descricaoEstabelecimento")
  public String getDescricaoEstabelecimento() {
    return descricaoEstabelecimento;
  }
  public void setDescricaoEstabelecimento(String descricaoEstabelecimento) {
    this.descricaoEstabelecimento = descricaoEstabelecimento;
  }

  
  /**
   * Descri\u00E7\u00E3o do grupo MCC
   **/
  public ExtratoResponse descricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do grupo MCC")
  @JsonProperty("descricaoGrupoMCC")
  public String getDescricaoGrupoMCC() {
    return descricaoGrupoMCC;
  }
  public void setDescricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo do evento
   **/
  public ExtratoResponse descricaoTipoEvento(String descricaoTipoEvento) {
    this.descricaoTipoEvento = descricaoTipoEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do tipo do evento")
  @JsonProperty("descricaoTipoEvento")
  public String getDescricaoTipoEvento() {
    return descricaoTipoEvento;
  }
  public void setDescricaoTipoEvento(String descricaoTipoEvento) {
    this.descricaoTipoEvento = descricaoTipoEvento;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo da transa\u00E7\u00E3o
   **/
  public ExtratoResponse descricaoTipoTransacao(String descricaoTipoTransacao) {
    this.descricaoTipoTransacao = descricaoTipoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do tipo da transa\u00E7\u00E3o")
  @JsonProperty("descricaoTipoTransacao")
  public String getDescricaoTipoTransacao() {
    return descricaoTipoTransacao;
  }
  public void setDescricaoTipoTransacao(String descricaoTipoTransacao) {
    this.descricaoTipoTransacao = descricaoTipoTransacao;
  }

  
  /**
   **/
  public ExtratoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador do evento
   **/
  public ExtratoResponse idEvento(Long idEvento) {
    this.idEvento = idEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do evento")
  @JsonProperty("idEvento")
  public Long getIdEvento() {
    return idEvento;
  }
  public void setIdEvento(Long idEvento) {
    this.idEvento = idEvento;
  }

  
  /**
   * Identificador do grupo MCC
   **/
  public ExtratoResponse idGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do grupo MCC")
  @JsonProperty("idGrupoMCC")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Identificador do MCC
   **/
  public ExtratoResponse idMCC(Long idMCC) {
    this.idMCC = idMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do MCC")
  @JsonProperty("idMCC")
  public Long getIdMCC() {
    return idMCC;
  }
  public void setIdMCC(Long idMCC) {
    this.idMCC = idMCC;
  }

  
  /**
   * Identificador da pessoa f\u00EDsica
   **/
  public ExtratoResponse idPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da pessoa f\u00EDsica")
  @JsonProperty("idPessoaFisica")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   * Identificador do tipo do evento
   **/
  public ExtratoResponse idTipoEvento(Long idTipoEvento) {
    this.idTipoEvento = idTipoEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do tipo do evento")
  @JsonProperty("idTipoEvento")
  public Long getIdTipoEvento() {
    return idTipoEvento;
  }
  public void setIdTipoEvento(Long idTipoEvento) {
    this.idTipoEvento = idTipoEvento;
  }

  
  /**
   * Identificador do tipo da transa\u00E7\u00E3o
   **/
  public ExtratoResponse idTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do tipo da transa\u00E7\u00E3o")
  @JsonProperty("idTipoTransacao")
  public Long getIdTipoTransacao() {
    return idTipoTransacao;
  }
  public void setIdTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
  }

  
  /**
   * Identificador da transa\u00E7\u00E3o
   **/
  public ExtratoResponse idTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da transa\u00E7\u00E3o")
  @JsonProperty("idTransacao")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * Nome do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1ria
   **/
  public ExtratoResponse nomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do benefici\u00E1rio referente a opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("nomeBeneficiario")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * Nome da concession\u00E1ria do boleto pago
   **/
  public ExtratoResponse nomeConcessionaria(String nomeConcessionaria) {
    this.nomeConcessionaria = nomeConcessionaria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da concession\u00E1ria do boleto pago")
  @JsonProperty("nomeConcessionaria")
  public String getNomeConcessionaria() {
    return nomeConcessionaria;
  }
  public void setNomeConcessionaria(String nomeConcessionaria) {
    this.nomeConcessionaria = nomeConcessionaria;
  }

  
  /**
   * Nome do estabelecimento
   **/
  public ExtratoResponse nomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do estabelecimento")
  @JsonProperty("nomeEstabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Nome do estabelecimento visa
   **/
  public ExtratoResponse nomeEstabelecimentoVisa(String nomeEstabelecimentoVisa) {
    this.nomeEstabelecimentoVisa = nomeEstabelecimentoVisa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do estabelecimento visa")
  @JsonProperty("nomeEstabelecimentoVisa")
  public String getNomeEstabelecimentoVisa() {
    return nomeEstabelecimentoVisa;
  }
  public void setNomeEstabelecimentoVisa(String nomeEstabelecimentoVisa) {
    this.nomeEstabelecimentoVisa = nomeEstabelecimentoVisa;
  }

  
  /**
   * Nome fantasia do estabelecimento
   **/
  public ExtratoResponse nomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome fantasia do estabelecimento")
  @JsonProperty("nomeFantasiaEstabelecimento")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * Nome do pagador referente a opera\u00E7\u00E3o banc\u00E1ria
   **/
  public ExtratoResponse nomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do pagador referente a opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("nomePagador")
  public String getNomePagador() {
    return nomePagador;
  }
  public void setNomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
  }

  
  /**
   * Nome do portador
   **/
  public ExtratoResponse nomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do portador")
  @JsonProperty("nomePortador")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * N\u00FAmero do cart\u00E3o mascarado
   **/
  public ExtratoResponse numeroCartaoMascarado(String numeroCartaoMascarado) {
    this.numeroCartaoMascarado = numeroCartaoMascarado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do cart\u00E3o mascarado")
  @JsonProperty("numeroCartaoMascarado")
  public String getNumeroCartaoMascarado() {
    return numeroCartaoMascarado;
  }
  public void setNumeroCartaoMascarado(String numeroCartaoMascarado) {
    this.numeroCartaoMascarado = numeroCartaoMascarado;
  }

  
  /**
   * N\u00FAmero de parcelas
   **/
  public ExtratoResponse numeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero de parcelas")
  @JsonProperty("numeroParcela")
  public Integer getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * Quantidade de parcelas
   **/
  public ExtratoResponse quantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de parcelas")
  @JsonProperty("quantidadeParcelas")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Op\u00E7\u00E3o de solicitar contesta\u00E7\u00E3o
   **/
  public ExtratoResponse solicitouContestacao(Boolean solicitouContestacao) {
    this.solicitouContestacao = solicitouContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Op\u00E7\u00E3o de solicitar contesta\u00E7\u00E3o")
  @JsonProperty("solicitouContestacao")
  public Boolean getSolicitouContestacao() {
    return solicitouContestacao;
  }
  public void setSolicitouContestacao(Boolean solicitouContestacao) {
    this.solicitouContestacao = solicitouContestacao;
  }

  
  /**
   * Titular
   **/
  public ExtratoResponse titular(Boolean titular) {
    this.titular = titular;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Titular")
  @JsonProperty("titular")
  public Boolean getTitular() {
    return titular;
  }
  public void setTitular(Boolean titular) {
    this.titular = titular;
  }

  
  /**
   * Transf\u00EArencia para banco agencia e conta
   **/
  public ExtratoResponse transferenciaBancoAgenciaConta(String transferenciaBancoAgenciaConta) {
    this.transferenciaBancoAgenciaConta = transferenciaBancoAgenciaConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Transf\u00EArencia para banco agencia e conta")
  @JsonProperty("transferenciaBancoAgenciaConta")
  public String getTransferenciaBancoAgenciaConta() {
    return transferenciaBancoAgenciaConta;
  }
  public void setTransferenciaBancoAgenciaConta(String transferenciaBancoAgenciaConta) {
    this.transferenciaBancoAgenciaConta = transferenciaBancoAgenciaConta;
  }

  
  /**
   * Valor em reais
   **/
  public ExtratoResponse valorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor em reais")
  @JsonProperty("valorBRL")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }
  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  
  /**
   * Valor sobre taxa de embarca
   **/
  public ExtratoResponse valorTaxaEmbarque(BigDecimal valorTaxaEmbarque) {
    this.valorTaxaEmbarque = valorTaxaEmbarque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor sobre taxa de embarca")
  @JsonProperty("valorTaxaEmbarque")
  public BigDecimal getValorTaxaEmbarque() {
    return valorTaxaEmbarque;
  }
  public void setValorTaxaEmbarque(BigDecimal valorTaxaEmbarque) {
    this.valorTaxaEmbarque = valorTaxaEmbarque;
  }

  
  /**
   * Valor em d\u00F3lares
   **/
  public ExtratoResponse valorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor em d\u00F3lares")
  @JsonProperty("valorUSD")
  public BigDecimal getValorUSD() {
    return valorUSD;
  }
  public void setValorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtratoResponse extratoResponse = (ExtratoResponse) o;
    return Objects.equals(this.agenciaBeneficiario, extratoResponse.agenciaBeneficiario) &&
        Objects.equals(this.agenciaPagador, extratoResponse.agenciaPagador) &&
        Objects.equals(this.bancoBeneficiario, extratoResponse.bancoBeneficiario) &&
        Objects.equals(this.bancoPagador, extratoResponse.bancoPagador) &&
        Objects.equals(this.complemento, extratoResponse.complemento) &&
        Objects.equals(this.contaBeneficiario, extratoResponse.contaBeneficiario) &&
        Objects.equals(this.contaPagador, extratoResponse.contaPagador) &&
        Objects.equals(this.credito, extratoResponse.credito) &&
        Objects.equals(this.dataHoraTransacao, extratoResponse.dataHoraTransacao) &&
        Objects.equals(this.descricaoAbreviada, extratoResponse.descricaoAbreviada) &&
        Objects.equals(this.descricaoEstabelecimento, extratoResponse.descricaoEstabelecimento) &&
        Objects.equals(this.descricaoGrupoMCC, extratoResponse.descricaoGrupoMCC) &&
        Objects.equals(this.descricaoTipoEvento, extratoResponse.descricaoTipoEvento) &&
        Objects.equals(this.descricaoTipoTransacao, extratoResponse.descricaoTipoTransacao) &&
        Objects.equals(this.id, extratoResponse.id) &&
        Objects.equals(this.idEvento, extratoResponse.idEvento) &&
        Objects.equals(this.idGrupoMCC, extratoResponse.idGrupoMCC) &&
        Objects.equals(this.idMCC, extratoResponse.idMCC) &&
        Objects.equals(this.idPessoaFisica, extratoResponse.idPessoaFisica) &&
        Objects.equals(this.idTipoEvento, extratoResponse.idTipoEvento) &&
        Objects.equals(this.idTipoTransacao, extratoResponse.idTipoTransacao) &&
        Objects.equals(this.idTransacao, extratoResponse.idTransacao) &&
        Objects.equals(this.nomeBeneficiario, extratoResponse.nomeBeneficiario) &&
        Objects.equals(this.nomeConcessionaria, extratoResponse.nomeConcessionaria) &&
        Objects.equals(this.nomeEstabelecimento, extratoResponse.nomeEstabelecimento) &&
        Objects.equals(this.nomeEstabelecimentoVisa, extratoResponse.nomeEstabelecimentoVisa) &&
        Objects.equals(this.nomeFantasiaEstabelecimento, extratoResponse.nomeFantasiaEstabelecimento) &&
        Objects.equals(this.nomePagador, extratoResponse.nomePagador) &&
        Objects.equals(this.nomePortador, extratoResponse.nomePortador) &&
        Objects.equals(this.numeroCartaoMascarado, extratoResponse.numeroCartaoMascarado) &&
        Objects.equals(this.numeroParcela, extratoResponse.numeroParcela) &&
        Objects.equals(this.quantidadeParcelas, extratoResponse.quantidadeParcelas) &&
        Objects.equals(this.solicitouContestacao, extratoResponse.solicitouContestacao) &&
        Objects.equals(this.titular, extratoResponse.titular) &&
        Objects.equals(this.transferenciaBancoAgenciaConta, extratoResponse.transferenciaBancoAgenciaConta) &&
        Objects.equals(this.valorBRL, extratoResponse.valorBRL) &&
        Objects.equals(this.valorTaxaEmbarque, extratoResponse.valorTaxaEmbarque) &&
        Objects.equals(this.valorUSD, extratoResponse.valorUSD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agenciaBeneficiario, agenciaPagador, bancoBeneficiario, bancoPagador, complemento, contaBeneficiario, contaPagador, credito, dataHoraTransacao, descricaoAbreviada, descricaoEstabelecimento, descricaoGrupoMCC, descricaoTipoEvento, descricaoTipoTransacao, id, idEvento, idGrupoMCC, idMCC, idPessoaFisica, idTipoEvento, idTipoTransacao, idTransacao, nomeBeneficiario, nomeConcessionaria, nomeEstabelecimento, nomeEstabelecimentoVisa, nomeFantasiaEstabelecimento, nomePagador, nomePortador, numeroCartaoMascarado, numeroParcela, quantidadeParcelas, solicitouContestacao, titular, transferenciaBancoAgenciaConta, valorBRL, valorTaxaEmbarque, valorUSD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtratoResponse {\n");
    
    sb.append("    agenciaBeneficiario: ").append(toIndentedString(agenciaBeneficiario)).append("\n");
    sb.append("    agenciaPagador: ").append(toIndentedString(agenciaPagador)).append("\n");
    sb.append("    bancoBeneficiario: ").append(toIndentedString(bancoBeneficiario)).append("\n");
    sb.append("    bancoPagador: ").append(toIndentedString(bancoPagador)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    contaBeneficiario: ").append(toIndentedString(contaBeneficiario)).append("\n");
    sb.append("    contaPagador: ").append(toIndentedString(contaPagador)).append("\n");
    sb.append("    credito: ").append(toIndentedString(credito)).append("\n");
    sb.append("    dataHoraTransacao: ").append(toIndentedString(dataHoraTransacao)).append("\n");
    sb.append("    descricaoAbreviada: ").append(toIndentedString(descricaoAbreviada)).append("\n");
    sb.append("    descricaoEstabelecimento: ").append(toIndentedString(descricaoEstabelecimento)).append("\n");
    sb.append("    descricaoGrupoMCC: ").append(toIndentedString(descricaoGrupoMCC)).append("\n");
    sb.append("    descricaoTipoEvento: ").append(toIndentedString(descricaoTipoEvento)).append("\n");
    sb.append("    descricaoTipoTransacao: ").append(toIndentedString(descricaoTipoTransacao)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idEvento: ").append(toIndentedString(idEvento)).append("\n");
    sb.append("    idGrupoMCC: ").append(toIndentedString(idGrupoMCC)).append("\n");
    sb.append("    idMCC: ").append(toIndentedString(idMCC)).append("\n");
    sb.append("    idPessoaFisica: ").append(toIndentedString(idPessoaFisica)).append("\n");
    sb.append("    idTipoEvento: ").append(toIndentedString(idTipoEvento)).append("\n");
    sb.append("    idTipoTransacao: ").append(toIndentedString(idTipoTransacao)).append("\n");
    sb.append("    idTransacao: ").append(toIndentedString(idTransacao)).append("\n");
    sb.append("    nomeBeneficiario: ").append(toIndentedString(nomeBeneficiario)).append("\n");
    sb.append("    nomeConcessionaria: ").append(toIndentedString(nomeConcessionaria)).append("\n");
    sb.append("    nomeEstabelecimento: ").append(toIndentedString(nomeEstabelecimento)).append("\n");
    sb.append("    nomeEstabelecimentoVisa: ").append(toIndentedString(nomeEstabelecimentoVisa)).append("\n");
    sb.append("    nomeFantasiaEstabelecimento: ").append(toIndentedString(nomeFantasiaEstabelecimento)).append("\n");
    sb.append("    nomePagador: ").append(toIndentedString(nomePagador)).append("\n");
    sb.append("    nomePortador: ").append(toIndentedString(nomePortador)).append("\n");
    sb.append("    numeroCartaoMascarado: ").append(toIndentedString(numeroCartaoMascarado)).append("\n");
    sb.append("    numeroParcela: ").append(toIndentedString(numeroParcela)).append("\n");
    sb.append("    quantidadeParcelas: ").append(toIndentedString(quantidadeParcelas)).append("\n");
    sb.append("    solicitouContestacao: ").append(toIndentedString(solicitouContestacao)).append("\n");
    sb.append("    titular: ").append(toIndentedString(titular)).append("\n");
    sb.append("    transferenciaBancoAgenciaConta: ").append(toIndentedString(transferenciaBancoAgenciaConta)).append("\n");
    sb.append("    valorBRL: ").append(toIndentedString(valorBRL)).append("\n");
    sb.append("    valorTaxaEmbarque: ").append(toIndentedString(valorTaxaEmbarque)).append("\n");
    sb.append("    valorUSD: ").append(toIndentedString(valorUSD)).append("\n");
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

