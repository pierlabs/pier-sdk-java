package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de resposta do recurso de quita\u00E7\u00E3o anual de d\u00E9bitos
 **/

@ApiModel(description = "Objeto de resposta do recurso de quita\u00E7\u00E3o anual de d\u00E9bitos")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class QuitacaoAnualResponse   {
  
  private Long idConta = null;
  private Boolean flagQuite = null;

  
  /**
   * Identificador da conta
   **/
  public QuitacaoAnualResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Flag que representa o estado de quita\u00E7\u00E3o do portador
   **/
  public QuitacaoAnualResponse flagQuite(Boolean flagQuite) {
    this.flagQuite = flagQuite;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que representa o estado de quita\u00E7\u00E3o do portador")
  @JsonProperty("flagQuite")
  public Boolean getFlagQuite() {
    return flagQuite;
  }
  public void setFlagQuite(Boolean flagQuite) {
    this.flagQuite = flagQuite;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuitacaoAnualResponse quitacaoAnualResponse = (QuitacaoAnualResponse) o;
    return Objects.equals(this.idConta, quitacaoAnualResponse.idConta) &&
        Objects.equals(this.flagQuite, quitacaoAnualResponse.flagQuite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, flagQuite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuitacaoAnualResponse {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    flagQuite: ").append(toIndentedString(flagQuite)).append("\n");
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

