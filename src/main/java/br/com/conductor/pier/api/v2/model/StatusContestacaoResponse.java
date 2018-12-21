package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Return of the contested status list
 **/

@ApiModel(description = "Return of the contested status list")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class StatusContestacaoResponse   {
  
  private Long idStatusContestacao = null;
  private String descricao = null;

  
  /**
   * Id of status contestation
   **/
  public StatusContestacaoResponse idStatusContestacao(Long idStatusContestacao) {
    this.idStatusContestacao = idStatusContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of status contestation")
  @JsonProperty("idStatusContestacao")
  public Long getIdStatusContestacao() {
    return idStatusContestacao;
  }
  public void setIdStatusContestacao(Long idStatusContestacao) {
    this.idStatusContestacao = idStatusContestacao;
  }

  
  /**
   * Contested Status description
   **/
  public StatusContestacaoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contested Status description")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusContestacaoResponse statusContestacaoResponse = (StatusContestacaoResponse) o;
    return Objects.equals(this.idStatusContestacao, statusContestacaoResponse.idStatusContestacao) &&
        Objects.equals(this.descricao, statusContestacaoResponse.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idStatusContestacao, descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusContestacaoResponse {\n");
    
    sb.append("    idStatusContestacao: ").append(toIndentedString(idStatusContestacao)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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

