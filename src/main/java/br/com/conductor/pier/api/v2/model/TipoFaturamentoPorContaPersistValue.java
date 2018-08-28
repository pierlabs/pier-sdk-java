package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{tipo_faturamento_por_conta_persist_description}}}
 **/

@ApiModel(description = "{{{tipo_faturamento_por_conta_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoFaturamentoPorContaPersistValue   {
  
  private Long idConta = null;
  private Long idTipoFaturamento = null;

  
  /**
   * {{{tipo_faturamento_por_conta_persist_id_conta_value}}}
   **/
  public TipoFaturamentoPorContaPersistValue idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{tipo_faturamento_por_conta_persist_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{tipo_faturamento_por_conta_persist_id_tipo_faturamento_value}}}
   **/
  public TipoFaturamentoPorContaPersistValue idTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{tipo_faturamento_por_conta_persist_id_tipo_faturamento_value}}}")
  @JsonProperty("idTipoFaturamento")
  public Long getIdTipoFaturamento() {
    return idTipoFaturamento;
  }
  public void setIdTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoFaturamentoPorContaPersistValue tipoFaturamentoPorContaPersistValue = (TipoFaturamentoPorContaPersistValue) o;
    return Objects.equals(this.idConta, tipoFaturamentoPorContaPersistValue.idConta) &&
        Objects.equals(this.idTipoFaturamento, tipoFaturamentoPorContaPersistValue.idTipoFaturamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idTipoFaturamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFaturamentoPorContaPersistValue {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idTipoFaturamento: ").append(toIndentedString(idTipoFaturamento)).append("\n");
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

