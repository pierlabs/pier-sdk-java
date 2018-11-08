package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{servico_conta_persist_description}}}
 **/

@ApiModel(description = "{{{servico_conta_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ServicoContaPersistValue   {
  
  private Long idConta = null;
  private Long idTipoServico = null;

  
  /**
   * {{{servico_conta_persist_id_conta_value}}}
   **/
  public ServicoContaPersistValue idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{servico_conta_persist_id_conta_value}}}")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{servico_conta_persist_id_tipo_servico_value}}}
   **/
  public ServicoContaPersistValue idTipoServico(Long idTipoServico) {
    this.idTipoServico = idTipoServico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{servico_conta_persist_id_tipo_servico_value}}}")
  @JsonProperty("idTipoServico")
  public Long getIdTipoServico() {
    return idTipoServico;
  }
  public void setIdTipoServico(Long idTipoServico) {
    this.idTipoServico = idTipoServico;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicoContaPersistValue servicoContaPersistValue = (ServicoContaPersistValue) o;
    return Objects.equals(this.idConta, servicoContaPersistValue.idConta) &&
        Objects.equals(this.idTipoServico, servicoContaPersistValue.idTipoServico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idTipoServico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicoContaPersistValue {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    idTipoServico: ").append(toIndentedString(idTipoServico)).append("\n");
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

