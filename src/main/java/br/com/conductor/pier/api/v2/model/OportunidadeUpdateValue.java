package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.DetalheOportunidadeUpdateValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{oportunidade_update_description}}}
 **/

@ApiModel(description = "{{{oportunidade_update_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class OportunidadeUpdateValue   {
  
  private Long idTipoOportunidade = null;
  private Long idStatusOportunidade = null;
  private String numeroReceitaFederal = null;
  private String dataInicioVigencia = null;
  private String dataFimVigencia = null;
  private Boolean flagAtivo = null;
  private List<DetalheOportunidadeUpdateValue> detalhes = new ArrayList<DetalheOportunidadeUpdateValue>();

  
  /**
   * {{{oportunidade_update_id_tipo_oportunidade_value}}}
   **/
  public OportunidadeUpdateValue idTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{oportunidade_update_id_tipo_oportunidade_value}}}")
  @JsonProperty("idTipoOportunidade")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * {{{oportunidade_update_id_status_oportunidade_value}}}
   **/
  public OportunidadeUpdateValue idStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{oportunidade_update_id_status_oportunidade_value}}}")
  @JsonProperty("idStatusOportunidade")
  public Long getIdStatusOportunidade() {
    return idStatusOportunidade;
  }
  public void setIdStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
  }

  
  /**
   * {{{oportunidade_update_numero_receita_federal_value}}}
   **/
  public OportunidadeUpdateValue numeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{oportunidade_update_numero_receita_federal_value}}}")
  @JsonProperty("numeroReceitaFederal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * {{{oportunidade_update_data_inicio_vigencia_value}}}
   **/
  public OportunidadeUpdateValue dataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", required = true, value = "{{{oportunidade_update_data_inicio_vigencia_value}}}")
  @JsonProperty("dataInicioVigencia")
  public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }
  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  
  /**
   * {{{oportunidade_update_data_fim_vigencia_value}}}
   **/
  public OportunidadeUpdateValue dataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", required = true, value = "{{{oportunidade_update_data_fim_vigencia_value}}}")
  @JsonProperty("dataFimVigencia")
  public String getDataFimVigencia() {
    return dataFimVigencia;
  }
  public void setDataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  
  /**
   * {{{oportunidade_update_flag_ativo_value}}}
   **/
  public OportunidadeUpdateValue flagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
    return this;
  }
  
  @ApiModelProperty(example = "true", required = true, value = "{{{oportunidade_update_flag_ativo_value}}}")
  @JsonProperty("flagAtivo")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * {{{oportunidade_update_detalhes_value}}}
   **/
  public OportunidadeUpdateValue detalhes(List<DetalheOportunidadeUpdateValue> detalhes) {
    this.detalhes = detalhes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "{{{oportunidade_update_detalhes_value}}}")
  @JsonProperty("detalhes")
  public List<DetalheOportunidadeUpdateValue> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<DetalheOportunidadeUpdateValue> detalhes) {
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
    OportunidadeUpdateValue oportunidadeUpdateValue = (OportunidadeUpdateValue) o;
    return Objects.equals(this.idTipoOportunidade, oportunidadeUpdateValue.idTipoOportunidade) &&
        Objects.equals(this.idStatusOportunidade, oportunidadeUpdateValue.idStatusOportunidade) &&
        Objects.equals(this.numeroReceitaFederal, oportunidadeUpdateValue.numeroReceitaFederal) &&
        Objects.equals(this.dataInicioVigencia, oportunidadeUpdateValue.dataInicioVigencia) &&
        Objects.equals(this.dataFimVigencia, oportunidadeUpdateValue.dataFimVigencia) &&
        Objects.equals(this.flagAtivo, oportunidadeUpdateValue.flagAtivo) &&
        Objects.equals(this.detalhes, oportunidadeUpdateValue.detalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoOportunidade, idStatusOportunidade, numeroReceitaFederal, dataInicioVigencia, dataFimVigencia, flagAtivo, detalhes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OportunidadeUpdateValue {\n");
    
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

