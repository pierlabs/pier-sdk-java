package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Faturamento
 **/

@ApiModel(description = "Objeto Faturamento")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoFaturamentoPorContaResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Boolean status = null;
  private Long idTipoFaturamento = null;
  private String dataHoraInclusao = null;
  private String dataHoraCancelamento = null;
  private String modificadoPor = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de faturamento por conta (id).
   **/
  public TipoFaturamentoPorContaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de faturamento por conta (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta relacionada ao tipo de faturamento.
   **/
  public TipoFaturamentoPorContaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta relacionada ao tipo de faturamento.")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Status da configura\u00C3\u00A7\u00C3\u00A3o que representa que se o tipo de faturamento por conta est\u00C3\u00A1 ativo ou cancelado.
   **/
  public TipoFaturamentoPorContaResponse status(Boolean status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Status da configura\u00C3\u00A7\u00C3\u00A3o que representa que se o tipo de faturamento por conta est\u00C3\u00A1 ativo ou cancelado.")
  @JsonProperty("status")
  public Boolean getStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da tipo de faturamento referenciado.
   **/
  public TipoFaturamentoPorContaResponse idTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da tipo de faturamento referenciado.")
  @JsonProperty("idTipoFaturamento")
  public Long getIdTipoFaturamento() {
    return idTipoFaturamento;
  }
  public void setIdTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
  }

  
  /**
   * Data de inclus\u00C3\u00A3o da configura\u00C3\u00A7\u00C3\u00A3o de tipo de faturamento por conta.
   **/
  public TipoFaturamentoPorContaResponse dataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de inclus\u00C3\u00A3o da configura\u00C3\u00A7\u00C3\u00A3o de tipo de faturamento por conta.")
  @JsonProperty("dataHoraInclusao")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * Data de cancelamento da configura\u00C3\u00A7\u00C3\u00A3o de tipo de faturamento por conta.
   **/
  public TipoFaturamentoPorContaResponse dataHoraCancelamento(String dataHoraCancelamento) {
    this.dataHoraCancelamento = dataHoraCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data de cancelamento da configura\u00C3\u00A7\u00C3\u00A3o de tipo de faturamento por conta.")
  @JsonProperty("dataHoraCancelamento")
  public String getDataHoraCancelamento() {
    return dataHoraCancelamento;
  }
  public void setDataHoraCancelamento(String dataHoraCancelamento) {
    this.dataHoraCancelamento = dataHoraCancelamento;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do respons\u00C3\u00A1vel pela \u00C3\u00BAltima modifica\u00C3\u00A7\u00C3\u00A3o da configura\u00C3\u00A7\u00C3\u00A3o.
   **/
  public TipoFaturamentoPorContaResponse modificadoPor(String modificadoPor) {
    this.modificadoPor = modificadoPor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00C3\u00A7\u00C3\u00A3o do respons\u00C3\u00A1vel pela \u00C3\u00BAltima modifica\u00C3\u00A7\u00C3\u00A3o da configura\u00C3\u00A7\u00C3\u00A3o.")
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
        Objects.equals(this.status, tipoFaturamentoPorContaResponse.status) &&
        Objects.equals(this.idTipoFaturamento, tipoFaturamentoPorContaResponse.idTipoFaturamento) &&
        Objects.equals(this.dataHoraInclusao, tipoFaturamentoPorContaResponse.dataHoraInclusao) &&
        Objects.equals(this.dataHoraCancelamento, tipoFaturamentoPorContaResponse.dataHoraCancelamento) &&
        Objects.equals(this.modificadoPor, tipoFaturamentoPorContaResponse.modificadoPor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, status, idTipoFaturamento, dataHoraInclusao, dataHoraCancelamento, modificadoPor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFaturamentoPorContaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

