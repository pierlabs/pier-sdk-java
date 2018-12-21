package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representation of the proposal status service response
 **/

@ApiModel(description = "Representation of the proposal status service response")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class StatusPropostaResponse   {
  
  private Long id = null;
  private Integer status = null;
  private String descricao = null;
  private Boolean flagPermiteAlteracao = null;

  
  /**
   * Proposal Identification Status Code (id)
   **/
  public StatusPropostaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Proposal Identification Status Code (id)")
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
  public StatusPropostaResponse status(Integer status) {
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
   * Description of the proposal
   **/
  public StatusPropostaResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the proposal")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag that allows you to change the status of the proposal
   **/
  public StatusPropostaResponse flagPermiteAlteracao(Boolean flagPermiteAlteracao) {
    this.flagPermiteAlteracao = flagPermiteAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag that allows you to change the status of the proposal")
  @JsonProperty("flagPermiteAlteracao")
  public Boolean getFlagPermiteAlteracao() {
    return flagPermiteAlteracao;
  }
  public void setFlagPermiteAlteracao(Boolean flagPermiteAlteracao) {
    this.flagPermiteAlteracao = flagPermiteAlteracao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusPropostaResponse statusPropostaResponse = (StatusPropostaResponse) o;
    return Objects.equals(this.id, statusPropostaResponse.id) &&
        Objects.equals(this.status, statusPropostaResponse.status) &&
        Objects.equals(this.descricao, statusPropostaResponse.descricao) &&
        Objects.equals(this.flagPermiteAlteracao, statusPropostaResponse.flagPermiteAlteracao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, descricao, flagPermiteAlteracao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusPropostaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    flagPermiteAlteracao: ").append(toIndentedString(flagPermiteAlteracao)).append("\n");
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

