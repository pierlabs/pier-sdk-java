package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representation of the proposal response
 **/

@ApiModel(description = "Representation of the proposal response")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PropostaResponse   {
  
  private Long id = null;
  private Integer status = null;
  private String dataCadastramento = null;
  private String dataAprovacaoNegacaoPendencia = null;

  
  /**
   * Proposal Identification Code (id)
   **/
  public PropostaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proposal Identification Code (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Proposal Status
   **/
  public PropostaResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proposal Status")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Date of registration of the proposal
   **/
  public PropostaResponse dataCadastramento(String dataCadastramento) {
    this.dataCadastramento = dataCadastramento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of registration of the proposal")
  @JsonProperty("dataCadastramento")
  public String getDataCadastramento() {
    return dataCadastramento;
  }
  public void setDataCadastramento(String dataCadastramento) {
    this.dataCadastramento = dataCadastramento;
  }

  
  /**
   * Proposal update date
   **/
  public PropostaResponse dataAprovacaoNegacaoPendencia(String dataAprovacaoNegacaoPendencia) {
    this.dataAprovacaoNegacaoPendencia = dataAprovacaoNegacaoPendencia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proposal update date")
  @JsonProperty("dataAprovacaoNegacaoPendencia")
  public String getDataAprovacaoNegacaoPendencia() {
    return dataAprovacaoNegacaoPendencia;
  }
  public void setDataAprovacaoNegacaoPendencia(String dataAprovacaoNegacaoPendencia) {
    this.dataAprovacaoNegacaoPendencia = dataAprovacaoNegacaoPendencia;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropostaResponse propostaResponse = (PropostaResponse) o;
    return Objects.equals(this.id, propostaResponse.id) &&
        Objects.equals(this.status, propostaResponse.status) &&
        Objects.equals(this.dataCadastramento, propostaResponse.dataCadastramento) &&
        Objects.equals(this.dataAprovacaoNegacaoPendencia, propostaResponse.dataAprovacaoNegacaoPendencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, dataCadastramento, dataAprovacaoNegacaoPendencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropostaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataCadastramento: ").append(toIndentedString(dataCadastramento)).append("\n");
    sb.append("    dataAprovacaoNegacaoPendencia: ").append(toIndentedString(dataAprovacaoNegacaoPendencia)).append("\n");
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

