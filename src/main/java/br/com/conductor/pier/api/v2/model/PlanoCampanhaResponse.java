package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de plano de campanha
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de plano de campanha")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoCampanhaResponse   {
  
  private Long id = null;
  private Integer parcelas = null;
  private BigDecimal taxa = null;

  
  /**
   * Identificador do plano de campanha
   **/
  public PlanoCampanhaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do plano de campanha")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Quantidade de parcelas
   **/
  public PlanoCampanhaResponse parcelas(Integer parcelas) {
    this.parcelas = parcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade de parcelas")
  @JsonProperty("parcelas")
  public Integer getParcelas() {
    return parcelas;
  }
  public void setParcelas(Integer parcelas) {
    this.parcelas = parcelas;
  }

  
  /**
   * Taxa de juros
   **/
  public PlanoCampanhaResponse taxa(BigDecimal taxa) {
    this.taxa = taxa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Taxa de juros")
  @JsonProperty("taxa")
  public BigDecimal getTaxa() {
    return taxa;
  }
  public void setTaxa(BigDecimal taxa) {
    this.taxa = taxa;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanoCampanhaResponse planoCampanhaResponse = (PlanoCampanhaResponse) o;
    return Objects.equals(this.id, planoCampanhaResponse.id) &&
        Objects.equals(this.parcelas, planoCampanhaResponse.parcelas) &&
        Objects.equals(this.taxa, planoCampanhaResponse.taxa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parcelas, taxa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoCampanhaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parcelas: ").append(toIndentedString(parcelas)).append("\n");
    sb.append("    taxa: ").append(toIndentedString(taxa)).append("\n");
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



