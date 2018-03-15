package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.PropriedadeDocumentoRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Objeto de requisi\u00E7\u00E3o.
 **/

@ApiModel(description = "Objeto de requisi\u00E7\u00E3o.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class IntegrarDocumentoRequest   {
  
  private Long idTemplate = null;
  private String arquivo = null;
  private String nome = null;
  private List<PropriedadeDocumentoRequest> propriedades = new ArrayList<PropriedadeDocumentoRequest>();

  
  /**
   * Identificador do template de documento
   **/
  public IntegrarDocumentoRequest idTemplate(Long idTemplate) {
    this.idTemplate = idTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador do template de documento")
  @JsonProperty("idTemplate")
  public Long getIdTemplate() {
    return idTemplate;
  }
  public void setIdTemplate(Long idTemplate) {
    this.idTemplate = idTemplate;
  }

  
  /**
   * Conte\u00FAdo do arquivo convertido em Base 64
   **/
  public IntegrarDocumentoRequest arquivo(String arquivo) {
    this.arquivo = arquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conte\u00FAdo do arquivo convertido em Base 64")
  @JsonProperty("arquivo")
  public String getArquivo() {
    return arquivo;
  }
  public void setArquivo(String arquivo) {
    this.arquivo = arquivo;
  }

  
  /**
   * Nome do arquivo.
   **/
  public IntegrarDocumentoRequest nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do arquivo.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Lista de par\u00E2metros para montagem do documento.
   **/
  public IntegrarDocumentoRequest propriedades(List<PropriedadeDocumentoRequest> propriedades) {
    this.propriedades = propriedades;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de par\u00E2metros para montagem do documento.")
  @JsonProperty("propriedades")
  public List<PropriedadeDocumentoRequest> getPropriedades() {
    return propriedades;
  }
  public void setPropriedades(List<PropriedadeDocumentoRequest> propriedades) {
    this.propriedades = propriedades;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrarDocumentoRequest integrarDocumentoRequest = (IntegrarDocumentoRequest) o;
    return Objects.equals(this.idTemplate, integrarDocumentoRequest.idTemplate) &&
        Objects.equals(this.arquivo, integrarDocumentoRequest.arquivo) &&
        Objects.equals(this.nome, integrarDocumentoRequest.nome) &&
        Objects.equals(this.propriedades, integrarDocumentoRequest.propriedades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTemplate, arquivo, nome, propriedades);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrarDocumentoRequest {\n");
    
    sb.append("    idTemplate: ").append(toIndentedString(idTemplate)).append("\n");
    sb.append("    arquivo: ").append(toIndentedString(arquivo)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    propriedades: ").append(toIndentedString(propriedades)).append("\n");
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

