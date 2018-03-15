package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * ObjetoTerminal
 **/

@ApiModel(description = "ObjetoTerminal")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TerminalResponse   {
  
  private Long id = null;
  private String terminal = null;
  private Long numeroEstabelecimento = null;
  private Long idEstabelecimento = null;
  private Boolean flagConsultaExtrato = null;
  private Boolean flagTerminalVirtual = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Terminal (id).
   **/
  public TerminalResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Terminal (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * N\u00FAmero \u00FAnico do terminal.
   **/
  public TerminalResponse terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero \u00FAnico do terminal.")
  @JsonProperty("terminal")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * N\u00FAmero do estabelecimento a qual o terminal pertence.
   **/
  public TerminalResponse numeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero do estabelecimento a qual o terminal pertence.")
  @JsonProperty("numeroEstabelecimento")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * N\u00FAmero de identifica\u00E7\u00E3o do estabelecimento a qual o terminal pertence.
   **/
  public TerminalResponse idEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "N\u00FAmero de identifica\u00E7\u00E3o do estabelecimento a qual o terminal pertence.")
  @JsonProperty("idEstabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Flag indicando se o terminal \u00E9 f\u00EDsico ou virtual, sendo: (true: Sim), (false: N\u00E3o)).
   **/
  public TerminalResponse flagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicando se o terminal \u00E9 f\u00EDsico ou virtual, sendo: (true: Sim), (false: N\u00E3o)).")
  @JsonProperty("flagConsultaExtrato")
  public Boolean getFlagConsultaExtrato() {
    return flagConsultaExtrato;
  }
  public void setFlagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
  }

  
  /**
   * Flag indicando se o terminal permite consultar extrato, sendo: (true: Sim), (false: N\u00E3o)).
   **/
  public TerminalResponse flagTerminalVirtual(Boolean flagTerminalVirtual) {
    this.flagTerminalVirtual = flagTerminalVirtual;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag indicando se o terminal permite consultar extrato, sendo: (true: Sim), (false: N\u00E3o)).")
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
    TerminalResponse terminalResponse = (TerminalResponse) o;
    return Objects.equals(this.id, terminalResponse.id) &&
        Objects.equals(this.terminal, terminalResponse.terminal) &&
        Objects.equals(this.numeroEstabelecimento, terminalResponse.numeroEstabelecimento) &&
        Objects.equals(this.idEstabelecimento, terminalResponse.idEstabelecimento) &&
        Objects.equals(this.flagConsultaExtrato, terminalResponse.flagConsultaExtrato) &&
        Objects.equals(this.flagTerminalVirtual, terminalResponse.flagTerminalVirtual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, terminal, numeroEstabelecimento, idEstabelecimento, flagConsultaExtrato, flagTerminalVirtual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    numeroEstabelecimento: ").append(toIndentedString(numeroEstabelecimento)).append("\n");
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

