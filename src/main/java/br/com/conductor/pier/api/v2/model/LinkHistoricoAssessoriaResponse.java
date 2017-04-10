package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do {@link HistoricoAssessoriaResponse}
 **/

@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do {@link HistoricoAssessoriaResponse}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class LinkHistoricoAssessoriaResponse   {
  
  private Date dataHoraHistorico = null;
  private String tipoHistorico = null;
  private String nomeAssessoria = null;

  
  /**
   * Apresenta a data e hora do hist\u00C3\u00B3rico
   **/
  public LinkHistoricoAssessoriaResponse dataHoraHistorico(Date dataHoraHistorico) {
    this.dataHoraHistorico = dataHoraHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data e hora do hist\u00C3\u00B3rico")
  @JsonProperty("dataHoraHistorico")
  public Date getDataHoraHistorico() {
    return dataHoraHistorico;
  }
  public void setDataHoraHistorico(Date dataHoraHistorico) {
    this.dataHoraHistorico = dataHoraHistorico;
  }

  
  /**
   * Apresenta o tipo do hist\u00C3\u00B3rico podendo ser ENTRADA ou SAIDA
   **/
  public LinkHistoricoAssessoriaResponse tipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o tipo do hist\u00C3\u00B3rico podendo ser ENTRADA ou SAIDA")
  @JsonProperty("tipoHistorico")
  public String getTipoHistorico() {
    return tipoHistorico;
  }
  public void setTipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
  }

  
  /**
   * Apresenta o nome da Assessoria de Cobran\u00C3\u00A7a relacionada ao hist\u00C3\u00B3rico
   **/
  public LinkHistoricoAssessoriaResponse nomeAssessoria(String nomeAssessoria) {
    this.nomeAssessoria = nomeAssessoria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta o nome da Assessoria de Cobran\u00C3\u00A7a relacionada ao hist\u00C3\u00B3rico")
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
    LinkHistoricoAssessoriaResponse linkHistoricoAssessoriaResponse = (LinkHistoricoAssessoriaResponse) o;
    return Objects.equals(this.dataHoraHistorico, linkHistoricoAssessoriaResponse.dataHoraHistorico) &&
        Objects.equals(this.tipoHistorico, linkHistoricoAssessoriaResponse.tipoHistorico) &&
        Objects.equals(this.nomeAssessoria, linkHistoricoAssessoriaResponse.nomeAssessoria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataHoraHistorico, tipoHistorico, nomeAssessoria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkHistoricoAssessoriaResponse {\n");
    
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



