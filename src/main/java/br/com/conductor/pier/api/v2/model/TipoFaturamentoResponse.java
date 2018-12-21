package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * {{{tipo_faturamento_response_description}}}
 **/

@ApiModel(description = "{{{tipo_faturamento_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoFaturamentoResponse   {
  
  private Long id = null;
  private String descricao = null;
  private Boolean flagApenasDemonstrativo = null;
  private Long idConvenio = null;

  
  /**
   * {{{tipo_faturamento_response_id_value}}}
   **/
  public TipoFaturamentoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_faturamento_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{tipo_faturamento_response_descricao_value}}}
   **/
  public TipoFaturamentoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_faturamento_response_descricao_value}}}")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{tipo_faturamento_response_flag_apenas_demonstrativo_value}}}
   **/
  public TipoFaturamentoResponse flagApenasDemonstrativo(Boolean flagApenasDemonstrativo) {
    this.flagApenasDemonstrativo = flagApenasDemonstrativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "{{{tipo_faturamento_response_flag_apenas_demonstrativo_value}}}")
  @JsonProperty("flagApenasDemonstrativo")
  public Boolean getFlagApenasDemonstrativo() {
    return flagApenasDemonstrativo;
  }
  public void setFlagApenasDemonstrativo(Boolean flagApenasDemonstrativo) {
    this.flagApenasDemonstrativo = flagApenasDemonstrativo;
  }

  
  /**
   * {{{tipo_faturamento_response_id_convenio_value}}}
   **/
  public TipoFaturamentoResponse idConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{tipo_faturamento_response_id_convenio_value}}}")
  @JsonProperty("idConvenio")
  public Long getIdConvenio() {
    return idConvenio;
  }
  public void setIdConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoFaturamentoResponse tipoFaturamentoResponse = (TipoFaturamentoResponse) o;
    return Objects.equals(this.id, tipoFaturamentoResponse.id) &&
        Objects.equals(this.descricao, tipoFaturamentoResponse.descricao) &&
        Objects.equals(this.flagApenasDemonstrativo, tipoFaturamentoResponse.flagApenasDemonstrativo) &&
        Objects.equals(this.idConvenio, tipoFaturamentoResponse.idConvenio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descricao, flagApenasDemonstrativo, idConvenio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFaturamentoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    flagApenasDemonstrativo: ").append(toIndentedString(flagApenasDemonstrativo)).append("\n");
    sb.append("    idConvenio: ").append(toIndentedString(idConvenio)).append("\n");
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

