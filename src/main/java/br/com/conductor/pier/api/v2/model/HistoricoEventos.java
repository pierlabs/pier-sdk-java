package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do objeto que abstrai o hist\u00C3\u00B3rico de eventos
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do objeto que abstrai o hist\u00C3\u00B3rico de eventos")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class HistoricoEventos   {
  
  private Long idHistorico = null;
  private String dataHistorico = null;
  private String tipoHistorico = null;
  private String valorAnterior = null;
  private String valorAtribuido = null;

  
  /**
   * C\u00C3\u00B3digo identificador do evento
   **/
  public HistoricoEventos idHistorico(Long idHistorico) {
    this.idHistorico = idHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo identificador do evento")
  @JsonProperty("idHistorico")
  public Long getIdHistorico() {
    return idHistorico;
  }
  public void setIdHistorico(Long idHistorico) {
    this.idHistorico = idHistorico;
  }

  
  /**
   * Data do evento
   **/
  public HistoricoEventos dataHistorico(String dataHistorico) {
    this.dataHistorico = dataHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", required = true, value = "Data do evento")
  @JsonProperty("dataHistorico")
  public String getDataHistorico() {
    return dataHistorico;
  }
  public void setDataHistorico(String dataHistorico) {
    this.dataHistorico = dataHistorico;
  }

  
  /**
   * Nome do campo alterado
   **/
  public HistoricoEventos tipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Nome do campo alterado")
  @JsonProperty("tipoHistorico")
  public String getTipoHistorico() {
    return tipoHistorico;
  }
  public void setTipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
  }

  
  /**
   * Valor anterior a modifica\u00C3\u00A7\u00C3\u00A3o
   **/
  public HistoricoEventos valorAnterior(String valorAnterior) {
    this.valorAnterior = valorAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor anterior a modifica\u00C3\u00A7\u00C3\u00A3o")
  @JsonProperty("valorAnterior")
  public String getValorAnterior() {
    return valorAnterior;
  }
  public void setValorAnterior(String valorAnterior) {
    this.valorAnterior = valorAnterior;
  }

  
  /**
   * Valor atribu\u00C3\u00ADdo na modifica\u00C3\u00A7\u00C3\u00A3o
   **/
  public HistoricoEventos valorAtribuido(String valorAtribuido) {
    this.valorAtribuido = valorAtribuido;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor atribu\u00C3\u00ADdo na modifica\u00C3\u00A7\u00C3\u00A3o")
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
    HistoricoEventos historicoEventos = (HistoricoEventos) o;
    return Objects.equals(this.idHistorico, historicoEventos.idHistorico) &&
        Objects.equals(this.dataHistorico, historicoEventos.dataHistorico) &&
        Objects.equals(this.tipoHistorico, historicoEventos.tipoHistorico) &&
        Objects.equals(this.valorAnterior, historicoEventos.valorAnterior) &&
        Objects.equals(this.valorAtribuido, historicoEventos.valorAtribuido);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idHistorico, dataHistorico, tipoHistorico, valorAnterior, valorAtribuido);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoEventos {\n");
    
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



