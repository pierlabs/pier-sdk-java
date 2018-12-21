package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ArquivoParametroAUDResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Object Response of the file auditorial
 **/

@ApiModel(description = "Object Response of the file auditorial")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ArquivoAUDResponse   {
  
  private Long rev = null;
  private Integer revType = null;
  private Long id = null;
  private String nome = null;
  private String idRespostaAcessoDigital = null;
  private String dataHoraRespostaAcessoDigital = null;
  private String idRespostaNeurotech = null;
  private String dataHoraRespostaNeurotech = null;
  private String uri = null;
  private String dataHoraInclusao = null;
  private String dataHoraAlteracao = null;
  private String extensao = null;
  private List<ArquivoParametroAUDResponse> parametros = new ArrayList<ArquivoParametroAUDResponse>();

  
  /**
   * Identifier of the auditorail File
   **/
  public ArquivoAUDResponse rev(Long rev) {
    this.rev = rev;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier of the auditorail File")
  @JsonProperty("rev")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * Identifier of the auditorial type (0 - Created, 1 - Updated, 2 - Excluded)
   **/
  public ArquivoAUDResponse revType(Integer revType) {
    this.revType = revType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier of the auditorial type (0 - Created, 1 - Updated, 2 - Excluded)")
  @JsonProperty("revType")
  public Integer getRevType() {
    return revType;
  }
  public void setRevType(Integer revType) {
    this.revType = revType;
  }

  
  /**
   * Identifier of the audited file
   **/
  public ArquivoAUDResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier of the audited file")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * File name audited
   **/
  public ArquivoAUDResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File name audited")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Identifier of the answer of the Digital Access
   **/
  public ArquivoAUDResponse idRespostaAcessoDigital(String idRespostaAcessoDigital) {
    this.idRespostaAcessoDigital = idRespostaAcessoDigital;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier of the answer of the Digital Access")
  @JsonProperty("idRespostaAcessoDigital")
  public String getIdRespostaAcessoDigital() {
    return idRespostaAcessoDigital;
  }
  public void setIdRespostaAcessoDigital(String idRespostaAcessoDigital) {
    this.idRespostaAcessoDigital = idRespostaAcessoDigital;
  }

  
  /**
   * Date of response of the Digital Access
   **/
  public ArquivoAUDResponse dataHoraRespostaAcessoDigital(String dataHoraRespostaAcessoDigital) {
    this.dataHoraRespostaAcessoDigital = dataHoraRespostaAcessoDigital;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Date of response of the Digital Access")
  @JsonProperty("dataHoraRespostaAcessoDigital")
  public String getDataHoraRespostaAcessoDigital() {
    return dataHoraRespostaAcessoDigital;
  }
  public void setDataHoraRespostaAcessoDigital(String dataHoraRespostaAcessoDigital) {
    this.dataHoraRespostaAcessoDigital = dataHoraRespostaAcessoDigital;
  }

  
  /**
   * Identifier of the response of Neurotech
   **/
  public ArquivoAUDResponse idRespostaNeurotech(String idRespostaNeurotech) {
    this.idRespostaNeurotech = idRespostaNeurotech;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier of the response of Neurotech")
  @JsonProperty("idRespostaNeurotech")
  public String getIdRespostaNeurotech() {
    return idRespostaNeurotech;
  }
  public void setIdRespostaNeurotech(String idRespostaNeurotech) {
    this.idRespostaNeurotech = idRespostaNeurotech;
  }

  
  /**
   * Date of response of the Neurotech
   **/
  public ArquivoAUDResponse dataHoraRespostaNeurotech(String dataHoraRespostaNeurotech) {
    this.dataHoraRespostaNeurotech = dataHoraRespostaNeurotech;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Date of response of the Neurotech")
  @JsonProperty("dataHoraRespostaNeurotech")
  public String getDataHoraRespostaNeurotech() {
    return dataHoraRespostaNeurotech;
  }
  public void setDataHoraRespostaNeurotech(String dataHoraRespostaNeurotech) {
    this.dataHoraRespostaNeurotech = dataHoraRespostaNeurotech;
  }

  
  /**
   * Uri of access
   **/
  public ArquivoAUDResponse uri(String uri) {
    this.uri = uri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Uri of access")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * Date of inclusion of the audited file
   **/
  public ArquivoAUDResponse dataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Date of inclusion of the audited file")
  @JsonProperty("dataHoraInclusao")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * Date of the audited file update
   **/
  public ArquivoAUDResponse dataHoraAlteracao(String dataHoraAlteracao) {
    this.dataHoraAlteracao = dataHoraAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Date of the audited file update")
  @JsonProperty("dataHoraAlteracao")
  public String getDataHoraAlteracao() {
    return dataHoraAlteracao;
  }
  public void setDataHoraAlteracao(String dataHoraAlteracao) {
    this.dataHoraAlteracao = dataHoraAlteracao;
  }

  
  /**
   * Extension of the audited file
   **/
  public ArquivoAUDResponse extensao(String extensao) {
    this.extensao = extensao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Extension of the audited file")
  @JsonProperty("extensao")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * List of parameter of the audited file
   **/
  public ArquivoAUDResponse parametros(List<ArquivoParametroAUDResponse> parametros) {
    this.parametros = parametros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of parameter of the audited file")
  @JsonProperty("parametros")
  public List<ArquivoParametroAUDResponse> getParametros() {
    return parametros;
  }
  public void setParametros(List<ArquivoParametroAUDResponse> parametros) {
    this.parametros = parametros;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArquivoAUDResponse arquivoAUDResponse = (ArquivoAUDResponse) o;
    return Objects.equals(this.rev, arquivoAUDResponse.rev) &&
        Objects.equals(this.revType, arquivoAUDResponse.revType) &&
        Objects.equals(this.id, arquivoAUDResponse.id) &&
        Objects.equals(this.nome, arquivoAUDResponse.nome) &&
        Objects.equals(this.idRespostaAcessoDigital, arquivoAUDResponse.idRespostaAcessoDigital) &&
        Objects.equals(this.dataHoraRespostaAcessoDigital, arquivoAUDResponse.dataHoraRespostaAcessoDigital) &&
        Objects.equals(this.idRespostaNeurotech, arquivoAUDResponse.idRespostaNeurotech) &&
        Objects.equals(this.dataHoraRespostaNeurotech, arquivoAUDResponse.dataHoraRespostaNeurotech) &&
        Objects.equals(this.uri, arquivoAUDResponse.uri) &&
        Objects.equals(this.dataHoraInclusao, arquivoAUDResponse.dataHoraInclusao) &&
        Objects.equals(this.dataHoraAlteracao, arquivoAUDResponse.dataHoraAlteracao) &&
        Objects.equals(this.extensao, arquivoAUDResponse.extensao) &&
        Objects.equals(this.parametros, arquivoAUDResponse.parametros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rev, revType, id, nome, idRespostaAcessoDigital, dataHoraRespostaAcessoDigital, idRespostaNeurotech, dataHoraRespostaNeurotech, uri, dataHoraInclusao, dataHoraAlteracao, extensao, parametros);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoAUDResponse {\n");
    
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
    sb.append("    revType: ").append(toIndentedString(revType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    idRespostaAcessoDigital: ").append(toIndentedString(idRespostaAcessoDigital)).append("\n");
    sb.append("    dataHoraRespostaAcessoDigital: ").append(toIndentedString(dataHoraRespostaAcessoDigital)).append("\n");
    sb.append("    idRespostaNeurotech: ").append(toIndentedString(idRespostaNeurotech)).append("\n");
    sb.append("    dataHoraRespostaNeurotech: ").append(toIndentedString(dataHoraRespostaNeurotech)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    dataHoraInclusao: ").append(toIndentedString(dataHoraInclusao)).append("\n");
    sb.append("    dataHoraAlteracao: ").append(toIndentedString(dataHoraAlteracao)).append("\n");
    sb.append("    extensao: ").append(toIndentedString(extensao)).append("\n");
    sb.append("    parametros: ").append(toIndentedString(parametros)).append("\n");
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

