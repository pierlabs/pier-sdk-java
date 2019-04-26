package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de persist\u00EAncia da opera\u00E7\u00E3o banc\u00E1ria
 **/

@ApiModel(description = "Objeto de persist\u00EAncia da opera\u00E7\u00E3o banc\u00E1ria")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OperacaoBancariaPersist   {
  
  private Long idTipoOperacaoBancaria = null;
  private Long idContaDestino = null;
  private Long idCartaoOrigem = null;
  private Long idCartaoDestino = null;
  private String bancoPagador = null;
  private String agenciaPagadora = null;
  private String contaPagadora = null;
  private String dvContaPagadora = null;
  private String nomePagador = null;
  private String cpfCnpjBeneficiario = null;
  private Long idEventoAjusteOrigem = null;
  private Long idEventoAjusteDestino = null;
  private String idExterno = null;
  private String codigoIspb = null;
  private BigDecimal valorOperacao = null;
  private BigDecimal valorTarifa = null;
  private String dataHoraOperacao = null;
  private String dataAgendamento = null;
  private String dataRealizacao = null;


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
  private Long idDadosBancariosConta = null;
  private Long idOperacaoBancariaOriginal = null;
  private String observacao = null;
  private Long numeroBilheteUnico = null;
  private Long idDocumento = null;
  private Long idCelularRecarga = null;
  private String nomeBeneficiario = null;
  private String bancoBeneficiario = null;
  private String agenciaBeneficiario = null;
  private String contaBeneficiario = null;
  private String dvContaBeneficiario = null;

  
  /**
   * C\u00F3digo identificador do tipo de opera\u00E7\u00E3o banc\u00E1ria
   **/
  public OperacaoBancariaPersist idTipoOperacaoBancaria(Long idTipoOperacaoBancaria) {
    this.idTipoOperacaoBancaria = idTipoOperacaoBancaria;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador do tipo de opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("idTipoOperacaoBancaria")
  public Long getIdTipoOperacaoBancaria() {
    return idTipoOperacaoBancaria;
  }
  public void setIdTipoOperacaoBancaria(Long idTipoOperacaoBancaria) {
    this.idTipoOperacaoBancaria = idTipoOperacaoBancaria;
  }

  
  /**
   * C\u00F3digo identificador da conta de destino
   **/
  public OperacaoBancariaPersist idContaDestino(Long idContaDestino) {
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
   * C\u00F3digo identificador do cart\u00E3o de origem
   **/
  public OperacaoBancariaPersist idCartaoOrigem(Long idCartaoOrigem) {
    this.idCartaoOrigem = idCartaoOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do cart\u00E3o de origem")
  @JsonProperty("idCartaoOrigem")
  public Long getIdCartaoOrigem() {
    return idCartaoOrigem;
  }
  public void setIdCartaoOrigem(Long idCartaoOrigem) {
    this.idCartaoOrigem = idCartaoOrigem;
  }

  
  /**
   * C\u00F3digo identificador do cart\u00E3o de destino
   **/
  public OperacaoBancariaPersist idCartaoDestino(Long idCartaoDestino) {
    this.idCartaoDestino = idCartaoDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do cart\u00E3o de destino")
  @JsonProperty("idCartaoDestino")
  public Long getIdCartaoDestino() {
    return idCartaoDestino;
  }
  public void setIdCartaoDestino(Long idCartaoDestino) {
    this.idCartaoDestino = idCartaoDestino;
  }

  
  /**
   * N\u00FAmero do banco pagador
   **/
  public OperacaoBancariaPersist bancoPagador(String bancoPagador) {
    this.bancoPagador = bancoPagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do banco pagador")
  @JsonProperty("bancoPagador")
  public String getBancoPagador() {
    return bancoPagador;
  }
  public void setBancoPagador(String bancoPagador) {
    this.bancoPagador = bancoPagador;
  }

  
  /**
   * N\u00FAmero da ag\u00EAncia pagadora
   **/
  public OperacaoBancariaPersist agenciaPagadora(String agenciaPagadora) {
    this.agenciaPagadora = agenciaPagadora;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da ag\u00EAncia pagadora")
  @JsonProperty("agenciaPagadora")
  public String getAgenciaPagadora() {
    return agenciaPagadora;
  }
  public void setAgenciaPagadora(String agenciaPagadora) {
    this.agenciaPagadora = agenciaPagadora;
  }

  
  /**
   * N\u00FAmero da conta pagadora
   **/
  public OperacaoBancariaPersist contaPagadora(String contaPagadora) {
    this.contaPagadora = contaPagadora;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da conta pagadora")
  @JsonProperty("contaPagadora")
  public String getContaPagadora() {
    return contaPagadora;
  }
  public void setContaPagadora(String contaPagadora) {
    this.contaPagadora = contaPagadora;
  }

  
  /**
   * D\u00EDgito verificador da conta do favorecido
   **/
  public OperacaoBancariaPersist dvContaPagadora(String dvContaPagadora) {
    this.dvContaPagadora = dvContaPagadora;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00EDgito verificador da conta do favorecido")
  @JsonProperty("dvContaPagadora")
  public String getDvContaPagadora() {
    return dvContaPagadora;
  }
  public void setDvContaPagadora(String dvContaPagadora) {
    this.dvContaPagadora = dvContaPagadora;
  }

  
  /**
   * Nome do pagador
   **/
  public OperacaoBancariaPersist nomePagador(String nomePagador) {
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
   * CPF/CNPJ do benefici\u00E1rio
   **/
  public OperacaoBancariaPersist cpfCnpjBeneficiario(String cpfCnpjBeneficiario) {
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
   * Identificador evento origem
   **/
  public OperacaoBancariaPersist idEventoAjusteOrigem(Long idEventoAjusteOrigem) {
    this.idEventoAjusteOrigem = idEventoAjusteOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador evento origem")
  @JsonProperty("idEventoAjusteOrigem")
  public Long getIdEventoAjusteOrigem() {
    return idEventoAjusteOrigem;
  }
  public void setIdEventoAjusteOrigem(Long idEventoAjusteOrigem) {
    this.idEventoAjusteOrigem = idEventoAjusteOrigem;
  }

  
  /**
   * Identificador evento destino
   **/
  public OperacaoBancariaPersist idEventoAjusteDestino(Long idEventoAjusteDestino) {
    this.idEventoAjusteDestino = idEventoAjusteDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador evento destino")
  @JsonProperty("idEventoAjusteDestino")
  public Long getIdEventoAjusteDestino() {
    return idEventoAjusteDestino;
  }
  public void setIdEventoAjusteDestino(Long idEventoAjusteDestino) {
    this.idEventoAjusteDestino = idEventoAjusteDestino;
  }

  
  /**
   * C\u00F3digo identificador de opera\u00E7\u00F5es externas
   **/
  public OperacaoBancariaPersist idExterno(String idExterno) {
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
   * C\u00F3digo ISPB do banco de destino
   **/
  public OperacaoBancariaPersist codigoIspb(String codigoIspb) {
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
   * Valor da opera\u00E7\u00E3o banc\u00E1ria
   **/
  public OperacaoBancariaPersist valorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor da opera\u00E7\u00E3o banc\u00E1ria")
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
  public OperacaoBancariaPersist valorTarifa(BigDecimal valorTarifa) {
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

  
  /**
   * Data e hora da opera\u00E7\u00E3o banc\u00E1ria
   **/
  public OperacaoBancariaPersist dataHoraOperacao(String dataHoraOperacao) {
    this.dataHoraOperacao = dataHoraOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data e hora da opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("dataHoraOperacao")
  public String getDataHoraOperacao() {
    return dataHoraOperacao;
  }
  public void setDataHoraOperacao(String dataHoraOperacao) {
    this.dataHoraOperacao = dataHoraOperacao;
  }

  
  /**
   * Data de agendameto da opera\u00E7\u00E3o banc\u00E1ria
   **/
  public OperacaoBancariaPersist dataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de agendameto da opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("dataAgendamento")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * Data de realiza\u00E7\u00E3o da opera\u00E7\u00E3o banc\u00E1ria
   **/
  public OperacaoBancariaPersist dataRealizacao(String dataRealizacao) {
    this.dataRealizacao = dataRealizacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de realiza\u00E7\u00E3o da opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("dataRealizacao")
  public String getDataRealizacao() {
    return dataRealizacao;
  }
  public void setDataRealizacao(String dataRealizacao) {
    this.dataRealizacao = dataRealizacao;
  }

  
  /**
   * Status da opera\u00E7\u00E3o
   **/
  public OperacaoBancariaPersist status(StatusEnum status) {
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
   * Identificador da conta banc\u00E1ria
   **/
  public OperacaoBancariaPersist idDadosBancariosConta(Long idDadosBancariosConta) {
    this.idDadosBancariosConta = idDadosBancariosConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identificador da conta banc\u00E1ria")
  @JsonProperty("idDadosBancariosConta")
  public Long getIdDadosBancariosConta() {
    return idDadosBancariosConta;
  }
  public void setIdDadosBancariosConta(Long idDadosBancariosConta) {
    this.idDadosBancariosConta = idDadosBancariosConta;
  }

  
  /**
   * Identificador da opera\u00E7\u00E3o banc\u00E1ria original
   **/
  public OperacaoBancariaPersist idOperacaoBancariaOriginal(Long idOperacaoBancariaOriginal) {
    this.idOperacaoBancariaOriginal = idOperacaoBancariaOriginal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da opera\u00E7\u00E3o banc\u00E1ria original")
  @JsonProperty("idOperacaoBancariaOriginal")
  public Long getIdOperacaoBancariaOriginal() {
    return idOperacaoBancariaOriginal;
  }
  public void setIdOperacaoBancariaOriginal(Long idOperacaoBancariaOriginal) {
    this.idOperacaoBancariaOriginal = idOperacaoBancariaOriginal;
  }

  
  /**
   * Observa\u00E7\u00E3o
   **/
  public OperacaoBancariaPersist observacao(String observacao) {
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
   * N\u00FAmero do bilhete \u00FAnico
   **/
  public OperacaoBancariaPersist numeroBilheteUnico(Long numeroBilheteUnico) {
    this.numeroBilheteUnico = numeroBilheteUnico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do bilhete \u00FAnico")
  @JsonProperty("numeroBilheteUnico")
  public Long getNumeroBilheteUnico() {
    return numeroBilheteUnico;
  }
  public void setNumeroBilheteUnico(Long numeroBilheteUnico) {
    this.numeroBilheteUnico = numeroBilheteUnico;
  }

  
  /**
   * Identificador do documento
   **/
  public OperacaoBancariaPersist idDocumento(Long idDocumento) {
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
   * Identificador do celular
   **/
  public OperacaoBancariaPersist idCelularRecarga(Long idCelularRecarga) {
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
   * Nome do benefici\u00E1rio envolvendo transfer\u00EAncias
   **/
  public OperacaoBancariaPersist nomeBeneficiario(String nomeBeneficiario) {
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
   * Origem do banco do benefici\u00E1rio envolvendo transfer\u00EAncias
   **/
  public OperacaoBancariaPersist bancoBeneficiario(String bancoBeneficiario) {
    this.bancoBeneficiario = bancoBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Origem do banco do benefici\u00E1rio envolvendo transfer\u00EAncias")
  @JsonProperty("bancoBeneficiario")
  public String getBancoBeneficiario() {
    return bancoBeneficiario;
  }
  public void setBancoBeneficiario(String bancoBeneficiario) {
    this.bancoBeneficiario = bancoBeneficiario;
  }

  
  /**
   * Origem da ag\u00EAncia do benefici\u00E1rio envolvendo transfer\u00EAncias
   **/
  public OperacaoBancariaPersist agenciaBeneficiario(String agenciaBeneficiario) {
    this.agenciaBeneficiario = agenciaBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Origem da ag\u00EAncia do benefici\u00E1rio envolvendo transfer\u00EAncias")
  @JsonProperty("agenciaBeneficiario")
  public String getAgenciaBeneficiario() {
    return agenciaBeneficiario;
  }
  public void setAgenciaBeneficiario(String agenciaBeneficiario) {
    this.agenciaBeneficiario = agenciaBeneficiario;
  }

  
  /**
   * Conta origem do benefici\u00E1rio envolvendo transfer\u00EAncias
   **/
  public OperacaoBancariaPersist contaBeneficiario(String contaBeneficiario) {
    this.contaBeneficiario = contaBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conta origem do benefici\u00E1rio envolvendo transfer\u00EAncias")
  @JsonProperty("contaBeneficiario")
  public String getContaBeneficiario() {
    return contaBeneficiario;
  }
  public void setContaBeneficiario(String contaBeneficiario) {
    this.contaBeneficiario = contaBeneficiario;
  }

  
  /**
   * D\u00EDgito da conta do benefici\u00E1rio origem envolvendo transfer\u00EAncias
   **/
  public OperacaoBancariaPersist dvContaBeneficiario(String dvContaBeneficiario) {
    this.dvContaBeneficiario = dvContaBeneficiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "D\u00EDgito da conta do benefici\u00E1rio origem envolvendo transfer\u00EAncias")
  @JsonProperty("dvContaBeneficiario")
  public String getDvContaBeneficiario() {
    return dvContaBeneficiario;
  }
  public void setDvContaBeneficiario(String dvContaBeneficiario) {
    this.dvContaBeneficiario = dvContaBeneficiario;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperacaoBancariaPersist operacaoBancariaPersist = (OperacaoBancariaPersist) o;
    return Objects.equals(this.idTipoOperacaoBancaria, operacaoBancariaPersist.idTipoOperacaoBancaria) &&
        Objects.equals(this.idContaDestino, operacaoBancariaPersist.idContaDestino) &&
        Objects.equals(this.idCartaoOrigem, operacaoBancariaPersist.idCartaoOrigem) &&
        Objects.equals(this.idCartaoDestino, operacaoBancariaPersist.idCartaoDestino) &&
        Objects.equals(this.bancoPagador, operacaoBancariaPersist.bancoPagador) &&
        Objects.equals(this.agenciaPagadora, operacaoBancariaPersist.agenciaPagadora) &&
        Objects.equals(this.contaPagadora, operacaoBancariaPersist.contaPagadora) &&
        Objects.equals(this.dvContaPagadora, operacaoBancariaPersist.dvContaPagadora) &&
        Objects.equals(this.nomePagador, operacaoBancariaPersist.nomePagador) &&
        Objects.equals(this.cpfCnpjBeneficiario, operacaoBancariaPersist.cpfCnpjBeneficiario) &&
        Objects.equals(this.idEventoAjusteOrigem, operacaoBancariaPersist.idEventoAjusteOrigem) &&
        Objects.equals(this.idEventoAjusteDestino, operacaoBancariaPersist.idEventoAjusteDestino) &&
        Objects.equals(this.idExterno, operacaoBancariaPersist.idExterno) &&
        Objects.equals(this.codigoIspb, operacaoBancariaPersist.codigoIspb) &&
        Objects.equals(this.valorOperacao, operacaoBancariaPersist.valorOperacao) &&
        Objects.equals(this.valorTarifa, operacaoBancariaPersist.valorTarifa) &&
        Objects.equals(this.dataHoraOperacao, operacaoBancariaPersist.dataHoraOperacao) &&
        Objects.equals(this.dataAgendamento, operacaoBancariaPersist.dataAgendamento) &&
        Objects.equals(this.dataRealizacao, operacaoBancariaPersist.dataRealizacao) &&
        Objects.equals(this.status, operacaoBancariaPersist.status) &&
        Objects.equals(this.idDadosBancariosConta, operacaoBancariaPersist.idDadosBancariosConta) &&
        Objects.equals(this.idOperacaoBancariaOriginal, operacaoBancariaPersist.idOperacaoBancariaOriginal) &&
        Objects.equals(this.observacao, operacaoBancariaPersist.observacao) &&
        Objects.equals(this.numeroBilheteUnico, operacaoBancariaPersist.numeroBilheteUnico) &&
        Objects.equals(this.idDocumento, operacaoBancariaPersist.idDocumento) &&
        Objects.equals(this.idCelularRecarga, operacaoBancariaPersist.idCelularRecarga) &&
        Objects.equals(this.nomeBeneficiario, operacaoBancariaPersist.nomeBeneficiario) &&
        Objects.equals(this.bancoBeneficiario, operacaoBancariaPersist.bancoBeneficiario) &&
        Objects.equals(this.agenciaBeneficiario, operacaoBancariaPersist.agenciaBeneficiario) &&
        Objects.equals(this.contaBeneficiario, operacaoBancariaPersist.contaBeneficiario) &&
        Objects.equals(this.dvContaBeneficiario, operacaoBancariaPersist.dvContaBeneficiario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoOperacaoBancaria, idContaDestino, idCartaoOrigem, idCartaoDestino, bancoPagador, agenciaPagadora, contaPagadora, dvContaPagadora, nomePagador, cpfCnpjBeneficiario, idEventoAjusteOrigem, idEventoAjusteDestino, idExterno, codigoIspb, valorOperacao, valorTarifa, dataHoraOperacao, dataAgendamento, dataRealizacao, status, idDadosBancariosConta, idOperacaoBancariaOriginal, observacao, numeroBilheteUnico, idDocumento, idCelularRecarga, nomeBeneficiario, bancoBeneficiario, agenciaBeneficiario, contaBeneficiario, dvContaBeneficiario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoBancariaPersist {\n");
    
    sb.append("    idTipoOperacaoBancaria: ").append(toIndentedString(idTipoOperacaoBancaria)).append("\n");
    sb.append("    idContaDestino: ").append(toIndentedString(idContaDestino)).append("\n");
    sb.append("    idCartaoOrigem: ").append(toIndentedString(idCartaoOrigem)).append("\n");
    sb.append("    idCartaoDestino: ").append(toIndentedString(idCartaoDestino)).append("\n");
    sb.append("    bancoPagador: ").append(toIndentedString(bancoPagador)).append("\n");
    sb.append("    agenciaPagadora: ").append(toIndentedString(agenciaPagadora)).append("\n");
    sb.append("    contaPagadora: ").append(toIndentedString(contaPagadora)).append("\n");
    sb.append("    dvContaPagadora: ").append(toIndentedString(dvContaPagadora)).append("\n");
    sb.append("    nomePagador: ").append(toIndentedString(nomePagador)).append("\n");
    sb.append("    cpfCnpjBeneficiario: ").append(toIndentedString(cpfCnpjBeneficiario)).append("\n");
    sb.append("    idEventoAjusteOrigem: ").append(toIndentedString(idEventoAjusteOrigem)).append("\n");
    sb.append("    idEventoAjusteDestino: ").append(toIndentedString(idEventoAjusteDestino)).append("\n");
    sb.append("    idExterno: ").append(toIndentedString(idExterno)).append("\n");
    sb.append("    codigoIspb: ").append(toIndentedString(codigoIspb)).append("\n");
    sb.append("    valorOperacao: ").append(toIndentedString(valorOperacao)).append("\n");
    sb.append("    valorTarifa: ").append(toIndentedString(valorTarifa)).append("\n");
    sb.append("    dataHoraOperacao: ").append(toIndentedString(dataHoraOperacao)).append("\n");
    sb.append("    dataAgendamento: ").append(toIndentedString(dataAgendamento)).append("\n");
    sb.append("    dataRealizacao: ").append(toIndentedString(dataRealizacao)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    idDadosBancariosConta: ").append(toIndentedString(idDadosBancariosConta)).append("\n");
    sb.append("    idOperacaoBancariaOriginal: ").append(toIndentedString(idOperacaoBancariaOriginal)).append("\n");
    sb.append("    observacao: ").append(toIndentedString(observacao)).append("\n");
    sb.append("    numeroBilheteUnico: ").append(toIndentedString(numeroBilheteUnico)).append("\n");
    sb.append("    idDocumento: ").append(toIndentedString(idDocumento)).append("\n");
    sb.append("    idCelularRecarga: ").append(toIndentedString(idCelularRecarga)).append("\n");
    sb.append("    nomeBeneficiario: ").append(toIndentedString(nomeBeneficiario)).append("\n");
    sb.append("    bancoBeneficiario: ").append(toIndentedString(bancoBeneficiario)).append("\n");
    sb.append("    agenciaBeneficiario: ").append(toIndentedString(agenciaBeneficiario)).append("\n");
    sb.append("    contaBeneficiario: ").append(toIndentedString(contaBeneficiario)).append("\n");
    sb.append("    dvContaBeneficiario: ").append(toIndentedString(dvContaBeneficiario)).append("\n");
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

