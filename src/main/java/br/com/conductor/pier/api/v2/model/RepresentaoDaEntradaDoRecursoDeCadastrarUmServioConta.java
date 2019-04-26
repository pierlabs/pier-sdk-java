package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto ServicoConta para persist\u00EAncia de dados
 **/

@ApiModel(description = "Objeto ServicoConta para persist\u00EAncia de dados")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class RepresentaoDaEntradaDoRecursoDeCadastrarUmServioConta   {
  
  private Long idConta = null;
  private Long idTipoServico = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Conta
   **/
  public RepresentaoDaEntradaDoRecursoDeCadastrarUmServioConta idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da Conta")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Tipo Servi\u00E7o
   **/
  public RepresentaoDaEntradaDoRecursoDeCadastrarUmServioConta idTipoServico(Long idTipoServico) {
    this.idTipoServico = idTipoServico;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do Tipo Servi\u00E7o")
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
    RepresentaoDaEntradaDoRecursoDeCadastrarUmServioConta representaoDaEntradaDoRecursoDeCadastrarUmServioConta = (RepresentaoDaEntradaDoRecursoDeCadastrarUmServioConta) o;
    return Objects.equals(this.idConta, representaoDaEntradaDoRecursoDeCadastrarUmServioConta.idConta) &&
        Objects.equals(this.idTipoServico, representaoDaEntradaDoRecursoDeCadastrarUmServioConta.idTipoServico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConta, idTipoServico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepresentaoDaEntradaDoRecursoDeCadastrarUmServioConta {\n");
    
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

