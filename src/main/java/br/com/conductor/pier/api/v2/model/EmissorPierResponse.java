package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{emissor_response_description}}}
 **/

@ApiModel(description = "{{{emissor_response_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class EmissorPierResponse   {
  
  private Integer id = null;
  private String nome = null;
  private String tema = null;

  
  /**
   * {{{emissor_response_id_value}}}
   **/
  public EmissorPierResponse id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{emissor_response_id_value}}}")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * {{{emissor_response_nome_value}}}
   **/
  public EmissorPierResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{emissor_response_nome_value}}}")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{emissor_response_tema_value}}}
   **/
  public EmissorPierResponse tema(String tema) {
    this.tema = tema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{emissor_response_tema_value}}}")
  @JsonProperty("tema")
  public String getTema() {
    return tema;
  }
  public void setTema(String tema) {
    this.tema = tema;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmissorPierResponse emissorPierResponse = (EmissorPierResponse) o;
    return Objects.equals(this.id, emissorPierResponse.id) &&
        Objects.equals(this.nome, emissorPierResponse.nome) &&
        Objects.equals(this.tema, emissorPierResponse.tema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, tema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmissorPierResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    tema: ").append(toIndentedString(tema)).append("\n");
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



