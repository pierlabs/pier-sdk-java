package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ArquivoParametroAUDResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Objeto Response da auditoria do arquivo.
 **/

@ApiModel(description = "Objeto Response da auditoria do arquivo.")
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
   * Identificador da auditoria arquivo
   **/
  public ArquivoAUDResponse rev(Long rev) {
    this.rev = rev;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da auditoria arquivo")
  @JsonProperty("rev")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * Identificador do tipo de auditoria (0 - Criado, 1 - Alterado, 2 - Exclu\u00C3\u00ADdo)
   **/
  public ArquivoAUDResponse revType(Integer revType) {
    this.revType = revType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do tipo de auditoria (0 - Criado, 1 - Alterado, 2 - Exclu\u00C3\u00ADdo)")
  @JsonProperty("revType")
  public Integer getRevType() {
    return revType;
  }
  public void setRevType(Integer revType) {
    this.revType = revType;
  }

  
  /**
   * Identificador do arquivo auditado
   **/
  public ArquivoAUDResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do arquivo auditado")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do arquivo auditado
   **/
  public ArquivoAUDResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do arquivo auditado")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Identificador da resposta da Acesso Digital
   **/
  public ArquivoAUDResponse idRespostaAcessoDigital(String idRespostaAcessoDigital) {
    this.idRespostaAcessoDigital = idRespostaAcessoDigital;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da resposta da Acesso Digital")
  @JsonProperty("idRespostaAcessoDigital")
  public String getIdRespostaAcessoDigital() {
    return idRespostaAcessoDigital;
  }
  public void setIdRespostaAcessoDigital(String idRespostaAcessoDigital) {
    this.idRespostaAcessoDigital = idRespostaAcessoDigital;
  }

  
  /**
   * Data de resposta da Acesso Digital
   **/
  public ArquivoAUDResponse dataHoraRespostaAcessoDigital(String dataHoraRespostaAcessoDigital) {
    this.dataHoraRespostaAcessoDigital = dataHoraRespostaAcessoDigital;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de resposta da Acesso Digital")
  @JsonProperty("dataHoraRespostaAcessoDigital")
  public String getDataHoraRespostaAcessoDigital() {
    return dataHoraRespostaAcessoDigital;
  }
  public void setDataHoraRespostaAcessoDigital(String dataHoraRespostaAcessoDigital) {
    this.dataHoraRespostaAcessoDigital = dataHoraRespostaAcessoDigital;
  }

  
  /**
   * Identificador da resposta da Neurotech
   **/
  public ArquivoAUDResponse idRespostaNeurotech(String idRespostaNeurotech) {
    this.idRespostaNeurotech = idRespostaNeurotech;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da resposta da Neurotech")
  @JsonProperty("idRespostaNeurotech")
  public String getIdRespostaNeurotech() {
    return idRespostaNeurotech;
  }
  public void setIdRespostaNeurotech(String idRespostaNeurotech) {
    this.idRespostaNeurotech = idRespostaNeurotech;
  }

  
  /**
   * Data de resposta da Neurotech
   **/
  public ArquivoAUDResponse dataHoraRespostaNeurotech(String dataHoraRespostaNeurotech) {
    this.dataHoraRespostaNeurotech = dataHoraRespostaNeurotech;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de resposta da Neurotech")
  @JsonProperty("dataHoraRespostaNeurotech")
  public String getDataHoraRespostaNeurotech() {
    return dataHoraRespostaNeurotech;
  }
  public void setDataHoraRespostaNeurotech(String dataHoraRespostaNeurotech) {
    this.dataHoraRespostaNeurotech = dataHoraRespostaNeurotech;
  }

  
  /**
   * Uri de acesso
   **/
  public ArquivoAUDResponse uri(String uri) {
    this.uri = uri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Uri de acesso")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * Data de inclus\u00C3\u00A3o do arquivo auditado
   **/
  public ArquivoAUDResponse dataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de inclus\u00C3\u00A3o do arquivo auditado")
  @JsonProperty("dataHoraInclusao")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * Data de altera\u00C3\u00A7\u00C3\u00A3o do arquivo auditado
   **/
  public ArquivoAUDResponse dataHoraAlteracao(String dataHoraAlteracao) {
    this.dataHoraAlteracao = dataHoraAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de altera\u00C3\u00A7\u00C3\u00A3o do arquivo auditado")
  @JsonProperty("dataHoraAlteracao")
  public String getDataHoraAlteracao() {
    return dataHoraAlteracao;
  }
  public void setDataHoraAlteracao(String dataHoraAlteracao) {
    this.dataHoraAlteracao = dataHoraAlteracao;
  }

  
  /**
   * Extens\u00C3\u00A3o do arquivo auditado
   **/
  public ArquivoAUDResponse extensao(String extensao) {
    this.extensao = extensao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Extens\u00C3\u00A3o do arquivo auditado")
  @JsonProperty("extensao")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * Lista  de par\u00C3\u00A2metros do arquivo auditado
   **/
  public ArquivoAUDResponse parametros(List<ArquivoParametroAUDResponse> parametros) {
    this.parametros = parametros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista  de par\u00C3\u00A2metros do arquivo auditado")
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

