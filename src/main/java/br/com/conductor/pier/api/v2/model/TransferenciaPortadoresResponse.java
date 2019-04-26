package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de resposta de uma transfer\u00EAncia de cr\u00E9ditos entre portadores
 **/

@ApiModel(description = "Objeto de resposta de uma transfer\u00EAncia de cr\u00E9ditos entre portadores")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransferenciaPortadoresResponse   {
  
  private Long idAjusteCredito = null;
  private Long idAjusteDebito = null;

  
  /**
   * C\u00F3digo identificador do ajuste de cr\u00E9dito
   **/
  public TransferenciaPortadoresResponse idAjusteCredito(Long idAjusteCredito) {
    this.idAjusteCredito = idAjusteCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do ajuste de cr\u00E9dito")
  @JsonProperty("idAjusteCredito")
  public Long getIdAjusteCredito() {
    return idAjusteCredito;
  }
  public void setIdAjusteCredito(Long idAjusteCredito) {
    this.idAjusteCredito = idAjusteCredito;
  }

  
  /**
   * C\u00F3digo identificador do ajuste de d\u00E9bito
   **/
  public TransferenciaPortadoresResponse idAjusteDebito(Long idAjusteDebito) {
    this.idAjusteDebito = idAjusteDebito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do ajuste de d\u00E9bito")
  @JsonProperty("idAjusteDebito")
  public Long getIdAjusteDebito() {
    return idAjusteDebito;
  }
  public void setIdAjusteDebito(Long idAjusteDebito) {
    this.idAjusteDebito = idAjusteDebito;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferenciaPortadoresResponse transferenciaPortadoresResponse = (TransferenciaPortadoresResponse) o;
    return Objects.equals(this.idAjusteCredito, transferenciaPortadoresResponse.idAjusteCredito) &&
        Objects.equals(this.idAjusteDebito, transferenciaPortadoresResponse.idAjusteDebito);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAjusteCredito, idAjusteDebito);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaPortadoresResponse {\n");
    
    sb.append("    idAjusteCredito: ").append(toIndentedString(idAjusteCredito)).append("\n");
    sb.append("    idAjusteDebito: ").append(toIndentedString(idAjusteDebito)).append("\n");
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

