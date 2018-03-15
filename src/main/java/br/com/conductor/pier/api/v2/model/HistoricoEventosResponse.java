package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o do objeto que abstrai o hist\u00F3rico de eventos
 **/

@ApiModel(description = "Representa\u00E7\u00E3o do objeto que abstrai o hist\u00F3rico de eventos")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class HistoricoEventosResponse   {
  
  private Long idHistorico = null;
  private String dataHistorico = null;
  private String tipoHistorico = null;
  private String valorAnterior = null;
  private String valorAtribuido = null;

  
  /**
   * C\u00F3digo identificador do evento
   **/
  public HistoricoEventosResponse idHistorico(Long idHistorico) {
    this.idHistorico = idHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo identificador do evento")
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
  public HistoricoEventosResponse dataHistorico(String dataHistorico) {
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
  public HistoricoEventosResponse tipoHistorico(String tipoHistorico) {
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
   * Valor anterior a modifica\u00E7\u00E3o
   **/
  public HistoricoEventosResponse valorAnterior(String valorAnterior) {
    this.valorAnterior = valorAnterior;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Valor anterior a modifica\u00E7\u00E3o")
  @JsonProperty("valorAnterior")
  public String getValorAnterior() {
    return valorAnterior;
  }
  public void setValorAnterior(String valorAnterior) {
    this.valorAnterior = valorAnterior;
  }

  
  /**
   * Valor atribu\u00EDdo na modifica\u00E7\u00E3o
   **/
  public HistoricoEventosResponse valorAtribuido(String valorAtribuido) {
    this.valorAtribuido = valorAtribuido;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Valor atribu\u00EDdo na modifica\u00E7\u00E3o")
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

