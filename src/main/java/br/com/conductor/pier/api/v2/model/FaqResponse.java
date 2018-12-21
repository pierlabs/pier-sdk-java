package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object FAQ
 **/

@ApiModel(description = "Object FAQ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class FaqResponse   {
  
  private Long id = null;
  private String pergunta = null;
  private String resposta = null;
  private Integer relevancia = null;
  private String plataforma = null;
  private String categoria = null;


  public enum StatusEnum {
    INATIVO("INATIVO"),
    ATIVO("ATIVO");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;

  
  /**
   * Identification Code of the FAQ (id)
   **/
  public FaqResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification Code of the FAQ (id)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Content of the question
   **/
  public FaqResponse pergunta(String pergunta) {
    this.pergunta = pergunta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content of the question")
  @JsonProperty("pergunta")
  public String getPergunta() {
    return pergunta;
  }
  public void setPergunta(String pergunta) {
    this.pergunta = pergunta;
  }

  
  /**
   * Content of the question
   **/
  public FaqResponse resposta(String resposta) {
    this.resposta = resposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content of the question")
  @JsonProperty("resposta")
  public String getResposta() {
    return resposta;
  }
  public void setResposta(String resposta) {
    this.resposta = resposta;
  }

  
  /**
   * Relevance Level of the question
   **/
  public FaqResponse relevancia(Integer relevancia) {
    this.relevancia = relevancia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Relevance Level of the question")
  @JsonProperty("relevancia")
  public Integer getRelevancia() {
    return relevancia;
  }
  public void setRelevancia(Integer relevancia) {
    this.relevancia = relevancia;
  }

  
  /**
   * Platform which the FAQ fits
   **/
  public FaqResponse plataforma(String plataforma) {
    this.plataforma = plataforma;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Platform which the FAQ fits")
  @JsonProperty("plataforma")
  public String getPlataforma() {
    return plataforma;
  }
  public void setPlataforma(String plataforma) {
    this.plataforma = plataforma;
  }

  
  /**
   * Category of the subject which the FAQ refers
   **/
  public FaqResponse categoria(String categoria) {
    this.categoria = categoria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Category of the subject which the FAQ refers")
  @JsonProperty("categoria")
  public String getCategoria() {
    return categoria;
  }
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  
  /**
   * Status describing the current situation of the FAQ
   **/
  public FaqResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status describing the current situation of the FAQ")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaqResponse faqResponse = (FaqResponse) o;
    return Objects.equals(this.id, faqResponse.id) &&
        Objects.equals(this.pergunta, faqResponse.pergunta) &&
        Objects.equals(this.resposta, faqResponse.resposta) &&
        Objects.equals(this.relevancia, faqResponse.relevancia) &&
        Objects.equals(this.plataforma, faqResponse.plataforma) &&
        Objects.equals(this.categoria, faqResponse.categoria) &&
        Objects.equals(this.status, faqResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pergunta, resposta, relevancia, plataforma, categoria, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaqResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pergunta: ").append(toIndentedString(pergunta)).append("\n");
    sb.append("    resposta: ").append(toIndentedString(resposta)).append("\n");
    sb.append("    relevancia: ").append(toIndentedString(relevancia)).append("\n");
    sb.append("    plataforma: ").append(toIndentedString(plataforma)).append("\n");
    sb.append("    categoria: ").append(toIndentedString(categoria)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

