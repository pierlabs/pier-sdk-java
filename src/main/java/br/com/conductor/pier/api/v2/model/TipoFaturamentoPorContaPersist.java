package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * TipoFaturamentoPorContaPersist
 **/

@ApiModel(description = "TipoFaturamentoPorContaPersist")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoFaturamentoPorContaPersist   {
  
  private Boolean status = null;
  private Long idConta = null;
  private Long idTipoFaturamento = null;
  private String dataHoraInclusao = null;
  private String dataHoraCancelamento = null;
  private String modificadoPor = null;

  
  /**
   * Representa se a configura\u00E7\u00E3o est\u00E1 ativada ou desativada para a conta.
   **/
  public TipoFaturamentoPorContaPersist status(Boolean status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "Representa se a configura\u00E7\u00E3o est\u00E1 ativada ou desativada para a conta.")
  @JsonProperty("status")
  public Boolean getStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta relacionada.
   **/
  public TipoFaturamentoPorContaPersist idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o da conta relacionada.")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento relacionada.
   **/
  public TipoFaturamentoPorContaPersist idTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento relacionada.")
  @JsonProperty("idTipoFaturamento")
  public Long getIdTipoFaturamento() {
    return idTipoFaturamento;
  }
  public void setIdTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
  }

  
  /**
   * Data da inclus\u00E3o da configura\u00E7\u00E3o, deve ser informada no formato yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.
   **/
  public TipoFaturamentoPorContaPersist dataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data da inclus\u00E3o da configura\u00E7\u00E3o, deve ser informada no formato yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.")
  @JsonProperty("dataHoraInclusao")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * Data do cancelamento da configura\u00E7\u00E3o, deve ser informada no formato yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.
   **/
  public TipoFaturamentoPorContaPersist dataHoraCancelamento(String dataHoraCancelamento) {
    this.dataHoraCancelamento = dataHoraCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data do cancelamento da configura\u00E7\u00E3o, deve ser informada no formato yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.")
  @JsonProperty("dataHoraCancelamento")
  public String getDataHoraCancelamento() {
    return dataHoraCancelamento;
  }
  public void setDataHoraCancelamento(String dataHoraCancelamento) {
    this.dataHoraCancelamento = dataHoraCancelamento;
  }

  
  /**
   * Identificador do respons\u00E1vel pela modifica\u00E7\u00E3o do registro.
   **/
  public TipoFaturamentoPorContaPersist modificadoPor(String modificadoPor) {
    this.modificadoPor = modificadoPor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identificador do respons\u00E1vel pela modifica\u00E7\u00E3o do registro.")
  @JsonProperty("modificadoPor")
  public String getModificadoPor() {
    return modificadoPor;
  }
  public void setModificadoPor(String modificadoPor) {
    this.modificadoPor = modificadoPor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoFaturamentoPorContaPersist tipoFaturamentoPorContaPersist = (TipoFaturamentoPorContaPersist) o;
    return Objects.equals(this.status, tipoFaturamentoPorContaPersist.status) &&
        Objects.equals(this.idConta, tipoFaturamentoPorContaPersist.idConta) &&
        Objects.equals(this.idTipoFaturamento, tipoFaturamentoPorContaPersist.idTipoFaturamento) &&
        Objects.equals(this.dataHoraInclusao, tipoFaturamentoPorContaPersist.dataHoraInclusao) &&
        Objects.equals(this.dataHoraCancelamento, tipoFaturamentoPorContaPersist.dataHoraCancelamento) &&
        Objects.equals(this.modificadoPor, tipoFaturamentoPorContaPersist.modificadoPor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, idConta, idTipoFaturamento, dataHoraInclusao, dataHoraCancelamento, modificadoPor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFaturamentoPorContaPersist {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idTipoFaturamento: ").append(toIndentedString(idTipoFaturamento)).append("\n");
    sb.append("    dataHoraInclusao: ").append(toIndentedString(dataHoraInclusao)).append("\n");
    sb.append("    dataHoraCancelamento: ").append(toIndentedString(dataHoraCancelamento)).append("\n");
    sb.append("    modificadoPor: ").append(toIndentedString(modificadoPor)).append("\n");
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

