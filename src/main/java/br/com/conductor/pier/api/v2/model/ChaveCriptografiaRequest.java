package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representation of the content decryption request
 **/

@ApiModel(description = "Representation of the content decryption request")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ChaveCriptografiaRequest   {
  
  private Long idChave = null;
  private String conteudo = null;

  
  /**
   * Decryption key identifier
   **/
  public ChaveCriptografiaRequest idChave(Long idChave) {
    this.idChave = idChave;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Decryption key identifier")
  @JsonProperty("idChave")
  public Long getIdChave() {
    return idChave;
  }
  public void setIdChave(Long idChave) {
    this.idChave = idChave;
  }

  
  /**
   * Content to be decrypted
   **/
  public ChaveCriptografiaRequest conteudo(String conteudo) {
    this.conteudo = conteudo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Content to be decrypted")
  @JsonProperty("conteudo")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChaveCriptografiaRequest chaveCriptografiaRequest = (ChaveCriptografiaRequest) o;
    return Objects.equals(this.idChave, chaveCriptografiaRequest.idChave) &&
        Objects.equals(this.conteudo, chaveCriptografiaRequest.conteudo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idChave, conteudo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChaveCriptografiaRequest {\n");
    
    sb.append("    idChave: ").append(toIndentedString(idChave)).append("\n");
    sb.append("    conteudo: ").append(toIndentedString(conteudo)).append("\n");
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

