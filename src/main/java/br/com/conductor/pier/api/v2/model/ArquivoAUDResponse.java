package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ArquivoParametroAUDResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{arquivo_a_u_d_response_description}}}
 **/

@ApiModel(description = "{{{arquivo_a_u_d_response_description}}}")
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
   * {{{arquivo_a_u_d_response_rev_value}}}
   **/
  public ArquivoAUDResponse rev(Long rev) {
    this.rev = rev;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_a_u_d_response_rev_value}}}")
  @JsonProperty("rev")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   * {{{arquivo_a_u_d_response_rev_type_value}}}
   **/
  public ArquivoAUDResponse revType(Integer revType) {
    this.revType = revType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_a_u_d_response_rev_type_value}}}")
  @JsonProperty("revType")
  public Integer getRevType() {
    return revType;
  }
  public void setRevType(Integer revType) {
    this.revType = revType;
  }

  
  /**
   * {{{arquivo_a_u_d_response_id_value}}}
   **/
  public ArquivoAUDResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_a_u_d_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{arquivo_a_u_d_response_nome_value}}}
   **/
  public ArquivoAUDResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_a_u_d_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{arquivo_a_u_d_response_id_resposta_acesso_digital_value}}}
   **/
  public ArquivoAUDResponse idRespostaAcessoDigital(String idRespostaAcessoDigital) {
    this.idRespostaAcessoDigital = idRespostaAcessoDigital;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_a_u_d_response_id_resposta_acesso_digital_value}}}")
  @JsonProperty("idRespostaAcessoDigital")
  public String getIdRespostaAcessoDigital() {
    return idRespostaAcessoDigital;
  }
  public void setIdRespostaAcessoDigital(String idRespostaAcessoDigital) {
    this.idRespostaAcessoDigital = idRespostaAcessoDigital;
  }

  
  /**
   * {{{arquivo_a_u_d_response_data_hora_resposta_acesso_digital_value}}}
   **/
  public ArquivoAUDResponse dataHoraRespostaAcessoDigital(String dataHoraRespostaAcessoDigital) {
    this.dataHoraRespostaAcessoDigital = dataHoraRespostaAcessoDigital;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{arquivo_a_u_d_response_data_hora_resposta_acesso_digital_value}}}")
  @JsonProperty("dataHoraRespostaAcessoDigital")
  public String getDataHoraRespostaAcessoDigital() {
    return dataHoraRespostaAcessoDigital;
  }
  public void setDataHoraRespostaAcessoDigital(String dataHoraRespostaAcessoDigital) {
    this.dataHoraRespostaAcessoDigital = dataHoraRespostaAcessoDigital;
  }

  
  /**
   * {{{arquivo_a_u_d_response_id_resposta_neurotech_value}}}
   **/
  public ArquivoAUDResponse idRespostaNeurotech(String idRespostaNeurotech) {
    this.idRespostaNeurotech = idRespostaNeurotech;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_a_u_d_response_id_resposta_neurotech_value}}}")
  @JsonProperty("idRespostaNeurotech")
  public String getIdRespostaNeurotech() {
    return idRespostaNeurotech;
  }
  public void setIdRespostaNeurotech(String idRespostaNeurotech) {
    this.idRespostaNeurotech = idRespostaNeurotech;
  }

  
  /**
   * {{{arquivo_a_u_d_response_data_hora_resposta_neurotech_value}}}
   **/
  public ArquivoAUDResponse dataHoraRespostaNeurotech(String dataHoraRespostaNeurotech) {
    this.dataHoraRespostaNeurotech = dataHoraRespostaNeurotech;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{arquivo_a_u_d_response_data_hora_resposta_neurotech_value}}}")
  @JsonProperty("dataHoraRespostaNeurotech")
  public String getDataHoraRespostaNeurotech() {
    return dataHoraRespostaNeurotech;
  }
  public void setDataHoraRespostaNeurotech(String dataHoraRespostaNeurotech) {
    this.dataHoraRespostaNeurotech = dataHoraRespostaNeurotech;
  }

  
  /**
   * {{{arquivo_a_u_d_response_uri_value}}}
   **/
  public ArquivoAUDResponse uri(String uri) {
    this.uri = uri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_a_u_d_response_uri_value}}}")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * {{{arquivo_a_u_d_response_data_hora_inclusao_value}}}
   **/
  public ArquivoAUDResponse dataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{arquivo_a_u_d_response_data_hora_inclusao_value}}}")
  @JsonProperty("dataHoraInclusao")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * {{{arquivo_a_u_d_response_data_hora_alteracao_value}}}
   **/
  public ArquivoAUDResponse dataHoraAlteracao(String dataHoraAlteracao) {
    this.dataHoraAlteracao = dataHoraAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "{{{arquivo_a_u_d_response_data_hora_alteracao_value}}}")
  @JsonProperty("dataHoraAlteracao")
  public String getDataHoraAlteracao() {
    return dataHoraAlteracao;
  }
  public void setDataHoraAlteracao(String dataHoraAlteracao) {
    this.dataHoraAlteracao = dataHoraAlteracao;
  }

  
  /**
   * {{{arquivo_a_u_d_response_extensao_value}}}
   **/
  public ArquivoAUDResponse extensao(String extensao) {
    this.extensao = extensao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_a_u_d_response_extensao_value}}}")
  @JsonProperty("extensao")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * {{{arquivo_a_u_d_response_parametros_value}}}
   **/
  public ArquivoAUDResponse parametros(List<ArquivoParametroAUDResponse> parametros) {
    this.parametros = parametros;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_a_u_d_response_parametros_value}}}")
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

