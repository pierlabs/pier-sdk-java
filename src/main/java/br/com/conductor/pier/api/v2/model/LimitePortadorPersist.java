package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de persist\u00EAncia de um limite para o portador
 **/

@ApiModel(description = "Objeto de persist\u00EAncia de um limite para o portador")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LimitePortadorPersist   {
  
  private BigDecimal limiteGlobal = null;
  private BigDecimal saldoDisponivelGlobal = null;

  
  /**
   * Limite do portador
   **/
  public LimitePortadorPersist limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Limite do portador")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Saldo dispon\u00EDvel do portador
   **/
  public LimitePortadorPersist saldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Saldo dispon\u00EDvel do portador")
  @JsonProperty("saldoDisponivelGlobal")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitePortadorPersist limitePortadorPersist = (LimitePortadorPersist) o;
    return Objects.equals(this.limiteGlobal, limitePortadorPersist.limiteGlobal) &&
        Objects.equals(this.saldoDisponivelGlobal, limitePortadorPersist.saldoDisponivelGlobal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limiteGlobal, saldoDisponivelGlobal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitePortadorPersist {\n");
    
    sb.append("    limiteGlobal: ").append(toIndentedString(limiteGlobal)).append("\n");
    sb.append("    saldoDisponivelGlobal: ").append(toIndentedString(saldoDisponivelGlobal)).append("\n");
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

