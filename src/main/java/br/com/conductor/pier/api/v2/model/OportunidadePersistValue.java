package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.DetalheOportunidadePersistValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{oportunidade_persist_description}}}
 **/

@ApiModel(description = "{{{oportunidade_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OportunidadePersistValue   {
  
  private Long idTipoOportunidade = null;
  private Long idStatusOportunidade = null;
  private String numeroReceitaFederal = null;
  private String dataInicioVigencia = null;
  private String dataFimVigencia = null;
  private Boolean flagAtivo = null;
  private List<DetalheOportunidadePersistValue> detalhes = new ArrayList<DetalheOportunidadePersistValue>();

  
  /**
   * {{{oportunidade_persist_id_tipo_oportunidade_value}}}
   **/
  public OportunidadePersistValue idTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{oportunidade_persist_id_tipo_oportunidade_value}}}")
  @JsonProperty("idTipoOportunidade")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * {{{oportunidade_persist_id_status_oportunidade_value}}}
   **/
  public OportunidadePersistValue idStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{oportunidade_persist_id_status_oportunidade_value}}}")
  @JsonProperty("idStatusOportunidade")
  public Long getIdStatusOportunidade() {
    return idStatusOportunidade;
  }
  public void setIdStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
  }

  
  /**
   * {{{oportunidade_persist_numero_receita_federal_value}}}
   **/
  public OportunidadePersistValue numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{oportunidade_persist_numero_receita_federal_value}}}")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * {{{oportunidade_persist_data_inicio_vigencia_value}}}
   **/
  public OportunidadePersistValue dataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", required = true, value = "{{{oportunidade_persist_data_inicio_vigencia_value}}}")
  @JsonProperty("dataInicioVigencia")
  public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }
  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  
  /**
   * {{{oportunidade_persist_data_fim_vigencia_value}}}
   **/
  public OportunidadePersistValue dataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", required = true, value = "{{{oportunidade_persist_data_fim_vigencia_value}}}")
  @JsonProperty("dataFimVigencia")
  public String getDataFimVigencia() {
    return dataFimVigencia;
  }
  public void setDataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  
  /**
   * {{{oportunidade_persist_flag_ativo_value}}}
   **/
  public OportunidadePersistValue flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "true", required = true, value = "{{{oportunidade_persist_flag_ativo_value}}}")
  @JsonProperty("flagAtivo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * {{{oportunidade_persist_detalhes_value}}}
   **/
  public OportunidadePersistValue detalhes(List<DetalheOportunidadePersistValue> detalhes) {
    this.detalhes = detalhes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{oportunidade_persist_detalhes_value}}}")
  @JsonProperty("detalhes")
  public List<DetalheOportunidadePersistValue> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<DetalheOportunidadePersistValue> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OportunidadePersistValue oportunidadePersistValue = (OportunidadePersistValue) o;
    return Objects.equals(this.idTipoOportunidade, oportunidadePersistValue.idTipoOportunidade) &&
        Objects.equals(this.idStatusOportunidade, oportunidadePersistValue.idStatusOportunidade) &&
        Objects.equals(this.numeroReceitaFederal, oportunidadePersistValue.numeroReceitaFederal) &&
        Objects.equals(this.dataInicioVigencia, oportunidadePersistValue.dataInicioVigencia) &&
        Objects.equals(this.dataFimVigencia, oportunidadePersistValue.dataFimVigencia) &&
        Objects.equals(this.flagAtivo, oportunidadePersistValue.flagAtivo) &&
        Objects.equals(this.detalhes, oportunidadePersistValue.detalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoOportunidade, idStatusOportunidade, numeroReceitaFederal, dataInicioVigencia, dataFimVigencia, flagAtivo, detalhes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OportunidadePersistValue {\n");
    
    sb.append("    idTipoOportunidade: ").append(toIndentedString(idTipoOportunidade)).append("\n");
    sb.append("    idStatusOportunidade: ").append(toIndentedString(idStatusOportunidade)).append("\n");
    sb.append("    numeroReceitaFederal: ").append(toIndentedString(numeroReceitaFederal)).append("\n");
    sb.append("    dataInicioVigencia: ").append(toIndentedString(dataInicioVigencia)).append("\n");
    sb.append("    dataFimVigencia: ").append(toIndentedString(dataFimVigencia)).append("\n");
    sb.append("    flagAtivo: ").append(toIndentedString(flagAtivo)).append("\n");
    sb.append("    detalhes: ").append(toIndentedString(detalhes)).append("\n");
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

