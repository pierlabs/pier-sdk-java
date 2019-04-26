package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.*;



/**
 * Objeto que representa um tipo de opera\u00E7\u00E3o banc\u00E1ria
 **/

@ApiModel(description = "Objeto que representa um tipo de opera\u00E7\u00E3o banc\u00E1ria")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoOperacaoBancariaResponse   {
  
  private String descricao = null;
  private LocalTime horarioMaximo = null;
  private LocalTime horarioMinimo = null;
  private Long id = null;
  private Long idTipoTemplate = null;

  
  /**
   * Descri\u00E7\u00E3o do tipo de opera\u00E7\u00E3o banc\u00E1ria
   **/
  public TipoOperacaoBancariaResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do tipo de opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Hor\u00E1rio m\u00E1ximo que pode ser realizada uma opera\u00E7\u00E3o
   **/
  public TipoOperacaoBancariaResponse horarioMaximo(LocalTime horarioMaximo) {
    this.horarioMaximo = horarioMaximo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Hor\u00E1rio m\u00E1ximo que pode ser realizada uma opera\u00E7\u00E3o")
  @JsonProperty("horarioMaximo")
  public LocalTime getHorarioMaximo() {
    return horarioMaximo;
  }
  public void setHorarioMaximo(LocalTime horarioMaximo) {
    this.horarioMaximo = horarioMaximo;
  }

  
  /**
   * Hor\u00E1rio m\u00EDnimo que pode ser realizada uma opera\u00E7\u00E3o
   **/
  public TipoOperacaoBancariaResponse horarioMinimo(LocalTime horarioMinimo) {
    this.horarioMinimo = horarioMinimo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Hor\u00E1rio m\u00EDnimo que pode ser realizada uma opera\u00E7\u00E3o")
  @JsonProperty("horarioMinimo")
  public LocalTime getHorarioMinimo() {
    return horarioMinimo;
  }
  public void setHorarioMinimo(LocalTime horarioMinimo) {
    this.horarioMinimo = horarioMinimo;
  }

  
  /**
   * C\u00F3digo identificador do tipo de opera\u00E7\u00E3o banc\u00E1ria
   **/
  public TipoOperacaoBancariaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do tipo de opera\u00E7\u00E3o banc\u00E1ria")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador do tipo do template
   **/
  public TipoOperacaoBancariaResponse idTipoTemplate(Long idTipoTemplate) {
    this.idTipoTemplate = idTipoTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do tipo do template")
  @JsonProperty("idTipoTemplate")
  public Long getIdTipoTemplate() {
    return idTipoTemplate;
  }
  public void setIdTipoTemplate(Long idTipoTemplate) {
    this.idTipoTemplate = idTipoTemplate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoOperacaoBancariaResponse tipoOperacaoBancariaResponse = (TipoOperacaoBancariaResponse) o;
    return Objects.equals(this.descricao, tipoOperacaoBancariaResponse.descricao) &&
        Objects.equals(this.horarioMaximo, tipoOperacaoBancariaResponse.horarioMaximo) &&
        Objects.equals(this.horarioMinimo, tipoOperacaoBancariaResponse.horarioMinimo) &&
        Objects.equals(this.id, tipoOperacaoBancariaResponse.id) &&
        Objects.equals(this.idTipoTemplate, tipoOperacaoBancariaResponse.idTipoTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao, horarioMaximo, horarioMinimo, id, idTipoTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOperacaoBancariaResponse {\n");
    
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    horarioMaximo: ").append(toIndentedString(horarioMaximo)).append("\n");
    sb.append("    horarioMinimo: ").append(toIndentedString(horarioMinimo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoTemplate: ").append(toIndentedString(idTipoTemplate)).append("\n");
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

