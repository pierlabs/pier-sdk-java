package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{historico_assessoria_response_description}}}
 **/

@ApiModel(description = "{{{historico_assessoria_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class HistoricoAssessoriaResponse   {
  
  private String dataHoraHistorico = null;
  private String tipoHistorico = null;
  private String nomeAssessoria = null;

  
  /**
   * {{{historico_assessoria_response_data_hora_historico_value}}}
   **/
  public HistoricoAssessoriaResponse dataHoraHistorico(String dataHoraHistorico) {
    this.dataHoraHistorico = dataHoraHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{historico_assessoria_response_data_hora_historico_value}}}")
  @JsonProperty("dataHoraHistorico")
  public String getDataHoraHistorico() {
    return dataHoraHistorico;
  }
  public void setDataHoraHistorico(String dataHoraHistorico) {
    this.dataHoraHistorico = dataHoraHistorico;
  }

  
  /**
   * {{{historico_assessoria_response_tipo_historico_value}}}
   **/
  public HistoricoAssessoriaResponse tipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{historico_assessoria_response_tipo_historico_value}}}")
  @JsonProperty("tipoHistorico")
  public String getTipoHistorico() {
    return tipoHistorico;
  }
  public void setTipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
  }

  
  /**
   * {{{historico_assessoria_response_nome_assessoria_value}}}
   **/
  public HistoricoAssessoriaResponse nomeAssessoria(String nomeAssessoria) {
    this.nomeAssessoria = nomeAssessoria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{historico_assessoria_response_nome_assessoria_value}}}")
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

