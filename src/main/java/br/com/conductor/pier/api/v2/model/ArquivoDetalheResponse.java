package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.ArquivoParametroResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Object Response of the file
 **/

@ApiModel(description = "Object Response of the file")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ArquivoDetalheResponse   {
  
  private Long id = null;
  private Long idTipoArquivo = null;
  private String nomeTipoArquivo = null;
  private String arquivo = null;
  private Long idStatusArquivo = null;
  private String nomeStatusArquivo = null;
  private String nome = null;
  private String extensao = null;
  private String dataInclusao = null;
  private String dataAlteracao = null;
  private List<ArquivoParametroResponse> detalhes = new ArrayList<ArquivoParametroResponse>();

  
  /**
   * Identification Code of the file
   **/
  public ArquivoDetalheResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the file")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Type of the File
   **/
  public ArquivoDetalheResponse idTipoArquivo(Long idTipoArquivo) {
    this.idTipoArquivo = idTipoArquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Type of the File")
  @JsonProperty("idTipoArquivo")
  public Long getIdTipoArquivo() {
    return idTipoArquivo;
  }
  public void setIdTipoArquivo(Long idTipoArquivo) {
    this.idTipoArquivo = idTipoArquivo;
  }

  
  /**
   * Description type of the file
   **/
  public ArquivoDetalheResponse nomeTipoArquivo(String nomeTipoArquivo) {
    this.nomeTipoArquivo = nomeTipoArquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description type of the file")
  @JsonProperty("nomeTipoArquivo")
  public String getNomeTipoArquivo() {
    return nomeTipoArquivo;
  }
  public void setNomeTipoArquivo(String nomeTipoArquivo) {
    this.nomeTipoArquivo = nomeTipoArquivo;
  }

  
  /**
   * Content of the File converted in Base 64
   **/
  public ArquivoDetalheResponse arquivo(String arquivo) {
    this.arquivo = arquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content of the File converted in Base 64")
  @JsonProperty("arquivo")
  public String getArquivo() {
    return arquivo;
  }
  public void setArquivo(String arquivo) {
    this.arquivo = arquivo;
  }

  
  /**
   * Identification Code of the Status of the File
   **/
  public ArquivoDetalheResponse idStatusArquivo(Long idStatusArquivo) {
    this.idStatusArquivo = idStatusArquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the Status of the File")
  @JsonProperty("idStatusArquivo")
  public Long getIdStatusArquivo() {
    return idStatusArquivo;
  }
  public void setIdStatusArquivo(Long idStatusArquivo) {
    this.idStatusArquivo = idStatusArquivo;
  }

  
  /**
   * Descrption of the status of the file
   **/
  public ArquivoDetalheResponse nomeStatusArquivo(String nomeStatusArquivo) {
    this.nomeStatusArquivo = nomeStatusArquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descrption of the status of the file")
  @JsonProperty("nomeStatusArquivo")
  public String getNomeStatusArquivo() {
    return nomeStatusArquivo;
  }
  public void setNomeStatusArquivo(String nomeStatusArquivo) {
    this.nomeStatusArquivo = nomeStatusArquivo;
  }

  
  /**
   * Name of the file
   **/
  public ArquivoDetalheResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the file")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Format/Extension of the file
   **/
  public ArquivoDetalheResponse extensao(String extensao) {
    this.extensao = extensao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Format/Extension of the file")
  @JsonProperty("extensao")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * Date of Inclusion of the file
   **/
  public ArquivoDetalheResponse dataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of Inclusion of the file")
  @JsonProperty("dataInclusao")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Date of the last update of the file
   **/
  public ArquivoDetalheResponse dataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of the last update of the file")
  @JsonProperty("dataAlteracao")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  
  /**
   * Details containing additional information, related to the file
   **/
  public ArquivoDetalheResponse detalhes(List<ArquivoParametroResponse> detalhes) {
    this.detalhes = detalhes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details containing additional information, related to the file")
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
    ArquivoDetalheResponse arquivoDetalheResponse = (ArquivoDetalheResponse) o;
    return Objects.equals(this.id, arquivoDetalheResponse.id) &&
        Objects.equals(this.idTipoArquivo, arquivoDetalheResponse.idTipoArquivo) &&
        Objects.equals(this.nomeTipoArquivo, arquivoDetalheResponse.nomeTipoArquivo) &&
        Objects.equals(this.arquivo, arquivoDetalheResponse.arquivo) &&
        Objects.equals(this.idStatusArquivo, arquivoDetalheResponse.idStatusArquivo) &&
        Objects.equals(this.nomeStatusArquivo, arquivoDetalheResponse.nomeStatusArquivo) &&
        Objects.equals(this.nome, arquivoDetalheResponse.nome) &&
        Objects.equals(this.extensao, arquivoDetalheResponse.extensao) &&
        Objects.equals(this.dataInclusao, arquivoDetalheResponse.dataInclusao) &&
        Objects.equals(this.dataAlteracao, arquivoDetalheResponse.dataAlteracao) &&
        Objects.equals(this.detalhes, arquivoDetalheResponse.detalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTipoArquivo, nomeTipoArquivo, arquivo, idStatusArquivo, nomeStatusArquivo, nome, extensao, dataInclusao, dataAlteracao, detalhes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoDetalheResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTipoArquivo: ").append(toIndentedString(idTipoArquivo)).append("\n");
    sb.append("    nomeTipoArquivo: ").append(toIndentedString(nomeTipoArquivo)).append("\n");
    sb.append("    arquivo: ").append(toIndentedString(arquivo)).append("\n");
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

