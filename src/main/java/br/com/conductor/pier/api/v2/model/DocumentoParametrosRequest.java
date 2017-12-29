package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.PropriedadeDocumentoRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Objeto que encapsula os par\u00C3\u00A2metros para gera\u00C3\u00A7\u00C3\u00A3o de um documento
 **/

@ApiModel(description = "Objeto que encapsula os par\u00C3\u00A2metros para gera\u00C3\u00A7\u00C3\u00A3o de um documento")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DocumentoParametrosRequest   {
  
  private Long idTemplateDocumento = null;
  private String nome = null;
  private List<PropriedadeDocumentoRequest> parametrosConteudo = new ArrayList<PropriedadeDocumentoRequest>();

  
  /**
   * ID para o template do documento.
   **/
  public DocumentoParametrosRequest idTemplateDocumento(Long idTemplateDocumento) {
    this.idTemplateDocumento = idTemplateDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID para o template do documento.")
  @JsonProperty("idTemplateDocumento")
  public Long getIdTemplateDocumento() {
    return idTemplateDocumento;
  }
  public void setIdTemplateDocumento(Long idTemplateDocumento) {
    this.idTemplateDocumento = idTemplateDocumento;
  }

  
  /**
   * Nome para o arquivo.
   **/
  public DocumentoParametrosRequest nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome para o arquivo.")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Lista de par\u00C3\u00A2metros para montagem do documento.
   **/
  public DocumentoParametrosRequest parametrosConteudo(List<PropriedadeDocumentoRequest> parametrosConteudo) {
    this.parametrosConteudo = parametrosConteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lista de par\u00C3\u00A2metros para montagem do documento.")
  @JsonProperty("parametrosConteudo")
  public List<PropriedadeDocumentoRequest> getParametrosConteudo() {
    return parametrosConteudo;
  }
  public void setParametrosConteudo(List<PropriedadeDocumentoRequest> parametrosConteudo) {
    this.parametrosConteudo = parametrosConteudo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoParametrosRequest documentoParametrosRequest = (DocumentoParametrosRequest) o;
    return Objects.equals(this.idTemplateDocumento, documentoParametrosRequest.idTemplateDocumento) &&
        Objects.equals(this.nome, documentoParametrosRequest.nome) &&
        Objects.equals(this.parametrosConteudo, documentoParametrosRequest.parametrosConteudo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTemplateDocumento, nome, parametrosConteudo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoParametrosRequest {\n");
    
    sb.append("    idTemplateDocumento: ").append(toIndentedString(idTemplateDocumento)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    parametrosConteudo: ").append(toIndentedString(parametrosConteudo)).append("\n");
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

