package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{plano_campanha_response_description}}}
 **/

@ApiModel(description = "{{{plano_campanha_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoCampanhaResponse   {
  
  private Long id = null;
  private Integer parcelas = null;
  private BigDecimal taxa = null;
  private String usuario = null;

  
  /**
   * {{{plano_campanha_response_id_value}}}
   **/
  public PlanoCampanhaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_campanha_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{plano_campanha_response_parcelas_value}}}
   **/
  public PlanoCampanhaResponse parcelas(Integer parcelas) {
    this.parcelas = parcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_campanha_response_parcelas_value}}}")
  @JsonProperty("parcelas")
  public Integer getParcelas() {
    return parcelas;
  }
  public void setParcelas(Integer parcelas) {
    this.parcelas = parcelas;
  }

  
  /**
   * {{{plano_campanha_response_taxa_value}}}
   **/
  public PlanoCampanhaResponse taxa(BigDecimal taxa) {
    this.taxa = taxa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_campanha_response_taxa_value}}}")
  @JsonProperty("taxa")
  public BigDecimal getTaxa() {
    return taxa;
  }
  public void setTaxa(BigDecimal taxa) {
    this.taxa = taxa;
  }

  
  /**
   * {{{plano_campanha_response_usuario_value}}}
   **/
  public PlanoCampanhaResponse usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_campanha_response_usuario_value}}}")
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
    PlanoCampanhaResponse planoCampanhaResponse = (PlanoCampanhaResponse) o;
    return Objects.equals(this.id, planoCampanhaResponse.id) &&
        Objects.equals(this.parcelas, planoCampanhaResponse.parcelas) &&
        Objects.equals(this.taxa, planoCampanhaResponse.taxa) &&
        Objects.equals(this.usuario, planoCampanhaResponse.usuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parcelas, taxa, usuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoCampanhaResponse {\n");
    
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



