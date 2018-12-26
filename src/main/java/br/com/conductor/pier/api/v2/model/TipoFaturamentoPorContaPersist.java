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
  
  private Long idConta = null;
  private Long idTipoFaturamento = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta relacionada
   **/
  public TipoFaturamentoPorContaPersist idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o da conta relacionada")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento relacionada
   **/
  public TipoFaturamentoPorContaPersist idTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento relacionada")
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
    TipoFaturamentoPorContaPersist tipoFaturamentoPorContaPersist = (TipoFaturamentoPorContaPersist) o;
    return Objects.equals(this.idConta, tipoFaturamentoPorContaPersist.idConta) &&
        Objects.equals(this.idTipoFaturamento, tipoFaturamentoPorContaPersist.idTipoFaturamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idTipoFaturamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFaturamentoPorContaPersist {\n");
    
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

