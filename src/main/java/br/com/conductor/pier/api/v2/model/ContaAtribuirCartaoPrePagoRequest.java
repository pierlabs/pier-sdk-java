package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Realiza a atribui\u00E7\u00E3o de um cart\u00E3o pr\u00E9-pago a uma conta.
 **/

@ApiModel(description = "Realiza a atribui\u00E7\u00E3o de um cart\u00E3o pr\u00E9-pago a uma conta.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaAtribuirCartaoPrePagoRequest   {
  
  private Long idCartao = null;
  private Long idPessoaFisica = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id).
   **/
  public ContaAtribuirCartaoPrePagoRequest idCartao(Long idCartao) {
    this.idCartao = idCartao;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id).")
  @JsonProperty("idCartao")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Portador (id).
   **/
  public ContaAtribuirCartaoPrePagoRequest idPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de Identifica\u00E7\u00E3o do Portador (id).")
  @JsonProperty("idPessoaFisica")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaAtribuirCartaoPrePagoRequest contaAtribuirCartaoPrePagoRequest = (ContaAtribuirCartaoPrePagoRequest) o;
    return Objects.equals(this.idCartao, contaAtribuirCartaoPrePagoRequest.idCartao) &&
        Objects.equals(this.idPessoaFisica, contaAtribuirCartaoPrePagoRequest.idPessoaFisica);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCartao, idPessoaFisica);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaAtribuirCartaoPrePagoRequest {\n");
    
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idPessoaFisica: ").append(toIndentedString(idPessoaFisica)).append("\n");
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

