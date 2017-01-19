package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso transacao
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso transacao")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransacaoResponse   {
  
  private Integer ultimaParcelaLancada = null;
  private Long id = null;
  private Long idConta = null;
  private Long idTipoRegistro = null;
  private Long ordem = null;
  private Long idTransacao = null;
  private String descricao = null;
  private Long status = null;
  private String descricaoStatus = null;
  private BigDecimal valor = null;
  private BigDecimal valorDolar = null;
  private Integer quantidadeParcelas = null;
  private BigDecimal valorParcela = null;
  private Date dataEvento = null;
  private String estabelecimento = null;
  private Integer flagCredito = null;
  private String tipoEstabelecimento = null;
  private String latitude = null;
  private String longetude = null;
  private Integer idGrupoMCC = null;
  private Integer flagSolicitouContestacao = null;

  
  /**
   **/
  public TransacaoResponse ultimaParcelaLancada(Integer ultimaParcelaLancada) {
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
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transacao (id).
   **/
  public TransacaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transacao (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   **/
  public TransacaoResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de transacao (id).
   **/
  public TransacaoResponse idTipoRegistro(Long idTipoRegistro) {
    this.idTipoRegistro = idTipoRegistro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de transacao (id).")
  @JsonProperty("idTipoRegistro")
  public Long getIdTipoRegistro() {
    return idTipoRegistro;
  }
  public void setIdTipoRegistro(Long idTipoRegistro) {
    this.idTipoRegistro = idTipoRegistro;
  }

  
  /**
   * Representa\u00C3\u00A7\u00C3\u00A3o da ordena\u00C3\u00A7\u00C3\u00A3o da transacao (id).
   **/
  public TransacaoResponse ordem(Long ordem) {
    this.ordem = ordem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Representa\u00C3\u00A7\u00C3\u00A3o da ordena\u00C3\u00A7\u00C3\u00A3o da transacao (id).")
  @JsonProperty("ordem")
  public Long getOrdem() {
    return ordem;
  }
  public void setOrdem(Long ordem) {
    this.ordem = ordem;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transacao (id).
   **/
  public TransacaoResponse idTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transacao (id).")
  @JsonProperty("idTransacao")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   **/
  public TransacaoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   **/
  public TransacaoResponse status(Long status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  
  /**
   **/
  public TransacaoResponse descricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("descricaoStatus")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   **/
  public TransacaoResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   **/
  public TransacaoResponse valorDolar(BigDecimal valorDolar) {
    this.valorDolar = valorDolar;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorDolar")
  public BigDecimal getValorDolar() {
    return valorDolar;
  }
  public void setValorDolar(BigDecimal valorDolar) {
    this.valorDolar = valorDolar;
  }

  
  /**
   **/
  public TransacaoResponse quantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quantidadeParcelas")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   **/
  public TransacaoResponse valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   **/
  public TransacaoResponse dataEvento(Date dataEvento) {
    this.dataEvento = dataEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataEvento")
  public Date getDataEvento() {
    return dataEvento;
  }
  public void setDataEvento(Date dataEvento) {
    this.dataEvento = dataEvento;
  }

  
  /**
   **/
  public TransacaoResponse estabelecimento(String estabelecimento) {
    this.estabelecimento = estabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("estabelecimento")
  public String getEstabelecimento() {
    return estabelecimento;
  }
  public void setEstabelecimento(String estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  
  /**
   **/
  public TransacaoResponse flagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flagCredito")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   **/
  public TransacaoResponse tipoEstabelecimento(String tipoEstabelecimento) {
    this.tipoEstabelecimento = tipoEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tipoEstabelecimento")
  public String getTipoEstabelecimento() {
    return tipoEstabelecimento;
  }
  public void setTipoEstabelecimento(String tipoEstabelecimento) {
    this.tipoEstabelecimento = tipoEstabelecimento;
  }

  
  /**
   **/
  public TransacaoResponse latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   **/
  public TransacaoResponse longetude(String longetude) {
    this.longetude = longetude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("longetude")
  public String getLongetude() {
    return longetude;
  }
  public void setLongetude(String longetude) {
    this.longetude = longetude;
  }

  
  /**
   **/
  public TransacaoResponse idGrupoMCC(Integer idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idGrupoMCC")
  public Integer getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Integer idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   **/
  public TransacaoResponse flagSolicitouContestacao(Integer flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    TransacaoResponse transacaoResponse = (TransacaoResponse) o;
    return Objects.equals(this.ultimaParcelaLancada, transacaoResponse.ultimaParcelaLancada) &&
        Objects.equals(this.id, transacaoResponse.id) &&
        Objects.equals(this.idConta, transacaoResponse.idConta) &&
        Objects.equals(this.idTipoRegistro, transacaoResponse.idTipoRegistro) &&
        Objects.equals(this.ordem, transacaoResponse.ordem) &&
        Objects.equals(this.idTransacao, transacaoResponse.idTransacao) &&
        Objects.equals(this.descricao, transacaoResponse.descricao) &&
        Objects.equals(this.status, transacaoResponse.status) &&
        Objects.equals(this.descricaoStatus, transacaoResponse.descricaoStatus) &&
        Objects.equals(this.valor, transacaoResponse.valor) &&
        Objects.equals(this.valorDolar, transacaoResponse.valorDolar) &&
        Objects.equals(this.quantidadeParcelas, transacaoResponse.quantidadeParcelas) &&
        Objects.equals(this.valorParcela, transacaoResponse.valorParcela) &&
        Objects.equals(this.dataEvento, transacaoResponse.dataEvento) &&
        Objects.equals(this.estabelecimento, transacaoResponse.estabelecimento) &&
        Objects.equals(this.flagCredito, transacaoResponse.flagCredito) &&
        Objects.equals(this.tipoEstabelecimento, transacaoResponse.tipoEstabelecimento) &&
        Objects.equals(this.latitude, transacaoResponse.latitude) &&
        Objects.equals(this.longetude, transacaoResponse.longetude) &&
        Objects.equals(this.idGrupoMCC, transacaoResponse.idGrupoMCC) &&
        Objects.equals(this.flagSolicitouContestacao, transacaoResponse.flagSolicitouContestacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ultimaParcelaLancada, id, idConta, idTipoRegistro, ordem, idTransacao, descricao, status, descricaoStatus, valor, valorDolar, quantidadeParcelas, valorParcela, dataEvento, estabelecimento, flagCredito, tipoEstabelecimento, latitude, longetude, idGrupoMCC, flagSolicitouContestacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoResponse {\n");
    
    sb.append("    ultimaParcelaLancada: ").append(toIndentedString(ultimaParcelaLancada)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longetude: ").append(toIndentedString(longetude)).append("\n");
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



