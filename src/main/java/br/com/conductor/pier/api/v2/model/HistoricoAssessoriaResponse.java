package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o da resposta do {@link HistoricoAssessoriaResponse}
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta do {@link HistoricoAssessoriaResponse}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class HistoricoAssessoriaResponse   {
  
  private String dataHoraHistorico = null;
  private String tipoHistorico = null;
  private String nomeAssessoria = null;

  
  /**
   * Apresenta a data e hora do hist\u00F3rico
   **/
  public HistoricoAssessoriaResponse dataHoraHistorico(String dataHoraHistorico) {
    this.dataHoraHistorico = dataHoraHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data e hora do hist\u00F3rico")
  @JsonProperty("dataHoraHistorico")
  public String getDataHoraHistorico() {
    return dataHoraHistorico;
  }
  public void setDataHoraHistorico(String dataHoraHistorico) {
    this.dataHoraHistorico = dataHoraHistorico;
  }

  
  /**
   * Apresenta o tipo do hist\u00F3rico podendo ser ENTRADA ou SAIDA
   **/
  public HistoricoAssessoriaResponse tipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o tipo do hist\u00F3rico podendo ser ENTRADA ou SAIDA")
  @JsonProperty("tipoHistorico")
  public String getTipoHistorico() {
    return tipoHistorico;
  }
  public void setTipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
  }

  
  /**
   * Apresenta o nome da Assessoria de Cobran\u00E7a relacionada ao hist\u00F3rico
   **/
  public HistoricoAssessoriaResponse nomeAssessoria(String nomeAssessoria) {
    this.nomeAssessoria = nomeAssessoria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome da Assessoria de Cobran\u00E7a relacionada ao hist\u00F3rico")
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

