package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de resposta do recurso lotes de cart\u00F5es
 **/

@ApiModel(description = "Objeto de resposta do recurso lotes de cart\u00F5es")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LoteCartaoResponse   {
  
  private String dataAgendamento = null;
  private String dataHoraStatus = null;
  private Boolean flagMultiApp = null;
  private Long idContaDefault = null;
  private Long idImagem = null;
  private Long idLote = null;
  private Long idOrigemComercial = null;
  private Long idPlastico = null;
  private Long idProduto = null;
  private Long idSolicitante = null;
  private Long qtdSolicitada = null;
  private Integer statusLote = null;
  private Integer tipoLote = null;

  
  /**
   * Data e hora da gera\u00E7\u00E3o do lote
   **/
  public LoteCartaoResponse dataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e hora da gera\u00E7\u00E3o do lote")
  @JsonProperty("dataAgendamento")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * Data e hora da modifica\u00E7\u00E3o do status do lote
   **/
  public LoteCartaoResponse dataHoraStatus(String dataHoraStatus) {
    this.dataHoraStatus = dataHoraStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e hora da modifica\u00E7\u00E3o do status do lote")
  @JsonProperty("dataHoraStatus")
  public String getDataHoraStatus() {
    return dataHoraStatus;
  }
  public void setDataHoraStatus(String dataHoraStatus) {
    this.dataHoraStatus = dataHoraStatus;
  }

  
  /**
   * Indica se o lote ser\u00E1 de cart\u00F5es m\u00FAltiplos
   **/
  public LoteCartaoResponse flagMultiApp(Boolean flagMultiApp) {
    this.flagMultiApp = flagMultiApp;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Indica se o lote ser\u00E1 de cart\u00F5es m\u00FAltiplos")
  @JsonProperty("flagMultiApp")
  public Boolean getFlagMultiApp() {
    return flagMultiApp;
  }
  public void setFlagMultiApp(Boolean flagMultiApp) {
    this.flagMultiApp = flagMultiApp;
  }

  
  /**
   * C\u00F3digo identificador da conta padr\u00E3o, caso seja informado os cart\u00F5es do lote ser\u00E3o criados para o id informado
   **/
  public LoteCartaoResponse idContaDefault(Long idContaDefault) {
    this.idContaDefault = idContaDefault;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da conta padr\u00E3o, caso seja informado os cart\u00F5es do lote ser\u00E3o criados para o id informado")
  @JsonProperty("idContaDefault")
  public Long getIdContaDefault() {
    return idContaDefault;
  }
  public void setIdContaDefault(Long idContaDefault) {
    this.idContaDefault = idContaDefault;
  }

  
  /**
   * C\u00F3digo identificador do tipo pl\u00E1stico imagem
   **/
  public LoteCartaoResponse idImagem(Long idImagem) {
    this.idImagem = idImagem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do tipo pl\u00E1stico imagem")
  @JsonProperty("idImagem")
  public Long getIdImagem() {
    return idImagem;
  }
  public void setIdImagem(Long idImagem) {
    this.idImagem = idImagem;
  }

  
  /**
   * Identificador do Lote
   **/
  public LoteCartaoResponse idLote(Long idLote) {
    this.idLote = idLote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do Lote")
  @JsonProperty("idLote")
  public Long getIdLote() {
    return idLote;
  }
  public void setIdLote(Long idLote) {
    this.idLote = idLote;
  }

  
  /**
   * C\u00F3digo identificador da origem comercial
   **/
  public LoteCartaoResponse idOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da origem comercial")
  @JsonProperty("idOrigemComercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * C\u00F3digo identificador do tipo pl\u00E1stico associado ao produto
   **/
  public LoteCartaoResponse idPlastico(Long idPlastico) {
    this.idPlastico = idPlastico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do tipo pl\u00E1stico associado ao produto")
  @JsonProperty("idPlastico")
  public Long getIdPlastico() {
    return idPlastico;
  }
  public void setIdPlastico(Long idPlastico) {
    this.idPlastico = idPlastico;
  }

  
  /**
   * Identificador do Produto
   **/
  public LoteCartaoResponse idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do Produto")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identificador do Solicitante
   **/
  public LoteCartaoResponse idSolicitante(Long idSolicitante) {
    this.idSolicitante = idSolicitante;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do Solicitante")
  @JsonProperty("idSolicitante")
  public Long getIdSolicitante() {
    return idSolicitante;
  }
  public void setIdSolicitante(Long idSolicitante) {
    this.idSolicitante = idSolicitante;
  }

  
  /**
   * Quantidade Solicitada
   **/
  public LoteCartaoResponse qtdSolicitada(Long qtdSolicitada) {
    this.qtdSolicitada = qtdSolicitada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade Solicitada")
  @JsonProperty("qtdSolicitada")
  public Long getQtdSolicitada() {
    return qtdSolicitada;
  }
  public void setQtdSolicitada(Long qtdSolicitada) {
    this.qtdSolicitada = qtdSolicitada;
  }

  
  /**
   * Status do Lote
   **/
  public LoteCartaoResponse statusLote(Integer statusLote) {
    this.statusLote = statusLote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status do Lote")
  @JsonProperty("statusLote")
  public Integer getStatusLote() {
    return statusLote;
  }
  public void setStatusLote(Integer statusLote) {
    this.statusLote = statusLote;
  }

  
  /**
   * Tipo do Lote
   **/
  public LoteCartaoResponse tipoLote(Integer tipoLote) {
    this.tipoLote = tipoLote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tipo do Lote")
  @JsonProperty("tipoLote")
  public Integer getTipoLote() {
    return tipoLote;
  }
  public void setTipoLote(Integer tipoLote) {
    this.tipoLote = tipoLote;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoteCartaoResponse loteCartaoResponse = (LoteCartaoResponse) o;
    return Objects.equals(this.dataAgendamento, loteCartaoResponse.dataAgendamento) &&
        Objects.equals(this.dataHoraStatus, loteCartaoResponse.dataHoraStatus) &&
        Objects.equals(this.flagMultiApp, loteCartaoResponse.flagMultiApp) &&
        Objects.equals(this.idContaDefault, loteCartaoResponse.idContaDefault) &&
        Objects.equals(this.idImagem, loteCartaoResponse.idImagem) &&
        Objects.equals(this.idLote, loteCartaoResponse.idLote) &&
        Objects.equals(this.idOrigemComercial, loteCartaoResponse.idOrigemComercial) &&
        Objects.equals(this.idPlastico, loteCartaoResponse.idPlastico) &&
        Objects.equals(this.idProduto, loteCartaoResponse.idProduto) &&
        Objects.equals(this.idSolicitante, loteCartaoResponse.idSolicitante) &&
        Objects.equals(this.qtdSolicitada, loteCartaoResponse.qtdSolicitada) &&
        Objects.equals(this.statusLote, loteCartaoResponse.statusLote) &&
        Objects.equals(this.tipoLote, loteCartaoResponse.tipoLote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataAgendamento, dataHoraStatus, flagMultiApp, idContaDefault, idImagem, idLote, idOrigemComercial, idPlastico, idProduto, idSolicitante, qtdSolicitada, statusLote, tipoLote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoteCartaoResponse {\n");
    
    sb.append("    dataAgendamento: ").append(toIndentedString(dataAgendamento)).append("\n");
    sb.append("    dataHoraStatus: ").append(toIndentedString(dataHoraStatus)).append("\n");
    sb.append("    flagMultiApp: ").append(toIndentedString(flagMultiApp)).append("\n");
    sb.append("    idContaDefault: ").append(toIndentedString(idContaDefault)).append("\n");
    sb.append("    idImagem: ").append(toIndentedString(idImagem)).append("\n");
    sb.append("    idLote: ").append(toIndentedString(idLote)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idPlastico: ").append(toIndentedString(idPlastico)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idSolicitante: ").append(toIndentedString(idSolicitante)).append("\n");
    sb.append("    qtdSolicitada: ").append(toIndentedString(qtdSolicitada)).append("\n");
    sb.append("    statusLote: ").append(toIndentedString(statusLote)).append("\n");
    sb.append("    tipoLote: ").append(toIndentedString(tipoLote)).append("\n");
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

