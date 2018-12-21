package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representation of the transaction resource
 **/

@ApiModel(description = "Representation of the transaction resource")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransacaoCorrenteResponse   {
  
  private Integer ultimaParcelaLancada = null;
  private Long idConta = null;
  private Long idTipoRegistro = null;
  private Integer ordem = null;
  private Long idTransacao = null;
  private String descricao = null;
  private Integer status = null;
  private String descricaoStatus = null;
  private BigDecimal valor = null;
  private BigDecimal valorDolar = null;
  private Integer quantidadeParcelas = null;
  private BigDecimal valorParcela = null;
  private String dataEvento = null;
  private String estabelecimento = null;
  private Integer flagCredito = null;
  private String tipoEstabelecimento = null;
  private Integer idGrupoMCC = null;
  private Integer flagSolicitouContestacao = null;
  private Integer tipoTransacao = null;

  
  /**
   **/
  public TransacaoCorrenteResponse ultimaParcelaLancada(Integer ultimaParcelaLancada) {
    this.ultimaParcelaLancada = ultimaParcelaLancada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ultimaParcelaLancada")
  public Integer getUltimaParcelaLancada() {
    return ultimaParcelaLancada;
  }
  public void setUltimaParcelaLancada(Integer ultimaParcelaLancada) {
    this.ultimaParcelaLancada = ultimaParcelaLancada;
  }

  
  /**
   * Identification Code of the Account (id)
   **/
  public TransacaoCorrenteResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Account (id)")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification code of the transaction type (id)
   **/
  public TransacaoCorrenteResponse idTipoRegistro(Long idTipoRegistro) {
    this.idTipoRegistro = idTipoRegistro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification code of the transaction type (id)")
  @JsonProperty("idTipoRegistro")
  public Long getIdTipoRegistro() {
    return idTipoRegistro;
  }
  public void setIdTipoRegistro(Long idTipoRegistro) {
    this.idTipoRegistro = idTipoRegistro;
  }

  
  /**
   * Representation of the transaction order (id)
   **/
  public TransacaoCorrenteResponse ordem(Integer ordem) {
    this.ordem = ordem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Representation of the transaction order (id)")
  @JsonProperty("ordem")
  public Integer getOrdem() {
    return ordem;
  }
  public void setOrdem(Integer ordem) {
    this.ordem = ordem;
  }

  
  /**
   * Identification Code of the transaction (id)
   **/
  public TransacaoCorrenteResponse idTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the transaction (id)")
  @JsonProperty("idTransacao")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * Attribute that represents the description of the transaction
   **/
  public TransacaoCorrenteResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that represents the description of the transaction")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Attribute that represents the identifier code of the transaction status
   **/
  public TransacaoCorrenteResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that represents the identifier code of the transaction status")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Attribute that represent the description of the transaction status
   **/
  public TransacaoCorrenteResponse descricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that represent the description of the transaction status")
  @JsonProperty("descricaoStatus")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   * Attribute that represents the value of the transaction
   **/
  public TransacaoCorrenteResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that represents the value of the transaction")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Attribute that represents the value in dollar of the transaction
   **/
  public TransacaoCorrenteResponse valorDolar(BigDecimal valorDolar) {
    this.valorDolar = valorDolar;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that represents the value in dollar of the transaction")
  @JsonProperty("valorDolar")
  public BigDecimal getValorDolar() {
    return valorDolar;
  }
  public void setValorDolar(BigDecimal valorDolar) {
    this.valorDolar = valorDolar;
  }

  
  /**
   * Attribute that represents the quantity of parcels of the transaction
   **/
  public TransacaoCorrenteResponse quantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that represents the quantity of parcels of the transaction")
  @JsonProperty("quantidadeParcelas")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Attribute that represents the parcel value of the transaction
   **/
  public TransacaoCorrenteResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that represents the parcel value of the transaction")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Attribute that represents the sending date of the transaction
   **/
  public TransacaoCorrenteResponse dataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that represents the sending date of the transaction")
  @JsonProperty("dataEvento")
  public String getDataEvento() {
    return dataEvento;
  }
  public void setDataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
  }

  
  /**
   * Attribute that represents the merchant of the transaction
   **/
  public TransacaoCorrenteResponse estabelecimento(String estabelecimento) {
    this.estabelecimento = estabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that represents the merchant of the transaction")
  @JsonProperty("estabelecimento")
  public String getEstabelecimento() {
    return estabelecimento;
  }
  public void setEstabelecimento(String estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  
  /**
   * Attribute that identifies if the transaction is a credit one or debit one
   **/
  public TransacaoCorrenteResponse flagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that identifies if the transaction is a credit one or debit one")
  @JsonProperty("flagCredito")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * Attribute that represents the type merchant of the transaction
   **/
  public TransacaoCorrenteResponse tipoEstabelecimento(String tipoEstabelecimento) {
    this.tipoEstabelecimento = tipoEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that represents the type merchant of the transaction")
  @JsonProperty("tipoEstabelecimento")
  public String getTipoEstabelecimento() {
    return tipoEstabelecimento;
  }
  public void setTipoEstabelecimento(String tipoEstabelecimento) {
    this.tipoEstabelecimento = tipoEstabelecimento;
  }

  
  /**
   * Attribute that represents the MCC group of the transaction
   **/
  public TransacaoCorrenteResponse idGrupoMCC(Integer idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that represents the MCC group of the transaction")
  @JsonProperty("idGrupoMCC")
  public Integer getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Integer idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Attribute that identifier if the cardholder requested the contesting of the transaction
   **/
  public TransacaoCorrenteResponse flagSolicitouContestacao(Integer flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that identifier if the cardholder requested the contesting of the transaction")
  @JsonProperty("flagSolicitouContestacao")
  public Integer getFlagSolicitouContestacao() {
    return flagSolicitouContestacao;
  }
  public void setFlagSolicitouContestacao(Integer flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
  }

  
  /**
   * Attribute that identifies if the transaction is a credit one or debit one
   **/
  public TransacaoCorrenteResponse tipoTransacao(Integer tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attribute that identifies if the transaction is a credit one or debit one")
  @JsonProperty("tipoTransacao")
  public Integer getTipoTransacao() {
    return tipoTransacao;
  }
  public void setTipoTransacao(Integer tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransacaoCorrenteResponse transacaoCorrenteResponse = (TransacaoCorrenteResponse) o;
    return Objects.equals(this.ultimaParcelaLancada, transacaoCorrenteResponse.ultimaParcelaLancada) &&
        Objects.equals(this.idConta, transacaoCorrenteResponse.idConta) &&
        Objects.equals(this.idTipoRegistro, transacaoCorrenteResponse.idTipoRegistro) &&
        Objects.equals(this.ordem, transacaoCorrenteResponse.ordem) &&
        Objects.equals(this.idTransacao, transacaoCorrenteResponse.idTransacao) &&
        Objects.equals(this.descricao, transacaoCorrenteResponse.descricao) &&
        Objects.equals(this.status, transacaoCorrenteResponse.status) &&
        Objects.equals(this.descricaoStatus, transacaoCorrenteResponse.descricaoStatus) &&
        Objects.equals(this.valor, transacaoCorrenteResponse.valor) &&
        Objects.equals(this.valorDolar, transacaoCorrenteResponse.valorDolar) &&
        Objects.equals(this.quantidadeParcelas, transacaoCorrenteResponse.quantidadeParcelas) &&
        Objects.equals(this.valorParcela, transacaoCorrenteResponse.valorParcela) &&
        Objects.equals(this.dataEvento, transacaoCorrenteResponse.dataEvento) &&
        Objects.equals(this.estabelecimento, transacaoCorrenteResponse.estabelecimento) &&
        Objects.equals(this.flagCredito, transacaoCorrenteResponse.flagCredito) &&
        Objects.equals(this.tipoEstabelecimento, transacaoCorrenteResponse.tipoEstabelecimento) &&
        Objects.equals(this.idGrupoMCC, transacaoCorrenteResponse.idGrupoMCC) &&
        Objects.equals(this.flagSolicitouContestacao, transacaoCorrenteResponse.flagSolicitouContestacao) &&
        Objects.equals(this.tipoTransacao, transacaoCorrenteResponse.tipoTransacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ultimaParcelaLancada, idConta, idTipoRegistro, ordem, idTransacao, descricao, status, descricaoStatus, valor, valorDolar, quantidadeParcelas, valorParcela, dataEvento, estabelecimento, flagCredito, tipoEstabelecimento, idGrupoMCC, flagSolicitouContestacao, tipoTransacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoCorrenteResponse {\n");
    
    sb.append("    ultimaParcelaLancada: ").append(toIndentedString(ultimaParcelaLancada)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idTipoRegistro: ").append(toIndentedString(idTipoRegistro)).append("\n");
    sb.append("    ordem: ").append(toIndentedString(ordem)).append("\n");
    sb.append("    idTransacao: ").append(toIndentedString(idTransacao)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    descricaoStatus: ").append(toIndentedString(descricaoStatus)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    valorDolar: ").append(toIndentedString(valorDolar)).append("\n");
    sb.append("    quantidadeParcelas: ").append(toIndentedString(quantidadeParcelas)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    dataEvento: ").append(toIndentedString(dataEvento)).append("\n");
    sb.append("    estabelecimento: ").append(toIndentedString(estabelecimento)).append("\n");
    sb.append("    flagCredito: ").append(toIndentedString(flagCredito)).append("\n");
    sb.append("    tipoEstabelecimento: ").append(toIndentedString(tipoEstabelecimento)).append("\n");
    sb.append("    idGrupoMCC: ").append(toIndentedString(idGrupoMCC)).append("\n");
    sb.append("    flagSolicitouContestacao: ").append(toIndentedString(flagSolicitouContestacao)).append("\n");
    sb.append("    tipoTransacao: ").append(toIndentedString(tipoTransacao)).append("\n");
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

