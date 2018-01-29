package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Hist\u00C3\u00B3rico Impress\u00C3\u00A3o Cart\u00C3\u00A3o
 **/

@ApiModel(description = "Hist\u00C3\u00B3rico Impress\u00C3\u00A3o Cart\u00C3\u00A3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class HistoricoImpressaoCartaoResponse   {
  
  private Long id = null;
  private Long idCartao = null;
  private Long idStatusImpressaoCartao = null;
  private String mensagemHistorico = null;
  private String dataHistorico = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Hist\u00C3\u00B3rico de Impress\u00C3\u00A3o Avulsa de Cart\u00C3\u00B5es (id).
   **/
  public HistoricoImpressaoCartaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Hist\u00C3\u00B3rico de Impress\u00C3\u00A3o Avulsa de Cart\u00C3\u00B5es (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   **/
  public HistoricoImpressaoCartaoResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   **/
  public HistoricoImpressaoCartaoResponse idStatusImpressaoCartao(Long idStatusImpressaoCartao) {
    this.idStatusImpressaoCartao = idStatusImpressaoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o (id).")
  @JsonProperty("idStatusImpressaoCartao")
  public Long getIdStatusImpressaoCartao() {
    return idStatusImpressaoCartao;
  }
  public void setIdStatusImpressaoCartao(Long idStatusImpressaoCartao) {
    this.idStatusImpressaoCartao = idStatusImpressaoCartao;
  }

  
  /**
   * Apresenta uma mensagem que descreve a etapa do processo de impress\u00C3\u00A3o do cart\u00C3\u00A3o que fora realizado.
   **/
  public HistoricoImpressaoCartaoResponse mensagemHistorico(String mensagemHistorico) {
    this.mensagemHistorico = mensagemHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta uma mensagem que descreve a etapa do processo de impress\u00C3\u00A3o do cart\u00C3\u00A3o que fora realizado.")
  @JsonProperty("mensagemHistorico")
  public String getMensagemHistorico() {
    return mensagemHistorico;
  }
  public void setMensagemHistorico(String mensagemHistorico) {
    this.mensagemHistorico = mensagemHistorico;
  }

  
  /**
   * Apresenta a data que o registro de Hist\u00C3\u00B3rico de Impress\u00C3\u00A3o de um Cart\u00C3\u00A3o fora inserido.
   **/
  public HistoricoImpressaoCartaoResponse dataHistorico(String dataHistorico) {
    this.dataHistorico = dataHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Apresenta a data que o registro de Hist\u00C3\u00B3rico de Impress\u00C3\u00A3o de um Cart\u00C3\u00A3o fora inserido.")
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

