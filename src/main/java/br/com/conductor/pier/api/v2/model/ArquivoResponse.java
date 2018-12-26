package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ArquivoParametroResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{arquivo_response_description}}}
 **/

@ApiModel(description = "{{{arquivo_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ArquivoResponse   {
  
  private Long id = null;
  private Long idTipoArquivo = null;
  private String nomeTipoArquivo = null;
  private Long idStatusArquivo = null;
  private String nomeStatusArquivo = null;
  private String nome = null;
  private String extensao = null;
  private String dataInclusao = null;
  private String dataAlteracao = null;
  private List<ArquivoParametroResponse> detalhes = new ArrayList<ArquivoParametroResponse>();

  
  /**
   * {{{arquivo_response_id_value}}}
   **/
  public ArquivoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{arquivo_response_id_tipo_arquivo_value}}}
   **/
  public ArquivoResponse idTipoArquivo(Long idTipoArquivo) {
    this.idTipoArquivo = idTipoArquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_response_id_tipo_arquivo_value}}}")
  @JsonProperty("idTipoArquivo")
  public Long getIdTipoArquivo() {
    return idTipoArquivo;
  }
  public void setIdTipoArquivo(Long idTipoArquivo) {
    this.idTipoArquivo = idTipoArquivo;
  }

  
  /**
   * {{{arquivo_response_nome_tipo_arquivo_value}}}
   **/
  public ArquivoResponse nomeTipoArquivo(String nomeTipoArquivo) {
    this.nomeTipoArquivo = nomeTipoArquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_response_nome_tipo_arquivo_value}}}")
  @JsonProperty("nomeTipoArquivo")
  public String getNomeTipoArquivo() {
    return nomeTipoArquivo;
  }
  public void setNomeTipoArquivo(String nomeTipoArquivo) {
    this.nomeTipoArquivo = nomeTipoArquivo;
  }

  
  /**
   * {{{arquivo_response_id_status_arquivo_value}}}
   **/
  public ArquivoResponse idStatusArquivo(Long idStatusArquivo) {
    this.idStatusArquivo = idStatusArquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_response_id_status_arquivo_value}}}")
  @JsonProperty("idStatusArquivo")
  public Long getIdStatusArquivo() {
    return idStatusArquivo;
  }
  public void setIdStatusArquivo(Long idStatusArquivo) {
    this.idStatusArquivo = idStatusArquivo;
  }

  
  /**
   * {{{arquivo_response_nome_status_arquivo_value}}}
   **/
  public ArquivoResponse nomeStatusArquivo(String nomeStatusArquivo) {
    this.nomeStatusArquivo = nomeStatusArquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_response_nome_status_arquivo_value}}}")
  @JsonProperty("nomeStatusArquivo")
  public String getNomeStatusArquivo() {
    return nomeStatusArquivo;
  }
  public void setNomeStatusArquivo(String nomeStatusArquivo) {
    this.nomeStatusArquivo = nomeStatusArquivo;
  }

  
  /**
   * {{{arquivo_response_nome_value}}}
   **/
  public ArquivoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{arquivo_response_extensao_value}}}
   **/
  public ArquivoResponse extensao(String extensao) {
    this.extensao = extensao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_response_extensao_value}}}")
  @JsonProperty("extensao")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * {{{arquivo_response_data_inclusao_value}}}
   **/
  public ArquivoResponse dataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_response_data_inclusao_value}}}")
  @JsonProperty("dataInclusao")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * {{{arquivo_response_data_alteracao_value}}}
   **/
  public ArquivoResponse dataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_response_data_alteracao_value}}}")
  @JsonProperty("dataAlteracao")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  
  /**
   * {{{arquivo_response_detalhes_value}}}
   **/
  public ArquivoResponse detalhes(List<ArquivoParametroResponse> detalhes) {
    this.detalhes = detalhes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{arquivo_response_detalhes_value}}}")
  @JsonProperty("detalhes")
  public List<ArquivoParametroResponse> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<ArquivoParametroResponse> detalhes) {
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
    ArquivoResponse arquivoResponse = (ArquivoResponse) o;
    return Objects.equals(this.id, arquivoResponse.id) &&
        Objects.equals(this.idTipoArquivo, arquivoResponse.idTipoArquivo) &&
        Objects.equals(this.nomeTipoArquivo, arquivoResponse.nomeTipoArquivo) &&
        Objects.equals(this.idStatusArquivo, arquivoResponse.idStatusArquivo) &&
        Objects.equals(this.nomeStatusArquivo, arquivoResponse.nomeStatusArquivo) &&
        Objects.equals(this.nome, arquivoResponse.nome) &&
        Objects.equals(this.extensao, arquivoResponse.extensao) &&
        Objects.equals(this.dataInclusao, arquivoResponse.dataInclusao) &&
        Objects.equals(this.dataAlteracao, arquivoResponse.dataAlteracao) &&
        Objects.equals(this.detalhes, arquivoResponse.detalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoArquivo, nomeTipoArquivo, idStatusArquivo, nomeStatusArquivo, nome, extensao, dataInclusao, dataAlteracao, detalhes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoArquivo: ").append(toIndentedString(idTipoArquivo)).append("\n");
    sb.append("    nomeTipoArquivo: ").append(toIndentedString(nomeTipoArquivo)).append("\n");
    sb.append("    idStatusArquivo: ").append(toIndentedString(idStatusArquivo)).append("\n");
    sb.append("    nomeStatusArquivo: ").append(toIndentedString(nomeStatusArquivo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    extensao: ").append(toIndentedString(extensao)).append("\n");
    sb.append("    dataInclusao: ").append(toIndentedString(dataInclusao)).append("\n");
    sb.append("    dataAlteracao: ").append(toIndentedString(dataAlteracao)).append("\n");
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

