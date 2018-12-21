package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representation of the object that abstract the historic of the events
 **/

@ApiModel(description = "Representation of the object that abstract the historic of the events")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class HistoricoEventosResponse   {
  
  private Long idHistorico = null;
  private String dataHistorico = null;
  private String tipoHistorico = null;
  private String valorAnterior = null;
  private String valorAtribuido = null;

  
  /**
   * Identifier Code of the event
   **/
  public HistoricoEventosResponse idHistorico(Long idHistorico) {
    this.idHistorico = idHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier Code of the event")
  @JsonProperty("idHistorico")
  public Long getIdHistorico() {
    return idHistorico;
  }
  public void setIdHistorico(Long idHistorico) {
    this.idHistorico = idHistorico;
  }

  
  /**
   * Date of the event
   **/
  public HistoricoEventosResponse dataHistorico(String dataHistorico) {
    this.dataHistorico = dataHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", required = true, value = "Date of the event")
  @JsonProperty("dataHistorico")
  public String getDataHistorico() {
    return dataHistorico;
  }
  public void setDataHistorico(String dataHistorico) {
    this.dataHistorico = dataHistorico;
  }

  
  /**
   * Name of the updated field
   **/
  public HistoricoEventosResponse tipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the updated field")
  @JsonProperty("tipoHistorico")
  public String getTipoHistorico() {
    return tipoHistorico;
  }
  public void setTipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
  }

  
  /**
   * Previous value to the modification
   **/
  public HistoricoEventosResponse valorAnterior(String valorAnterior) {
    this.valorAnterior = valorAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Previous value to the modification")
  @JsonProperty("valorAnterior")
  public String getValorAnterior() {
    return valorAnterior;
  }
  public void setValorAnterior(String valorAnterior) {
    this.valorAnterior = valorAnterior;
  }

  
  /**
   * Value attributed in the modification
   **/
  public HistoricoEventosResponse valorAtribuido(String valorAtribuido) {
    this.valorAtribuido = valorAtribuido;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value attributed in the modification")
  @JsonProperty("valorAtribuido")
  public String getValorAtribuido() {
    return valorAtribuido;
  }
  public void setValorAtribuido(String valorAtribuido) {
    this.valorAtribuido = valorAtribuido;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricoEventosResponse historicoEventosResponse = (HistoricoEventosResponse) o;
    return Objects.equals(this.idHistorico, historicoEventosResponse.idHistorico) &&
        Objects.equals(this.dataHistorico, historicoEventosResponse.dataHistorico) &&
        Objects.equals(this.tipoHistorico, historicoEventosResponse.tipoHistorico) &&
        Objects.equals(this.valorAnterior, historicoEventosResponse.valorAnterior) &&
        Objects.equals(this.valorAtribuido, historicoEventosResponse.valorAtribuido);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idHistorico, dataHistorico, tipoHistorico, valorAnterior, valorAtribuido);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoEventosResponse {\n");
    
    sb.append("    idHistorico: ").append(toIndentedString(idHistorico)).append("\n");
    sb.append("    dataHistorico: ").append(toIndentedString(dataHistorico)).append("\n");
    sb.append("    tipoHistorico: ").append(toIndentedString(tipoHistorico)).append("\n");
    sb.append("    valorAnterior: ").append(toIndentedString(valorAnterior)).append("\n");
    sb.append("    valorAtribuido: ").append(toIndentedString(valorAtribuido)).append("\n");
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

