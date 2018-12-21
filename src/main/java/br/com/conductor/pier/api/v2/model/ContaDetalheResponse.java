package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Object account
 **/

@ApiModel(description = "Object account")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaDetalheResponse   {
  
  private Long id = null;
  private Long idPessoa = null;
  private String nome = null;
  private Long idProduto = null;
  private Long idOrigemComercial = null;
  private String nomeOrigemComercial = null;
  private Long idFantasiaBasica = null;
  private String nomeFantasiaBasica = null;
  private Long idStatusConta = null;
  private String statusConta = null;
  private Integer diaVencimento = null;
  private Integer melhorDiaCompra = null;
  private String dataStatusConta = null;
  private String dataCadastro = null;
  private String dataUltimaAlteracaoVencimento = null;
  private String dataHoraUltimaCompra = null;
  private Integer numeroAgencia = null;
  private String numeroContaCorrente = null;
  private BigDecimal valorRenda = null;
  private String formaEnvioFatura = null;
  private Boolean titular = null;
  private BigDecimal limiteGlobal = null;
  private BigDecimal limiteSaqueGlobal = null;
  private BigDecimal saldoDisponivelGlobal = null;
  private BigDecimal saldoDisponivelSaque = null;
  private Boolean impedidoFinanciamento = null;
  private Long diasAtraso = null;
  private String proximoVencimentoPadrao = null;
  private Long idProposta = null;
  private Integer quantidadePagamentos = null;
  private Long correspondencia = null;
  private String dataInicioAtraso = null;
  private BigDecimal rotativoPagaJuros = null;
  private BigDecimal totalPosProx = null;
  private BigDecimal saldoAtualFinal = null;
  private BigDecimal saldoExtratoAnterior = null;
  private Boolean aceitaNovaContaPorGrupoProduto = null;


  public enum FuncaoAtivaEnum {
    DEBITO_CREDITO("DEBITO_CREDITO"),
    CREDITO("CREDITO");

    private String value;

    FuncaoAtivaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private FuncaoAtivaEnum funcaoAtiva = null;

  
  /**
   * Identification Code of the account (id)
   **/
  public ContaDetalheResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the account (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Cardholder (id)
   **/
  public ContaDetalheResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Cardholder (id)")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Show the 'Full Name of the PP' ot the 'Full Name of the Social Reason (Business Name)'
   **/
  public ContaDetalheResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the 'Full Name of the PP' ot the 'Full Name of the Social Reason (Business Name)'")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Identification Code of the product which the account takes part (id)
   **/
  public ContaDetalheResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the product which the account takes part (id)")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identification Code of the Commercial Origin (id) that created the Account
   **/
  public ContaDetalheResponse idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Commercial Origin (id) that created the Account")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Name of the Commercial Origin
   **/
  public ContaDetalheResponse nomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the Commercial Origin")
  @JsonProperty("nomeOrigemComercial")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * Identification Code of the Basic Fantasy (id)
   **/
  public ContaDetalheResponse idFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Basic Fantasy (id)")
  @JsonProperty("idFantasiaBasica")
  public Long getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  
  /**
   * Name of the Basic Fantasy
   **/
  public ContaDetalheResponse nomeFantasiaBasica(String nomeFantasiaBasica) {
    this.nomeFantasiaBasica = nomeFantasiaBasica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the Basic Fantasy")
  @JsonProperty("nomeFantasiaBasica")
  public String getNomeFantasiaBasica() {
    return nomeFantasiaBasica;
  }
  public void setNomeFantasiaBasica(String nomeFantasiaBasica) {
    this.nomeFantasiaBasica = nomeFantasiaBasica;
  }

  
  /**
   * Identification Code of the status attributed to the account
   **/
  public ContaDetalheResponse idStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the status attributed to the account")
  @JsonProperty("idStatusConta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * Description of status of the account
   **/
  public ContaDetalheResponse statusConta(String statusConta) {
    this.statusConta = statusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of status of the account")
  @JsonProperty("statusConta")
  public String getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * Show the expiration day
   **/
  public ContaDetalheResponse diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the expiration day")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Show the best date of shopping
   **/
  public ContaDetalheResponse melhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the best date of shopping")
  @JsonProperty("melhorDiaCompra")
  public Integer getMelhorDiaCompra() {
    return melhorDiaCompra;
  }
  public void setMelhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
  }

  
  /**
   * Show the date which the current idStatusAccount was attributed for it
   **/
  public ContaDetalheResponse dataStatusConta(String dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the date which the current idStatusAccount was attributed for it")
  @JsonProperty("dataStatusConta")
  public String getDataStatusConta() {
    return dataStatusConta;
  }
  public void setDataStatusConta(String dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
  }

  
  /**
   * Show the date which the card was created
   **/
  public ContaDetalheResponse dataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the date which the card was created")
  @JsonProperty("dataCadastro")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Show the date of the last update of expiration
   **/
  public ContaDetalheResponse dataUltimaAlteracaoVencimento(String dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the date of the last update of expiration")
  @JsonProperty("dataUltimaAlteracaoVencimento")
  public String getDataUltimaAlteracaoVencimento() {
    return dataUltimaAlteracaoVencimento;
  }
  public void setDataUltimaAlteracaoVencimento(String dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
  }

  
  /**
   * Show the date of the last update of expiration
   **/
  public ContaDetalheResponse dataHoraUltimaCompra(String dataHoraUltimaCompra) {
    this.dataHoraUltimaCompra = dataHoraUltimaCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the date of the last update of expiration")
  @JsonProperty("dataHoraUltimaCompra")
  public String getDataHoraUltimaCompra() {
    return dataHoraUltimaCompra;
  }
  public void setDataHoraUltimaCompra(String dataHoraUltimaCompra) {
    this.dataHoraUltimaCompra = dataHoraUltimaCompra;
  }

  
  /**
   * Number of the agency
   **/
  public ContaDetalheResponse numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of the agency")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Current Account Number
   **/
  public ContaDetalheResponse numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current Account Number")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Value of the proven income
   **/
  public ContaDetalheResponse valorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value of the proven income")
  @JsonProperty("valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Sending way of the invoice
   **/
  public ContaDetalheResponse formaEnvioFatura(String formaEnvioFatura) {
    this.formaEnvioFatura = formaEnvioFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sending way of the invoice")
  @JsonProperty("formaEnvioFatura")
  public String getFormaEnvioFatura() {
    return formaEnvioFatura;
  }
  public void setFormaEnvioFatura(String formaEnvioFatura) {
    this.formaEnvioFatura = formaEnvioFatura;
  }

  
  /**
   * Show if the person is the Cardholder
   **/
  public ContaDetalheResponse titular(Boolean titular) {
    this.titular = titular;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Show if the person is the Cardholder")
  @JsonProperty("titular")
  public Boolean getTitular() {
    return titular;
  }
  public void setTitular(Boolean titular) {
    this.titular = titular;
  }

  
  /**
   * Show the value of credit limit that the cardholder has
   **/
  public ContaDetalheResponse limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the value of credit limit that the cardholder has")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * when it is used by the issuer, this field shows the value of the credit limit that the cardholder can use to make National Withdrawal transactions
   **/
  public ContaDetalheResponse limiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "when it is used by the issuer, this field shows the value of the credit limit that the cardholder can use to make National Withdrawal transactions")
  @JsonProperty("limiteSaqueGlobal")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * When it is used by the issuer, this field show the value of credit limit that the cardholder has to the exclusively use in National Shopping
   **/
  public ContaDetalheResponse saldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When it is used by the issuer, this field show the value of credit limit that the cardholder has to the exclusively use in National Shopping")
  @JsonProperty("saldoDisponivelGlobal")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * When it is used by the issuer, this field show the value of the credit limit that the cardholder can used to make National Withdrawal Transactions inside of each cycle of billing
   **/
  public ContaDetalheResponse saldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When it is used by the issuer, this field show the value of the credit limit that the cardholder can used to make National Withdrawal Transactions inside of each cycle of billing")
  @JsonProperty("saldoDisponivelSaque")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * Flag for banks business partners that are cardholders, but cannot operate financed credit transactions (Law n. 4595/64) 
   **/
  public ContaDetalheResponse impedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag for banks business partners that are cardholders, but cannot operate financed credit transactions (Law n. 4595/64) ")
  @JsonProperty("impedidoFinanciamento")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  
  /**
   * Show the quantity of days that the account is in arrears
   **/
  public ContaDetalheResponse diasAtraso(Long diasAtraso) {
    this.diasAtraso = diasAtraso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the quantity of days that the account is in arrears")
  @JsonProperty("diasAtraso")
  public Long getDiasAtraso() {
    return diasAtraso;
  }
  public void setDiasAtraso(Long diasAtraso) {
    this.diasAtraso = diasAtraso;
  }

  
  /**
   * Next Expering Date Default
   **/
  public ContaDetalheResponse proximoVencimentoPadrao(String proximoVencimentoPadrao) {
    this.proximoVencimentoPadrao = proximoVencimentoPadrao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Next Expering Date Default")
  @JsonProperty("proximoVencimentoPadrao")
  public String getProximoVencimentoPadrao() {
    return proximoVencimentoPadrao;
  }
  public void setProximoVencimentoPadrao(String proximoVencimentoPadrao) {
    this.proximoVencimentoPadrao = proximoVencimentoPadrao;
  }

  
  /**
   * Proposal identifier
   **/
  public ContaDetalheResponse idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proposal identifier")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * Number of payments
   **/
  public ContaDetalheResponse quantidadePagamentos(Integer quantidadePagamentos) {
    this.quantidadePagamentos = quantidadePagamentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of payments")
  @JsonProperty("quantidadePagamentos")
  public Integer getQuantidadePagamentos() {
    return quantidadePagamentos;
  }
  public void setQuantidadePagamentos(Integer quantidadePagamentos) {
    this.quantidadePagamentos = quantidadePagamentos;
  }

  
  /**
   * correspondence
   **/
  public ContaDetalheResponse correspondencia(Long correspondencia) {
    this.correspondencia = correspondencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "correspondence")
  @JsonProperty("correspondencia")
  public Long getCorrespondencia() {
    return correspondencia;
  }
  public void setCorrespondencia(Long correspondencia) {
    this.correspondencia = correspondencia;
  }

  
  /**
   * Expiry date of Collection
   **/
  public ContaDetalheResponse dataInicioAtraso(String dataInicioAtraso) {
    this.dataInicioAtraso = dataInicioAtraso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expiry date of Collection")
  @JsonProperty("dataInicioAtraso")
  public String getDataInicioAtraso() {
    return dataInicioAtraso;
  }
  public void setDataInicioAtraso(String dataInicioAtraso) {
    this.dataInicioAtraso = dataInicioAtraso;
  }

  
  /**
   * Revolving interest rate
   **/
  public ContaDetalheResponse rotativoPagaJuros(BigDecimal rotativoPagaJuros) {
    this.rotativoPagaJuros = rotativoPagaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Revolving interest rate")
  @JsonProperty("rotativoPagaJuros")
  public BigDecimal getRotativoPagaJuros() {
    return rotativoPagaJuros;
  }
  public void setRotativoPagaJuros(BigDecimal rotativoPagaJuros) {
    this.rotativoPagaJuros = rotativoPagaJuros;
  }

  
  /**
   * Next Invoice Value
   **/
  public ContaDetalheResponse totalPosProx(BigDecimal totalPosProx) {
    this.totalPosProx = totalPosProx;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Next Invoice Value")
  @JsonProperty("totalPosProx")
  public BigDecimal getTotalPosProx() {
    return totalPosProx;
  }
  public void setTotalPosProx(BigDecimal totalPosProx) {
    this.totalPosProx = totalPosProx;
  }

  
  /**
   * Final Actual Value
   **/
  public ContaDetalheResponse saldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Final Actual Value")
  @JsonProperty("saldoAtualFinal")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * Previous account balance
   **/
  public ContaDetalheResponse saldoExtratoAnterior(BigDecimal saldoExtratoAnterior) {
    this.saldoExtratoAnterior = saldoExtratoAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Previous account balance")
  @JsonProperty("saldoExtratoAnterior")
  public BigDecimal getSaldoExtratoAnterior() {
    return saldoExtratoAnterior;
  }
  public void setSaldoExtratoAnterior(BigDecimal saldoExtratoAnterior) {
    this.saldoExtratoAnterior = saldoExtratoAnterior;
  }

  
  /**
   * Flag indicating acceptance of new account opening by product group
   **/
  public ContaDetalheResponse aceitaNovaContaPorGrupoProduto(Boolean aceitaNovaContaPorGrupoProduto) {
    this.aceitaNovaContaPorGrupoProduto = aceitaNovaContaPorGrupoProduto;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicating acceptance of new account opening by product group")
  @JsonProperty("aceitaNovaContaPorGrupoProduto")
  public Boolean getAceitaNovaContaPorGrupoProduto() {
    return aceitaNovaContaPorGrupoProduto;
  }
  public void setAceitaNovaContaPorGrupoProduto(Boolean aceitaNovaContaPorGrupoProduto) {
    this.aceitaNovaContaPorGrupoProduto = aceitaNovaContaPorGrupoProduto;
  }

  
  /**
   * Active account function
   **/
  public ContaDetalheResponse funcaoAtiva(FuncaoAtivaEnum funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Active account function")
  @JsonProperty("funcaoAtiva")
  public FuncaoAtivaEnum getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(FuncaoAtivaEnum funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaDetalheResponse contaDetalheResponse = (ContaDetalheResponse) o;
    return Objects.equals(this.id, contaDetalheResponse.id) &&
        Objects.equals(this.idPessoa, contaDetalheResponse.idPessoa) &&
        Objects.equals(this.nome, contaDetalheResponse.nome) &&
        Objects.equals(this.idProduto, contaDetalheResponse.idProduto) &&
        Objects.equals(this.idOrigemComercial, contaDetalheResponse.idOrigemComercial) &&
        Objects.equals(this.nomeOrigemComercial, contaDetalheResponse.nomeOrigemComercial) &&
        Objects.equals(this.idFantasiaBasica, contaDetalheResponse.idFantasiaBasica) &&
        Objects.equals(this.nomeFantasiaBasica, contaDetalheResponse.nomeFantasiaBasica) &&
        Objects.equals(this.idStatusConta, contaDetalheResponse.idStatusConta) &&
        Objects.equals(this.statusConta, contaDetalheResponse.statusConta) &&
        Objects.equals(this.diaVencimento, contaDetalheResponse.diaVencimento) &&
        Objects.equals(this.melhorDiaCompra, contaDetalheResponse.melhorDiaCompra) &&
        Objects.equals(this.dataStatusConta, contaDetalheResponse.dataStatusConta) &&
        Objects.equals(this.dataCadastro, contaDetalheResponse.dataCadastro) &&
        Objects.equals(this.dataUltimaAlteracaoVencimento, contaDetalheResponse.dataUltimaAlteracaoVencimento) &&
        Objects.equals(this.dataHoraUltimaCompra, contaDetalheResponse.dataHoraUltimaCompra) &&
        Objects.equals(this.numeroAgencia, contaDetalheResponse.numeroAgencia) &&
        Objects.equals(this.numeroContaCorrente, contaDetalheResponse.numeroContaCorrente) &&
        Objects.equals(this.valorRenda, contaDetalheResponse.valorRenda) &&
        Objects.equals(this.formaEnvioFatura, contaDetalheResponse.formaEnvioFatura) &&
        Objects.equals(this.titular, contaDetalheResponse.titular) &&
        Objects.equals(this.limiteGlobal, contaDetalheResponse.limiteGlobal) &&
        Objects.equals(this.limiteSaqueGlobal, contaDetalheResponse.limiteSaqueGlobal) &&
        Objects.equals(this.saldoDisponivelGlobal, contaDetalheResponse.saldoDisponivelGlobal) &&
        Objects.equals(this.saldoDisponivelSaque, contaDetalheResponse.saldoDisponivelSaque) &&
        Objects.equals(this.impedidoFinanciamento, contaDetalheResponse.impedidoFinanciamento) &&
        Objects.equals(this.diasAtraso, contaDetalheResponse.diasAtraso) &&
        Objects.equals(this.proximoVencimentoPadrao, contaDetalheResponse.proximoVencimentoPadrao) &&
        Objects.equals(this.idProposta, contaDetalheResponse.idProposta) &&
        Objects.equals(this.quantidadePagamentos, contaDetalheResponse.quantidadePagamentos) &&
        Objects.equals(this.correspondencia, contaDetalheResponse.correspondencia) &&
        Objects.equals(this.dataInicioAtraso, contaDetalheResponse.dataInicioAtraso) &&
        Objects.equals(this.rotativoPagaJuros, contaDetalheResponse.rotativoPagaJuros) &&
        Objects.equals(this.totalPosProx, contaDetalheResponse.totalPosProx) &&
        Objects.equals(this.saldoAtualFinal, contaDetalheResponse.saldoAtualFinal) &&
        Objects.equals(this.saldoExtratoAnterior, contaDetalheResponse.saldoExtratoAnterior) &&
        Objects.equals(this.aceitaNovaContaPorGrupoProduto, contaDetalheResponse.aceitaNovaContaPorGrupoProduto) &&
        Objects.equals(this.funcaoAtiva, contaDetalheResponse.funcaoAtiva);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idPessoa, nome, idProduto, idOrigemComercial, nomeOrigemComercial, idFantasiaBasica, nomeFantasiaBasica, idStatusConta, statusConta, diaVencimento, melhorDiaCompra, dataStatusConta, dataCadastro, dataUltimaAlteracaoVencimento, dataHoraUltimaCompra, numeroAgencia, numeroContaCorrente, valorRenda, formaEnvioFatura, titular, limiteGlobal, limiteSaqueGlobal, saldoDisponivelGlobal, saldoDisponivelSaque, impedidoFinanciamento, diasAtraso, proximoVencimentoPadrao, idProposta, quantidadePagamentos, correspondencia, dataInicioAtraso, rotativoPagaJuros, totalPosProx, saldoAtualFinal, saldoExtratoAnterior, aceitaNovaContaPorGrupoProduto, funcaoAtiva);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDetalheResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idPessoa: ").append(toIndentedString(idPessoa)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    nomeOrigemComercial: ").append(toIndentedString(nomeOrigemComercial)).append("\n");
    sb.append("    idFantasiaBasica: ").append(toIndentedString(idFantasiaBasica)).append("\n");
    sb.append("    nomeFantasiaBasica: ").append(toIndentedString(nomeFantasiaBasica)).append("\n");
    sb.append("    idStatusConta: ").append(toIndentedString(idStatusConta)).append("\n");
    sb.append("    statusConta: ").append(toIndentedString(statusConta)).append("\n");
    sb.append("    diaVencimento: ").append(toIndentedString(diaVencimento)).append("\n");
    sb.append("    melhorDiaCompra: ").append(toIndentedString(melhorDiaCompra)).append("\n");
    sb.append("    dataStatusConta: ").append(toIndentedString(dataStatusConta)).append("\n");
    sb.append("    dataCadastro: ").append(toIndentedString(dataCadastro)).append("\n");
    sb.append("    dataUltimaAlteracaoVencimento: ").append(toIndentedString(dataUltimaAlteracaoVencimento)).append("\n");
    sb.append("    dataHoraUltimaCompra: ").append(toIndentedString(dataHoraUltimaCompra)).append("\n");
    sb.append("    numeroAgencia: ").append(toIndentedString(numeroAgencia)).append("\n");
    sb.append("    numeroContaCorrente: ").append(toIndentedString(numeroContaCorrente)).append("\n");
    sb.append("    valorRenda: ").append(toIndentedString(valorRenda)).append("\n");
    sb.append("    formaEnvioFatura: ").append(toIndentedString(formaEnvioFatura)).append("\n");
    sb.append("    titular: ").append(toIndentedString(titular)).append("\n");
    sb.append("    limiteGlobal: ").append(toIndentedString(limiteGlobal)).append("\n");
    sb.append("    limiteSaqueGlobal: ").append(toIndentedString(limiteSaqueGlobal)).append("\n");
    sb.append("    saldoDisponivelGlobal: ").append(toIndentedString(saldoDisponivelGlobal)).append("\n");
    sb.append("    saldoDisponivelSaque: ").append(toIndentedString(saldoDisponivelSaque)).append("\n");
    sb.append("    impedidoFinanciamento: ").append(toIndentedString(impedidoFinanciamento)).append("\n");
    sb.append("    diasAtraso: ").append(toIndentedString(diasAtraso)).append("\n");
    sb.append("    proximoVencimentoPadrao: ").append(toIndentedString(proximoVencimentoPadrao)).append("\n");
    sb.append("    idProposta: ").append(toIndentedString(idProposta)).append("\n");
    sb.append("    quantidadePagamentos: ").append(toIndentedString(quantidadePagamentos)).append("\n");
    sb.append("    correspondencia: ").append(toIndentedString(correspondencia)).append("\n");
    sb.append("    dataInicioAtraso: ").append(toIndentedString(dataInicioAtraso)).append("\n");
    sb.append("    rotativoPagaJuros: ").append(toIndentedString(rotativoPagaJuros)).append("\n");
    sb.append("    totalPosProx: ").append(toIndentedString(totalPosProx)).append("\n");
    sb.append("    saldoAtualFinal: ").append(toIndentedString(saldoAtualFinal)).append("\n");
    sb.append("    saldoExtratoAnterior: ").append(toIndentedString(saldoExtratoAnterior)).append("\n");
    sb.append("    aceitaNovaContaPorGrupoProduto: ").append(toIndentedString(aceitaNovaContaPorGrupoProduto)).append("\n");
    sb.append("    funcaoAtiva: ").append(toIndentedString(funcaoAtiva)).append("\n");
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

