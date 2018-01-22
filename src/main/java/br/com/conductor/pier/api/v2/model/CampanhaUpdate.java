package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.PlanoCampanhaUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Objeto Campanha
 **/

@ApiModel(description = "Objeto Campanha")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CampanhaUpdate   {
  
  private String nome = null;
  private Long idTipoCampanha = null;
  private List<PlanoCampanhaUpdate> planosCampanhas = new ArrayList<PlanoCampanhaUpdate>();

  
  /**
   * Nome da campanha
   **/
  public CampanhaUpdate nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da campanha")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do tipo da campanha.
   **/
  public CampanhaUpdate idTipoCampanha(Long idTipoCampanha) {
    this.idTipoCampanha = idTipoCampanha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do tipo da campanha.")
  @JsonProperty("idTipoCampanha")
  public Long getIdTipoCampanha() {
    return idTipoCampanha;
  }
  public void setIdTipoCampanha(Long idTipoCampanha) {
    this.idTipoCampanha = idTipoCampanha;
  }

  
  /**
   * Lista com os planos de campanha
   **/
  public CampanhaUpdate planosCampanhas(List<PlanoCampanhaUpdate> planosCampanhas) {
    this.planosCampanhas = planosCampanhas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista com os planos de campanha")
  @JsonProperty("planosCampanhas")
  public List<PlanoCampanhaUpdate> getPlanosCampanhas() {
    return planosCampanhas;
  }
  public void setPlanosCampanhas(List<PlanoCampanhaUpdate> planosCampanhas) {
    this.planosCampanhas = planosCampanhas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampanhaUpdate campanhaUpdate = (CampanhaUpdate) o;
    return Objects.equals(this.nome, campanhaUpdate.nome) &&
        Objects.equals(this.idTipoCampanha, campanhaUpdate.idTipoCampanha) &&
        Objects.equals(this.planosCampanhas, campanhaUpdate.planosCampanhas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, idTipoCampanha, planosCampanhas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampanhaUpdate {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    idTipoCampanha: ").append(toIndentedString(idTipoCampanha)).append("\n");
    sb.append("    planosCampanhas: ").append(toIndentedString(planosCampanhas)).append("\n");
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

