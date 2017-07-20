package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





/**
 * Resposta do recurso de inclus\u00C3\u00A3o de registro para integra\u00C3\u00A7\u00C3\u00A3o
 **/

@ApiModel(description = "Resposta do recurso de inclus\u00C3\u00A3o de registro para integra\u00C3\u00A7\u00C3\u00A3o")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class IntegracaoEmissorResponse   {
  
  private Long id = null;
  private Long idConta = null;
  private Integer status = null;
  private String dataEvento = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do registro na tabela Integra\u00C3\u00A7\u00C3\u00A3oEmissor.
   **/
  public IntegracaoEmissorResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do registro na tabela Integra\u00C3\u00A7\u00C3\u00A3oEmissor.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta.
   **/
  public IntegracaoEmissorResponse idConta(Long idConta) {
    this.idConta = idConta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta.")
  @JsonProperty("idConta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Status do registro.
   **/
  public IntegracaoEmissorResponse status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status do registro.")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Data de inclus\u00C3\u00A3o do registro.
   **/
  public IntegracaoEmissorResponse dataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
    return this;
  }
  
  @ApiModelProperty(example = "yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;", value = "Data de inclus\u00C3\u00A3o do registro.")
  @JsonProperty("dataEvento")
  public String getDataEvento() {
    return dataEvento;
  }
  public void setDataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegracaoEmissorResponse integracaoEmissorResponse = (IntegracaoEmissorResponse) o;
    return Objects.equals(this.id, integracaoEmissorResponse.id) &&
        Objects.equals(this.idConta, integracaoEmissorResponse.idConta) &&
        Objects.equals(this.status, integracaoEmissorResponse.status) &&
        Objects.equals(this.dataEvento, integracaoEmissorResponse.dataEvento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idConta, status, dataEvento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegracaoEmissorResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dataEvento: ").append(toIndentedString(dataEvento)).append("\n");
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



