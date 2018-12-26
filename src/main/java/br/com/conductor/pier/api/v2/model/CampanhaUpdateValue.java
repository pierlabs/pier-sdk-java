package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.PlanoCampanhaUpdateValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{campanha_update_description}}}
 **/

@ApiModel(description = "{{{campanha_update_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CampanhaUpdateValue   {
  
  private String nome = null;
  private Long idTipoCampanha = null;
  private List<PlanoCampanhaUpdateValue> planosCampanhas = new ArrayList<PlanoCampanhaUpdateValue>();

  
  /**
   * {{{campanha_update_nome_value}}}
   **/
  public CampanhaUpdateValue nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{campanha_update_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{campanha_update_id_tipo_campanha_value}}}
   **/
  public CampanhaUpdateValue idTipoCampanha(Long idTipoCampanha) {
    this.idTipoCampanha = idTipoCampanha;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{campanha_update_id_tipo_campanha_value}}}")
  @JsonProperty("idTipoCampanha")
  public Long getIdTipoCampanha() {
    return idTipoCampanha;
  }
  public void setIdTipoCampanha(Long idTipoCampanha) {
    this.idTipoCampanha = idTipoCampanha;
  }

  
  /**
   * {{{campanha_update_planos_campanhas_value}}}
   **/
  public CampanhaUpdateValue planosCampanhas(List<PlanoCampanhaUpdateValue> planosCampanhas) {
    this.planosCampanhas = planosCampanhas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{campanha_update_planos_campanhas_value}}}")
  @JsonProperty("planosCampanhas")
  public List<PlanoCampanhaUpdateValue> getPlanosCampanhas() {
    return planosCampanhas;
  }
  public void setPlanosCampanhas(List<PlanoCampanhaUpdateValue> planosCampanhas) {
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
    CampanhaUpdateValue campanhaUpdateValue = (CampanhaUpdateValue) o;
    return Objects.equals(this.nome, campanhaUpdateValue.nome) &&
        Objects.equals(this.idTipoCampanha, campanhaUpdateValue.idTipoCampanha) &&
        Objects.equals(this.planosCampanhas, campanhaUpdateValue.planosCampanhas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, idTipoCampanha, planosCampanhas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampanhaUpdateValue {\n");
    
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

