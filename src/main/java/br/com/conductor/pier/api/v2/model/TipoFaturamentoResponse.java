package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto Faturamento
 **/

@ApiModel(description = "Objeto Faturamento")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoFaturamentoResponse   {
  
  private Long id = null;
  private String descricao = null;
  private Boolean flagApenasDemonstrativo = null;
  private Long idConvenio = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento (id).
   **/
  public TipoFaturamentoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento (id).")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Desci\u00E7\u00E3o do tipo de faturamento.
   **/
  public TipoFaturamentoResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Desci\u00E7\u00E3o do tipo de faturamento.")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag que representa que o faturamento ser\u00E1 apenas demonstrativo.
   **/
  public TipoFaturamentoResponse flagApenasDemonstrativo(Boolean flagApenasDemonstrativo) {
    this.flagApenasDemonstrativo = flagApenasDemonstrativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Flag que representa que o faturamento ser\u00E1 apenas demonstrativo.")
  @JsonProperty("flagApenasDemonstrativo")
  public Boolean getFlagApenasDemonstrativo() {
    return flagApenasDemonstrativo;
  }
  public void setFlagApenasDemonstrativo(Boolean flagApenasDemonstrativo) {
    this.flagApenasDemonstrativo = flagApenasDemonstrativo;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do conv\u00EAnio relacionado ao tipo de faturamento.
   **/
  public TipoFaturamentoResponse idConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do conv\u00EAnio relacionado ao tipo de faturamento.")
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

