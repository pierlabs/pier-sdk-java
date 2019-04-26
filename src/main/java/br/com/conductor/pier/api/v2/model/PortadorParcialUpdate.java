package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto de atualiza\u00E7\u00E3o parcial do Portador
 **/

@ApiModel(description = "Objeto de atualiza\u00E7\u00E3o parcial do Portador")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class PortadorParcialUpdate   {
  
  private String nomeImpresso = null;
  private String observacao = null;
  private String dataHoraCancelamento = null;
  private String parentesco = null;
  private Long idParentesco = null;
  private Boolean ativo = null;

  
  /**
   * Nome impresso
   **/
  public PortadorParcialUpdate nomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome impresso")
  @JsonProperty("nomeImpresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Observa\u00E7\u00F5es do portador
   **/
  public PortadorParcialUpdate observacao(String observacao) {
    this.observacao = observacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Observa\u00E7\u00F5es do portador")
  @JsonProperty("observacao")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * Data e hora de cancelamento
   **/
  public PortadorParcialUpdate dataHoraCancelamento(String dataHoraCancelamento) {
    this.dataHoraCancelamento = dataHoraCancelamento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data e hora de cancelamento")
  @JsonProperty("dataHoraCancelamento")
  public String getDataHoraCancelamento() {
    return dataHoraCancelamento;
  }
  public void setDataHoraCancelamento(String dataHoraCancelamento) {
    this.dataHoraCancelamento = dataHoraCancelamento;
  }

  
  /**
   * Parentesco do portador
   **/
  public PortadorParcialUpdate parentesco(String parentesco) {
    this.parentesco = parentesco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parentesco do portador")
  @JsonProperty("parentesco")
  public String getParentesco() {
    return parentesco;
  }
  public void setParentesco(String parentesco) {
    this.parentesco = parentesco;
  }

  
  /**
   * C\u00F3digo identificador do parentesco
   **/
  public PortadorParcialUpdate idParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo identificador do parentesco")
  @JsonProperty("idParentesco")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * Flag que indica se o portador est\u00E1 ativo
   **/
  public PortadorParcialUpdate ativo(Boolean ativo) {
    this.ativo = ativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que indica se o portador est\u00E1 ativo")
  @JsonProperty("ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortadorParcialUpdate portadorParcialUpdate = (PortadorParcialUpdate) o;
    return Objects.equals(this.nomeImpresso, portadorParcialUpdate.nomeImpresso) &&
        Objects.equals(this.observacao, portadorParcialUpdate.observacao) &&
        Objects.equals(this.dataHoraCancelamento, portadorParcialUpdate.dataHoraCancelamento) &&
        Objects.equals(this.parentesco, portadorParcialUpdate.parentesco) &&
        Objects.equals(this.idParentesco, portadorParcialUpdate.idParentesco) &&
        Objects.equals(this.ativo, portadorParcialUpdate.ativo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeImpresso, observacao, dataHoraCancelamento, parentesco, idParentesco, ativo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortadorParcialUpdate {\n");
    
    sb.append("    nomeImpresso: ").append(toIndentedString(nomeImpresso)).append("\n");
    sb.append("    observacao: ").append(toIndentedString(observacao)).append("\n");
    sb.append("    dataHoraCancelamento: ").append(toIndentedString(dataHoraCancelamento)).append("\n");
    sb.append("    parentesco: ").append(toIndentedString(parentesco)).append("\n");
    sb.append("    idParentesco: ").append(toIndentedString(idParentesco)).append("\n");
    sb.append("    ativo: ").append(toIndentedString(ativo)).append("\n");
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

