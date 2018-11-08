package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class CdtDocumentoCredito   {
  
  private String descricao = null;
  private Boolean doc = null;
  private Long id = null;
  private Long idAtividadeDeCredito = null;
  private Boolean obrigatorio = null;
  private Boolean tela = null;

  
  /**
   **/
  public CdtDocumentoCredito descricao(String descricao) {
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
  public CdtDocumentoCredito doc(Boolean doc) {
    this.doc = doc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("doc")
  public Boolean getDoc() {
    return doc;
  }
  public void setDoc(Boolean doc) {
    this.doc = doc;
  }

  
  /**
   **/
  public CdtDocumentoCredito id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  public CdtDocumentoCredito idAtividadeDeCredito(Long idAtividadeDeCredito) {
    this.idAtividadeDeCredito = idAtividadeDeCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idAtividadeDeCredito")
  public Long getIdAtividadeDeCredito() {
    return idAtividadeDeCredito;
  }
  public void setIdAtividadeDeCredito(Long idAtividadeDeCredito) {
    this.idAtividadeDeCredito = idAtividadeDeCredito;
  }

  
  /**
   **/
  public CdtDocumentoCredito obrigatorio(Boolean obrigatorio) {
    this.obrigatorio = obrigatorio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("obrigatorio")
  public Boolean getObrigatorio() {
    return obrigatorio;
  }
  public void setObrigatorio(Boolean obrigatorio) {
    this.obrigatorio = obrigatorio;
  }

  
  /**
   **/
  public CdtDocumentoCredito tela(Boolean tela) {
    this.tela = tela;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tela")
  public Boolean getTela() {
    return tela;
  }
  public void setTela(Boolean tela) {
    this.tela = tela;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdtDocumentoCredito cdtDocumentoCredito = (CdtDocumentoCredito) o;
    return Objects.equals(this.descricao, cdtDocumentoCredito.descricao) &&
        Objects.equals(this.doc, cdtDocumentoCredito.doc) &&
        Objects.equals(this.id, cdtDocumentoCredito.id) &&
        Objects.equals(this.idAtividadeDeCredito, cdtDocumentoCredito.idAtividadeDeCredito) &&
        Objects.equals(this.obrigatorio, cdtDocumentoCredito.obrigatorio) &&
        Objects.equals(this.tela, cdtDocumentoCredito.tela);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descricao, doc, id, idAtividadeDeCredito, obrigatorio, tela);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdtDocumentoCredito {\n");
    
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    doc: ").append(toIndentedString(doc)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idAtividadeDeCredito: ").append(toIndentedString(idAtividadeDeCredito)).append("\n");
    sb.append("    obrigatorio: ").append(toIndentedString(obrigatorio)).append("\n");
    sb.append("    tela: ").append(toIndentedString(tela)).append("\n");
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

