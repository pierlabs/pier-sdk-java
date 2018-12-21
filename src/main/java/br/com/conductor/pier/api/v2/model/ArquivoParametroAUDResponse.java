package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object Auditorial Response of the files parameters
 **/

@ApiModel(description = "Object Auditorial Response of the files parameters")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ArquivoParametroAUDResponse   {
  
  private Long rev = null;
  private Integer revType = null;
  private String id = null;
  private String parametro = null;
  private String conteudo = null;
  private String dataHoraInclusao = null;
  private String dataHoraAlteracao = null;

  
  /**
   * Identifier of the auditorial file
   **/
  public ArquivoParametroAUDResponse rev(Long rev) {
    this.rev = rev;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier of the auditorial file")
  @JsonProperty("rev")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * Identifier of auditorail type (0 - Created, 1 - Updated, 2 - Excluded)
   **/
  public ArquivoParametroAUDResponse revType(Integer revType) {
    this.revType = revType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier of auditorail type (0 - Created, 1 - Updated, 2 - Excluded)")
  @JsonProperty("revType")
  public Integer getRevType() {
    return revType;
  }
  public void setRevType(Integer revType) {
    this.revType = revType;
  }

  
  /**
   * Identifier of the parameter
   **/
  public ArquivoParametroAUDResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier of the parameter")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Name of the parameter
   **/
  public ArquivoParametroAUDResponse parametro(String parametro) {
    this.parametro = parametro;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the parameter")
  @JsonProperty("parametro")
  public String getParametro() {
    return parametro;
  }
  public void setParametro(String parametro) {
    this.parametro = parametro;
  }

  
  /**
   * Content of the parameter
   **/
  public ArquivoParametroAUDResponse conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content of the parameter")
  @JsonProperty("conteudo")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * Date of inclusion of the parameter
   **/
  public ArquivoParametroAUDResponse dataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Date of inclusion of the parameter")
  @JsonProperty("dataHoraInclusao")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * Date of the update of the parameter
   **/
  public ArquivoParametroAUDResponse dataHoraAlteracao(String dataHoraAlteracao) {
    this.dataHoraAlteracao = dataHoraAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Date of the update of the parameter")
  @JsonProperty("dataHoraAlteracao")
  public String getDataHoraAlteracao() {
    return dataHoraAlteracao;
  }
  public void setDataHoraAlteracao(String dataHoraAlteracao) {
    this.dataHoraAlteracao = dataHoraAlteracao;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArquivoParametroAUDResponse arquivoParametroAUDResponse = (ArquivoParametroAUDResponse) o;
    return Objects.equals(this.rev, arquivoParametroAUDResponse.rev) &&
        Objects.equals(this.revType, arquivoParametroAUDResponse.revType) &&
        Objects.equals(this.id, arquivoParametroAUDResponse.id) &&
        Objects.equals(this.parametro, arquivoParametroAUDResponse.parametro) &&
        Objects.equals(this.conteudo, arquivoParametroAUDResponse.conteudo) &&
        Objects.equals(this.dataHoraInclusao, arquivoParametroAUDResponse.dataHoraInclusao) &&
        Objects.equals(this.dataHoraAlteracao, arquivoParametroAUDResponse.dataHoraAlteracao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rev, revType, id, parametro, conteudo, dataHoraInclusao, dataHoraAlteracao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoParametroAUDResponse {\n");
    
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    revType: ").append(toIndentedString(revType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parametro: ").append(toIndentedString(parametro)).append("\n");
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
    sb.append("    dataHoraInclusao: ").append(toIndentedString(dataHoraInclusao)).append("\n");
    sb.append("    dataHoraAlteracao: ").append(toIndentedString(dataHoraAlteracao)).append("\n");
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

