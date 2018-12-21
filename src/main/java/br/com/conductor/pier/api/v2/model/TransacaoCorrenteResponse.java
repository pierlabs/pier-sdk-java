package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * {{{transacao_corrente_response_description}}}
 **/

@ApiModel(description = "{{{transacao_corrente_response_description}}}")
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
   * {{{transacao_corrente_response_id_conta_value}}}
   **/
  public TransacaoCorrenteResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{transacao_corrente_response_id_tipo_registro_value}}}
   **/
  public TransacaoCorrenteResponse idTipoRegistro(Long idTipoRegistro) {
    this.idTipoRegistro = idTipoRegistro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_id_tipo_registro_value}}}")
  @JsonProperty("idTipoRegistro")
  public Long getIdTipoRegistro() {
    return idTipoRegistro;
  }
  public void setIdTipoRegistro(Long idTipoRegistro) {
    this.idTipoRegistro = idTipoRegistro;
  }

  
  /**
   * {{{transacao_corrente_response_ordem_value}}}
   **/
  public TransacaoCorrenteResponse ordem(Integer ordem) {
    this.ordem = ordem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_ordem_value}}}")
  @JsonProperty("ordem")
  public Integer getOrdem() {
    return ordem;
  }
  public void setOrdem(Integer ordem) {
    this.ordem = ordem;
  }

  
  /**
   * {{{transacao_corrente_response_id_transacao_value}}}
   **/
  public TransacaoCorrenteResponse idTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_id_transacao_value}}}")
  @JsonProperty("idTransacao")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * {{{transacao_corrente_response_descricao_value}}}
   **/
  public TransacaoCorrenteResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_descricao_value}}}")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{transacao_corrente_response_status_value}}}
   **/
  public TransacaoCorrenteResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_status_value}}}")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {{{transacao_corrente_response_descricao_status_value}}}
   **/
  public TransacaoCorrenteResponse descricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_descricao_status_value}}}")
  @JsonProperty("descricaoStatus")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   * {{{transacao_corrente_response_valor_value}}}
   **/
  public TransacaoCorrenteResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_valor_value}}}")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{transacao_corrente_response_valor_dolar_value}}}
   **/
  public TransacaoCorrenteResponse valorDolar(BigDecimal valorDolar) {
    this.valorDolar = valorDolar;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_valor_dolar_value}}}")
  @JsonProperty("valorDolar")
  public BigDecimal getValorDolar() {
    return valorDolar;
  }
  public void setValorDolar(BigDecimal valorDolar) {
    this.valorDolar = valorDolar;
  }

  
  /**
   * {{{transacao_corrente_response_quantidade_parcelas_value}}}
   **/
  public TransacaoCorrenteResponse quantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_quantidade_parcelas_value}}}")
  @JsonProperty("quantidadeParcelas")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * {{{transacao_corrente_response_valor_parcela_value}}}
   **/
  public TransacaoCorrenteResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_valor_parcela_value}}}")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * {{{transacao_corrente_response_data_evento_value}}}
   **/
  public TransacaoCorrenteResponse dataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_data_evento_value}}}")
  @JsonProperty("dataEvento")
  public String getDataEvento() {
    return dataEvento;
  }
  public void setDataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
  }

  
  /**
   * {{{transacao_corrente_response_estabelecimento_value}}}
   **/
  public TransacaoCorrenteResponse estabelecimento(String estabelecimento) {
    this.estabelecimento = estabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_estabelecimento_value}}}")
  @JsonProperty("estabelecimento")
  public String getEstabelecimento() {
    return estabelecimento;
  }
  public void setEstabelecimento(String estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  
  /**
   * {{{transacao_corrente_response_flag_credito_value}}}
   **/
  public TransacaoCorrenteResponse flagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_flag_credito_value}}}")
  @JsonProperty("flagCredito")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * {{{transacao_corrente_response_tipo_estabelecimento_value}}}
   **/
  public TransacaoCorrenteResponse tipoEstabelecimento(String tipoEstabelecimento) {
    this.tipoEstabelecimento = tipoEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_tipo_estabelecimento_value}}}")
  @JsonProperty("tipoEstabelecimento")
  public String getTipoEstabelecimento() {
    return tipoEstabelecimento;
  }
  public void setTipoEstabelecimento(String tipoEstabelecimento) {
    this.tipoEstabelecimento = tipoEstabelecimento;
  }

  
  /**
   * {{{transacao_corrente_response_id_grupo_m_c_c_value}}}
   **/
  public TransacaoCorrenteResponse idGrupoMCC(Integer idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_id_grupo_m_c_c_value}}}")
  @JsonProperty("idGrupoMCC")
  public Integer getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Integer idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * {{{transacao_corrente_response_flag_solicitou_contestacao_value}}}
   **/
  public TransacaoCorrenteResponse flagSolicitouContestacao(Integer flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_flag_solicitou_contestacao_value}}}")
  @JsonProperty("flagSolicitouContestacao")
  public Integer getFlagSolicitouContestacao() {
    return flagSolicitouContestacao;
  }
  public void setFlagSolicitouContestacao(Integer flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
  }

  
  /**
   * {{{transacao_corrente_response_tipo_transacao_value}}}
   **/
  public TransacaoCorrenteResponse tipoTransacao(Integer tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{transacao_corrente_response_tipo_transacao_value}}}")
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

