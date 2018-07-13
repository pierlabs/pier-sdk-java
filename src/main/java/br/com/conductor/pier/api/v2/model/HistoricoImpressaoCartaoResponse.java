package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{historico_impressao_cartao_response_description}}}
 **/

@ApiModel(description = "{{{historico_impressao_cartao_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class HistoricoImpressaoCartaoResponse   {
  
  private Long id = null;
  private Long idCartao = null;
  private Long idStatusImpressaoCartao = null;
  private String mensagemHistorico = null;
  private String dataHistorico = null;

  
  /**
   * {{{historico_impressao_cartao_response_id_value}}}
   **/
  public HistoricoImpressaoCartaoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{historico_impressao_cartao_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{historico_impressao_cartao_response_id_cartao_value}}}
   **/
  public HistoricoImpressaoCartaoResponse idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{historico_impressao_cartao_response_id_cartao_value}}}")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{historico_impressao_cartao_response_id_status_impressao_cartao_value}}}
   **/
  public HistoricoImpressaoCartaoResponse idStatusImpressaoCartao(Long idStatusImpressaoCartao) {
    this.idStatusImpressaoCartao = idStatusImpressaoCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{historico_impressao_cartao_response_id_status_impressao_cartao_value}}}")
  @JsonProperty("idStatusImpressaoCartao")
  public Long getIdStatusImpressaoCartao() {
    return idStatusImpressaoCartao;
  }
  public void setIdStatusImpressaoCartao(Long idStatusImpressaoCartao) {
    this.idStatusImpressaoCartao = idStatusImpressaoCartao;
  }

  
  /**
   * {{{historico_impressao_cartao_response_mensagem_historico_value}}}
   **/
  public HistoricoImpressaoCartaoResponse mensagemHistorico(String mensagemHistorico) {
    this.mensagemHistorico = mensagemHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{historico_impressao_cartao_response_mensagem_historico_value}}}")
  @JsonProperty("mensagemHistorico")
  public String getMensagemHistorico() {
    return mensagemHistorico;
  }
  public void setMensagemHistorico(String mensagemHistorico) {
    this.mensagemHistorico = mensagemHistorico;
  }

  
  /**
   * {{{historico_impressao_cartao_response_data_historico_value}}}
   **/
  public HistoricoImpressaoCartaoResponse dataHistorico(String dataHistorico) {
    this.dataHistorico = dataHistorico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{historico_impressao_cartao_response_data_historico_value}}}")
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



