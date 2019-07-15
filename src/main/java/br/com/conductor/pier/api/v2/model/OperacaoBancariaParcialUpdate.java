package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto para atualiza\u00E7\u00E3o parcial
 **/

@ApiModel(description = "Objeto para atualiza\u00E7\u00E3o parcial")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OperacaoBancariaParcialUpdate   {
  
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
  private String operadora = null;
  private String celular = null;
  private String ddd = null;
  private String dataRealizacao = null;
  private String dataAgendamento = null;
  private BigDecimal valorOperacao = null;

  
  /**
   * C\u00F3digo identificador da conta de destino
   **/
  public OperacaoBancariaParcialUpdate idContaDestino(Long idContaDestino) {
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
  public OperacaoBancariaParcialUpdate idCartaoOrigem(Long idCartaoOrigem) {
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
  public OperacaoBancariaParcialUpdate idCartaoDestino(Long idCartaoDestino) {
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
  public OperacaoBancariaParcialUpdate bancoPagador(String bancoPagador) {
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
  public OperacaoBancariaParcialUpdate agenciaPagadora(String agenciaPagadora) {
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
  public OperacaoBancariaParcialUpdate contaPagadora(String contaPagadora) {
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
  public OperacaoBancariaParcialUpdate dvContaPagadora(String dvContaPagadora) {
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
   * Nome do pagador envolvendo transfer\u00EAncias
   **/
  public OperacaoBancariaParcialUpdate nomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do pagador envolvendo transfer\u00EAncias")
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
  public OperacaoBancariaParcialUpdate cpfCnpjBeneficiario(String cpfCnpjBeneficiario) {
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
  public OperacaoBancariaParcialUpdate idEventoAjusteOrigem(Long idEventoAjusteOrigem) {
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
  public OperacaoBancariaParcialUpdate idEventoAjusteDestino(Long idEventoAjusteDestino) {
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
  public OperacaoBancariaParcialUpdate idExterno(String idExterno) {
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
  public OperacaoBancariaParcialUpdate codigoIspb(String codigoIspb) {
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
   * Status da opera\u00E7\u00E3o
   **/
  public OperacaoBancariaParcialUpdate status(StatusEnum status) {
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
   * Identificador da opera\u00E7\u00E3o banc\u00E1ria original
   **/
  public OperacaoBancariaParcialUpdate idOperacaoBancariaOriginal(Long idOperacaoBancariaOriginal) {
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
  public OperacaoBancariaParcialUpdate observacao(String observacao) {
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
  public OperacaoBancariaParcialUpdate numeroBilheteUnico(Long numeroBilheteUnico) {
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
   * Identificador do comprovante
   **/
  public OperacaoBancariaParcialUpdate idDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do comprovante")
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
  public OperacaoBancariaParcialUpdate idCelularRecarga(Long idCelularRecarga) {
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
  public OperacaoBancariaParcialUpdate nomeBeneficiario(String nomeBeneficiario) {
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
  public OperacaoBancariaParcialUpdate bancoBeneficiario(String bancoBeneficiario) {
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
  public OperacaoBancariaParcialUpdate agenciaBeneficiario(String agenciaBeneficiario) {
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
  public OperacaoBancariaParcialUpdate contaBeneficiario(String contaBeneficiario) {
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
  public OperacaoBancariaParcialUpdate dvContaBeneficiario(String dvContaBeneficiario) {
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

  
  /**
   * Descri\u00E7\u00E3o da operadora do celular
   **/
  public OperacaoBancariaParcialUpdate operadora(String operadora) {
    this.operadora = operadora;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o da operadora do celular")
  @JsonProperty("operadora")
  public String getOperadora() {
    return operadora;
  }
  public void setOperadora(String operadora) {
    this.operadora = operadora;
  }

  
  /**
   * N\u00FAmero da operadora
   **/
  public OperacaoBancariaParcialUpdate celular(String celular) {
    this.celular = celular;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero da operadora")
  @JsonProperty("celular")
  public String getCelular() {
    return celular;
  }
  public void setCelular(String celular) {
    this.celular = celular;
  }

  
  /**
   * DDD do celular
   **/
  public OperacaoBancariaParcialUpdate ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "DDD do celular")
  @JsonProperty("ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * Data e hora referente a realiza\u00E7\u00E3o da opera\u00E7\u00E3o
   **/
  public OperacaoBancariaParcialUpdate dataRealizacao(String dataRealizacao) {
    this.dataRealizacao = dataRealizacao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data e hora referente a realiza\u00E7\u00E3o da opera\u00E7\u00E3o")
  @JsonProperty("dataRealizacao")
  public String getDataRealizacao() {
    return dataRealizacao;
  }
  public void setDataRealizacao(String dataRealizacao) {
    this.dataRealizacao = dataRealizacao;
  }

  
  /**
   * Data e hora referente ao agendamento da opera\u00E7\u00E3o
   **/
  public OperacaoBancariaParcialUpdate dataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data e hora referente ao agendamento da opera\u00E7\u00E3o")
  @JsonProperty("dataAgendamento")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * Valor movimentado na opera\u00E7\u00E3o banc\u00E1ria
   **/
  public OperacaoBancariaParcialUpdate valorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "15.65", value = "Valor movimentado na opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("valorOperacao")
  public BigDecimal getValorOperacao() {
    return valorOperacao;
  }
  public void setValorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperacaoBancariaParcialUpdate operacaoBancariaParcialUpdate = (OperacaoBancariaParcialUpdate) o;
    return Objects.equals(this.idContaDestino, operacaoBancariaParcialUpdate.idContaDestino) &&
        Objects.equals(this.idCartaoOrigem, operacaoBancariaParcialUpdate.idCartaoOrigem) &&
        Objects.equals(this.idCartaoDestino, operacaoBancariaParcialUpdate.idCartaoDestino) &&
        Objects.equals(this.bancoPagador, operacaoBancariaParcialUpdate.bancoPagador) &&
        Objects.equals(this.agenciaPagadora, operacaoBancariaParcialUpdate.agenciaPagadora) &&
        Objects.equals(this.contaPagadora, operacaoBancariaParcialUpdate.contaPagadora) &&
        Objects.equals(this.dvContaPagadora, operacaoBancariaParcialUpdate.dvContaPagadora) &&
        Objects.equals(this.nomePagador, operacaoBancariaParcialUpdate.nomePagador) &&
        Objects.equals(this.cpfCnpjBeneficiario, operacaoBancariaParcialUpdate.cpfCnpjBeneficiario) &&
        Objects.equals(this.idEventoAjusteOrigem, operacaoBancariaParcialUpdate.idEventoAjusteOrigem) &&
        Objects.equals(this.idEventoAjusteDestino, operacaoBancariaParcialUpdate.idEventoAjusteDestino) &&
        Objects.equals(this.idExterno, operacaoBancariaParcialUpdate.idExterno) &&
        Objects.equals(this.codigoIspb, operacaoBancariaParcialUpdate.codigoIspb) &&
        Objects.equals(this.status, operacaoBancariaParcialUpdate.status) &&
        Objects.equals(this.idOperacaoBancariaOriginal, operacaoBancariaParcialUpdate.idOperacaoBancariaOriginal) &&
        Objects.equals(this.observacao, operacaoBancariaParcialUpdate.observacao) &&
        Objects.equals(this.numeroBilheteUnico, operacaoBancariaParcialUpdate.numeroBilheteUnico) &&
        Objects.equals(this.idDocumento, operacaoBancariaParcialUpdate.idDocumento) &&
        Objects.equals(this.idCelularRecarga, operacaoBancariaParcialUpdate.idCelularRecarga) &&
        Objects.equals(this.nomeBeneficiario, operacaoBancariaParcialUpdate.nomeBeneficiario) &&
        Objects.equals(this.bancoBeneficiario, operacaoBancariaParcialUpdate.bancoBeneficiario) &&
        Objects.equals(this.agenciaBeneficiario, operacaoBancariaParcialUpdate.agenciaBeneficiario) &&
        Objects.equals(this.contaBeneficiario, operacaoBancariaParcialUpdate.contaBeneficiario) &&
        Objects.equals(this.dvContaBeneficiario, operacaoBancariaParcialUpdate.dvContaBeneficiario) &&
        Objects.equals(this.operadora, operacaoBancariaParcialUpdate.operadora) &&
        Objects.equals(this.celular, operacaoBancariaParcialUpdate.celular) &&
        Objects.equals(this.ddd, operacaoBancariaParcialUpdate.ddd) &&
        Objects.equals(this.dataRealizacao, operacaoBancariaParcialUpdate.dataRealizacao) &&
        Objects.equals(this.dataAgendamento, operacaoBancariaParcialUpdate.dataAgendamento) &&
        Objects.equals(this.valorOperacao, operacaoBancariaParcialUpdate.valorOperacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idContaDestino, idCartaoOrigem, idCartaoDestino, bancoPagador, agenciaPagadora, contaPagadora, dvContaPagadora, nomePagador, cpfCnpjBeneficiario, idEventoAjusteOrigem, idEventoAjusteDestino, idExterno, codigoIspb, status, idOperacaoBancariaOriginal, observacao, numeroBilheteUnico, idDocumento, idCelularRecarga, nomeBeneficiario, bancoBeneficiario, agenciaBeneficiario, contaBeneficiario, dvContaBeneficiario, operadora, celular, ddd, dataRealizacao, dataAgendamento, valorOperacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoBancariaParcialUpdate {\n");
    
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
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    sb.append("    operadora: ").append(toIndentedString(operadora)).append("\n");
    sb.append("    celular: ").append(toIndentedString(celular)).append("\n");
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
    sb.append("    dataRealizacao: ").append(toIndentedString(dataRealizacao)).append("\n");
    sb.append("    dataAgendamento: ").append(toIndentedString(dataAgendamento)).append("\n");
    sb.append("    valorOperacao: ").append(toIndentedString(valorOperacao)).append("\n");
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

