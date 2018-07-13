package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





/**
 * {{{detalhe_ajuste_lote_response_description}}}
 **/

@ApiModel(description = "{{{detalhe_ajuste_lote_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DetalheAjusteLoteResponse   {
  
  private Long id = null;
  private Long arquivoId = null;
  private String tipoAjusteDescricao = null;
  private Long idConta = null;
  private String status = null;
  private Date dataTransacao = null;
  private String valorTotalTransacao = null;
  private String tipoOperacao = null;
  private Date dataProcessamento = null;
  private Integer numeroLinha = null;
  private String descricaoStatus = null;

  
  /**
   * {{{detalhe_ajuste_lote_response_id_value}}}
   **/
  public DetalheAjusteLoteResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_ajuste_lote_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_arquivoId_value}}}
   **/
  public DetalheAjusteLoteResponse arquivoId(Long arquivoId) {
    this.arquivoId = arquivoId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_ajuste_lote_response_arquivoId_value}}}")
  @JsonProperty("arquivoId")
  public Long getArquivoId() {
    return arquivoId;
  }
  public void setArquivoId(Long arquivoId) {
    this.arquivoId = arquivoId;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_idTipoAjuste_value}}}
   **/
  public DetalheAjusteLoteResponse tipoAjusteDescricao(String tipoAjusteDescricao) {
    this.tipoAjusteDescricao = tipoAjusteDescricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_ajuste_lote_response_idTipoAjuste_value}}}")
  @JsonProperty("tipoAjusteDescricao")
  public String getTipoAjusteDescricao() {
    return tipoAjusteDescricao;
  }
  public void setTipoAjusteDescricao(String tipoAjusteDescricao) {
    this.tipoAjusteDescricao = tipoAjusteDescricao;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_idConta_value}}}
   **/
  public DetalheAjusteLoteResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_ajuste_lote_response_idConta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_Status_value}}}
   **/
  public DetalheAjusteLoteResponse status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_ajuste_lote_response_Status_value}}}")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_dataTransacao_value}}}
   **/
  public DetalheAjusteLoteResponse dataTransacao(Date dataTransacao) {
    this.dataTransacao = dataTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_ajuste_lote_response_dataTransacao_value}}}")
  @JsonProperty("dataTransacao")
  public Date getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(Date dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_valorTransacao_value}}}
   **/
  public DetalheAjusteLoteResponse valorTotalTransacao(String valorTotalTransacao) {
    this.valorTotalTransacao = valorTotalTransacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_ajuste_lote_response_valorTransacao_value}}}")
  @JsonProperty("valorTotalTransacao")
  public String getValorTotalTransacao() {
    return valorTotalTransacao;
  }
  public void setValorTotalTransacao(String valorTotalTransacao) {
    this.valorTotalTransacao = valorTotalTransacao;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_tipoRegistro_value}}}
   **/
  public DetalheAjusteLoteResponse tipoOperacao(String tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_ajuste_lote_response_tipoRegistro_value}}}")
  @JsonProperty("tipoOperacao")
  public String getTipoOperacao() {
    return tipoOperacao;
  }
  public void setTipoOperacao(String tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_dataProcessamento_value}}}
   **/
  public DetalheAjusteLoteResponse dataProcessamento(Date dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_ajuste_lote_response_dataProcessamento_value}}}")
  @JsonProperty("dataProcessamento")
  public Date getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(Date dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_numeroLinha_value}}}
   **/
  public DetalheAjusteLoteResponse numeroLinha(Integer numeroLinha) {
    this.numeroLinha = numeroLinha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_ajuste_lote_response_numeroLinha_value}}}")
  @JsonProperty("numeroLinha")
  public Integer getNumeroLinha() {
    return numeroLinha;
  }
  public void setNumeroLinha(Integer numeroLinha) {
    this.numeroLinha = numeroLinha;
  }

  
  /**
   * {{{detalhe_ajuste_lote_response_descricaoStatus_value}}}
   **/
  public DetalheAjusteLoteResponse descricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{detalhe_ajuste_lote_response_descricaoStatus_value}}}")
  @JsonProperty("descricaoStatus")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalheAjusteLoteResponse detalheAjusteLoteResponse = (DetalheAjusteLoteResponse) o;
    return Objects.equals(this.id, detalheAjusteLoteResponse.id) &&
        Objects.equals(this.arquivoId, detalheAjusteLoteResponse.arquivoId) &&
        Objects.equals(this.tipoAjusteDescricao, detalheAjusteLoteResponse.tipoAjusteDescricao) &&
        Objects.equals(this.idConta, detalheAjusteLoteResponse.idConta) &&
        Objects.equals(this.status, detalheAjusteLoteResponse.status) &&
        Objects.equals(this.dataTransacao, detalheAjusteLoteResponse.dataTransacao) &&
        Objects.equals(this.valorTotalTransacao, detalheAjusteLoteResponse.valorTotalTransacao) &&
        Objects.equals(this.tipoOperacao, detalheAjusteLoteResponse.tipoOperacao) &&
        Objects.equals(this.dataProcessamento, detalheAjusteLoteResponse.dataProcessamento) &&
        Objects.equals(this.numeroLinha, detalheAjusteLoteResponse.numeroLinha) &&
        Objects.equals(this.descricaoStatus, detalheAjusteLoteResponse.descricaoStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, arquivoId, tipoAjusteDescricao, idConta, status, dataTransacao, valorTotalTransacao, tipoOperacao, dataProcessamento, numeroLinha, descricaoStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalheAjusteLoteResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    arquivoId: ").append(toIndentedString(arquivoId)).append("\n");
    sb.append("    tipoAjusteDescricao: ").append(toIndentedString(tipoAjusteDescricao)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataTransacao: ").append(toIndentedString(dataTransacao)).append("\n");
    sb.append("    valorTotalTransacao: ").append(toIndentedString(valorTotalTransacao)).append("\n");
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
    sb.append("    dataProcessamento: ").append(toIndentedString(dataProcessamento)).append("\n");
    sb.append("    numeroLinha: ").append(toIndentedString(numeroLinha)).append("\n");
    sb.append("    descricaoStatus: ").append(toIndentedString(descricaoStatus)).append("\n");
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



