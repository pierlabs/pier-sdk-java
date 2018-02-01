package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * TipoFaturamentoPersist
 **/

@ApiModel(description = "TipoFaturamentoPersist")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TipoFaturamentoPersist   {
  
  private String descricao = null;
  private Boolean flagApenasDemonstrativo = null;
  private Long idConvenio = null;

  
  /**
   * Desci\u00C3\u00A7\u00C3\u00A3o do tipo de faturamento.
   **/
  public TipoFaturamentoPersist descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Desci\u00C3\u00A7\u00C3\u00A3o do tipo de faturamento.")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag que representa que o faturamento ser\u00C3\u00A1 apenas demonstrativo.
   **/
  public TipoFaturamentoPersist flagApenasDemonstrativo(Boolean flagApenasDemonstrativo) {
    this.flagApenasDemonstrativo = flagApenasDemonstrativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "Flag que representa que o faturamento ser\u00C3\u00A1 apenas demonstrativo.")
  @JsonProperty("flagApenasDemonstrativo")
  public Boolean getFlagApenasDemonstrativo() {
    return flagApenasDemonstrativo;
  }
  public void setFlagApenasDemonstrativo(Boolean flagApenasDemonstrativo) {
    this.flagApenasDemonstrativo = flagApenasDemonstrativo;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do convenio relacionado ao tipo de faturamento.
   **/
  public TipoFaturamentoPersist idConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do convenio relacionado ao tipo de faturamento.")
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
    TipoFaturamentoPersist tipoFaturamentoPersist = (TipoFaturamentoPersist) o;
    return Objects.equals(this.descricao, tipoFaturamentoPersist.descricao) &&
        Objects.equals(this.flagApenasDemonstrativo, tipoFaturamentoPersist.flagApenasDemonstrativo) &&
        Objects.equals(this.idConvenio, tipoFaturamentoPersist.idConvenio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao, flagApenasDemonstrativo, idConvenio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFaturamentoPersist {\n");
    
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

