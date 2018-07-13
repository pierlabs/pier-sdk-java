package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





/**
 * {{{plano_campanha_update_description}}}
 **/

@ApiModel(description = "{{{plano_campanha_update_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PlanoCampanhaUpdateValue   {
  
  private Long id = null;
  private Integer parcelas = null;
  private BigDecimal taxa = null;
  private String usuario = null;

  
  /**
   * {{{plano_campanha_update_id_value}}}
   **/
  public PlanoCampanhaUpdateValue id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_campanha_update_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{plano_campanha_update_parcelas_value}}}
   **/
  public PlanoCampanhaUpdateValue parcelas(Integer parcelas) {
    this.parcelas = parcelas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_campanha_update_parcelas_value}}}")
  @JsonProperty("parcelas")
  public Integer getParcelas() {
    return parcelas;
  }
  public void setParcelas(Integer parcelas) {
    this.parcelas = parcelas;
  }

  
  /**
   * {{{plano_campanha_update_taxa_value}}}
   **/
  public PlanoCampanhaUpdateValue taxa(BigDecimal taxa) {
    this.taxa = taxa;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_campanha_update_taxa_value}}}")
  @JsonProperty("taxa")
  public BigDecimal getTaxa() {
    return taxa;
  }
  public void setTaxa(BigDecimal taxa) {
    this.taxa = taxa;
  }

  
  /**
   * {{{plano_campanha_update_usuario_value}}}
   **/
  public PlanoCampanhaUpdateValue usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{plano_campanha_update_usuario_value}}}")
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
    PlanoCampanhaUpdateValue planoCampanhaUpdateValue = (PlanoCampanhaUpdateValue) o;
    return Objects.equals(this.id, planoCampanhaUpdateValue.id) &&
        Objects.equals(this.parcelas, planoCampanhaUpdateValue.parcelas) &&
        Objects.equals(this.taxa, planoCampanhaUpdateValue.taxa) &&
        Objects.equals(this.usuario, planoCampanhaUpdateValue.usuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parcelas, taxa, usuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoCampanhaUpdateValue {\n");
    
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



