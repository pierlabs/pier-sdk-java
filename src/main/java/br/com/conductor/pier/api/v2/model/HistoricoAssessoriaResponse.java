package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Response Representation of the {@link HistoricAdvisoryResponse}
 **/

@ApiModel(description = "Response Representation of the {@link HistoricAdvisoryResponse}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class HistoricoAssessoriaResponse   {
  
  private String dataHoraHistorico = null;
  private String tipoHistorico = null;
  private String nomeAssessoria = null;

  
  /**
   * Show the date and time of the historic
   **/
  public HistoricoAssessoriaResponse dataHoraHistorico(String dataHoraHistorico) {
    this.dataHoraHistorico = dataHoraHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the date and time of the historic")
  @JsonProperty("dataHoraHistorico")
  public String getDataHoraHistorico() {
    return dataHoraHistorico;
  }
  public void setDataHoraHistorico(String dataHoraHistorico) {
    this.dataHoraHistorico = dataHoraHistorico;
  }

  
  /**
   * Show the type of historic can be input or output
   **/
  public HistoricoAssessoriaResponse tipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the type of historic can be input or output")
  @JsonProperty("tipoHistorico")
  public String getTipoHistorico() {
    return tipoHistorico;
  }
  public void setTipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
  }

  
  /**
   * Show the name of the Collection Advisory related to the historic
   **/
  public HistoricoAssessoriaResponse nomeAssessoria(String nomeAssessoria) {
    this.nomeAssessoria = nomeAssessoria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the name of the Collection Advisory related to the historic")
  @JsonProperty("nomeAssessoria")
  public String getNomeAssessoria() {
    return nomeAssessoria;
  }
  public void setNomeAssessoria(String nomeAssessoria) {
    this.nomeAssessoria = nomeAssessoria;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricoAssessoriaResponse historicoAssessoriaResponse = (HistoricoAssessoriaResponse) o;
    return Objects.equals(this.dataHoraHistorico, historicoAssessoriaResponse.dataHoraHistorico) &&
        Objects.equals(this.tipoHistorico, historicoAssessoriaResponse.tipoHistorico) &&
        Objects.equals(this.nomeAssessoria, historicoAssessoriaResponse.nomeAssessoria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataHoraHistorico, tipoHistorico, nomeAssessoria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoAssessoriaResponse {\n");
    
    sb.append("    dataHoraHistorico: ").append(toIndentedString(dataHoraHistorico)).append("\n");
    sb.append("    tipoHistorico: ").append(toIndentedString(tipoHistorico)).append("\n");
    sb.append("    nomeAssessoria: ").append(toIndentedString(nomeAssessoria)).append("\n");
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

