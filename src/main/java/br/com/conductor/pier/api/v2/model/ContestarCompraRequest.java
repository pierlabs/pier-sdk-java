package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{contestar_compra_request_description}}}
 **/

@ApiModel(description = "{{{contestar_compra_request_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContestarCompraRequest   {
  
  private Long codigoChargebackId = null;
  private List<Long> compras = new ArrayList<Long>();
  private Boolean enviarDocumentos = null;
  private String mensagem = null;
  private String mensagemCSLight = null;
  private String mensagemChargeback = null;
  private Long statusId = null;
  private Long tipoContestacaoId = null;

  
  /**
   **/
  public ContestarCompraRequest codigoChargebackId(Long codigoChargebackId) {
    this.codigoChargebackId = codigoChargebackId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codigoChargebackId")
  public Long getCodigoChargebackId() {
    return codigoChargebackId;
  }
  public void setCodigoChargebackId(Long codigoChargebackId) {
    this.codigoChargebackId = codigoChargebackId;
  }

  
  /**
   **/
  public ContestarCompraRequest compras(List<Long> compras) {
    this.compras = compras;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("compras")
  public List<Long> getCompras() {
    return compras;
  }
  public void setCompras(List<Long> compras) {
    this.compras = compras;
  }

  
  /**
   **/
  public ContestarCompraRequest enviarDocumentos(Boolean enviarDocumentos) {
    this.enviarDocumentos = enviarDocumentos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enviarDocumentos")
  public Boolean getEnviarDocumentos() {
    return enviarDocumentos;
  }
  public void setEnviarDocumentos(Boolean enviarDocumentos) {
    this.enviarDocumentos = enviarDocumentos;
  }

  
  /**
   **/
  public ContestarCompraRequest mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mensagem")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   **/
  public ContestarCompraRequest mensagemCSLight(String mensagemCSLight) {
    this.mensagemCSLight = mensagemCSLight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mensagemCSLight")
  public String getMensagemCSLight() {
    return mensagemCSLight;
  }
  public void setMensagemCSLight(String mensagemCSLight) {
    this.mensagemCSLight = mensagemCSLight;
  }

  
  /**
   **/
  public ContestarCompraRequest mensagemChargeback(String mensagemChargeback) {
    this.mensagemChargeback = mensagemChargeback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mensagemChargeback")
  public String getMensagemChargeback() {
    return mensagemChargeback;
  }
  public void setMensagemChargeback(String mensagemChargeback) {
    this.mensagemChargeback = mensagemChargeback;
  }

  
  /**
   **/
  public ContestarCompraRequest statusId(Long statusId) {
    this.statusId = statusId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statusId")
  public Long getStatusId() {
    return statusId;
  }
  public void setStatusId(Long statusId) {
    this.statusId = statusId;
  }

  
  /**
   **/
  public ContestarCompraRequest tipoContestacaoId(Long tipoContestacaoId) {
    this.tipoContestacaoId = tipoContestacaoId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tipoContestacaoId")
  public Long getTipoContestacaoId() {
    return tipoContestacaoId;
  }
  public void setTipoContestacaoId(Long tipoContestacaoId) {
    this.tipoContestacaoId = tipoContestacaoId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestarCompraRequest contestarCompraRequest = (ContestarCompraRequest) o;
    return Objects.equals(this.codigoChargebackId, contestarCompraRequest.codigoChargebackId) &&
        Objects.equals(this.compras, contestarCompraRequest.compras) &&
        Objects.equals(this.enviarDocumentos, contestarCompraRequest.enviarDocumentos) &&
        Objects.equals(this.mensagem, contestarCompraRequest.mensagem) &&
        Objects.equals(this.mensagemCSLight, contestarCompraRequest.mensagemCSLight) &&
        Objects.equals(this.mensagemChargeback, contestarCompraRequest.mensagemChargeback) &&
        Objects.equals(this.statusId, contestarCompraRequest.statusId) &&
        Objects.equals(this.tipoContestacaoId, contestarCompraRequest.tipoContestacaoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoChargebackId, compras, enviarDocumentos, mensagem, mensagemCSLight, mensagemChargeback, statusId, tipoContestacaoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestarCompraRequest {\n");
    
    sb.append("    codigoChargebackId: ").append(toIndentedString(codigoChargebackId)).append("\n");
    sb.append("    compras: ").append(toIndentedString(compras)).append("\n");
    sb.append("    enviarDocumentos: ").append(toIndentedString(enviarDocumentos)).append("\n");
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
    sb.append("    mensagemCSLight: ").append(toIndentedString(mensagemCSLight)).append("\n");
    sb.append("    mensagemChargeback: ").append(toIndentedString(mensagemChargeback)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    tipoContestacaoId: ").append(toIndentedString(tipoContestacaoId)).append("\n");
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

