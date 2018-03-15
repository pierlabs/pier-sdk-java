package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto transferencia
 **/

@ApiModel(description = "Objeto transferencia")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransferenciaResponse   {
  
  private Long id = null;
  private String dataTransferencia = null;
  private Long idContaOrigem = null;
  private Long idContaDestino = null;
  private BigDecimal valorTransferencia = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da transfer\u00EAncia (id).
   **/
  public TransferenciaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da transfer\u00EAncia (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Data estabelecida para ocorrer a transfer\u00EAncia.
   **/
  public TransferenciaResponse dataTransferencia(String dataTransferencia) {
    this.dataTransferencia = dataTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data estabelecida para ocorrer a transfer\u00EAncia.")
  @JsonProperty("dataTransferencia")
  public String getDataTransferencia() {
    return dataTransferencia;
  }
  public void setDataTransferencia(String dataTransferencia) {
    this.dataTransferencia = dataTransferencia;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta em que o valor ser\u00E1 debitado para a transfer\u00EAncia. (id).
   **/
  public TransferenciaResponse idContaOrigem(Long idContaOrigem) {
    this.idContaOrigem = idContaOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da conta em que o valor ser\u00E1 debitado para a transfer\u00EAncia. (id).")
  @JsonProperty("idContaOrigem")
  public Long getIdContaOrigem() {
    return idContaOrigem;
  }
  public void setIdContaOrigem(Long idContaOrigem) {
    this.idContaOrigem = idContaOrigem;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta em que o valor ser\u00E1 creditado para a transfer\u00EAncia. (id).
   **/
  public TransferenciaResponse idContaDestino(Long idContaDestino) {
    this.idContaDestino = idContaDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da conta em que o valor ser\u00E1 creditado para a transfer\u00EAncia. (id).")
  @JsonProperty("idContaDestino")
  public Long getIdContaDestino() {
    return idContaDestino;
  }
  public void setIdContaDestino(Long idContaDestino) {
    this.idContaDestino = idContaDestino;
  }

  
  /**
   * Valor estabelecido para ser transferido.
   **/
  public TransferenciaResponse valorTransferencia(BigDecimal valorTransferencia) {
    this.valorTransferencia = valorTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor estabelecido para ser transferido.")
  @JsonProperty("valorTransferencia")
  public BigDecimal getValorTransferencia() {
    return valorTransferencia;
  }
  public void setValorTransferencia(BigDecimal valorTransferencia) {
    this.valorTransferencia = valorTransferencia;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferenciaResponse transferenciaResponse = (TransferenciaResponse) o;
    return Objects.equals(this.id, transferenciaResponse.id) &&
        Objects.equals(this.dataTransferencia, transferenciaResponse.dataTransferencia) &&
        Objects.equals(this.idContaOrigem, transferenciaResponse.idContaOrigem) &&
        Objects.equals(this.idContaDestino, transferenciaResponse.idContaDestino) &&
        Objects.equals(this.valorTransferencia, transferenciaResponse.valorTransferencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dataTransferencia, idContaOrigem, idContaDestino, valorTransferencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataTransferencia: ").append(toIndentedString(dataTransferencia)).append("\n");
    sb.append("    idContaOrigem: ").append(toIndentedString(idContaOrigem)).append("\n");
    sb.append("    idContaDestino: ").append(toIndentedString(idContaDestino)).append("\n");
    sb.append("    valorTransferencia: ").append(toIndentedString(valorTransferencia)).append("\n");
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

