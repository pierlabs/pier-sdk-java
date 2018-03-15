package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Objeto PlanoCampanha
 **/

@ApiModel(description = "Objeto PlanoCampanha")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoCampanhaUpdate   {
  
  private Long id = null;
  private Integer parcelas = null;
  private BigDecimal taxa = null;
  private String usuario = null;

  
  /**
   * C\u00F3digo identificador do plano campanha
   **/
  public PlanoCampanhaUpdate id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do plano campanha")
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
  public PlanoCampanhaUpdate parcelas(Integer parcelas) {
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
  public PlanoCampanhaUpdate taxa(BigDecimal taxa) {
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

  
  /**
   * Nome do usu\u00E1rio
   **/
  public PlanoCampanhaUpdate usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do usu\u00E1rio")
  @JsonProperty("usuario")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanoCampanhaUpdate planoCampanhaUpdate = (PlanoCampanhaUpdate) o;
    return Objects.equals(this.id, planoCampanhaUpdate.id) &&
        Objects.equals(this.parcelas, planoCampanhaUpdate.parcelas) &&
        Objects.equals(this.taxa, planoCampanhaUpdate.taxa) &&
        Objects.equals(this.usuario, planoCampanhaUpdate.usuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parcelas, taxa, usuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoCampanhaUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parcelas: ").append(toIndentedString(parcelas)).append("\n");
    sb.append("    taxa: ").append(toIndentedString(taxa)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
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

