package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * TypeBillingPersist
 **/

@ApiModel(description = "TypeBillingPersist")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class TypeBillingPersist   {
  
  private String descricao = null;
  private Boolean flagApenasDemonstrativo = null;
  private Long idConvenio = null;

  
  /**
   * Desciption of the billing type
   **/
  public TypeBillingPersist descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Desciption of the billing type")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag that represents that the billing will be only demonstrative
   **/
  public TypeBillingPersist flagApenasDemonstrativo(Boolean flagApenasDemonstrativo) {
    this.flagApenasDemonstrativo = flagApenasDemonstrativo;
    return this;
  }
  
  @ApiModelProperty(example = "false", required = true, value = "Flag that represents that the billing will be only demonstrative")
  @JsonProperty("flagApenasDemonstrativo")
  public Boolean getFlagApenasDemonstrativo() {
    return flagApenasDemonstrativo;
  }
  public void setFlagApenasDemonstrativo(Boolean flagApenasDemonstrativo) {
    this.flagApenasDemonstrativo = flagApenasDemonstrativo;
  }

  
  /**
   * Identification Code of the agreement related to the billing type
   **/
  public TypeBillingPersist idConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the agreement related to the billing type")
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
    TypeBillingPersist typeBillingPersist = (TypeBillingPersist) o;
    return Objects.equals(this.descricao, typeBillingPersist.descricao) &&
        Objects.equals(this.flagApenasDemonstrativo, typeBillingPersist.flagApenasDemonstrativo) &&
        Objects.equals(this.idConvenio, typeBillingPersist.idConvenio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao, flagApenasDemonstrativo, idConvenio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeBillingPersist {\n");
    
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

