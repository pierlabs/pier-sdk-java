package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto para persist\u00EAncia de v\u00EDnculos entre contas
 **/

@ApiModel(description = "Objeto para persist\u00EAncia de v\u00EDnculos entre contas")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class VinculoContaPersist   {
  
  private Long idConta = null;
  private Long idTipoVinculo = null;

  
  /**
   * Id da subconta
   **/
  public VinculoContaPersist idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id da subconta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Id do tipo de v\u00EDnculo entre as duas contas
   **/
  public VinculoContaPersist idTipoVinculo(Long idTipoVinculo) {
    this.idTipoVinculo = idTipoVinculo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id do tipo de v\u00EDnculo entre as duas contas")
  @JsonProperty("idTipoVinculo")
  public Long getIdTipoVinculo() {
    return idTipoVinculo;
  }
  public void setIdTipoVinculo(Long idTipoVinculo) {
    this.idTipoVinculo = idTipoVinculo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VinculoContaPersist vinculoContaPersist = (VinculoContaPersist) o;
    return Objects.equals(this.idConta, vinculoContaPersist.idConta) &&
        Objects.equals(this.idTipoVinculo, vinculoContaPersist.idTipoVinculo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idTipoVinculo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoContaPersist {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idTipoVinculo: ").append(toIndentedString(idTipoVinculo)).append("\n");
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

