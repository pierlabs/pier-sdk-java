package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * TerminalUpdate
 **/

@ApiModel(description = "TerminalUpdate")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TerminalUpdate   {
  
  private Boolean flagConsultaExtrato = null;
  private Boolean flagTerminalVirtual = null;

  
  /**
   * Flag indicando se o terminal permite consultar extrato, sendo: (true: Sim), (false: N\u00E3o)).
   **/
  public TerminalUpdate flagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "Flag indicando se o terminal permite consultar extrato, sendo: (true: Sim), (false: N\u00E3o)).")
  @JsonProperty("flagConsultaExtrato")
  public Boolean getFlagConsultaExtrato() {
    return flagConsultaExtrato;
  }
  public void setFlagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
  }

  
  /**
   * Flag indicando se o terminal \u00E9 f\u00EDsico ou virtual, sendo: (true: Sim), (false: N\u00E3o)).
   **/
  public TerminalUpdate flagTerminalVirtual(Boolean flagTerminalVirtual) {
    this.flagTerminalVirtual = flagTerminalVirtual;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "Flag indicando se o terminal \u00E9 f\u00EDsico ou virtual, sendo: (true: Sim), (false: N\u00E3o)).")
  @JsonProperty("flagTerminalVirtual")
  public Boolean getFlagTerminalVirtual() {
    return flagTerminalVirtual;
  }
  public void setFlagTerminalVirtual(Boolean flagTerminalVirtual) {
    this.flagTerminalVirtual = flagTerminalVirtual;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalUpdate terminalUpdate = (TerminalUpdate) o;
    return Objects.equals(this.flagConsultaExtrato, terminalUpdate.flagConsultaExtrato) &&
        Objects.equals(this.flagTerminalVirtual, terminalUpdate.flagTerminalVirtual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagConsultaExtrato, flagTerminalVirtual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalUpdate {\n");
    
    sb.append("    flagConsultaExtrato: ").append(toIndentedString(flagConsultaExtrato)).append("\n");
    sb.append("    flagTerminalVirtual: ").append(toIndentedString(flagTerminalVirtual)).append("\n");
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

