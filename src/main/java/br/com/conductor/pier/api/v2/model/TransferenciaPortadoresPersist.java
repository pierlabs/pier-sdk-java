package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto para realizar a transfer\u00EAncia entre portadores
 **/

@ApiModel(description = "Objeto para realizar a transfer\u00EAncia entre portadores")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TransferenciaPortadoresPersist   {
  
  private Long idPessoaOrigem = null;
  private Long idPessoaDestino = null;
  private BigDecimal valor = null;

  
  /**
   * Identificador da pessoa de origem
   **/
  public TransferenciaPortadoresPersist idPessoaOrigem(Long idPessoaOrigem) {
    this.idPessoaOrigem = idPessoaOrigem;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identificador da pessoa de origem")
  @JsonProperty("idPessoaOrigem")
  public Long getIdPessoaOrigem() {
    return idPessoaOrigem;
  }
  public void setIdPessoaOrigem(Long idPessoaOrigem) {
    this.idPessoaOrigem = idPessoaOrigem;
  }

  
  /**
   * Identificador da pessoa de destino
   **/
  public TransferenciaPortadoresPersist idPessoaDestino(Long idPessoaDestino) {
    this.idPessoaDestino = idPessoaDestino;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identificador da pessoa de destino")
  @JsonProperty("idPessoaDestino")
  public Long getIdPessoaDestino() {
    return idPessoaDestino;
  }
  public void setIdPessoaDestino(Long idPessoaDestino) {
    this.idPessoaDestino = idPessoaDestino;
  }

  
  /**
   * Valor da transfer\u00EAncia
   **/
  public TransferenciaPortadoresPersist valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor da transfer\u00EAncia")
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferenciaPortadoresPersist transferenciaPortadoresPersist = (TransferenciaPortadoresPersist) o;
    return Objects.equals(this.idPessoaOrigem, transferenciaPortadoresPersist.idPessoaOrigem) &&
        Objects.equals(this.idPessoaDestino, transferenciaPortadoresPersist.idPessoaDestino) &&
        Objects.equals(this.valor, transferenciaPortadoresPersist.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPessoaOrigem, idPessoaDestino, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaPortadoresPersist {\n");
    
    sb.append("    idPessoaOrigem: ").append(toIndentedString(idPessoaOrigem)).append("\n");
    sb.append("    idPessoaDestino: ").append(toIndentedString(idPessoaDestino)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

