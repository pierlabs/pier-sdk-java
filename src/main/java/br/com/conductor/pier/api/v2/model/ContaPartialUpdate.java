package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Objeto para altera\u00E7\u00E3o de contas. Nenhum dos campos s\u00E3o obrigat\u00F3rios. Devem ser informados apenas os campos que deseja modificar
 **/

@ApiModel(description = "Objeto para altera\u00E7\u00E3o de contas. Nenhum dos campos s\u00E3o obrigat\u00F3rios. Devem ser informados apenas os campos que deseja modificar")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class ContaPartialUpdate   {
  
  private String funcaoAtiva = null;
  private Long idContaEmissor = null;

  
  /**
   * Fun\u00E7\u00E3o ativa da conta. Representa a fun\u00E7\u00E3o na qual a conta encontra-se habilitada. Propriedade s\u00F3 deve ser informada caso o emissor fa\u00E7a uso de fun\u00E7\u00F5es para contas. As fun\u00E7\u00F5es dispon\u00EDveis para contas podem ser visualizadas em api/contas/tipos-funcoes
   **/
  public ContaPartialUpdate funcaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fun\u00E7\u00E3o ativa da conta. Representa a fun\u00E7\u00E3o na qual a conta encontra-se habilitada. Propriedade s\u00F3 deve ser informada caso o emissor fa\u00E7a uso de fun\u00E7\u00F5es para contas. As fun\u00E7\u00F5es dispon\u00EDveis para contas podem ser visualizadas em api/contas/tipos-funcoes")
  @JsonProperty("funcaoAtiva")
  public String getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  
  /**
   * Identificador da conta de controle interno criado pelo emissor
   **/
  public ContaPartialUpdate idContaEmissor(Long idContaEmissor) {
    this.idContaEmissor = idContaEmissor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da conta de controle interno criado pelo emissor")
  @JsonProperty("idContaEmissor")
  public Long getIdContaEmissor() {
    return idContaEmissor;
  }
  public void setIdContaEmissor(Long idContaEmissor) {
    this.idContaEmissor = idContaEmissor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContaPartialUpdate contaPartialUpdate = (ContaPartialUpdate) o;
    return Objects.equals(this.funcaoAtiva, contaPartialUpdate.funcaoAtiva) &&
        Objects.equals(this.idContaEmissor, contaPartialUpdate.idContaEmissor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(funcaoAtiva, idContaEmissor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaPartialUpdate {\n");
    
    sb.append("    funcaoAtiva: ").append(toIndentedString(funcaoAtiva)).append("\n");
    sb.append("    idContaEmissor: ").append(toIndentedString(idContaEmissor)).append("\n");
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

