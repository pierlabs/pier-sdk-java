package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o da resposta da opera\u00E7\u00E3o banc\u00E1ria
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta da opera\u00E7\u00E3o banc\u00E1ria")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OperacaoBancariaResponse   {
  
  private String agenciaBeneficiario = null;
  private String agenciaPagadora = null;
  private String bancoBeneficiario = null;
  private String bancoPagador = null;
  private String codigoIspb = null;
  private String contaBeneficiario = null;
  private String contaPagadora = null;
  private String cpfCnpjBeneficiario = null;
  private String dataAgendamento = null;
  private String dataHoraOperacao = null;
  private String dataRealizacao = null;
  private String dvContaBeneficiario = null;
  private String dvContaPagadora = null;
  private Long id = null;
  private Long idCartaoDestino = null;
  private Long idCartaoOrigem = null;
  private Long idCelularRecarga = null;
  private Long idContaDestino = null;
  private Long idContaOrigem = null;
  private Long idDadosBancariosConta = null;
  private Long idDocumento = null;
  private Long idEventoAjusteDestino = null;
  private Long idEventoAjusteOrigem = null;
  private String idExterno = null;
  private Long idOperacaoBancariaOriginal = null;
  private Long idTipoOperacaoBancaria = null;
  private String nomeBeneficiario = null;
  private String nomePagador = null;
  private Long numeroBilheteUnico = null;
  private String observacao = null;


  public enum StatusEnum {
    NORMAL("NORMAL"),
    CANCELADA("CANCELADA"),
    PROCESSADA("PROCESSADA"),
    PENDENTE("PENDENTE"),
    DESFEITA("DESFEITA"),
    ESTORNADA("ESTORNADA"),
    AGENDADA("AGENDADA"),
    CANCELADA_SEM_SALDO("CANCELADA_SEM_SALDO"),
    ESTORNO_INFOS_INCORRETAS("ESTORNO_INFOS_INCORRETAS"),
    ESTORNO_TED("ESTORNO_TED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;
  private BigDecimal valorOperacao = null;
  private BigDecimal valorTarifa = null;

  
  /**
   * Origem da ag\u00EAncia envolvendo transfer\u00EAncias
   **/
  public OperacaoBancariaResponse agenciaBeneficiario(String agenciaBeneficiario) {
    this.agenciaBeneficiario = agenciaBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Origem da ag\u00EAncia envolvendo transfer\u00EAncias")
  @JsonProperty("agenciaBeneficiario")
  public String getAgenciaBeneficiario() {
    return agenciaBeneficiario;
  }
  public void setAgenciaBeneficiario(String agenciaBeneficiario) {
    this.agenciaBeneficiario = agenciaBeneficiario;
  }

  
  /**
   * N\u00FAmero da ag\u00EAncia do pagador
   **/
  public OperacaoBancariaResponse agenciaPagadora(String agenciaPagadora) {
    this.agenciaPagadora = agenciaPagadora;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da ag\u00EAncia do pagador")
  @JsonProperty("agenciaPagadora")
  public String getAgenciaPagadora() {
    return agenciaPagadora;
  }
  public void setAgenciaPagadora(String agenciaPagadora) {
    this.agenciaPagadora = agenciaPagadora;
  }

  
  /**
   * Origem do banco envolvendo transfer\u00EAncias
   **/
  public OperacaoBancariaResponse bancoBeneficiario(String bancoBeneficiario) {
    this.bancoBeneficiario = bancoBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Origem do banco envolvendo transfer\u00EAncias")
  @JsonProperty("bancoBeneficiario")
  public String getBancoBeneficiario() {
    return bancoBeneficiario;
  }
  public void setBancoBeneficiario(String bancoBeneficiario) {
    this.bancoBeneficiario = bancoBeneficiario;
  }

  
  /**
   * N\u00FAmero do banco do pagador
   **/
  public OperacaoBancariaResponse bancoPagador(String bancoPagador) {
    this.bancoPagador = bancoPagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do banco do pagador")
  @JsonProperty("bancoPagador")
  public String getBancoPagador() {
    return bancoPagador;
  }
  public void setBancoPagador(String bancoPagador) {
    this.bancoPagador = bancoPagador;
  }

  
  /**
   * C\u00F3digo ISPB do banco de destino
   **/
  public OperacaoBancariaResponse codigoIspb(String codigoIspb) {
    this.codigoIspb = codigoIspb;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo ISPB do banco de destino")
  @JsonProperty("codigoIspb")
  public String getCodigoIspb() {
    return codigoIspb;
  }
  public void setCodigoIspb(String codigoIspb) {
    this.codigoIspb = codigoIspb;
  }

  
  /**
   * Conta origem envolvendo transfer\u00EAncias
   **/
  public OperacaoBancariaResponse contaBeneficiario(String contaBeneficiario) {
    this.contaBeneficiario = contaBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conta origem envolvendo transfer\u00EAncias")
  @JsonProperty("contaBeneficiario")
  public String getContaBeneficiario() {
    return contaBeneficiario;
  }
  public void setContaBeneficiario(String contaBeneficiario) {
    this.contaBeneficiario = contaBeneficiario;
  }

  
  /**
   * N\u00FAmero da conta do pagador
   **/
  public OperacaoBancariaResponse contaPagadora(String contaPagadora) {
    this.contaPagadora = contaPagadora;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da conta do pagador")
  @JsonProperty("contaPagadora")
  public String getContaPagadora() {
    return contaPagadora;
  }
  public void setContaPagadora(String contaPagadora) {
    this.contaPagadora = contaPagadora;
  }

  
  /**
   * CPF/CNPJ do benefici\u00E1rio
   **/
  public OperacaoBancariaResponse cpfCnpjBeneficiario(String cpfCnpjBeneficiario) {
    this.cpfCnpjBeneficiario = cpfCnpjBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CPF/CNPJ do benefici\u00E1rio")
  @JsonProperty("cpfCnpjBeneficiario")
  public String getCpfCnpjBeneficiario() {
    return cpfCnpjBeneficiario;
  }
  public void setCpfCnpjBeneficiario(String cpfCnpjBeneficiario) {
    this.cpfCnpjBeneficiario = cpfCnpjBeneficiario;
  }

  
  /**
   * Data de agendameto da opera\u00E7\u00E3o banc\u00E1ria
   **/
  public OperacaoBancariaResponse dataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de agendameto da opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("dataAgendamento")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * Data e hora da opera\u00E7\u00E3o banc\u00E1ria
   **/
  public OperacaoBancariaResponse dataHoraOperacao(String dataHoraOperacao) {
    this.dataHoraOperacao = dataHoraOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e hora da opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("dataHoraOperacao")
  public String getDataHoraOperacao() {
    return dataHoraOperacao;
  }
  public void setDataHoraOperacao(String dataHoraOperacao) {
    this.dataHoraOperacao = dataHoraOperacao;
  }

  
  /**
   * Data de realiza\u00E7\u00E3o da opera\u00E7\u00E3o banc\u00E1ria
   **/
  public OperacaoBancariaResponse dataRealizacao(String dataRealizacao) {
    this.dataRealizacao = dataRealizacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de realiza\u00E7\u00E3o da opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("dataRealizacao")
  public String getDataRealizacao() {
    return dataRealizacao;
  }
  public void setDataRealizacao(String dataRealizacao) {
    this.dataRealizacao = dataRealizacao;
  }

  
  /**
   * D\u00EDgito da conta origem envolvendo transfer\u00EAncias
   **/
  public OperacaoBancariaResponse dvContaBeneficiario(String dvContaBeneficiario) {
    this.dvContaBeneficiario = dvContaBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00EDgito da conta origem envolvendo transfer\u00EAncias")
  @JsonProperty("dvContaBeneficiario")
  public String getDvContaBeneficiario() {
    return dvContaBeneficiario;
  }
  public void setDvContaBeneficiario(String dvContaBeneficiario) {
    this.dvContaBeneficiario = dvContaBeneficiario;
  }

  
  /**
   * D\u00EDgito verificador da conta do pagador
   **/
  public OperacaoBancariaResponse dvContaPagadora(String dvContaPagadora) {
    this.dvContaPagadora = dvContaPagadora;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00EDgito verificador da conta do pagador")
  @JsonProperty("dvContaPagadora")
  public String getDvContaPagadora() {
    return dvContaPagadora;
  }
  public void setDvContaPagadora(String dvContaPagadora) {
    this.dvContaPagadora = dvContaPagadora;
  }

  
  /**
   * C\u00F3digo identificador do registro de opera\u00E7\u00E3o banc\u00E1ria
   **/
  public OperacaoBancariaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do registro de opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador cart\u00E3o destino
   **/
  public OperacaoBancariaResponse idCartaoDestino(Long idCartaoDestino) {
    this.idCartaoDestino = idCartaoDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador cart\u00E3o destino")
  @JsonProperty("idCartaoDestino")
  public Long getIdCartaoDestino() {
    return idCartaoDestino;
  }
  public void setIdCartaoDestino(Long idCartaoDestino) {
    this.idCartaoDestino = idCartaoDestino;
  }

  
  /**
   * Identificador cart\u00E3o origem
   **/
  public OperacaoBancariaResponse idCartaoOrigem(Long idCartaoOrigem) {
    this.idCartaoOrigem = idCartaoOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador cart\u00E3o origem")
  @JsonProperty("idCartaoOrigem")
  public Long getIdCartaoOrigem() {
    return idCartaoOrigem;
  }
  public void setIdCartaoOrigem(Long idCartaoOrigem) {
    this.idCartaoOrigem = idCartaoOrigem;
  }

  
  /**
   * Identificador do celular
   **/
  public OperacaoBancariaResponse idCelularRecarga(Long idCelularRecarga) {
    this.idCelularRecarga = idCelularRecarga;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do celular")
  @JsonProperty("idCelularRecarga")
  public Long getIdCelularRecarga() {
    return idCelularRecarga;
  }
  public void setIdCelularRecarga(Long idCelularRecarga) {
    this.idCelularRecarga = idCelularRecarga;
  }

  
  /**
   * C\u00F3digo identificador da conta de destino
   **/
  public OperacaoBancariaResponse idContaDestino(Long idContaDestino) {
    this.idContaDestino = idContaDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da conta de destino")
  @JsonProperty("idContaDestino")
  public Long getIdContaDestino() {
    return idContaDestino;
  }
  public void setIdContaDestino(Long idContaDestino) {
    this.idContaDestino = idContaDestino;
  }

  
  /**
   * C\u00F3digo identificador da conta de origem
   **/
  public OperacaoBancariaResponse idContaOrigem(Long idContaOrigem) {
    this.idContaOrigem = idContaOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da conta de origem")
  @JsonProperty("idContaOrigem")
  public Long getIdContaOrigem() {
    return idContaOrigem;
  }
  public void setIdContaOrigem(Long idContaOrigem) {
    this.idContaOrigem = idContaOrigem;
  }

  
  /**
   * C\u00F3digo identificador da opera\u00E7\u00E3o banc\u00E1ria 
   **/
  public OperacaoBancariaResponse idDadosBancariosConta(Long idDadosBancariosConta) {
    this.idDadosBancariosConta = idDadosBancariosConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da opera\u00E7\u00E3o banc\u00E1ria ")
  @JsonProperty("idDadosBancariosConta")
  public Long getIdDadosBancariosConta() {
    return idDadosBancariosConta;
  }
  public void setIdDadosBancariosConta(Long idDadosBancariosConta) {
    this.idDadosBancariosConta = idDadosBancariosConta;
  }

  
  /**
   * Identificador do documento
   **/
  public OperacaoBancariaResponse idDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do documento")
  @JsonProperty("idDocumento")
  public Long getIdDocumento() {
    return idDocumento;
  }
  public void setIdDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
  }

  
  /**
   * Identificador destino do evento ajuste
   **/
  public OperacaoBancariaResponse idEventoAjusteDestino(Long idEventoAjusteDestino) {
    this.idEventoAjusteDestino = idEventoAjusteDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador destino do evento ajuste")
  @JsonProperty("idEventoAjusteDestino")
  public Long getIdEventoAjusteDestino() {
    return idEventoAjusteDestino;
  }
  public void setIdEventoAjusteDestino(Long idEventoAjusteDestino) {
    this.idEventoAjusteDestino = idEventoAjusteDestino;
  }

  
  /**
   * Identificador origem do evento ajuste
   **/
  public OperacaoBancariaResponse idEventoAjusteOrigem(Long idEventoAjusteOrigem) {
    this.idEventoAjusteOrigem = idEventoAjusteOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador origem do evento ajuste")
  @JsonProperty("idEventoAjusteOrigem")
  public Long getIdEventoAjusteOrigem() {
    return idEventoAjusteOrigem;
  }
  public void setIdEventoAjusteOrigem(Long idEventoAjusteOrigem) {
    this.idEventoAjusteOrigem = idEventoAjusteOrigem;
  }

  
  /**
   * C\u00F3digo identificador de opera\u00E7\u00F5es externas
   **/
  public OperacaoBancariaResponse idExterno(String idExterno) {
    this.idExterno = idExterno;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador de opera\u00E7\u00F5es externas")
  @JsonProperty("idExterno")
  public String getIdExterno() {
    return idExterno;
  }
  public void setIdExterno(String idExterno) {
    this.idExterno = idExterno;
  }

  
  /**
   * C\u00F3digo identificador da opera\u00E7\u00E3o banc\u00E1ria
   **/
  public OperacaoBancariaResponse idOperacaoBancariaOriginal(Long idOperacaoBancariaOriginal) {
    this.idOperacaoBancariaOriginal = idOperacaoBancariaOriginal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("idOperacaoBancariaOriginal")
  public Long getIdOperacaoBancariaOriginal() {
    return idOperacaoBancariaOriginal;
  }
  public void setIdOperacaoBancariaOriginal(Long idOperacaoBancariaOriginal) {
    this.idOperacaoBancariaOriginal = idOperacaoBancariaOriginal;
  }

  
  /**
   * C\u00F3digo identificador do tipo de opera\u00E7\u00E3o banc\u00E1ria
   **/
  public OperacaoBancariaResponse idTipoOperacaoBancaria(Long idTipoOperacaoBancaria) {
    this.idTipoOperacaoBancaria = idTipoOperacaoBancaria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do tipo de opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("idTipoOperacaoBancaria")
  public Long getIdTipoOperacaoBancaria() {
    return idTipoOperacaoBancaria;
  }
  public void setIdTipoOperacaoBancaria(Long idTipoOperacaoBancaria) {
    this.idTipoOperacaoBancaria = idTipoOperacaoBancaria;
  }

  
  /**
   * Nome do benefici\u00E1rio envolvendo transfer\u00EAncias
   **/
  public OperacaoBancariaResponse nomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do benefici\u00E1rio envolvendo transfer\u00EAncias")
  @JsonProperty("nomeBeneficiario")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * Nome do pagador
   **/
  public OperacaoBancariaResponse nomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do pagador")
  @JsonProperty("nomePagador")
  public String getNomePagador() {
    return nomePagador;
  }
  public void setNomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
  }

  
  /**
   * N\u00FAmero bilhete \u00FAnico
   **/
  public OperacaoBancariaResponse numeroBilheteUnico(Long numeroBilheteUnico) {
    this.numeroBilheteUnico = numeroBilheteUnico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero bilhete \u00FAnico")
  @JsonProperty("numeroBilheteUnico")
  public Long getNumeroBilheteUnico() {
    return numeroBilheteUnico;
  }
  public void setNumeroBilheteUnico(Long numeroBilheteUnico) {
    this.numeroBilheteUnico = numeroBilheteUnico;
  }

  
  /**
   * Observa\u00E7\u00E3o
   **/
  public OperacaoBancariaResponse observacao(String observacao) {
    this.observacao = observacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Observa\u00E7\u00E3o")
  @JsonProperty("observacao")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * Status da opera\u00E7\u00E3o
   **/
  public OperacaoBancariaResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status da opera\u00E7\u00E3o")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Valor da opera\u00E7\u00E3o banc\u00E1ria
   **/
  public OperacaoBancariaResponse valorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("valorOperacao")
  public BigDecimal getValorOperacao() {
    return valorOperacao;
  }
  public void setValorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
  }

  
  /**
   * Valor da tarifa cobrada pela opera\u00E7\u00E3o
   **/
  public OperacaoBancariaResponse valorTarifa(BigDecimal valorTarifa) {
    this.valorTarifa = valorTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor da tarifa cobrada pela opera\u00E7\u00E3o")
  @JsonProperty("valorTarifa")
  public BigDecimal getValorTarifa() {
    return valorTarifa;
  }
  public void setValorTarifa(BigDecimal valorTarifa) {
    this.valorTarifa = valorTarifa;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperacaoBancariaResponse operacaoBancariaResponse = (OperacaoBancariaResponse) o;
    return Objects.equals(this.agenciaBeneficiario, operacaoBancariaResponse.agenciaBeneficiario) &&
        Objects.equals(this.agenciaPagadora, operacaoBancariaResponse.agenciaPagadora) &&
        Objects.equals(this.bancoBeneficiario, operacaoBancariaResponse.bancoBeneficiario) &&
        Objects.equals(this.bancoPagador, operacaoBancariaResponse.bancoPagador) &&
        Objects.equals(this.codigoIspb, operacaoBancariaResponse.codigoIspb) &&
        Objects.equals(this.contaBeneficiario, operacaoBancariaResponse.contaBeneficiario) &&
        Objects.equals(this.contaPagadora, operacaoBancariaResponse.contaPagadora) &&
        Objects.equals(this.cpfCnpjBeneficiario, operacaoBancariaResponse.cpfCnpjBeneficiario) &&
        Objects.equals(this.dataAgendamento, operacaoBancariaResponse.dataAgendamento) &&
        Objects.equals(this.dataHoraOperacao, operacaoBancariaResponse.dataHoraOperacao) &&
        Objects.equals(this.dataRealizacao, operacaoBancariaResponse.dataRealizacao) &&
        Objects.equals(this.dvContaBeneficiario, operacaoBancariaResponse.dvContaBeneficiario) &&
        Objects.equals(this.dvContaPagadora, operacaoBancariaResponse.dvContaPagadora) &&
        Objects.equals(this.id, operacaoBancariaResponse.id) &&
        Objects.equals(this.idCartaoDestino, operacaoBancariaResponse.idCartaoDestino) &&
        Objects.equals(this.idCartaoOrigem, operacaoBancariaResponse.idCartaoOrigem) &&
        Objects.equals(this.idCelularRecarga, operacaoBancariaResponse.idCelularRecarga) &&
        Objects.equals(this.idContaDestino, operacaoBancariaResponse.idContaDestino) &&
        Objects.equals(this.idContaOrigem, operacaoBancariaResponse.idContaOrigem) &&
        Objects.equals(this.idDadosBancariosConta, operacaoBancariaResponse.idDadosBancariosConta) &&
        Objects.equals(this.idDocumento, operacaoBancariaResponse.idDocumento) &&
        Objects.equals(this.idEventoAjusteDestino, operacaoBancariaResponse.idEventoAjusteDestino) &&
        Objects.equals(this.idEventoAjusteOrigem, operacaoBancariaResponse.idEventoAjusteOrigem) &&
        Objects.equals(this.idExterno, operacaoBancariaResponse.idExterno) &&
        Objects.equals(this.idOperacaoBancariaOriginal, operacaoBancariaResponse.idOperacaoBancariaOriginal) &&
        Objects.equals(this.idTipoOperacaoBancaria, operacaoBancariaResponse.idTipoOperacaoBancaria) &&
        Objects.equals(this.nomeBeneficiario, operacaoBancariaResponse.nomeBeneficiario) &&
        Objects.equals(this.nomePagador, operacaoBancariaResponse.nomePagador) &&
        Objects.equals(this.numeroBilheteUnico, operacaoBancariaResponse.numeroBilheteUnico) &&
        Objects.equals(this.observacao, operacaoBancariaResponse.observacao) &&
        Objects.equals(this.status, operacaoBancariaResponse.status) &&
        Objects.equals(this.valorOperacao, operacaoBancariaResponse.valorOperacao) &&
        Objects.equals(this.valorTarifa, operacaoBancariaResponse.valorTarifa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agenciaBeneficiario, agenciaPagadora, bancoBeneficiario, bancoPagador, codigoIspb, contaBeneficiario, contaPagadora, cpfCnpjBeneficiario, dataAgendamento, dataHoraOperacao, dataRealizacao, dvContaBeneficiario, dvContaPagadora, id, idCartaoDestino, idCartaoOrigem, idCelularRecarga, idContaDestino, idContaOrigem, idDadosBancariosConta, idDocumento, idEventoAjusteDestino, idEventoAjusteOrigem, idExterno, idOperacaoBancariaOriginal, idTipoOperacaoBancaria, nomeBeneficiario, nomePagador, numeroBilheteUnico, observacao, status, valorOperacao, valorTarifa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoBancariaResponse {\n");
    
    sb.append("    agenciaBeneficiario: ").append(toIndentedString(agenciaBeneficiario)).append("\n");
    sb.append("    agenciaPagadora: ").append(toIndentedString(agenciaPagadora)).append("\n");
    sb.append("    bancoBeneficiario: ").append(toIndentedString(bancoBeneficiario)).append("\n");
    sb.append("    bancoPagador: ").append(toIndentedString(bancoPagador)).append("\n");
    sb.append("    codigoIspb: ").append(toIndentedString(codigoIspb)).append("\n");
    sb.append("    contaBeneficiario: ").append(toIndentedString(contaBeneficiario)).append("\n");
    sb.append("    contaPagadora: ").append(toIndentedString(contaPagadora)).append("\n");
    sb.append("    cpfCnpjBeneficiario: ").append(toIndentedString(cpfCnpjBeneficiario)).append("\n");
    sb.append("    dataAgendamento: ").append(toIndentedString(dataAgendamento)).append("\n");
    sb.append("    dataHoraOperacao: ").append(toIndentedString(dataHoraOperacao)).append("\n");
    sb.append("    dataRealizacao: ").append(toIndentedString(dataRealizacao)).append("\n");
    sb.append("    dvContaBeneficiario: ").append(toIndentedString(dvContaBeneficiario)).append("\n");
    sb.append("    dvContaPagadora: ").append(toIndentedString(dvContaPagadora)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCartaoDestino: ").append(toIndentedString(idCartaoDestino)).append("\n");
    sb.append("    idCartaoOrigem: ").append(toIndentedString(idCartaoOrigem)).append("\n");
    sb.append("    idCelularRecarga: ").append(toIndentedString(idCelularRecarga)).append("\n");
    sb.append("    idContaDestino: ").append(toIndentedString(idContaDestino)).append("\n");
    sb.append("    idContaOrigem: ").append(toIndentedString(idContaOrigem)).append("\n");
    sb.append("    idDadosBancariosConta: ").append(toIndentedString(idDadosBancariosConta)).append("\n");
    sb.append("    idDocumento: ").append(toIndentedString(idDocumento)).append("\n");
    sb.append("    idEventoAjusteDestino: ").append(toIndentedString(idEventoAjusteDestino)).append("\n");
    sb.append("    idEventoAjusteOrigem: ").append(toIndentedString(idEventoAjusteOrigem)).append("\n");
    sb.append("    idExterno: ").append(toIndentedString(idExterno)).append("\n");
    sb.append("    idOperacaoBancariaOriginal: ").append(toIndentedString(idOperacaoBancariaOriginal)).append("\n");
    sb.append("    idTipoOperacaoBancaria: ").append(toIndentedString(idTipoOperacaoBancaria)).append("\n");
    sb.append("    nomeBeneficiario: ").append(toIndentedString(nomeBeneficiario)).append("\n");
    sb.append("    nomePagador: ").append(toIndentedString(nomePagador)).append("\n");
    sb.append("    numeroBilheteUnico: ").append(toIndentedString(numeroBilheteUnico)).append("\n");
    sb.append("    observacao: ").append(toIndentedString(observacao)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    valorOperacao: ").append(toIndentedString(valorOperacao)).append("\n");
    sb.append("    valorTarifa: ").append(toIndentedString(valorTarifa)).append("\n");
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

