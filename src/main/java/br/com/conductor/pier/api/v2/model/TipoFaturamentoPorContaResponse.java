package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{tipo_faturamento_por_conta_response_description}}}
 **/

@ApiModel(description = "{{{tipo_faturamento_por_conta_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoFaturamentoPorContaResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Boolean ativo = null;
  private Long idTipoFaturamento = null;
  private String dataHoraInclusao = null;
  private String dataHoraCancelamento = null;
  private String modificadoPor = null;

  
  /**
   * {{{tipo_faturamento_por_conta_response_id_value}}}
   **/
  public TipoFaturamentoPorContaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_faturamento_por_conta_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{tipo_faturamento_por_conta_response_id_conta_value}}}
   **/
  public TipoFaturamentoPorContaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_faturamento_por_conta_response_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{tipo_faturamento_por_conta_response_status_value}}}
   **/
  public TipoFaturamentoPorContaResponse ativo(Boolean ativo) {
    this.ativo = ativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{tipo_faturamento_por_conta_response_status_value}}}")
  @JsonProperty("ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * {{{tipo_faturamento_por_conta_response_id_tipo_faturamento_value}}}
   **/
  public TipoFaturamentoPorContaResponse idTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_faturamento_por_conta_response_id_tipo_faturamento_value}}}")
  @JsonProperty("idTipoFaturamento")
  public Long getIdTipoFaturamento() {
    return idTipoFaturamento;
  }
  public void setIdTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
  }

  
  /**
   * {{{tipo_faturamento_por_conta_response_data_hora_inclusao_value}}}
   **/
  public TipoFaturamentoPorContaResponse dataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_faturamento_por_conta_response_data_hora_inclusao_value}}}")
  @JsonProperty("dataHoraInclusao")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * {{{tipo_faturamento_por_conta_response_data_hora_cancelamento_value}}}
   **/
  public TipoFaturamentoPorContaResponse dataHoraCancelamento(String dataHoraCancelamento) {
    this.dataHoraCancelamento = dataHoraCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_faturamento_por_conta_response_data_hora_cancelamento_value}}}")
  @JsonProperty("dataHoraCancelamento")
  public String getDataHoraCancelamento() {
    return dataHoraCancelamento;
  }
  public void setDataHoraCancelamento(String dataHoraCancelamento) {
    this.dataHoraCancelamento = dataHoraCancelamento;
  }

  
  /**
   * {{{tipo_faturamento_por_conta_response_modificado_por_value}}}
   **/
  public TipoFaturamentoPorContaResponse modificadoPor(String modificadoPor) {
    this.modificadoPor = modificadoPor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_faturamento_por_conta_response_modificado_por_value}}}")
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
    TipoFaturamentoPorContaResponse tipoFaturamentoPorContaResponse = (TipoFaturamentoPorContaResponse) o;
    return Objects.equals(this.id, tipoFaturamentoPorContaResponse.id) &&
        Objects.equals(this.idConta, tipoFaturamentoPorContaResponse.idConta) &&
        Objects.equals(this.ativo, tipoFaturamentoPorContaResponse.ativo) &&
        Objects.equals(this.idTipoFaturamento, tipoFaturamentoPorContaResponse.idTipoFaturamento) &&
        Objects.equals(this.dataHoraInclusao, tipoFaturamentoPorContaResponse.dataHoraInclusao) &&
        Objects.equals(this.dataHoraCancelamento, tipoFaturamentoPorContaResponse.dataHoraCancelamento) &&
        Objects.equals(this.modificadoPor, tipoFaturamentoPorContaResponse.modificadoPor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, ativo, idTipoFaturamento, dataHoraInclusao, dataHoraCancelamento, modificadoPor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFaturamentoPorContaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    ativo: ").append(toIndentedString(ativo)).append("\n");
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



