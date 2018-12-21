package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Histotic Card Printing
 **/

@ApiModel(description = "Histotic Card Printing")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class HistoricoImpressaoCartaoResponse   {
  
  private Long id = null;
  private Long idCartao = null;
  private Long idStatusImpressaoCartao = null;
  private String mensagemHistorico = null;
  private String dataHistorico = null;

  
  /**
   * Identification Code of the Printing Card Historic (id)
   **/
  public HistoricoImpressaoCartaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identification Code of the Printing Card Historic (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Card (id)
   **/
  public HistoricoImpressaoCartaoResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identification Code of the Card (id)")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Identification Code of the Printing Card Status (id)
   **/
  public HistoricoImpressaoCartaoResponse idStatusImpressaoCartao(Long idStatusImpressaoCartao) {
    this.idStatusImpressaoCartao = idStatusImpressaoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identification Code of the Printing Card Status (id)")
  @JsonProperty("idStatusImpressaoCartao")
  public Long getIdStatusImpressaoCartao() {
    return idStatusImpressaoCartao;
  }
  public void setIdStatusImpressaoCartao(Long idStatusImpressaoCartao) {
    this.idStatusImpressaoCartao = idStatusImpressaoCartao;
  }

  
  /**
   * Show a message that describes the stage of the printing card process that was made
   **/
  public HistoricoImpressaoCartaoResponse mensagemHistorico(String mensagemHistorico) {
    this.mensagemHistorico = mensagemHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show a message that describes the stage of the printing card process that was made")
  @JsonProperty("mensagemHistorico")
  public String getMensagemHistorico() {
    return mensagemHistorico;
  }
  public void setMensagemHistorico(String mensagemHistorico) {
    this.mensagemHistorico = mensagemHistorico;
  }

  
  /**
   * Show the date that the historic register of the Printing of a Card was inserted
   **/
  public HistoricoImpressaoCartaoResponse dataHistorico(String dataHistorico) {
    this.dataHistorico = dataHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show the date that the historic register of the Printing of a Card was inserted")
  @JsonProperty("dataHistorico")
  public String getDataHistorico() {
    return dataHistorico;
  }
  public void setDataHistorico(String dataHistorico) {
    this.dataHistorico = dataHistorico;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricoImpressaoCartaoResponse historicoImpressaoCartaoResponse = (HistoricoImpressaoCartaoResponse) o;
    return Objects.equals(this.id, historicoImpressaoCartaoResponse.id) &&
        Objects.equals(this.idCartao, historicoImpressaoCartaoResponse.idCartao) &&
        Objects.equals(this.idStatusImpressaoCartao, historicoImpressaoCartaoResponse.idStatusImpressaoCartao) &&
        Objects.equals(this.mensagemHistorico, historicoImpressaoCartaoResponse.mensagemHistorico) &&
        Objects.equals(this.dataHistorico, historicoImpressaoCartaoResponse.dataHistorico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idCartao, idStatusImpressaoCartao, mensagemHistorico, dataHistorico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoImpressaoCartaoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idStatusImpressaoCartao: ").append(toIndentedString(idStatusImpressaoCartao)).append("\n");
    sb.append("    mensagemHistorico: ").append(toIndentedString(mensagemHistorico)).append("\n");
    sb.append("    dataHistorico: ").append(toIndentedString(dataHistorico)).append("\n");
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

