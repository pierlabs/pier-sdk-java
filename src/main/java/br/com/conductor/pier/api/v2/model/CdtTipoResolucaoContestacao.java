package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CdtTipoResolucaoContestacao   {
  
  private String descricao = null;
  private Long idTipoResolucaoContestacao = null;

  
  /**
   **/
  public CdtTipoResolucaoContestacao descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   **/
  public CdtTipoResolucaoContestacao idTipoResolucaoContestacao(Long idTipoResolucaoContestacao) {
    this.idTipoResolucaoContestacao = idTipoResolucaoContestacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idTipoResolucaoContestacao")
  public Long getIdTipoResolucaoContestacao() {
    return idTipoResolucaoContestacao;
  }
  public void setIdTipoResolucaoContestacao(Long idTipoResolucaoContestacao) {
    this.idTipoResolucaoContestacao = idTipoResolucaoContestacao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdtTipoResolucaoContestacao cdtTipoResolucaoContestacao = (CdtTipoResolucaoContestacao) o;
    return Objects.equals(this.descricao, cdtTipoResolucaoContestacao.descricao) &&
        Objects.equals(this.idTipoResolucaoContestacao, cdtTipoResolucaoContestacao.idTipoResolucaoContestacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao, idTipoResolucaoContestacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdtTipoResolucaoContestacao {\n");
    
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    idTipoResolucaoContestacao: ").append(toIndentedString(idTipoResolucaoContestacao)).append("\n");
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

