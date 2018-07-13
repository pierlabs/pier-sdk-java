package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * {{{atribuir_assinatura_cliente_persist_description}}}
 **/

@ApiModel(description = "{{{atribuir_assinatura_cliente_persist_description}}}")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class AtribuirAssinaturaClientePersist   {
  
  private Long idArquivo = null;

  
  /**
   * {{{atribuir_assinatura_cliente_persist_id_arquivo_value}}}
   **/
  public AtribuirAssinaturaClientePersist idArquivo(Long idArquivo) {
    this.idArquivo = idArquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "{{{atribuir_assinatura_cliente_persist_id_arquivo_value}}}")
  @JsonProperty("idArquivo")
  public Long getIdArquivo() {
    return idArquivo;
  }
  public void setIdArquivo(Long idArquivo) {
    this.idArquivo = idArquivo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtribuirAssinaturaClientePersist atribuirAssinaturaClientePersist = (AtribuirAssinaturaClientePersist) o;
    return Objects.equals(this.idArquivo, atribuirAssinaturaClientePersist.idArquivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idArquivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtribuirAssinaturaClientePersist {\n");
    
    sb.append("    idArquivo: ").append(toIndentedString(idArquivo)).append("\n");
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



