package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Response of the inclusion of the record of the proposal for integration
 **/

@ApiModel(description = "Response of the inclusion of the record of the proposal for integration")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class IntegracaoEmissorPropostaResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Integer status = null;
  private String observacao = null;
  private Boolean flagSelecionado = null;
  private Long idPropostaExterna = null;
  private String dataEvento = null;

  
  /**
   * Identification code
   **/
  public IntegracaoEmissorPropostaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification code")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Account ID code
   **/
  public IntegracaoEmissorPropostaResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Account ID code")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Registration status
   **/
  public IntegracaoEmissorPropostaResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Registration status")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Record notice
   **/
  public IntegracaoEmissorPropostaResponse observacao(String observacao) {
    this.observacao = observacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Record notice")
  @JsonProperty("observacao")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * Flag selected
   **/
  public IntegracaoEmissorPropostaResponse flagSelecionado(Boolean flagSelecionado) {
    this.flagSelecionado = flagSelecionado;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag selected")
  @JsonProperty("flagSelecionado")
  public Boolean getFlagSelecionado() {
    return flagSelecionado;
  }
  public void setFlagSelecionado(Boolean flagSelecionado) {
    this.flagSelecionado = flagSelecionado;
  }

  
  /**
   * Identification code of the external proposal
   **/
  public IntegracaoEmissorPropostaResponse idPropostaExterna(Long idPropostaExterna) {
    this.idPropostaExterna = idPropostaExterna;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification code of the external proposal")
  @JsonProperty("idPropostaExterna")
  public Long getIdPropostaExterna() {
    return idPropostaExterna;
  }
  public void setIdPropostaExterna(Long idPropostaExterna) {
    this.idPropostaExterna = idPropostaExterna;
  }

  
  /**
   * Date of the event
   **/
  public IntegracaoEmissorPropostaResponse dataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of the event")
  @JsonProperty("dataEvento")
  public String getDataEvento() {
    return dataEvento;
  }
  public void setDataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegracaoEmissorPropostaResponse integracaoEmissorPropostaResponse = (IntegracaoEmissorPropostaResponse) o;
    return Objects.equals(this.id, integracaoEmissorPropostaResponse.id) &&
        Objects.equals(this.idConta, integracaoEmissorPropostaResponse.idConta) &&
        Objects.equals(this.status, integracaoEmissorPropostaResponse.status) &&
        Objects.equals(this.observacao, integracaoEmissorPropostaResponse.observacao) &&
        Objects.equals(this.flagSelecionado, integracaoEmissorPropostaResponse.flagSelecionado) &&
        Objects.equals(this.idPropostaExterna, integracaoEmissorPropostaResponse.idPropostaExterna) &&
        Objects.equals(this.dataEvento, integracaoEmissorPropostaResponse.dataEvento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, status, observacao, flagSelecionado, idPropostaExterna, dataEvento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegracaoEmissorPropostaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    observacao: ").append(toIndentedString(observacao)).append("\n");
    sb.append("    flagSelecionado: ").append(toIndentedString(flagSelecionado)).append("\n");
    sb.append("    idPropostaExterna: ").append(toIndentedString(idPropostaExterna)).append("\n");
    sb.append("    dataEvento: ").append(toIndentedString(dataEvento)).append("\n");
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

