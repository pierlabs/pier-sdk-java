package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Objeto que representa a atribui\u00C3\u00A7\u00C3\u00A3o da assinatura do cliente
 **/

@ApiModel(description = "Objeto que representa a atribui\u00C3\u00A7\u00C3\u00A3o da assinatura do cliente")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AtribuirAssinaturaClienteRequest   {
  
  private Long idImagem = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da imagem
   **/
  public AtribuirAssinaturaClienteRequest idImagem(Long idImagem) {
    this.idImagem = idImagem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da imagem")
  @JsonProperty("idImagem")
  public Long getIdImagem() {
    return idImagem;
  }
  public void setIdImagem(Long idImagem) {
    this.idImagem = idImagem;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtribuirAssinaturaClienteRequest atribuirAssinaturaClienteRequest = (AtribuirAssinaturaClienteRequest) o;
    return Objects.equals(this.idImagem, atribuirAssinaturaClienteRequest.idImagem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idImagem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtribuirAssinaturaClienteRequest {\n");
    
    sb.append("    idImagem: ").append(toIndentedString(idImagem)).append("\n");
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



