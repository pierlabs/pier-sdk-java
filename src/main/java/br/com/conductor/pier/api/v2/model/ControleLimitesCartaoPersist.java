package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Representa a requisi\u00E7\u00E3o do recurso de cadastro de controle de limites para um cart\u00E3o
 **/

@ApiModel(description = "Representa a requisi\u00E7\u00E3o do recurso de cadastro de controle de limites para um cart\u00E3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ControleLimitesCartaoPersist   {
  
  private BigDecimal limiteMensal = null;
  private BigDecimal limiteSemanal = null;
  private BigDecimal limiteDiario = null;

  
  /**
   * Valor do limite mensal
   **/
  public ControleLimitesCartaoPersist limiteMensal(BigDecimal limiteMensal) {
    this.limiteMensal = limiteMensal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite mensal")
  @JsonProperty("limiteMensal")
  public BigDecimal getLimiteMensal() {
    return limiteMensal;
  }
  public void setLimiteMensal(BigDecimal limiteMensal) {
    this.limiteMensal = limiteMensal;
  }

  
  /**
   * Valor do limite semanal
   **/
  public ControleLimitesCartaoPersist limiteSemanal(BigDecimal limiteSemanal) {
    this.limiteSemanal = limiteSemanal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite semanal")
  @JsonProperty("limiteSemanal")
  public BigDecimal getLimiteSemanal() {
    return limiteSemanal;
  }
  public void setLimiteSemanal(BigDecimal limiteSemanal) {
    this.limiteSemanal = limiteSemanal;
  }

  
  /**
   * Valor do limite di\u00E1rio
   **/
  public ControleLimitesCartaoPersist limiteDiario(BigDecimal limiteDiario) {
    this.limiteDiario = limiteDiario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor do limite di\u00E1rio")
  @JsonProperty("limiteDiario")
  public BigDecimal getLimiteDiario() {
    return limiteDiario;
  }
  public void setLimiteDiario(BigDecimal limiteDiario) {
    this.limiteDiario = limiteDiario;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControleLimitesCartaoPersist controleLimitesCartaoPersist = (ControleLimitesCartaoPersist) o;
    return Objects.equals(this.limiteMensal, controleLimitesCartaoPersist.limiteMensal) &&
        Objects.equals(this.limiteSemanal, controleLimitesCartaoPersist.limiteSemanal) &&
        Objects.equals(this.limiteDiario, controleLimitesCartaoPersist.limiteDiario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limiteMensal, limiteSemanal, limiteDiario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleLimitesCartaoPersist {\n");
    
    sb.append("    limiteMensal: ").append(toIndentedString(limiteMensal)).append("\n");
    sb.append("    limiteSemanal: ").append(toIndentedString(limiteSemanal)).append("\n");
    sb.append("    limiteDiario: ").append(toIndentedString(limiteDiario)).append("\n");
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

