package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{terminal_persist_description}}}
 **/

@ApiModel(description = "{{{terminal_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TerminalPersist   {
  
  private Long idEstabelecimento = null;
  private Boolean flagConsultaExtrato = null;
  private Boolean flagTerminalVirtual = null;

  
  /**
   * {{{terminal_persist_id_estabelecimento_value}}}
   **/
  public TerminalPersist idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{terminal_persist_id_estabelecimento_value}}}")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{terminal_persist_flag_consulta_extrato_value}}}
   **/
  public TerminalPersist flagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "{{{terminal_persist_flag_consulta_extrato_value}}}")
  @JsonProperty("flagConsultaExtrato")
  public Boolean getFlagConsultaExtrato() {
    return flagConsultaExtrato;
  }
  public void setFlagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
  }

  
  /**
   * {{{terminal_persist_flag_terminal_virtual_value}}}
   **/
  public TerminalPersist flagTerminalVirtual(Boolean flagTerminalVirtual) {
    this.flagTerminalVirtual = flagTerminalVirtual;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "{{{terminal_persist_flag_terminal_virtual_value}}}")
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
    TerminalPersist terminalPersist = (TerminalPersist) o;
    return Objects.equals(this.idEstabelecimento, terminalPersist.idEstabelecimento) &&
        Objects.equals(this.flagConsultaExtrato, terminalPersist.flagConsultaExtrato) &&
        Objects.equals(this.flagTerminalVirtual, terminalPersist.flagTerminalVirtual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEstabelecimento, flagConsultaExtrato, flagTerminalVirtual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalPersist {\n");
    
    sb.append("    idEstabelecimento: ").append(toIndentedString(idEstabelecimento)).append("\n");
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

