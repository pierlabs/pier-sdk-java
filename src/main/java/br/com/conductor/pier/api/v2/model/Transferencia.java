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
public class Transferencia   {
  
  private Long id = null;
  private String dataTransferencia = null;
  private Long idContaOrigem = null;
  private String nomePessoaOrigem = null;
  private Long idContaDestino = null;
  private String nomePessoaDestino = null;
  private BigDecimal valorTransferencia = null;
  private BigDecimal valorTarifa = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transfer\u00C3\u00AAncia (id).
   **/
  public Transferencia id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transfer\u00C3\u00AAncia (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Data estabelecida para ocorrer a transfer\u00C3\u00AAncia.
   **/
  public Transferencia dataTransferencia(String dataTransferencia) {
    this.dataTransferencia = dataTransferencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data estabelecida para ocorrer a transfer\u00C3\u00AAncia.")
  @JsonProperty("dataTransferencia")
  public String getDataTransferencia() {
    return dataTransferencia;
  }
  public void setDataTransferencia(String dataTransferencia) {
    this.dataTransferencia = dataTransferencia;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta em que o valor ser\u00C3\u00A1 debitado para a transfer\u00C3\u00AAncia. (id).
   **/
  public Transferencia idContaOrigem(Long idContaOrigem) {
    this.idContaOrigem = idContaOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta em que o valor ser\u00C3\u00A1 debitado para a transfer\u00C3\u00AAncia. (id).")
  @JsonProperty("idContaOrigem")
  public Long getIdContaOrigem() {
    return idContaOrigem;
  }
  public void setIdContaOrigem(Long idContaOrigem) {
    this.idContaOrigem = idContaOrigem;
  }

  
  /**
   * Apresenta o nome completo da pessoa que realizou a Transfer\u00C3\u00AAncia.
   **/
  public Transferencia nomePessoaOrigem(String nomePessoaOrigem) {
    this.nomePessoaOrigem = nomePessoaOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome completo da pessoa que realizou a Transfer\u00C3\u00AAncia.")
  @JsonProperty("nomePessoaOrigem")
  public String getNomePessoaOrigem() {
    return nomePessoaOrigem;
  }
  public void setNomePessoaOrigem(String nomePessoaOrigem) {
    this.nomePessoaOrigem = nomePessoaOrigem;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta em que o valor ser\u00C3\u00A1 creditado para a transfer\u00C3\u00AAncia. (id).
   **/
  public Transferencia idContaDestino(Long idContaDestino) {
    this.idContaDestino = idContaDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta em que o valor ser\u00C3\u00A1 creditado para a transfer\u00C3\u00AAncia. (id).")
  @JsonProperty("idContaDestino")
  public Long getIdContaDestino() {
    return idContaDestino;
  }
  public void setIdContaDestino(Long idContaDestino) {
    this.idContaDestino = idContaDestino;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cliente Portador Cart\u00C3\u00A3o que ser\u00C3\u00A1 creditado (id).
   **/
  public Transferencia nomePessoaDestino(String nomePessoaDestino) {
    this.nomePessoaDestino = nomePessoaDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cliente Portador Cart\u00C3\u00A3o que ser\u00C3\u00A1 creditado (id).")
  @JsonProperty("nomePessoaDestino")
  public String getNomePessoaDestino() {
    return nomePessoaDestino;
  }
  public void setNomePessoaDestino(String nomePessoaDestino) {
    this.nomePessoaDestino = nomePessoaDestino;
  }

  
  /**
   * Valor estabelecido para ser transferido.
   **/
  public Transferencia valorTransferencia(BigDecimal valorTransferencia) {
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

  
  /**
   * Valor estabelecido da tarifa para a transfer\u00C3\u00AAncia.
   **/
  public Transferencia valorTarifa(BigDecimal valorTarifa) {
    this.valorTarifa = valorTarifa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor estabelecido da tarifa para a transfer\u00C3\u00AAncia.")
  @JsonProperty("valorTarifa")
  public BigDecimal getValorTarifa() {
    return valorTarifa;
  }
  public void setValorTarifa(BigDecimal valorTarifa) {
    this.valorTarifa = valorTarifa;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transferencia transferencia = (Transferencia) o;
    return Objects.equals(this.id, transferencia.id) &&
        Objects.equals(this.dataTransferencia, transferencia.dataTransferencia) &&
        Objects.equals(this.idContaOrigem, transferencia.idContaOrigem) &&
        Objects.equals(this.nomePessoaOrigem, transferencia.nomePessoaOrigem) &&
        Objects.equals(this.idContaDestino, transferencia.idContaDestino) &&
        Objects.equals(this.nomePessoaDestino, transferencia.nomePessoaDestino) &&
        Objects.equals(this.valorTransferencia, transferencia.valorTransferencia) &&
        Objects.equals(this.valorTarifa, transferencia.valorTarifa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dataTransferencia, idContaOrigem, nomePessoaOrigem, idContaDestino, nomePessoaDestino, valorTransferencia, valorTarifa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transferencia {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataTransferencia: ").append(toIndentedString(dataTransferencia)).append("\n");
    sb.append("    idContaOrigem: ").append(toIndentedString(idContaOrigem)).append("\n");
    sb.append("    nomePessoaOrigem: ").append(toIndentedString(nomePessoaOrigem)).append("\n");
    sb.append("    idContaDestino: ").append(toIndentedString(idContaDestino)).append("\n");
    sb.append("    nomePessoaDestino: ").append(toIndentedString(nomePessoaDestino)).append("\n");
    sb.append("    valorTransferencia: ").append(toIndentedString(valorTransferencia)).append("\n");
    sb.append("    valorTarifa: ").append(toIndentedString(valorTarifa)).append("\n");
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



