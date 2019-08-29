package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto conta
 **/

@ApiModel(description = "Objeto conta")
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
    CREDITO("CREDITO"),
    DEBITO("DEBITO");

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
  private Boolean possuiOverLimit = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o de conta (id)
   **/
  public ContaDetalheResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o de conta (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa Titular da Conta (id)
   **/
  public ContaDetalheResponse idPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa Titular da Conta (id)")
  @JsonProperty("idPessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Apresenta o 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00E3o Social (Nome Empresarial)'
   **/
  public ContaDetalheResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00E3o Social (Nome Empresarial)'")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do produto ao qual a conta faz parte. (id)
   **/
  public ContaDetalheResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do produto ao qual a conta faz parte. (id)")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Origem Comercial (id) que deu origem a Conta
   **/
  public ContaDetalheResponse idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Origem Comercial (id) que deu origem a Conta")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Nome da origem comercial
   **/
  public ContaDetalheResponse nomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da origem comercial")
  @JsonProperty("nomeOrigemComercial")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Fantasia Basica (id)
   **/
  public ContaDetalheResponse idFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o da Fantasia Basica (id)")
  @JsonProperty("idFantasiaBasica")
  public Long getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  
  /**
   * Nome da Fantasia Basica
   **/
  public ContaDetalheResponse nomeFantasiaBasica(String nomeFantasiaBasica) {
    this.nomeFantasiaBasica = nomeFantasiaBasica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da Fantasia Basica")
  @JsonProperty("nomeFantasiaBasica")
  public String getNomeFantasiaBasica() {
    return nomeFantasiaBasica;
  }
  public void setNomeFantasiaBasica(String nomeFantasiaBasica) {
    this.nomeFantasiaBasica = nomeFantasiaBasica;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do status atribuido a conta
   **/
  public ContaDetalheResponse idStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do status atribuido a conta")
  @JsonProperty("idStatusConta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * Descri\u00E7\u00E3o do status da conta
   **/
  public ContaDetalheResponse statusConta(String statusConta) {
    this.statusConta = statusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do status da conta")
  @JsonProperty("statusConta")
  public String getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * Apresenta o dia de vencimento
   **/
  public ContaDetalheResponse diaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o dia de vencimento")
  @JsonProperty("diaVencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Apresenta o melhor dia de compra
   **/
  public ContaDetalheResponse melhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o melhor dia de compra")
  @JsonProperty("melhorDiaCompra")
  public Integer getMelhorDiaCompra() {
    return melhorDiaCompra;
  }
  public void setMelhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
  }

  
  /**
   * Apresenta a data em que o idStatusConta atual fora atribu\u00EDdo para ela
   **/
  public ContaDetalheResponse dataStatusConta(String dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data em que o idStatusConta atual fora atribu\u00EDdo para ela")
  @JsonProperty("dataStatusConta")
  public String getDataStatusConta() {
    return dataStatusConta;
  }
  public void setDataStatusConta(String dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
  }

  
  /**
   * Apresenta a data em que o cart\u00E3o foi gerado
   **/
  public ContaDetalheResponse dataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data em que o cart\u00E3o foi gerado")
  @JsonProperty("dataCadastro")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Apresenta a data da ultima altera\u00E7\u00E3o de vencimento
   **/
  public ContaDetalheResponse dataUltimaAlteracaoVencimento(String dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data da ultima altera\u00E7\u00E3o de vencimento")
  @JsonProperty("dataUltimaAlteracaoVencimento")
  public String getDataUltimaAlteracaoVencimento() {
    return dataUltimaAlteracaoVencimento;
  }
  public void setDataUltimaAlteracaoVencimento(String dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
  }

  
  /**
   * Apresenta a data da ultima altera\u00E7\u00E3o de vencimento
   **/
  public ContaDetalheResponse dataHoraUltimaCompra(String dataHoraUltimaCompra) {
    this.dataHoraUltimaCompra = dataHoraUltimaCompra;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data da ultima altera\u00E7\u00E3o de vencimento")
  @JsonProperty("dataHoraUltimaCompra")
  public String getDataHoraUltimaCompra() {
    return dataHoraUltimaCompra;
  }
  public void setDataHoraUltimaCompra(String dataHoraUltimaCompra) {
    this.dataHoraUltimaCompra = dataHoraUltimaCompra;
  }

  
  /**
   * N\u00FAmero da ag\u00EAncia
   **/
  public ContaDetalheResponse numeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da ag\u00EAncia")
  @JsonProperty("numeroAgencia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * N\u00FAmero da conta corrente
   **/
  public ContaDetalheResponse numeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da conta corrente")
  @JsonProperty("numeroContaCorrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Valor da renda comprovada
   **/
  public ContaDetalheResponse valorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da renda comprovada")
  @JsonProperty("valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Forma de envio da fatura
   **/
  public ContaDetalheResponse formaEnvioFatura(String formaEnvioFatura) {
    this.formaEnvioFatura = formaEnvioFatura;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Forma de envio da fatura")
  @JsonProperty("formaEnvioFatura")
  public String getFormaEnvioFatura() {
    return formaEnvioFatura;
  }
  public void setFormaEnvioFatura(String formaEnvioFatura) {
    this.formaEnvioFatura = formaEnvioFatura;
  }

  
  /**
   * Apresenta se a pessoa \u00E9 titular da conta
   **/
  public ContaDetalheResponse titular(Boolean titular) {
    this.titular = titular;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Apresenta se a pessoa \u00E9 titular da conta")
  @JsonProperty("titular")
  public Boolean getTitular() {
    return titular;
  }
  public void setTitular(Boolean titular) {
    this.titular = titular;
  }

  
  /**
   * Apresenta o valor do limite de cr\u00E9dito que o portador do cart\u00E3o possui
   **/
  public ContaDetalheResponse limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o valor do limite de cr\u00E9dito que o portador do cart\u00E3o possui")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional
   **/
  public ContaDetalheResponse limiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional")
  @JsonProperty("limiteSaqueGlobal")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para uso exclusivo em Compras Nacionais
   **/
  public ContaDetalheResponse saldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para uso exclusivo em Compras Nacionais")
  @JsonProperty("saldoDisponivelGlobal")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional dentro de cada ciclo de faturamento
   **/
  public ContaDetalheResponse saldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional dentro de cada ciclo de faturamento")
  @JsonProperty("saldoDisponivelSaque")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito(Lei n. 4.595/64)
   **/
  public ContaDetalheResponse impedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito(Lei n. 4.595/64)")
  @JsonProperty("impedidoFinanciamento")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  
  /**
   * Apresenta a quantidade de dias que a conta esta em atraso
   **/
  public ContaDetalheResponse diasAtraso(Long diasAtraso) {
    this.diasAtraso = diasAtraso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a quantidade de dias que a conta esta em atraso")
  @JsonProperty("diasAtraso")
  public Long getDiasAtraso() {
    return diasAtraso;
  }
  public void setDiasAtraso(Long diasAtraso) {
    this.diasAtraso = diasAtraso;
  }

  
  /**
   * Pr\u00F3ximo Vencimento Padr\u00E3o
   **/
  public ContaDetalheResponse proximoVencimentoPadrao(String proximoVencimentoPadrao) {
    this.proximoVencimentoPadrao = proximoVencimentoPadrao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Pr\u00F3ximo Vencimento Padr\u00E3o")
  @JsonProperty("proximoVencimentoPadrao")
  public String getProximoVencimentoPadrao() {
    return proximoVencimentoPadrao;
  }
  public void setProximoVencimentoPadrao(String proximoVencimentoPadrao) {
    this.proximoVencimentoPadrao = proximoVencimentoPadrao;
  }

  
  /**
   * Identificador da proposta
   **/
  public ContaDetalheResponse idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da proposta")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * Quantidade de pagamentos
   **/
  public ContaDetalheResponse quantidadePagamentos(Integer quantidadePagamentos) {
    this.quantidadePagamentos = quantidadePagamentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de pagamentos")
  @JsonProperty("quantidadePagamentos")
  public Integer getQuantidadePagamentos() {
    return quantidadePagamentos;
  }
  public void setQuantidadePagamentos(Integer quantidadePagamentos) {
    this.quantidadePagamentos = quantidadePagamentos;
  }

  
  /**
   * correspond\u00EAncia
   **/
  public ContaDetalheResponse correspondencia(Long correspondencia) {
    this.correspondencia = correspondencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "correspond\u00EAncia")
  @JsonProperty("correspondencia")
  public Long getCorrespondencia() {
    return correspondencia;
  }
  public void setCorrespondencia(Long correspondencia) {
    this.correspondencia = correspondencia;
  }

  
  /**
   * Data de vencimento da cobran\u00E7a
   **/
  public ContaDetalheResponse dataInicioAtraso(String dataInicioAtraso) {
    this.dataInicioAtraso = dataInicioAtraso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de vencimento da cobran\u00E7a")
  @JsonProperty("dataInicioAtraso")
  public String getDataInicioAtraso() {
    return dataInicioAtraso;
  }
  public void setDataInicioAtraso(String dataInicioAtraso) {
    this.dataInicioAtraso = dataInicioAtraso;
  }

  
  /**
   * Apresenta valor rotativo de juros da conta
   **/
  public ContaDetalheResponse rotativoPagaJuros(BigDecimal rotativoPagaJuros) {
    this.rotativoPagaJuros = rotativoPagaJuros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta valor rotativo de juros da conta")
  @JsonProperty("rotativoPagaJuros")
  public BigDecimal getRotativoPagaJuros() {
    return rotativoPagaJuros;
  }
  public void setRotativoPagaJuros(BigDecimal rotativoPagaJuros) {
    this.rotativoPagaJuros = rotativoPagaJuros;
  }

  
  /**
   * Apresenta valor da fatura ap\u00F3s a pr\u00F3xima
   **/
  public ContaDetalheResponse totalPosProx(BigDecimal totalPosProx) {
    this.totalPosProx = totalPosProx;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta valor da fatura ap\u00F3s a pr\u00F3xima")
  @JsonProperty("totalPosProx")
  public BigDecimal getTotalPosProx() {
    return totalPosProx;
  }
  public void setTotalPosProx(BigDecimal totalPosProx) {
    this.totalPosProx = totalPosProx;
  }

  
  /**
   * Apresenta valor do saldo atual final
   **/
  public ContaDetalheResponse saldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta valor do saldo atual final")
  @JsonProperty("saldoAtualFinal")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * Apresenta o saldo do extrato anterior da conta
   **/
  public ContaDetalheResponse saldoExtratoAnterior(BigDecimal saldoExtratoAnterior) {
    this.saldoExtratoAnterior = saldoExtratoAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o saldo do extrato anterior da conta")
  @JsonProperty("saldoExtratoAnterior")
  public BigDecimal getSaldoExtratoAnterior() {
    return saldoExtratoAnterior;
  }
  public void setSaldoExtratoAnterior(BigDecimal saldoExtratoAnterior) {
    this.saldoExtratoAnterior = saldoExtratoAnterior;
  }

  
  /**
   * Flag que indica a aceita\u00E7\u00E3o de abertura de nova conta por grupo de produtos
   **/
  public ContaDetalheResponse aceitaNovaContaPorGrupoProduto(Boolean aceitaNovaContaPorGrupoProduto) {
    this.aceitaNovaContaPorGrupoProduto = aceitaNovaContaPorGrupoProduto;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica a aceita\u00E7\u00E3o de abertura de nova conta por grupo de produtos")
  @JsonProperty("aceitaNovaContaPorGrupoProduto")
  public Boolean getAceitaNovaContaPorGrupoProduto() {
    return aceitaNovaContaPorGrupoProduto;
  }
  public void setAceitaNovaContaPorGrupoProduto(Boolean aceitaNovaContaPorGrupoProduto) {
    this.aceitaNovaContaPorGrupoProduto = aceitaNovaContaPorGrupoProduto;
  }

  
  /**
   * Fun\u00E7\u00E3o ativa da conta
   **/
  public ContaDetalheResponse funcaoAtiva(FuncaoAtivaEnum funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fun\u00E7\u00E3o ativa da conta")
  @JsonProperty("funcaoAtiva")
  public FuncaoAtivaEnum getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(FuncaoAtivaEnum funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  
  /**
   * Sinaliza se o OverLimit da conta est\uFFFD ativo
   **/
  public ContaDetalheResponse possuiOverLimit(Boolean possuiOverLimit) {
    this.possuiOverLimit = possuiOverLimit;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Sinaliza se o OverLimit da conta est\uFFFD ativo")
  @JsonProperty("possuiOverLimit")
  public Boolean getPossuiOverLimit() {
    return possuiOverLimit;
  }
  public void setPossuiOverLimit(Boolean possuiOverLimit) {
    this.possuiOverLimit = possuiOverLimit;
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
        Objects.equals(this.funcaoAtiva, contaDetalheResponse.funcaoAtiva) &&
        Objects.equals(this.possuiOverLimit, contaDetalheResponse.possuiOverLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idPessoa, nome, idProduto, idOrigemComercial, nomeOrigemComercial, idFantasiaBasica, nomeFantasiaBasica, idStatusConta, statusConta, diaVencimento, melhorDiaCompra, dataStatusConta, dataCadastro, dataUltimaAlteracaoVencimento, dataHoraUltimaCompra, numeroAgencia, numeroContaCorrente, valorRenda, formaEnvioFatura, titular, limiteGlobal, limiteSaqueGlobal, saldoDisponivelGlobal, saldoDisponivelSaque, impedidoFinanciamento, diasAtraso, proximoVencimentoPadrao, idProposta, quantidadePagamentos, correspondencia, dataInicioAtraso, rotativoPagaJuros, totalPosProx, saldoAtualFinal, saldoExtratoAnterior, aceitaNovaContaPorGrupoProduto, funcaoAtiva, possuiOverLimit);
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
    sb.append("    possuiOverLimit: ").append(toIndentedString(possuiOverLimit)).append("\n");
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

