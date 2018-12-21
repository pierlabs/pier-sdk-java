package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import br.com.conductor.pier.api.v2.model.DocumentoDetalheResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * {{{documento_detalhado_response_description}}}
 **/

@ApiModel(description = "{{{documento_detalhado_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DocumentoDetalhadoResponse   {
  
  private Long id = null;
  private Long idTemplateDocumento = null;
  private String nome = null;
  private String documento = null;
  private String extensao = null;
  private List<DocumentoDetalheResponse> documentoDetalhes = new ArrayList<DocumentoDetalheResponse>();

  
  /**
   * {{{documento_detalhado_response_id_value}}}
   **/
  public DocumentoDetalhadoResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_detalhado_response_id_value}}}")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{documento_detalhado_response_id_template_documento_value}}}
   **/
  public DocumentoDetalhadoResponse idTemplateDocumento(Long idTemplateDocumento) {
    this.idTemplateDocumento = idTemplateDocumento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_detalhado_response_id_template_documento_value}}}")
  @JsonProperty("idTemplateDocumento")
  public Long getIdTemplateDocumento() {
    return idTemplateDocumento;
  }
  public void setIdTemplateDocumento(Long idTemplateDocumento) {
    this.idTemplateDocumento = idTemplateDocumento;
  }

  
  /**
   * {{{documento_detalhado_response_nome_value}}}
   **/
  public DocumentoDetalhadoResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_detalhado_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{documento_detalhado_response_documento_value}}}
   **/
  public DocumentoDetalhadoResponse documento(String documento) {
    this.documento = documento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_detalhado_response_documento_value}}}")
  @JsonProperty("documento")
  public String getDocumento() {
    return documento;
  }
  public void setDocumento(String documento) {
    this.documento = documento;
  }

  
  /**
   * {{{documento_detalhado_response_extensao_value}}}
   **/
  public DocumentoDetalhadoResponse extensao(String extensao) {
    this.extensao = extensao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_detalhado_response_extensao_value}}}")
  @JsonProperty("extensao")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * {{{documento_detalhado_response_documento_detalhes_value}}}
   **/
  public DocumentoDetalhadoResponse documentoDetalhes(List<DocumentoDetalheResponse> documentoDetalhes) {
    this.documentoDetalhes = documentoDetalhes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{documento_detalhado_response_documento_detalhes_value}}}")
  @JsonProperty("documentoDetalhes")
  public List<DocumentoDetalheResponse> getDocumentoDetalhes() {
    return documentoDetalhes;
  }
  public void setDocumentoDetalhes(List<DocumentoDetalheResponse> documentoDetalhes) {
    this.documentoDetalhes = documentoDetalhes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoDetalhadoResponse documentoDetalhadoResponse = (DocumentoDetalhadoResponse) o;
    return Objects.equals(this.id, documentoDetalhadoResponse.id) &&
        Objects.equals(this.idTemplateDocumento, documentoDetalhadoResponse.idTemplateDocumento) &&
        Objects.equals(this.nome, documentoDetalhadoResponse.nome) &&
        Objects.equals(this.documento, documentoDetalhadoResponse.documento) &&
        Objects.equals(this.extensao, documentoDetalhadoResponse.extensao) &&
        Objects.equals(this.documentoDetalhes, documentoDetalhadoResponse.documentoDetalhes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idTemplateDocumento, nome, documento, extensao, documentoDetalhes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoDetalhadoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idTemplateDocumento: ").append(toIndentedString(idTemplateDocumento)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    documento: ").append(toIndentedString(documento)).append("\n");
    sb.append("    extensao: ").append(toIndentedString(extensao)).append("\n");
    sb.append("    documentoDetalhes: ").append(toIndentedString(documentoDetalhes)).append("\n");
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

