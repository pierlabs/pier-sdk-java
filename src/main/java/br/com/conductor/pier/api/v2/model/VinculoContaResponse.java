package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Descri\u00E7\u00E3o do objeto de resposta do recurso para v\u00EDnculo entre contas
 **/

@ApiModel(description = "Descri\u00E7\u00E3o do objeto de resposta do recurso para v\u00EDnculo entre contas")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class VinculoContaResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Long idContaPai = null;
  private Long idTipoVinculo = null;

  
  /**
   * C\u00F3digo identificador do v\u00EDnculo de contas (id)
   **/
  public VinculoContaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do v\u00EDnculo de contas (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Id da subconta
   **/
  public VinculoContaResponse idConta(Long idConta) {
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
   * Id da conta pai
   **/
  public VinculoContaResponse idContaPai(Long idContaPai) {
    this.idContaPai = idContaPai;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id da conta pai")
  @JsonProperty("idContaPai")
  public Long getIdContaPai() {
    return idContaPai;
  }
  public void setIdContaPai(Long idContaPai) {
    this.idContaPai = idContaPai;
  }

  
  /**
   * Id do tipo de v\u00EDnculo entre as duas contas
   **/
  public VinculoContaResponse idTipoVinculo(Long idTipoVinculo) {
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
    VinculoContaResponse vinculoContaResponse = (VinculoContaResponse) o;
    return Objects.equals(this.id, vinculoContaResponse.id) &&
        Objects.equals(this.idConta, vinculoContaResponse.idConta) &&
        Objects.equals(this.idContaPai, vinculoContaResponse.idContaPai) &&
        Objects.equals(this.idTipoVinculo, vinculoContaResponse.idTipoVinculo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, idContaPai, idTipoVinculo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoContaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idContaPai: ").append(toIndentedString(idContaPai)).append("\n");
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

