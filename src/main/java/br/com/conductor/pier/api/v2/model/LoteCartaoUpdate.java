package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto que representa o DTO update do recurso lotes de cart\u00F5es
 **/

@ApiModel(description = "Objeto que representa o DTO update do recurso lotes de cart\u00F5es")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LoteCartaoUpdate   {
  
  private Integer qtdSolicitada = null;
  private Long idProduto = null;
  private Long idSolicitante = null;
  private Long idOrigemComercial = null;
  private Long idPlastico = null;
  private Long idImagem = null;
  private Long idContaDefault = null;
  private Boolean flagMultiApp = null;
  private String dataAgendamento = null;

  
  /**
   * Quantidade de cart\u00F5es a ser emitido
   **/
  public LoteCartaoUpdate qtdSolicitada(Integer qtdSolicitada) {
    this.qtdSolicitada = qtdSolicitada;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de cart\u00F5es a ser emitido")
  @JsonProperty("qtdSolicitada")
  public Integer getQtdSolicitada() {
    return qtdSolicitada;
  }
  public void setQtdSolicitada(Integer qtdSolicitada) {
    this.qtdSolicitada = qtdSolicitada;
  }

  
  /**
   * C\u00F3digo identificador do produto
   **/
  public LoteCartaoUpdate idProduto(Long idProduto) {
    this.idProduto = idProduto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do produto")
  @JsonProperty("idProduto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00F3digo identificador do solicitante
   **/
  public LoteCartaoUpdate idSolicitante(Long idSolicitante) {
    this.idSolicitante = idSolicitante;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do solicitante")
  @JsonProperty("idSolicitante")
  public Long getIdSolicitante() {
    return idSolicitante;
  }
  public void setIdSolicitante(Long idSolicitante) {
    this.idSolicitante = idSolicitante;
  }

  
  /**
   * C\u00F3digo identificador da origem comercial
   **/
  public LoteCartaoUpdate idOrigemComercial(Long idOrigemComercial) {
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
  public LoteCartaoUpdate idPlastico(Long idPlastico) {
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
   * C\u00F3digo identificador do tipo pl\u00E1stico imagem
   **/
  public LoteCartaoUpdate idImagem(Long idImagem) {
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
   * C\u00F3digo identificador da conta padr\u00E3o, caso seja informado os cart\u00F5es do lote ser\u00E3o criados para o id informado
   **/
  public LoteCartaoUpdate idContaDefault(Long idContaDefault) {
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
   * Indica se o lote ser\u00E1 de cart\u00F5es m\u00FAltiplos
   **/
  public LoteCartaoUpdate flagMultiApp(Boolean flagMultiApp) {
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
   * Data de agendamento da execu\u00E7\u00E3o do lote
   **/
  public LoteCartaoUpdate dataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de agendamento da execu\u00E7\u00E3o do lote")
  @JsonProperty("dataAgendamento")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoteCartaoUpdate loteCartaoUpdate = (LoteCartaoUpdate) o;
    return Objects.equals(this.qtdSolicitada, loteCartaoUpdate.qtdSolicitada) &&
        Objects.equals(this.idProduto, loteCartaoUpdate.idProduto) &&
        Objects.equals(this.idSolicitante, loteCartaoUpdate.idSolicitante) &&
        Objects.equals(this.idOrigemComercial, loteCartaoUpdate.idOrigemComercial) &&
        Objects.equals(this.idPlastico, loteCartaoUpdate.idPlastico) &&
        Objects.equals(this.idImagem, loteCartaoUpdate.idImagem) &&
        Objects.equals(this.idContaDefault, loteCartaoUpdate.idContaDefault) &&
        Objects.equals(this.flagMultiApp, loteCartaoUpdate.flagMultiApp) &&
        Objects.equals(this.dataAgendamento, loteCartaoUpdate.dataAgendamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qtdSolicitada, idProduto, idSolicitante, idOrigemComercial, idPlastico, idImagem, idContaDefault, flagMultiApp, dataAgendamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoteCartaoUpdate {\n");
    
    sb.append("    qtdSolicitada: ").append(toIndentedString(qtdSolicitada)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    idSolicitante: ").append(toIndentedString(idSolicitante)).append("\n");
    sb.append("    idOrigemComercial: ").append(toIndentedString(idOrigemComercial)).append("\n");
    sb.append("    idPlastico: ").append(toIndentedString(idPlastico)).append("\n");
    sb.append("    idImagem: ").append(toIndentedString(idImagem)).append("\n");
    sb.append("    idContaDefault: ").append(toIndentedString(idContaDefault)).append("\n");
    sb.append("    flagMultiApp: ").append(toIndentedString(flagMultiApp)).append("\n");
    sb.append("    dataAgendamento: ").append(toIndentedString(dataAgendamento)).append("\n");
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

