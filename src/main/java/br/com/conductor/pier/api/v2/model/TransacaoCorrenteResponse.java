package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa\u00E7\u00E3o do recurso transacao
 **/

@ApiModel(description = "Representa\u00E7\u00E3o do recurso transacao")
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
   * C\u00F3digo de identifica\u00E7\u00E3o da conta (id).
   **/
  public TransacaoCorrenteResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da conta (id).")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de transacao (id).
   **/
  public TransacaoCorrenteResponse idTipoRegistro(Long idTipoRegistro) {
    this.idTipoRegistro = idTipoRegistro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de transacao (id).")
  @JsonProperty("idTipoRegistro")
  public Long getIdTipoRegistro() {
    return idTipoRegistro;
  }
  public void setIdTipoRegistro(Long idTipoRegistro) {
    this.idTipoRegistro = idTipoRegistro;
  }

  
  /**
   * Representa\u00E7\u00E3o da ordena\u00E7\u00E3o da transacao (id).
   **/
  public TransacaoCorrenteResponse ordem(Integer ordem) {
    this.ordem = ordem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Representa\u00E7\u00E3o da ordena\u00E7\u00E3o da transacao (id).")
  @JsonProperty("ordem")
  public Integer getOrdem() {
    return ordem;
  }
  public void setOrdem(Integer ordem) {
    this.ordem = ordem;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da transacao (id).
   **/
  public TransacaoCorrenteResponse idTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da transacao (id).")
  @JsonProperty("idTransacao")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * Atributo que representa a descri\u00E7\u00E3o da transa\u00E7\u00E3o.
   **/
  public TransacaoCorrenteResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Atributo que representa a descri\u00E7\u00E3o da transa\u00E7\u00E3o.")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Atributo que representa o c\u00F3digo identificador do status da transa\u00E7\u00E3o.
   **/
  public TransacaoCorrenteResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Atributo que representa o c\u00F3digo identificador do status da transa\u00E7\u00E3o.")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Atributo que representa a descri\u00E7\u00E3o do status da transa\u00E7\u00E3o.
   **/
  public TransacaoCorrenteResponse descricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Atributo que representa a descri\u00E7\u00E3o do status da transa\u00E7\u00E3o.")
  @JsonProperty("descricaoStatus")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   * Atributo que representa o valor da transa\u00E7\u00E3o.
   **/
  public TransacaoCorrenteResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Atributo que representa o valor da transa\u00E7\u00E3o.")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Atributo que representa o valor em D\u00F3lar da transa\u00E7\u00E3o.
   **/
  public TransacaoCorrenteResponse valorDolar(BigDecimal valorDolar) {
    this.valorDolar = valorDolar;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Atributo que representa o valor em D\u00F3lar da transa\u00E7\u00E3o.")
  @JsonProperty("valorDolar")
  public BigDecimal getValorDolar() {
    return valorDolar;
  }
  public void setValorDolar(BigDecimal valorDolar) {
    this.valorDolar = valorDolar;
  }

  
  /**
   * Atributo que representa a quantidade de parcelas da transa\u00E7\u00E3o.
   **/
  public TransacaoCorrenteResponse quantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Atributo que representa a quantidade de parcelas da transa\u00E7\u00E3o.")
  @JsonProperty("quantidadeParcelas")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Atributo que representa o valor da parcela da transa\u00E7\u00E3o.
   **/
  public TransacaoCorrenteResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Atributo que representa o valor da parcela da transa\u00E7\u00E3o.")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Atributo que representa a data de envio da transa\u00E7\u00E3o.
   **/
  public TransacaoCorrenteResponse dataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Atributo que representa a data de envio da transa\u00E7\u00E3o.")
  @JsonProperty("dataEvento")
  public String getDataEvento() {
    return dataEvento;
  }
  public void setDataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
  }

  
  /**
   * Atributo que representa o estabelecimento da transa\u00E7\u00E3o.
   **/
  public TransacaoCorrenteResponse estabelecimento(String estabelecimento) {
    this.estabelecimento = estabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Atributo que representa o estabelecimento da transa\u00E7\u00E3o.")
  @JsonProperty("estabelecimento")
  public String getEstabelecimento() {
    return estabelecimento;
  }
  public void setEstabelecimento(String estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  
  /**
   * Atributo que identifica se a transa\u00E7\u00E3o \u00E9 um cr\u00E9dito ou d\u00E9bito.
   **/
  public TransacaoCorrenteResponse flagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Atributo que identifica se a transa\u00E7\u00E3o \u00E9 um cr\u00E9dito ou d\u00E9bito.")
  @JsonProperty("flagCredito")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * Atributo que representa o tipo de estabelecimento da transa\u00E7\u00E3o.
   **/
  public TransacaoCorrenteResponse tipoEstabelecimento(String tipoEstabelecimento) {
    this.tipoEstabelecimento = tipoEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Atributo que representa o tipo de estabelecimento da transa\u00E7\u00E3o.")
  @JsonProperty("tipoEstabelecimento")
  public String getTipoEstabelecimento() {
    return tipoEstabelecimento;
  }
  public void setTipoEstabelecimento(String tipoEstabelecimento) {
    this.tipoEstabelecimento = tipoEstabelecimento;
  }

  
  /**
   * Atributo que representa o grupo MCC da transa\u00E7\u00E3o.
   **/
  public TransacaoCorrenteResponse idGrupoMCC(Integer idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Atributo que representa o grupo MCC da transa\u00E7\u00E3o.")
  @JsonProperty("idGrupoMCC")
  public Integer getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Integer idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Atributo que identifica se o portador solicitou contesta\u00E7\u00E3o da transa\u00E7\u00E3o.
   **/
  public TransacaoCorrenteResponse flagSolicitouContestacao(Integer flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Atributo que identifica se o portador solicitou contesta\u00E7\u00E3o da transa\u00E7\u00E3o.")
  @JsonProperty("flagSolicitouContestacao")
  public Integer getFlagSolicitouContestacao() {
    return flagSolicitouContestacao;
  }
  public void setFlagSolicitouContestacao(Integer flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
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
        Objects.equals(this.flagSolicitouContestacao, transacaoCorrenteResponse.flagSolicitouContestacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ultimaParcelaLancada, idConta, idTipoRegistro, ordem, idTransacao, descricao, status, descricaoStatus, valor, valorDolar, quantidadeParcelas, valorParcela, dataEvento, estabelecimento, flagCredito, tipoEstabelecimento, idGrupoMCC, flagSolicitouContestacao);
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

