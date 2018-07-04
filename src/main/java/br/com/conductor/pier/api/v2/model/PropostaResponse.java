package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{proposta_response_description}}}
 **/

@ApiModel(description = "{{{proposta_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PropostaResponse   {
  
  private Long id = null;
  private Integer status = null;
  private String dataCadastramento = null;

  
  /**
   * {{{proposta_response_id_value}}}
   **/
  public PropostaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{proposta_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{proposta_response_status_value}}}
   **/
  public PropostaResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{proposta_response_status_value}}}")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {{{proposta_response_data_cadastramento_value}}}
   **/
  public PropostaResponse dataCadastramento(String dataCadastramento) {
    this.dataCadastramento = dataCadastramento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{proposta_response_data_cadastramento_value}}}")
  @JsonProperty("dataCadastramento")
  public String getDataCadastramento() {
    return dataCadastramento;
  }
  public void setDataCadastramento(String dataCadastramento) {
    this.dataCadastramento = dataCadastramento;
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
        Objects.equals(this.dataCadastramento, propostaResponse.dataCadastramento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, dataCadastramento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropostaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataCadastramento: ").append(toIndentedString(dataCadastramento)).append("\n");
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



