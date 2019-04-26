package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto de reposta do limite do portador
 **/

@ApiModel(description = "Objeto de reposta do limite do portador")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LimitePortadorResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private BigDecimal limiteGlobal = null;
  private Integer portador = null;
  private BigDecimal saldoDisponivelGlobal = null;

  
  /**
   * C\u00F3digo identificador do limite portador
   **/
  public LimitePortadorResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do limite portador")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador da conta
   **/
  public LimitePortadorResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Limite do portador
   **/
  public LimitePortadorResponse limiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Limite do portador")
  @JsonProperty("limiteGlobal")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * C\u00F3digo identificador do portador
   **/
  public LimitePortadorResponse portador(Integer portador) {
    this.portador = portador;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do portador")
  @JsonProperty("portador")
  public Integer getPortador() {
    return portador;
  }
  public void setPortador(Integer portador) {
    this.portador = portador;
  }

  
  /**
   * Saldo dispon\u00EDvel do portador
   **/
  public LimitePortadorResponse saldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Saldo dispon\u00EDvel do portador")
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
    LimitePortadorResponse limitePortadorResponse = (LimitePortadorResponse) o;
    return Objects.equals(this.id, limitePortadorResponse.id) &&
        Objects.equals(this.idConta, limitePortadorResponse.idConta) &&
        Objects.equals(this.limiteGlobal, limitePortadorResponse.limiteGlobal) &&
        Objects.equals(this.portador, limitePortadorResponse.portador) &&
        Objects.equals(this.saldoDisponivelGlobal, limitePortadorResponse.saldoDisponivelGlobal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, limiteGlobal, portador, saldoDisponivelGlobal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitePortadorResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    limiteGlobal: ").append(toIndentedString(limiteGlobal)).append("\n");
    sb.append("    portador: ").append(toIndentedString(portador)).append("\n");
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

